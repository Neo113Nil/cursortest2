package androidx.preference;

/* loaded from: classes7.dex */
public abstract class PreferenceFragmentCompat extends androidx.fragment.app.Fragment implements androidx.preference.PreferenceManager.OnPreferenceTreeClickListener, androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener, androidx.preference.PreferenceManager.OnNavigateToScreenListener, androidx.preference.DialogPreference.TargetFragment {
    public static final java.lang.String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    androidx.recyclerview.widget.RecyclerView getHighSpeedVideoFpsRangesFor;
    private androidx.preference.PreferenceManager getHighSpeedVideoSizesFor;
    private java.lang.Runnable getInputSizeshNQ4ISI;
    private final androidx.preference.PreferenceFragmentCompat.DividerDecoration Camera2StreamConfigurationMap = new androidx.preference.PreferenceFragmentCompat.DividerDecoration();
    private int getInputFormats = androidx.preference.R.layout.preference_list_fragment;
    private android.os.Handler getHighSpeedVideoSizes = new android.os.Handler() { // from class: androidx.preference.PreferenceFragmentCompat.1
        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (message.what != 1) {
                return;
            }
            androidx.preference.PreferenceFragmentCompat.this.getHighSpeedVideoFpsRanges();
        }
    };
    private final java.lang.Runnable getOutputFormats = new java.lang.Runnable() { // from class: androidx.preference.PreferenceFragmentCompat.2
        @Override // java.lang.Runnable
        public void run() {
            androidx.preference.PreferenceFragmentCompat.this.getHighSpeedVideoFpsRangesFor.focusableViewAvailable(androidx.preference.PreferenceFragmentCompat.this.getHighSpeedVideoFpsRangesFor);
        }
    };

    public interface OnPreferenceDisplayDialogCallback {
        boolean onPreferenceDisplayDialog(androidx.preference.PreferenceFragmentCompat preferenceFragmentCompat, androidx.preference.Preference preference);
    }

    public interface OnPreferenceStartFragmentCallback {
        boolean onPreferenceStartFragment(androidx.preference.PreferenceFragmentCompat preferenceFragmentCompat, androidx.preference.Preference preference);
    }

    public interface OnPreferenceStartScreenCallback {
        boolean onPreferenceStartScreen(androidx.preference.PreferenceFragmentCompat preferenceFragmentCompat, androidx.preference.PreferenceScreen preferenceScreen);
    }

    public androidx.fragment.app.Fragment getCallbackFragment() {
        return null;
    }

    protected void onBindPreferences() {
    }

    public abstract void onCreatePreferences(android.os.Bundle bundle, java.lang.String str);

    protected void onUnbindPreferences() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.util.TypedValue typedValue = new android.util.TypedValue();
        getActivity().getTheme().resolveAttribute(androidx.preference.R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = androidx.preference.R.style.PreferenceThemeOverlay;
        }
        getActivity().getTheme().applyStyle(i, false);
        androidx.preference.PreferenceManager preferenceManager = new androidx.preference.PreferenceManager(getContext());
        this.getHighSpeedVideoSizesFor = preferenceManager;
        preferenceManager.setOnNavigateToScreenListener(this);
        onCreatePreferences(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, androidx.preference.R.styleable.PreferenceFragmentCompat, androidx.preference.R.attr.preferenceFragmentCompatStyle, 0);
        this.getInputFormats = obtainStyledAttributes.getResourceId(androidx.preference.R.styleable.PreferenceFragmentCompat_android_layout, this.getInputFormats);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(androidx.preference.R.styleable.PreferenceFragmentCompat_android_divider);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(androidx.preference.R.styleable.PreferenceFragmentCompat_android_dividerHeight, -1);
        boolean z = obtainStyledAttributes.getBoolean(androidx.preference.R.styleable.PreferenceFragmentCompat_allowDividerAfterLastItem, true);
        obtainStyledAttributes.recycle();
        android.view.LayoutInflater cloneInContext = layoutInflater.cloneInContext(getContext());
        android.view.View inflate = cloneInContext.inflate(this.getInputFormats, viewGroup, false);
        android.view.View findViewById = inflate.findViewById(android.R.id.list_container);
        if (!(findViewById instanceof android.view.ViewGroup)) {
            throw new java.lang.IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById;
        androidx.recyclerview.widget.RecyclerView onCreateRecyclerView = onCreateRecyclerView(cloneInContext, viewGroup2, bundle);
        if (onCreateRecyclerView == null) {
            throw new java.lang.RuntimeException("Could not create RecyclerView");
        }
        this.getHighSpeedVideoFpsRangesFor = onCreateRecyclerView;
        onCreateRecyclerView.addItemDecoration(this.Camera2StreamConfigurationMap);
        setDivider(drawable);
        if (dimensionPixelSize != -1) {
            setDividerHeight(dimensionPixelSize);
        }
        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor(z);
        if (this.getHighSpeedVideoFpsRangesFor.getParent() == null) {
            viewGroup2.addView(this.getHighSpeedVideoFpsRangesFor);
        }
        this.getHighSpeedVideoSizes.post(this.getOutputFormats);
        return inflate;
    }

    public void setDivider(android.graphics.drawable.Drawable drawable) {
        this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap(drawable);
    }

    public void setDividerHeight(int i) {
        this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        androidx.preference.PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen = getPreferenceScreen()) != null) {
            preferenceScreen.restoreHierarchyState(bundle2);
        }
        if (this.getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoFpsRanges();
            java.lang.Runnable runnable = this.getInputSizeshNQ4ISI;
            if (runnable != null) {
                runnable.run();
                this.getInputSizeshNQ4ISI = null;
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.getHighSpeedVideoSizesFor.setOnPreferenceTreeClickListener(this);
        this.getHighSpeedVideoSizesFor.setOnDisplayPreferenceDialogListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.getHighSpeedVideoSizesFor.setOnPreferenceTreeClickListener(null);
        this.getHighSpeedVideoSizesFor.setOnDisplayPreferenceDialogListener(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.getHighSpeedVideoSizes.removeCallbacks(this.getOutputFormats);
        this.getHighSpeedVideoSizes.removeMessages(1);
        if (this.getHighSpeedVideoFpsRanges) {
            Camera2StreamConfigurationMap();
        }
        this.getHighSpeedVideoFpsRangesFor = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        androidx.preference.PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            preferenceScreen.saveHierarchyState(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    public androidx.preference.PreferenceManager getPreferenceManager() {
        return this.getHighSpeedVideoSizesFor;
    }

    public androidx.preference.PreferenceScreen getPreferenceScreen() {
        return this.getHighSpeedVideoSizesFor.getPreferenceScreen();
    }

    public void setPreferenceScreen(androidx.preference.PreferenceScreen preferenceScreen) {
        if (!this.getHighSpeedVideoSizesFor.setPreferences(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        onUnbindPreferences();
        this.getHighSpeedVideoFpsRanges = true;
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    public void addPreferencesFromResource(int i) {
        getHighSpeedVideoSizes();
        setPreferenceScreen(this.getHighSpeedVideoSizesFor.inflateFromResource(getContext(), i, getPreferenceScreen()));
    }

    public void setPreferencesFromResource(int i, java.lang.String str) {
        getHighSpeedVideoSizes();
        androidx.preference.PreferenceScreen inflateFromResource = this.getHighSpeedVideoSizesFor.inflateFromResource(getContext(), i, null);
        java.lang.Object obj = inflateFromResource;
        if (str != null) {
            java.lang.Object findPreference = inflateFromResource.findPreference(str);
            boolean z = findPreference instanceof androidx.preference.PreferenceScreen;
            obj = findPreference;
            if (!z) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Preference object with key ");
                sb.append(str);
                sb.append(" is not a PreferenceScreen");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        setPreferenceScreen((androidx.preference.PreferenceScreen) obj);
    }

    @Override // androidx.preference.PreferenceManager.OnPreferenceTreeClickListener
    public boolean onPreferenceTreeClick(androidx.preference.Preference preference) {
        if (preference.getFragment() == null) {
            return false;
        }
        boolean onPreferenceStartFragment = getCallbackFragment() instanceof androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback ? ((androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback) getCallbackFragment()).onPreferenceStartFragment(this, preference) : false;
        if (!onPreferenceStartFragment && (getActivity() instanceof androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback)) {
            onPreferenceStartFragment = ((androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback) getActivity()).onPreferenceStartFragment(this, preference);
        }
        if (onPreferenceStartFragment) {
            return true;
        }
        androidx.fragment.app.FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        android.os.Bundle extras = preference.getExtras();
        androidx.fragment.app.Fragment instantiate = supportFragmentManager.getFragmentFactory().instantiate(requireActivity().getClassLoader(), preference.getFragment());
        instantiate.setArguments(extras);
        instantiate.setTargetFragment(this, 0);
        supportFragmentManager.beginTransaction().replace(((android.view.View) getView().getParent()).getId(), instantiate).addToBackStack(null).commit();
        return true;
    }

    @Override // androidx.preference.PreferenceManager.OnNavigateToScreenListener
    public void onNavigateToScreen(androidx.preference.PreferenceScreen preferenceScreen) {
        if (!((getCallbackFragment() instanceof androidx.preference.PreferenceFragmentCompat.OnPreferenceStartScreenCallback) && ((androidx.preference.PreferenceFragmentCompat.OnPreferenceStartScreenCallback) getCallbackFragment()).onPreferenceStartScreen(this, preferenceScreen)) && (getActivity() instanceof androidx.preference.PreferenceFragmentCompat.OnPreferenceStartScreenCallback)) {
            ((androidx.preference.PreferenceFragmentCompat.OnPreferenceStartScreenCallback) getActivity()).onPreferenceStartScreen(this, preferenceScreen);
        }
    }

    @Override // androidx.preference.DialogPreference.TargetFragment
    public <T extends androidx.preference.Preference> T findPreference(java.lang.CharSequence charSequence) {
        androidx.preference.PreferenceManager preferenceManager = this.getHighSpeedVideoSizesFor;
        if (preferenceManager == null) {
            return null;
        }
        return (T) preferenceManager.findPreference(charSequence);
    }

    private void getHighSpeedVideoSizes() {
        if (this.getHighSpeedVideoSizesFor == null) {
            throw new java.lang.RuntimeException("This should be called after super.onCreate.");
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getHighSpeedVideoSizes.hasMessages(1)) {
            return;
        }
        this.getHighSpeedVideoSizes.obtainMessage(1).sendToTarget();
    }

    void getHighSpeedVideoFpsRanges() {
        androidx.preference.PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            getListView().setAdapter(onCreateAdapter(preferenceScreen));
            preferenceScreen.onAttached();
        }
        onBindPreferences();
    }

    private void Camera2StreamConfigurationMap() {
        getListView().setAdapter(null);
        androidx.preference.PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            preferenceScreen.onDetached();
        }
        onUnbindPreferences();
    }

    public final androidx.recyclerview.widget.RecyclerView getListView() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public androidx.recyclerview.widget.RecyclerView onCreateRecyclerView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        if (getContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (androidx.recyclerview.widget.RecyclerView) viewGroup.findViewById(androidx.preference.R.id.recycler_view)) != null) {
            return recyclerView;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) layoutInflater.inflate(androidx.preference.R.layout.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new androidx.preference.PreferenceRecyclerViewAccessibilityDelegate(recyclerView2));
        return recyclerView2;
    }

    public androidx.recyclerview.widget.RecyclerView.LayoutManager onCreateLayoutManager() {
        return new androidx.recyclerview.widget.LinearLayoutManager(getContext());
    }

    protected androidx.recyclerview.widget.RecyclerView.Adapter onCreateAdapter(androidx.preference.PreferenceScreen preferenceScreen) {
        return new androidx.preference.PreferenceGroupAdapter(preferenceScreen);
    }

    @Override // androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener
    public void onDisplayPreferenceDialog(androidx.preference.Preference preference) {
        androidx.fragment.app.DialogFragment newInstance;
        boolean onPreferenceDisplayDialog = getCallbackFragment() instanceof androidx.preference.PreferenceFragmentCompat.OnPreferenceDisplayDialogCallback ? ((androidx.preference.PreferenceFragmentCompat.OnPreferenceDisplayDialogCallback) getCallbackFragment()).onPreferenceDisplayDialog(this, preference) : false;
        if (!onPreferenceDisplayDialog && (getActivity() instanceof androidx.preference.PreferenceFragmentCompat.OnPreferenceDisplayDialogCallback)) {
            onPreferenceDisplayDialog = ((androidx.preference.PreferenceFragmentCompat.OnPreferenceDisplayDialogCallback) getActivity()).onPreferenceDisplayDialog(this, preference);
        }
        if (onPreferenceDisplayDialog || getParentFragmentManager().findFragmentByTag("androidx.preference.PreferenceFragment.DIALOG") != null) {
            return;
        }
        if (preference instanceof androidx.preference.EditTextPreference) {
            newInstance = androidx.preference.EditTextPreferenceDialogFragmentCompat.newInstance(preference.getKey());
        } else if (preference instanceof androidx.preference.ListPreference) {
            newInstance = androidx.preference.ListPreferenceDialogFragmentCompat.newInstance(preference.getKey());
        } else if (preference instanceof androidx.preference.MultiSelectListPreference) {
            newInstance = androidx.preference.MultiSelectListPreferenceDialogFragmentCompat.newInstance(preference.getKey());
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot display dialog for an unknown Preference type: ");
            sb.append(preference.getClass().getSimpleName());
            sb.append(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        newInstance.setTargetFragment(this, 0);
        newInstance.show(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
    }

    public void scrollToPreference(java.lang.String str) {
        Camera2StreamConfigurationMap(null, str);
    }

    public void scrollToPreference(androidx.preference.Preference preference) {
        Camera2StreamConfigurationMap(preference, null);
    }

    private void Camera2StreamConfigurationMap(final androidx.preference.Preference preference, final java.lang.String str) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.preference.PreferenceFragmentCompat.3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                int preferenceAdapterPosition;
                androidx.recyclerview.widget.RecyclerView.Adapter adapter = androidx.preference.PreferenceFragmentCompat.this.getHighSpeedVideoFpsRangesFor.getAdapter();
                if (!(adapter instanceof androidx.preference.PreferenceGroup.PreferencePositionCallback)) {
                    if (adapter != 0) {
                        throw new java.lang.IllegalStateException("Adapter must implement PreferencePositionCallback");
                    }
                    return;
                }
                androidx.preference.Preference preference2 = preference;
                if (preference2 != null) {
                    preferenceAdapterPosition = ((androidx.preference.PreferenceGroup.PreferencePositionCallback) adapter).getPreferenceAdapterPosition(preference2);
                } else {
                    preferenceAdapterPosition = ((androidx.preference.PreferenceGroup.PreferencePositionCallback) adapter).getPreferenceAdapterPosition(str);
                }
                if (preferenceAdapterPosition != -1) {
                    androidx.preference.PreferenceFragmentCompat.this.getHighSpeedVideoFpsRangesFor.scrollToPosition(preferenceAdapterPosition);
                } else {
                    adapter.registerAdapterDataObserver(new androidx.preference.PreferenceFragmentCompat.ScrollToPreferenceObserver(adapter, androidx.preference.PreferenceFragmentCompat.this.getHighSpeedVideoFpsRangesFor, preference, str));
                }
            }
        };
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getInputSizeshNQ4ISI = runnable;
        } else {
            runnable.run();
        }
    }

    static class ScrollToPreferenceObserver extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {
        private final androidx.preference.Preference Camera2StreamConfigurationMap;
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        private final androidx.recyclerview.widget.RecyclerView getHighSpeedVideoFpsRanges;
        private final androidx.recyclerview.widget.RecyclerView.Adapter getHighSpeedVideoFpsRangesFor;

        public ScrollToPreferenceObserver(androidx.recyclerview.widget.RecyclerView.Adapter adapter, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.preference.Preference preference, java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = adapter;
            this.getHighSpeedVideoFpsRanges = recyclerView;
            this.Camera2StreamConfigurationMap = preference;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        private void getHighSpeedVideoSizes() {
            int preferenceAdapterPosition;
            this.getHighSpeedVideoFpsRangesFor.unregisterAdapterDataObserver(this);
            androidx.preference.Preference preference = this.Camera2StreamConfigurationMap;
            if (preference != null) {
                preferenceAdapterPosition = ((androidx.preference.PreferenceGroup.PreferencePositionCallback) this.getHighSpeedVideoFpsRangesFor).getPreferenceAdapterPosition(preference);
            } else {
                preferenceAdapterPosition = ((androidx.preference.PreferenceGroup.PreferencePositionCallback) this.getHighSpeedVideoFpsRangesFor).getPreferenceAdapterPosition(this.getHighResolutionOutputSizeshNQ4ISI);
            }
            if (preferenceAdapterPosition != -1) {
                this.getHighSpeedVideoFpsRanges.scrollToPosition(preferenceAdapterPosition);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            getHighSpeedVideoSizes();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            getHighSpeedVideoSizes();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, java.lang.Object obj) {
            getHighSpeedVideoSizes();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            getHighSpeedVideoSizes();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            getHighSpeedVideoSizes();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            getHighSpeedVideoSizes();
        }
    }

    class DividerDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
        private int getHighResolutionOutputSizeshNQ4ISI;
        private android.graphics.drawable.Drawable getHighSpeedVideoFpsRangesFor;
        private boolean getHighSpeedVideoSizes = true;

        DividerDecoration() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
            if (this.getHighSpeedVideoFpsRangesFor != null) {
                int childCount = recyclerView.getChildCount();
                int width = recyclerView.getWidth();
                for (int i = 0; i < childCount; i++) {
                    android.view.View childAt = recyclerView.getChildAt(i);
                    if (getHighSpeedVideoFpsRanges(childAt, recyclerView)) {
                        int y = ((int) childAt.getY()) + childAt.getHeight();
                        this.getHighSpeedVideoFpsRangesFor.setBounds(0, y, width, this.getHighResolutionOutputSizeshNQ4ISI + y);
                        this.getHighSpeedVideoFpsRangesFor.draw(canvas);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
            if (getHighSpeedVideoFpsRanges(view, recyclerView)) {
                rect.bottom = this.getHighResolutionOutputSizeshNQ4ISI;
            }
        }

        private boolean getHighSpeedVideoFpsRanges(android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            if (!(childViewHolder instanceof androidx.preference.PreferenceViewHolder) || !((androidx.preference.PreferenceViewHolder) childViewHolder).isDividerAllowedBelow()) {
                return false;
            }
            boolean z = this.getHighSpeedVideoSizes;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild >= recyclerView.getChildCount() - 1) {
                return z;
            }
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(indexOfChild + 1));
            return (childViewHolder2 instanceof androidx.preference.PreferenceViewHolder) && ((androidx.preference.PreferenceViewHolder) childViewHolder2).isDividerAllowedAbove();
        }

        public void Camera2StreamConfigurationMap(android.graphics.drawable.Drawable drawable) {
            if (drawable != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = drawable.getIntrinsicHeight();
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
            }
            this.getHighSpeedVideoFpsRangesFor = drawable;
            androidx.preference.PreferenceFragmentCompat.this.getHighSpeedVideoFpsRangesFor.invalidateItemDecorations();
        }

        public void getHighSpeedVideoFpsRanges(int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            androidx.preference.PreferenceFragmentCompat.this.getHighSpeedVideoFpsRangesFor.invalidateItemDecorations();
        }

        public void getHighSpeedVideoFpsRangesFor(boolean z) {
            this.getHighSpeedVideoSizes = z;
        }
    }
}
