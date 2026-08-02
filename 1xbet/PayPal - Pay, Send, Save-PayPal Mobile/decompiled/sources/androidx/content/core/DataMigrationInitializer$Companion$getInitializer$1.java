package androidx.content.core;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "T", com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest, "Landroidx/datastore/core/InitializerApi;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes3.dex */
final class DataMigrationInitializer$Companion$getInitializer$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.content.core.InitializerApi<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.List<androidx.content.core.DataMigration<T>> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.content.core.InitializerApi initializerApi = (androidx.content.core.InitializerApi) this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            highSpeedVideoFpsRanges = androidx.content.core.DataMigrationInitializer.INSTANCE.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, initializerApi, this);
            if (highSpeedVideoFpsRanges == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.content.core.DataMigrationInitializer$Companion$getInitializer$1) create((androidx.content.core.InitializerApi) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.content.core.DataMigrationInitializer$Companion$getInitializer$1 dataMigrationInitializer$Companion$getInitializer$1 = new androidx.content.core.DataMigrationInitializer$Companion$getInitializer$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        dataMigrationInitializer$Companion$getInitializer$1.getHighSpeedVideoFpsRanges = obj;
        return dataMigrationInitializer$Companion$getInitializer$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DataMigrationInitializer$Companion$getInitializer$1(java.util.List<? extends androidx.content.core.DataMigration<T>> list, kotlin.coroutines.Continuation<? super androidx.content.core.DataMigrationInitializer$Companion$getInitializer$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = list;
    }
}
