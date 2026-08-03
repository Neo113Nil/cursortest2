package androidx.compose.foundation.text2;

/* compiled from: BasicSecureTextField.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class SecureTextFieldController$passwordRevealFilter$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    SecureTextFieldController$passwordRevealFilter$1(java.lang.Object obj) {
        super(0, obj, androidx.compose.foundation.text2.SecureTextFieldController.class, "scheduleHide", "scheduleHide()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
        invoke2();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((androidx.compose.foundation.text2.SecureTextFieldController) this.receiver).scheduleHide();
    }
}
