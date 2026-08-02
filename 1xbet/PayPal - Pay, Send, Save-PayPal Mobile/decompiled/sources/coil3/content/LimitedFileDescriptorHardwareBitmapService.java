package coil3.content;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcoil3/util/LimitedFileDescriptorHardwareBitmapService;", "Lcoil3/util/HardwareBitmapService;", "Lcoil3/util/Logger;", "p0", "<init>", "(Lcoil3/util/Logger;)V", "Lcoil3/size/Size;", "", "allowHardwareMainThread", "(Lcoil3/size/Size;)Z", "allowHardwareWorkerThread", "()Z", "Camera2StreamConfigurationMap", "Lcoil3/util/Logger;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class LimitedFileDescriptorHardwareBitmapService implements coil3.content.HardwareBitmapService {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final coil3.content.Logger getHighResolutionOutputSizeshNQ4ISI;

    public LimitedFileDescriptorHardwareBitmapService(coil3.content.Logger logger) {
        this.getHighResolutionOutputSizeshNQ4ISI = logger;
    }

    @Override // coil3.content.HardwareBitmapService
    public final boolean allowHardwareMainThread(coil3.view.Size p0) {
        coil3.view.Dimension width = p0.getWidth();
        if ((width instanceof coil3.size.Dimension.Pixels) && ((coil3.size.Dimension.Pixels) width).m9807unboximpl() <= 100) {
            return false;
        }
        coil3.view.Dimension height = p0.getHeight();
        return !(height instanceof coil3.size.Dimension.Pixels) || ((coil3.size.Dimension.Pixels) height).m9807unboximpl() > 100;
    }

    @Override // coil3.content.HardwareBitmapService
    /* renamed from: allowHardwareWorkerThread */
    public final boolean getGetHighResolutionOutputSizeshNQ4ISI() {
        return coil3.content.FileDescriptorCounter.INSTANCE.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
