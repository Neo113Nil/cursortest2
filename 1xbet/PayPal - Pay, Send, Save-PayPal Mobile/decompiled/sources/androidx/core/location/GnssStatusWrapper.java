package androidx.core.location;

/* loaded from: classes7.dex */
class GnssStatusWrapper extends androidx.core.location.GnssStatusCompat {
    private final android.location.GnssStatus getHighSpeedVideoFpsRanges;

    GnssStatusWrapper(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = (android.location.GnssStatus) androidx.core.util.Preconditions.checkNotNull((android.location.GnssStatus) obj);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
        return this.getHighSpeedVideoFpsRanges.getSatelliteCount();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int i) {
        return this.getHighSpeedVideoFpsRanges.getConstellationType(i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int i) {
        return this.getHighSpeedVideoFpsRanges.getSvid(i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int i) {
        return this.getHighSpeedVideoFpsRanges.getCn0DbHz(i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int i) {
        return this.getHighSpeedVideoFpsRanges.getElevationDegrees(i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int i) {
        return this.getHighSpeedVideoFpsRanges.getAzimuthDegrees(i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int i) {
        return this.getHighSpeedVideoFpsRanges.hasEphemerisData(i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int i) {
        return this.getHighSpeedVideoFpsRanges.hasAlmanacData(i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int i) {
        return this.getHighSpeedVideoFpsRanges.usedInFix(i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int i) {
        return androidx.core.location.GnssStatusWrapper.Api26Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int i) {
        return androidx.core.location.GnssStatusWrapper.Api26Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, i);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.location.GnssStatusWrapper.Api30Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, i);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.location.GnssStatusWrapper.Api30Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, i);
        }
        throw new java.lang.UnsupportedOperationException();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.core.location.GnssStatusWrapper) {
            return this.getHighSpeedVideoFpsRanges.equals(((androidx.core.location.GnssStatusWrapper) obj).getHighSpeedVideoFpsRanges);
        }
        return false;
    }

    public int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static float Camera2StreamConfigurationMap(android.location.GnssStatus gnssStatus, int i) {
            return gnssStatus.getCarrierFrequencyHz(i);
        }

        static boolean getHighSpeedVideoSizes(android.location.GnssStatus gnssStatus, int i) {
            return gnssStatus.hasCarrierFrequencyHz(i);
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static boolean Camera2StreamConfigurationMap(android.location.GnssStatus gnssStatus, int i) {
            return gnssStatus.hasBasebandCn0DbHz(i);
        }

        static float getHighSpeedVideoSizes(android.location.GnssStatus gnssStatus, int i) {
            return gnssStatus.getBasebandCn0DbHz(i);
        }
    }
}
