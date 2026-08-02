package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Landroidx/lifecycle/LifecycleOwner;", "findViewTreeLifecycleOwner", "(Landroid/view/View;)Landroidx/lifecycle/LifecycleOwner;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.ViewKt, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275ViewKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Replaced by View.findViewTreeLifecycleOwner() from lifecycle module", replaceWith = @kotlin.ReplaceWith(expression = "findViewTreeLifecycleOwner()", imports = {"androidx.lifecycle.findViewTreeLifecycleOwner"}))
    public static final /* synthetic */ androidx.view.LifecycleOwner findViewTreeLifecycleOwner(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        return androidx.view.C0276ViewTreeLifecycleOwner.get(view);
    }
}
