package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H ¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014j\u0002\b\u0015j\u0002\b\u0016"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode;", "", "<init>", "(Ljava/lang/String;I)V", "Landroidx/compose/ui/geometry/Offset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "Landroidx/compose/ui/geometry/Rect;", "bounds", "", "compare-3MmeM6k$foundation", "(JLandroidx/compose/ui/geometry/Rect;)I", "compare", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "", "isSelected-2x9bVx0$foundation", "(Landroidx/compose/ui/geometry/Rect;JJ)Z", "isSelected", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/geometry/Rect;J)Z", "Vertical", "Horizontal"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SelectionMode {
    public static final androidx.compose.foundation.text.selection.SelectionMode Horizontal;
    public static final androidx.compose.foundation.text.selection.SelectionMode Vertical;
    private static final /* synthetic */ androidx.compose.foundation.text.selection.SelectionMode[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    /* renamed from: compare-3MmeM6k$foundation, reason: not valid java name */
    public abstract int mo2430compare3MmeM6k$foundation(long position, androidx.compose.ui.geometry.Rect bounds);

    private SelectionMode(java.lang.String str, int i) {
    }

    static {
        androidx.compose.foundation.text.selection.SelectionMode selectionMode = new androidx.compose.foundation.text.selection.SelectionMode("Vertical") { // from class: androidx.compose.foundation.text.selection.SelectionMode.Vertical
            {
                int i = 0;
                kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // androidx.compose.foundation.text.selection.SelectionMode
            /* renamed from: compare-3MmeM6k$foundation */
            public final int mo2430compare3MmeM6k$foundation(long p0, androidx.compose.ui.geometry.Rect p1) {
                if (androidx.compose.foundation.text.selection.SelectionManagerKt.m2425containsInclusiveUv8p0NA(p1, p0)) {
                    return 0;
                }
                int i = (int) (4294967295L & p0);
                if (java.lang.Float.intBitsToFloat(i) < p1.getTop()) {
                    return -1;
                }
                return (java.lang.Float.intBitsToFloat((int) (p0 >> 32)) >= p1.getLeft() || java.lang.Float.intBitsToFloat(i) >= p1.getBottom()) ? 1 : -1;
            }
        };
        Vertical = selectionMode;
        androidx.compose.foundation.text.selection.SelectionMode selectionMode2 = new androidx.compose.foundation.text.selection.SelectionMode("Horizontal") { // from class: androidx.compose.foundation.text.selection.SelectionMode.Horizontal
            {
                int i = 1;
                kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            }

            @Override // androidx.compose.foundation.text.selection.SelectionMode
            /* renamed from: compare-3MmeM6k$foundation */
            public final int mo2430compare3MmeM6k$foundation(long p0, androidx.compose.ui.geometry.Rect p1) {
                if (androidx.compose.foundation.text.selection.SelectionManagerKt.m2425containsInclusiveUv8p0NA(p1, p0)) {
                    return 0;
                }
                int i = (int) (p0 >> 32);
                if (java.lang.Float.intBitsToFloat(i) < p1.getLeft()) {
                    return -1;
                }
                return (java.lang.Float.intBitsToFloat((int) (p0 & 4294967295L)) >= p1.getTop() || java.lang.Float.intBitsToFloat(i) >= p1.getRight()) ? 1 : -1;
            }
        };
        Horizontal = selectionMode2;
        androidx.compose.foundation.text.selection.SelectionMode[] selectionModeArr = {selectionMode, selectionMode2};
        getHighResolutionOutputSizeshNQ4ISI = selectionModeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(selectionModeArr);
    }

    /* renamed from: isSelected-2x9bVx0$foundation, reason: not valid java name */
    public final boolean m2431isSelected2x9bVx0$foundation(androidx.compose.ui.geometry.Rect bounds, long start, long end) {
        if (getHighResolutionOutputSizeshNQ4ISI(bounds, start) || getHighResolutionOutputSizeshNQ4ISI(bounds, end)) {
            return true;
        }
        return (mo2430compare3MmeM6k$foundation(start, bounds) > 0) ^ (mo2430compare3MmeM6k$foundation(end, bounds) > 0);
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.geometry.Rect rect, long j) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        if (left > intBitsToFloat || intBitsToFloat > right) {
            return false;
        }
        float top = rect.getTop();
        float bottom = rect.getBottom();
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return top <= intBitsToFloat2 && intBitsToFloat2 <= bottom;
    }

    public static androidx.compose.foundation.text.selection.SelectionMode[] values() {
        return (androidx.compose.foundation.text.selection.SelectionMode[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static androidx.compose.foundation.text.selection.SelectionMode valueOf(java.lang.String str) {
        return (androidx.compose.foundation.text.selection.SelectionMode) java.lang.Enum.valueOf(androidx.compose.foundation.text.selection.SelectionMode.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.text.selection.SelectionMode> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public /* synthetic */ SelectionMode(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }
}
