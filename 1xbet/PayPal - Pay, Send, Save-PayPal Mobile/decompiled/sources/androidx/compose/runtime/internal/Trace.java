package androidx.compose.runtime.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/runtime/internal/Trace;", "", "<init>", "()V", "", "name", "beginSection", "(Ljava/lang/String;)Ljava/lang/Object;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "endSection", "(Ljava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Trace {
    public static final int $stable = 0;
    public static final androidx.compose.runtime.internal.Trace INSTANCE = new androidx.compose.runtime.internal.Trace();

    private Trace() {
    }

    public final java.lang.Object beginSection(java.lang.String name2) {
        android.os.Trace.beginSection(name2);
        return null;
    }

    public final void endSection(java.lang.Object token) {
        android.os.Trace.endSection();
    }
}
