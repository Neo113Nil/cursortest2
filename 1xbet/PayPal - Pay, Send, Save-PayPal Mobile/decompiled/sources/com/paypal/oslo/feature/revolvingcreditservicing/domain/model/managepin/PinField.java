package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managepin/PinField;", "", "<init>", "(Ljava/lang/String;I)V", "PIN", "CONFIRMATION"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PinField {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField CONFIRMATION;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField PIN;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private PinField(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField pinField = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField("PIN", 0);
        PIN = pinField;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField pinField2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField("CONFIRMATION", 1);
        CONFIRMATION = pinField2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField[] pinFieldArr = {pinField, pinField2};
        getHighSpeedVideoFpsRanges = pinFieldArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(pinFieldArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
