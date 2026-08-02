package org.modelmapper.internal.asm.tree;

import java.util.Map;
import org.modelmapper.internal.asm.Handle;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;

/* loaded from: classes4.dex */
public class InvokeDynamicInsnNode extends AbstractInsnNode {
    public Handle bsm;
    public Object[] bsmArgs;
    public String desc;
    public String name;

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public int getType() {
        return 6;
    }

    public InvokeDynamicInsnNode(String str, String str2, Handle handle, Object... objArr) {
        super(Opcodes.INVOKEDYNAMIC);
        this.name = str;
        this.desc = str2;
        this.bsm = handle;
        this.bsmArgs = objArr;
    }

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitInvokeDynamicInsn(this.name, this.desc, this.bsm, this.bsmArgs);
        acceptAnnotations(methodVisitor);
    }

    @Override // org.modelmapper.internal.asm.tree.AbstractInsnNode
    public AbstractInsnNode clone(Map<LabelNode, LabelNode> map) {
        return new InvokeDynamicInsnNode(this.name, this.desc, this.bsm, this.bsmArgs).cloneAnnotations(this);
    }
}
