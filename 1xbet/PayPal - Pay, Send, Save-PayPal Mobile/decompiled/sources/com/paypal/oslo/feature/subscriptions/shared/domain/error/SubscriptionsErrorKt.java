package com.paypal.oslo.feature.subscriptions.shared.domain.error;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001ae\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "exception", "(Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;)Ljava/lang/Exception;", "", "message", "Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource;", "source", "", "", "piiAttributes", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "log", "(Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;Ljava/lang/String;Lcom/paypal/oslo/feature/subscriptions/shared/SubscriptionEventSource;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Exception;)Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SubscriptionsErrorKt {
    public static final java.lang.Exception exception(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError subscriptionsError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsError, "");
        return new java.lang.Exception(subscriptionsError.getErrorDescription());
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError log$default(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError subscriptionsError, java.lang.String str, com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource subscriptionEventSource, java.util.Map map, java.util.Map map2, java.lang.Exception exc, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        java.util.Map map3 = map;
        if ((i & 8) != 0) {
            map2 = kotlin.collections.MapsKt.emptyMap();
        }
        java.util.Map map4 = map2;
        if ((i & 16) != 0) {
            exc = null;
        }
        return log(subscriptionsError, str, subscriptionEventSource, map3, map4, exc);
    }

    public static final com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError log(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError subscriptionsError, java.lang.String str, com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource subscriptionEventSource, java.util.Map<java.lang.String, ? extends java.lang.Object> map, java.util.Map<java.lang.String, ? extends java.lang.Object> map2, java.lang.Exception exc) {
        java.lang.String str2;
        com.paypal.oslo.feature.controlcenter.api.observability.UserJourney userJourney;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionsError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subscriptionEventSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put("errorType", subscriptionsError.getErrorType());
        createMapBuilder.put("errorCode", subscriptionsError.getErrorCode());
        createMapBuilder.put("errorDescription", subscriptionsError.getErrorDescription());
        createMapBuilder.put("errorSource", subscriptionsError.getErrorSource());
        createMapBuilder.put("agreementType", com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.toRawValue(subscriptionEventSource.getAgreementType()));
        java.util.Map<java.lang.String, ? extends java.lang.Object> plus = kotlin.collections.MapsKt.plus(map2, kotlin.collections.MapsKt.build(createMapBuilder));
        boolean z = subscriptionEventSource instanceof com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.Hub;
        if (z) {
            str2 = "Subscriptions: Hub";
        } else if (subscriptionEventSource instanceof com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.AgreementDetails) {
            str2 = "Subscriptions: AgreementDetails";
        } else if (subscriptionEventSource instanceof com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.BulkFi) {
            str2 = "Subscriptions: BulkFi";
        } else if (subscriptionEventSource instanceof com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.LinkAgreement) {
            str2 = "Subscriptions: LinkAgreement";
        } else {
            if (!(subscriptionEventSource instanceof com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.UpdateFi)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str2 = "Subscriptions: UpdateFi";
        }
        if (z) {
            com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = ((com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.Hub) subscriptionEventSource).getAgreementType();
            if (agreementType instanceof com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business) {
                userJourney = com.paypal.oslo.feature.controlcenter.api.observability.SettingsUserJourneys.INSTANCE.getLinkedBusinesses();
            } else {
                if (!(agreementType instanceof com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                userJourney = com.paypal.oslo.feature.controlcenter.api.observability.ControlCenterUserJourneys.INSTANCE.getSubscriptions();
            }
        } else {
            userJourney = null;
        }
        if (userJourney == null) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.subscriptions.LoggerKt.log;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str2);
            sb.append(" ");
            sb.append(str);
            java.lang.String obj = sb.toString();
            if (exc == null) {
                exc = exception(subscriptionsError);
            }
            logger.e(obj, plus, map, exc);
            return subscriptionsError;
        }
        com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.subscriptions.LoggerKt.log;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str2);
        sb2.append(" ");
        sb2.append(str);
        java.lang.String obj2 = sb2.toString();
        java.lang.String errorCode = subscriptionsError.getErrorCode();
        if (exc == null) {
            exc = exception(subscriptionsError);
        }
        com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyKt.e(logger2, userJourney.error(obj2, errorCode, plus, exc));
        return subscriptionsError;
    }
}
