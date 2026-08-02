package org.modelmapper.internal.asm.tree;

import java.util.Map;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;

/* loaded from: classes4.dex */
public class MultiANewArrayInsnNode extends AbstractInsnNode {
    public String desc;
    public int dims;

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public int getType() {
        return 13;
    }

    public MultiANewArrayInsnNode(String str, int i) {
        super(Opcodes.MULTIANEWARRAY);
        this.desc = str;
        this.dims = i;
    }

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitMultiANewArrayInsn(this.desc, this.dims);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        return new MultiANewArrayInsnNode(this.desc, this.dims).cloneAnnotations(this);
    }
}
