package androidx.fragment.app;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public abstract class FragmentStatePagerAdapter extends androidx.viewpager.widget.PagerAdapter {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @java.lang.Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private androidx.fragment.app.FragmentTransaction getHighSpeedVideoFpsRanges;
    private androidx.fragment.app.Fragment getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private java.util.ArrayList<androidx.fragment.app.Fragment.SavedState> getHighSpeedVideoSizesFor;
    private java.util.ArrayList<androidx.fragment.app.Fragment> getInputSizeshNQ4ISI;
    private final androidx.fragment.app.FragmentManager getOutputMinFrameDuration;

    public abstract androidx.fragment.app.Fragment getItem(int i);

    @java.lang.Deprecated
    public FragmentStatePagerAdapter(androidx.fragment.app.FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    public FragmentStatePagerAdapter(androidx.fragment.app.FragmentManager fragmentManager, int i) {
        this.getHighSpeedVideoFpsRanges = null;
        this.getHighSpeedVideoSizesFor = new java.util.ArrayList<>();
        this.getInputSizeshNQ4ISI = new java.util.ArrayList<>();
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getOutputMinFrameDuration = fragmentManager;
        this.getHighSpeedVideoSizes = i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(android.view.ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewPager with adapter ");
        sb.append(this);
        sb.append(" requires a view id");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i) {
        androidx.fragment.app.Fragment.SavedState savedState;
        androidx.fragment.app.Fragment fragment;
        if (this.getInputSizeshNQ4ISI.size() > i && (fragment = this.getInputSizeshNQ4ISI.get(i)) != null) {
            return fragment;
        }
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = this.getOutputMinFrameDuration.beginTransaction();
        }
        androidx.fragment.app.Fragment item = getItem(i);
        if (this.getHighSpeedVideoSizesFor.size() > i && (savedState = this.getHighSpeedVideoSizesFor.get(i)) != null) {
            item.setInitialSavedState(savedState);
        }
        while (this.getInputSizeshNQ4ISI.size() <= i) {
            this.getInputSizeshNQ4ISI.add(null);
        }
        item.setMenuVisibility(false);
        if (this.getHighSpeedVideoSizes == 0) {
            item.setUserVisibleHint(false);
        }
        this.getInputSizeshNQ4ISI.set(i, item);
        this.getHighSpeedVideoFpsRanges.add(viewGroup.getId(), item);
        if (this.getHighSpeedVideoSizes == 1) {
            this.getHighSpeedVideoFpsRanges.setMaxLifecycle(item, androidx.lifecycle.Lifecycle.State.STARTED);
        }
        return item;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoFpsRanges = this.getOutputMinFrameDuration.beginTransaction();
        }
        while (this.getHighSpeedVideoSizesFor.size() <= i) {
            this.getHighSpeedVideoSizesFor.add(null);
        }
        this.getHighSpeedVideoSizesFor.set(i, fragment.isAdded() ? this.getOutputMinFrameDuration.saveFragmentInstanceState(fragment) : null);
        this.getInputSizeshNQ4ISI.set(i, null);
        this.getHighSpeedVideoFpsRanges.remove(fragment);
        if (fragment.equals(this.getHighSpeedVideoFpsRangesFor)) {
            this.getHighSpeedVideoFpsRangesFor = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
        androidx.fragment.app.Fragment fragment2 = this.getHighSpeedVideoFpsRangesFor;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.getHighSpeedVideoSizes == 1) {
                    if (this.getHighSpeedVideoFpsRanges == null) {
                        this.getHighSpeedVideoFpsRanges = this.getOutputMinFrameDuration.beginTransaction();
                    }
                    this.getHighSpeedVideoFpsRanges.setMaxLifecycle(this.getHighSpeedVideoFpsRangesFor, androidx.lifecycle.Lifecycle.State.STARTED);
                } else {
                    this.getHighSpeedVideoFpsRangesFor.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.getHighSpeedVideoSizes == 1) {
                if (this.getHighSpeedVideoFpsRanges == null) {
                    this.getHighSpeedVideoFpsRanges = this.getOutputMinFrameDuration.beginTransaction();
                }
                this.getHighSpeedVideoFpsRanges.setMaxLifecycle(fragment, androidx.lifecycle.Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.getHighSpeedVideoFpsRangesFor = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(android.view.ViewGroup viewGroup) {
        androidx.fragment.app.FragmentTransaction fragmentTransaction = this.getHighSpeedVideoFpsRanges;
        if (fragmentTransaction != null) {
            if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                    fragmentTransaction.commitNowAllowingStateLoss();
                } finally {
                    this.getHighResolutionOutputSizeshNQ4ISI = false;
                }
            }
            this.getHighSpeedVideoFpsRanges = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        return ((androidx.fragment.app.Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public android.os.Parcelable saveState() {
        android.os.Bundle bundle;
        if (this.getHighSpeedVideoSizesFor.size() > 0) {
            bundle = new android.os.Bundle();
            androidx.fragment.app.Fragment.SavedState[] savedStateArr = new androidx.fragment.app.Fragment.SavedState[this.getHighSpeedVideoSizesFor.size()];
            this.getHighSpeedVideoSizesFor.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.getInputSizeshNQ4ISI.size(); i++) {
            androidx.fragment.app.Fragment fragment = this.getInputSizeshNQ4ISI.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new android.os.Bundle();
                }
                this.getOutputMinFrameDuration.putFragment(bundle, "f".concat(java.lang.String.valueOf(i)), fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(android.os.Parcelable parcelable, java.lang.ClassLoader classLoader) {
        if (parcelable != null) {
            android.os.Bundle bundle = (android.os.Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            android.os.Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.getHighSpeedVideoSizesFor.clear();
            this.getInputSizeshNQ4ISI.clear();
            if (parcelableArray != null) {
                for (android.os.Parcelable parcelable2 : parcelableArray) {
                    this.getHighSpeedVideoSizesFor.add((androidx.fragment.app.Fragment.SavedState) parcelable2);
                }
            }
            for (java.lang.String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = java.lang.Integer.parseInt(str.substring(1));
                    androidx.fragment.app.Fragment fragment = this.getOutputMinFrameDuration.getFragment(bundle, str);
                    if (fragment != null) {
                        while (this.getInputSizeshNQ4ISI.size() <= parseInt) {
                            this.getInputSizeshNQ4ISI.add(null);
                        }
                        fragment.setMenuVisibility(false);
                        this.getInputSizeshNQ4ISI.set(parseInt, fragment);
                    }
                }
            }
        }
    }
}
