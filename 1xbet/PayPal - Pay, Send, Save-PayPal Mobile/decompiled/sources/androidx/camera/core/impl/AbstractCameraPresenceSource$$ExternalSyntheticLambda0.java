package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public final /* synthetic */ class AbstractCameraPresenceSource$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ java.lang.Throwable f$0;
    public final /* synthetic */ androidx.camera.core.impl.AbstractCameraPresenceSource.ObserverWrapper f$1;
    public final /* synthetic */ java.util.List f$2;

    public /* synthetic */ AbstractCameraPresenceSource$$ExternalSyntheticLambda0(java.lang.Throwable th, androidx.camera.core.impl.AbstractCameraPresenceSource.ObserverWrapper observerWrapper, java.util.List list) {
        this.f$0 = th;
        this.f$1 = observerWrapper;
        this.f$2 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.camera.core.impl.AbstractCameraPresenceSource.Camera2StreamConfigurationMap(this.f$0, this.f$1, this.f$2);
    }
}
