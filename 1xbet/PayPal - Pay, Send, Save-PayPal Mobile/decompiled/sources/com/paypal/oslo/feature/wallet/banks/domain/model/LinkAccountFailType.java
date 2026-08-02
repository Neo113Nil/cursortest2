package com.paypal.oslo.feature.wallet.banks.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkAccountFailType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "serverErrorCode", "Ljava/lang/String;", "getServerErrorCode", "()Ljava/lang/String;", "Companion", "INSTRUMENT_SHARING_LIMIT_EXCEEDED", com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_RISK_DENIED, "BAD_INSTRUMENT", "USER_ACCOUNT_LIMITED", "TERMINAL", "ERROR_NOT_MAPPED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LinkAccountFailType {
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType BAD_INSTRUMENT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType.Companion INSTANCE;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType ERROR_NOT_MAPPED;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType INSTRUMENT_SHARING_LIMIT_EXCEEDED;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType RISK_DENIED;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType TERMINAL;
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType USER_ACCOUNT_LIMITED;
    private static final /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final java.lang.String serverErrorCode;

    private LinkAccountFailType(java.lang.String str, int i, java.lang.String str2) {
        this.serverErrorCode = str2;
    }

    public final java.lang.String getServerErrorCode() {
        return this.serverErrorCode;
    }

    static {
        com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType linkAccountFailType = new com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType("INSTRUMENT_SHARING_LIMIT_EXCEEDED", 0, "INSTRUMENT_SHARING_LIMIT_EXCEEDED");
        INSTRUMENT_SHARING_LIMIT_EXCEEDED = linkAccountFailType;
        com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType linkAccountFailType2 = new com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_RISK_DENIED, 1, com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_RISK_DENIED);
        RISK_DENIED = linkAccountFailType2;
        com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType linkAccountFailType3 = new com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType("BAD_INSTRUMENT", 2, "BAD_INSTRUMENT");
        BAD_INSTRUMENT = linkAccountFailType3;
        com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType linkAccountFailType4 = new com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType("USER_ACCOUNT_LIMITED", 3, "USER_ACCOUNT_LIMITED");
        USER_ACCOUNT_LIMITED = linkAccountFailType4;
        com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType linkAccountFailType5 = new com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType("TERMINAL", 4, null);
        TERMINAL = linkAccountFailType5;
        com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType linkAccountFailType6 = new com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType("ERROR_NOT_MAPPED", 5, null);
        ERROR_NOT_MAPPED = linkAccountFailType6;
        com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType[] linkAccountFailTypeArr = {linkAccountFailType, linkAccountFailType2, linkAccountFailType3, linkAccountFailType4, linkAccountFailType5, linkAccountFailType6};
        getHighSpeedVideoFpsRanges = linkAccountFailTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(linkAccountFailTypeArr);
        INSTANCE = new com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkAccountFailType$Companion;", "", "<init>", "()V", "", "errorCode", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkAccountFailType;", "fromServerErrorCode", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/LinkAccountFailType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType fromServerErrorCode(java.lang.String errorCode) {
            com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType linkAccountFailType;
            com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType[] values = com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    linkAccountFailType = null;
                    break;
                }
                linkAccountFailType = values[i];
                if (kotlin.jvm.internal.Intrinsics.areEqual(linkAccountFailType.getServerErrorCode(), errorCode)) {
                    break;
                }
                i++;
            }
            return linkAccountFailType == null ? com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType.ERROR_NOT_MAPPED : linkAccountFailType;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType[] values() {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType) java.lang.Enum.valueOf(com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.wallet.banks.domain.model.LinkAccountFailType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
