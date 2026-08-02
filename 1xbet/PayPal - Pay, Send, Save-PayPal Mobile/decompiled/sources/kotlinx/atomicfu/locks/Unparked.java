package kotlinx.atomicfu.locks;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/atomicfu/locks/Unparked;", "Lkotlinx/atomicfu/locks/ParkingState;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class Unparked implements kotlinx.atomicfu.locks.ParkingState {
    public static final kotlinx.atomicfu.locks.Unparked INSTANCE = new kotlinx.atomicfu.locks.Unparked();

    private Unparked() {
    }
}
