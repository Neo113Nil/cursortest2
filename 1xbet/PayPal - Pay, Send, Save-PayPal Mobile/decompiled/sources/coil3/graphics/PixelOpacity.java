package coil3.graphics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcoil3/gif/PixelOpacity;", "", "<init>", "(Ljava/lang/String;I)V", "UNCHANGED", "TRANSLUCENT", "OPAQUE"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PixelOpacity {
    public static final coil3.graphics.PixelOpacity OPAQUE;
    public static final coil3.graphics.PixelOpacity TRANSLUCENT;
    public static final coil3.graphics.PixelOpacity UNCHANGED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ coil3.graphics.PixelOpacity[] getHighSpeedVideoSizes;

    private PixelOpacity(java.lang.String str, int i) {
    }

    static {
        coil3.graphics.PixelOpacity pixelOpacity = new coil3.graphics.PixelOpacity("UNCHANGED", 0);
        UNCHANGED = pixelOpacity;
        coil3.graphics.PixelOpacity pixelOpacity2 = new coil3.graphics.PixelOpacity("TRANSLUCENT", 1);
        TRANSLUCENT = pixelOpacity2;
        coil3.graphics.PixelOpacity pixelOpacity3 = new coil3.graphics.PixelOpacity("OPAQUE", 2);
        OPAQUE = pixelOpacity3;
        coil3.graphics.PixelOpacity[] pixelOpacityArr = {pixelOpacity, pixelOpacity2, pixelOpacity3};
        getHighSpeedVideoSizes = pixelOpacityArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(pixelOpacityArr);
    }

    public static coil3.graphics.PixelOpacity[] values() {
        return (coil3.graphics.PixelOpacity[]) getHighSpeedVideoSizes.clone();
    }

    public static coil3.graphics.PixelOpacity valueOf(java.lang.String str) {
        return (coil3.graphics.PixelOpacity) java.lang.Enum.valueOf(coil3.graphics.PixelOpacity.class, str);
    }

    public static kotlin.enums.EnumEntries<coil3.graphics.PixelOpacity> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
