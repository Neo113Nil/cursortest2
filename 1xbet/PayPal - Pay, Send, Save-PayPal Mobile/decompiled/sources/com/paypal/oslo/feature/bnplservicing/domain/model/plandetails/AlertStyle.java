package com.paypal.oslo.feature.bnplservicing.domain.model.plandetails;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/AlertStyle;", "", "<init>", "(Ljava/lang/String;I)V", "INFO", "WARNING", "CRITICAL"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AlertStyle {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.AlertStyle CRITICAL;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.AlertStyle INFO;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.AlertStyle WARNING;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.AlertStyle[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private AlertStyle(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.AlertStyle alertStyle = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.AlertStyle("INFO", 0);
        INFO = alertStyle;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.AlertStyle alertStyle2 = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.AlertStyle("WARNING", 1);
        WARNING = alertStyle2;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.AlertStyle alertStyle3 = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.AlertStyle("CRITICAL", 2);
        CRITICAL = alertStyle3;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.AlertStyle[] alertStyleArr = {alertStyle, alertStyle2, alertStyle3};
        getHighSpeedVideoFpsRanges = alertStyleArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(alertStyleArr);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.AlertStyle[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.AlertStyle[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.AlertStyle valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.AlertStyle) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.AlertStyle.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.AlertStyle> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
