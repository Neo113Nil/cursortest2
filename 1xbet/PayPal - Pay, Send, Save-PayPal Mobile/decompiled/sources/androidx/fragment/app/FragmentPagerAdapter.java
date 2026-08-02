package androidx.fragment.app;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public abstract class FragmentPagerAdapter extends androidx.viewpager.widget.PagerAdapter {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @java.lang.Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private androidx.fragment.app.FragmentTransaction getHighSpeedVideoFpsRangesFor;
    private androidx.fragment.app.Fragment getHighSpeedVideoSizes;
    private final androidx.fragment.app.FragmentManager getOutputFormats;

    public abstract androidx.fragment.app.Fragment getItem(int i);

    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(android.os.Parcelable parcelable, java.lang.ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public android.os.Parcelable saveState() {
        return null;
    }

    @java.lang.Deprecated
    public FragmentPagerAdapter(androidx.fragment.app.FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    public FragmentPagerAdapter(androidx.fragment.app.FragmentManager fragmentManager, int i) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoSizes = null;
        this.getOutputFormats = fragmentManager;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
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
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = this.getOutputFormats.beginTransaction();
        }
        long itemId = getItemId(i);
        int id = viewGroup.getId();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("android:switcher:");
        sb.append(id);
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(itemId);
        androidx.fragment.app.Fragment findFragmentByTag = this.getOutputFormats.findFragmentByTag(sb.toString());
        if (findFragmentByTag != null) {
            this.getHighSpeedVideoFpsRangesFor.attach(findFragmentByTag);
        } else {
            findFragmentByTag = getItem(i);
            androidx.fragment.app.FragmentTransaction fragmentTransaction = this.getHighSpeedVideoFpsRangesFor;
            int id2 = viewGroup.getId();
            int id3 = viewGroup.getId();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("android:switcher:");
            sb2.append(id3);
            sb2.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb2.append(itemId);
            fragmentTransaction.add(id2, findFragmentByTag, sb2.toString());
        }
        if (findFragmentByTag != this.getHighSpeedVideoSizes) {
            findFragmentByTag.setMenuVisibility(false);
            if (this.getHighResolutionOutputSizeshNQ4ISI == 1) {
                this.getHighSpeedVideoFpsRangesFor.setMaxLifecycle(findFragmentByTag, androidx.lifecycle.Lifecycle.State.STARTED);
                return findFragmentByTag;
            }
            findFragmentByTag.setUserVisibleHint(false);
        }
        return findFragmentByTag;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = this.getOutputFormats.beginTransaction();
        }
        this.getHighSpeedVideoFpsRangesFor.detach(fragment);
        if (fragment.equals(this.getHighSpeedVideoSizes)) {
            this.getHighSpeedVideoSizes = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
        androidx.fragment.app.Fragment fragment2 = this.getHighSpeedVideoSizes;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.getHighResolutionOutputSizeshNQ4ISI == 1) {
                    if (this.getHighSpeedVideoFpsRangesFor == null) {
                        this.getHighSpeedVideoFpsRangesFor = this.getOutputFormats.beginTransaction();
                    }
                    this.getHighSpeedVideoFpsRangesFor.setMaxLifecycle(this.getHighSpeedVideoSizes, androidx.lifecycle.Lifecycle.State.STARTED);
                } else {
                    this.getHighSpeedVideoSizes.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.getHighResolutionOutputSizeshNQ4ISI == 1) {
                if (this.getHighSpeedVideoFpsRangesFor == null) {
                    this.getHighSpeedVideoFpsRangesFor = this.getOutputFormats.beginTransaction();
                }
                this.getHighSpeedVideoFpsRangesFor.setMaxLifecycle(fragment, androidx.lifecycle.Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.getHighSpeedVideoSizes = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(android.view.ViewGroup viewGroup) {
        androidx.fragment.app.FragmentTransaction fragmentTransaction = this.getHighSpeedVideoFpsRangesFor;
        if (fragmentTransaction != null) {
            if (!this.getHighSpeedVideoFpsRanges) {
                try {
                    this.getHighSpeedVideoFpsRanges = true;
                    fragmentTransaction.commitNowAllowingStateLoss();
                } finally {
                    this.getHighSpeedVideoFpsRanges = false;
                }
            }
            this.getHighSpeedVideoFpsRangesFor = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        return ((androidx.fragment.app.Fragment) obj).getView() == view;
    }
}
