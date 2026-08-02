package kotlinx.atomicfu.locks;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0015\u0010\t\u001a\u00060\u0002j\u0002`\u00038\u0007¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/atomicfu/locks/Parked;", "Lkotlinx/atomicfu/locks/ParkingState;", "Ljava/lang/Thread;", "Lkotlinx/atomicfu/locks/Camera2StreamConfigurationMap;", "p0", "<init>", "(Ljava/lang/Thread;)V", "Camera2StreamConfigurationMap", "Ljava/lang/Thread;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class Parked implements kotlinx.atomicfu.locks.ParkingState {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final java.lang.Thread getHighResolutionOutputSizeshNQ4ISI;

    public Parked(java.lang.Thread thread) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thread, "");
        this.getHighResolutionOutputSizeshNQ4ISI = thread;
    }
}
