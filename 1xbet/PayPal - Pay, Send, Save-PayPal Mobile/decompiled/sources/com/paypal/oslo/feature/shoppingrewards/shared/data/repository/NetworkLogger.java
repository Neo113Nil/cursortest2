package com.paypal.oslo.feature.shoppingrewards.shared.data.repository;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00070\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR!\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u000f*\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R/\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u000f\"\u0004\b\u0000\u0010\u0004*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00078G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0013R;\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u000f\"\u0004\b\u0000\u0010\u0004*\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00070\u00058G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/data/repository/NetworkLogger;", "", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/data/repository/NetworkLogger$GraphQLOperationType;", "operationType", "", "operationName", "", "logGraphQLOperation", "(Larrow/core/Ior;Lcom/paypal/oslo/feature/shoppingrewards/shared/data/repository/NetworkLogger$GraphQLOperationType;Ljava/lang/String;)V", "", "getAsAttributeMap", "(Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResultError;)Ljava/util/Map;", "asAttributeMap", "(Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;)Ljava/util/Map;", "getLogAttributes", "(Larrow/core/Ior;)Ljava/util/Map;", "logAttributes", "GraphQLOperationType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NetworkLogger {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger INSTANCE = new com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger();

    private NetworkLogger() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/data/repository/NetworkLogger$GraphQLOperationType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "QUERY", "MUTATION", "SUBSCRIPTION"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class GraphQLOperationType {
        public static final com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType MUTATION;
        public static final com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType QUERY;
        public static final com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType SUBSCRIPTION;
        private static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType[] getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;
        private final java.lang.String value;

        private GraphQLOperationType(java.lang.String str, int i, java.lang.String str2) {
            this.value = str2;
        }

        public final java.lang.String getValue() {
            return this.value;
        }

        static {
            com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType graphQLOperationType = new com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType("QUERY", 0, "query");
            QUERY = graphQLOperationType;
            com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType graphQLOperationType2 = new com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType("MUTATION", 1, "mutation");
            MUTATION = graphQLOperationType2;
            com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType graphQLOperationType3 = new com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType("SUBSCRIPTION", 2, "subscription");
            SUBSCRIPTION = graphQLOperationType3;
            com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType[] graphQLOperationTypeArr = {graphQLOperationType, graphQLOperationType2, graphQLOperationType3};
            getHighSpeedVideoFpsRanges = graphQLOperationTypeArr;
            getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(graphQLOperationTypeArr);
        }

        public static com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType[] values() {
            return (com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType[]) getHighSpeedVideoFpsRanges.clone();
        }

        public static com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType) java.lang.Enum.valueOf(com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType> getEntries() {
            return getHighSpeedVideoSizes;
        }
    }

    public final <R> void logGraphQLOperation(arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<? extends R>> ior, com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType graphQLOperationType, java.lang.String str) {
        com.paypal.android.logger.categories.LogCategory logCategory;
        java.lang.String correlationId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ior, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLOperationType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int i = com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.WhenMappings.$EnumSwitchMapping$0[graphQLOperationType.ordinal()];
        if (i == 1) {
            logCategory = com.paypal.android.logger.categories.Network.GraphQLQuery.INSTANCE;
        } else if (i == 2) {
            logCategory = com.paypal.android.logger.categories.Network.GraphQLMutation.INSTANCE;
        } else {
            if (i != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            logCategory = com.paypal.android.logger.categories.Network.GraphQLSubscription.INSTANCE;
        }
        boolean z = ior instanceof arrow.core.Ior.Both;
        if (z) {
            correlationId = ((com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult) ((arrow.core.Ior.Both) ior).getRightValue()).getCorrelationId();
        } else if (ior instanceof arrow.core.Ior.Left) {
            correlationId = ((com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError) ((arrow.core.Ior.Left) ior).getValue()).getCorrelationId();
        } else {
            if (!(ior instanceof arrow.core.Ior.Right)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            correlationId = ((com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult) ((arrow.core.Ior.Right) ior).getValue()).getCorrelationId();
        }
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put("operation_type", graphQLOperationType.getValue());
        createMapBuilder.put("operation_name", str);
        createMapBuilder.put("correlation_id", correlationId);
        java.util.Map plus = kotlin.collections.MapsKt.plus(kotlin.collections.MapsKt.build(createMapBuilder), getLogAttributes(ior));
        if (z) {
            com.paypal.android.logger.standardized.LoggerExtensionsKt.w$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, com.paypal.android.logger.categories.Network.Error.INSTANCE, "GraphQL operation execution", plus, null, 8, null);
        } else if (ior instanceof arrow.core.Ior.Left) {
            com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, com.paypal.android.logger.categories.Network.Error.INSTANCE, "GraphQL operation execution", plus, null, null, 24, null);
        } else {
            if (!(ior instanceof arrow.core.Ior.Right)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.standardized.LoggerExtensionsKt.i$default(com.paypal.oslo.feature.shoppingrewards.LoggerKt.log, logCategory, "GraphQL operation execution", plus, null, 8, null);
        }
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getAsAttributeMap(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError dataResultError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataResultError, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put("error", dataResultError);
        createMapBuilder.put("operation_status", "Error");
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    public final <R> java.util.Map<java.lang.String, java.lang.Object> getAsAttributeMap(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<? extends R> dataResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataResult, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put("result", dataResult);
        createMapBuilder.put("operation_status", "Success");
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    public final <R> java.util.Map<java.lang.String, java.lang.Object> getLogAttributes(arrow.core.Ior<? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError, ? extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<? extends R>> ior) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ior, "");
        if (ior instanceof arrow.core.Ior.Both) {
            arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
            return kotlin.collections.MapsKt.plus(kotlin.collections.MapsKt.plus(getAsAttributeMap((com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError) both.getLeftValue()), getAsAttributeMap((com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult) both.getRightValue())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("operation_status", "Partial Data with Error")));
        }
        if (ior instanceof arrow.core.Ior.Left) {
            return getAsAttributeMap((com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResultError) ((arrow.core.Ior.Left) ior).getValue());
        }
        if (!(ior instanceof arrow.core.Ior.Right)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return getAsAttributeMap((com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult) ((arrow.core.Ior.Right) ior).getValue());
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType.values().length];
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType.QUERY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType.MUTATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.shoppingrewards.shared.data.repository.NetworkLogger.GraphQLOperationType.SUBSCRIPTION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
