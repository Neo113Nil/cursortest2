package org.bouncycastle.i18n;

/* loaded from: classes17.dex */
public class LocalizedException extends java.lang.Exception {
    private java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;
    protected org.bouncycastle.i18n.ErrorBundle message;

    public org.bouncycastle.i18n.ErrorBundle getErrorMessage() {
        return this.message;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public LocalizedException(org.bouncycastle.i18n.ErrorBundle errorBundle, java.lang.Throwable th) {
        super(errorBundle.getText(java.util.Locale.getDefault()));
        this.message = errorBundle;
        this.getHighResolutionOutputSizeshNQ4ISI = th;
    }

    public LocalizedException(org.bouncycastle.i18n.ErrorBundle errorBundle) {
        super(errorBundle.getText(java.util.Locale.getDefault()));
        this.message = errorBundle;
    }
}
