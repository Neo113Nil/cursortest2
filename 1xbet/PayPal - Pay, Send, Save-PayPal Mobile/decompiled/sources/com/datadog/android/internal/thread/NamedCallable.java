package com.datadog.android.internal.thread;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\t\u001a\u0006*\u00028\u00008\u0000H\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/internal/thread/NamedCallable;", "V", "Lcom/datadog/android/internal/thread/NamedExecutionUnit;", "Ljava/util/concurrent/Callable;", "", "name", "callable", "<init>", "(Ljava/lang/String;Ljava/util/concurrent/Callable;)V", androidx.core.app.NotificationCompat.CATEGORY_CALL, "()Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/Callable;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getName", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NamedCallable<V> implements com.datadog.android.internal.thread.NamedExecutionUnit, java.util.concurrent.Callable<V> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.concurrent.Callable<V> getHighSpeedVideoFpsRangesFor;
    private final java.lang.String name;

    public NamedCallable(java.lang.String str, java.util.concurrent.Callable<V> callable) {
        kotlin.text.Regex regex;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callable, "");
        this.getHighSpeedVideoFpsRangesFor = callable;
        regex = com.datadog.android.internal.thread.NamedExecutionUnitKt.Camera2StreamConfigurationMap;
        java.lang.String replace = regex.replace(str, "_");
        java.util.Locale locale = java.util.Locale.US;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = replace.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        this.name = lowerCase;
    }

    @Override // com.datadog.android.internal.thread.NamedExecutionUnit
    public final java.lang.String getName() {
        return this.name;
    }

    @Override // java.util.concurrent.Callable
    public final V call() {
        return this.getHighSpeedVideoFpsRangesFor.call();
    }
}
