package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087@\u0018\u0000 &2\u00020\u0001:\u0001&B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\nJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010 \u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\"\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b!\u0010\u001bR\u0011\u0010%\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b#\u0010$\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/node/TouchBoundsExpansion;", "", "", "packedValue", "constructor-impl", "(J)J", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "", "computeLeft-impl$ui", "(JLandroidx/compose/ui/unit/LayoutDirection;)I", "computeLeft", "computeRight-impl$ui", "computeRight", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoFpsRangesFor", "getStart-impl", "(J)I", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "getTop-impl", com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, "getEnd-impl", "end", "getBottom-impl", com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "isLayoutDirectionAware-impl", "(J)Z", "isLayoutDirectionAware", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class TouchBoundsExpansion {
    public static final int MAX_VALUE = 32767;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.node.TouchBoundsExpansion.Companion INSTANCE = new androidx.compose.ui.node.TouchBoundsExpansion.Companion(null);
    private static final long None = androidx.compose.ui.node.TouchBoundsExpansionKt.TouchBoundsExpansion$default(0, 0, 0, 0, 14, null);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7693constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7695equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: isLayoutDirectionAware-impl, reason: not valid java name */
    public static final boolean m7701isLayoutDirectionAwareimpl(long j) {
        return (j & Long.MIN_VALUE) != 0;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00048\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/compose/ui/node/TouchBoundsExpansion$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "Landroidx/compose/ui/node/TouchBoundsExpansion;", "Absolute-vsh68fg", "(IIII)J", "Absolute", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "", "isLayoutDirectionAware", "", "pack$ui", "(IIIIZ)J", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(JI)I", "getHighSpeedVideoFpsRanges", "(II)J", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "J", "getNone-RZrCHBk", "()J", "MAX_VALUE", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int getHighResolutionOutputSizeshNQ4ISI(long p0, int p1) {
            return ((int) (p0 >> (p1 * 15))) & 32767;
        }

        private static long getHighSpeedVideoFpsRanges(int p0, int p1) {
            return (p0 & 32767) << (p1 * 15);
        }

        private Companion() {
        }

        public static final /* synthetic */ int access$unpack(androidx.compose.ui.node.TouchBoundsExpansion.Companion companion, long j, int i) {
            return getHighResolutionOutputSizeshNQ4ISI(j, i);
        }

        /* renamed from: Absolute-vsh68fg$default, reason: not valid java name */
        public static /* synthetic */ long m7704Absolutevsh68fg$default(androidx.compose.ui.node.TouchBoundsExpansion.Companion companion, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
            if ((i5 & 1) != 0) {
                i = 0;
            }
            if ((i5 & 2) != 0) {
                i2 = 0;
            }
            if ((i5 & 4) != 0) {
                i3 = 0;
            }
            if ((i5 & 8) != 0) {
                i4 = 0;
            }
            return companion.m7705Absolutevsh68fg(i, i2, i3, i4);
        }

        /* renamed from: getNone-RZrCHBk, reason: not valid java name */
        public final long m7706getNoneRZrCHBk() {
            return androidx.compose.ui.node.TouchBoundsExpansion.None;
        }

        public final long pack$ui(int start, int top, int end, int bottom, boolean isLayoutDirectionAware) {
            long highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(start, 0);
            long highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(top, 1);
            long highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(end, 2);
            return highSpeedVideoFpsRanges2 | highSpeedVideoFpsRanges | highSpeedVideoFpsRanges3 | getHighSpeedVideoFpsRanges(bottom, 3) | (isLayoutDirectionAware ? Long.MIN_VALUE : 0L);
        }

        /* renamed from: Absolute-vsh68fg, reason: not valid java name */
        public final long m7705Absolutevsh68fg(int left, int top, int right, int bottom) {
            if (left < 0 || left >= 32768) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("Start must be in the range of 0 .. 32767");
            }
            if (top < 0 || top >= 32768) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("Top must be in the range of 0 .. 32767");
            }
            if (right < 0 || right >= 32768) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("End must be in the range of 0 .. 32767");
            }
            if (bottom < 0 || bottom >= 32768) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("Bottom must be in the range of 0 .. 32767");
            }
            return androidx.compose.ui.node.TouchBoundsExpansion.m7693constructorimpl(pack$ui(left, top, right, bottom, false));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ TouchBoundsExpansion(long j) {
        this.getHighSpeedVideoFpsRangesFor = j;
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m7698getStartimpl(long j) {
        return androidx.compose.ui.node.TouchBoundsExpansion.Companion.access$unpack(INSTANCE, j, 0);
    }

    /* renamed from: getTop-impl, reason: not valid java name */
    public static final int m7699getTopimpl(long j) {
        return androidx.compose.ui.node.TouchBoundsExpansion.Companion.access$unpack(INSTANCE, j, 1);
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m7697getEndimpl(long j) {
        return androidx.compose.ui.node.TouchBoundsExpansion.Companion.access$unpack(INSTANCE, j, 2);
    }

    /* renamed from: getBottom-impl, reason: not valid java name */
    public static final int m7696getBottomimpl(long j) {
        return androidx.compose.ui.node.TouchBoundsExpansion.Companion.access$unpack(INSTANCE, j, 3);
    }

    /* renamed from: computeLeft-impl$ui, reason: not valid java name */
    public static final int m7691computeLeftimpl$ui(long j, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        if (!m7701isLayoutDirectionAwareimpl(j) || layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
            return m7698getStartimpl(j);
        }
        return m7697getEndimpl(j);
    }

    /* renamed from: computeRight-impl$ui, reason: not valid java name */
    public static final int m7692computeRightimpl$ui(long j, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        if (!m7701isLayoutDirectionAwareimpl(j) || layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
            return m7697getEndimpl(j);
        }
        return m7698getStartimpl(j);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        return m7702toStringimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final int hashCode() {
        return m7700hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object other) {
        return m7694equalsimpl(this.getHighSpeedVideoFpsRangesFor, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m7702toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TouchBoundsExpansion(packedValue=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7700hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7694equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.node.TouchBoundsExpansion) && j == ((androidx.compose.ui.node.TouchBoundsExpansion) obj).getGetHighSpeedVideoFpsRangesFor();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.node.TouchBoundsExpansion m7690boximpl(long j) {
        return new androidx.compose.ui.node.TouchBoundsExpansion(j);
    }
}
