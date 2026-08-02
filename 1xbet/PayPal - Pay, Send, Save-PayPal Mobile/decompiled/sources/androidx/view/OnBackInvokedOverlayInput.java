package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/navigationevent/OnBackInvokedOverlayInput;", "Landroidx/navigationevent/OnBackInvokedInput;", "Landroid/window/OnBackInvokedDispatcher;", "onBackInvokedDispatcher", "<init>", "(Landroid/window/OnBackInvokedDispatcher;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnBackInvokedOverlayInput extends androidx.view.OnBackInvokedInput {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBackInvokedOverlayInput(android.window.OnBackInvokedDispatcher onBackInvokedDispatcher) {
        super(onBackInvokedDispatcher, 1000000, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBackInvokedDispatcher, "");
    }
}
