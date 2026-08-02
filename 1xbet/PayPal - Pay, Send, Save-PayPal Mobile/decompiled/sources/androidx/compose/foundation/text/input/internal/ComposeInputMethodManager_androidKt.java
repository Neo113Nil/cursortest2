package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a/\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroid/view/View;", "view", "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "ComposeInputMethodManager", "(Landroid/view/View;)Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;", "Lkotlin/Function1;", "factory", "overrideComposeInputMethodManagerFactoryForTests", "(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposeInputMethodManager_androidKt {
    private static kotlin.jvm.functions.Function1<? super android.view.View, ? extends androidx.compose.foundation.text.input.internal.ComposeInputMethodManager> getHighSpeedVideoFpsRangesFor = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt.$r8$lambda$6I8oJ1L3k6rMyYAnlU1HDVNNQA4((android.view.View) obj);
        }
    };

    public static final androidx.compose.foundation.text.input.internal.ComposeInputMethodManager ComposeInputMethodManager(android.view.View view) {
        return getHighSpeedVideoFpsRangesFor.invoke(view);
    }

    public static final kotlin.jvm.functions.Function1<android.view.View, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager> overrideComposeInputMethodManagerFactoryForTests(kotlin.jvm.functions.Function1<? super android.view.View, ? extends androidx.compose.foundation.text.input.internal.ComposeInputMethodManager> function1) {
        kotlin.jvm.functions.Function1 function12 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRangesFor = function1;
        return function12;
    }

    public static /* synthetic */ androidx.compose.foundation.text.input.internal.ComposeInputMethodManager $r8$lambda$6I8oJ1L3k6rMyYAnlU1HDVNNQA4(android.view.View view) {
        return android.os.Build.VERSION.SDK_INT >= 34 ? new androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImplApi34(view) : new androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImplApi24(view);
    }
}
