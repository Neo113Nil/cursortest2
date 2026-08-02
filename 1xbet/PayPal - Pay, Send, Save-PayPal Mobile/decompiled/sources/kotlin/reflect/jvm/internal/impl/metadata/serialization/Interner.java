package kotlin.reflect.jvm.internal.impl.metadata.serialization;

/* loaded from: classes17.dex */
public final class Interner<T> {
    private final int Camera2StreamConfigurationMap;
    private final java.util.HashMap<T, java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.metadata.serialization.Interner<T> getHighSpeedVideoSizes;

    private final java.lang.Integer getHighSpeedVideoFpsRanges(T t) {
        java.lang.Integer highSpeedVideoFpsRanges;
        kotlin.reflect.jvm.internal.impl.metadata.serialization.Interner<T> interner = this.getHighSpeedVideoSizes;
        if (interner != null) {
            interner.getHighResolutionOutputSizeshNQ4ISI.size();
            int i = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
        }
        kotlin.reflect.jvm.internal.impl.metadata.serialization.Interner<T> interner2 = this.getHighSpeedVideoSizes;
        return (interner2 == null || (highSpeedVideoFpsRanges = interner2.getHighSpeedVideoFpsRanges(t)) == null) ? this.getHighResolutionOutputSizeshNQ4ISI.get(t) : highSpeedVideoFpsRanges;
    }

    public final int intern(T t) {
        java.lang.Integer highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(t);
        if (highSpeedVideoFpsRanges != null) {
            return highSpeedVideoFpsRanges.intValue();
        }
        int size = this.Camera2StreamConfigurationMap + this.getHighResolutionOutputSizeshNQ4ISI.size();
        this.getHighResolutionOutputSizeshNQ4ISI.put(t, java.lang.Integer.valueOf(size));
        return size;
    }
}
