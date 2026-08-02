package com.paypal.oslo.feature.p2p.ui.common.util;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/common/util/UserPaymentUtils;", "", "<init>", "()V", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "", "getUserEmail", "(Lcom/paypal/oslo/core/userstore/UserStore;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/time/Instant;", "instant", "formatExpiryDate", "(Ljava/time/Instant;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UserPaymentUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils INSTANCE = new com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils();

    private UserPaymentUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getUserEmail(com.paypal.oslo.core.userstore.UserStore userStore, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils$getUserEmail$1 userPaymentUtils$getUserEmail$1;
        int i;
        try {
            if (continuation instanceof com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils$getUserEmail$1) {
                userPaymentUtils$getUserEmail$1 = (com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils$getUserEmail$1) continuation;
                if ((userPaymentUtils$getUserEmail$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                    userPaymentUtils$getUserEmail$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                    java.lang.Object obj = userPaymentUtils$getUserEmail$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = userPaymentUtils$getUserEmail$1.getHighSpeedVideoFpsRangesFor;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils$getUserEmail$2 userPaymentUtils$getUserEmail$2 = new com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils$getUserEmail$2(userStore, null);
                        userPaymentUtils$getUserEmail$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userStore);
                        userPaymentUtils$getUserEmail$1.getHighSpeedVideoFpsRangesFor = 1;
                        obj = kotlinx.coroutines.TimeoutKt.withTimeout(2000L, userPaymentUtils$getUserEmail$2, userPaymentUtils$getUserEmail$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    return (java.lang.String) obj;
                }
            }
            if (i != 0) {
            }
            return (java.lang.String) obj;
        } catch (kotlinx.coroutines.TimeoutCancellationException unused) {
            return "";
        }
        userPaymentUtils$getUserEmail$1 = new com.paypal.oslo.feature.p2p.ui.common.util.UserPaymentUtils$getUserEmail$1(this, continuation);
        java.lang.Object obj2 = userPaymentUtils$getUserEmail$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = userPaymentUtils$getUserEmail$1.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String formatExpiryDate(java.time.Instant instant) {
        java.lang.String format;
        return (instant == null || (format = java.time.format.DateTimeFormatter.ofPattern(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TRANSACTION_DATE_WITH_YEAR_FORMAT).withZone(java.time.ZoneId.systemDefault()).format(instant)) == null) ? "" : format;
    }
}
