package io.ktor.utils.io;

/* compiled from: CloseToken.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\b\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/utils/io/CloseToken;", "", "", "origin", "<init>", "(Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "wrap", "wrapCause", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Throwable;", "", "throwOrNull", "(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;", "Ljava/lang/Throwable;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CloseToken {
    private final java.lang.Throwable origin;

    public CloseToken(java.lang.Throwable th) {
        this.origin = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.Throwable wrapCause$default(io.ktor.utils.io.CloseToken closeToken, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = io.ktor.utils.io.CloseToken$wrapCause$1.INSTANCE;
        }
        return closeToken.wrapCause(function1);
    }

    public final java.lang.Throwable wrapCause(kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable> wrap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wrap, "wrap");
        java.lang.Object obj = this.origin;
        if (obj == null) {
            return null;
        }
        return obj instanceof kotlinx.coroutines.CopyableThrowable ? ((kotlinx.coroutines.CopyableThrowable) obj).createCopy() : obj instanceof java.util.concurrent.CancellationException ? kotlinx.coroutines.ExceptionsKt.CancellationException(((java.util.concurrent.CancellationException) obj).getMessage(), this.origin) : wrap.invoke(obj);
    }

    public final kotlin.Unit throwOrNull(kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable> wrap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wrap, "wrap");
        java.lang.Throwable wrapCause = wrapCause(wrap);
        if (wrapCause == null) {
            return null;
        }
        throw wrapCause;
    }
}
