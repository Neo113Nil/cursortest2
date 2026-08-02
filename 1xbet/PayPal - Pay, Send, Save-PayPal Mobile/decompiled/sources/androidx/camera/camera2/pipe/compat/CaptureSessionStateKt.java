package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/atomicfu/AtomicInt;", "captureSessionDebugIds", "Lkotlinx/atomicfu/AtomicInt;", "getCaptureSessionDebugIds", "()Lkotlinx/atomicfu/AtomicInt;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CaptureSessionStateKt {
    private static final kotlinx.atomicfu.AtomicInt captureSessionDebugIds = kotlinx.atomicfu.AtomicFU.atomic(0);

    public static final kotlinx.atomicfu.AtomicInt getCaptureSessionDebugIds() {
        return captureSessionDebugIds;
    }
}
