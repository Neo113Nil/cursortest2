package androidx.room.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "runBlockingUninterruptible", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RunBlockingUninterruptible_androidKt {
    public static final <T> T runBlockingUninterruptible(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) {
        java.lang.Object runBlocking$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        java.lang.Thread.interrupted();
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1(function2, null), 1, null);
        return (T) runBlocking$default;
    }
}
