package com.caverock.androidsvg;

/* loaded from: classes7.dex */
public class SVG {
    private static boolean getHighSpeedVideoFpsRangesFor = true;
    private static com.caverock.androidsvg.SVGExternalFileResolver getOutputFormats;
    com.caverock.androidsvg.SVG.Svg getHighSpeedVideoSizes = null;
    java.lang.String getHighSpeedVideoFpsRanges = "";
    java.lang.String Camera2StreamConfigurationMap = "";
    private float getHighSpeedVideoSizesFor = 96.0f;
    com.caverock.androidsvg.CSSParser.Ruleset getHighResolutionOutputSizeshNQ4ISI = new com.caverock.androidsvg.CSSParser.Ruleset();
    private java.util.Map<java.lang.String, com.caverock.androidsvg.SVG.SvgElementBase> getOutputMinFrameDuration = new java.util.HashMap();

    enum GradientSpread {
        pad,
        reflect,
        repeat
    }

    interface HasTransform {
        void getHighSpeedVideoFpsRanges(android.graphics.Matrix matrix);
    }

    interface NotDirectlyRendered {
    }

    interface PathInterface {
        void Camera2StreamConfigurationMap(float f, float f2, float f3, float f4);

        void getHighResolutionOutputSizeshNQ4ISI();

        void getHighSpeedVideoFpsRanges(float f, float f2);

        void getHighSpeedVideoFpsRanges(float f, float f2, float f3, float f4, float f5, float f6);

        void getHighSpeedVideoSizes(float f, float f2);

        void getHighSpeedVideoSizes(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);
    }

    interface SvgConditional {
        java.lang.String Camera2StreamConfigurationMap();

        void Camera2StreamConfigurationMap(java.util.Set<java.lang.String> set);

        void getHighSpeedVideoFpsRanges(java.lang.String str);

        void getHighSpeedVideoFpsRanges(java.util.Set<java.lang.String> set);

        java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor();

        void getHighSpeedVideoFpsRangesFor(java.util.Set<java.lang.String> set);

        java.util.Set<java.lang.String> getHighSpeedVideoSizes();

        void getHighSpeedVideoSizes(java.util.Set<java.lang.String> set);

        java.util.Set<java.lang.String> getInputSizeshNQ4ISI();

        java.util.Set<java.lang.String> getOutputFormats();
    }

    interface SvgContainer {
        void getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVG.SvgObject svgObject) throws com.caverock.androidsvg.SVGParseException;

        java.util.List<com.caverock.androidsvg.SVG.SvgObject> getHighSpeedVideoFpsRanges();
    }

    interface TextChild {
        com.caverock.androidsvg.SVG.TextRoot getOutputMinFrameDuration();
    }

    interface TextRoot {
    }

    enum Unit {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    SVG() {
    }

    public static com.caverock.androidsvg.SVG getFromInputStream(java.io.InputStream inputStream) throws com.caverock.androidsvg.SVGParseException {
        return new com.caverock.androidsvg.SVGParser().getHighSpeedVideoFpsRangesFor(inputStream, getHighSpeedVideoFpsRangesFor);
    }

    public static com.caverock.androidsvg.SVG getFromString(java.lang.String str) throws com.caverock.androidsvg.SVGParseException {
        return new com.caverock.androidsvg.SVGParser().getHighSpeedVideoFpsRangesFor(new java.io.ByteArrayInputStream(str.getBytes()), getHighSpeedVideoFpsRangesFor);
    }

    public static com.caverock.androidsvg.SVG getFromResource(android.content.Context context, int i) throws com.caverock.androidsvg.SVGParseException {
        return getFromResource(context.getResources(), i);
    }

    public static com.caverock.androidsvg.SVG getFromResource(android.content.res.Resources resources, int i) throws com.caverock.androidsvg.SVGParseException {
        com.caverock.androidsvg.SVGParser sVGParser = new com.caverock.androidsvg.SVGParser();
        java.io.InputStream openRawResource = resources.openRawResource(i);
        try {
            return sVGParser.getHighSpeedVideoFpsRangesFor(openRawResource, getHighSpeedVideoFpsRangesFor);
        } finally {
            try {
                openRawResource.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static com.caverock.androidsvg.SVG getFromAsset(android.content.res.AssetManager assetManager, java.lang.String str) throws com.caverock.androidsvg.SVGParseException, java.io.IOException {
        com.caverock.androidsvg.SVGParser sVGParser = new com.caverock.androidsvg.SVGParser();
        java.io.InputStream open = assetManager.open(str);
        try {
            return sVGParser.getHighSpeedVideoFpsRangesFor(open, getHighSpeedVideoFpsRangesFor);
        } finally {
            try {
                open.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public static void setInternalEntitiesEnabled(boolean z) {
        getHighSpeedVideoFpsRangesFor = z;
    }

    public static boolean isInternalEntitiesEnabled() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static void registerExternalFileResolver(com.caverock.androidsvg.SVGExternalFileResolver sVGExternalFileResolver) {
        getOutputFormats = sVGExternalFileResolver;
    }

    public static void deregisterExternalFileResolver() {
        getOutputFormats = null;
    }

    public void setRenderDPI(float f) {
        this.getHighSpeedVideoSizesFor = f;
    }

    public float getRenderDPI() {
        return this.getHighSpeedVideoSizesFor;
    }

    public android.graphics.Picture renderToPicture() {
        return renderToPicture(null);
    }

    public android.graphics.Picture renderToPicture(int i, int i2) {
        return renderToPicture(i, i2, null);
    }

    public android.graphics.Picture renderToPicture(com.caverock.androidsvg.RenderOptions renderOptions) {
        com.caverock.androidsvg.SVG.Box box = (renderOptions == null || !renderOptions.hasViewBox()) ? this.getHighSpeedVideoSizes.getOutputMinFrameDuration : renderOptions.getHighSpeedVideoSizes;
        if (renderOptions != null && renderOptions.hasViewPort()) {
            com.caverock.androidsvg.SVG.Box box2 = renderOptions.getInputSizeshNQ4ISI;
            float f = box2.Camera2StreamConfigurationMap + box2.getHighResolutionOutputSizeshNQ4ISI;
            com.caverock.androidsvg.SVG.Box box3 = renderOptions.getInputSizeshNQ4ISI;
            return renderToPicture((int) java.lang.Math.ceil(f), (int) java.lang.Math.ceil(box3.getHighSpeedVideoFpsRanges + box3.getHighSpeedVideoSizes), renderOptions);
        }
        if (this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap != null && this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI != com.caverock.androidsvg.SVG.Unit.percent && this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges != null && this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI != com.caverock.androidsvg.SVG.Unit.percent) {
            return renderToPicture((int) java.lang.Math.ceil(this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor)), (int) java.lang.Math.ceil(this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor)), renderOptions);
        }
        if (this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap != null && box != null) {
            return renderToPicture((int) java.lang.Math.ceil(this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor)), (int) java.lang.Math.ceil((box.getHighSpeedVideoSizes * r1) / box.getHighResolutionOutputSizeshNQ4ISI), renderOptions);
        }
        if (this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges != null && box != null) {
            return renderToPicture((int) java.lang.Math.ceil((box.getHighResolutionOutputSizeshNQ4ISI * r1) / box.getHighSpeedVideoSizes), (int) java.lang.Math.ceil(this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor)), renderOptions);
        }
        return renderToPicture(512, 512, renderOptions);
    }

    public android.graphics.Picture renderToPicture(int i, int i2, com.caverock.androidsvg.RenderOptions renderOptions) {
        android.graphics.Picture picture = new android.graphics.Picture();
        android.graphics.Canvas beginRecording = picture.beginRecording(i, i2);
        if (renderOptions == null || renderOptions.getInputSizeshNQ4ISI == null) {
            renderOptions = renderOptions == null ? new com.caverock.androidsvg.RenderOptions() : new com.caverock.androidsvg.RenderOptions(renderOptions);
            renderOptions.viewPort(0.0f, 0.0f, i, i2);
        }
        new com.caverock.androidsvg.SVGAndroidRenderer(beginRecording, this.getHighSpeedVideoSizesFor).getHighSpeedVideoFpsRangesFor(this, renderOptions);
        picture.endRecording();
        return picture;
    }

    public android.graphics.Picture renderViewToPicture(java.lang.String str, int i, int i2) {
        com.caverock.androidsvg.RenderOptions renderOptions = new com.caverock.androidsvg.RenderOptions();
        renderOptions.view(str).viewPort(0.0f, 0.0f, i, i2);
        android.graphics.Picture picture = new android.graphics.Picture();
        new com.caverock.androidsvg.SVGAndroidRenderer(picture.beginRecording(i, i2), this.getHighSpeedVideoSizesFor).getHighSpeedVideoFpsRangesFor(this, renderOptions);
        picture.endRecording();
        return picture;
    }

    public void renderToCanvas(android.graphics.Canvas canvas) {
        renderToCanvas(canvas, (com.caverock.androidsvg.RenderOptions) null);
    }

    public void renderToCanvas(android.graphics.Canvas canvas, android.graphics.RectF rectF) {
        com.caverock.androidsvg.RenderOptions renderOptions = new com.caverock.androidsvg.RenderOptions();
        if (rectF != null) {
            renderOptions.viewPort(rectF.left, rectF.top, rectF.width(), rectF.height());
        } else {
            renderOptions.viewPort(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new com.caverock.androidsvg.SVGAndroidRenderer(canvas, this.getHighSpeedVideoSizesFor).getHighSpeedVideoFpsRangesFor(this, renderOptions);
    }

    public void renderToCanvas(android.graphics.Canvas canvas, com.caverock.androidsvg.RenderOptions renderOptions) {
        if (renderOptions == null) {
            renderOptions = new com.caverock.androidsvg.RenderOptions();
        }
        if (!renderOptions.hasViewPort()) {
            renderOptions.viewPort(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new com.caverock.androidsvg.SVGAndroidRenderer(canvas, this.getHighSpeedVideoSizesFor).getHighSpeedVideoFpsRangesFor(this, renderOptions);
    }

    public void renderViewToCanvas(java.lang.String str, android.graphics.Canvas canvas) {
        renderToCanvas(canvas, com.caverock.androidsvg.RenderOptions.create().view(str));
    }

    public void renderViewToCanvas(java.lang.String str, android.graphics.Canvas canvas, android.graphics.RectF rectF) {
        com.caverock.androidsvg.RenderOptions view = com.caverock.androidsvg.RenderOptions.create().view(str);
        if (rectF != null) {
            view.viewPort(rectF.left, rectF.top, rectF.width(), rectF.height());
        }
        renderToCanvas(canvas, view);
    }

    public static java.lang.String getVersion() {
        return "1.4";
    }

    public java.lang.String getDocumentTitle() {
        if (this.getHighSpeedVideoSizes == null) {
            throw new java.lang.IllegalArgumentException("SVG document is empty");
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.String getDocumentDescription() {
        if (this.getHighSpeedVideoSizes == null) {
            throw new java.lang.IllegalArgumentException("SVG document is empty");
        }
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.String getDocumentSVGVersion() {
        com.caverock.androidsvg.SVG.Svg svg = this.getHighSpeedVideoSizes;
        if (svg == null) {
            throw new java.lang.IllegalArgumentException("SVG document is empty");
        }
        return svg.getHighSpeedVideoFpsRangesFor;
    }

    public java.util.Set<java.lang.String> getViewList() {
        if (this.getHighSpeedVideoSizes == null) {
            throw new java.lang.IllegalArgumentException("SVG document is empty");
        }
        java.util.ArrayList<com.caverock.androidsvg.SVG.View> arrayList = new java.util.ArrayList();
        getHighSpeedVideoFpsRanges(arrayList, this.getHighSpeedVideoSizes, "view");
        java.util.HashSet hashSet = new java.util.HashSet(arrayList.size());
        for (com.caverock.androidsvg.SVG.View view : arrayList) {
            if (view.getValidOutputFormatsForInputhNQ4ISI != null) {
                hashSet.add(view.getValidOutputFormatsForInputhNQ4ISI);
            }
        }
        return hashSet;
    }

    public float getDocumentWidth() {
        if (this.getHighSpeedVideoSizes == null) {
            throw new java.lang.IllegalArgumentException("SVG document is empty");
        }
        return Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor).getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setDocumentWidth(float f) {
        com.caverock.androidsvg.SVG.Svg svg = this.getHighSpeedVideoSizes;
        if (svg == null) {
            throw new java.lang.IllegalArgumentException("SVG document is empty");
        }
        svg.Camera2StreamConfigurationMap = new com.caverock.androidsvg.SVG.Length(f);
    }

    public void setDocumentWidth(java.lang.String str) throws com.caverock.androidsvg.SVGParseException {
        com.caverock.androidsvg.SVG.Svg svg = this.getHighSpeedVideoSizes;
        if (svg == null) {
            throw new java.lang.IllegalArgumentException("SVG document is empty");
        }
        svg.Camera2StreamConfigurationMap = com.caverock.androidsvg.SVGParser.getHighSpeedVideoFpsRanges(str);
    }

    public float getDocumentHeight() {
        if (this.getHighSpeedVideoSizes == null) {
            throw new java.lang.IllegalArgumentException("SVG document is empty");
        }
        return Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor).getHighSpeedVideoSizes;
    }

    public void setDocumentHeight(float f) {
        com.caverock.androidsvg.SVG.Svg svg = this.getHighSpeedVideoSizes;
        if (svg == null) {
            throw new java.lang.IllegalArgumentException("SVG document is empty");
        }
        svg.getHighSpeedVideoFpsRanges = new com.caverock.androidsvg.SVG.Length(f);
    }

    public void setDocumentHeight(java.lang.String str) throws com.caverock.androidsvg.SVGParseException {
        com.caverock.androidsvg.SVG.Svg svg = this.getHighSpeedVideoSizes;
        if (svg == null) {
            throw new java.lang.IllegalArgumentException("SVG document is empty");
        }
        svg.getHighSpeedVideoFpsRanges = com.caverock.androidsvg.SVGParser.getHighSpeedVideoFpsRanges(str);
    }

    public void setDocumentViewBox(float f, float f2, float f3, float f4) {
        com.caverock.androidsvg.SVG.Svg svg = this.getHighSpeedVideoSizes;
        if (svg == null) {
            throw new java.lang.IllegalArgumentException("SVG document is empty");
        }
        svg.getOutputMinFrameDuration = new com.caverock.androidsvg.SVG.Box(f, f2, f3, f4);
    }

    public android.graphics.RectF getDocumentViewBox() {
        com.caverock.androidsvg.SVG.Svg svg = this.getHighSpeedVideoSizes;
        if (svg == null) {
            throw new java.lang.IllegalArgumentException("SVG document is empty");
        }
        if (svg.getOutputMinFrameDuration == null) {
            return null;
        }
        com.caverock.androidsvg.SVG.Box box = this.getHighSpeedVideoSizes.getOutputMinFrameDuration;
        return new android.graphics.RectF(box.Camera2StreamConfigurationMap, box.getHighSpeedVideoFpsRanges, box.Camera2StreamConfigurationMap + box.getHighResolutionOutputSizeshNQ4ISI, box.getHighSpeedVideoFpsRanges + box.getHighSpeedVideoSizes);
    }

    public void setDocumentPreserveAspectRatio(com.caverock.androidsvg.PreserveAspectRatio preserveAspectRatio) {
        com.caverock.androidsvg.SVG.Svg svg = this.getHighSpeedVideoSizes;
        if (svg == null) {
            throw new java.lang.IllegalArgumentException("SVG document is empty");
        }
        svg.coroutineBoundary = preserveAspectRatio;
    }

    public com.caverock.androidsvg.PreserveAspectRatio getDocumentPreserveAspectRatio() {
        com.caverock.androidsvg.SVG.Svg svg = this.getHighSpeedVideoSizes;
        if (svg == null) {
            throw new java.lang.IllegalArgumentException("SVG document is empty");
        }
        if (svg.coroutineBoundary == null) {
            return null;
        }
        return this.getHighSpeedVideoSizes.coroutineBoundary;
    }

    public float getDocumentAspectRatio() {
        float f;
        float f2;
        com.caverock.androidsvg.SVG.Svg svg = this.getHighSpeedVideoSizes;
        if (svg == null) {
            throw new java.lang.IllegalArgumentException("SVG document is empty");
        }
        com.caverock.androidsvg.SVG.Length length = svg.Camera2StreamConfigurationMap;
        com.caverock.androidsvg.SVG.Length length2 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
        if (length == null || length2 == null || length.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent || length2.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent) {
            if (this.getHighSpeedVideoSizes.getOutputMinFrameDuration == null || this.getHighSpeedVideoSizes.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI == 0.0f || this.getHighSpeedVideoSizes.getOutputMinFrameDuration.getHighSpeedVideoSizes == 0.0f) {
                return -1.0f;
            }
            f = this.getHighSpeedVideoSizes.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI;
            f2 = this.getHighSpeedVideoSizes.getOutputMinFrameDuration.getHighSpeedVideoSizes;
        } else {
            if (length.getHighSpeedVideoFpsRanges == 0.0f || length2.getHighSpeedVideoFpsRanges == 0.0f) {
                return -1.0f;
            }
            f = length.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor);
            f2 = length2.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor);
        }
        return f / f2;
    }

    private com.caverock.androidsvg.SVG.Box Camera2StreamConfigurationMap(float f) {
        float f2;
        com.caverock.androidsvg.SVG.Length length = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
        com.caverock.androidsvg.SVG.Length length2 = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
        if (length == null || length.getHighSpeedVideoFpsRanges == 0.0f || length.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent || length.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.em || length.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.ex) {
            return new com.caverock.androidsvg.SVG.Box(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float Camera2StreamConfigurationMap = length.Camera2StreamConfigurationMap(f);
        if (length2 != null) {
            if (length2.getHighSpeedVideoFpsRanges == 0.0f || length2.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.percent || length2.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.em || length2.getHighResolutionOutputSizeshNQ4ISI == com.caverock.androidsvg.SVG.Unit.ex) {
                return new com.caverock.androidsvg.SVG.Box(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            f2 = length2.Camera2StreamConfigurationMap(f);
        } else {
            f2 = this.getHighSpeedVideoSizes.getOutputMinFrameDuration != null ? (this.getHighSpeedVideoSizes.getOutputMinFrameDuration.getHighSpeedVideoSizes * Camera2StreamConfigurationMap) / this.getHighSpeedVideoSizes.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI : Camera2StreamConfigurationMap;
        }
        return new com.caverock.androidsvg.SVG.Box(0.0f, 0.0f, Camera2StreamConfigurationMap, f2);
    }

    final void getHighSpeedVideoSizes() {
        com.caverock.androidsvg.CSSParser.Ruleset ruleset = this.getHighResolutionOutputSizeshNQ4ISI;
        com.caverock.androidsvg.CSSParser.Source source = com.caverock.androidsvg.CSSParser.Source.RenderOptions;
        java.util.List<com.caverock.androidsvg.CSSParser.Rule> list = ruleset.Camera2StreamConfigurationMap;
        if (list != null) {
            java.util.Iterator<com.caverock.androidsvg.CSSParser.Rule> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getHighSpeedVideoFpsRanges == source) {
                    it.remove();
                }
            }
        }
    }

    static class Box {
        float Camera2StreamConfigurationMap;
        float getHighResolutionOutputSizeshNQ4ISI;
        float getHighSpeedVideoFpsRanges;
        float getHighSpeedVideoSizes;

        Box(float f, float f2, float f3, float f4) {
            this.Camera2StreamConfigurationMap = f;
            this.getHighSpeedVideoFpsRanges = f2;
            this.getHighResolutionOutputSizeshNQ4ISI = f3;
            this.getHighSpeedVideoSizes = f4;
        }

        Box(com.caverock.androidsvg.SVG.Box box) {
            this.Camera2StreamConfigurationMap = box.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = box.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = box.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = box.getHighSpeedVideoSizes;
        }

        static com.caverock.androidsvg.SVG.Box Camera2StreamConfigurationMap(float f, float f2, float f3, float f4) {
            return new com.caverock.androidsvg.SVG.Box(f, f2, f3 - f, f4 - f2);
        }

        final void Camera2StreamConfigurationMap(com.caverock.androidsvg.SVG.Box box) {
            float f = box.Camera2StreamConfigurationMap;
            if (f < this.Camera2StreamConfigurationMap) {
                this.Camera2StreamConfigurationMap = f;
            }
            float f2 = box.getHighSpeedVideoFpsRanges;
            if (f2 < this.getHighSpeedVideoFpsRanges) {
                this.getHighSpeedVideoFpsRanges = f2;
            }
            float f3 = box.Camera2StreamConfigurationMap;
            float f4 = box.getHighResolutionOutputSizeshNQ4ISI;
            float f5 = f3 + f4;
            float f6 = this.Camera2StreamConfigurationMap;
            if (f5 > this.getHighResolutionOutputSizeshNQ4ISI + f6) {
                this.getHighResolutionOutputSizeshNQ4ISI = (f3 + f4) - f6;
            }
            float f7 = box.getHighSpeedVideoFpsRanges;
            float f8 = box.getHighSpeedVideoSizes;
            float f9 = f7 + f8;
            float f10 = this.getHighSpeedVideoFpsRanges;
            if (f9 > this.getHighSpeedVideoSizes + f10) {
                this.getHighSpeedVideoSizes = (f7 + f8) - f10;
            }
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(" ");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(" ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(" ");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append("]");
            return sb.toString();
        }
    }

    static class Style implements java.lang.Cloneable {
        java.lang.Float AMEXKernel;
        com.caverock.androidsvg.SVG.SvgPaint AMEXKernela;
        long ArtificialStackFrames = 0;
        com.caverock.androidsvg.SVG.CSSClipRect Camera2StreamConfigurationMap;
        com.caverock.androidsvg.SVG.SvgPaint CoroutineDebuggingKt;
        com.caverock.androidsvg.SVG.Style.LineCap _BOUNDARY;
        com.caverock.androidsvg.SVG.Length _CREATION;

        /* renamed from: a, reason: collision with root package name */
        com.caverock.androidsvg.SVG.Style.LineJoin f2840a;
        java.lang.Float accessartificialFrame;
        com.caverock.androidsvg.SVG.SvgPaint b;
        com.caverock.androidsvg.SVG.Style.TextDecoration c;
        java.lang.Float coroutineBoundary;
        com.caverock.androidsvg.SVG.SvgPaint coroutineCreation;
        com.caverock.androidsvg.SVG.Style.TextAnchor d;
        java.lang.Boolean exchange;
        com.caverock.androidsvg.SVG.Length[] getARTIFICIAL_FRAME_PACKAGE_NAME;
        com.caverock.androidsvg.SVG.Colour getHighResolutionOutputSizeshNQ4ISI;
        com.caverock.androidsvg.SVG.Style.TextDirection getHighSpeedVideoFpsRanges;
        java.lang.String getHighSpeedVideoFpsRangesFor;
        com.caverock.androidsvg.SVG.Style.FillRule getHighSpeedVideoSizes;
        java.lang.Boolean getHighSpeedVideoSizesFor;
        com.caverock.androidsvg.SVG.SvgPaint getInputFormats;
        java.util.List<java.lang.String> getInputSizeshNQ4ISI;
        java.lang.Float getOutputFormats;
        com.caverock.androidsvg.SVG.Style.FillRule getOutputMinFrameDuration;
        java.lang.Integer getOutputMinFrameDurationlomOqCM;
        com.caverock.androidsvg.SVG.Length getOutputSizes;
        com.caverock.androidsvg.SVG.Style.RenderQuality getOutputSizeshNQ4ISI;
        java.lang.String getOutputStallDuration;
        com.caverock.androidsvg.SVG.Style.FontStyle getOutputStallDurationlomOqCM;
        java.lang.Boolean getValidOutputFormatsForInputhNQ4ISI;
        java.lang.Float init;
        java.lang.String isOutputSupportedFor;
        java.lang.String isOutputSupportedForhNQ4ISI;
        com.caverock.androidsvg.SVG.Length kernelVersion;
        java.lang.Float release;
        com.caverock.androidsvg.SVG.Style.VectorEffect resetTransaction;
        java.lang.Float toString;
        java.lang.String unwrapAs;

        public enum FillRule {
            NonZero,
            EvenOdd
        }

        public enum FontStyle {
            Normal,
            Italic,
            Oblique
        }

        public enum LineCap {
            Butt,
            Round,
            Square
        }

        public enum LineJoin {
            Miter,
            Round,
            Bevel
        }

        public enum RenderQuality {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        public enum TextAnchor {
            Start,
            Middle,
            End
        }

        public enum TextDecoration {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        public enum TextDirection {
            LTR,
            RTL
        }

        public enum VectorEffect {
            None,
            NonScalingStroke
        }

        Style() {
        }

        static com.caverock.androidsvg.SVG.Style getHighSpeedVideoSizes() {
            com.caverock.androidsvg.SVG.Style style = new com.caverock.androidsvg.SVG.Style();
            style.ArtificialStackFrames = -1L;
            style.getInputFormats = com.caverock.androidsvg.SVG.Colour.getHighSpeedVideoSizes;
            style.getOutputMinFrameDuration = com.caverock.androidsvg.SVG.Style.FillRule.NonZero;
            java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
            style.getOutputFormats = valueOf;
            style.b = null;
            style.AMEXKernel = valueOf;
            style.kernelVersion = new com.caverock.androidsvg.SVG.Length(1.0f);
            style._BOUNDARY = com.caverock.androidsvg.SVG.Style.LineCap.Butt;
            style.f2840a = com.caverock.androidsvg.SVG.Style.LineJoin.Miter;
            style.init = java.lang.Float.valueOf(4.0f);
            style.getARTIFICIAL_FRAME_PACKAGE_NAME = null;
            style._CREATION = new com.caverock.androidsvg.SVG.Length(0.0f);
            style.toString = valueOf;
            style.getHighResolutionOutputSizeshNQ4ISI = com.caverock.androidsvg.SVG.Colour.getHighSpeedVideoSizes;
            style.getInputSizeshNQ4ISI = null;
            style.getOutputSizes = new com.caverock.androidsvg.SVG.Length(12.0f, com.caverock.androidsvg.SVG.Unit.pt);
            style.getOutputMinFrameDurationlomOqCM = 400;
            style.getOutputStallDurationlomOqCM = com.caverock.androidsvg.SVG.Style.FontStyle.Normal;
            style.c = com.caverock.androidsvg.SVG.Style.TextDecoration.None;
            style.getHighSpeedVideoFpsRanges = com.caverock.androidsvg.SVG.Style.TextDirection.LTR;
            style.d = com.caverock.androidsvg.SVG.Style.TextAnchor.Start;
            style.getValidOutputFormatsForInputhNQ4ISI = java.lang.Boolean.TRUE;
            style.Camera2StreamConfigurationMap = null;
            style.unwrapAs = null;
            style.isOutputSupportedFor = null;
            style.getOutputStallDuration = null;
            style.getHighSpeedVideoSizesFor = java.lang.Boolean.TRUE;
            style.exchange = java.lang.Boolean.TRUE;
            style.coroutineCreation = com.caverock.androidsvg.SVG.Colour.getHighSpeedVideoSizes;
            style.coroutineBoundary = valueOf;
            style.getHighSpeedVideoFpsRangesFor = null;
            style.getHighSpeedVideoSizes = com.caverock.androidsvg.SVG.Style.FillRule.NonZero;
            style.isOutputSupportedForhNQ4ISI = null;
            style.CoroutineDebuggingKt = null;
            style.accessartificialFrame = valueOf;
            style.AMEXKernela = null;
            style.release = valueOf;
            style.resetTransaction = com.caverock.androidsvg.SVG.Style.VectorEffect.None;
            style.getOutputSizeshNQ4ISI = com.caverock.androidsvg.SVG.Style.RenderQuality.auto;
            return style;
        }

        final void getHighSpeedVideoFpsRangesFor(boolean z) {
            this.getHighSpeedVideoSizesFor = java.lang.Boolean.TRUE;
            this.getValidOutputFormatsForInputhNQ4ISI = z ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.toString = java.lang.Float.valueOf(1.0f);
            this.coroutineCreation = com.caverock.androidsvg.SVG.Colour.getHighSpeedVideoSizes;
            this.coroutineBoundary = java.lang.Float.valueOf(1.0f);
            this.isOutputSupportedForhNQ4ISI = null;
            this.CoroutineDebuggingKt = null;
            this.accessartificialFrame = java.lang.Float.valueOf(1.0f);
            this.AMEXKernela = null;
            this.release = java.lang.Float.valueOf(1.0f);
            this.resetTransaction = com.caverock.androidsvg.SVG.Style.VectorEffect.None;
        }

        protected java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            com.caverock.androidsvg.SVG.Style style = (com.caverock.androidsvg.SVG.Style) super.clone();
            com.caverock.androidsvg.SVG.Length[] lengthArr = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
            if (lengthArr != null) {
                style.getARTIFICIAL_FRAME_PACKAGE_NAME = (com.caverock.androidsvg.SVG.Length[]) lengthArr.clone();
            }
            return style;
        }
    }

    static abstract class SvgPaint implements java.lang.Cloneable {
        SvgPaint() {
        }
    }

    static class Colour extends com.caverock.androidsvg.SVG.SvgPaint {
        int getHighSpeedVideoFpsRangesFor;
        static final com.caverock.androidsvg.SVG.Colour getHighSpeedVideoSizes = new com.caverock.androidsvg.SVG.Colour(-16777216);
        static final com.caverock.androidsvg.SVG.Colour getHighSpeedVideoFpsRanges = new com.caverock.androidsvg.SVG.Colour(0);

        Colour(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        public java.lang.String toString() {
            return java.lang.String.format("#%08x", java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor));
        }
    }

    static class CurrentColor extends com.caverock.androidsvg.SVG.SvgPaint {
        private static com.caverock.androidsvg.SVG.CurrentColor getHighSpeedVideoFpsRangesFor = new com.caverock.androidsvg.SVG.CurrentColor();

        private CurrentColor() {
        }

        static com.caverock.androidsvg.SVG.CurrentColor getHighResolutionOutputSizeshNQ4ISI() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }

    static class PaintReference extends com.caverock.androidsvg.SVG.SvgPaint {
        com.caverock.androidsvg.SVG.SvgPaint getHighSpeedVideoFpsRanges;
        java.lang.String getHighSpeedVideoFpsRangesFor;

        PaintReference(java.lang.String str, com.caverock.androidsvg.SVG.SvgPaint svgPaint) {
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighSpeedVideoFpsRanges = svgPaint;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(" ");
            sb.append(this.getHighSpeedVideoFpsRanges);
            return sb.toString();
        }
    }

    static class Length implements java.lang.Cloneable {
        com.caverock.androidsvg.SVG.Unit getHighResolutionOutputSizeshNQ4ISI;
        float getHighSpeedVideoFpsRanges;

        Length(float f, com.caverock.androidsvg.SVG.Unit unit) {
            this.getHighSpeedVideoFpsRanges = f;
            this.getHighResolutionOutputSizeshNQ4ISI = unit;
        }

        Length(float f) {
            this.getHighSpeedVideoFpsRanges = f;
            this.getHighResolutionOutputSizeshNQ4ISI = com.caverock.androidsvg.SVG.Unit.px;
        }

        final float getHighSpeedVideoFpsRangesFor(com.caverock.androidsvg.SVGAndroidRenderer sVGAndroidRenderer) {
            com.caverock.androidsvg.SVG.Box box;
            switch (com.caverock.androidsvg.SVG.AnonymousClass1.getHighSpeedVideoFpsRanges[this.getHighResolutionOutputSizeshNQ4ISI.ordinal()]) {
                case 9:
                    if (sVGAndroidRenderer.getHighSpeedVideoSizes.getInputSizeshNQ4ISI != null) {
                        box = sVGAndroidRenderer.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
                    } else {
                        box = sVGAndroidRenderer.getHighSpeedVideoSizes.getOutputMinFrameDuration;
                    }
                    if (box != null) {
                        break;
                    } else {
                        break;
                    }
            }
            return this.getHighSpeedVideoFpsRanges;
        }

        final float getHighSpeedVideoSizes(com.caverock.androidsvg.SVGAndroidRenderer sVGAndroidRenderer) {
            com.caverock.androidsvg.SVG.Box box;
            if (this.getHighResolutionOutputSizeshNQ4ISI != com.caverock.androidsvg.SVG.Unit.percent) {
                return getHighSpeedVideoFpsRangesFor(sVGAndroidRenderer);
            }
            if (sVGAndroidRenderer.getHighSpeedVideoSizes.getInputSizeshNQ4ISI != null) {
                box = sVGAndroidRenderer.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
            } else {
                box = sVGAndroidRenderer.getHighSpeedVideoSizes.getOutputMinFrameDuration;
            }
            if (box == null) {
                return this.getHighSpeedVideoFpsRanges;
            }
            return (this.getHighSpeedVideoFpsRanges * box.getHighSpeedVideoSizes) / 100.0f;
        }

        final float Camera2StreamConfigurationMap(com.caverock.androidsvg.SVGAndroidRenderer sVGAndroidRenderer) {
            com.caverock.androidsvg.SVG.Box box;
            if (this.getHighResolutionOutputSizeshNQ4ISI != com.caverock.androidsvg.SVG.Unit.percent) {
                return getHighSpeedVideoFpsRangesFor(sVGAndroidRenderer);
            }
            if (sVGAndroidRenderer.getHighSpeedVideoSizes.getInputSizeshNQ4ISI != null) {
                box = sVGAndroidRenderer.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
            } else {
                box = sVGAndroidRenderer.getHighSpeedVideoSizes.getOutputMinFrameDuration;
            }
            if (box == null) {
                return this.getHighSpeedVideoFpsRanges;
            }
            float f = box.getHighResolutionOutputSizeshNQ4ISI;
            if (f == box.getHighSpeedVideoSizes) {
                return (this.getHighSpeedVideoFpsRanges * f) / 100.0f;
            }
            return (this.getHighSpeedVideoFpsRanges * ((float) (java.lang.Math.sqrt((f * f) + (r6 * r6)) / 1.414213562373095d))) / 100.0f;
        }

        final float Camera2StreamConfigurationMap(float f) {
            int i = com.caverock.androidsvg.SVG.AnonymousClass1.getHighSpeedVideoFpsRanges[this.getHighResolutionOutputSizeshNQ4ISI.ordinal()];
            if (i == 1) {
                return this.getHighSpeedVideoFpsRanges;
            }
            switch (i) {
                case 4:
                    return this.getHighSpeedVideoFpsRanges * f;
                case 5:
                    return (this.getHighSpeedVideoFpsRanges * f) / 2.54f;
                case 6:
                    return (this.getHighSpeedVideoFpsRanges * f) / 25.4f;
                case 7:
                    return (this.getHighSpeedVideoFpsRanges * f) / 72.0f;
                case 8:
                    return (this.getHighSpeedVideoFpsRanges * f) / 6.0f;
                default:
                    return this.getHighSpeedVideoFpsRanges;
            }
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(java.lang.String.valueOf(this.getHighSpeedVideoFpsRanges));
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            return sb.toString();
        }
    }

    /* renamed from: com.caverock.androidsvg.SVG$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[com.caverock.androidsvg.SVG.Unit.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[com.caverock.androidsvg.SVG.Unit.px.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVG.Unit.em.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVG.Unit.ex.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVG.Unit.in.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVG.Unit.cm.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVG.Unit.mm.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVG.Unit.pt.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVG.Unit.pc.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVG.Unit.percent.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
        }
    }

    static class CSSClipRect {
        com.caverock.androidsvg.SVG.Length getHighResolutionOutputSizeshNQ4ISI;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoFpsRanges;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoFpsRangesFor;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoSizes;

        CSSClipRect(com.caverock.androidsvg.SVG.Length length, com.caverock.androidsvg.SVG.Length length2, com.caverock.androidsvg.SVG.Length length3, com.caverock.androidsvg.SVG.Length length4) {
            this.getHighSpeedVideoFpsRangesFor = length;
            this.getHighSpeedVideoFpsRanges = length2;
            this.getHighSpeedVideoSizes = length3;
            this.getHighResolutionOutputSizeshNQ4ISI = length4;
        }
    }

    static class SvgObject {
        com.caverock.androidsvg.SVG ArtificialStackFrames;
        com.caverock.androidsvg.SVG.SvgContainer CoroutineDebuggingKt;

        SvgObject() {
        }

        java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "";
        }
    }

    static abstract class SvgElementBase extends com.caverock.androidsvg.SVG.SvgObject {
        java.lang.String getValidOutputFormatsForInputhNQ4ISI = null;
        java.lang.Boolean toString = null;
        com.caverock.androidsvg.SVG.Style isOutputSupportedForhNQ4ISI = null;
        com.caverock.androidsvg.SVG.Style coroutineCreation = null;
        java.util.List<java.lang.String> unwrapAs = null;

        SvgElementBase() {
        }

        public java.lang.String toString() {
            return getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    static abstract class SvgElement extends com.caverock.androidsvg.SVG.SvgElementBase {
        com.caverock.androidsvg.SVG.Box isOutputSupportedFor = null;

        SvgElement() {
        }
    }

    static abstract class SvgConditionalElement extends com.caverock.androidsvg.SVG.SvgElement implements com.caverock.androidsvg.SVG.SvgConditional {
        java.util.Set<java.lang.String> getOutputMinFrameDuration = null;
        java.lang.String getOutputFormats = null;
        java.util.Set<java.lang.String> getOutputSizes = null;
        java.util.Set<java.lang.String> getOutputSizeshNQ4ISI = null;
        java.util.Set<java.lang.String> getInputFormats = null;

        SvgConditionalElement() {
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void getHighSpeedVideoFpsRanges(java.util.Set<java.lang.String> set) {
            this.getOutputMinFrameDuration = set;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final java.util.Set<java.lang.String> getHighSpeedVideoSizes() {
            return this.getOutputMinFrameDuration;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void getHighSpeedVideoFpsRanges(java.lang.String str) {
            this.getOutputFormats = str;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final java.lang.String Camera2StreamConfigurationMap() {
            return this.getOutputFormats;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void getHighSpeedVideoSizes(java.util.Set<java.lang.String> set) {
            this.getOutputSizes = set;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final java.util.Set<java.lang.String> getInputSizeshNQ4ISI() {
            return this.getOutputSizes;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void Camera2StreamConfigurationMap(java.util.Set<java.lang.String> set) {
            this.getOutputSizeshNQ4ISI = set;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final java.util.Set<java.lang.String> getOutputFormats() {
            return this.getOutputSizeshNQ4ISI;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void getHighSpeedVideoFpsRangesFor(java.util.Set<java.lang.String> set) {
            this.getInputFormats = set;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor() {
            return this.getInputFormats;
        }
    }

    static abstract class SvgConditionalContainer extends com.caverock.androidsvg.SVG.SvgElement implements com.caverock.androidsvg.SVG.SvgContainer, com.caverock.androidsvg.SVG.SvgConditional {
        java.util.List<com.caverock.androidsvg.SVG.SvgObject> getInputSizeshNQ4ISI = new java.util.ArrayList();
        java.util.Set<java.lang.String> getOutputSizes = null;
        java.lang.String getOutputMinFrameDurationlomOqCM = null;
        java.util.Set<java.lang.String> getOutputStallDurationlomOqCM = null;
        java.util.Set<java.lang.String> getOutputStallDuration = null;
        java.util.Set<java.lang.String> getOutputSizeshNQ4ISI = null;

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final java.util.Set<java.lang.String> getInputSizeshNQ4ISI() {
            return null;
        }

        SvgConditionalContainer() {
        }

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final java.util.List<com.caverock.androidsvg.SVG.SvgObject> getHighSpeedVideoFpsRanges() {
            return this.getInputSizeshNQ4ISI;
        }

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public void getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVG.SvgObject svgObject) throws com.caverock.androidsvg.SVGParseException {
            this.getInputSizeshNQ4ISI.add(svgObject);
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void getHighSpeedVideoFpsRanges(java.util.Set<java.lang.String> set) {
            this.getOutputSizes = set;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final java.util.Set<java.lang.String> getHighSpeedVideoSizes() {
            return this.getOutputSizes;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void getHighSpeedVideoFpsRanges(java.lang.String str) {
            this.getOutputMinFrameDurationlomOqCM = str;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final java.lang.String Camera2StreamConfigurationMap() {
            return this.getOutputMinFrameDurationlomOqCM;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void getHighSpeedVideoSizes(java.util.Set<java.lang.String> set) {
            this.getOutputStallDurationlomOqCM = set;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void Camera2StreamConfigurationMap(java.util.Set<java.lang.String> set) {
            this.getOutputStallDuration = set;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final java.util.Set<java.lang.String> getOutputFormats() {
            return this.getOutputStallDuration;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final void getHighSpeedVideoFpsRangesFor(java.util.Set<java.lang.String> set) {
            this.getOutputSizeshNQ4ISI = set;
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditional
        public final java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor() {
            return this.getOutputSizeshNQ4ISI;
        }
    }

    static abstract class SvgPreserveAspectRatioContainer extends com.caverock.androidsvg.SVG.SvgConditionalContainer {
        com.caverock.androidsvg.PreserveAspectRatio coroutineBoundary = null;

        SvgPreserveAspectRatioContainer() {
        }
    }

    static abstract class SvgViewBoxContainer extends com.caverock.androidsvg.SVG.SvgPreserveAspectRatioContainer {
        com.caverock.androidsvg.SVG.Box getOutputMinFrameDuration;

        SvgViewBoxContainer() {
        }
    }

    static class Svg extends com.caverock.androidsvg.SVG.SvgViewBoxContainer {
        com.caverock.androidsvg.SVG.Length Camera2StreamConfigurationMap;
        com.caverock.androidsvg.SVG.Length getHighResolutionOutputSizeshNQ4ISI;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoFpsRanges;
        public java.lang.String getHighSpeedVideoFpsRangesFor;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoSizes;

        Svg() {
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "svg";
        }
    }

    static class Group extends com.caverock.androidsvg.SVG.SvgConditionalContainer implements com.caverock.androidsvg.SVG.HasTransform {
        android.graphics.Matrix getHighSpeedVideoFpsRanges;

        Group() {
        }

        @Override // com.caverock.androidsvg.SVG.HasTransform
        public final void getHighSpeedVideoFpsRanges(android.graphics.Matrix matrix) {
            this.getHighSpeedVideoFpsRanges = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "group";
        }
    }

    static class Defs extends com.caverock.androidsvg.SVG.Group implements com.caverock.androidsvg.SVG.NotDirectlyRendered {
        Defs() {
        }

        @Override // com.caverock.androidsvg.SVG.Group, com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "defs";
        }
    }

    static abstract class GraphicsElement extends com.caverock.androidsvg.SVG.SvgConditionalElement implements com.caverock.androidsvg.SVG.HasTransform {
        android.graphics.Matrix getInputSizeshNQ4ISI;

        GraphicsElement() {
        }

        @Override // com.caverock.androidsvg.SVG.HasTransform
        public final void getHighSpeedVideoFpsRanges(android.graphics.Matrix matrix) {
            this.getInputSizeshNQ4ISI = matrix;
        }
    }

    static class Use extends com.caverock.androidsvg.SVG.Group {
        com.caverock.androidsvg.SVG.Length Camera2StreamConfigurationMap;
        com.caverock.androidsvg.SVG.Length getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String getHighSpeedVideoFpsRangesFor;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoSizes;
        com.caverock.androidsvg.SVG.Length getInputFormats;

        Use() {
        }

        @Override // com.caverock.androidsvg.SVG.Group, com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "use";
        }
    }

    static class Path extends com.caverock.androidsvg.SVG.GraphicsElement {
        com.caverock.androidsvg.SVG.PathDefinition getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Float getHighSpeedVideoFpsRangesFor;

        Path() {
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "path";
        }
    }

    static class Rect extends com.caverock.androidsvg.SVG.GraphicsElement {
        com.caverock.androidsvg.SVG.Length Camera2StreamConfigurationMap;
        com.caverock.androidsvg.SVG.Length getHighResolutionOutputSizeshNQ4ISI;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoFpsRanges;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoFpsRangesFor;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoSizes;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoSizesFor;

        Rect() {
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "rect";
        }
    }

    static class Circle extends com.caverock.androidsvg.SVG.GraphicsElement {
        com.caverock.androidsvg.SVG.Length Camera2StreamConfigurationMap;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoFpsRanges;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoFpsRangesFor;

        Circle() {
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.CIRCLE;
        }
    }

    static class Ellipse extends com.caverock.androidsvg.SVG.GraphicsElement {
        com.caverock.androidsvg.SVG.Length Camera2StreamConfigurationMap;
        com.caverock.androidsvg.SVG.Length getHighResolutionOutputSizeshNQ4ISI;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoFpsRangesFor;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoSizes;

        Ellipse() {
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "ellipse";
        }
    }

    static class Line extends com.caverock.androidsvg.SVG.GraphicsElement {
        com.caverock.androidsvg.SVG.Length Camera2StreamConfigurationMap;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoFpsRanges;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoFpsRangesFor;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoSizes;

        Line() {
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "line";
        }
    }

    static class PolyLine extends com.caverock.androidsvg.SVG.GraphicsElement {
        float[] getHighResolutionOutputSizeshNQ4ISI;

        PolyLine() {
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "polyline";
        }
    }

    static class Polygon extends com.caverock.androidsvg.SVG.PolyLine {
        Polygon() {
        }

        @Override // com.caverock.androidsvg.SVG.PolyLine, com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "polygon";
        }
    }

    static abstract class TextContainer extends com.caverock.androidsvg.SVG.SvgConditionalContainer {
        TextContainer() {
        }

        @Override // com.caverock.androidsvg.SVG.SvgConditionalContainer, com.caverock.androidsvg.SVG.SvgContainer
        public final void getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVG.SvgObject svgObject) throws com.caverock.androidsvg.SVGParseException {
            if (svgObject instanceof com.caverock.androidsvg.SVG.TextChild) {
                this.getInputSizeshNQ4ISI.add(svgObject);
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Text content elements cannot contain ");
            sb.append(svgObject);
            sb.append(" elements.");
            throw new com.caverock.androidsvg.SVGParseException(sb.toString());
        }
    }

    static abstract class TextPositionedContainer extends com.caverock.androidsvg.SVG.TextContainer {
        java.util.List<com.caverock.androidsvg.SVG.Length> getHighResolutionOutputSizeshNQ4ISI;
        java.util.List<com.caverock.androidsvg.SVG.Length> getHighSpeedVideoFpsRanges;
        java.util.List<com.caverock.androidsvg.SVG.Length> getHighSpeedVideoFpsRangesFor;
        java.util.List<com.caverock.androidsvg.SVG.Length> getHighSpeedVideoSizes;

        TextPositionedContainer() {
        }
    }

    static class Text extends com.caverock.androidsvg.SVG.TextPositionedContainer implements com.caverock.androidsvg.SVG.TextRoot, com.caverock.androidsvg.SVG.HasTransform {
        android.graphics.Matrix Camera2StreamConfigurationMap;

        Text() {
        }

        @Override // com.caverock.androidsvg.SVG.HasTransform
        public final void getHighSpeedVideoFpsRanges(android.graphics.Matrix matrix) {
            this.Camera2StreamConfigurationMap = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "text";
        }
    }

    static class TSpan extends com.caverock.androidsvg.SVG.TextPositionedContainer implements com.caverock.androidsvg.SVG.TextChild {
        com.caverock.androidsvg.SVG.TextRoot Camera2StreamConfigurationMap;

        TSpan() {
        }

        @Override // com.caverock.androidsvg.SVG.TextChild
        public final com.caverock.androidsvg.SVG.TextRoot getOutputMinFrameDuration() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "tspan";
        }
    }

    static class TextSequence extends com.caverock.androidsvg.SVG.SvgObject implements com.caverock.androidsvg.SVG.TextChild {
        java.lang.String Camera2StreamConfigurationMap;
        private com.caverock.androidsvg.SVG.TextRoot getHighSpeedVideoFpsRanges;

        TextSequence(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TextChild: '");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append("'");
            return sb.toString();
        }

        @Override // com.caverock.androidsvg.SVG.TextChild
        public final com.caverock.androidsvg.SVG.TextRoot getOutputMinFrameDuration() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    static class TRef extends com.caverock.androidsvg.SVG.TextContainer implements com.caverock.androidsvg.SVG.TextChild {
        java.lang.String getHighSpeedVideoFpsRanges;
        com.caverock.androidsvg.SVG.TextRoot getHighSpeedVideoSizes;

        TRef() {
        }

        @Override // com.caverock.androidsvg.SVG.TextChild
        public final com.caverock.androidsvg.SVG.TextRoot getOutputMinFrameDuration() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "tref";
        }
    }

    static class TextPath extends com.caverock.androidsvg.SVG.TextContainer implements com.caverock.androidsvg.SVG.TextChild {
        com.caverock.androidsvg.SVG.TextRoot getHighResolutionOutputSizeshNQ4ISI;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoFpsRanges;
        java.lang.String getHighSpeedVideoFpsRangesFor;

        TextPath() {
        }

        @Override // com.caverock.androidsvg.SVG.TextChild
        public final com.caverock.androidsvg.SVG.TextRoot getOutputMinFrameDuration() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "textPath";
        }
    }

    static class Switch extends com.caverock.androidsvg.SVG.Group {
        Switch() {
        }

        @Override // com.caverock.androidsvg.SVG.Group, com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "switch";
        }
    }

    static class Symbol extends com.caverock.androidsvg.SVG.SvgViewBoxContainer implements com.caverock.androidsvg.SVG.NotDirectlyRendered {
        Symbol() {
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "symbol";
        }
    }

    static class Marker extends com.caverock.androidsvg.SVG.SvgViewBoxContainer implements com.caverock.androidsvg.SVG.NotDirectlyRendered {
        com.caverock.androidsvg.SVG.Length Camera2StreamConfigurationMap;
        com.caverock.androidsvg.SVG.Length getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoFpsRangesFor;
        java.lang.Float getHighSpeedVideoSizes;
        com.caverock.androidsvg.SVG.Length getOutputFormats;

        Marker() {
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "marker";
        }
    }

    static abstract class GradientElement extends com.caverock.androidsvg.SVG.SvgElementBase implements com.caverock.androidsvg.SVG.SvgContainer {
        java.lang.Boolean Camera2StreamConfigurationMap;
        java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        android.graphics.Matrix getHighSpeedVideoFpsRanges;
        com.caverock.androidsvg.SVG.GradientSpread getHighSpeedVideoFpsRangesFor;
        java.util.List<com.caverock.androidsvg.SVG.SvgObject> getHighSpeedVideoSizes = new java.util.ArrayList();

        GradientElement() {
        }

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final java.util.List<com.caverock.androidsvg.SVG.SvgObject> getHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final void getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVG.SvgObject svgObject) throws com.caverock.androidsvg.SVGParseException {
            if (svgObject instanceof com.caverock.androidsvg.SVG.Stop) {
                this.getHighSpeedVideoSizes.add(svgObject);
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Gradient elements cannot contain ");
            sb.append(svgObject);
            sb.append(" elements.");
            throw new com.caverock.androidsvg.SVGParseException(sb.toString());
        }
    }

    static class Stop extends com.caverock.androidsvg.SVG.SvgElementBase implements com.caverock.androidsvg.SVG.SvgContainer {
        java.lang.Float getHighSpeedVideoFpsRanges;

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final void getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVG.SvgObject svgObject) {
        }

        Stop() {
        }

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final java.util.List<com.caverock.androidsvg.SVG.SvgObject> getHighSpeedVideoFpsRanges() {
            return java.util.Collections.emptyList();
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "stop";
        }
    }

    static class SvgLinearGradient extends com.caverock.androidsvg.SVG.GradientElement {
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoSizesFor;
        com.caverock.androidsvg.SVG.Length getInputFormats;
        com.caverock.androidsvg.SVG.Length getInputSizeshNQ4ISI;
        com.caverock.androidsvg.SVG.Length getOutputMinFrameDuration;

        SvgLinearGradient() {
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "linearGradient";
        }
    }

    static class SvgRadialGradient extends com.caverock.androidsvg.SVG.GradientElement {
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoSizesFor;
        com.caverock.androidsvg.SVG.Length getInputFormats;
        com.caverock.androidsvg.SVG.Length getInputSizeshNQ4ISI;
        com.caverock.androidsvg.SVG.Length getOutputFormats;
        com.caverock.androidsvg.SVG.Length getOutputMinFrameDuration;

        SvgRadialGradient() {
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "radialGradient";
        }
    }

    static class ClipPath extends com.caverock.androidsvg.SVG.Group implements com.caverock.androidsvg.SVG.NotDirectlyRendered {
        java.lang.Boolean Camera2StreamConfigurationMap;

        ClipPath() {
        }

        @Override // com.caverock.androidsvg.SVG.Group, com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "clipPath";
        }
    }

    static class Pattern extends com.caverock.androidsvg.SVG.SvgViewBoxContainer implements com.caverock.androidsvg.SVG.NotDirectlyRendered {
        java.lang.String Camera2StreamConfigurationMap;
        java.lang.Boolean getHighResolutionOutputSizeshNQ4ISI;
        android.graphics.Matrix getHighSpeedVideoFpsRanges;
        java.lang.Boolean getHighSpeedVideoFpsRangesFor;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoSizes;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoSizesFor;
        com.caverock.androidsvg.SVG.Length getInputFormats;
        com.caverock.androidsvg.SVG.Length getOutputFormats;

        Pattern() {
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "pattern";
        }
    }

    static class Image extends com.caverock.androidsvg.SVG.SvgPreserveAspectRatioContainer implements com.caverock.androidsvg.SVG.HasTransform {
        java.lang.String Camera2StreamConfigurationMap;
        android.graphics.Matrix getHighResolutionOutputSizeshNQ4ISI;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoFpsRanges;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoFpsRangesFor;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoSizes;
        com.caverock.androidsvg.SVG.Length getOutputMinFrameDuration;

        Image() {
        }

        @Override // com.caverock.androidsvg.SVG.HasTransform
        public final void getHighSpeedVideoFpsRanges(android.graphics.Matrix matrix) {
            this.getHighResolutionOutputSizeshNQ4ISI = matrix;
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "image";
        }
    }

    static class View extends com.caverock.androidsvg.SVG.SvgViewBoxContainer implements com.caverock.androidsvg.SVG.NotDirectlyRendered {
        View() {
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "view";
        }
    }

    static class Mask extends com.caverock.androidsvg.SVG.SvgConditionalContainer implements com.caverock.androidsvg.SVG.NotDirectlyRendered {
        com.caverock.androidsvg.SVG.Length Camera2StreamConfigurationMap;
        java.lang.Boolean getHighResolutionOutputSizeshNQ4ISI;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoFpsRanges;
        com.caverock.androidsvg.SVG.Length getHighSpeedVideoFpsRangesFor;
        java.lang.Boolean getHighSpeedVideoSizes;
        com.caverock.androidsvg.SVG.Length getInputFormats;

        Mask() {
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return com.daon.sdk.face.license.License.FEATURE_MASK;
        }
    }

    static class SolidColor extends com.caverock.androidsvg.SVG.SvgElementBase implements com.caverock.androidsvg.SVG.SvgContainer {
        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final void getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVG.SvgObject svgObject) {
        }

        SolidColor() {
        }

        @Override // com.caverock.androidsvg.SVG.SvgContainer
        public final java.util.List<com.caverock.androidsvg.SVG.SvgObject> getHighSpeedVideoFpsRanges() {
            return java.util.Collections.emptyList();
        }

        @Override // com.caverock.androidsvg.SVG.SvgObject
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            return "solidColor";
        }
    }

    static com.caverock.androidsvg.SVGExternalFileResolver getHighSpeedVideoFpsRanges() {
        return getOutputFormats;
    }

    static class PathDefinition implements com.caverock.androidsvg.SVG.PathInterface {
        int getHighSpeedVideoSizes = 0;
        private int Camera2StreamConfigurationMap = 0;
        private byte[] getHighResolutionOutputSizeshNQ4ISI = new byte[8];
        private float[] getHighSpeedVideoFpsRanges = new float[16];

        PathDefinition() {
        }

        final void getHighSpeedVideoSizes(byte b) {
            int i = this.getHighSpeedVideoSizes;
            byte[] bArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.getHighResolutionOutputSizeshNQ4ISI = bArr2;
            }
            byte[] bArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i2 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i2 + 1;
            bArr3[i2] = b;
        }

        private void getHighSpeedVideoSizes(int i) {
            float[] fArr = this.getHighSpeedVideoFpsRanges;
            if (fArr.length < this.Camera2StreamConfigurationMap + i) {
                float[] fArr2 = new float[fArr.length * 2];
                java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.getHighSpeedVideoFpsRanges = fArr2;
            }
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void getHighSpeedVideoSizes(float f, float f2) {
            getHighSpeedVideoSizes((byte) 0);
            getHighSpeedVideoSizes(2);
            float[] fArr = this.getHighSpeedVideoFpsRanges;
            int i = this.Camera2StreamConfigurationMap;
            fArr[i] = f;
            this.Camera2StreamConfigurationMap = i + 2;
            fArr[i + 1] = f2;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void getHighSpeedVideoFpsRanges(float f, float f2) {
            getHighSpeedVideoSizes((byte) 1);
            getHighSpeedVideoSizes(2);
            float[] fArr = this.getHighSpeedVideoFpsRanges;
            int i = this.Camera2StreamConfigurationMap;
            fArr[i] = f;
            this.Camera2StreamConfigurationMap = i + 2;
            fArr[i + 1] = f2;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void getHighSpeedVideoFpsRanges(float f, float f2, float f3, float f4, float f5, float f6) {
            getHighSpeedVideoSizes((byte) 2);
            getHighSpeedVideoSizes(6);
            float[] fArr = this.getHighSpeedVideoFpsRanges;
            int i = this.Camera2StreamConfigurationMap;
            fArr[i] = f;
            fArr[i + 1] = f2;
            fArr[i + 2] = f3;
            fArr[i + 3] = f4;
            fArr[i + 4] = f5;
            this.Camera2StreamConfigurationMap = i + 6;
            fArr[i + 5] = f6;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void Camera2StreamConfigurationMap(float f, float f2, float f3, float f4) {
            getHighSpeedVideoSizes((byte) 3);
            getHighSpeedVideoSizes(4);
            float[] fArr = this.getHighSpeedVideoFpsRanges;
            int i = this.Camera2StreamConfigurationMap;
            fArr[i] = f;
            fArr[i + 1] = f2;
            fArr[i + 2] = f3;
            this.Camera2StreamConfigurationMap = i + 4;
            fArr[i + 3] = f4;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void getHighSpeedVideoSizes(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            getHighSpeedVideoSizes((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
            getHighSpeedVideoSizes(5);
            float[] fArr = this.getHighSpeedVideoFpsRanges;
            int i = this.Camera2StreamConfigurationMap;
            fArr[i] = f;
            fArr[i + 1] = f2;
            fArr[i + 2] = f3;
            fArr[i + 3] = f4;
            this.Camera2StreamConfigurationMap = i + 5;
            fArr[i + 4] = f5;
        }

        @Override // com.caverock.androidsvg.SVG.PathInterface
        public final void getHighResolutionOutputSizeshNQ4ISI() {
            getHighSpeedVideoSizes((byte) 8);
        }

        final void Camera2StreamConfigurationMap(com.caverock.androidsvg.SVG.PathInterface pathInterface) {
            int i;
            int i2 = 0;
            for (int i3 = 0; i3 < this.getHighSpeedVideoSizes; i3++) {
                byte b = this.getHighResolutionOutputSizeshNQ4ISI[i3];
                if (b == 0) {
                    float[] fArr = this.getHighSpeedVideoFpsRanges;
                    i = i2 + 2;
                    pathInterface.getHighSpeedVideoSizes(fArr[i2], fArr[i2 + 1]);
                } else if (b != 1) {
                    if (b == 2) {
                        float[] fArr2 = this.getHighSpeedVideoFpsRanges;
                        pathInterface.getHighSpeedVideoFpsRanges(fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3], fArr2[i2 + 4], fArr2[i2 + 5]);
                        i2 += 6;
                    } else if (b == 3) {
                        float[] fArr3 = this.getHighSpeedVideoFpsRanges;
                        pathInterface.Camera2StreamConfigurationMap(fArr3[i2], fArr3[i2 + 1], fArr3[i2 + 2], fArr3[i2 + 3]);
                        i2 += 4;
                    } else if (b == 8) {
                        pathInterface.getHighResolutionOutputSizeshNQ4ISI();
                    } else {
                        boolean z = (b & 2) != 0;
                        boolean z2 = (b & 1) != 0;
                        float[] fArr4 = this.getHighSpeedVideoFpsRanges;
                        pathInterface.getHighSpeedVideoSizes(fArr4[i2], fArr4[i2 + 1], fArr4[i2 + 2], z, z2, fArr4[i2 + 3], fArr4[i2 + 4]);
                        i2 += 5;
                    }
                } else {
                    float[] fArr5 = this.getHighSpeedVideoFpsRanges;
                    i = i2 + 2;
                    pathInterface.getHighSpeedVideoFpsRanges(fArr5[i2], fArr5[i2 + 1]);
                }
                i2 = i;
            }
        }
    }

    final com.caverock.androidsvg.SVG.SvgElementBase getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.getHighSpeedVideoSizes.getValidOutputFormatsForInputhNQ4ISI)) {
            return this.getHighSpeedVideoSizes;
        }
        if (this.getOutputMinFrameDuration.containsKey(str)) {
            return this.getOutputMinFrameDuration.get(str);
        }
        com.caverock.androidsvg.SVG.SvgElementBase highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, str);
        this.getOutputMinFrameDuration.put(str, highResolutionOutputSizeshNQ4ISI);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.caverock.androidsvg.SVG.SvgElementBase getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVG.SvgContainer svgContainer, java.lang.String str) {
        com.caverock.androidsvg.SVG.SvgElementBase highResolutionOutputSizeshNQ4ISI;
        com.caverock.androidsvg.SVG.SvgElementBase svgElementBase = (com.caverock.androidsvg.SVG.SvgElementBase) svgContainer;
        if (str.equals(svgElementBase.getValidOutputFormatsForInputhNQ4ISI)) {
            return svgElementBase;
        }
        for (java.lang.Object obj : svgContainer.getHighSpeedVideoFpsRanges()) {
            if (obj instanceof com.caverock.androidsvg.SVG.SvgElementBase) {
                com.caverock.androidsvg.SVG.SvgElementBase svgElementBase2 = (com.caverock.androidsvg.SVG.SvgElementBase) obj;
                if (str.equals(svgElementBase2.getValidOutputFormatsForInputhNQ4ISI)) {
                    return svgElementBase2;
                }
                if ((obj instanceof com.caverock.androidsvg.SVG.SvgContainer) && (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgContainer) obj, str)) != null) {
                    return highResolutionOutputSizeshNQ4ISI;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void getHighSpeedVideoFpsRanges(java.util.List<com.caverock.androidsvg.SVG.SvgObject> list, com.caverock.androidsvg.SVG.SvgObject svgObject, java.lang.String str) {
        if (svgObject.getHighResolutionOutputSizeshNQ4ISI().equals(str)) {
            list.add(svgObject);
        }
        if (svgObject instanceof com.caverock.androidsvg.SVG.SvgContainer) {
            java.util.Iterator<com.caverock.androidsvg.SVG.SvgObject> it = ((com.caverock.androidsvg.SVG.SvgContainer) svgObject).getHighSpeedVideoFpsRanges().iterator();
            while (it.hasNext()) {
                getHighSpeedVideoFpsRanges(list, it.next(), str);
            }
        }
    }

    final com.caverock.androidsvg.SVG.SvgObject getHighSpeedVideoFpsRanges(java.lang.String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        java.lang.String replace = str.replace("\\\n", "").replace("\\A", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        if (replace.length() <= 1 || !replace.startsWith("#")) {
            return null;
        }
        return getHighSpeedVideoFpsRangesFor(replace.substring(1));
    }
}
