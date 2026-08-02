package androidx.media3.muxer;

/* loaded from: classes7.dex */
final class MetadataCollector {
    public androidx.media3.container.Mp4LocationData getHighResolutionOutputSizeshNQ4ISI;
    public androidx.media3.container.XmpData getHighSpeedVideoFpsRangesFor;
    public androidx.media3.container.Mp4TimestampData getHighSpeedVideoSizes;
    public androidx.media3.container.Mp4OrientationData getHighSpeedVideoFpsRanges = new androidx.media3.container.Mp4OrientationData(0);
    public java.util.Set<androidx.media3.container.MdtaMetadataEntry> Camera2StreamConfigurationMap = new java.util.HashSet();

    public MetadataCollector() {
        long unixTimeToMp4TimeSeconds = androidx.media3.container.Mp4TimestampData.unixTimeToMp4TimeSeconds(java.lang.System.currentTimeMillis());
        this.getHighSpeedVideoSizes = new androidx.media3.container.Mp4TimestampData(unixTimeToMp4TimeSeconds, unixTimeToMp4TimeSeconds);
    }

    public final void getHighSpeedVideoFpsRanges(androidx.media3.common.Metadata.Entry entry) {
        if (entry instanceof androidx.media3.container.Mp4OrientationData) {
            this.getHighSpeedVideoFpsRanges = (androidx.media3.container.Mp4OrientationData) entry;
            return;
        }
        if (entry instanceof androidx.media3.container.Mp4LocationData) {
            this.getHighResolutionOutputSizeshNQ4ISI = (androidx.media3.container.Mp4LocationData) entry;
            return;
        }
        if (entry instanceof androidx.media3.container.Mp4TimestampData) {
            this.getHighSpeedVideoSizes = (androidx.media3.container.Mp4TimestampData) entry;
        } else if (entry instanceof androidx.media3.container.MdtaMetadataEntry) {
            this.Camera2StreamConfigurationMap.add((androidx.media3.container.MdtaMetadataEntry) entry);
        } else {
            if (entry instanceof androidx.media3.container.XmpData) {
                this.getHighSpeedVideoFpsRangesFor = (androidx.media3.container.XmpData) entry;
                return;
            }
            throw new java.lang.IllegalArgumentException("Unsupported metadata");
        }
    }
}
