package org.modelmapper.internal.asm.commons;

import kotlin.text.Typography;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.asm.signature.SignatureVisitor;

@Deprecated
/* loaded from: classes4.dex */
public class RemappingSignatureAdapter extends SignatureVisitor {
    private String className;
    private final Remapper remapper;
    private final SignatureVisitor v;

    public RemappingSignatureAdapter(SignatureVisitor signatureVisitor, Remapper remapper) {
        this(Opcodes.ASM6, signatureVisitor, remapper);
    }

    protected RemappingSignatureAdapter(int i, SignatureVisitor signatureVisitor, Remapper remapper) {
        super(i);
        this.v = signatureVisitor;
        this.remapper = remapper;
    }

    @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
    public void visitClassType(String str) {
        this.className = str;
        this.v.visitClassType(this.remapper.mapType(str));
    }

    @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
    public void visitInnerClassType(String str) {
        int lastIndexOf;
        String str2 = this.remapper.mapType(this.className) + Typography.dollar;
        String str3 = this.className + Typography.dollar + str;
        this.className = str3;
        String mapType = this.remapper.mapType(str3);
        if (mapType.startsWith(str2)) {
            lastIndexOf = str2.length();
        } else {
            lastIndexOf = mapType.lastIndexOf(36) + 1;
        }
        this.v.visitInnerClassType(mapType.substring(lastIndexOf));
    }

    @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
    public void visitFormalTypeParameter(String str) {
        this.v.visitFormalTypeParameter(str);
    }

    @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
    public void visitTypeVariable(String str) {
        this.v.visitTypeVariable(str);
    }

    @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
    public SignatureVisitor visitArrayType() {
        this.v.visitArrayType();
        return this;
    }

    @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
    public void visitBaseType(char c) {
        this.v.visitBaseType(c);
    }

    @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
    public SignatureVisitor visitClassBound() {
        this.v.visitClassBound();
        return this;
    }

    @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
    public SignatureVisitor visitExceptionType() {
        this.v.visitExceptionType();
        return this;
    }

    @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
    public SignatureVisitor visitInterface() {
        this.v.visitInterface();
        return this;
    }

    @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
    public SignatureVisitor visitInterfaceBound() {
        this.v.visitInterfaceBound();
        return this;
    }

    @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
    public SignatureVisitor visitParameterType() {
        this.v.visitParameterType();
        return this;
    }

    @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
    public SignatureVisitor visitReturnType() {
        this.v.visitReturnType();
        return this;
    }

    @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
    public SignatureVisitor visitSuperclass() {
        this.v.visitSuperclass();
        return this;
    }

    @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
    public void visitTypeArgument() {
        this.v.visitTypeArgument();
    }

    @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
    public SignatureVisitor visitTypeArgument(char c) {
        this.v.visitTypeArgument(c);
        return this;
    }

    @Override // org.modelmapper.internal.asm.signature.SignatureVisitor
    public void visitEnd() {
        this.v.visitEnd();
    }
}
