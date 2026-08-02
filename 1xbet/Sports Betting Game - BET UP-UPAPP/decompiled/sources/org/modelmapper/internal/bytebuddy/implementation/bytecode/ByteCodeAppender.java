package org.modelmapper.internal.bytebuddy.implementation.bytecode;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;

/* loaded from: classes4.dex */
public interface ByteCodeAppender {
    Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription);

    @HashCodeAndEqualsPlugin.Enhance
    public static class Size {
        private final int localVariableSize;
        private final int operandStackSize;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Size size = (Size) obj;
            return this.operandStackSize == size.operandStackSize && this.localVariableSize == size.localVariableSize;
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.operandStackSize) * 31) + this.localVariableSize;
        }

        public Size(int i, int i2) {
            this.operandStackSize = i;
            this.localVariableSize = i2;
        }

        public int getOperandStackSize() {
            return this.operandStackSize;
        }

        public int getLocalVariableSize() {
            return this.localVariableSize;
        }

        public Size merge(Size size) {
            return new Size(Math.max(this.operandStackSize, size.operandStackSize), Math.max(this.localVariableSize, size.localVariableSize));
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements ByteCodeAppender {
        private final List<ByteCodeAppender> byteCodeAppenders;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.byteCodeAppenders.equals(((Compound) obj).byteCodeAppenders);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.byteCodeAppenders.hashCode();
        }

        public Compound(ByteCodeAppender... byteCodeAppenderArr) {
            this((List<? extends ByteCodeAppender>) Arrays.asList(byteCodeAppenderArr));
        }

        public Compound(List<? extends ByteCodeAppender> list) {
            this.byteCodeAppenders = new ArrayList();
            for (ByteCodeAppender byteCodeAppender : list) {
                if (byteCodeAppender instanceof Compound) {
                    this.byteCodeAppenders.addAll(((Compound) byteCodeAppender).byteCodeAppenders);
                } else {
                    this.byteCodeAppenders.add(byteCodeAppender);
                }
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
        public Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            Size size = new Size(0, methodDescription.getStackSize());
            Iterator<ByteCodeAppender> it = this.byteCodeAppenders.iterator();
            while (it.hasNext()) {
                size = size.merge(it.next().apply(methodVisitor, context, methodDescription));
            }
            return size;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Simple implements ByteCodeAppender {
        private final StackManipulation stackManipulation;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.stackManipulation.equals(((Simple) obj).stackManipulation);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.stackManipulation.hashCode();
        }

        public Simple(StackManipulation... stackManipulationArr) {
            this((List<? extends StackManipulation>) Arrays.asList(stackManipulationArr));
        }

        public Simple(List<? extends StackManipulation> list) {
            this.stackManipulation = new StackManipulation.Compound(list);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
        public Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            return new Size(this.stackManipulation.apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
        }
    }
}
