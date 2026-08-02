package com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u001aO\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001aA\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/GraphQLOperationType;", "operationType", "", "operationName", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "error", "Lcom/paypal/android/logger/LogLevel;", "level", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "", "logGraphQLOperation", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/common/logger/GraphQLOperationType;Ljava/lang/String;Lcom/paypal/oslo/core/network/graphql/error/CallError;Lcom/paypal/android/logger/LogLevel;Ljava/util/Map;)V", "message", "", "timeoutMs", "logGraphQLTimeout", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NetworkLoggerKt {
    public static /* synthetic */ void logGraphQLOperation$default(com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType graphQLOperationType, java.lang.String str, com.paypal.oslo.core.network.graphql.error.CallError callError, com.paypal.android.logger.LogLevel logLevel, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            callError = null;
        }
        if ((i & 8) != 0) {
            logLevel = com.paypal.android.logger.LogLevel.INFO;
        }
        if ((i & 16) != 0) {
            map = null;
        }
        logGraphQLOperation(graphQLOperationType, str, callError, logLevel, map);
    }

    public static final void logGraphQLOperation(com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType graphQLOperationType, java.lang.String str, com.paypal.oslo.core.network.graphql.error.CallError callError, com.paypal.android.logger.LogLevel logLevel, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        com.paypal.android.logger.categories.LogCategory logCategory;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQLOperationType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "");
        int i = com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.NetworkLoggerKt.WhenMappings.$EnumSwitchMapping$0[graphQLOperationType.ordinal()];
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
        if (callError != null) {
            str2 = "GraphQL operation failed";
        } else {
            str2 = "Executing GraphQL operation";
        }
        java.lang.String str3 = str2;
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put("operation_type", graphQLOperationType.getValue());
        createMapBuilder.put("operation_name", str);
        if (callError != null) {
            createMapBuilder.put("error", callError);
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "Unknown";
            }
            createMapBuilder.put(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.ERROR_TYPE, simpleName);
        }
        if (map != null) {
            for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Object value = entry.getValue();
                if (value != null) {
                    createMapBuilder.put(key, value);
                }
            }
        }
        java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
        if (callError != null) {
            com.paypal.android.logger.standardized.LoggerExtensionsKt.e$default(com.paypal.oslo.feature.revolvingcreditacquisition.LoggerKt.log, com.paypal.android.logger.categories.Network.Error.INSTANCE, str3, build, null, null, 24, null);
            return;
        }
        int i2 = com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.NetworkLoggerKt.WhenMappings.$EnumSwitchMapping$1[logLevel.ordinal()];
        if (i2 == 1) {
            com.paypal.android.logger.standardized.LoggerExtensionsKt.i$default(com.paypal.oslo.feature.revolvingcreditacquisition.LoggerKt.log, logCategory, str3, build, null, 8, null);
        } else if (i2 == 2) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.revolvingcreditacquisition.LoggerKt.log, str3, build, null, 4, null);
        } else {
            com.paypal.android.logger.standardized.LoggerExtensionsKt.i$default(com.paypal.oslo.feature.revolvingcreditacquisition.LoggerKt.log, logCategory, str3, build, null, 8, null);
        }
    }

    public static /* synthetic */ void logGraphQLTimeout$default(java.lang.String str, java.lang.String str2, long j, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            map = null;
        }
        logGraphQLTimeout(str, str2, j, map);
    }

    public static final void logGraphQLTimeout(java.lang.String str, java.lang.String str2, long j, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put("operation_name", str2);
        createMapBuilder.put("timeout_ms", java.lang.Long.valueOf(j));
        if (map != null) {
            for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Object value = entry.getValue();
                if (value != null) {
                    createMapBuilder.put(key, value);
                }
            }
        }
        com.paypal.android.logger.standardized.LoggerExtensionsKt.w$default(com.paypal.oslo.feature.revolvingcreditacquisition.LoggerKt.log, com.paypal.android.logger.categories.Network.Timeout.INSTANCE, str, kotlin.collections.MapsKt.build(createMapBuilder), null, 8, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType.QUERY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType.MUTATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditacquisition.ui.common.logger.GraphQLOperationType.SUBSCRIPTION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.android.logger.LogLevel.values().length];
            try {
                iArr2[com.paypal.android.logger.LogLevel.INFO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.android.logger.LogLevel.DEBUG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
