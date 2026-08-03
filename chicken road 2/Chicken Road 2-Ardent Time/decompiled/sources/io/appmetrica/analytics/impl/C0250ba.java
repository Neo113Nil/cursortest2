package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ba, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0250ba implements io.appmetrica.analytics.impl.Bo {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f5537a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f5538b;

    public C0250ba(android.content.Context context, java.lang.String str) {
        this.f5537a = context;
        this.f5538b = str;
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final java.lang.String a() {
        try {
            java.io.File fileFromSdkStorage = io.appmetrica.analytics.coreutils.internal.io.FileUtils.getFileFromSdkStorage(this.f5537a, this.f5538b);
            if (fileFromSdkStorage != null) {
                fileFromSdkStorage.exists();
                java.io.File fileFromAppStorage = io.appmetrica.analytics.coreutils.internal.io.FileUtils.getFileFromAppStorage(this.f5537a, this.f5538b);
                if (fileFromAppStorage != null) {
                    io.appmetrica.analytics.coreutils.internal.io.FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
                }
                return q1.AbstractC0982b.G(fileFromSdkStorage);
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final void a(java.lang.String text) {
        try {
            java.io.File fileFromSdkStorage = io.appmetrica.analytics.coreutils.internal.io.FileUtils.getFileFromSdkStorage(this.f5537a, this.f5538b);
            if (fileFromSdkStorage == null) {
                return;
            }
            java.nio.charset.Charset charset = y1.a.f8486a;
            kotlin.jvm.internal.i.e(text, "text");
            kotlin.jvm.internal.i.e(charset, "charset");
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileFromSdkStorage);
            try {
                q1.AbstractC0982b.H(fileOutputStream, text, charset);
                Q1.d.g(fileOutputStream, null);
            } finally {
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
