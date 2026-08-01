package com.vungle.ads.internal.load;

import com.vungle.ads.AssetRequestError;
import com.vungle.ads.PrivacyIconFallbackError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.k2;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes7.dex */
public final class c implements com.vungle.ads.internal.downloader.e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f11935a;
    public final /* synthetic */ i b;

    public c(i iVar) {
        this.b = iVar;
    }

    @Override // com.vungle.ads.internal.downloader.e
    public final void a(com.vungle.ads.internal.downloader.l downloadRequest) {
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        boolean z = u.f12190a;
        t.c("BaseAdLoader", com.iab.omid.library.vungle.internal.l.a("onStart called: ").append(downloadRequest.a().h()).toString());
        downloadRequest.f();
    }

    @Override // com.vungle.ads.internal.downloader.e
    public final void a(com.vungle.ads.internal.downloader.d progress, com.vungle.ads.internal.downloader.l downloadRequest) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        final com.vungle.ads.internal.model.b a2 = downloadRequest.a();
        Integer e = a2.e();
        boolean z = u.f12190a;
        t.a("BaseAdLoader", "Download progress: " + progress + " url: " + a2.h());
        if (this.f11935a || e == null || progress.a() < e.intValue()) {
            return;
        }
        this.f11935a = true;
        if (new IntRange(1, 99).contains(e.intValue())) {
            downloadRequest.h();
        }
        t.c("BaseAdLoader", "Download progress: hit chunk percentage=" + e + " for url: " + a2.h());
        if (a2.n()) {
            com.vungle.ads.internal.executor.j b = ((com.vungle.ads.internal.executor.d) this.b.g()).b();
            final i iVar = this.b;
            b.execute(new Runnable() { // from class: com.vungle.ads.internal.load.c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    c.a(i.this, a2);
                }
            });
        }
    }

    public static final void a(i this$0, com.vungle.ads.internal.model.b adAsset) {
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        AtomicBoolean atomicBoolean;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adAsset, "$adAsset");
        linkedHashSet = this$0.j;
        linkedHashSet.remove(adAsset.h());
        linkedHashSet2 = this$0.j;
        if (linkedHashSet2.isEmpty()) {
            atomicBoolean = this$0.r;
            if (atomicBoolean.get()) {
                i.h(this$0);
            } else {
                this$0.a();
                this$0.a(new AssetRequestError("Failed to download required assets."));
            }
        }
    }

    @Override // com.vungle.ads.internal.downloader.e
    public final void a(final com.vungle.ads.internal.downloader.c cVar, final com.vungle.ads.internal.downloader.l downloadRequest) {
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        boolean z = u.f12190a;
        t.b("BaseAdLoader", "onError called: " + cVar);
        com.vungle.ads.internal.executor.j b = ((com.vungle.ads.internal.executor.d) this.b.g()).b();
        final i iVar = this.b;
        b.execute(new Runnable() { // from class: com.vungle.ads.internal.load.c$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                c.a(com.vungle.ads.internal.downloader.l.this, iVar, this, cVar);
            }
        });
    }

    public static final void a(com.vungle.ads.internal.downloader.l downloadRequest, i this$0, c this$1, com.vungle.ads.internal.downloader.c cVar) {
        AtomicBoolean atomicBoolean;
        AtomicLong atomicLong;
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        AtomicBoolean atomicBoolean2;
        Intrinsics.checkNotNullParameter(downloadRequest, "$downloadRequest");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this$1, "this$1");
        com.vungle.ads.internal.model.b a2 = downloadRequest.a();
        if (a2.m()) {
            File a3 = com.vungle.ads.internal.downloader.j.a(this$0.f().getVmDir());
            if (a3 != null && a3.exists()) {
                this$1.a(a3, downloadRequest);
                return;
            }
            new PrivacyIconFallbackError("Failed to inject default privacy icon").setLogEntry$vungle_ads_release(this$0.e()).logErrorNoReturnValue$vungle_ads_release();
        }
        a2.a(com.vungle.ads.internal.model.a.DOWNLOAD_FAILED);
        atomicBoolean = this$0.q;
        atomicBoolean.set(false);
        if (a2.n()) {
            atomicBoolean2 = this$0.r;
            atomicBoolean2.set(false);
        }
        new AssetRequestError(com.iab.omid.library.vungle.internal.l.a("Failed to download assets ").append(a2.h()).append(". error: ").append(cVar).append(" errorType=").append(com.vungle.ads.internal.platform.e.a(cVar != null ? cVar.a() : null)).append(" proxyEnabled=").append(com.vungle.ads.internal.platform.e.e(this$0.d())).append(" privateDns=").append(com.vungle.ads.internal.platform.e.b(this$0.d())).append(" network=").append(com.vungle.ads.internal.platform.e.a(this$0.d())).toString()).setLogEntry$vungle_ads_release(this$0.e()).logErrorNoReturnValue$vungle_ads_release();
        if (a2.n()) {
            linkedHashSet = this$0.j;
            linkedHashSet.remove(downloadRequest.a().h());
            linkedHashSet2 = this$0.j;
            if (linkedHashSet2.isEmpty()) {
                this$0.a();
                this$0.a(new AssetRequestError("Error: Failed to download required assets."));
                return;
            }
        }
        atomicLong = this$0.i;
        if (atomicLong.decrementAndGet() <= 0) {
            this$0.a(new AssetRequestError("Error: Failed to download assets."));
        }
    }

    @Override // com.vungle.ads.internal.downloader.e
    public final void a(final File file, final com.vungle.ads.internal.downloader.l downloadRequest) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(downloadRequest, "downloadRequest");
        com.vungle.ads.internal.executor.j b = ((com.vungle.ads.internal.executor.d) this.b.g()).b();
        final i iVar = this.b;
        b.execute(new Runnable() { // from class: com.vungle.ads.internal.load.c$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                c.a(file, this, downloadRequest, iVar);
            }
        });
    }

    public static final void a(File file, c this$0, com.vungle.ads.internal.downloader.l downloadRequest, i this$1) {
        k2 k2Var;
        k2 k2Var2;
        AtomicLong atomicLong;
        AtomicBoolean atomicBoolean;
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        AtomicBoolean atomicBoolean2;
        AtomicBoolean atomicBoolean3;
        AtomicBoolean atomicBoolean4;
        k2 k2Var3;
        k2 k2Var4;
        Intrinsics.checkNotNullParameter(file, "$file");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(downloadRequest, "$downloadRequest");
        Intrinsics.checkNotNullParameter(this$1, "this$1");
        if (!file.exists()) {
            this$0.a(new com.vungle.ads.internal.downloader.c(-1, new IOException("Downloaded file not found!"), 3), downloadRequest);
            return;
        }
        com.vungle.ads.internal.model.b a2 = downloadRequest.a();
        a2.b(file.length());
        a2.a(com.vungle.ads.internal.model.a.DOWNLOAD_SUCCESS);
        Integer e = a2.e();
        if (e == null || e.intValue() == 0 || e.intValue() == 100) {
            downloadRequest.h();
        }
        if (a2.j()) {
            downloadRequest.i();
            k2Var3 = this$1.u;
            k2Var3.a(Long.valueOf(file.length()));
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            k2Var4 = this$1.u;
            analyticsClient.a(k2Var4, this$1.e(), a2.h());
        } else if (a2.l()) {
            k2Var = this$1.t;
            k2Var.a(Long.valueOf(file.length()));
            AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
            k2Var2 = this$1.t;
            analyticsClient2.a(k2Var2, this$1.e(), a2.h());
        }
        i0 c = this$1.c();
        if (c != null) {
            c.a(file, a2.a());
        }
        if (a2.j() && !i.a(this$1, a2, this$1.c())) {
            atomicBoolean3 = this$1.q;
            atomicBoolean3.set(false);
            if (a2.n()) {
                atomicBoolean4 = this$1.r;
                atomicBoolean4.set(false);
            }
        }
        if (a2.n()) {
            linkedHashSet = this$1.j;
            linkedHashSet.remove(a2.h());
            linkedHashSet2 = this$1.j;
            if (linkedHashSet2.isEmpty()) {
                atomicBoolean2 = this$1.r;
                if (atomicBoolean2.get()) {
                    i.h(this$1);
                } else {
                    this$1.a();
                    this$1.a(new AssetRequestError("Failed to download required assets."));
                    return;
                }
            }
        }
        atomicLong = this$1.i;
        if (atomicLong.decrementAndGet() <= 0) {
            atomicBoolean = this$1.q;
            if (atomicBoolean.get()) {
                i.a(this$1, this$1.b());
            } else {
                this$1.a(new AssetRequestError("Failed to download assets."));
            }
        }
    }
}
