package org.bouncycastle.jcajce.provider.util;

/* loaded from: classes17.dex */
public class BadBlockException extends javax.crypto.BadPaddingException {
    private final java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public BadBlockException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighResolutionOutputSizeshNQ4ISI = th;
    }
}
