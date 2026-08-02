package org.modelmapper.internal.bytebuddy.implementation.bytecode.member;

import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;

/* loaded from: classes4.dex */
public enum MethodReturn implements StackManipulation {
    INTEGER(172, StackSize.SINGLE),
    DOUBLE(Opcodes.DRETURN, StackSize.DOUBLE),
    FLOAT(Opcodes.FRETURN, StackSize.SINGLE),
    LONG(173, StackSize.DOUBLE),
    VOID(Opcodes.RETURN, StackSize.ZERO),
    REFERENCE(Opcodes.ARETURN, StackSize.SINGLE);

    private final int returnOpcode;
    private final StackManipulation.Size size;

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
        return true;
    }

    MethodReturn(int i, StackSize stackSize) {
        this.returnOpcode = i;
        this.size = stackSize.toDecreasingSize();
    }

    public static StackManipulation of(TypeDefinition typeDefinition) {
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
                return VOID;
            }
            return INTEGER;
        }
        return REFERENCE;
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        methodVisitor.visitInsn(this.returnOpcode);
        return this.size;
    }
}
