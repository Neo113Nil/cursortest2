package com.paypal.oslo.feature.inappcheckout.domain.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrumentStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "USABLE", "DISALLOWED", "DECLINED", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FundingInstrumentStatus {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus DECLINED;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus DISALLOWED;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus UNKNOWN__;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus USABLE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus[] getHighSpeedVideoFpsRangesFor;

    private FundingInstrumentStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus fundingInstrumentStatus = new com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus("USABLE", 0);
        USABLE = fundingInstrumentStatus;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus fundingInstrumentStatus2 = new com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus("DISALLOWED", 1);
        DISALLOWED = fundingInstrumentStatus2;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus fundingInstrumentStatus3 = new com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus("DECLINED", 2);
        DECLINED = fundingInstrumentStatus3;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus fundingInstrumentStatus4 = new com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus("UNKNOWN__", 3);
        UNKNOWN__ = fundingInstrumentStatus4;
        com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus[] fundingInstrumentStatusArr = {fundingInstrumentStatus, fundingInstrumentStatus2, fundingInstrumentStatus3, fundingInstrumentStatus4};
        getHighSpeedVideoFpsRangesFor = fundingInstrumentStatusArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(fundingInstrumentStatusArr);
        INSTANCE = new com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrumentStatus$Companion;", "", "<init>", "()V", "", "name", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrumentStatus;", "valueFrom", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrumentStatus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus valueFrom(java.lang.String name2) {
            java.lang.Object obj;
            if (name2 != null) {
                java.util.Iterator<E> it = com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus) obj).name(), name2)) {
                        break;
                    }
                }
                com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus fundingInstrumentStatus = (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus) obj;
                if (fundingInstrumentStatus != null) {
                    return fundingInstrumentStatus;
                }
            }
            return com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus.UNKNOWN__;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus[] values() {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentStatus> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
