package com.facebook.internal.instrument.threadcheck;

/* compiled from: ThreadCheckHandler.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J,\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002J$\u0010\u0010\u001a\u00020\t2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J$\u0010\u0011\u001a\u00020\t2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/instrument/threadcheck/ThreadCheckHandler;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "enabled", "", com.ironsource.mediationsdk.metadata.a.j, "", "log", "annotation", "clazz", "Ljava/lang/Class;", "methodName", "methodDesc", "uiThreadViolationDetected", "workerThreadViolationDetected", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ThreadCheckHandler {
    public static final com.facebook.internal.instrument.threadcheck.ThreadCheckHandler INSTANCE = new com.facebook.internal.instrument.threadcheck.ThreadCheckHandler();
    private static final java.lang.String TAG = com.facebook.internal.instrument.threadcheck.ThreadCheckHandler.class.getCanonicalName();
    private static boolean enabled;

    private ThreadCheckHandler() {
    }

    @kotlin.jvm.JvmStatic
    public static final void enable() {
        enabled = true;
    }

    @kotlin.jvm.JvmStatic
    public static final void uiThreadViolationDetected(java.lang.Class<?> clazz, java.lang.String methodName, java.lang.String methodDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "clazz");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodName, "methodName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodDesc, "methodDesc");
        INSTANCE.log("@UiThread", clazz, methodName, methodDesc);
    }

    @kotlin.jvm.JvmStatic
    public static final void workerThreadViolationDetected(java.lang.Class<?> clazz, java.lang.String methodName, java.lang.String methodDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clazz, "clazz");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodName, "methodName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(methodDesc, "methodDesc");
        INSTANCE.log("@WorkerThread", clazz, methodName, methodDesc);
    }

    private final void log(java.lang.String annotation, java.lang.Class<?> clazz, java.lang.String methodName, java.lang.String methodDesc) {
        if (enabled) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format(java.util.Locale.US, "%s annotation violation detected in %s.%s%s. Current looper is %s and main looper is %s.", java.util.Arrays.copyOf(new java.lang.Object[]{annotation, clazz.getName(), methodName, methodDesc, android.os.Looper.myLooper(), android.os.Looper.getMainLooper()}, 6));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            java.lang.Exception exc = new java.lang.Exception();
            android.util.Log.e(TAG, format, exc);
            com.facebook.internal.instrument.InstrumentData.Builder builder = com.facebook.internal.instrument.InstrumentData.Builder.INSTANCE;
            com.facebook.internal.instrument.InstrumentData.Builder.build(exc, com.facebook.internal.instrument.InstrumentData.Type.ThreadCheck).save();
        }
    }
}
