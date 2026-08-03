package androidx.compose.ui.platform;

/* compiled from: AndroidComposeView.android.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", i = {}, l = {428}, m = "textInputSession", n = {}, s = {})
/* loaded from: classes.dex */
final class AndroidComposeView$textInputSession$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.compose.ui.platform.AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeView$textInputSession$1(androidx.compose.ui.platform.AndroidComposeView androidComposeView, kotlin.coroutines.Continuation<? super androidx.compose.ui.platform.AndroidComposeView$textInputSession$1> continuation) {
        super(continuation);
        this.this$0 = androidComposeView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.textInputSession(null, this);
    }
}
