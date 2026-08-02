package androidx.window.core.layout;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u00020\u0001:\u0001)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010#\u001a\u00020\u001e8GX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u001a\u0010(\u001a\u00020$8GX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010\"\u001a\u0004\b%\u0010&"}, d2 = {"Landroidx/window/core/layout/WindowSizeClass;", "", "", "minWidthDp", "minHeightDp", "<init>", "(II)V", "", "widthDp", "heightDp", "(FF)V", "widthDpBreakpoint", "", "isWidthAtLeastBreakpoint", "(I)Z", "heightDpBreakpoint", "isHeightAtLeastBreakpoint", "isAtLeastBreakpoint", "(II)Z", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMinWidthDp", "getMinHeightDp", "Landroidx/window/core/layout/WindowWidthSizeClass;", "getWindowWidthSizeClass", "()Landroidx/window/core/layout/WindowWidthSizeClass;", "getWindowWidthSizeClass$annotations", "()V", "windowWidthSizeClass", "Landroidx/window/core/layout/WindowHeightSizeClass;", "getWindowHeightSizeClass", "()Landroidx/window/core/layout/WindowHeightSizeClass;", "getWindowHeightSizeClass$annotations", "windowHeightSizeClass", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowSizeClass {
    public static final java.util.Set<androidx.window.core.layout.WindowSizeClass> BREAKPOINTS_V1;
    public static final java.util.Set<androidx.window.core.layout.WindowSizeClass> BREAKPOINTS_V2;
    private static final java.util.List<java.lang.Integer> Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.core.layout.WindowSizeClass.Companion INSTANCE;
    public static final int HEIGHT_DP_EXPANDED_LOWER_BOUND = 900;
    public static final int HEIGHT_DP_MEDIUM_LOWER_BOUND = 480;
    public static final int WIDTH_DP_EXPANDED_LOWER_BOUND = 840;
    public static final int WIDTH_DP_EXTRA_LARGE_LOWER_BOUND = 1600;
    public static final int WIDTH_DP_LARGE_LOWER_BOUND = 1200;
    public static final int WIDTH_DP_MEDIUM_LOWER_BOUND = 600;
    private static final java.util.List<java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.List<java.lang.Integer> getHighSpeedVideoFpsRanges;
    private static final java.util.List<java.lang.Integer> getHighSpeedVideoSizes;
    private final int minHeightDp;
    private final int minWidthDp;

    @kotlin.Deprecated(message = "Use either isHeightAtLeastBreakpoint or isAtLeastBreakpoint to check matching bounds.")
    public static /* synthetic */ void getWindowHeightSizeClass$annotations() {
    }

    @kotlin.Deprecated(message = "Use either isWidthAtLeastBreakpoint or isAtLeastBreakpoint to check matching bounds.")
    public static /* synthetic */ void getWindowWidthSizeClass$annotations() {
    }

    public WindowSizeClass(int i, int i2) {
        this.minWidthDp = i;
        this.minHeightDp = i2;
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected minWidthDp to be at least 0, minWidthDp: ");
            sb.append(i);
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (i2 >= 0) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected minHeightDp to be at least 0, minHeightDp: ");
        sb2.append(i2);
        sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb2.toString().toString());
    }

    public final int getMinWidthDp() {
        return this.minWidthDp;
    }

    public final int getMinHeightDp() {
        return this.minHeightDp;
    }

    public WindowSizeClass(float f, float f2) {
        this((int) f, (int) f2);
    }

    public final androidx.window.core.layout.WindowWidthSizeClass getWindowWidthSizeClass() {
        return androidx.window.core.layout.WindowWidthSizeClass.INSTANCE.compute$window_core(this.minWidthDp);
    }

    public final androidx.window.core.layout.WindowHeightSizeClass getWindowHeightSizeClass() {
        return androidx.window.core.layout.WindowHeightSizeClass.INSTANCE.compute$window_core(this.minHeightDp);
    }

    public final boolean isWidthAtLeastBreakpoint(int widthDpBreakpoint) {
        return this.minWidthDp >= widthDpBreakpoint;
    }

    public final boolean isHeightAtLeastBreakpoint(int heightDpBreakpoint) {
        return this.minHeightDp >= heightDpBreakpoint;
    }

    public final boolean isAtLeastBreakpoint(int widthDpBreakpoint, int heightDpBreakpoint) {
        return isWidthAtLeastBreakpoint(widthDpBreakpoint) && isHeightAtLeastBreakpoint(heightDpBreakpoint);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        androidx.window.core.layout.WindowSizeClass windowSizeClass = (androidx.window.core.layout.WindowSizeClass) other;
        return this.minWidthDp == windowSizeClass.minWidthDp && this.minHeightDp == windowSizeClass.minHeightDp;
    }

    public final int hashCode() {
        return (this.minWidthDp * 31) + this.minHeightDp;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WindowSizeClass(minWidthDp=");
        sb.append(this.minWidthDp);
        sb.append(", minHeightDp=");
        sb.append(this.minHeightDp);
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00198\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00198\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b"}, d2 = {"Landroidx/window/core/layout/WindowSizeClass$Companion;", "", "<init>", "()V", "", "dpWidth", "dpHeight", "Landroidx/window/core/layout/WindowSizeClass;", "compute", "(FF)Landroidx/window/core/layout/WindowSizeClass;", "", "WIDTH_DP_MEDIUM_LOWER_BOUND", com.visa.cbp.getEncExpo.warmup, "WIDTH_DP_EXPANDED_LOWER_BOUND", "WIDTH_DP_LARGE_LOWER_BOUND", "WIDTH_DP_EXTRA_LARGE_LOWER_BOUND", "HEIGHT_DP_MEDIUM_LOWER_BOUND", "HEIGHT_DP_EXPANDED_LOWER_BOUND", "", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "", "BREAKPOINTS_V1", "Ljava/util/Set;", "BREAKPOINTS_V2"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.Deprecated(message = "Use computeWindowSizeClass instead.", replaceWith = @kotlin.ReplaceWith(expression = "BREAKPOINTS_V1.computeWindowSizeClass(widthDp = dpWidth, heightDp = dpHeight)", imports = {"androidx.window.core.layout.computeWindowSizeClass"}))
        @kotlin.jvm.JvmStatic
        public final androidx.window.core.layout.WindowSizeClass compute(float dpWidth, float dpHeight) {
            int i = 0;
            int i2 = dpWidth >= 840.0f ? androidx.window.core.layout.WindowSizeClass.WIDTH_DP_EXPANDED_LOWER_BOUND : dpWidth >= 600.0f ? 600 : 0;
            if (dpHeight >= 900.0f) {
                i = 900;
            } else if (dpHeight >= 480.0f) {
                i = androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND;
            }
            return new androidx.window.core.layout.WindowSizeClass(i2, i);
        }

        public static final /* synthetic */ java.util.Set access$createBreakpointSet(androidx.window.core.layout.WindowSizeClass.Companion companion, java.util.List list, java.util.List list2) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                java.util.List list3 = list2;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                java.util.Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new androidx.window.core.layout.WindowSizeClass(intValue, ((java.lang.Number) it2.next()).intValue()));
                }
                kotlin.collections.CollectionsKt.addAll(arrayList, arrayList2);
            }
            return kotlin.collections.CollectionsKt.toSet(arrayList);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        androidx.window.core.layout.WindowSizeClass.Companion companion = new androidx.window.core.layout.WindowSizeClass.Companion(null);
        INSTANCE = companion;
        java.util.List<java.lang.Integer> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{0, 600, java.lang.Integer.valueOf(WIDTH_DP_EXPANDED_LOWER_BOUND)});
        Camera2StreamConfigurationMap = listOf;
        java.util.List<java.lang.Integer> plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) listOf, (java.lang.Iterable) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{1200, 1600}));
        getHighResolutionOutputSizeshNQ4ISI = plus;
        java.util.List<java.lang.Integer> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{0, java.lang.Integer.valueOf(HEIGHT_DP_MEDIUM_LOWER_BOUND), 900});
        getHighSpeedVideoFpsRanges = listOf2;
        getHighSpeedVideoSizes = listOf2;
        BREAKPOINTS_V1 = androidx.window.core.layout.WindowSizeClass.Companion.access$createBreakpointSet(companion, listOf, listOf2);
        BREAKPOINTS_V2 = androidx.window.core.layout.WindowSizeClass.Companion.access$createBreakpointSet(companion, plus, listOf2);
    }

    @kotlin.Deprecated(message = "Use computeWindowSizeClass instead.", replaceWith = @kotlin.ReplaceWith(expression = "BREAKPOINTS_V1.computeWindowSizeClass(widthDp = dpWidth, heightDp = dpHeight)", imports = {"androidx.window.core.layout.computeWindowSizeClass"}))
    @kotlin.jvm.JvmStatic
    public static final androidx.window.core.layout.WindowSizeClass compute(float f, float f2) {
        return INSTANCE.compute(f, f2);
    }
}
