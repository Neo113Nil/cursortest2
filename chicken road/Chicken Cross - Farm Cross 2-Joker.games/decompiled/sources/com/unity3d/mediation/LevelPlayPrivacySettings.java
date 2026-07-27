package com.unity3d.mediation;

import com.ironsource.C4498kb;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LevelPlayPrivacySettings {
    public static final LevelPlayPrivacySettings INSTANCE = new LevelPlayPrivacySettings();

    private LevelPlayPrivacySettings() {
    }

    @JvmStatic
    public static final void setCCPA(boolean z) {
        IronLog.API.info("LevelPlayPrivacySettings.setCCPA() value: " + z);
        C4498kb.d.a().a(z);
    }

    @JvmStatic
    public static final void setCOPPA(boolean z) {
        IronLog.API.info("LevelPlayPrivacySettings.setCOPPA() value: " + z);
        C4498kb.d.a().b(z);
    }

    @JvmStatic
    public static final void setGDPRConsent(boolean z) {
        IronLog.API.info("LevelPlayPrivacySettings.setGDPRConsent() consent: " + z);
        C4498kb.d.a().c(z);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use LevelPlayPrivacySettings.setGDPRConsent() for GDPR consent management.")
    @JvmStatic
    public static final void setGDPRConsents(Map<String, Boolean> networkConsents) {
        Intrinsics.checkNotNullParameter(networkConsents, "networkConsents");
        IronLog.API.info("LevelPlayPrivacySettings.setGDPRConsents() networkConsents: " + networkConsents);
        C4498kb.d.a().a(networkConsents);
    }
}
