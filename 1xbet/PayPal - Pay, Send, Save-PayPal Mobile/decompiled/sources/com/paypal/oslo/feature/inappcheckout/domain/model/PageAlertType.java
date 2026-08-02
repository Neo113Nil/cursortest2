package com.paypal.oslo.feature.inappcheckout.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/model/PageAlertType;", "", "<init>", "(Ljava/lang/String;I)V", "ADD_CARD", "UPDATE_CARD", "FI_NOT_SELECTED", "CARD_SAVE_ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PageAlertType {
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType ADD_CARD;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType CARD_SAVE_ERROR;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType FI_NOT_SELECTED;
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType UPDATE_CARD;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType[] getHighSpeedVideoSizes;

    private PageAlertType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType pageAlertType = new com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType("ADD_CARD", 0);
        ADD_CARD = pageAlertType;
        com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType pageAlertType2 = new com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType("UPDATE_CARD", 1);
        UPDATE_CARD = pageAlertType2;
        com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType pageAlertType3 = new com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType("FI_NOT_SELECTED", 2);
        FI_NOT_SELECTED = pageAlertType3;
        com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType pageAlertType4 = new com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType("CARD_SAVE_ERROR", 3);
        CARD_SAVE_ERROR = pageAlertType4;
        com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType[] pageAlertTypeArr = {pageAlertType, pageAlertType2, pageAlertType3, pageAlertType4};
        getHighSpeedVideoSizes = pageAlertTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(pageAlertTypeArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType[] values() {
        return (com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
