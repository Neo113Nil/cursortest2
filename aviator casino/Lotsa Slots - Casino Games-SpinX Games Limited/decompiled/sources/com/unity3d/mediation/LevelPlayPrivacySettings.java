package com.unity3d.mediation;

/* loaded from: classes5.dex */
public final class LevelPlayPrivacySettings {
    public static final com.unity3d.mediation.LevelPlayPrivacySettings INSTANCE = new com.unity3d.mediation.LevelPlayPrivacySettings();

    private LevelPlayPrivacySettings() {
    }

    @kotlin.jvm.JvmStatic
    public static final void setCCPA(boolean z) {
        com.ironsource.mediationsdk.logger.IronLog.API.info("LevelPlayPrivacySettings.setCCPA() value: " + z);
        com.ironsource.C3169mb.c.b().a(z);
    }

    @kotlin.jvm.JvmStatic
    public static final void setCOPPA(boolean z) {
        com.ironsource.mediationsdk.logger.IronLog.API.info("LevelPlayPrivacySettings.setCOPPA() value: " + z);
        com.ironsource.C3169mb.c.b().b(z);
    }

    @kotlin.jvm.JvmStatic
    public static final void setGDPRConsents(java.util.Map<java.lang.String, java.lang.Boolean> networkConsents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkConsents, "networkConsents");
        com.ironsource.mediationsdk.logger.IronLog.API.info("LevelPlayPrivacySettings.setGDPRConsents() networkConsents: " + networkConsents);
        com.ironsource.C3169mb.c.b().a(networkConsents);
    }
}
