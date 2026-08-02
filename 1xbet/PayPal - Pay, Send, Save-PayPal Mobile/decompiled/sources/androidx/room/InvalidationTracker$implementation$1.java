package androidx.room;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class InvalidationTracker$implementation$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.util.Set<? extends java.lang.Integer>, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(java.util.Set<java.lang.Integer> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        androidx.room.InvalidationTracker.access$notifyInvalidatedObservers((androidx.room.InvalidationTracker) this.receiver, set);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(java.util.Set<? extends java.lang.Integer> set) {
        getHighSpeedVideoFpsRangesFor(set);
        return kotlin.Unit.INSTANCE;
    }

    InvalidationTracker$implementation$1(java.lang.Object obj) {
        super(1, obj, androidx.room.InvalidationTracker.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0);
    }
}
