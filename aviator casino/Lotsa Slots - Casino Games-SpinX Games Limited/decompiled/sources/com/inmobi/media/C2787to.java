package com.inmobi.media;

/* renamed from: com.inmobi.media.to, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2787to {

    /* renamed from: a, reason: collision with root package name */
    public com.inmobi.media.L5 f5474a;
    public final com.inmobi.media.C2761so b;

    public C2787to(final android.content.Context context, final com.inmobi.media.core.config.models.AdConfig.WebAssetCacheConfig webAssetCacheConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webAssetCacheConfig, "webAssetCacheConfig");
        this.b = new com.inmobi.media.C2761so();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.to$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.C2787to.a(com.inmobi.media.core.config.models.AdConfig.WebAssetCacheConfig.this, this, context);
            }
        };
        android.content.Context context2 = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.inmobi.media.Xi.g.submit(runnable);
    }

    public final java.io.InputStream a(java.lang.String url, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        com.inmobi.media.L5 l5 = this.f5474a;
        if (l5 == null) {
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed readFromCache: " + url);
            }
            return null;
        }
        if (l5 == null) {
            try {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                l5 = null;
            } catch (java.lang.Exception e) {
                if (interfaceC2772t9 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).a("WebAssetLRUCacheHelper", "Failed to read from cache with: " + e.getMessage() + " for " + url);
                }
            }
        }
        com.inmobi.media.K5 b = l5.b(java.lang.String.valueOf(url.hashCode()));
        if (b != null && kotlin.jvm.internal.Intrinsics.areEqual(url, com.inmobi.media.AbstractC2758sl.a(new java.io.InputStreamReader(b.f4794a[0], com.inmobi.media.AbstractC2758sl.b)))) {
            return b.f4794a[1];
        }
        if (interfaceC2772t9 != null) {
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("WebAssetLRUCacheHelper", "did not find any valid cache entry for " + url);
        }
        return null;
    }

    public final boolean a(java.lang.String url, java.lang.String data, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        java.io.OutputStreamWriter outputStreamWriter;
        com.inmobi.media.H5 a2;
        java.io.OutputStreamWriter outputStreamWriter2;
        java.nio.charset.Charset charset;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        if (this.f5474a == null) {
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed writeToCache: " + url);
            }
            return false;
        }
        try {
            java.lang.String valueOf = java.lang.String.valueOf(url.hashCode());
            com.inmobi.media.L5 l5 = this.f5474a;
            outputStreamWriter = null;
            if (l5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                l5 = null;
            }
            a2 = l5.a(valueOf);
        } catch (java.lang.Exception e) {
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: " + e.getMessage() + " for " + url);
            }
        }
        if (a2 == null) {
            if (interfaceC2772t9 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: diskLruCache.editor is null for " + url);
            }
            return false;
        }
        try {
            java.io.OutputStream a3 = a2.a(0);
            charset = com.inmobi.media.AbstractC2758sl.b;
            outputStreamWriter2 = new java.io.OutputStreamWriter(a3, charset);
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            outputStreamWriter2.write(url);
            com.inmobi.media.AbstractC2758sl.a(outputStreamWriter2);
            try {
                java.io.OutputStreamWriter outputStreamWriter3 = new java.io.OutputStreamWriter(a2.a(1), charset);
                try {
                    outputStreamWriter3.write(data);
                    com.inmobi.media.AbstractC2758sl.a(outputStreamWriter3);
                    if (a2.c) {
                        a2.d.a(a2, false);
                        a2.d.d(a2.f4739a.f4757a);
                    } else {
                        a2.d.a(a2, true);
                    }
                    return true;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    outputStreamWriter = outputStreamWriter3;
                    com.inmobi.media.AbstractC2758sl.a(outputStreamWriter);
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            outputStreamWriter = outputStreamWriter2;
            com.inmobi.media.AbstractC2758sl.a(outputStreamWriter);
            throw th;
        }
    }

    public static final void a(com.inmobi.media.core.config.models.AdConfig.WebAssetCacheConfig webAssetCacheConfig, com.inmobi.media.C2787to c2787to, android.content.Context context) {
        try {
            com.inmobi.media.B5.f4614a.getClass();
            long j = com.inmobi.media.B5.c;
            if (j < webAssetCacheConfig.getMinAvailableDiskSpace()) {
                c2787to.getClass();
                a(context, j);
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                com.inmobi.media.La.a(com.inmobi.media.Ka.a(context, "web_asset_file_key"), "cache_enabled", false);
                return;
            }
            c2787to.a(context, webAssetCacheConfig, j);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = com.inmobi.media.La.b;
            com.inmobi.media.La.a(com.inmobi.media.Ka.a(context, "web_asset_file_key"), "cache_enabled", true);
        } catch (java.lang.Exception e) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(e));
            e.getMessage();
        }
    }

    public final void a(android.content.Context context, com.inmobi.media.core.config.models.AdConfig.WebAssetCacheConfig webAssetCacheConfig, long j) {
        java.io.File file = new java.io.File(context.getFilesDir(), "inmobiwebassetcache");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webAssetCacheConfig, "webAssetCacheConfig");
        long min = (j == -1 ? 0 : java.lang.Math.min(webAssetCacheConfig.getCacheSize(), (int) ((j * webAssetCacheConfig.getCacheSizeToDiskSpaceMaxPercent()) / 100))) * 1024 * 1024;
        com.inmobi.media.C2761so c2761so = this.b;
        java.util.regex.Pattern pattern = com.inmobi.media.L5.p;
        if (min > 0) {
            java.io.File file2 = new java.io.File(file, coil.disk.DiskLruCache.JOURNAL_FILE_BACKUP);
            if (file2.exists()) {
                java.io.File file3 = new java.io.File(file, coil.disk.DiskLruCache.JOURNAL_FILE);
                if (file3.exists()) {
                    file2.delete();
                } else if (!file2.renameTo(file3)) {
                    throw new java.io.IOException();
                }
            }
            com.inmobi.media.L5 l5 = new com.inmobi.media.L5(file, min, c2761so);
            if (l5.c.exists()) {
                try {
                    l5.b();
                    l5.a();
                    l5.l = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(l5.c, true), com.inmobi.media.AbstractC2758sl.f5451a));
                } catch (java.io.IOException e) {
                    java.lang.System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    l5.close();
                    com.inmobi.media.AbstractC2758sl.a(l5.b);
                }
                this.f5474a = l5;
                return;
            }
            file.mkdirs();
            l5 = new com.inmobi.media.L5(file, min, c2761so);
            l5.c();
            this.f5474a = l5;
            return;
        }
        throw new java.lang.IllegalArgumentException("maxSize <= 0");
    }

    public static void a(android.content.Context context, long j) {
        kotlin.Pair pair = kotlin.TuplesKt.to("size", java.lang.Long.valueOf(j));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
        com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "web_asset_file_key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("cache_enabled", com.ironsource.X3.i.W);
        java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(pair, kotlin.TuplesKt.to("state", java.lang.Boolean.valueOf(a2.f4815a.getBoolean("cache_enabled", false))));
        com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
        com.inmobi.media.C2624nk.b("LowAvailableSpaceForCache", mutableMapOf, com.inmobi.media.EnumC2728rk.f5431a);
    }
}
