package com.inmobi.media;

/* renamed from: com.inmobi.media.nm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2626nm extends com.inmobi.media.A6 {
    public final com.inmobi.media.Mc c;
    public final java.lang.String d;
    public final com.inmobi.media.ads.network.inmobiJson.model.NativeVideo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2626nm(com.inmobi.media.Mc nativeAdUnitComponent, com.inmobi.media.AbstractC2367e1 adSessionManager) {
        super(nativeAdUnitComponent, adSessionManager);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        this.c = nativeAdUnitComponent;
        com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject assetsObject = nativeAdUnitComponent.b.getAssetsObject();
        com.inmobi.media.ads.network.inmobiJson.model.NativeMedia media = assetsObject != null ? assetsObject.getMedia() : null;
        this.d = media != null ? media.getType() : null;
        this.e = media != null ? media.getVideo() : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0147, code lost:
    
        if (a(r7, r2) == r3) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00c3, code lost:
    
        if (r1 == r3) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.inmobi.media.A6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        com.inmobi.media.C2545km c2545km;
        int i;
        com.inmobi.media.Hl hl;
        java.util.List<com.inmobi.media.ads.network.common.model.TrackingInfo> emptyList;
        com.inmobi.media.ads.network.inmobiJson.model.NativeVideo video;
        if (continuation instanceof com.inmobi.media.C2545km) {
            c2545km = (com.inmobi.media.C2545km) continuation;
            int i2 = c2545km.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2545km.d = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2545km.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2545km.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.inmobi.media.InterfaceC2772t9 a2 = a();
                    if (a2 != null) {
                        ((com.inmobi.media.C2799u9) a2).a("VideoExperienceLoader", "load called - mediaType: " + this.d);
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(this.d, "video")) {
                        com.inmobi.media.InterfaceC2772t9 a3 = a();
                        if (a3 != null) {
                            ((com.inmobi.media.C2799u9) a3).b("VideoExperienceLoader", "Invalid Media Type - expected VIDEO, got: " + this.d);
                        }
                        return new com.inmobi.media.F6();
                    }
                    com.inmobi.media.ads.network.inmobiJson.model.NativeVideo nativeVideo = this.e;
                    if (nativeVideo == null) {
                        com.inmobi.media.InterfaceC2772t9 a4 = a();
                        if (a4 != null) {
                            ((com.inmobi.media.C2799u9) a4).b("VideoExperienceLoader", "Invalid Native Video - nativeVideo is null");
                        }
                        return new com.inmobi.media.D6((short) 2361);
                    }
                    java.util.ArrayList a5 = com.inmobi.media.D4.a("error", nativeVideo.getTrackers());
                    java.lang.String vastTag = this.e.getVastTag();
                    c2545km.d = 1;
                    obj = a(vastTag, a5, c2545km);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        hl = c2545km.f5300a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.String str = hl.f4749a;
                        java.lang.String str2 = hl.b;
                        int a6 = com.inmobi.media.AbstractC2283am.a(hl.e);
                        java.util.ArrayList arrayList = hl.c;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            java.lang.Object next = it.next();
                            if (!(((com.inmobi.media.De) next) instanceof com.inmobi.media.Hf)) {
                                arrayList2.add(next);
                            }
                        }
                        com.inmobi.media.Bl vastBeaconData = new com.inmobi.media.Bl(str, str2, a6, arrayList2);
                        java.lang.String str3 = hl.e;
                        java.util.ArrayList arrayList3 = hl.f;
                        java.util.ArrayList arrayList4 = hl.g;
                        com.inmobi.media.core.config.models.AdConfig.VastVideoConfig vastVideo = this.c.f4836a.b.f4714a.b.getVastVideo();
                        com.inmobi.media.ads.network.inmobiJson.model.VideoExperience experience = this.e.getExperience();
                        com.inmobi.media.C2657p1 c2657p1 = this.c.f4836a.b.f4714a;
                        com.inmobi.media.C2469hn c2469hn = new com.inmobi.media.C2469hn(c2657p1.f5382a.f, experience, c2657p1.b.getNative());
                        com.inmobi.media.Mc mc = this.c;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mc, "<this>");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vastBeaconData, "vastBeaconData");
                        com.inmobi.media.C2313c0 c2313c0 = mc.f4836a.f5538a.d;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mc, "<this>");
                        com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject assetsObject = mc.b.getAssetsObject();
                        com.inmobi.media.ads.network.inmobiJson.model.NativeMedia media = assetsObject != null ? assetsObject.getMedia() : null;
                        if (media == null || (video = media.getVideo()) == null || (emptyList = video.getTrackers()) == null) {
                            emptyList = kotlin.collections.CollectionsKt.emptyList();
                        }
                        com.inmobi.media.Gm gm = new com.inmobi.media.Gm(str3, arrayList3, arrayList4, vastVideo, c2469hn, new com.inmobi.media.C2363dm(vastBeaconData, c2313c0, new com.inmobi.media.C2891xn(emptyList)), new com.inmobi.media.Hn(this.c.f4836a.b), new com.inmobi.media.Z3(this.c.f4836a.b));
                        c2545km.f5300a = null;
                        c2545km.d = 3;
                        java.lang.Object a7 = a(vastBeaconData, gm, c2545km);
                        return a7 == coroutine_suspended ? coroutine_suspended : a7;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                hl = (com.inmobi.media.Hl) obj;
                if (hl != null) {
                    com.inmobi.media.ads.network.inmobiJson.model.NativeVideo nativeVideo2 = this.e;
                    if (nativeVideo2 == null || !nativeVideo2.getRequired()) {
                        return new com.inmobi.media.F6();
                    }
                    com.inmobi.media.InterfaceC2772t9 a8 = a();
                    if (a8 != null) {
                        ((com.inmobi.media.C2799u9) a8).b("VideoExperienceLoader", "Vast Parse Failure - Video Required");
                    }
                    return new com.inmobi.media.D6((short) 2360);
                }
                com.inmobi.media.Mc mc2 = this.c;
                java.lang.String str4 = hl.d;
                java.util.ArrayList arrayList5 = hl.c;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.util.Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    java.lang.Object next2 = it2.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.inmobi.media.De) next2).b, com.ironsource.Y3.d)) {
                        arrayList6.add(next2);
                    }
                }
                mc2.e = new com.inmobi.media.Cl(str4, arrayList6);
                java.util.ArrayList arrayList7 = hl.c;
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.util.Iterator it3 = arrayList7.iterator();
                while (it3.hasNext()) {
                    java.lang.Object next3 = it3.next();
                    if (next3 instanceof com.inmobi.media.Hf) {
                        arrayList8.add(next3);
                    }
                }
                c2545km.f5300a = hl;
                c2545km.d = 2;
            }
        }
        c2545km = new com.inmobi.media.C2545km(this, (kotlin.coroutines.jvm.internal.ContinuationImpl) continuation);
        java.lang.Object obj2 = c2545km.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2545km.d;
        if (i != 0) {
        }
        hl = (com.inmobi.media.Hl) obj2;
        if (hl != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, java.util.ArrayList arrayList, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2598mm c2598mm;
        int i;
        try {
            if (continuationImpl instanceof com.inmobi.media.C2598mm) {
                c2598mm = (com.inmobi.media.C2598mm) continuationImpl;
                int i2 = c2598mm.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2598mm.c = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = c2598mm.f5342a;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c2598mm.c;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.inmobi.media.InterfaceC2772t9 a2 = a();
                        if (a2 != null) {
                            ((com.inmobi.media.C2799u9) a2).a("VideoExperienceLoader", "parseVastTag - processing VAST tag with " + arrayList.size() + " error URLs");
                        }
                        com.inmobi.media.Zl zl = com.inmobi.media.Zl.f5088a;
                        com.inmobi.media.C2867x c2867x = this.c.f4836a;
                        c2598mm.c = 1;
                        obj = zl.a(str, c2867x, arrayList, c2598mm);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return (com.inmobi.media.Hl) obj;
                }
            }
            if (i != 0) {
            }
            return (com.inmobi.media.Hl) obj;
        } catch (com.inmobi.media.Kl e) {
            com.inmobi.media.InterfaceC2772t9 a3 = a();
            if (a3 == null) {
                return null;
            }
            ((com.inmobi.media.C2799u9) a3).b("VideoExperienceLoader", "parseVastTag - VAST parse exception: " + e.getMessage());
            return null;
        }
        c2598mm = new com.inmobi.media.C2598mm(this, continuationImpl);
        java.lang.Object obj2 = c2598mm.f5342a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2598mm.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.inmobi.media.Bl bl, com.inmobi.media.Gm gm, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2572lm c2572lm;
        int i;
        try {
            if (continuationImpl instanceof com.inmobi.media.C2572lm) {
                c2572lm = (com.inmobi.media.C2572lm) continuationImpl;
                int i2 = c2572lm.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2572lm.d = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = c2572lm.b;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c2572lm.d;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.inmobi.media.C2775tc c2775tc = (com.inmobi.media.C2775tc) this.c.g.getValue();
                        com.inmobi.media.InterfaceC2772t9 a2 = a();
                        if (a2 != null) {
                            ((com.inmobi.media.C2799u9) a2).a("VideoExperienceLoader", "onPrepareExperienceModelSuccess - loading video experience");
                        }
                        c2572lm.f5322a = bl;
                        c2572lm.d = 1;
                        obj = c2775tc.a(gm, c2572lm);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bl = c2572lm.f5322a;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return new com.inmobi.media.E6((com.inmobi.media.ads.nativeAd.MediaView) obj, bl);
                }
            }
            if (i != 0) {
            }
            return new com.inmobi.media.E6((com.inmobi.media.ads.nativeAd.MediaView) obj, bl);
        } catch (java.lang.Exception e) {
            com.inmobi.media.InterfaceC2772t9 a3 = a();
            if (a3 != null) {
                ((com.inmobi.media.C2799u9) a3).b("VideoExperienceLoader", "onPrepareExperienceModelSuccess - exception during media load: " + e.getMessage());
            }
            return a(e, bl);
        }
        c2572lm = new com.inmobi.media.C2572lm(this, continuationImpl);
        java.lang.Object obj2 = c2572lm.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2572lm.d;
    }

    public final com.inmobi.media.G6 a(java.lang.Exception exc, com.inmobi.media.Bl bl) {
        com.inmobi.media.ads.network.inmobiJson.model.NativeVideo nativeVideo = this.e;
        if (nativeVideo != null && nativeVideo.getRequired()) {
            com.inmobi.media.InterfaceC2772t9 a2 = a();
            if (a2 != null) {
                ((com.inmobi.media.C2799u9) a2).b("VideoExperienceLoader", "Media Load Failure: " + exc);
            }
            return new com.inmobi.media.D6((short) 2362);
        }
        return new com.inmobi.media.F6(bl);
    }
}
