package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ae {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4057a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0600oo f4058b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0626po f4059c;

    public Ae(android.content.Context context) {
        this(context, new io.appmetrica.analytics.impl.C0600oo(), new io.appmetrica.analytics.impl.C0626po());
    }

    public final java.lang.String a(java.lang.String str) {
        try {
            this.f4059c.getClass();
            if (!io.appmetrica.analytics.impl.C0626po.a(str)) {
                this.f4058b.getClass();
                str = y1.o.I(java.util.UUID.randomUUID().toString(), "-", "").toLowerCase(java.util.Locale.US);
            }
            java.io.File fileFromSdkStorage = io.appmetrica.analytics.coreutils.internal.io.FileUtils.getFileFromSdkStorage(this.f4057a, "uuid.dat");
            if (fileFromSdkStorage != null && str != null) {
                io.appmetrica.analytics.impl.Ja.a(str, new java.io.FileOutputStream(fileFromSdkStorage));
            }
            return str;
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public Ae(android.content.Context context, io.appmetrica.analytics.impl.C0600oo c0600oo, io.appmetrica.analytics.impl.C0626po c0626po) {
        this.f4057a = context;
        this.f4058b = c0600oo;
        this.f4059c = c0626po;
    }

    public final void a() {
        java.io.File fileFromAppStorage;
        java.io.File fileFromSdkStorage = io.appmetrica.analytics.coreutils.internal.io.FileUtils.getFileFromSdkStorage(this.f4057a, "uuid.dat");
        if (fileFromSdkStorage == null || fileFromSdkStorage.exists() || (fileFromAppStorage = io.appmetrica.analytics.coreutils.internal.io.FileUtils.getFileFromAppStorage(this.f4057a, "uuid.dat")) == null || !fileFromAppStorage.exists()) {
            return;
        }
        io.appmetrica.analytics.coreutils.internal.io.FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
    }
}
