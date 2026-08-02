package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u001a\u0010\u0010\u001a\u00020\u000f8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0014\u001a\u00020\u000f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013\" \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "getAdjustedCoordinates-k-4lQ0M", "(J)J", "getAdjustedCoordinates", "", "isStartHandle", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "direction", "handlesCrossed", "isLeftSelectionHandle", "(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Z)Z", "areHandlesCrossed", "isHandleLtrDirection", "(Landroidx/compose/ui/text/style/ResolvedTextDirection;Z)Z", "Landroidx/compose/ui/unit/Dp;", "HandleWidth", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHandleWidth", "()F", "HandleHeight", "getHandleHeight", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/foundation/text/selection/SelectionHandleInfo;", "SelectionHandleInfoKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getSelectionHandleInfoKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectionHandlesKt {
    private static final float HandleWidth = androidx.compose.ui.unit.Dp.m8601constructorimpl(25.0f);
    private static final float HandleHeight = androidx.compose.ui.unit.Dp.m8601constructorimpl(25.0f);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.foundation.text.selection.SelectionHandleInfo> SelectionHandleInfoKey = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("SelectionHandleInfo", (kotlin.jvm.functions.Function2) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);

    public static final float getHandleWidth() {
        return HandleWidth;
    }

    public static final float getHandleHeight() {
        return HandleHeight;
    }

    public static final androidx.compose.ui.semantics.SemanticsPropertyKey<androidx.compose.foundation.text.selection.SelectionHandleInfo> getSelectionHandleInfoKey() {
        return SelectionHandleInfoKey;
    }

    public static final boolean isLeftSelectionHandle(boolean z, androidx.compose.ui.text.style.ResolvedTextDirection resolvedTextDirection, boolean z2) {
        if (z) {
            return isHandleLtrDirection(resolvedTextDirection, z2);
        }
        return !isHandleLtrDirection(resolvedTextDirection, z2);
    }

    public static final boolean isHandleLtrDirection(androidx.compose.ui.text.style.ResolvedTextDirection resolvedTextDirection, boolean z) {
        if (resolvedTextDirection != androidx.compose.ui.text.style.ResolvedTextDirection.Ltr || z) {
            return resolvedTextDirection == androidx.compose.ui.text.style.ResolvedTextDirection.Rtl && z;
        }
        return true;
    }

    /* renamed from: getAdjustedCoordinates-k-4lQ0M, reason: not valid java name */
    public static final long m2398getAdjustedCoordinatesk4lQ0M(long j) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32));
    }
}
