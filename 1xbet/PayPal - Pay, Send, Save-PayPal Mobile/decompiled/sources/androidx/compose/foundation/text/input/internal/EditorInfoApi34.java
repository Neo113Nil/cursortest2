package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/EditorInfoApi34;", "", "<init>", "()V", "Landroid/view/inputmethod/EditorInfo;", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/view/inputmethod/EditorInfo;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class EditorInfoApi34 {
    public static final androidx.compose.foundation.text.input.internal.EditorInfoApi34 INSTANCE = new androidx.compose.foundation.text.input.internal.EditorInfoApi34();

    private EditorInfoApi34() {
    }

    public final void getHighResolutionOutputSizeshNQ4ISI(android.view.inputmethod.EditorInfo p0) {
        p0.setSupportedHandwritingGestures(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Class[]{android.view.inputmethod.SelectGesture.class, android.view.inputmethod.DeleteGesture.class, android.view.inputmethod.SelectRangeGesture.class, android.view.inputmethod.DeleteRangeGesture.class, android.view.inputmethod.JoinOrSplitGesture.class, android.view.inputmethod.InsertGesture.class, android.view.inputmethod.RemoveSpaceGesture.class}));
        p0.setSupportedHandwritingGesturePreviews(kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Class[]{android.view.inputmethod.SelectGesture.class, android.view.inputmethod.DeleteGesture.class, android.view.inputmethod.SelectRangeGesture.class, android.view.inputmethod.DeleteRangeGesture.class}));
    }
}
