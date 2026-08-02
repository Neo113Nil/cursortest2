package util.h.xy.ce;

/* loaded from: classes5.dex */
class ma {
    static int Camera2StreamConfigurationMap = 0;
    static int getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 95) % 128;
    java.util.LinkedHashMap<java.lang.String, util.h.xy.ce.b> getHighResolutionOutputSizeshNQ4ISI;
    private java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> getHighSpeedVideoFpsRangesFor;
    private java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> getHighSpeedVideoSizes;
    private java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> getInputSizeshNQ4ISI;
    private java.util.TreeMap<java.lang.String, util.h.xy.ce.b> getOutputFormats;

    public ma() {
        this.getHighSpeedVideoSizes = null;
        this.getInputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getOutputFormats = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoSizes = new java.util.TreeMap<>();
        this.getHighSpeedVideoFpsRangesFor = new java.util.TreeMap<>();
        this.getInputSizeshNQ4ISI = new java.util.TreeMap<>();
        this.getOutputFormats = new java.util.TreeMap<>();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap<>();
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 9) % 128;
    }

    public final java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> Camera2StreamConfigurationMap() {
        int i = Camera2StreamConfigurationMap;
        int i2 = (i ^ 41) + ((i & 41) << 1);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> treeMap = this.getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (i3 + 21) % 128;
        return treeMap;
    }

    public final java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> getHighSpeedVideoSizes() {
        int i = Camera2StreamConfigurationMap;
        int i2 = ((i & 107) + (i | 107)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> treeMap = this.getInputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (((i2 | 81) << 1) - (i2 ^ 81)) % 128;
        return treeMap;
    }

    public final java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> getHighSpeedVideoFpsRangesFor() {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i + 85) % 128;
        java.util.TreeMap<java.lang.Integer, util.h.xy.ce.b> treeMap = this.getHighSpeedVideoFpsRangesFor;
        Camera2StreamConfigurationMap = (i + 33) % 128;
        return treeMap;
    }

    public final java.util.TreeMap<java.lang.String, util.h.xy.ce.b> getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 33) + (i | 33);
        int i3 = i2 % 128;
        Camera2StreamConfigurationMap = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        java.util.TreeMap<java.lang.String, util.h.xy.ce.b> treeMap = this.getOutputFormats;
        int i4 = i3 + 115;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 != 0) {
            return treeMap;
        }
        throw new java.lang.ArithmeticException();
    }

    public final void getHighSpeedVideoFpsRanges() {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = ((i & 111) + (i | 111)) % 128;
        this.getHighSpeedVideoSizes.clear();
        this.getHighSpeedVideoFpsRangesFor.clear();
        this.getInputSizeshNQ4ISI.clear();
        this.getOutputFormats.clear();
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getInputSizeshNQ4ISI = null;
        this.getOutputFormats = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        int i2 = Camera2StreamConfigurationMap;
        int i3 = (i2 & 75) + (i2 | 75);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
