package androidx.datastore.core;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: DataStoreImpl.kt */
@kotlin.Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", i = {1, 2}, l = {330, 331, 337}, m = "invokeSuspend", n = {"curData", "newData"}, s = {"L$0", "L$0"})
/* loaded from: classes2.dex */
final class DataStoreImpl$transformAndWrite$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    final /* synthetic */ kotlin.coroutines.CoroutineContext $callerContext;
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> $transform;
    java.lang.Object L$0;
    int label;
    final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DataStoreImpl$transformAndWrite$2(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl$transformAndWrite$2> continuation) {
        super(1, continuation);
        this.this$0 = dataStoreImpl;
        this.$callerContext = coroutineContext;
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.datastore.core.DataStoreImpl$transformAndWrite$2(this.this$0, this.$callerContext, this.$transform, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super T> continuation) {
        return ((androidx.datastore.core.DataStoreImpl$transformAndWrite$2) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.datastore.core.Data data;
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
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
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj2;
                }
                data = (androidx.datastore.core.Data) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                data.checkHashCode();
                if (!kotlin.jvm.internal.Intrinsics.areEqual(data.getValue(), obj)) {
                    return obj;
                }
                this.L$0 = obj;
                this.label = 3;
                if (((androidx.datastore.core.DataStoreImpl<T>) this.this$0).writeData$datastore_core_release(obj, true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = obj;
                return obj2;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        data = (androidx.datastore.core.Data) obj;
        this.L$0 = data;
        this.label = 2;
        obj = kotlinx.coroutines.BuildersKt.withContext(this.$callerContext, new androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1(this.$transform, data, null), this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        data.checkHashCode();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(data.getValue(), obj)) {
        }
    }
}
