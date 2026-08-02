package androidx.window.core.layout;

@kotlin.Deprecated(message = "WindowWidthSizeClass will not be developed further, use WindowSizeClass instead.")
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/window/core/layout/WindowWidthSizeClass;", "", "", "p0", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowWidthSizeClass {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.core.layout.WindowWidthSizeClass.Companion INSTANCE = new androidx.window.core.layout.WindowWidthSizeClass.Companion(null);
    public static final androidx.window.core.layout.WindowWidthSizeClass COMPACT = new androidx.window.core.layout.WindowWidthSizeClass(0);
    public static final androidx.window.core.layout.WindowWidthSizeClass MEDIUM = new androidx.window.core.layout.WindowWidthSizeClass(1);
    public static final androidx.window.core.layout.WindowWidthSizeClass EXPANDED = new androidx.window.core.layout.WindowWidthSizeClass(2);

    private WindowWidthSizeClass(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this, COMPACT)) {
            str = "COMPACT";
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(this, MEDIUM)) {
            str = "MEDIUM";
        } else {
            str = kotlin.jvm.internal.Intrinsics.areEqual(this, EXPANDED) ? "EXPANDED" : "UNKNOWN";
        }
        return "WindowWidthSizeClass: ".concat(str);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return other != null && getClass() == other.getClass() && this.Camera2StreamConfigurationMap == ((androidx.window.core.layout.WindowWidthSizeClass) other).Camera2StreamConfigurationMap;
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\u0003R\u001a\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\n\u0012\u0004\b\r\u0010\u0003R\u001a\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u0012\u0004\b\u000f\u0010\u0003"}, d2 = {"Landroidx/window/core/layout/WindowWidthSizeClass$Companion;", "", "<init>", "()V", "", "dpWidth", "Landroidx/window/core/layout/WindowWidthSizeClass;", "compute$window_core", "(F)Landroidx/window/core/layout/WindowWidthSizeClass;", "COMPACT", "Landroidx/window/core/layout/WindowWidthSizeClass;", "getCOMPACT$annotations", "MEDIUM", "getMEDIUM$annotations", "EXPANDED", "getEXPANDED$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @kotlin.Deprecated(message = "WindowWidthSizeClass not be developed further.")
        public static /* synthetic */ void getCOMPACT$annotations() {
        }

        @kotlin.Deprecated(message = "WindowWidthSizeClass not be developed further.")
        public static /* synthetic */ void getEXPANDED$annotations() {
        }

        @kotlin.Deprecated(message = "WindowWidthSizeClass not be developed further.")
        public static /* synthetic */ void getMEDIUM$annotations() {
        }

        private Companion() {
        }

        @kotlin.Deprecated(message = "WindowWidthSizeClass not be developed further.")
        public final androidx.window.core.layout.WindowWidthSizeClass compute$window_core(float dpWidth) {
            if (dpWidth < 0.0f) {
                throw new java.lang.IllegalArgumentException("Width must be positive, received ".concat(java.lang.String.valueOf(dpWidth)).toString());
            }
            if (dpWidth < 600.0f) {
                return androidx.window.core.layout.WindowWidthSizeClass.COMPACT;
            }
            if (dpWidth < 840.0f) {
                return androidx.window.core.layout.WindowWidthSizeClass.MEDIUM;
            }
            return androidx.window.core.layout.WindowWidthSizeClass.EXPANDED;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
