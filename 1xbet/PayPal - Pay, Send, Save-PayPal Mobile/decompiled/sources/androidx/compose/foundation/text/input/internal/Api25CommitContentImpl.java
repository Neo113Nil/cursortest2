package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/foundation/text/input/internal/Api25CommitContentImpl;", "", "<init>", "()V", "Landroid/view/inputmethod/InputConnection;", "p0", "Landroid/view/inputmethod/InputContentInfo;", "p1", "", "p2", "Landroid/os/Bundle;", "p3", "", "getHighSpeedVideoSizes", "(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Api25CommitContentImpl {
    public static final androidx.compose.foundation.text.input.internal.Api25CommitContentImpl INSTANCE = new androidx.compose.foundation.text.input.internal.Api25CommitContentImpl();

    private Api25CommitContentImpl() {
    }

    public final boolean getHighSpeedVideoSizes(android.view.inputmethod.InputConnection p0, android.view.inputmethod.InputContentInfo p1, int p2, android.os.Bundle p3) {
        return p0.commitContent(p1, p2, p3);
    }
}
