package androidx.compose.foundation.text2.input.internal;

/* compiled from: ComposeInputMethodManager.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0013\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManagerImplApi24;", "Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManagerImplApi21;", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "(Landroid/view/View;)V", "sendKeyEvent", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Landroid/view/KeyEvent;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
class ComposeInputMethodManagerImplApi24 extends androidx.compose.foundation.text2.input.internal.ComposeInputMethodManagerImplApi21 {
    public ComposeInputMethodManagerImplApi24(android.view.View view) {
        super(view);
    }

    @Override // androidx.compose.foundation.text2.input.internal.ComposeInputMethodManagerImplApi21, androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager
    public void sendKeyEvent(android.view.KeyEvent event) {
        requireImm().dispatchKeyEventFromInputMethod(getView(), event);
    }
}
