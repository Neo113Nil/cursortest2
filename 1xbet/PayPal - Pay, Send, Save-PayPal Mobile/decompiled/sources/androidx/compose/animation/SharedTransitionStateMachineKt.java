package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0018\u0010\u000b\u001a\u00020\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/animation/TargetData;", "Landroidx/compose/ui/geometry/Rect;", "animatedBounds", "Landroidx/compose/ui/geometry/Offset;", "calculateOffsetFromDirectManipulation", "(Landroidx/compose/animation/TargetData;Landroidx/compose/ui/geometry/Rect;)J", "", "SharedTransitionDebug", "Z", "getTargetBounds", "(Landroidx/compose/animation/TargetData;)Landroidx/compose/ui/geometry/Rect;", "targetBounds"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SharedTransitionStateMachineKt {
    public static final boolean SharedTransitionDebug = false;

    public static final androidx.compose.ui.geometry.Rect getTargetBounds(androidx.compose.animation.TargetData targetData) {
        return androidx.compose.ui.geometry.RectKt.m5792Recttz77jQw(androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(targetData.m1158getInitialMfrOffsetF1C5BW0(), targetData.m1160getTargetStructuralOffsetF1C5BW0()), targetData.m1159getSizeNHjbRc());
    }

    public static final long calculateOffsetFromDirectManipulation(androidx.compose.animation.TargetData targetData, androidx.compose.ui.geometry.Rect rect) {
        return androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(rect.m5787getTopLeftF1C5BW0(), targetData.m1158getInitialMfrOffsetF1C5BW0()), targetData.m1157getCurrentMfrOffsetF1C5BW0());
    }

    public static final /* synthetic */ androidx.compose.ui.geometry.Rect access$obtainBoundsFromLastTarget(androidx.compose.animation.SharedElement sharedElement, androidx.compose.animation.BoundsProvider boundsProvider) {
        if (boundsProvider == null) {
            return null;
        }
        java.util.List<androidx.compose.animation.SharedElementEntry> allEntries = sharedElement.getAllEntries();
        int size = allEntries.size();
        for (int i = 0; i < size; i++) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(allEntries.get(i).getBoundsProvider(), boundsProvider)) {
                return boundsProvider.getLastBoundsInSharedTransitionScope();
            }
        }
        return null;
    }

    /* renamed from: access$updateTargetData-BGTQxF0, reason: not valid java name */
    public static final /* synthetic */ void m1147access$updateTargetDataBGTQxF0(androidx.compose.animation.TargetData targetData, long j, long j2, long j3, boolean z) {
        if (!androidx.compose.ui.geometry.Offset.m5749equalsimpl0(targetData.m1160getTargetStructuralOffsetF1C5BW0(), j3) || !androidx.compose.ui.geometry.Size.m5817equalsimpl0(targetData.m1159getSizeNHjbRc(), j) || z) {
            targetData.m1163setSizeuvyYCjk(j);
            targetData.m1164setTargetStructuralOffsetk4lQ0M(j3);
            if (z) {
                targetData.m1162setInitialMfrOffsetk4lQ0M(androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(j2, j3), androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(targetData.m1157getCurrentMfrOffsetF1C5BW0(), targetData.m1158getInitialMfrOffsetF1C5BW0())));
            }
        }
        targetData.m1161setCurrentMfrOffsetk4lQ0M(androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(j2, j3));
    }
}
