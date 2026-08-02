package com.paypal.oslo.feature.businessinventory.di;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/di/SaveButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "Save", "SaveAndApply"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SaveButtonType {
    public static final com.paypal.oslo.feature.businessinventory.di.SaveButtonType Save;
    public static final com.paypal.oslo.feature.businessinventory.di.SaveButtonType SaveAndApply;
    private static final /* synthetic */ com.paypal.oslo.feature.businessinventory.di.SaveButtonType[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private SaveButtonType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businessinventory.di.SaveButtonType saveButtonType = new com.paypal.oslo.feature.businessinventory.di.SaveButtonType("Save", 0);
        Save = saveButtonType;
        com.paypal.oslo.feature.businessinventory.di.SaveButtonType saveButtonType2 = new com.paypal.oslo.feature.businessinventory.di.SaveButtonType("SaveAndApply", 1);
        SaveAndApply = saveButtonType2;
        com.paypal.oslo.feature.businessinventory.di.SaveButtonType[] saveButtonTypeArr = {saveButtonType, saveButtonType2};
        getHighSpeedVideoFpsRangesFor = saveButtonTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(saveButtonTypeArr);
    }

    public static com.paypal.oslo.feature.businessinventory.di.SaveButtonType[] values() {
        return (com.paypal.oslo.feature.businessinventory.di.SaveButtonType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.businessinventory.di.SaveButtonType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businessinventory.di.SaveButtonType) java.lang.Enum.valueOf(com.paypal.oslo.feature.businessinventory.di.SaveButtonType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businessinventory.di.SaveButtonType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
