package org.modelmapper.internal.asm.tree;

import org.modelmapper.internal.asm.MethodVisitor;

/* loaded from: classes4.dex */
public class ParameterNode {
    public int access;
    public String name;

    public ParameterNode(String str, int i) {
        this.name = str;
        this.access = i;
    }

    public void accept(MethodVisitor methodVisitor) {
        methodVisitor.visitParameter(this.name, this.access);
    }
}
