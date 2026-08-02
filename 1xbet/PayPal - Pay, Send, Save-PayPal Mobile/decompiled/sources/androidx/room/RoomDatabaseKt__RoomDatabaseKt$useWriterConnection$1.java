package androidx.room;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt", f = "RoomDatabase.kt", i = {0, 0, 1}, l = {androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING}, m = "useWriterConnection", n = {"$this$useWriterConnection", "block", "$this$useWriterConnection"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes.dex */
final class RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return androidx.room.RoomDatabaseKt.useWriterConnection(null, null, this);
    }

    RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1(kotlin.coroutines.Continuation<? super androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1> continuation) {
        super(continuation);
    }
}
