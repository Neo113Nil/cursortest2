package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087@\u0018\u0000 82\u00020\u0001:\u00018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bH\u0086\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000bH\u0086\n¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000bH\u0086\n¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u000bH\u0086\n¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068G¢\u0006\f\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u000b8G¢\u0006\f\u0012\u0004\b1\u0010/\u001a\u0004\b0\u0010\rR\u0017\u0010\u001a\u001a\u00020\u000b8G¢\u0006\f\u0012\u0004\b3\u0010/\u001a\u0004\b2\u0010\rR\u0017\u0010\u001b\u001a\u00020\u000b8G¢\u0006\f\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010\rR\u0017\u0010\u0018\u001a\u00020\u000b8G¢\u0006\f\u0012\u0004\b7\u0010/\u001a\u0004\b6\u0010\r\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "", "Lkotlin/ULong;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(J)J", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "convert-vNxB06k", "(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "convert", "", "component1-impl", "(J)F", "component1", "component2-impl", "component2", "component3-impl", "component3", "component4-impl", "component4", "component5-impl", "(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "component5", "alpha", "red", "green", "blue", "copy-wmQWz5c", "(JFFFF)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getValue-s-VKNKU", "()J", "getColorSpace-impl", "getColorSpace$annotations", "()V", "getRed-impl", "getRed$annotations", "getGreen-impl", "getGreen$annotations", "getBlue-impl", "getBlue$annotations", "getAlpha-impl", "getAlpha$annotations", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class Color {
    private final long value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.Color.Companion INSTANCE = new androidx.compose.ui.graphics.Color.Companion(null);
    private static final long Black = androidx.compose.ui.graphics.ColorKt.Color(com.datadog.android.sessionreplay.utils.ColorConstantsKt.MASK_ALPHA);
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
    private static final long Unspecified = androidx.compose.ui.graphics.ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getUnspecified$ui_graphics());

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5992constructorimpl(long j) {
        return j;
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

    private /* synthetic */ Color(long j) {
        this.value = j;
    }

    /* renamed from: getValue-s-VKNKU, reason: not valid java name and from getter */
    public final long getValue() {
        return this.value;
    }

    /* renamed from: getColorSpace-impl, reason: not valid java name */
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace m6000getColorSpaceimpl(long j) {
        androidx.compose.ui.graphics.colorspace.ColorSpaces colorSpaces = androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE;
        return colorSpaces.getColorSpacesArray$ui_graphics()[(int) kotlin.ULong.m23494constructorimpl(j & 63)];
    }

    /* renamed from: convert-vNxB06k, reason: not valid java name */
    public static final long m5993convertvNxB06k(long j, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        return androidx.compose.ui.graphics.colorspace.ColorSpaceKt.m6407connectYBCOT_4$default(m6000getColorSpaceimpl(j), colorSpace, 0, 2, null).mo6409transformToColorl2rxGTc$ui_graphics(j);
    }

    /* renamed from: getRed-impl, reason: not valid java name */
    public static final float m6002getRedimpl(long j) {
        int i;
        int i2;
        int i3;
        if (kotlin.ULong.m23494constructorimpl(63 & j) == 0) {
            return ((float) kotlin.UnsignedKt.ulongToDouble(kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(j >>> 48) & 255))) / 255.0f;
        }
        short m23494constructorimpl = (short) kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(j >>> 48) & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i4 = 32768 & m23494constructorimpl;
        int i5 = ((65535 & m23494constructorimpl) >>> 10) & 31;
        int i6 = m23494constructorimpl & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = java.lang.Float.intBitsToFloat(i6 + 1056964608) - androidx.compose.ui.graphics.Float16Kt.getHighSpeedVideoFpsRanges;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return java.lang.Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* renamed from: getGreen-impl, reason: not valid java name */
    public static final float m6001getGreenimpl(long j) {
        int i;
        int i2;
        int i3;
        if (kotlin.ULong.m23494constructorimpl(63 & j) == 0) {
            return ((float) kotlin.UnsignedKt.ulongToDouble(kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(j >>> 40) & 255))) / 255.0f;
        }
        short m23494constructorimpl = (short) kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(j >>> 32) & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i4 = 32768 & m23494constructorimpl;
        int i5 = ((65535 & m23494constructorimpl) >>> 10) & 31;
        int i6 = m23494constructorimpl & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = java.lang.Float.intBitsToFloat(i6 + 1056964608) - androidx.compose.ui.graphics.Float16Kt.getHighSpeedVideoFpsRanges;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return java.lang.Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* renamed from: getBlue-impl, reason: not valid java name */
    public static final float m5999getBlueimpl(long j) {
        int i;
        int i2;
        int i3;
        if (kotlin.ULong.m23494constructorimpl(63 & j) == 0) {
            return ((float) kotlin.UnsignedKt.ulongToDouble(kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(j >>> 32) & 255))) / 255.0f;
        }
        short m23494constructorimpl = (short) kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(j >>> 16) & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i4 = 32768 & m23494constructorimpl;
        int i5 = ((65535 & m23494constructorimpl) >>> 10) & 31;
        int i6 = m23494constructorimpl & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float intBitsToFloat = java.lang.Float.intBitsToFloat(i6 + 1056964608) - androidx.compose.ui.graphics.Float16Kt.getHighSpeedVideoFpsRanges;
                return i4 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return java.lang.Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    /* renamed from: getAlpha-impl, reason: not valid java name */
    public static final float m5998getAlphaimpl(long j) {
        float ulongToDouble;
        float f;
        if (kotlin.ULong.m23494constructorimpl(63 & j) == 0) {
            ulongToDouble = (float) kotlin.UnsignedKt.ulongToDouble(kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(j >>> 56) & 255));
            f = 255.0f;
        } else {
            ulongToDouble = (float) kotlin.UnsignedKt.ulongToDouble(kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(j >>> 6) & 1023));
            f = 1023.0f;
        }
        return ulongToDouble / f;
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m5987component1impl(long j) {
        return m6002getRedimpl(j);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m5988component2impl(long j) {
        return m6001getGreenimpl(j);
    }

    /* renamed from: component3-impl, reason: not valid java name */
    public static final float m5989component3impl(long j) {
        return m5999getBlueimpl(j);
    }

    /* renamed from: component4-impl, reason: not valid java name */
    public static final float m5990component4impl(long j) {
        return m5998getAlphaimpl(j);
    }

    /* renamed from: component5-impl, reason: not valid java name */
    public static final androidx.compose.ui.graphics.colorspace.ColorSpace m5991component5impl(long j) {
        return m6000getColorSpaceimpl(j);
    }

    /* renamed from: copy-wmQWz5c$default, reason: not valid java name */
    public static /* synthetic */ long m5995copywmQWz5c$default(long j, float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = m5998getAlphaimpl(j);
        }
        float f5 = f;
        if ((i & 2) != 0) {
            f2 = m6002getRedimpl(j);
        }
        float f6 = f2;
        if ((i & 4) != 0) {
            f3 = m6001getGreenimpl(j);
        }
        float f7 = f3;
        if ((i & 8) != 0) {
            f4 = m5999getBlueimpl(j);
        }
        return m5994copywmQWz5c(j, f5, f6, f7, f4);
    }

    /* renamed from: copy-wmQWz5c, reason: not valid java name */
    public static final long m5994copywmQWz5c(long j, float f, float f2, float f3, float f4) {
        return androidx.compose.ui.graphics.ColorKt.Color(f2, f3, f4, f, m6000getColorSpaceimpl(j));
    }

    public final java.lang.String toString() {
        return m6004toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m6004toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Color(");
        sb.append(m6002getRedimpl(j));
        sb.append(", ");
        sb.append(m6001getGreenimpl(j));
        sb.append(", ");
        sb.append(m5999getBlueimpl(j));
        sb.append(", ");
        sb.append(m5998getAlphaimpl(j));
        sb.append(", ");
        sb.append(m6000getColorSpaceimpl(j).getName());
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b3\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\rJ/\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0015R\u001d\u0010\u001a\u001a\u00020\u000b8\u0007¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001f\u001a\u00020\u000b8\u0007¢\u0006\u0012\n\u0004\b\u001f\u0010\u001b\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\u001dR\u001d\u0010\"\u001a\u00020\u000b8\u0007¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\u001dR\u001d\u0010%\u001a\u00020\u000b8\u0007¢\u0006\u0012\n\u0004\b%\u0010\u001b\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010\u001dR\u001d\u0010(\u001a\u00020\u000b8\u0007¢\u0006\u0012\n\u0004\b(\u0010\u001b\u0012\u0004\b*\u0010\u0003\u001a\u0004\b)\u0010\u001dR\u001d\u0010+\u001a\u00020\u000b8\u0007¢\u0006\u0012\n\u0004\b+\u0010\u001b\u0012\u0004\b-\u0010\u0003\u001a\u0004\b,\u0010\u001dR\u001d\u0010.\u001a\u00020\u000b8\u0007¢\u0006\u0012\n\u0004\b.\u0010\u001b\u0012\u0004\b0\u0010\u0003\u001a\u0004\b/\u0010\u001dR\u001d\u00101\u001a\u00020\u000b8\u0007¢\u0006\u0012\n\u0004\b1\u0010\u001b\u0012\u0004\b3\u0010\u0003\u001a\u0004\b2\u0010\u001dR\u001d\u00104\u001a\u00020\u000b8\u0007¢\u0006\u0012\n\u0004\b4\u0010\u001b\u0012\u0004\b6\u0010\u0003\u001a\u0004\b5\u0010\u001dR\u001d\u00107\u001a\u00020\u000b8\u0007¢\u0006\u0012\n\u0004\b7\u0010\u001b\u0012\u0004\b9\u0010\u0003\u001a\u0004\b8\u0010\u001dR\u001d\u0010:\u001a\u00020\u000b8\u0007¢\u0006\u0012\n\u0004\b:\u0010\u001b\u0012\u0004\b<\u0010\u0003\u001a\u0004\b;\u0010\u001dR\u001d\u0010=\u001a\u00020\u000b8\u0007¢\u0006\u0012\n\u0004\b=\u0010\u001b\u0012\u0004\b?\u0010\u0003\u001a\u0004\b>\u0010\u001dR\u001d\u0010@\u001a\u00020\u000b8\u0007¢\u0006\u0012\n\u0004\b@\u0010\u001b\u0012\u0004\bB\u0010\u0003\u001a\u0004\bA\u0010\u001d"}, d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "<init>", "()V", "", "hue", "saturation", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "alpha", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "hsv-JlNiLsg", "(FFFFLandroidx/compose/ui/graphics/colorspace/Rgb;)J", "hsv", "", "p0", "p1", "p2", "p3", "getHighSpeedVideoFpsRanges", "(IFFF)F", "lightness", "hsl-JlNiLsg", "hsl", "getHighSpeedVideoFpsRangesFor", "Black", "J", "getBlack-0d7_KjU", "()J", "getBlack-0d7_KjU$annotations", "DarkGray", "getDarkGray-0d7_KjU", "getDarkGray-0d7_KjU$annotations", "Gray", "getGray-0d7_KjU", "getGray-0d7_KjU$annotations", "LightGray", "getLightGray-0d7_KjU", "getLightGray-0d7_KjU$annotations", "White", "getWhite-0d7_KjU", "getWhite-0d7_KjU$annotations", "Red", "getRed-0d7_KjU", "getRed-0d7_KjU$annotations", "Green", "getGreen-0d7_KjU", "getGreen-0d7_KjU$annotations", "Blue", "getBlue-0d7_KjU", "getBlue-0d7_KjU$annotations", "Yellow", "getYellow-0d7_KjU", "getYellow-0d7_KjU$annotations", "Cyan", "getCyan-0d7_KjU", "getCyan-0d7_KjU$annotations", "Magenta", "getMagenta-0d7_KjU", "getMagenta-0d7_KjU$annotations", "Transparent", "getTransparent-0d7_KjU", "getTransparent-0d7_KjU$annotations", "Unspecified", "getUnspecified-0d7_KjU", "getUnspecified-0d7_KjU$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* renamed from: getBlack-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m6007getBlack0d7_KjU$annotations() {
        }

        /* renamed from: getBlue-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m6008getBlue0d7_KjU$annotations() {
        }

        /* renamed from: getCyan-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m6009getCyan0d7_KjU$annotations() {
        }

        /* renamed from: getDarkGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m6010getDarkGray0d7_KjU$annotations() {
        }

        /* renamed from: getGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m6011getGray0d7_KjU$annotations() {
        }

        /* renamed from: getGreen-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m6012getGreen0d7_KjU$annotations() {
        }

        /* renamed from: getLightGray-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m6013getLightGray0d7_KjU$annotations() {
        }

        /* renamed from: getMagenta-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m6014getMagenta0d7_KjU$annotations() {
        }

        /* renamed from: getRed-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m6015getRed0d7_KjU$annotations() {
        }

        /* renamed from: getTransparent-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m6016getTransparent0d7_KjU$annotations() {
        }

        /* renamed from: getUnspecified-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m6017getUnspecified0d7_KjU$annotations() {
        }

        /* renamed from: getWhite-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m6018getWhite0d7_KjU$annotations() {
        }

        /* renamed from: getYellow-0d7_KjU$annotations, reason: not valid java name */
        public static /* synthetic */ void m6019getYellow0d7_KjU$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getBlack-0d7_KjU, reason: not valid java name */
        public final long m6022getBlack0d7_KjU() {
            return androidx.compose.ui.graphics.Color.Black;
        }

        /* renamed from: getDarkGray-0d7_KjU, reason: not valid java name */
        public final long m6025getDarkGray0d7_KjU() {
            return androidx.compose.ui.graphics.Color.DarkGray;
        }

        /* renamed from: getGray-0d7_KjU, reason: not valid java name */
        public final long m6026getGray0d7_KjU() {
            return androidx.compose.ui.graphics.Color.Gray;
        }

        /* renamed from: getLightGray-0d7_KjU, reason: not valid java name */
        public final long m6028getLightGray0d7_KjU() {
            return androidx.compose.ui.graphics.Color.LightGray;
        }

        /* renamed from: getWhite-0d7_KjU, reason: not valid java name */
        public final long m6033getWhite0d7_KjU() {
            return androidx.compose.ui.graphics.Color.White;
        }

        /* renamed from: getRed-0d7_KjU, reason: not valid java name */
        public final long m6030getRed0d7_KjU() {
            return androidx.compose.ui.graphics.Color.Red;
        }

        /* renamed from: getGreen-0d7_KjU, reason: not valid java name */
        public final long m6027getGreen0d7_KjU() {
            return androidx.compose.ui.graphics.Color.Green;
        }

        /* renamed from: getBlue-0d7_KjU, reason: not valid java name */
        public final long m6023getBlue0d7_KjU() {
            return androidx.compose.ui.graphics.Color.Blue;
        }

        /* renamed from: getYellow-0d7_KjU, reason: not valid java name */
        public final long m6034getYellow0d7_KjU() {
            return androidx.compose.ui.graphics.Color.Yellow;
        }

        /* renamed from: getCyan-0d7_KjU, reason: not valid java name */
        public final long m6024getCyan0d7_KjU() {
            return androidx.compose.ui.graphics.Color.Cyan;
        }

        /* renamed from: getMagenta-0d7_KjU, reason: not valid java name */
        public final long m6029getMagenta0d7_KjU() {
            return androidx.compose.ui.graphics.Color.Magenta;
        }

        /* renamed from: getTransparent-0d7_KjU, reason: not valid java name */
        public final long m6031getTransparent0d7_KjU() {
            return androidx.compose.ui.graphics.Color.Transparent;
        }

        /* renamed from: getUnspecified-0d7_KjU, reason: not valid java name */
        public final long m6032getUnspecified0d7_KjU() {
            return androidx.compose.ui.graphics.Color.Unspecified;
        }

        /* renamed from: hsv-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m6021hsvJlNiLsg$default(androidx.compose.ui.graphics.Color.Companion companion, float f, float f2, float f3, float f4, androidx.compose.ui.graphics.colorspace.Rgb rgb, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                f4 = 1.0f;
            }
            float f5 = f4;
            if ((i & 16) != 0) {
                rgb = androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m6036hsvJlNiLsg(f, f2, f3, f5, rgb);
        }

        /* renamed from: hsv-JlNiLsg, reason: not valid java name */
        public final long m6036hsvJlNiLsg(float hue, float saturation, float value, float alpha, androidx.compose.ui.graphics.colorspace.Rgb colorSpace) {
            if (0.0f > hue || hue > 360.0f || 0.0f > saturation || saturation > 1.0f || 0.0f > value || value > 1.0f) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("HSV (");
                sb.append(hue);
                sb.append(", ");
                sb.append(saturation);
                sb.append(", ");
                sb.append(value);
                sb.append(") must be in range (0..360, 0..1, 0..1)");
                androidx.compose.ui.graphics.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
            }
            return androidx.compose.ui.graphics.ColorKt.Color(getHighSpeedVideoFpsRanges(5, hue, saturation, value), getHighSpeedVideoFpsRanges(3, hue, saturation, value), getHighSpeedVideoFpsRanges(1, hue, saturation, value), alpha, colorSpace);
        }

        private static float getHighSpeedVideoFpsRanges(int p0, float p1, float p2, float p3) {
            float f = (p0 + (p1 / 60.0f)) % 6.0f;
            return p3 - ((p2 * p3) * java.lang.Math.max(0.0f, java.lang.Math.min(f, java.lang.Math.min(4.0f - f, 1.0f))));
        }

        /* renamed from: hsl-JlNiLsg$default, reason: not valid java name */
        public static /* synthetic */ long m6020hslJlNiLsg$default(androidx.compose.ui.graphics.Color.Companion companion, float f, float f2, float f3, float f4, androidx.compose.ui.graphics.colorspace.Rgb rgb, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                f4 = 1.0f;
            }
            float f5 = f4;
            if ((i & 16) != 0) {
                rgb = androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getSrgb();
            }
            return companion.m6035hslJlNiLsg(f, f2, f3, f5, rgb);
        }

        /* renamed from: hsl-JlNiLsg, reason: not valid java name */
        public final long m6035hslJlNiLsg(float hue, float saturation, float lightness, float alpha, androidx.compose.ui.graphics.colorspace.Rgb colorSpace) {
            if (0.0f > hue || hue > 360.0f || 0.0f > saturation || saturation > 1.0f || 0.0f > lightness || lightness > 1.0f) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("HSL (");
                sb.append(hue);
                sb.append(", ");
                sb.append(saturation);
                sb.append(", ");
                sb.append(lightness);
                sb.append(") must be in range (0..360, 0..1, 0..1)");
                androidx.compose.ui.graphics.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
            }
            return androidx.compose.ui.graphics.ColorKt.Color(getHighSpeedVideoFpsRangesFor(0, hue, saturation, lightness), getHighSpeedVideoFpsRangesFor(8, hue, saturation, lightness), getHighSpeedVideoFpsRangesFor(4, hue, saturation, lightness), alpha, colorSpace);
        }

        private static float getHighSpeedVideoFpsRangesFor(int p0, float p1, float p2, float p3) {
            float f = (p0 + (p1 / 30.0f)) % 12.0f;
            return p3 - ((p2 * java.lang.Math.min(p3, 1.0f - p3)) * java.lang.Math.max(-1.0f, java.lang.Math.min(f - 3.0f, java.lang.Math.min(9.0f - f, 1.0f))));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6006unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m6003hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object other) {
        return m5996equalsimpl(this.value, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6003hashCodeimpl(long j) {
        return kotlin.ULong.m23497hashCodeimpl(j);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5997equalsimpl0(long j, long j2) {
        return kotlin.ULong.m23496equalsimpl0(j, j2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5996equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.graphics.Color) && j == ((androidx.compose.ui.graphics.Color) obj).m6006unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.graphics.Color m5986boximpl(long j) {
        return new androidx.compose.ui.graphics.Color(j);
    }
}
