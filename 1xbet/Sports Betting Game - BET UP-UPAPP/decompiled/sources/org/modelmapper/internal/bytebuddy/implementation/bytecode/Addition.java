package org.modelmapper.internal.bytebuddy.implementation.bytecode;

import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;

/* loaded from: classes4.dex */
public enum Addition implements StackManipulation {
    INTEGER(96, StackSize.SINGLE),
    LONG(97, StackSize.DOUBLE),
    FLOAT(98, StackSize.SINGLE),
    DOUBLE(99, StackSize.DOUBLE);

    private final int opcode;
    private final StackSize stackSize;

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
        return true;
    }

    Addition(int i, StackSize stackSize) {
        this.opcode = i;
        this.stackSize = stackSize;
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        methodVisitor.visitInsn(this.opcode);
        return this.stackSize.toDecreasingSize();
    }
}
