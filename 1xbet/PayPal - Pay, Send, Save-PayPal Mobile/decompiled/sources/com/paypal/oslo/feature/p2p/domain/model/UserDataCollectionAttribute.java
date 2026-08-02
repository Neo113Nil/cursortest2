package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/UserDataCollectionAttribute;", "", "<init>", "(Ljava/lang/String;I)V", "RECEIVER_NAME", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UserDataCollectionAttribute {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute RECEIVER_NAME;
    public static final com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute[] getHighResolutionOutputSizeshNQ4ISI;

    private UserDataCollectionAttribute(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute userDataCollectionAttribute = new com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute("RECEIVER_NAME", 0);
        RECEIVER_NAME = userDataCollectionAttribute;
        com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute userDataCollectionAttribute2 = new com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute("UNKNOWN", 1);
        UNKNOWN = userDataCollectionAttribute2;
        com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute[] userDataCollectionAttributeArr = {userDataCollectionAttribute, userDataCollectionAttribute2};
        getHighResolutionOutputSizeshNQ4ISI = userDataCollectionAttributeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(userDataCollectionAttributeArr);
    }

    public static com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
