package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

/* loaded from: classes5.dex */
public final class g implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f {
    public static final int d = 8;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7471a;
    public final java.lang.String b;
    public final java.lang.String c;

    public g(android.content.Context appContext, java.lang.String cacheDir) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        this.f7471a = appContext;
        this.b = cacheDir;
        this.c = "MediaCacheLocationProviderImpl";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f
    public com.moloco.sdk.internal.v<java.io.File, com.moloco.sdk.internal.m> a() {
        try {
            java.io.File externalCacheDir = this.f7471a.getExternalCacheDir();
            if (externalCacheDir != null) {
                java.io.File file = new java.io.File(externalCacheDir, this.b);
                file.mkdir();
                if (file.exists()) {
                    return new com.moloco.sdk.internal.v.b(file);
                }
            }
            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.c, "Failed to create cache directory in external storage", null, false, 12, null);
            return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.m("Failed to create cache directory in external storage", 102));
        } catch (java.io.IOException e) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.c, "Failed to create cache directory in external storage", e, false, 8, null);
            return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.m("Failed to create cache directory in external storage", 101));
        } catch (java.lang.SecurityException e2) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.c, "Failed to create cache directory in external storage", e2, false, 8, null);
            return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.m("Failed to create cache directory in external storage", 100));
        } catch (java.lang.Exception e3) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.c, "Failed to create cache directory in external storage", e3, false, 8, null);
            return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.m("Failed to create cache directory in external storage", 200));
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f
    public com.moloco.sdk.internal.v<java.io.File, com.moloco.sdk.internal.m> b() {
        try {
            if (this.f7471a.getCacheDir() != null) {
                java.io.File file = new java.io.File(this.f7471a.getCacheDir(), this.b);
                file.mkdir();
                if (file.exists()) {
                    com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.c, "Able to write to internal storage cache directory", false, 4, null);
                    return new com.moloco.sdk.internal.v.b(file);
                }
            }
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.c, "Failed to create cache directory in internal storage", null, false, 12, null);
            return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.m("Failed to create cache directory in internal storage", 102));
        } catch (java.io.IOException e) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.c, "Failed to create cache directory in external storage", e, false, 8, null);
            return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.m("Failed to create cache directory in internal storage", 101));
        } catch (java.lang.SecurityException e2) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.c, "Failed to create cache directory in external storage", e2, false, 8, null);
            return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.m("Failed to create cache directory in internal storage", 100));
        } catch (java.lang.Exception e3) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.c, "Failed to create cache directory in external storage", e3, false, 8, null);
            return new com.moloco.sdk.internal.v.a(new com.moloco.sdk.internal.m("Failed to create cache directory in internal storage", 200));
        }
    }

    public final android.content.Context c() {
        return this.f7471a;
    }

    public final java.lang.String d() {
        return this.b;
    }
}
