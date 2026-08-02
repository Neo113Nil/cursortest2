package androidx.view;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public class ViewModelProviders {
    @java.lang.Deprecated
    public ViewModelProviders() {
    }

    @java.lang.Deprecated
    public static androidx.view.ViewModelProvider of(androidx.fragment.app.Fragment fragment) {
        return new androidx.view.ViewModelProvider(fragment);
    }

    @java.lang.Deprecated
    public static androidx.view.ViewModelProvider of(androidx.fragment.app.FragmentActivity fragmentActivity) {
        return new androidx.view.ViewModelProvider(fragmentActivity);
    }

    @java.lang.Deprecated
    public static androidx.view.ViewModelProvider of(androidx.fragment.app.Fragment fragment, androidx.lifecycle.ViewModelProvider.Factory factory) {
        if (factory == null) {
            factory = fragment.getDefaultViewModelProviderFactory();
        }
        return new androidx.view.ViewModelProvider(fragment.getViewModelStore(), factory);
    }

    @java.lang.Deprecated
    public static androidx.view.ViewModelProvider of(androidx.fragment.app.FragmentActivity fragmentActivity, androidx.lifecycle.ViewModelProvider.Factory factory) {
        if (factory == null) {
            factory = fragmentActivity.getDefaultViewModelProviderFactory();
        }
        return new androidx.view.ViewModelProvider(fragmentActivity.getViewModelStore(), factory);
    }

    @java.lang.Deprecated
    public static class DefaultFactory extends androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory {
        @java.lang.Deprecated
        public DefaultFactory(android.app.Application application) {
            super(application);
        }
    }
}
