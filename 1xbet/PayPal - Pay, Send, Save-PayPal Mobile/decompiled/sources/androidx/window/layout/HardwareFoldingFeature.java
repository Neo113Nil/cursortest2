package androidx.window.layout;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0002,-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature;", "Landroidx/window/layout/FoldingFeature;", "Landroidx/window/core/Bounds;", "featureBounds", "Landroidx/window/layout/HardwareFoldingFeature$Type;", "type", "Landroidx/window/layout/FoldingFeature$State;", "state", "<init>", "(Landroidx/window/core/Bounds;Landroidx/window/layout/HardwareFoldingFeature$Type;Landroidx/window/layout/FoldingFeature$State;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoSizes", "Landroidx/window/core/Bounds;", "getHighSpeedVideoFpsRangesFor", "Landroidx/window/layout/HardwareFoldingFeature$Type;", "getType$window_release", "()Landroidx/window/layout/HardwareFoldingFeature$Type;", "Landroidx/window/layout/FoldingFeature$State;", "getState", "()Landroidx/window/layout/FoldingFeature$State;", "Landroid/graphics/Rect;", "getBounds", "()Landroid/graphics/Rect;", "bounds", "isSeparating", "()Z", "Landroidx/window/layout/FoldingFeature$OcclusionType;", "getOcclusionType", "()Landroidx/window/layout/FoldingFeature$OcclusionType;", "occlusionType", "Landroidx/window/layout/FoldingFeature$Orientation;", "getOrientation", "()Landroidx/window/layout/FoldingFeature$Orientation;", "orientation", "Companion", com.miteksystems.misnap.core.MibiData.KEY_MICROPHONE_TYPE}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HardwareFoldingFeature implements androidx.window.layout.FoldingFeature {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.layout.HardwareFoldingFeature.Companion INSTANCE = new androidx.window.layout.HardwareFoldingFeature.Companion(null);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.window.core.Bounds getHighSpeedVideoFpsRangesFor;
    private final androidx.window.layout.FoldingFeature.State state;
    private final androidx.window.layout.HardwareFoldingFeature.Type type;

    public HardwareFoldingFeature(androidx.window.core.Bounds bounds, androidx.window.layout.HardwareFoldingFeature.Type type, androidx.window.layout.FoldingFeature.State state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bounds, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        this.getHighSpeedVideoFpsRangesFor = bounds;
        this.type = type;
        this.state = state;
        INSTANCE.validateFeatureBounds$window_release(bounds);
    }

    /* renamed from: getType$window_release, reason: from getter */
    public final androidx.window.layout.HardwareFoldingFeature.Type getType() {
        return this.type;
    }

    @Override // androidx.window.layout.FoldingFeature
    public final androidx.window.layout.FoldingFeature.State getState() {
        return this.state;
    }

    @Override // androidx.window.layout.DisplayFeature
    public final android.graphics.Rect getBounds() {
        return this.getHighSpeedVideoFpsRangesFor.toRect();
    }

    @Override // androidx.window.layout.FoldingFeature
    public final boolean isSeparating() {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.type, androidx.window.layout.HardwareFoldingFeature.Type.INSTANCE.getHINGE())) {
            return true;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, androidx.window.layout.HardwareFoldingFeature.Type.INSTANCE.getFOLD()) && kotlin.jvm.internal.Intrinsics.areEqual(getState(), androidx.window.layout.FoldingFeature.State.HALF_OPENED);
    }

    @Override // androidx.window.layout.FoldingFeature
    public final androidx.window.layout.FoldingFeature.OcclusionType getOcclusionType() {
        if (this.getHighSpeedVideoFpsRangesFor.getWidth() == 0 || this.getHighSpeedVideoFpsRangesFor.getHeight() == 0) {
            return androidx.window.layout.FoldingFeature.OcclusionType.NONE;
        }
        return androidx.window.layout.FoldingFeature.OcclusionType.FULL;
    }

    @Override // androidx.window.layout.FoldingFeature
    public final androidx.window.layout.FoldingFeature.Orientation getOrientation() {
        if (this.getHighSpeedVideoFpsRangesFor.getWidth() > this.getHighSpeedVideoFpsRangesFor.getHeight()) {
            return androidx.window.layout.FoldingFeature.Orientation.HORIZONTAL;
        }
        return androidx.window.layout.FoldingFeature.Orientation.VERTICAL;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HardwareFoldingFeature { ");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", state=");
        sb.append(getState());
        sb.append(" }");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        androidx.window.layout.HardwareFoldingFeature hardwareFoldingFeature = (androidx.window.layout.HardwareFoldingFeature) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, hardwareFoldingFeature.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, hardwareFoldingFeature.type) && kotlin.jvm.internal.Intrinsics.areEqual(getState(), hardwareFoldingFeature.getState());
    }

    public final int hashCode() {
        return (((this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + this.type.hashCode()) * 31) + getState().hashCode();
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Companion;", "", "<init>", "()V", "Landroidx/window/core/Bounds;", "bounds", "", "validateFeatureBounds$window_release", "(Landroidx/window/core/Bounds;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final void validateFeatureBounds$window_release(androidx.window.core.Bounds bounds) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bounds, "");
            if (bounds.getWidth() == 0 && bounds.getHeight() == 0) {
                throw new java.lang.IllegalArgumentException("Bounds must be non zero".toString());
            }
            if (bounds.getLeft() != 0 && bounds.getTop() != 0) {
                throw new java.lang.IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Type;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.window.layout.HardwareFoldingFeature.Type.Companion INSTANCE = new androidx.window.layout.HardwareFoldingFeature.Type.Companion(null);
        private static final androidx.window.layout.HardwareFoldingFeature.Type FOLD = new androidx.window.layout.HardwareFoldingFeature.Type("FOLD");
        private static final androidx.window.layout.HardwareFoldingFeature.Type HINGE = new androidx.window.layout.HardwareFoldingFeature.Type("HINGE");

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final java.lang.String getHighSpeedVideoFpsRanges;

        private Type(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
        }

        /* renamed from: toString, reason: from getter */
        public final java.lang.String getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/window/layout/HardwareFoldingFeature$Type$Companion;", "", "<init>", "()V", "Landroidx/window/layout/HardwareFoldingFeature$Type;", "FOLD", "Landroidx/window/layout/HardwareFoldingFeature$Type;", "getFOLD", "()Landroidx/window/layout/HardwareFoldingFeature$Type;", "HINGE", "getHINGE"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final androidx.window.layout.HardwareFoldingFeature.Type getFOLD() {
                return androidx.window.layout.HardwareFoldingFeature.Type.FOLD;
            }

            public final androidx.window.layout.HardwareFoldingFeature.Type getHINGE() {
                return androidx.window.layout.HardwareFoldingFeature.Type.HINGE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }
}
