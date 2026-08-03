package com.google.ads.mediation.moloco;

/* compiled from: MolocoAdapterUtils.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u001a\u0010\u0004\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/google/ads/mediation/moloco/MolocoAdapterUtils;", "", "<init>", "()V", com.ironsource.Mf.b, "", "getAdapterVersion$annotations", "getAdapterVersion", "()Ljava/lang/String;", "setMolocoIsAgeRestricted", "", "isAgeRestricted", "", "moloco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MolocoAdapterUtils {
    public static final com.google.ads.mediation.moloco.MolocoAdapterUtils INSTANCE = new com.google.ads.mediation.moloco.MolocoAdapterUtils();

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void getAdapterVersion$annotations() {
    }

    private MolocoAdapterUtils() {
    }

    public static final java.lang.String getAdapterVersion() {
        return com.google.ads.mediation.moloco.BuildConfig.ADAPTER_VERSION;
    }

    @kotlin.jvm.JvmStatic
    public static final void setMolocoIsAgeRestricted(boolean isAgeRestricted) {
        com.moloco.sdk.publisher.privacy.MolocoPrivacy.setPrivacy(new com.moloco.sdk.publisher.privacy.MolocoPrivacy.PrivacySettings(com.moloco.sdk.publisher.privacy.MolocoPrivacy.INSTANCE.getPrivacySettings().getIsUserConsent(), java.lang.Boolean.valueOf(isAgeRestricted), com.moloco.sdk.publisher.privacy.MolocoPrivacy.INSTANCE.getPrivacySettings().getIsDoNotSell()));
    }
}
