package androidx.room;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt", f = "RoomDatabase.kt", i = {0, 0}, l = {471, 471}, m = "useReaderConnection", n = {"$this$useReaderConnection", "block"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1<R> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return androidx.room.RoomDatabaseKt.useReaderConnection(null, null, this);
    }

    RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1(kotlin.coroutines.Continuation<? super androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1> continuation) {
        super(continuation);
    }
}
