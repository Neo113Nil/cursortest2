package androidx.datastore.core;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: DataStoreImpl.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001\"\u0004\b\u0000\u0010\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/datastore/core/State;", "T", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", i = {}, l = {298, androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class DataStoreImpl$readDataAndUpdateCache$3<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Pair<? extends androidx.datastore.core.State<T>, ? extends java.lang.Boolean>>, java.lang.Object> {
    java.lang.Object L$0;
    int label;
    final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataAndUpdateCache$3(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3> continuation) {
        super(1, continuation);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Pair<? extends androidx.datastore.core.State<T>, java.lang.Boolean>> continuation) {
        return ((androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Throwable th;
        androidx.datastore.core.ReadException readException;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (java.lang.Throwable th2) {
            this.L$0 = th2;
            this.label = 2;
            java.lang.Object version = this.this$0.getCoordinator().getVersion(this);
            if (version == coroutine_suspended) {
                return coroutine_suspended;
            }
            th = th2;
            obj = version;
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.readDataOrHandleCorruption(true, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (java.lang.Throwable) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                readException = new androidx.datastore.core.ReadException(th, ((java.lang.Number) obj).intValue());
                return kotlin.TuplesKt.to(readException, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        readException = (androidx.datastore.core.State) obj;
        return kotlin.TuplesKt.to(readException, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
    }
}
