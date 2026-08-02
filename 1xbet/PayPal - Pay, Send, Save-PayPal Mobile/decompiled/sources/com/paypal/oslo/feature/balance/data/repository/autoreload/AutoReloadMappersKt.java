package com.paypal.oslo.feature.balance.data.repository.autoreload;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\f\u001a\u00060\nj\u0002`\u000b*\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u00100\u000e*\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000e*\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000e\"\u0004\b\u0000\u0010\u0017*\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010!\u001a\u00020\u001b2\u000e\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010$\u001a\u00020\u001b*\u00020#H\u0000¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010&\u001a\u00020\u001b*\u00020#H\u0000¢\u0006\u0004\b&\u0010%"}, d2 = {"", "thresholdData", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/LowBalanceConfig;", "parseThresholdConfig", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/balance/domain/model/autoreload/LowBalanceConfig;", "frequencyData", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/ScheduledConfig;", "parseFrequencyConfig", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/balance/domain/model/autoreload/ScheduledConfig;", "", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadScheduleType;", "Lcom/paypal/oslo/feature/balance/graphql/type/BalanceAutoReloadScheduleType;", "toBalanceAutoReloadScheduleType", "(Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadScheduleType;", "Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadRecurrence;", "Lcom/paypal/oslo/feature/balance/graphql/type/BalanceAutoReloadRecurrence;", "toBalanceAutoReloadRecurrence", "(Ljava/lang/String;)Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyInput;", "toMoneyInput", "(Lcom/paypal/oslo/feature/balance/domain/model/Money;)Lcom/apollographql/apollo/api/Optional;", "T", "toOptional", "(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Optional;", "Lcom/paypal/oslo/core/network/graphql/error/CallError$GraphQL;", "Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "mapToAutoReloadError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError$GraphQL;)Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadOperationStatus;", "Lcom/paypal/oslo/feature/balance/graphql/type/BalanceAutoReloadOperationStatus;", "operationStatus", "mapOperationStatus", "(Lcom/paypal/oslo/api/graphql/schema/type/BalanceAutoReloadOperationStatus;)Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "toAutoReloadError", "(Lcom/paypal/oslo/core/network/graphql/error/CallError;)Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "toAutoReloadFIError"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoReloadMappersKt {
    public static final com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig parseThresholdConfig(java.lang.Object obj) {
        if (obj != null) {
            com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig lowBalanceConfig = null;
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdConfig thresholdConfig = obj instanceof com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdConfig ? (com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.ThresholdConfig) obj : null;
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadThreshold onBalanceAutoReloadThreshold = thresholdConfig != null ? thresholdConfig.getOnBalanceAutoReloadThreshold() : null;
            if (onBalanceAutoReloadThreshold != null) {
                java.lang.String balanceId = onBalanceAutoReloadThreshold.getBalanceId();
                java.lang.String financialInstrumentId = onBalanceAutoReloadThreshold.getFinancialInstrumentId();
                java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(onBalanceAutoReloadThreshold.getReloadAmount().getValue());
                if (bigDecimalOrNull == null) {
                    bigDecimalOrNull = java.math.BigDecimal.ZERO;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull);
                com.paypal.oslo.feature.balance.domain.model.Money money = new com.paypal.oslo.feature.balance.domain.model.Money(bigDecimalOrNull, com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(onBalanceAutoReloadThreshold.getReloadAmount().getCurrencyCode().toString()), null);
                java.math.BigDecimal bigDecimalOrNull2 = kotlin.text.StringsKt.toBigDecimalOrNull(onBalanceAutoReloadThreshold.getThresholdAmount().getValue());
                if (bigDecimalOrNull2 == null) {
                    bigDecimalOrNull2 = java.math.BigDecimal.ZERO;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull2);
                lowBalanceConfig = new com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig(true, balanceId, financialInstrumentId, money, new com.paypal.oslo.feature.balance.domain.model.Money(bigDecimalOrNull2, com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(onBalanceAutoReloadThreshold.getThresholdAmount().getCurrencyCode().toString()), null));
            }
            if (lowBalanceConfig != null) {
                return lowBalanceConfig;
            }
        }
        return new com.paypal.oslo.feature.balance.domain.model.autoreload.LowBalanceConfig(false, null, null, null, null, 30, null);
    }

    public static final com.paypal.oslo.feature.balance.domain.model.autoreload.ScheduledConfig parseFrequencyConfig(java.lang.Object obj) {
        if (obj != null) {
            com.paypal.oslo.feature.balance.domain.model.autoreload.ScheduledConfig scheduledConfig = null;
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.FrequencyConfig frequencyConfig = obj instanceof com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.FrequencyConfig ? (com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.FrequencyConfig) obj : null;
            com.paypal.oslo.feature.balance.graphql.GetBalanceAutoReloadConfigQuery.OnBalanceAutoReloadFrequency onBalanceAutoReloadFrequency = frequencyConfig != null ? frequencyConfig.getOnBalanceAutoReloadFrequency() : null;
            if (onBalanceAutoReloadFrequency != null) {
                java.lang.String obj2 = onBalanceAutoReloadFrequency.getStartDate().toString();
                java.lang.String obj3 = onBalanceAutoReloadFrequency.getStartDay().toString();
                java.lang.String obj4 = onBalanceAutoReloadFrequency.getRecurrence().toString();
                java.lang.String financialInstrumentId = onBalanceAutoReloadFrequency.getFinancialInstrumentId();
                java.math.BigDecimal bigDecimalOrNull = kotlin.text.StringsKt.toBigDecimalOrNull(onBalanceAutoReloadFrequency.getReloadAmount().getValue());
                if (bigDecimalOrNull == null) {
                    bigDecimalOrNull = java.math.BigDecimal.ZERO;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimalOrNull);
                scheduledConfig = new com.paypal.oslo.feature.balance.domain.model.autoreload.ScheduledConfig(true, obj2, obj3, obj4, financialInstrumentId, new com.paypal.oslo.feature.balance.domain.model.Money(bigDecimalOrNull, com.paypal.oslo.core.i18n.domain.model.CurrencyCode.m11384constructorimpl(onBalanceAutoReloadFrequency.getReloadAmount().getCurrencyCode().toString()), null));
            }
            if (scheduledConfig != null) {
                return scheduledConfig;
            }
        }
        return new com.paypal.oslo.feature.balance.domain.model.autoreload.ScheduledConfig(false, null, null, null, null, null, 62, null);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadScheduleType toBalanceAutoReloadScheduleType(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(str, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadScheduleType.THRESHOLD.getValue()) ? com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadScheduleType.AUTO_RELOAD_THRESHOLD : kotlin.jvm.internal.Intrinsics.areEqual(str, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadScheduleType.FREQUENCY.getValue()) ? com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadScheduleType.AUTO_RELOAD_FREQUENCY : com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadScheduleType.AUTO_RELOAD_THRESHOLD;
    }

    public static final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadRecurrence> toBalanceAutoReloadRecurrence(java.lang.String str) {
        com.apollographql.apollo.api.Optional.Absent present;
        if (str != null) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadRecurrence.WEEKLY.getValue())) {
                present = com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadRecurrence.WEEKLY);
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadRecurrence.BIWEEKLY.getValue())) {
                present = com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadRecurrence.BI_WEEKLY);
            } else {
                present = kotlin.jvm.internal.Intrinsics.areEqual(str, com.paypal.oslo.feature.balance.domain.model.autoreload.AutoReloadRecurrence.MONTHLY.getValue()) ? com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadRecurrence.MONTHLY) : com.apollographql.apollo.api.Optional.INSTANCE.absent();
            }
            if (present != null) {
                return present;
            }
        }
        return com.apollographql.apollo.api.Optional.INSTANCE.absent();
    }

    public static final com.apollographql.apollo.api.Optional<com.paypal.oslo.api.graphql.schema.type.MoneyInput> toMoneyInput(com.paypal.oslo.feature.balance.domain.model.Money money) {
        if (money != null) {
            com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
            java.lang.String plainString = money.getAmount().toPlainString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(plainString, "");
            com.apollographql.apollo.api.Optional.Present present = companion.present(new com.paypal.oslo.api.graphql.schema.type.MoneyInput(money.m12029getCurrencyCodehkTgrg(), plainString));
            if (present != null) {
                return present;
            }
        }
        return com.apollographql.apollo.api.Optional.INSTANCE.absent();
    }

    public static final <T> com.apollographql.apollo.api.Optional<T> toOptional(T t) {
        com.apollographql.apollo.api.Optional.Present present;
        return (t == null || (present = com.apollographql.apollo.api.Optional.INSTANCE.present(t)) == null) ? com.apollographql.apollo.api.Optional.INSTANCE.absent() : present;
    }

    public static final com.paypal.oslo.feature.balance.domain.error.AutoReloadError mapToAutoReloadError(com.paypal.oslo.core.network.graphql.error.CallError.GraphQL graphQL) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphQL, "");
        java.util.Map<java.lang.String, java.lang.Object> extensions = ((com.paypal.oslo.core.network.graphql.error.GraphQLError) arrow.core.NonEmptyList.m9578firstOrNullimpl(graphQL.m11659getErrors1X0FAY())).getExtensions();
        java.lang.Object obj = extensions != null ? extensions.get("result") : null;
        com.paypal.oslo.feature.balance.domain.error.AutoReloadResultError autoReloadResultError = obj instanceof com.paypal.oslo.feature.balance.domain.error.AutoReloadResultError ? (com.paypal.oslo.feature.balance.domain.error.AutoReloadResultError) obj : null;
        java.lang.Object obj2 = extensions != null ? extensions.get("details") : null;
        java.util.List list = obj2 instanceof java.util.List ? (java.util.List) obj2 : null;
        java.lang.Object firstOrNull = list != null ? kotlin.collections.CollectionsKt.firstOrNull(list) : null;
        java.util.Map map = firstOrNull instanceof java.util.Map ? (java.util.Map) firstOrNull : null;
        java.lang.Object obj3 = map != null ? map.get(com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION) : null;
        java.lang.String str = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (kotlin.jvm.internal.Intrinsics.areEqual(autoReloadResultError != null ? autoReloadResultError.getErrorCode() : null, "DECLINED_BY_RISK") || kotlin.jvm.internal.Intrinsics.areEqual(str, "DECLINED_BY_RISK")) {
            return com.paypal.oslo.feature.balance.domain.error.AutoReloadError.RiskDeclined.INSTANCE;
        }
        return mapOperationStatus(autoReloadResultError != null ? autoReloadResultError.getOperationStatus() : null);
    }

    public static final com.paypal.oslo.feature.balance.domain.error.AutoReloadError mapOperationStatus(com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus balanceAutoReloadOperationStatus) {
        int i = balanceAutoReloadOperationStatus == null ? -1 : com.paypal.oslo.feature.balance.data.repository.autoreload.AutoReloadMappersKt.WhenMappings.$EnumSwitchMapping$0[balanceAutoReloadOperationStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericAutoReloadError.INSTANCE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.balance.domain.error.AutoReloadError.FiDeclined.INSTANCE;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.balance.domain.error.AutoReloadError.Nsf.INSTANCE;
        }
        return com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericApiError.INSTANCE;
    }

    public static final com.paypal.oslo.feature.balance.domain.error.AutoReloadError toAutoReloadError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.balance.domain.error.AutoReloadError.Network.INSTANCE;
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return mapToAutoReloadError((com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) callError);
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.paypal.oslo.feature.balance.domain.error.AutoReloadError toAutoReloadFIError(com.paypal.oslo.core.network.graphql.error.CallError callError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callError, "");
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.Network) {
            return com.paypal.oslo.feature.balance.domain.error.AutoReloadError.Network.INSTANCE;
        }
        if (callError instanceof com.paypal.oslo.core.network.graphql.error.CallError.GraphQL) {
            return com.paypal.oslo.feature.balance.domain.error.AutoReloadError.GenericApiError.INSTANCE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus.ADD_MONEY_FAILED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus.ADD_MONEY_FAILED_FI_DECLINE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BalanceAutoReloadOperationStatus.ADD_MONEY_FAILED_INSUFFICIENT_FUNDS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
