package androidx.datastore.core;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: MultiProcessCoordinator.android.kt */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2", f = "MultiProcessCoordinator.android.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class MultiProcessCoordinator$withLazyCounter$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.datastore.core.SharedCounter, kotlin.coroutines.Continuation<? super T>, java.lang.Object> $block;
    int label;
    final /* synthetic */ androidx.datastore.core.MultiProcessCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MultiProcessCoordinator$withLazyCounter$2(kotlin.jvm.functions.Function2<? super androidx.datastore.core.SharedCounter, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, androidx.datastore.core.MultiProcessCoordinator multiProcessCoordinator, kotlin.coroutines.Continuation<? super androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2> continuation) {
        super(2, continuation);
        this.$block = function2;
        this.this$0 = multiProcessCoordinator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2(this.$block, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super T> continuation) {
        return ((androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.datastore.core.SharedCounter sharedCounter;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.functions.Function2<androidx.datastore.core.SharedCounter, kotlin.coroutines.Continuation<? super T>, java.lang.Object> function2 = this.$block;
            sharedCounter = this.this$0.getSharedCounter();
            this.label = 1;
            obj = function2.invoke(sharedCounter, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        androidx.datastore.core.SharedCounter sharedCounter;
        kotlin.jvm.functions.Function2<androidx.datastore.core.SharedCounter, kotlin.coroutines.Continuation<? super T>, java.lang.Object> function2 = this.$block;
        sharedCounter = this.this$0.getSharedCounter();
        return function2.invoke(sharedCounter, this);
    }
}
