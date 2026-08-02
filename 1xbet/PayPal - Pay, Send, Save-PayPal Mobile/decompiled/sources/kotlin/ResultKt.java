package kotlin;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "exception", "", "createFailure", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "Lkotlin/Result;", "", "throwOnFailure", "(Ljava/lang/Object;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ResultKt {
    public static final java.lang.Object createFailure(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        return new kotlin.Result.Failure(th);
    }

    public static final void throwOnFailure(java.lang.Object obj) {
        if (obj instanceof kotlin.Result.Failure) {
            throw ((kotlin.Result.Failure) obj).exception;
        }
    }
}
