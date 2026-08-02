package com.caverock.androidsvg;

/* loaded from: classes7.dex */
public class RenderOptions {
    com.caverock.androidsvg.CSSParser.Ruleset Camera2StreamConfigurationMap;
    java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    com.caverock.androidsvg.PreserveAspectRatio getHighSpeedVideoFpsRanges;
    java.lang.String getHighSpeedVideoFpsRangesFor;
    com.caverock.androidsvg.SVG.Box getHighSpeedVideoSizes;
    com.caverock.androidsvg.SVG.Box getInputSizeshNQ4ISI;

    public RenderOptions() {
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getInputSizeshNQ4ISI = null;
    }

    public static com.caverock.androidsvg.RenderOptions create() {
        return new com.caverock.androidsvg.RenderOptions();
    }

    public RenderOptions(com.caverock.androidsvg.RenderOptions renderOptions) {
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getInputSizeshNQ4ISI = null;
        if (renderOptions == null) {
            return;
        }
        this.Camera2StreamConfigurationMap = renderOptions.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = renderOptions.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = renderOptions.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRangesFor = renderOptions.getHighSpeedVideoFpsRangesFor;
        this.getInputSizeshNQ4ISI = renderOptions.getInputSizeshNQ4ISI;
    }

    public com.caverock.androidsvg.RenderOptions css(java.lang.String str) {
        com.caverock.androidsvg.CSSParser cSSParser = new com.caverock.androidsvg.CSSParser(com.caverock.androidsvg.CSSParser.Source.RenderOptions);
        com.caverock.androidsvg.CSSParser.CSSTextScanner cSSTextScanner = new com.caverock.androidsvg.CSSParser.CSSTextScanner(str);
        cSSTextScanner.getOutputSizes();
        this.Camera2StreamConfigurationMap = cSSParser.getHighResolutionOutputSizeshNQ4ISI(cSSTextScanner);
        return this;
    }

    public boolean hasCss() {
        java.util.List<com.caverock.androidsvg.CSSParser.Rule> list;
        com.caverock.androidsvg.CSSParser.Ruleset ruleset = this.Camera2StreamConfigurationMap;
        return (ruleset == null || (list = ruleset.Camera2StreamConfigurationMap) == null || list.size() <= 0) ? false : true;
    }

    public com.caverock.androidsvg.RenderOptions preserveAspectRatio(com.caverock.androidsvg.PreserveAspectRatio preserveAspectRatio) {
        this.getHighSpeedVideoFpsRanges = preserveAspectRatio;
        return this;
    }

    public boolean hasPreserveAspectRatio() {
        return this.getHighSpeedVideoFpsRanges != null;
    }

    public com.caverock.androidsvg.RenderOptions view(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = str;
        return this;
    }

    public boolean hasView() {
        return this.getHighSpeedVideoFpsRangesFor != null;
    }

    public com.caverock.androidsvg.RenderOptions viewBox(float f, float f2, float f3, float f4) {
        this.getHighSpeedVideoSizes = new com.caverock.androidsvg.SVG.Box(f, f2, f3, f4);
        return this;
    }

    public boolean hasViewBox() {
        return this.getHighSpeedVideoSizes != null;
    }

    public com.caverock.androidsvg.RenderOptions viewPort(float f, float f2, float f3, float f4) {
        this.getInputSizeshNQ4ISI = new com.caverock.androidsvg.SVG.Box(f, f2, f3, f4);
        return this;
    }

    public boolean hasViewPort() {
        return this.getInputSizeshNQ4ISI != null;
    }

    public com.caverock.androidsvg.RenderOptions target(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        return this;
    }

    public boolean hasTarget() {
        return this.getHighResolutionOutputSizeshNQ4ISI != null;
    }
}
