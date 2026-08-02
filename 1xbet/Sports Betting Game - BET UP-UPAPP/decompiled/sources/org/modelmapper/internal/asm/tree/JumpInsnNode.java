package org.modelmapper.internal.asm.tree;

import java.util.Map;
import org.modelmapper.internal.asm.MethodVisitor;

/* loaded from: classes4.dex */
public class JumpInsnNode extends AbstractInsnNode {
    public LabelNode label;

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public int getType() {
        return 7;
    }

    public JumpInsnNode(int i, LabelNode labelNode) {
        super(i);
        this.label = labelNode;
    }

    public void setOpcode(int i) {
        this.opcode = i;
    }

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitJumpInsn(this.opcode, this.label.getLabel());
        acceptAnnotations(methodVisitor);
    }

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        return new JumpInsnNode(this.opcode, clone(this.label, map)).cloneAnnotations(this);
    }
}
