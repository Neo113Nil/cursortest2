package com.vungle.ads.internal.downloader;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.u;
import kotlinx.io.files.FileSystemKt;

/* loaded from: classes7.dex */
public final class g extends com.vungle.ads.internal.task.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f11901a;
    public final /* synthetic */ l b;
    public final /* synthetic */ e c;

    public g(i iVar, l lVar, e eVar) {
        this.f11901a = iVar;
        this.b = lVar;
        this.c = eVar;
    }

    @Override // com.vungle.ads.internal.task.i
    public final int a() {
        return this.b.f11905a.f11904a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f11901a;
        l lVar = this.b;
        e eVar = this.c;
        if (eVar != null) {
            iVar.getClass();
            eVar.a(lVar);
        }
        c b = iVar.b(lVar, eVar);
        while (true) {
            if (b != null) {
                if (!lVar.e.get()) {
                    Integer num = lVar.b.e;
                    if (num != null && num.intValue() < 100) {
                        boolean z = u.f12190a;
                        com.vungle.ads.internal.util.t.a("AssetDownloader", "Partial download asset (percentage=" + num + "), not retrying");
                        break;
                    }
                    if (lVar.f.get() >= lVar.d) {
                        boolean z2 = u.f12190a;
                        com.vungle.ads.internal.util.t.a("AssetDownloader", com.iab.omid.library.vungle.internal.l.a("Max retry attempts reached (").append(lVar.d).append(')').toString());
                        break;
                    } else if (!a.a(b)) {
                        boolean z3 = u.f12190a;
                        com.vungle.ads.internal.util.t.a("AssetDownloader", com.iab.omid.library.vungle.internal.l.a("Error reason ").append(b.c).append(" is not retryable").toString());
                        break;
                    } else {
                        lVar.f.incrementAndGet();
                        lVar.a("Error: " + b.b.getMessage() + ", Code: " + b.f11898a + ", Reason: " + b.c);
                        boolean z4 = u.f12190a;
                        com.vungle.ads.internal.util.t.c("AssetDownloader", com.iab.omid.library.vungle.internal.l.a("Download failed, retrying immediately. Attempt ").append(lVar.f.get()).append(FileSystemKt.UnixPathSeparator).append(lVar.d).append(". URL: ").append(lVar.b.b).append(", Error: ").append(b.b.getMessage()).toString());
                        b = iVar.b(lVar, eVar);
                    }
                } else {
                    boolean z5 = u.f12190a;
                    com.vungle.ads.internal.util.t.a("AssetDownloader", "Download cancelled, not retrying");
                    break;
                }
            } else {
                break;
            }
        }
        if (b != null) {
            boolean z6 = u.f12190a;
            com.vungle.ads.internal.util.t.b("AssetDownloader", com.iab.omid.library.vungle.internal.l.a("Download failed after ").append(lVar.f.get() + 1).append(" attempts. URL: ").append(lVar.b.b).append(". Retry history: ").append(lVar.d()).toString());
            if (lVar.f.get() > 0) {
                AnalyticsClient.INSTANCE.c(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 2L, lVar.c, com.iab.omid.library.vungle.internal.l.a("retryCount=").append(lVar.f.get()).append(" url=").append(lVar.b.b).toString());
            }
            if (eVar != null) {
                eVar.a(b, lVar);
            }
        }
        iVar.d.remove(lVar);
    }
}
