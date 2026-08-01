package com.vungle.ads.internal.load;

import android.content.Context;
import android.webkit.URLUtil;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdPayloadError;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.InvalidAssetUrlError;
import com.vungle.ads.InvalidEventIdError;
import com.vungle.ads.InvalidTemplateURLError;
import com.vungle.ads.NativeAssetError;
import com.vungle.ads.OmSdkJsError;
import com.vungle.ads.PlacementMismatchError;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.k2;
import com.vungle.ads.internal.l2;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.model.v;
import com.vungle.ads.internal.model.w2;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.presenter.f0;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.q0;
import com.vungle.ads.internal.task.r;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes7.dex */
public abstract class i {
    public long A;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11941a;
    public final VungleApiClient b;
    public final com.vungle.ads.internal.executor.a c;
    public final com.vungle.ads.internal.omsdk.c d;
    public final com.vungle.ads.internal.downloader.n e;
    public final PathProvider f;
    public final b g;
    public final Lazy h;
    public final AtomicLong i;
    public final LinkedHashSet j;
    public a k;
    public final AtomicBoolean l;
    public AtomicBoolean m;
    public AtomicBoolean n;
    public final ArrayList o;
    public i0 p;
    public AtomicBoolean q;
    public AtomicBoolean r;
    public final l2 s;
    public k2 t;
    public k2 u;
    public l2 v;
    public l2 w;
    public l2 x;
    public l2 y;
    public s z;

    public i(Context context, VungleApiClient vungleApiClient, com.vungle.ads.internal.executor.d sdkExecutors, com.vungle.ads.internal.omsdk.c omInjector, com.vungle.ads.internal.downloader.n downloader, PathProvider pathProvider, b adRequest) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(vungleApiClient, "vungleApiClient");
        Intrinsics.checkNotNullParameter(sdkExecutors, "sdkExecutors");
        Intrinsics.checkNotNullParameter(omInjector, "omInjector");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        this.f11941a = context;
        this.b = vungleApiClient;
        this.c = sdkExecutors;
        this.d = omInjector;
        this.e = downloader;
        this.f = pathProvider;
        this.g = adRequest;
        this.h = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new h(context));
        this.i = new AtomicLong(0L);
        this.j = new LinkedHashSet();
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.n = new AtomicBoolean(false);
        this.o = new ArrayList();
        this.q = new AtomicBoolean(true);
        this.r = new AtomicBoolean(true);
        this.s = new l2(Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_RESPONSE_DURATION_MS);
        this.t = new k2(Sdk.SDKMetric.SDKMetricType.ASSET_FILE_SIZE);
        this.u = new k2(Sdk.SDKMetric.SDKMetricType.TEMPLATE_HTML_SIZE);
        this.v = new l2(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_DURATION_MS);
        this.w = new l2(Sdk.SDKMetric.SDKMetricType.AD_REQUIRED_DOWNLOAD_DURATION_MS);
        this.x = new l2(Sdk.SDKMetric.SDKMetricType.AD_OPTIONAL_DOWNLOAD_DURATION_MS);
        this.y = new l2(Sdk.SDKMetric.SDKMetricType.AD_PRELOAD_TO_READY_DURATION_MS);
    }

    public static final void i(i this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.s.e();
        this$0.k();
    }

    public final VungleApiClient h() {
        return this.b;
    }

    public abstract void i();

    public final void j() {
        i0 i0Var = this.p;
        if (i0Var == null || this.n.get() || !this.m.compareAndSet(false, true)) {
            return;
        }
        if (i0Var.H()) {
            this.y.e();
            String valueOf = String.valueOf(i0Var.p());
            boolean z = u.f12190a;
            t.c("BaseAdLoader", "start preloading");
            long currentTimeMillis = System.currentTimeMillis() - this.A;
            ReentrantLock reentrantLock = f0.f12088a;
            f0.a(this.f11941a, i0Var, this.g.c(), valueOf, i0Var.v(), new f(this, i0Var), Long.valueOf(currentTimeMillis));
        } else {
            i();
            a aVar = this.k;
            if (aVar != null) {
                aVar.onSuccess(i0Var);
            }
        }
        ((r) ((com.vungle.ads.internal.task.g) LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new g(this.f11941a)).getValue())).a(com.vungle.ads.internal.task.j.a());
    }

    public abstract void k();

    public static final void a(i iVar, b bVar) {
        iVar.getClass();
        boolean z = u.f12190a;
        t.a("BaseAdLoader", "All download completed " + bVar);
        i0 i0Var = iVar.p;
        if (i0Var != null) {
            i0Var.f = true;
        }
        iVar.j();
        iVar.v.d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.a(analyticsClient, iVar.v, iVar.z, 4);
        iVar.x.d();
        AnalyticsClient.a(analyticsClient, iVar.x, iVar.z, 4);
    }

    public static final void h(i iVar) {
        iVar.w.d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, iVar.w, iVar.z, 4);
        iVar.j();
    }

    public final b b() {
        return this.g;
    }

    public final i0 c() {
        return this.p;
    }

    public final Context d() {
        return this.f11941a;
    }

    public final s e() {
        return this.z;
    }

    public final PathProvider f() {
        return this.f;
    }

    public final com.vungle.ads.internal.executor.a g() {
        return this.c;
    }

    public static final boolean a(i iVar, com.vungle.ads.internal.model.b bVar, i0 i0Var) {
        iVar.getClass();
        if (i0Var == null || !bVar.i() || bVar.c.length() == 0) {
            return false;
        }
        File file = new File(bVar.c);
        if (!file.exists() || file.length() != bVar.h) {
            return false;
        }
        File b = iVar.f.b(i0Var.h());
        if (b != null && b.isDirectory()) {
            com.vungle.ads.internal.util.m mVar = com.vungle.ads.internal.util.n.f12186a;
            return true;
        }
        boolean z = u.f12190a;
        t.b("BaseAdLoader", "Unable to access Destination Directory");
        return false;
    }

    public final void a(s sVar) {
        this.z = sVar;
    }

    public final void a(com.vungle.ads.internal.s adLoaderCallback) {
        Intrinsics.checkNotNullParameter(adLoaderCallback, "adLoaderCallback");
        this.k = adLoaderCallback;
        this.A = System.currentTimeMillis();
        ((com.vungle.ads.internal.executor.d) this.c).b().execute(new Runnable() { // from class: com.vungle.ads.internal.load.i$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                i.i(i.this);
            }
        });
    }

    public final void a() {
        this.l.set(true);
        ((com.vungle.ads.internal.downloader.i) this.e).a();
    }

    public final void a(VungleError error) {
        boolean z;
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.m.get()) {
            return;
        }
        boolean z2 = true;
        if (this.n.compareAndSet(false, true)) {
            i0 i0Var = this.p;
            if (i0Var != null && i0Var.A()) {
                ArrayList arrayList = this.o;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((com.vungle.ads.internal.model.b) next).k()) {
                        arrayList2.add(next);
                    } else {
                        arrayList3.add(next);
                    }
                }
                Pair pair = new Pair(arrayList2, arrayList3);
                List list = (List) pair.component1();
                List list2 = (List) pair.component2();
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((com.vungle.ads.internal.model.b) it2.next()).i()) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        } else if (!((com.vungle.ads.internal.model.b) it3.next()).i()) {
                            z2 = false;
                            break;
                        }
                    }
                }
                if (z && z2) {
                    this.n.set(false);
                    j();
                    return;
                }
            }
            a aVar = this.k;
            if (aVar != null) {
                aVar.onFailure(error);
            }
        }
    }

    public final void a(i0 advertisement, k2 k2Var) {
        com.vungle.ads.internal.downloader.k kVar;
        com.vungle.ads.internal.model.i c;
        Integer f;
        List e;
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        this.p = advertisement;
        if (advertisement != null) {
            advertisement.E();
        }
        advertisement.a(this.z);
        s sVar = this.z;
        if (sVar != null) {
            sVar.d(advertisement.h());
        }
        s sVar2 = this.z;
        if (sVar2 != null) {
            sVar2.c(advertisement.n());
        }
        s sVar3 = this.z;
        if (sVar3 != null) {
            sVar3.b(advertisement.l());
        }
        s sVar4 = this.z;
        if (sVar4 != null) {
            sVar4.f(advertisement.t());
        }
        s sVar5 = this.z;
        if (sVar5 != null) {
            sVar5.h(advertisement.u());
        }
        s sVar6 = this.z;
        if (sVar6 != null) {
            sVar6.c(Boolean.valueOf(advertisement.B()));
        }
        s sVar7 = this.z;
        if (sVar7 != null) {
            sVar7.b(Boolean.valueOf(advertisement.b()));
        }
        s sVar8 = this.z;
        if (sVar8 != null) {
            sVar8.a(Boolean.valueOf(advertisement.y()));
        }
        s sVar9 = this.z;
        if (sVar9 != null) {
            sVar9.e(advertisement.o());
        }
        this.s.d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.s, this.z, 4);
        w2 f2 = advertisement.f();
        if (f2 != null) {
            ConfigManager.INSTANCE.a(this.f11941a, f2, q0.AD_RESPONSE, k2Var);
        }
        VungleError a2 = a(advertisement);
        if (a2 != null) {
            a(a2.setLogEntry$vungle_ads_release(this.z).logError$vungle_ads_release());
            return;
        }
        File b = this.f.b(advertisement.h());
        if (b != null && b.isDirectory() && b.exists()) {
            i0 i0Var = this.p;
            if (i0Var != null && i0Var.C()) {
                try {
                    this.d.b();
                    this.d.a(this.f.getVmDir());
                } catch (Exception e2) {
                    boolean z = u.f12190a;
                    t.b("BaseAdLoader", com.iab.omid.library.vungle.internal.l.a("Failed to inject OMSDK: ").append(e2.getMessage()).toString());
                    new OmSdkJsError(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED, com.iab.omid.library.vungle.internal.l.a("Failed to inject OMSDK: ").append(e2.getMessage()).toString()).setLogEntry$vungle_ads_release(this.z).logErrorNoReturnValue$vungle_ads_release();
                }
            }
            Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new e(this.f11941a));
            com.vungle.ads.internal.model.i c2 = advertisement.c();
            if (c2 != null && (e = c2.e()) != null) {
                Iterator it = e.iterator();
                while (it.hasNext()) {
                    ((com.vungle.ads.internal.network.r) lazy.getValue()).a(new com.vungle.ads.internal.network.p((String) it.next()).b("load_ad").a(this.z).a(), false);
                }
            }
            if (!this.o.isEmpty()) {
                this.o.clear();
            }
            this.o.addAll(advertisement.a(b));
            if (this.o.isEmpty()) {
                advertisement.F();
                this.v.e();
                this.v.d();
                AnalyticsClient.a(AnalyticsClient.INSTANCE, this.v, this.z, 4);
                j();
                return;
            }
            this.v.e();
            this.w.e();
            this.x.e();
            this.i.set(this.o.size());
            i0 i0Var2 = this.p;
            int coerceAtMost = RangesKt.coerceAtMost((i0Var2 == null || (c = i0Var2.c()) == null || (f = c.f()) == null) ? 0 : f.intValue(), 5);
            Iterator it2 = this.o.iterator();
            while (it2.hasNext()) {
                com.vungle.ads.internal.model.b bVar = (com.vungle.ads.internal.model.b) it2.next();
                if (bVar.d) {
                    kVar = com.vungle.ads.internal.downloader.k.CRITICAL;
                } else {
                    kVar = com.vungle.ads.internal.downloader.k.HIGHEST;
                }
                com.vungle.ads.internal.downloader.l lVar = new com.vungle.ads.internal.downloader.l(kVar, bVar, this.z, coerceAtMost);
                if (bVar.n()) {
                    this.j.add(bVar.h());
                }
                if (bVar.j()) {
                    lVar.g();
                    c cVar = new c(this);
                    String h = bVar.h();
                    com.vungle.ads.internal.downloader.t.a((com.vungle.ads.internal.downloader.t) this.h.getValue(), h, bVar.c(), new d(this, h, cVar, lVar));
                } else {
                    ((com.vungle.ads.internal.downloader.i) this.e).a(lVar, new c(this));
                }
            }
            return;
        }
        a(new AssetWriteError("Invalid directory. " + b).setLogEntry$vungle_ads_release(this.z).logError$vungle_ads_release());
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VungleError a(i0 adPayload) {
        VungleError invalidTemplateURLError;
        com.vungle.ads.internal.model.o oVar;
        com.vungle.ads.internal.model.o oVar2;
        Integer i;
        Intrinsics.checkNotNullParameter(adPayload, "adPayload");
        com.vungle.ads.internal.model.i c = adPayload.c();
        if (c != null && (i = c.i()) != null) {
            i.intValue();
            com.vungle.ads.internal.model.i c2 = adPayload.c();
            Integer b = c2 != null ? c2.b() : null;
            com.vungle.ads.internal.model.i c3 = adPayload.c();
            Integer i2 = c3 != null ? c3.i() : null;
            com.vungle.ads.internal.model.i c4 = adPayload.c();
            String str = "Response error: " + i2 + ", Request failed with error: " + b + ", " + (c4 != null ? c4.d() : null);
            if ((b != null && b.intValue() == 10001) || ((b != null && b.intValue() == 10002) || ((b != null && b.intValue() == 20001) || ((b != null && b.intValue() == 30001) || (b != null && b.intValue() == 30002))))) {
                Sdk.SDKError.Reason forNumber = Sdk.SDKError.Reason.forNumber(b.intValue());
                Intrinsics.checkNotNullExpressionValue(forNumber, "forNumber(errorCode)");
                return new AdPayloadError(forNumber, str);
            }
            return new AdPayloadError(Sdk.SDKError.Reason.PLACEMENT_SLEEP, str);
        }
        String b2 = this.g.c().b();
        i0 i0Var = this.p;
        if (!Intrinsics.areEqual(b2, i0Var != null ? i0Var.D() : null)) {
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Waterfall request and responses placement don't match ");
            i0 i0Var2 = this.p;
            return new PlacementMismatchError(a2.append(i0Var2 != null ? i0Var2.D() : null).append('.').toString());
        }
        com.vungle.ads.internal.model.i k = adPayload.k();
        v vVar = k != null ? k.u : null;
        if (vVar == null) {
            invalidTemplateURLError = new AdResponseEmptyError("Missing template settings");
        } else {
            Map map = vVar.b;
            if (adPayload.A()) {
                if (((map == null || (oVar2 = (com.vungle.ads.internal.model.o) map.get("MAIN_IMAGE")) == null) ? null : oVar2.f11997a) == null) {
                    if (((map == null || (oVar = (com.vungle.ads.internal.model.o) map.get("MAIN_VIDEO")) == null) ? null : oVar.f11997a) == null) {
                        invalidTemplateURLError = new NativeAssetError("Unable to load null main asset.");
                    }
                }
                com.vungle.ads.internal.model.o oVar3 = (com.vungle.ads.internal.model.o) map.get("VUNGLE_PRIVACY_ICON_URL");
                if ((oVar3 != null ? oVar3.f11997a : null) == null) {
                    invalidTemplateURLError = new NativeAssetError("Unable to load null privacy image.");
                }
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str2 = ((com.vungle.ads.internal.model.o) entry.getValue()).f11997a;
                        if (str2 == null || str2.length() == 0) {
                            invalidTemplateURLError = new InvalidAssetUrlError(com.iab.omid.library.vungle.internal.l.a("None asset URL for ").append((String) entry.getKey()).toString());
                            break;
                        }
                        if (str2 == null || str2.length() == 0 || (!URLUtil.isHttpsUrl(str2) && !URLUtil.isHttpUrl(str2))) {
                            invalidTemplateURLError = new InvalidAssetUrlError(com.iab.omid.library.vungle.d.a("Invalid asset URL ", str2));
                            break;
                        }
                    }
                }
                invalidTemplateURLError = null;
            } else {
                com.vungle.ads.internal.model.i k2 = adPayload.k();
                String str3 = k2 != null ? k2.n : null;
                if (str3 == null || str3.length() == 0) {
                    invalidTemplateURLError = new InvalidTemplateURLError("Failed to prepare null vmURL for downloading.");
                } else {
                    if (str3 == null || str3.length() == 0 || (!URLUtil.isHttpsUrl(str3) && !URLUtil.isHttpUrl(str3))) {
                        invalidTemplateURLError = new InvalidTemplateURLError(com.iab.omid.library.vungle.d.a("Failed to load vm url: ", str3));
                    }
                    if (map != null) {
                    }
                    invalidTemplateURLError = null;
                }
            }
        }
        if (invalidTemplateURLError != null) {
            return invalidTemplateURLError;
        }
        if (adPayload.x()) {
            StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("The ad markup has expired for playback. Ad expiry: ");
            com.vungle.ads.internal.model.i c5 = adPayload.c();
            return new AdExpiredError(a3.append(c5 != null ? c5.c() : null).append(", device: ").append(System.currentTimeMillis()).toString());
        }
        String h = adPayload.h();
        if (h == null || h.length() == 0) {
            return new InvalidEventIdError("Event id is invalid.");
        }
        return null;
    }
}
