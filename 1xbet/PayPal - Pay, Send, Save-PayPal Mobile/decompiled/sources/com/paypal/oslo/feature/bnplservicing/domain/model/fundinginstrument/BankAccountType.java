package com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/BankAccountType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "displayName", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "Companion", "BUSINESS_CHECKING", "BUSINESS_SAVINGS", com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING, "CUSTOM", "NORMAL", "SAVINGS", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BankAccountType {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType BUSINESS_CHECKING;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType BUSINESS_SAVINGS;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType CHECKING;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType CUSTOM;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType NORMAL;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType SAVINGS;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType[] getHighSpeedVideoSizes;
    private final java.lang.String displayName;

    private BankAccountType(java.lang.String str, int i, java.lang.String str2) {
        this.displayName = str2;
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType bankAccountType = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType("BUSINESS_CHECKING", 0, "Business Checking");
        BUSINESS_CHECKING = bankAccountType;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType bankAccountType2 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType("BUSINESS_SAVINGS", 1, "Business Saving");
        BUSINESS_SAVINGS = bankAccountType2;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType bankAccountType3 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType(com.paypal.oslo.feature.savings.constants.SavingsConstants.FinancialInstrument.ACCT_TYPE_CHECKING, 2, "Checking");
        CHECKING = bankAccountType3;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType bankAccountType4 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType("CUSTOM", 3, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.NAME);
        CUSTOM = bankAccountType4;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType bankAccountType5 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType("NORMAL", 4, "Normal");
        NORMAL = bankAccountType5;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType bankAccountType6 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType("SAVINGS", 5, "Saving");
        SAVINGS = bankAccountType6;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType bankAccountType7 = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType("UNKNOWN", 6, "Unknown");
        UNKNOWN = bankAccountType7;
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType[] bankAccountTypeArr = {bankAccountType, bankAccountType2, bankAccountType3, bankAccountType4, bankAccountType5, bankAccountType6, bankAccountType7};
        getHighSpeedVideoSizes = bankAccountTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(bankAccountTypeArr);
        INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/BankAccountType$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/BankAccountType;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/BankAccountType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType) obj).name(), value)) {
                    break;
                }
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType bankAccountType = (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType) obj;
            return bankAccountType == null ? com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType.UNKNOWN : bankAccountType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.BankAccountType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
