package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Landroidx/savedstate/SavedStateRegistryOwner;", "findViewTreeSavedStateRegistryOwner", "(Landroid/view/View;)Landroidx/savedstate/SavedStateRegistryOwner;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.savedstate.ViewKt, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0290ViewKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Replaced by View.findViewTreeSavedStateRegistryOwner() from savedstate module", replaceWith = @kotlin.ReplaceWith(expression = "findViewTreeSavedStateRegistryOwner()", imports = {"androidx.savedstate.findViewTreeSavedStateRegistryOwner"}))
    public static final /* synthetic */ androidx.view.SavedStateRegistryOwner findViewTreeSavedStateRegistryOwner(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        return androidx.view.C0291ViewTreeSavedStateRegistryOwner.get(view);
    }
}
