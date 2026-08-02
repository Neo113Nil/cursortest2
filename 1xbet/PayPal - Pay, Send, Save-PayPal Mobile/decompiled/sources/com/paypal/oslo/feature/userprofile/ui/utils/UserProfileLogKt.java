package com.paypal.oslo.feature.userprofile.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a'\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/android/logger/Logger;", "Lcom/paypal/oslo/feature/userprofile/ui/utils/UserProfileLog;", "logData", "", "i", "(Lcom/paypal/android/logger/Logger;Lcom/paypal/oslo/feature/userprofile/ui/utils/UserProfileLog;)V", "w", "d", "Lcom/paypal/oslo/feature/userprofile/ui/utils/UserProfileErrorLog;", "Lcom/paypal/oslo/feature/controlcenter/api/observability/UserJourney;", "journey", "e", "(Lcom/paypal/android/logger/Logger;Lcom/paypal/oslo/feature/userprofile/ui/utils/UserProfileErrorLog;Lcom/paypal/oslo/feature/controlcenter/api/observability/UserJourney;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UserProfileLogKt {
    public static final void i(com.paypal.android.logger.Logger logger, com.paypal.oslo.feature.userprofile.ui.utils.UserProfileLog userProfileLog) {
        java.util.Map<java.lang.String, java.lang.Object> build;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileLog, "");
        java.lang.String message = userProfileLog.getMessage();
        java.util.Map<java.lang.String, java.lang.Object> attributes = userProfileLog.getAttributes();
        java.lang.String failure = userProfileLog.getFailure();
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        if (failure == null) {
            build = attributes;
        } else {
            createMapBuilder.putAll(attributes);
            createMapBuilder.put(com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, failure);
            build = kotlin.collections.MapsKt.build(createMapBuilder);
        }
        com.paypal.android.logger.Logger.i$default(logger, message, build, null, 4, null);
    }

    public static final void w(com.paypal.android.logger.Logger logger, com.paypal.oslo.feature.userprofile.ui.utils.UserProfileLog userProfileLog) {
        java.util.Map<java.lang.String, java.lang.Object> build;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileLog, "");
        java.lang.String message = userProfileLog.getMessage();
        java.util.Map<java.lang.String, java.lang.Object> attributes = userProfileLog.getAttributes();
        java.lang.String failure = userProfileLog.getFailure();
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        if (failure == null) {
            build = attributes;
        } else {
            createMapBuilder.putAll(attributes);
            createMapBuilder.put(com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, failure);
            build = kotlin.collections.MapsKt.build(createMapBuilder);
        }
        com.paypal.android.logger.Logger.w$default(logger, message, build, null, 4, null);
    }

    public static final void d(com.paypal.android.logger.Logger logger, com.paypal.oslo.feature.userprofile.ui.utils.UserProfileLog userProfileLog) {
        java.util.Map<java.lang.String, java.lang.Object> build;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileLog, "");
        java.lang.String message = userProfileLog.getMessage();
        java.util.Map<java.lang.String, java.lang.Object> attributes = userProfileLog.getAttributes();
        java.lang.String failure = userProfileLog.getFailure();
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        if (failure == null) {
            build = attributes;
        } else {
            createMapBuilder.putAll(attributes);
            createMapBuilder.put(com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, failure);
            build = kotlin.collections.MapsKt.build(createMapBuilder);
        }
        com.paypal.android.logger.Logger.d$default(logger, message, build, null, 4, null);
    }

    public static /* synthetic */ void e$default(com.paypal.android.logger.Logger logger, com.paypal.oslo.feature.userprofile.ui.utils.UserProfileErrorLog userProfileErrorLog, com.paypal.oslo.feature.controlcenter.api.observability.UserJourney userJourney, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            userJourney = null;
        }
        e(logger, userProfileErrorLog, userJourney);
    }

    public static final void e(com.paypal.android.logger.Logger logger, com.paypal.oslo.feature.userprofile.ui.utils.UserProfileErrorLog userProfileErrorLog, com.paypal.oslo.feature.controlcenter.api.observability.UserJourney userJourney) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userProfileErrorLog, "");
        if (userJourney != null) {
            com.paypal.oslo.feature.controlcenter.api.observability.UserJourneyKt.e(logger, userJourney.error(userProfileErrorLog.getMessage(), userProfileErrorLog.getFailure(), userProfileErrorLog.getAttributes(), userProfileErrorLog.getError()));
            return;
        }
        java.lang.String message = userProfileErrorLog.getMessage();
        java.util.Map<java.lang.String, java.lang.Object> attributes = userProfileErrorLog.getAttributes();
        java.lang.String failure = userProfileErrorLog.getFailure();
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        if (failure != null) {
            createMapBuilder.putAll(attributes);
            createMapBuilder.put(com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, failure);
            attributes = kotlin.collections.MapsKt.build(createMapBuilder);
        }
        com.paypal.android.logger.Logger.e$default(logger, message, attributes, null, userProfileErrorLog.getError(), 4, null);
    }
}
