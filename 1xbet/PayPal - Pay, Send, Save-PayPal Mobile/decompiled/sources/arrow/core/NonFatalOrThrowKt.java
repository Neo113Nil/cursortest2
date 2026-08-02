package arrow.core;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "nonFatalOrThrow", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "", "throwIfFatal", "(Ljava/lang/Throwable;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NonFatalOrThrowKt {
    public static final java.lang.Throwable nonFatalOrThrow(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        if (arrow.core.NonFatalKt.NonFatal(th)) {
            return th;
        }
        throw th;
    }

    public static final void throwIfFatal(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        nonFatalOrThrow(th);
    }
}
