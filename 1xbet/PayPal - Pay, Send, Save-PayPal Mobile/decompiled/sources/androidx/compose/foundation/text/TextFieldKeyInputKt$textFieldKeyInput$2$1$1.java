package androidx.compose.foundation.text;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class TextFieldKeyInputKt$textFieldKeyInput$2$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<androidx.compose.ui.input.key.KeyEvent, java.lang.Boolean> {
    private java.lang.Boolean getHighSpeedVideoFpsRanges(android.view.KeyEvent keyEvent) {
        return java.lang.Boolean.valueOf(((androidx.compose.foundation.text.TextFieldKeyInput) this.receiver).m2120processZmokQxo(keyEvent));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Boolean invoke(androidx.compose.ui.input.key.KeyEvent keyEvent) {
        return getHighSpeedVideoFpsRanges(keyEvent.m7078unboximpl());
    }

    TextFieldKeyInputKt$textFieldKeyInput$2$1$1(java.lang.Object obj) {
        super(1, obj, androidx.compose.foundation.text.TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
    }
}
