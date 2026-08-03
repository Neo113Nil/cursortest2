package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Gf extends com.inmobi.media.Vn {
    public final com.inmobi.media.Wn d;
    public com.inmobi.media.Ie e;
    public final com.inmobi.media.C2824v8 f;
    public final com.inmobi.media.InterfaceC2772t9 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gf(android.content.Context context, com.inmobi.media.GestureDetectorOnGestureListenerC2675pi adContainer, com.inmobi.media.Wn mViewableAd, kotlinx.coroutines.CoroutineScope hybridScope, com.inmobi.media.Ie ie, com.inmobi.media.C2824v8 c2824v8, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        super(adContainer);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mViewableAd, "mViewableAd");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hybridScope, "hybridScope");
        this.d = mViewableAd;
        this.e = ie;
        this.f = c2824v8;
        this.g = interfaceC2772t9;
        kotlinx.coroutines.CoroutineScope a2 = com.inmobi.media.T4.a(hybridScope);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Gf", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).b("Gf", "initializeOMSDK called");
        }
        int i = com.inmobi.media.AbstractC2750sf.f5448a;
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        com.inmobi.media.AbstractC2750sf.a(applicationContext);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(a2, null, null, new com.inmobi.media.Ff(this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(com.inmobi.media.Gf gf, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Ef ef;
        int i;
        com.inmobi.media.C2824v8 c2824v8;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9;
        gf.getClass();
        if (continuationImpl instanceof com.inmobi.media.Ef) {
            ef = (com.inmobi.media.Ef) continuationImpl;
            int i2 = ef.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ef.c = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = ef.f4685a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ef.c;
                kotlin.Unit unit = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.C2883xf c2883xf = com.inmobi.media.C2883xf.f5551a;
                    ef.c = 1;
                    android.content.Context context = com.inmobi.media.Xi.f5051a;
                    obj = context == null ? "" : kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.inmobi.media.C2831vf(context, null), ef);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.String str = (java.lang.String) obj;
                c2824v8 = gf.f;
                if (c2824v8 != null) {
                    com.inmobi.media.Ie ie = gf.e;
                    if (ie != null) {
                        ie.a(str, c2824v8.f5505a, c2824v8.b, c2824v8.d, c2824v8.c, c2824v8.e);
                        unit = kotlin.Unit.INSTANCE;
                    }
                }
                interfaceC2772t9 = gf.g;
                if (interfaceC2772t9 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Gf", "TAG");
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).a("Gf", "OmidInfo is null, cannot track ad");
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        ef = new com.inmobi.media.Ef(gf, continuationImpl);
        java.lang.Object obj2 = ef.f4685a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ef.c;
        kotlin.Unit unit3 = null;
        if (i != 0) {
        }
        java.lang.String str2 = (java.lang.String) obj2;
        c2824v8 = gf.f;
        if (c2824v8 != null) {
        }
        interfaceC2772t9 = gf.g;
        if (interfaceC2772t9 != null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.inmobi.media.Wn
    public final android.view.View b() {
        return this.d.b();
    }

    @Override // com.inmobi.media.Wn
    public final android.view.View c() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.g;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Gf", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("Gf", "inflateView called");
        }
        return this.d.c();
    }

    @Override // com.inmobi.media.Wn
    public final void d() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.g;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Gf", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("Gf", "stopTrackingForImpression");
        }
        this.d.d();
    }

    @Override // com.inmobi.media.Wn
    public final void a(android.view.View childView, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose friendlyObstruction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childView, "childView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(friendlyObstruction, "obstructionCode");
        com.inmobi.media.Ie ie = this.e;
        if (ie != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childView, "childView");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(friendlyObstruction, "friendlyObstruction");
            if (ie.c == null) {
                com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = ie.b;
                if (interfaceC2772t9 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).a(com.inmobi.media.AbstractC2367e1.f, "Failed to addObstruction: adSession is null");
                    return;
                }
                return;
            }
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = ie.b;
            if (interfaceC2772t92 != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t92).a(com.inmobi.media.AbstractC2367e1.f, "addObstruction");
            }
            com.inmobi.media.T4.a(ie.f5167a, new com.inmobi.media.X0(ie, childView, friendlyObstruction, null));
        }
    }

    @Override // com.inmobi.media.Wn
    public final void a(android.view.View childView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childView, "childView");
        com.inmobi.media.Ie ie = this.e;
        if (ie != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childView, "childView");
            if (ie.c == null) {
                return;
            }
            com.inmobi.media.T4.a(ie.f5167a, new com.inmobi.media.C2261a1(ie, childView, null));
        }
    }

    @Override // com.inmobi.media.Wn
    public final void a(java.util.Map map) {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.g;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Gf", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a("Gf", "startTrackingForImpression");
        }
        this.d.a(map);
    }

    @Override // com.inmobi.media.Wn
    public final void a(android.content.Context context, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.d.a(context, b);
    }

    @Override // com.inmobi.media.Wn
    public final void a() {
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.g;
        if (interfaceC2772t9 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("Gf", "TAG");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).c("Gf", "destroy");
        }
        java.lang.ref.WeakReference weakReference = this.b;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.e = null;
        this.d.a();
    }
}
