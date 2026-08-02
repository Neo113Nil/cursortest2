package com.paypal.oslo.feature.inappcheckout.domain.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/EditStickyFiScenarioEnum;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "REGULAR", "ERROR_HANDLING", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EditStickyFiScenarioEnum {
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum ERROR_HANDLING;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum NONE;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum REGULAR;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum[] getHighSpeedVideoFpsRangesFor;

    private EditStickyFiScenarioEnum(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum editStickyFiScenarioEnum = new com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum("NONE", 0);
        NONE = editStickyFiScenarioEnum;
        com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum editStickyFiScenarioEnum2 = new com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum("REGULAR", 1);
        REGULAR = editStickyFiScenarioEnum2;
        com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum editStickyFiScenarioEnum3 = new com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum("ERROR_HANDLING", 2);
        ERROR_HANDLING = editStickyFiScenarioEnum3;
        com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum editStickyFiScenarioEnum4 = new com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum("UNKNOWN__", 3);
        UNKNOWN__ = editStickyFiScenarioEnum4;
        com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum[] editStickyFiScenarioEnumArr = {editStickyFiScenarioEnum, editStickyFiScenarioEnum2, editStickyFiScenarioEnum3, editStickyFiScenarioEnum4};
        getHighSpeedVideoFpsRangesFor = editStickyFiScenarioEnumArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(editStickyFiScenarioEnumArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum[] values() {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.domain.entity.EditStickyFiScenarioEnum> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
