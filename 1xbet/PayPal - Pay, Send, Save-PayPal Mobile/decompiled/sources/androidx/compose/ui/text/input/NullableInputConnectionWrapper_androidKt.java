package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;", "", "onConnectionClosed", "NullableInputConnectionWrapper", "(Landroid/view/inputmethod/InputConnection;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/input/NullableInputConnectionWrapper;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NullableInputConnectionWrapper_androidKt {
    public static final androidx.compose.ui.text.input.NullableInputConnectionWrapper NullableInputConnectionWrapper(android.view.inputmethod.InputConnection inputConnection, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.NullableInputConnectionWrapper, kotlin.Unit> function1) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return new androidx.compose.ui.text.input.NullableInputConnectionWrapperApi34(inputConnection, function1);
        }
        return new androidx.compose.ui.text.input.NullableInputConnectionWrapperApi25(inputConnection, function1);
    }
}
