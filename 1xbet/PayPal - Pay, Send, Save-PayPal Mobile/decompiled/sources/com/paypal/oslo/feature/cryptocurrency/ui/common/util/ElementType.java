package com.paypal.oslo.feature.cryptocurrency.ui.common.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/util/ElementType;", "", "<init>", "(Ljava/lang/String;I)V", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ElementType {
    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType[] getHighSpeedVideoFpsRangesFor;

    private ElementType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType elementType = new com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType("LINK", 0);
        getHighResolutionOutputSizeshNQ4ISI = elementType;
        com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType elementType2 = new com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType("STYLED_TAG", 1);
        Camera2StreamConfigurationMap = elementType2;
        com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType[] elementTypeArr = {elementType, elementType2};
        getHighSpeedVideoFpsRangesFor = elementTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(elementTypeArr);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType[] values() {
        return (com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType) java.lang.Enum.valueOf(com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType.class, str);
    }
}
