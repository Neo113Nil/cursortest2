package com.paypal.oslo.api.graphql.schema.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MerchantTapToPayOnboardingStatus;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "rawValue", "Ljava/lang/String;", "getRawValue", "()Ljava/lang/String;", "Companion", kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, "SUBMITTED", "IN_REVIEW", "NEED_MORE_DATA", "APPROVED", "SUBSCRIBED", com.paypal.oslo.downloads.impl.DownloadStateValue.PAUSED, com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MerchantTapToPayOnboardingStatus {
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus APPROVED;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus CANCELLED;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus CREATED;
    private static final /* synthetic */ com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.Companion INSTANCE;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus DENIED;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus IN_REVIEW;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus NEED_MORE_DATA;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus PAUSED;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus SUBMITTED;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus SUBSCRIBED;
    public static final com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final com.apollographql.apollo.api.EnumType type;
    private final java.lang.String rawValue;

    private MerchantTapToPayOnboardingStatus(java.lang.String str, int i, java.lang.String str2) {
        this.rawValue = str2;
    }

    public final java.lang.String getRawValue() {
        return this.rawValue;
    }

    static {
        com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus merchantTapToPayOnboardingStatus = new com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, 0, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED);
        CREATED = merchantTapToPayOnboardingStatus;
        com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus merchantTapToPayOnboardingStatus2 = new com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus("SUBMITTED", 1, "SUBMITTED");
        SUBMITTED = merchantTapToPayOnboardingStatus2;
        com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus merchantTapToPayOnboardingStatus3 = new com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus("IN_REVIEW", 2, "IN_REVIEW");
        IN_REVIEW = merchantTapToPayOnboardingStatus3;
        com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus merchantTapToPayOnboardingStatus4 = new com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus("NEED_MORE_DATA", 3, "NEED_MORE_DATA");
        NEED_MORE_DATA = merchantTapToPayOnboardingStatus4;
        com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus merchantTapToPayOnboardingStatus5 = new com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus("APPROVED", 4, "APPROVED");
        APPROVED = merchantTapToPayOnboardingStatus5;
        com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus merchantTapToPayOnboardingStatus6 = new com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus("SUBSCRIBED", 5, "SUBSCRIBED");
        SUBSCRIBED = merchantTapToPayOnboardingStatus6;
        com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus merchantTapToPayOnboardingStatus7 = new com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.PAUSED, 6, com.paypal.oslo.downloads.impl.DownloadStateValue.PAUSED);
        PAUSED = merchantTapToPayOnboardingStatus7;
        com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus merchantTapToPayOnboardingStatus8 = new com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus(com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, 7, com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED);
        DENIED = merchantTapToPayOnboardingStatus8;
        com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus merchantTapToPayOnboardingStatus9 = new com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus(com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED, 8, com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED);
        CANCELLED = merchantTapToPayOnboardingStatus9;
        com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus merchantTapToPayOnboardingStatus10 = new com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus("UNKNOWN__", 9, "UNKNOWN__");
        UNKNOWN__ = merchantTapToPayOnboardingStatus10;
        com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus[] merchantTapToPayOnboardingStatusArr = {merchantTapToPayOnboardingStatus, merchantTapToPayOnboardingStatus2, merchantTapToPayOnboardingStatus3, merchantTapToPayOnboardingStatus4, merchantTapToPayOnboardingStatus5, merchantTapToPayOnboardingStatus6, merchantTapToPayOnboardingStatus7, merchantTapToPayOnboardingStatus8, merchantTapToPayOnboardingStatus9, merchantTapToPayOnboardingStatus10};
        Camera2StreamConfigurationMap = merchantTapToPayOnboardingStatusArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(merchantTapToPayOnboardingStatusArr);
        INSTANCE = new com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.Companion(null);
        type = new com.apollographql.apollo.api.EnumType("MerchantTapToPayOnboardingStatus", kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED, "SUBMITTED", "IN_REVIEW", "NEED_MORE_DATA", "APPROVED", "SUBSCRIBED", com.paypal.oslo.downloads.impl.DownloadStateValue.PAUSED, com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError.GraphQLError.ERROR_ISSUE_DENIED, com.paypal.oslo.downloads.impl.DownloadStateValue.CANCELLED}));
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/MerchantTapToPayOnboardingStatus$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/api/graphql/schema/type/MerchantTapToPayOnboardingStatus;", "knownValues", "()[Lcom/paypal/oslo/api/graphql/schema/type/MerchantTapToPayOnboardingStatus;", "", "rawValue", "safeValueOf", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/MerchantTapToPayOnboardingStatus;", "Lcom/apollographql/apollo/api/EnumType;", "type", "Lcom/apollographql/apollo/api/EnumType;", "getType", "()Lcom/apollographql/apollo/api/EnumType;", "", "getKnownEntries", "()Ljava/util/List;", "knownEntries"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.apollographql.apollo.api.EnumType getType() {
            return com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.type;
        }

        public final java.util.List<com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus> getKnownEntries() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus[]{com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.CREATED, com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.SUBMITTED, com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.IN_REVIEW, com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.NEED_MORE_DATA, com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.APPROVED, com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.SUBSCRIBED, com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.PAUSED, com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.DENIED, com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.CANCELLED});
        }

        @kotlin.Deprecated(message = "Use knownEntries instead", replaceWith = @kotlin.ReplaceWith(expression = "this.knownEntries", imports = {}))
        public final com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus[] knownValues() {
            return (com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus[]) getKnownEntries().toArray(new com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus[0]);
        }

        public final com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus safeValueOf(java.lang.String rawValue) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawValue, "");
            java.util.Iterator<E> it = com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus) obj).getRawValue(), rawValue)) {
                    break;
                }
            }
            com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus merchantTapToPayOnboardingStatus = (com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus) obj;
            return merchantTapToPayOnboardingStatus == null ? com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.UNKNOWN__ : merchantTapToPayOnboardingStatus;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus[] values() {
        return (com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus) java.lang.Enum.valueOf(com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.api.graphql.schema.type.MerchantTapToPayOnboardingStatus> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
