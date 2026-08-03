package androidx.compose.ui.viewinterop;

/* compiled from: AndroidViewHolder.android.kt */
@kotlin.Metadata(d1 = {"\u0000/\n\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0001\u001a\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\b\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0004H\u0002\u001a\f\u0010\u0010\u001a\u00020\u000f*\u00020\u000fH\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"NoOpScrollConnection", "androidx/compose/ui/viewinterop/AndroidViewHolder_androidKt$NoOpScrollConnection$1", "Landroidx/compose/ui/viewinterop/AndroidViewHolder_androidKt$NoOpScrollConnection$1;", "Unmeasured", "", "toNestedScrollSource", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "type", "(I)I", "layoutAccordingTo", "", "Landroid/view/View;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "toComposeOffset", "", "toComposeVelocity", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidViewHolder_androidKt {
    private static final androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt$NoOpScrollConnection$1 NoOpScrollConnection = new androidx.compose.ui.input.nestedscroll.NestedScrollConnection() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder_androidKt$NoOpScrollConnection$1
        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostFling-RZ2iAVY */
        public /* synthetic */ java.lang.Object mo401onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation continuation) {
            return androidx.compose.ui.input.nestedscroll.NestedScrollConnection.CC.m3150onPostFlingRZ2iAVY$suspendImpl(this, j, j2, continuation);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPostScroll-DzOQY0M */
        public /* synthetic */ long mo402onPostScrollDzOQY0M(long j, long j2, int i) {
            return androidx.compose.ui.input.nestedscroll.NestedScrollConnection.CC.m3143$default$onPostScrollDzOQY0M(this, j, j2, i);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreFling-QWom1Mo */
        public /* synthetic */ java.lang.Object mo403onPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation continuation) {
            return androidx.compose.ui.input.nestedscroll.NestedScrollConnection.CC.m3151onPreFlingQWom1Mo$suspendImpl(this, j, continuation);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* renamed from: onPreScroll-OzD1aCk */
        public /* synthetic */ long mo404onPreScrollOzD1aCk(long j, int i) {
            return androidx.compose.ui.input.nestedscroll.NestedScrollConnection.CC.m3145$default$onPreScrollOzD1aCk(this, j, i);
        }
    };
    private static final int Unmeasured = Integer.MIN_VALUE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toComposeOffset(int i) {
        return i * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toComposeVelocity(float f) {
        return f * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void layoutAccordingTo(android.view.View view, androidx.compose.ui.node.LayoutNode layoutNode) {
        long positionInRoot = androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(layoutNode.getCoordinates());
        int roundToInt = kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Offset.m1871getXimpl(positionInRoot));
        int roundToInt2 = kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Offset.m1872getYimpl(positionInRoot));
        view.layout(roundToInt, roundToInt2, view.getMeasuredWidth() + roundToInt, view.getMeasuredHeight() + roundToInt2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toNestedScrollSource(int i) {
        if (i == 0) {
            return androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m3168getDragWNlRxjI();
        }
        return androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m3169getFlingWNlRxjI();
    }
}
