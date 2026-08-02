package coil3.content;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcoil3/util/ImmutableHardwareBitmapService;", "Lcoil3/util/HardwareBitmapService;", "", "p0", "<init>", "(Z)V", "Lcoil3/size/Size;", "allowHardwareMainThread", "(Lcoil3/size/Size;)Z", "allowHardwareWorkerThread", "()Z", "getHighSpeedVideoSizes", "Z", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ImmutableHardwareBitmapService implements coil3.content.HardwareBitmapService {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    public ImmutableHardwareBitmapService(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @Override // coil3.content.HardwareBitmapService
    public final boolean allowHardwareMainThread(coil3.view.Size p0) {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // coil3.content.HardwareBitmapService
    /* renamed from: allowHardwareWorkerThread, reason: from getter */
    public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
