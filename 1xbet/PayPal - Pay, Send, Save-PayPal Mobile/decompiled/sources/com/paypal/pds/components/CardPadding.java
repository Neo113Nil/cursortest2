package com.paypal.pds.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/pds/components/CardPadding;", "", "Landroidx/compose/ui/unit/Dp;", "p0", "<init>", "(Ljava/lang/String;IF)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getValue-D9Ej5fM$pds_release", "()F", "Padding0", "Padding8", "Padding12", "Padding16"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CardPadding {
    private static final /* synthetic */ com.paypal.pds.components.CardPadding[] Camera2StreamConfigurationMap;
    public static final com.paypal.pds.components.CardPadding Padding0;
    public static final com.paypal.pds.components.CardPadding Padding12;
    public static final com.paypal.pds.components.CardPadding Padding16;
    public static final com.paypal.pds.components.CardPadding Padding8;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private final float value;

    private CardPadding(java.lang.String str, int i, float f) {
        this.value = f;
    }

    /* renamed from: getValue-D9Ej5fM$pds_release, reason: not valid java name and from getter */
    public final float getValue() {
        return this.value;
    }

    static {
        com.paypal.pds.components.CardPadding cardPadding = new com.paypal.pds.components.CardPadding("Padding0", 0, com.paypal.pds.core.ConstantsKt.getSpacing0());
        Padding0 = cardPadding;
        com.paypal.pds.components.CardPadding cardPadding2 = new com.paypal.pds.components.CardPadding("Padding8", 1, com.paypal.pds.core.ConstantsKt.getSpacing8());
        Padding8 = cardPadding2;
        com.paypal.pds.components.CardPadding cardPadding3 = new com.paypal.pds.components.CardPadding("Padding12", 2, com.paypal.pds.core.ConstantsKt.getSpacing12());
        Padding12 = cardPadding3;
        com.paypal.pds.components.CardPadding cardPadding4 = new com.paypal.pds.components.CardPadding("Padding16", 3, com.paypal.pds.core.ConstantsKt.getSpacing16());
        Padding16 = cardPadding4;
        com.paypal.pds.components.CardPadding[] cardPaddingArr = {cardPadding, cardPadding2, cardPadding3, cardPadding4};
        Camera2StreamConfigurationMap = cardPaddingArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(cardPaddingArr);
    }

    public static com.paypal.pds.components.CardPadding[] values() {
        return (com.paypal.pds.components.CardPadding[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.pds.components.CardPadding valueOf(java.lang.String str) {
        return (com.paypal.pds.components.CardPadding) java.lang.Enum.valueOf(com.paypal.pds.components.CardPadding.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.pds.components.CardPadding> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
