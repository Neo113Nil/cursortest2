package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
public abstract class LMSKeyParameters extends org.bouncycastle.crypto.params.AsymmetricKeyParameter implements org.bouncycastle.util.Encodable {
    public abstract byte[] getEncoded() throws java.io.IOException;

    protected LMSKeyParameters(boolean z) {
        super(z);
    }
}
