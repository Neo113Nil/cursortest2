package androidx.view.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/fragment/app/Fragment;", "Landroidx/navigation/NavController;", "findNavController", "(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FragmentKt {
    public static final androidx.view.NavController findNavController(androidx.fragment.app.Fragment fragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        return androidx.view.fragment.NavHostFragment.INSTANCE.findNavController(fragment);
    }
}
