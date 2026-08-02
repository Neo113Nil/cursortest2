package androidx.fragment.app;

/* loaded from: classes3.dex */
final class FragmentManagerViewModel extends androidx.view.ViewModel {
    private static final androidx.lifecycle.ViewModelProvider.Factory getHighSpeedVideoSizes = new androidx.lifecycle.ViewModelProvider.Factory() { // from class: androidx.fragment.app.FragmentManagerViewModel.1
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.view.ViewModel> T create(java.lang.Class<T> cls) {
            return new androidx.fragment.app.FragmentManagerViewModel(true);
        }
    };
    private final boolean getInputSizeshNQ4ISI;
    final java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> getHighSpeedVideoFpsRanges = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.String, androidx.view.ViewModelStore> getOutputMinFrameDuration = new java.util.HashMap<>();
    private boolean getHighSpeedVideoFpsRangesFor = false;
    private boolean Camera2StreamConfigurationMap = false;
    private boolean getHighSpeedVideoSizesFor = false;

    static androidx.fragment.app.FragmentManagerViewModel getHighSpeedVideoFpsRangesFor(androidx.view.ViewModelStore viewModelStore) {
        return (androidx.fragment.app.FragmentManagerViewModel) new androidx.view.ViewModelProvider(viewModelStore, getHighSpeedVideoSizes).get(androidx.fragment.app.FragmentManagerViewModel.class);
    }

    FragmentManagerViewModel(boolean z) {
        this.getInputSizeshNQ4ISI = z;
    }

    final void getHighSpeedVideoFpsRanges(boolean z) {
        this.getHighSpeedVideoSizesFor = z;
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
        this.getHighSpeedVideoFpsRangesFor = true;
    }

    final boolean getHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    final void Camera2StreamConfigurationMap(androidx.fragment.app.Fragment fragment) {
        if (this.getHighSpeedVideoSizesFor) {
            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
        } else {
            if (this.getHighResolutionOutputSizeshNQ4ISI.containsKey(fragment.mWho)) {
                return;
            }
            this.getHighResolutionOutputSizeshNQ4ISI.put(fragment.mWho, fragment);
            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
        }
    }

    final boolean getHighSpeedVideoFpsRangesFor(androidx.fragment.app.Fragment fragment) {
        if (!this.getHighResolutionOutputSizeshNQ4ISI.containsKey(fragment.mWho)) {
            return true;
        }
        if (this.getInputSizeshNQ4ISI) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        return !this.Camera2StreamConfigurationMap;
    }

    final void getHighSpeedVideoFpsRanges(androidx.fragment.app.Fragment fragment) {
        if (this.getHighSpeedVideoSizesFor) {
            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
        } else if (this.getHighResolutionOutputSizeshNQ4ISI.remove(fragment.mWho) != null) {
            androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
        }
    }

    final androidx.fragment.app.FragmentManagerViewModel getHighResolutionOutputSizeshNQ4ISI(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.FragmentManagerViewModel fragmentManagerViewModel = this.getHighSpeedVideoFpsRanges.get(fragment.mWho);
        if (fragmentManagerViewModel != null) {
            return fragmentManagerViewModel;
        }
        androidx.fragment.app.FragmentManagerViewModel fragmentManagerViewModel2 = new androidx.fragment.app.FragmentManagerViewModel(this.getInputSizeshNQ4ISI);
        this.getHighSpeedVideoFpsRanges.put(fragment.mWho, fragmentManagerViewModel2);
        return fragmentManagerViewModel2;
    }

    final androidx.view.ViewModelStore getHighSpeedVideoSizes(androidx.fragment.app.Fragment fragment) {
        androidx.view.ViewModelStore viewModelStore = this.getOutputMinFrameDuration.get(fragment.mWho);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        androidx.view.ViewModelStore viewModelStore2 = new androidx.view.ViewModelStore();
        this.getOutputMinFrameDuration.put(fragment.mWho, viewModelStore2);
        return viewModelStore2;
    }

    final void getHighSpeedVideoFpsRanges(java.lang.String str, boolean z) {
        androidx.fragment.app.FragmentManagerViewModel fragmentManagerViewModel = this.getHighSpeedVideoFpsRanges.get(str);
        if (fragmentManagerViewModel != null) {
            if (z) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(fragmentManagerViewModel.getHighSpeedVideoFpsRanges.keySet());
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    androidx.fragment.app.FragmentManager.isLoggingEnabled(3);
                    fragmentManagerViewModel.getHighSpeedVideoFpsRanges(str2, true);
                }
            }
            fragmentManagerViewModel.onCleared();
            this.getHighSpeedVideoFpsRanges.remove(str);
        }
        androidx.view.ViewModelStore viewModelStore = this.getOutputMinFrameDuration.get(str);
        if (viewModelStore != null) {
            viewModelStore.clear();
            this.getOutputMinFrameDuration.remove(str);
        }
    }

    @java.lang.Deprecated
    final void Camera2StreamConfigurationMap(androidx.fragment.app.FragmentManagerNonConfig fragmentManagerNonConfig) {
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
        this.getHighSpeedVideoFpsRanges.clear();
        this.getOutputMinFrameDuration.clear();
        if (fragmentManagerNonConfig != null) {
            java.util.Collection<androidx.fragment.app.Fragment> collection = fragmentManagerNonConfig.getHighSpeedVideoFpsRangesFor;
            if (collection != null) {
                for (androidx.fragment.app.Fragment fragment : collection) {
                    if (fragment != null) {
                        this.getHighResolutionOutputSizeshNQ4ISI.put(fragment.mWho, fragment);
                    }
                }
            }
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManagerNonConfig> map = fragmentManagerNonConfig.Camera2StreamConfigurationMap;
            if (map != null) {
                for (java.util.Map.Entry<java.lang.String, androidx.fragment.app.FragmentManagerNonConfig> entry : map.entrySet()) {
                    androidx.fragment.app.FragmentManagerViewModel fragmentManagerViewModel = new androidx.fragment.app.FragmentManagerViewModel(this.getInputSizeshNQ4ISI);
                    fragmentManagerViewModel.Camera2StreamConfigurationMap(entry.getValue());
                    this.getHighSpeedVideoFpsRanges.put(entry.getKey(), fragmentManagerViewModel);
                }
            }
            java.util.Map<java.lang.String, androidx.view.ViewModelStore> map2 = fragmentManagerNonConfig.getHighResolutionOutputSizeshNQ4ISI;
            if (map2 != null) {
                this.getOutputMinFrameDuration.putAll(map2);
            }
        }
        this.Camera2StreamConfigurationMap = false;
    }

    @java.lang.Deprecated
    final androidx.fragment.app.FragmentManagerNonConfig Camera2StreamConfigurationMap() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty() && this.getHighSpeedVideoFpsRanges.isEmpty() && this.getOutputMinFrameDuration.isEmpty()) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> entry : this.getHighSpeedVideoFpsRanges.entrySet()) {
            androidx.fragment.app.FragmentManagerNonConfig Camera2StreamConfigurationMap = entry.getValue().Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap != null) {
                hashMap.put(entry.getKey(), Camera2StreamConfigurationMap);
            }
        }
        this.Camera2StreamConfigurationMap = true;
        if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty() && hashMap.isEmpty() && this.getOutputMinFrameDuration.isEmpty()) {
            return null;
        }
        return new androidx.fragment.app.FragmentManagerNonConfig(new java.util.ArrayList(this.getHighResolutionOutputSizeshNQ4ISI.values()), hashMap, new java.util.HashMap(this.getOutputMinFrameDuration));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.fragment.app.FragmentManagerViewModel fragmentManagerViewModel = (androidx.fragment.app.FragmentManagerViewModel) obj;
        return this.getHighResolutionOutputSizeshNQ4ISI.equals(fragmentManagerViewModel.getHighResolutionOutputSizeshNQ4ISI) && this.getHighSpeedVideoFpsRanges.equals(fragmentManagerViewModel.getHighSpeedVideoFpsRanges) && this.getOutputMinFrameDuration.equals(fragmentManagerViewModel.getOutputMinFrameDuration);
    }

    public final int hashCode() {
        return (((this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31) + this.getHighSpeedVideoFpsRanges.hashCode()) * 31) + this.getOutputMinFrameDuration.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FragmentManagerViewModel{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("} Fragments (");
        java.util.Iterator<androidx.fragment.app.Fragment> it = this.getHighResolutionOutputSizeshNQ4ISI.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        java.util.Iterator<java.lang.String> it2 = this.getHighSpeedVideoFpsRanges.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        java.util.Iterator<java.lang.String> it3 = this.getOutputMinFrameDuration.keySet().iterator();
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
