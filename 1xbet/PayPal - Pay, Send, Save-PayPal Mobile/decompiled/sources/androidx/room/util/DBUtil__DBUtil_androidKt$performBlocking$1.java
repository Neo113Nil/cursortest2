package androidx.room.util;

/* JADX INFO: Add missing generic type declarations: [R] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1", f = "DBUtil.android.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class DBUtil__DBUtil_androidKt$performBlocking$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.room.RoomDatabase getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.database.SQLiteConnection, R> getHighSpeedVideoSizes;
    int getInputFormats;

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1", f = "DBUtil.android.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
        final /* synthetic */ boolean Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.room.RoomDatabase getHighSpeedVideoFpsRanges;
        final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function1<androidx.database.SQLiteConnection, R> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i != 0) {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return obj;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            boolean z = !(this.getHighSpeedVideoFpsRanges.inCompatibilityMode() && this.getHighSpeedVideoFpsRanges.inTransaction()) && this.getHighSpeedVideoFpsRangesFor;
            androidx.room.RoomDatabase roomDatabase = this.getHighSpeedVideoFpsRanges;
            boolean z2 = this.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            java.lang.Object useConnection = roomDatabase.useConnection(z2, new androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1(z, z2, roomDatabase, null, this.getHighSpeedVideoSizes), this);
            return useConnection == coroutine_suspended ? coroutine_suspended : useConnection;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
            return ((androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1.AnonymousClass1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(androidx.room.RoomDatabase roomDatabase, boolean z, boolean z2, kotlin.jvm.functions.Function1<? super androidx.database.SQLiteConnection, ? extends R> function1, kotlin.coroutines.Continuation<? super androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = roomDatabase;
            this.getHighSpeedVideoFpsRangesFor = z;
            this.Camera2StreamConfigurationMap = z2;
            this.getHighSpeedVideoSizes = function1;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getInputFormats = 1;
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoFpsRangesFor, new androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, null), this);
        return withContext == coroutine_suspended ? coroutine_suspended : withContext;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DBUtil__DBUtil_androidKt$performBlocking$1(kotlin.coroutines.CoroutineContext coroutineContext, androidx.room.RoomDatabase roomDatabase, boolean z, boolean z2, kotlin.jvm.functions.Function1<? super androidx.database.SQLiteConnection, ? extends R> function1, kotlin.coroutines.Continuation<? super androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = coroutineContext;
        this.getHighSpeedVideoFpsRanges = roomDatabase;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.Camera2StreamConfigurationMap = z2;
        this.getHighSpeedVideoSizes = function1;
    }
}
