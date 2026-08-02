package com.caverock.androidsvg;

/* loaded from: classes7.dex */
public class PreserveAspectRatio {
    private com.caverock.androidsvg.PreserveAspectRatio.Alignment Camera2StreamConfigurationMap;
    private com.caverock.androidsvg.PreserveAspectRatio.Scale getHighResolutionOutputSizeshNQ4ISI;
    public static final com.caverock.androidsvg.PreserveAspectRatio UNSCALED = new com.caverock.androidsvg.PreserveAspectRatio(null, null);
    public static final com.caverock.androidsvg.PreserveAspectRatio STRETCH = new com.caverock.androidsvg.PreserveAspectRatio(com.caverock.androidsvg.PreserveAspectRatio.Alignment.none, null);
    public static final com.caverock.androidsvg.PreserveAspectRatio LETTERBOX = new com.caverock.androidsvg.PreserveAspectRatio(com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMidYMid, com.caverock.androidsvg.PreserveAspectRatio.Scale.meet);
    public static final com.caverock.androidsvg.PreserveAspectRatio START = new com.caverock.androidsvg.PreserveAspectRatio(com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMinYMin, com.caverock.androidsvg.PreserveAspectRatio.Scale.meet);
    public static final com.caverock.androidsvg.PreserveAspectRatio END = new com.caverock.androidsvg.PreserveAspectRatio(com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMaxYMax, com.caverock.androidsvg.PreserveAspectRatio.Scale.meet);
    public static final com.caverock.androidsvg.PreserveAspectRatio TOP = new com.caverock.androidsvg.PreserveAspectRatio(com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMidYMin, com.caverock.androidsvg.PreserveAspectRatio.Scale.meet);
    public static final com.caverock.androidsvg.PreserveAspectRatio BOTTOM = new com.caverock.androidsvg.PreserveAspectRatio(com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMidYMax, com.caverock.androidsvg.PreserveAspectRatio.Scale.meet);
    public static final com.caverock.androidsvg.PreserveAspectRatio FULLSCREEN = new com.caverock.androidsvg.PreserveAspectRatio(com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMidYMid, com.caverock.androidsvg.PreserveAspectRatio.Scale.slice);
    public static final com.caverock.androidsvg.PreserveAspectRatio FULLSCREEN_START = new com.caverock.androidsvg.PreserveAspectRatio(com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMinYMin, com.caverock.androidsvg.PreserveAspectRatio.Scale.slice);

    public enum Alignment {
        none,
        xMinYMin,
        xMidYMin,
        xMaxYMin,
        xMinYMid,
        xMidYMid,
        xMaxYMid,
        xMinYMax,
        xMidYMax,
        xMaxYMax
    }

    public enum Scale {
        meet,
        slice
    }

    PreserveAspectRatio(com.caverock.androidsvg.PreserveAspectRatio.Alignment alignment, com.caverock.androidsvg.PreserveAspectRatio.Scale scale) {
        this.Camera2StreamConfigurationMap = alignment;
        this.getHighResolutionOutputSizeshNQ4ISI = scale;
    }

    public static com.caverock.androidsvg.PreserveAspectRatio of(java.lang.String str) {
        try {
            return com.caverock.androidsvg.SVGParser.Camera2StreamConfigurationMap(str);
        } catch (com.caverock.androidsvg.SVGParseException e) {
            throw new java.lang.IllegalArgumentException(e.getMessage());
        }
    }

    public com.caverock.androidsvg.PreserveAspectRatio.Alignment getAlignment() {
        return this.Camera2StreamConfigurationMap;
    }

    public com.caverock.androidsvg.PreserveAspectRatio.Scale getScale() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.caverock.androidsvg.PreserveAspectRatio preserveAspectRatio = (com.caverock.androidsvg.PreserveAspectRatio) obj;
        return this.Camera2StreamConfigurationMap == preserveAspectRatio.Camera2StreamConfigurationMap && this.getHighResolutionOutputSizeshNQ4ISI == preserveAspectRatio.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(" ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        return sb.toString();
    }
}
