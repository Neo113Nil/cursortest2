package androidx.compose.ui.graphics;

/* compiled from: Color.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 :2\u00020\u0001:\u0001:B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u000bJ\u0010\u0010\u001f\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b \u0010\u000bJ\u0010\u0010!\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b\"\u0010\u000bJ\u0010\u0010#\u001a\u00020\u0007H\u0087\u0002¢\u0006\u0004\b$\u0010\u000bJ\u0010\u0010%\u001a\u00020\u0010H\u0087\u0002¢\u0006\u0004\b&\u0010\u0013J\u001b\u0010'\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J=\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001a\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0017\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\t\u001a\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b\u0088\u0001\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "", "value", "Lkotlin/ULong;", "constructor-impl", "(J)J", "alpha", "", "getAlpha$annotations", "()V", "getAlpha-impl", "(J)F", "blue", "getBlue$annotations", "getBlue-impl", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace$annotations", "getColorSpace-impl", "(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "green", "getGreen$annotations", "getGreen-impl", "red", "getRed$annotations", "getRed-impl", "getValue-s-VKNKU", "()J", "J", "component1", "component1-impl", "component2", "component2-impl", "component3", "component3-impl", "component4", "component4-impl", "component5", "component5-impl", "convert", "convert-vNxB06k", "(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "copy", "copy-wmQWz5c", "(JFFFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class Color {
    private final long value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.Color.Companion INSTANCE = new androidx.compose.ui.graphics.Color.Companion(null);
    private static final long Black = androidx.compose.ui.graphics.ColorKt.Color(4278190080L);
    private static final long DarkGray = androidx.compose.ui.graphics.ColorKt.Color(4282664004L);
    private static final long Gray = androidx.compose.ui.graphics.ColorKt.Color(4287137928L);
    private static final long LightGray = androidx.compose.ui.graphics.ColorKt.Color(4291611852L);
    private static final long White = androidx.compose.ui.graphics.ColorKt.Color(4294967295L);
    private static final long Red = androidx.compose.ui.graphics.ColorKt.Color(4294901760L);
    private static final long Green = androidx.compose.ui.graphics.ColorKt.Color(4278255360L);
    private static final long Blue = androidx.compose.ui.graphics.ColorKt.Color(4278190335L);
    private static final long Yellow = androidx.compose.ui.graphics.ColorKt.Color(4294967040L);
    private static final long Cyan = androidx.compose.ui.graphics.ColorKt.Color(4278255615L);
    private static final long Magenta = androidx.compose.ui.graphics.ColorKt.Color(4294902015L);
    private static final long Transparent = androidx.compose.ui.graphics.ColorKt.Color(0);
    private static final long Unspecified = androidx.compose.ui.graphics.ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.graphics.Color m2103boximpl(long j) {
        return new androidx.compose.ui.graphics.Color(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2109constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2113equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.graphics.Color) && j == ((androidx.compose.ui.graphics.Color) obj).m2123unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2114equalsimpl0(long j, long j2) {
        return kotlin.ULong.m10982equalsimpl0(j, j2);
    }

    public static /* synthetic */ void getAlpha$annotations() {
    }

    public static /* synthetic */ void getBlue$annotations() {
    }

    public static /* synthetic */ void getColorSpace$annotations() {
    }

    public static /* synthetic */ void getGreen$annotations() {
    }

    public static /* synthetic */ void getRed$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2120hashCodeimpl(long j) {
        return kotlin.ULong.m10987hashCodeimpl(j);
    }

    public boolean equals(java.lang.Object obj) {
        return m2113equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2120hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m2123unboximpl() {
        return this.value;
    }

    private /* synthetic */ Color(long j) {
        this.value = j;
    }

    /* renamed from: getValue-s-VKNKU, reason: not valid java name and from getter */
    public final long getValue() {
        return this.value;
    }

    /* renamed from: getColorSpace-impl, reason: not valid java name */
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace m2117getColorSpaceimpl(long j) {
        androidx.compose.ui.graphics.colorspace.ColorSpaces colorSpaces = androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE;
        return colorSpaces.getColorSpacesArray$ui_graphics_release()[(int) kotlin.ULong.m10975constructorimpl(j & 63)];
    }

    /* renamed from: convert-vNxB06k, reason: not valid java name */
    public static final long m2110convertvNxB06k(long j, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        androidx.compose.ui.graphics.colorspace.ColorSpace m2117getColorSpaceimpl = m2117getColorSpaceimpl(j);
        return kotlin.jvm.internal.Intrinsics.areEqual(colorSpace, m2117getColorSpaceimpl) ? j : androidx.compose.ui.graphics.colorspace.ColorSpaceKt.m2540connectYBCOT_4$default(m2117getColorSpaceimpl, colorSpace, 0, 2, null).mo2542transformToColorwmQWz5c$ui_graphics_release(m2119getRedimpl(j), m2118getGreenimpl(j), m2116getBlueimpl(j), m2115getAlphaimpl(j));
    }

    /* renamed from: getRed-impl, reason: not valid java name */
    public static final float m2119getRedimpl(long j) {
        if (kotlin.ULong.m10975constructorimpl(63 & j) == 0) {
            return ((float) kotlin.UnsignedKt.ulongToDouble(kotlin.ULong.m10975constructorimpl(kotlin.ULong.m10975constructorimpl(j >>> 48) & 255))) / 255.0f;
        }
        return androidx.compose.ui.graphics.Float16.m2239toFloatimpl(androidx.compose.ui.graphics.Float16.m2223constructorimpl((short) kotlin.ULong.m10975constructorimpl(kotlin.ULong.m10975constructorimpl(j >>> 48) & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    /* renamed from: getGreen-impl, reason: not valid java name */
    public static final float m2118getGreenimpl(long j) {
        if (kotlin.ULong.m10975constructorimpl(63 & j) == 0) {
            return ((float) kotlin.UnsignedKt.ulongToDouble(kotlin.ULong.m10975constructorimpl(kotlin.ULong.m10975constructorimpl(j >>> 40) & 255))) / 255.0f;
        }
        return androidx.compose.ui.graphics.Float16.m2239toFloatimpl(androidx.compose.ui.graphics.Float16.m2223constructorimpl((short) kotlin.ULong.m10975constructorimpl(kotlin.ULong.m10975constructorimpl(j >>> 32) & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    /* renamed from: getBlue-impl, reason: not valid java name */
    public static final float m2116getBlueimpl(long j) {
        if (kotlin.ULong.m10975constructorimpl(63 & j) == 0) {
            return ((float) kotlin.UnsignedKt.ulongToDouble(kotlin.ULong.m10975constructorimpl(kotlin.ULong.m10975constructorimpl(j >>> 32) & 255))) / 255.0f;
        }
        return androidx.compose.ui.graphics.Float16.m2239toFloatimpl(androidx.compose.ui.graphics.Float16.m2223constructorimpl((short) kotlin.ULong.m10975constructorimpl(kotlin.ULong.m10975constructorimpl(j >>> 16) & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    /* renamed from: getAlpha-impl, reason: not valid java name */
    public static final float m2115getAlphaimpl(long j) {
        float ulongToDouble;
        float f;
        if (kotlin.ULong.m10975constructorimpl(63 & j) == 0) {
            ulongToDouble = (float) kotlin.UnsignedKt.ulongToDouble(kotlin.ULong.m10975constructorimpl(kotlin.ULong.m10975constructorimpl(j >>> 56) & 255));
            f = 255.0f;
        } else {
            ulongToDouble = (float) kotlin.UnsignedKt.ulongToDouble(kotlin.ULong.m10975constructorimpl(kotlin.ULong.m10975constructorimpl(j >>> 6) & 1023));
            f = 1023.0f;
        }
        return ulongToDouble / f;
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m2104component1impl(long j) {
        return m2119getRedimpl(j);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m2105component2impl(long j) {
        return m2118getGreenimpl(j);
    }

    /* renamed from: component3-impl, reason: not valid java name */
    public static final float m2106component3impl(long j) {
        return m2116getBlueimpl(j);
    }

    /* renamed from: component4-impl, reason: not valid java name */
    public static final float m2107component4impl(long j) {
        return m2115getAlphaimpl(j);
    }

    /* renamed from: component5-impl, reason: not valid java name */
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace m2108component5impl(long j) {
        return m2117getColorSpaceimpl(j);
    }

    /* renamed from: copy-wmQWz5c$default, reason: not valid java name */
    public static /* synthetic */ long m2112copywmQWz5c$default(long j, float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = m2115getAlphaimpl(j);
        }
        float f5 = f;
        if ((i & 2) != 0) {
            f2 = m2119getRedimpl(j);
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = m2118getGreenimpl(j);
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = m2116getBlueimpl(j);
        }
        return m2111copywmQWz5c(j, f5, f6, f7, f4);
    }

    /* renamed from: copy-wmQWz5c, reason: not valid java name */
    public static final long m2111copywmQWz5c(long j, float f, float f2, float f3, float f4) {
        return androidx.compose.ui.graphics.ColorKt.Color(f2, f3, f4, f, m2117getColorSpaceimpl(j));
    }

    public java.lang.String toString() {
        return m2121toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m2121toStringimpl(long j) {
        return "Color(" + m2119getRedimpl(j) + ", " + m2118getGreenimpl(j) + ", " + m2116getBlueimpl(j) + ", " + m2115getAlphaimpl(j) + ", " + m2117getColorSpaceimpl(j).getName() + ')';
    }

    /* compiled from: Color.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J?\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u000204ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u00106J(\u00107\u001a\u00020/2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020/2\u0006\u0010<\u001a\u00020/H\u0002J?\u0010=\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u0010>\u001a\u00020/2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0002\u00103\u001a\u000204ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u00106J(\u0010@\u001a\u00020/2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/2\u0006\u0010;\u001a\u00020/2\u0006\u0010A\u001a\u00020/H\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007R$\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0007R$\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0007R$\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007R$\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0007R$\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u0007R$\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0007R$\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u0007R$\u0010!\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u0007R$\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b%\u0010\u0002\u001a\u0004\b&\u0010\u0007R$\u0010'\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b(\u0010\u0002\u001a\u0004\b)\u0010\u0007R$\u0010*\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\u0007\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "()V", "Black", "Landroidx/compose/ui/graphics/Color;", "getBlack-0d7_KjU$annotations", "getBlack-0d7_KjU", "()J", "J", "Blue", "getBlue-0d7_KjU$annotations", "getBlue-0d7_KjU", "Cyan", "getCyan-0d7_KjU$annotations", "getCyan-0d7_KjU", "DarkGray", "getDarkGray-0d7_KjU$annotations", "getDarkGray-0d7_KjU", "Gray", "getGray-0d7_KjU$annotations", "getGray-0d7_KjU", "Green", "getGreen-0d7_KjU$annotations", "getGreen-0d7_KjU", "LightGray", "getLightGray-0d7_KjU$annotations", "getLightGray-0d7_KjU", "Magenta", "getMagenta-0d7_KjU$annotations", "getMagenta-0d7_KjU", "Red", "getRed-0d7_KjU$annotations", "getRed-0d7_KjU", "Transparent", "getTransparent-0d7_KjU$annotations", "getTransparent-0d7_KjU", "Unspecified", "getUnspecified-0d7_KjU$annotations", "getUnspecified-0d7_KjU", "White", "getWhite-0d7_KjU$annotations", "getWhite-0d7_KjU", "Yellow", "getYellow-0d7_KjU$annotations", "getYellow-0d7_KjU", "hsl", "hue", "", "saturation", "lightness", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "hsl-JlNiLsg", "(FFFFLandroidx/compose/ui/graphics/colorspace/Rgb;)J", "hslToRgbComponent", com.ironsource.B5.q, "", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "hsv", "value", "hsv-JlNiLsg", "hsvToRgbComponent", "v", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getBlack-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2124getBlack0d7_KjU$annotations() {
        }

        /* renamed from: getBlue-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2125getBlue0d7_KjU$annotations() {
        }

        /* renamed from: getCyan-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2126getCyan0d7_KjU$annotations() {
        }

        /* renamed from: getDarkGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2127getDarkGray0d7_KjU$annotations() {
        }

        /* renamed from: getGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2128getGray0d7_KjU$annotations() {
        }

        /* renamed from: getGreen-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2129getGreen0d7_KjU$annotations() {
        }

        /* renamed from: getLightGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2130getLightGray0d7_KjU$annotations() {
        }

        /* renamed from: getMagenta-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2131getMagenta0d7_KjU$annotations() {
        }

        /* renamed from: getRed-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2132getRed0d7_KjU$annotations() {
        }

        /* renamed from: getTransparent-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2133getTransparent0d7_KjU$annotations() {
        }

        /* renamed from: getUnspecified-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2134getUnspecified0d7_KjU$annotations() {
        }

        /* renamed from: getWhite-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2135getWhite0d7_KjU$annotations() {
        }

        /* renamed from: getYellow-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m2136getYellow0d7_KjU$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getBlack-0d7_KjU, reason: not valid java name */
        public final long m2139getBlack0d7_KjU() {
            return androidx.compose.ui.graphics.Color.Black;
        }

        /* renamed from: getDarkGray-0d7_KjU, reason: not valid java name */
        public final long m2142getDarkGray0d7_KjU() {
            return androidx.compose.ui.graphics.Color.DarkGray;
        }

        /* renamed from: getGray-0d7_KjU, reason: not valid java name */
        public final long m2143getGray0d7_KjU() {
            return androidx.compose.ui.graphics.Color.Gray;
        }

        /* renamed from: getLightGray-0d7_KjU, reason: not valid java name */
        public final long m2145getLightGray0d7_KjU() {
            return androidx.compose.ui.graphics.Color.LightGray;
        }

        /* renamed from: getWhite-0d7_KjU, reason: not valid java name */
        public final long m2150getWhite0d7_KjU() {
            return androidx.compose.ui.graphics.Color.White;
        }

        /* renamed from: getRed-0d7_KjU, reason: not valid java name */
        public final long m2147getRed0d7_KjU() {
            return androidx.compose.ui.graphics.Color.Red;
        }

        /* renamed from: getGreen-0d7_KjU, reason: not valid java name */
        public final long m2144getGreen0d7_KjU() {
            return androidx.compose.ui.graphics.Color.Green;
        }

        /* renamed from: getBlue-0d7_KjU, reason: not valid java name */
        public final long m2140getBlue0d7_KjU() {
            return androidx.compose.ui.graphics.Color.Blue;
        }

        /* renamed from: getYellow-0d7_KjU, reason: not valid java name */
        public final long m2151getYellow0d7_KjU() {
            return androidx.compose.ui.graphics.Color.Yellow;
        }

        /* renamed from: getCyan-0d7_KjU, reason: not valid java name */
        public final long m2141getCyan0d7_KjU() {
            return androidx.compose.ui.graphics.Color.Cyan;
        }

        /* renamed from: getMagenta-0d7_KjU, reason: not valid java name */
        public final long m2146getMagenta0d7_KjU() {
            return androidx.compose.ui.graphics.Color.Magenta;
        }

        /* renamed from: getTransparent-0d7_KjU, reason: not valid java name */
        public final long m2148getTransparent0d7_KjU() {
            return androidx.compose.ui.graphics.Color.Transparent;
        }

        /* renamed from: getUnspecified-0d7_KjU, reason: not valid java name */
        public final long m2149getUnspecified0d7_KjU() {
            return androidx.compose.ui.graphics.Color.Unspecified;
        }

        /* renamed from: hsv-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m2138hsvJlNiLsg$default(androidx.compose.ui.graphics.Color.Companion companion, float f, float f2, float f3, float f4, androidx.compose.ui.graphics.colorspace.Rgb rgb, int i, java.lang.Object obj) {
            float f5 = (i & 8) != 0 ? 1.0f : f4;
            if ((i & 16) != 0) {
                rgb = androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m2153hsvJlNiLsg(f, f2, f3, f5, rgb);
        }

        /* renamed from: hsv-JlNiLsg, reason: not valid java name */
        public final long m2153hsvJlNiLsg(float hue, float saturation, float value, float alpha, androidx.compose.ui.graphics.colorspace.Rgb colorSpace) {
            if (0.0f > hue || hue > 360.0f || 0.0f > saturation || saturation > 1.0f || 0.0f > value || value > 1.0f) {
                throw new java.lang.IllegalArgumentException(("HSV (" + hue + ", " + saturation + ", " + value + ") must be in range (0..360, 0..1, 0..1)").toString());
            }
            return androidx.compose.ui.graphics.ColorKt.Color(hsvToRgbComponent(5, hue, saturation, value), hsvToRgbComponent(3, hue, saturation, value), hsvToRgbComponent(1, hue, saturation, value), alpha, colorSpace);
        }

        private final float hsvToRgbComponent(int n, float h, float s, float v) {
            float f = (n + (h / 60.0f)) % 6.0f;
            return v - ((s * v) * java.lang.Math.max(0.0f, java.lang.Math.min(f, java.lang.Math.min(4 - f, 1.0f))));
        }

        /* renamed from: hsl-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m2137hslJlNiLsg$default(androidx.compose.ui.graphics.Color.Companion companion, float f, float f2, float f3, float f4, androidx.compose.ui.graphics.colorspace.Rgb rgb, int i, java.lang.Object obj) {
            float f5 = (i & 8) != 0 ? 1.0f : f4;
            if ((i & 16) != 0) {
                rgb = androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m2152hslJlNiLsg(f, f2, f3, f5, rgb);
        }

        /* renamed from: hsl-JlNiLsg, reason: not valid java name */
        public final long m2152hslJlNiLsg(float hue, float saturation, float lightness, float alpha, androidx.compose.ui.graphics.colorspace.Rgb colorSpace) {
            if (0.0f > hue || hue > 360.0f || 0.0f > saturation || saturation > 1.0f || 0.0f > lightness || lightness > 1.0f) {
                throw new java.lang.IllegalArgumentException(("HSL (" + hue + ", " + saturation + ", " + lightness + ") must be in range (0..360, 0..1, 0..1)").toString());
            }
            return androidx.compose.ui.graphics.ColorKt.Color(hslToRgbComponent(0, hue, saturation, lightness), hslToRgbComponent(8, hue, saturation, lightness), hslToRgbComponent(4, hue, saturation, lightness), alpha, colorSpace);
        }

        private final float hslToRgbComponent(int n, float h, float s, float l) {
            float f = (n + (h / 30.0f)) % 12.0f;
            return l - ((s * java.lang.Math.min(l, 1.0f - l)) * java.lang.Math.max(-1.0f, java.lang.Math.min(f - 3, java.lang.Math.min(9 - f, 1.0f))));
        }
    }
}
