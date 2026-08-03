package com.unity3d.services.ads.gmascar.utils;

/* compiled from: ScarAdFormatProvider.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/unity3d/services/ads/gmascar/utils/ScarAdFormatProvider;", "Lcom/unity3d/services/ads/gmascar/utils/IScarAdFormatProvider;", "tokenConfiguration", "Lcom/unity3d/ads/TokenConfiguration;", com.ironsource.C3369xe.d, "Lcom/unity3d/services/core/configuration/IExperiments;", "(Lcom/unity3d/ads/TokenConfiguration;Lcom/unity3d/services/core/configuration/IExperiments;)V", "getExperiments", "()Lcom/unity3d/services/core/configuration/IExperiments;", "getTokenConfiguration", "()Lcom/unity3d/ads/TokenConfiguration;", "buildAdFormatList", "", "Lcom/unity3d/scar/adapter/common/scarads/UnityAdFormat;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScarAdFormatProvider implements com.unity3d.services.ads.gmascar.utils.IScarAdFormatProvider {
    private final com.unity3d.services.core.configuration.IExperiments experiments;
    private final com.unity3d.ads.TokenConfiguration tokenConfiguration;

    /* compiled from: ScarAdFormatProvider.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.unity3d.ads.AdFormat.values().length];
            try {
                iArr[com.unity3d.ads.AdFormat.BANNER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ScarAdFormatProvider(com.unity3d.ads.TokenConfiguration tokenConfiguration, com.unity3d.services.core.configuration.IExperiments experiments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.tokenConfiguration = tokenConfiguration;
        this.experiments = experiments;
    }

    public final com.unity3d.ads.TokenConfiguration getTokenConfiguration() {
        return this.tokenConfiguration;
    }

    public final com.unity3d.services.core.configuration.IExperiments getExperiments() {
        return this.experiments;
    }

    @Override // com.unity3d.services.ads.gmascar.utils.IScarAdFormatProvider
    public java.util.List<com.unity3d.scar.adapter.common.scarads.UnityAdFormat> buildAdFormatList() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.unity3d.ads.TokenConfiguration tokenConfiguration = this.tokenConfiguration;
        if (tokenConfiguration == null) {
            arrayList.add(com.unity3d.scar.adapter.common.scarads.UnityAdFormat.REWARDED);
            arrayList.add(com.unity3d.scar.adapter.common.scarads.UnityAdFormat.INTERSTITIAL);
            if (this.experiments.isScarBannerHbEnabled()) {
                arrayList.add(com.unity3d.scar.adapter.common.scarads.UnityAdFormat.BANNER);
            }
        } else {
            if (com.unity3d.services.ads.gmascar.utils.ScarAdFormatProvider.WhenMappings.$EnumSwitchMapping$0[tokenConfiguration.getAdFormat().ordinal()] == 1) {
                if (this.experiments.isScarBannerHbEnabled()) {
                    arrayList.add(com.unity3d.scar.adapter.common.scarads.UnityAdFormat.BANNER);
                }
            } else {
                arrayList.add(com.unity3d.ads.core.extensions.AdFormatExtensions.toUnityAdFormat(this.tokenConfiguration.getAdFormat()));
            }
        }
        return arrayList;
    }
}
