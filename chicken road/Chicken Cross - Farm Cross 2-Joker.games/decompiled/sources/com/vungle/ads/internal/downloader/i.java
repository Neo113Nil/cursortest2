package com.vungle.ads.internal.downloader;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.net.HttpHeaders;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.InvalidAssetUrlError;
import com.vungle.ads.NoSpaceError;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.k2;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.u;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import okio.Okio__JvmOkioKt;

/* loaded from: classes7.dex */
public final class i implements n {

    /* renamed from: a, reason: collision with root package name */
    public final com.vungle.ads.internal.executor.j f11903a;
    public final PathProvider b;
    public final Lazy c;
    public final CopyOnWriteArrayList d;

    public i(com.vungle.ads.internal.executor.j downloadExecutor, PathProvider pathProvider) {
        Intrinsics.checkNotNullParameter(downloadExecutor, "downloadExecutor");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.f11903a = downloadExecutor;
        this.b = pathProvider;
        this.c = LazyKt.lazy(new h(this));
        this.d = new CopyOnWriteArrayList();
    }

    public final void a(final l lVar, final e eVar) {
        this.d.add(lVar);
        this.f11903a.a(new g(this, lVar, eVar), new Runnable() { // from class: com.vungle.ads.internal.downloader.i$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                i.a(i.this, lVar, eVar);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0279, code lost:
    
        r6.b(3);
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0498 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x050e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c b(l lVar, e eVar) {
        Call call;
        File file;
        l lVar2;
        e eVar2;
        Exception exc;
        int i;
        BufferedSink bufferedSink;
        Response response;
        BufferedSource bufferedSource;
        ResponseBody body;
        c cVar;
        int b;
        ResponseBody body2;
        int code;
        long contentLength;
        int i2;
        long j;
        ResponseBody body3;
        com.vungle.ads.internal.model.b a2 = lVar.a();
        boolean z = u.f12190a;
        com.vungle.ads.internal.util.t.a("AssetDownloader", com.iab.omid.library.vungle.internal.l.a("launch request in thread: ").append(Thread.currentThread().getId()).append(" request: ").append(a2.h()).toString());
        if (lVar.e()) {
            com.vungle.ads.internal.util.t.a("AssetDownloader", com.iab.omid.library.vungle.internal.l.a("Request ").append(a2.h()).append(" is cancelled before starting").toString());
            new d().b(3);
            return null;
        }
        d dVar = new d();
        dVar.c(System.currentTimeMillis());
        String h = a2.h();
        String c = a2.c();
        if (h.length() == 0 || !com.vungle.ads.internal.util.n.a(h)) {
            return new c(-1, new InvalidAssetUrlError(com.iab.omid.library.vungle.d.a("invalid url: ", h)).setLogEntry$vungle_ads_release(lVar.c()).logError$vungle_ads_release(), 4);
        }
        if (c.length() == 0) {
            return new c(-1, new AssetWriteError(com.iab.omid.library.vungle.d.a("invalid path: ", c)).setLogEntry$vungle_ads_release(lVar.c()).logError$vungle_ads_release(), 3);
        }
        String absolutePath = this.b.c().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "pathProvider.getVungleDir().absolutePath");
        long a3 = PathProvider.a(absolutePath);
        if (a3 < ServiceProvider.HTTP_CACHE_DISK_SIZE) {
            new NoSpaceError("Insufficient space " + a3).setLogEntry$vungle_ads_release(lVar.c()).logErrorNoReturnValue$vungle_ads_release();
            return new c(-1, new NoSpaceError(null, 1, null).setLogEntry$vungle_ads_release(lVar.c()).logError$vungle_ads_release(), 2);
        }
        File file2 = new File(c);
        if (file2.exists()) {
            com.vungle.ads.internal.util.t.a("AssetDownloader", com.iab.omid.library.vungle.internal.l.a("Deleting existing file before download: ").append(file2.getAbsolutePath()).toString());
            if (!file2.delete()) {
                return new c(-1, new AssetWriteError("Cannot delete partial file for restart").setLogEntry$vungle_ads_release(lVar.c()).logError$vungle_ads_release(), 2);
            }
        }
        try {
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                try {
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                } catch (Exception e) {
                    exc = e;
                    bufferedSink = null;
                    response = null;
                    bufferedSource = null;
                    i = -1;
                    file = file2;
                    call = null;
                    lVar2 = lVar;
                    eVar2 = eVar;
                    try {
                        boolean z2 = u.f12190a;
                        com.vungle.ads.internal.util.t.b("AssetDownloader", "Download exception for " + a2.h() + ": " + exc);
                        dVar.b(7);
                        c cVar2 = new c(i, exc, 1);
                        if ((response == null ? response.body() : null) != null) {
                        }
                        if (call != null) {
                        }
                        com.vungle.ads.internal.util.n.a(bufferedSink);
                        com.vungle.ads.internal.util.n.a(bufferedSource);
                        com.vungle.ads.internal.util.t.a("AssetDownloader", "download status: " + dVar.b());
                        cVar = cVar2;
                        b = dVar.b();
                        if (b == 7) {
                        }
                        return cVar;
                    } catch (Throwable th) {
                        th = th;
                        if ((response != null ? response.body() : null) != null && (body = response.body()) != null) {
                            body.close();
                            Unit unit = Unit.INSTANCE;
                        }
                        if (call != null) {
                            call.cancel();
                            Unit unit2 = Unit.INSTANCE;
                        }
                        com.vungle.ads.internal.util.n.a(bufferedSink);
                        com.vungle.ads.internal.util.n.a(bufferedSource);
                        boolean z3 = u.f12190a;
                        com.vungle.ads.internal.util.t.a("AssetDownloader", com.iab.omid.library.vungle.internal.l.a("download status: ").append(dVar.b()).toString());
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    call = null;
                    bufferedSink = null;
                    response = null;
                    bufferedSource = null;
                    if ((response != null ? response.body() : null) != null) {
                    }
                    if (call != null) {
                    }
                    com.vungle.ads.internal.util.n.a(bufferedSink);
                    com.vungle.ads.internal.util.n.a(bufferedSource);
                    boolean z32 = u.f12190a;
                    com.vungle.ads.internal.util.t.a("AssetDownloader", com.iab.omid.library.vungle.internal.l.a("download status: ").append(dVar.b()).toString());
                    throw th;
                }
            }
            call = ((OkHttpClient) this.c.getValue()).newCall(new Request.Builder().url(h).build());
            try {
                response = call.execute();
                try {
                    try {
                        code = response.code();
                        try {
                        } catch (Exception e2) {
                            e = e2;
                            file = file2;
                            lVar2 = lVar;
                            eVar2 = eVar;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedSink = null;
                        bufferedSource = null;
                        if ((response != null ? response.body() : null) != null) {
                            body.close();
                            Unit unit3 = Unit.INSTANCE;
                        }
                        if (call != null) {
                        }
                        com.vungle.ads.internal.util.n.a(bufferedSink);
                        com.vungle.ads.internal.util.n.a(bufferedSource);
                        boolean z322 = u.f12190a;
                        com.vungle.ads.internal.util.t.a("AssetDownloader", com.iab.omid.library.vungle.internal.l.a("download status: ").append(dVar.b()).toString());
                        throw th;
                    }
                } catch (Exception e3) {
                    file = file2;
                    lVar2 = lVar;
                    eVar2 = eVar;
                    exc = e3;
                    i = -1;
                }
            } catch (Exception e4) {
                file = file2;
                lVar2 = lVar;
                eVar2 = eVar;
                exc = e4;
                i = -1;
                bufferedSink = null;
                response = null;
                bufferedSource = null;
                boolean z22 = u.f12190a;
                com.vungle.ads.internal.util.t.b("AssetDownloader", "Download exception for " + a2.h() + ": " + exc);
                dVar.b(7);
                c cVar22 = new c(i, exc, 1);
                if ((response == null ? response.body() : null) != null) {
                }
                if (call != null) {
                }
                com.vungle.ads.internal.util.n.a(bufferedSink);
                com.vungle.ads.internal.util.n.a(bufferedSource);
                com.vungle.ads.internal.util.t.a("AssetDownloader", "download status: " + dVar.b());
                cVar = cVar22;
                b = dVar.b();
                if (b == 7) {
                }
                return cVar;
            } catch (Throwable th4) {
                th = th4;
                bufferedSink = null;
                response = null;
                bufferedSource = null;
                if ((response != null ? response.body() : null) != null) {
                }
                if (call != null) {
                }
                com.vungle.ads.internal.util.n.a(bufferedSink);
                com.vungle.ads.internal.util.n.a(bufferedSource);
                boolean z3222 = u.f12190a;
                com.vungle.ads.internal.util.t.a("AssetDownloader", com.iab.omid.library.vungle.internal.l.a("download status: ").append(dVar.b()).toString());
                throw th;
            }
        } catch (Exception e5) {
            file = file2;
            lVar2 = lVar;
            eVar2 = eVar;
            exc = e5;
            i = -1;
            call = null;
        } catch (Throwable th5) {
            th = th5;
            call = null;
        }
        if (!response.isSuccessful()) {
            file = file2;
            lVar2 = lVar;
            eVar2 = eVar;
            try {
                throw new m(response.message());
            } catch (Exception e6) {
                e = e6;
                exc = e;
                i = code;
                bufferedSink = null;
                bufferedSource = null;
                boolean z222 = u.f12190a;
                com.vungle.ads.internal.util.t.b("AssetDownloader", "Download exception for " + a2.h() + ": " + exc);
                dVar.b(7);
                c cVar222 = new c(i, exc, 1);
                if ((response == null ? response.body() : null) != null) {
                }
                if (call != null) {
                }
                com.vungle.ads.internal.util.n.a(bufferedSink);
                com.vungle.ads.internal.util.n.a(bufferedSource);
                com.vungle.ads.internal.util.t.a("AssetDownloader", "download status: " + dVar.b());
                cVar = cVar222;
                b = dVar.b();
                if (b == 7) {
                }
                return cVar;
            }
        }
        if (response.cacheResponse() != null) {
            try {
                AnalyticsClient.INSTANCE.a(new k2(Sdk.SDKMetric.SDKMetricType.CACHED_ASSETS_USED), lVar.c(), h);
                Unit unit4 = Unit.INSTANCE;
            } catch (Exception e7) {
                exc = e7;
                file = file2;
                i = code;
                bufferedSink = null;
                bufferedSource = null;
                lVar2 = lVar;
                eVar2 = eVar;
                boolean z2222 = u.f12190a;
                com.vungle.ads.internal.util.t.b("AssetDownloader", "Download exception for " + a2.h() + ": " + exc);
                dVar.b(7);
                c cVar2222 = new c(i, exc, 1);
                if ((response == null ? response.body() : null) != null) {
                }
                if (call != null) {
                }
                com.vungle.ads.internal.util.n.a(bufferedSink);
                com.vungle.ads.internal.util.n.a(bufferedSource);
                com.vungle.ads.internal.util.t.a("AssetDownloader", "download status: " + dVar.b());
                cVar = cVar2222;
                b = dVar.b();
                if (b == 7) {
                }
                return cVar;
            }
        }
        ResponseBody a4 = a(response);
        String header$default = Response.header$default(response, "Content-Type", null, 2, null);
        if (header$default != null) {
            lVar.a().a(header$default);
            Unit unit5 = Unit.INSTANCE;
        }
        BufferedSource source = a4 != null ? a4.getSource() : null;
        try {
            com.vungle.ads.internal.util.t.a("AssetDownloader", "Start download from url: " + h + " mimeType=" + header$default);
            BufferedSink buffer = Okio.buffer(Okio__JvmOkioKt.sink$default(file2, false, 1, null));
            if (a4 != null) {
                try {
                    try {
                        contentLength = a4.getContentLength();
                    } catch (Exception e8) {
                        exc = e8;
                        bufferedSource = source;
                        file = file2;
                        bufferedSink = buffer;
                        i = code;
                        lVar2 = lVar;
                        eVar2 = eVar;
                        boolean z22222 = u.f12190a;
                        com.vungle.ads.internal.util.t.b("AssetDownloader", "Download exception for " + a2.h() + ": " + exc);
                        dVar.b(7);
                        c cVar22222 = new c(i, exc, 1);
                        if ((response == null ? response.body() : null) != null) {
                        }
                        if (call != null) {
                        }
                        com.vungle.ads.internal.util.n.a(bufferedSink);
                        com.vungle.ads.internal.util.n.a(bufferedSource);
                        com.vungle.ads.internal.util.t.a("AssetDownloader", "download status: " + dVar.b());
                        cVar = cVar22222;
                        b = dVar.b();
                        if (b == 7) {
                        }
                        return cVar;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    bufferedSource = source;
                    bufferedSink = buffer;
                    if ((response != null ? response.body() : null) != null) {
                    }
                    if (call != null) {
                    }
                    com.vungle.ads.internal.util.n.a(bufferedSink);
                    com.vungle.ads.internal.util.n.a(bufferedSource);
                    boolean z32222 = u.f12190a;
                    com.vungle.ads.internal.util.t.a("AssetDownloader", com.iab.omid.library.vungle.internal.l.a("download status: ").append(dVar.b()).toString());
                    throw th;
                }
            } else {
                contentLength = 0;
            }
            try {
                dVar.b(0);
                dVar.b(contentLength);
                dVar.a(0L);
                dVar.a(0);
                a2.a(contentLength);
                if (eVar != null) {
                    eVar.a(dVar, lVar);
                }
                int i3 = 0;
                long j2 = 0;
                while (true) {
                    if (source != null) {
                        i2 = i3;
                        try {
                            j = source.read(buffer.getBuffer(), PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                        } catch (Exception e9) {
                            lVar2 = lVar;
                            eVar2 = eVar;
                            exc = e9;
                            bufferedSource = source;
                            file = file2;
                            bufferedSink = buffer;
                            i = code;
                            boolean z222222 = u.f12190a;
                            com.vungle.ads.internal.util.t.b("AssetDownloader", "Download exception for " + a2.h() + ": " + exc);
                            dVar.b(7);
                            c cVar222222 = new c(i, exc, 1);
                            if ((response == null ? response.body() : null) != null) {
                                body2.close();
                                Unit unit6 = Unit.INSTANCE;
                            }
                            if (call != null) {
                            }
                            com.vungle.ads.internal.util.n.a(bufferedSink);
                            com.vungle.ads.internal.util.n.a(bufferedSource);
                            com.vungle.ads.internal.util.t.a("AssetDownloader", "download status: " + dVar.b());
                            cVar = cVar222222;
                            b = dVar.b();
                            if (b == 7) {
                            }
                            return cVar;
                        }
                    } else {
                        i2 = i3;
                        j = -1;
                    }
                    try {
                        Unit unit7 = Unit.INSTANCE;
                        if (j <= 0) {
                            break;
                        }
                        if (lVar.e()) {
                            break;
                        }
                        if (!file2.exists()) {
                            new AssetWriteError("Asset save error " + h).setLogEntry$vungle_ads_release(lVar.c()).logErrorNoReturnValue$vungle_ads_release();
                            throw new m("File is not existing");
                        }
                        dVar.b(1);
                        buffer.emit();
                        buffer.flush();
                        j2 += j;
                        dVar.a(j2);
                        Long f = a2.f();
                        long longValue = f != null ? f.longValue() : a2.g();
                        if (!a2.o() || j2 < longValue) {
                            file = file2;
                        } else {
                            try {
                                boolean z4 = u.f12190a;
                                file = file2;
                            } catch (Exception e10) {
                                e = e10;
                                file = file2;
                            }
                            try {
                                com.vungle.ads.internal.util.t.b("AssetDownloader", "Downloader totalRead=" + j2 + " requiredBytes=" + longValue);
                                a2.p();
                            } catch (Exception e11) {
                                e = e11;
                                lVar2 = lVar;
                                eVar2 = eVar;
                                exc = e;
                                bufferedSource = source;
                                bufferedSink = buffer;
                                i = code;
                                boolean z2222222 = u.f12190a;
                                com.vungle.ads.internal.util.t.b("AssetDownloader", "Download exception for " + a2.h() + ": " + exc);
                                dVar.b(7);
                                c cVar2222222 = new c(i, exc, 1);
                                if ((response == null ? response.body() : null) != null && (body2 = response.body()) != null) {
                                    body2.close();
                                    Unit unit62 = Unit.INSTANCE;
                                }
                                if (call != null) {
                                    call.cancel();
                                    Unit unit8 = Unit.INSTANCE;
                                }
                                com.vungle.ads.internal.util.n.a(bufferedSink);
                                com.vungle.ads.internal.util.n.a(bufferedSource);
                                com.vungle.ads.internal.util.t.a("AssetDownloader", "download status: " + dVar.b());
                                cVar = cVar2222222;
                                b = dVar.b();
                                if (b == 7) {
                                    if (b != 3) {
                                    }
                                    return null;
                                }
                                return cVar;
                            }
                        }
                        i3 = contentLength > 0 ? (int) ((100 * j2) / contentLength) : i2;
                        while (dVar.a() + 1 <= Math.min(i3, 100)) {
                            dVar.b(1);
                            dVar.a(dVar.a() + 1);
                            if (dVar.a() >= 100) {
                                dVar.b(4);
                            }
                            eVar2 = eVar;
                            if (eVar2 != null) {
                                lVar2 = lVar;
                                try {
                                    eVar2.a(dVar, lVar2);
                                } catch (Exception e12) {
                                    e = e12;
                                    exc = e;
                                    bufferedSource = source;
                                    bufferedSink = buffer;
                                    i = code;
                                    boolean z22222222 = u.f12190a;
                                    com.vungle.ads.internal.util.t.b("AssetDownloader", "Download exception for " + a2.h() + ": " + exc);
                                    dVar.b(7);
                                    c cVar22222222 = new c(i, exc, 1);
                                    if ((response == null ? response.body() : null) != null) {
                                    }
                                    if (call != null) {
                                    }
                                    com.vungle.ads.internal.util.n.a(bufferedSink);
                                    com.vungle.ads.internal.util.n.a(bufferedSource);
                                    com.vungle.ads.internal.util.t.a("AssetDownloader", "download status: " + dVar.b());
                                    cVar = cVar22222222;
                                    b = dVar.b();
                                    if (b == 7) {
                                    }
                                    return cVar;
                                }
                            }
                        }
                        file2 = file;
                    } catch (Exception e13) {
                        e = e13;
                        lVar2 = lVar;
                        eVar2 = eVar;
                        file = file2;
                    }
                }
                lVar2 = lVar;
                eVar2 = eVar;
                file = file2;
                buffer.flush();
                if (dVar.b() == 1) {
                    dVar.b(4);
                    if (eVar2 != null) {
                        eVar2.a(dVar, lVar2);
                    }
                }
                if (response.body() != null && (body3 = response.body()) != null) {
                    body3.close();
                    Unit unit9 = Unit.INSTANCE;
                }
                call.cancel();
                Unit unit10 = Unit.INSTANCE;
                com.vungle.ads.internal.util.n.a(buffer);
                com.vungle.ads.internal.util.n.a(source);
                boolean z5 = u.f12190a;
                com.vungle.ads.internal.util.t.a("AssetDownloader", com.iab.omid.library.vungle.internal.l.a("download status: ").append(dVar.b()).toString());
                cVar = null;
            } catch (Exception e14) {
                e = e14;
                file = file2;
                lVar2 = lVar;
                eVar2 = eVar;
            }
        } catch (Exception e15) {
            file = file2;
            lVar2 = lVar;
            eVar2 = eVar;
            exc = e15;
            bufferedSource = source;
            i = code;
            bufferedSink = null;
        } catch (Throwable th7) {
            th = th7;
            bufferedSource = source;
            bufferedSink = null;
        }
        b = dVar.b();
        if (b == 7 || b == 0) {
            return cVar;
        }
        if (b != 3) {
            com.vungle.ads.internal.util.t.a("AssetDownloader", "On cancel " + lVar2);
            if (eVar2 != null) {
                eVar2.a(dVar, lVar2);
            }
        } else {
            com.vungle.ads.internal.util.t.a("AssetDownloader", "On success " + lVar2);
            if (eVar2 != null) {
                eVar2.a(file, lVar2);
            }
            int b2 = lVar.b();
            if (b2 > 0) {
                AnalyticsClient.INSTANCE.c(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, lVar.c(), "retryCount=" + b2 + " url=" + lVar.a().h());
            }
        }
        return null;
    }

    public static final void a(i this$0, l lVar, e eVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.d.remove(lVar);
        OutOfMemory outOfMemory = new OutOfMemory("Failed to execute download request: " + lVar.a().h());
        int i = b.f11897a;
        c cVar = new c(-1, outOfMemory, 4);
        if (eVar != null) {
            eVar.a(cVar, lVar);
        }
    }

    public final void a() {
        for (l lVar : this.d) {
            if (lVar != null && !lVar.e.get()) {
                lVar.e.set(true);
            }
        }
        this.d.clear();
    }

    public static ResponseBody a(Response response) {
        ResponseBody body = response.body();
        if (!StringsKt.equals("gzip", Response.header$default(response, HttpHeaders.CONTENT_ENCODING, null, 2, null), true) || body == null) {
            return body;
        }
        return new RealResponseBody(Response.header$default(response, "Content-Type", null, 2, null), -1L, Okio.buffer(new GzipSource(body.getSource())));
    }
}
