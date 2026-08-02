package org.modelmapper.internal.bytebuddy.utility.visitor;

import org.modelmapper.internal.asm.Label;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.utility.OpenedClassReader;

/* loaded from: classes4.dex */
public class LineNumberPrependingMethodVisitor extends ExceptionTableSensitiveMethodVisitor {
    private boolean prependLineNumber;
    private final Label startOfMethod;

    public LineNumberPrependingMethodVisitor(MethodVisitor methodVisitor) {
        super(OpenedClassReader.ASM_API, methodVisitor);
        this.startOfMethod = new Label();
        this.prependLineNumber = true;
    }

    @Override // org.modelmapper.internal.bytebuddy.utility.visitor.ExceptionTableSensitiveMethodVisitor
    protected void onAfterExceptionTable() {
        super.visitLabel(this.startOfMethod);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitLineNumber(int i, Label label) {
        if (this.prependLineNumber) {
            label = this.startOfMethod;
            this.prependLineNumber = false;
        }
        super.visitLineNumber(i, label);
    }
}
