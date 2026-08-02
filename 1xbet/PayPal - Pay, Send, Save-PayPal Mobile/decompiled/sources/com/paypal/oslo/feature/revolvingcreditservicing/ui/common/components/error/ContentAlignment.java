package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ContentAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "CENTER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ContentAlignment {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment CENTER;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment TOP;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private ContentAlignment(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment contentAlignment = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment("TOP", 0);
        TOP = contentAlignment;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment contentAlignment2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment("CENTER", 1);
        CENTER = contentAlignment2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment[] contentAlignmentArr = {contentAlignment, contentAlignment2};
        getHighResolutionOutputSizeshNQ4ISI = contentAlignmentArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(contentAlignmentArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContentAlignment> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
