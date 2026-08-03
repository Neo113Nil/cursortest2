package androidx.datastore.core;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: DataStoreImpl.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/core/Data;", "T", "locked", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", i = {0, 1}, l = {370, 371}, m = "invokeSuspend", n = {"locked", "data"}, s = {"Z$0", "L$0"})
/* loaded from: classes2.dex */
final class DataStoreImpl$readDataOrHandleCorruption$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super androidx.datastore.core.Data<T>>, java.lang.Object> {
    final /* synthetic */ int $preLockVersion;
    java.lang.Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataOrHandleCorruption$2(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, int i, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2> continuation) {
        super(2, continuation);
        this.this$0 = dataStoreImpl;
        this.$preLockVersion = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2 dataStoreImpl$readDataOrHandleCorruption$2 = new androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2(this.this$0, this.$preLockVersion, continuation);
        dataStoreImpl$readDataOrHandleCorruption$2.Z$0 = ((java.lang.Boolean) obj).booleanValue();
        return dataStoreImpl$readDataOrHandleCorruption$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, java.lang.Object obj) {
        return invoke(bool.booleanValue(), (kotlin.coroutines.Continuation) obj);
    }

    public final java.lang.Object invoke(boolean z, kotlin.coroutines.Continuation<? super androidx.datastore.core.Data<T>> continuation) {
        return ((androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z;
        java.lang.Object obj2;
        int i;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            z = this.Z$0;
            this.Z$0 = z;
            this.label = 1;
            obj = this.this$0.readDataFromFileOrDefault(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                i = ((java.lang.Number) obj).intValue();
                return new androidx.datastore.core.Data(obj2, obj2 != null ? obj2.hashCode() : 0, i);
            }
            z = this.Z$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (z) {
            this.L$0 = obj;
            this.label = 2;
            java.lang.Object version = this.this$0.getCoordinator().getVersion(this);
            if (version == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj2 = obj;
            obj = version;
            i = ((java.lang.Number) obj).intValue();
            return new androidx.datastore.core.Data(obj2, obj2 != null ? obj2.hashCode() : 0, i);
        }
        obj2 = obj;
        i = this.$preLockVersion;
        return new androidx.datastore.core.Data(obj2, obj2 != null ? obj2.hashCode() : 0, i);
    }
}
