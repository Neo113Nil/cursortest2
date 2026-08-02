package androidx.compose.ui.graphics.colorspace;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0016\u0018\u0000 (2\u00020\u0001:\u0002)(B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u000eJ%\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0013J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0010¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010'\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010&"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector;", "", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "source", "destination", "transformSource", "transformDestination", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "renderIntent", "", "transform", "<init>", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "intent", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "r", "g", util.h.xy.cb.b.f1091, "(FFF)[F", "v", "([F)[F", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "transformToColor-l2rxGTc$ui_graphics", "(J)J", "transformToColor", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getSource", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getDestination", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getRenderIntent-uksYyKA", "()I", "[F", "getHighSpeedVideoFpsRangesFor", "Companion", "RgbConnector"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class Connector {
    private final androidx.compose.ui.graphics.colorspace.ColorSpace destination;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.colorspace.ColorSpace getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.colorspace.ColorSpace Camera2StreamConfigurationMap;
    private final int renderIntent;
    private final androidx.compose.ui.graphics.colorspace.ColorSpace source;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.colorspace.Connector.Companion INSTANCE = new androidx.compose.ui.graphics.colorspace.Connector.Companion(null);
    public static final int $stable = 8;

    private Connector(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace2, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace3, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace4, int i, float[] fArr) {
        this.source = colorSpace;
        this.destination = colorSpace2;
        this.Camera2StreamConfigurationMap = colorSpace3;
        this.getHighResolutionOutputSizeshNQ4ISI = colorSpace4;
        this.renderIntent = i;
        this.getHighSpeedVideoFpsRangesFor = fArr;
    }

    public final androidx.compose.ui.graphics.colorspace.ColorSpace getSource() {
        return this.source;
    }

    public final androidx.compose.ui.graphics.colorspace.ColorSpace getDestination() {
        return this.destination;
    }

    /* renamed from: getRenderIntent-uksYyKA, reason: not valid java name and from getter */
    public final int getRenderIntent() {
        return this.renderIntent;
    }

    private Connector(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace2, int i) {
        this(colorSpace, colorSpace2, androidx.compose.ui.graphics.colorspace.ColorModel.m6395equalsimpl0(colorSpace.getModel(), androidx.compose.ui.graphics.colorspace.ColorModel.INSTANCE.m6402getRgbxdoWZVw()) ? androidx.compose.ui.graphics.colorspace.ColorSpaceKt.adapt$default(colorSpace, androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace, androidx.compose.ui.graphics.colorspace.ColorModel.m6395equalsimpl0(colorSpace2.getModel(), androidx.compose.ui.graphics.colorspace.ColorModel.INSTANCE.m6402getRgbxdoWZVw()) ? androidx.compose.ui.graphics.colorspace.ColorSpaceKt.adapt$default(colorSpace2, androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace2, i, androidx.compose.ui.graphics.colorspace.Connector.Companion.m6410access$computeTransformYBCOT_4(INSTANCE, colorSpace, colorSpace2, i), null);
    }

    public final float[] transform(float r, float g, float b) {
        return transform(new float[]{r, g, b});
    }

    public float[] transform(float[] v) {
        float[] xyz = this.Camera2StreamConfigurationMap.toXyz(v);
        float[] fArr = this.getHighSpeedVideoFpsRangesFor;
        if (fArr != null) {
            xyz[0] = xyz[0] * fArr[0];
            xyz[1] = xyz[1] * fArr[1];
            xyz[2] = xyz[2] * fArr[2];
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.fromXyz(xyz);
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$RgbConnector;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "mSource", "mDestination", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "intent", "<init>", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "v", "transform", "([F)[F", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "transformToColor-l2rxGTc$ui_graphics", "(J)J", "transformToColor", "p0", "p1", "p2", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;I)[F", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "[F"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RgbConnector extends androidx.compose.ui.graphics.colorspace.Connector {
        public static final int $stable = 8;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final androidx.compose.ui.graphics.colorspace.Rgb getHighSpeedVideoFpsRanges;
        private final androidx.compose.ui.graphics.colorspace.Rgb getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final float[] Camera2StreamConfigurationMap;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private RgbConnector(androidx.compose.ui.graphics.colorspace.Rgb rgb, androidx.compose.ui.graphics.colorspace.Rgb rgb2, int i) {
            super(r3, r4, r3, r4, i, null, null);
            androidx.compose.ui.graphics.colorspace.Rgb rgb3 = rgb;
            androidx.compose.ui.graphics.colorspace.Rgb rgb4 = rgb2;
            this.getHighResolutionOutputSizeshNQ4ISI = rgb;
            this.getHighSpeedVideoFpsRanges = rgb2;
            this.Camera2StreamConfigurationMap = getHighSpeedVideoSizes(rgb, rgb2, i);
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        public final float[] transform(float[] v) {
            v[0] = (float) this.getHighResolutionOutputSizeshNQ4ISI.getEotfFunc().invoke(v[0]);
            v[1] = (float) this.getHighResolutionOutputSizeshNQ4ISI.getEotfFunc().invoke(v[1]);
            v[2] = (float) this.getHighResolutionOutputSizeshNQ4ISI.getEotfFunc().invoke(v[2]);
            androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3Float3(this.Camera2StreamConfigurationMap, v);
            v[0] = (float) this.getHighSpeedVideoFpsRanges.getOetfFunc().invoke(v[0]);
            v[1] = (float) this.getHighSpeedVideoFpsRanges.getOetfFunc().invoke(v[1]);
            v[2] = (float) this.getHighSpeedVideoFpsRanges.getOetfFunc().invoke(v[2]);
            return v;
        }

        private static float[] getHighSpeedVideoSizes(androidx.compose.ui.graphics.colorspace.Rgb p0, androidx.compose.ui.graphics.colorspace.Rgb p1, int p2) {
            if (androidx.compose.ui.graphics.colorspace.ColorSpaceKt.compare(p0.getWhitePoint(), p1.getWhitePoint())) {
                return androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3(p1.getInverseTransform(), p0.getTransform());
            }
            float[] transform = p0.getTransform();
            float[] inverseTransform = p1.getInverseTransform();
            float[] xyz$ui_graphics = p0.getWhitePoint().toXyz$ui_graphics();
            float[] xyz$ui_graphics2 = p1.getWhitePoint().toXyz$ui_graphics();
            if (!androidx.compose.ui.graphics.colorspace.ColorSpaceKt.compare(p0.getWhitePoint(), androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50())) {
                transform = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3(androidx.compose.ui.graphics.colorspace.ColorSpaceKt.chromaticAdaptation(androidx.compose.ui.graphics.colorspace.Adaptation.INSTANCE.getBradford().getTransform(), xyz$ui_graphics, androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.newD50Xyz$ui_graphics()), p0.getTransform());
            }
            if (!androidx.compose.ui.graphics.colorspace.ColorSpaceKt.compare(p1.getWhitePoint(), androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50())) {
                inverseTransform = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.inverse3x3(androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3(androidx.compose.ui.graphics.colorspace.ColorSpaceKt.chromaticAdaptation(androidx.compose.ui.graphics.colorspace.Adaptation.INSTANCE.getBradford().getTransform(), xyz$ui_graphics2, androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.newD50Xyz$ui_graphics()), p1.getTransform()));
            }
            if (androidx.compose.ui.graphics.colorspace.RenderIntent.m6415equalsimpl0(p2, androidx.compose.ui.graphics.colorspace.RenderIntent.INSTANCE.m6419getAbsoluteuksYyKA())) {
                transform = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3Diag(new float[]{xyz$ui_graphics[0] / xyz$ui_graphics2[0], xyz$ui_graphics[1] / xyz$ui_graphics2[1], xyz$ui_graphics[2] / xyz$ui_graphics2[2]}, transform);
            }
            return androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3(inverseTransform, transform);
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        /* renamed from: transformToColor-l2rxGTc$ui_graphics */
        public final long mo6409transformToColorl2rxGTc$ui_graphics(long color) {
            float m6002getRedimpl = androidx.compose.ui.graphics.Color.m6002getRedimpl(color);
            float m6001getGreenimpl = androidx.compose.ui.graphics.Color.m6001getGreenimpl(color);
            float m5999getBlueimpl = androidx.compose.ui.graphics.Color.m5999getBlueimpl(color);
            float m5998getAlphaimpl = androidx.compose.ui.graphics.Color.m5998getAlphaimpl(color);
            float invoke = (float) this.getHighResolutionOutputSizeshNQ4ISI.getEotfFunc().invoke(m6002getRedimpl);
            float invoke2 = (float) this.getHighResolutionOutputSizeshNQ4ISI.getEotfFunc().invoke(m6001getGreenimpl);
            float invoke3 = (float) this.getHighResolutionOutputSizeshNQ4ISI.getEotfFunc().invoke(m5999getBlueimpl);
            float[] fArr = this.Camera2StreamConfigurationMap;
            return androidx.compose.ui.graphics.ColorKt.Color((float) this.getHighSpeedVideoFpsRanges.getOetfFunc().invoke((fArr[0] * invoke) + (fArr[3] * invoke2) + (fArr[6] * invoke3)), (float) this.getHighSpeedVideoFpsRanges.getOetfFunc().invoke((fArr[1] * invoke) + (fArr[4] * invoke2) + (fArr[7] * invoke3)), (float) this.getHighSpeedVideoFpsRanges.getOetfFunc().invoke((fArr[2] * invoke) + (fArr[5] * invoke2) + (fArr[8] * invoke3)), m5998getAlphaimpl, this.getHighSpeedVideoFpsRanges);
        }

        public /* synthetic */ RgbConnector(androidx.compose.ui.graphics.colorspace.Rgb rgb, androidx.compose.ui.graphics.colorspace.Rgb rgb2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(rgb, rgb2, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "p0", "p1", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "p2", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)[F", "source", "Landroidx/compose/ui/graphics/colorspace/Connector;", "identity$ui_graphics", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/colorspace/Connector;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: access$computeTransform-YBCOT_4, reason: not valid java name */
        public static final /* synthetic */ float[] m6410access$computeTransformYBCOT_4(androidx.compose.ui.graphics.colorspace.Connector.Companion companion, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace2, int i) {
            return getHighResolutionOutputSizeshNQ4ISI(colorSpace, colorSpace2, i);
        }

        private static float[] getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.colorspace.ColorSpace p0, androidx.compose.ui.graphics.colorspace.ColorSpace p1, int p2) {
            if (!androidx.compose.ui.graphics.colorspace.RenderIntent.m6415equalsimpl0(p2, androidx.compose.ui.graphics.colorspace.RenderIntent.INSTANCE.m6419getAbsoluteuksYyKA())) {
                return null;
            }
            boolean m6395equalsimpl0 = androidx.compose.ui.graphics.colorspace.ColorModel.m6395equalsimpl0(p0.getModel(), androidx.compose.ui.graphics.colorspace.ColorModel.INSTANCE.m6402getRgbxdoWZVw());
            boolean m6395equalsimpl02 = androidx.compose.ui.graphics.colorspace.ColorModel.m6395equalsimpl0(p1.getModel(), androidx.compose.ui.graphics.colorspace.ColorModel.INSTANCE.m6402getRgbxdoWZVw());
            if (m6395equalsimpl0 && m6395equalsimpl02) {
                return null;
            }
            if (!m6395equalsimpl0 && !m6395equalsimpl02) {
                return null;
            }
            if (!m6395equalsimpl0) {
                p0 = p1;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(p0, "");
            androidx.compose.ui.graphics.colorspace.Rgb rgb = (androidx.compose.ui.graphics.colorspace.Rgb) p0;
            float[] xyz$ui_graphics = m6395equalsimpl0 ? rgb.getWhitePoint().toXyz$ui_graphics() : androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50Xyz$ui_graphics();
            float[] xyz$ui_graphics2 = m6395equalsimpl02 ? rgb.getWhitePoint().toXyz$ui_graphics() : androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50Xyz$ui_graphics();
            return new float[]{xyz$ui_graphics[0] / xyz$ui_graphics2[0], xyz$ui_graphics[1] / xyz$ui_graphics2[1], xyz$ui_graphics[2] / xyz$ui_graphics2[2]};
        }

        public final androidx.compose.ui.graphics.colorspace.Connector identity$ui_graphics(final androidx.compose.ui.graphics.colorspace.ColorSpace source) {
            final int m6421getRelativeuksYyKA = androidx.compose.ui.graphics.colorspace.RenderIntent.INSTANCE.m6421getRelativeuksYyKA();
            return new androidx.compose.ui.graphics.colorspace.Connector(source, m6421getRelativeuksYyKA) { // from class: androidx.compose.ui.graphics.colorspace.Connector$Companion$identity$1
                @Override // androidx.compose.ui.graphics.colorspace.Connector
                public final float[] transform(float[] v) {
                    return v;
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                /* renamed from: transformToColor-l2rxGTc$ui_graphics */
                public final long mo6409transformToColorl2rxGTc$ui_graphics(long color) {
                    return color;
                }

                {
                    super(source, source, m6421getRelativeuksYyKA, null);
                }
            };
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: transformToColor-l2rxGTc$ui_graphics, reason: not valid java name */
    public long mo6409transformToColorl2rxGTc$ui_graphics(long color) {
        float m6002getRedimpl = androidx.compose.ui.graphics.Color.m6002getRedimpl(color);
        float m6001getGreenimpl = androidx.compose.ui.graphics.Color.m6001getGreenimpl(color);
        float m5999getBlueimpl = androidx.compose.ui.graphics.Color.m5999getBlueimpl(color);
        float m5998getAlphaimpl = androidx.compose.ui.graphics.Color.m5998getAlphaimpl(color);
        long xy$ui_graphics = this.Camera2StreamConfigurationMap.toXy$ui_graphics(m6002getRedimpl, m6001getGreenimpl, m5999getBlueimpl);
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (xy$ui_graphics >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (xy$ui_graphics & 4294967295L));
        float z$ui_graphics = this.Camera2StreamConfigurationMap.toZ$ui_graphics(m6002getRedimpl, m6001getGreenimpl, m5999getBlueimpl);
        float[] fArr = this.getHighSpeedVideoFpsRangesFor;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            z$ui_graphics *= fArr[2];
        }
        float f = intBitsToFloat;
        return this.getHighResolutionOutputSizeshNQ4ISI.mo6405xyzaToColorJlNiLsg$ui_graphics(f, intBitsToFloat2, z$ui_graphics, m5998getAlphaimpl, this.destination);
    }

    public /* synthetic */ Connector(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace2, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace3, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace4, int i, float[] fArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, colorSpace3, colorSpace4, i, fArr);
    }

    public /* synthetic */ Connector(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, i);
    }
}
