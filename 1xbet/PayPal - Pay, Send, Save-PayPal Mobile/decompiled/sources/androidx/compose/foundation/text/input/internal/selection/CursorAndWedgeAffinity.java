package androidx.compose.foundation.text.input.internal.selection;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0007\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\t8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(J)J", "", "cursor", "(I)J", "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "wedgeAffinity", "(ILandroidx/compose/foundation/text/input/internal/WedgeAffinity;)J", "component1-impl", "(J)I", "component1", "component2-impl", "(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "component2", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoSizes", "getCursor-impl", "getWedgeAffinity-impl"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class CursorAndWedgeAffinity {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighSpeedVideoSizes;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2282constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2284equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getCursor-impl, reason: not valid java name */
    public static final int m2285getCursorimpl(long j) {
        return (int) (j >> 32);
    }

    private /* synthetic */ CursorAndWedgeAffinity(long j) {
        this.getHighSpeedVideoSizes = j;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2280constructorimpl(int i) {
        return m2282constructorimpl((i << 32) | 4294967295L);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m2281constructorimpl(int i, androidx.compose.foundation.text.input.internal.WedgeAffinity wedgeAffinity) {
        int i2 = -1;
        int i3 = wedgeAffinity == null ? -1 : androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity.WhenMappings.$EnumSwitchMapping$0[wedgeAffinity.ordinal()];
        if (i3 != -1) {
            i2 = 1;
            if (i3 == 1) {
                i2 = 0;
            } else if (i3 != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        return m2282constructorimpl((i << 32) | (i2 & 4294967295L));
    }

    /* renamed from: getWedgeAffinity-impl, reason: not valid java name */
    public static final androidx.compose.foundation.text.input.internal.WedgeAffinity m2286getWedgeAffinityimpl(long j) {
        int i = (int) (j & 4294967295L);
        if (i < 0) {
            return null;
        }
        if (i == 0) {
            return androidx.compose.foundation.text.input.internal.WedgeAffinity.Start;
        }
        return androidx.compose.foundation.text.input.internal.WedgeAffinity.End;
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m2278component1impl(long j) {
        return m2285getCursorimpl(j);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final androidx.compose.foundation.text.input.internal.WedgeAffinity m2279component2impl(long j) {
        return m2286getWedgeAffinityimpl(j);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        return m2288toStringimpl(this.getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        return m2287hashCodeimpl(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object other) {
        return m2283equalsimpl(this.getHighSpeedVideoSizes, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m2288toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CursorAndWedgeAffinity(value=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2287hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2283equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity) && j == ((androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity) obj).getGetHighSpeedVideoSizes();
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.foundation.text.input.internal.WedgeAffinity.values().length];
            try {
                iArr[androidx.compose.foundation.text.input.internal.WedgeAffinity.Start.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.text.input.internal.WedgeAffinity.End.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity m2277boximpl(long j) {
        return new androidx.compose.foundation.text.input.internal.selection.CursorAndWedgeAffinity(j);
    }
}
