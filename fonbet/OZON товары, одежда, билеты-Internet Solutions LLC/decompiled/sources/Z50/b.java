package Z50;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b implements U50.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<U50.a> f35588a;

    public b(@NotNull a cameraAvailableBridgeInterface, @NotNull d cameraTakePhotoBridgeInterface, @NotNull f closeCameraInterface) {
        Intrinsics.checkNotNullParameter(cameraAvailableBridgeInterface, "cameraAvailableBridgeInterface");
        Intrinsics.checkNotNullParameter(cameraTakePhotoBridgeInterface, "cameraTakePhotoBridgeInterface");
        Intrinsics.checkNotNullParameter(closeCameraInterface, "closeCameraInterface");
        this.f35588a = C7714v.b0(cameraAvailableBridgeInterface, cameraTakePhotoBridgeInterface, closeCameraInterface);
    }

    @Override // U50.b
    @NotNull
    public final List<U50.a> a() {
        return this.f35588a;
    }

    @Override // U50.b
    @NotNull
    public final String getName() {
        return "camera";
    }
}
