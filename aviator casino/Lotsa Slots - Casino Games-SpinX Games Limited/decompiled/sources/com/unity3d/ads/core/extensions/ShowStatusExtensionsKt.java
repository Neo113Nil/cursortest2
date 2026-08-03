package com.unity3d.ads.core.extensions;

/* compiled from: ShowStatusExtensions.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toUnityAdsShowCompletionState", "Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;", "Lcom/unity3d/ads/adplayer/model/ShowStatus;", "defaultShowCompletionState", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$ShowCompletionState;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ShowStatusExtensionsKt {

    /* compiled from: ShowStatusExtensions.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState.values().length];
            try {
                iArr[gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState.SHOW_COMPLETION_STATE_COMPLETED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState.SHOW_COMPLETION_STATE_SKIPPED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.unity3d.ads.adplayer.model.ShowStatus.values().length];
            try {
                iArr2[com.unity3d.ads.adplayer.model.ShowStatus.COMPLETED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.unity3d.ads.adplayer.model.ShowStatus.SKIPPED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.unity3d.ads.adplayer.model.ShowStatus.ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final com.unity3d.ads.UnityAds.UnityAdsShowCompletionState toUnityAdsShowCompletionState(com.unity3d.ads.adplayer.model.ShowStatus showStatus, gatewayprotocol.v1.NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showStatus, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultShowCompletionState, "defaultShowCompletionState");
        int i = com.unity3d.ads.core.extensions.ShowStatusExtensionsKt.WhenMappings.$EnumSwitchMapping$1[showStatus.ordinal()];
        if (i == 1) {
            return com.unity3d.ads.UnityAds.UnityAdsShowCompletionState.COMPLETED;
        }
        if (i == 2) {
            return com.unity3d.ads.UnityAds.UnityAdsShowCompletionState.SKIPPED;
        }
        if (i == 3) {
            int i2 = com.unity3d.ads.core.extensions.ShowStatusExtensionsKt.WhenMappings.$EnumSwitchMapping$0[defaultShowCompletionState.ordinal()];
            if (i2 == 1) {
                return com.unity3d.ads.UnityAds.UnityAdsShowCompletionState.COMPLETED;
            }
            if (i2 == 2) {
                return com.unity3d.ads.UnityAds.UnityAdsShowCompletionState.SKIPPED;
            }
            return com.unity3d.ads.UnityAds.UnityAdsShowCompletionState.COMPLETED;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
