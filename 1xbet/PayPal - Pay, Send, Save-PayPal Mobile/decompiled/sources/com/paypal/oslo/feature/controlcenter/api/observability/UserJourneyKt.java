package com.paypal.oslo.feature.controlcenter.api.observability;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/android/logger/Logger;", "Lcom/paypal/oslo/feature/controlcenter/api/observability/UserJourneyError;", "journeyError", "", "e", "(Lcom/paypal/android/logger/Logger;Lcom/paypal/oslo/feature/controlcenter/api/observability/UserJourneyError;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UserJourneyKt {
    public static final void e(com.paypal.android.logger.Logger logger, com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyError userJourneyError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userJourneyError, "");
        com.paypal.android.logger.Logger.e$default(logger, userJourneyError.getMessage(), userJourneyError.getAttributes(), null, userJourneyError.getError(), 4, null);
    }
}
