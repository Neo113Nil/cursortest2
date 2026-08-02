package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIOfferStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ACCEPTED", "DECLINED", "EXPIRED_DECLINED", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, "REVOKED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CLIOfferStatus {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus ACCEPTED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus.Companion INSTANCE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus DECLINED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus EXPIRED_DECLINED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus PENDING;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus REVOKED;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus[] getHighSpeedVideoFpsRanges;

    private CLIOfferStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus cLIOfferStatus = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus("ACCEPTED", 0);
        ACCEPTED = cLIOfferStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus cLIOfferStatus2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus("DECLINED", 1);
        DECLINED = cLIOfferStatus2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus cLIOfferStatus3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus("EXPIRED_DECLINED", 2);
        EXPIRED_DECLINED = cLIOfferStatus3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus cLIOfferStatus4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, 3);
        PENDING = cLIOfferStatus4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus cLIOfferStatus5 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus("REVOKED", 4);
        REVOKED = cLIOfferStatus5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus[] cLIOfferStatusArr = {cLIOfferStatus, cLIOfferStatus2, cLIOfferStatus3, cLIOfferStatus4, cLIOfferStatus5};
        getHighSpeedVideoFpsRanges = cLIOfferStatusArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(cLIOfferStatusArr);
        INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIOfferStatus$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIOfferStatus;", "fromString", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIOfferStatus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus fromString(java.lang.String value) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus) obj).name(), value)) {
                    break;
                }
            }
            return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus) obj;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
