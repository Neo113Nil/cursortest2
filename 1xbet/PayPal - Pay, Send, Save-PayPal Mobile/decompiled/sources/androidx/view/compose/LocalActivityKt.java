package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001f\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroid/app/Activity;", "LocalActivity", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalActivity", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LocalActivityKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<android.app.Activity> LocalActivity = androidx.compose.runtime.CompositionLocalKt.compositionLocalWithComputedDefaultOf(new kotlin.jvm.functions.Function1() { // from class: androidx.activity.compose.LocalActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.view.compose.LocalActivityKt.m16$r8$lambda$ZboyhwMBcCFOYz7yYNav9JBYw((androidx.compose.runtime.CompositionLocalAccessorScope) obj);
        }
    });

    public static final androidx.compose.runtime.ProvidableCompositionLocal<android.app.Activity> getLocalActivity() {
        return LocalActivity;
    }

    /* renamed from: $r8$lambda$ZboyhwMBcCF-OYz7-yYNav9JBYw, reason: not valid java name */
    public static /* synthetic */ android.app.Activity m16$r8$lambda$ZboyhwMBcCFOYz7yYNav9JBYw(androidx.compose.runtime.CompositionLocalAccessorScope compositionLocalAccessorScope) {
        android.content.Context context = (android.content.Context) compositionLocalAccessorScope.getCurrentValue(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        while (true) {
            if (!(context instanceof android.content.ContextWrapper)) {
                context = null;
                break;
            }
            if (context instanceof android.app.Activity) {
                break;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return (android.app.Activity) context;
    }
}
