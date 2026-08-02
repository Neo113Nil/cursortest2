package androidx.constraintlayout.core.dsl;

/* loaded from: classes6.dex */
public class Constraint {
    public static final androidx.constraintlayout.core.dsl.Constraint PARENT = new androidx.constraintlayout.core.dsl.Constraint("parent");
    static int getHighResolutionOutputSizeshNQ4ISI = Integer.MIN_VALUE;
    static java.util.Map<androidx.constraintlayout.core.dsl.Constraint.ChainMode, java.lang.String> getHighSpeedVideoFpsRangesFor;
    private androidx.constraintlayout.core.dsl.Constraint.Behaviour AMEXKernel;
    private float ArtificialStackFrames;
    private float CoroutineDebuggingKt;
    private androidx.constraintlayout.core.dsl.Constraint.ChainMode accessartificialFrame;
    private java.lang.String[] b;
    private int c;
    private final java.lang.String coroutineCreation;
    private float d;
    private int exchange;
    private float getARTIFICIAL_FRAME_PACKAGE_NAME;
    private float getHighSpeedVideoSizesFor;
    private boolean getInputSizeshNQ4ISI;
    private java.lang.String getOutputFormats;
    private int getOutputMinFrameDuration;
    private int getOutputSizes;
    private boolean getOutputSizeshNQ4ISI;
    private int getOutputStallDuration;
    private java.lang.String getOutputStallDurationlomOqCM;
    private float getValidOutputFormatsForInputhNQ4ISI;
    private androidx.constraintlayout.core.dsl.Constraint.ChainMode init;
    private int isOutputSupportedFor;
    private int isOutputSupportedForhNQ4ISI;
    private int kernelVersion;
    private float release;
    private androidx.constraintlayout.core.dsl.Constraint.Behaviour toString;
    private int unwrapAs;
    java.lang.String getHighSpeedVideoSizes = null;
    java.lang.String Camera2StreamConfigurationMap = null;
    private androidx.constraintlayout.core.dsl.Constraint.HAnchor coroutineBoundary = new androidx.constraintlayout.core.dsl.Constraint.HAnchor(androidx.constraintlayout.core.dsl.Constraint.HSide.LEFT);

    /* renamed from: a, reason: collision with root package name */
    private androidx.constraintlayout.core.dsl.Constraint.HAnchor f2718a = new androidx.constraintlayout.core.dsl.Constraint.HAnchor(androidx.constraintlayout.core.dsl.Constraint.HSide.RIGHT);
    private androidx.constraintlayout.core.dsl.Constraint.VAnchor _CREATION = new androidx.constraintlayout.core.dsl.Constraint.VAnchor(androidx.constraintlayout.core.dsl.Constraint.VSide.TOP);
    private androidx.constraintlayout.core.dsl.Constraint.VAnchor getInputFormats = new androidx.constraintlayout.core.dsl.Constraint.VAnchor(androidx.constraintlayout.core.dsl.Constraint.VSide.BOTTOM);
    private androidx.constraintlayout.core.dsl.Constraint.HAnchor _BOUNDARY = new androidx.constraintlayout.core.dsl.Constraint.HAnchor(androidx.constraintlayout.core.dsl.Constraint.HSide.START);
    private androidx.constraintlayout.core.dsl.Constraint.HAnchor getOutputMinFrameDurationlomOqCM = new androidx.constraintlayout.core.dsl.Constraint.HAnchor(androidx.constraintlayout.core.dsl.Constraint.HSide.END);
    private androidx.constraintlayout.core.dsl.Constraint.VAnchor getHighSpeedVideoFpsRanges = new androidx.constraintlayout.core.dsl.Constraint.VAnchor(androidx.constraintlayout.core.dsl.Constraint.VSide.BASELINE);

    public enum Behaviour {
        SPREAD,
        WRAP,
        PERCENT,
        RATIO,
        RESOLVED
    }

    public enum ChainMode {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    public enum HSide {
        LEFT,
        RIGHT,
        START,
        END
    }

    public enum Side {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        START,
        END,
        BASELINE
    }

    public enum VSide {
        TOP,
        BOTTOM,
        BASELINE
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRangesFor = hashMap;
        hashMap.put(androidx.constraintlayout.core.dsl.Constraint.ChainMode.SPREAD, "spread");
        getHighSpeedVideoFpsRangesFor.put(androidx.constraintlayout.core.dsl.Constraint.ChainMode.SPREAD_INSIDE, "spread_inside");
        getHighSpeedVideoFpsRangesFor.put(androidx.constraintlayout.core.dsl.Constraint.ChainMode.PACKED, "packed");
    }

    public Constraint(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        this.c = i;
        this.isOutputSupportedForhNQ4ISI = i;
        this.CoroutineDebuggingKt = Float.NaN;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = Float.NaN;
        this.getOutputStallDurationlomOqCM = null;
        this.getOutputFormats = null;
        this.getOutputMinFrameDuration = Integer.MIN_VALUE;
        this.getHighSpeedVideoSizesFor = Float.NaN;
        this.getOutputStallDuration = Integer.MIN_VALUE;
        this.getOutputSizes = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.ArtificialStackFrames = Float.NaN;
        this.accessartificialFrame = null;
        this.init = null;
        this.AMEXKernel = null;
        this.toString = null;
        this.kernelVersion = i;
        this.isOutputSupportedFor = i;
        this.exchange = i;
        this.unwrapAs = i;
        this.release = Float.NaN;
        this.getValidOutputFormatsForInputhNQ4ISI = Float.NaN;
        this.b = null;
        this.getOutputSizeshNQ4ISI = false;
        this.getInputSizeshNQ4ISI = false;
        this.coroutineCreation = str;
    }

    public class VAnchor extends androidx.constraintlayout.core.dsl.Constraint.Anchor {
        VAnchor(androidx.constraintlayout.core.dsl.Constraint.VSide vSide) {
            super(androidx.constraintlayout.core.dsl.Constraint.Side.valueOf(vSide.name()));
        }
    }

    public class HAnchor extends androidx.constraintlayout.core.dsl.Constraint.Anchor {
        HAnchor(androidx.constraintlayout.core.dsl.Constraint.HSide hSide) {
            super(androidx.constraintlayout.core.dsl.Constraint.Side.valueOf(hSide.name()));
        }
    }

    public class Anchor {
        final androidx.constraintlayout.core.dsl.Constraint.Side Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRangesFor;
        androidx.constraintlayout.core.dsl.Constraint.Anchor getHighResolutionOutputSizeshNQ4ISI = null;
        int getHighSpeedVideoSizes = Integer.MIN_VALUE;

        Anchor(androidx.constraintlayout.core.dsl.Constraint.Side side) {
            this.Camera2StreamConfigurationMap = side;
        }

        public java.lang.String getId() {
            return androidx.constraintlayout.core.dsl.Constraint.this.coroutineCreation;
        }

        public void build(java.lang.StringBuilder sb) {
            if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
                sb.append(this.Camera2StreamConfigurationMap.toString().toLowerCase());
                sb.append(io.ktor.sse.ServerSentEventKt.COLON);
                sb.append(this);
                sb.append(",\n");
            }
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
            if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
                sb.append("'");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getId());
                sb.append("','");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.toString().toLowerCase());
                sb.append("'");
            }
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                sb.append(",");
                sb.append(this.getHighSpeedVideoFpsRangesFor);
            }
            if (this.getHighSpeedVideoSizes != Integer.MIN_VALUE) {
                if (this.getHighSpeedVideoFpsRangesFor == 0) {
                    sb.append(",0,");
                    sb.append(this.getHighSpeedVideoSizes);
                } else {
                    sb.append(",");
                    sb.append(this.getHighSpeedVideoSizes);
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public androidx.constraintlayout.core.dsl.Constraint.HAnchor getLeft() {
        return this.coroutineBoundary;
    }

    public androidx.constraintlayout.core.dsl.Constraint.HAnchor getRight() {
        return this.f2718a;
    }

    public androidx.constraintlayout.core.dsl.Constraint.VAnchor getTop() {
        return this._CREATION;
    }

    public androidx.constraintlayout.core.dsl.Constraint.VAnchor getBottom() {
        return this.getInputFormats;
    }

    public androidx.constraintlayout.core.dsl.Constraint.HAnchor getStart() {
        return this._BOUNDARY;
    }

    public androidx.constraintlayout.core.dsl.Constraint.HAnchor getEnd() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public androidx.constraintlayout.core.dsl.Constraint.VAnchor getBaseline() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public float getHorizontalBias() {
        return this.CoroutineDebuggingKt;
    }

    public void setHorizontalBias(float f) {
        this.CoroutineDebuggingKt = f;
    }

    public float getVerticalBias() {
        return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
    }

    public void setVerticalBias(float f) {
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = f;
    }

    public java.lang.String getDimensionRatio() {
        return this.getOutputStallDurationlomOqCM;
    }

    public void setDimensionRatio(java.lang.String str) {
        this.getOutputStallDurationlomOqCM = str;
    }

    public java.lang.String getCircleConstraint() {
        return this.getOutputFormats;
    }

    public void setCircleConstraint(java.lang.String str) {
        this.getOutputFormats = str;
    }

    public int getCircleRadius() {
        return this.getOutputMinFrameDuration;
    }

    public void setCircleRadius(int i) {
        this.getOutputMinFrameDuration = i;
    }

    public float getCircleAngle() {
        return this.getHighSpeedVideoSizesFor;
    }

    public void setCircleAngle(float f) {
        this.getHighSpeedVideoSizesFor = f;
    }

    public int getEditorAbsoluteX() {
        return this.getOutputStallDuration;
    }

    public void setEditorAbsoluteX(int i) {
        this.getOutputStallDuration = i;
    }

    public int getEditorAbsoluteY() {
        return this.getOutputSizes;
    }

    public void setEditorAbsoluteY(int i) {
        this.getOutputSizes = i;
    }

    public float getVerticalWeight() {
        return this.d;
    }

    public void setVerticalWeight(float f) {
        this.d = f;
    }

    public float getHorizontalWeight() {
        return this.ArtificialStackFrames;
    }

    public void setHorizontalWeight(float f) {
        this.ArtificialStackFrames = f;
    }

    public androidx.constraintlayout.core.dsl.Constraint.ChainMode getHorizontalChainStyle() {
        return this.accessartificialFrame;
    }

    public void setHorizontalChainStyle(androidx.constraintlayout.core.dsl.Constraint.ChainMode chainMode) {
        this.accessartificialFrame = chainMode;
    }

    public androidx.constraintlayout.core.dsl.Constraint.ChainMode getVerticalChainStyle() {
        return this.init;
    }

    public void setVerticalChainStyle(androidx.constraintlayout.core.dsl.Constraint.ChainMode chainMode) {
        this.init = chainMode;
    }

    public androidx.constraintlayout.core.dsl.Constraint.Behaviour getWidthDefault() {
        return this.AMEXKernel;
    }

    public void setWidthDefault(androidx.constraintlayout.core.dsl.Constraint.Behaviour behaviour) {
        this.AMEXKernel = behaviour;
    }

    public androidx.constraintlayout.core.dsl.Constraint.Behaviour getHeightDefault() {
        return this.toString;
    }

    public void setHeightDefault(androidx.constraintlayout.core.dsl.Constraint.Behaviour behaviour) {
        this.toString = behaviour;
    }

    public int getWidthMax() {
        return this.kernelVersion;
    }

    public void setWidthMax(int i) {
        this.kernelVersion = i;
    }

    public int getHeightMax() {
        return this.isOutputSupportedFor;
    }

    public void setHeightMax(int i) {
        this.isOutputSupportedFor = i;
    }

    public int getWidthMin() {
        return this.exchange;
    }

    public void setWidthMin(int i) {
        this.exchange = i;
    }

    public int getHeightMin() {
        return this.unwrapAs;
    }

    public void setHeightMin(int i) {
        this.unwrapAs = i;
    }

    public float getWidthPercent() {
        return this.release;
    }

    public void setWidthPercent(float f) {
        this.release = f;
    }

    public float getHeightPercent() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public void setHeightPercent(float f) {
        this.getValidOutputFormatsForInputhNQ4ISI = f;
    }

    public java.lang.String[] getReferenceIds() {
        return this.b;
    }

    public void setReferenceIds(java.lang.String[] strArr) {
        this.b = strArr;
    }

    public boolean isConstrainedWidth() {
        return this.getOutputSizeshNQ4ISI;
    }

    public void setConstrainedWidth(boolean z) {
        this.getOutputSizeshNQ4ISI = z;
    }

    public boolean isConstrainedHeight() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setConstrainedHeight(boolean z) {
        this.getInputSizeshNQ4ISI = z;
    }

    public int getWidth() {
        return this.c;
    }

    public void setWidth(int i) {
        this.c = i;
    }

    public int getHeight() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public void setHeight(int i) {
        this.isOutputSupportedForhNQ4ISI = i;
    }

    public void linkToTop(androidx.constraintlayout.core.dsl.Constraint.VAnchor vAnchor) {
        linkToTop(vAnchor, 0);
    }

    public void linkToLeft(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor) {
        linkToLeft(hAnchor, 0);
    }

    public void linkToRight(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor) {
        linkToRight(hAnchor, 0);
    }

    public void linkToStart(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor) {
        linkToStart(hAnchor, 0);
    }

    public void linkToEnd(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor) {
        linkToEnd(hAnchor, 0);
    }

    public void linkToBottom(androidx.constraintlayout.core.dsl.Constraint.VAnchor vAnchor) {
        linkToBottom(vAnchor, 0);
    }

    public void linkToBaseline(androidx.constraintlayout.core.dsl.Constraint.VAnchor vAnchor) {
        linkToBaseline(vAnchor, 0);
    }

    public void linkToTop(androidx.constraintlayout.core.dsl.Constraint.VAnchor vAnchor, int i) {
        linkToTop(vAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToLeft(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor, int i) {
        linkToLeft(hAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToRight(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor, int i) {
        linkToRight(hAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToStart(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor, int i) {
        linkToStart(hAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToEnd(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor, int i) {
        linkToEnd(hAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToBottom(androidx.constraintlayout.core.dsl.Constraint.VAnchor vAnchor, int i) {
        linkToBottom(vAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToBaseline(androidx.constraintlayout.core.dsl.Constraint.VAnchor vAnchor, int i) {
        linkToBaseline(vAnchor, i, Integer.MIN_VALUE);
    }

    public void linkToTop(androidx.constraintlayout.core.dsl.Constraint.VAnchor vAnchor, int i, int i2) {
        this._CREATION.getHighResolutionOutputSizeshNQ4ISI = vAnchor;
        this._CREATION.getHighSpeedVideoFpsRangesFor = i;
        this._CREATION.getHighSpeedVideoSizes = i2;
    }

    public void linkToLeft(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor, int i, int i2) {
        this.coroutineBoundary.getHighResolutionOutputSizeshNQ4ISI = hAnchor;
        this.coroutineBoundary.getHighSpeedVideoFpsRangesFor = i;
        this.coroutineBoundary.getHighSpeedVideoSizes = i2;
    }

    public void linkToRight(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor, int i, int i2) {
        this.f2718a.getHighResolutionOutputSizeshNQ4ISI = hAnchor;
        this.f2718a.getHighSpeedVideoFpsRangesFor = i;
        this.f2718a.getHighSpeedVideoSizes = i2;
    }

    public void linkToStart(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor, int i, int i2) {
        this._BOUNDARY.getHighResolutionOutputSizeshNQ4ISI = hAnchor;
        this._BOUNDARY.getHighSpeedVideoFpsRangesFor = i;
        this._BOUNDARY.getHighSpeedVideoSizes = i2;
    }

    public void linkToEnd(androidx.constraintlayout.core.dsl.Constraint.HAnchor hAnchor, int i, int i2) {
        this.getOutputMinFrameDurationlomOqCM.getHighResolutionOutputSizeshNQ4ISI = hAnchor;
        this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRangesFor = i;
        this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoSizes = i2;
    }

    public void linkToBottom(androidx.constraintlayout.core.dsl.Constraint.VAnchor vAnchor, int i, int i2) {
        this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI = vAnchor;
        this.getInputFormats.getHighSpeedVideoFpsRangesFor = i;
        this.getInputFormats.getHighSpeedVideoSizes = i2;
    }

    public void linkToBaseline(androidx.constraintlayout.core.dsl.Constraint.VAnchor vAnchor, int i, int i2) {
        this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI = vAnchor;
        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes = i2;
    }

    public java.lang.String convertStringArrayToString(java.lang.String[] strArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        int i = 0;
        while (i < strArr.length) {
            sb.append(i == 0 ? "'" : ",'");
            sb.append(strArr[i]);
            sb.append("'");
            i++;
        }
        sb.append("]");
        return sb.toString();
    }

    protected void append(java.lang.StringBuilder sb, java.lang.String str, float f) {
        if (java.lang.Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(f);
        sb.append(",\n");
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.coroutineCreation);
        sb.append(":{\n");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(sb.toString());
        this.coroutineBoundary.build(sb2);
        this.f2718a.build(sb2);
        this._CREATION.build(sb2);
        this.getInputFormats.build(sb2);
        this._BOUNDARY.build(sb2);
        this.getOutputMinFrameDurationlomOqCM.build(sb2);
        this.getHighSpeedVideoFpsRanges.build(sb2);
        if (this.c != getHighResolutionOutputSizeshNQ4ISI) {
            sb2.append("width:");
            sb2.append(this.c);
            sb2.append(",\n");
        }
        if (this.isOutputSupportedForhNQ4ISI != getHighResolutionOutputSizeshNQ4ISI) {
            sb2.append("height:");
            sb2.append(this.isOutputSupportedForhNQ4ISI);
            sb2.append(",\n");
        }
        append(sb2, "horizontalBias", this.CoroutineDebuggingKt);
        append(sb2, "verticalBias", this.getARTIFICIAL_FRAME_PACKAGE_NAME);
        if (this.getOutputStallDurationlomOqCM != null) {
            sb2.append("dimensionRatio:'");
            sb2.append(this.getOutputStallDurationlomOqCM);
            sb2.append("',\n");
        }
        if (this.getOutputFormats != null && (!java.lang.Float.isNaN(this.getHighSpeedVideoSizesFor) || this.getOutputMinFrameDuration != Integer.MIN_VALUE)) {
            sb2.append("circular:['");
            sb2.append(this.getOutputFormats);
            sb2.append("'");
            if (!java.lang.Float.isNaN(this.getHighSpeedVideoSizesFor)) {
                sb2.append(",");
                sb2.append(this.getHighSpeedVideoSizesFor);
            }
            if (this.getOutputMinFrameDuration != Integer.MIN_VALUE) {
                if (java.lang.Float.isNaN(this.getHighSpeedVideoSizesFor)) {
                    sb2.append(",0,");
                    sb2.append(this.getOutputMinFrameDuration);
                } else {
                    sb2.append(",");
                    sb2.append(this.getOutputMinFrameDuration);
                }
            }
            sb2.append("],\n");
        }
        append(sb2, "verticalWeight", this.d);
        append(sb2, "horizontalWeight", this.ArtificialStackFrames);
        if (this.accessartificialFrame != null) {
            sb2.append("horizontalChainStyle:'");
            sb2.append(getHighSpeedVideoFpsRangesFor.get(this.accessartificialFrame));
            sb2.append("',\n");
        }
        if (this.init != null) {
            sb2.append("verticalChainStyle:'");
            sb2.append(getHighSpeedVideoFpsRangesFor.get(this.init));
            sb2.append("',\n");
        }
        if (this.AMEXKernel != null) {
            int i = this.kernelVersion;
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            if (i == i2 && this.exchange == i2) {
                sb2.append("width:'");
                sb2.append(this.AMEXKernel.toString().toLowerCase());
                sb2.append("',\n");
            } else {
                sb2.append("width:{value:'");
                sb2.append(this.AMEXKernel.toString().toLowerCase());
                sb2.append("'");
                if (this.kernelVersion != getHighResolutionOutputSizeshNQ4ISI) {
                    sb2.append(",max:");
                    sb2.append(this.kernelVersion);
                }
                if (this.exchange != getHighResolutionOutputSizeshNQ4ISI) {
                    sb2.append(",min:");
                    sb2.append(this.exchange);
                }
                sb2.append("},\n");
            }
        }
        if (this.toString != null) {
            int i3 = this.isOutputSupportedFor;
            int i4 = getHighResolutionOutputSizeshNQ4ISI;
            if (i3 == i4 && this.unwrapAs == i4) {
                sb2.append("height:'");
                sb2.append(this.toString.toString().toLowerCase());
                sb2.append("',\n");
            } else {
                sb2.append("height:{value:'");
                sb2.append(this.toString.toString().toLowerCase());
                sb2.append("'");
                if (this.isOutputSupportedFor != getHighResolutionOutputSizeshNQ4ISI) {
                    sb2.append(",max:");
                    sb2.append(this.isOutputSupportedFor);
                }
                if (this.unwrapAs != getHighResolutionOutputSizeshNQ4ISI) {
                    sb2.append(",min:");
                    sb2.append(this.unwrapAs);
                }
                sb2.append("},\n");
            }
        }
        if (!java.lang.Double.isNaN(this.release)) {
            sb2.append("width:'");
            sb2.append((int) this.release);
            sb2.append("%',\n");
        }
        if (!java.lang.Double.isNaN(this.getValidOutputFormatsForInputhNQ4ISI)) {
            sb2.append("height:'");
            sb2.append((int) this.getValidOutputFormatsForInputhNQ4ISI);
            sb2.append("%',\n");
        }
        if (this.b != null) {
            sb2.append("referenceIds:");
            sb2.append(convertStringArrayToString(this.b));
            sb2.append(",\n");
        }
        if (this.getOutputSizeshNQ4ISI) {
            sb2.append("constrainedWidth:");
            sb2.append(this.getOutputSizeshNQ4ISI);
            sb2.append(",\n");
        }
        if (this.getInputSizeshNQ4ISI) {
            sb2.append("constrainedHeight:");
            sb2.append(this.getInputSizeshNQ4ISI);
            sb2.append(",\n");
        }
        sb2.append("},\n");
        return sb2.toString();
    }
}
