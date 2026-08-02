package org.modelmapper.internal.asm.tree;

import java.util.Map;
import org.modelmapper.internal.asm.MethodVisitor;

/* loaded from: classes4.dex */
public class IincInsnNode extends AbstractInsnNode {
    public int incr;
    public int var;

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public int getType() {
        return 10;
    }

    public IincInsnNode(int i, int i2) {
        super(132);
        this.var = i;
        this.incr = i2;
    }

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitIincInsn(this.var, this.incr);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        return new IincInsnNode(this.var, this.incr).cloneAnnotations(this);
    }
}
