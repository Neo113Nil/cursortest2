package androidx.fragment.app;

/* loaded from: classes.dex */
public abstract class FragmentManager implements androidx.fragment.app.FragmentResultOwner {
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    public static final java.lang.String TAG = "FragmentManager";
    static boolean getHighResolutionOutputSizeshNQ4ISI = true;
    private static boolean toString = false;
    private boolean AMEXKernelCallback;
    private java.util.ArrayList<java.lang.Boolean> AMEXKernelJNI;
    private androidx.fragment.app.Fragment AMEXKernela;
    private boolean ArtificialStackFrames;
    private boolean CoroutineDebuggingKt;
    private androidx.fragment.app.FragmentManagerViewModel _CREATION;
    private boolean coroutineCreation;
    private java.util.ArrayList<androidx.fragment.app.Fragment> free;
    androidx.fragment.app.FragmentHostCallback<?> getHighSpeedVideoSizesFor;
    boolean getInputSizeshNQ4ISI;
    androidx.fragment.app.Fragment getOutputSizeshNQ4ISI;
    androidx.view.OnBackPressedDispatcher getOutputStallDurationlomOqCM;
    private androidx.fragment.app.FragmentContainer isOutputSupportedFor;
    private androidx.fragment.app.strictmode.FragmentStrictMode.Policy l;
    private boolean requestGoOnline;
    private androidx.view.result.ActivityResultLauncher<androidx.view.result.IntentSenderRequest> requestPINEntry;
    private androidx.view.result.ActivityResultLauncher<java.lang.String[]> resetTransaction;
    private java.util.ArrayList<androidx.fragment.app.BackStackRecord> sha1;
    private java.util.ArrayList<androidx.fragment.app.Fragment> unwrapAs;
    private androidx.view.result.ActivityResultLauncher<android.content.Intent> updateUI;
    final java.util.ArrayList<androidx.fragment.app.FragmentManager.OpGenerator> getOutputSizes = new java.util.ArrayList<>();
    final androidx.fragment.app.FragmentStore getInputFormats = new androidx.fragment.app.FragmentStore();
    java.util.ArrayList<androidx.fragment.app.BackStackRecord> getHighSpeedVideoFpsRanges = new java.util.ArrayList<>();
    private final androidx.fragment.app.FragmentLayoutInflaterFactory getARTIFICIAL_FRAME_PACKAGE_NAME = new androidx.fragment.app.FragmentLayoutInflaterFactory(this);
    androidx.fragment.app.BackStackRecord getOutputMinFrameDurationlomOqCM = null;
    boolean getOutputMinFrameDuration = false;
    final androidx.view.OnBackPressedCallback getOutputStallDuration = new androidx.view.OnBackPressedCallback() { // from class: androidx.fragment.app.FragmentManager.1
        @Override // androidx.view.OnBackPressedCallback
        public void handleOnBackStarted(androidx.view.BackEventCompat backEventCompat) {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
                boolean z = androidx.fragment.app.FragmentManager.getHighResolutionOutputSizeshNQ4ISI;
            }
            if (androidx.fragment.app.FragmentManager.getHighResolutionOutputSizeshNQ4ISI) {
                androidx.fragment.app.FragmentManager.this._BOUNDARY();
                androidx.fragment.app.FragmentManager fragmentManager = androidx.fragment.app.FragmentManager.this;
                fragmentManager.getHighSpeedVideoSizes((androidx.fragment.app.FragmentManager.OpGenerator) fragmentManager.new PrepareBackStackTransitionState(), false);
            }
        }

        @Override // androidx.view.OnBackPressedCallback
        public void handleOnBackProgressed(androidx.view.BackEventCompat backEventCompat) {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                boolean z = androidx.fragment.app.FragmentManager.getHighResolutionOutputSizeshNQ4ISI;
            }
            if (androidx.fragment.app.FragmentManager.this.getOutputMinFrameDurationlomOqCM != null) {
                androidx.fragment.app.FragmentManager fragmentManager = androidx.fragment.app.FragmentManager.this;
                java.util.Iterator<androidx.fragment.app.SpecialEffectsController> it = fragmentManager.Camera2StreamConfigurationMap(new java.util.ArrayList<>(java.util.Collections.singletonList(fragmentManager.getOutputMinFrameDurationlomOqCM)), 0, 1).iterator();
                while (it.hasNext()) {
                    it.next().processProgress(backEventCompat);
                }
                java.util.Iterator<androidx.fragment.app.FragmentManager.OnBackStackChangedListener> it2 = androidx.fragment.app.FragmentManager.this.getHighSpeedVideoFpsRangesFor.iterator();
                while (it2.hasNext()) {
                    it2.next().onBackStackChangeProgressed(backEventCompat);
                }
            }
        }

        @Override // androidx.view.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
                boolean z = androidx.fragment.app.FragmentManager.getHighResolutionOutputSizeshNQ4ISI;
            }
            androidx.fragment.app.FragmentManager fragmentManager = androidx.fragment.app.FragmentManager.this;
            fragmentManager.getOutputMinFrameDuration = true;
            fragmentManager.getHighResolutionOutputSizeshNQ4ISI(true);
            fragmentManager.getOutputMinFrameDuration = false;
            if (androidx.fragment.app.FragmentManager.getHighResolutionOutputSizeshNQ4ISI && fragmentManager.getOutputMinFrameDurationlomOqCM != null) {
                if (!fragmentManager.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                    java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(androidx.fragment.app.FragmentManager.getHighSpeedVideoFpsRangesFor(fragmentManager.getOutputMinFrameDurationlomOqCM));
                    java.util.Iterator<androidx.fragment.app.FragmentManager.OnBackStackChangedListener> it = fragmentManager.getHighSpeedVideoFpsRangesFor.iterator();
                    while (it.hasNext()) {
                        androidx.fragment.app.FragmentManager.OnBackStackChangedListener next = it.next();
                        java.util.Iterator it2 = linkedHashSet.iterator();
                        while (it2.hasNext()) {
                            next.onBackStackChangeCommitted((androidx.fragment.app.Fragment) it2.next(), true);
                        }
                    }
                }
                java.util.Iterator<androidx.fragment.app.FragmentTransaction.Op> it3 = fragmentManager.getOutputMinFrameDurationlomOqCM.getOutputSizeshNQ4ISI.iterator();
                while (it3.hasNext()) {
                    androidx.fragment.app.Fragment fragment = it3.next().getHighSpeedVideoFpsRanges;
                    if (fragment != null) {
                        fragment.mTransitioning = false;
                    }
                }
                java.util.Iterator<androidx.fragment.app.SpecialEffectsController> it4 = fragmentManager.Camera2StreamConfigurationMap(new java.util.ArrayList<>(java.util.Collections.singletonList(fragmentManager.getOutputMinFrameDurationlomOqCM)), 0, 1).iterator();
                while (it4.hasNext()) {
                    it4.next().completeBack();
                }
                java.util.Iterator<androidx.fragment.app.FragmentTransaction.Op> it5 = fragmentManager.getOutputMinFrameDurationlomOqCM.getOutputSizeshNQ4ISI.iterator();
                while (it5.hasNext()) {
                    androidx.fragment.app.Fragment fragment2 = it5.next().getHighSpeedVideoFpsRanges;
                    if (fragment2 != null && fragment2.mContainer == null) {
                        fragmentManager.getHighResolutionOutputSizeshNQ4ISI(fragment2).getHighSpeedVideoFpsRanges();
                    }
                }
                fragmentManager.getOutputMinFrameDurationlomOqCM = null;
                fragmentManager.getHighSpeedVideoFpsRanges();
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
                    fragmentManager.getOutputStallDuration.getIsEnabled();
                    return;
                }
                return;
            }
            if (fragmentManager.getOutputStallDuration.getIsEnabled()) {
                androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
                fragmentManager.popBackStackImmediate();
            } else {
                androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
                fragmentManager.getOutputStallDurationlomOqCM.onBackPressed();
            }
        }

        @Override // androidx.view.OnBackPressedCallback
        public void handleOnBackCancelled() {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
                boolean z = androidx.fragment.app.FragmentManager.getHighResolutionOutputSizeshNQ4ISI;
            }
            if (androidx.fragment.app.FragmentManager.getHighResolutionOutputSizeshNQ4ISI) {
                final androidx.fragment.app.FragmentManager fragmentManager = androidx.fragment.app.FragmentManager.this;
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
                    androidx.fragment.app.BackStackRecord backStackRecord = fragmentManager.getOutputMinFrameDurationlomOqCM;
                }
                androidx.fragment.app.BackStackRecord backStackRecord2 = fragmentManager.getOutputMinFrameDurationlomOqCM;
                if (backStackRecord2 != null) {
                    backStackRecord2.getHighSpeedVideoFpsRangesFor = false;
                    fragmentManager.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRanges();
                    fragmentManager.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRangesFor(true, new java.lang.Runnable() { // from class: androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda5
                        @Override // java.lang.Runnable
                        public final void run() {
                            java.util.Iterator<androidx.fragment.app.FragmentManager.OnBackStackChangedListener> it = androidx.fragment.app.FragmentManager.this.getHighSpeedVideoFpsRangesFor.iterator();
                            while (it.hasNext()) {
                                it.next().onBackStackChangeCancelled();
                            }
                        }
                    });
                    fragmentManager.getOutputMinFrameDurationlomOqCM.commit();
                    fragmentManager.getOutputMinFrameDuration = true;
                    fragmentManager.executePendingTransactions();
                    fragmentManager.getOutputMinFrameDuration = false;
                    fragmentManager.getOutputMinFrameDurationlomOqCM = null;
                }
            }
        }
    };
    final java.util.concurrent.atomic.AtomicInteger Camera2StreamConfigurationMap = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.Map<java.lang.String, androidx.fragment.app.BackStackState> getValidOutputFormatsForInputhNQ4ISI = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private final java.util.Map<java.lang.String, android.os.Bundle> exchange = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private final java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager.LifecycleAwareResultListener> startTransaction = java.util.Collections.synchronizedMap(new java.util.HashMap());
    java.util.ArrayList<androidx.fragment.app.FragmentManager.OnBackStackChangedListener> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList<>();

    /* renamed from: a, reason: collision with root package name */
    private final androidx.fragment.app.FragmentLifecycleCallbacksDispatcher f2737a = new androidx.fragment.app.FragmentLifecycleCallbacksDispatcher(this);
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> AMEXKernel = new java.util.concurrent.CopyOnWriteArrayList<>();
    private final androidx.core.util.Consumer<android.content.res.Configuration> d = new androidx.core.util.Consumer() { // from class: androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda0
        @Override // androidx.core.util.Consumer
        public final void accept(java.lang.Object obj) {
            androidx.fragment.app.FragmentManager fragmentManager = androidx.fragment.app.FragmentManager.this;
            android.content.res.Configuration configuration = (android.content.res.Configuration) obj;
            if (fragmentManager.Camera2StreamConfigurationMap()) {
                fragmentManager.getHighSpeedVideoSizes(configuration, false);
            }
        }
    };
    private final androidx.core.util.Consumer<java.lang.Integer> kernelVersion = new androidx.core.util.Consumer() { // from class: androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda1
        @Override // androidx.core.util.Consumer
        public final void accept(java.lang.Object obj) {
            androidx.fragment.app.FragmentManager fragmentManager = androidx.fragment.app.FragmentManager.this;
            java.lang.Integer num = (java.lang.Integer) obj;
            if (fragmentManager.Camera2StreamConfigurationMap() && num.intValue() == 80) {
                fragmentManager.getHighSpeedVideoFpsRangesFor(false);
            }
        }
    };
    private final androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> init = new androidx.core.util.Consumer() { // from class: androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda2
        @Override // androidx.core.util.Consumer
        public final void accept(java.lang.Object obj) {
            androidx.fragment.app.FragmentManager fragmentManager = androidx.fragment.app.FragmentManager.this;
            androidx.core.app.MultiWindowModeChangedInfo multiWindowModeChangedInfo = (androidx.core.app.MultiWindowModeChangedInfo) obj;
            if (fragmentManager.Camera2StreamConfigurationMap()) {
                fragmentManager.getHighSpeedVideoFpsRanges(multiWindowModeChangedInfo.getIsInMultiWindowMode(), false);
            }
        }
    };
    private final androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> c = new androidx.core.util.Consumer() { // from class: androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda3
        @Override // androidx.core.util.Consumer
        public final void accept(java.lang.Object obj) {
            androidx.fragment.app.FragmentManager fragmentManager = androidx.fragment.app.FragmentManager.this;
            androidx.core.app.PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo = (androidx.core.app.PictureInPictureModeChangedInfo) obj;
            if (fragmentManager.Camera2StreamConfigurationMap()) {
                fragmentManager.getHighResolutionOutputSizeshNQ4ISI(pictureInPictureModeChangedInfo.getIsInPictureInPictureMode(), false);
            }
        }
    };
    private final androidx.core.view.MenuProvider b = new androidx.core.view.MenuProvider() { // from class: androidx.fragment.app.FragmentManager.2
        @Override // androidx.core.view.MenuProvider
        public void onPrepareMenu(android.view.Menu menu) {
            androidx.fragment.app.FragmentManager.this.getHighSpeedVideoFpsRangesFor(menu);
        }

        @Override // androidx.core.view.MenuProvider
        public void onCreateMenu(android.view.Menu menu, android.view.MenuInflater menuInflater) {
            androidx.fragment.app.FragmentManager.this.getHighSpeedVideoFpsRanges(menu, menuInflater);
        }

        @Override // androidx.core.view.MenuProvider
        public boolean onMenuItemSelected(android.view.MenuItem menuItem) {
            return androidx.fragment.app.FragmentManager.this.Camera2StreamConfigurationMap(menuItem);
        }

        @Override // androidx.core.view.MenuProvider
        public void onMenuClosed(android.view.Menu menu) {
            androidx.fragment.app.FragmentManager.this.Camera2StreamConfigurationMap(menu);
        }
    };
    int getHighSpeedVideoSizes = -1;
    private androidx.fragment.app.FragmentFactory coroutineBoundary = null;
    private androidx.fragment.app.FragmentFactory _BOUNDARY = new androidx.fragment.app.FragmentFactory() { // from class: androidx.fragment.app.FragmentManager.3
        @Override // androidx.fragment.app.FragmentFactory
        public androidx.fragment.app.Fragment instantiate(java.lang.ClassLoader classLoader, java.lang.String str) {
            return androidx.fragment.app.FragmentManager.this.getHost().instantiate(androidx.fragment.app.FragmentManager.this.getHost().getContext(), str, null);
        }
    };
    private androidx.fragment.app.SpecialEffectsControllerFactory release = null;
    private androidx.fragment.app.SpecialEffectsControllerFactory isOutputSupportedForhNQ4ISI = new androidx.fragment.app.SpecialEffectsControllerFactory() { // from class: androidx.fragment.app.FragmentManager.4
        @Override // androidx.fragment.app.SpecialEffectsControllerFactory
        public final androidx.fragment.app.SpecialEffectsController getHighSpeedVideoFpsRanges(android.view.ViewGroup viewGroup) {
            return new androidx.fragment.app.DefaultSpecialEffectsController(viewGroup);
        }
    };
    java.util.ArrayDeque<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> getOutputFormats = new java.util.ArrayDeque<>();
    private java.lang.Runnable accessartificialFrame = new java.lang.Runnable() { // from class: androidx.fragment.app.FragmentManager.5
        @Override // java.lang.Runnable
        public void run() {
            androidx.fragment.app.FragmentManager.this.getHighResolutionOutputSizeshNQ4ISI(true);
        }
    };

    /* loaded from: classes3.dex */
    public interface BackStackEntry {
        @java.lang.Deprecated
        java.lang.CharSequence getBreadCrumbShortTitle();

        @java.lang.Deprecated
        int getBreadCrumbShortTitleRes();

        @java.lang.Deprecated
        java.lang.CharSequence getBreadCrumbTitle();

        @java.lang.Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        java.lang.String getName();
    }

    /* loaded from: classes3.dex */
    public static abstract class FragmentLifecycleCallbacks {
        @java.lang.Deprecated
        public void onFragmentActivityCreated(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.os.Bundle bundle) {
        }

        public void onFragmentAttached(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.content.Context context) {
        }

        public void onFragmentCreated(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.os.Bundle bundle) {
        }

        public void onFragmentDestroyed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        }

        public void onFragmentDetached(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        }

        public void onFragmentPaused(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        }

        public void onFragmentPreAttached(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.content.Context context) {
        }

        public void onFragmentPreCreated(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.os.Bundle bundle) {
        }

        public void onFragmentResumed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.os.Bundle bundle) {
        }

        public void onFragmentStarted(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        }

        public void onFragmentStopped(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        }

        public void onFragmentViewCreated(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.view.View view, android.os.Bundle bundle) {
        }

        public void onFragmentViewDestroyed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        }
    }

    public interface OnBackStackChangedListener {
        default void onBackStackChangeCancelled() {
        }

        default void onBackStackChangeCommitted(androidx.fragment.app.Fragment fragment, boolean z) {
        }

        default void onBackStackChangeProgressed(androidx.view.BackEventCompat backEventCompat) {
        }

        default void onBackStackChangeStarted(androidx.fragment.app.Fragment fragment, boolean z) {
        }

        void onBackStackChanged();
    }

    /* loaded from: classes3.dex */
    interface OpGenerator {
        boolean getHighSpeedVideoFpsRanges(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2);
    }

    public static void enablePredictiveBack(boolean z) {
        getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @java.lang.Deprecated
    public static void enableDebugLogging(boolean z) {
        toString = z;
    }

    public static boolean isLoggingEnabled(int i) {
        return toString || android.util.Log.isLoggable(TAG, i);
    }

    /* loaded from: classes7.dex */
    static class LifecycleAwareResultListener implements androidx.fragment.app.FragmentResultListener {
        final androidx.view.Lifecycle Camera2StreamConfigurationMap;
        private final androidx.fragment.app.FragmentResultListener getHighSpeedVideoFpsRangesFor;
        final androidx.view.LifecycleEventObserver getHighSpeedVideoSizes;

        LifecycleAwareResultListener(androidx.view.Lifecycle lifecycle, androidx.fragment.app.FragmentResultListener fragmentResultListener, androidx.view.LifecycleEventObserver lifecycleEventObserver) {
            this.Camera2StreamConfigurationMap = lifecycle;
            this.getHighSpeedVideoFpsRangesFor = fragmentResultListener;
            this.getHighSpeedVideoSizes = lifecycleEventObserver;
        }

        @Override // androidx.fragment.app.FragmentResultListener
        public void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
            this.getHighSpeedVideoFpsRangesFor.onFragmentResult(str, bundle);
        }
    }

    final void getHighSpeedVideoFpsRangesFor(java.lang.RuntimeException runtimeException) {
        runtimeException.getMessage();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(new androidx.fragment.app.LogWriter(TAG));
        androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback = this.getHighSpeedVideoSizesFor;
        try {
            if (fragmentHostCallback != null) {
                fragmentHostCallback.onDump("  ", null, printWriter, new java.lang.String[0]);
            } else {
                dump("  ", null, printWriter, new java.lang.String[0]);
            }
            throw runtimeException;
        } catch (java.lang.Exception unused) {
            throw runtimeException;
        }
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction openTransaction() {
        return beginTransaction();
    }

    public androidx.fragment.app.FragmentTransaction beginTransaction() {
        return new androidx.fragment.app.BackStackRecord(this);
    }

    public boolean executePendingTransactions() {
        boolean highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(true);
        b();
        return highResolutionOutputSizeshNQ4ISI;
    }

    final void getHighSpeedVideoFpsRanges() {
        synchronized (this.getOutputSizes) {
            if (!this.getOutputSizes.isEmpty()) {
                this.getOutputStallDuration.setEnabled(true);
                isLoggingEnabled(3);
            } else {
                boolean z = getBackStackEntryCount() > 0 && getOutputMinFrameDurationlomOqCM(this.AMEXKernela);
                isLoggingEnabled(3);
                this.getOutputStallDuration.setEnabled(z);
            }
        }
    }

    final boolean getOutputMinFrameDurationlomOqCM(androidx.fragment.app.Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        androidx.fragment.app.FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.getPrimaryNavigationFragment()) && getOutputMinFrameDurationlomOqCM(fragmentManager.AMEXKernela);
    }

    final boolean getOutputStallDuration(androidx.fragment.app.Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    final boolean getInputFormats(androidx.fragment.app.Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.isHidden();
    }

    public void restoreBackStack(java.lang.String str) {
        getHighSpeedVideoSizes((androidx.fragment.app.FragmentManager.OpGenerator) new androidx.fragment.app.FragmentManager.RestoreBackStackState(str), false);
    }

    public void saveBackStack(java.lang.String str) {
        getHighSpeedVideoSizes((androidx.fragment.app.FragmentManager.OpGenerator) new androidx.fragment.app.FragmentManager.SaveBackStackState(str), false);
    }

    public void clearBackStack(java.lang.String str) {
        getHighSpeedVideoSizes((androidx.fragment.app.FragmentManager.OpGenerator) new androidx.fragment.app.FragmentManager.ClearBackStackState(str), false);
    }

    public void popBackStack() {
        getHighSpeedVideoSizes((androidx.fragment.app.FragmentManager.OpGenerator) new androidx.fragment.app.FragmentManager.PopBackStackState(null, -1, 0), false);
    }

    public boolean popBackStackImmediate() {
        return getHighSpeedVideoFpsRangesFor((java.lang.String) null, -1, 0);
    }

    public void popBackStack(java.lang.String str, int i) {
        getHighSpeedVideoSizes((androidx.fragment.app.FragmentManager.OpGenerator) new androidx.fragment.app.FragmentManager.PopBackStackState(str, -1, i), false);
    }

    public boolean popBackStackImmediate(java.lang.String str, int i) {
        return getHighSpeedVideoFpsRangesFor(str, -1, i);
    }

    public void popBackStack(int i, int i2) {
        getHighSpeedVideoFpsRanges(i, i2, false);
    }

    final void getHighSpeedVideoFpsRanges(int i, int i2, boolean z) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Bad id: ".concat(java.lang.String.valueOf(i)));
        }
        getHighSpeedVideoSizes(new androidx.fragment.app.FragmentManager.PopBackStackState(null, i, i2), z);
    }

    public boolean popBackStackImmediate(int i, int i2) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Bad id: ".concat(java.lang.String.valueOf(i)));
        }
        return getHighSpeedVideoFpsRangesFor((java.lang.String) null, i, i2);
    }

    private boolean getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(false);
        Camera2StreamConfigurationMap(true);
        androidx.fragment.app.Fragment fragment = this.getOutputSizeshNQ4ISI;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
            return true;
        }
        boolean Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.sha1, this.AMEXKernelJNI, str, i, i2);
        if (Camera2StreamConfigurationMap) {
            this.ArtificialStackFrames = true;
            try {
                getHighSpeedVideoSizes(this.sha1, this.AMEXKernelJNI);
            } finally {
                accessartificialFrame();
            }
        }
        getHighSpeedVideoFpsRanges();
        _CREATION();
        this.getInputFormats.Camera2StreamConfigurationMap();
        return Camera2StreamConfigurationMap;
    }

    public int getBackStackEntryCount() {
        return this.getHighSpeedVideoFpsRanges.size() + (this.getOutputMinFrameDurationlomOqCM != null ? 1 : 0);
    }

    public androidx.fragment.app.FragmentManager.BackStackEntry getBackStackEntryAt(int i) {
        if (i == this.getHighSpeedVideoFpsRanges.size()) {
            androidx.fragment.app.BackStackRecord backStackRecord = this.getOutputMinFrameDurationlomOqCM;
            if (backStackRecord != null) {
                return backStackRecord;
            }
            throw new java.lang.IndexOutOfBoundsException();
        }
        return this.getHighSpeedVideoFpsRanges.get(i);
    }

    public void addOnBackStackChangedListener(androidx.fragment.app.FragmentManager.OnBackStackChangedListener onBackStackChangedListener) {
        this.getHighSpeedVideoFpsRangesFor.add(onBackStackChangedListener);
    }

    public void removeOnBackStackChangedListener(androidx.fragment.app.FragmentManager.OnBackStackChangedListener onBackStackChangedListener) {
        this.getHighSpeedVideoFpsRangesFor.remove(onBackStackChangedListener);
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResult(java.lang.String str, android.os.Bundle bundle) {
        androidx.fragment.app.FragmentManager.LifecycleAwareResultListener lifecycleAwareResultListener = this.startTransaction.get(str);
        if (lifecycleAwareResultListener != null) {
            if (lifecycleAwareResultListener.Camera2StreamConfigurationMap.getCamera2StreamConfigurationMap().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
                lifecycleAwareResultListener.onFragmentResult(str, bundle);
                isLoggingEnabled(2);
            }
        }
        this.exchange.put(str, bundle);
        isLoggingEnabled(2);
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResult(java.lang.String str) {
        this.exchange.remove(str);
        isLoggingEnabled(2);
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResultListener(final java.lang.String str, androidx.view.LifecycleOwner lifecycleOwner, final androidx.fragment.app.FragmentResultListener fragmentResultListener) {
        final androidx.view.Lifecycle lifecycleRegistry = lifecycleOwner.getLifecycleRegistry();
        if (lifecycleRegistry.getCamera2StreamConfigurationMap() == androidx.lifecycle.Lifecycle.State.DESTROYED) {
            return;
        }
        androidx.view.LifecycleEventObserver lifecycleEventObserver = new androidx.view.LifecycleEventObserver() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.view.LifecycleEventObserver
            public void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner2, androidx.lifecycle.Lifecycle.Event event) {
                android.os.Bundle bundle;
                if (event == androidx.lifecycle.Lifecycle.Event.ON_START && (bundle = (android.os.Bundle) androidx.fragment.app.FragmentManager.this.exchange.get(str)) != null) {
                    fragmentResultListener.onFragmentResult(str, bundle);
                    androidx.fragment.app.FragmentManager.this.clearFragmentResult(str);
                }
                if (event == androidx.lifecycle.Lifecycle.Event.ON_DESTROY) {
                    lifecycleRegistry.removeObserver(this);
                    androidx.fragment.app.FragmentManager.this.startTransaction.remove(str);
                }
            }
        };
        androidx.fragment.app.FragmentManager.LifecycleAwareResultListener put = this.startTransaction.put(str, new androidx.fragment.app.FragmentManager.LifecycleAwareResultListener(lifecycleRegistry, fragmentResultListener, lifecycleEventObserver));
        if (put != null) {
            put.Camera2StreamConfigurationMap.removeObserver(put.getHighSpeedVideoSizes);
        }
        isLoggingEnabled(2);
        lifecycleRegistry.addObserver(lifecycleEventObserver);
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResultListener(java.lang.String str) {
        androidx.fragment.app.FragmentManager.LifecycleAwareResultListener remove = this.startTransaction.remove(str);
        if (remove != null) {
            remove.Camera2StreamConfigurationMap.removeObserver(remove.getHighSpeedVideoSizes);
        }
        isLoggingEnabled(2);
    }

    public void putFragment(android.os.Bundle bundle, java.lang.String str, androidx.fragment.app.Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            getHighSpeedVideoFpsRangesFor(new java.lang.IllegalStateException(sb.toString()));
        }
        bundle.putString(str, fragment.mWho);
    }

    public androidx.fragment.app.Fragment getFragment(android.os.Bundle bundle, java.lang.String str) {
        java.lang.String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        androidx.fragment.app.Fragment highSpeedVideoSizes = getHighSpeedVideoSizes(string);
        if (highSpeedVideoSizes == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Fragment no longer exists for key ");
            sb.append(str);
            sb.append(": unique id ");
            sb.append(string);
            getHighSpeedVideoFpsRangesFor(new java.lang.IllegalStateException(sb.toString()));
        }
        return highSpeedVideoSizes;
    }

    public static <F extends androidx.fragment.app.Fragment> F findFragment(android.view.View view) {
        F f = (F) getHighSpeedVideoFpsRangesFor(view);
        if (f != null) {
            return f;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("View ");
        sb.append(view);
        sb.append(" does not have a Fragment set");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    static androidx.fragment.app.Fragment getHighSpeedVideoFpsRangesFor(android.view.View view) {
        while (view != null) {
            androidx.fragment.app.Fragment highSpeedVideoSizes = getHighSpeedVideoSizes(view);
            if (highSpeedVideoSizes != null) {
                return highSpeedVideoSizes;
            }
            java.lang.Object parent = view.getParent();
            view = parent instanceof android.view.View ? (android.view.View) parent : null;
        }
        return null;
    }

    static androidx.fragment.app.Fragment getHighSpeedVideoSizes(android.view.View view) {
        java.lang.Object tag = view.getTag(androidx.fragment.R.id.fragment_container_view_tag);
        if (tag instanceof androidx.fragment.app.Fragment) {
            return (androidx.fragment.app.Fragment) tag;
        }
        return null;
    }

    public final void onContainerAvailable(androidx.fragment.app.FragmentContainerView fragmentContainerView) {
        for (androidx.fragment.app.FragmentStateManager fragmentStateManager : this.getInputFormats.getHighSpeedVideoFpsRanges()) {
            androidx.fragment.app.Fragment Camera2StreamConfigurationMap = fragmentStateManager.Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap.mContainerId == fragmentContainerView.getId() && Camera2StreamConfigurationMap.mView != null && Camera2StreamConfigurationMap.mView.getParent() == null) {
                Camera2StreamConfigurationMap.mContainer = fragmentContainerView;
                fragmentStateManager.getHighSpeedVideoSizes();
                fragmentStateManager.getHighSpeedVideoFpsRanges();
            }
        }
    }

    public static androidx.fragment.app.FragmentManager findFragmentManager(android.view.View view) {
        androidx.fragment.app.FragmentActivity fragmentActivity;
        androidx.fragment.app.Fragment highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(view);
        if (highSpeedVideoFpsRangesFor != null) {
            if (!highSpeedVideoFpsRangesFor.isAdded()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The Fragment ");
                sb.append(highSpeedVideoFpsRangesFor);
                sb.append(" that owns View ");
                sb.append(view);
                sb.append(" has already been destroyed. Nested fragments should always use the child FragmentManager.");
                throw new java.lang.IllegalStateException(sb.toString());
            }
            return highSpeedVideoFpsRangesFor.getChildFragmentManager();
        }
        android.content.Context context = view.getContext();
        while (true) {
            if (!(context instanceof android.content.ContextWrapper)) {
                fragmentActivity = null;
                break;
            }
            if (context instanceof androidx.fragment.app.FragmentActivity) {
                fragmentActivity = (androidx.fragment.app.FragmentActivity) context;
                break;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("View ");
        sb2.append(view);
        sb2.append(" is not within a subclass of FragmentActivity.");
        throw new java.lang.IllegalStateException(sb2.toString());
    }

    public java.util.List<androidx.fragment.app.Fragment> getFragments() {
        return this.getInputFormats.getHighSpeedVideoFpsRangesFor();
    }

    final androidx.view.ViewModelStore getInputSizeshNQ4ISI(androidx.fragment.app.Fragment fragment) {
        return this._CREATION.getHighSpeedVideoSizes(fragment);
    }

    private androidx.fragment.app.FragmentManagerViewModel toString(androidx.fragment.app.Fragment fragment) {
        return this._CREATION.getHighResolutionOutputSizeshNQ4ISI(fragment);
    }

    final void getHighSpeedVideoFpsRanges(androidx.fragment.app.Fragment fragment) {
        this._CREATION.Camera2StreamConfigurationMap(fragment);
    }

    final void getOutputSizeshNQ4ISI(androidx.fragment.app.Fragment fragment) {
        this._CREATION.getHighSpeedVideoFpsRanges(fragment);
    }

    public androidx.fragment.app.Fragment.SavedState saveFragmentInstanceState(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.FragmentStateManager highSpeedVideoSizes = this.getInputFormats.getHighSpeedVideoSizes(fragment.mWho);
        if (highSpeedVideoSizes == null || !highSpeedVideoSizes.Camera2StreamConfigurationMap().equals(fragment)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            getHighSpeedVideoFpsRangesFor(new java.lang.IllegalStateException(sb.toString()));
        }
        if (highSpeedVideoSizes.getHighSpeedVideoSizes.mState >= 0) {
            return new androidx.fragment.app.Fragment.SavedState(highSpeedVideoSizes.getHighSpeedVideoFpsRangesFor());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a() {
        boolean z;
        java.util.Iterator<androidx.fragment.app.BackStackState> it;
        androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback = this.getHighSpeedVideoSizesFor;
        if (fragmentHostCallback instanceof androidx.view.ViewModelStoreOwner) {
            z = this.getInputFormats.getHighSpeedVideoSizes().getHighSpeedVideoFpsRangesFor();
        } else {
            if (fragmentHostCallback.getContext() instanceof android.app.Activity) {
                z = !((android.app.Activity) this.getHighSpeedVideoSizesFor.getContext()).isChangingConfigurations();
            }
            it = this.getValidOutputFormatsForInputhNQ4ISI.values().iterator();
            while (it.hasNext()) {
                for (java.lang.String str : it.next().getHighSpeedVideoFpsRangesFor) {
                    androidx.fragment.app.FragmentManagerViewModel highSpeedVideoSizes = this.getInputFormats.getHighSpeedVideoSizes();
                    isLoggingEnabled(3);
                    highSpeedVideoSizes.getHighSpeedVideoFpsRanges(str, false);
                }
            }
        }
        if (!z) {
            return;
        }
        it = this.getValidOutputFormatsForInputhNQ4ISI.values().iterator();
        while (it.hasNext()) {
        }
    }

    public boolean isDestroyed() {
        return this.CoroutineDebuggingKt;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" in ");
        androidx.fragment.app.Fragment fragment = this.AMEXKernela;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this.AMEXKernela)));
            sb.append("}");
        } else {
            androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback = this.getHighSpeedVideoSizesFor;
            if (fragmentHostCallback != null) {
                sb.append(fragmentHostCallback.getClass().getSimpleName());
                sb.append("{");
                sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this.getHighSpeedVideoSizesFor)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        int size;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("    ");
        java.lang.String obj = sb.toString();
        androidx.fragment.app.FragmentStore fragmentStore = this.getInputFormats;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append("    ");
        java.lang.String obj2 = sb2.toString();
        if (!fragmentStore.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (androidx.fragment.app.FragmentStateManager fragmentStateManager : fragmentStore.getHighResolutionOutputSizeshNQ4ISI.values()) {
                printWriter.print(str);
                if (fragmentStateManager != null) {
                    androidx.fragment.app.Fragment Camera2StreamConfigurationMap = fragmentStateManager.Camera2StreamConfigurationMap();
                    printWriter.println(Camera2StreamConfigurationMap);
                    Camera2StreamConfigurationMap.dump(obj2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = fragmentStore.getHighSpeedVideoFpsRangesFor.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                androidx.fragment.app.Fragment fragment = fragmentStore.getHighSpeedVideoFpsRangesFor.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        java.util.ArrayList<androidx.fragment.app.Fragment> arrayList = this.unwrapAs;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                androidx.fragment.app.Fragment fragment2 = this.unwrapAs.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        int size3 = this.getHighSpeedVideoFpsRanges.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                androidx.fragment.app.BackStackRecord backStackRecord = this.getHighSpeedVideoFpsRanges.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(backStackRecord.toString());
                backStackRecord.getHighSpeedVideoFpsRanges(obj, printWriter, true);
            }
        }
        printWriter.print(str);
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Back Stack Index: ");
        sb3.append(this.Camera2StreamConfigurationMap.get());
        printWriter.println(sb3.toString());
        synchronized (this.getOutputSizes) {
            int size4 = this.getOutputSizes.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    java.lang.Object obj3 = (androidx.fragment.app.FragmentManager.OpGenerator) this.getOutputSizes.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj3);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.getHighSpeedVideoSizesFor);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.isOutputSupportedFor);
        if (this.AMEXKernela != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.AMEXKernela);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.getHighSpeedVideoSizes);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.AMEXKernelCallback);
        printWriter.print(" mStopped=");
        printWriter.print(this.requestGoOnline);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.CoroutineDebuggingKt);
        if (this.getInputSizeshNQ4ISI) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.getInputSizeshNQ4ISI);
        }
    }

    final void getHighSpeedVideoFpsRanges(androidx.fragment.app.FragmentStateManager fragmentStateManager) {
        androidx.fragment.app.Fragment Camera2StreamConfigurationMap = fragmentStateManager.Camera2StreamConfigurationMap();
        if (Camera2StreamConfigurationMap.mDeferStart) {
            if (this.ArtificialStackFrames) {
                this.coroutineCreation = true;
            } else {
                Camera2StreamConfigurationMap.mDeferStart = false;
                fragmentStateManager.getHighSpeedVideoFpsRanges();
            }
        }
    }

    final boolean getHighResolutionOutputSizeshNQ4ISI(int i) {
        return this.getHighSpeedVideoSizes > 0;
    }

    final void getHighSpeedVideoFpsRangesFor(androidx.fragment.app.Fragment fragment, boolean z) {
        android.view.ViewGroup validOutputFormatsForInputhNQ4ISI = getValidOutputFormatsForInputhNQ4ISI(fragment);
        if (validOutputFormatsForInputhNQ4ISI == null || !(validOutputFormatsForInputhNQ4ISI instanceof androidx.fragment.app.FragmentContainerView)) {
            return;
        }
        ((androidx.fragment.app.FragmentContainerView) validOutputFormatsForInputhNQ4ISI).setDrawDisappearingViewsLast(!z);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(int i, boolean z) {
        androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback;
        if (this.getHighSpeedVideoSizesFor == null && i != -1) {
            throw new java.lang.IllegalStateException("No activity");
        }
        if (z || i != this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoSizes = i;
            this.getInputFormats.getOutputMinFrameDuration();
            d();
            if (this.getInputSizeshNQ4ISI && (fragmentHostCallback = this.getHighSpeedVideoSizesFor) != null && this.getHighSpeedVideoSizes == 7) {
                fragmentHostCallback.onSupportInvalidateOptionsMenu();
                this.getInputSizeshNQ4ISI = false;
            }
        }
    }

    private void d() {
        java.util.Iterator<androidx.fragment.app.FragmentStateManager> it = this.getInputFormats.getHighSpeedVideoFpsRanges().iterator();
        while (it.hasNext()) {
            getHighSpeedVideoFpsRanges(it.next());
        }
    }

    final androidx.fragment.app.FragmentStateManager getHighResolutionOutputSizeshNQ4ISI(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.FragmentStateManager highSpeedVideoSizes = this.getInputFormats.getHighSpeedVideoSizes(fragment.mWho);
        if (highSpeedVideoSizes != null) {
            return highSpeedVideoSizes;
        }
        androidx.fragment.app.FragmentStateManager fragmentStateManager = new androidx.fragment.app.FragmentStateManager(this.f2737a, this.getInputFormats, fragment);
        fragmentStateManager.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor.getContext().getClassLoader());
        fragmentStateManager.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes);
        return fragmentStateManager;
    }

    final androidx.fragment.app.FragmentStateManager getHighSpeedVideoFpsRangesFor(androidx.fragment.app.Fragment fragment) {
        if (fragment.mPreviousWho != null) {
            androidx.fragment.app.strictmode.FragmentStrictMode.onFragmentReuse(fragment, fragment.mPreviousWho);
        }
        isLoggingEnabled(2);
        androidx.fragment.app.FragmentStateManager highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(fragment);
        fragment.mFragmentManager = this;
        this.getInputFormats.Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI);
        if (!fragment.mDetached) {
            this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (getHighSpeedVideoSizes(fragment)) {
                this.getInputSizeshNQ4ISI = true;
            }
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    final void getOutputStallDurationlomOqCM(androidx.fragment.app.Fragment fragment) {
        if (isLoggingEnabled(2)) {
            int i = fragment.mBackStackNesting;
        }
        boolean isInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && isInBackStack) {
            return;
        }
        androidx.fragment.app.FragmentStore fragmentStore = this.getInputFormats;
        synchronized (fragmentStore.getHighSpeedVideoFpsRangesFor) {
            fragmentStore.getHighSpeedVideoFpsRangesFor.remove(fragment);
        }
        fragment.mAdded = false;
        if (getHighSpeedVideoSizes(fragment)) {
            this.getInputSizeshNQ4ISI = true;
        }
        fragment.mRemoving = true;
        unwrapAs(fragment);
    }

    final void getOutputMinFrameDuration(androidx.fragment.app.Fragment fragment) {
        isLoggingEnabled(2);
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        unwrapAs(fragment);
    }

    static void isOutputSupportedForhNQ4ISI(androidx.fragment.app.Fragment fragment) {
        isLoggingEnabled(2);
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    final void getOutputFormats(androidx.fragment.app.Fragment fragment) {
        isLoggingEnabled(2);
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            isLoggingEnabled(2);
            androidx.fragment.app.FragmentStore fragmentStore = this.getInputFormats;
            synchronized (fragmentStore.getHighSpeedVideoFpsRangesFor) {
                fragmentStore.getHighSpeedVideoFpsRangesFor.remove(fragment);
            }
            fragment.mAdded = false;
            if (getHighSpeedVideoSizes(fragment)) {
                this.getInputSizeshNQ4ISI = true;
            }
            unwrapAs(fragment);
        }
    }

    final void Camera2StreamConfigurationMap(androidx.fragment.app.Fragment fragment) {
        isLoggingEnabled(2);
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(fragment);
            isLoggingEnabled(2);
            if (getHighSpeedVideoSizes(fragment)) {
                this.getInputSizeshNQ4ISI = true;
            }
        }
    }

    public androidx.fragment.app.Fragment findFragmentById(int i) {
        return this.getInputFormats.getHighSpeedVideoSizes(i);
    }

    public androidx.fragment.app.Fragment findFragmentByTag(java.lang.String str) {
        androidx.fragment.app.FragmentStore fragmentStore = this.getInputFormats;
        if (str != null) {
            for (int size = fragmentStore.getHighSpeedVideoFpsRangesFor.size() - 1; size >= 0; size--) {
                androidx.fragment.app.Fragment fragment = fragmentStore.getHighSpeedVideoFpsRangesFor.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (androidx.fragment.app.FragmentStateManager fragmentStateManager : fragmentStore.getHighResolutionOutputSizeshNQ4ISI.values()) {
            if (fragmentStateManager != null) {
                androidx.fragment.app.Fragment Camera2StreamConfigurationMap = fragmentStateManager.Camera2StreamConfigurationMap();
                if (str.equals(Camera2StreamConfigurationMap.mTag)) {
                    return Camera2StreamConfigurationMap;
                }
            }
        }
        return null;
    }

    final androidx.fragment.app.Fragment getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        return this.getInputFormats.getHighSpeedVideoFpsRanges(str);
    }

    final androidx.fragment.app.Fragment getHighSpeedVideoSizes(java.lang.String str) {
        return this.getInputFormats.getHighSpeedVideoFpsRangesFor(str);
    }

    private void coroutineBoundary() {
        if (isStateSaved()) {
            throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public boolean isStateSaved() {
        return this.AMEXKernelCallback || this.requestGoOnline;
    }

    final void getHighSpeedVideoSizes(androidx.fragment.app.FragmentManager.OpGenerator opGenerator, boolean z) {
        if (!z) {
            if (this.getHighSpeedVideoSizesFor == null) {
                if (this.CoroutineDebuggingKt) {
                    throw new java.lang.IllegalStateException("FragmentManager has been destroyed");
                }
                throw new java.lang.IllegalStateException("FragmentManager has not been attached to a host.");
            }
            coroutineBoundary();
        }
        synchronized (this.getOutputSizes) {
            if (this.getHighSpeedVideoSizesFor == null) {
                if (!z) {
                    throw new java.lang.IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.getOutputSizes.add(opGenerator);
                init();
            }
        }
    }

    private void init() {
        synchronized (this.getOutputSizes) {
            if (this.getOutputSizes.size() == 1) {
                this.getHighSpeedVideoSizesFor.getHandler().removeCallbacks(this.accessartificialFrame);
                this.getHighSpeedVideoSizesFor.getHandler().post(this.accessartificialFrame);
                getHighSpeedVideoFpsRanges();
            }
        }
    }

    private void Camera2StreamConfigurationMap(boolean z) {
        if (this.ArtificialStackFrames) {
            throw new java.lang.IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.getHighSpeedVideoSizesFor == null) {
            if (this.CoroutineDebuggingKt) {
                throw new java.lang.IllegalStateException("FragmentManager has been destroyed");
            }
            throw new java.lang.IllegalStateException("FragmentManager has not been attached to a host.");
        }
        if (android.os.Looper.myLooper() != this.getHighSpeedVideoSizesFor.getHandler().getLooper()) {
            throw new java.lang.IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            coroutineBoundary();
        }
        if (this.sha1 == null) {
            this.sha1 = new java.util.ArrayList<>();
            this.AMEXKernelJNI = new java.util.ArrayList<>();
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI(androidx.fragment.app.FragmentManager.OpGenerator opGenerator, boolean z) {
        if (z && (this.getHighSpeedVideoSizesFor == null || this.CoroutineDebuggingKt)) {
            return;
        }
        Camera2StreamConfigurationMap(z);
        androidx.fragment.app.BackStackRecord backStackRecord = this.getOutputMinFrameDurationlomOqCM;
        boolean z2 = false;
        if (backStackRecord != null) {
            backStackRecord.getHighSpeedVideoFpsRangesFor = false;
            this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRanges();
            isLoggingEnabled(3);
            this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoSizes(false, false);
            boolean highSpeedVideoFpsRanges = this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRanges(this.sha1, this.AMEXKernelJNI);
            java.util.Iterator<androidx.fragment.app.FragmentTransaction.Op> it = this.getOutputMinFrameDurationlomOqCM.getOutputSizeshNQ4ISI.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.FragmentTransaction.Op next = it.next();
                if (next.getHighSpeedVideoFpsRanges != null) {
                    next.getHighSpeedVideoFpsRanges.mTransitioning = false;
                }
            }
            this.getOutputMinFrameDurationlomOqCM = null;
            z2 = highSpeedVideoFpsRanges;
        }
        boolean highSpeedVideoFpsRanges2 = opGenerator.getHighSpeedVideoFpsRanges(this.sha1, this.AMEXKernelJNI);
        if (z2 || highSpeedVideoFpsRanges2) {
            this.ArtificialStackFrames = true;
            try {
                getHighSpeedVideoSizes(this.sha1, this.AMEXKernelJNI);
            } finally {
                accessartificialFrame();
            }
        }
        getHighSpeedVideoFpsRanges();
        _CREATION();
        this.getInputFormats.Camera2StreamConfigurationMap();
    }

    private void accessartificialFrame() {
        this.ArtificialStackFrames = false;
        this.AMEXKernelJNI.clear();
        this.sha1.clear();
    }

    final boolean getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        androidx.fragment.app.BackStackRecord backStackRecord;
        Camera2StreamConfigurationMap(z);
        boolean z2 = false;
        if (!this.getOutputMinFrameDuration && (backStackRecord = this.getOutputMinFrameDurationlomOqCM) != null) {
            backStackRecord.getHighSpeedVideoFpsRangesFor = false;
            this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRanges();
            isLoggingEnabled(3);
            this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoSizes(false, false);
            this.getOutputSizes.add(0, this.getOutputMinFrameDurationlomOqCM);
            java.util.Iterator<androidx.fragment.app.FragmentTransaction.Op> it = this.getOutputMinFrameDurationlomOqCM.getOutputSizeshNQ4ISI.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.FragmentTransaction.Op next = it.next();
                if (next.getHighSpeedVideoFpsRanges != null) {
                    next.getHighSpeedVideoFpsRanges.mTransitioning = false;
                }
            }
            this.getOutputMinFrameDurationlomOqCM = null;
        }
        while (getHighSpeedVideoFpsRangesFor(this.sha1, this.AMEXKernelJNI)) {
            z2 = true;
            this.ArtificialStackFrames = true;
            try {
                getHighSpeedVideoSizes(this.sha1, this.AMEXKernelJNI);
            } finally {
                accessartificialFrame();
            }
        }
        getHighSpeedVideoFpsRanges();
        _CREATION();
        this.getInputFormats.Camera2StreamConfigurationMap();
        return z2;
    }

    private void getHighSpeedVideoSizes(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new java.lang.IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!arrayList.get(i).isOutputSupportedFor) {
                if (i2 != i) {
                    getHighSpeedVideoFpsRangesFor(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (arrayList2.get(i).booleanValue()) {
                    while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).isOutputSupportedFor) {
                        i2++;
                    }
                }
                getHighSpeedVideoFpsRangesFor(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            getHighSpeedVideoFpsRangesFor(arrayList, arrayList2, i2, size);
        }
    }

    private void getHighSpeedVideoFpsRangesFor(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2, int i, int i2) {
        int i3 = i;
        boolean z = arrayList.get(i3).isOutputSupportedFor;
        java.util.ArrayList<androidx.fragment.app.Fragment> arrayList3 = this.free;
        if (arrayList3 == null) {
            this.free = new java.util.ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.free.addAll(this.getInputFormats.getHighSpeedVideoFpsRangesFor());
        androidx.fragment.app.Fragment primaryNavigationFragment = getPrimaryNavigationFragment();
        boolean z2 = false;
        for (int i4 = i3; i4 < i2; i4++) {
            androidx.fragment.app.BackStackRecord backStackRecord = arrayList.get(i4);
            if (!arrayList2.get(i4).booleanValue()) {
                primaryNavigationFragment = backStackRecord.getHighResolutionOutputSizeshNQ4ISI(this.free, primaryNavigationFragment);
            } else {
                java.util.ArrayList<androidx.fragment.app.Fragment> arrayList4 = this.free;
                for (int size = backStackRecord.getOutputSizeshNQ4ISI.size() - 1; size >= 0; size--) {
                    androidx.fragment.app.FragmentTransaction.Op op = backStackRecord.getOutputSizeshNQ4ISI.get(size);
                    int i5 = op.Camera2StreamConfigurationMap;
                    if (i5 != 1) {
                        if (i5 != 3) {
                            switch (i5) {
                                case 8:
                                    primaryNavigationFragment = null;
                                    break;
                                case 9:
                                    primaryNavigationFragment = op.getHighSpeedVideoFpsRanges;
                                    break;
                                case 10:
                                    op.getHighResolutionOutputSizeshNQ4ISI = op.getOutputFormats;
                                    break;
                            }
                        }
                        arrayList4.add(op.getHighSpeedVideoFpsRanges);
                    }
                    arrayList4.remove(op.getHighSpeedVideoFpsRanges);
                }
            }
            z2 = z2 || backStackRecord.Camera2StreamConfigurationMap;
        }
        this.free.clear();
        if (!z && this.getHighSpeedVideoSizes > 0) {
            for (int i6 = i3; i6 < i2; i6++) {
                java.util.Iterator<androidx.fragment.app.FragmentTransaction.Op> it = arrayList.get(i6).getOutputSizeshNQ4ISI.iterator();
                while (it.hasNext()) {
                    androidx.fragment.app.Fragment fragment = it.next().getHighSpeedVideoFpsRanges;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.getInputFormats.Camera2StreamConfigurationMap(getHighResolutionOutputSizeshNQ4ISI(fragment));
                    }
                }
            }
        }
        getHighSpeedVideoSizes(arrayList, arrayList2, i, i2);
        boolean booleanValue = arrayList2.get(i2 - 1).booleanValue();
        if (z2 && !this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.Iterator<androidx.fragment.app.BackStackRecord> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(getHighSpeedVideoFpsRangesFor(it2.next()));
            }
            if (this.getOutputMinFrameDurationlomOqCM == null) {
                java.util.Iterator<androidx.fragment.app.FragmentManager.OnBackStackChangedListener> it3 = this.getHighSpeedVideoFpsRangesFor.iterator();
                while (it3.hasNext()) {
                    androidx.fragment.app.FragmentManager.OnBackStackChangedListener next = it3.next();
                    java.util.Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        next.onBackStackChangeStarted((androidx.fragment.app.Fragment) it4.next(), booleanValue);
                    }
                }
                java.util.Iterator<androidx.fragment.app.FragmentManager.OnBackStackChangedListener> it5 = this.getHighSpeedVideoFpsRangesFor.iterator();
                while (it5.hasNext()) {
                    androidx.fragment.app.FragmentManager.OnBackStackChangedListener next2 = it5.next();
                    java.util.Iterator it6 = linkedHashSet.iterator();
                    while (it6.hasNext()) {
                        next2.onBackStackChangeCommitted((androidx.fragment.app.Fragment) it6.next(), booleanValue);
                    }
                }
            }
        }
        for (int i7 = i3; i7 < i2; i7++) {
            androidx.fragment.app.BackStackRecord backStackRecord2 = arrayList.get(i7);
            if (booleanValue) {
                for (int size2 = backStackRecord2.getOutputSizeshNQ4ISI.size() - 1; size2 >= 0; size2--) {
                    androidx.fragment.app.Fragment fragment2 = backStackRecord2.getOutputSizeshNQ4ISI.get(size2).getHighSpeedVideoFpsRanges;
                    if (fragment2 != null) {
                        getHighResolutionOutputSizeshNQ4ISI(fragment2).getHighSpeedVideoFpsRanges();
                    }
                }
            } else {
                java.util.Iterator<androidx.fragment.app.FragmentTransaction.Op> it7 = backStackRecord2.getOutputSizeshNQ4ISI.iterator();
                while (it7.hasNext()) {
                    androidx.fragment.app.Fragment fragment3 = it7.next().getHighSpeedVideoFpsRanges;
                    if (fragment3 != null) {
                        getHighResolutionOutputSizeshNQ4ISI(fragment3).getHighSpeedVideoFpsRanges();
                    }
                }
            }
        }
        getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, true);
        for (androidx.fragment.app.SpecialEffectsController specialEffectsController : Camera2StreamConfigurationMap(arrayList, i3, i2)) {
            specialEffectsController.updateOperationDirection(booleanValue);
            specialEffectsController.markPostponedState();
            specialEffectsController.executePendingOperations();
        }
        while (i3 < i2) {
            androidx.fragment.app.BackStackRecord backStackRecord3 = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue() && backStackRecord3.getHighSpeedVideoFpsRanges >= 0) {
                backStackRecord3.getHighSpeedVideoFpsRanges = -1;
            }
            backStackRecord3.getHighSpeedVideoSizes();
            i3++;
        }
        if (z2) {
            for (int i8 = 0; i8 < this.getHighSpeedVideoFpsRangesFor.size(); i8++) {
                this.getHighSpeedVideoFpsRangesFor.get(i8).onBackStackChanged();
            }
        }
    }

    final java.util.Set<androidx.fragment.app.SpecialEffectsController> Camera2StreamConfigurationMap(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, int i, int i2) {
        android.view.ViewGroup viewGroup;
        java.util.HashSet hashSet = new java.util.HashSet();
        while (i < i2) {
            java.util.Iterator<androidx.fragment.app.FragmentTransaction.Op> it = arrayList.get(i).getOutputSizeshNQ4ISI.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.Fragment fragment = it.next().getHighSpeedVideoFpsRanges;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(androidx.fragment.app.SpecialEffectsController.getOrCreateController(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    private static void getHighSpeedVideoSizes(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            androidx.fragment.app.BackStackRecord backStackRecord = arrayList.get(i);
            if (arrayList2.get(i).booleanValue()) {
                backStackRecord.getHighSpeedVideoSizes(-1);
                for (int size = backStackRecord.getOutputSizeshNQ4ISI.size() - 1; size >= 0; size--) {
                    androidx.fragment.app.FragmentTransaction.Op op = backStackRecord.getOutputSizeshNQ4ISI.get(size);
                    androidx.fragment.app.Fragment fragment = op.getHighSpeedVideoFpsRanges;
                    if (fragment != null) {
                        fragment.mBeingSaved = backStackRecord.getHighSpeedVideoSizes;
                        fragment.setPopDirection(true);
                        int i3 = backStackRecord.ArtificialStackFrames;
                        int i4 = 8194;
                        int i5 = androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
                        if (i3 != 4097) {
                            if (i3 != 8194) {
                                i4 = androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN;
                                i5 = androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_CLOSE;
                                if (i3 != 8197) {
                                    if (i3 == 4099) {
                                        i4 = 4099;
                                    } else if (i3 != 4100) {
                                        i4 = 0;
                                    }
                                }
                            }
                            i4 = i5;
                        }
                        fragment.setNextTransition(i4);
                        fragment.setSharedElementNames(backStackRecord.isOutputSupportedForhNQ4ISI, backStackRecord.unwrapAs);
                    }
                    switch (op.Camera2StreamConfigurationMap) {
                        case 1:
                            fragment.setAnimations(op.getHighSpeedVideoFpsRangesFor, op.getHighSpeedVideoSizes, op.getOutputMinFrameDuration, op.getInputFormats);
                            backStackRecord.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(fragment, true);
                            backStackRecord.getHighResolutionOutputSizeshNQ4ISI.getOutputStallDurationlomOqCM(fragment);
                            break;
                        case 2:
                        default:
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown cmd: ");
                            sb.append(op.Camera2StreamConfigurationMap);
                            throw new java.lang.IllegalArgumentException(sb.toString());
                        case 3:
                            fragment.setAnimations(op.getHighSpeedVideoFpsRangesFor, op.getHighSpeedVideoSizes, op.getOutputMinFrameDuration, op.getInputFormats);
                            backStackRecord.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(fragment);
                            break;
                        case 4:
                            fragment.setAnimations(op.getHighSpeedVideoFpsRangesFor, op.getHighSpeedVideoSizes, op.getOutputMinFrameDuration, op.getInputFormats);
                            androidx.fragment.app.FragmentManager fragmentManager = backStackRecord.getHighResolutionOutputSizeshNQ4ISI;
                            isLoggingEnabled(2);
                            if (fragment.mHidden) {
                                fragment.mHidden = false;
                                fragment.mHiddenChanged = !fragment.mHiddenChanged;
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            fragment.setAnimations(op.getHighSpeedVideoFpsRangesFor, op.getHighSpeedVideoSizes, op.getOutputMinFrameDuration, op.getInputFormats);
                            backStackRecord.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(fragment, true);
                            backStackRecord.getHighResolutionOutputSizeshNQ4ISI.getOutputMinFrameDuration(fragment);
                            break;
                        case 6:
                            fragment.setAnimations(op.getHighSpeedVideoFpsRangesFor, op.getHighSpeedVideoSizes, op.getOutputMinFrameDuration, op.getInputFormats);
                            backStackRecord.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(fragment);
                            break;
                        case 7:
                            fragment.setAnimations(op.getHighSpeedVideoFpsRangesFor, op.getHighSpeedVideoSizes, op.getOutputMinFrameDuration, op.getInputFormats);
                            backStackRecord.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(fragment, true);
                            backStackRecord.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats(fragment);
                            break;
                        case 8:
                            backStackRecord.getHighResolutionOutputSizeshNQ4ISI.getOutputSizes(null);
                            break;
                        case 9:
                            backStackRecord.getHighResolutionOutputSizeshNQ4ISI.getOutputSizes(fragment);
                            break;
                        case 10:
                            backStackRecord.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(fragment, op.getOutputFormats);
                            break;
                    }
                }
            } else {
                backStackRecord.getHighSpeedVideoSizes(1);
                backStackRecord.getHighResolutionOutputSizeshNQ4ISI();
            }
            i++;
        }
    }

    private void unwrapAs(androidx.fragment.app.Fragment fragment) {
        android.view.ViewGroup validOutputFormatsForInputhNQ4ISI = getValidOutputFormatsForInputhNQ4ISI(fragment);
        if (validOutputFormatsForInputhNQ4ISI == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        if (validOutputFormatsForInputhNQ4ISI.getTag(androidx.fragment.R.id.visible_removing_fragment_view_tag) == null) {
            validOutputFormatsForInputhNQ4ISI.setTag(androidx.fragment.R.id.visible_removing_fragment_view_tag, fragment);
        }
        ((androidx.fragment.app.Fragment) validOutputFormatsForInputhNQ4ISI.getTag(androidx.fragment.R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
    }

    private android.view.ViewGroup getValidOutputFormatsForInputhNQ4ISI(androidx.fragment.app.Fragment fragment) {
        if (fragment.mContainer != null) {
            return fragment.mContainer;
        }
        if (fragment.mContainerId > 0 && this.isOutputSupportedFor.onHasView()) {
            android.view.View onFindViewById = this.isOutputSupportedFor.onFindViewById(fragment.mContainerId);
            if (onFindViewById instanceof android.view.ViewGroup) {
                return (android.view.ViewGroup) onFindViewById;
            }
        }
        return null;
    }

    private void b() {
        java.util.Iterator<androidx.fragment.app.SpecialEffectsController> it = getARTIFICIAL_FRAME_PACKAGE_NAME().iterator();
        while (it.hasNext()) {
            it.next().forcePostponedExecutePendingOperations();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _BOUNDARY() {
        java.util.Iterator<androidx.fragment.app.SpecialEffectsController> it = getARTIFICIAL_FRAME_PACKAGE_NAME().iterator();
        while (it.hasNext()) {
            it.next().forceCompleteAllOperations();
        }
    }

    private java.util.Set<androidx.fragment.app.SpecialEffectsController> getARTIFICIAL_FRAME_PACKAGE_NAME() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<androidx.fragment.app.FragmentStateManager> it = this.getInputFormats.getHighSpeedVideoFpsRanges().iterator();
        while (it.hasNext()) {
            android.view.ViewGroup viewGroup = it.next().Camera2StreamConfigurationMap().mContainer;
            if (viewGroup != null) {
                hashSet.add(androidx.fragment.app.SpecialEffectsController.getOrCreateController(viewGroup, isOutputSupportedForhNQ4ISI()));
            }
        }
        return hashSet;
    }

    private boolean getHighSpeedVideoFpsRangesFor(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2) {
        synchronized (this.getOutputSizes) {
            if (this.getOutputSizes.isEmpty()) {
                return false;
            }
            try {
                int size = this.getOutputSizes.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    z |= this.getOutputSizes.get(i).getHighSpeedVideoFpsRanges(arrayList, arrayList2);
                }
                return z;
            } finally {
                this.getOutputSizes.clear();
                this.getHighSpeedVideoSizesFor.getHandler().removeCallbacks(this.accessartificialFrame);
            }
        }
    }

    private void _CREATION() {
        if (this.coroutineCreation) {
            this.coroutineCreation = false;
            d();
        }
    }

    static java.util.Set<androidx.fragment.app.Fragment> getHighSpeedVideoFpsRangesFor(androidx.fragment.app.BackStackRecord backStackRecord) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i = 0; i < backStackRecord.getOutputSizeshNQ4ISI.size(); i++) {
            androidx.fragment.app.Fragment fragment = backStackRecord.getOutputSizeshNQ4ISI.get(i).getHighSpeedVideoFpsRanges;
            if (fragment != null && backStackRecord.Camera2StreamConfigurationMap) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    final boolean getHighSpeedVideoSizes(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2, java.lang.String str) {
        boolean z;
        androidx.fragment.app.BackStackState remove = this.getValidOutputFormatsForInputhNQ4ISI.remove(str);
        if (remove == null) {
            return false;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator<androidx.fragment.app.BackStackRecord> it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.BackStackRecord next = it.next();
            if (next.getHighSpeedVideoSizes) {
                java.util.Iterator<androidx.fragment.app.FragmentTransaction.Op> it2 = next.getOutputSizeshNQ4ISI.iterator();
                while (it2.hasNext()) {
                    androidx.fragment.app.FragmentTransaction.Op next2 = it2.next();
                    if (next2.getHighSpeedVideoFpsRanges != null) {
                        hashMap.put(next2.getHighSpeedVideoFpsRanges.mWho, next2.getHighSpeedVideoFpsRanges);
                    }
                }
            }
        }
        java.util.HashMap hashMap2 = new java.util.HashMap(remove.getHighSpeedVideoFpsRangesFor.size());
        for (java.lang.String str2 : remove.getHighSpeedVideoFpsRangesFor) {
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) hashMap.get(str2);
            if (fragment != null) {
                hashMap2.put(fragment.mWho, fragment);
            } else {
                android.os.Bundle remove2 = this.getInputFormats.getHighSpeedVideoSizes.remove(str2);
                if (remove2 != null) {
                    java.lang.ClassLoader classLoader = getHost().getContext().getClassLoader();
                    androidx.fragment.app.Fragment highSpeedVideoSizes = ((androidx.fragment.app.FragmentState) remove2.getParcelable("state")).getHighSpeedVideoSizes(getFragmentFactory(), classLoader);
                    highSpeedVideoSizes.mSavedFragmentState = remove2;
                    if (highSpeedVideoSizes.mSavedFragmentState.getBundle("savedInstanceState") == null) {
                        highSpeedVideoSizes.mSavedFragmentState.putBundle("savedInstanceState", new android.os.Bundle());
                    }
                    android.os.Bundle bundle = remove2.getBundle("arguments");
                    if (bundle != null) {
                        bundle.setClassLoader(classLoader);
                    }
                    highSpeedVideoSizes.setArguments(bundle);
                    hashMap2.put(highSpeedVideoSizes.mWho, highSpeedVideoSizes);
                }
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (androidx.fragment.app.BackStackRecordState backStackRecordState : remove.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.fragment.app.BackStackRecord backStackRecord = new androidx.fragment.app.BackStackRecord(this);
            backStackRecordState.getHighResolutionOutputSizeshNQ4ISI(backStackRecord);
            for (int i = 0; i < backStackRecordState.getHighSpeedVideoSizesFor.size(); i++) {
                java.lang.String str3 = backStackRecordState.getHighSpeedVideoSizesFor.get(i);
                if (str3 != null) {
                    androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) hashMap2.get(str3);
                    if (fragment2 != null) {
                        backStackRecord.getOutputSizeshNQ4ISI.get(i).getHighSpeedVideoFpsRanges = fragment2;
                    } else {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Restoring FragmentTransaction ");
                        sb.append(backStackRecordState.getInputFormats);
                        sb.append(" failed due to missing saved state for Fragment (");
                        sb.append(str3);
                        sb.append(")");
                        throw new java.lang.IllegalStateException(sb.toString());
                    }
                }
            }
            arrayList3.add(backStackRecord);
        }
        java.util.Iterator it3 = arrayList3.iterator();
        while (true) {
            while (it3.hasNext()) {
                z = ((androidx.fragment.app.BackStackRecord) it3.next()).getHighSpeedVideoFpsRanges(arrayList, arrayList2) || z;
            }
            return z;
        }
    }

    final boolean Camera2StreamConfigurationMap(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2, java.lang.String str) {
        java.lang.String str2;
        java.lang.String concat;
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(str, -1, true);
        if (Camera2StreamConfigurationMap < 0) {
            return false;
        }
        for (int i = Camera2StreamConfigurationMap; i < this.getHighSpeedVideoFpsRanges.size(); i++) {
            androidx.fragment.app.BackStackRecord backStackRecord = this.getHighSpeedVideoFpsRanges.get(i);
            if (!backStackRecord.isOutputSupportedFor) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("saveBackStack(\"");
                sb.append(str);
                sb.append("\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found ");
                sb.append(backStackRecord);
                sb.append(" that did not use setReorderingAllowed(true).");
                getHighSpeedVideoFpsRangesFor(new java.lang.IllegalArgumentException(sb.toString()));
            }
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i2 = Camera2StreamConfigurationMap; i2 < this.getHighSpeedVideoFpsRanges.size(); i2++) {
            androidx.fragment.app.BackStackRecord backStackRecord2 = this.getHighSpeedVideoFpsRanges.get(i2);
            java.util.HashSet hashSet2 = new java.util.HashSet();
            java.util.HashSet hashSet3 = new java.util.HashSet();
            java.util.Iterator<androidx.fragment.app.FragmentTransaction.Op> it = backStackRecord2.getOutputSizeshNQ4ISI.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.FragmentTransaction.Op next = it.next();
                androidx.fragment.app.Fragment fragment = next.getHighSpeedVideoFpsRanges;
                if (fragment != null) {
                    if (!next.getHighSpeedVideoSizesFor || next.Camera2StreamConfigurationMap == 1 || next.Camera2StreamConfigurationMap == 2 || next.Camera2StreamConfigurationMap == 8) {
                        hashSet.add(fragment);
                        hashSet2.add(fragment);
                    }
                    if (next.Camera2StreamConfigurationMap == 1 || next.Camera2StreamConfigurationMap == 2) {
                        hashSet3.add(fragment);
                    }
                }
            }
            hashSet2.removeAll(hashSet3);
            if (!hashSet2.isEmpty()) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("saveBackStack(\"");
                sb2.append(str);
                sb2.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                if (hashSet2.size() == 1) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(" ");
                    sb3.append(hashSet2.iterator().next());
                    concat = sb3.toString();
                } else {
                    concat = "s ".concat(java.lang.String.valueOf(hashSet2));
                }
                sb2.append(concat);
                sb2.append(" in ");
                sb2.append(backStackRecord2);
                sb2.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                getHighSpeedVideoFpsRangesFor(new java.lang.IllegalArgumentException(sb2.toString()));
            }
        }
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(hashSet);
        while (!arrayDeque.isEmpty()) {
            androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) arrayDeque.removeFirst();
            if (fragment2.mRetainInstance) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("saveBackStack(\"");
                sb4.append(str);
                sb4.append("\") must not contain retained fragments. Found ");
                if (hashSet.contains(fragment2)) {
                    str2 = "direct reference to retained ";
                } else {
                    str2 = "retained child ";
                }
                sb4.append(str2);
                sb4.append("fragment ");
                sb4.append(fragment2);
                getHighSpeedVideoFpsRangesFor(new java.lang.IllegalArgumentException(sb4.toString()));
            }
            for (androidx.fragment.app.Fragment fragment3 : fragment2.mChildFragmentManager.getInputFormats.getHighResolutionOutputSizeshNQ4ISI()) {
                if (fragment3 != null) {
                    arrayDeque.addLast(fragment3);
                }
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((androidx.fragment.app.Fragment) it2.next()).mWho);
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(this.getHighSpeedVideoFpsRanges.size() - Camera2StreamConfigurationMap);
        for (int i3 = Camera2StreamConfigurationMap; i3 < this.getHighSpeedVideoFpsRanges.size(); i3++) {
            arrayList4.add(null);
        }
        androidx.fragment.app.BackStackState backStackState = new androidx.fragment.app.BackStackState(arrayList3, arrayList4);
        for (int size = this.getHighSpeedVideoFpsRanges.size() - 1; size >= Camera2StreamConfigurationMap; size--) {
            androidx.fragment.app.BackStackRecord remove = this.getHighSpeedVideoFpsRanges.remove(size);
            androidx.fragment.app.BackStackRecord backStackRecord3 = new androidx.fragment.app.BackStackRecord(remove);
            backStackRecord3.getHighSpeedVideoFpsRanges();
            arrayList4.set(size - Camera2StreamConfigurationMap, new androidx.fragment.app.BackStackRecordState(backStackRecord3));
            remove.getHighSpeedVideoSizes = true;
            arrayList.add(remove);
            arrayList2.add(java.lang.Boolean.TRUE);
        }
        this.getValidOutputFormatsForInputhNQ4ISI.put(str, backStackState);
        return true;
    }

    final boolean Camera2StreamConfigurationMap(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2, java.lang.String str, int i, int i2) {
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(str, i, (i2 & 1) != 0);
        if (Camera2StreamConfigurationMap < 0) {
            return false;
        }
        for (int size = this.getHighSpeedVideoFpsRanges.size() - 1; size >= Camera2StreamConfigurationMap; size--) {
            arrayList.add(this.getHighSpeedVideoFpsRanges.remove(size));
            arrayList2.add(java.lang.Boolean.TRUE);
        }
        return true;
    }

    private int Camera2StreamConfigurationMap(java.lang.String str, int i, boolean z) {
        if (this.getHighSpeedVideoFpsRanges.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.getHighSpeedVideoFpsRanges.size() - 1;
        }
        int size = this.getHighSpeedVideoFpsRanges.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.BackStackRecord backStackRecord = this.getHighSpeedVideoFpsRanges.get(size);
            if ((str != null && str.equals(backStackRecord.getName())) || (i >= 0 && i == backStackRecord.getHighSpeedVideoFpsRanges)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.getHighSpeedVideoFpsRanges.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.BackStackRecord backStackRecord2 = this.getHighSpeedVideoFpsRanges.get(size - 1);
            if ((str == null || !str.equals(backStackRecord2.getName())) && (i < 0 || i != backStackRecord2.getHighSpeedVideoFpsRanges)) {
                break;
            }
            size--;
        }
        return size;
    }

    @java.lang.Deprecated
    final androidx.fragment.app.FragmentManagerNonConfig coroutineCreation() {
        if (this.getHighSpeedVideoSizesFor instanceof androidx.view.ViewModelStoreOwner) {
            getHighSpeedVideoFpsRangesFor(new java.lang.IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this._CREATION.Camera2StreamConfigurationMap();
    }

    final android.os.Bundle CoroutineDebuggingKt() {
        androidx.fragment.app.BackStackRecordState[] backStackRecordStateArr;
        android.os.Bundle bundle = new android.os.Bundle();
        b();
        _BOUNDARY();
        getHighResolutionOutputSizeshNQ4ISI(true);
        this.AMEXKernelCallback = true;
        this._CREATION.getHighSpeedVideoFpsRanges(true);
        java.util.ArrayList<java.lang.String> inputSizeshNQ4ISI = this.getInputFormats.getInputSizeshNQ4ISI();
        java.util.HashMap<java.lang.String, android.os.Bundle> hashMap = this.getInputFormats.getHighSpeedVideoSizes;
        if (hashMap.isEmpty()) {
            isLoggingEnabled(2);
            return bundle;
        }
        java.util.ArrayList<java.lang.String> outputFormats = this.getInputFormats.getOutputFormats();
        int size = this.getHighSpeedVideoFpsRanges.size();
        if (size > 0) {
            backStackRecordStateArr = new androidx.fragment.app.BackStackRecordState[size];
            for (int i = 0; i < size; i++) {
                backStackRecordStateArr[i] = new androidx.fragment.app.BackStackRecordState(this.getHighSpeedVideoFpsRanges.get(i));
                if (isLoggingEnabled(2)) {
                    this.getHighSpeedVideoFpsRanges.get(i);
                }
            }
        } else {
            backStackRecordStateArr = null;
        }
        androidx.fragment.app.FragmentManagerState fragmentManagerState = new androidx.fragment.app.FragmentManagerState();
        fragmentManagerState.getHighSpeedVideoFpsRangesFor = inputSizeshNQ4ISI;
        fragmentManagerState.getHighSpeedVideoFpsRanges = outputFormats;
        fragmentManagerState.getHighResolutionOutputSizeshNQ4ISI = backStackRecordStateArr;
        fragmentManagerState.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap.get();
        androidx.fragment.app.Fragment fragment = this.getOutputSizeshNQ4ISI;
        if (fragment != null) {
            fragmentManagerState.getOutputFormats = fragment.mWho;
        }
        fragmentManagerState.getHighSpeedVideoSizes.addAll(this.getValidOutputFormatsForInputhNQ4ISI.keySet());
        fragmentManagerState.getInputSizeshNQ4ISI.addAll(this.getValidOutputFormatsForInputhNQ4ISI.values());
        fragmentManagerState.getHighSpeedVideoSizesFor = new java.util.ArrayList<>(this.getOutputFormats);
        bundle.putParcelable("state", fragmentManagerState);
        for (java.lang.String str : this.exchange.keySet()) {
            bundle.putBundle("result_".concat(java.lang.String.valueOf(str)), this.exchange.get(str));
        }
        for (java.lang.String str2 : hashMap.keySet()) {
            bundle.putBundle("fragment_".concat(java.lang.String.valueOf(str2)), hashMap.get(str2));
        }
        return bundle;
    }

    final void Camera2StreamConfigurationMap(android.os.Parcelable parcelable, androidx.fragment.app.FragmentManagerNonConfig fragmentManagerNonConfig) {
        if (this.getHighSpeedVideoSizesFor instanceof androidx.view.ViewModelStoreOwner) {
            getHighSpeedVideoFpsRangesFor(new java.lang.IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this._CREATION.Camera2StreamConfigurationMap(fragmentManagerNonConfig);
        Camera2StreamConfigurationMap(parcelable);
    }

    final void Camera2StreamConfigurationMap(android.os.Parcelable parcelable) {
        androidx.fragment.app.FragmentStateManager fragmentStateManager;
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        if (parcelable != null) {
            android.os.Bundle bundle3 = (android.os.Bundle) parcelable;
            for (java.lang.String str : bundle3.keySet()) {
                if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                    bundle2.setClassLoader(this.getHighSpeedVideoSizesFor.getContext().getClassLoader());
                    this.exchange.put(str.substring(7), bundle2);
                }
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            for (java.lang.String str2 : bundle3.keySet()) {
                if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                    bundle.setClassLoader(this.getHighSpeedVideoSizesFor.getContext().getClassLoader());
                    hashMap.put(str2.substring(9), bundle);
                }
            }
            androidx.fragment.app.FragmentStore fragmentStore = this.getInputFormats;
            fragmentStore.getHighSpeedVideoSizes.clear();
            fragmentStore.getHighSpeedVideoSizes.putAll(hashMap);
            androidx.fragment.app.FragmentManagerState fragmentManagerState = (androidx.fragment.app.FragmentManagerState) bundle3.getParcelable("state");
            if (fragmentManagerState == null) {
                return;
            }
            this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI.clear();
            java.util.Iterator<java.lang.String> it = fragmentManagerState.getHighSpeedVideoFpsRangesFor.iterator();
            while (it.hasNext()) {
                android.os.Bundle remove = this.getInputFormats.getHighSpeedVideoSizes.remove(it.next());
                if (remove != null) {
                    androidx.fragment.app.Fragment fragment = this._CREATION.getHighResolutionOutputSizeshNQ4ISI.get(((androidx.fragment.app.FragmentState) remove.getParcelable("state")).getOutputStallDurationlomOqCM);
                    if (fragment != null) {
                        isLoggingEnabled(2);
                        fragmentStateManager = new androidx.fragment.app.FragmentStateManager(this.f2737a, this.getInputFormats, fragment, remove);
                    } else {
                        fragmentStateManager = new androidx.fragment.app.FragmentStateManager(this.f2737a, this.getInputFormats, this.getHighSpeedVideoSizesFor.getContext().getClassLoader(), getFragmentFactory(), remove);
                    }
                    androidx.fragment.app.Fragment Camera2StreamConfigurationMap = fragmentStateManager.Camera2StreamConfigurationMap();
                    Camera2StreamConfigurationMap.mSavedFragmentState = remove;
                    Camera2StreamConfigurationMap.mFragmentManager = this;
                    if (isLoggingEnabled(2)) {
                        java.lang.String str3 = Camera2StreamConfigurationMap.mWho;
                    }
                    fragmentStateManager.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizesFor.getContext().getClassLoader());
                    this.getInputFormats.Camera2StreamConfigurationMap(fragmentStateManager);
                    fragmentStateManager.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes);
                }
            }
            for (androidx.fragment.app.Fragment fragment2 : new java.util.ArrayList(this._CREATION.getHighResolutionOutputSizeshNQ4ISI.values())) {
                if (!this.getInputFormats.Camera2StreamConfigurationMap(fragment2.mWho)) {
                    if (isLoggingEnabled(2)) {
                        java.util.ArrayList<java.lang.String> arrayList = fragmentManagerState.getHighSpeedVideoFpsRangesFor;
                    }
                    this._CREATION.getHighSpeedVideoFpsRanges(fragment2);
                    fragment2.mFragmentManager = this;
                    androidx.fragment.app.FragmentStateManager fragmentStateManager2 = new androidx.fragment.app.FragmentStateManager(this.f2737a, this.getInputFormats, fragment2);
                    fragmentStateManager2.getHighResolutionOutputSizeshNQ4ISI(1);
                    fragmentStateManager2.getHighSpeedVideoFpsRanges();
                    fragment2.mRemoving = true;
                    fragmentStateManager2.getHighSpeedVideoFpsRanges();
                }
            }
            this.getInputFormats.getHighSpeedVideoSizes(fragmentManagerState.getHighSpeedVideoFpsRanges);
            if (fragmentManagerState.getHighResolutionOutputSizeshNQ4ISI != null) {
                this.getHighSpeedVideoFpsRanges = new java.util.ArrayList<>(fragmentManagerState.getHighResolutionOutputSizeshNQ4ISI.length);
                for (int i = 0; i < fragmentManagerState.getHighResolutionOutputSizeshNQ4ISI.length; i++) {
                    androidx.fragment.app.BackStackRecord Camera2StreamConfigurationMap2 = fragmentManagerState.getHighResolutionOutputSizeshNQ4ISI[i].Camera2StreamConfigurationMap(this);
                    if (isLoggingEnabled(2)) {
                        int i2 = Camera2StreamConfigurationMap2.getHighSpeedVideoFpsRanges;
                        java.io.PrintWriter printWriter = new java.io.PrintWriter(new androidx.fragment.app.LogWriter(TAG));
                        Camera2StreamConfigurationMap2.getHighSpeedVideoFpsRanges("  ", printWriter, false);
                        printWriter.close();
                    }
                    this.getHighSpeedVideoFpsRanges.add(Camera2StreamConfigurationMap2);
                }
            } else {
                this.getHighSpeedVideoFpsRanges = new java.util.ArrayList<>();
            }
            this.Camera2StreamConfigurationMap.set(fragmentManagerState.Camera2StreamConfigurationMap);
            if (fragmentManagerState.getOutputFormats != null) {
                androidx.fragment.app.Fragment highSpeedVideoSizes = getHighSpeedVideoSizes(fragmentManagerState.getOutputFormats);
                this.getOutputSizeshNQ4ISI = highSpeedVideoSizes;
                isOutputSupportedFor(highSpeedVideoSizes);
            }
            java.util.ArrayList<java.lang.String> arrayList2 = fragmentManagerState.getHighSpeedVideoSizes;
            if (arrayList2 != null) {
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    this.getValidOutputFormatsForInputhNQ4ISI.put(arrayList2.get(i3), fragmentManagerState.getInputSizeshNQ4ISI.get(i3));
                }
            }
            this.getOutputFormats = new java.util.ArrayDeque<>(fragmentManagerState.getHighSpeedVideoSizesFor);
        }
    }

    public androidx.fragment.app.FragmentHostCallback<?> getHost() {
        return this.getHighSpeedVideoSizesFor;
    }

    final androidx.fragment.app.Fragment unwrapAs() {
        return this.AMEXKernela;
    }

    final androidx.fragment.app.FragmentContainer getOutputSizes() {
        return this.isOutputSupportedFor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void getHighSpeedVideoFpsRangesFor(androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback, androidx.fragment.app.FragmentContainer fragmentContainer, final androidx.fragment.app.Fragment fragment) {
        java.lang.String str;
        if (this.getHighSpeedVideoSizesFor != null) {
            throw new java.lang.IllegalStateException("Already attached");
        }
        this.getHighSpeedVideoSizesFor = fragmentHostCallback;
        this.isOutputSupportedFor = fragmentContainer;
        this.AMEXKernela = fragment;
        if (fragment != null) {
            addFragmentOnAttachListener(new androidx.fragment.app.FragmentOnAttachListener() { // from class: androidx.fragment.app.FragmentManager.7
                @Override // androidx.fragment.app.FragmentOnAttachListener
                public void onAttachFragment(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment2) {
                    fragment.onAttachFragment(fragment2);
                }
            });
        } else if (fragmentHostCallback instanceof androidx.fragment.app.FragmentOnAttachListener) {
            addFragmentOnAttachListener((androidx.fragment.app.FragmentOnAttachListener) fragmentHostCallback);
        }
        if (this.AMEXKernela != null) {
            getHighSpeedVideoFpsRanges();
        }
        if (fragmentHostCallback instanceof androidx.view.OnBackPressedDispatcherOwner) {
            androidx.view.OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (androidx.view.OnBackPressedDispatcherOwner) fragmentHostCallback;
            androidx.view.OnBackPressedDispatcher getHighResolutionOutputSizeshNQ4ISI2 = onBackPressedDispatcherOwner.getGetHighResolutionOutputSizeshNQ4ISI();
            this.getOutputStallDurationlomOqCM = getHighResolutionOutputSizeshNQ4ISI2;
            androidx.view.LifecycleOwner lifecycleOwner = onBackPressedDispatcherOwner;
            if (fragment != null) {
                lifecycleOwner = fragment;
            }
            getHighResolutionOutputSizeshNQ4ISI2.addCallback(lifecycleOwner, this.getOutputStallDuration);
        }
        if (fragment != null) {
            this._CREATION = fragment.mFragmentManager.toString(fragment);
        } else if (fragmentHostCallback instanceof androidx.view.ViewModelStoreOwner) {
            this._CREATION = androidx.fragment.app.FragmentManagerViewModel.getHighSpeedVideoFpsRangesFor(((androidx.view.ViewModelStoreOwner) fragmentHostCallback).getGetHighSpeedVideoSizes());
        } else {
            this._CREATION = new androidx.fragment.app.FragmentManagerViewModel(false);
        }
        this._CREATION.getHighSpeedVideoFpsRanges(isStateSaved());
        this.getInputFormats.Camera2StreamConfigurationMap(this._CREATION);
        java.lang.Object obj = this.getHighSpeedVideoSizesFor;
        if ((obj instanceof androidx.view.SavedStateRegistryOwner) && fragment == null) {
            androidx.view.SavedStateRegistry savedStateRegistry = ((androidx.view.SavedStateRegistryOwner) obj).getSavedStateRegistry();
            savedStateRegistry.registerSavedStateProvider("android:support:fragments", new androidx.savedstate.SavedStateRegistry.SavedStateProvider() { // from class: androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda4
                @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                public final android.os.Bundle saveState() {
                    return androidx.fragment.app.FragmentManager.this.CoroutineDebuggingKt();
                }
            });
            android.os.Bundle consumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey("android:support:fragments");
            if (consumeRestoredStateForKey != null) {
                Camera2StreamConfigurationMap(consumeRestoredStateForKey);
            }
        }
        java.lang.Object obj2 = this.getHighSpeedVideoSizesFor;
        if (obj2 instanceof androidx.view.result.ActivityResultRegistryOwner) {
            androidx.view.result.ActivityResultRegistry activityResultRegistry = ((androidx.view.result.ActivityResultRegistryOwner) obj2).getActivityResultRegistry();
            if (fragment != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(fragment.mWho);
                sb.append(io.ktor.sse.ServerSentEventKt.COLON);
                str = sb.toString();
            } else {
                str = "";
            }
            java.lang.String concat = "FragmentManager:".concat(java.lang.String.valueOf(str));
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(concat);
            sb2.append("StartActivityForResult");
            this.updateUI = activityResultRegistry.register(sb2.toString(), new androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult(), new androidx.view.result.ActivityResultCallback<androidx.view.result.ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.8
                @Override // androidx.view.result.ActivityResultCallback
                public /* synthetic */ void onActivityResult(androidx.view.result.ActivityResult activityResult) {
                    androidx.view.result.ActivityResult activityResult2 = activityResult;
                    androidx.fragment.app.FragmentManager.LaunchedFragmentInfo pollLast = androidx.fragment.app.FragmentManager.this.getOutputFormats.pollLast();
                    if (pollLast != null) {
                        java.lang.String str2 = pollLast.getHighSpeedVideoFpsRanges;
                        int i = pollLast.Camera2StreamConfigurationMap;
                        androidx.fragment.app.Fragment highSpeedVideoFpsRanges = androidx.fragment.app.FragmentManager.this.getInputFormats.getHighSpeedVideoFpsRanges(str2);
                        if (highSpeedVideoFpsRanges != null) {
                            highSpeedVideoFpsRanges.onActivityResult(i, activityResult2.getResultCode(), activityResult2.getData());
                        }
                    }
                }
            });
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(concat);
            sb3.append("StartIntentSenderForResult");
            this.requestPINEntry = activityResultRegistry.register(sb3.toString(), new androidx.fragment.app.FragmentManager.FragmentIntentSenderContract(), new androidx.view.result.ActivityResultCallback<androidx.view.result.ActivityResult>() { // from class: androidx.fragment.app.FragmentManager.9
                @Override // androidx.view.result.ActivityResultCallback
                public /* synthetic */ void onActivityResult(androidx.view.result.ActivityResult activityResult) {
                    androidx.view.result.ActivityResult activityResult2 = activityResult;
                    androidx.fragment.app.FragmentManager.LaunchedFragmentInfo pollFirst = androidx.fragment.app.FragmentManager.this.getOutputFormats.pollFirst();
                    if (pollFirst != null) {
                        java.lang.String str2 = pollFirst.getHighSpeedVideoFpsRanges;
                        int i = pollFirst.Camera2StreamConfigurationMap;
                        androidx.fragment.app.Fragment highSpeedVideoFpsRanges = androidx.fragment.app.FragmentManager.this.getInputFormats.getHighSpeedVideoFpsRanges(str2);
                        if (highSpeedVideoFpsRanges != null) {
                            highSpeedVideoFpsRanges.onActivityResult(i, activityResult2.getResultCode(), activityResult2.getData());
                        }
                    }
                }
            });
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(concat);
            sb4.append("RequestPermissions");
            this.resetTransaction = activityResultRegistry.register(sb4.toString(), new androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions(), new androidx.view.result.ActivityResultCallback<java.util.Map<java.lang.String, java.lang.Boolean>>() { // from class: androidx.fragment.app.FragmentManager.10
                @Override // androidx.view.result.ActivityResultCallback
                public /* synthetic */ void onActivityResult(java.util.Map<java.lang.String, java.lang.Boolean> map) {
                    java.util.Map<java.lang.String, java.lang.Boolean> map2 = map;
                    java.lang.String[] strArr = (java.lang.String[]) map2.keySet().toArray(new java.lang.String[0]);
                    java.util.ArrayList arrayList = new java.util.ArrayList(map2.values());
                    int[] iArr = new int[arrayList.size()];
                    for (int i = 0; i < arrayList.size(); i++) {
                        iArr[i] = ((java.lang.Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                    }
                    androidx.fragment.app.FragmentManager.LaunchedFragmentInfo pollFirst = androidx.fragment.app.FragmentManager.this.getOutputFormats.pollFirst();
                    if (pollFirst != null) {
                        java.lang.String str2 = pollFirst.getHighSpeedVideoFpsRanges;
                        int i2 = pollFirst.Camera2StreamConfigurationMap;
                        androidx.fragment.app.Fragment highSpeedVideoFpsRanges = androidx.fragment.app.FragmentManager.this.getInputFormats.getHighSpeedVideoFpsRanges(str2);
                        if (highSpeedVideoFpsRanges != null) {
                            highSpeedVideoFpsRanges.onRequestPermissionsResult(i2, strArr, iArr);
                        }
                    }
                }
            });
        }
        java.lang.Object obj3 = this.getHighSpeedVideoSizesFor;
        if (obj3 instanceof androidx.core.content.OnConfigurationChangedProvider) {
            ((androidx.core.content.OnConfigurationChangedProvider) obj3).addOnConfigurationChangedListener(this.d);
        }
        java.lang.Object obj4 = this.getHighSpeedVideoSizesFor;
        if (obj4 instanceof androidx.core.content.OnTrimMemoryProvider) {
            ((androidx.core.content.OnTrimMemoryProvider) obj4).addOnTrimMemoryListener(this.kernelVersion);
        }
        java.lang.Object obj5 = this.getHighSpeedVideoSizesFor;
        if (obj5 instanceof androidx.core.app.OnMultiWindowModeChangedProvider) {
            ((androidx.core.app.OnMultiWindowModeChangedProvider) obj5).addOnMultiWindowModeChangedListener(this.init);
        }
        java.lang.Object obj6 = this.getHighSpeedVideoSizesFor;
        if (obj6 instanceof androidx.core.app.OnPictureInPictureModeChangedProvider) {
            ((androidx.core.app.OnPictureInPictureModeChangedProvider) obj6).addOnPictureInPictureModeChangedListener(this.c);
        }
        java.lang.Object obj7 = this.getHighSpeedVideoSizesFor;
        if ((obj7 instanceof androidx.core.view.MenuHost) && fragment == null) {
            ((androidx.core.view.MenuHost) obj7).addMenuProvider(this.b);
        }
    }

    final void ArtificialStackFrames() {
        if (this.getHighSpeedVideoSizesFor != null) {
            this.AMEXKernelCallback = false;
            this.requestGoOnline = false;
            this._CREATION.getHighSpeedVideoFpsRanges(false);
            for (androidx.fragment.app.Fragment fragment : this.getInputFormats.getHighSpeedVideoFpsRangesFor()) {
                if (fragment != null) {
                    fragment.noteStateNotSaved();
                }
            }
        }
    }

    final void getHighSpeedVideoFpsRangesFor(androidx.fragment.app.Fragment fragment, android.content.Intent intent, int i, android.os.Bundle bundle) {
        if (this.updateUI != null) {
            this.getOutputFormats.addLast(new androidx.fragment.app.FragmentManager.LaunchedFragmentInfo(fragment.mWho, i));
            if (bundle != null) {
                intent.putExtra(androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundle);
            }
            this.updateUI.launch(intent);
            return;
        }
        this.getHighSpeedVideoSizesFor.onStartActivityFromFragment(fragment, intent, i, bundle);
    }

    final void getHighSpeedVideoFpsRanges(androidx.fragment.app.Fragment fragment, android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) throws android.content.IntentSender.SendIntentException {
        android.content.Intent intent2;
        if (this.requestPINEntry != null) {
            if (bundle != null) {
                if (intent == null) {
                    intent2 = new android.content.Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                isLoggingEnabled(2);
                intent2.putExtra(androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundle);
            } else {
                intent2 = intent;
            }
            androidx.view.result.IntentSenderRequest build = new androidx.activity.result.IntentSenderRequest.Builder(intentSender).setFillInIntent(intent2).setFlags(i3, i2).build();
            this.getOutputFormats.addLast(new androidx.fragment.app.FragmentManager.LaunchedFragmentInfo(fragment.mWho, i));
            isLoggingEnabled(2);
            this.requestPINEntry.launch(build);
            return;
        }
        this.getHighSpeedVideoSizesFor.onStartIntentSenderFromFragment(fragment, intentSender, i, intent, i2, i3, i4, bundle);
    }

    final void getHighSpeedVideoFpsRangesFor(androidx.fragment.app.Fragment fragment, java.lang.String[] strArr, int i) {
        if (this.resetTransaction != null) {
            this.getOutputFormats.addLast(new androidx.fragment.app.FragmentManager.LaunchedFragmentInfo(fragment.mWho, i));
            this.resetTransaction.launch(strArr);
            return;
        }
        this.getHighSpeedVideoSizesFor.onRequestPermissionsFromFragment(fragment, strArr, i);
    }

    final void getHighSpeedVideoSizes() {
        this.AMEXKernelCallback = false;
        this.requestGoOnline = false;
        this._CREATION.getHighSpeedVideoFpsRanges(false);
        getHighSpeedVideoSizes(0);
    }

    final void getHighSpeedVideoFpsRangesFor() {
        this.AMEXKernelCallback = false;
        this.requestGoOnline = false;
        this._CREATION.getHighSpeedVideoFpsRanges(false);
        getHighSpeedVideoSizes(1);
    }

    final void getOutputStallDurationlomOqCM() {
        getHighSpeedVideoSizes(2);
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        this.AMEXKernelCallback = false;
        this.requestGoOnline = false;
        this._CREATION.getHighSpeedVideoFpsRanges(false);
        getHighSpeedVideoSizes(4);
    }

    final void getOutputSizeshNQ4ISI() {
        this.AMEXKernelCallback = false;
        this.requestGoOnline = false;
        this._CREATION.getHighSpeedVideoFpsRanges(false);
        getHighSpeedVideoSizes(5);
    }

    final void getOutputStallDuration() {
        this.AMEXKernelCallback = false;
        this.requestGoOnline = false;
        this._CREATION.getHighSpeedVideoFpsRanges(false);
        getHighSpeedVideoSizes(7);
    }

    final void getHighSpeedVideoSizesFor() {
        getHighSpeedVideoSizes(5);
    }

    final void getOutputMinFrameDurationlomOqCM() {
        this.requestGoOnline = true;
        this._CREATION.getHighSpeedVideoFpsRanges(true);
        getHighSpeedVideoSizes(4);
    }

    final void getOutputMinFrameDuration() {
        getHighSpeedVideoSizes(1);
    }

    final void getInputSizeshNQ4ISI() {
        this.CoroutineDebuggingKt = true;
        getHighResolutionOutputSizeshNQ4ISI(true);
        _BOUNDARY();
        a();
        getHighSpeedVideoSizes(-1);
        java.lang.Object obj = this.getHighSpeedVideoSizesFor;
        if (obj instanceof androidx.core.content.OnTrimMemoryProvider) {
            ((androidx.core.content.OnTrimMemoryProvider) obj).removeOnTrimMemoryListener(this.kernelVersion);
        }
        java.lang.Object obj2 = this.getHighSpeedVideoSizesFor;
        if (obj2 instanceof androidx.core.content.OnConfigurationChangedProvider) {
            ((androidx.core.content.OnConfigurationChangedProvider) obj2).removeOnConfigurationChangedListener(this.d);
        }
        java.lang.Object obj3 = this.getHighSpeedVideoSizesFor;
        if (obj3 instanceof androidx.core.app.OnMultiWindowModeChangedProvider) {
            ((androidx.core.app.OnMultiWindowModeChangedProvider) obj3).removeOnMultiWindowModeChangedListener(this.init);
        }
        java.lang.Object obj4 = this.getHighSpeedVideoSizesFor;
        if (obj4 instanceof androidx.core.app.OnPictureInPictureModeChangedProvider) {
            ((androidx.core.app.OnPictureInPictureModeChangedProvider) obj4).removeOnPictureInPictureModeChangedListener(this.c);
        }
        java.lang.Object obj5 = this.getHighSpeedVideoSizesFor;
        if ((obj5 instanceof androidx.core.view.MenuHost) && this.AMEXKernela == null) {
            ((androidx.core.view.MenuHost) obj5).removeMenuProvider(this.b);
        }
        this.getHighSpeedVideoSizesFor = null;
        this.isOutputSupportedFor = null;
        this.AMEXKernela = null;
        if (this.getOutputStallDurationlomOqCM != null) {
            this.getOutputStallDuration.remove();
            this.getOutputStallDurationlomOqCM = null;
        }
        androidx.view.result.ActivityResultLauncher<android.content.Intent> activityResultLauncher = this.updateUI;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
            this.requestPINEntry.unregister();
            this.resetTransaction.unregister();
        }
    }

    private void getHighSpeedVideoSizes(int i) {
        try {
            this.ArtificialStackFrames = true;
            this.getInputFormats.getHighSpeedVideoFpsRangesFor(i);
            getHighResolutionOutputSizeshNQ4ISI(i, false);
            java.util.Iterator<androidx.fragment.app.SpecialEffectsController> it = getARTIFICIAL_FRAME_PACKAGE_NAME().iterator();
            while (it.hasNext()) {
                it.next().forceCompleteAllOperations();
            }
            this.ArtificialStackFrames = false;
            getHighResolutionOutputSizeshNQ4ISI(true);
        } catch (java.lang.Throwable th) {
            this.ArtificialStackFrames = false;
            throw th;
        }
    }

    final void getHighSpeedVideoFpsRanges(boolean z, boolean z2) {
        if (z2 && (this.getHighSpeedVideoSizesFor instanceof androidx.core.app.OnMultiWindowModeChangedProvider)) {
            getHighSpeedVideoFpsRangesFor(new java.lang.IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (androidx.fragment.app.Fragment fragment : this.getInputFormats.getHighSpeedVideoFpsRangesFor()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.getHighSpeedVideoFpsRanges(z, true);
                }
            }
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI(boolean z, boolean z2) {
        if (z2 && (this.getHighSpeedVideoSizesFor instanceof androidx.core.app.OnPictureInPictureModeChangedProvider)) {
            getHighSpeedVideoFpsRangesFor(new java.lang.IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (androidx.fragment.app.Fragment fragment : this.getInputFormats.getHighSpeedVideoFpsRangesFor()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.getHighResolutionOutputSizeshNQ4ISI(z, true);
                }
            }
        }
    }

    final void getHighSpeedVideoSizes(android.content.res.Configuration configuration, boolean z) {
        if (z && (this.getHighSpeedVideoSizesFor instanceof androidx.core.content.OnConfigurationChangedProvider)) {
            getHighSpeedVideoFpsRangesFor(new java.lang.IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (androidx.fragment.app.Fragment fragment : this.getInputFormats.getHighSpeedVideoFpsRangesFor()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.getHighSpeedVideoSizes(configuration, true);
                }
            }
        }
    }

    final void getHighSpeedVideoFpsRangesFor(boolean z) {
        if (z && (this.getHighSpeedVideoSizesFor instanceof androidx.core.content.OnTrimMemoryProvider)) {
            getHighSpeedVideoFpsRangesFor(new java.lang.IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (androidx.fragment.app.Fragment fragment : this.getInputFormats.getHighSpeedVideoFpsRangesFor()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.getHighSpeedVideoFpsRangesFor(true);
                }
            }
        }
    }

    final boolean getHighSpeedVideoFpsRanges(android.view.Menu menu, android.view.MenuInflater menuInflater) {
        if (this.getHighSpeedVideoSizes <= 0) {
            return false;
        }
        java.util.ArrayList<androidx.fragment.app.Fragment> arrayList = null;
        boolean z = false;
        for (androidx.fragment.app.Fragment fragment : this.getInputFormats.getHighSpeedVideoFpsRangesFor()) {
            if (fragment != null && getOutputStallDuration(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.unwrapAs != null) {
            for (int i = 0; i < this.unwrapAs.size(); i++) {
                androidx.fragment.app.Fragment fragment2 = this.unwrapAs.get(i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.unwrapAs = arrayList;
        return z;
    }

    final boolean getHighSpeedVideoFpsRangesFor(android.view.Menu menu) {
        boolean z = false;
        if (this.getHighSpeedVideoSizes <= 0) {
            return false;
        }
        for (androidx.fragment.app.Fragment fragment : this.getInputFormats.getHighSpeedVideoFpsRangesFor()) {
            if (fragment != null && getOutputStallDuration(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    final boolean Camera2StreamConfigurationMap(android.view.MenuItem menuItem) {
        if (this.getHighSpeedVideoSizes <= 0) {
            return false;
        }
        for (androidx.fragment.app.Fragment fragment : this.getInputFormats.getHighSpeedVideoFpsRangesFor()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    final boolean getHighResolutionOutputSizeshNQ4ISI(android.view.MenuItem menuItem) {
        if (this.getHighSpeedVideoSizes <= 0) {
            return false;
        }
        for (androidx.fragment.app.Fragment fragment : this.getInputFormats.getHighSpeedVideoFpsRangesFor()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    final void Camera2StreamConfigurationMap(android.view.Menu menu) {
        if (this.getHighSpeedVideoSizes <= 0) {
            return;
        }
        for (androidx.fragment.app.Fragment fragment : this.getInputFormats.getHighSpeedVideoFpsRangesFor()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    final void getOutputSizes(androidx.fragment.app.Fragment fragment) {
        if (fragment != null && (!fragment.equals(getHighSpeedVideoSizes(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this))) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not an active fragment of FragmentManager ");
            sb.append(this);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        androidx.fragment.app.Fragment fragment2 = this.getOutputSizeshNQ4ISI;
        this.getOutputSizeshNQ4ISI = fragment;
        isOutputSupportedFor(fragment2);
        isOutputSupportedFor(this.getOutputSizeshNQ4ISI);
    }

    private void isOutputSupportedFor(androidx.fragment.app.Fragment fragment) {
        if (fragment == null || !fragment.equals(getHighSpeedVideoSizes(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    final void getInputFormats() {
        getHighSpeedVideoFpsRanges();
        isOutputSupportedFor(this.getOutputSizeshNQ4ISI);
    }

    public androidx.fragment.app.Fragment getPrimaryNavigationFragment() {
        return this.getOutputSizeshNQ4ISI;
    }

    final void getHighSpeedVideoFpsRangesFor(androidx.fragment.app.Fragment fragment, androidx.lifecycle.Lifecycle.State state) {
        if (!fragment.equals(getHighSpeedVideoSizes(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not an active fragment of FragmentManager ");
            sb.append(this);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        fragment.mMaxState = state;
    }

    public void setFragmentFactory(androidx.fragment.app.FragmentFactory fragmentFactory) {
        this.coroutineBoundary = fragmentFactory;
    }

    public androidx.fragment.app.FragmentFactory getFragmentFactory() {
        androidx.fragment.app.FragmentFactory fragmentFactory = this.coroutineBoundary;
        if (fragmentFactory != null) {
            return fragmentFactory;
        }
        androidx.fragment.app.Fragment fragment = this.AMEXKernela;
        if (fragment != null) {
            return fragment.mFragmentManager.getFragmentFactory();
        }
        return this._BOUNDARY;
    }

    final androidx.fragment.app.SpecialEffectsControllerFactory isOutputSupportedForhNQ4ISI() {
        androidx.fragment.app.FragmentManager fragmentManager = this;
        while (true) {
            androidx.fragment.app.SpecialEffectsControllerFactory specialEffectsControllerFactory = fragmentManager.release;
            if (specialEffectsControllerFactory != null) {
                return specialEffectsControllerFactory;
            }
            androidx.fragment.app.Fragment fragment = fragmentManager.AMEXKernela;
            if (fragment != null) {
                fragmentManager = fragment.mFragmentManager;
            } else {
                return fragmentManager.isOutputSupportedForhNQ4ISI;
            }
        }
    }

    final androidx.fragment.app.FragmentLifecycleCallbacksDispatcher getValidOutputFormatsForInputhNQ4ISI() {
        return this.f2737a;
    }

    public void registerFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z) {
        this.f2737a.registerFragmentLifecycleCallbacks(fragmentLifecycleCallbacks, z);
    }

    public void unregisterFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        this.f2737a.unregisterFragmentLifecycleCallbacks(fragmentLifecycleCallbacks);
    }

    public void addFragmentOnAttachListener(androidx.fragment.app.FragmentOnAttachListener fragmentOnAttachListener) {
        this.AMEXKernel.add(fragmentOnAttachListener);
    }

    final void getHighSpeedVideoSizesFor(androidx.fragment.app.Fragment fragment) {
        java.util.Iterator<androidx.fragment.app.FragmentOnAttachListener> it = this.AMEXKernel.iterator();
        while (it.hasNext()) {
            it.next().onAttachFragment(this, fragment);
        }
    }

    public void removeFragmentOnAttachListener(androidx.fragment.app.FragmentOnAttachListener fragmentOnAttachListener) {
        this.AMEXKernel.remove(fragmentOnAttachListener);
    }

    final void getOutputFormats() {
        for (androidx.fragment.app.Fragment fragment : this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.getOutputFormats();
            }
        }
    }

    private boolean c() {
        boolean z = false;
        for (androidx.fragment.app.Fragment fragment : this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI()) {
            if (fragment != null) {
                z = getHighSpeedVideoSizes(fragment);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    static boolean getHighSpeedVideoSizes(androidx.fragment.app.Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.c();
    }

    final boolean Camera2StreamConfigurationMap() {
        androidx.fragment.app.Fragment fragment = this.AMEXKernela;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.AMEXKernela.getParentFragmentManager().Camera2StreamConfigurationMap();
    }

    final android.view.LayoutInflater.Factory2 isOutputSupportedFor() {
        return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
    }

    public androidx.fragment.app.strictmode.FragmentStrictMode.Policy getStrictModePolicy() {
        return this.l;
    }

    public void setStrictModePolicy(androidx.fragment.app.strictmode.FragmentStrictMode.Policy policy) {
        this.l = policy;
    }

    /* loaded from: classes3.dex */
    class PopBackStackState implements androidx.fragment.app.FragmentManager.OpGenerator {
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        final int getHighSpeedVideoFpsRangesFor;

        PopBackStackState(java.lang.String str, int i, int i2) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoFpsRanges = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean getHighSpeedVideoFpsRanges(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2) {
            if (androidx.fragment.app.FragmentManager.this.getOutputSizeshNQ4ISI == null || this.getHighSpeedVideoFpsRangesFor >= 0 || this.getHighResolutionOutputSizeshNQ4ISI != null || !androidx.fragment.app.FragmentManager.this.getOutputSizeshNQ4ISI.getChildFragmentManager().popBackStackImmediate()) {
                return androidx.fragment.app.FragmentManager.this.Camera2StreamConfigurationMap(arrayList, arrayList2, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            }
            return false;
        }
    }

    /* loaded from: classes7.dex */
    class RestoreBackStackState implements androidx.fragment.app.FragmentManager.OpGenerator {
        private final java.lang.String getHighSpeedVideoFpsRanges;

        RestoreBackStackState(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean getHighSpeedVideoFpsRanges(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2) {
            return androidx.fragment.app.FragmentManager.this.getHighSpeedVideoSizes(arrayList, arrayList2, this.getHighSpeedVideoFpsRanges);
        }
    }

    /* loaded from: classes7.dex */
    class SaveBackStackState implements androidx.fragment.app.FragmentManager.OpGenerator {
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        SaveBackStackState(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean getHighSpeedVideoFpsRanges(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2) {
            return androidx.fragment.app.FragmentManager.this.Camera2StreamConfigurationMap(arrayList, arrayList2, this.getHighSpeedVideoFpsRangesFor);
        }
    }

    /* loaded from: classes7.dex */
    class ClearBackStackState implements androidx.fragment.app.FragmentManager.OpGenerator {
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        ClearBackStackState(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = str;
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean getHighSpeedVideoFpsRanges(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2) {
            androidx.fragment.app.FragmentManager fragmentManager = androidx.fragment.app.FragmentManager.this;
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            if (fragmentManager.getHighSpeedVideoSizes(arrayList, arrayList2, str)) {
                return fragmentManager.Camera2StreamConfigurationMap(arrayList, arrayList2, str, -1, 1);
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    class PrepareBackStackTransitionState implements androidx.fragment.app.FragmentManager.OpGenerator {
        PrepareBackStackTransitionState() {
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public final boolean getHighSpeedVideoFpsRanges(java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList, java.util.ArrayList<java.lang.Boolean> arrayList2) {
            boolean Camera2StreamConfigurationMap;
            androidx.fragment.app.FragmentManager fragmentManager = androidx.fragment.app.FragmentManager.this;
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                java.util.ArrayList<androidx.fragment.app.FragmentManager.OpGenerator> arrayList3 = fragmentManager.getOutputSizes;
            }
            if (fragmentManager.getHighSpeedVideoFpsRanges.isEmpty()) {
                Camera2StreamConfigurationMap = false;
            } else {
                java.util.ArrayList<androidx.fragment.app.BackStackRecord> arrayList4 = fragmentManager.getHighSpeedVideoFpsRanges;
                androidx.fragment.app.BackStackRecord backStackRecord = arrayList4.get(arrayList4.size() - 1);
                fragmentManager.getOutputMinFrameDurationlomOqCM = backStackRecord;
                java.util.Iterator<androidx.fragment.app.FragmentTransaction.Op> it = backStackRecord.getOutputSizeshNQ4ISI.iterator();
                while (it.hasNext()) {
                    androidx.fragment.app.FragmentTransaction.Op next = it.next();
                    if (next.getHighSpeedVideoFpsRanges != null) {
                        next.getHighSpeedVideoFpsRanges.mTransitioning = true;
                    }
                }
                Camera2StreamConfigurationMap = fragmentManager.Camera2StreamConfigurationMap(arrayList, arrayList2, null, -1, 0);
            }
            if (!androidx.fragment.app.FragmentManager.this.getHighSpeedVideoFpsRangesFor.isEmpty() && arrayList.size() > 0) {
                boolean booleanValue = arrayList2.get(arrayList.size() - 1).booleanValue();
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                java.util.Iterator<androidx.fragment.app.BackStackRecord> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.addAll(androidx.fragment.app.FragmentManager.getHighSpeedVideoFpsRangesFor(it2.next()));
                }
                java.util.Iterator<androidx.fragment.app.FragmentManager.OnBackStackChangedListener> it3 = androidx.fragment.app.FragmentManager.this.getHighSpeedVideoFpsRangesFor.iterator();
                while (it3.hasNext()) {
                    androidx.fragment.app.FragmentManager.OnBackStackChangedListener next2 = it3.next();
                    java.util.Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        next2.onBackStackChangeStarted((androidx.fragment.app.Fragment) it4.next(), booleanValue);
                    }
                }
            }
            return Camera2StreamConfigurationMap;
        }
    }

    /* loaded from: classes3.dex */
    static class LaunchedFragmentInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> CREATOR = new android.os.Parcelable.Creator<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo>() { // from class: androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ androidx.fragment.app.FragmentManager.LaunchedFragmentInfo createFromParcel(android.os.Parcel parcel) {
                return new androidx.fragment.app.FragmentManager.LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.fragment.app.FragmentManager.LaunchedFragmentInfo[] newArray(int i) {
                return new androidx.fragment.app.FragmentManager.LaunchedFragmentInfo[i];
            }
        };
        int Camera2StreamConfigurationMap;
        java.lang.String getHighSpeedVideoFpsRanges;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        LaunchedFragmentInfo(java.lang.String str, int i) {
            this.getHighSpeedVideoFpsRanges = str;
            this.Camera2StreamConfigurationMap = i;
        }

        LaunchedFragmentInfo(android.os.Parcel parcel) {
            this.getHighSpeedVideoFpsRanges = parcel.readString();
            this.Camera2StreamConfigurationMap = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeString(this.getHighSpeedVideoFpsRanges);
            parcel.writeInt(this.Camera2StreamConfigurationMap);
        }
    }

    /* loaded from: classes3.dex */
    static class FragmentIntentSenderContract extends androidx.view.result.contract.ActivityResultContract<androidx.view.result.IntentSenderRequest, androidx.view.result.ActivityResult> {
        FragmentIntentSenderContract() {
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public /* synthetic */ android.content.Intent createIntent(android.content.Context context, androidx.view.result.IntentSenderRequest intentSenderRequest) {
            android.os.Bundle bundleExtra;
            androidx.view.result.IntentSenderRequest intentSenderRequest2 = intentSenderRequest;
            android.content.Intent intent = new android.content.Intent(androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST);
            android.content.Intent fillInIntent = intentSenderRequest2.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra(androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) != null) {
                intent.putExtra(androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundleExtra);
                fillInIntent.removeExtra(androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
                if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest2 = new androidx.activity.result.IntentSenderRequest.Builder(intentSenderRequest2.getIntentSender()).setFillInIntent(null).setFlags(intentSenderRequest2.getFlagsValues(), intentSenderRequest2.getFlagsMask()).build();
                }
            }
            intent.putExtra(androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST, intentSenderRequest2);
            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
            return intent;
        }

        @Override // androidx.view.result.contract.ActivityResultContract
        public /* synthetic */ androidx.view.result.ActivityResult parseResult(int i, android.content.Intent intent) {
            return new androidx.view.result.ActivityResult(i, intent);
        }
    }
}
