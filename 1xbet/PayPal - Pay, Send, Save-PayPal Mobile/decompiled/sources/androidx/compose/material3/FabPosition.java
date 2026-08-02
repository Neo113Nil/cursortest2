package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/material3/FabPosition;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class FabPosition {
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.FabPosition.Companion INSTANCE = new androidx.compose.material3.FabPosition.Companion(null);
    private static final int Start = m3295constructorimpl(0);
    private static final int Center = m3295constructorimpl(1);
    private static final int End = m3295constructorimpl(2);
    private static final int EndOverlay = m3295constructorimpl(3);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3295constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3297equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Landroidx/compose/material3/FabPosition$Companion;", "", "<init>", "()V", "Landroidx/compose/material3/FabPosition;", "Start", com.visa.cbp.getEncExpo.warmup, "getStart-ERTFSPs", "()I", "Center", "getCenter-ERTFSPs", "End", "getEnd-ERTFSPs", "EndOverlay", "getEndOverlay-ERTFSPs"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getStart-ERTFSPs, reason: not valid java name */
        public final int m3304getStartERTFSPs() {
            return androidx.compose.material3.FabPosition.Start;
        }

        /* renamed from: getCenter-ERTFSPs, reason: not valid java name */
        public final int m3301getCenterERTFSPs() {
            return androidx.compose.material3.FabPosition.Center;
        }

        /* renamed from: getEnd-ERTFSPs, reason: not valid java name */
        public final int m3302getEndERTFSPs() {
            return androidx.compose.material3.FabPosition.End;
        }

        /* renamed from: getEndOverlay-ERTFSPs, reason: not valid java name */
        public final int m3303getEndOverlayERTFSPs() {
            return androidx.compose.material3.FabPosition.EndOverlay;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ FabPosition(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public final java.lang.String toString() {
        return m3299toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m3299toStringimpl(int i) {
        return m3297equalsimpl0(i, Start) ? "FabPosition.Start" : m3297equalsimpl0(i, Center) ? "FabPosition.Center" : m3297equalsimpl0(i, End) ? "FabPosition.End" : "FabPosition.EndOverlay";
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int hashCode() {
        return m3298hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object other) {
        return m3296equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3298hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3296equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.material3.FabPosition) && i == ((androidx.compose.material3.FabPosition) obj).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.material3.FabPosition m3294boximpl(int i) {
        return new androidx.compose.material3.FabPosition(i);
    }
}
