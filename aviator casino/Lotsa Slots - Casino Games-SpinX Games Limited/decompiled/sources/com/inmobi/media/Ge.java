package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ge implements com.inmobi.media.InterfaceC2782tj, com.inmobi.media.Ah, com.inmobi.media.InterfaceC2392f {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f4726a;
    public final com.inmobi.media.ads.nativeAd.MediaView b;
    public final com.inmobi.media.Fi c;
    public final com.inmobi.media.AbstractC2367e1 d;
    public final com.inmobi.media.H4 e;
    public final com.inmobi.media.Vc f;
    public final com.inmobi.media.Mc g;
    public final com.inmobi.media.Rc h;

    public Ge(android.view.View view, com.inmobi.media.ads.nativeAd.MediaView mediaView, com.inmobi.media.Fi renderedStateCache, com.inmobi.media.AbstractC2367e1 adSessionManager, com.inmobi.media.H4 contextualDataHandler, com.inmobi.media.Vc nativeBeaconProcessor, com.inmobi.media.Mc nativeAdUnitComponent, com.inmobi.media.Rc stateMachine) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(renderedStateCache, "renderedStateCache");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f4726a = view;
        this.b = mediaView;
        this.c = renderedStateCache;
        this.d = adSessionManager;
        this.e = contextualDataHandler;
        this.f = nativeBeaconProcessor;
        this.g = nativeAdUnitComponent;
        this.h = stateMachine;
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void a() {
        com.inmobi.media.Ph ph;
        com.inmobi.media.C2799u9 c2799u9 = this.g.f4836a.f5538a.c;
        if (c2799u9 == null || (ph = c2799u9.f5484a) == null) {
            return;
        }
        ph.a();
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void c() {
    }

    @Override // com.inmobi.media.Ah
    public final void a(com.inmobi.media.ads.nativeAd.InMobiNativeViewData nativeViewData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeViewData, "nativeViewData");
        this.h.a(new com.inmobi.media.Be(new com.inmobi.media.Ce(this.c, new com.inmobi.media.C2304bh(nativeViewData, this.b, this.f4726a), this.e, this.d, this.f, this.g), this.h), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a4, code lost:
    
        if (r9.a(r2, r8, r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.inmobi.media.InterfaceC2392f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Ee ee;
        int i;
        if (continuation instanceof com.inmobi.media.Ee) {
            ee = (com.inmobi.media.Ee) continuation;
            int i2 = ee.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ee.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = ee.f4684a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ee.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.AbstractC2367e1 abstractC2367e1 = this.d;
                    if (abstractC2367e1.c == null) {
                        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = abstractC2367e1.b;
                        if (interfaceC2772t9 != null) {
                            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(com.inmobi.media.AbstractC2367e1.f, "Failed to stopAdSession. adSession is null");
                        }
                    } else {
                        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = abstractC2367e1.b;
                        if (interfaceC2772t92 != null) {
                            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(com.inmobi.media.AbstractC2367e1.f, "stopAdSession");
                        }
                        com.inmobi.media.T4.a(abstractC2367e1.f5167a, new com.inmobi.media.C2314c1(abstractC2367e1, null));
                    }
                    com.inmobi.media.C2775tc c2775tc = (com.inmobi.media.C2775tc) this.g.g.getValue();
                    ee.c = 1;
                    c2775tc.getClass();
                    java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.inmobi.media.C2720rc(c2775tc, null), ee);
                    if (withContext != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        withContext = kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.e.b();
                com.inmobi.media.Rc rc = this.h;
                com.inmobi.media.C2354dd c2354dd = new com.inmobi.media.C2354dd();
                ee.c = 2;
            }
        }
        ee = new com.inmobi.media.Ee(this, (kotlin.coroutines.jvm.internal.ContinuationImpl) continuation);
        java.lang.Object obj2 = ee.f4684a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ee.c;
        if (i != 0) {
        }
        this.e.b();
        com.inmobi.media.Rc rc2 = this.h;
        com.inmobi.media.C2354dd c2354dd2 = new com.inmobi.media.C2354dd();
        ee.c = 2;
    }
}
