package com.paypal.oslo.feature.inappcheckout.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/IntegrationType;", "", "<init>", "(Ljava/lang/String;I)V", "EDIT_STICKY_FI", "INTEGRATOR", "MERCHANT", "META", "PLATFORM"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class IntegrationType {
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType EDIT_STICKY_FI;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType INTEGRATOR;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType MERCHANT;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType META;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType PLATFORM;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private IntegrationType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType integrationType = new com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType("EDIT_STICKY_FI", 0);
        EDIT_STICKY_FI = integrationType;
        com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType integrationType2 = new com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType("INTEGRATOR", 1);
        INTEGRATOR = integrationType2;
        com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType integrationType3 = new com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType("MERCHANT", 2);
        MERCHANT = integrationType3;
        com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType integrationType4 = new com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType("META", 3);
        META = integrationType4;
        com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType integrationType5 = new com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType("PLATFORM", 4);
        PLATFORM = integrationType5;
        com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType[] integrationTypeArr = {integrationType, integrationType2, integrationType3, integrationType4, integrationType5};
        getHighResolutionOutputSizeshNQ4ISI = integrationTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(integrationTypeArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType[] values() {
        return (com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.domain.model.IntegrationType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
