package androidx.fragment.app;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public class FragmentTabHost extends android.widget.TabHost implements android.widget.TabHost.OnTabChangeListener {
    private androidx.fragment.app.FragmentTabHost.TabInfo Camera2StreamConfigurationMap;
    private androidx.fragment.app.FragmentManager getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private android.content.Context getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;
    private android.widget.TabHost.OnTabChangeListener getHighSpeedVideoSizesFor;
    private android.widget.FrameLayout getInputFormats;
    private final java.util.ArrayList<androidx.fragment.app.FragmentTabHost.TabInfo> getOutputMinFrameDuration;

    static final class TabInfo {
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final java.lang.Class<?> getHighSpeedVideoFpsRanges;
        final android.os.Bundle getHighSpeedVideoFpsRangesFor;
        androidx.fragment.app.Fragment getHighSpeedVideoSizes;

        TabInfo(java.lang.String str, java.lang.Class<?> cls, android.os.Bundle bundle) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoFpsRanges = cls;
            this.getHighSpeedVideoFpsRangesFor = bundle;
        }
    }

    static class DummyTabFactory implements android.widget.TabHost.TabContentFactory {
        private final android.content.Context getHighSpeedVideoFpsRangesFor;

        public DummyTabFactory(android.content.Context context) {
            this.getHighSpeedVideoFpsRangesFor = context;
        }

        @Override // android.widget.TabHost.TabContentFactory
        public android.view.View createTabContent(java.lang.String str) {
            android.view.View view = new android.view.View(this.getHighSpeedVideoFpsRangesFor);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentTabHost.SavedState> CREATOR = new android.os.Parcelable.Creator<androidx.fragment.app.FragmentTabHost.SavedState>() { // from class: androidx.fragment.app.FragmentTabHost.SavedState.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ androidx.fragment.app.FragmentTabHost.SavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.fragment.app.FragmentTabHost.SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ androidx.fragment.app.FragmentTabHost.SavedState[] newArray(int i) {
                return new androidx.fragment.app.FragmentTabHost.SavedState[i];
            }
        };
        java.lang.String getHighSpeedVideoFpsRangesFor;

        SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.getHighSpeedVideoFpsRangesFor = parcel.readString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.getHighSpeedVideoFpsRangesFor);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FragmentTabHost.SavedState{");
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
            sb.append(" curTab=");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append("}");
            return sb.toString();
        }
    }

    @java.lang.Deprecated
    public FragmentTabHost(android.content.Context context) {
        super(context, null);
        this.getOutputMinFrameDuration = new java.util.ArrayList<>();
        getHighSpeedVideoFpsRanges(context, (android.util.AttributeSet) null);
    }

    @java.lang.Deprecated
    public FragmentTabHost(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getOutputMinFrameDuration = new java.util.ArrayList<>();
        getHighSpeedVideoFpsRanges(context, attributeSet);
    }

    private void getHighSpeedVideoFpsRanges(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.inflatedId}, 0, 0);
        this.getHighSpeedVideoFpsRanges = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    private void getHighSpeedVideoSizes(android.content.Context context) {
        if (findViewById(android.R.id.tabs) == null) {
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
            android.widget.TabWidget tabWidget = new android.widget.TabWidget(context);
            tabWidget.setId(android.R.id.tabs);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new android.widget.LinearLayout.LayoutParams(-1, -2, 0.0f));
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
            frameLayout.setId(android.R.id.tabcontent);
            linearLayout.addView(frameLayout, new android.widget.LinearLayout.LayoutParams(0, 0, 0.0f));
            android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(context);
            this.getInputFormats = frameLayout2;
            frameLayout2.setId(this.getHighSpeedVideoFpsRanges);
            linearLayout.addView(frameLayout2, new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @Override // android.widget.TabHost
    @java.lang.Deprecated
    public void setup() {
        throw new java.lang.IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @java.lang.Deprecated
    public void setup(android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager) {
        getHighSpeedVideoSizes(context);
        super.setup();
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighResolutionOutputSizeshNQ4ISI = fragmentManager;
        getHighSpeedVideoFpsRangesFor();
    }

    @java.lang.Deprecated
    public void setup(android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, int i) {
        getHighSpeedVideoSizes(context);
        super.setup();
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighResolutionOutputSizeshNQ4ISI = fragmentManager;
        this.getHighSpeedVideoFpsRanges = i;
        getHighSpeedVideoFpsRangesFor();
        this.getInputFormats.setId(i);
        if (getId() == -1) {
            setId(android.R.id.tabhost);
        }
    }

    private void getHighSpeedVideoFpsRangesFor() {
        if (this.getInputFormats == null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(this.getHighSpeedVideoFpsRanges);
            this.getInputFormats = frameLayout;
            if (frameLayout != null) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No tab content FrameLayout found for id ");
            sb.append(this.getHighSpeedVideoFpsRanges);
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    @Override // android.widget.TabHost
    @java.lang.Deprecated
    public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener onTabChangeListener) {
        this.getHighSpeedVideoSizesFor = onTabChangeListener;
    }

    @java.lang.Deprecated
    public void addTab(android.widget.TabHost.TabSpec tabSpec, java.lang.Class<?> cls, android.os.Bundle bundle) {
        tabSpec.setContent(new androidx.fragment.app.FragmentTabHost.DummyTabFactory(this.getHighSpeedVideoFpsRangesFor));
        java.lang.String tag = tabSpec.getTag();
        androidx.fragment.app.FragmentTabHost.TabInfo tabInfo = new androidx.fragment.app.FragmentTabHost.TabInfo(tag, cls, bundle);
        if (this.getHighSpeedVideoSizes) {
            tabInfo.getHighSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.findFragmentByTag(tag);
            if (tabInfo.getHighSpeedVideoSizes != null && !tabInfo.getHighSpeedVideoSizes.isDetached()) {
                androidx.fragment.app.FragmentTransaction beginTransaction = this.getHighResolutionOutputSizeshNQ4ISI.beginTransaction();
                beginTransaction.detach(tabInfo.getHighSpeedVideoSizes);
                beginTransaction.commit();
            }
        }
        this.getOutputMinFrameDuration.add(tabInfo);
        addTab(tabSpec);
    }

    @Override // android.view.ViewGroup, android.view.View
    @java.lang.Deprecated
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        java.lang.String currentTabTag = getCurrentTabTag();
        int size = this.getOutputMinFrameDuration.size();
        androidx.fragment.app.FragmentTransaction fragmentTransaction = null;
        for (int i = 0; i < size; i++) {
            androidx.fragment.app.FragmentTabHost.TabInfo tabInfo = this.getOutputMinFrameDuration.get(i);
            tabInfo.getHighSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.findFragmentByTag(tabInfo.getHighResolutionOutputSizeshNQ4ISI);
            if (tabInfo.getHighSpeedVideoSizes != null && !tabInfo.getHighSpeedVideoSizes.isDetached()) {
                if (tabInfo.getHighResolutionOutputSizeshNQ4ISI.equals(currentTabTag)) {
                    this.Camera2StreamConfigurationMap = tabInfo;
                } else {
                    if (fragmentTransaction == null) {
                        fragmentTransaction = this.getHighResolutionOutputSizeshNQ4ISI.beginTransaction();
                    }
                    fragmentTransaction.detach(tabInfo.getHighSpeedVideoSizes);
                }
            }
        }
        this.getHighSpeedVideoSizes = true;
        androidx.fragment.app.FragmentTransaction highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(currentTabTag, fragmentTransaction);
        if (highSpeedVideoFpsRanges != null) {
            highSpeedVideoFpsRanges.commit();
            this.getHighResolutionOutputSizeshNQ4ISI.executePendingTransactions();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @java.lang.Deprecated
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getHighSpeedVideoSizes = false;
    }

    @Override // android.view.View
    @java.lang.Deprecated
    protected android.os.Parcelable onSaveInstanceState() {
        androidx.fragment.app.FragmentTabHost.SavedState savedState = new androidx.fragment.app.FragmentTabHost.SavedState(super.onSaveInstanceState());
        savedState.getHighSpeedVideoFpsRangesFor = getCurrentTabTag();
        return savedState;
    }

    @Override // android.view.View
    @java.lang.Deprecated
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof androidx.fragment.app.FragmentTabHost.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.fragment.app.FragmentTabHost.SavedState savedState = (androidx.fragment.app.FragmentTabHost.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.getHighSpeedVideoFpsRangesFor);
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @java.lang.Deprecated
    public void onTabChanged(java.lang.String str) {
        androidx.fragment.app.FragmentTransaction highSpeedVideoFpsRanges;
        if (this.getHighSpeedVideoSizes && (highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str, (androidx.fragment.app.FragmentTransaction) null)) != null) {
            highSpeedVideoFpsRanges.commit();
        }
        android.widget.TabHost.OnTabChangeListener onTabChangeListener = this.getHighSpeedVideoSizesFor;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    private androidx.fragment.app.FragmentTransaction getHighSpeedVideoFpsRanges(java.lang.String str, androidx.fragment.app.FragmentTransaction fragmentTransaction) {
        androidx.fragment.app.FragmentTabHost.TabInfo tabInfo;
        int size = this.getOutputMinFrameDuration.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                tabInfo = null;
                break;
            }
            tabInfo = this.getOutputMinFrameDuration.get(i);
            if (tabInfo.getHighResolutionOutputSizeshNQ4ISI.equals(str)) {
                break;
            }
            i++;
        }
        if (this.Camera2StreamConfigurationMap != tabInfo) {
            if (fragmentTransaction == null) {
                fragmentTransaction = this.getHighResolutionOutputSizeshNQ4ISI.beginTransaction();
            }
            androidx.fragment.app.FragmentTabHost.TabInfo tabInfo2 = this.Camera2StreamConfigurationMap;
            if (tabInfo2 != null && tabInfo2.getHighSpeedVideoSizes != null) {
                fragmentTransaction.detach(this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes);
            }
            if (tabInfo != null) {
                if (tabInfo.getHighSpeedVideoSizes == null) {
                    tabInfo.getHighSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI.getFragmentFactory().instantiate(this.getHighSpeedVideoFpsRangesFor.getClassLoader(), tabInfo.getHighSpeedVideoFpsRanges.getName());
                    tabInfo.getHighSpeedVideoSizes.setArguments(tabInfo.getHighSpeedVideoFpsRangesFor);
                    fragmentTransaction.add(this.getHighSpeedVideoFpsRanges, tabInfo.getHighSpeedVideoSizes, tabInfo.getHighResolutionOutputSizeshNQ4ISI);
                } else {
                    fragmentTransaction.attach(tabInfo.getHighSpeedVideoSizes);
                }
            }
            this.Camera2StreamConfigurationMap = tabInfo;
        }
        return fragmentTransaction;
    }
}
