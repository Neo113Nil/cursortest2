package androidx.compose.ui.util;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a,\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"T", "", "sectionName", "Lkotlin/Function0;", "block", "trace", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "tag", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "traceValue", "(Ljava/lang/String;J)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidTrace_androidKt {
    public static final <T> T trace(java.lang.String str, kotlin.jvm.functions.Function0<? extends T> function0) {
        android.os.Trace.beginSection(str);
        try {
            return function0.invoke();
        } finally {
            android.os.Trace.endSection();
        }
    }

    public static final void traceValue(java.lang.String str, long j) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.os.Trace.setCounter(str, j);
        }
    }
}
