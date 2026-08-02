package androidx.compose.foundation.gestures.snapping;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aO\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", "mainAxisViewPortSize", "beforeContentPadding", "afterContentPadding", "itemSize", "itemOffset", "itemIndex", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "itemCount", "", "calculateDistanceToDesiredSnapPosition", "(IIIIIILandroidx/compose/foundation/gestures/snapping/SnapPosition;I)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SnapPositionKt {
    public static final float calculateDistanceToDesiredSnapPosition(int i, int i2, int i3, int i4, int i5, int i6, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, int i7) {
        return i5 - snapPosition.position(i, i4, i2, i3, i6, i7);
    }
}
