package com.paypal.oslo.core.i18n.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/Style;", "", "<init>", "(Ljava/lang/String;I)V", "E164", "INTERNATIONAL", "NATIONAL", "RFC3966"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Style {
    public static final com.paypal.oslo.core.i18n.domain.model.Style E164;
    public static final com.paypal.oslo.core.i18n.domain.model.Style INTERNATIONAL;
    public static final com.paypal.oslo.core.i18n.domain.model.Style NATIONAL;
    public static final com.paypal.oslo.core.i18n.domain.model.Style RFC3966;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.Style[] getHighSpeedVideoSizes;

    private Style(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.i18n.domain.model.Style style = new com.paypal.oslo.core.i18n.domain.model.Style("E164", 0);
        E164 = style;
        com.paypal.oslo.core.i18n.domain.model.Style style2 = new com.paypal.oslo.core.i18n.domain.model.Style("INTERNATIONAL", 1);
        INTERNATIONAL = style2;
        com.paypal.oslo.core.i18n.domain.model.Style style3 = new com.paypal.oslo.core.i18n.domain.model.Style("NATIONAL", 2);
        NATIONAL = style3;
        com.paypal.oslo.core.i18n.domain.model.Style style4 = new com.paypal.oslo.core.i18n.domain.model.Style("RFC3966", 3);
        RFC3966 = style4;
        com.paypal.oslo.core.i18n.domain.model.Style[] styleArr = {style, style2, style3, style4};
        getHighSpeedVideoSizes = styleArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(styleArr);
    }

    public static com.paypal.oslo.core.i18n.domain.model.Style[] values() {
        return (com.paypal.oslo.core.i18n.domain.model.Style[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.core.i18n.domain.model.Style valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.i18n.domain.model.Style) java.lang.Enum.valueOf(com.paypal.oslo.core.i18n.domain.model.Style.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.i18n.domain.model.Style> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
