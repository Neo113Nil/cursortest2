package org.modelmapper.internal.bytebuddy.implementation.bytecode.constant;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;

/* loaded from: classes4.dex */
public enum FloatConstant implements StackManipulation {
    ZERO(11),
    ONE(12),
    TWO(13);

    private static final StackManipulation.Size SIZE = StackSize.SINGLE.toIncreasingSize();
    private final int opcode;

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
        return true;
    }

    FloatConstant(int i) {
        this.opcode = i;
    }

    public static StackManipulation forValue(float f) {
        if (f == 0.0f) {
            return ZERO;
        }
        if (f == 1.0f) {
            return ONE;
        }
        if (f == 2.0f) {
            return TWO;
        }
        return new ConstantPool(f);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        methodVisitor.visitInsn(this.opcode);
        return SIZE;
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class ConstantPool implements StackManipulation {
        private final float value;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.value == ((ConstantPool) obj).value;
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Float.floatToIntBits(this.value);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        protected ConstantPool(float f) {
            this.value = f;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            methodVisitor.visitLdcInsn(Float.valueOf(this.value));
            return FloatConstant.SIZE;
        }
    }
}
