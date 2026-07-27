package com.inmobi.media;

import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.common.model.AdVerification;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import com.inmobi.media.ads.network.common.model.OmSdkInfo;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeImage;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.bl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3603bl extends X6 {
    public final Ed c;
    public final String d;
    public final NativeImage e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3603bl(Ed nativeAdUnitComponent, AbstractC3724g1 adSessionManager) {
        super(nativeAdUnitComponent, adSessionManager);
        NativeMedia media;
        NativeMedia media2;
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        this.c = nativeAdUnitComponent;
        JsonAssetObject assetsObject = nativeAdUnitComponent.b.getAssetsObject();
        NativeImage nativeImage = null;
        this.d = (assetsObject == null || (media2 = assetsObject.getMedia()) == null) ? null : media2.getType();
        JsonAssetObject assetsObject2 = nativeAdUnitComponent.b.getAssetsObject();
        if (assetsObject2 != null && (media = assetsObject2.getMedia()) != null) {
            nativeImage = media.getImage();
        }
        this.e = nativeImage;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0138, code lost:
    
        if (r11 != r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x013a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0102, code lost:
    
        if (r11 == r1) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012b A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:11:0x002d, B:12:0x013b, B:20:0x0125, B:22:0x012b, B:23:0x0132), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    @Override // com.inmobi.media.X6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        C3575al c3575al;
        int i;
        List list;
        OmSdkInfo omsdkInfo;
        List<AdVerification> adVerifications;
        Y9 a2;
        try {
            if (continuation instanceof C3575al) {
                c3575al = (C3575al) continuation;
                int i2 = c3575al.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c3575al.c = i2 - Integer.MIN_VALUE;
                    Object obj = c3575al.f7015a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = c3575al.c;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Y9 a3 = a();
                        if (a3 != null) {
                            ((Z9) a3).a("StaticExperienceLoader", "load called - mediaType: " + this.d);
                        }
                        if (!Intrinsics.areEqual(this.d, "static")) {
                            Y9 a4 = a();
                            if (a4 != null) {
                                ((Z9) a4).b("StaticExperienceLoader", "Invalid Media Type - expected STATIC, got: " + this.d);
                            }
                            return new C3618c7();
                        }
                        if (this.e == null) {
                            Y9 a5 = a();
                            if (a5 != null) {
                                ((Z9) a5).b("StaticExperienceLoader", "Invalid Native Image - nativeImage is null");
                            }
                            return new C3561a7((short) 2361);
                        }
                        c3575al.c = 1;
                        MetaInfo metaInfo = this.c.f6535a.b.d;
                        if (metaInfo == null || (omsdkInfo = metaInfo.getOmsdkInfo()) == null || (adVerifications = omsdkInfo.getAdVerifications()) == null) {
                            list = 0;
                        } else {
                            list = new ArrayList(CollectionsKt.collectionSizeOrDefault(adVerifications, 10));
                            for (AdVerification adVerification : adVerifications) {
                                list.add(new Bg(adVerification.getVendor(), adVerification.getVerificationParams(), adVerification.getJavascriptResource()));
                            }
                        }
                        if (list == 0) {
                            list = CollectionsKt.emptyList();
                        }
                        Object a6 = a(list, c3575al);
                        if (a6 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            a6 = Unit.INSTANCE;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return new C3589b7((MediaView) obj, null);
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    C3828jl c3828jl = new C3828jl(this.e.getAssets(), new C4000pl(this.c.f6535a.b));
                    C3877ld c3877ld = (C3877ld) this.c.g.getValue();
                    a2 = a();
                    if (a2 != null) {
                        ((Z9) a2).a("StaticExperienceLoader", "load - loading static experience via MediaViewManager");
                    }
                    c3575al.c = 2;
                    obj = c3877ld.a(c3828jl, c3575al);
                }
            }
            if (i != 0) {
            }
            C3828jl c3828jl2 = new C3828jl(this.e.getAssets(), new C4000pl(this.c.f6535a.b));
            C3877ld c3877ld2 = (C3877ld) this.c.g.getValue();
            a2 = a();
            if (a2 != null) {
            }
            c3575al.c = 2;
            obj = c3877ld2.a(c3828jl2, c3575al);
        } catch (Exception e) {
            Y9 a7 = a();
            if (a7 != null) {
                ((Z9) a7).b("StaticExperienceLoader", "load - exception during media view load: " + e.getMessage());
            }
            return a(e);
        }
        c3575al = new C3575al(this, (ContinuationImpl) continuation);
        Object obj2 = c3575al.f7015a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3575al.c;
    }

    public final AbstractC3646d7 a(Exception exc) {
        NativeImage nativeImage = this.e;
        if (nativeImage != null && nativeImage.getRequired()) {
            Y9 a2 = a();
            if (a2 != null) {
                ((Z9) a2).b("StaticExperienceLoader", "Static Load Failure: " + exc);
            }
            return new C3561a7((short) 2362);
        }
        return new C3618c7();
    }
}
