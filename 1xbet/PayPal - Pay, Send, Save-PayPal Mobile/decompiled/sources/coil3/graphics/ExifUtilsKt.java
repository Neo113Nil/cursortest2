package coil3.graphics;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0018\u0010\u0002\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003"}, d2 = {"Lcoil3/decode/ExifData;", "", "isSwapped", "(Lcoil3/decode/ExifData;)Z", "isRotated"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExifUtilsKt {
    public static final boolean isSwapped(coil3.graphics.ExifData exifData) {
        return exifData.getRotationDegrees() == 90 || exifData.getRotationDegrees() == 270;
    }

    public static final boolean isRotated(coil3.graphics.ExifData exifData) {
        return exifData.getRotationDegrees() > 0;
    }
}
