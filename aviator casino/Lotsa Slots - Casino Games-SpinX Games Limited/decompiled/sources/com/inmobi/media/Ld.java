package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ld extends com.inmobi.media.AbstractC2892y implements com.inmobi.media.InterfaceC2782tj, com.inmobi.media.InterfaceC2392f {
    public final com.inmobi.media.Mc b;
    public final com.inmobi.media.Rc c;
    public final com.inmobi.media.AbstractC2367e1 d;
    public final kotlinx.coroutines.CoroutineScope e;
    public final com.inmobi.media.C2841w f;
    public final kotlin.Lazy g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ld(com.inmobi.media.Mc nativeAdUnitComponent, com.inmobi.media.Rc stateMachine) {
        super(nativeAdUnitComponent.f4836a);
        com.inmobi.media.ads.network.inmobiJson.model.NativeMedia media;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = nativeAdUnitComponent;
        this.c = stateMachine;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "<this>");
        com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject assetsObject = nativeAdUnitComponent.b.getAssetsObject();
        kotlinx.coroutines.CoroutineScope coroutineScope = nativeAdUnitComponent.f4836a.f5538a.e;
        this.d = kotlin.jvm.internal.Intrinsics.areEqual((assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType(), "video") ? new com.inmobi.media.Ie(coroutineScope, nativeAdUnitComponent.f4836a.f5538a.c) : new com.inmobi.media.Kc(coroutineScope, nativeAdUnitComponent.f4836a.f5538a.c);
        this.e = com.inmobi.media.T4.a(k());
        com.inmobi.media.C2867x adComponent = nativeAdUnitComponent.f4836a;
        com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject assetsObject2 = nativeAdUnitComponent.b.getAssetsObject();
        com.inmobi.media.ads.network.inmobiJson.model.Image adChoice = assetsObject2 != null ? assetsObject2.getAdChoice() : null;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        this.f = new com.inmobi.media.C2841w(adComponent.f5538a.b, adChoice, adComponent.b.f4714a.b.getNative().getAdChoiceConfig(), adComponent.f5538a.c);
        this.g = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Ld$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Ld.a(com.inmobi.media.Ld.this);
            }
        });
    }

    public static final com.inmobi.media.C2756sj a(final com.inmobi.media.Ld ld) {
        return new com.inmobi.media.C2756sj(new com.inmobi.media.Uc(ld.f5559a.f5538a.d, null, null, 30), new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Ld$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Ld.b(com.inmobi.media.Ld.this);
            }
        });
    }

    public static final java.util.List b(com.inmobi.media.Ld ld) {
        return com.inmobi.media.D4.a("load_called", ld.b.f4836a.b.g);
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void c() {
        com.inmobi.media.J3.a(this.e);
    }

    @Override // com.inmobi.media.InterfaceC2782tj
    public final void a() {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("NativeLoadingState", "Initialize Called - starting inflation process");
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new com.inmobi.media.C2931zd(this, null), 3, null);
    }

    @Override // com.inmobi.media.InterfaceC2392f
    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("NativeLoadingState", "onDestroy");
        }
        java.lang.Object a2 = this.c.a(new com.inmobi.media.C2354dd(), this, (kotlin.coroutines.jvm.internal.ContinuationImpl) continuation);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[Catch: Exception -> 0x004f, TRY_LEAVE, TryCatch #0 {Exception -> 0x004f, blocks: (B:10:0x0027, B:11:0x003f, B:13:0x0047, B:20:0x0036), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlinx.coroutines.Deferred deferred, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.Jd jd;
        int i;
        com.inmobi.media.InterfaceC2772t9 l;
        try {
            if (continuationImpl instanceof com.inmobi.media.Jd) {
                jd = (com.inmobi.media.Jd) continuationImpl;
                int i2 = jd.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    jd.c = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = jd.f4779a;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = jd.c;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        jd.c = 1;
                        obj = deferred.await(jd);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    android.view.View view = (android.view.View) obj;
                    l = l();
                    if (l != null) {
                        ((com.inmobi.media.C2799u9) l).a("NativeLoadingState", "waitForAdChoiceView - ad choice view inflated successfully");
                    }
                    return view;
                }
            }
            if (i != 0) {
            }
            android.view.View view2 = (android.view.View) obj;
            l = l();
            if (l != null) {
            }
            return view2;
        } catch (java.lang.Exception e) {
            com.inmobi.media.C2799u9 c2799u9 = this.b.f4836a.f5538a.c;
            if (c2799u9 == null) {
                return null;
            }
            c2799u9.b("NativeLoadingState", "AdChoiceView inflation failed: " + e);
            return null;
        }
        jd = new com.inmobi.media.Jd(this, continuationImpl);
        java.lang.Object obj2 = jd.f4779a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = jd.c;
    }

    public final void a(com.inmobi.media.ads.nativeAd.MediaView mediaView, android.view.View view, com.inmobi.media.Vc vc) {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("NativeLoadingState", "onInflateSuccess - transitioning to loaded state (mediaView: " + (mediaView != null) + ", adChoice: " + (view != null) + ")");
        }
        this.c.a(new com.inmobi.media.C2906yd(mediaView, view, this.d, vc, this.b, this.c), this);
    }

    public final void a(short s) {
        com.inmobi.media.InterfaceC2772t9 l = l();
        if (l != null) {
            ((com.inmobi.media.C2799u9) l).a("NativeLoadingState", "transitionToFailedState - errorCode: " + ((int) s));
        }
        this.c.a(new com.inmobi.media.C2406fd(s, new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), this.b, this.c), this);
    }
}
