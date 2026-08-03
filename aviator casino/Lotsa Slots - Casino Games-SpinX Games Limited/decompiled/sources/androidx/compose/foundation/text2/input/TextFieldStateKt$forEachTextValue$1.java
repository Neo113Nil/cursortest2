package androidx.compose.foundation.text2.input;

/* compiled from: TextFieldState.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text2.input.TextFieldStateKt", f = "TextFieldState.kt", i = {}, l = {566}, m = "forEachTextValue", n = {}, s = {})
/* loaded from: classes.dex */
final class TextFieldStateKt$forEachTextValue$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;

    TextFieldStateKt$forEachTextValue$1(kotlin.coroutines.Continuation<? super androidx.compose.foundation.text2.input.TextFieldStateKt$forEachTextValue$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return androidx.compose.foundation.text2.input.TextFieldStateKt.forEachTextValue(null, null, this);
    }
}
