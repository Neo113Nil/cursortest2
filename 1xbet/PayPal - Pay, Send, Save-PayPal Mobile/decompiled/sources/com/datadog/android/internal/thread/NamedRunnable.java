package com.datadog.android.internal.thread;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/internal/thread/NamedRunnable;", "Lcom/datadog/android/internal/thread/NamedExecutionUnit;", "Ljava/lang/Runnable;", "", "name", "runnable", "<init>", "(Ljava/lang/String;Ljava/lang/Runnable;)V", "", "run", "()V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Runnable;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NamedRunnable implements com.datadog.android.internal.thread.NamedExecutionUnit, java.lang.Runnable {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.Runnable getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String name;

    public NamedRunnable(java.lang.String str, java.lang.Runnable runnable) {
        kotlin.text.Regex regex;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "");
        this.getHighResolutionOutputSizeshNQ4ISI = runnable;
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

    @Override // java.lang.Runnable
    public final void run() {
        this.getHighResolutionOutputSizeshNQ4ISI.run();
    }
}
