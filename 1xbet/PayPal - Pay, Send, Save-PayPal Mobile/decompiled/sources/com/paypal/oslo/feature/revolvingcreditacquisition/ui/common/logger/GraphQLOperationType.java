package com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/GraphQLOperationType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "QUERY", "MUTATION", "SUBSCRIPTION"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GraphQLOperationType {
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType MUTATION;
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType QUERY;
    public static final com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType SUBSCRIPTION;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String value;

    private GraphQLOperationType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType graphQLOperationType = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType("QUERY", 0, "query");
        QUERY = graphQLOperationType;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType graphQLOperationType2 = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType("MUTATION", 1, "mutation");
        MUTATION = graphQLOperationType2;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType graphQLOperationType3 = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType("SUBSCRIPTION", 2, "subscription");
        SUBSCRIPTION = graphQLOperationType3;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType[] graphQLOperationTypeArr = {graphQLOperationType, graphQLOperationType2, graphQLOperationType3};
        Camera2StreamConfigurationMap = graphQLOperationTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(graphQLOperationTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
