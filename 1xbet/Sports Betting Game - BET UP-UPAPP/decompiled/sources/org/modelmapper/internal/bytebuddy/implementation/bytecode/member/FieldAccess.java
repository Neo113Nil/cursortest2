package org.modelmapper.internal.bytebuddy.implementation.bytecode.member;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.enumeration.EnumerationDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldList;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.TypeCasting;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;

/* loaded from: classes4.dex */
public enum FieldAccess {
    STATIC(Opcodes.PUTSTATIC, Opcodes.GETSTATIC, StackSize.ZERO),
    INSTANCE(Opcodes.PUTFIELD, 180, StackSize.SINGLE);

    private final int getterOpcode;
    private final int putterOpcode;
    private final int targetSizeChange;

    public interface Defined {
        StackManipulation read();

        StackManipulation write();
    }

    FieldAccess(int i, int i2, StackSize stackSize) {
        this.putterOpcode = i;
        this.getterOpcode = i2;
        this.targetSizeChange = stackSize.getSize();
    }

    public static StackManipulation forEnumeration(EnumerationDescription enumerationDescription) {
        FieldList filter = enumerationDescription.getEnumerationType().getDeclaredFields().filter(ElementMatchers.named(enumerationDescription.getValue()));
        if (filter.size() != 1 || !((FieldDescription.InDefinedShape) filter.getOnly()).isStatic() || !((FieldDescription.InDefinedShape) filter.getOnly()).isPublic() || !((FieldDescription.InDefinedShape) filter.getOnly()).isEnum()) {
            return StackManipulation.Illegal.INSTANCE;
        }
        FieldAccess fieldAccess = STATIC;
        fieldAccess.getClass();
        return fieldAccess.new AccessDispatcher((FieldDescription.InDefinedShape) filter.getOnly()).read();
    }

    public static Defined forField(FieldDescription.InDefinedShape inDefinedShape) {
        if (inDefinedShape.isStatic()) {
            FieldAccess fieldAccess = STATIC;
            fieldAccess.getClass();
            return fieldAccess.new AccessDispatcher(inDefinedShape);
        }
        FieldAccess fieldAccess2 = INSTANCE;
        fieldAccess2.getClass();
        return fieldAccess2.new AccessDispatcher(inDefinedShape);
    }

    public static Defined forField(FieldDescription fieldDescription) {
        FieldDescription.InDefinedShape asDefined = fieldDescription.asDefined();
        if (fieldDescription.getType().asErasure().equals(asDefined.getType().asErasure())) {
            return forField(asDefined);
        }
        return OfGenericField.of(fieldDescription, forField(asDefined));
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class OfGenericField implements Defined {
        private final Defined defined;
        private final TypeDefinition targetType;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            OfGenericField ofGenericField = (OfGenericField) obj;
            return this.targetType.equals(ofGenericField.targetType) && this.defined.equals(ofGenericField.defined);
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.targetType.hashCode()) * 31) + this.defined.hashCode();
        }

        protected OfGenericField(TypeDefinition typeDefinition, Defined defined) {
            this.targetType = typeDefinition;
            this.defined = defined;
        }

        protected static Defined of(FieldDescription fieldDescription, Defined defined) {
            return new OfGenericField(fieldDescription.getType(), defined);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess.Defined
        public StackManipulation read() {
            return new StackManipulation.Compound(this.defined.read(), TypeCasting.to(this.targetType));
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess.Defined
        public StackManipulation write() {
            return this.defined.write();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    protected class AccessDispatcher implements Defined {
        private final FieldDescription.InDefinedShape fieldDescription;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AccessDispatcher accessDispatcher = (AccessDispatcher) obj;
            return this.fieldDescription.equals(accessDispatcher.fieldDescription) && FieldAccess.this.equals(FieldAccess.this);
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldDescription.hashCode()) * 31) + FieldAccess.this.hashCode();
        }

        protected AccessDispatcher(FieldDescription.InDefinedShape inDefinedShape) {
            this.fieldDescription = inDefinedShape;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess.Defined
        public StackManipulation read() {
            return new FieldGetInstruction();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess.Defined
        public StackManipulation write() {
            return new FieldPutInstruction();
        }

        private abstract class AbstractFieldInstruction implements StackManipulation {
            protected abstract int getOpcode();

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                return true;
            }

            protected abstract StackManipulation.Size resolveSize(StackSize stackSize);

            private AbstractFieldInstruction() {
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitFieldInsn(getOpcode(), AccessDispatcher.this.fieldDescription.getDeclaringType().getInternalName(), AccessDispatcher.this.fieldDescription.getInternalName(), AccessDispatcher.this.fieldDescription.getDescriptor());
                return resolveSize(AccessDispatcher.this.fieldDescription.getType().getStackSize());
            }
        }

        @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        protected class FieldGetInstruction extends AbstractFieldInstruction {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && AccessDispatcher.this.equals(AccessDispatcher.this);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + AccessDispatcher.this.hashCode();
            }

            protected FieldGetInstruction() {
                super();
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher.AbstractFieldInstruction
            protected int getOpcode() {
                return FieldAccess.this.getterOpcode;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher.AbstractFieldInstruction
            protected StackManipulation.Size resolveSize(StackSize stackSize) {
                int size = stackSize.getSize() - FieldAccess.this.targetSizeChange;
                return new StackManipulation.Size(size, size);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        protected class FieldPutInstruction extends AbstractFieldInstruction {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && AccessDispatcher.this.equals(AccessDispatcher.this);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + AccessDispatcher.this.hashCode();
            }

            protected FieldPutInstruction() {
                super();
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher.AbstractFieldInstruction
            protected int getOpcode() {
                return FieldAccess.this.putterOpcode;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher.AbstractFieldInstruction
            protected StackManipulation.Size resolveSize(StackSize stackSize) {
                return new StackManipulation.Size((stackSize.getSize() + FieldAccess.this.targetSizeChange) * (-1), 0);
            }
        }
    }
}
