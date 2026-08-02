package androidx.view;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public class ViewModelStores {
    private ViewModelStores() {
    }

    @java.lang.Deprecated
    public static androidx.view.ViewModelStore of(androidx.fragment.app.FragmentActivity fragmentActivity) {
        return fragmentActivity.getViewModelStore();
    }

    @java.lang.Deprecated
    public static androidx.view.ViewModelStore of(androidx.fragment.app.Fragment fragment) {
        return fragment.getViewModelStore();
    }
}
