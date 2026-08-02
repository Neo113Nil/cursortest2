package androidx.core.view;

/* loaded from: classes.dex */
public interface MenuHost {
    void addMenuProvider(androidx.core.view.MenuProvider menuProvider);

    void addMenuProvider(androidx.core.view.MenuProvider menuProvider, androidx.view.LifecycleOwner lifecycleOwner);

    void addMenuProvider(androidx.core.view.MenuProvider menuProvider, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.State state);

    void invalidateMenu();

    void removeMenuProvider(androidx.core.view.MenuProvider menuProvider);
}
