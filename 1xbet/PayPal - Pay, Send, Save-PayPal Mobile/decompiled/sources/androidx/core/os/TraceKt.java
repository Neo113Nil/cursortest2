package androidx.core.os;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "sectionName", "Lkotlin/Function0;", "block", "trace", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TraceKt {
    @kotlin.Deprecated(message = "Use androidx.tracing.Trace instead", replaceWith = @kotlin.ReplaceWith(expression = "trace(sectionName, block)", imports = {"androidx.tracing.trace"}))
    public static final <T> T trace(java.lang.String str, kotlin.jvm.functions.Function0<? extends T> function0) {
        android.os.Trace.beginSection(str);
        try {
            return function0.invoke();
        } finally {
            android.os.Trace.endSection();
        }
    }
}
