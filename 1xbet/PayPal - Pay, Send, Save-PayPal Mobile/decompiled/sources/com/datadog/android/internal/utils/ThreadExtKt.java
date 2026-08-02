package com.datadog.android.internal.utils;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Ljava/lang/Thread$State;", "", "asString", "(Ljava/lang/Thread$State;)Ljava/lang/String;", "", "Ljava/lang/StackTraceElement;", "loggableStackTrace", "([Ljava/lang/StackTraceElement;)Ljava/lang/String;", "Ljava/lang/Thread;", "", "safeGetThreadId", "(Ljava/lang/Thread;)J"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThreadExtKt {
    public static final long safeGetThreadId(java.lang.Thread thread) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thread, "");
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            return thread.threadId();
        }
        return thread.getId();
    }

    public static final java.lang.String asString(java.lang.Thread.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        switch (com.datadog.android.internal.utils.ThreadExtKt.WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return "new";
            case 2:
                return com.paypal.oslo.feature.identity.phoneconfirmation.data.mapper.PhoneConfirmationErrorMapper.ERROR_MSG_BLOCKED;
            case 3:
                return "runnable";
            case 4:
                return "terminated";
            case 5:
                return "timed_waiting";
            case 6:
                return "waiting";
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final java.lang.String loggableStackTrace(java.lang.StackTraceElement[] stackTraceElementArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stackTraceElementArr, "");
        return kotlin.collections.ArraysKt.joinToString$default(stackTraceElementArr, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new kotlin.jvm.functions.Function1<java.lang.StackTraceElement, java.lang.CharSequence>() { // from class: com.datadog.android.internal.utils.ThreadExtKt$loggableStackTrace$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final java.lang.CharSequence invoke(java.lang.StackTraceElement stackTraceElement) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stackTraceElement, "");
                return "at ".concat(java.lang.String.valueOf(stackTraceElement));
            }
        }, 30, (java.lang.Object) null);
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[java.lang.Thread.State.values().length];
            try {
                iArr[java.lang.Thread.State.NEW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[java.lang.Thread.State.BLOCKED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[java.lang.Thread.State.RUNNABLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[java.lang.Thread.State.TERMINATED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[java.lang.Thread.State.TIMED_WAITING.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[java.lang.Thread.State.WAITING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
