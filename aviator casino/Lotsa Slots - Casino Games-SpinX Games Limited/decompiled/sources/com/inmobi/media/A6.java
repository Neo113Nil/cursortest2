package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class A6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.Mc f4595a;
    public final com.inmobi.media.AbstractC2367e1 b;

    public A6(com.inmobi.media.Mc nativeAdUnitComponent, com.inmobi.media.AbstractC2367e1 adSessionManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        this.f4595a = nativeAdUnitComponent;
        this.b = adSessionManager;
    }

    public final com.inmobi.media.InterfaceC2772t9 a() {
        return this.f4595a.f4836a.f5538a.c;
    }

    public abstract java.lang.Object a(kotlin.coroutines.Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.util.List list, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2924z6 c2924z6;
        int i;
        com.inmobi.media.ads.network.common.model.OmSdkInfo omSdkInfo;
        java.util.List list2;
        com.inmobi.media.InterfaceC2772t9 a2;
        java.lang.String customReferenceData;
        if (continuationImpl instanceof com.inmobi.media.C2924z6) {
            c2924z6 = (com.inmobi.media.C2924z6) continuationImpl;
            int i2 = c2924z6.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2924z6.e = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = c2924z6.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c2924z6.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (list.isEmpty()) {
                        com.inmobi.media.InterfaceC2772t9 a3 = a();
                        if (a3 != null) {
                            ((com.inmobi.media.C2799u9) a3).a("ExperienceLoader", "OMID trackers are empty");
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    com.inmobi.media.ads.network.common.model.MetaInfo metaInfo = this.f4595a.f4836a.b.d;
                    com.inmobi.media.ads.network.common.model.OmSdkInfo omsdkInfo = metaInfo != null ? metaInfo.getOmsdkInfo() : null;
                    boolean z = omsdkInfo != null && omsdkInfo.getOmidEnabled();
                    boolean omidEnabled = this.f4595a.f4836a.b.f4714a.b.getViewability().getOmidConfig().getOmidEnabled();
                    if (z && omidEnabled) {
                        com.inmobi.media.C2883xf c2883xf = com.inmobi.media.C2883xf.f5551a;
                        c2924z6.f5584a = list;
                        c2924z6.b = omsdkInfo;
                        c2924z6.e = 1;
                        android.content.Context context = com.inmobi.media.Xi.f5051a;
                        java.lang.Object withContext = context == null ? "" : kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.inmobi.media.C2831vf(context, null), c2924z6);
                        if (withContext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        omSdkInfo = omsdkInfo;
                        obj = withContext;
                        list2 = list;
                    } else {
                        com.inmobi.media.InterfaceC2772t9 a4 = a();
                        if (a4 != null) {
                            ((com.inmobi.media.C2799u9) a4).a("ExperienceLoader", "OMID is not enabled");
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    omSdkInfo = c2924z6.b;
                    java.util.List list3 = c2924z6.f5584a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    list2 = list3;
                }
                java.lang.String str = (java.lang.String) obj;
                java.lang.String str2 = this.f4595a.f4836a.b.f4714a.f5382a.e;
                a2 = a();
                if (a2 != null) {
                    ((com.inmobi.media.C2799u9) a2).a("ExperienceLoader", "OM-SDK Session Initialize Called");
                }
                com.inmobi.media.AbstractC2367e1 abstractC2367e1 = this.b;
                if (omSdkInfo != null || (r1 = omSdkInfo.getMacros()) == null) {
                    java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
                }
                abstractC2367e1.a(str, list2, emptyMap, str2, (omSdkInfo != null || (customReferenceData = omSdkInfo.getCustomReferenceData()) == null) ? "" : customReferenceData, omSdkInfo == null && omSdkInfo.getIsolateVerificationScripts());
                return kotlin.Unit.INSTANCE;
            }
        }
        c2924z6 = new com.inmobi.media.C2924z6(this, continuationImpl);
        java.lang.Object obj2 = c2924z6.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c2924z6.e;
        if (i != 0) {
        }
        java.lang.String str3 = (java.lang.String) obj2;
        java.lang.String str22 = this.f4595a.f4836a.b.f4714a.f5382a.e;
        a2 = a();
        if (a2 != null) {
        }
        com.inmobi.media.AbstractC2367e1 abstractC2367e12 = this.b;
        if (omSdkInfo != null) {
        }
        java.util.Map emptyMap2 = kotlin.collections.MapsKt.emptyMap();
        abstractC2367e12.a(str3, list2, emptyMap2, str22, (omSdkInfo != null || (customReferenceData = omSdkInfo.getCustomReferenceData()) == null) ? "" : customReferenceData, omSdkInfo == null && omSdkInfo.getIsolateVerificationScripts());
        return kotlin.Unit.INSTANCE;
    }
}
