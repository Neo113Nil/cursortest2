package org.modelmapper.internal.bytebuddy.implementation.bytecode.constant;

import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;

/* loaded from: classes4.dex */
public enum NullConstant implements StackManipulation {
    INSTANCE(StackSize.SINGLE);

    private final StackManipulation.Size size;

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
        return true;
    }

    NullConstant(StackSize stackSize) {
        this.size = stackSize.toIncreasingSize();
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        methodVisitor.visitInsn(1);
        return this.size;
    }
}
