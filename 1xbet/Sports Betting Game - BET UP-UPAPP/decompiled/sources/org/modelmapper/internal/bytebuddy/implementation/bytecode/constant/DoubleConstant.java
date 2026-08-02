package org.modelmapper.internal.bytebuddy.implementation.bytecode.constant;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;

/* loaded from: classes4.dex */
public enum DoubleConstant implements StackManipulation {
    ZERO(14),
    ONE(15);

    private static final StackManipulation.Size SIZE = StackSize.DOUBLE.toIncreasingSize();
    private final int opcode;

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
        return true;
    }

    DoubleConstant(int i) {
        this.opcode = i;
    }

    public static StackManipulation forValue(double d) {
        if (d == 0.0d) {
            return ZERO;
        }
        if (d == 1.0d) {
            return ONE;
        }
        return new ConstantPool(d);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        methodVisitor.visitInsn(this.opcode);
        return SIZE;
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class ConstantPool implements StackManipulation {
        private final double value;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.value == ((ConstantPool) obj).value;
        }

        public int hashCode() {
            long doubleToLongBits = Double.doubleToLongBits(this.value);
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        protected ConstantPool(double d) {
            this.value = d;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            methodVisitor.visitLdcInsn(Double.valueOf(this.value));
            return DoubleConstant.SIZE;
        }
    }
}
