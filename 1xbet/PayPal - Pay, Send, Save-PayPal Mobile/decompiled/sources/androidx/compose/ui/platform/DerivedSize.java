package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011"}, d2 = {"Landroidx/compose/ui/platform/DerivedSize;", "", "Landroidx/compose/ui/unit/IntSize;", "pxSize", "Landroidx/compose/ui/unit/DpSize;", "dpSize", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getPxSize-YbymL2g", "()J", "getDpSize-MYxV2XQ", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DerivedSize {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.platform.DerivedSize.Companion INSTANCE = new androidx.compose.ui.platform.DerivedSize.Companion(null);
    private static final androidx.compose.ui.platform.DerivedSize Zero = new androidx.compose.ui.platform.DerivedSize(androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g(), androidx.compose.ui.unit.DpSize.INSTANCE.m8709getZeroMYxV2XQ(), null);
    private final long dpSize;
    private final long pxSize;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\nR\u0017\u0010\u0010\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/platform/DerivedSize$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/IntSize;", "pxSize", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/platform/DerivedSize;", "fromPxSize-viCIZxY", "(JLandroidx/compose/ui/unit/Density;)Landroidx/compose/ui/platform/DerivedSize;", "fromPxSize", "Landroidx/compose/ui/unit/DpSize;", "dpSize", "fromDpSize-itqla9I", "fromDpSize", "Zero", "Landroidx/compose/ui/platform/DerivedSize;", "getZero", "()Landroidx/compose/ui/platform/DerivedSize;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.ui.platform.DerivedSize getZero() {
            return androidx.compose.ui.platform.DerivedSize.Zero;
        }

        /* renamed from: fromPxSize-viCIZxY, reason: not valid java name */
        public final androidx.compose.ui.platform.DerivedSize m7738fromPxSizeviCIZxY(long pxSize, androidx.compose.ui.unit.Density density) {
            return new androidx.compose.ui.platform.DerivedSize(pxSize, density.mo1416toDpSizekrfVVM(androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(pxSize)), null);
        }

        /* renamed from: fromDpSize-itqla9I, reason: not valid java name */
        public final androidx.compose.ui.platform.DerivedSize m7737fromDpSizeitqla9I(long dpSize, androidx.compose.ui.unit.Density density) {
            return new androidx.compose.ui.platform.DerivedSize(androidx.compose.ui.unit.IntSizeKt.m8783toIntSizeuvyYCjk(density.mo1419toSizeXkaWNTQ(dpSize)), dpSize, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private DerivedSize(long j, long j2) {
        this.pxSize = j;
        this.dpSize = j2;
    }

    /* renamed from: getDpSize-MYxV2XQ, reason: not valid java name and from getter */
    public final long getDpSize() {
        return this.dpSize;
    }

    /* renamed from: getPxSize-YbymL2g, reason: not valid java name and from getter */
    public final long getPxSize() {
        return this.pxSize;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.platform.DerivedSize)) {
            return false;
        }
        androidx.compose.ui.platform.DerivedSize derivedSize = (androidx.compose.ui.platform.DerivedSize) other;
        return androidx.compose.ui.unit.IntSize.m8770equalsimpl0(this.pxSize, derivedSize.pxSize) && androidx.compose.ui.unit.DpSize.m8696equalsimpl0(this.dpSize, derivedSize.dpSize);
    }

    public final int hashCode() {
        return (androidx.compose.ui.unit.IntSize.m8773hashCodeimpl(this.pxSize) * 31) + androidx.compose.ui.unit.DpSize.m8701hashCodeimpl(this.dpSize);
    }

    public /* synthetic */ DerivedSize(long j, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }
}
