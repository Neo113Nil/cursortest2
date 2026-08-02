package com.paypal.oslo.core.telemetry.analytics.schema.context.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/context/domain/SORType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "TRANSACTION", "MERCHANT", "INVOICE", "PIE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SORType {
    public static final com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType INVOICE;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType MERCHANT;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType PIE;
    public static final com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType TRANSACTION;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType[] getHighSpeedVideoSizes;
    private final java.lang.String key;

    private SORType(java.lang.String str, int i, java.lang.String str2) {
        this.key = str2;
    }

    public final java.lang.String getKey() {
        return this.key;
    }

    static {
        com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType sORType = new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType("TRANSACTION", 0, "transaction");
        TRANSACTION = sORType;
        com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType sORType2 = new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType("MERCHANT", 1, "merchant");
        MERCHANT = sORType2;
        com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType sORType3 = new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType("INVOICE", 2, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.TransactionContextValues.TransactionType.Invoice);
        INVOICE = sORType3;
        com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType sORType4 = new com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType("PIE", 3, "pie");
        PIE = sORType4;
        com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType[] sORTypeArr = {sORType, sORType2, sORType3, sORType4};
        getHighSpeedVideoSizes = sORTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(sORTypeArr);
    }

    public static com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType[] values() {
        return (com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType) java.lang.Enum.valueOf(com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.telemetry.analytics.schema.context.domain.SORType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
