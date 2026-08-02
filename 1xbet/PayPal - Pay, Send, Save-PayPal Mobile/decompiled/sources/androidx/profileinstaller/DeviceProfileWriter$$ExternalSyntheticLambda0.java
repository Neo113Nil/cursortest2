package androidx.profileinstaller;

/* loaded from: classes7.dex */
public final /* synthetic */ class DeviceProfileWriter$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ androidx.profileinstaller.DeviceProfileWriter f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ java.lang.Object f$2;

    public /* synthetic */ DeviceProfileWriter$$ExternalSyntheticLambda0(androidx.profileinstaller.DeviceProfileWriter deviceProfileWriter, int i, java.lang.Object obj) {
        this.f$0 = deviceProfileWriter;
        this.f$1 = i;
        this.f$2 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.profileinstaller.DeviceProfileWriter deviceProfileWriter = this.f$0;
        deviceProfileWriter.getHighSpeedVideoFpsRangesFor.onResultReceived(this.f$1, this.f$2);
    }
}
