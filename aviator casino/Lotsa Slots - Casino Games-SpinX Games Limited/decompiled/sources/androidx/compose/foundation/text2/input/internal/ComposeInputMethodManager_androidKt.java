package androidx.compose.foundation.text2.input.internal;

/* compiled from: ComposeInputMethodManager.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0000\u001a(\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0001\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"ComposeInputMethodManagerFactory", "Lkotlin/Function1;", "Landroid/view/View;", "Landroidx/compose/foundation/text2/input/internal/ComposeInputMethodManager;", "ComposeInputMethodManager", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "overrideComposeInputMethodManagerFactoryForTests", "factory", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposeInputMethodManager_androidKt {
    private static kotlin.jvm.functions.Function1<? super android.view.View, ? extends androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager> ComposeInputMethodManagerFactory = new kotlin.jvm.functions.Function1<android.view.View, androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager>() { // from class: androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager_androidKt$ComposeInputMethodManagerFactory$1
        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager invoke(android.view.View view) {
            return android.os.Build.VERSION.SDK_INT >= 24 ? new androidx.compose.foundation.text2.input.internal.ComposeInputMethodManagerImplApi24(view) : new androidx.compose.foundation.text2.input.internal.ComposeInputMethodManagerImplApi21(view);
        }
    };

    public static final androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager ComposeInputMethodManager(android.view.View view) {
        return ComposeInputMethodManagerFactory.invoke(view);
    }

    public static final kotlin.jvm.functions.Function1<android.view.View, androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager> overrideComposeInputMethodManagerFactoryForTests(kotlin.jvm.functions.Function1<? super android.view.View, ? extends androidx.compose.foundation.text2.input.internal.ComposeInputMethodManager> function1) {
        kotlin.jvm.functions.Function1 function12 = ComposeInputMethodManagerFactory;
        ComposeInputMethodManagerFactory = function1;
        return function12;
    }
}
