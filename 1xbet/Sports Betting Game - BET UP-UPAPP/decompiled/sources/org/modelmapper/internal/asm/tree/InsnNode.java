package org.modelmapper.internal.asm.tree;

import java.util.Map;
import org.modelmapper.internal.asm.MethodVisitor;

/* loaded from: classes4.dex */
public class InsnNode extends AbstractInsnNode {
    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public int getType() {
        return 0;
    }

    public InsnNode(int i) {
        super(i);
    }

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitInsn(this.opcode);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        return new InsnNode(this.opcode).cloneAnnotations(this);
    }
}
