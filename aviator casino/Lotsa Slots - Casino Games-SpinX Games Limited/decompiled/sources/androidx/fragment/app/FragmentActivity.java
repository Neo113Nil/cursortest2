package androidx.fragment.app;

/* loaded from: classes2.dex */
public class FragmentActivity extends androidx.activity.ComponentActivity implements androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback, androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator {
    static final java.lang.String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.LifecycleRegistry mFragmentLifecycleRegistry;
    final androidx.fragment.app.FragmentController mFragments;
    boolean mResumed;
    boolean mStopped;

    @java.lang.Deprecated
    public void onAttachFragment(androidx.fragment.app.Fragment fragment) {
    }

    @Override // androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator
    @java.lang.Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public FragmentActivity() {
        this.mFragments = androidx.fragment.app.FragmentController.createController(new androidx.fragment.app.FragmentActivity.HostCallbacks());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.LifecycleRegistry(this);
        this.mStopped = true;
        init();
    }

    public FragmentActivity(int i) {
        super(i);
        this.mFragments = androidx.fragment.app.FragmentController.createController(new androidx.fragment.app.FragmentActivity.HostCallbacks());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.LifecycleRegistry(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().registerSavedStateProvider(LIFECYCLE_TAG, new androidx.savedstate.SavedStateRegistry.SavedStateProvider() { // from class: androidx.fragment.app.FragmentActivity$$ExternalSyntheticLambda0
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final android.os.Bundle saveState() {
                return androidx.fragment.app.FragmentActivity.this.m4770lambda$init$0$androidxfragmentappFragmentActivity();
            }
        });
        addOnConfigurationChangedListener(new androidx.core.util.Consumer() { // from class: androidx.fragment.app.FragmentActivity$$ExternalSyntheticLambda1
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                androidx.fragment.app.FragmentActivity.this.m4771lambda$init$1$androidxfragmentappFragmentActivity((android.content.res.Configuration) obj);
            }
        });
        addOnNewIntentListener(new androidx.core.util.Consumer() { // from class: androidx.fragment.app.FragmentActivity$$ExternalSyntheticLambda2
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                androidx.fragment.app.FragmentActivity.this.m4772lambda$init$2$androidxfragmentappFragmentActivity((android.content.Intent) obj);
            }
        });
        addOnContextAvailableListener(new androidx.activity.contextaware.OnContextAvailableListener() { // from class: androidx.fragment.app.FragmentActivity$$ExternalSyntheticLambda3
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void onContextAvailable(android.content.Context context) {
                androidx.fragment.app.FragmentActivity.this.m4773lambda$init$3$androidxfragmentappFragmentActivity(context);
            }
        });
    }

    /* renamed from: lambda$init$0$androidx-fragment-app-FragmentActivity, reason: not valid java name */
    /* synthetic */ android.os.Bundle m4770lambda$init$0$androidxfragmentappFragmentActivity() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP);
        return new android.os.Bundle();
    }

    /* renamed from: lambda$init$1$androidx-fragment-app-FragmentActivity, reason: not valid java name */
    /* synthetic */ void m4771lambda$init$1$androidxfragmentappFragmentActivity(android.content.res.Configuration configuration) {
        this.mFragments.noteStateNotSaved();
    }

    /* renamed from: lambda$init$2$androidx-fragment-app-FragmentActivity, reason: not valid java name */
    /* synthetic */ void m4772lambda$init$2$androidxfragmentappFragmentActivity(android.content.Intent intent) {
        this.mFragments.noteStateNotSaved();
    }

    /* renamed from: lambda$init$3$androidx-fragment-app-FragmentActivity, reason: not valid java name */
    /* synthetic */ void m4773lambda$init$3$androidxfragmentappFragmentActivity(android.content.Context context) {
        this.mFragments.attachHost(null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, android.content.Intent intent) {
        this.mFragments.noteStateNotSaved();
        super.onActivityResult(i, i2, intent);
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.ActivityCompat.finishAfterTransition(this);
    }

    public void setEnterSharedElementCallback(androidx.core.app.SharedElementCallback sharedElementCallback) {
        androidx.core.app.ActivityCompat.setEnterSharedElementCallback(this, sharedElementCallback);
    }

    public void setExitSharedElementCallback(androidx.core.app.SharedElementCallback sharedElementCallback) {
        androidx.core.app.ActivityCompat.setExitSharedElementCallback(this, sharedElementCallback);
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.ActivityCompat.postponeEnterTransition(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.ActivityCompat.startPostponedEnterTransition(this);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_CREATE);
        this.mFragments.dispatchCreate();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public android.view.View onCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        android.view.View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    final android.view.View dispatchFragmentsOnCreateView(android.view.View view, java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return this.mFragments.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.dispatchDestroy();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.dispatchContextItemSelected(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.dispatchPause();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.noteStateNotSaved();
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.noteStateNotSaved();
        super.onResume();
        this.mResumed = true;
        this.mFragments.execPendingActions();
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_RESUME);
        this.mFragments.dispatchResume();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.noteStateNotSaved();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.dispatchActivityCreated();
        }
        this.mFragments.execPendingActions();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_START);
        this.mFragments.dispatchStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.dispatchStop();
        this.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event.ON_STOP);
    }

    @java.lang.Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    @Override // android.app.Activity
    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
            printWriter.println(" State:");
            java.lang.String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                androidx.loader.app.LoaderManager.getInstance(this).dump(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.getSupportFragmentManager().dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public androidx.fragment.app.FragmentManager getSupportFragmentManager() {
        return this.mFragments.getSupportFragmentManager();
    }

    @java.lang.Deprecated
    public androidx.loader.app.LoaderManager getSupportLoaderManager() {
        return androidx.loader.app.LoaderManager.getInstance(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        this.mFragments.noteStateNotSaved();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void startActivityFromFragment(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (android.os.Bundle) null);
    }

    public void startActivityFromFragment(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i, android.os.Bundle bundle) {
        if (i == -1) {
            androidx.core.app.ActivityCompat.startActivityForResult(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @java.lang.Deprecated
    public void startIntentSenderFromFragment(androidx.fragment.app.Fragment fragment, android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) throws android.content.IntentSender.SendIntentException {
        if (i == -1) {
            androidx.core.app.ActivityCompat.startIntentSenderForResult(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    class HostCallbacks extends androidx.fragment.app.FragmentHostCallback<androidx.fragment.app.FragmentActivity> implements androidx.core.content.OnConfigurationChangedProvider, androidx.core.content.OnTrimMemoryProvider, androidx.core.app.OnMultiWindowModeChangedProvider, androidx.core.app.OnPictureInPictureModeChangedProvider, androidx.lifecycle.ViewModelStoreOwner, androidx.activity.OnBackPressedDispatcherOwner, androidx.activity.result.ActivityResultRegistryOwner, androidx.savedstate.SavedStateRegistryOwner, androidx.fragment.app.FragmentOnAttachListener, androidx.core.view.MenuHost {
        public HostCallbacks() {
            super(androidx.fragment.app.FragmentActivity.this);
        }

        @Override // androidx.lifecycle.LifecycleOwner
        public androidx.lifecycle.Lifecycle getLifecycle() {
            return androidx.fragment.app.FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.lifecycle.ViewModelStoreOwner
        public androidx.lifecycle.ViewModelStore getViewModelStore() {
            return androidx.fragment.app.FragmentActivity.this.getViewModelStore();
        }

        @Override // androidx.activity.OnBackPressedDispatcherOwner
        public androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return androidx.fragment.app.FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public void onDump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
            androidx.fragment.app.FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public boolean onShouldSaveFragmentState(androidx.fragment.app.Fragment fragment) {
            return !androidx.fragment.app.FragmentActivity.this.isFinishing();
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public android.view.LayoutInflater onGetLayoutInflater() {
            return androidx.fragment.app.FragmentActivity.this.getLayoutInflater().cloneInContext(androidx.fragment.app.FragmentActivity.this);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.fragment.app.FragmentHostCallback
        public androidx.fragment.app.FragmentActivity onGetHost() {
            return androidx.fragment.app.FragmentActivity.this;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public void onSupportInvalidateOptionsMenu() {
            invalidateMenu();
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public boolean onShouldShowRequestPermissionRationale(java.lang.String str) {
            return androidx.core.app.ActivityCompat.shouldShowRequestPermissionRationale(androidx.fragment.app.FragmentActivity.this, str);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public boolean onHasWindowAnimations() {
            return androidx.fragment.app.FragmentActivity.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        public int onGetWindowAnimations() {
            android.view.Window window = androidx.fragment.app.FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.FragmentOnAttachListener
        public void onAttachFragment(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            androidx.fragment.app.FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        public android.view.View onFindViewById(int i) {
            return androidx.fragment.app.FragmentActivity.this.findViewById(i);
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        public boolean onHasView() {
            android.view.Window window = androidx.fragment.app.FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.result.ActivityResultRegistryOwner
        public androidx.activity.result.ActivityResultRegistry getActivityResultRegistry() {
            return androidx.fragment.app.FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // androidx.savedstate.SavedStateRegistryOwner
        public androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
            return androidx.fragment.app.FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // androidx.core.content.OnConfigurationChangedProvider
        public void addOnConfigurationChangedListener(androidx.core.util.Consumer<android.content.res.Configuration> consumer) {
            androidx.fragment.app.FragmentActivity.this.addOnConfigurationChangedListener(consumer);
        }

        @Override // androidx.core.content.OnConfigurationChangedProvider
        public void removeOnConfigurationChangedListener(androidx.core.util.Consumer<android.content.res.Configuration> consumer) {
            androidx.fragment.app.FragmentActivity.this.removeOnConfigurationChangedListener(consumer);
        }

        @Override // androidx.core.content.OnTrimMemoryProvider
        public void addOnTrimMemoryListener(androidx.core.util.Consumer<java.lang.Integer> consumer) {
            androidx.fragment.app.FragmentActivity.this.addOnTrimMemoryListener(consumer);
        }

        @Override // androidx.core.content.OnTrimMemoryProvider
        public void removeOnTrimMemoryListener(androidx.core.util.Consumer<java.lang.Integer> consumer) {
            androidx.fragment.app.FragmentActivity.this.removeOnTrimMemoryListener(consumer);
        }

        @Override // androidx.core.app.OnMultiWindowModeChangedProvider
        public void addOnMultiWindowModeChangedListener(androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> consumer) {
            androidx.fragment.app.FragmentActivity.this.addOnMultiWindowModeChangedListener(consumer);
        }

        @Override // androidx.core.app.OnMultiWindowModeChangedProvider
        public void removeOnMultiWindowModeChangedListener(androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> consumer) {
            androidx.fragment.app.FragmentActivity.this.removeOnMultiWindowModeChangedListener(consumer);
        }

        @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
        public void addOnPictureInPictureModeChangedListener(androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> consumer) {
            androidx.fragment.app.FragmentActivity.this.addOnPictureInPictureModeChangedListener(consumer);
        }

        @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
        public void removeOnPictureInPictureModeChangedListener(androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> consumer) {
            androidx.fragment.app.FragmentActivity.this.removeOnPictureInPictureModeChangedListener(consumer);
        }

        @Override // androidx.core.view.MenuHost
        public void addMenuProvider(androidx.core.view.MenuProvider menuProvider) {
            androidx.fragment.app.FragmentActivity.this.addMenuProvider(menuProvider);
        }

        @Override // androidx.core.view.MenuHost
        public void addMenuProvider(androidx.core.view.MenuProvider menuProvider, androidx.lifecycle.LifecycleOwner lifecycleOwner) {
            androidx.fragment.app.FragmentActivity.this.addMenuProvider(menuProvider, lifecycleOwner);
        }

        @Override // androidx.core.view.MenuHost
        public void addMenuProvider(androidx.core.view.MenuProvider menuProvider, androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.State state) {
            androidx.fragment.app.FragmentActivity.this.addMenuProvider(menuProvider, lifecycleOwner, state);
        }

        @Override // androidx.core.view.MenuHost
        public void removeMenuProvider(androidx.core.view.MenuProvider menuProvider) {
            androidx.fragment.app.FragmentActivity.this.removeMenuProvider(menuProvider);
        }

        @Override // androidx.core.view.MenuHost
        public void invalidateMenu() {
            androidx.fragment.app.FragmentActivity.this.invalidateMenu();
        }
    }

    void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), androidx.lifecycle.Lifecycle.State.CREATED)) {
        }
    }

    private static boolean markState(androidx.fragment.app.FragmentManager fragmentManager, androidx.lifecycle.Lifecycle.State state) {
        boolean z = false;
        for (androidx.fragment.app.Fragment fragment : fragmentManager.getFragments()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= markState(fragment.getChildFragmentManager(), state);
                }
                if (fragment.mViewLifecycleOwner != null && fragment.mViewLifecycleOwner.getLifecycle().getState().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
                    fragment.mViewLifecycleOwner.setCurrentState(state);
                    z = true;
                }
                if (fragment.mLifecycleRegistry.getState().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.setCurrentState(state);
                    z = true;
                }
            }
        }
        return z;
    }
}
