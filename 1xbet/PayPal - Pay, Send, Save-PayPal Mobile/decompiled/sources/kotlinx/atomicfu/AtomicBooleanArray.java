package kotlinx.atomicfu;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028G¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlinx/atomicfu/AtomicBooleanArray;", "", "", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(I)V", "index", "Lkotlinx/atomicfu/AtomicBoolean;", "get", "(I)Lkotlinx/atomicfu/AtomicBoolean;", "", "getHighSpeedVideoFpsRangesFor", "[Lkotlinx/atomicfu/AtomicBoolean;", "getHighSpeedVideoSizes", "getSize", "()I", "getSize$annotations", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AtomicBooleanArray {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicBoolean[] getHighSpeedVideoSizes;

    public static /* synthetic */ void getSize$annotations() {
    }

    public AtomicBooleanArray(int i) {
        kotlinx.atomicfu.AtomicBoolean[] atomicBooleanArr = new kotlinx.atomicfu.AtomicBoolean[i];
        for (int i2 = 0; i2 < i; i2++) {
            atomicBooleanArr[i2] = kotlinx.atomicfu.AtomicFU.atomic(false);
        }
        this.getHighSpeedVideoSizes = atomicBooleanArr;
    }

    public final int getSize() {
        return this.getHighSpeedVideoSizes.length;
    }

    public final kotlinx.atomicfu.AtomicBoolean get(int index) {
        return this.getHighSpeedVideoSizes[index];
    }
}
