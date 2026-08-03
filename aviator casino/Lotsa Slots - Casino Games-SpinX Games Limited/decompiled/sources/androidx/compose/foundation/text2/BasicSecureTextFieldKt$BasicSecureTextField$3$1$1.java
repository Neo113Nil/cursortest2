package androidx.compose.foundation.text2;

/* compiled from: BasicSecureTextField.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class BasicSecureTextFieldKt$BasicSecureTextField$3$1$1 implements androidx.compose.foundation.text2.input.ImeActionHandler, kotlin.jvm.internal.FunctionAdapter {
    final /* synthetic */ androidx.compose.foundation.text2.input.ImeActionHandler $tmp0;

    BasicSecureTextFieldKt$BasicSecureTextField$3$1$1(androidx.compose.foundation.text2.input.ImeActionHandler imeActionHandler) {
        this.$tmp0 = imeActionHandler;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof androidx.compose.foundation.text2.input.ImeActionHandler) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
        return new kotlin.jvm.internal.FunctionReferenceImpl(1, this.$tmp0, androidx.compose.foundation.text2.input.ImeActionHandler.class, "onImeAction", "onImeAction-KlQnJC8(I)Z", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.foundation.text2.input.ImeActionHandler
    /* renamed from: onImeAction-KlQnJC8, reason: not valid java name */
    public final boolean mo1086onImeActionKlQnJC8(int i) {
        return this.$tmp0.mo1086onImeActionKlQnJC8(i);
    }
}
