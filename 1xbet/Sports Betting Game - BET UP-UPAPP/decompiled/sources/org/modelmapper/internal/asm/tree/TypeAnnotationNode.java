package org.modelmapper.internal.asm.tree;

import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.asm.TypePath;

/* loaded from: classes4.dex */
public class TypeAnnotationNode extends AnnotationNode {
    public TypePath typePath;
    public int typeRef;

    public TypeAnnotationNode(int i, TypePath typePath, String str) {
        this(Opcodes.ASM6, i, typePath, str);
        if (getClass() != TypeAnnotationNode.class) {
            throw new IllegalStateException();
        }
    }

    public TypeAnnotationNode(int i, int i2, TypePath typePath, String str) {
        super(i, str);
        this.typeRef = i2;
        this.typePath = typePath;
    }
}
