package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0006\u001a\u00020\u00058\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/camera/camera2/pipe/CameraPipe$Config;", "config", "Landroidx/camera/camera2/pipe/CameraPipe;", "CameraPipe", "(Landroidx/camera/camera2/pipe/CameraPipe$Config;)Landroidx/camera/camera2/pipe/CameraPipe;", "Lkotlinx/atomicfu/AtomicInt;", "cameraPipeIds", "Lkotlinx/atomicfu/AtomicInt;", "getCameraPipeIds", "()Lkotlinx/atomicfu/AtomicInt;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CameraPipeKt {
    private static final kotlinx.atomicfu.AtomicInt cameraPipeIds = kotlinx.atomicfu.AtomicFU.atomic(0);

    public static final kotlinx.atomicfu.AtomicInt getCameraPipeIds() {
        return cameraPipeIds;
    }

    public static final androidx.camera.camera2.pipe.CameraPipe CameraPipe(androidx.camera.camera2.pipe.CameraPipe.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        return androidx.camera.camera2.pipe.CameraPipe.INSTANCE.create(config);
    }
}
