package org.modelmapper.internal.asm.tree;

import java.util.Map;
import org.modelmapper.internal.asm.MethodVisitor;

/* loaded from: classes4.dex */
public class TypeInsnNode extends AbstractInsnNode {
    public String desc;

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public int getType() {
        return 3;
    }

    public TypeInsnNode(int i, String str) {
        super(i);
        this.desc = str;
    }

    public void setOpcode(int i) {
        this.opcode = i;
    }

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitTypeInsn(this.opcode, this.desc);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        return new TypeInsnNode(this.opcode, this.desc).cloneAnnotations(this);
    }
}
