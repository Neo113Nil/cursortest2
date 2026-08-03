package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Gj extends com.inmobi.media.A6 {
    public final com.inmobi.media.Mc c;
    public final java.lang.String d;
    public final com.inmobi.media.ads.network.inmobiJson.model.NativeImage e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gj(com.inmobi.media.Mc nativeAdUnitComponent, com.inmobi.media.AbstractC2367e1 adSessionManager) {
        super(nativeAdUnitComponent, adSessionManager);
        com.inmobi.media.ads.network.inmobiJson.model.NativeMedia media;
        com.inmobi.media.ads.network.inmobiJson.model.NativeMedia media2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        this.c = nativeAdUnitComponent;
        com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject assetsObject = nativeAdUnitComponent.b.getAssetsObject();
        com.inmobi.media.ads.network.inmobiJson.model.NativeImage nativeImage = null;
        this.d = (assetsObject == null || (media2 = assetsObject.getMedia()) == null) ? null : media2.getType();
        com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject assetsObject2 = nativeAdUnitComponent.b.getAssetsObject();
        if (assetsObject2 != null && (media = assetsObject2.getMedia()) != null) {
            nativeImage = media.getImage();
        }
        this.e = nativeImage;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0136, code lost:
    
        if (r11 != r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0138, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0100, code lost:
    
        if (r11 == r1) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0129 A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:11:0x002d, B:12:0x0139, B:20:0x0123, B:22:0x0129, B:23:0x0130), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    @Override // com.inmobi.media.A6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.Fj fj;
        int i;
        java.util.List list;
        com.inmobi.media.ads.network.common.model.OmSdkInfo omsdkInfo;
        java.util.List<com.inmobi.media.ads.network.common.model.AdVerification> adVerifications;
        com.inmobi.media.InterfaceC2772t9 a2;
        try {
            if (continuation instanceof com.inmobi.media.Fj) {
                fj = (com.inmobi.media.Fj) continuation;
                int i2 = fj.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fj.c = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = fj.f4711a;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = fj.c;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.inmobi.media.InterfaceC2772t9 a3 = a();
                        if (a3 != null) {
                            ((com.inmobi.media.C2799u9) a3).a("StaticExperienceLoader", "load called - mediaType: " + this.d);
                        }
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.d, "static")) {
                            com.inmobi.media.InterfaceC2772t9 a4 = a();
                            if (a4 != null) {
                                ((com.inmobi.media.C2799u9) a4).b("StaticExperienceLoader", "Invalid Media Type - expected STATIC, got: " + this.d);
                            }
                            return new com.inmobi.media.F6();
                        }
                        if (this.e == null) {
                            com.inmobi.media.InterfaceC2772t9 a5 = a();
                            if (a5 != null) {
                                ((com.inmobi.media.C2799u9) a5).b("StaticExperienceLoader", "Invalid Native Image - nativeImage is null");
                            }
                            return new com.inmobi.media.D6((short) 2361);
                        }
                        fj.c = 1;
                        com.inmobi.media.ads.network.common.model.MetaInfo metaInfo = this.c.f4836a.b.d;
                        if (metaInfo == null || (omsdkInfo = metaInfo.getOmsdkInfo()) == null || (adVerifications = omsdkInfo.getAdVerifications()) == null) {
                            list = 0;
                        } else {
                            list = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(adVerifications, 10));
                            for (com.inmobi.media.ads.network.common.model.AdVerification adVerification : adVerifications) {
                                list.add(new com.inmobi.media.Hf(adVerification.getVendor(), adVerification.getVerificationParams(), adVerification.getJavascriptResource()));
                            }
                        }
                        if (list == 0) {
                            list = kotlin.collections.CollectionsKt.emptyList();
                        }
                        java.lang.Object a6 = a(list, fj);
                        if (a6 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            a6 = kotlin.Unit.INSTANCE;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return new com.inmobi.media.E6((com.inmobi.media.ads.nativeAd.MediaView) obj, null);
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    com.inmobi.media.Oj oj = new com.inmobi.media.Oj(this.e.getAssets(), new com.inmobi.media.Uj(this.c.f4836a.b));
                    com.inmobi.media.C2775tc c2775tc = (com.inmobi.media.C2775tc) this.c.g.getValue();
                    a2 = a();
                    if (a2 != null) {
                        ((com.inmobi.media.C2799u9) a2).a("StaticExperienceLoader", "load - loading static experience via MediaViewManager");
                    }
                    fj.c = 2;
                    obj = c2775tc.a(oj, fj);
                }
            }
            if (i != 0) {
            }
            com.inmobi.media.Oj oj2 = new com.inmobi.media.Oj(this.e.getAssets(), new com.inmobi.media.Uj(this.c.f4836a.b));
            com.inmobi.media.C2775tc c2775tc2 = (com.inmobi.media.C2775tc) this.c.g.getValue();
            a2 = a();
            if (a2 != null) {
            }
            fj.c = 2;
            obj = c2775tc2.a(oj2, fj);
        } catch (java.lang.Exception e) {
            com.inmobi.media.InterfaceC2772t9 a7 = a();
            if (a7 != null) {
                ((com.inmobi.media.C2799u9) a7).b("StaticExperienceLoader", "load - exception during media view load: " + e.getMessage());
            }
            return a(e);
        }
        fj = new com.inmobi.media.Fj(this, (kotlin.coroutines.jvm.internal.ContinuationImpl) continuation);
        java.lang.Object obj2 = fj.f4711a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fj.c;
    }

    public final com.inmobi.media.G6 a(java.lang.Exception exc) {
        com.inmobi.media.ads.network.inmobiJson.model.NativeImage nativeImage = this.e;
        if (nativeImage != null && nativeImage.getRequired()) {
            com.inmobi.media.InterfaceC2772t9 a2 = a();
            if (a2 != null) {
                ((com.inmobi.media.C2799u9) a2).b("StaticExperienceLoader", "Static Load Failure: " + exc);
            }
            return new com.inmobi.media.D6((short) 2362);
        }
        return new com.inmobi.media.F6();
    }
}
