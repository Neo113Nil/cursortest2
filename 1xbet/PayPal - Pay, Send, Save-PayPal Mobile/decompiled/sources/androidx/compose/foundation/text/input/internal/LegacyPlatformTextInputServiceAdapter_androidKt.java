package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"4\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;", "createLegacyPlatformTextInputServiceAdapter", "()Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;", "Lkotlin/Function1;", "Landroid/view/View;", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "inputMethodManagerFactory", "Lkotlin/jvm/functions/Function1;", "getInputMethodManagerFactory", "()Lkotlin/jvm/functions/Function1;", "setInputMethodManagerFactory", "(Lkotlin/jvm/functions/Function1;)V", "getInputMethodManagerFactory$annotations", "()V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LegacyPlatformTextInputServiceAdapter_androidKt {
    private static kotlin.jvm.functions.Function1<? super android.view.View, ? extends androidx.compose.foundation.text.input.internal.InputMethodManager> inputMethodManagerFactory = androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt$inputMethodManagerFactory$1.getHighSpeedVideoFpsRangesFor;

    public static /* synthetic */ void getInputMethodManagerFactory$annotations() {
    }

    public static final kotlin.jvm.functions.Function1<android.view.View, androidx.compose.foundation.text.input.internal.InputMethodManager> getInputMethodManagerFactory() {
        return inputMethodManagerFactory;
    }

    public static final void setInputMethodManagerFactory(kotlin.jvm.functions.Function1<? super android.view.View, ? extends androidx.compose.foundation.text.input.internal.InputMethodManager> function1) {
        inputMethodManagerFactory = function1;
    }

    public static final androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter createLegacyPlatformTextInputServiceAdapter() {
        return new androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter();
    }

    public static final /* synthetic */ void access$updateWithEmojiCompat(android.view.inputmethod.EditorInfo editorInfo) {
        if (androidx.emoji2.text.EmojiCompat.isConfigured()) {
            androidx.emoji2.text.EmojiCompat.get().updateEditorInfo(editorInfo);
        }
    }
}
