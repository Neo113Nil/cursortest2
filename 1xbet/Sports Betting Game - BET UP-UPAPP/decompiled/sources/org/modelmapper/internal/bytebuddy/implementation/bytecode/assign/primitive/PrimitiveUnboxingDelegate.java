package org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.primitive;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;

/* loaded from: classes4.dex */
public enum PrimitiveUnboxingDelegate implements StackManipulation {
    BOOLEAN(Boolean.class, Boolean.TYPE, StackSize.ZERO, "booleanValue", "()Z"),
    BYTE(Byte.class, Byte.TYPE, StackSize.ZERO, "byteValue", "()B"),
    SHORT(Short.class, Short.TYPE, StackSize.ZERO, "shortValue", "()S"),
    CHARACTER(Character.class, Character.TYPE, StackSize.ZERO, "charValue", "()C"),
    INTEGER(Integer.class, Integer.TYPE, StackSize.ZERO, "intValue", "()I"),
    LONG(Long.class, Long.TYPE, StackSize.SINGLE, "longValue", "()J"),
    FLOAT(Float.class, Float.TYPE, StackSize.ZERO, "floatValue", "()F"),
    DOUBLE(Double.class, Double.TYPE, StackSize.SINGLE, "doubleValue", "()D");

    private final TypeDescription primitiveType;
    private final StackManipulation.Size size;
    private final String unboxingMethodDescriptor;
    private final String unboxingMethodName;
    private final TypeDescription wrapperType;

    public interface UnboxingResponsible {
        StackManipulation assignUnboxedTo(TypeDescription.Generic generic, Assigner assigner, Assigner.Typing typing);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
        return true;
    }

    PrimitiveUnboxingDelegate(Class cls, Class cls2, StackSize stackSize, String str, String str2) {
        this.size = stackSize.toIncreasingSize();
        this.wrapperType = TypeDescription.ForLoadedType.of(cls);
        this.primitiveType = TypeDescription.ForLoadedType.of(cls2);
        this.unboxingMethodName = str;
        this.unboxingMethodDescriptor = str2;
    }

    protected static PrimitiveUnboxingDelegate forPrimitive(TypeDescription.Generic generic) {
        if (generic.represents(Boolean.TYPE)) {
            return BOOLEAN;
        }
        if (generic.represents(Byte.TYPE)) {
            return BYTE;
        }
        if (generic.represents(Short.TYPE)) {
            return SHORT;
        }
        if (generic.represents(Character.TYPE)) {
            return CHARACTER;
        }
        if (generic.represents(Integer.TYPE)) {
            return INTEGER;
        }
        if (generic.represents(Long.TYPE)) {
            return LONG;
        }
        if (generic.represents(Float.TYPE)) {
            return FLOAT;
        }
        if (generic.represents(Double.TYPE)) {
            return DOUBLE;
        }
        throw new IllegalArgumentException("Expected non-void primitive type instead of " + generic);
    }

    public static UnboxingResponsible forReferenceType(TypeDefinition typeDefinition) {
        if (typeDefinition.isPrimitive()) {
            throw new IllegalArgumentException("Expected reference type instead of " + typeDefinition);
        }
        if (typeDefinition.represents(Boolean.class)) {
            return ExplicitlyTypedUnboxingResponsible.BOOLEAN;
        }
        if (typeDefinition.represents(Byte.class)) {
            return ExplicitlyTypedUnboxingResponsible.BYTE;
        }
        if (typeDefinition.represents(Short.class)) {
            return ExplicitlyTypedUnboxingResponsible.SHORT;
        }
        if (typeDefinition.represents(Character.class)) {
            return ExplicitlyTypedUnboxingResponsible.CHARACTER;
        }
        if (typeDefinition.represents(Integer.class)) {
            return ExplicitlyTypedUnboxingResponsible.INTEGER;
        }
        if (typeDefinition.represents(Long.class)) {
            return ExplicitlyTypedUnboxingResponsible.LONG;
        }
        if (typeDefinition.represents(Float.class)) {
            return ExplicitlyTypedUnboxingResponsible.FLOAT;
        }
        if (typeDefinition.represents(Double.class)) {
            return ExplicitlyTypedUnboxingResponsible.DOUBLE;
        }
        return new ImplicitlyTypedUnboxingResponsible(typeDefinition.asGenericType());
    }

    protected TypeDescription.Generic getWrapperType() {
        return this.wrapperType.asGenericType();
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, this.wrapperType.asErasure().getInternalName(), this.unboxingMethodName, this.unboxingMethodDescriptor, false);
        return this.size;
    }

    protected enum ExplicitlyTypedUnboxingResponsible implements UnboxingResponsible {
        BOOLEAN(PrimitiveUnboxingDelegate.BOOLEAN),
        BYTE(PrimitiveUnboxingDelegate.BYTE),
        SHORT(PrimitiveUnboxingDelegate.SHORT),
        CHARACTER(PrimitiveUnboxingDelegate.CHARACTER),
        INTEGER(PrimitiveUnboxingDelegate.INTEGER),
        LONG(PrimitiveUnboxingDelegate.LONG),
        FLOAT(PrimitiveUnboxingDelegate.FLOAT),
        DOUBLE(PrimitiveUnboxingDelegate.DOUBLE);

        private final PrimitiveUnboxingDelegate primitiveUnboxingDelegate;

        ExplicitlyTypedUnboxingResponsible(PrimitiveUnboxingDelegate primitiveUnboxingDelegate) {
            this.primitiveUnboxingDelegate = primitiveUnboxingDelegate;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.UnboxingResponsible
        public StackManipulation assignUnboxedTo(TypeDescription.Generic generic, Assigner assigner, Assigner.Typing typing) {
            PrimitiveUnboxingDelegate primitiveUnboxingDelegate = this.primitiveUnboxingDelegate;
            return new StackManipulation.Compound(primitiveUnboxingDelegate, PrimitiveWideningDelegate.forPrimitive(primitiveUnboxingDelegate.primitiveType).widenTo(generic));
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class ImplicitlyTypedUnboxingResponsible implements UnboxingResponsible {
        private final TypeDescription.Generic originalType;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.originalType.equals(((ImplicitlyTypedUnboxingResponsible) obj).originalType);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.originalType.hashCode();
        }

        protected ImplicitlyTypedUnboxingResponsible(TypeDescription.Generic generic) {
            this.originalType = generic;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.primitive.PrimitiveUnboxingDelegate.UnboxingResponsible
        public StackManipulation assignUnboxedTo(TypeDescription.Generic generic, Assigner assigner, Assigner.Typing typing) {
            PrimitiveUnboxingDelegate forPrimitive = PrimitiveUnboxingDelegate.forPrimitive(generic);
            return new StackManipulation.Compound(assigner.assign(this.originalType, forPrimitive.getWrapperType(), typing), forPrimitive);
        }
    }
}
