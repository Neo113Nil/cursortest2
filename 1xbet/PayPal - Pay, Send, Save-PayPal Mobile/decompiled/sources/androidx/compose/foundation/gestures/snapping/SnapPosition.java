package androidx.compose.foundation.gestures.snapping;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001:\u0003\u000b\f\rJ?\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "", "", "layoutSize", "itemSize", "beforeContentPadding", "afterContentPadding", "itemIndex", "itemCount", com.daon.sdk.face.license.License.FEATURE_POSITION, "(IIIIII)I", "Center", "Start", "End"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SnapPosition {
    int position(int layoutSize, int itemSize, int beforeContentPadding, int afterContentPadding, int itemIndex, int itemCount);

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapPosition$Center;", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "<init>", "()V", "", "layoutSize", "itemSize", "beforeContentPadding", "afterContentPadding", "itemIndex", "itemCount", com.daon.sdk.face.license.License.FEATURE_POSITION, "(IIIIII)I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Center implements androidx.compose.foundation.gestures.snapping.SnapPosition {
        public static final int $stable = 0;
        public static final androidx.compose.foundation.gestures.snapping.SnapPosition.Center INSTANCE = new androidx.compose.foundation.gestures.snapping.SnapPosition.Center();

        private Center() {
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public final int position(int layoutSize, int itemSize, int beforeContentPadding, int afterContentPadding, int itemIndex, int itemCount) {
            return (((layoutSize - beforeContentPadding) - afterContentPadding) / 2) - (itemSize / 2);
        }

        public final java.lang.String toString() {
            return "Center";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapPosition$Start;", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "<init>", "()V", "", "layoutSize", "itemSize", "beforeContentPadding", "afterContentPadding", "itemIndex", "itemCount", com.daon.sdk.face.license.License.FEATURE_POSITION, "(IIIIII)I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Start implements androidx.compose.foundation.gestures.snapping.SnapPosition {
        public static final int $stable = 0;
        public static final androidx.compose.foundation.gestures.snapping.SnapPosition.Start INSTANCE = new androidx.compose.foundation.gestures.snapping.SnapPosition.Start();

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public final int position(int layoutSize, int itemSize, int beforeContentPadding, int afterContentPadding, int itemIndex, int itemCount) {
            return 0;
        }

        private Start() {
        }

        public final java.lang.String toString() {
            return "Start";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/SnapPosition$End;", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "<init>", "()V", "", "layoutSize", "itemSize", "beforeContentPadding", "afterContentPadding", "itemIndex", "itemCount", com.daon.sdk.face.license.License.FEATURE_POSITION, "(IIIIII)I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class End implements androidx.compose.foundation.gestures.snapping.SnapPosition {
        public static final int $stable = 0;
        public static final androidx.compose.foundation.gestures.snapping.SnapPosition.End INSTANCE = new androidx.compose.foundation.gestures.snapping.SnapPosition.End();

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public final int position(int layoutSize, int itemSize, int beforeContentPadding, int afterContentPadding, int itemIndex, int itemCount) {
            return ((layoutSize - beforeContentPadding) - afterContentPadding) - itemSize;
        }

        private End() {
        }

        public final java.lang.String toString() {
            return "End";
        }
    }
}
