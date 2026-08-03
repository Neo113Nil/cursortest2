package androidx.compose.foundation.layout;

/* compiled from: WindowInsetsConnection.android.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/DoNothingNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "()V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DoNothingNestedScrollConnection implements androidx.compose.ui.input.nestedscroll.NestedScrollConnection {
    public static final androidx.compose.foundation.layout.DoNothingNestedScrollConnection INSTANCE = new androidx.compose.foundation.layout.DoNothingNestedScrollConnection();

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

    private DoNothingNestedScrollConnection() {
    }
}
