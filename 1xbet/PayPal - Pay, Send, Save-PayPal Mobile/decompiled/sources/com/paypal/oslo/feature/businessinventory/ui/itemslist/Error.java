package com.paypal.oslo.feature.businessinventory.ui.itemslist;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/itemslist/Error;", "", "<init>", "(Ljava/lang/String;)V", "LOAD_ITEMS_FAILED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Error {
    public static final com.paypal.oslo.feature.businessinventory.ui.itemslist.Error LOAD_ITEMS_FAILED;
    private static final /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.itemslist.Error[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private Error(java.lang.String str) {
    }

    static {
        com.paypal.oslo.feature.businessinventory.ui.itemslist.Error error = new com.paypal.oslo.feature.businessinventory.ui.itemslist.Error("LOAD_ITEMS_FAILED");
        LOAD_ITEMS_FAILED = error;
        com.paypal.oslo.feature.businessinventory.ui.itemslist.Error[] errorArr = {error};
        getHighSpeedVideoFpsRanges = errorArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(errorArr);
    }

    public static com.paypal.oslo.feature.businessinventory.ui.itemslist.Error[] values() {
        return (com.paypal.oslo.feature.businessinventory.ui.itemslist.Error[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.businessinventory.ui.itemslist.Error valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businessinventory.ui.itemslist.Error) java.lang.Enum.valueOf(com.paypal.oslo.feature.businessinventory.ui.itemslist.Error.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businessinventory.ui.itemslist.Error> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
