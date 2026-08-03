package com.unity3d.ads.core.extensions;

/* compiled from: AdFormatExtensions.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0001¨\u0006\u0005"}, d2 = {"toProtoAdFormat", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "Lcom/unity3d/ads/AdFormat;", "toUnityAdFormat", "Lcom/unity3d/scar/adapter/common/scarads/UnityAdFormat;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdFormatExtensions {

    /* compiled from: AdFormatExtensions.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[gatewayprotocol.v1.AdFormatOuterClass.AdFormat.values().length];
            try {
                iArr[gatewayprotocol.v1.AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[gatewayprotocol.v1.AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[gatewayprotocol.v1.AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[gatewayprotocol.v1.AdFormatOuterClass.AdFormat.AD_FORMAT_UNSPECIFIED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.unity3d.ads.AdFormat.values().length];
            try {
                iArr2[com.unity3d.ads.AdFormat.UNSPECIFIED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.unity3d.ads.AdFormat.BANNER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.unity3d.ads.AdFormat.INTERSTITIAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.unity3d.ads.AdFormat.REWARDED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final com.unity3d.scar.adapter.common.scarads.UnityAdFormat toUnityAdFormat(gatewayprotocol.v1.AdFormatOuterClass.AdFormat adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "<this>");
        int i = com.unity3d.ads.core.extensions.AdFormatExtensions.WhenMappings.$EnumSwitchMapping$0[adFormat.ordinal()];
        if (i == 1) {
            return com.unity3d.scar.adapter.common.scarads.UnityAdFormat.REWARDED;
        }
        if (i == 2) {
            return com.unity3d.scar.adapter.common.scarads.UnityAdFormat.INTERSTITIAL;
        }
        if (i == 3) {
            return com.unity3d.scar.adapter.common.scarads.UnityAdFormat.BANNER;
        }
        if (i != 4) {
            return null;
        }
        return com.unity3d.scar.adapter.common.scarads.UnityAdFormat.UNSPECIFIED;
    }

    public static final gatewayprotocol.v1.AdFormatOuterClass.AdFormat toProtoAdFormat(com.unity3d.ads.AdFormat adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "<this>");
        int i = com.unity3d.ads.core.extensions.AdFormatExtensions.WhenMappings.$EnumSwitchMapping$1[adFormat.ordinal()];
        if (i == 1) {
            return gatewayprotocol.v1.AdFormatOuterClass.AdFormat.AD_FORMAT_UNSPECIFIED;
        }
        if (i == 2) {
            return gatewayprotocol.v1.AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER;
        }
        if (i == 3) {
            return gatewayprotocol.v1.AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL;
        }
        if (i == 4) {
            return gatewayprotocol.v1.AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.unity3d.scar.adapter.common.scarads.UnityAdFormat toUnityAdFormat(com.unity3d.ads.AdFormat adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "<this>");
        int i = com.unity3d.ads.core.extensions.AdFormatExtensions.WhenMappings.$EnumSwitchMapping$1[adFormat.ordinal()];
        if (i == 1) {
            return com.unity3d.scar.adapter.common.scarads.UnityAdFormat.UNSPECIFIED;
        }
        if (i == 2) {
            return com.unity3d.scar.adapter.common.scarads.UnityAdFormat.BANNER;
        }
        if (i == 3) {
            return com.unity3d.scar.adapter.common.scarads.UnityAdFormat.INTERSTITIAL;
        }
        if (i == 4) {
            return com.unity3d.scar.adapter.common.scarads.UnityAdFormat.REWARDED;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
