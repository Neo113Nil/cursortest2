package androidx.datastore.core;

/* compiled from: DataStoreImpl.kt */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", i = {}, l = {387, 388, 390}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class DataStoreImpl$readDataOrHandleCorruption$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<T> $newData;
    final /* synthetic */ kotlin.jvm.internal.Ref.IntRef $version;
    java.lang.Object L$0;
    int label;
    final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataOrHandleCorruption$3(kotlin.jvm.internal.Ref.ObjectRef<T> objectRef, androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, kotlin.jvm.internal.Ref.IntRef intRef, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3> continuation) {
        super(1, continuation);
        this.$newData = objectRef;
        this.this$0 = dataStoreImpl;
        this.$version = intRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3(this.$newData, this.this$0, this.$version, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.Ref.IntRef intRef;
        java.lang.Object obj2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.lang.Object readDataFromFileOrDefault;
        T t;
        kotlin.jvm.internal.Ref.IntRef intRef2;
        java.lang.Object obj3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (androidx.datastore.core.CorruptionException unused) {
            kotlin.jvm.internal.Ref.IntRef intRef3 = this.$version;
            this.L$0 = intRef3;
            this.label = 3;
            java.lang.Object writeData$datastore_core_release = this.this$0.writeData$datastore_core_release(this.$newData.element, true, this);
            if (writeData$datastore_core_release == coroutine_suspended) {
                return coroutine_suspended;
            }
            intRef = intRef3;
            obj2 = writeData$datastore_core_release;
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            objectRef = this.$newData;
            this.L$0 = objectRef;
            this.label = 1;
            readDataFromFileOrDefault = this.this$0.readDataFromFileOrDefault(this);
            t = readDataFromFileOrDefault;
            if (readDataFromFileOrDefault == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    intRef2 = (kotlin.jvm.internal.Ref.IntRef) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    obj3 = obj;
                    intRef2.element = ((java.lang.Number) obj3).intValue();
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                intRef = (kotlin.jvm.internal.Ref.IntRef) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                obj2 = obj;
                intRef.element = ((java.lang.Number) obj2).intValue();
                return kotlin.Unit.INSTANCE;
            }
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            t = obj;
        }
        objectRef.element = t;
        intRef2 = this.$version;
        this.L$0 = intRef2;
        this.label = 2;
        java.lang.Object version = this.this$0.getCoordinator().getVersion(this);
        obj3 = version;
        if (version == coroutine_suspended) {
            return coroutine_suspended;
        }
        intRef2.element = ((java.lang.Number) obj3).intValue();
        return kotlin.Unit.INSTANCE;
    }
}
