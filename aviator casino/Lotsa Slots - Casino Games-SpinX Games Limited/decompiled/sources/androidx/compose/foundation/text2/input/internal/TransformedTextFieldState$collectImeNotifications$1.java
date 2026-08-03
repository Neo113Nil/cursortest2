package androidx.compose.foundation.text2.input.internal;

/* compiled from: TransformedTextFieldState.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text2.input.internal.TransformedTextFieldState", f = "TransformedTextFieldState.kt", i = {0, 0}, l = {394}, m = "collectImeNotifications", n = {"this", "notifyImeListener"}, s = {"L$0", "L$1"})
/* loaded from: classes.dex */
final class TransformedTextFieldState$collectImeNotifications$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.compose.foundation.text2.input.internal.TransformedTextFieldState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformedTextFieldState$collectImeNotifications$1(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text2.input.internal.TransformedTextFieldState$collectImeNotifications$1> continuation) {
        super(continuation);
        this.this$0 = transformedTextFieldState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collectImeNotifications(null, this);
    }
}
