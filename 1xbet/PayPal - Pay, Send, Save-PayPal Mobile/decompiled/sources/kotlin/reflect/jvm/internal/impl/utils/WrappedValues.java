package kotlin.reflect.jvm.internal.impl.utils;

/* loaded from: classes5.dex */
public class WrappedValues {
    private static final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object() { // from class: kotlin.reflect.jvm.internal.impl.utils.WrappedValues.1
        public final java.lang.String toString() {
            return "NULL_VALUE";
        }
    };
    public static volatile boolean throwWrappedProcessCanceledException = false;

    static final class ThrowableWrapper {
        final java.lang.Throwable getHighSpeedVideoFpsRanges;

        /* synthetic */ ThrowableWrapper(java.lang.Throwable th, byte b) {
            this(th);
        }

        private ThrowableWrapper(java.lang.Throwable th) {
            if (th == null) {
                getHighSpeedVideoSizes(0);
            }
            this.getHighSpeedVideoFpsRanges = th;
        }

        public final java.lang.String toString() {
            return this.getHighSpeedVideoFpsRanges.toString();
        }

        static /* synthetic */ void getHighSpeedVideoSizes(int i) {
            java.lang.String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            java.lang.Object[] objArr = new java.lang.Object[i != 1 ? 3 : 2];
            if (i != 1) {
                objArr[0] = com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY;
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            java.lang.String format = java.lang.String.format(str, objArr);
            if (i == 1) {
                throw new java.lang.IllegalStateException(format);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V unescapeNull(java.lang.Object obj) {
        if (obj == 0) {
            getHighSpeedVideoSizes(0);
        }
        if (obj == getHighSpeedVideoFpsRangesFor) {
            return null;
        }
        return obj;
    }

    public static <V> java.lang.Object escapeNull(V v) {
        if (v != null) {
            if (v == null) {
                getHighSpeedVideoSizes(2);
            }
            return v;
        }
        java.lang.Object obj = getHighSpeedVideoFpsRangesFor;
        if (obj == null) {
            getHighSpeedVideoSizes(1);
        }
        return obj;
    }

    public static java.lang.Object escapeThrowable(java.lang.Throwable th) {
        if (th == null) {
            getHighSpeedVideoSizes(3);
        }
        return new kotlin.reflect.jvm.internal.impl.utils.WrappedValues.ThrowableWrapper(th, (byte) 0);
    }

    public static <V> V unescapeExceptionOrNull(java.lang.Object obj) {
        if (obj == null) {
            getHighSpeedVideoSizes(4);
        }
        return (V) unescapeNull(unescapeThrowable(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <V> V unescapeThrowable(java.lang.Object obj) {
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.utils.WrappedValues.ThrowableWrapper)) {
            return obj;
        }
        java.lang.Throwable th = ((kotlin.reflect.jvm.internal.impl.utils.WrappedValues.ThrowableWrapper) obj).getHighSpeedVideoFpsRanges;
        if (th == null) {
            kotlin.reflect.jvm.internal.impl.utils.WrappedValues.ThrowableWrapper.getHighSpeedVideoSizes(1);
        }
        if (throwWrappedProcessCanceledException && kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt.isProcessCanceledException(th)) {
            throw new kotlin.reflect.jvm.internal.impl.utils.WrappedValues.WrappedProcessCanceledException(th);
        }
        throw kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt.rethrow(th);
    }

    public static class WrappedProcessCanceledException extends java.lang.RuntimeException {
        public WrappedProcessCanceledException(java.lang.Throwable th) {
            super("Rethrow stored exception", th);
        }
    }

    private static /* synthetic */ void getHighSpeedVideoSizes(int i) {
        java.lang.String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        } else if (i != 3) {
            objArr[0] = com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE;
        } else {
            objArr[0] = com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY;
        }
        if (i == 1 || i == 2) {
            objArr[1] = "escapeNull";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues";
        }
        if (i != 1 && i != 2) {
            if (i == 3) {
                objArr[2] = "escapeThrowable";
            } else if (i != 4) {
                objArr[2] = "unescapeNull";
            } else {
                objArr[2] = "unescapeExceptionOrNull";
            }
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}
