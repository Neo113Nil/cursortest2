package com.google.android.play.core.integrity;

/* loaded from: classes9.dex */
public class StandardIntegrityException extends com.google.android.gms.common.api.ApiException {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.Throwable f3785a;

    StandardIntegrityException(int i, java.lang.Throwable th) {
        super(new com.google.android.gms.common.api.Status(i, java.lang.String.format(java.util.Locale.ROOT, "Standard Integrity API error (%d): %s.", java.lang.Integer.valueOf(i), com.google.android.play.core.integrity.model.b.a(i))));
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f3785a = th;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        java.lang.Throwable th;
        synchronized (this) {
            th = this.f3785a;
        }
        return th;
    }
}
