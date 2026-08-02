package org.bouncycastle.pkix.jcajce;

/* loaded from: classes17.dex */
class AnnotatedException extends java.lang.Exception {
    private java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public AnnotatedException(java.lang.String str, java.lang.Throwable th) {
        super(str);
        this.getHighResolutionOutputSizeshNQ4ISI = th;
    }

    public AnnotatedException(java.lang.String str) {
        this(str, null);
    }
}
