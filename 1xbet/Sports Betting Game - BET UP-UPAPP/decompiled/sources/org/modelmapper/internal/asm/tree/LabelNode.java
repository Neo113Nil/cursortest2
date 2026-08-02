package org.modelmapper.internal.asm.tree;

import java.util.Map;
import org.modelmapper.internal.asm.Label;
import org.modelmapper.internal.asm.MethodVisitor;

/* loaded from: classes4.dex */
public class LabelNode extends AbstractInsnNode {
    private Label value;

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public int getType() {
        return 8;
    }

    public LabelNode() {
        super(-1);
    }

    public LabelNode(Label label) {
        super(-1);
        this.value = label;
    }

    public Label getLabel() {
        if (this.value == null) {
            this.value = new Label();
        }
        return this.value;
    }

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitLabel(getLabel());
    }

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        return map.get(this);
    }

    public void resetLabel() {
        this.value = null;
    }
}
