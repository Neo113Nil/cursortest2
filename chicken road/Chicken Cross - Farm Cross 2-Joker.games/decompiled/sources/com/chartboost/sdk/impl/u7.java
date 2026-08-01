package com.chartboost.sdk.impl;

import android.net.Uri;
import com.chartboost.sdk.impl.ok;
import com.chartboost.sdk.impl.y3;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.video.repository.exoplayer.VideoRepositoryDownloadService;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.Download;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class u7 implements s7, DownloadManager.Listener, y3.b {

    /* renamed from: a, reason: collision with root package name */
    public final t7 f5027a;
    public DownloadManager b;
    public DataSource.Factory c;
    public x7 d;
    public j8 e;
    public volatile List f;
    public volatile Map g;

    public u7(t7 dependencies) {
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        this.f5027a = dependencies;
        this.f = CollectionsKt.emptyList();
        this.g = MapsKt.emptyMap();
    }

    @Override // com.chartboost.sdk.impl.s7
    public void a(ok.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f = CollectionsKt.plus((Collection<? extends ok.a>) this.f, listener);
    }

    @Override // com.chartboost.sdk.impl.s7
    public void b() {
        a(bj.a(d()));
    }

    @Override // com.chartboost.sdk.impl.s7
    public boolean c(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        t6 a2 = a(id);
        if (a2 != null) {
            return a2.d() == 3 || a2.d() == 2;
        }
        return false;
    }

    @Override // com.chartboost.sdk.impl.s7
    public DownloadManager d() {
        if (this.b == null) {
            DatabaseProvider databaseProvider = (DatabaseProvider) this.f5027a.d().invoke(this.f5027a.c());
            this.d = (x7) this.f5027a.g().invoke(this.f5027a.c());
            Function4 b = this.f5027a.b();
            x7 x7Var = this.d;
            if (x7Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fileCaching");
                x7Var = null;
            }
            Cache cache = (Cache) b.invoke(x7Var, this.f5027a.j(), databaseProvider, this);
            this.c = (DataSource.Factory) this.f5027a.a().invoke(cache, this.f5027a.h());
            Function1 f = this.f5027a.f();
            x7 x7Var2 = this.d;
            if (x7Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fileCaching");
                x7Var2 = null;
            }
            this.e = (j8) f.invoke(x7Var2);
            this.b = (DownloadManager) this.f5027a.e().invoke(this.f5027a.c(), databaseProvider, cache, this.f5027a.h(), this);
        }
        DownloadManager downloadManager = this.b;
        if (downloadManager != null) {
            return downloadManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("downloadManager");
        return null;
    }

    public final void e(t6 t6Var) {
        try {
            DownloadService.sendRemoveDownload(this.f5027a.c(), VideoRepositoryDownloadService.class, t6Var.b(), false);
            j8 j8Var = this.e;
            if (j8Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fakePrecacheFilesManager");
                j8Var = null;
            }
            j8Var.d(t6Var);
        } catch (Exception e) {
            mb.b("Error sending remove download", e);
        }
    }

    @Override // com.google.android.exoplayer2.offline.DownloadManager.Listener
    public void onDownloadChanged(DownloadManager downloadManager, Download download, Exception exc) {
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(download, "download");
        j8 j8Var = null;
        mb.a("onDownloadChanged() - state " + u6.a(download.state) + ", finalException " + exc, (Throwable) null, 2, (Object) null);
        int i = download.state;
        if (i == 0 || i == 1) {
            j8 j8Var2 = this.e;
            if (j8Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fakePrecacheFilesManager");
            } else {
                j8Var = j8Var2;
            }
            j8Var.c(u6.a(download));
            return;
        }
        if (i == 2) {
            c(u6.a(download));
            return;
        }
        if (i == 3) {
            b(u6.a(download));
        } else if (i == 4) {
            a(u6.a(download), exc);
        } else {
            if (i != 5) {
                return;
            }
            d(u6.a(download));
        }
    }

    public final void a(int i, String str, Function1 function1) {
        for (ok.a aVar : this.f) {
            Integer num = (Integer) this.g.get(str);
            if (num == null || num.intValue() != i) {
                this.g = MapsKt.plus(this.g, TuplesKt.to(str, Integer.valueOf(i)));
                function1.invoke(aVar);
            }
        }
    }

    public final void c(wj wjVar) {
        for (t6 t6Var : bj.a(d())) {
            if (!Intrinsics.areEqual(t6Var.b(), wjVar.d())) {
                a(t6Var, s6.g);
            }
        }
    }

    public final void b(wj wjVar) {
        this.g = MapsKt.minus((Map<? extends String, ? extends V>) this.g, wjVar.g());
    }

    public final void b(final t6 t6Var) {
        mb.a("notifyDownloadCompleted() - download " + t6Var + ", listeners: " + this.f, (Throwable) null, 2, (Object) null);
        jg.a("Video downloaded success " + t6Var.f());
        a(3, t6Var.f(), new Function1() { // from class: com.chartboost.sdk.impl.u7$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u7.a(t6.this, (ok.a) obj);
            }
        });
    }

    public static final Unit b(t6 t6Var, ok.a forEachListener) {
        Intrinsics.checkNotNullParameter(forEachListener, "$this$forEachListener");
        forEachListener.a(t6Var.f(), t6Var.b(), 0L, null);
        return Unit.INSTANCE;
    }

    @Override // com.chartboost.sdk.impl.y3.b
    public void b(String url) {
        Object obj;
        Intrinsics.checkNotNullParameter(url, "url");
        Iterator it = bj.a(d()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((t6) obj).f(), url)) {
                    break;
                }
            }
        }
        t6 t6Var = (t6) obj;
        if (t6Var != null) {
            e(t6Var);
        }
    }

    public final void b(wj wjVar, s6 s6Var) {
        mb.a("VideoAsset.addDownload() - videoAsset " + wjVar + ", stopReason " + s6Var, (Throwable) null, 2, (Object) null);
        if (StringsKt.isBlank(wjVar.g())) {
            return;
        }
        try {
            DownloadService.sendAddDownload(this.f5027a.c(), VideoRepositoryDownloadService.class, new DownloadRequest.Builder(wjVar.d(), Uri.parse(wjVar.g())).build(), s6Var.b(), false);
        } catch (Exception e) {
            mb.b("Error sending add download", e);
        }
    }

    public /* synthetic */ u7(t7 t7Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new t7(null, null, null, null, null, null, null, null, null, null, 1023, null) : t7Var);
    }

    @Override // com.chartboost.sdk.impl.s7
    public float d(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        t6 a2 = a(id);
        return (a2 != null ? a2.c() : 0.0f) / 100.0f;
    }

    public final void d(t6 t6Var) {
        j8 j8Var = null;
        mb.a("downloadRemoved() - download " + t6Var + ", listeners: " + this.f, (Throwable) null, 2, (Object) null);
        j8 j8Var2 = this.e;
        if (j8Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fakePrecacheFilesManager");
        } else {
            j8Var = j8Var2;
        }
        j8Var.d(t6Var);
        this.g = MapsKt.minus((Map<? extends String, ? extends V>) this.g, t6Var.f());
    }

    public final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e((t6) it.next());
        }
    }

    @Override // com.chartboost.sdk.impl.s7
    public DataSource.Factory c() {
        DataSource.Factory factory = this.c;
        if (factory != null) {
            return factory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cacheDataSourceFactory");
        return null;
    }

    public final void c(final t6 t6Var) {
        j8 j8Var = null;
        mb.a("notifyTempFileIsReady() - download " + t6Var + ", listeners: " + this.f, (Throwable) null, 2, (Object) null);
        jg.a("Start downloading " + t6Var.f());
        j8 j8Var2 = this.e;
        if (j8Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fakePrecacheFilesManager");
        } else {
            j8Var = j8Var2;
        }
        j8Var.e(t6Var);
        a(2, t6Var.f(), new Function1() { // from class: com.chartboost.sdk.impl.u7$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u7.b(t6.this, (ok.a) obj);
            }
        });
    }

    @Override // com.chartboost.sdk.impl.s7
    public synchronized void a() {
        mb.a("initialize()", (Throwable) null, 2, (Object) null);
        this.f5027a.i().invoke();
        d();
    }

    @Override // com.chartboost.sdk.impl.s7
    public void a(wj asset, s6 stopReason) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(stopReason, "stopReason");
        mb.a("addDownload() - asset: " + asset + ", stopReason " + stopReason, (Throwable) null, 2, (Object) null);
        b(asset, stopReason);
    }

    @Override // com.chartboost.sdk.impl.s7
    public void a(wj asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        mb.a("startDownload() - asset: " + asset, (Throwable) null, 2, (Object) null);
        b(asset);
        c(asset);
        a(this, asset, null, 1, null);
    }

    @Override // com.chartboost.sdk.impl.s7
    public t6 a(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return bj.a(d(), id);
    }

    @Override // com.chartboost.sdk.impl.s7
    public void a(s6 currentDownloadStopReason) {
        t6 a2;
        Intrinsics.checkNotNullParameter(currentDownloadStopReason, "currentDownloadStopReason");
        List<Download> currentDownloads = d().getCurrentDownloads();
        Intrinsics.checkNotNullExpressionValue(currentDownloads, "getCurrentDownloads(...)");
        Download download = (Download) CollectionsKt.firstOrNull((List) currentDownloads);
        if (download == null || (a2 = u6.a(download)) == null) {
            return;
        }
        a(a2, currentDownloadStopReason);
    }

    public final void a(final t6 t6Var, Exception exc) {
        final CBError a2 = a(exc);
        jg.a("Video downloaded failed " + t6Var.f() + " with error " + a2.getErrorDesc());
        a(4, t6Var.f(), new Function1() { // from class: com.chartboost.sdk.impl.u7$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return u7.a(t6.this, a2, (ok.a) obj);
            }
        });
    }

    public static final Unit a(t6 t6Var, CBError cBError, ok.a forEachListener) {
        Intrinsics.checkNotNullParameter(forEachListener, "$this$forEachListener");
        forEachListener.a(t6Var.f(), t6Var.b(), cBError);
        return Unit.INSTANCE;
    }

    public final CBError a(Exception exc) {
        if (exc instanceof IOException) {
            return new CBError(CBError.Internal.NETWORK_FAILURE, n7.a(exc));
        }
        return new CBError(CBError.Internal.MISCELLANEOUS, n7.a(exc));
    }

    public static final Unit a(t6 t6Var, ok.a forEachListener) {
        Intrinsics.checkNotNullParameter(forEachListener, "$this$forEachListener");
        forEachListener.a(t6Var.f(), t6Var.b());
        return Unit.INSTANCE;
    }

    public final void a(t6 t6Var, s6 s6Var) {
        mb.a("Download.sendStopReason() - download " + t6Var + ", stopReason " + s6Var, (Throwable) null, 2, (Object) null);
        try {
            DownloadService.sendSetStopReason(this.f5027a.c(), VideoRepositoryDownloadService.class, t6Var.b(), s6Var.b(), false);
        } catch (Exception e) {
            mb.b("Error sending stop reason", e);
        }
    }

    public static /* synthetic */ void a(u7 u7Var, wj wjVar, s6 s6Var, int i, Object obj) {
        if ((i & 1) != 0) {
            s6Var = s6.d;
        }
        u7Var.b(wjVar, s6Var);
    }

    public final boolean a(t6 t6Var) {
        return this.f5027a.j().a(t6Var.e());
    }

    public final List a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (a((t6) obj)) {
                arrayList.add(obj);
            }
        }
        b(arrayList);
        return list;
    }
}
