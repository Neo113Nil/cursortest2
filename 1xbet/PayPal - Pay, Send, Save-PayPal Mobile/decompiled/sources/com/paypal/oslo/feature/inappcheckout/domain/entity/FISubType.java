package com.paypal.oslo.feature.inappcheckout.domain.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FISubType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "DEBIT", "CREDIT", "SAVINGS", com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING, "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FISubType {
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType CHECKING;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType CREDIT;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType DEBIT;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType SAVINGS;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType[] getHighSpeedVideoFpsRanges;

    private FISubType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType fISubType = new com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType("DEBIT", 0);
        DEBIT = fISubType;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType fISubType2 = new com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType("CREDIT", 1);
        CREDIT = fISubType2;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType fISubType3 = new com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType("SAVINGS", 2);
        SAVINGS = fISubType3;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType fISubType4 = new com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType(com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING, 3);
        CHECKING = fISubType4;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType fISubType5 = new com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType("UNKNOWN__", 4);
        UNKNOWN__ = fISubType5;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType[] fISubTypeArr = {fISubType, fISubType2, fISubType3, fISubType4, fISubType5};
        getHighSpeedVideoFpsRanges = fISubTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(fISubTypeArr);
        INSTANCE = new com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FISubType$Companion;", "", "<init>", "()V", "", "name", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FISubType;", "valueFrom", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FISubType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType valueFrom(java.lang.String name2) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType) obj).name(), name2)) {
                    break;
                }
            }
            com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType fISubType = (com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType) obj;
            return fISubType == null ? com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType.UNKNOWN__ : fISubType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType[] values() {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.domain.entity.FISubType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
