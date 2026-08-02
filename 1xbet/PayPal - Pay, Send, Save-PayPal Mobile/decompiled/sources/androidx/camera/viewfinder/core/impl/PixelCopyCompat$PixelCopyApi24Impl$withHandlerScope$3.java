package androidx.camera.viewfinder.core.impl;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class PixelCopyCompat$PixelCopyApi24Impl$withHandlerScope$3 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor() {
        ((androidx.camera.viewfinder.core.impl.RefCounted) this.receiver).release();
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ kotlin.Unit invoke() {
        getHighSpeedVideoFpsRangesFor();
        return kotlin.Unit.INSTANCE;
    }

    PixelCopyCompat$PixelCopyApi24Impl$withHandlerScope$3(java.lang.Object obj) {
        super(0, obj, androidx.camera.viewfinder.core.impl.RefCounted.class, "release", "release()V", 0);
    }
}
