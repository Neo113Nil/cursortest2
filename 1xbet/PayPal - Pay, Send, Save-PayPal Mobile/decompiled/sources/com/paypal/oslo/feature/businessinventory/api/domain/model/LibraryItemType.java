package com.paypal.oslo.feature.businessinventory.api.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/api/domain/model/LibraryItemType;", "", "<init>", "(Ljava/lang/String;I)V", "PRODUCT", "SERVICE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LibraryItemType {
    public static final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType PRODUCT;
    public static final com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType SERVICE;
    private static final /* synthetic */ com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private LibraryItemType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType libraryItemType = new com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType("PRODUCT", 0);
        PRODUCT = libraryItemType;
        com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType libraryItemType2 = new com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType("SERVICE", 1);
        SERVICE = libraryItemType2;
        com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType[] libraryItemTypeArr = {libraryItemType, libraryItemType2};
        getHighResolutionOutputSizeshNQ4ISI = libraryItemTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(libraryItemTypeArr);
    }

    public static com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType[] values() {
        return (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType) java.lang.Enum.valueOf(com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businessinventory.api.domain.model.LibraryItemType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
