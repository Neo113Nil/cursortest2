package coil3.graphics;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\u0003\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcoil3/decode/ExifData;", "", "", "isFlipped", "", "rotationDegrees", "<init>", "(ZI)V", "Z", "()Z", com.visa.cbp.getEncExpo.warmup, "getRotationDegrees", "()I", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExifData {
    public static final coil3.graphics.ExifData NONE = new coil3.graphics.ExifData(false, 0);
    private final boolean isFlipped;
    private final int rotationDegrees;

    public ExifData(boolean z, int i) {
        this.isFlipped = z;
        this.rotationDegrees = i;
    }

    /* renamed from: isFlipped, reason: from getter */
    public final boolean getIsFlipped() {
        return this.isFlipped;
    }

    public final int getRotationDegrees() {
        return this.rotationDegrees;
    }
}
