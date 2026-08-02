package io.ktor.client.utils;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "unwrapCancellationException", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ExceptionUtilsJvmKt {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Throwable unwrapCancellationException(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        java.lang.Throwable th2 = th;
        while (true) {
            if (!(th2 instanceof java.util.concurrent.CancellationException)) {
                if (th2 == null) {
                    break;
                }
                return th2;
            }
            java.util.concurrent.CancellationException cancellationException = (java.util.concurrent.CancellationException) th2;
            if (kotlin.jvm.internal.Intrinsics.areEqual(th2, cancellationException.getCause())) {
                break;
            }
            th2 = cancellationException.getCause();
        }
    }
}
