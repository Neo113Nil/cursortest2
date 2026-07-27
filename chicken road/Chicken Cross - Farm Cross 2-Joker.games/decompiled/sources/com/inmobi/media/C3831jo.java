package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.common.model.TrackingInfo;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import com.inmobi.media.ads.network.inmobiJson.model.NativeVideo;
import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.jo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3831jo extends X6 {
    public final Ed c;
    public final String d;
    public final NativeVideo e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3831jo(Ed nativeAdUnitComponent, AbstractC3724g1 adSessionManager) {
        super(nativeAdUnitComponent, adSessionManager);
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        this.c = nativeAdUnitComponent;
        JsonAssetObject assetsObject = nativeAdUnitComponent.b.getAssetsObject();
        NativeMedia media = assetsObject != null ? assetsObject.getMedia() : null;
        this.d = media != null ? media.getType() : null;
        this.e = media != null ? media.getVideo() : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x014b, code lost:
    
        if (a(r7, r2) == r3) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00c5, code lost:
    
        if (r1 == r3) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.inmobi.media.X6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        C3747go c3747go;
        int i;
        Cn cn;
        List<TrackingInfo> emptyList;
        NativeVideo video;
        if (continuation instanceof C3747go) {
            c3747go = (C3747go) continuation;
            int i2 = c3747go.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3747go.d = i2 - Integer.MIN_VALUE;
                Object obj = c3747go.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3747go.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Y9 a2 = a();
                    if (a2 != null) {
                        ((Z9) a2).a("VideoExperienceLoader", "load called - mediaType: " + this.d);
                    }
                    if (!Intrinsics.areEqual(this.d, "video")) {
                        Y9 a3 = a();
                        if (a3 != null) {
                            ((Z9) a3).b("VideoExperienceLoader", "Invalid Media Type - expected VIDEO, got: " + this.d);
                        }
                        return new C3618c7();
                    }
                    NativeVideo nativeVideo = this.e;
                    if (nativeVideo == null) {
                        Y9 a4 = a();
                        if (a4 != null) {
                            ((Z9) a4).b("VideoExperienceLoader", "Invalid Native Video - nativeVideo is null");
                        }
                        return new C3561a7((short) 2361);
                    }
                    ArrayList a5 = AbstractC3559a5.a("error", nativeVideo.getTrackers());
                    String vastTag = this.e.getVastTag();
                    c3747go.d = 1;
                    obj = a(vastTag, a5, c3747go);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        cn = c3747go.f7130a;
                        ResultKt.throwOnFailure(obj);
                        String str = cn.f6500a;
                        String str2 = cn.b;
                        int a6 = Vn.a(cn.e);
                        ArrayList arrayList = cn.c;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (!(((C4189wf) next) instanceof Bg)) {
                                arrayList2.add(next);
                            }
                        }
                        C4197wn vastBeaconData = new C4197wn(str, str2, a6, arrayList2);
                        String str3 = cn.e;
                        ArrayList arrayList3 = cn.f;
                        ArrayList arrayList4 = cn.g;
                        AdConfig.VastVideoConfig vastVideo = this.c.f6535a.b.f6590a.b.getVastVideo();
                        VideoExperience experience = this.e.getExperience();
                        C4036r1 c4036r1 = this.c.f6535a.b.f6590a;
                        C3692ep c3692ep = new C3692ep(c4036r1.f7340a.g, experience, c4036r1.b.getNative());
                        Ed ed = this.c;
                        Intrinsics.checkNotNullParameter(ed, "<this>");
                        Intrinsics.checkNotNullParameter(vastBeaconData, "vastBeaconData");
                        C3639d0 c3639d0 = ed.f6535a.f7489a.d;
                        Intrinsics.checkNotNullParameter(ed, "<this>");
                        JsonAssetObject assetsObject = ed.b.getAssetsObject();
                        NativeMedia media = assetsObject != null ? assetsObject.getMedia() : null;
                        if (media == null || (video = media.getVideo()) == null || (emptyList = video.getTrackers()) == null) {
                            emptyList = CollectionsKt.emptyList();
                        }
                        Co co = new Co(str3, arrayList3, arrayList4, vastVideo, c3692ep, new Yn(vastBeaconData, c3639d0, new C4145up(emptyList)), new Ep(this.c.f6535a.b), new C4178w4(this.c.f6535a.b));
                        c3747go.f7130a = null;
                        c3747go.d = 3;
                        Object a7 = a(vastBeaconData, co, c3747go);
                        return a7 == coroutine_suspended ? coroutine_suspended : a7;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                cn = (Cn) obj;
                if (cn != null) {
                    NativeVideo nativeVideo2 = this.e;
                    if (!(nativeVideo2 != null ? nativeVideo2.getRequired() : false)) {
                        return new C3618c7();
                    }
                    Y9 a8 = a();
                    if (a8 != null) {
                        ((Z9) a8).b("VideoExperienceLoader", "Vast Parse Failure - Video Required");
                    }
                    return new C3561a7((short) 2360);
                }
                Ed ed2 = this.c;
                String str4 = cn.d;
                ArrayList arrayList5 = cn.c;
                ArrayList arrayList6 = new ArrayList();
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (Intrinsics.areEqual(((C4189wf) next2).b, "click")) {
                        arrayList6.add(next2);
                    }
                }
                ed2.e = new C4224xn(str4, arrayList6);
                ArrayList arrayList7 = cn.c;
                ArrayList arrayList8 = new ArrayList();
                Iterator it3 = arrayList7.iterator();
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    if (next3 instanceof Bg) {
                        arrayList8.add(next3);
                    }
                }
                c3747go.f7130a = cn;
                c3747go.d = 2;
            }
        }
        c3747go = new C3747go(this, (ContinuationImpl) continuation);
        Object obj2 = c3747go.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3747go.d;
        if (i != 0) {
        }
        cn = (Cn) obj2;
        if (cn != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ArrayList arrayList, ContinuationImpl continuationImpl) {
        C3803io c3803io;
        int i;
        try {
            if (continuationImpl instanceof C3803io) {
                c3803io = (C3803io) continuationImpl;
                int i2 = c3803io.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3803io.c = i2 - Integer.MIN_VALUE;
                    Object obj = c3803io.f7168a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c3803io.c;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Y9 a2 = a();
                        if (a2 != null) {
                            ((Z9) a2).a("VideoExperienceLoader", "parseVastTag - processing VAST tag with " + arrayList.size() + " error URLs");
                        }
                        Un un = Un.f6899a;
                        C4227y c4227y = this.c.f6535a;
                        c3803io.c = 1;
                        obj = un.a(str, c4227y, arrayList, c3803io);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (Cn) obj;
                }
            }
            if (i != 0) {
            }
            return (Cn) obj;
        } catch (Fn e) {
            Y9 a3 = a();
            if (a3 == null) {
                return null;
            }
            ((Z9) a3).b("VideoExperienceLoader", "parseVastTag - VAST parse exception: " + e.getMessage());
            return null;
        }
        c3803io = new C3803io(this, continuationImpl);
        Object obj2 = c3803io.f7168a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3803io.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C4197wn c4197wn, Co co, ContinuationImpl continuationImpl) {
        C3776ho c3776ho;
        int i;
        try {
            if (continuationImpl instanceof C3776ho) {
                c3776ho = (C3776ho) continuationImpl;
                int i2 = c3776ho.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3776ho.d = i2 - Integer.MIN_VALUE;
                    Object obj = c3776ho.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c3776ho.d;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        C3877ld c3877ld = (C3877ld) this.c.g.getValue();
                        Y9 a2 = a();
                        if (a2 != null) {
                            ((Z9) a2).a("VideoExperienceLoader", "onPrepareExperienceModelSuccess - loading video experience");
                        }
                        c3776ho.f7152a = c4197wn;
                        c3776ho.d = 1;
                        obj = c3877ld.a(co, c3776ho);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c4197wn = c3776ho.f7152a;
                        ResultKt.throwOnFailure(obj);
                    }
                    return new C3589b7((MediaView) obj, c4197wn);
                }
            }
            if (i != 0) {
            }
            return new C3589b7((MediaView) obj, c4197wn);
        } catch (Exception e) {
            Y9 a3 = a();
            if (a3 != null) {
                ((Z9) a3).b("VideoExperienceLoader", "onPrepareExperienceModelSuccess - exception during media load: " + e.getMessage());
            }
            return a(e, c4197wn);
        }
        c3776ho = new C3776ho(this, continuationImpl);
        Object obj2 = c3776ho.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3776ho.d;
    }

    public final AbstractC3646d7 a(Exception exc, C4197wn c4197wn) {
        NativeVideo nativeVideo = this.e;
        if (nativeVideo != null ? nativeVideo.getRequired() : false) {
            Y9 a2 = a();
            if (a2 != null) {
                ((Z9) a2).b("VideoExperienceLoader", "Media Load Failure: " + exc);
            }
            return new C3561a7((short) 2362);
        }
        return new C3618c7(c4197wn);
    }
}
