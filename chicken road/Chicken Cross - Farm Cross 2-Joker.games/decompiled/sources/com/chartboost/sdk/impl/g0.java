package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Model.EndpointConfig;
import com.chartboost.sdk.tracking.TrackAd;
import com.chartboost.sdk.tracking.g;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g0 implements i0, w1, i7 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f4773a;
    public final k8 b;
    public final f3 c;
    public final lk d;
    public final a2 e;
    public final w f;
    public final le g;
    public final Mediation h;
    public final i7 i;
    public final AtomicReference j;
    public p1 k;
    public h0 l;
    public e0 m;
    public final AtomicBoolean n;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4774a;

        static {
            int[] iArr = new int[x1.values().length];
            try {
                iArr[x1.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x1.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x1.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4774a = iArr;
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function2 {
        public b(Object obj) {
            super(2, obj, g0.class, "loadOpenRTBAd", "loadOpenRTBAd(Lcom/chartboost/sdk/internal/AdUnitManager/data/AppRequest;Lcom/chartboost/sdk/internal/AdUnitManager/loaders/LoadParams;)V", 0);
        }

        public final void a(p1 p0, hb p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((g0) this.receiver).c(p0, p1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p1) obj, (hb) obj2);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class c extends FunctionReferenceImpl implements Function2 {
        public c(Object obj) {
            super(2, obj, g0.class, "loadAdGet", "loadAdGet(Lcom/chartboost/sdk/internal/AdUnitManager/data/AppRequest;Lcom/chartboost/sdk/internal/AdUnitManager/loaders/LoadParams;)V", 0);
        }

        public final void a(p1 p0, hb p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((g0) this.receiver).a(p0, p1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p1) obj, (hb) obj2);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class d extends FunctionReferenceImpl implements Function2 {
        public d(Object obj) {
            super(2, obj, g0.class, "loadNrpAd", "loadNrpAd(Lcom/chartboost/sdk/internal/AdUnitManager/data/AppRequest;Lcom/chartboost/sdk/internal/AdUnitManager/loaders/LoadParams;)V", 0);
        }

        public final void a(p1 p0, hb p1) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((g0) this.receiver).b(p0, p1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p1) obj, (hb) obj2);
            return Unit.INSTANCE;
        }
    }

    public g0(c0 adType, k8 fileCache, f3 reachability, lk videoRepository, a2 assetsDownloader, w adLoader, le ortbLoader, Mediation mediation, i7 eventTracker, AtomicReference atomicReference) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(assetsDownloader, "assetsDownloader");
        Intrinsics.checkNotNullParameter(adLoader, "adLoader");
        Intrinsics.checkNotNullParameter(ortbLoader, "ortbLoader");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f4773a = adType;
        this.b = fileCache;
        this.c = reachability;
        this.d = videoRepository;
        this.e = assetsDownloader;
        this.f = adLoader;
        this.g = ortbLoader;
        this.h = mediation;
        this.i = eventTracker;
        this.j = atomicReference;
        this.n = new AtomicBoolean(false);
    }

    public static final Unit d(p1 p1Var, g0 g0Var, ib fold) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        p1Var.a(fold.a());
        g0Var.e(p1Var);
        g0Var.b(fold, p1Var);
        g0Var.a(p1Var, g.a.e);
        return Unit.INSTANCE;
    }

    @Override // com.chartboost.sdk.impl.h7
    public void clear(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.i.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f clearFromStorage(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.i.clearFromStorage(fVar);
    }

    public final void e(p1 p1Var) {
        String str;
        String B;
        d0 a2 = p1Var.a();
        if (a2 == null || !a2.D()) {
            return;
        }
        lk lkVar = this.d;
        d0 a3 = p1Var.a();
        String str2 = "";
        if (a3 == null || (str = a3.C()) == null) {
            str = "";
        }
        d0 a4 = p1Var.a();
        if (a4 != null && (B = a4.B()) != null) {
            str2 = B;
        }
        lkVar.a(str, str2, false, null);
    }

    public final void f(p1 p1Var) {
        a(p1Var);
        p1Var.a((d0) null);
        this.n.set(false);
    }

    public final void g(p1 p1Var) {
        EndpointConfig a2;
        e0 e0Var = this.m;
        Integer valueOf = e0Var != null ? Integer.valueOf(e0Var.a()) : null;
        e0 e0Var2 = this.m;
        hb hbVar = new hb(p1Var, true, valueOf, e0Var2 != null ? Integer.valueOf(e0Var2.c()) : null);
        AtomicReference atomicReference = this.j;
        com.chartboost.sdk.internal.Model.a aVar = atomicReference != null ? (com.chartboost.sdk.internal.Model.a) atomicReference.get() : null;
        if (aVar == null) {
            mb.e("SDK configuration is null for location: " + p1Var.d() + ". Falling back to legacy ad request.", null, 2, null);
        }
        boolean j = aVar != null ? aVar.j() : false;
        if (aVar == null || (a2 = aVar.c()) == null) {
            a2 = EndpointConfig.INSTANCE.a();
        }
        Pair a3 = k0.f4832a.a(p1Var, hbVar, new b(this), new c(this), new d(this), this.f4773a, j, a2);
        ((Function2) a3.component1()).invoke(p1Var, (hb) a3.component2());
    }

    public final void h(p1 p1Var) {
        try {
            g(p1Var);
        } catch (Exception e) {
            mb.b("sendAdGetRequest", e);
            a(p1Var, new CBError(CBError.Internal.MISCELLANEOUS, "error sending ad-get request"));
        }
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f persist(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.i.persist(fVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public fi refresh(fi fiVar) {
        Intrinsics.checkNotNullParameter(fiVar, "<this>");
        return this.i.refresh(fiVar);
    }

    @Override // com.chartboost.sdk.impl.i7
    public TrackAd store(TrackAd trackAd) {
        Intrinsics.checkNotNullParameter(trackAd, "<this>");
        return this.i.store(trackAd);
    }

    @Override // com.chartboost.sdk.impl.i7
    public com.chartboost.sdk.tracking.f track(com.chartboost.sdk.tracking.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return this.i.track(fVar);
    }

    public final p1 a() {
        return this.k;
    }

    public final void b() {
        if (this.n.get()) {
            return;
        }
        p1 p1Var = this.k;
        if (p1Var != null) {
            a(p1Var);
            p1Var.a((d0) null);
        }
        this.k = null;
    }

    public final void c(final p1 p1Var, hb hbVar) {
        this.g.a(hbVar, new Function1() { // from class: com.chartboost.sdk.impl.g0$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.c(p1.this, this, (ib) obj);
            }
        });
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: clearFromStorage */
    public void mo4755clearFromStorage(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.i.mo4755clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: persist */
    public void mo4756persist(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.i.mo4756persist(event);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: refresh */
    public void mo4757refresh(fi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.i.mo4757refresh(config);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: store */
    public void mo4758store(TrackAd ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.i.mo4758store(ad);
    }

    @Override // com.chartboost.sdk.impl.h7
    /* renamed from: track */
    public void mo4759track(com.chartboost.sdk.tracking.f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.i.mo4759track(event);
    }

    public static /* synthetic */ void a(g0 g0Var, String str, h0 h0Var, String str2, e0 e0Var, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            e0Var = null;
        }
        g0Var.a(str, h0Var, str2, e0Var);
    }

    public static final Unit c(final p1 p1Var, final g0 g0Var, ib loadAd) {
        Intrinsics.checkNotNullParameter(loadAd, "$this$loadAd");
        y.a(loadAd, new Function1() { // from class: com.chartboost.sdk.impl.g0$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.d(p1.this, g0Var, (ib) obj);
            }
        }, new Function2() { // from class: com.chartboost.sdk.impl.g0$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g0.c(g0.this, p1Var, (ib) obj, (CBError) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v0 ??, still in use, count: 2, list:
          (r14v0 ?? I:com.chartboost.sdk.impl.p1) from 0x0063: INVOKE (r14v0 ?? I:com.chartboost.sdk.impl.p1), (r19v0 ?? I:com.chartboost.sdk.impl.e0) VIRTUAL call: com.chartboost.sdk.impl.p1.a(com.chartboost.sdk.impl.e0):void A[MD:(com.chartboost.sdk.impl.e0):void (m)] (LINE:33)
          (r14v0 ?? I:com.chartboost.sdk.impl.p1) from 0x0066: IPUT (r14v0 ?? I:com.chartboost.sdk.impl.p1), (r15v0 'this' ?? I:com.chartboost.sdk.impl.g0 A[IMMUTABLE_TYPE, THIS]) (LINE:34) com.chartboost.sdk.impl.g0.k com.chartboost.sdk.impl.p1
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v0 ??, still in use, count: 2, list:
          (r14v0 ?? I:com.chartboost.sdk.impl.p1) from 0x0063: INVOKE (r14v0 ?? I:com.chartboost.sdk.impl.p1), (r19v0 ?? I:com.chartboost.sdk.impl.e0) VIRTUAL call: com.chartboost.sdk.impl.p1.a(com.chartboost.sdk.impl.e0):void A[MD:(com.chartboost.sdk.impl.e0):void (m)] (LINE:33)
          (r14v0 ?? I:com.chartboost.sdk.impl.p1) from 0x0066: IPUT (r14v0 ?? I:com.chartboost.sdk.impl.p1), (r15v0 'this' ?? I:com.chartboost.sdk.impl.g0 A[IMMUTABLE_TYPE, THIS]) (LINE:34) com.chartboost.sdk.impl.g0.k com.chartboost.sdk.impl.p1
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public final void d(p1 p1Var) {
        b(p1Var, CBError.Impression.ASSETS_DOWNLOAD_FAILURE);
        f(p1Var);
    }

    public static final Unit b(g0 g0Var, p1 p1Var, ib fold) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        g0Var.b(fold, p1Var);
        g0Var.b(p1Var);
        return Unit.INSTANCE;
    }

    public final void b(final p1 p1Var, hb hbVar) {
        this.f.a(hbVar, new Function1() { // from class: com.chartboost.sdk.impl.g0$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.a(p1.this, this, (ib) obj);
            }
        });
    }

    public static final Unit b(p1 p1Var, g0 g0Var, ib fold) {
        String c2;
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        p1Var.a(fold.a());
        d0 a2 = fold.a();
        if (a2 != null && (c2 = a2.c()) != null) {
            p1Var.a(c2);
            g0Var.a(c2, g.a.e);
        } else {
            mb.e("NRP waterfall response missing ADM for location " + p1Var.d(), null, 2, null);
            g0Var.a(p1Var, new CBError(CBError.Internal.MISCELLANEOUS, "NRP waterfall response missing ADM"));
        }
        return Unit.INSTANCE;
    }

    public static final Unit c(g0 g0Var, p1 p1Var, ib fold, CBError it) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(it, "it");
        g0Var.a(fold, p1Var);
        return Unit.INSTANCE;
    }

    public final String c(p1 p1Var) {
        d0 a2 = p1Var.a();
        if (a2 != null) {
            return a2.m();
        }
        return null;
    }

    public static final Unit b(g0 g0Var, p1 p1Var, ib fold, CBError error) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(error, "error");
        g0Var.a(error, p1Var.d());
        g0Var.a(fold, p1Var);
        return Unit.INSTANCE;
    }

    public final void b(ib ibVar, p1 p1Var) {
        a(p1Var.d(), ibVar.a());
        p1Var.a(ibVar.a());
    }

    public final void b(p1 p1Var) {
        this.e.a(p1Var, this.f4773a.b(), this, this);
    }

    public final void b(p1 p1Var, CBError.Impression impression) {
        this.n.set(false);
        a(p1Var, impression);
        if (impression == CBError.Impression.NO_AD_FOUND) {
            return;
        }
        String b2 = this.f4773a.b();
        d0 a2 = p1Var.a();
        mb.b("reportError: adTypeTraits: " + b2 + " reason: cache  format: web error: " + impression + " adId: " + (a2 != null ? a2.a() : null) + " appRequest.location: " + p1Var.d(), (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.w1
    public void a(p1 request, x1 resultAsset) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(resultAsset, "resultAsset");
        int i = a.f4774a[resultAsset.ordinal()];
        if (i == 1) {
            d(request);
        } else if (i == 2) {
            mb.a("onAssetDownloaded: Ready to show", (Throwable) null, 2, (Object) null);
        } else {
            if (i == 3) {
                mb.a("onAssetDownloaded: Success", (Throwable) null, 2, (Object) null);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.chartboost.sdk.impl.i0
    public void a(p1 appRequest, com.chartboost.sdk.tracking.g trackingEventName) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(trackingEventName, "trackingEventName");
        h0 h0Var = this.l;
        if (h0Var != null) {
            h0Var.b(c(appRequest), trackingEventName);
        }
        this.n.set(false);
    }

    public final void a(String bidResponse, com.chartboost.sdk.tracking.g trackingEventName) {
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        Intrinsics.checkNotNullParameter(trackingEventName, "trackingEventName");
        h0 h0Var = this.l;
        if (h0Var != null) {
            h0Var.a(bidResponse, trackingEventName);
        }
        this.n.set(false);
    }

    public final void a(final p1 p1Var, hb hbVar) {
        this.f.a(hbVar, new Function1() { // from class: com.chartboost.sdk.impl.g0$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.a(g0.this, p1Var, (ib) obj);
            }
        });
    }

    public static final Unit a(final g0 g0Var, final p1 p1Var, ib loadAd) {
        Intrinsics.checkNotNullParameter(loadAd, "$this$loadAd");
        y.a(loadAd, new Function1() { // from class: com.chartboost.sdk.impl.g0$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.b(g0.this, p1Var, (ib) obj);
            }
        }, new Function2() { // from class: com.chartboost.sdk.impl.g0$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g0.a(g0.this, p1Var, (ib) obj, (CBError) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit a(g0 g0Var, p1 p1Var, ib fold, CBError error) {
        Intrinsics.checkNotNullParameter(fold, "$this$fold");
        Intrinsics.checkNotNullParameter(error, "error");
        g0Var.a(error, p1Var.d());
        g0Var.a(fold, p1Var);
        return Unit.INSTANCE;
    }

    public static final Unit a(final p1 p1Var, final g0 g0Var, ib loadAd) {
        Intrinsics.checkNotNullParameter(loadAd, "$this$loadAd");
        y.a(loadAd, new Function1() { // from class: com.chartboost.sdk.impl.g0$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.b(p1.this, g0Var, (ib) obj);
            }
        }, new Function2() { // from class: com.chartboost.sdk.impl.g0$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g0.b(g0.this, p1Var, (ib) obj, (CBError) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    public final void a(ib ibVar, p1 p1Var) {
        a(p1Var.d(), (d0) null);
        a(p1Var, ibVar.b());
    }

    public final void a(p1 p1Var, CBError cBError) {
        b(p1Var, a(cBError));
        f(p1Var);
    }

    public final CBError.Impression a(CBError cBError) {
        return (cBError != null ? cBError.getImpressionError() : null) != null ? cBError.getImpressionError() : CBError.Impression.INTERNAL;
    }

    public final void a(p1 p1Var) {
        String str;
        i7 i7Var = this.i;
        d0 a2 = p1Var.a();
        if (a2 == null || (str = a2.r()) == null) {
            str = "";
        }
        i7Var.clear(str, p1Var.d());
    }

    public final void a(p1 p1Var, CBError.Impression impression) {
        h0 h0Var = this.l;
        if (h0Var != null) {
            h0Var.a(c(p1Var), impression);
        }
    }

    public final void a(String str, d0 d0Var) {
        String y;
        String b2;
        String p;
        String i;
        String m;
        if (str == null) {
            str = "no location";
        }
        store(new TrackAd(str, this.f4773a.b(), (d0Var == null || (m = d0Var.m()) == null) ? "" : m, (d0Var == null || (i = d0Var.i()) == null) ? "" : i, (d0Var == null || (p = d0Var.p()) == null) ? "" : p, (d0Var == null || (b2 = d0Var.b()) == null) ? "" : b2, (d0Var == null || (y = d0Var.y()) == null) ? "" : y, f0.a(this.m)));
    }

    public final void a(com.chartboost.sdk.tracking.g gVar, String str) {
        track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.e(gVar, "", this.f4773a.b(), str, this.h, null, 32, null));
    }

    public final void a(CBError cBError, String str) {
        CBError.Type type = cBError.getType();
        if (type != CBError.Internal.HTTP_NOT_FOUND && type != CBError.Internal.HTTP_NOT_OK) {
            if (type == CBError.Internal.UNSUPPORTED_OS_VERSION) {
                a(cBError, g.f.h, str);
                return;
            } else {
                a(cBError, g.a.j, str);
                return;
            }
        }
        a(cBError, g.a.k, str);
    }

    public final void a(CBError cBError, com.chartboost.sdk.tracking.g gVar, String str) {
        String message = cBError.getMessage();
        if (message == null) {
            message = "";
        }
        track((com.chartboost.sdk.tracking.f) new com.chartboost.sdk.tracking.b(gVar, message, this.f4773a.b(), str, this.h));
    }
}
