package androidx.core.location;

/* loaded from: classes7.dex */
class GpsStatusWrapper extends androidx.core.location.GnssStatusCompat {
    private final android.location.GpsStatus Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private android.location.GpsSatellite getHighSpeedVideoFpsRangesFor;
    private java.util.Iterator<android.location.GpsSatellite> getHighSpeedVideoSizes;

    private static int getHighSpeedVideoFpsRangesFor(int i) {
        if (i > 0 && i <= 32) {
            return 1;
        }
        if (i >= 33 && i <= 64) {
            return 2;
        }
        if (i > 64 && i <= 88) {
            return 3;
        }
        if (i <= 200 || i > 235) {
            return (i < 193 || i > 200) ? 0 : 4;
        }
        return 5;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasBasebandCn0DbHz(int i) {
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasCarrierFrequencyHz(int i) {
        return false;
    }

    GpsStatusWrapper(android.location.GpsStatus gpsStatus) {
        android.location.GpsStatus gpsStatus2 = (android.location.GpsStatus) androidx.core.util.Preconditions.checkNotNull(gpsStatus);
        this.Camera2StreamConfigurationMap = gpsStatus2;
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        this.getHighSpeedVideoSizes = gpsStatus2.getSatellites().iterator();
        this.getHighSpeedVideoFpsRanges = -1;
        this.getHighSpeedVideoFpsRangesFor = null;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSatelliteCount() {
        int i;
        synchronized (this.Camera2StreamConfigurationMap) {
            if (this.getHighResolutionOutputSizeshNQ4ISI == -1) {
                for (android.location.GpsSatellite gpsSatellite : this.Camera2StreamConfigurationMap.getSatellites()) {
                    this.getHighResolutionOutputSizeshNQ4ISI++;
                }
                this.getHighResolutionOutputSizeshNQ4ISI++;
            }
            i = this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return i;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getConstellationType(int i) {
        return getHighSpeedVideoFpsRangesFor(getHighResolutionOutputSizeshNQ4ISI(i).getPrn());
    }

    @Override // androidx.core.location.GnssStatusCompat
    public int getSvid(int i) {
        int prn = getHighResolutionOutputSizeshNQ4ISI(i).getPrn();
        int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(prn);
        return highSpeedVideoFpsRangesFor != 2 ? highSpeedVideoFpsRangesFor != 3 ? highSpeedVideoFpsRangesFor != 5 ? prn : prn - 200 : prn - 64 : prn + 87;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCn0DbHz(int i) {
        return getHighResolutionOutputSizeshNQ4ISI(i).getSnr();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getElevationDegrees(int i) {
        return getHighResolutionOutputSizeshNQ4ISI(i).getElevation();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getAzimuthDegrees(int i) {
        return getHighResolutionOutputSizeshNQ4ISI(i).getAzimuth();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasEphemerisData(int i) {
        return getHighResolutionOutputSizeshNQ4ISI(i).hasEphemeris();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean hasAlmanacData(int i) {
        return getHighResolutionOutputSizeshNQ4ISI(i).hasAlmanac();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public boolean usedInFix(int i) {
        return getHighResolutionOutputSizeshNQ4ISI(i).usedInFix();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getCarrierFrequencyHz(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public float getBasebandCn0DbHz(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    private android.location.GpsSatellite getHighResolutionOutputSizeshNQ4ISI(int i) {
        android.location.GpsSatellite gpsSatellite;
        synchronized (this.Camera2StreamConfigurationMap) {
            if (i < this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoSizes = this.Camera2StreamConfigurationMap.getSatellites().iterator();
                this.getHighSpeedVideoFpsRanges = -1;
            }
            while (true) {
                int i2 = this.getHighSpeedVideoFpsRanges;
                if (i2 >= i) {
                    break;
                }
                this.getHighSpeedVideoFpsRanges = i2 + 1;
                if (!this.getHighSpeedVideoSizes.hasNext()) {
                    this.getHighSpeedVideoFpsRangesFor = null;
                    break;
                }
                this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizes.next();
            }
            gpsSatellite = this.getHighSpeedVideoFpsRangesFor;
        }
        return (android.location.GpsSatellite) androidx.core.util.Preconditions.checkNotNull(gpsSatellite);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.core.location.GpsStatusWrapper) {
            return this.Camera2StreamConfigurationMap.equals(((androidx.core.location.GpsStatusWrapper) obj).Camera2StreamConfigurationMap);
        }
        return false;
    }

    public int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode();
    }
}
