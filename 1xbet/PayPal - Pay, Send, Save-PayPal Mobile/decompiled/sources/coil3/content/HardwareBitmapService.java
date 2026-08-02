package coil3.content;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/util/HardwareBitmapService;", "", "Lcoil3/size/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "", "allowHardwareMainThread", "(Lcoil3/size/Size;)Z", "allowHardwareWorkerThread", "()Z", "Lcoil3/util/ImmutableHardwareBitmapService;", "Lcoil3/util/LimitedFileDescriptorHardwareBitmapService;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface HardwareBitmapService {
    boolean allowHardwareMainThread(coil3.view.Size size);

    boolean allowHardwareWorkerThread();
}
