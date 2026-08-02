package androidx.fragment.app;

/* loaded from: classes3.dex */
class FragmentStateManager {
    private final androidx.fragment.app.FragmentStore Camera2StreamConfigurationMap;
    private final androidx.fragment.app.FragmentLifecycleCallbacksDispatcher getHighSpeedVideoFpsRangesFor;
    final androidx.fragment.app.Fragment getHighSpeedVideoSizes;
    private boolean getHighSpeedVideoFpsRanges = false;
    private int getHighResolutionOutputSizeshNQ4ISI = -1;

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, androidx.fragment.app.FragmentStore fragmentStore, androidx.fragment.app.Fragment fragment) {
        this.getHighSpeedVideoFpsRangesFor = fragmentLifecycleCallbacksDispatcher;
        this.Camera2StreamConfigurationMap = fragmentStore;
        this.getHighSpeedVideoSizes = fragment;
    }

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, androidx.fragment.app.FragmentStore fragmentStore, java.lang.ClassLoader classLoader, androidx.fragment.app.FragmentFactory fragmentFactory, android.os.Bundle bundle) {
        this.getHighSpeedVideoFpsRangesFor = fragmentLifecycleCallbacksDispatcher;
        this.Camera2StreamConfigurationMap = fragmentStore;
        androidx.fragment.app.Fragment highSpeedVideoSizes = ((androidx.fragment.app.FragmentState) bundle.getParcelable("state")).getHighSpeedVideoSizes(fragmentFactory, classLoader);
        this.getHighSpeedVideoSizes = highSpeedVideoSizes;
        highSpeedVideoSizes.mSavedFragmentState = bundle;
        android.os.Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        highSpeedVideoSizes.setArguments(bundle2);
        androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
    }

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher, androidx.fragment.app.FragmentStore fragmentStore, androidx.fragment.app.Fragment fragment, android.os.Bundle bundle) {
        this.getHighSpeedVideoFpsRangesFor = fragmentLifecycleCallbacksDispatcher;
        this.Camera2StreamConfigurationMap = fragmentStore;
        this.getHighSpeedVideoSizes = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        fragment.mTargetWho = fragment.mTarget != null ? fragment.mTarget.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }

    final androidx.fragment.app.Fragment Camera2StreamConfigurationMap() {
        return this.getHighSpeedVideoSizes;
    }

    final void getHighResolutionOutputSizeshNQ4ISI(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    private int getOutputFormats() {
        if (this.getHighSpeedVideoSizes.mFragmentManager == null) {
            return this.getHighSpeedVideoSizes.mState;
        }
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.getHighSpeedVideoSizes[this.getHighSpeedVideoSizes.mMaxState.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = java.lang.Math.min(i, 5);
            } else if (i2 == 3) {
                i = java.lang.Math.min(i, 1);
            } else if (i2 == 4) {
                i = java.lang.Math.min(i, 0);
            } else {
                i = java.lang.Math.min(i, -1);
            }
        }
        if (this.getHighSpeedVideoSizes.mFromLayout) {
            if (this.getHighSpeedVideoSizes.mInLayout) {
                i = java.lang.Math.max(this.getHighResolutionOutputSizeshNQ4ISI, 2);
                if (this.getHighSpeedVideoSizes.mView != null && this.getHighSpeedVideoSizes.mView.getParent() == null) {
                    i = java.lang.Math.min(i, 2);
                }
            } else {
                i = this.getHighResolutionOutputSizeshNQ4ISI < 4 ? java.lang.Math.min(i, this.getHighSpeedVideoSizes.mState) : java.lang.Math.min(i, 1);
            }
        }
        if (this.getHighSpeedVideoSizes.mInDynamicContainer && this.getHighSpeedVideoSizes.mContainer == null) {
            i = java.lang.Math.min(i, 4);
        }
        if (!this.getHighSpeedVideoSizes.mAdded) {
            i = java.lang.Math.min(i, 1);
        }
        androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact awaitingCompletionLifecycleImpact = this.getHighSpeedVideoSizes.mContainer != null ? androidx.fragment.app.SpecialEffectsController.getOrCreateController(this.getHighSpeedVideoSizes.mContainer, this.getHighSpeedVideoSizes.getParentFragmentManager()).getAwaitingCompletionLifecycleImpact(this) : null;
        if (awaitingCompletionLifecycleImpact == androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            i = java.lang.Math.min(i, 6);
        } else if (awaitingCompletionLifecycleImpact == androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            i = java.lang.Math.max(i, 3);
        } else if (this.getHighSpeedVideoSizes.mRemoving) {
            if (this.getHighSpeedVideoSizes.isInBackStack()) {
                i = java.lang.Math.min(i, 1);
            } else {
                i = java.lang.Math.min(i, -1);
            }
        }
        if (this.getHighSpeedVideoSizes.mDeferStart && this.getHighSpeedVideoSizes.mState < 5) {
            i = java.lang.Math.min(i, 4);
        }
        if (this.getHighSpeedVideoSizes.mTransitioning) {
            i = java.lang.Math.max(i, 3);
        }
        androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
        return i;
    }

    /* renamed from: androidx.fragment.app.FragmentStateManager$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[androidx.lifecycle.Lifecycle.State.values().length];
            getHighSpeedVideoSizes = iArr;
            try {
                iArr[androidx.lifecycle.Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoSizes[androidx.lifecycle.Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoSizes[androidx.lifecycle.Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoSizes[androidx.lifecycle.Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    final void getHighSpeedVideoFpsRanges() {
        if (this.getHighSpeedVideoFpsRanges) {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                Camera2StreamConfigurationMap();
                return;
            }
            return;
        }
        try {
            this.getHighSpeedVideoFpsRanges = true;
            boolean z = false;
            while (true) {
                int outputFormats = getOutputFormats();
                if (outputFormats != this.getHighSpeedVideoSizes.mState) {
                    if (outputFormats > this.getHighSpeedVideoSizes.mState) {
                        switch (this.getHighSpeedVideoSizes.mState + 1) {
                            case 0:
                                getOutputMinFrameDuration();
                                break;
                            case 1:
                                getHighSpeedVideoSizesFor();
                                break;
                            case 2:
                                getHighResolutionOutputSizeshNQ4ISI();
                                getInputFormats();
                                break;
                            case 3:
                                getInputSizeshNQ4ISI();
                                break;
                            case 4:
                                if (this.getHighSpeedVideoSizes.mView != null && this.getHighSpeedVideoSizes.mContainer != null) {
                                    androidx.fragment.app.SpecialEffectsController.getOrCreateController(this.getHighSpeedVideoSizes.mContainer, this.getHighSpeedVideoSizes.getParentFragmentManager()).enqueueAdd(androidx.fragment.app.SpecialEffectsController.Operation.State.from(this.getHighSpeedVideoSizes.mView.getVisibility()), this);
                                }
                                this.getHighSpeedVideoSizes.mState = 4;
                                break;
                            case 5:
                                isOutputSupportedFor();
                                break;
                            case 6:
                                this.getHighSpeedVideoSizes.mState = 6;
                                break;
                            case 7:
                                getOutputMinFrameDurationlomOqCM();
                                break;
                        }
                    } else {
                        switch (this.getHighSpeedVideoSizes.mState - 1) {
                            case -1:
                                getOutputSizes();
                                break;
                            case 0:
                                if (this.getHighSpeedVideoSizes.mBeingSaved) {
                                    if (this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes.get(this.getHighSpeedVideoSizes.mWho) == null) {
                                        this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes.put(this.getHighSpeedVideoSizes.mWho, getHighSpeedVideoFpsRangesFor());
                                    }
                                }
                                getOutputSizeshNQ4ISI();
                                break;
                            case 1:
                                getOutputStallDurationlomOqCM();
                                this.getHighSpeedVideoSizes.mState = 1;
                                break;
                            case 2:
                                this.getHighSpeedVideoSizes.mInLayout = false;
                                this.getHighSpeedVideoSizes.mState = 2;
                                break;
                            case 3:
                                androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
                                if (this.getHighSpeedVideoSizes.mBeingSaved) {
                                    this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes.put(this.getHighSpeedVideoSizes.mWho, getHighSpeedVideoFpsRangesFor());
                                } else if (this.getHighSpeedVideoSizes.mView != null && this.getHighSpeedVideoSizes.mSavedViewState == null) {
                                    getValidOutputFormatsForInputhNQ4ISI();
                                }
                                if (this.getHighSpeedVideoSizes.mView != null && this.getHighSpeedVideoSizes.mContainer != null) {
                                    androidx.fragment.app.SpecialEffectsController.getOrCreateController(this.getHighSpeedVideoSizes.mContainer, this.getHighSpeedVideoSizes.getParentFragmentManager()).enqueueRemove(this);
                                }
                                this.getHighSpeedVideoSizes.mState = 3;
                                break;
                            case 4:
                                unwrapAs();
                                break;
                            case 5:
                                this.getHighSpeedVideoSizes.mState = 5;
                                break;
                            case 6:
                                getOutputStallDuration();
                                break;
                        }
                    }
                    z = true;
                } else {
                    if (!z && this.getHighSpeedVideoSizes.mState == -1 && this.getHighSpeedVideoSizes.mRemoving && !this.getHighSpeedVideoSizes.isInBackStack() && !this.getHighSpeedVideoSizes.mBeingSaved) {
                        androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
                        androidx.fragment.app.FragmentManagerViewModel highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes();
                        androidx.fragment.app.Fragment fragment = this.getHighSpeedVideoSizes;
                        androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
                        highSpeedVideoSizes.getHighSpeedVideoFpsRanges(fragment.mWho, true);
                        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(this);
                        androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
                        this.getHighSpeedVideoSizes.initState();
                    }
                    if (this.getHighSpeedVideoSizes.mHiddenChanged) {
                        if (this.getHighSpeedVideoSizes.mView != null && this.getHighSpeedVideoSizes.mContainer != null) {
                            androidx.fragment.app.SpecialEffectsController orCreateController = androidx.fragment.app.SpecialEffectsController.getOrCreateController(this.getHighSpeedVideoSizes.mContainer, this.getHighSpeedVideoSizes.getParentFragmentManager());
                            if (this.getHighSpeedVideoSizes.mHidden) {
                                orCreateController.enqueueHide(this);
                            } else {
                                orCreateController.enqueueShow(this);
                            }
                        }
                        if (this.getHighSpeedVideoSizes.mFragmentManager != null) {
                            androidx.fragment.app.FragmentManager fragmentManager = this.getHighSpeedVideoSizes.mFragmentManager;
                            androidx.fragment.app.Fragment fragment2 = this.getHighSpeedVideoSizes;
                            if (fragment2.mAdded && androidx.fragment.app.FragmentManager.getHighSpeedVideoSizes(fragment2)) {
                                fragmentManager.getInputSizeshNQ4ISI = true;
                            }
                        }
                        this.getHighSpeedVideoSizes.mHiddenChanged = false;
                        androidx.fragment.app.Fragment fragment3 = this.getHighSpeedVideoSizes;
                        fragment3.onHiddenChanged(fragment3.mHidden);
                        this.getHighSpeedVideoSizes.mChildFragmentManager.getOutputFormats();
                    }
                    return;
                }
            }
        } finally {
            this.getHighSpeedVideoFpsRanges = false;
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getHighSpeedVideoSizes.mFromLayout && this.getHighSpeedVideoSizes.mInLayout && !this.getHighSpeedVideoSizes.mPerformedCreateView) {
            androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
            android.os.Bundle bundle = this.getHighSpeedVideoSizes.mSavedFragmentState != null ? this.getHighSpeedVideoSizes.mSavedFragmentState.getBundle("savedInstanceState") : null;
            androidx.fragment.app.Fragment fragment = this.getHighSpeedVideoSizes;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle), null, bundle);
            if (this.getHighSpeedVideoSizes.mView != null) {
                this.getHighSpeedVideoSizes.mView.setSaveFromParentEnabled(false);
                this.getHighSpeedVideoSizes.mView.setTag(androidx.fragment.R.id.fragment_container_view_tag, this.getHighSpeedVideoSizes);
                if (this.getHighSpeedVideoSizes.mHidden) {
                    this.getHighSpeedVideoSizes.mView.setVisibility(8);
                }
                this.getHighSpeedVideoSizes.performViewCreated();
                androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.getHighSpeedVideoFpsRangesFor;
                androidx.fragment.app.Fragment fragment2 = this.getHighSpeedVideoSizes;
                fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentViewCreated(fragment2, fragment2.mView, bundle, false);
                this.getHighSpeedVideoSizes.mState = 2;
            }
        }
    }

    final void Camera2StreamConfigurationMap(java.lang.ClassLoader classLoader) {
        if (this.getHighSpeedVideoSizes.mSavedFragmentState != null) {
            this.getHighSpeedVideoSizes.mSavedFragmentState.setClassLoader(classLoader);
            if (this.getHighSpeedVideoSizes.mSavedFragmentState.getBundle("savedInstanceState") == null) {
                this.getHighSpeedVideoSizes.mSavedFragmentState.putBundle("savedInstanceState", new android.os.Bundle());
            }
            try {
                androidx.fragment.app.Fragment fragment = this.getHighSpeedVideoSizes;
                fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
                androidx.fragment.app.Fragment fragment2 = this.getHighSpeedVideoSizes;
                fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("viewRegistryState");
                androidx.fragment.app.FragmentState fragmentState = (androidx.fragment.app.FragmentState) this.getHighSpeedVideoSizes.mSavedFragmentState.getParcelable("state");
                if (fragmentState != null) {
                    this.getHighSpeedVideoSizes.mTargetWho = fragmentState.getOutputSizes;
                    this.getHighSpeedVideoSizes.mTargetRequestCode = fragmentState.getOutputStallDuration;
                    if (this.getHighSpeedVideoSizes.mSavedUserVisibleHint != null) {
                        androidx.fragment.app.Fragment fragment3 = this.getHighSpeedVideoSizes;
                        fragment3.mUserVisibleHint = fragment3.mSavedUserVisibleHint.booleanValue();
                        this.getHighSpeedVideoSizes.mSavedUserVisibleHint = null;
                    } else {
                        this.getHighSpeedVideoSizes.mUserVisibleHint = fragmentState.getOutputMinFrameDurationlomOqCM;
                    }
                }
                if (this.getHighSpeedVideoSizes.mUserVisibleHint) {
                    return;
                }
                this.getHighSpeedVideoSizes.mDeferStart = true;
            } catch (android.os.BadParcelableException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to restore view hierarchy state for fragment ");
                sb.append(Camera2StreamConfigurationMap());
                throw new java.lang.IllegalStateException(sb.toString(), e);
            }
        }
    }

    private void getOutputMinFrameDuration() {
        androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
        androidx.fragment.app.FragmentStateManager fragmentStateManager = null;
        if (this.getHighSpeedVideoSizes.mTarget != null) {
            androidx.fragment.app.FragmentStateManager highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.mTarget.mWho);
            if (highSpeedVideoSizes == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Fragment ");
                sb.append(this.getHighSpeedVideoSizes);
                sb.append(" declared target fragment ");
                sb.append(this.getHighSpeedVideoSizes.mTarget);
                sb.append(" that does not belong to this FragmentManager!");
                throw new java.lang.IllegalStateException(sb.toString());
            }
            androidx.fragment.app.Fragment fragment = this.getHighSpeedVideoSizes;
            fragment.mTargetWho = fragment.mTarget.mWho;
            this.getHighSpeedVideoSizes.mTarget = null;
            fragmentStateManager = highSpeedVideoSizes;
        } else if (this.getHighSpeedVideoSizes.mTargetWho != null && (fragmentStateManager = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.mTargetWho)) == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Fragment ");
            sb2.append(this.getHighSpeedVideoSizes);
            sb2.append(" declared target fragment ");
            sb2.append(this.getHighSpeedVideoSizes.mTargetWho);
            sb2.append(" that does not belong to this FragmentManager!");
            throw new java.lang.IllegalStateException(sb2.toString());
        }
        if (fragmentStateManager != null) {
            fragmentStateManager.getHighSpeedVideoFpsRanges();
        }
        androidx.fragment.app.Fragment fragment2 = this.getHighSpeedVideoSizes;
        fragment2.mHost = fragment2.mFragmentManager.getHost();
        androidx.fragment.app.Fragment fragment3 = this.getHighSpeedVideoSizes;
        fragment3.mParentFragment = fragment3.mFragmentManager.unwrapAs();
        this.getHighSpeedVideoFpsRangesFor.dispatchOnFragmentPreAttached(this.getHighSpeedVideoSizes, false);
        this.getHighSpeedVideoSizes.performAttach();
        this.getHighSpeedVideoFpsRangesFor.dispatchOnFragmentAttached(this.getHighSpeedVideoSizes, false);
    }

    private void getHighSpeedVideoSizesFor() {
        androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
        android.os.Bundle bundle = this.getHighSpeedVideoSizes.mSavedFragmentState != null ? this.getHighSpeedVideoSizes.mSavedFragmentState.getBundle("savedInstanceState") : null;
        if (!this.getHighSpeedVideoSizes.mIsCreated) {
            this.getHighSpeedVideoFpsRangesFor.dispatchOnFragmentPreCreated(this.getHighSpeedVideoSizes, bundle, false);
            this.getHighSpeedVideoSizes.performCreate(bundle);
            this.getHighSpeedVideoFpsRangesFor.dispatchOnFragmentCreated(this.getHighSpeedVideoSizes, bundle, false);
        } else {
            this.getHighSpeedVideoSizes.mState = 1;
            this.getHighSpeedVideoSizes.restoreChildFragmentState();
        }
    }

    private void getInputFormats() {
        java.lang.String str;
        if (this.getHighSpeedVideoSizes.mFromLayout) {
            return;
        }
        androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
        android.view.ViewGroup viewGroup = null;
        android.os.Bundle bundle = this.getHighSpeedVideoSizes.mSavedFragmentState != null ? this.getHighSpeedVideoSizes.mSavedFragmentState.getBundle("savedInstanceState") : null;
        android.view.LayoutInflater performGetLayoutInflater = this.getHighSpeedVideoSizes.performGetLayoutInflater(bundle);
        if (this.getHighSpeedVideoSizes.mContainer != null) {
            viewGroup = this.getHighSpeedVideoSizes.mContainer;
        } else if (this.getHighSpeedVideoSizes.mContainerId != 0) {
            if (this.getHighSpeedVideoSizes.mContainerId == -1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot create fragment ");
                sb.append(this.getHighSpeedVideoSizes);
                sb.append(" for a container view with no id");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            viewGroup = (android.view.ViewGroup) this.getHighSpeedVideoSizes.mFragmentManager.getOutputSizes().onFindViewById(this.getHighSpeedVideoSizes.mContainerId);
            if (viewGroup == null) {
                if (!this.getHighSpeedVideoSizes.mRestored && !this.getHighSpeedVideoSizes.mInDynamicContainer) {
                    try {
                        str = this.getHighSpeedVideoSizes.getResources().getResourceName(this.getHighSpeedVideoSizes.mContainerId);
                    } catch (android.content.res.Resources.NotFoundException unused) {
                        str = "unknown";
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("No view found for id 0x");
                    sb2.append(java.lang.Integer.toHexString(this.getHighSpeedVideoSizes.mContainerId));
                    sb2.append(" (");
                    sb2.append(str);
                    sb2.append(") for fragment ");
                    sb2.append(this.getHighSpeedVideoSizes);
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
            } else if (!(viewGroup instanceof androidx.fragment.app.FragmentContainerView)) {
                androidx.fragment.app.strictmode.FragmentStrictMode.onWrongFragmentContainer(this.getHighSpeedVideoSizes, viewGroup);
            }
        }
        this.getHighSpeedVideoSizes.mContainer = viewGroup;
        this.getHighSpeedVideoSizes.performCreateView(performGetLayoutInflater, viewGroup, bundle);
        if (this.getHighSpeedVideoSizes.mView != null) {
            androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
            this.getHighSpeedVideoSizes.mView.setSaveFromParentEnabled(false);
            this.getHighSpeedVideoSizes.mView.setTag(androidx.fragment.R.id.fragment_container_view_tag, this.getHighSpeedVideoSizes);
            if (viewGroup != null) {
                getHighSpeedVideoSizes();
            }
            if (this.getHighSpeedVideoSizes.mHidden) {
                this.getHighSpeedVideoSizes.mView.setVisibility(8);
            }
            if (this.getHighSpeedVideoSizes.mView.isAttachedToWindow()) {
                androidx.core.view.ViewCompat.requestApplyInsets(this.getHighSpeedVideoSizes.mView);
            } else {
                final android.view.View view = this.getHighSpeedVideoSizes.mView;
                view.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: androidx.fragment.app.FragmentStateManager.1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(android.view.View view2) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(android.view.View view2) {
                        view.removeOnAttachStateChangeListener(this);
                        androidx.core.view.ViewCompat.requestApplyInsets(view);
                    }
                });
            }
            this.getHighSpeedVideoSizes.performViewCreated();
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher fragmentLifecycleCallbacksDispatcher = this.getHighSpeedVideoFpsRangesFor;
            androidx.fragment.app.Fragment fragment = this.getHighSpeedVideoSizes;
            fragmentLifecycleCallbacksDispatcher.dispatchOnFragmentViewCreated(fragment, fragment.mView, bundle, false);
            int visibility = this.getHighSpeedVideoSizes.mView.getVisibility();
            this.getHighSpeedVideoSizes.setPostOnViewCreatedAlpha(this.getHighSpeedVideoSizes.mView.getAlpha());
            if (this.getHighSpeedVideoSizes.mContainer != null && visibility == 0) {
                android.view.View findFocus = this.getHighSpeedVideoSizes.mView.findFocus();
                if (findFocus != null) {
                    this.getHighSpeedVideoSizes.setFocusedView(findFocus);
                    androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                }
                this.getHighSpeedVideoSizes.mView.setAlpha(0.0f);
            }
        }
        this.getHighSpeedVideoSizes.mState = 2;
    }

    private void getInputSizeshNQ4ISI() {
        androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
        android.os.Bundle bundle = this.getHighSpeedVideoSizes.mSavedFragmentState != null ? this.getHighSpeedVideoSizes.mSavedFragmentState.getBundle("savedInstanceState") : null;
        this.getHighSpeedVideoSizes.performActivityCreated(bundle);
        this.getHighSpeedVideoFpsRangesFor.dispatchOnFragmentActivityCreated(this.getHighSpeedVideoSizes, bundle, false);
    }

    private void isOutputSupportedFor() {
        androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
        this.getHighSpeedVideoSizes.performStart();
        this.getHighSpeedVideoFpsRangesFor.dispatchOnFragmentStarted(this.getHighSpeedVideoSizes, false);
    }

    private void getOutputMinFrameDurationlomOqCM() {
        androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
        android.view.View focusedView = this.getHighSpeedVideoSizes.getFocusedView();
        if (focusedView != null && getHighSpeedVideoSizes(focusedView)) {
            focusedView.requestFocus();
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                this.getHighSpeedVideoSizes.mView.findFocus();
            }
        }
        this.getHighSpeedVideoSizes.setFocusedView(null);
        this.getHighSpeedVideoSizes.performResume();
        this.getHighSpeedVideoFpsRangesFor.dispatchOnFragmentResumed(this.getHighSpeedVideoSizes, false);
        androidx.fragment.app.FragmentStore fragmentStore = this.Camera2StreamConfigurationMap;
        fragmentStore.getHighSpeedVideoSizes.remove(this.getHighSpeedVideoSizes.mWho);
        this.getHighSpeedVideoSizes.mSavedFragmentState = null;
        this.getHighSpeedVideoSizes.mSavedViewState = null;
        this.getHighSpeedVideoSizes.mSavedViewRegistryState = null;
    }

    private boolean getHighSpeedVideoSizes(android.view.View view) {
        if (view == this.getHighSpeedVideoSizes.mView) {
            return true;
        }
        for (android.view.ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.getHighSpeedVideoSizes.mView) {
                return true;
            }
        }
        return false;
    }

    private void getOutputStallDuration() {
        androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
        this.getHighSpeedVideoSizes.performPause();
        this.getHighSpeedVideoFpsRangesFor.dispatchOnFragmentPaused(this.getHighSpeedVideoSizes, false);
    }

    private void unwrapAs() {
        androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
        this.getHighSpeedVideoSizes.performStop();
        this.getHighSpeedVideoFpsRangesFor.dispatchOnFragmentStopped(this.getHighSpeedVideoSizes, false);
    }

    final android.os.Bundle getHighSpeedVideoFpsRangesFor() {
        android.os.Bundle bundle = new android.os.Bundle();
        if (this.getHighSpeedVideoSizes.mState == -1 && this.getHighSpeedVideoSizes.mSavedFragmentState != null) {
            bundle.putAll(this.getHighSpeedVideoSizes.mSavedFragmentState);
        }
        bundle.putParcelable("state", new androidx.fragment.app.FragmentState(this.getHighSpeedVideoSizes));
        if (this.getHighSpeedVideoSizes.mState > 0) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            this.getHighSpeedVideoSizes.performSaveInstanceState(bundle2);
            if (!bundle2.isEmpty()) {
                bundle.putBundle("savedInstanceState", bundle2);
            }
            this.getHighSpeedVideoFpsRangesFor.dispatchOnFragmentSaveInstanceState(this.getHighSpeedVideoSizes, bundle2, false);
            android.os.Bundle bundle3 = new android.os.Bundle();
            this.getHighSpeedVideoSizes.mSavedStateRegistryController.performSave(bundle3);
            if (!bundle3.isEmpty()) {
                bundle.putBundle("registryState", bundle3);
            }
            android.os.Bundle CoroutineDebuggingKt = this.getHighSpeedVideoSizes.mChildFragmentManager.CoroutineDebuggingKt();
            if (!CoroutineDebuggingKt.isEmpty()) {
                bundle.putBundle("childFragmentManager", CoroutineDebuggingKt);
            }
            if (this.getHighSpeedVideoSizes.mView != null) {
                getValidOutputFormatsForInputhNQ4ISI();
            }
            if (this.getHighSpeedVideoSizes.mSavedViewState != null) {
                bundle.putSparseParcelableArray("viewState", this.getHighSpeedVideoSizes.mSavedViewState);
            }
            if (this.getHighSpeedVideoSizes.mSavedViewRegistryState != null) {
                bundle.putBundle("viewRegistryState", this.getHighSpeedVideoSizes.mSavedViewRegistryState);
            }
        }
        if (this.getHighSpeedVideoSizes.mArguments != null) {
            bundle.putBundle("arguments", this.getHighSpeedVideoSizes.mArguments);
        }
        return bundle;
    }

    private void getValidOutputFormatsForInputhNQ4ISI() {
        if (this.getHighSpeedVideoSizes.mView != null) {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                android.view.View view = this.getHighSpeedVideoSizes.mView;
            }
            android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
            this.getHighSpeedVideoSizes.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.getHighSpeedVideoSizes.mSavedViewState = sparseArray;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            this.getHighSpeedVideoSizes.mViewLifecycleOwner.getHighResolutionOutputSizeshNQ4ISI(bundle);
            if (bundle.isEmpty()) {
                return;
            }
            this.getHighSpeedVideoSizes.mSavedViewRegistryState = bundle;
        }
    }

    private void getOutputStallDurationlomOqCM() {
        androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
        if (this.getHighSpeedVideoSizes.mContainer != null && this.getHighSpeedVideoSizes.mView != null) {
            this.getHighSpeedVideoSizes.mContainer.removeView(this.getHighSpeedVideoSizes.mView);
        }
        this.getHighSpeedVideoSizes.performDestroyView();
        this.getHighSpeedVideoFpsRangesFor.dispatchOnFragmentViewDestroyed(this.getHighSpeedVideoSizes, false);
        this.getHighSpeedVideoSizes.mContainer = null;
        this.getHighSpeedVideoSizes.mView = null;
        this.getHighSpeedVideoSizes.mViewLifecycleOwner = null;
        this.getHighSpeedVideoSizes.mViewLifecycleOwnerLiveData.setValue(null);
        this.getHighSpeedVideoSizes.mInLayout = false;
    }

    private void getOutputSizeshNQ4ISI() {
        androidx.fragment.app.Fragment highSpeedVideoFpsRangesFor;
        androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
        boolean z = true;
        boolean z2 = this.getHighSpeedVideoSizes.mRemoving && !this.getHighSpeedVideoSizes.isInBackStack();
        if (z2 && !this.getHighSpeedVideoSizes.mBeingSaved) {
            this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes.remove(this.getHighSpeedVideoSizes.mWho);
        }
        if (z2 || this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes().getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes)) {
            androidx.fragment.app.FragmentHostCallback<?> fragmentHostCallback = this.getHighSpeedVideoSizes.mHost;
            if (fragmentHostCallback instanceof androidx.view.ViewModelStoreOwner) {
                z = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes().getHighSpeedVideoFpsRangesFor();
            } else if (fragmentHostCallback.getContext() instanceof android.app.Activity) {
                z = true ^ ((android.app.Activity) fragmentHostCallback.getContext()).isChangingConfigurations();
            }
            if ((z2 && !this.getHighSpeedVideoSizes.mBeingSaved) || z) {
                androidx.fragment.app.FragmentManagerViewModel highSpeedVideoSizes = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes();
                androidx.fragment.app.Fragment fragment = this.getHighSpeedVideoSizes;
                androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
                highSpeedVideoSizes.getHighSpeedVideoFpsRanges(fragment.mWho, false);
            }
            this.getHighSpeedVideoSizes.performDestroy();
            this.getHighSpeedVideoFpsRangesFor.dispatchOnFragmentDestroyed(this.getHighSpeedVideoSizes, false);
            for (androidx.fragment.app.FragmentStateManager fragmentStateManager : this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges()) {
                if (fragmentStateManager != null) {
                    androidx.fragment.app.Fragment Camera2StreamConfigurationMap = fragmentStateManager.Camera2StreamConfigurationMap();
                    if (this.getHighSpeedVideoSizes.mWho.equals(Camera2StreamConfigurationMap.mTargetWho)) {
                        Camera2StreamConfigurationMap.mTarget = this.getHighSpeedVideoSizes;
                        Camera2StreamConfigurationMap.mTargetWho = null;
                    }
                }
            }
            if (this.getHighSpeedVideoSizes.mTargetWho != null) {
                androidx.fragment.app.Fragment fragment2 = this.getHighSpeedVideoSizes;
                fragment2.mTarget = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(fragment2.mTargetWho);
            }
            this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(this);
            return;
        }
        if (this.getHighSpeedVideoSizes.mTargetWho != null && (highSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes.mTargetWho)) != null && highSpeedVideoFpsRangesFor.mRetainInstance) {
            this.getHighSpeedVideoSizes.mTarget = highSpeedVideoFpsRangesFor;
        }
        this.getHighSpeedVideoSizes.mState = 0;
    }

    private void getOutputSizes() {
        androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
        this.getHighSpeedVideoSizes.performDetach();
        this.getHighSpeedVideoFpsRangesFor.dispatchOnFragmentDetached(this.getHighSpeedVideoSizes, false);
        this.getHighSpeedVideoSizes.mState = -1;
        this.getHighSpeedVideoSizes.mHost = null;
        this.getHighSpeedVideoSizes.mParentFragment = null;
        this.getHighSpeedVideoSizes.mFragmentManager = null;
        if ((!this.getHighSpeedVideoSizes.mRemoving || this.getHighSpeedVideoSizes.isInBackStack()) && !this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes().getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes)) {
            return;
        }
        androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
        this.getHighSpeedVideoSizes.initState();
    }

    final void getHighSpeedVideoSizes() {
        androidx.fragment.app.Fragment highSpeedVideoFpsRangesFor = androidx.fragment.app.FragmentManager.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes.mContainer);
        androidx.fragment.app.Fragment parentFragment = this.getHighSpeedVideoSizes.getParentFragment();
        if (highSpeedVideoFpsRangesFor != null && !highSpeedVideoFpsRangesFor.equals(parentFragment)) {
            androidx.fragment.app.Fragment fragment = this.getHighSpeedVideoSizes;
            androidx.fragment.app.strictmode.FragmentStrictMode.onWrongNestedHierarchy(fragment, highSpeedVideoFpsRangesFor, fragment.mContainerId);
        }
        this.getHighSpeedVideoSizes.mContainer.addView(this.getHighSpeedVideoSizes.mView, this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes));
    }
}
