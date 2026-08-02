package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aP\u0010\u0000\u001a\u00020\u00012\u0014\b\u0006\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0010\b\u0006\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0010\b\u0006\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00062\u0006\u0010\b\u001a\u00020\tH\u0081\b¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"rememberClipboardEventsHandler", "", "onPaste", "Lkotlin/Function1;", "Landroidx/compose/ui/text/AnnotatedString;", "onCopy", "Lkotlin/Function0;", "onCut", "isEnabled", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClipboardEventsHandler_jvmKt {
    public static final void rememberClipboardEventsHandler(kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.AnnotatedString, kotlin.Unit> function1, kotlin.jvm.functions.Function0<androidx.compose.ui.text.AnnotatedString> function0, kotlin.jvm.functions.Function0<androidx.compose.ui.text.AnnotatedString> function02, boolean z, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            androidx.compose.foundation.text.ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$1 clipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$1 = androidx.compose.foundation.text.ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            androidx.compose.foundation.text.ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$2 clipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$2 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Void invoke() {
                    return null;
                }
            };
        }
        if ((i2 & 4) != 0) {
            androidx.compose.foundation.text.ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$3 clipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$3 = androidx.compose.foundation.text.ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$3.INSTANCE;
        }
    }
}
