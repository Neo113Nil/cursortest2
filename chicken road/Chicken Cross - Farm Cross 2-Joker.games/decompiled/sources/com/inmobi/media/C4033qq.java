package com.inmobi.media;

import android.content.Context;
import coil.disk.DiskLruCache;
import com.inmobi.media.core.config.models.AdConfig;
import io.ktor.http.ContentDisposition;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.qq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4033qq {

    /* renamed from: a, reason: collision with root package name */
    public C3786i6 f7337a;
    public final C4005pq b;

    public C4033qq(final Context context, final AdConfig.WebAssetCacheConfig webAssetCacheConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webAssetCacheConfig, "webAssetCacheConfig");
        this.b = new C4005pq();
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.qq$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4033qq.a(AdConfig.WebAssetCacheConfig.this, this, context);
            }
        };
        Context context2 = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
    }

    public final InputStream a(String url, Y9 y9) {
        Intrinsics.checkNotNullParameter(url, "url");
        C3786i6 c3786i6 = this.f7337a;
        if (c3786i6 == null) {
            if (y9 != null) {
                ((Z9) y9).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed readFromCache: " + url);
            }
            return null;
        }
        if (c3786i6 == null) {
            try {
                Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                c3786i6 = null;
            } catch (Exception e) {
                if (y9 != null) {
                    ((Z9) y9).a("WebAssetLRUCacheHelper", "Failed to read from cache with: " + e.getMessage() + " for " + url);
                }
            }
        }
        C3757h6 b = c3786i6.b(String.valueOf(url.hashCode()));
        if (b != null && Intrinsics.areEqual(url, AbstractC3945nn.a(new InputStreamReader(b.f7135a[0], AbstractC3945nn.b)))) {
            return b.f7135a[1];
        }
        if (y9 != null) {
            ((Z9) y9).a("WebAssetLRUCacheHelper", "did not find any valid cache entry for " + url);
        }
        return null;
    }

    public final boolean a(String url, String data, Y9 y9) {
        OutputStreamWriter outputStreamWriter;
        C3672e6 a2;
        OutputStreamWriter outputStreamWriter2;
        Charset charset;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.f7337a == null) {
            if (y9 != null) {
                ((Z9) y9).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed writeToCache: " + url);
            }
            return false;
        }
        try {
            String valueOf = String.valueOf(url.hashCode());
            C3786i6 c3786i6 = this.f7337a;
            outputStreamWriter = null;
            if (c3786i6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                c3786i6 = null;
            }
            a2 = c3786i6.a(valueOf);
        } catch (Exception e) {
            if (y9 != null) {
                ((Z9) y9).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: " + e.getMessage() + " for " + url);
            }
        }
        if (a2 == null) {
            if (y9 != null) {
                ((Z9) y9).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: diskLruCache.editor is null for " + url);
            }
            return false;
        }
        try {
            OutputStream a3 = a2.a(0);
            charset = AbstractC3945nn.b;
            outputStreamWriter2 = new OutputStreamWriter(a3, charset);
        } catch (Throwable th) {
            th = th;
        }
        try {
            outputStreamWriter2.write(url);
            AbstractC3945nn.a(outputStreamWriter2);
            try {
                OutputStreamWriter outputStreamWriter3 = new OutputStreamWriter(a2.a(1), charset);
                try {
                    outputStreamWriter3.write(data);
                    AbstractC3945nn.a(outputStreamWriter3);
                    if (a2.c) {
                        a2.d.a(a2, false);
                        a2.d.d(a2.f7081a.f7100a);
                    } else {
                        a2.d.a(a2, true);
                    }
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = outputStreamWriter3;
                    AbstractC3945nn.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStreamWriter = outputStreamWriter2;
            AbstractC3945nn.a(outputStreamWriter);
            throw th;
        }
    }

    public static final void a(AdConfig.WebAssetCacheConfig webAssetCacheConfig, C4033qq c4033qq, Context context) {
        try {
            Y5.f6965a.getClass();
            long j = Y5.c;
            if (j < webAssetCacheConfig.getMinAvailableDiskSpace()) {
                c4033qq.getClass();
                a(context, j);
                ConcurrentHashMap concurrentHashMap = Db.b;
                Db.a(Cb.a(context, "web_asset_file_key"), "cache_enabled", false);
                return;
            }
            c4033qq.a(context, webAssetCacheConfig, j);
            ConcurrentHashMap concurrentHashMap2 = Db.b;
            Db.a(Cb.a(context, "web_asset_file_key"), "cache_enabled", true);
        } catch (Exception e) {
            Lazy lazy = Ba.f6473a;
            Ba.a(new C3810j3(e));
            String str = "Failed to initialize diskLruCache with: " + e.getMessage();
        }
    }

    public final void a(Context context, AdConfig.WebAssetCacheConfig webAssetCacheConfig, long j) {
        File file = new File(context.getFilesDir(), "inmobiwebassetcache");
        Intrinsics.checkNotNullParameter(webAssetCacheConfig, "webAssetCacheConfig");
        long min = (j == -1 ? 0 : Math.min(webAssetCacheConfig.getCacheSize(), (int) ((j * webAssetCacheConfig.getCacheSizeToDiskSpaceMaxPercent()) / 100))) * 1024 * 1024;
        C4005pq c4005pq = this.b;
        Pattern pattern = C3786i6.p;
        if (min > 0) {
            File file2 = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
            if (file2.exists()) {
                File file3 = new File(file, DiskLruCache.JOURNAL_FILE);
                if (file3.exists()) {
                    file2.delete();
                } else if (!file2.renameTo(file3)) {
                    throw new IOException();
                }
            }
            C3786i6 c3786i6 = new C3786i6(file, min, c4005pq);
            if (c3786i6.c.exists()) {
                try {
                    c3786i6.b();
                    c3786i6.a();
                    c3786i6.l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c3786i6.c, true), AbstractC3945nn.f7272a));
                } catch (IOException e) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    c3786i6.close();
                    AbstractC3945nn.a(c3786i6.b);
                }
                this.f7337a = c3786i6;
                return;
            }
            file.mkdirs();
            c3786i6 = new C3786i6(file, min, c4005pq);
            c3786i6.c();
            this.f7337a = c3786i6;
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void a(Context context, long j) {
        Pair pair = TuplesKt.to(ContentDisposition.Parameters.Size, Long.valueOf(j));
        ConcurrentHashMap concurrentHashMap = Db.b;
        Db a2 = Cb.a(context, "web_asset_file_key");
        Intrinsics.checkNotNullParameter("cache_enabled", "key");
        Map mutableMapOf = MapsKt.mutableMapOf(pair, TuplesKt.to("state", Boolean.valueOf(a2.f6510a.getBoolean("cache_enabled", false))));
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b("LowAvailableSpaceForCache", mutableMapOf, EnumC3944nm.f7271a);
    }
}
