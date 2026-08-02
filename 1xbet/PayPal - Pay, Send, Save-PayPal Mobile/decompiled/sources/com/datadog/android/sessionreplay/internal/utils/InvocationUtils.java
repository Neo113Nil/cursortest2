package com.datadog.android.sessionreplay.internal.utils;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/utils/InvocationUtils;", "", "<init>", "()V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lcom/datadog/android/api/InternalLogger;", "logger", "Lkotlin/Function0;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "", "failureMessage", "Lcom/datadog/android/api/InternalLogger$Level;", "level", "Lcom/datadog/android/api/InternalLogger$Target;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "safeCallWithErrorLogging", "(Lcom/datadog/android/api/InternalLogger;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lcom/datadog/android/api/InternalLogger$Level;Lcom/datadog/android/api/InternalLogger$Target;)Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InvocationUtils {
    public static /* synthetic */ java.lang.Object safeCallWithErrorLogging$default(com.datadog.android.sessionreplay.internal.utils.InvocationUtils invocationUtils, com.datadog.android.api.InternalLogger internalLogger, kotlin.jvm.functions.Function0 function0, java.lang.String str, com.datadog.android.api.InternalLogger.Level level, com.datadog.android.api.InternalLogger.Target target, int i, java.lang.Object obj) {
        com.datadog.android.api.InternalLogger unbound = (i & 1) != 0 ? com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND() : internalLogger;
        com.datadog.android.api.InternalLogger.Level level2 = (i & 8) != 0 ? com.datadog.android.api.InternalLogger.Level.WARN : level;
        com.datadog.android.api.InternalLogger.Target target2 = (i & 16) != 0 ? com.datadog.android.api.InternalLogger.Target.MAINTAINER : target;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unbound, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target2, "");
        try {
            return function0.invoke();
        } catch (java.lang.Exception e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(unbound, level2, target2, (kotlin.jvm.functions.Function0) new com.datadog.android.sessionreplay.internal.utils.InvocationUtils$safeCallWithErrorLogging$1(str), (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    public final <R> R safeCallWithErrorLogging(com.datadog.android.api.InternalLogger logger, kotlin.jvm.functions.Function0<? extends R> call, java.lang.String failureMessage, com.datadog.android.api.InternalLogger.Level level, com.datadog.android.api.InternalLogger.Target target) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureMessage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
        try {
            return call.invoke();
        } catch (java.lang.Exception e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(logger, level, target, (kotlin.jvm.functions.Function0) new com.datadog.android.sessionreplay.internal.utils.InvocationUtils$safeCallWithErrorLogging$1(failureMessage), (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }
}
