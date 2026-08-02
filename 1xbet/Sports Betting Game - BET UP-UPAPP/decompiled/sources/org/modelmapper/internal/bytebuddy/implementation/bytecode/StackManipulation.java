package org.modelmapper.internal.bytebuddy.implementation.bytecode;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;

/* loaded from: classes4.dex */
public interface StackManipulation {
    Size apply(MethodVisitor methodVisitor, Implementation.Context context);

    boolean isValid();

    public enum Illegal implements StackManipulation {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return false;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            throw new IllegalStateException("An illegal stack manipulation must not be applied");
        }
    }

    public enum Trivial implements StackManipulation {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            return StackSize.ZERO.toIncreasingSize();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Size {
        private final int maximalSize;
        private final int sizeImpact;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Size size = (Size) obj;
            return this.sizeImpact == size.sizeImpact && this.maximalSize == size.maximalSize;
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.sizeImpact) * 31) + this.maximalSize;
        }

        public Size(int i, int i2) {
            this.sizeImpact = i;
            this.maximalSize = i2;
        }

        public int getSizeImpact() {
            return this.sizeImpact;
        }

        public int getMaximalSize() {
            return this.maximalSize;
        }

        public Size aggregate(Size size) {
            return aggregate(size.sizeImpact, size.maximalSize);
        }

        private Size aggregate(int i, int i2) {
            int i3 = this.sizeImpact;
            return new Size(i + i3, Math.max(this.maximalSize, i3 + i2));
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements StackManipulation {
        private final List<StackManipulation> stackManipulations;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.stackManipulations.equals(((Compound) obj).stackManipulations);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.stackManipulations.hashCode();
        }

        public Compound(StackManipulation... stackManipulationArr) {
            this((List<? extends StackManipulation>) Arrays.asList(stackManipulationArr));
        }

        public Compound(List<? extends StackManipulation> list) {
            this.stackManipulations = new ArrayList();
            for (StackManipulation stackManipulation : list) {
                if (stackManipulation instanceof Compound) {
                    this.stackManipulations.addAll(((Compound) stackManipulation).stackManipulations);
                } else if (!(stackManipulation instanceof Trivial)) {
                    this.stackManipulations.add(stackManipulation);
                }
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            Iterator<StackManipulation> it = this.stackManipulations.iterator();
            while (it.hasNext()) {
                if (!it.next().isValid()) {
                    return false;
                }
            }
            return true;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            Size size = new Size(0, 0);
            Iterator<StackManipulation> it = this.stackManipulations.iterator();
            while (it.hasNext()) {
                size = size.aggregate(it.next().apply(methodVisitor, context));
            }
            return size;
        }
    }
}
