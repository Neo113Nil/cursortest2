package androidx.camera.featurecombinationquery;

/* loaded from: classes6.dex */
public class SessionParametersLegacy {
    private final java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> getHighSpeedVideoFpsRanges;

    /* synthetic */ SessionParametersLegacy(java.util.Map map, byte b) {
        this(map);
    }

    private SessionParametersLegacy(java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> map) {
        this.getHighSpeedVideoFpsRanges = map;
    }

    public java.util.Set<android.hardware.camera2.CaptureRequest.Key<?>> getKeys() {
        return androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9180m((java.util.Collection) this.getHighSpeedVideoFpsRanges.keySet());
    }

    public <T> T get(android.hardware.camera2.CaptureRequest.Key<T> key) {
        return (T) this.getHighSpeedVideoFpsRanges.get(key);
    }

    public java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> asMap() {
        return java.util.Collections.unmodifiableMap(this.getHighSpeedVideoFpsRanges);
    }

    public static final class Builder {
        private final java.util.HashMap<android.hardware.camera2.CaptureRequest.Key<?>, java.lang.Object> getHighSpeedVideoFpsRanges = new java.util.HashMap<>();

        public final <T> androidx.camera.featurecombinationquery.SessionParametersLegacy.Builder set(android.hardware.camera2.CaptureRequest.Key<T> key, T t) {
            this.getHighSpeedVideoFpsRanges.put(key, t);
            return this;
        }

        public final androidx.camera.featurecombinationquery.SessionParametersLegacy build() {
            return new androidx.camera.featurecombinationquery.SessionParametersLegacy(androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m((java.util.Map) this.getHighSpeedVideoFpsRanges), (byte) 0);
        }
    }
}
