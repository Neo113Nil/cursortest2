package androidx.compose.ui.platform;

/* compiled from: AndroidComposeView.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", com.ironsource.sdk.controller.f.b.g, "Lkotlin/Function0;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidComposeView$snapshotObserver$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function0<? extends kotlin.Unit>, kotlin.Unit> {
    final /* synthetic */ androidx.compose.ui.platform.AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeView$snapshotObserver$1(androidx.compose.ui.platform.AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlin.jvm.functions.Function0<? extends kotlin.Unit> function0) {
        invoke2((kotlin.jvm.functions.Function0<kotlin.Unit>) function0);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        android.os.Handler handler = this.this$0.getHandler();
        if ((handler != null ? handler.getLooper() : null) == android.os.Looper.myLooper()) {
            function0.invoke();
            return;
        }
        android.os.Handler handler2 = this.this$0.getHandler();
        if (handler2 != null) {
            handler2.post(new java.lang.Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$snapshotObserver$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    kotlin.jvm.functions.Function0.this.invoke();
                }
            });
        }
    }
}
