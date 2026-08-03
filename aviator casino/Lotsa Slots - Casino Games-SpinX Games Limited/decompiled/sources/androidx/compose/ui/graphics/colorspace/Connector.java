package androidx.compose.ui.graphics.colorspace;

/* compiled from: Connector.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u001f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B9\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0018\u001a\u00020\fH\u0017J5\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0015H\u0010ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\n\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector;", "", "source", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "destination", "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "transformSource", "transformDestination", "renderIntent", "transform", "", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDestination", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getRenderIntent-uksYyKA", "()I", "I", "getSource", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "", "g", "b", "v", "transformToColor", "Landroidx/compose/ui/graphics/Color;", "a", "transformToColor-wmQWz5c$ui_graphics_release", "(FFFF)J", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "RgbConnector", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class Connector {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.colorspace.Connector.Companion INSTANCE;
    private static final androidx.compose.ui.graphics.colorspace.Connector OklabToSrgbPerceptual;
    private static final androidx.compose.ui.graphics.colorspace.Connector SrgbIdentity;
    private static final androidx.compose.ui.graphics.colorspace.Connector SrgbToOklabPerceptual;
    private final androidx.compose.ui.graphics.colorspace.ColorSpace destination;
    private final int renderIntent;
    private final androidx.compose.ui.graphics.colorspace.ColorSpace source;
    private final float[] transform;
    private final androidx.compose.ui.graphics.colorspace.ColorSpace transformDestination;
    private final androidx.compose.ui.graphics.colorspace.ColorSpace transformSource;

    public /* synthetic */ Connector(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, i);
    }

    public /* synthetic */ Connector(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace2, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace3, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace4, int i, float[] fArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, colorSpace3, colorSpace4, i, fArr);
    }

    private Connector(androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace2, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace3, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace4, int i, float[] fArr) {
        this.source = colorSpace;
        this.destination = colorSpace2;
        this.transformSource = colorSpace3;
        this.transformDestination = colorSpace4;
        this.renderIntent = i;
        this.transform = fArr;
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
        this(colorSpace, colorSpace2, androidx.compose.ui.graphics.colorspace.ColorModel.m2528equalsimpl0(colorSpace.getModel(), androidx.compose.ui.graphics.colorspace.ColorModel.INSTANCE.m2535getRgbxdoWZVw()) ? androidx.compose.ui.graphics.colorspace.ColorSpaceKt.adapt$default(colorSpace, androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace, androidx.compose.ui.graphics.colorspace.ColorModel.m2528equalsimpl0(colorSpace2.getModel(), androidx.compose.ui.graphics.colorspace.ColorModel.INSTANCE.m2535getRgbxdoWZVw()) ? androidx.compose.ui.graphics.colorspace.ColorSpaceKt.adapt$default(colorSpace2, androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace2, i, INSTANCE.m2544computeTransformYBCOT_4(colorSpace, colorSpace2, i), null);
    }

    public final float[] transform(float r, float g, float b) {
        return transform(new float[]{r, g, b});
    }

    public float[] transform(float[] v) {
        float[] xyz = this.transformSource.toXyz(v);
        float[] fArr = this.transform;
        if (fArr != null) {
            xyz[0] = xyz[0] * fArr[0];
            xyz[1] = xyz[1] * fArr[1];
            xyz[2] = xyz[2] * fArr[2];
        }
        return this.transformDestination.fromXyz(xyz);
    }

    /* renamed from: transformToColor-wmQWz5c$ui_graphics_release, reason: not valid java name */
    public long mo2542transformToColorwmQWz5c$ui_graphics_release(float r, float g, float b, float a2) {
        long xy$ui_graphics_release = this.transformSource.toXy$ui_graphics_release(r, g, b);
        kotlin.jvm.internal.FloatCompanionObject floatCompanionObject = kotlin.jvm.internal.FloatCompanionObject.INSTANCE;
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (xy$ui_graphics_release >> 32));
        kotlin.jvm.internal.FloatCompanionObject floatCompanionObject2 = kotlin.jvm.internal.FloatCompanionObject.INSTANCE;
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (xy$ui_graphics_release & 4294967295L));
        float z$ui_graphics_release = this.transformSource.toZ$ui_graphics_release(r, g, b);
        float[] fArr = this.transform;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            z$ui_graphics_release *= fArr[2];
        }
        float f = intBitsToFloat2;
        float f2 = intBitsToFloat;
        return this.transformDestination.mo2538xyzaToColorJlNiLsg$ui_graphics_release(f2, f, z$ui_graphics_release, a2, this.destination);
    }

    /* compiled from: Connector.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J*\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016J5\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0010ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$RgbConnector;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "mSource", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "mDestination", "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "mTransform", "", "computeTransform", "source", "destination", "computeTransform-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;I)[F", "transform", "v", "transformToColor", "Landroidx/compose/ui/graphics/Color;", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "", "g", "b", "a", "transformToColor-wmQWz5c$ui_graphics_release", "(FFFF)J", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RgbConnector extends androidx.compose.ui.graphics.colorspace.Connector {
        private final androidx.compose.ui.graphics.colorspace.Rgb mDestination;
        private final androidx.compose.ui.graphics.colorspace.Rgb mSource;
        private final float[] mTransform;

        public /* synthetic */ RgbConnector(androidx.compose.ui.graphics.colorspace.Rgb rgb, androidx.compose.ui.graphics.colorspace.Rgb rgb2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(rgb, rgb2, i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private RgbConnector(androidx.compose.ui.graphics.colorspace.Rgb rgb, androidx.compose.ui.graphics.colorspace.Rgb rgb2, int i) {
            super(r3, r4, r3, r4, i, null, null);
            androidx.compose.ui.graphics.colorspace.Rgb rgb3 = rgb;
            androidx.compose.ui.graphics.colorspace.Rgb rgb4 = rgb2;
            this.mSource = rgb;
            this.mDestination = rgb2;
            this.mTransform = m2545computeTransformYBCOT_4(rgb, rgb2, i);
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        public float[] transform(float[] v) {
            v[0] = (float) this.mSource.getEotfFunc().invoke(v[0]);
            v[1] = (float) this.mSource.getEotfFunc().invoke(v[1]);
            v[2] = (float) this.mSource.getEotfFunc().invoke(v[2]);
            androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3Float3(this.mTransform, v);
            v[0] = (float) this.mDestination.getOetfFunc().invoke(v[0]);
            v[1] = (float) this.mDestination.getOetfFunc().invoke(v[1]);
            v[2] = (float) this.mDestination.getOetfFunc().invoke(v[2]);
            return v;
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        /* renamed from: transformToColor-wmQWz5c$ui_graphics_release */
        public long mo2542transformToColorwmQWz5c$ui_graphics_release(float r, float g, float b, float a2) {
            float invoke = (float) this.mSource.getEotfFunc().invoke(r);
            float invoke2 = (float) this.mSource.getEotfFunc().invoke(g);
            float invoke3 = (float) this.mSource.getEotfFunc().invoke(b);
            return androidx.compose.ui.graphics.ColorKt.Color((float) this.mDestination.getOetfFunc().invoke(androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3Float3_0(this.mTransform, invoke, invoke2, invoke3)), (float) this.mDestination.getOetfFunc().invoke(androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3Float3_1(this.mTransform, invoke, invoke2, invoke3)), (float) this.mDestination.getOetfFunc().invoke(androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3Float3_2(this.mTransform, invoke, invoke2, invoke3)), a2, this.mDestination);
        }

        /* renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        private final float[] m2545computeTransformYBCOT_4(androidx.compose.ui.graphics.colorspace.Rgb source, androidx.compose.ui.graphics.colorspace.Rgb destination, int intent) {
            if (androidx.compose.ui.graphics.colorspace.ColorSpaceKt.compare(source.getWhitePoint(), destination.getWhitePoint())) {
                return androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3(destination.getInverseTransform(), source.getTransform());
            }
            float[] transform = source.getTransform();
            float[] inverseTransform = destination.getInverseTransform();
            float[] xyz$ui_graphics_release = source.getWhitePoint().toXyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = destination.getWhitePoint().toXyz$ui_graphics_release();
            if (!androidx.compose.ui.graphics.colorspace.ColorSpaceKt.compare(source.getWhitePoint(), androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50())) {
                float[] transform2 = androidx.compose.ui.graphics.colorspace.Adaptation.INSTANCE.getBradford().getTransform();
                float[] d50Xyz$ui_graphics_release = androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
                float[] copyOf = java.util.Arrays.copyOf(d50Xyz$ui_graphics_release, d50Xyz$ui_graphics_release.length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                transform = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3(androidx.compose.ui.graphics.colorspace.ColorSpaceKt.chromaticAdaptation(transform2, xyz$ui_graphics_release, copyOf), source.getTransform());
            }
            if (!androidx.compose.ui.graphics.colorspace.ColorSpaceKt.compare(destination.getWhitePoint(), androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50())) {
                float[] transform3 = androidx.compose.ui.graphics.colorspace.Adaptation.INSTANCE.getBradford().getTransform();
                float[] d50Xyz$ui_graphics_release2 = androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
                float[] copyOf2 = java.util.Arrays.copyOf(d50Xyz$ui_graphics_release2, d50Xyz$ui_graphics_release2.length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, size)");
                inverseTransform = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.inverse3x3(androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3(androidx.compose.ui.graphics.colorspace.ColorSpaceKt.chromaticAdaptation(transform3, xyz$ui_graphics_release2, copyOf2), destination.getTransform()));
            }
            if (androidx.compose.ui.graphics.colorspace.RenderIntent.m2549equalsimpl0(intent, androidx.compose.ui.graphics.colorspace.RenderIntent.INSTANCE.m2553getAbsoluteuksYyKA())) {
                transform = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3Diag(new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]}, transform);
            }
            return androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3(inverseTransform, transform);
        }
    }

    /* compiled from: Connector.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0015R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$Companion;", "", "()V", "OklabToSrgbPerceptual", "Landroidx/compose/ui/graphics/colorspace/Connector;", "getOklabToSrgbPerceptual$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/Connector;", "SrgbIdentity", "getSrgbIdentity$ui_graphics_release", "SrgbToOklabPerceptual", "getSrgbToOklabPerceptual$ui_graphics_release", "computeTransform", "", "source", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "destination", "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "computeTransform-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)[F", "identity", "identity$ui_graphics_release", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        public final float[] m2544computeTransformYBCOT_4(androidx.compose.ui.graphics.colorspace.ColorSpace source, androidx.compose.ui.graphics.colorspace.ColorSpace destination, int intent) {
            if (!androidx.compose.ui.graphics.colorspace.RenderIntent.m2549equalsimpl0(intent, androidx.compose.ui.graphics.colorspace.RenderIntent.INSTANCE.m2553getAbsoluteuksYyKA())) {
                return null;
            }
            boolean m2528equalsimpl0 = androidx.compose.ui.graphics.colorspace.ColorModel.m2528equalsimpl0(source.getModel(), androidx.compose.ui.graphics.colorspace.ColorModel.INSTANCE.m2535getRgbxdoWZVw());
            boolean m2528equalsimpl02 = androidx.compose.ui.graphics.colorspace.ColorModel.m2528equalsimpl0(destination.getModel(), androidx.compose.ui.graphics.colorspace.ColorModel.INSTANCE.m2535getRgbxdoWZVw());
            if (m2528equalsimpl0 && m2528equalsimpl02) {
                return null;
            }
            if (!m2528equalsimpl0 && !m2528equalsimpl02) {
                return null;
            }
            if (!m2528equalsimpl0) {
                source = destination;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(source, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            androidx.compose.ui.graphics.colorspace.Rgb rgb = (androidx.compose.ui.graphics.colorspace.Rgb) source;
            float[] xyz$ui_graphics_release = m2528equalsimpl0 ? rgb.getWhitePoint().toXyz$ui_graphics_release() : androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = m2528equalsimpl02 ? rgb.getWhitePoint().toXyz$ui_graphics_release() : androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            return new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]};
        }

        public final androidx.compose.ui.graphics.colorspace.Connector identity$ui_graphics_release(final androidx.compose.ui.graphics.colorspace.ColorSpace source) {
            final int m2555getRelativeuksYyKA = androidx.compose.ui.graphics.colorspace.RenderIntent.INSTANCE.m2555getRelativeuksYyKA();
            return new androidx.compose.ui.graphics.colorspace.Connector(source, m2555getRelativeuksYyKA) { // from class: androidx.compose.ui.graphics.colorspace.Connector$Companion$identity$1
                @Override // androidx.compose.ui.graphics.colorspace.Connector
                public float[] transform(float[] v) {
                    return v;
                }

                {
                    super(source, source, m2555getRelativeuksYyKA, null);
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                /* renamed from: transformToColor-wmQWz5c$ui_graphics_release */
                public long mo2542transformToColorwmQWz5c$ui_graphics_release(float r, float g, float b, float a2) {
                    return androidx.compose.ui.graphics.ColorKt.Color(r, g, b, a2, getDestination());
                }
            };
        }

        public final androidx.compose.ui.graphics.colorspace.Connector getSrgbIdentity$ui_graphics_release() {
            return androidx.compose.ui.graphics.colorspace.Connector.SrgbIdentity;
        }

        public final androidx.compose.ui.graphics.colorspace.Connector getSrgbToOklabPerceptual$ui_graphics_release() {
            return androidx.compose.ui.graphics.colorspace.Connector.SrgbToOklabPerceptual;
        }

        public final androidx.compose.ui.graphics.colorspace.Connector getOklabToSrgbPerceptual$ui_graphics_release() {
            return androidx.compose.ui.graphics.colorspace.Connector.OklabToSrgbPerceptual;
        }
    }

    static {
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        androidx.compose.ui.graphics.colorspace.Connector.Companion companion = new androidx.compose.ui.graphics.colorspace.Connector.Companion(defaultConstructorMarker);
        INSTANCE = companion;
        SrgbIdentity = companion.identity$ui_graphics_release(androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb());
        SrgbToOklabPerceptual = new androidx.compose.ui.graphics.colorspace.Connector(androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb(), androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getOklab(), androidx.compose.ui.graphics.colorspace.RenderIntent.INSTANCE.m2554getPerceptualuksYyKA(), defaultConstructorMarker);
        OklabToSrgbPerceptual = new androidx.compose.ui.graphics.colorspace.Connector(androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getOklab(), androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb(), androidx.compose.ui.graphics.colorspace.RenderIntent.INSTANCE.m2554getPerceptualuksYyKA(), defaultConstructorMarker);
    }
}
