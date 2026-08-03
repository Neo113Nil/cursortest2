package io.ktor.client.utils;

/* compiled from: ExceptionUtilsJvm.kt */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "unwrapCancellationException", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExceptionUtilsJvmKt {
    public static final java.lang.Throwable unwrapCancellationException(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "<this>");
        java.lang.Throwable th2 = th;
        while (th2 instanceof java.util.concurrent.CancellationException) {
            java.util.concurrent.CancellationException cancellationException = (java.util.concurrent.CancellationException) th2;
            if (kotlin.jvm.internal.Intrinsics.areEqual(th2, cancellationException.getCause())) {
                return th;
            }
            th2 = cancellationException.getCause();
        }
        return th2 == null ? th : th2;
    }
}
