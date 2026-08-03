package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ca, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0276ca {

    /* renamed from: a, reason: collision with root package name */
    public volatile java.lang.Boolean f5643a;

    public final void a(android.content.Context context) {
        if (this.f5643a == null) {
            synchronized (this) {
                if (this.f5643a == null) {
                    boolean z2 = false;
                    try {
                        java.io.File fileFromAppStorage = io.appmetrica.analytics.coreutils.internal.io.FileUtils.getFileFromAppStorage(context, "uuid.dat");
                        boolean exists = fileFromAppStorage != null ? fileFromAppStorage.exists() : false;
                        java.io.File fileFromSdkStorage = io.appmetrica.analytics.coreutils.internal.io.FileUtils.getFileFromSdkStorage(context, "uuid.dat");
                        boolean exists2 = fileFromSdkStorage != null ? fileFromSdkStorage.exists() : false;
                        if (exists || exists2) {
                            z2 = true;
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                    this.f5643a = java.lang.Boolean.valueOf(z2);
                }
            }
        }
    }
}
