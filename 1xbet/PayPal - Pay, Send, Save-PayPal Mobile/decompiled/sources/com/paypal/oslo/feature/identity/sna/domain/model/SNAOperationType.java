package com.paypal.oslo.feature.identity.sna.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAOperationType;", "", "<init>", "(Ljava/lang/String;I)V", "VIEW_CONSENT", "UPDATE_CONSENT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SNAOperationType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType UPDATE_CONSENT;
    public static final com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType VIEW_CONSENT;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType[] getHighSpeedVideoSizes;

    private SNAOperationType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType sNAOperationType = new com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType("VIEW_CONSENT", 0);
        VIEW_CONSENT = sNAOperationType;
        com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType sNAOperationType2 = new com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType("UPDATE_CONSENT", 1);
        UPDATE_CONSENT = sNAOperationType2;
        com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType[] sNAOperationTypeArr = {sNAOperationType, sNAOperationType2};
        getHighSpeedVideoSizes = sNAOperationTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(sNAOperationTypeArr);
    }

    public static com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType[] values() {
        return (com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.sna.domain.model.SNAOperationType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
