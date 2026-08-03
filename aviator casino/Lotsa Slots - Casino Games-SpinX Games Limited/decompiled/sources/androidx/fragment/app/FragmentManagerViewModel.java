package androidx.fragment.app;

/* loaded from: classes2.dex */
final class FragmentManagerViewModel extends androidx.lifecycle.ViewModel {
    private static final androidx.lifecycle.ViewModelProvider.Factory FACTORY = new androidx.lifecycle.ViewModelProvider.Factory() { // from class: androidx.fragment.app.FragmentManagerViewModel.1
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ androidx.lifecycle.ViewModel create(java.lang.Class cls, androidx.lifecycle.viewmodel.CreationExtras creationExtras) {
            return androidx.lifecycle.ViewModelProvider.Factory.CC.$default$create(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> cls) {
            return new androidx.fragment.app.FragmentManagerViewModel(true);
        }
    };
    private static final java.lang.String TAG = "FragmentManager";
    private final boolean mStateAutomaticallySaved;
    private final java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> mRetainedFragments = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> mChildNonConfigs = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> mViewModelStores = new java.util.HashMap<>();
    private boolean mHasBeenCleared = false;
    private boolean mHasSavedSnapshot = false;
    private boolean mIsStateSaved = false;

    static androidx.fragment.app.FragmentManagerViewModel getInstance(androidx.lifecycle.ViewModelStore viewModelStore) {
        return (androidx.fragment.app.FragmentManagerViewModel) new androidx.lifecycle.ViewModelProvider(viewModelStore, FACTORY).get(androidx.fragment.app.FragmentManagerViewModel.class);
    }

    FragmentManagerViewModel(boolean z) {
        this.mStateAutomaticallySaved = z;
    }

    void setIsStateSaved(boolean z) {
        this.mIsStateSaved = z;
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.mHasBeenCleared = true;
    }

    boolean isCleared() {
        return this.mHasBeenCleared;
    }

    void addRetainedFragment(androidx.fragment.app.Fragment fragment) {
        if (this.mIsStateSaved) {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                android.util.Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.mRetainedFragments.containsKey(fragment.mWho)) {
                return;
            }
            this.mRetainedFragments.put(fragment.mWho, fragment);
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                android.util.Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    androidx.fragment.app.Fragment findRetainedFragmentByWho(java.lang.String str) {
        return this.mRetainedFragments.get(str);
    }

    java.util.Collection<androidx.fragment.app.Fragment> getRetainedFragments() {
        return new java.util.ArrayList(this.mRetainedFragments.values());
    }

    boolean shouldDestroy(androidx.fragment.app.Fragment fragment) {
        if (!this.mRetainedFragments.containsKey(fragment.mWho)) {
            return true;
        }
        if (this.mStateAutomaticallySaved) {
            return this.mHasBeenCleared;
        }
        return !this.mHasSavedSnapshot;
    }

    void removeRetainedFragment(androidx.fragment.app.Fragment fragment) {
        if (this.mIsStateSaved) {
            if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                android.util.Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.mRetainedFragments.remove(fragment.mWho) == null || !androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                return;
            }
            android.util.Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    androidx.fragment.app.FragmentManagerViewModel getChildNonConfig(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.FragmentManagerViewModel fragmentManagerViewModel = this.mChildNonConfigs.get(fragment.mWho);
        if (fragmentManagerViewModel != null) {
            return fragmentManagerViewModel;
        }
        androidx.fragment.app.FragmentManagerViewModel fragmentManagerViewModel2 = new androidx.fragment.app.FragmentManagerViewModel(this.mStateAutomaticallySaved);
        this.mChildNonConfigs.put(fragment.mWho, fragmentManagerViewModel2);
        return fragmentManagerViewModel2;
    }

    androidx.lifecycle.ViewModelStore getViewModelStore(androidx.fragment.app.Fragment fragment) {
        androidx.lifecycle.ViewModelStore viewModelStore = this.mViewModelStores.get(fragment.mWho);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        androidx.lifecycle.ViewModelStore viewModelStore2 = new androidx.lifecycle.ViewModelStore();
        this.mViewModelStores.put(fragment.mWho, viewModelStore2);
        return viewModelStore2;
    }

    void clearNonConfigState(androidx.fragment.app.Fragment fragment) {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        clearNonConfigStateInternal(fragment.mWho);
    }

    void clearNonConfigState(java.lang.String str) {
        if (androidx.fragment.app.FragmentManager.isLoggingEnabled(3)) {
            android.util.Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        clearNonConfigStateInternal(str);
    }

    private void clearNonConfigStateInternal(java.lang.String str) {
        androidx.fragment.app.FragmentManagerViewModel fragmentManagerViewModel = this.mChildNonConfigs.get(str);
        if (fragmentManagerViewModel != null) {
            fragmentManagerViewModel.onCleared();
            this.mChildNonConfigs.remove(str);
        }
        androidx.lifecycle.ViewModelStore viewModelStore = this.mViewModelStores.get(str);
        if (viewModelStore != null) {
            viewModelStore.clear();
            this.mViewModelStores.remove(str);
        }
    }

    @java.lang.Deprecated
    void restoreFromSnapshot(androidx.fragment.app.FragmentManagerNonConfig fragmentManagerNonConfig) {
        this.mRetainedFragments.clear();
        this.mChildNonConfigs.clear();
        this.mViewModelStores.clear();
        if (fragmentManagerNonConfig != null) {
            java.util.Collection<androidx.fragment.app.Fragment> fragments = fragmentManagerNonConfig.getFragments();
            if (fragments != null) {
                for (androidx.fragment.app.Fragment fragment : fragments) {
                    if (fragment != null) {
                        this.mRetainedFragments.put(fragment.mWho, fragment);
                    }
                }
            }
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManagerNonConfig> childNonConfigs = fragmentManagerNonConfig.getChildNonConfigs();
            if (childNonConfigs != null) {
                for (java.util.Map.Entry<java.lang.String, androidx.fragment.app.FragmentManagerNonConfig> entry : childNonConfigs.entrySet()) {
                    androidx.fragment.app.FragmentManagerViewModel fragmentManagerViewModel = new androidx.fragment.app.FragmentManagerViewModel(this.mStateAutomaticallySaved);
                    fragmentManagerViewModel.restoreFromSnapshot(entry.getValue());
                    this.mChildNonConfigs.put(entry.getKey(), fragmentManagerViewModel);
                }
            }
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> viewModelStores = fragmentManagerNonConfig.getViewModelStores();
            if (viewModelStores != null) {
                this.mViewModelStores.putAll(viewModelStores);
            }
        }
        this.mHasSavedSnapshot = false;
    }

    @java.lang.Deprecated
    androidx.fragment.app.FragmentManagerNonConfig getSnapshot() {
        if (this.mRetainedFragments.isEmpty() && this.mChildNonConfigs.isEmpty() && this.mViewModelStores.isEmpty()) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> entry : this.mChildNonConfigs.entrySet()) {
            androidx.fragment.app.FragmentManagerNonConfig snapshot = entry.getValue().getSnapshot();
            if (snapshot != null) {
                hashMap.put(entry.getKey(), snapshot);
            }
        }
        this.mHasSavedSnapshot = true;
        if (this.mRetainedFragments.isEmpty() && hashMap.isEmpty() && this.mViewModelStores.isEmpty()) {
            return null;
        }
        return new androidx.fragment.app.FragmentManagerNonConfig(new java.util.ArrayList(this.mRetainedFragments.values()), hashMap, new java.util.HashMap(this.mViewModelStores));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.fragment.app.FragmentManagerViewModel fragmentManagerViewModel = (androidx.fragment.app.FragmentManagerViewModel) obj;
        return this.mRetainedFragments.equals(fragmentManagerViewModel.mRetainedFragments) && this.mChildNonConfigs.equals(fragmentManagerViewModel.mChildNonConfigs) && this.mViewModelStores.equals(fragmentManagerViewModel.mViewModelStores);
    }

    public int hashCode() {
        return (((this.mRetainedFragments.hashCode() * 31) + this.mChildNonConfigs.hashCode()) * 31) + this.mViewModelStores.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FragmentManagerViewModel{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("} Fragments (");
        java.util.Iterator<androidx.fragment.app.Fragment> it = this.mRetainedFragments.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        java.util.Iterator<java.lang.String> it2 = this.mChildNonConfigs.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        java.util.Iterator<java.lang.String> it3 = this.mViewModelStores.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
