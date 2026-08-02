package org.modelmapper.internal.bytebuddy.implementation.bytecode.constant;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;

/* loaded from: classes4.dex */
public enum IntegerConstant implements StackManipulation {
    MINUS_ONE(2),
    ZERO(3),
    ONE(4),
    TWO(5),
    THREE(6),
    FOUR(7),
    FIVE(8);

    private static final StackManipulation.Size SIZE = StackSize.SINGLE.toIncreasingSize();
    private final int opcode;

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
        return true;
    }

    IntegerConstant(int i) {
        this.opcode = i;
    }

    public static StackManipulation forValue(boolean z) {
        return z ? ONE : ZERO;
    }

    public static StackManipulation forValue(int i) {
        switch (i) {
            case -1:
                return MINUS_ONE;
            case 0:
                return ZERO;
            case 1:
                return ONE;
            case 2:
                return TWO;
            case 3:
                return THREE;
            case 4:
                return FOUR;
            case 5:
                return FIVE;
            default:
                if (i >= -128 && i <= 127) {
                    return new SingleBytePush((byte) i);
                }
                if (i >= -32768 && i <= 32767) {
                    return new TwoBytePush((short) i);
                }
                return new ConstantPool(i);
        }
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        methodVisitor.visitInsn(this.opcode);
        return SIZE;
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class SingleBytePush implements StackManipulation {
        private final byte value;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.value == ((SingleBytePush) obj).value;
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.value;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        protected SingleBytePush(byte b) {
            this.value = b;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            methodVisitor.visitIntInsn(16, this.value);
            return IntegerConstant.SIZE;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class TwoBytePush implements StackManipulation {
        private final short value;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.value == ((TwoBytePush) obj).value;
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.value;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        protected TwoBytePush(short s) {
            this.value = s;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            methodVisitor.visitIntInsn(17, this.value);
            return IntegerConstant.SIZE;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class ConstantPool implements StackManipulation {
        private final int value;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.value == ((ConstantPool) obj).value;
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.value;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        protected ConstantPool(int i) {
            this.value = i;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            methodVisitor.visitLdcInsn(Integer.valueOf(this.value));
            return IntegerConstant.SIZE;
        }
    }
}
