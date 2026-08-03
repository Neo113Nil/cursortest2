package com.unity3d.ads.core.domain.scar;

/* compiled from: LoadScarAd.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JA\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/scar/LoadScarAd;", "", "scarManager", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "(Lcom/unity3d/ads/core/data/manager/ScarManager;)V", "invoke", "", "adFormat", "", "placementId", "adUnitId", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_STRING, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_QUERY_ID, "videoLength", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LoadScarAd {
    private final com.unity3d.ads.core.data.manager.ScarManager scarManager;

    public LoadScarAd(com.unity3d.ads.core.data.manager.ScarManager scarManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scarManager, "scarManager");
        this.scarManager = scarManager;
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object loadAd;
        return (!kotlin.jvm.internal.Intrinsics.areEqual(str, "banner") && (loadAd = this.scarManager.loadAd(str, str2, str4, str3, str5, i, continuation)) == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? loadAd : kotlin.Unit.INSTANCE;
    }
}
