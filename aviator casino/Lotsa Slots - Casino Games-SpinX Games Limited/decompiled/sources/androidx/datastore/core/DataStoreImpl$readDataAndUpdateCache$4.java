package androidx.datastore.core;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: DataStoreImpl.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroidx/datastore/core/State;", "T", "", "locked"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", i = {0, 1}, l = {306, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE}, m = "invokeSuspend", n = {"locked", "locked"}, s = {"Z$0", "Z$0"})
/* loaded from: classes2.dex */
final class DataStoreImpl$readDataAndUpdateCache$4<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends androidx.datastore.core.State<T>, ? extends java.lang.Boolean>>, java.lang.Object> {
    final /* synthetic */ int $cachedVersion;
    java.lang.Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataStoreImpl$readDataAndUpdateCache$4(androidx.datastore.core.DataStoreImpl<T> dataStoreImpl, int i, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4> continuation) {
        super(2, continuation);
        this.this$0 = dataStoreImpl;
        this.$cachedVersion = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4(this.this$0, this.$cachedVersion, continuation);
        dataStoreImpl$readDataAndUpdateCache$4.Z$0 = ((java.lang.Boolean) obj).booleanValue();
        return dataStoreImpl$readDataAndUpdateCache$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Boolean bool, java.lang.Object obj) {
        return invoke(bool.booleanValue(), (kotlin.coroutines.Continuation) obj);
    }

    public final java.lang.Object invoke(boolean z, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends androidx.datastore.core.State<T>, java.lang.Boolean>> continuation) {
        return ((androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4) create(java.lang.Boolean.valueOf(z), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Throwable th;
        int i;
        boolean z;
        androidx.datastore.core.ReadException readException;
        boolean z2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z3 = this.label;
        try {
        } catch (java.lang.Throwable th2) {
            if (z3 != 0) {
                this.L$0 = th2;
                this.Z$0 = z3;
                this.label = 2;
                java.lang.Object version = this.this$0.getCoordinator().getVersion(this);
                if (version == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z = z3;
                th = th2;
                obj = version;
            } else {
                boolean z4 = z3;
                th = th2;
                i = this.$cachedVersion;
                z = z4;
            }
        }
        if (z3 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z5 = this.Z$0;
            this.Z$0 = z5;
            this.label = 1;
            obj = this.this$0.readDataOrHandleCorruption(z5, this);
            z3 = z5;
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (z3 != 1) {
                if (z3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = this.Z$0;
                th = (java.lang.Throwable) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                i = ((java.lang.Number) obj).intValue();
                readException = new androidx.datastore.core.ReadException(th, i);
                z2 = z;
                return kotlin.TuplesKt.to(readException, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2));
            }
            boolean z6 = this.Z$0;
            kotlin.ResultKt.throwOnFailure(obj);
            z3 = z6;
        }
        readException = (androidx.datastore.core.State) obj;
        z2 = z3;
        return kotlin.TuplesKt.to(readException, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2));
    }
}
