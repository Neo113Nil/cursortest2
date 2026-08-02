package androidx.room;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class RoomDatabase$closeBarrier$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void Camera2StreamConfigurationMap() {
        ((androidx.room.RoomDatabase) this.receiver).onClosed();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        Camera2StreamConfigurationMap();
        return kotlin.Unit.INSTANCE;
    }

    RoomDatabase$closeBarrier$1(java.lang.Object obj) {
        super(0, obj, androidx.room.RoomDatabase.class, "onClosed", "onClosed()V", 0);
    }
}
