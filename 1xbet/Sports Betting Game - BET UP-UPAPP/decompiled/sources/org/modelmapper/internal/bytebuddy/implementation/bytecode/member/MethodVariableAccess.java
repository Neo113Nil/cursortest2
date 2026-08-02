package org.modelmapper.internal.bytebuddy.implementation.bytecode.member;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Iterator;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.TypeCasting;

/* loaded from: classes4.dex */
public enum MethodVariableAccess {
    INTEGER(21, 54, StackSize.SINGLE),
    LONG(22, 55, StackSize.DOUBLE),
    FLOAT(23, 56, StackSize.SINGLE),
    DOUBLE(24, 57, StackSize.DOUBLE),
    REFERENCE(25, 58, StackSize.SINGLE);

    private final int loadOpcode;
    private final StackSize size;
    private final int storeOpcode;

    MethodVariableAccess(int i, int i2, StackSize stackSize) {
        this.loadOpcode = i;
        this.size = stackSize;
        this.storeOpcode = i2;
    }

    public static MethodVariableAccess of(TypeDefinition typeDefinition) {
        if (typeDefinition.isPrimitive()) {
            if (typeDefinition.represents(Long.TYPE)) {
                return LONG;
            }
            if (typeDefinition.represents(Double.TYPE)) {
                return DOUBLE;
            }
            if (typeDefinition.represents(Float.TYPE)) {
                return FLOAT;
            }
            if (typeDefinition.represents(Void.TYPE)) {
                throw new IllegalArgumentException("Variable type cannot be void");
            }
            return INTEGER;
        }
        return REFERENCE;
    }

    public static MethodLoading allArgumentsOf(MethodDescription methodDescription) {
        return new MethodLoading(methodDescription, MethodLoading.TypeCastingHandler.NoOp.INSTANCE);
    }

    public static StackManipulation loadThis() {
        return REFERENCE.loadFrom(0);
    }

    public StackManipulation loadFrom(int i) {
        return new OffsetLoading(i);
    }

    public StackManipulation storeAt(int i) {
        return new OffsetWriting(i);
    }

    public StackManipulation increment(int i, int i2) {
        if (this != INTEGER) {
            throw new IllegalStateException("Cannot increment type: " + this);
        }
        return new OffsetIncrementing(i, i2);
    }

    public static StackManipulation load(ParameterDescription parameterDescription) {
        return of(parameterDescription.getType()).loadFrom(parameterDescription.getOffset());
    }

    public static StackManipulation store(ParameterDescription parameterDescription) {
        return of(parameterDescription.getType()).storeAt(parameterDescription.getOffset());
    }

    public static StackManipulation increment(ParameterDescription parameterDescription, int i) {
        return of(parameterDescription.getType()).increment(parameterDescription.getOffset(), i);
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class MethodLoading implements StackManipulation {
        private final MethodDescription methodDescription;
        private final TypeCastingHandler typeCastingHandler;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MethodLoading methodLoading = (MethodLoading) obj;
            return this.methodDescription.equals(methodLoading.methodDescription) && this.typeCastingHandler.equals(methodLoading.typeCastingHandler);
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodDescription.hashCode()) * 31) + this.typeCastingHandler.hashCode();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        protected MethodLoading(MethodDescription methodDescription, TypeCastingHandler typeCastingHandler) {
            this.methodDescription = methodDescription;
            this.typeCastingHandler = typeCastingHandler;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.methodDescription.getParameters().iterator();
            while (it.hasNext()) {
                ParameterDescription parameterDescription = (ParameterDescription) it.next();
                TypeDescription asErasure = parameterDescription.getType().asErasure();
                arrayList.add(MethodVariableAccess.of(asErasure).loadFrom(parameterDescription.getOffset()));
                arrayList.add(this.typeCastingHandler.ofIndex(asErasure, parameterDescription.getIndex()));
            }
            return new StackManipulation.Compound(arrayList).apply(methodVisitor, context);
        }

        public StackManipulation prependThisReference() {
            return this.methodDescription.isStatic() ? this : new StackManipulation.Compound(MethodVariableAccess.loadThis(), this);
        }

        public MethodLoading asBridgeOf(MethodDescription methodDescription) {
            return new MethodLoading(this.methodDescription, new TypeCastingHandler.ForBridgeTarget(methodDescription));
        }

        protected interface TypeCastingHandler {
            StackManipulation ofIndex(TypeDescription typeDescription, int i);

            public enum NoOp implements TypeCastingHandler {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler
                public StackManipulation ofIndex(TypeDescription typeDescription, int i) {
                    return StackManipulation.Trivial.INSTANCE;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForBridgeTarget implements TypeCastingHandler {
                private final MethodDescription bridgeTarget;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.bridgeTarget.equals(((ForBridgeTarget) obj).bridgeTarget);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.bridgeTarget.hashCode();
                }

                public ForBridgeTarget(MethodDescription methodDescription) {
                    this.bridgeTarget = methodDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodVariableAccess.MethodLoading.TypeCastingHandler
                public StackManipulation ofIndex(TypeDescription typeDescription, int i) {
                    TypeDescription asErasure = ((ParameterDescription) this.bridgeTarget.getParameters().get(i)).getType().asErasure();
                    return typeDescription.equals(asErasure) ? StackManipulation.Trivial.INSTANCE : TypeCasting.to(asErasure);
                }
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    protected class OffsetLoading implements StackManipulation {
        private final int offset;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            OffsetLoading offsetLoading = (OffsetLoading) obj;
            return this.offset == offsetLoading.offset && MethodVariableAccess.this.equals(MethodVariableAccess.this);
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.offset) * 31) + MethodVariableAccess.this.hashCode();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        protected OffsetLoading(int i) {
            this.offset = i;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            methodVisitor.visitVarInsn(MethodVariableAccess.this.loadOpcode, this.offset);
            return MethodVariableAccess.this.size.toIncreasingSize();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    protected class OffsetWriting implements StackManipulation {
        private final int offset;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            OffsetWriting offsetWriting = (OffsetWriting) obj;
            return this.offset == offsetWriting.offset && MethodVariableAccess.this.equals(MethodVariableAccess.this);
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.offset) * 31) + MethodVariableAccess.this.hashCode();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        protected OffsetWriting(int i) {
            this.offset = i;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            methodVisitor.visitVarInsn(MethodVariableAccess.this.storeOpcode, this.offset);
            return MethodVariableAccess.this.size.toDecreasingSize();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class OffsetIncrementing implements StackManipulation {
        private final int offset;
        private final int value;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            OffsetIncrementing offsetIncrementing = (OffsetIncrementing) obj;
            return this.offset == offsetIncrementing.offset && this.value == offsetIncrementing.value;
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.offset) * 31) + this.value;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        protected OffsetIncrementing(int i, int i2) {
            this.offset = i;
            this.value = i2;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            methodVisitor.visitIincInsn(this.offset, this.value);
            return new StackManipulation.Size(0, 0);
        }
    }
}
