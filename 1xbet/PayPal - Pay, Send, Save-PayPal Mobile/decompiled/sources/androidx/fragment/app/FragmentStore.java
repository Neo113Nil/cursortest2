package androidx.fragment.app;

/* loaded from: classes3.dex */
class FragmentStore {
    private androidx.fragment.app.FragmentManagerViewModel getHighSpeedVideoFpsRanges;
    final java.util.ArrayList<androidx.fragment.app.Fragment> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList<>();
    final java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap<>();
    final java.util.HashMap<java.lang.String, android.os.Bundle> getHighSpeedVideoSizes = new java.util.HashMap<>();

    FragmentStore() {
    }

    final void Camera2StreamConfigurationMap(androidx.fragment.app.FragmentManagerViewModel fragmentManagerViewModel) {
        this.getHighSpeedVideoFpsRanges = fragmentManagerViewModel;
    }

    final androidx.fragment.app.FragmentManagerViewModel getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoFpsRanges;
    }

    final void getHighSpeedVideoSizes(java.util.List<java.lang.String> list) {
        this.getHighSpeedVideoFpsRangesFor.clear();
        if (list != null) {
            for (java.lang.String str : list) {
                androidx.fragment.app.Fragment highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str);
                if (highSpeedVideoFpsRangesFor == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("No instantiated fragment for (");
                    sb.append(str);
                    sb.append(")");
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
                getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor);
            }
        }
    }

    final void Camera2StreamConfigurationMap(androidx.fragment.app.FragmentStateManager fragmentStateManager) {
        androidx.fragment.app.Fragment Camera2StreamConfigurationMap = fragmentStateManager.Camera2StreamConfigurationMap();
        if (Camera2StreamConfigurationMap(Camera2StreamConfigurationMap.mWho)) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.put(Camera2StreamConfigurationMap.mWho, fragmentStateManager);
        if (Camera2StreamConfigurationMap.mRetainInstanceChangedWhileDetached) {
            if (Camera2StreamConfigurationMap.mRetainInstance) {
                this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap);
            } else {
                this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
            }
            Camera2StreamConfigurationMap.mRetainInstanceChangedWhileDetached = false;
        }
        androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
    }

    final void getHighResolutionOutputSizeshNQ4ISI(androidx.fragment.app.Fragment fragment) {
        if (this.getHighSpeedVideoFpsRangesFor.contains(fragment)) {
            throw new java.lang.IllegalStateException("Fragment already added: ".concat(java.lang.String.valueOf(fragment)));
        }
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            this.getHighSpeedVideoFpsRangesFor.add(fragment);
        }
        fragment.mAdded = true;
    }

    final void getHighSpeedVideoFpsRangesFor(int i) {
        for (androidx.fragment.app.FragmentStateManager fragmentStateManager : this.getHighResolutionOutputSizeshNQ4ISI.values()) {
            if (fragmentStateManager != null) {
                fragmentStateManager.getHighResolutionOutputSizeshNQ4ISI(i);
            }
        }
    }

    final void getOutputMinFrameDuration() {
        java.util.Iterator<androidx.fragment.app.Fragment> it = this.getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.FragmentStateManager fragmentStateManager = this.getHighResolutionOutputSizeshNQ4ISI.get(it.next().mWho);
            if (fragmentStateManager != null) {
                fragmentStateManager.getHighSpeedVideoFpsRanges();
            }
        }
        for (androidx.fragment.app.FragmentStateManager fragmentStateManager2 : this.getHighResolutionOutputSizeshNQ4ISI.values()) {
            if (fragmentStateManager2 != null) {
                fragmentStateManager2.getHighSpeedVideoFpsRanges();
                androidx.fragment.app.Fragment Camera2StreamConfigurationMap = fragmentStateManager2.Camera2StreamConfigurationMap();
                if (Camera2StreamConfigurationMap.mRemoving && !Camera2StreamConfigurationMap.isInBackStack()) {
                    if (Camera2StreamConfigurationMap.mBeingSaved && !this.getHighSpeedVideoSizes.containsKey(Camera2StreamConfigurationMap.mWho)) {
                        this.getHighSpeedVideoSizes.put(Camera2StreamConfigurationMap.mWho, fragmentStateManager2.getHighSpeedVideoFpsRangesFor());
                    }
                    getHighSpeedVideoFpsRangesFor(fragmentStateManager2);
                }
            }
        }
    }

    final void getHighSpeedVideoFpsRangesFor(androidx.fragment.app.FragmentStateManager fragmentStateManager) {
        androidx.fragment.app.Fragment Camera2StreamConfigurationMap = fragmentStateManager.Camera2StreamConfigurationMap();
        if (Camera2StreamConfigurationMap.mRetainInstance) {
            this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.get(Camera2StreamConfigurationMap.mWho) != fragmentStateManager || this.getHighResolutionOutputSizeshNQ4ISI.put(Camera2StreamConfigurationMap.mWho, null) == null) {
            return;
        }
        androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
    }

    final void Camera2StreamConfigurationMap() {
        this.getHighResolutionOutputSizeshNQ4ISI.values().removeAll(java.util.Collections.singleton(null));
    }

    final java.util.ArrayList<java.lang.String> getInputSizeshNQ4ISI() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(this.getHighResolutionOutputSizeshNQ4ISI.size());
        for (androidx.fragment.app.FragmentStateManager fragmentStateManager : this.getHighResolutionOutputSizeshNQ4ISI.values()) {
            if (fragmentStateManager != null) {
                androidx.fragment.app.Fragment Camera2StreamConfigurationMap = fragmentStateManager.Camera2StreamConfigurationMap();
                this.getHighSpeedVideoSizes.put(Camera2StreamConfigurationMap.mWho, fragmentStateManager.getHighSpeedVideoFpsRangesFor());
                arrayList.add(Camera2StreamConfigurationMap.mWho);
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    android.os.Bundle bundle = Camera2StreamConfigurationMap.mSavedFragmentState;
                }
            }
        }
        return arrayList;
    }

    final java.util.ArrayList<java.lang.String> getOutputFormats() {
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                return null;
            }
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(this.getHighSpeedVideoFpsRangesFor.size());
            java.util.Iterator<androidx.fragment.app.Fragment> it = this.getHighSpeedVideoFpsRangesFor.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.Fragment next = it.next();
                arrayList.add(next.mWho);
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    java.lang.String str = next.mWho;
                }
            }
            return arrayList;
        }
    }

    final java.util.List<androidx.fragment.app.FragmentStateManager> getHighSpeedVideoFpsRanges() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.fragment.app.FragmentStateManager fragmentStateManager : this.getHighResolutionOutputSizeshNQ4ISI.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager);
            }
        }
        return arrayList;
    }

    final java.util.List<androidx.fragment.app.Fragment> getHighSpeedVideoFpsRangesFor() {
        java.util.ArrayList arrayList;
        if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
            return java.util.Collections.emptyList();
        }
        synchronized (this.getHighSpeedVideoFpsRangesFor) {
            arrayList = new java.util.ArrayList(this.getHighSpeedVideoFpsRangesFor);
        }
        return arrayList;
    }

    final java.util.List<androidx.fragment.app.Fragment> getHighResolutionOutputSizeshNQ4ISI() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.fragment.app.FragmentStateManager fragmentStateManager : this.getHighResolutionOutputSizeshNQ4ISI.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager.Camera2StreamConfigurationMap());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    final androidx.fragment.app.Fragment getHighSpeedVideoSizes(int i) {
        for (int size = this.getHighSpeedVideoFpsRangesFor.size() - 1; size >= 0; size--) {
            androidx.fragment.app.Fragment fragment = this.getHighSpeedVideoFpsRangesFor.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (androidx.fragment.app.FragmentStateManager fragmentStateManager : this.getHighResolutionOutputSizeshNQ4ISI.values()) {
            if (fragmentStateManager != null) {
                androidx.fragment.app.Fragment Camera2StreamConfigurationMap = fragmentStateManager.Camera2StreamConfigurationMap();
                if (Camera2StreamConfigurationMap.mFragmentId == i) {
                    return Camera2StreamConfigurationMap;
                }
            }
        }
        return null;
    }

    final boolean Camera2StreamConfigurationMap(java.lang.String str) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(str) != null;
    }

    final androidx.fragment.app.FragmentStateManager getHighSpeedVideoSizes(java.lang.String str) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(str);
    }

    final androidx.fragment.app.Fragment getHighSpeedVideoFpsRanges(java.lang.String str) {
        androidx.fragment.app.Fragment findFragmentByWho;
        for (androidx.fragment.app.FragmentStateManager fragmentStateManager : this.getHighResolutionOutputSizeshNQ4ISI.values()) {
            if (fragmentStateManager != null && (findFragmentByWho = fragmentStateManager.Camera2StreamConfigurationMap().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    final androidx.fragment.app.Fragment getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        androidx.fragment.app.FragmentStateManager fragmentStateManager = this.getHighResolutionOutputSizeshNQ4ISI.get(str);
        if (fragmentStateManager != null) {
            return fragmentStateManager.Camera2StreamConfigurationMap();
        }
        return null;
    }

    final int getHighSpeedVideoFpsRanges(androidx.fragment.app.Fragment fragment) {
        android.view.ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.getHighSpeedVideoFpsRangesFor.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            androidx.fragment.app.Fragment fragment2 = this.getHighSpeedVideoFpsRangesFor.get(i);
            if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                return viewGroup.indexOfChild(fragment2.mView) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.getHighSpeedVideoFpsRangesFor.size()) {
                return -1;
            }
            androidx.fragment.app.Fragment fragment3 = this.getHighSpeedVideoFpsRangesFor.get(indexOf);
            if (fragment3.mContainer == viewGroup && fragment3.mView != null) {
                return viewGroup.indexOfChild(fragment3.mView);
            }
        }
    }
}
