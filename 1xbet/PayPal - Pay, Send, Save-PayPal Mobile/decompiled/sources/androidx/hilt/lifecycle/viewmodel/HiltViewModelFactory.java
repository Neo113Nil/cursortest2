package androidx.hilt.lifecycle.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/lifecycle/ViewModelProvider$Factory;", "delegateFactory", "create", "(Landroid/content/Context;Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HiltViewModelFactory {
    public static final androidx.lifecycle.ViewModelProvider.Factory create(android.content.Context context, androidx.lifecycle.ViewModelProvider.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        while (context instanceof android.content.ContextWrapper) {
            if (!(context instanceof androidx.view.ComponentActivity)) {
                context = ((android.content.ContextWrapper) context).getBaseContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "");
            } else {
                androidx.lifecycle.ViewModelProvider.Factory createInternal = dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.createInternal((androidx.view.ComponentActivity) context, factory);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createInternal, "");
                return createInternal;
            }
        }
        throw new java.lang.IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: ".concat(java.lang.String.valueOf(context)));
    }
}
