package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/LifecycleCoroutineScope;", "getLifecycleScope", "(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;", "lifecycleScope"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LifecycleOwnerKt {
    public static final androidx.view.LifecycleCoroutineScope getLifecycleScope(androidx.view.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        return androidx.view.LifecycleKt.getCoroutineScope(lifecycleOwner.getLifecycle());
    }
}
