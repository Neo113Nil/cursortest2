package androidx.tracing;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u0003J\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0012J#\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\t*\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\u001b\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010&R\u0018\u0010\u001d\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\"\u001a\u00020\u00048CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0006"}, d2 = {"Landroidx/tracing/Trace;", "", "<init>", "()V", "", "isEnabled", "()Z", "", "forceEnableAppTracing", "", "label", "beginSection", "(Ljava/lang/String;)V", "endSection", "methodName", "", "cookie", "beginAsyncSection", "(Ljava/lang/String;I)V", "endAsyncSection", "counterName", "counterValue", "setCounter", "p0", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/Exception;)V", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Ljava/lang/String;", "MAX_TRACE_LABEL_LENGTH", com.visa.cbp.getEncExpo.warmup, "", "getOutputFormats", "J", "getHighSpeedVideoFpsRanges", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Z", "getOutputMinFrameDuration"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Trace {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static boolean getOutputMinFrameDuration = false;
    public static final androidx.tracing.Trace INSTANCE = new androidx.tracing.Trace();
    public static final int MAX_TRACE_LABEL_LENGTH = 127;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static java.lang.reflect.Method getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static java.lang.reflect.Method Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static java.lang.reflect.Method getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private static long getHighSpeedVideoFpsRanges;

    private Trace() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isEnabled() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.tracing.TraceApi29Impl.INSTANCE.isEnabled();
        }
        return getHighSpeedVideoFpsRangesFor();
    }

    @kotlin.jvm.JvmStatic
    public static final void forceEnableAppTracing() {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            try {
                if (getOutputMinFrameDuration) {
                    return;
                }
                getOutputMinFrameDuration = true;
                android.os.Trace.class.getMethod("setAppTracingAllowed", java.lang.Boolean.TYPE).invoke(null, java.lang.Boolean.TRUE);
            } catch (java.lang.Exception e) {
                getHighResolutionOutputSizeshNQ4ISI(e);
            }
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void beginSection(java.lang.String label) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        android.os.Trace.beginSection(getHighSpeedVideoSizes(label));
    }

    @kotlin.jvm.JvmStatic
    public static final void endSection() {
        android.os.Trace.endSection();
    }

    @kotlin.jvm.JvmStatic
    public static final void beginAsyncSection(java.lang.String methodName, int cookie) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodName, "");
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.tracing.TraceApi29Impl.INSTANCE.beginAsyncSection(getHighSpeedVideoSizes(methodName), cookie);
            return;
        }
        java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(methodName);
        try {
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = android.os.Trace.class.getMethod("asyncTraceBegin", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
            }
            java.lang.reflect.Method method = Camera2StreamConfigurationMap;
            if (method == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            method.invoke(null, java.lang.Long.valueOf(getHighSpeedVideoFpsRanges), highSpeedVideoSizes, java.lang.Integer.valueOf(cookie));
        } catch (java.lang.Exception e) {
            getHighResolutionOutputSizeshNQ4ISI(e);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void endAsyncSection(java.lang.String methodName, int cookie) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodName, "");
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.tracing.TraceApi29Impl.INSTANCE.endAsyncSection(getHighSpeedVideoSizes(methodName), cookie);
            return;
        }
        java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(methodName);
        try {
            if (getHighSpeedVideoFpsRangesFor == null) {
                getHighSpeedVideoFpsRangesFor = android.os.Trace.class.getMethod("asyncTraceEnd", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
            }
            java.lang.reflect.Method method = getHighSpeedVideoFpsRangesFor;
            if (method == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            method.invoke(null, java.lang.Long.valueOf(getHighSpeedVideoFpsRanges), highSpeedVideoSizes, java.lang.Integer.valueOf(cookie));
        } catch (java.lang.Exception e) {
            getHighResolutionOutputSizeshNQ4ISI(e);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void setCounter(java.lang.String counterName, int counterValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(counterName, "");
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.tracing.TraceApi29Impl.INSTANCE.setCounter(getHighSpeedVideoSizes(counterName), counterValue);
            return;
        }
        java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(counterName);
        try {
            if (getHighSpeedVideoSizes == null) {
                getHighSpeedVideoSizes = android.os.Trace.class.getMethod("traceCounter", java.lang.Long.TYPE, java.lang.String.class, java.lang.Integer.TYPE);
            }
            java.lang.reflect.Method method = getHighSpeedVideoSizes;
            if (method == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            method.invoke(null, java.lang.Long.valueOf(getHighSpeedVideoFpsRanges), highSpeedVideoSizes, java.lang.Integer.valueOf(counterValue));
        } catch (java.lang.Exception e) {
            getHighResolutionOutputSizeshNQ4ISI(e);
        }
    }

    private static boolean getHighSpeedVideoFpsRangesFor() {
        try {
            if (getHighResolutionOutputSizeshNQ4ISI == null) {
                getHighSpeedVideoFpsRanges = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                getHighResolutionOutputSizeshNQ4ISI = android.os.Trace.class.getMethod("isTagEnabled", java.lang.Long.TYPE);
            }
            java.lang.reflect.Method method = getHighResolutionOutputSizeshNQ4ISI;
            if (method == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.".toString());
            }
            java.lang.Object invoke = method.invoke(null, java.lang.Long.valueOf(getHighSpeedVideoFpsRanges));
            kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
            return ((java.lang.Boolean) invoke).booleanValue();
        } catch (java.lang.Exception e) {
            getHighResolutionOutputSizeshNQ4ISI(e);
            return false;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.Exception exc) {
        if (exc instanceof java.lang.reflect.InvocationTargetException) {
            java.lang.Throwable cause = ((java.lang.reflect.InvocationTargetException) exc).getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw cause;
            }
            throw new java.lang.RuntimeException(cause);
        }
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
        java.lang.String str2 = str.length() <= 127 ? str : null;
        if (str2 != null) {
            return str2;
        }
        java.lang.String substring = str.substring(0, 127);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }
}
