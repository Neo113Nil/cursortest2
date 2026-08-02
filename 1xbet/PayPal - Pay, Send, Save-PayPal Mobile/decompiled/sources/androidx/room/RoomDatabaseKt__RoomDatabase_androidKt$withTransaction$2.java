package androidx.room;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2", f = "RoomDatabase.android.kt", i = {}, l = {2044}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    final /* synthetic */ androidx.room.RoomDatabase getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRanges.beginTransaction();
                kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super R>, java.lang.Object> function1 = this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoFpsRangesFor = 1;
                obj = function1.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            this.getHighSpeedVideoFpsRanges.setTransactionSuccessful();
            return obj;
        } finally {
            this.getHighSpeedVideoFpsRanges.endTransaction();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        return ((androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2(androidx.room.RoomDatabase roomDatabase, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRanges = roomDatabase;
        this.getHighSpeedVideoSizes = function1;
    }
}
