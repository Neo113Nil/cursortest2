package com.caverock.androidsvg;

/* loaded from: classes7.dex */
class SVGAndroidRenderer {
    private static java.util.HashSet<java.lang.String> getHighSpeedVideoFpsRangesFor;
    float Camera2StreamConfigurationMap;
    private com.caverock.androidsvg.SVG getHighResolutionOutputSizeshNQ4ISI;
    private android.graphics.Canvas getHighSpeedVideoFpsRanges;
    com.caverock.androidsvg.SVGAndroidRenderer.RendererState getHighSpeedVideoSizes;
    private java.util.Stack<android.graphics.Matrix> getHighSpeedVideoSizesFor;
    private com.caverock.androidsvg.CSSParser.RuleMatchContext getInputSizeshNQ4ISI = null;
    private java.util.Stack<com.caverock.androidsvg.SVGAndroidRenderer.RendererState> getOutputFormats;
    private java.util.Stack<com.caverock.androidsvg.SVG.SvgContainer> getOutputMinFrameDuration;

    static /* synthetic */ void Camera2StreamConfigurationMap() {
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges() {
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor() {
    }

    class RendererState {
        boolean Camera2StreamConfigurationMap;
        android.graphics.Paint getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        android.graphics.Paint getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;
        com.caverock.androidsvg.SVG.Style getInputFormats;
        com.caverock.androidsvg.SVG.Box getInputSizeshNQ4ISI;
        com.caverock.androidsvg.SVG.Box getOutputMinFrameDuration;

        RendererState() {
            android.graphics.Paint paint = new android.graphics.Paint();
            this.getHighSpeedVideoFpsRangesFor = paint;
            paint.setFlags(193);
            this.getHighSpeedVideoFpsRangesFor.setHinting(0);
            this.getHighSpeedVideoFpsRangesFor.setStyle(android.graphics.Paint.Style.FILL);
            this.getHighSpeedVideoFpsRangesFor.setTypeface(android.graphics.Typeface.DEFAULT);
            android.graphics.Paint paint2 = new android.graphics.Paint();
            this.getHighResolutionOutputSizeshNQ4ISI = paint2;
            paint2.setFlags(193);
            this.getHighResolutionOutputSizeshNQ4ISI.setHinting(0);
            this.getHighResolutionOutputSizeshNQ4ISI.setStyle(android.graphics.Paint.Style.STROKE);
            this.getHighResolutionOutputSizeshNQ4ISI.setTypeface(android.graphics.Typeface.DEFAULT);
            this.getInputFormats = com.caverock.androidsvg.SVG.Style.getHighSpeedVideoSizes();
        }

        RendererState(com.caverock.androidsvg.SVGAndroidRenderer.RendererState rendererState) {
            this.getHighSpeedVideoSizes = rendererState.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = rendererState.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRangesFor = new android.graphics.Paint(rendererState.getHighSpeedVideoFpsRangesFor);
            this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Paint(rendererState.getHighResolutionOutputSizeshNQ4ISI);
            com.caverock.androidsvg.SVG.Box box = rendererState.getOutputMinFrameDuration;
            if (box != null) {
                this.getOutputMinFrameDuration = new com.caverock.androidsvg.SVG.Box(box);
            }
            com.caverock.androidsvg.SVG.Box box2 = rendererState.getInputSizeshNQ4ISI;
            if (box2 != null) {
                this.getInputSizeshNQ4ISI = new com.caverock.androidsvg.SVG.Box(box2);
            }
            this.Camera2StreamConfigurationMap = rendererState.Camera2StreamConfigurationMap;
            try {
                this.getInputFormats = (com.caverock.androidsvg.SVG.Style) rendererState.getInputFormats.clone();
            } catch (java.lang.CloneNotSupportedException unused) {
                this.getInputFormats = com.caverock.androidsvg.SVG.Style.getHighSpeedVideoSizes();
            }
        }
    }

    private void getHighSpeedVideoSizesFor() {
        this.getHighSpeedVideoSizes = new com.caverock.androidsvg.SVGAndroidRenderer.RendererState();
        this.getOutputFormats = new java.util.Stack<>();
        getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, com.caverock.androidsvg.SVG.Style.getHighSpeedVideoSizes());
        this.getHighSpeedVideoSizes.getOutputMinFrameDuration = null;
        this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap = false;
        this.getOutputFormats.push(new com.caverock.androidsvg.SVGAndroidRenderer.RendererState(this.getHighSpeedVideoSizes));
        this.getHighSpeedVideoSizesFor = new java.util.Stack<>();
        this.getOutputMinFrameDuration = new java.util.Stack<>();
    }

    SVGAndroidRenderer(android.graphics.Canvas canvas, float f) {
        this.getHighSpeedVideoFpsRanges = canvas;
        this.Camera2StreamConfigurationMap = f;
    }

    final void getHighSpeedVideoFpsRangesFor(com.caverock.androidsvg.SVG svg, com.caverock.androidsvg.RenderOptions renderOptions) {
        com.caverock.androidsvg.SVG.Box box;
        com.caverock.androidsvg.PreserveAspectRatio preserveAspectRatio;
        float highSpeedVideoFpsRangesFor;
        float highSpeedVideoFpsRangesFor2;
        if (renderOptions == null) {
            throw new java.lang.NullPointerException("renderOptions shouldn't be null");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = svg;
        com.caverock.androidsvg.SVG.Svg svg2 = svg.getHighSpeedVideoSizes;
        if (svg2 == null) {
            return;
        }
        if (renderOptions.hasView()) {
            com.caverock.androidsvg.SVG.SvgElementBase highSpeedVideoFpsRangesFor3 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(renderOptions.getHighSpeedVideoFpsRangesFor);
            if (highSpeedVideoFpsRangesFor3 == null || !(highSpeedVideoFpsRangesFor3 instanceof com.caverock.androidsvg.SVG.View)) {
                new java.lang.Object[]{renderOptions.getHighSpeedVideoFpsRangesFor};
                return;
            }
            com.caverock.androidsvg.SVG.View view = (com.caverock.androidsvg.SVG.View) highSpeedVideoFpsRangesFor3;
            if (view.getOutputMinFrameDuration == null) {
                new java.lang.Object[]{renderOptions.getHighSpeedVideoFpsRangesFor};
                return;
            } else {
                box = view.getOutputMinFrameDuration;
                preserveAspectRatio = view.coroutineBoundary;
            }
        } else {
            box = renderOptions.hasViewBox() ? renderOptions.getHighSpeedVideoSizes : svg2.getOutputMinFrameDuration;
            preserveAspectRatio = renderOptions.hasPreserveAspectRatio() ? renderOptions.getHighSpeedVideoFpsRanges : svg2.coroutineBoundary;
        }
        if (renderOptions.hasCss()) {
            svg.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(renderOptions.Camera2StreamConfigurationMap);
        }
        if (renderOptions.hasTarget()) {
            com.caverock.androidsvg.CSSParser.RuleMatchContext ruleMatchContext = new com.caverock.androidsvg.CSSParser.RuleMatchContext();
            this.getInputSizeshNQ4ISI = ruleMatchContext;
            ruleMatchContext.Camera2StreamConfigurationMap = svg.getHighSpeedVideoFpsRangesFor(renderOptions.getHighResolutionOutputSizeshNQ4ISI);
        }
        getHighSpeedVideoSizesFor();
        getHighSpeedVideoFpsRangesFor((com.caverock.androidsvg.SVG.SvgObject) svg2);
        getOutputSizeshNQ4ISI();
        com.caverock.androidsvg.SVG.Box box2 = new com.caverock.androidsvg.SVG.Box(renderOptions.getInputSizeshNQ4ISI);
        if (svg2.Camera2StreamConfigurationMap != null) {
            com.caverock.androidsvg.SVG.Length length = svg2.Camera2StreamConfigurationMap;
            float f = box2.getHighResolutionOutputSizeshNQ4ISI;
            if (length.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent) {
                highSpeedVideoFpsRangesFor2 = (length.getHighSpeedVideoFpsRanges * f) / 100.0f;
            } else {
                highSpeedVideoFpsRangesFor2 = length.getHighSpeedVideoFpsRangesFor(this);
            }
            box2.getHighResolutionOutputSizeshNQ4ISI = highSpeedVideoFpsRangesFor2;
        }
        if (svg2.getHighSpeedVideoFpsRanges != null) {
            com.caverock.androidsvg.SVG.Length length2 = svg2.getHighSpeedVideoFpsRanges;
            float f2 = box2.getHighSpeedVideoSizes;
            if (length2.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent) {
                highSpeedVideoFpsRangesFor = (length2.getHighSpeedVideoFpsRanges * f2) / 100.0f;
            } else {
                highSpeedVideoFpsRangesFor = length2.getHighSpeedVideoFpsRangesFor(this);
            }
            box2.getHighSpeedVideoSizes = highSpeedVideoFpsRangesFor;
        }
        getHighSpeedVideoSizes(svg2, box2, box, preserveAspectRatio);
        this.getHighSpeedVideoFpsRanges.restore();
        this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
        if (renderOptions.hasCss()) {
            svg.getHighSpeedVideoSizes();
        }
    }

    private void Camera2StreamConfigurationMap(com.caverock.androidsvg.SVG.SvgObject svgObject) {
        if (svgObject instanceof com.caverock.androidsvg.SVG.NotDirectlyRendered) {
            return;
        }
        getOutputSizeshNQ4ISI();
        getHighSpeedVideoFpsRangesFor(svgObject);
        if (svgObject instanceof com.caverock.androidsvg.SVG.Svg) {
            getHighSpeedVideoFpsRanges((com.caverock.androidsvg.SVG.Svg) svgObject);
        } else if (svgObject instanceof com.caverock.androidsvg.SVG.Use) {
            getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.Use) svgObject);
        } else if (svgObject instanceof com.caverock.androidsvg.SVG.Switch) {
            getHighSpeedVideoFpsRangesFor((com.caverock.androidsvg.SVG.Switch) svgObject);
        } else if (svgObject instanceof com.caverock.androidsvg.SVG.Group) {
            getHighSpeedVideoFpsRanges((com.caverock.androidsvg.SVG.Group) svgObject);
        } else if (svgObject instanceof com.caverock.androidsvg.SVG.Image) {
            getHighSpeedVideoFpsRanges((com.caverock.androidsvg.SVG.Image) svgObject);
        } else if (svgObject instanceof com.caverock.androidsvg.SVG.Path) {
            getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.Path) svgObject);
        } else if (svgObject instanceof com.caverock.androidsvg.SVG.Rect) {
            getHighSpeedVideoFpsRangesFor((com.caverock.androidsvg.SVG.Rect) svgObject);
        } else if (svgObject instanceof com.caverock.androidsvg.SVG.Circle) {
            getHighSpeedVideoFpsRanges((com.caverock.androidsvg.SVG.Circle) svgObject);
        } else if (svgObject instanceof com.caverock.androidsvg.SVG.Ellipse) {
            getHighSpeedVideoFpsRanges((com.caverock.androidsvg.SVG.Ellipse) svgObject);
        } else if (svgObject instanceof com.caverock.androidsvg.SVG.Line) {
            getHighSpeedVideoFpsRanges((com.caverock.androidsvg.SVG.Line) svgObject);
        } else if (svgObject instanceof com.caverock.androidsvg.SVG.Polygon) {
            getHighSpeedVideoSizes((com.caverock.androidsvg.SVG.Polygon) svgObject);
        } else if (svgObject instanceof com.caverock.androidsvg.SVG.PolyLine) {
            getHighSpeedVideoFpsRangesFor((com.caverock.androidsvg.SVG.PolyLine) svgObject);
        } else if (svgObject instanceof com.caverock.androidsvg.SVG.Text) {
            Camera2StreamConfigurationMap((com.caverock.androidsvg.SVG.Text) svgObject);
        }
        this.getHighSpeedVideoFpsRanges.restore();
        this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
    }

    private void getOutputSizeshNQ4ISI() {
        this.getHighSpeedVideoFpsRanges.save();
        this.getOutputFormats.push(this.getHighSpeedVideoSizes);
        this.getHighSpeedVideoSizes = new com.caverock.androidsvg.SVGAndroidRenderer.RendererState(this.getHighSpeedVideoSizes);
    }

    private void getHighSpeedVideoFpsRangesFor(com.caverock.androidsvg.SVGAndroidRenderer.RendererState rendererState, com.caverock.androidsvg.SVG.SvgElementBase svgElementBase) {
        rendererState.getInputFormats.getHighSpeedVideoFpsRangesFor(svgElementBase.CoroutineDebuggingKt == null);
        if (svgElementBase.isOutputSupportedForhNQ4ISI != null) {
            getHighSpeedVideoFpsRanges(rendererState, svgElementBase.isOutputSupportedForhNQ4ISI);
        }
        java.util.List<com.caverock.androidsvg.CSSParser.Rule> list = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
        if (!(list == null || list.isEmpty())) {
            for (com.caverock.androidsvg.CSSParser.Rule rule : this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap) {
                if (com.caverock.androidsvg.CSSParser.getHighResolutionOutputSizeshNQ4ISI(this.getInputSizeshNQ4ISI, rule.getHighSpeedVideoFpsRangesFor, svgElementBase)) {
                    getHighSpeedVideoFpsRanges(rendererState, rule.getHighSpeedVideoSizes);
                }
            }
        }
        if (svgElementBase.coroutineCreation != null) {
            getHighSpeedVideoFpsRanges(rendererState, svgElementBase.coroutineCreation);
        }
    }

    private void getHighSpeedVideoFpsRangesFor(com.caverock.androidsvg.SVG.SvgObject svgObject) {
        if (svgObject instanceof com.caverock.androidsvg.SVG.SvgElementBase) {
            com.caverock.androidsvg.SVG.SvgElementBase svgElementBase = (com.caverock.androidsvg.SVG.SvgElementBase) svgObject;
            if (svgElementBase.toString != null) {
                this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap = svgElementBase.toString.booleanValue();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02f5 A[LOOP:4: B:115:0x02ef->B:117:0x02f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x031e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoFpsRangesFor(com.caverock.androidsvg.SVG.SvgElement svgElement, android.graphics.Path path) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        com.caverock.androidsvg.PreserveAspectRatio preserveAspectRatio;
        boolean z;
        boolean z2;
        float floor;
        float f9;
        boolean outputFormats;
        com.caverock.androidsvg.PreserveAspectRatio preserveAspectRatio2;
        java.util.Iterator<com.caverock.androidsvg.SVG.SvgObject> it;
        if (this.getHighSpeedVideoSizes.getInputFormats.getInputFormats instanceof com.caverock.androidsvg.SVG.PaintReference) {
            com.caverock.androidsvg.SVG.SvgObject highSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(((com.caverock.androidsvg.SVG.PaintReference) this.getHighSpeedVideoSizes.getInputFormats.getInputFormats).getHighSpeedVideoFpsRangesFor);
            if (highSpeedVideoFpsRanges instanceof com.caverock.androidsvg.SVG.Pattern) {
                com.caverock.androidsvg.SVG.Pattern pattern = (com.caverock.androidsvg.SVG.Pattern) highSpeedVideoFpsRanges;
                boolean z3 = pattern.getHighSpeedVideoFpsRangesFor != null && pattern.getHighSpeedVideoFpsRangesFor.booleanValue();
                if (pattern.Camera2StreamConfigurationMap != null) {
                    java.lang.String str = pattern.Camera2StreamConfigurationMap;
                    while (true) {
                        com.caverock.androidsvg.SVG.SvgObject highSpeedVideoFpsRanges2 = pattern.ArtificialStackFrames.getHighSpeedVideoFpsRanges(str);
                        if (highSpeedVideoFpsRanges2 == null) {
                            new java.lang.Object[]{str};
                            break;
                        }
                        if (!(highSpeedVideoFpsRanges2 instanceof com.caverock.androidsvg.SVG.Pattern)) {
                            break;
                        }
                        if (highSpeedVideoFpsRanges2 == pattern) {
                            new java.lang.Object[]{str};
                            break;
                        }
                        com.caverock.androidsvg.SVG.Pattern pattern2 = (com.caverock.androidsvg.SVG.Pattern) highSpeedVideoFpsRanges2;
                        if (pattern.getHighSpeedVideoFpsRangesFor == null) {
                            pattern.getHighSpeedVideoFpsRangesFor = pattern2.getHighSpeedVideoFpsRangesFor;
                        }
                        if (pattern.getHighResolutionOutputSizeshNQ4ISI == null) {
                            pattern.getHighResolutionOutputSizeshNQ4ISI = pattern2.getHighResolutionOutputSizeshNQ4ISI;
                        }
                        if (pattern.getHighSpeedVideoFpsRanges == null) {
                            pattern.getHighSpeedVideoFpsRanges = pattern2.getHighSpeedVideoFpsRanges;
                        }
                        if (pattern.getOutputFormats == null) {
                            pattern.getOutputFormats = pattern2.getOutputFormats;
                        }
                        if (pattern.getHighSpeedVideoSizesFor == null) {
                            pattern.getHighSpeedVideoSizesFor = pattern2.getHighSpeedVideoSizesFor;
                        }
                        if (pattern.getInputFormats == null) {
                            pattern.getInputFormats = pattern2.getInputFormats;
                        }
                        if (pattern.getHighSpeedVideoSizes == null) {
                            pattern.getHighSpeedVideoSizes = pattern2.getHighSpeedVideoSizes;
                        }
                        if (pattern.getInputSizeshNQ4ISI.isEmpty()) {
                            pattern.getInputSizeshNQ4ISI = pattern2.getInputSizeshNQ4ISI;
                        }
                        if (pattern.getOutputMinFrameDuration == null) {
                            pattern.getOutputMinFrameDuration = pattern2.getOutputMinFrameDuration;
                        }
                        if (pattern.coroutineBoundary == null) {
                            pattern.coroutineBoundary = pattern2.coroutineBoundary;
                        }
                        if (pattern2.Camera2StreamConfigurationMap == null) {
                            break;
                        } else {
                            str = pattern2.Camera2StreamConfigurationMap;
                        }
                    }
                }
                if (z3) {
                    f5 = pattern.getOutputFormats != null ? pattern.getOutputFormats.getHighSpeedVideoFpsRangesFor(this) : 0.0f;
                    f6 = pattern.getHighSpeedVideoSizesFor != null ? pattern.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes(this) : 0.0f;
                    f7 = pattern.getInputFormats != null ? pattern.getInputFormats.getHighSpeedVideoFpsRangesFor(this) : 0.0f;
                    f8 = pattern.getHighSpeedVideoSizes != null ? pattern.getHighSpeedVideoSizes.getHighSpeedVideoSizes(this) : 0.0f;
                } else {
                    if (pattern.getOutputFormats != null) {
                        com.caverock.androidsvg.SVG.Length length = pattern.getOutputFormats;
                        if (length.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent) {
                            f = (length.getHighSpeedVideoFpsRanges * 1.0f) / 100.0f;
                        } else {
                            f = length.getHighSpeedVideoFpsRangesFor(this);
                        }
                    } else {
                        f = 0.0f;
                    }
                    if (pattern.getHighSpeedVideoSizesFor != null) {
                        com.caverock.androidsvg.SVG.Length length2 = pattern.getHighSpeedVideoSizesFor;
                        if (length2.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent) {
                            f2 = (length2.getHighSpeedVideoFpsRanges * 1.0f) / 100.0f;
                        } else {
                            f2 = length2.getHighSpeedVideoFpsRangesFor(this);
                        }
                    } else {
                        f2 = 0.0f;
                    }
                    if (pattern.getInputFormats != null) {
                        com.caverock.androidsvg.SVG.Length length3 = pattern.getInputFormats;
                        if (length3.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent) {
                            f3 = (length3.getHighSpeedVideoFpsRanges * 1.0f) / 100.0f;
                        } else {
                            f3 = length3.getHighSpeedVideoFpsRangesFor(this);
                        }
                    } else {
                        f3 = 0.0f;
                    }
                    if (pattern.getHighSpeedVideoSizes != null) {
                        com.caverock.androidsvg.SVG.Length length4 = pattern.getHighSpeedVideoSizes;
                        if (length4.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent) {
                            f4 = (length4.getHighSpeedVideoFpsRanges * 1.0f) / 100.0f;
                        } else {
                            f4 = length4.getHighSpeedVideoFpsRangesFor(this);
                        }
                    } else {
                        f4 = 0.0f;
                    }
                    f5 = (f * svgElement.isOutputSupportedFor.getHighResolutionOutputSizeshNQ4ISI) + svgElement.isOutputSupportedFor.Camera2StreamConfigurationMap;
                    f6 = svgElement.isOutputSupportedFor.getHighSpeedVideoFpsRanges + (f2 * svgElement.isOutputSupportedFor.getHighSpeedVideoSizes);
                    f7 = f3 * svgElement.isOutputSupportedFor.getHighResolutionOutputSizeshNQ4ISI;
                    f8 = f4 * svgElement.isOutputSupportedFor.getHighSpeedVideoSizes;
                }
                if (f7 == 0.0f || f8 == 0.0f) {
                    return;
                }
                com.caverock.androidsvg.PreserveAspectRatio preserveAspectRatio3 = pattern.coroutineBoundary != null ? pattern.coroutineBoundary : com.caverock.androidsvg.PreserveAspectRatio.LETTERBOX;
                getOutputSizeshNQ4ISI();
                this.getHighSpeedVideoFpsRanges.clipPath(path);
                com.caverock.androidsvg.SVGAndroidRenderer.RendererState rendererState = new com.caverock.androidsvg.SVGAndroidRenderer.RendererState();
                getHighSpeedVideoFpsRanges(rendererState, com.caverock.androidsvg.SVG.Style.getHighSpeedVideoSizes());
                rendererState.getInputFormats.getValidOutputFormatsForInputhNQ4ISI = java.lang.Boolean.FALSE;
                this.getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(pattern, rendererState);
                com.caverock.androidsvg.SVG.Box box = svgElement.isOutputSupportedFor;
                if (pattern.getHighSpeedVideoFpsRanges != null) {
                    this.getHighSpeedVideoFpsRanges.concat(pattern.getHighSpeedVideoFpsRanges);
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    if (pattern.getHighSpeedVideoFpsRanges.invert(matrix)) {
                        float f10 = svgElement.isOutputSupportedFor.Camera2StreamConfigurationMap;
                        float f11 = svgElement.isOutputSupportedFor.getHighSpeedVideoFpsRanges;
                        com.caverock.androidsvg.SVG.Box box2 = svgElement.isOutputSupportedFor;
                        float f12 = box2.Camera2StreamConfigurationMap + box2.getHighResolutionOutputSizeshNQ4ISI;
                        float f13 = svgElement.isOutputSupportedFor.getHighSpeedVideoFpsRanges;
                        com.caverock.androidsvg.SVG.Box box3 = svgElement.isOutputSupportedFor;
                        float f14 = box3.Camera2StreamConfigurationMap + box3.getHighResolutionOutputSizeshNQ4ISI;
                        com.caverock.androidsvg.SVG.Box box4 = svgElement.isOutputSupportedFor;
                        float f15 = box4.getHighSpeedVideoFpsRanges + box4.getHighSpeedVideoSizes;
                        float f16 = svgElement.isOutputSupportedFor.Camera2StreamConfigurationMap;
                        preserveAspectRatio = preserveAspectRatio3;
                        com.caverock.androidsvg.SVG.Box box5 = svgElement.isOutputSupportedFor;
                        float[] fArr = {f10, f11, f12, f13, f14, f15, f16, box5.getHighSpeedVideoFpsRanges + box5.getHighSpeedVideoSizes};
                        matrix.mapPoints(fArr);
                        z2 = false;
                        float f17 = fArr[0];
                        z = true;
                        float f18 = fArr[1];
                        android.graphics.RectF rectF = new android.graphics.RectF(f17, f18, f17, f18);
                        for (int i = 2; i <= 6; i += 2) {
                            if (fArr[i] < rectF.left) {
                                rectF.left = fArr[i];
                            }
                            if (fArr[i] > rectF.right) {
                                rectF.right = fArr[i];
                            }
                            int i2 = i + 1;
                            if (fArr[i2] < rectF.top) {
                                rectF.top = fArr[i2];
                            }
                            if (fArr[i2] > rectF.bottom) {
                                rectF.bottom = fArr[i2];
                            }
                        }
                        box = new com.caverock.androidsvg.SVG.Box(rectF.left, rectF.top, rectF.right - rectF.left, rectF.bottom - rectF.top);
                        float floor2 = f5 + (((float) java.lang.Math.floor((box.Camera2StreamConfigurationMap - f5) / f7)) * f7);
                        floor = f6 + (((float) java.lang.Math.floor((box.getHighSpeedVideoFpsRanges - f6) / f8)) * f8);
                        float f19 = box.Camera2StreamConfigurationMap + box.getHighResolutionOutputSizeshNQ4ISI;
                        f9 = box.getHighSpeedVideoFpsRanges + box.getHighSpeedVideoSizes;
                        com.caverock.androidsvg.SVG.Box box6 = new com.caverock.androidsvg.SVG.Box(0.0f, 0.0f, f7, f8);
                        outputFormats = getOutputFormats();
                        while (floor < f9) {
                            float f20 = floor2;
                            while (f20 < f19) {
                                box6.Camera2StreamConfigurationMap = f20;
                                box6.getHighSpeedVideoFpsRanges = floor;
                                getOutputSizeshNQ4ISI();
                                if (!this.getHighSpeedVideoSizes.getInputFormats.getValidOutputFormatsForInputhNQ4ISI.booleanValue()) {
                                    getHighResolutionOutputSizeshNQ4ISI(box6.Camera2StreamConfigurationMap, box6.getHighSpeedVideoFpsRanges, box6.getHighResolutionOutputSizeshNQ4ISI, box6.getHighSpeedVideoSizes);
                                }
                                if (pattern.getOutputMinFrameDuration != null) {
                                    preserveAspectRatio2 = preserveAspectRatio;
                                    this.getHighSpeedVideoFpsRanges.concat(getHighSpeedVideoFpsRanges(box6, pattern.getOutputMinFrameDuration, preserveAspectRatio2));
                                } else {
                                    preserveAspectRatio2 = preserveAspectRatio;
                                    boolean z4 = (pattern.getHighResolutionOutputSizeshNQ4ISI == null || pattern.getHighResolutionOutputSizeshNQ4ISI.booleanValue()) ? z : z2;
                                    this.getHighSpeedVideoFpsRanges.translate(f20, floor);
                                    if (!z4) {
                                        this.getHighSpeedVideoFpsRanges.scale(svgElement.isOutputSupportedFor.getHighResolutionOutputSizeshNQ4ISI, svgElement.isOutputSupportedFor.getHighSpeedVideoSizes);
                                        it = pattern.getInputSizeshNQ4ISI.iterator();
                                        while (it.hasNext()) {
                                            Camera2StreamConfigurationMap(it.next());
                                        }
                                        this.getHighSpeedVideoFpsRanges.restore();
                                        this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
                                        f20 += f7;
                                        preserveAspectRatio = preserveAspectRatio2;
                                        z = true;
                                    }
                                }
                                it = pattern.getInputSizeshNQ4ISI.iterator();
                                while (it.hasNext()) {
                                }
                                this.getHighSpeedVideoFpsRanges.restore();
                                this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
                                f20 += f7;
                                preserveAspectRatio = preserveAspectRatio2;
                                z = true;
                            }
                            floor += f8;
                            z = true;
                        }
                        if (outputFormats) {
                            Camera2StreamConfigurationMap(pattern, pattern.isOutputSupportedFor);
                        }
                        this.getHighSpeedVideoFpsRanges.restore();
                        this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
                        return;
                    }
                }
                preserveAspectRatio = preserveAspectRatio3;
                z = true;
                z2 = false;
                float floor22 = f5 + (((float) java.lang.Math.floor((box.Camera2StreamConfigurationMap - f5) / f7)) * f7);
                floor = f6 + (((float) java.lang.Math.floor((box.getHighSpeedVideoFpsRanges - f6) / f8)) * f8);
                float f192 = box.Camera2StreamConfigurationMap + box.getHighResolutionOutputSizeshNQ4ISI;
                f9 = box.getHighSpeedVideoFpsRanges + box.getHighSpeedVideoSizes;
                com.caverock.androidsvg.SVG.Box box62 = new com.caverock.androidsvg.SVG.Box(0.0f, 0.0f, f7, f8);
                outputFormats = getOutputFormats();
                while (floor < f9) {
                }
                if (outputFormats) {
                }
                this.getHighSpeedVideoFpsRanges.restore();
                this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
                return;
            }
        }
        this.getHighSpeedVideoFpsRanges.drawPath(path, this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor);
    }

    private void getHighSpeedVideoFpsRangesFor(android.graphics.Path path) {
        if (this.getHighSpeedVideoSizes.getInputFormats.resetTransaction == com.caverock.androidsvg.SVG.Style.VectorEffect.NonScalingStroke) {
            android.graphics.Matrix matrix = this.getHighSpeedVideoFpsRanges.getMatrix();
            android.graphics.Path path2 = new android.graphics.Path();
            path.transform(matrix, path2);
            this.getHighSpeedVideoFpsRanges.setMatrix(new android.graphics.Matrix());
            android.graphics.Shader shader = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI.getShader();
            android.graphics.Matrix matrix2 = new android.graphics.Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                android.graphics.Matrix matrix3 = new android.graphics.Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.getHighSpeedVideoFpsRanges.drawPath(path2, this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI);
            this.getHighSpeedVideoFpsRanges.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.getHighSpeedVideoFpsRanges.drawPath(path, this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI);
    }

    private void getHighSpeedVideoFpsRanges(com.caverock.androidsvg.SVG.Svg svg) {
        getHighSpeedVideoSizes(svg, Camera2StreamConfigurationMap(svg.getHighSpeedVideoSizes, svg.getHighResolutionOutputSizeshNQ4ISI, svg.Camera2StreamConfigurationMap, svg.getHighSpeedVideoFpsRanges), svg.getOutputMinFrameDuration, svg.coroutineBoundary);
    }

    private void getHighSpeedVideoSizes(com.caverock.androidsvg.SVG.Svg svg, com.caverock.androidsvg.SVG.Box box, com.caverock.androidsvg.SVG.Box box2, com.caverock.androidsvg.PreserveAspectRatio preserveAspectRatio) {
        if (box.getHighResolutionOutputSizeshNQ4ISI == 0.0f || box.getHighSpeedVideoSizes == 0.0f) {
            return;
        }
        if (preserveAspectRatio == null) {
            preserveAspectRatio = svg.coroutineBoundary != null ? svg.coroutineBoundary : com.caverock.androidsvg.PreserveAspectRatio.LETTERBOX;
        }
        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, svg);
        if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor == null || this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor.booleanValue()) {
            this.getHighSpeedVideoSizes.getOutputMinFrameDuration = box;
            if (!this.getHighSpeedVideoSizes.getInputFormats.getValidOutputFormatsForInputhNQ4ISI.booleanValue()) {
                getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes.getOutputMinFrameDuration.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes.getOutputMinFrameDuration.getHighSpeedVideoSizes);
            }
            getHighSpeedVideoFpsRanges(svg, this.getHighSpeedVideoSizes.getOutputMinFrameDuration);
            if (box2 != null) {
                this.getHighSpeedVideoFpsRanges.concat(getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes.getOutputMinFrameDuration, box2, preserveAspectRatio));
                this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI = svg.getOutputMinFrameDuration;
            } else {
                this.getHighSpeedVideoFpsRanges.translate(this.getHighSpeedVideoSizes.getOutputMinFrameDuration.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges);
            }
            boolean outputFormats = getOutputFormats();
            getOutputSizes();
            getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgContainer) svg, true);
            if (outputFormats) {
                Camera2StreamConfigurationMap(svg, svg.isOutputSupportedFor);
            }
            getHighSpeedVideoSizes(svg);
        }
    }

    private com.caverock.androidsvg.SVG.Box Camera2StreamConfigurationMap(com.caverock.androidsvg.SVG.Length length, com.caverock.androidsvg.SVG.Length length2, com.caverock.androidsvg.SVG.Length length3, com.caverock.androidsvg.SVG.Length length4) {
        com.caverock.androidsvg.SVG.Box box;
        float highSpeedVideoFpsRangesFor = length != null ? length.getHighSpeedVideoFpsRangesFor(this) : 0.0f;
        float highSpeedVideoSizes = length2 != null ? length2.getHighSpeedVideoSizes(this) : 0.0f;
        if (this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI != null) {
            box = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
        } else {
            box = this.getHighSpeedVideoSizes.getOutputMinFrameDuration;
        }
        return new com.caverock.androidsvg.SVG.Box(highSpeedVideoFpsRangesFor, highSpeedVideoSizes, length3 != null ? length3.getHighSpeedVideoFpsRangesFor(this) : box.getHighResolutionOutputSizeshNQ4ISI, length4 != null ? length4.getHighSpeedVideoSizes(this) : box.getHighSpeedVideoSizes);
    }

    private void getHighSpeedVideoFpsRanges(com.caverock.androidsvg.SVG.Group group) {
        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, group);
        if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor == null || this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor.booleanValue()) {
            if (group.getHighSpeedVideoFpsRanges != null) {
                this.getHighSpeedVideoFpsRanges.concat(group.getHighSpeedVideoFpsRanges);
            }
            getHighSpeedVideoFpsRanges(group, group.isOutputSupportedFor);
            boolean outputFormats = getOutputFormats();
            getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgContainer) group, true);
            if (outputFormats) {
                Camera2StreamConfigurationMap(group, group.isOutputSupportedFor);
            }
            getHighSpeedVideoSizes(group);
        }
    }

    private void getHighSpeedVideoSizes(com.caverock.androidsvg.SVG.SvgElement svgElement) {
        if (svgElement.CoroutineDebuggingKt == null || svgElement.isOutputSupportedFor == null) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (this.getHighSpeedVideoSizesFor.peek().invert(matrix)) {
            float f = svgElement.isOutputSupportedFor.Camera2StreamConfigurationMap;
            float f2 = svgElement.isOutputSupportedFor.getHighSpeedVideoFpsRanges;
            com.caverock.androidsvg.SVG.Box box = svgElement.isOutputSupportedFor;
            float f3 = box.Camera2StreamConfigurationMap + box.getHighResolutionOutputSizeshNQ4ISI;
            float f4 = svgElement.isOutputSupportedFor.getHighSpeedVideoFpsRanges;
            com.caverock.androidsvg.SVG.Box box2 = svgElement.isOutputSupportedFor;
            float f5 = box2.Camera2StreamConfigurationMap + box2.getHighResolutionOutputSizeshNQ4ISI;
            com.caverock.androidsvg.SVG.Box box3 = svgElement.isOutputSupportedFor;
            float f6 = box3.getHighSpeedVideoFpsRanges + box3.getHighSpeedVideoSizes;
            float f7 = svgElement.isOutputSupportedFor.Camera2StreamConfigurationMap;
            com.caverock.androidsvg.SVG.Box box4 = svgElement.isOutputSupportedFor;
            float[] fArr = {f, f2, f3, f4, f5, f6, f7, box4.getHighSpeedVideoFpsRanges + box4.getHighSpeedVideoSizes};
            matrix.preConcat(this.getHighSpeedVideoFpsRanges.getMatrix());
            matrix.mapPoints(fArr);
            float f8 = fArr[0];
            float f9 = fArr[1];
            android.graphics.RectF rectF = new android.graphics.RectF(f8, f9, f8, f9);
            for (int i = 2; i <= 6; i += 2) {
                if (fArr[i] < rectF.left) {
                    rectF.left = fArr[i];
                }
                if (fArr[i] > rectF.right) {
                    rectF.right = fArr[i];
                }
                int i2 = i + 1;
                if (fArr[i2] < rectF.top) {
                    rectF.top = fArr[i2];
                }
                if (fArr[i2] > rectF.bottom) {
                    rectF.bottom = fArr[i2];
                }
            }
            com.caverock.androidsvg.SVG.SvgElement svgElement2 = (com.caverock.androidsvg.SVG.SvgElement) this.getOutputMinFrameDuration.peek();
            if (svgElement2.isOutputSupportedFor == null) {
                svgElement2.isOutputSupportedFor = com.caverock.androidsvg.SVG.Box.Camera2StreamConfigurationMap(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                svgElement2.isOutputSupportedFor.Camera2StreamConfigurationMap(com.caverock.androidsvg.SVG.Box.Camera2StreamConfigurationMap(rectF.left, rectF.top, rectF.right, rectF.bottom));
            }
        }
    }

    private boolean getOutputFormats() {
        int i = 0;
        if (!getInputSizeshNQ4ISI()) {
            return false;
        }
        android.graphics.Canvas canvas = this.getHighSpeedVideoFpsRanges;
        int floatValue = (int) (this.getHighSpeedVideoSizes.getInputFormats.toString.floatValue() * 256.0f);
        if (floatValue >= 0) {
            i = 255;
            if (floatValue <= 255) {
                i = floatValue;
            }
        }
        canvas.saveLayerAlpha(null, i, 31);
        this.getOutputFormats.push(this.getHighSpeedVideoSizes);
        com.caverock.androidsvg.SVGAndroidRenderer.RendererState rendererState = new com.caverock.androidsvg.SVGAndroidRenderer.RendererState(this.getHighSpeedVideoSizes);
        this.getHighSpeedVideoSizes = rendererState;
        if (rendererState.getInputFormats.isOutputSupportedForhNQ4ISI == null) {
            return true;
        }
        com.caverock.androidsvg.SVG.SvgObject highSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes.getInputFormats.isOutputSupportedForhNQ4ISI);
        if (highSpeedVideoFpsRanges != null && (highSpeedVideoFpsRanges instanceof com.caverock.androidsvg.SVG.Mask)) {
            return true;
        }
        new java.lang.Object[]{this.getHighSpeedVideoSizes.getInputFormats.isOutputSupportedForhNQ4ISI};
        this.getHighSpeedVideoSizes.getInputFormats.isOutputSupportedForhNQ4ISI = null;
        return true;
    }

    private void Camera2StreamConfigurationMap(com.caverock.androidsvg.SVG.SvgElement svgElement, com.caverock.androidsvg.SVG.Box box) {
        if (this.getHighSpeedVideoSizes.getInputFormats.isOutputSupportedForhNQ4ISI != null) {
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
            this.getHighSpeedVideoFpsRanges.saveLayer(null, paint, 31);
            android.graphics.Paint paint2 = new android.graphics.Paint();
            paint2.setColorFilter(new android.graphics.ColorMatrixColorFilter(new android.graphics.ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.getHighSpeedVideoFpsRanges.saveLayer(null, paint2, 31);
            com.caverock.androidsvg.SVG.Mask mask = (com.caverock.androidsvg.SVG.Mask) this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes.getInputFormats.isOutputSupportedForhNQ4ISI);
            getHighSpeedVideoSizes(mask, svgElement, box);
            this.getHighSpeedVideoFpsRanges.restore();
            android.graphics.Paint paint3 = new android.graphics.Paint();
            paint3.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
            this.getHighSpeedVideoFpsRanges.saveLayer(null, paint3, 31);
            getHighSpeedVideoSizes(mask, svgElement, box);
            this.getHighSpeedVideoFpsRanges.restore();
            this.getHighSpeedVideoFpsRanges.restore();
        }
        this.getHighSpeedVideoFpsRanges.restore();
        this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
    }

    private boolean getInputSizeshNQ4ISI() {
        return this.getHighSpeedVideoSizes.getInputFormats.toString.floatValue() < 1.0f || this.getHighSpeedVideoSizes.getInputFormats.isOutputSupportedForhNQ4ISI != null;
    }

    private void getHighSpeedVideoFpsRangesFor(com.caverock.androidsvg.SVG.Switch r3) {
        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, r3);
        if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor == null || this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor.booleanValue()) {
            if (r3.getHighSpeedVideoFpsRanges != null) {
                this.getHighSpeedVideoFpsRanges.concat(r3.getHighSpeedVideoFpsRanges);
            }
            getHighSpeedVideoFpsRanges(r3, r3.isOutputSupportedFor);
            boolean outputFormats = getOutputFormats();
            getHighSpeedVideoFpsRanges(r3);
            if (outputFormats) {
                Camera2StreamConfigurationMap(r3, r3.isOutputSupportedFor);
            }
            getHighSpeedVideoSizes(r3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void getHighSpeedVideoFpsRanges(com.caverock.androidsvg.SVG.Switch r8) {
        java.util.Set<java.lang.String> inputSizeshNQ4ISI;
        java.lang.String language = java.util.Locale.getDefault().getLanguage();
        com.caverock.androidsvg.SVGExternalFileResolver highSpeedVideoFpsRanges = com.caverock.androidsvg.SVG.getHighSpeedVideoFpsRanges();
        for (com.caverock.androidsvg.SVG.SvgObject svgObject : r8.getInputSizeshNQ4ISI) {
            if (svgObject instanceof com.caverock.androidsvg.SVG.SvgConditional) {
                com.caverock.androidsvg.SVG.SvgConditional svgConditional = (com.caverock.androidsvg.SVG.SvgConditional) svgObject;
                if (svgConditional.Camera2StreamConfigurationMap() == null && ((inputSizeshNQ4ISI = svgConditional.getInputSizeshNQ4ISI()) == null || (!inputSizeshNQ4ISI.isEmpty() && inputSizeshNQ4ISI.contains(language)))) {
                    java.util.Set<java.lang.String> highSpeedVideoSizes = svgConditional.getHighSpeedVideoSizes();
                    if (highSpeedVideoSizes != null) {
                        if (getHighSpeedVideoFpsRangesFor == null) {
                            getOutputMinFrameDuration();
                        }
                        if (!highSpeedVideoSizes.isEmpty() && getHighSpeedVideoFpsRangesFor.containsAll(highSpeedVideoSizes)) {
                        }
                    }
                    java.util.Set<java.lang.String> outputFormats = svgConditional.getOutputFormats();
                    if (outputFormats != null) {
                        if (!outputFormats.isEmpty() && highSpeedVideoFpsRanges != null) {
                            java.util.Iterator<java.lang.String> it = outputFormats.iterator();
                            while (it.hasNext()) {
                                if (!highSpeedVideoFpsRanges.isFormatSupported(it.next())) {
                                    break;
                                }
                            }
                        }
                    }
                    java.util.Set<java.lang.String> highSpeedVideoFpsRangesFor = svgConditional.getHighSpeedVideoFpsRangesFor();
                    if (highSpeedVideoFpsRangesFor != null) {
                        if (!highSpeedVideoFpsRangesFor.isEmpty() && highSpeedVideoFpsRanges != null) {
                            java.util.Iterator<java.lang.String> it2 = highSpeedVideoFpsRangesFor.iterator();
                            while (it2.hasNext()) {
                                if (highSpeedVideoFpsRanges.resolveFont(it2.next(), this.getHighSpeedVideoSizes.getInputFormats.getOutputMinFrameDurationlomOqCM.intValue(), java.lang.String.valueOf(this.getHighSpeedVideoSizes.getInputFormats.getOutputStallDurationlomOqCM)) == null) {
                                    break;
                                }
                            }
                        }
                    }
                    Camera2StreamConfigurationMap(svgObject);
                    return;
                }
            }
        }
    }

    private static void getOutputMinFrameDuration() {
        synchronized (com.caverock.androidsvg.SVGAndroidRenderer.class) {
            java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet<>();
            getHighSpeedVideoFpsRangesFor = hashSet;
            hashSet.add("Structure");
            getHighSpeedVideoFpsRangesFor.add("BasicStructure");
            getHighSpeedVideoFpsRangesFor.add("ConditionalProcessing");
            getHighSpeedVideoFpsRangesFor.add(com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.MASK_ALL_CONTENT_LABEL);
            getHighSpeedVideoFpsRangesFor.add("Style");
            getHighSpeedVideoFpsRangesFor.add("ViewportAttribute");
            getHighSpeedVideoFpsRangesFor.add("Shape");
            getHighSpeedVideoFpsRangesFor.add("BasicText");
            getHighSpeedVideoFpsRangesFor.add("PaintAttribute");
            getHighSpeedVideoFpsRangesFor.add("BasicPaintAttribute");
            getHighSpeedVideoFpsRangesFor.add("OpacityAttribute");
            getHighSpeedVideoFpsRangesFor.add("BasicGraphicsAttribute");
            getHighSpeedVideoFpsRangesFor.add("Marker");
            getHighSpeedVideoFpsRangesFor.add("Gradient");
            getHighSpeedVideoFpsRangesFor.add("Pattern");
            getHighSpeedVideoFpsRangesFor.add("Clip");
            getHighSpeedVideoFpsRangesFor.add("BasicClip");
            getHighSpeedVideoFpsRangesFor.add("Mask");
            getHighSpeedVideoFpsRangesFor.add("View");
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVG.Use use) {
        if (use.getHighSpeedVideoSizes == null || use.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges != 0.0f) {
            if (use.Camera2StreamConfigurationMap == null || use.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges != 0.0f) {
                getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, use);
                if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor == null || this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor.booleanValue()) {
                    com.caverock.androidsvg.SVG.SvgObject highSpeedVideoFpsRanges = use.ArtificialStackFrames.getHighSpeedVideoFpsRanges(use.getHighSpeedVideoFpsRangesFor);
                    if (highSpeedVideoFpsRanges == null) {
                        new java.lang.Object[]{use.getHighSpeedVideoFpsRangesFor};
                        return;
                    }
                    if (use.getHighSpeedVideoFpsRanges != null) {
                        this.getHighSpeedVideoFpsRanges.concat(use.getHighSpeedVideoFpsRanges);
                    }
                    this.getHighSpeedVideoFpsRanges.translate(use.getHighResolutionOutputSizeshNQ4ISI != null ? use.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(this) : 0.0f, use.getInputFormats != null ? use.getInputFormats.getHighSpeedVideoSizes(this) : 0.0f);
                    getHighSpeedVideoFpsRanges(use, use.isOutputSupportedFor);
                    boolean outputFormats = getOutputFormats();
                    this.getOutputMinFrameDuration.push(use);
                    this.getHighSpeedVideoSizesFor.push(this.getHighSpeedVideoFpsRanges.getMatrix());
                    if (highSpeedVideoFpsRanges instanceof com.caverock.androidsvg.SVG.Svg) {
                        com.caverock.androidsvg.SVG.Svg svg = (com.caverock.androidsvg.SVG.Svg) highSpeedVideoFpsRanges;
                        com.caverock.androidsvg.SVG.Box Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(null, null, use.getHighSpeedVideoSizes, use.Camera2StreamConfigurationMap);
                        getOutputSizeshNQ4ISI();
                        getHighSpeedVideoSizes(svg, Camera2StreamConfigurationMap, svg.getOutputMinFrameDuration, svg.coroutineBoundary);
                        this.getHighSpeedVideoFpsRanges.restore();
                        this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
                    } else if (highSpeedVideoFpsRanges instanceof com.caverock.androidsvg.SVG.Symbol) {
                        com.caverock.androidsvg.SVG.Box Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(null, null, use.getHighSpeedVideoSizes != null ? use.getHighSpeedVideoSizes : new com.caverock.androidsvg.SVG.Length(100.0f, com.caverock.androidsvg.SVG.Unit.percent), use.Camera2StreamConfigurationMap != null ? use.Camera2StreamConfigurationMap : new com.caverock.androidsvg.SVG.Length(100.0f, com.caverock.androidsvg.SVG.Unit.percent));
                        getOutputSizeshNQ4ISI();
                        getHighSpeedVideoFpsRangesFor((com.caverock.androidsvg.SVG.Symbol) highSpeedVideoFpsRanges, Camera2StreamConfigurationMap2);
                        this.getHighSpeedVideoFpsRanges.restore();
                        this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
                    } else {
                        Camera2StreamConfigurationMap(highSpeedVideoFpsRanges);
                    }
                    this.getOutputMinFrameDuration.pop();
                    this.getHighSpeedVideoSizesFor.pop();
                    if (outputFormats) {
                        Camera2StreamConfigurationMap(use, use.isOutputSupportedFor);
                    }
                    getHighSpeedVideoSizes(use);
                }
            }
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVG.Path path) {
        if (path.getHighResolutionOutputSizeshNQ4ISI != null) {
            getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, path);
            if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor == null || this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor.booleanValue()) {
                if (this.getHighSpeedVideoSizes.getInputFormats.exchange == null || this.getHighSpeedVideoSizes.getInputFormats.exchange.booleanValue()) {
                    if (this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges || this.getHighSpeedVideoSizes.getHighSpeedVideoSizes) {
                        if (path.getInputSizeshNQ4ISI != null) {
                            this.getHighSpeedVideoFpsRanges.concat(path.getInputSizeshNQ4ISI);
                        }
                        android.graphics.Path path2 = new com.caverock.androidsvg.SVGAndroidRenderer.PathConverter(path.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes;
                        if (path.isOutputSupportedFor == null) {
                            path.isOutputSupportedFor = Camera2StreamConfigurationMap(path2);
                        }
                        getHighSpeedVideoSizes(path);
                        getHighSpeedVideoFpsRangesFor((com.caverock.androidsvg.SVG.SvgElement) path);
                        getHighSpeedVideoFpsRanges(path, path.isOutputSupportedFor);
                        boolean outputFormats = getOutputFormats();
                        if (this.getHighSpeedVideoSizes.getHighSpeedVideoSizes) {
                            path2.setFillType(getInputFormats());
                            getHighSpeedVideoFpsRangesFor(path, path2);
                        }
                        if (this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges) {
                            getHighSpeedVideoFpsRangesFor(path2);
                        }
                        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.GraphicsElement) path);
                        if (outputFormats) {
                            Camera2StreamConfigurationMap(path, path.isOutputSupportedFor);
                        }
                    }
                }
            }
        }
    }

    private static com.caverock.androidsvg.SVG.Box Camera2StreamConfigurationMap(android.graphics.Path path) {
        android.graphics.RectF rectF = new android.graphics.RectF();
        path.computeBounds(rectF, true);
        return new com.caverock.androidsvg.SVG.Box(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private void getHighSpeedVideoFpsRangesFor(com.caverock.androidsvg.SVG.Rect rect) {
        if (rect.getHighSpeedVideoFpsRanges == null || rect.getHighSpeedVideoFpsRangesFor == null || rect.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges == 0.0f || rect.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges == 0.0f) {
            return;
        }
        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, rect);
        if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor == null || this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor.booleanValue()) {
            if (this.getHighSpeedVideoSizes.getInputFormats.exchange == null || this.getHighSpeedVideoSizes.getInputFormats.exchange.booleanValue()) {
                if (rect.getInputSizeshNQ4ISI != null) {
                    this.getHighSpeedVideoFpsRanges.concat(rect.getInputSizeshNQ4ISI);
                }
                android.graphics.Path highSpeedVideoSizes = getHighSpeedVideoSizes(rect);
                getHighSpeedVideoSizes((com.caverock.androidsvg.SVG.SvgElement) rect);
                getHighSpeedVideoFpsRangesFor((com.caverock.androidsvg.SVG.SvgElement) rect);
                getHighSpeedVideoFpsRanges(rect, rect.isOutputSupportedFor);
                boolean outputFormats = getOutputFormats();
                if (this.getHighSpeedVideoSizes.getHighSpeedVideoSizes) {
                    getHighSpeedVideoFpsRangesFor(rect, highSpeedVideoSizes);
                }
                if (this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges) {
                    getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes);
                }
                if (outputFormats) {
                    Camera2StreamConfigurationMap(rect, rect.isOutputSupportedFor);
                }
            }
        }
    }

    private void getHighSpeedVideoFpsRanges(com.caverock.androidsvg.SVG.Circle circle) {
        if (circle.getHighSpeedVideoFpsRangesFor == null || circle.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges == 0.0f) {
            return;
        }
        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, circle);
        if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor == null || this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor.booleanValue()) {
            if (this.getHighSpeedVideoSizes.getInputFormats.exchange == null || this.getHighSpeedVideoSizes.getInputFormats.exchange.booleanValue()) {
                if (circle.getInputSizeshNQ4ISI != null) {
                    this.getHighSpeedVideoFpsRanges.concat(circle.getInputSizeshNQ4ISI);
                }
                android.graphics.Path highSpeedVideoSizes = getHighSpeedVideoSizes(circle);
                getHighSpeedVideoSizes((com.caverock.androidsvg.SVG.SvgElement) circle);
                getHighSpeedVideoFpsRangesFor((com.caverock.androidsvg.SVG.SvgElement) circle);
                getHighSpeedVideoFpsRanges(circle, circle.isOutputSupportedFor);
                boolean outputFormats = getOutputFormats();
                if (this.getHighSpeedVideoSizes.getHighSpeedVideoSizes) {
                    getHighSpeedVideoFpsRangesFor(circle, highSpeedVideoSizes);
                }
                if (this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges) {
                    getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes);
                }
                if (outputFormats) {
                    Camera2StreamConfigurationMap(circle, circle.isOutputSupportedFor);
                }
            }
        }
    }

    private void getHighSpeedVideoFpsRanges(com.caverock.androidsvg.SVG.Ellipse ellipse) {
        if (ellipse.Camera2StreamConfigurationMap == null || ellipse.getHighResolutionOutputSizeshNQ4ISI == null || ellipse.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges == 0.0f || ellipse.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges == 0.0f) {
            return;
        }
        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, ellipse);
        if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor == null || this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor.booleanValue()) {
            if (this.getHighSpeedVideoSizes.getInputFormats.exchange == null || this.getHighSpeedVideoSizes.getInputFormats.exchange.booleanValue()) {
                if (ellipse.getInputSizeshNQ4ISI != null) {
                    this.getHighSpeedVideoFpsRanges.concat(ellipse.getInputSizeshNQ4ISI);
                }
                android.graphics.Path highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(ellipse);
                getHighSpeedVideoSizes(ellipse);
                getHighSpeedVideoFpsRangesFor((com.caverock.androidsvg.SVG.SvgElement) ellipse);
                getHighSpeedVideoFpsRanges(ellipse, ellipse.isOutputSupportedFor);
                boolean outputFormats = getOutputFormats();
                if (this.getHighSpeedVideoSizes.getHighSpeedVideoSizes) {
                    getHighSpeedVideoFpsRangesFor(ellipse, highResolutionOutputSizeshNQ4ISI);
                }
                if (this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges) {
                    getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI);
                }
                if (outputFormats) {
                    Camera2StreamConfigurationMap(ellipse, ellipse.isOutputSupportedFor);
                }
            }
        }
    }

    private void getHighSpeedVideoFpsRanges(com.caverock.androidsvg.SVG.Line line) {
        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, line);
        if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor == null || this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor.booleanValue()) {
            if ((this.getHighSpeedVideoSizes.getInputFormats.exchange == null || this.getHighSpeedVideoSizes.getInputFormats.exchange.booleanValue()) && this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges) {
                if (line.getInputSizeshNQ4ISI != null) {
                    this.getHighSpeedVideoFpsRanges.concat(line.getInputSizeshNQ4ISI);
                }
                float highSpeedVideoFpsRangesFor = line.Camera2StreamConfigurationMap == null ? 0.0f : line.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(this);
                float highSpeedVideoSizes = line.getHighSpeedVideoFpsRangesFor == null ? 0.0f : line.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(this);
                float highSpeedVideoFpsRangesFor2 = line.getHighSpeedVideoFpsRanges == null ? 0.0f : line.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this);
                float highSpeedVideoSizes2 = line.getHighSpeedVideoSizes != null ? line.getHighSpeedVideoSizes.getHighSpeedVideoSizes(this) : 0.0f;
                if (line.isOutputSupportedFor == null) {
                    line.isOutputSupportedFor = new com.caverock.androidsvg.SVG.Box(java.lang.Math.min(highSpeedVideoFpsRangesFor, highSpeedVideoFpsRangesFor2), java.lang.Math.min(highSpeedVideoSizes, highSpeedVideoSizes2), java.lang.Math.abs(highSpeedVideoFpsRangesFor2 - highSpeedVideoFpsRangesFor), java.lang.Math.abs(highSpeedVideoSizes2 - highSpeedVideoSizes));
                }
                android.graphics.Path path = new android.graphics.Path();
                path.moveTo(highSpeedVideoFpsRangesFor, highSpeedVideoSizes);
                path.lineTo(highSpeedVideoFpsRangesFor2, highSpeedVideoSizes2);
                getHighSpeedVideoSizes((com.caverock.androidsvg.SVG.SvgElement) line);
                getHighSpeedVideoFpsRangesFor((com.caverock.androidsvg.SVG.SvgElement) line);
                getHighSpeedVideoFpsRanges(line, line.isOutputSupportedFor);
                boolean outputFormats = getOutputFormats();
                getHighSpeedVideoFpsRangesFor(path);
                getHighResolutionOutputSizeshNQ4ISI(line);
                if (outputFormats) {
                    Camera2StreamConfigurationMap(line, line.isOutputSupportedFor);
                }
            }
        }
    }

    private java.util.List<com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector> getHighSpeedVideoSizes(com.caverock.androidsvg.SVG.Line line) {
        float highSpeedVideoFpsRangesFor = line.Camera2StreamConfigurationMap != null ? line.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(this) : 0.0f;
        float highSpeedVideoSizes = line.getHighSpeedVideoFpsRangesFor != null ? line.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(this) : 0.0f;
        float highSpeedVideoFpsRangesFor2 = line.getHighSpeedVideoFpsRanges != null ? line.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this) : 0.0f;
        float highSpeedVideoSizes2 = line.getHighSpeedVideoSizes != null ? line.getHighSpeedVideoSizes.getHighSpeedVideoSizes(this) : 0.0f;
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        float f = highSpeedVideoFpsRangesFor2 - highSpeedVideoFpsRangesFor;
        float f2 = highSpeedVideoSizes2 - highSpeedVideoSizes;
        arrayList.add(new com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector(highSpeedVideoFpsRangesFor, highSpeedVideoSizes, f, f2));
        arrayList.add(new com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector(highSpeedVideoFpsRangesFor2, highSpeedVideoSizes2, f, f2));
        return arrayList;
    }

    private void getHighSpeedVideoFpsRangesFor(com.caverock.androidsvg.SVG.PolyLine polyLine) {
        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, polyLine);
        if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor == null || this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor.booleanValue()) {
            if (this.getHighSpeedVideoSizes.getInputFormats.exchange == null || this.getHighSpeedVideoSizes.getInputFormats.exchange.booleanValue()) {
                if (this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges || this.getHighSpeedVideoSizes.getHighSpeedVideoSizes) {
                    if (polyLine.getInputSizeshNQ4ISI != null) {
                        this.getHighSpeedVideoFpsRanges.concat(polyLine.getInputSizeshNQ4ISI);
                    }
                    if (polyLine.getHighResolutionOutputSizeshNQ4ISI.length >= 2) {
                        android.graphics.Path highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(polyLine);
                        getHighSpeedVideoSizes(polyLine);
                        highResolutionOutputSizeshNQ4ISI.setFillType(getInputFormats());
                        getHighSpeedVideoFpsRangesFor((com.caverock.androidsvg.SVG.SvgElement) polyLine);
                        getHighSpeedVideoFpsRanges(polyLine, polyLine.isOutputSupportedFor);
                        boolean outputFormats = getOutputFormats();
                        if (this.getHighSpeedVideoSizes.getHighSpeedVideoSizes) {
                            getHighSpeedVideoFpsRangesFor(polyLine, highResolutionOutputSizeshNQ4ISI);
                        }
                        if (this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges) {
                            getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI);
                        }
                        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.GraphicsElement) polyLine);
                        if (outputFormats) {
                            Camera2StreamConfigurationMap(polyLine, polyLine.isOutputSupportedFor);
                        }
                    }
                }
            }
        }
    }

    private java.util.List<com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector> Camera2StreamConfigurationMap(com.caverock.androidsvg.SVG.PolyLine polyLine) {
        int length = polyLine.getHighResolutionOutputSizeshNQ4ISI.length;
        int i = 2;
        if (length < 2) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector markerVector = new com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector(polyLine.getHighResolutionOutputSizeshNQ4ISI[0], polyLine.getHighResolutionOutputSizeshNQ4ISI[1], 0.0f, 0.0f);
        float f = 0.0f;
        float f2 = 0.0f;
        while (i < length) {
            f = polyLine.getHighResolutionOutputSizeshNQ4ISI[i];
            f2 = polyLine.getHighResolutionOutputSizeshNQ4ISI[i + 1];
            markerVector.Camera2StreamConfigurationMap(f, f2);
            arrayList.add(markerVector);
            i += 2;
            markerVector = new com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector(f, f2, f - markerVector.getHighSpeedVideoFpsRangesFor, f2 - markerVector.getOutputMinFrameDuration);
        }
        if (!(polyLine instanceof com.caverock.androidsvg.SVG.Polygon)) {
            arrayList.add(markerVector);
            return arrayList;
        }
        if (f != polyLine.getHighResolutionOutputSizeshNQ4ISI[0] && f2 != polyLine.getHighResolutionOutputSizeshNQ4ISI[1]) {
            float f3 = polyLine.getHighResolutionOutputSizeshNQ4ISI[0];
            float f4 = polyLine.getHighResolutionOutputSizeshNQ4ISI[1];
            markerVector.Camera2StreamConfigurationMap(f3, f4);
            arrayList.add(markerVector);
            com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector markerVector2 = new com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector(f3, f4, f3 - markerVector.getHighSpeedVideoFpsRangesFor, f4 - markerVector.getOutputMinFrameDuration);
            markerVector2.getHighSpeedVideoSizes((com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector) arrayList.get(0));
            arrayList.add(markerVector2);
            arrayList.set(0, markerVector2);
        }
        return arrayList;
    }

    private void getHighSpeedVideoSizes(com.caverock.androidsvg.SVG.Polygon polygon) {
        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, polygon);
        if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor == null || this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor.booleanValue()) {
            if (this.getHighSpeedVideoSizes.getInputFormats.exchange == null || this.getHighSpeedVideoSizes.getInputFormats.exchange.booleanValue()) {
                if (this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges || this.getHighSpeedVideoSizes.getHighSpeedVideoSizes) {
                    if (polygon.getInputSizeshNQ4ISI != null) {
                        this.getHighSpeedVideoFpsRanges.concat(polygon.getInputSizeshNQ4ISI);
                    }
                    if (polygon.getHighResolutionOutputSizeshNQ4ISI.length >= 2) {
                        android.graphics.Path highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.PolyLine) polygon);
                        getHighSpeedVideoSizes((com.caverock.androidsvg.SVG.SvgElement) polygon);
                        getHighSpeedVideoFpsRangesFor((com.caverock.androidsvg.SVG.SvgElement) polygon);
                        getHighSpeedVideoFpsRanges(polygon, polygon.isOutputSupportedFor);
                        boolean outputFormats = getOutputFormats();
                        if (this.getHighSpeedVideoSizes.getHighSpeedVideoSizes) {
                            getHighSpeedVideoFpsRangesFor(polygon, highResolutionOutputSizeshNQ4ISI);
                        }
                        if (this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges) {
                            getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI);
                        }
                        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.GraphicsElement) polygon);
                        if (outputFormats) {
                            Camera2StreamConfigurationMap(polygon, polygon.isOutputSupportedFor);
                        }
                    }
                }
            }
        }
    }

    private void Camera2StreamConfigurationMap(com.caverock.androidsvg.SVG.Text text) {
        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, text);
        if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor == null || this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor.booleanValue()) {
            if (text.Camera2StreamConfigurationMap != null) {
                this.getHighSpeedVideoFpsRanges.concat(text.Camera2StreamConfigurationMap);
            }
            byte b = 0;
            float f = 0.0f;
            float highSpeedVideoFpsRangesFor = (text.getHighSpeedVideoSizes == null || text.getHighSpeedVideoSizes.size() == 0) ? 0.0f : text.getHighSpeedVideoSizes.get(0).getHighSpeedVideoFpsRangesFor(this);
            float highSpeedVideoSizes = (text.getHighSpeedVideoFpsRangesFor == null || text.getHighSpeedVideoFpsRangesFor.size() == 0) ? 0.0f : text.getHighSpeedVideoFpsRangesFor.get(0).getHighSpeedVideoSizes(this);
            float highSpeedVideoFpsRangesFor2 = (text.getHighSpeedVideoFpsRanges == null || text.getHighSpeedVideoFpsRanges.size() == 0) ? 0.0f : text.getHighSpeedVideoFpsRanges.get(0).getHighSpeedVideoFpsRangesFor(this);
            if (text.getHighResolutionOutputSizeshNQ4ISI != null && text.getHighResolutionOutputSizeshNQ4ISI.size() != 0) {
                f = text.getHighResolutionOutputSizeshNQ4ISI.get(0).getHighSpeedVideoSizes(this);
            }
            com.caverock.androidsvg.SVG.Style.TextAnchor highSpeedVideoSizes2 = getHighSpeedVideoSizes();
            if (highSpeedVideoSizes2 != com.caverock.androidsvg.SVG.Style.TextAnchor.Start) {
                com.caverock.androidsvg.SVGAndroidRenderer.TextWidthCalculator textWidthCalculator = new com.caverock.androidsvg.SVGAndroidRenderer.TextWidthCalculator(this, b);
                getHighSpeedVideoSizes(text, textWidthCalculator);
                float f2 = textWidthCalculator.getHighSpeedVideoFpsRanges;
                if (highSpeedVideoSizes2 == com.caverock.androidsvg.SVG.Style.TextAnchor.Middle) {
                    f2 /= 2.0f;
                }
                highSpeedVideoFpsRangesFor -= f2;
            }
            if (text.isOutputSupportedFor == null) {
                com.caverock.androidsvg.SVGAndroidRenderer.TextBoundsCalculator textBoundsCalculator = new com.caverock.androidsvg.SVGAndroidRenderer.TextBoundsCalculator(highSpeedVideoFpsRangesFor, highSpeedVideoSizes);
                getHighSpeedVideoSizes(text, textBoundsCalculator);
                text.isOutputSupportedFor = new com.caverock.androidsvg.SVG.Box(textBoundsCalculator.Camera2StreamConfigurationMap.left, textBoundsCalculator.Camera2StreamConfigurationMap.top, textBoundsCalculator.Camera2StreamConfigurationMap.width(), textBoundsCalculator.Camera2StreamConfigurationMap.height());
            }
            getHighSpeedVideoSizes(text);
            getHighSpeedVideoFpsRangesFor((com.caverock.androidsvg.SVG.SvgElement) text);
            getHighSpeedVideoFpsRanges(text, text.isOutputSupportedFor);
            boolean outputFormats = getOutputFormats();
            getHighSpeedVideoSizes(text, new com.caverock.androidsvg.SVGAndroidRenderer.PlainTextDrawer(highSpeedVideoFpsRangesFor + highSpeedVideoFpsRangesFor2, highSpeedVideoSizes + f));
            if (outputFormats) {
                Camera2StreamConfigurationMap(text, text.isOutputSupportedFor);
            }
        }
    }

    private com.caverock.androidsvg.SVG.Style.TextAnchor getHighSpeedVideoSizes() {
        if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoFpsRanges == com.caverock.androidsvg.SVG.Style.TextDirection.LTR || this.getHighSpeedVideoSizes.getInputFormats.d == com.caverock.androidsvg.SVG.Style.TextAnchor.Middle) {
            return this.getHighSpeedVideoSizes.getInputFormats.d;
        }
        return this.getHighSpeedVideoSizes.getInputFormats.d == com.caverock.androidsvg.SVG.Style.TextAnchor.Start ? com.caverock.androidsvg.SVG.Style.TextAnchor.End : com.caverock.androidsvg.SVG.Style.TextAnchor.Start;
    }

    class PlainTextDrawer extends com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor {
        float getHighResolutionOutputSizeshNQ4ISI;
        float getHighSpeedVideoFpsRangesFor;

        PlainTextDrawer(float f, float f2) {
            super(com.caverock.androidsvg.SVGAndroidRenderer.this, (byte) 0);
            this.getHighResolutionOutputSizeshNQ4ISI = f;
            this.getHighSpeedVideoFpsRangesFor = f2;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public void getHighSpeedVideoFpsRangesFor(java.lang.String str) {
            com.caverock.androidsvg.SVGAndroidRenderer.getHighSpeedVideoFpsRangesFor();
            if (com.caverock.androidsvg.SVGAndroidRenderer.getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVGAndroidRenderer.this)) {
                if (com.caverock.androidsvg.SVGAndroidRenderer.this.getHighSpeedVideoSizes.getHighSpeedVideoSizes) {
                    com.caverock.androidsvg.SVGAndroidRenderer.this.getHighSpeedVideoFpsRanges.drawText(str, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, com.caverock.androidsvg.SVGAndroidRenderer.this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor);
                }
                if (com.caverock.androidsvg.SVGAndroidRenderer.this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges) {
                    com.caverock.androidsvg.SVGAndroidRenderer.this.getHighSpeedVideoFpsRanges.drawText(str, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, com.caverock.androidsvg.SVGAndroidRenderer.this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI);
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI += com.caverock.androidsvg.SVGAndroidRenderer.this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.measureText(str);
        }
    }

    abstract class TextProcessor {
        public boolean Camera2StreamConfigurationMap(com.caverock.androidsvg.SVG.TextContainer textContainer) {
            return true;
        }

        public abstract void getHighSpeedVideoFpsRangesFor(java.lang.String str);

        private TextProcessor() {
        }

        /* synthetic */ TextProcessor(com.caverock.androidsvg.SVGAndroidRenderer sVGAndroidRenderer, byte b) {
            this();
        }
    }

    class PathTextDrawer extends com.caverock.androidsvg.SVGAndroidRenderer.PlainTextDrawer {
        private android.graphics.Path getHighSpeedVideoFpsRanges;

        PathTextDrawer(android.graphics.Path path, float f) {
            super(f, 0.0f);
            this.getHighSpeedVideoFpsRanges = path;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.PlainTextDrawer, com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public final void getHighSpeedVideoFpsRangesFor(java.lang.String str) {
            if (com.caverock.androidsvg.SVGAndroidRenderer.getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVGAndroidRenderer.this)) {
                if (com.caverock.androidsvg.SVGAndroidRenderer.this.getHighSpeedVideoSizes.getHighSpeedVideoSizes) {
                    com.caverock.androidsvg.SVGAndroidRenderer.this.getHighSpeedVideoFpsRanges.drawTextOnPath(str, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, com.caverock.androidsvg.SVGAndroidRenderer.this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor);
                }
                if (com.caverock.androidsvg.SVGAndroidRenderer.this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges) {
                    com.caverock.androidsvg.SVGAndroidRenderer.this.getHighSpeedVideoFpsRanges.drawTextOnPath(str, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, com.caverock.androidsvg.SVGAndroidRenderer.this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI);
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI += com.caverock.androidsvg.SVGAndroidRenderer.this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.measureText(str);
        }
    }

    class TextWidthCalculator extends com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor {
        float getHighSpeedVideoFpsRanges;

        private TextWidthCalculator() {
            super(com.caverock.androidsvg.SVGAndroidRenderer.this, (byte) 0);
            this.getHighSpeedVideoFpsRanges = 0.0f;
        }

        /* synthetic */ TextWidthCalculator(com.caverock.androidsvg.SVGAndroidRenderer sVGAndroidRenderer, byte b) {
            this();
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public final void getHighSpeedVideoFpsRangesFor(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges += com.caverock.androidsvg.SVGAndroidRenderer.this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.measureText(str);
        }
    }

    class TextBoundsCalculator extends com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor {
        android.graphics.RectF Camera2StreamConfigurationMap;
        float getHighSpeedVideoFpsRangesFor;
        float getHighSpeedVideoSizes;

        TextBoundsCalculator(float f, float f2) {
            super(com.caverock.androidsvg.SVGAndroidRenderer.this, (byte) 0);
            this.Camera2StreamConfigurationMap = new android.graphics.RectF();
            this.getHighSpeedVideoFpsRangesFor = f;
            this.getHighSpeedVideoSizes = f2;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public final boolean Camera2StreamConfigurationMap(com.caverock.androidsvg.SVG.TextContainer textContainer) {
            if (!(textContainer instanceof com.caverock.androidsvg.SVG.TextPath)) {
                return true;
            }
            com.caverock.androidsvg.SVG.TextPath textPath = (com.caverock.androidsvg.SVG.TextPath) textContainer;
            com.caverock.androidsvg.SVG.SvgObject highSpeedVideoFpsRanges = textContainer.ArtificialStackFrames.getHighSpeedVideoFpsRanges(textPath.getHighSpeedVideoFpsRangesFor);
            if (highSpeedVideoFpsRanges == null) {
                new java.lang.Object[]{textPath.getHighSpeedVideoFpsRangesFor};
                com.caverock.androidsvg.SVGAndroidRenderer.getHighSpeedVideoFpsRanges();
                return false;
            }
            com.caverock.androidsvg.SVG.Path path = (com.caverock.androidsvg.SVG.Path) highSpeedVideoFpsRanges;
            android.graphics.Path path2 = com.caverock.androidsvg.SVGAndroidRenderer.this.new PathConverter(path.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes;
            if (path.getInputSizeshNQ4ISI != null) {
                path2.transform(path.getInputSizeshNQ4ISI);
            }
            android.graphics.RectF rectF = new android.graphics.RectF();
            path2.computeBounds(rectF, true);
            this.Camera2StreamConfigurationMap.union(rectF);
            return false;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public final void getHighSpeedVideoFpsRangesFor(java.lang.String str) {
            if (com.caverock.androidsvg.SVGAndroidRenderer.getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVGAndroidRenderer.this)) {
                android.graphics.Rect rect = new android.graphics.Rect();
                com.caverock.androidsvg.SVGAndroidRenderer.this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.getTextBounds(str, 0, str.length(), rect);
                android.graphics.RectF rectF = new android.graphics.RectF(rect);
                rectF.offset(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
                this.Camera2StreamConfigurationMap.union(rectF);
            }
            this.getHighSpeedVideoFpsRangesFor += com.caverock.androidsvg.SVGAndroidRenderer.this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.measureText(str);
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVG.TextContainer textContainer, java.lang.StringBuilder sb) {
        java.util.Iterator<com.caverock.androidsvg.SVG.SvgObject> it = textContainer.getInputSizeshNQ4ISI.iterator();
        boolean z = true;
        while (it.hasNext()) {
            com.caverock.androidsvg.SVG.SvgObject next = it.next();
            if (next instanceof com.caverock.androidsvg.SVG.TextContainer) {
                getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.TextContainer) next, sb);
            } else if (next instanceof com.caverock.androidsvg.SVG.TextSequence) {
                sb.append(getHighSpeedVideoSizes(((com.caverock.androidsvg.SVG.TextSequence) next).Camera2StreamConfigurationMap, z, !it.hasNext()));
            }
            z = false;
        }
    }

    private java.lang.String getHighSpeedVideoSizes(java.lang.String str, boolean z, boolean z2) {
        if (this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        java.lang.String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    private void getHighSpeedVideoFpsRangesFor(com.caverock.androidsvg.SVG.Symbol symbol, com.caverock.androidsvg.SVG.Box box) {
        if (box.getHighResolutionOutputSizeshNQ4ISI == 0.0f || box.getHighSpeedVideoSizes == 0.0f) {
            return;
        }
        com.caverock.androidsvg.PreserveAspectRatio preserveAspectRatio = symbol.coroutineBoundary != null ? symbol.coroutineBoundary : com.caverock.androidsvg.PreserveAspectRatio.LETTERBOX;
        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, symbol);
        this.getHighSpeedVideoSizes.getOutputMinFrameDuration = box;
        if (!this.getHighSpeedVideoSizes.getInputFormats.getValidOutputFormatsForInputhNQ4ISI.booleanValue()) {
            getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes.getOutputMinFrameDuration.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes.getOutputMinFrameDuration.getHighSpeedVideoSizes);
        }
        if (symbol.getOutputMinFrameDuration != null) {
            this.getHighSpeedVideoFpsRanges.concat(getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes.getOutputMinFrameDuration, symbol.getOutputMinFrameDuration, preserveAspectRatio));
            this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI = symbol.getOutputMinFrameDuration;
        } else {
            this.getHighSpeedVideoFpsRanges.translate(this.getHighSpeedVideoSizes.getOutputMinFrameDuration.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges);
        }
        boolean outputFormats = getOutputFormats();
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgContainer) symbol, true);
        if (outputFormats) {
            Camera2StreamConfigurationMap(symbol, symbol.isOutputSupportedFor);
        }
        getHighSpeedVideoSizes(symbol);
    }

    private void getHighSpeedVideoFpsRanges(com.caverock.androidsvg.SVG.Image image) {
        if (image.getHighSpeedVideoFpsRanges == null || image.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges == 0.0f || image.getHighSpeedVideoFpsRangesFor == null || image.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges == 0.0f || image.Camera2StreamConfigurationMap == null) {
            return;
        }
        com.caverock.androidsvg.PreserveAspectRatio preserveAspectRatio = image.coroutineBoundary != null ? image.coroutineBoundary : com.caverock.androidsvg.PreserveAspectRatio.LETTERBOX;
        android.graphics.Bitmap Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(image.Camera2StreamConfigurationMap);
        if (Camera2StreamConfigurationMap == null) {
            com.caverock.androidsvg.SVGExternalFileResolver highSpeedVideoFpsRanges = com.caverock.androidsvg.SVG.getHighSpeedVideoFpsRanges();
            if (highSpeedVideoFpsRanges == null) {
                return;
            } else {
                Camera2StreamConfigurationMap = highSpeedVideoFpsRanges.resolveImage(image.Camera2StreamConfigurationMap);
            }
        }
        if (Camera2StreamConfigurationMap == null) {
            new java.lang.Object[]{image.Camera2StreamConfigurationMap};
            return;
        }
        com.caverock.androidsvg.SVG.Box box = new com.caverock.androidsvg.SVG.Box(0.0f, 0.0f, Camera2StreamConfigurationMap.getWidth(), Camera2StreamConfigurationMap.getHeight());
        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, image);
        if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor == null || this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor.booleanValue()) {
            if (this.getHighSpeedVideoSizes.getInputFormats.exchange == null || this.getHighSpeedVideoSizes.getInputFormats.exchange.booleanValue()) {
                if (image.getHighResolutionOutputSizeshNQ4ISI != null) {
                    this.getHighSpeedVideoFpsRanges.concat(image.getHighResolutionOutputSizeshNQ4ISI);
                }
                this.getHighSpeedVideoSizes.getOutputMinFrameDuration = new com.caverock.androidsvg.SVG.Box(image.getHighSpeedVideoSizes != null ? image.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(this) : 0.0f, image.getOutputMinFrameDuration != null ? image.getOutputMinFrameDuration.getHighSpeedVideoSizes(this) : 0.0f, image.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this), image.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(this));
                if (!this.getHighSpeedVideoSizes.getInputFormats.getValidOutputFormatsForInputhNQ4ISI.booleanValue()) {
                    getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes.getOutputMinFrameDuration.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes.getOutputMinFrameDuration.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes.getOutputMinFrameDuration.getHighSpeedVideoSizes);
                }
                image.isOutputSupportedFor = this.getHighSpeedVideoSizes.getOutputMinFrameDuration;
                getHighSpeedVideoSizes(image);
                getHighSpeedVideoFpsRanges(image, image.isOutputSupportedFor);
                boolean outputFormats = getOutputFormats();
                getOutputSizes();
                this.getHighSpeedVideoFpsRanges.save();
                this.getHighSpeedVideoFpsRanges.concat(getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes.getOutputMinFrameDuration, box, preserveAspectRatio));
                this.getHighSpeedVideoFpsRanges.drawBitmap(Camera2StreamConfigurationMap, 0.0f, 0.0f, new android.graphics.Paint(this.getHighSpeedVideoSizes.getInputFormats.getOutputSizeshNQ4ISI != com.caverock.androidsvg.SVG.Style.RenderQuality.optimizeSpeed ? 2 : 0));
                this.getHighSpeedVideoFpsRanges.restore();
                if (outputFormats) {
                    Camera2StreamConfigurationMap(image, image.isOutputSupportedFor);
                }
            }
        }
    }

    private static android.graphics.Bitmap Camera2StreamConfigurationMap(java.lang.String str) {
        int indexOf;
        if (!str.startsWith("data:") || str.length() < 14 || (indexOf = str.indexOf(44)) < 12 || !";base64".equals(str.substring(indexOf - 7, indexOf))) {
            return null;
        }
        try {
            byte[] decode = android.util.Base64.decode(str.substring(indexOf + 1), 0);
            return android.graphics.BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if (r10 != 8) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static android.graphics.Matrix getHighSpeedVideoFpsRanges(com.caverock.androidsvg.SVG.Box box, com.caverock.androidsvg.SVG.Box box2, com.caverock.androidsvg.PreserveAspectRatio preserveAspectRatio) {
        float f;
        float f2;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (preserveAspectRatio != null && preserveAspectRatio.getAlignment() != null) {
            float f3 = box.getHighResolutionOutputSizeshNQ4ISI / box2.getHighResolutionOutputSizeshNQ4ISI;
            float f4 = box.getHighSpeedVideoSizes / box2.getHighSpeedVideoSizes;
            float f5 = -box2.Camera2StreamConfigurationMap;
            float f6 = -box2.getHighSpeedVideoFpsRanges;
            if (preserveAspectRatio.equals(com.caverock.androidsvg.PreserveAspectRatio.STRETCH)) {
                matrix.preTranslate(box.Camera2StreamConfigurationMap, box.getHighSpeedVideoFpsRanges);
                matrix.preScale(f3, f4);
                matrix.preTranslate(f5, f6);
                return matrix;
            }
            float max = preserveAspectRatio.getScale() == com.caverock.androidsvg.PreserveAspectRatio.Scale.slice ? java.lang.Math.max(f3, f4) : java.lang.Math.min(f3, f4);
            float f7 = box.getHighResolutionOutputSizeshNQ4ISI / max;
            float f8 = box.getHighSpeedVideoSizes / max;
            switch (com.caverock.androidsvg.SVGAndroidRenderer.AnonymousClass1.getHighSpeedVideoFpsRanges[preserveAspectRatio.getAlignment().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f2 = (box2.getHighResolutionOutputSizeshNQ4ISI - f7) / 2.0f;
                    break;
                case 4:
                case 5:
                case 6:
                    f2 = box2.getHighResolutionOutputSizeshNQ4ISI - f7;
                    break;
            }
            f5 -= f2;
            int i = com.caverock.androidsvg.SVGAndroidRenderer.AnonymousClass1.getHighSpeedVideoFpsRanges[preserveAspectRatio.getAlignment().ordinal()];
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                            }
                        }
                    }
                }
                f = box2.getHighSpeedVideoSizes - f8;
                f6 -= f;
                matrix.preTranslate(box.Camera2StreamConfigurationMap, box.getHighSpeedVideoFpsRanges);
                matrix.preScale(max, max);
                matrix.preTranslate(f5, f6);
            }
            f = (box2.getHighSpeedVideoSizes - f8) / 2.0f;
            f6 -= f;
            matrix.preTranslate(box.Camera2StreamConfigurationMap, box.getHighSpeedVideoFpsRanges);
            matrix.preScale(max, max);
            matrix.preTranslate(f5, f6);
        }
        return matrix;
    }

    /* renamed from: com.caverock.androidsvg.SVGAndroidRenderer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[com.caverock.androidsvg.SVG.Style.LineJoin.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[com.caverock.androidsvg.SVG.Style.LineJoin.Miter.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[com.caverock.androidsvg.SVG.Style.LineJoin.Round.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[com.caverock.androidsvg.SVG.Style.LineJoin.Bevel.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.caverock.androidsvg.SVG.Style.LineCap.values().length];
            getHighSpeedVideoFpsRangesFor = iArr2;
            try {
                iArr2[com.caverock.androidsvg.SVG.Style.LineCap.Butt.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.caverock.androidsvg.SVG.Style.LineCap.Round.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.caverock.androidsvg.SVG.Style.LineCap.Square.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[com.caverock.androidsvg.PreserveAspectRatio.Alignment.values().length];
            getHighSpeedVideoFpsRanges = iArr3;
            try {
                iArr3[com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMidYMin.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMidYMid.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMidYMax.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMaxYMin.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMaxYMid.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMaxYMax.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMinYMid.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMinYMax.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVGAndroidRenderer.RendererState rendererState, boolean z, com.caverock.androidsvg.SVG.SvgPaint svgPaint) {
        int i;
        com.caverock.androidsvg.SVG.Style style = rendererState.getInputFormats;
        float floatValue = (z ? style.getOutputFormats : style.AMEXKernel).floatValue();
        if (svgPaint instanceof com.caverock.androidsvg.SVG.Colour) {
            i = ((com.caverock.androidsvg.SVG.Colour) svgPaint).getHighSpeedVideoFpsRangesFor;
        } else if (!(svgPaint instanceof com.caverock.androidsvg.SVG.CurrentColor)) {
            return;
        } else {
            i = rendererState.getInputFormats.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
        }
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i, floatValue);
        if (z) {
            rendererState.getHighSpeedVideoFpsRangesFor.setColor(highResolutionOutputSizeshNQ4ISI);
        } else {
            rendererState.getHighResolutionOutputSizeshNQ4ISI.setColor(highResolutionOutputSizeshNQ4ISI);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0059, code lost:
    
        if (r5.equals(androidx.media3.common.C.SANS_SERIF_NAME) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static android.graphics.Typeface getHighSpeedVideoSizes(java.lang.String str, java.lang.Integer num, com.caverock.androidsvg.SVG.Style.FontStyle fontStyle) {
        char c = 0;
        boolean z = fontStyle == com.caverock.androidsvg.SVG.Style.FontStyle.Italic;
        int i = num.intValue() > 500 ? z ? 3 : 1 : z ? 2 : 0;
        str.hashCode();
        switch (str.hashCode()) {
            case -1536685117:
                break;
            case -1431958525:
                if (str.equals(com.datadog.android.sessionreplay.recorder.mapper.TextViewMapper.MONOSPACE_FAMILY_NAME)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1081737434:
                if (str.equals("fantasy")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 109326717:
                if (str.equals("serif")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1126973893:
                if (str.equals("cursive")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, i);
        }
        if (c == 1) {
            return android.graphics.Typeface.create(android.graphics.Typeface.MONOSPACE, i);
        }
        if (c == 2) {
            return android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, i);
        }
        if (c == 3) {
            return android.graphics.Typeface.create(android.graphics.Typeface.SERIF, i);
        }
        if (c != 4) {
            return null;
        }
        return android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, i);
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(int i, float f) {
        int i2 = 255;
        int round = java.lang.Math.round(((i >> 24) & 255) * f);
        if (round < 0) {
            i2 = 0;
        } else if (round <= 255) {
            i2 = round;
        }
        return (i & 16777215) | (i2 << 24);
    }

    private android.graphics.Path.FillType getInputFormats() {
        if (this.getHighSpeedVideoSizes.getInputFormats.getOutputMinFrameDuration != null && this.getHighSpeedVideoSizes.getInputFormats.getOutputMinFrameDuration == com.caverock.androidsvg.SVG.Style.FillRule.EvenOdd) {
            return android.graphics.Path.FillType.EVEN_ODD;
        }
        return android.graphics.Path.FillType.WINDING;
    }

    private void getHighResolutionOutputSizeshNQ4ISI(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        if (this.getHighSpeedVideoSizes.getInputFormats.Camera2StreamConfigurationMap != null) {
            f += this.getHighSpeedVideoSizes.getInputFormats.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(this);
            f2 += this.getHighSpeedVideoSizes.getInputFormats.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(this);
            f5 -= this.getHighSpeedVideoSizes.getInputFormats.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this);
            f6 -= this.getHighSpeedVideoSizes.getInputFormats.Camera2StreamConfigurationMap.getHighSpeedVideoSizes.getHighSpeedVideoSizes(this);
        }
        this.getHighSpeedVideoFpsRanges.clipRect(f, f2, f5, f6);
    }

    private void getOutputSizes() {
        int i;
        if (this.getHighSpeedVideoSizes.getInputFormats.AMEXKernela instanceof com.caverock.androidsvg.SVG.Colour) {
            i = ((com.caverock.androidsvg.SVG.Colour) this.getHighSpeedVideoSizes.getInputFormats.AMEXKernela).getHighSpeedVideoFpsRangesFor;
        } else if (!(this.getHighSpeedVideoSizes.getInputFormats.AMEXKernela instanceof com.caverock.androidsvg.SVG.CurrentColor)) {
            return;
        } else {
            i = this.getHighSpeedVideoSizes.getInputFormats.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
        }
        if (this.getHighSpeedVideoSizes.getInputFormats.release != null) {
            i = getHighResolutionOutputSizeshNQ4ISI(i, this.getHighSpeedVideoSizes.getInputFormats.release.floatValue());
        }
        this.getHighSpeedVideoFpsRanges.drawColor(i);
    }

    class PathConverter implements com.caverock.androidsvg.SVG.PathInterface {
        float getHighResolutionOutputSizeshNQ4ISI;
        float getHighSpeedVideoFpsRangesFor;
        android.graphics.Path getHighSpeedVideoSizes = new android.graphics.Path();

        PathConverter(com.caverock.androidsvg.SVG.PathDefinition pathDefinition) {
            if (pathDefinition == null) {
                return;
            }
            pathDefinition.Camera2StreamConfigurationMap(this);
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void getHighSpeedVideoSizes(float f, float f2) {
            this.getHighSpeedVideoSizes.moveTo(f, f2);
            this.getHighSpeedVideoFpsRangesFor = f;
            this.getHighResolutionOutputSizeshNQ4ISI = f2;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void getHighSpeedVideoFpsRanges(float f, float f2) {
            this.getHighSpeedVideoSizes.lineTo(f, f2);
            this.getHighSpeedVideoFpsRangesFor = f;
            this.getHighResolutionOutputSizeshNQ4ISI = f2;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void getHighSpeedVideoFpsRanges(float f, float f2, float f3, float f4, float f5, float f6) {
            this.getHighSpeedVideoSizes.cubicTo(f, f2, f3, f4, f5, f6);
            this.getHighSpeedVideoFpsRangesFor = f5;
            this.getHighResolutionOutputSizeshNQ4ISI = f6;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void Camera2StreamConfigurationMap(float f, float f2, float f3, float f4) {
            this.getHighSpeedVideoSizes.quadTo(f, f2, f3, f4);
            this.getHighSpeedVideoFpsRangesFor = f3;
            this.getHighResolutionOutputSizeshNQ4ISI = f4;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void getHighSpeedVideoSizes(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            com.caverock.androidsvg.SVGAndroidRenderer.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, f, f2, f3, z, z2, f4, f5, this);
            this.getHighSpeedVideoFpsRangesFor = f4;
            this.getHighResolutionOutputSizeshNQ4ISI = f5;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void getHighResolutionOutputSizeshNQ4ISI() {
            this.getHighSpeedVideoSizes.close();
        }
    }

    class MarkerVector {
        float Camera2StreamConfigurationMap;
        float getHighSpeedVideoFpsRanges;
        float getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes = false;
        float getOutputMinFrameDuration;

        MarkerVector(float f, float f2, float f3, float f4) {
            this.Camera2StreamConfigurationMap = 0.0f;
            this.getHighSpeedVideoFpsRanges = 0.0f;
            this.getHighSpeedVideoFpsRangesFor = f;
            this.getOutputMinFrameDuration = f2;
            double sqrt = java.lang.Math.sqrt((f3 * f3) + (f4 * f4));
            if (sqrt != 0.0d) {
                this.Camera2StreamConfigurationMap = (float) (f3 / sqrt);
                this.getHighSpeedVideoFpsRanges = (float) (f4 / sqrt);
            }
        }

        final void Camera2StreamConfigurationMap(float f, float f2) {
            float f3 = f - this.getHighSpeedVideoFpsRangesFor;
            float f4 = f2 - this.getOutputMinFrameDuration;
            double sqrt = java.lang.Math.sqrt((f3 * f3) + (f4 * f4));
            if (sqrt != 0.0d) {
                f3 = (float) (f3 / sqrt);
                f4 = (float) (f4 / sqrt);
            }
            float f5 = this.Camera2StreamConfigurationMap;
            if (f3 == (-f5) && f4 == (-this.getHighSpeedVideoFpsRanges)) {
                this.getHighSpeedVideoSizes = true;
                this.Camera2StreamConfigurationMap = -f4;
                this.getHighSpeedVideoFpsRanges = f3;
            } else {
                this.Camera2StreamConfigurationMap = f5 + f3;
                this.getHighSpeedVideoFpsRanges += f4;
            }
        }

        final void getHighSpeedVideoSizes(com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector markerVector) {
            float f = markerVector.Camera2StreamConfigurationMap;
            float f2 = this.Camera2StreamConfigurationMap;
            if (f == (-f2)) {
                float f3 = markerVector.getHighSpeedVideoFpsRanges;
                if (f3 == (-this.getHighSpeedVideoFpsRanges)) {
                    this.getHighSpeedVideoSizes = true;
                    this.Camera2StreamConfigurationMap = -f3;
                    this.getHighSpeedVideoFpsRanges = markerVector.Camera2StreamConfigurationMap;
                    return;
                }
            }
            this.Camera2StreamConfigurationMap = f2 + f;
            this.getHighSpeedVideoFpsRanges += markerVector.getHighSpeedVideoFpsRanges;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(",");
            sb.append(this.getOutputMinFrameDuration);
            sb.append(" ");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(",");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(")");
            return sb.toString();
        }
    }

    class MarkerPositionCalculator implements com.caverock.androidsvg.SVG.PathInterface {
        private boolean Camera2StreamConfigurationMap;
        private float getInputFormats;
        private float getOutputMinFrameDuration;
        java.util.List<com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        private com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector getHighResolutionOutputSizeshNQ4ISI = null;
        private boolean getOutputFormats = false;
        private boolean getHighSpeedVideoSizes = true;
        private int getHighSpeedVideoSizesFor = -1;

        MarkerPositionCalculator(com.caverock.androidsvg.SVG.PathDefinition pathDefinition) {
            if (pathDefinition != null) {
                pathDefinition.Camera2StreamConfigurationMap(this);
                if (this.Camera2StreamConfigurationMap) {
                    this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor.get(this.getHighSpeedVideoSizesFor));
                    this.getHighSpeedVideoFpsRangesFor.set(this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI);
                    this.Camera2StreamConfigurationMap = false;
                }
                com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector markerVector = this.getHighResolutionOutputSizeshNQ4ISI;
                if (markerVector != null) {
                    this.getHighSpeedVideoFpsRangesFor.add(markerVector);
                }
            }
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void getHighSpeedVideoSizes(float f, float f2) {
            if (this.Camera2StreamConfigurationMap) {
                this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor.get(this.getHighSpeedVideoSizesFor));
                this.getHighSpeedVideoFpsRangesFor.set(this.getHighSpeedVideoSizesFor, this.getHighResolutionOutputSizeshNQ4ISI);
                this.Camera2StreamConfigurationMap = false;
            }
            com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector markerVector = this.getHighResolutionOutputSizeshNQ4ISI;
            if (markerVector != null) {
                this.getHighSpeedVideoFpsRangesFor.add(markerVector);
            }
            this.getOutputMinFrameDuration = f;
            this.getInputFormats = f2;
            this.getHighResolutionOutputSizeshNQ4ISI = com.caverock.androidsvg.SVGAndroidRenderer.this.new MarkerVector(f, f2, 0.0f, 0.0f);
            this.getHighSpeedVideoSizesFor = this.getHighSpeedVideoFpsRangesFor.size();
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void getHighSpeedVideoFpsRanges(float f, float f2) {
            this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(f, f2);
            this.getHighSpeedVideoFpsRangesFor.add(this.getHighResolutionOutputSizeshNQ4ISI);
            this.getHighResolutionOutputSizeshNQ4ISI = com.caverock.androidsvg.SVGAndroidRenderer.this.new MarkerVector(f, f2, f - this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor, f2 - this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration);
            this.Camera2StreamConfigurationMap = false;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void getHighSpeedVideoFpsRanges(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.getHighSpeedVideoSizes || this.getOutputFormats) {
                this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(f, f2);
                this.getHighSpeedVideoFpsRangesFor.add(this.getHighResolutionOutputSizeshNQ4ISI);
                this.getOutputFormats = false;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = com.caverock.androidsvg.SVGAndroidRenderer.this.new MarkerVector(f5, f6, f5 - f3, f6 - f4);
            this.Camera2StreamConfigurationMap = false;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void Camera2StreamConfigurationMap(float f, float f2, float f3, float f4) {
            this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(f, f2);
            this.getHighSpeedVideoFpsRangesFor.add(this.getHighResolutionOutputSizeshNQ4ISI);
            this.getHighResolutionOutputSizeshNQ4ISI = com.caverock.androidsvg.SVGAndroidRenderer.this.new MarkerVector(f3, f4, f3 - f, f4 - f2);
            this.Camera2StreamConfigurationMap = false;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void getHighSpeedVideoSizes(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.getOutputFormats = true;
            this.getHighSpeedVideoSizes = false;
            com.caverock.androidsvg.SVGAndroidRenderer.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration, f, f2, f3, z, z2, f4, f5, this);
            this.getHighSpeedVideoSizes = true;
            this.Camera2StreamConfigurationMap = false;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void getHighResolutionOutputSizeshNQ4ISI() {
            this.getHighSpeedVideoFpsRangesFor.add(this.getHighResolutionOutputSizeshNQ4ISI);
            getHighSpeedVideoFpsRanges(this.getOutputMinFrameDuration, this.getInputFormats);
            this.Camera2StreamConfigurationMap = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVG.GraphicsElement graphicsElement) {
        com.caverock.androidsvg.SVG.Marker marker;
        com.caverock.androidsvg.SVG.Marker marker2;
        com.caverock.androidsvg.SVG.Marker marker3;
        java.util.List<com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector> Camera2StreamConfigurationMap;
        int size;
        if (this.getHighSpeedVideoSizes.getInputFormats.unwrapAs == null && this.getHighSpeedVideoSizes.getInputFormats.isOutputSupportedFor == null && this.getHighSpeedVideoSizes.getInputFormats.getOutputStallDuration == null) {
            return;
        }
        if (this.getHighSpeedVideoSizes.getInputFormats.unwrapAs != null) {
            com.caverock.androidsvg.SVG.SvgObject highSpeedVideoFpsRanges = graphicsElement.ArtificialStackFrames.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes.getInputFormats.unwrapAs);
            if (highSpeedVideoFpsRanges != null) {
                marker = (com.caverock.androidsvg.SVG.Marker) highSpeedVideoFpsRanges;
                if (this.getHighSpeedVideoSizes.getInputFormats.isOutputSupportedFor != null) {
                    com.caverock.androidsvg.SVG.SvgObject highSpeedVideoFpsRanges2 = graphicsElement.ArtificialStackFrames.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes.getInputFormats.isOutputSupportedFor);
                    if (highSpeedVideoFpsRanges2 != null) {
                        marker2 = (com.caverock.androidsvg.SVG.Marker) highSpeedVideoFpsRanges2;
                        if (this.getHighSpeedVideoSizes.getInputFormats.getOutputStallDuration != null) {
                            com.caverock.androidsvg.SVG.SvgObject highSpeedVideoFpsRanges3 = graphicsElement.ArtificialStackFrames.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes.getInputFormats.getOutputStallDuration);
                            if (highSpeedVideoFpsRanges3 != null) {
                                marker3 = (com.caverock.androidsvg.SVG.Marker) highSpeedVideoFpsRanges3;
                                if (graphicsElement instanceof com.caverock.androidsvg.SVG.Path) {
                                    if (graphicsElement instanceof com.caverock.androidsvg.SVG.Line) {
                                        Camera2StreamConfigurationMap = getHighSpeedVideoSizes((com.caverock.androidsvg.SVG.Line) graphicsElement);
                                    } else {
                                        Camera2StreamConfigurationMap = Camera2StreamConfigurationMap((com.caverock.androidsvg.SVG.PolyLine) graphicsElement);
                                    }
                                } else {
                                    Camera2StreamConfigurationMap = new com.caverock.androidsvg.SVGAndroidRenderer.MarkerPositionCalculator(((com.caverock.androidsvg.SVG.Path) graphicsElement).getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoFpsRangesFor;
                                }
                                if (Camera2StreamConfigurationMap != null || (size = Camera2StreamConfigurationMap.size()) == 0) {
                                    return;
                                }
                                com.caverock.androidsvg.SVG.Style style = this.getHighSpeedVideoSizes.getInputFormats;
                                com.caverock.androidsvg.SVG.Style style2 = this.getHighSpeedVideoSizes.getInputFormats;
                                this.getHighSpeedVideoSizes.getInputFormats.getOutputStallDuration = null;
                                style2.isOutputSupportedFor = null;
                                style.unwrapAs = null;
                                if (marker != null) {
                                    getHighSpeedVideoFpsRangesFor(marker, Camera2StreamConfigurationMap.get(0));
                                }
                                if (marker2 != null && Camera2StreamConfigurationMap.size() > 2) {
                                    com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector markerVector = Camera2StreamConfigurationMap.get(0);
                                    com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector markerVector2 = Camera2StreamConfigurationMap.get(1);
                                    int i = 1;
                                    while (i < size - 1) {
                                        i++;
                                        com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector markerVector3 = Camera2StreamConfigurationMap.get(i);
                                        markerVector = markerVector2.getHighSpeedVideoSizes ? getHighResolutionOutputSizeshNQ4ISI(markerVector, markerVector2, markerVector3) : markerVector2;
                                        getHighSpeedVideoFpsRangesFor(marker2, markerVector);
                                        markerVector2 = markerVector3;
                                    }
                                }
                                if (marker3 != null) {
                                    getHighSpeedVideoFpsRangesFor(marker3, Camera2StreamConfigurationMap.get(size - 1));
                                    return;
                                }
                                return;
                            }
                            new java.lang.Object[]{this.getHighSpeedVideoSizes.getInputFormats.getOutputStallDuration};
                        }
                        marker3 = null;
                        if (graphicsElement instanceof com.caverock.androidsvg.SVG.Path) {
                        }
                        if (Camera2StreamConfigurationMap != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                    new java.lang.Object[]{this.getHighSpeedVideoSizes.getInputFormats.isOutputSupportedFor};
                }
                marker2 = null;
                if (this.getHighSpeedVideoSizes.getInputFormats.getOutputStallDuration != null) {
                }
                marker3 = null;
                if (graphicsElement instanceof com.caverock.androidsvg.SVG.Path) {
                }
                if (Camera2StreamConfigurationMap != null) {
                }
            } else {
                new java.lang.Object[]{this.getHighSpeedVideoSizes.getInputFormats.unwrapAs};
            }
        }
        marker = null;
        if (this.getHighSpeedVideoSizes.getInputFormats.isOutputSupportedFor != null) {
        }
        marker2 = null;
        if (this.getHighSpeedVideoSizes.getInputFormats.getOutputStallDuration != null) {
        }
        marker3 = null;
        if (graphicsElement instanceof com.caverock.androidsvg.SVG.Path) {
        }
        if (Camera2StreamConfigurationMap != null) {
        }
    }

    private static com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector markerVector, com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector markerVector2, com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector markerVector3) {
        float f = markerVector2.Camera2StreamConfigurationMap;
        float f2 = markerVector2.getHighSpeedVideoFpsRanges;
        float f3 = (f * (markerVector2.getHighSpeedVideoFpsRangesFor - markerVector.getHighSpeedVideoFpsRangesFor)) + (f2 * (markerVector2.getOutputMinFrameDuration - markerVector.getOutputMinFrameDuration));
        if (f3 == 0.0f) {
            float f4 = markerVector2.Camera2StreamConfigurationMap;
            float f5 = markerVector2.getHighSpeedVideoFpsRanges;
            f3 = (f4 * (markerVector3.getHighSpeedVideoFpsRangesFor - markerVector2.getHighSpeedVideoFpsRangesFor)) + (f5 * (markerVector3.getOutputMinFrameDuration - markerVector2.getOutputMinFrameDuration));
        }
        if (f3 <= 0.0f && (f3 != 0.0f || (markerVector2.Camera2StreamConfigurationMap <= 0.0f && markerVector2.getHighSpeedVideoFpsRanges < 0.0f))) {
            markerVector2.Camera2StreamConfigurationMap = -markerVector2.Camera2StreamConfigurationMap;
            markerVector2.getHighSpeedVideoFpsRanges = -markerVector2.getHighSpeedVideoFpsRanges;
        }
        return markerVector2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0120, code lost:
    
        if (r7 != 8) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoFpsRangesFor(com.caverock.androidsvg.SVG.Marker marker, com.caverock.androidsvg.SVGAndroidRenderer.MarkerVector markerVector) {
        float f;
        boolean outputFormats;
        float f2;
        float f3;
        float f4;
        getOutputSizeshNQ4ISI();
        float f5 = 0.0f;
        if (marker.getHighSpeedVideoSizes != null) {
            if (!java.lang.Float.isNaN(marker.getHighSpeedVideoSizes.floatValue())) {
                f = marker.getHighSpeedVideoSizes.floatValue();
            } else if (markerVector.Camera2StreamConfigurationMap != 0.0f || markerVector.getHighSpeedVideoFpsRanges != 0.0f) {
                f = (float) java.lang.Math.toDegrees(java.lang.Math.atan2(markerVector.getHighSpeedVideoFpsRanges, markerVector.Camera2StreamConfigurationMap));
            }
            float Camera2StreamConfigurationMap = !marker.getHighSpeedVideoFpsRanges ? 1.0f : this.getHighSpeedVideoSizes.getInputFormats.kernelVersion.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap);
            com.caverock.androidsvg.SVGAndroidRenderer.RendererState rendererState = new com.caverock.androidsvg.SVGAndroidRenderer.RendererState();
            getHighSpeedVideoFpsRanges(rendererState, com.caverock.androidsvg.SVG.Style.getHighSpeedVideoSizes());
            this.getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(marker, rendererState);
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.preTranslate(markerVector.getHighSpeedVideoFpsRangesFor, markerVector.getOutputMinFrameDuration);
            matrix.preRotate(f);
            matrix.preScale(Camera2StreamConfigurationMap, Camera2StreamConfigurationMap);
            float highSpeedVideoFpsRangesFor = marker.getHighResolutionOutputSizeshNQ4ISI == null ? marker.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(this) : 0.0f;
            float highSpeedVideoSizes = marker.getOutputFormats == null ? marker.getOutputFormats.getHighSpeedVideoSizes(this) : 0.0f;
            float highSpeedVideoFpsRangesFor2 = marker.getHighSpeedVideoFpsRangesFor == null ? marker.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(this) : 3.0f;
            float highSpeedVideoSizes2 = marker.Camera2StreamConfigurationMap != null ? marker.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(this) : 3.0f;
            if (marker.getOutputMinFrameDuration == null) {
                float f6 = highSpeedVideoFpsRangesFor2 / marker.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI;
                float f7 = highSpeedVideoSizes2 / marker.getOutputMinFrameDuration.getHighSpeedVideoSizes;
                com.caverock.androidsvg.PreserveAspectRatio preserveAspectRatio = marker.coroutineBoundary != null ? marker.coroutineBoundary : com.caverock.androidsvg.PreserveAspectRatio.LETTERBOX;
                if (!preserveAspectRatio.equals(com.caverock.androidsvg.PreserveAspectRatio.STRETCH)) {
                    f6 = preserveAspectRatio.getScale() == com.caverock.androidsvg.PreserveAspectRatio.Scale.slice ? java.lang.Math.max(f6, f7) : java.lang.Math.min(f6, f7);
                    f7 = f6;
                }
                matrix.preTranslate((-highSpeedVideoFpsRangesFor) * f6, (-highSpeedVideoSizes) * f7);
                this.getHighSpeedVideoFpsRanges.concat(matrix);
                float f8 = marker.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI * f6;
                float f9 = marker.getOutputMinFrameDuration.getHighSpeedVideoSizes * f7;
                switch (com.caverock.androidsvg.SVGAndroidRenderer.AnonymousClass1.getHighSpeedVideoFpsRanges[preserveAspectRatio.getAlignment().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        f2 = (highSpeedVideoFpsRangesFor2 - f8) / 2.0f;
                        f3 = 0.0f - f2;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        f2 = highSpeedVideoFpsRangesFor2 - f8;
                        f3 = 0.0f - f2;
                        break;
                    default:
                        f3 = 0.0f;
                        break;
                }
                int i = com.caverock.androidsvg.SVGAndroidRenderer.AnonymousClass1.getHighSpeedVideoFpsRanges[preserveAspectRatio.getAlignment().ordinal()];
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            if (i != 6) {
                                if (i != 7) {
                                }
                            }
                        }
                    }
                    f4 = highSpeedVideoSizes2 - f9;
                    f5 = 0.0f - f4;
                    if (!this.getHighSpeedVideoSizes.getInputFormats.getValidOutputFormatsForInputhNQ4ISI.booleanValue()) {
                        getHighResolutionOutputSizeshNQ4ISI(f3, f5, highSpeedVideoFpsRangesFor2, highSpeedVideoSizes2);
                    }
                    matrix.reset();
                    matrix.preScale(f6, f7);
                    this.getHighSpeedVideoFpsRanges.concat(matrix);
                }
                f4 = (highSpeedVideoSizes2 - f9) / 2.0f;
                f5 = 0.0f - f4;
                if (!this.getHighSpeedVideoSizes.getInputFormats.getValidOutputFormatsForInputhNQ4ISI.booleanValue()) {
                }
                matrix.reset();
                matrix.preScale(f6, f7);
                this.getHighSpeedVideoFpsRanges.concat(matrix);
            } else {
                matrix.preTranslate(-highSpeedVideoFpsRangesFor, -highSpeedVideoSizes);
                this.getHighSpeedVideoFpsRanges.concat(matrix);
                if (!this.getHighSpeedVideoSizes.getInputFormats.getValidOutputFormatsForInputhNQ4ISI.booleanValue()) {
                    getHighResolutionOutputSizeshNQ4ISI(0.0f, 0.0f, highSpeedVideoFpsRangesFor2, highSpeedVideoSizes2);
                }
            }
            outputFormats = getOutputFormats();
            getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgContainer) marker, false);
            if (outputFormats) {
                Camera2StreamConfigurationMap(marker, marker.isOutputSupportedFor);
            }
            this.getHighSpeedVideoFpsRanges.restore();
            this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
        }
        f = 0.0f;
        if (!marker.getHighSpeedVideoFpsRanges) {
        }
        com.caverock.androidsvg.SVGAndroidRenderer.RendererState rendererState2 = new com.caverock.androidsvg.SVGAndroidRenderer.RendererState();
        getHighSpeedVideoFpsRanges(rendererState2, com.caverock.androidsvg.SVG.Style.getHighSpeedVideoSizes());
        this.getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(marker, rendererState2);
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.preTranslate(markerVector.getHighSpeedVideoFpsRangesFor, markerVector.getOutputMinFrameDuration);
        matrix2.preRotate(f);
        matrix2.preScale(Camera2StreamConfigurationMap, Camera2StreamConfigurationMap);
        if (marker.getHighResolutionOutputSizeshNQ4ISI == null) {
        }
        if (marker.getOutputFormats == null) {
        }
        if (marker.getHighSpeedVideoFpsRangesFor == null) {
        }
        if (marker.Camera2StreamConfigurationMap != null) {
        }
        if (marker.getOutputMinFrameDuration == null) {
        }
        outputFormats = getOutputFormats();
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgContainer) marker, false);
        if (outputFormats) {
        }
        this.getHighSpeedVideoFpsRanges.restore();
        this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
    }

    private com.caverock.androidsvg.SVGAndroidRenderer.RendererState getHighSpeedVideoFpsRanges(com.caverock.androidsvg.SVG.SvgObject svgObject, com.caverock.androidsvg.SVGAndroidRenderer.RendererState rendererState) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            if (svgObject instanceof com.caverock.androidsvg.SVG.SvgElementBase) {
                arrayList.add(0, (com.caverock.androidsvg.SVG.SvgElementBase) svgObject);
            }
            if (svgObject.CoroutineDebuggingKt == null) {
                break;
            }
            svgObject = (com.caverock.androidsvg.SVG.SvgObject) svgObject.CoroutineDebuggingKt;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            getHighSpeedVideoFpsRangesFor(rendererState, (com.caverock.androidsvg.SVG.SvgElementBase) it.next());
        }
        rendererState.getInputSizeshNQ4ISI = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
        rendererState.getOutputMinFrameDuration = this.getHighSpeedVideoSizes.getOutputMinFrameDuration;
        return rendererState;
    }

    private void getHighSpeedVideoFpsRangesFor(com.caverock.androidsvg.SVG.SvgElement svgElement) {
        if (this.getHighSpeedVideoSizes.getInputFormats.getInputFormats instanceof com.caverock.androidsvg.SVG.PaintReference) {
            getHighSpeedVideoFpsRanges(true, svgElement.isOutputSupportedFor, (com.caverock.androidsvg.SVG.PaintReference) this.getHighSpeedVideoSizes.getInputFormats.getInputFormats);
        }
        if (this.getHighSpeedVideoSizes.getInputFormats.b instanceof com.caverock.androidsvg.SVG.PaintReference) {
            getHighSpeedVideoFpsRanges(false, svgElement.isOutputSupportedFor, (com.caverock.androidsvg.SVG.PaintReference) this.getHighSpeedVideoSizes.getInputFormats.b);
        }
    }

    private void getHighSpeedVideoFpsRanges(boolean z, com.caverock.androidsvg.SVG.Box box, com.caverock.androidsvg.SVG.PaintReference paintReference) {
        com.caverock.androidsvg.SVG.SvgObject highSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(paintReference.getHighSpeedVideoFpsRangesFor);
        if (highSpeedVideoFpsRanges == null) {
            new java.lang.Object[]{z ? "Fill" : "Stroke", paintReference.getHighSpeedVideoFpsRangesFor};
            if (paintReference.getHighSpeedVideoFpsRanges != null) {
                getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, z, paintReference.getHighSpeedVideoFpsRanges);
                return;
            } else if (z) {
                this.getHighSpeedVideoSizes.getHighSpeedVideoSizes = false;
                return;
            } else {
                this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges = false;
                return;
            }
        }
        if (highSpeedVideoFpsRanges instanceof com.caverock.androidsvg.SVG.SvgLinearGradient) {
            getHighSpeedVideoFpsRanges(z, box, (com.caverock.androidsvg.SVG.SvgLinearGradient) highSpeedVideoFpsRanges);
        } else if (highSpeedVideoFpsRanges instanceof com.caverock.androidsvg.SVG.SvgRadialGradient) {
            Camera2StreamConfigurationMap(z, box, (com.caverock.androidsvg.SVG.SvgRadialGradient) highSpeedVideoFpsRanges);
        } else if (highSpeedVideoFpsRanges instanceof com.caverock.androidsvg.SVG.SolidColor) {
            Camera2StreamConfigurationMap(z, (com.caverock.androidsvg.SVG.SolidColor) highSpeedVideoFpsRanges);
        }
    }

    private void getHighSpeedVideoFpsRanges(boolean z, com.caverock.androidsvg.SVG.Box box, com.caverock.androidsvg.SVG.SvgLinearGradient svgLinearGradient) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        com.caverock.androidsvg.SVG.Box box2;
        if (svgLinearGradient.getHighResolutionOutputSizeshNQ4ISI != null) {
            getHighSpeedVideoFpsRanges(svgLinearGradient, svgLinearGradient.getHighResolutionOutputSizeshNQ4ISI);
        }
        int i = 0;
        boolean z2 = svgLinearGradient.Camera2StreamConfigurationMap != null && svgLinearGradient.Camera2StreamConfigurationMap.booleanValue();
        com.caverock.androidsvg.SVGAndroidRenderer.RendererState rendererState = this.getHighSpeedVideoSizes;
        android.graphics.Paint paint = z ? rendererState.getHighSpeedVideoFpsRangesFor : rendererState.getHighResolutionOutputSizeshNQ4ISI;
        if (!z2) {
            if (svgLinearGradient.getInputFormats != null) {
                com.caverock.androidsvg.SVG.Length length = svgLinearGradient.getInputFormats;
                if (length.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent) {
                    f = (length.getHighSpeedVideoFpsRanges * 1.0f) / 100.0f;
                } else {
                    f = length.getHighSpeedVideoFpsRangesFor(this);
                }
            } else {
                f = 0.0f;
            }
            if (svgLinearGradient.getInputSizeshNQ4ISI != null) {
                com.caverock.androidsvg.SVG.Length length2 = svgLinearGradient.getInputSizeshNQ4ISI;
                if (length2.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent) {
                    f2 = (length2.getHighSpeedVideoFpsRanges * 1.0f) / 100.0f;
                } else {
                    f2 = length2.getHighSpeedVideoFpsRangesFor(this);
                }
            } else {
                f2 = 0.0f;
            }
            if (svgLinearGradient.getOutputMinFrameDuration != null) {
                com.caverock.androidsvg.SVG.Length length3 = svgLinearGradient.getOutputMinFrameDuration;
                if (length3.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent) {
                    f3 = (length3.getHighSpeedVideoFpsRanges * 1.0f) / 100.0f;
                } else {
                    f3 = length3.getHighSpeedVideoFpsRangesFor(this);
                }
            } else {
                f3 = 1.0f;
            }
            if (svgLinearGradient.getHighSpeedVideoSizesFor != null) {
                com.caverock.androidsvg.SVG.Length length4 = svgLinearGradient.getHighSpeedVideoSizesFor;
                if (length4.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent) {
                    f4 = (length4.getHighSpeedVideoFpsRanges * 1.0f) / 100.0f;
                } else {
                    f4 = length4.getHighSpeedVideoFpsRangesFor(this);
                }
            } else {
                f4 = 0.0f;
            }
            f5 = f;
            f6 = f2;
            f7 = f3;
            f8 = f4;
        } else {
            if (this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI != null) {
                box2 = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
            } else {
                box2 = this.getHighSpeedVideoSizes.getOutputMinFrameDuration;
            }
            float highSpeedVideoFpsRangesFor = svgLinearGradient.getInputFormats != null ? svgLinearGradient.getInputFormats.getHighSpeedVideoFpsRangesFor(this) : 0.0f;
            float highSpeedVideoSizes = svgLinearGradient.getInputSizeshNQ4ISI != null ? svgLinearGradient.getInputSizeshNQ4ISI.getHighSpeedVideoSizes(this) : 0.0f;
            f7 = svgLinearGradient.getOutputMinFrameDuration != null ? svgLinearGradient.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor(this) : box2.getHighResolutionOutputSizeshNQ4ISI;
            f5 = highSpeedVideoFpsRangesFor;
            f6 = highSpeedVideoSizes;
            f8 = svgLinearGradient.getHighSpeedVideoSizesFor != null ? svgLinearGradient.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes(this) : 0.0f;
        }
        getOutputSizeshNQ4ISI();
        com.caverock.androidsvg.SVGAndroidRenderer.RendererState rendererState2 = new com.caverock.androidsvg.SVGAndroidRenderer.RendererState();
        getHighSpeedVideoFpsRanges(rendererState2, com.caverock.androidsvg.SVG.Style.getHighSpeedVideoSizes());
        this.getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(svgLinearGradient, rendererState2);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (!z2) {
            matrix.preTranslate(box.Camera2StreamConfigurationMap, box.getHighSpeedVideoFpsRanges);
            matrix.preScale(box.getHighResolutionOutputSizeshNQ4ISI, box.getHighSpeedVideoSizes);
        }
        if (svgLinearGradient.getHighSpeedVideoFpsRanges != null) {
            matrix.preConcat(svgLinearGradient.getHighSpeedVideoFpsRanges);
        }
        int size = svgLinearGradient.getHighSpeedVideoSizes.size();
        if (size != 0) {
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            java.util.Iterator<com.caverock.androidsvg.SVG.SvgObject> it = svgLinearGradient.getHighSpeedVideoSizes.iterator();
            float f9 = -1.0f;
            int i2 = 0;
            while (it.hasNext()) {
                com.caverock.androidsvg.SVG.Stop stop = (com.caverock.androidsvg.SVG.Stop) it.next();
                float floatValue = stop.getHighSpeedVideoFpsRanges != null ? stop.getHighSpeedVideoFpsRanges.floatValue() : 0.0f;
                if (i2 == 0 || floatValue >= f9) {
                    fArr[i2] = floatValue;
                    f9 = floatValue;
                } else {
                    fArr[i2] = f9;
                }
                getOutputSizeshNQ4ISI();
                getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, stop);
                com.caverock.androidsvg.SVG.Colour colour = (com.caverock.androidsvg.SVG.Colour) this.getHighSpeedVideoSizes.getInputFormats.coroutineCreation;
                if (colour == null) {
                    colour = com.caverock.androidsvg.SVG.Colour.getHighSpeedVideoSizes;
                }
                iArr[i2] = getHighResolutionOutputSizeshNQ4ISI(colour.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes.getInputFormats.coroutineBoundary.floatValue());
                i2++;
                this.getHighSpeedVideoFpsRanges.restore();
                this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
            }
            if ((f5 != f7 || f6 != f8) && size != 1) {
                android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
                if (svgLinearGradient.getHighSpeedVideoFpsRangesFor != null) {
                    if (svgLinearGradient.getHighSpeedVideoFpsRangesFor == com.caverock.androidsvg.SVG.GradientSpread.reflect) {
                        tileMode = android.graphics.Shader.TileMode.MIRROR;
                    } else if (svgLinearGradient.getHighSpeedVideoFpsRangesFor == com.caverock.androidsvg.SVG.GradientSpread.repeat) {
                        tileMode = android.graphics.Shader.TileMode.REPEAT;
                    }
                }
                this.getHighSpeedVideoFpsRanges.restore();
                this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
                android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(f5, f6, f7, f8, iArr, fArr, tileMode);
                linearGradient.setLocalMatrix(matrix);
                paint.setShader(linearGradient);
                int floatValue2 = (int) (this.getHighSpeedVideoSizes.getInputFormats.getOutputFormats.floatValue() * 256.0f);
                if (floatValue2 >= 0) {
                    i = 255;
                    if (floatValue2 <= 255) {
                        i = floatValue2;
                    }
                }
                paint.setAlpha(i);
                return;
            }
            this.getHighSpeedVideoFpsRanges.restore();
            this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
            paint.setColor(iArr[size - 1]);
            return;
        }
        this.getHighSpeedVideoFpsRanges.restore();
        com.caverock.androidsvg.SVGAndroidRenderer.RendererState pop = this.getOutputFormats.pop();
        this.getHighSpeedVideoSizes = pop;
        if (z) {
            pop.getHighSpeedVideoSizes = false;
        } else {
            pop.getHighSpeedVideoFpsRanges = false;
        }
    }

    private void Camera2StreamConfigurationMap(boolean z, com.caverock.androidsvg.SVG.Box box, com.caverock.androidsvg.SVG.SvgRadialGradient svgRadialGradient) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i;
        if (svgRadialGradient.getHighResolutionOutputSizeshNQ4ISI != null) {
            getHighSpeedVideoFpsRanges(svgRadialGradient, svgRadialGradient.getHighResolutionOutputSizeshNQ4ISI);
        }
        boolean z2 = svgRadialGradient.Camera2StreamConfigurationMap != null && svgRadialGradient.Camera2StreamConfigurationMap.booleanValue();
        com.caverock.androidsvg.SVGAndroidRenderer.RendererState rendererState = this.getHighSpeedVideoSizes;
        android.graphics.Paint paint = z ? rendererState.getHighSpeedVideoFpsRangesFor : rendererState.getHighResolutionOutputSizeshNQ4ISI;
        if (z2) {
            com.caverock.androidsvg.SVG.Length length = new com.caverock.androidsvg.SVG.Length(50.0f, com.caverock.androidsvg.SVG.Unit.percent);
            float highSpeedVideoFpsRangesFor = svgRadialGradient.getOutputFormats != null ? svgRadialGradient.getOutputFormats.getHighSpeedVideoFpsRangesFor(this) : length.getHighSpeedVideoFpsRangesFor(this);
            float highSpeedVideoSizes = svgRadialGradient.getInputFormats != null ? svgRadialGradient.getInputFormats.getHighSpeedVideoSizes(this) : length.getHighSpeedVideoSizes(this);
            if (svgRadialGradient.getInputSizeshNQ4ISI != null) {
                length = svgRadialGradient.getInputSizeshNQ4ISI;
            }
            f4 = length.Camera2StreamConfigurationMap(this);
            f3 = highSpeedVideoFpsRangesFor;
            f5 = highSpeedVideoSizes;
        } else {
            float f6 = 0.5f;
            if (svgRadialGradient.getOutputFormats != null) {
                com.caverock.androidsvg.SVG.Length length2 = svgRadialGradient.getOutputFormats;
                if (length2.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent) {
                    f = (length2.getHighSpeedVideoFpsRanges * 1.0f) / 100.0f;
                } else {
                    f = length2.getHighSpeedVideoFpsRangesFor(this);
                }
            } else {
                f = 0.5f;
            }
            if (svgRadialGradient.getInputFormats != null) {
                com.caverock.androidsvg.SVG.Length length3 = svgRadialGradient.getInputFormats;
                if (length3.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent) {
                    f2 = (length3.getHighSpeedVideoFpsRanges * 1.0f) / 100.0f;
                } else {
                    f2 = length3.getHighSpeedVideoFpsRangesFor(this);
                }
            } else {
                f2 = 0.5f;
            }
            if (svgRadialGradient.getInputSizeshNQ4ISI != null) {
                com.caverock.androidsvg.SVG.Length length4 = svgRadialGradient.getInputSizeshNQ4ISI;
                if (length4.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent) {
                    f6 = (length4.getHighSpeedVideoFpsRanges * 1.0f) / 100.0f;
                } else {
                    f6 = length4.getHighSpeedVideoFpsRangesFor(this);
                }
            }
            f3 = f;
            f4 = f6;
            f5 = f2;
        }
        getOutputSizeshNQ4ISI();
        com.caverock.androidsvg.SVGAndroidRenderer.RendererState rendererState2 = new com.caverock.androidsvg.SVGAndroidRenderer.RendererState();
        getHighSpeedVideoFpsRanges(rendererState2, com.caverock.androidsvg.SVG.Style.getHighSpeedVideoSizes());
        this.getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(svgRadialGradient, rendererState2);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (!z2) {
            matrix.preTranslate(box.Camera2StreamConfigurationMap, box.getHighSpeedVideoFpsRanges);
            matrix.preScale(box.getHighResolutionOutputSizeshNQ4ISI, box.getHighSpeedVideoSizes);
        }
        if (svgRadialGradient.getHighSpeedVideoFpsRanges != null) {
            matrix.preConcat(svgRadialGradient.getHighSpeedVideoFpsRanges);
        }
        int size = svgRadialGradient.getHighSpeedVideoSizes.size();
        if (size != 0) {
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            java.util.Iterator<com.caverock.androidsvg.SVG.SvgObject> it = svgRadialGradient.getHighSpeedVideoSizes.iterator();
            float f7 = -1.0f;
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.caverock.androidsvg.SVG.Stop stop = (com.caverock.androidsvg.SVG.Stop) it.next();
                float floatValue = stop.getHighSpeedVideoFpsRanges != null ? stop.getHighSpeedVideoFpsRanges.floatValue() : 0.0f;
                if (i2 == 0 || floatValue >= f7) {
                    fArr[i2] = floatValue;
                    f7 = floatValue;
                } else {
                    fArr[i2] = f7;
                }
                getOutputSizeshNQ4ISI();
                getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, stop);
                com.caverock.androidsvg.SVG.Colour colour = (com.caverock.androidsvg.SVG.Colour) this.getHighSpeedVideoSizes.getInputFormats.coroutineCreation;
                if (colour == null) {
                    colour = com.caverock.androidsvg.SVG.Colour.getHighSpeedVideoSizes;
                }
                iArr[i2] = getHighResolutionOutputSizeshNQ4ISI(colour.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes.getInputFormats.coroutineBoundary.floatValue());
                i2++;
                this.getHighSpeedVideoFpsRanges.restore();
                this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
            }
            if (f4 != 0.0f && size != 1) {
                android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
                if (svgRadialGradient.getHighSpeedVideoFpsRangesFor != null) {
                    if (svgRadialGradient.getHighSpeedVideoFpsRangesFor == com.caverock.androidsvg.SVG.GradientSpread.reflect) {
                        tileMode = android.graphics.Shader.TileMode.MIRROR;
                    } else if (svgRadialGradient.getHighSpeedVideoFpsRangesFor == com.caverock.androidsvg.SVG.GradientSpread.repeat) {
                        tileMode = android.graphics.Shader.TileMode.REPEAT;
                    }
                }
                this.getHighSpeedVideoFpsRanges.restore();
                this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
                android.graphics.RadialGradient radialGradient = new android.graphics.RadialGradient(f3, f5, f4, iArr, fArr, tileMode);
                radialGradient.setLocalMatrix(matrix);
                paint.setShader(radialGradient);
                int floatValue2 = (int) (this.getHighSpeedVideoSizes.getInputFormats.getOutputFormats.floatValue() * 256.0f);
                if (floatValue2 < 0) {
                    i = 0;
                } else {
                    i = 255;
                    if (floatValue2 <= 255) {
                        i = floatValue2;
                    }
                }
                paint.setAlpha(i);
                return;
            }
            this.getHighSpeedVideoFpsRanges.restore();
            this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
            paint.setColor(iArr[size - 1]);
            return;
        }
        this.getHighSpeedVideoFpsRanges.restore();
        com.caverock.androidsvg.SVGAndroidRenderer.RendererState pop = this.getOutputFormats.pop();
        this.getHighSpeedVideoSizes = pop;
        if (z) {
            pop.getHighSpeedVideoSizes = false;
        } else {
            pop.getHighSpeedVideoFpsRanges = false;
        }
    }

    private void getHighSpeedVideoFpsRanges(com.caverock.androidsvg.SVG.GradientElement gradientElement, java.lang.String str) {
        while (true) {
            com.caverock.androidsvg.SVG.SvgObject highSpeedVideoFpsRanges = gradientElement.ArtificialStackFrames.getHighSpeedVideoFpsRanges(str);
            if (highSpeedVideoFpsRanges == null) {
                new java.lang.Object[]{str};
                return;
            }
            if (!(highSpeedVideoFpsRanges instanceof com.caverock.androidsvg.SVG.GradientElement)) {
                return;
            }
            if (highSpeedVideoFpsRanges == gradientElement) {
                new java.lang.Object[]{str};
                return;
            }
            com.caverock.androidsvg.SVG.GradientElement gradientElement2 = (com.caverock.androidsvg.SVG.GradientElement) highSpeedVideoFpsRanges;
            if (gradientElement.Camera2StreamConfigurationMap == null) {
                gradientElement.Camera2StreamConfigurationMap = gradientElement2.Camera2StreamConfigurationMap;
            }
            if (gradientElement.getHighSpeedVideoFpsRanges == null) {
                gradientElement.getHighSpeedVideoFpsRanges = gradientElement2.getHighSpeedVideoFpsRanges;
            }
            if (gradientElement.getHighSpeedVideoFpsRangesFor == null) {
                gradientElement.getHighSpeedVideoFpsRangesFor = gradientElement2.getHighSpeedVideoFpsRangesFor;
            }
            if (gradientElement.getHighSpeedVideoSizes.isEmpty()) {
                gradientElement.getHighSpeedVideoSizes = gradientElement2.getHighSpeedVideoSizes;
            }
            if (gradientElement instanceof com.caverock.androidsvg.SVG.SvgLinearGradient) {
                try {
                    com.caverock.androidsvg.SVG.SvgLinearGradient svgLinearGradient = (com.caverock.androidsvg.SVG.SvgLinearGradient) gradientElement;
                    com.caverock.androidsvg.SVG.SvgLinearGradient svgLinearGradient2 = (com.caverock.androidsvg.SVG.SvgLinearGradient) highSpeedVideoFpsRanges;
                    if (svgLinearGradient.getInputFormats == null) {
                        svgLinearGradient.getInputFormats = svgLinearGradient2.getInputFormats;
                    }
                    if (svgLinearGradient.getInputSizeshNQ4ISI == null) {
                        svgLinearGradient.getInputSizeshNQ4ISI = svgLinearGradient2.getInputSizeshNQ4ISI;
                    }
                    if (svgLinearGradient.getOutputMinFrameDuration == null) {
                        svgLinearGradient.getOutputMinFrameDuration = svgLinearGradient2.getOutputMinFrameDuration;
                    }
                    if (svgLinearGradient.getHighSpeedVideoSizesFor == null) {
                        svgLinearGradient.getHighSpeedVideoSizesFor = svgLinearGradient2.getHighSpeedVideoSizesFor;
                    }
                } catch (java.lang.ClassCastException unused) {
                }
            } else {
                com.caverock.androidsvg.SVG.SvgRadialGradient svgRadialGradient = (com.caverock.androidsvg.SVG.SvgRadialGradient) gradientElement;
                com.caverock.androidsvg.SVG.SvgRadialGradient svgRadialGradient2 = (com.caverock.androidsvg.SVG.SvgRadialGradient) highSpeedVideoFpsRanges;
                if (svgRadialGradient.getOutputFormats == null) {
                    svgRadialGradient.getOutputFormats = svgRadialGradient2.getOutputFormats;
                }
                if (svgRadialGradient.getInputFormats == null) {
                    svgRadialGradient.getInputFormats = svgRadialGradient2.getInputFormats;
                }
                if (svgRadialGradient.getInputSizeshNQ4ISI == null) {
                    svgRadialGradient.getInputSizeshNQ4ISI = svgRadialGradient2.getInputSizeshNQ4ISI;
                }
                if (svgRadialGradient.getOutputMinFrameDuration == null) {
                    svgRadialGradient.getOutputMinFrameDuration = svgRadialGradient2.getOutputMinFrameDuration;
                }
                if (svgRadialGradient.getHighSpeedVideoSizesFor == null) {
                    svgRadialGradient.getHighSpeedVideoSizesFor = svgRadialGradient2.getHighSpeedVideoSizesFor;
                }
            }
            if (gradientElement2.getHighResolutionOutputSizeshNQ4ISI == null) {
                return;
            } else {
                str = gradientElement2.getHighResolutionOutputSizeshNQ4ISI;
            }
        }
    }

    private void Camera2StreamConfigurationMap(boolean z, com.caverock.androidsvg.SVG.SolidColor solidColor) {
        if (z) {
            if ((2147483648L & solidColor.isOutputSupportedForhNQ4ISI.ArtificialStackFrames) != 0) {
                this.getHighSpeedVideoSizes.getInputFormats.getInputFormats = solidColor.isOutputSupportedForhNQ4ISI.CoroutineDebuggingKt;
                this.getHighSpeedVideoSizes.getHighSpeedVideoSizes = solidColor.isOutputSupportedForhNQ4ISI.CoroutineDebuggingKt != null;
            }
            if ((solidColor.isOutputSupportedForhNQ4ISI.ArtificialStackFrames & 4294967296L) != 0) {
                this.getHighSpeedVideoSizes.getInputFormats.getOutputFormats = solidColor.isOutputSupportedForhNQ4ISI.accessartificialFrame;
            }
            if ((6442450944L & solidColor.isOutputSupportedForhNQ4ISI.ArtificialStackFrames) != 0) {
                com.caverock.androidsvg.SVGAndroidRenderer.RendererState rendererState = this.getHighSpeedVideoSizes;
                getHighResolutionOutputSizeshNQ4ISI(rendererState, z, rendererState.getInputFormats.getInputFormats);
                return;
            }
            return;
        }
        if ((2147483648L & solidColor.isOutputSupportedForhNQ4ISI.ArtificialStackFrames) != 0) {
            this.getHighSpeedVideoSizes.getInputFormats.b = solidColor.isOutputSupportedForhNQ4ISI.CoroutineDebuggingKt;
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges = solidColor.isOutputSupportedForhNQ4ISI.CoroutineDebuggingKt != null;
        }
        if ((solidColor.isOutputSupportedForhNQ4ISI.ArtificialStackFrames & 4294967296L) != 0) {
            this.getHighSpeedVideoSizes.getInputFormats.AMEXKernel = solidColor.isOutputSupportedForhNQ4ISI.accessartificialFrame;
        }
        if ((6442450944L & solidColor.isOutputSupportedForhNQ4ISI.ArtificialStackFrames) != 0) {
            com.caverock.androidsvg.SVGAndroidRenderer.RendererState rendererState2 = this.getHighSpeedVideoSizes;
            getHighResolutionOutputSizeshNQ4ISI(rendererState2, z, rendererState2.getInputFormats.b);
        }
    }

    private void getHighSpeedVideoFpsRanges(com.caverock.androidsvg.SVG.SvgElement svgElement, com.caverock.androidsvg.SVG.Box box) {
        android.graphics.Path highResolutionOutputSizeshNQ4ISI;
        if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoFpsRangesFor == null || (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(svgElement, box)) == null) {
            return;
        }
        this.getHighSpeedVideoFpsRanges.clipPath(highResolutionOutputSizeshNQ4ISI);
    }

    private android.graphics.Path getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVG.SvgElement svgElement, com.caverock.androidsvg.SVG.Box box) {
        android.graphics.Path highResolutionOutputSizeshNQ4ISI;
        com.caverock.androidsvg.SVG.SvgObject highSpeedVideoFpsRanges = svgElement.ArtificialStackFrames.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoFpsRangesFor);
        if (highSpeedVideoFpsRanges == null) {
            new java.lang.Object[]{this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoFpsRangesFor};
            return null;
        }
        com.caverock.androidsvg.SVG.ClipPath clipPath = (com.caverock.androidsvg.SVG.ClipPath) highSpeedVideoFpsRanges;
        this.getOutputFormats.push(this.getHighSpeedVideoSizes);
        com.caverock.androidsvg.SVGAndroidRenderer.RendererState rendererState = new com.caverock.androidsvg.SVGAndroidRenderer.RendererState();
        getHighSpeedVideoFpsRanges(rendererState, com.caverock.androidsvg.SVG.Style.getHighSpeedVideoSizes());
        this.getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(clipPath, rendererState);
        boolean z = clipPath.Camera2StreamConfigurationMap == null || clipPath.Camera2StreamConfigurationMap.booleanValue();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (!z) {
            matrix.preTranslate(box.Camera2StreamConfigurationMap, box.getHighSpeedVideoFpsRanges);
            matrix.preScale(box.getHighResolutionOutputSizeshNQ4ISI, box.getHighSpeedVideoSizes);
        }
        if (clipPath.getHighSpeedVideoFpsRanges != null) {
            matrix.preConcat(clipPath.getHighSpeedVideoFpsRanges);
        }
        android.graphics.Path path = new android.graphics.Path();
        for (com.caverock.androidsvg.SVG.SvgObject svgObject : clipPath.getInputSizeshNQ4ISI) {
            if ((svgObject instanceof com.caverock.androidsvg.SVG.SvgElement) && (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgElement) svgObject, true)) != null) {
                path.op(highResolutionOutputSizeshNQ4ISI, android.graphics.Path.Op.UNION);
            }
        }
        if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoFpsRangesFor != null) {
            if (clipPath.isOutputSupportedFor == null) {
                clipPath.isOutputSupportedFor = Camera2StreamConfigurationMap(path);
            }
            android.graphics.Path highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(clipPath, clipPath.isOutputSupportedFor);
            if (highResolutionOutputSizeshNQ4ISI2 != null) {
                path.op(highResolutionOutputSizeshNQ4ISI2, android.graphics.Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
        return path;
    }

    private android.graphics.Path getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVG.SvgElement svgElement, boolean z) {
        android.graphics.Path highSpeedVideoFpsRangesFor;
        android.graphics.Path highResolutionOutputSizeshNQ4ISI;
        this.getOutputFormats.push(this.getHighSpeedVideoSizes);
        com.caverock.androidsvg.SVGAndroidRenderer.RendererState rendererState = new com.caverock.androidsvg.SVGAndroidRenderer.RendererState(this.getHighSpeedVideoSizes);
        this.getHighSpeedVideoSizes = rendererState;
        getHighSpeedVideoFpsRangesFor(rendererState, svgElement);
        if ((this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor != null && !this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor.booleanValue()) || (this.getHighSpeedVideoSizes.getInputFormats.exchange != null && !this.getHighSpeedVideoSizes.getInputFormats.exchange.booleanValue())) {
            this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
            return null;
        }
        if (svgElement instanceof com.caverock.androidsvg.SVG.Use) {
            com.caverock.androidsvg.SVG.Use use = (com.caverock.androidsvg.SVG.Use) svgElement;
            com.caverock.androidsvg.SVG.SvgObject highSpeedVideoFpsRanges = svgElement.ArtificialStackFrames.getHighSpeedVideoFpsRanges(use.getHighSpeedVideoFpsRangesFor);
            if (highSpeedVideoFpsRanges == null) {
                new java.lang.Object[]{use.getHighSpeedVideoFpsRangesFor};
                this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
                return null;
            }
            if (!(highSpeedVideoFpsRanges instanceof com.caverock.androidsvg.SVG.SvgElement)) {
                this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
                return null;
            }
            highSpeedVideoFpsRangesFor = getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgElement) highSpeedVideoFpsRanges, false);
            if (highSpeedVideoFpsRangesFor == null) {
                return null;
            }
            if (use.isOutputSupportedFor == null) {
                use.isOutputSupportedFor = Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor);
            }
            if (use.getHighSpeedVideoFpsRanges != null) {
                highSpeedVideoFpsRangesFor.transform(use.getHighSpeedVideoFpsRanges);
            }
        } else if (svgElement instanceof com.caverock.androidsvg.SVG.GraphicsElement) {
            com.caverock.androidsvg.SVG.GraphicsElement graphicsElement = (com.caverock.androidsvg.SVG.GraphicsElement) svgElement;
            if (!(svgElement instanceof com.caverock.androidsvg.SVG.Path)) {
                highSpeedVideoFpsRangesFor = svgElement instanceof com.caverock.androidsvg.SVG.Rect ? getHighSpeedVideoSizes((com.caverock.androidsvg.SVG.Rect) svgElement) : svgElement instanceof com.caverock.androidsvg.SVG.Circle ? getHighSpeedVideoSizes((com.caverock.androidsvg.SVG.Circle) svgElement) : svgElement instanceof com.caverock.androidsvg.SVG.Ellipse ? getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.Ellipse) svgElement) : svgElement instanceof com.caverock.androidsvg.SVG.PolyLine ? getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.PolyLine) svgElement) : null;
            } else {
                highSpeedVideoFpsRangesFor = new com.caverock.androidsvg.SVGAndroidRenderer.PathConverter(((com.caverock.androidsvg.SVG.Path) svgElement).getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes;
                if (svgElement.isOutputSupportedFor == null) {
                    svgElement.isOutputSupportedFor = Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor);
                }
            }
            if (highSpeedVideoFpsRangesFor == null) {
                return null;
            }
            if (graphicsElement.isOutputSupportedFor == null) {
                graphicsElement.isOutputSupportedFor = Camera2StreamConfigurationMap(highSpeedVideoFpsRangesFor);
            }
            if (graphicsElement.getInputSizeshNQ4ISI != null) {
                highSpeedVideoFpsRangesFor.transform(graphicsElement.getInputSizeshNQ4ISI);
            }
            highSpeedVideoFpsRangesFor.setFillType(getHighResolutionOutputSizeshNQ4ISI());
        } else if (svgElement instanceof com.caverock.androidsvg.SVG.Text) {
            com.caverock.androidsvg.SVG.Text text = (com.caverock.androidsvg.SVG.Text) svgElement;
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(text);
            if (text.Camera2StreamConfigurationMap != null) {
                highSpeedVideoFpsRangesFor.transform(text.Camera2StreamConfigurationMap);
            }
            highSpeedVideoFpsRangesFor.setFillType(getHighResolutionOutputSizeshNQ4ISI());
        } else {
            new java.lang.Object[]{svgElement.getHighResolutionOutputSizeshNQ4ISI()};
            return null;
        }
        if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoFpsRangesFor != null && (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(svgElement, svgElement.isOutputSupportedFor)) != null) {
            highSpeedVideoFpsRangesFor.op(highResolutionOutputSizeshNQ4ISI, android.graphics.Path.Op.INTERSECT);
        }
        this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
        return highSpeedVideoFpsRangesFor;
    }

    private android.graphics.Path.FillType getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizes != null && this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizes == com.caverock.androidsvg.SVG.Style.FillRule.EvenOdd) {
            return android.graphics.Path.FillType.EVEN_ODD;
        }
        return android.graphics.Path.FillType.WINDING;
    }

    class PlainTextToPath extends com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor {
        float getHighResolutionOutputSizeshNQ4ISI;
        android.graphics.Path getHighSpeedVideoFpsRanges;
        float getHighSpeedVideoSizes;

        PlainTextToPath(float f, float f2, android.graphics.Path path) {
            super(com.caverock.androidsvg.SVGAndroidRenderer.this, (byte) 0);
            this.getHighSpeedVideoSizes = f;
            this.getHighResolutionOutputSizeshNQ4ISI = f2;
            this.getHighSpeedVideoFpsRanges = path;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public final boolean Camera2StreamConfigurationMap(com.caverock.androidsvg.SVG.TextContainer textContainer) {
            if (!(textContainer instanceof com.caverock.androidsvg.SVG.TextPath)) {
                return true;
            }
            com.caverock.androidsvg.SVGAndroidRenderer.Camera2StreamConfigurationMap();
            return false;
        }

        @Override // com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor
        public final void getHighSpeedVideoFpsRangesFor(java.lang.String str) {
            if (com.caverock.androidsvg.SVGAndroidRenderer.getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVGAndroidRenderer.this)) {
                android.graphics.Path path = new android.graphics.Path();
                com.caverock.androidsvg.SVGAndroidRenderer.this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.getTextPath(str, 0, str.length(), this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, path);
                this.getHighSpeedVideoFpsRanges.addPath(path);
            }
            this.getHighSpeedVideoSizes += com.caverock.androidsvg.SVGAndroidRenderer.this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.measureText(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private android.graphics.Path getHighSpeedVideoSizes(com.caverock.androidsvg.SVG.Rect rect) {
        float highSpeedVideoFpsRangesFor;
        float highSpeedVideoSizes;
        float min;
        float highSpeedVideoFpsRangesFor2;
        float highSpeedVideoSizes2;
        float f;
        float f2;
        android.graphics.Path path;
        android.graphics.Path path2;
        if (rect.getHighSpeedVideoSizes == null && rect.getHighResolutionOutputSizeshNQ4ISI == null) {
            highSpeedVideoFpsRangesFor = 0.0f;
        } else if (rect.getHighSpeedVideoSizes == null) {
            highSpeedVideoFpsRangesFor = rect.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(this);
        } else if (rect.getHighResolutionOutputSizeshNQ4ISI == null) {
            highSpeedVideoFpsRangesFor = rect.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(this);
        } else {
            highSpeedVideoFpsRangesFor = rect.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(this);
            highSpeedVideoSizes = rect.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(this);
            min = java.lang.Math.min(highSpeedVideoFpsRangesFor, rect.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this) / 2.0f);
            float min2 = java.lang.Math.min(highSpeedVideoSizes, rect.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(this) / 2.0f);
            highSpeedVideoFpsRangesFor2 = rect.Camera2StreamConfigurationMap == null ? rect.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(this) : 0.0f;
            highSpeedVideoSizes2 = rect.getHighSpeedVideoSizesFor == null ? rect.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes(this) : 0.0f;
            float highSpeedVideoFpsRangesFor3 = rect.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this);
            float highSpeedVideoSizes3 = rect.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(this);
            if (rect.isOutputSupportedFor == null) {
                rect.isOutputSupportedFor = new com.caverock.androidsvg.SVG.Box(highSpeedVideoFpsRangesFor2, highSpeedVideoSizes2, highSpeedVideoFpsRangesFor3, highSpeedVideoSizes3);
            }
            f = highSpeedVideoFpsRangesFor3 + highSpeedVideoFpsRangesFor2;
            f2 = highSpeedVideoSizes2 + highSpeedVideoSizes3;
            path = new android.graphics.Path();
            if (min != 0.0f || min2 == 0.0f) {
                path2 = path;
                path2.moveTo(highSpeedVideoFpsRangesFor2, highSpeedVideoSizes2);
                path2.lineTo(f, highSpeedVideoSizes2);
                path2.lineTo(f, f2);
                path2.lineTo(highSpeedVideoFpsRangesFor2, f2);
                path2.lineTo(highSpeedVideoFpsRangesFor2, highSpeedVideoSizes2);
            } else {
                float f3 = min * 0.5522848f;
                float f4 = 0.5522848f * min2;
                float f5 = highSpeedVideoSizes2 + min2;
                path.moveTo(highSpeedVideoFpsRangesFor2, f5);
                float f6 = f5 - f4;
                float f7 = highSpeedVideoFpsRangesFor2 + min;
                float f8 = f7 - f3;
                path.cubicTo(highSpeedVideoFpsRangesFor2, f6, f8, highSpeedVideoSizes2, f7, highSpeedVideoSizes2);
                float f9 = f - min;
                path.lineTo(f9, highSpeedVideoSizes2);
                float f10 = f9 + f3;
                path.cubicTo(f10, highSpeedVideoSizes2, f, f6, f, f5);
                float f11 = f2 - min2;
                path.lineTo(f, f11);
                float f12 = f11 + f4;
                path2 = path;
                path.cubicTo(f, f12, f10, f2, f9, f2);
                path2.lineTo(f7, f2);
                path2.cubicTo(f8, f2, highSpeedVideoFpsRangesFor2, f12, highSpeedVideoFpsRangesFor2, f11);
                path2.lineTo(highSpeedVideoFpsRangesFor2, f5);
            }
            path2.close();
            return path2;
        }
        highSpeedVideoSizes = highSpeedVideoFpsRangesFor;
        min = java.lang.Math.min(highSpeedVideoFpsRangesFor, rect.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this) / 2.0f);
        float min22 = java.lang.Math.min(highSpeedVideoSizes, rect.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(this) / 2.0f);
        if (rect.Camera2StreamConfigurationMap == null) {
        }
        if (rect.getHighSpeedVideoSizesFor == null) {
        }
        float highSpeedVideoFpsRangesFor32 = rect.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this);
        float highSpeedVideoSizes32 = rect.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(this);
        if (rect.isOutputSupportedFor == null) {
        }
        f = highSpeedVideoFpsRangesFor32 + highSpeedVideoFpsRangesFor2;
        f2 = highSpeedVideoSizes2 + highSpeedVideoSizes32;
        path = new android.graphics.Path();
        if (min != 0.0f) {
        }
        path2 = path;
        path2.moveTo(highSpeedVideoFpsRangesFor2, highSpeedVideoSizes2);
        path2.lineTo(f, highSpeedVideoSizes2);
        path2.lineTo(f, f2);
        path2.lineTo(highSpeedVideoFpsRangesFor2, f2);
        path2.lineTo(highSpeedVideoFpsRangesFor2, highSpeedVideoSizes2);
        path2.close();
        return path2;
    }

    private android.graphics.Path getHighSpeedVideoSizes(com.caverock.androidsvg.SVG.Circle circle) {
        float highSpeedVideoFpsRangesFor = circle.Camera2StreamConfigurationMap != null ? circle.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(this) : 0.0f;
        float highSpeedVideoSizes = circle.getHighSpeedVideoFpsRanges != null ? circle.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes(this) : 0.0f;
        float Camera2StreamConfigurationMap = circle.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(this);
        float f = highSpeedVideoFpsRangesFor - Camera2StreamConfigurationMap;
        float f2 = highSpeedVideoSizes - Camera2StreamConfigurationMap;
        float f3 = highSpeedVideoFpsRangesFor + Camera2StreamConfigurationMap;
        float f4 = highSpeedVideoSizes + Camera2StreamConfigurationMap;
        if (circle.isOutputSupportedFor == null) {
            float f5 = 2.0f * Camera2StreamConfigurationMap;
            circle.isOutputSupportedFor = new com.caverock.androidsvg.SVG.Box(f, f2, f5, f5);
        }
        float f6 = 0.5522848f * Camera2StreamConfigurationMap;
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(highSpeedVideoFpsRangesFor, f2);
        float f7 = highSpeedVideoFpsRangesFor + f6;
        float f8 = highSpeedVideoSizes - f6;
        path.cubicTo(f7, f2, f3, f8, f3, highSpeedVideoSizes);
        float f9 = highSpeedVideoSizes + f6;
        path.cubicTo(f3, f9, f7, f4, highSpeedVideoFpsRangesFor, f4);
        float f10 = highSpeedVideoFpsRangesFor - f6;
        path.cubicTo(f10, f4, f, f9, f, highSpeedVideoSizes);
        path.cubicTo(f, f8, f10, f2, highSpeedVideoFpsRangesFor, f2);
        path.close();
        return path;
    }

    private android.graphics.Path getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVG.Ellipse ellipse) {
        float highSpeedVideoFpsRangesFor = ellipse.getHighSpeedVideoSizes != null ? ellipse.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(this) : 0.0f;
        float highSpeedVideoSizes = ellipse.getHighSpeedVideoFpsRangesFor != null ? ellipse.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(this) : 0.0f;
        float highSpeedVideoFpsRangesFor2 = ellipse.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(this);
        float highSpeedVideoSizes2 = ellipse.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(this);
        float f = highSpeedVideoFpsRangesFor - highSpeedVideoFpsRangesFor2;
        float f2 = highSpeedVideoSizes - highSpeedVideoSizes2;
        float f3 = highSpeedVideoFpsRangesFor + highSpeedVideoFpsRangesFor2;
        float f4 = highSpeedVideoSizes + highSpeedVideoSizes2;
        if (ellipse.isOutputSupportedFor == null) {
            ellipse.isOutputSupportedFor = new com.caverock.androidsvg.SVG.Box(f, f2, highSpeedVideoFpsRangesFor2 * 2.0f, 2.0f * highSpeedVideoSizes2);
        }
        float f5 = highSpeedVideoFpsRangesFor2 * 0.5522848f;
        float f6 = 0.5522848f * highSpeedVideoSizes2;
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(highSpeedVideoFpsRangesFor, f2);
        float f7 = highSpeedVideoFpsRangesFor + f5;
        float f8 = highSpeedVideoSizes - f6;
        path.cubicTo(f7, f2, f3, f8, f3, highSpeedVideoSizes);
        float f9 = f6 + highSpeedVideoSizes;
        path.cubicTo(f3, f9, f7, f4, highSpeedVideoFpsRangesFor, f4);
        float f10 = highSpeedVideoFpsRangesFor - f5;
        path.cubicTo(f10, f4, f, f9, f, highSpeedVideoSizes);
        path.cubicTo(f, f8, f10, f2, highSpeedVideoFpsRangesFor, f2);
        path.close();
        return path;
    }

    private static android.graphics.Path getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVG.PolyLine polyLine) {
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(polyLine.getHighResolutionOutputSizeshNQ4ISI[0], polyLine.getHighResolutionOutputSizeshNQ4ISI[1]);
        for (int i = 2; i < polyLine.getHighResolutionOutputSizeshNQ4ISI.length; i += 2) {
            path.lineTo(polyLine.getHighResolutionOutputSizeshNQ4ISI[i], polyLine.getHighResolutionOutputSizeshNQ4ISI[i + 1]);
        }
        if (polyLine instanceof com.caverock.androidsvg.SVG.Polygon) {
            path.close();
        }
        if (polyLine.isOutputSupportedFor == null) {
            polyLine.isOutputSupportedFor = Camera2StreamConfigurationMap(path);
        }
        return path;
    }

    private android.graphics.Path getHighSpeedVideoFpsRangesFor(com.caverock.androidsvg.SVG.Text text) {
        byte b = 0;
        float f = 0.0f;
        float highSpeedVideoFpsRangesFor = (text.getHighSpeedVideoSizes == null || text.getHighSpeedVideoSizes.size() == 0) ? 0.0f : text.getHighSpeedVideoSizes.get(0).getHighSpeedVideoFpsRangesFor(this);
        float highSpeedVideoSizes = (text.getHighSpeedVideoFpsRangesFor == null || text.getHighSpeedVideoFpsRangesFor.size() == 0) ? 0.0f : text.getHighSpeedVideoFpsRangesFor.get(0).getHighSpeedVideoSizes(this);
        float highSpeedVideoFpsRangesFor2 = (text.getHighSpeedVideoFpsRanges == null || text.getHighSpeedVideoFpsRanges.size() == 0) ? 0.0f : text.getHighSpeedVideoFpsRanges.get(0).getHighSpeedVideoFpsRangesFor(this);
        if (text.getHighResolutionOutputSizeshNQ4ISI != null && text.getHighResolutionOutputSizeshNQ4ISI.size() != 0) {
            f = text.getHighResolutionOutputSizeshNQ4ISI.get(0).getHighSpeedVideoSizes(this);
        }
        if (this.getHighSpeedVideoSizes.getInputFormats.d != com.caverock.androidsvg.SVG.Style.TextAnchor.Start) {
            com.caverock.androidsvg.SVGAndroidRenderer.TextWidthCalculator textWidthCalculator = new com.caverock.androidsvg.SVGAndroidRenderer.TextWidthCalculator(this, b);
            getHighSpeedVideoSizes(text, textWidthCalculator);
            float f2 = textWidthCalculator.getHighSpeedVideoFpsRanges;
            if (this.getHighSpeedVideoSizes.getInputFormats.d == com.caverock.androidsvg.SVG.Style.TextAnchor.Middle) {
                f2 /= 2.0f;
            }
            highSpeedVideoFpsRangesFor -= f2;
        }
        if (text.isOutputSupportedFor == null) {
            com.caverock.androidsvg.SVGAndroidRenderer.TextBoundsCalculator textBoundsCalculator = new com.caverock.androidsvg.SVGAndroidRenderer.TextBoundsCalculator(highSpeedVideoFpsRangesFor, highSpeedVideoSizes);
            getHighSpeedVideoSizes(text, textBoundsCalculator);
            text.isOutputSupportedFor = new com.caverock.androidsvg.SVG.Box(textBoundsCalculator.Camera2StreamConfigurationMap.left, textBoundsCalculator.Camera2StreamConfigurationMap.top, textBoundsCalculator.Camera2StreamConfigurationMap.width(), textBoundsCalculator.Camera2StreamConfigurationMap.height());
        }
        android.graphics.Path path = new android.graphics.Path();
        getHighSpeedVideoSizes(text, new com.caverock.androidsvg.SVGAndroidRenderer.PlainTextToPath(highSpeedVideoFpsRangesFor + highSpeedVideoFpsRangesFor2, highSpeedVideoSizes + f, path));
        return path;
    }

    private void getHighSpeedVideoSizes(com.caverock.androidsvg.SVG.Mask mask, com.caverock.androidsvg.SVG.SvgElement svgElement, com.caverock.androidsvg.SVG.Box box) {
        float f;
        float f2;
        float f3;
        if (mask.getHighSpeedVideoSizes != null && mask.getHighSpeedVideoSizes.booleanValue()) {
            f2 = mask.Camera2StreamConfigurationMap != null ? mask.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(this) : box.getHighResolutionOutputSizeshNQ4ISI;
            f3 = mask.getHighSpeedVideoFpsRangesFor != null ? mask.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(this) : box.getHighSpeedVideoSizes;
        } else {
            float f4 = 1.2f;
            if (mask.Camera2StreamConfigurationMap != null) {
                com.caverock.androidsvg.SVG.Length length = mask.Camera2StreamConfigurationMap;
                if (length.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent) {
                    f = (length.getHighSpeedVideoFpsRanges * 1.0f) / 100.0f;
                } else {
                    f = length.getHighSpeedVideoFpsRangesFor(this);
                }
            } else {
                f = 1.2f;
            }
            if (mask.getHighSpeedVideoFpsRangesFor != null) {
                com.caverock.androidsvg.SVG.Length length2 = mask.getHighSpeedVideoFpsRangesFor;
                if (length2.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent) {
                    f4 = (length2.getHighSpeedVideoFpsRanges * 1.0f) / 100.0f;
                } else {
                    f4 = length2.getHighSpeedVideoFpsRangesFor(this);
                }
            }
            f2 = f * box.getHighResolutionOutputSizeshNQ4ISI;
            f3 = box.getHighSpeedVideoSizes * f4;
        }
        if (f2 == 0.0f || f3 == 0.0f) {
            return;
        }
        getOutputSizeshNQ4ISI();
        com.caverock.androidsvg.SVGAndroidRenderer.RendererState rendererState = new com.caverock.androidsvg.SVGAndroidRenderer.RendererState();
        getHighSpeedVideoFpsRanges(rendererState, com.caverock.androidsvg.SVG.Style.getHighSpeedVideoSizes());
        com.caverock.androidsvg.SVGAndroidRenderer.RendererState highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(mask, rendererState);
        this.getHighSpeedVideoSizes = highSpeedVideoFpsRanges;
        highSpeedVideoFpsRanges.getInputFormats.toString = java.lang.Float.valueOf(1.0f);
        boolean outputFormats = getOutputFormats();
        this.getHighSpeedVideoFpsRanges.save();
        if (mask.getHighResolutionOutputSizeshNQ4ISI != null && !mask.getHighResolutionOutputSizeshNQ4ISI.booleanValue()) {
            this.getHighSpeedVideoFpsRanges.translate(box.Camera2StreamConfigurationMap, box.getHighSpeedVideoFpsRanges);
            this.getHighSpeedVideoFpsRanges.scale(box.getHighResolutionOutputSizeshNQ4ISI, box.getHighSpeedVideoSizes);
        }
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgContainer) mask, false);
        this.getHighSpeedVideoFpsRanges.restore();
        if (outputFormats) {
            Camera2StreamConfigurationMap(svgElement, box);
        }
        this.getHighSpeedVideoFpsRanges.restore();
        this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
    }

    static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVGAndroidRenderer sVGAndroidRenderer) {
        if (sVGAndroidRenderer.getHighSpeedVideoSizes.getInputFormats.exchange != null) {
            return sVGAndroidRenderer.getHighSpeedVideoSizes.getInputFormats.exchange.booleanValue();
        }
        return true;
    }

    static /* synthetic */ void getHighSpeedVideoSizes(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, com.caverock.androidsvg.SVG.PathInterface pathInterface) {
        double acos;
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            pathInterface.getHighSpeedVideoFpsRanges(f6, f7);
            return;
        }
        float abs = java.lang.Math.abs(f3);
        float abs2 = java.lang.Math.abs(f4);
        double radians = java.lang.Math.toRadians(f5 % 360.0d);
        double cos = java.lang.Math.cos(radians);
        double sin = java.lang.Math.sin(radians);
        double d = (f - f6) / 2.0d;
        double d2 = (f2 - f7) / 2.0d;
        double d3 = (cos * d) + (sin * d2);
        double d4 = ((-sin) * d) + (d2 * cos);
        double d5 = abs * abs;
        double d6 = abs2 * abs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d7 / d5) + (d8 / d6);
        if (d9 > 0.99999d) {
            double sqrt = java.lang.Math.sqrt(d9) * 1.00001d;
            abs = (float) (abs * sqrt);
            abs2 = (float) (sqrt * abs2);
            d5 = abs * abs;
            d6 = abs2 * abs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d8 * d5;
        double d12 = d7 * d6;
        double d13 = (((d5 * d6) - d11) - d12) / (d11 + d12);
        if (d13 < 0.0d) {
            d13 = 0.0d;
        }
        double sqrt2 = d10 * java.lang.Math.sqrt(d13);
        double d14 = abs;
        double d15 = abs2;
        double d16 = ((d14 * d4) / d15) * sqrt2;
        double d17 = (-((d15 * d3) / d14)) * sqrt2;
        double d18 = (f + f6) / 2.0d;
        double d19 = (f2 + f7) / 2.0d;
        double d20 = (d3 - d16) / d14;
        double d21 = (d4 - d17) / d15;
        double d22 = ((-d3) - d16) / d14;
        double d23 = ((-d4) - d17) / d15;
        double d24 = (d20 * d20) + (d21 * d21);
        double sqrt3 = java.lang.Math.sqrt(d24);
        double d25 = d21 < 0.0d ? -1.0d : 1.0d;
        double acos2 = java.lang.Math.acos(d20 / sqrt3);
        double sqrt4 = java.lang.Math.sqrt(d24 * ((d22 * d22) + (d23 * d23)));
        double d26 = (d20 * d23) - (d21 * d22) < 0.0d ? -1.0d : 1.0d;
        double d27 = ((d20 * d22) + (d21 * d23)) / sqrt4;
        if (d27 < -1.0d) {
            acos = 3.141592653589793d;
        } else {
            acos = d27 > 1.0d ? 0.0d : java.lang.Math.acos(d27);
        }
        double d28 = d26 * acos;
        if (!z2 && d28 > 0.0d) {
            d28 -= 6.283185307179586d;
        } else if (z2 && d28 < 0.0d) {
            d28 += 6.283185307179586d;
        }
        double d29 = (d25 * acos2) % 6.283185307179586d;
        double d30 = d28 % 6.283185307179586d;
        int ceil = (int) java.lang.Math.ceil((java.lang.Math.abs(d30) * 2.0d) / 3.141592653589793d);
        double d31 = d30 / ceil;
        double d32 = d31 / 2.0d;
        double sin2 = (java.lang.Math.sin(d32) * 1.3333333333333333d) / (java.lang.Math.cos(d32) + 1.0d);
        int i = ceil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i3 < ceil) {
            int i4 = i2;
            double d33 = d29 + (i3 * d31);
            double cos2 = java.lang.Math.cos(d33);
            double sin3 = java.lang.Math.sin(d33);
            int i5 = ceil;
            fArr[i4] = (float) (cos2 - (sin2 * sin3));
            fArr[i4 + 1] = (float) (sin3 + (cos2 * sin2));
            double d34 = d33 + d31;
            double cos3 = java.lang.Math.cos(d34);
            double sin4 = java.lang.Math.sin(d34);
            fArr[i4 + 2] = (float) ((sin2 * sin4) + cos3);
            fArr[i4 + 3] = (float) (sin4 - (sin2 * cos3));
            fArr[i4 + 4] = (float) cos3;
            fArr[i4 + 5] = (float) sin4;
            i3++;
            i = i;
            i2 = i4 + 6;
            ceil = i5;
            d19 = d19;
        }
        int i6 = i;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(abs, abs2);
        matrix.postRotate(f5);
        matrix.postTranslate((float) (d18 + ((cos * d16) - (sin * d17))), (float) (d19 + (sin * d16) + (d17 * cos)));
        matrix.mapPoints(fArr);
        fArr[i6 - 2] = f6;
        fArr[i6 - 1] = f7;
        for (int i7 = 0; i7 < i6; i7 += 6) {
            pathInterface.getHighSpeedVideoFpsRanges(fArr[i7], fArr[i7 + 1], fArr[i7 + 2], fArr[i7 + 3], fArr[i7 + 4], fArr[i7 + 5]);
        }
    }

    private void getHighSpeedVideoSizes(com.caverock.androidsvg.SVG.TextContainer textContainer, com.caverock.androidsvg.SVGAndroidRenderer.TextProcessor textProcessor) {
        float f;
        float f2;
        float f3;
        com.caverock.androidsvg.SVG.Style.TextAnchor highSpeedVideoSizes;
        if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor == null || this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor.booleanValue()) {
            java.util.Iterator<com.caverock.androidsvg.SVG.SvgObject> it = textContainer.getInputSizeshNQ4ISI.iterator();
            boolean z = true;
            while (it.hasNext()) {
                com.caverock.androidsvg.SVG.SvgObject next = it.next();
                byte b = 0;
                if (next instanceof com.caverock.androidsvg.SVG.TextSequence) {
                    textProcessor.getHighSpeedVideoFpsRangesFor(getHighSpeedVideoSizes(((com.caverock.androidsvg.SVG.TextSequence) next).Camera2StreamConfigurationMap, z, !it.hasNext()));
                } else if (textProcessor.Camera2StreamConfigurationMap((com.caverock.androidsvg.SVG.TextContainer) next)) {
                    float f4 = 0.0f;
                    if (next instanceof com.caverock.androidsvg.SVG.TextPath) {
                        getOutputSizeshNQ4ISI();
                        com.caverock.androidsvg.SVG.TextPath textPath = (com.caverock.androidsvg.SVG.TextPath) next;
                        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, textPath);
                        if ((this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor == null || this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor.booleanValue()) && (this.getHighSpeedVideoSizes.getInputFormats.exchange == null || this.getHighSpeedVideoSizes.getInputFormats.exchange.booleanValue())) {
                            com.caverock.androidsvg.SVG.SvgObject highSpeedVideoFpsRanges = textPath.ArtificialStackFrames.getHighSpeedVideoFpsRanges(textPath.getHighSpeedVideoFpsRangesFor);
                            if (highSpeedVideoFpsRanges == null) {
                                new java.lang.Object[]{textPath.getHighSpeedVideoFpsRangesFor};
                            } else {
                                com.caverock.androidsvg.SVG.Path path = (com.caverock.androidsvg.SVG.Path) highSpeedVideoFpsRanges;
                                android.graphics.Path path2 = new com.caverock.androidsvg.SVGAndroidRenderer.PathConverter(path.getHighResolutionOutputSizeshNQ4ISI).getHighSpeedVideoSizes;
                                if (path.getInputSizeshNQ4ISI != null) {
                                    path2.transform(path.getInputSizeshNQ4ISI);
                                }
                                android.graphics.PathMeasure pathMeasure = new android.graphics.PathMeasure(path2, false);
                                if (textPath.getHighSpeedVideoFpsRanges != null) {
                                    com.caverock.androidsvg.SVG.Length length = textPath.getHighSpeedVideoFpsRanges;
                                    float length2 = pathMeasure.getLength();
                                    if (length.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent) {
                                        f4 = (length.getHighSpeedVideoFpsRanges * length2) / 100.0f;
                                    } else {
                                        f4 = length.getHighSpeedVideoFpsRangesFor(this);
                                    }
                                }
                                com.caverock.androidsvg.SVG.Style.TextAnchor highSpeedVideoSizes2 = getHighSpeedVideoSizes();
                                if (highSpeedVideoSizes2 != com.caverock.androidsvg.SVG.Style.TextAnchor.Start) {
                                    com.caverock.androidsvg.SVGAndroidRenderer.TextWidthCalculator textWidthCalculator = new com.caverock.androidsvg.SVGAndroidRenderer.TextWidthCalculator(this, b);
                                    getHighSpeedVideoSizes(textPath, textWidthCalculator);
                                    float f5 = textWidthCalculator.getHighSpeedVideoFpsRanges;
                                    if (highSpeedVideoSizes2 == com.caverock.androidsvg.SVG.Style.TextAnchor.Middle) {
                                        f5 /= 2.0f;
                                    }
                                    f4 -= f5;
                                }
                                getHighSpeedVideoFpsRangesFor((com.caverock.androidsvg.SVG.SvgElement) textPath.getHighResolutionOutputSizeshNQ4ISI);
                                boolean outputFormats = getOutputFormats();
                                getHighSpeedVideoSizes(textPath, new com.caverock.androidsvg.SVGAndroidRenderer.PathTextDrawer(path2, f4));
                                if (outputFormats) {
                                    Camera2StreamConfigurationMap(textPath, textPath.isOutputSupportedFor);
                                }
                            }
                        }
                        this.getHighSpeedVideoFpsRanges.restore();
                        this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
                    } else if (next instanceof com.caverock.androidsvg.SVG.TSpan) {
                        getOutputSizeshNQ4ISI();
                        com.caverock.androidsvg.SVG.TSpan tSpan = (com.caverock.androidsvg.SVG.TSpan) next;
                        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, tSpan);
                        if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor == null || this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor.booleanValue()) {
                            boolean z2 = tSpan.getHighSpeedVideoSizes != null && tSpan.getHighSpeedVideoSizes.size() > 0;
                            boolean z3 = textProcessor instanceof com.caverock.androidsvg.SVGAndroidRenderer.PlainTextDrawer;
                            if (z3) {
                                float highSpeedVideoFpsRangesFor = !z2 ? ((com.caverock.androidsvg.SVGAndroidRenderer.PlainTextDrawer) textProcessor).getHighResolutionOutputSizeshNQ4ISI : tSpan.getHighSpeedVideoSizes.get(0).getHighSpeedVideoFpsRangesFor(this);
                                f2 = (tSpan.getHighSpeedVideoFpsRangesFor == null || tSpan.getHighSpeedVideoFpsRangesFor.size() == 0) ? ((com.caverock.androidsvg.SVGAndroidRenderer.PlainTextDrawer) textProcessor).getHighSpeedVideoFpsRangesFor : tSpan.getHighSpeedVideoFpsRangesFor.get(0).getHighSpeedVideoSizes(this);
                                f3 = (tSpan.getHighSpeedVideoFpsRanges == null || tSpan.getHighSpeedVideoFpsRanges.size() == 0) ? 0.0f : tSpan.getHighSpeedVideoFpsRanges.get(0).getHighSpeedVideoFpsRangesFor(this);
                                if (tSpan.getHighResolutionOutputSizeshNQ4ISI != null && tSpan.getHighResolutionOutputSizeshNQ4ISI.size() != 0) {
                                    f4 = tSpan.getHighResolutionOutputSizeshNQ4ISI.get(0).getHighSpeedVideoSizes(this);
                                }
                                float f6 = highSpeedVideoFpsRangesFor;
                                f = f4;
                                f4 = f6;
                            } else {
                                f = 0.0f;
                                f2 = 0.0f;
                                f3 = 0.0f;
                            }
                            if (z2 && (highSpeedVideoSizes = getHighSpeedVideoSizes()) != com.caverock.androidsvg.SVG.Style.TextAnchor.Start) {
                                com.caverock.androidsvg.SVGAndroidRenderer.TextWidthCalculator textWidthCalculator2 = new com.caverock.androidsvg.SVGAndroidRenderer.TextWidthCalculator(this, b);
                                getHighSpeedVideoSizes(tSpan, textWidthCalculator2);
                                float f7 = textWidthCalculator2.getHighSpeedVideoFpsRanges;
                                if (highSpeedVideoSizes == com.caverock.androidsvg.SVG.Style.TextAnchor.Middle) {
                                    f7 /= 2.0f;
                                }
                                f4 -= f7;
                            }
                            getHighSpeedVideoFpsRangesFor((com.caverock.androidsvg.SVG.SvgElement) tSpan.Camera2StreamConfigurationMap);
                            if (z3) {
                                com.caverock.androidsvg.SVGAndroidRenderer.PlainTextDrawer plainTextDrawer = (com.caverock.androidsvg.SVGAndroidRenderer.PlainTextDrawer) textProcessor;
                                plainTextDrawer.getHighResolutionOutputSizeshNQ4ISI = f4 + f3;
                                plainTextDrawer.getHighSpeedVideoFpsRangesFor = f2 + f;
                            }
                            boolean outputFormats2 = getOutputFormats();
                            getHighSpeedVideoSizes(tSpan, textProcessor);
                            if (outputFormats2) {
                                Camera2StreamConfigurationMap(tSpan, tSpan.isOutputSupportedFor);
                            }
                        }
                        this.getHighSpeedVideoFpsRanges.restore();
                        this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
                    } else if (next instanceof com.caverock.androidsvg.SVG.TRef) {
                        getOutputSizeshNQ4ISI();
                        com.caverock.androidsvg.SVG.TRef tRef = (com.caverock.androidsvg.SVG.TRef) next;
                        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, tRef);
                        if (this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor == null || this.getHighSpeedVideoSizes.getInputFormats.getHighSpeedVideoSizesFor.booleanValue()) {
                            getHighSpeedVideoFpsRangesFor((com.caverock.androidsvg.SVG.SvgElement) tRef.getHighSpeedVideoSizes);
                            com.caverock.androidsvg.SVG.SvgObject highSpeedVideoFpsRanges2 = next.ArtificialStackFrames.getHighSpeedVideoFpsRanges(tRef.getHighSpeedVideoFpsRanges);
                            if (highSpeedVideoFpsRanges2 != null && (highSpeedVideoFpsRanges2 instanceof com.caverock.androidsvg.SVG.TextContainer)) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.TextContainer) highSpeedVideoFpsRanges2, sb);
                                if (sb.length() > 0) {
                                    textProcessor.getHighSpeedVideoFpsRangesFor(sb.toString());
                                }
                            } else {
                                new java.lang.Object[]{tRef.getHighSpeedVideoFpsRanges};
                            }
                        }
                        this.getHighSpeedVideoFpsRanges.restore();
                        this.getHighSpeedVideoSizes = this.getOutputFormats.pop();
                    }
                }
                z = false;
            }
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVG.SvgContainer svgContainer, boolean z) {
        if (z) {
            this.getOutputMinFrameDuration.push(svgContainer);
            this.getHighSpeedVideoSizesFor.push(this.getHighSpeedVideoFpsRanges.getMatrix());
        }
        java.util.Iterator<com.caverock.androidsvg.SVG.SvgObject> it = svgContainer.getHighSpeedVideoFpsRanges().iterator();
        while (it.hasNext()) {
            Camera2StreamConfigurationMap(it.next());
        }
        if (z) {
            this.getOutputMinFrameDuration.pop();
            this.getHighSpeedVideoSizesFor.pop();
        }
    }

    private void getHighSpeedVideoFpsRanges(com.caverock.androidsvg.SVGAndroidRenderer.RendererState rendererState, com.caverock.androidsvg.SVG.Style style) {
        float highSpeedVideoFpsRangesFor;
        float highSpeedVideoFpsRangesFor2;
        if ((style.ArtificialStackFrames & 4096) != 0) {
            rendererState.getInputFormats.getHighResolutionOutputSizeshNQ4ISI = style.getHighResolutionOutputSizeshNQ4ISI;
        }
        if ((style.ArtificialStackFrames & coil3.svg.internal.UtilsKt.SVG_SIZE_BYTES) != 0) {
            rendererState.getInputFormats.toString = style.toString;
        }
        if ((style.ArtificialStackFrames & 1) != 0) {
            rendererState.getInputFormats.getInputFormats = style.getInputFormats;
            rendererState.getHighSpeedVideoSizes = (style.getInputFormats == null || style.getInputFormats == com.caverock.androidsvg.SVG.Colour.getHighSpeedVideoFpsRanges) ? false : true;
        }
        if ((style.ArtificialStackFrames & 4) != 0) {
            rendererState.getInputFormats.getOutputFormats = style.getOutputFormats;
        }
        if ((style.ArtificialStackFrames & 6149) != 0) {
            getHighResolutionOutputSizeshNQ4ISI(rendererState, true, rendererState.getInputFormats.getInputFormats);
        }
        if ((style.ArtificialStackFrames & 2) != 0) {
            rendererState.getInputFormats.getOutputMinFrameDuration = style.getOutputMinFrameDuration;
        }
        if ((style.ArtificialStackFrames & 8) != 0) {
            rendererState.getInputFormats.b = style.b;
            rendererState.getHighSpeedVideoFpsRanges = (style.b == null || style.b == com.caverock.androidsvg.SVG.Colour.getHighSpeedVideoFpsRanges) ? false : true;
        }
        if ((style.ArtificialStackFrames & 16) != 0) {
            rendererState.getInputFormats.AMEXKernel = style.AMEXKernel;
        }
        if ((style.ArtificialStackFrames & 6168) != 0) {
            getHighResolutionOutputSizeshNQ4ISI(rendererState, false, rendererState.getInputFormats.b);
        }
        if ((style.ArtificialStackFrames & 34359738368L) != 0) {
            rendererState.getInputFormats.resetTransaction = style.resetTransaction;
        }
        if ((style.ArtificialStackFrames & 32) != 0) {
            rendererState.getInputFormats.kernelVersion = style.kernelVersion;
            rendererState.getHighResolutionOutputSizeshNQ4ISI.setStrokeWidth(rendererState.getInputFormats.kernelVersion.Camera2StreamConfigurationMap(this));
        }
        if ((style.ArtificialStackFrames & 64) != 0) {
            rendererState.getInputFormats._BOUNDARY = style._BOUNDARY;
            int i = com.caverock.androidsvg.SVGAndroidRenderer.AnonymousClass1.getHighSpeedVideoFpsRangesFor[style._BOUNDARY.ordinal()];
            if (i == 1) {
                rendererState.getHighResolutionOutputSizeshNQ4ISI.setStrokeCap(android.graphics.Paint.Cap.BUTT);
            } else if (i == 2) {
                rendererState.getHighResolutionOutputSizeshNQ4ISI.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            } else if (i == 3) {
                rendererState.getHighResolutionOutputSizeshNQ4ISI.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
            }
        }
        if ((style.ArtificialStackFrames & 128) != 0) {
            rendererState.getInputFormats.f2840a = style.f2840a;
            int i2 = com.caverock.androidsvg.SVGAndroidRenderer.AnonymousClass1.getHighSpeedVideoSizes[style.f2840a.ordinal()];
            if (i2 == 1) {
                rendererState.getHighResolutionOutputSizeshNQ4ISI.setStrokeJoin(android.graphics.Paint.Join.MITER);
            } else if (i2 == 2) {
                rendererState.getHighResolutionOutputSizeshNQ4ISI.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            } else if (i2 == 3) {
                rendererState.getHighResolutionOutputSizeshNQ4ISI.setStrokeJoin(android.graphics.Paint.Join.BEVEL);
            }
        }
        if ((style.ArtificialStackFrames & 256) != 0) {
            rendererState.getInputFormats.init = style.init;
            rendererState.getHighResolutionOutputSizeshNQ4ISI.setStrokeMiter(style.init.floatValue());
        }
        if ((style.ArtificialStackFrames & 512) != 0) {
            rendererState.getInputFormats.getARTIFICIAL_FRAME_PACKAGE_NAME = style.getARTIFICIAL_FRAME_PACKAGE_NAME;
        }
        if ((style.ArtificialStackFrames & okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) != 0) {
            rendererState.getInputFormats._CREATION = style._CREATION;
        }
        android.graphics.Typeface typeface = null;
        if ((style.ArtificialStackFrames & 1536) != 0) {
            if (rendererState.getInputFormats.getARTIFICIAL_FRAME_PACKAGE_NAME == null) {
                rendererState.getHighResolutionOutputSizeshNQ4ISI.setPathEffect(null);
            } else {
                int length = rendererState.getInputFormats.getARTIFICIAL_FRAME_PACKAGE_NAME.length;
                int i3 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i3];
                float f = 0.0f;
                for (int i4 = 0; i4 < i3; i4++) {
                    float Camera2StreamConfigurationMap = rendererState.getInputFormats.getARTIFICIAL_FRAME_PACKAGE_NAME[i4 % length].Camera2StreamConfigurationMap(this);
                    fArr[i4] = Camera2StreamConfigurationMap;
                    f += Camera2StreamConfigurationMap;
                }
                if (f == 0.0f) {
                    rendererState.getHighResolutionOutputSizeshNQ4ISI.setPathEffect(null);
                } else {
                    float Camera2StreamConfigurationMap2 = rendererState.getInputFormats._CREATION.Camera2StreamConfigurationMap(this);
                    if (Camera2StreamConfigurationMap2 < 0.0f) {
                        Camera2StreamConfigurationMap2 = (Camera2StreamConfigurationMap2 % f) + f;
                    }
                    rendererState.getHighResolutionOutputSizeshNQ4ISI.setPathEffect(new android.graphics.DashPathEffect(fArr, Camera2StreamConfigurationMap2));
                }
            }
        }
        if ((style.ArtificialStackFrames & okhttp3.internal.http2.Http2Stream.EMIT_BUFFER_SIZE) != 0) {
            float textSize = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor.getTextSize();
            rendererState.getInputFormats.getOutputSizes = style.getOutputSizes;
            android.graphics.Paint paint = rendererState.getHighSpeedVideoFpsRangesFor;
            com.caverock.androidsvg.SVG.Length length2 = style.getOutputSizes;
            if (length2.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent) {
                highSpeedVideoFpsRangesFor = (length2.getHighSpeedVideoFpsRanges * textSize) / 100.0f;
            } else {
                highSpeedVideoFpsRangesFor = length2.getHighSpeedVideoFpsRangesFor(this);
            }
            paint.setTextSize(highSpeedVideoFpsRangesFor);
            android.graphics.Paint paint2 = rendererState.getHighResolutionOutputSizeshNQ4ISI;
            com.caverock.androidsvg.SVG.Length length3 = style.getOutputSizes;
            if (length3.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent) {
                highSpeedVideoFpsRangesFor2 = (length3.getHighSpeedVideoFpsRanges * textSize) / 100.0f;
            } else {
                highSpeedVideoFpsRangesFor2 = length3.getHighSpeedVideoFpsRangesFor(this);
            }
            paint2.setTextSize(highSpeedVideoFpsRangesFor2);
        }
        if ((style.ArtificialStackFrames & 8192) != 0) {
            rendererState.getInputFormats.getInputSizeshNQ4ISI = style.getInputSizeshNQ4ISI;
        }
        if ((style.ArtificialStackFrames & 32768) != 0) {
            if (style.getOutputMinFrameDurationlomOqCM.intValue() == -1 && rendererState.getInputFormats.getOutputMinFrameDurationlomOqCM.intValue() > 100) {
                com.caverock.androidsvg.SVG.Style style2 = rendererState.getInputFormats;
                style2.getOutputMinFrameDurationlomOqCM = java.lang.Integer.valueOf(style2.getOutputMinFrameDurationlomOqCM.intValue() - 100);
            } else if (style.getOutputMinFrameDurationlomOqCM.intValue() == 1 && rendererState.getInputFormats.getOutputMinFrameDurationlomOqCM.intValue() < 900) {
                com.caverock.androidsvg.SVG.Style style3 = rendererState.getInputFormats;
                style3.getOutputMinFrameDurationlomOqCM = java.lang.Integer.valueOf(style3.getOutputMinFrameDurationlomOqCM.intValue() + 100);
            } else {
                rendererState.getInputFormats.getOutputMinFrameDurationlomOqCM = style.getOutputMinFrameDurationlomOqCM;
            }
        }
        if ((style.ArtificialStackFrames & 65536) != 0) {
            rendererState.getInputFormats.getOutputStallDurationlomOqCM = style.getOutputStallDurationlomOqCM;
        }
        if ((style.ArtificialStackFrames & 106496) != 0) {
            if (rendererState.getInputFormats.getInputSizeshNQ4ISI != null && this.getHighResolutionOutputSizeshNQ4ISI != null) {
                com.caverock.androidsvg.SVGExternalFileResolver highSpeedVideoFpsRanges = com.caverock.androidsvg.SVG.getHighSpeedVideoFpsRanges();
                for (java.lang.String str : rendererState.getInputFormats.getInputSizeshNQ4ISI) {
                    android.graphics.Typeface highSpeedVideoSizes = getHighSpeedVideoSizes(str, rendererState.getInputFormats.getOutputMinFrameDurationlomOqCM, rendererState.getInputFormats.getOutputStallDurationlomOqCM);
                    typeface = (highSpeedVideoSizes != null || highSpeedVideoFpsRanges == null) ? highSpeedVideoSizes : highSpeedVideoFpsRanges.resolveFont(str, rendererState.getInputFormats.getOutputMinFrameDurationlomOqCM.intValue(), java.lang.String.valueOf(rendererState.getInputFormats.getOutputStallDurationlomOqCM));
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                typeface = getHighSpeedVideoSizes("serif", rendererState.getInputFormats.getOutputMinFrameDurationlomOqCM, rendererState.getInputFormats.getOutputStallDurationlomOqCM);
            }
            rendererState.getHighSpeedVideoFpsRangesFor.setTypeface(typeface);
            rendererState.getHighResolutionOutputSizeshNQ4ISI.setTypeface(typeface);
        }
        if ((style.ArtificialStackFrames & 131072) != 0) {
            rendererState.getInputFormats.c = style.c;
            rendererState.getHighSpeedVideoFpsRangesFor.setStrikeThruText(style.c == com.caverock.androidsvg.SVG.Style.TextDecoration.LineThrough);
            rendererState.getHighSpeedVideoFpsRangesFor.setUnderlineText(style.c == com.caverock.androidsvg.SVG.Style.TextDecoration.Underline);
            rendererState.getHighResolutionOutputSizeshNQ4ISI.setStrikeThruText(style.c == com.caverock.androidsvg.SVG.Style.TextDecoration.LineThrough);
            rendererState.getHighResolutionOutputSizeshNQ4ISI.setUnderlineText(style.c == com.caverock.androidsvg.SVG.Style.TextDecoration.Underline);
        }
        if ((style.ArtificialStackFrames & 68719476736L) != 0) {
            rendererState.getInputFormats.getHighSpeedVideoFpsRanges = style.getHighSpeedVideoFpsRanges;
        }
        if ((style.ArtificialStackFrames & 262144) != 0) {
            rendererState.getInputFormats.d = style.d;
        }
        if ((style.ArtificialStackFrames & com.datadog.android.core.internal.persistence.file.FilePersistenceConfig.MAX_ITEM_SIZE) != 0) {
            rendererState.getInputFormats.getValidOutputFormatsForInputhNQ4ISI = style.getValidOutputFormatsForInputhNQ4ISI;
        }
        if ((style.ArtificialStackFrames & 2097152) != 0) {
            rendererState.getInputFormats.unwrapAs = style.unwrapAs;
        }
        if ((style.ArtificialStackFrames & 4194304) != 0) {
            rendererState.getInputFormats.isOutputSupportedFor = style.isOutputSupportedFor;
        }
        if ((style.ArtificialStackFrames & 8388608) != 0) {
            rendererState.getInputFormats.getOutputStallDuration = style.getOutputStallDuration;
        }
        if ((style.ArtificialStackFrames & 16777216) != 0) {
            rendererState.getInputFormats.getHighSpeedVideoSizesFor = style.getHighSpeedVideoSizesFor;
        }
        if ((style.ArtificialStackFrames & 33554432) != 0) {
            rendererState.getInputFormats.exchange = style.exchange;
        }
        if ((style.ArtificialStackFrames & com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) != 0) {
            rendererState.getInputFormats.Camera2StreamConfigurationMap = style.Camera2StreamConfigurationMap;
        }
        if ((style.ArtificialStackFrames & 268435456) != 0) {
            rendererState.getInputFormats.getHighSpeedVideoFpsRangesFor = style.getHighSpeedVideoFpsRangesFor;
        }
        if ((style.ArtificialStackFrames & com.datadog.android.core.internal.persistence.file.FilePersistenceConfig.MAX_DISK_SPACE) != 0) {
            rendererState.getInputFormats.getHighSpeedVideoSizes = style.getHighSpeedVideoSizes;
        }
        if ((style.ArtificialStackFrames & com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.Colors.SHADOW_COLOR) != 0) {
            rendererState.getInputFormats.isOutputSupportedForhNQ4ISI = style.isOutputSupportedForhNQ4ISI;
        }
        if ((style.ArtificialStackFrames & 67108864) != 0) {
            rendererState.getInputFormats.coroutineCreation = style.coroutineCreation;
        }
        if ((style.ArtificialStackFrames & 134217728) != 0) {
            rendererState.getInputFormats.coroutineBoundary = style.coroutineBoundary;
        }
        if ((style.ArtificialStackFrames & 8589934592L) != 0) {
            rendererState.getInputFormats.AMEXKernela = style.AMEXKernela;
        }
        if ((style.ArtificialStackFrames & 17179869184L) != 0) {
            rendererState.getInputFormats.release = style.release;
        }
        if ((style.ArtificialStackFrames & 137438953472L) != 0) {
            rendererState.getInputFormats.getOutputSizeshNQ4ISI = style.getOutputSizeshNQ4ISI;
        }
    }
}
