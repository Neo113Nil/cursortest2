package org.modelmapper.internal.asm.tree;

import java.util.Map;
import org.modelmapper.internal.asm.MethodVisitor;

/* loaded from: classes4.dex */
public class LineNumberNode extends AbstractInsnNode {
    public int line;
    public LabelNode start;

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public int getType() {
        return 15;
    }

    public LineNumberNode(int i, LabelNode labelNode) {
        super(-1);
        this.line = i;
        this.start = labelNode;
    }

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitLineNumber(this.line, this.start.getLabel());
    }

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        return new LineNumberNode(this.line, clone(this.start, map));
    }
}
