package kotlinx.atomicfu;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b0\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00038G¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlinx/atomicfu/AtomicArray;", "T", "", "", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(I)V", "index", "Lkotlinx/atomicfu/AtomicRef;", "get", "(I)Lkotlinx/atomicfu/AtomicRef;", "", "getHighResolutionOutputSizeshNQ4ISI", "[Lkotlinx/atomicfu/AtomicRef;", "getHighSpeedVideoSizes", "getSize", "()I", "getSize$annotations", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AtomicArray<T> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicRef<T>[] getHighSpeedVideoSizes;

    public static /* synthetic */ void getSize$annotations() {
    }

    public AtomicArray(int i) {
        kotlinx.atomicfu.AtomicRef<T>[] atomicRefArr = new kotlinx.atomicfu.AtomicRef[i];
        for (int i2 = 0; i2 < i; i2++) {
            atomicRefArr[i2] = kotlinx.atomicfu.AtomicFU.atomic((java.lang.Object) null);
        }
        this.getHighSpeedVideoSizes = atomicRefArr;
    }

    public final int getSize() {
        return this.getHighSpeedVideoSizes.length;
    }

    public final kotlinx.atomicfu.AtomicRef<T> get(int index) {
        return this.getHighSpeedVideoSizes[index];
    }
}
