package androidx.core.view;

/* loaded from: classes.dex */
public class MenuHostHelper {
    final java.lang.Runnable Camera2StreamConfigurationMap;
    final java.util.concurrent.CopyOnWriteArrayList<androidx.core.view.MenuProvider> getHighSpeedVideoFpsRanges = new java.util.concurrent.CopyOnWriteArrayList<>();
    private final java.util.Map<androidx.core.view.MenuProvider, androidx.core.view.MenuHostHelper.LifecycleContainer> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();

    public MenuHostHelper(java.lang.Runnable runnable) {
        this.Camera2StreamConfigurationMap = runnable;
    }

    public void onPrepareMenu(android.view.Menu menu) {
        java.util.Iterator<androidx.core.view.MenuProvider> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            it.next().onPrepareMenu(menu);
        }
    }

    public void onCreateMenu(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        java.util.Iterator<androidx.core.view.MenuProvider> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            it.next().onCreateMenu(menu, menuInflater);
        }
    }

    public boolean onMenuItemSelected(android.view.MenuItem menuItem) {
        java.util.Iterator<androidx.core.view.MenuProvider> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            if (it.next().onMenuItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void onMenuClosed(android.view.Menu menu) {
        java.util.Iterator<androidx.core.view.MenuProvider> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            it.next().onMenuClosed(menu);
        }
    }

    public void addMenuProvider(androidx.core.view.MenuProvider menuProvider) {
        this.getHighSpeedVideoFpsRanges.add(menuProvider);
        this.Camera2StreamConfigurationMap.run();
    }

    public void addMenuProvider(final androidx.core.view.MenuProvider menuProvider, androidx.view.LifecycleOwner lifecycleOwner) {
        addMenuProvider(menuProvider);
        androidx.view.Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        androidx.core.view.MenuHostHelper.LifecycleContainer remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(menuProvider);
        if (remove != null) {
            remove.getHighSpeedVideoFpsRangesFor.removeObserver(remove.getHighSpeedVideoFpsRanges);
            remove.getHighSpeedVideoFpsRanges = null;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.put(menuProvider, new androidx.core.view.MenuHostHelper.LifecycleContainer(lifecycle, new androidx.view.LifecycleEventObserver() { // from class: androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda1
            @Override // androidx.view.LifecycleEventObserver
            public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner2, androidx.lifecycle.Lifecycle.Event event) {
                androidx.core.view.MenuHostHelper menuHostHelper = androidx.core.view.MenuHostHelper.this;
                androidx.core.view.MenuProvider menuProvider2 = menuProvider;
                if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
                    menuHostHelper.removeMenuProvider(menuProvider2);
                }
            }
        }));
    }

    public void addMenuProvider(final androidx.core.view.MenuProvider menuProvider, androidx.view.LifecycleOwner lifecycleOwner, final androidx.lifecycle.Lifecycle.State state) {
        androidx.view.Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        androidx.core.view.MenuHostHelper.LifecycleContainer remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(menuProvider);
        if (remove != null) {
            remove.getHighSpeedVideoFpsRangesFor.removeObserver(remove.getHighSpeedVideoFpsRanges);
            remove.getHighSpeedVideoFpsRanges = null;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.put(menuProvider, new androidx.core.view.MenuHostHelper.LifecycleContainer(lifecycle, new androidx.view.LifecycleEventObserver() { // from class: androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda0
            @Override // androidx.view.LifecycleEventObserver
            public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner2, androidx.lifecycle.Lifecycle.Event event) {
                androidx.core.view.MenuHostHelper menuHostHelper = androidx.core.view.MenuHostHelper.this;
                androidx.lifecycle.Lifecycle.State state2 = state;
                androidx.core.view.MenuProvider menuProvider2 = menuProvider;
                if (event == androidx.lifecycle.Lifecycle.Event.upTo(state2)) {
                    menuHostHelper.addMenuProvider(menuProvider2);
                    return;
                }
                if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
                    menuHostHelper.removeMenuProvider(menuProvider2);
                } else if (event == androidx.lifecycle.Lifecycle.Event.downFrom(state2)) {
                    menuHostHelper.getHighSpeedVideoFpsRanges.remove(menuProvider2);
                    menuHostHelper.Camera2StreamConfigurationMap.run();
                }
            }
        }));
    }

    public void removeMenuProvider(androidx.core.view.MenuProvider menuProvider) {
        this.getHighSpeedVideoFpsRanges.remove(menuProvider);
        androidx.core.view.MenuHostHelper.LifecycleContainer remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(menuProvider);
        if (remove != null) {
            remove.getHighSpeedVideoFpsRangesFor.removeObserver(remove.getHighSpeedVideoFpsRanges);
            remove.getHighSpeedVideoFpsRanges = null;
        }
        this.Camera2StreamConfigurationMap.run();
    }

    /* loaded from: classes3.dex */
    static class LifecycleContainer {
        androidx.view.LifecycleEventObserver getHighSpeedVideoFpsRanges;
        final androidx.view.Lifecycle getHighSpeedVideoFpsRangesFor;

        LifecycleContainer(androidx.view.Lifecycle lifecycle, androidx.view.LifecycleEventObserver lifecycleEventObserver) {
            this.getHighSpeedVideoFpsRangesFor = lifecycle;
            this.getHighSpeedVideoFpsRanges = lifecycleEventObserver;
            lifecycle.addObserver(lifecycleEventObserver);
        }
    }
}
