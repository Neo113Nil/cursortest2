package androidx.room;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class InvalidationTracker$setAutoCloser$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void getHighSpeedVideoFpsRanges() {
        androidx.room.InvalidationTracker.access$onAutoCloseCallback((androidx.room.InvalidationTracker) this.receiver);
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        getHighSpeedVideoFpsRanges();
        return kotlin.Unit.INSTANCE;
    }

    InvalidationTracker$setAutoCloser$1(java.lang.Object obj) {
        super(0, obj, androidx.room.InvalidationTracker.class, "onAutoCloseCallback", "onAutoCloseCallback()V", 0);
    }
}
