package org.modelmapper.internal.bytebuddy.implementation.bytecode;

import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;

/* loaded from: classes4.dex */
public enum Multiplication implements StackManipulation {
    INTEGER(104, StackSize.SINGLE),
    LONG(105, StackSize.DOUBLE),
    FLOAT(106, StackSize.SINGLE),
    DOUBLE(107, StackSize.DOUBLE);

    private final int opcode;
    private final StackSize stackSize;

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
        return true;
    }

    Multiplication(int i, StackSize stackSize) {
        this.opcode = i;
        this.stackSize = stackSize;
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        methodVisitor.visitInsn(this.opcode);
        return this.stackSize.toDecreasingSize();
    }
}
