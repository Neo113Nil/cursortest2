package androidx.preference;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public abstract class PreferenceFragment extends android.app.Fragment implements androidx.preference.PreferenceManager.OnPreferenceTreeClickListener, androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener, androidx.preference.PreferenceManager.OnNavigateToScreenListener, androidx.preference.DialogPreference.TargetFragment {

    @java.lang.Deprecated
    public static final java.lang.String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private boolean Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    androidx.recyclerview.widget.RecyclerView getHighSpeedVideoFpsRanges;
    private java.lang.Runnable getHighSpeedVideoSizesFor;
    private android.content.Context getOutputFormats;
    private androidx.preference.PreferenceManager getOutputMinFrameDuration;
    private final androidx.preference.PreferenceFragment.DividerDecoration getHighSpeedVideoFpsRangesFor = new androidx.preference.PreferenceFragment.DividerDecoration();
    private int getInputFormats = androidx.preference.R.layout.preference_list_fragment;
    private final android.os.Handler getHighSpeedVideoSizes = new android.os.Handler() { // from class: androidx.preference.PreferenceFragment.1
        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            if (message.what != 1) {
                return;
            }
            androidx.preference.PreferenceFragment.this.getHighResolutionOutputSizeshNQ4ISI();
        }
    };
    private final java.lang.Runnable getInputSizeshNQ4ISI = new java.lang.Runnable() { // from class: androidx.preference.PreferenceFragment.2
        @Override // java.lang.Runnable
        public void run() {
            androidx.preference.PreferenceFragment.this.getHighSpeedVideoFpsRanges.focusableViewAvailable(androidx.preference.PreferenceFragment.this.getHighSpeedVideoFpsRanges);
        }
    };

    public interface OnPreferenceDisplayDialogCallback {
        boolean onPreferenceDisplayDialog(androidx.preference.PreferenceFragment preferenceFragment, androidx.preference.Preference preference);
    }

    public interface OnPreferenceStartFragmentCallback {
        boolean onPreferenceStartFragment(androidx.preference.PreferenceFragment preferenceFragment, androidx.preference.Preference preference);
    }

    public interface OnPreferenceStartScreenCallback {
        boolean onPreferenceStartScreen(androidx.preference.PreferenceFragment preferenceFragment, androidx.preference.PreferenceScreen preferenceScreen);
    }

    public android.app.Fragment getCallbackFragment() {
        return null;
    }

    protected void onBindPreferences() {
    }

    @java.lang.Deprecated
    public abstract void onCreatePreferences(android.os.Bundle bundle, java.lang.String str);

    protected void onUnbindPreferences() {
    }

    @Override // android.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.util.TypedValue typedValue = new android.util.TypedValue();
        getActivity().getTheme().resolveAttribute(androidx.preference.R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = androidx.preference.R.style.PreferenceThemeOverlay;
        }
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(getActivity(), i);
        this.getOutputFormats = contextThemeWrapper;
        androidx.preference.PreferenceManager preferenceManager = new androidx.preference.PreferenceManager(contextThemeWrapper);
        this.getOutputMinFrameDuration = preferenceManager;
        preferenceManager.setOnNavigateToScreenListener(this);
        onCreatePreferences(bundle, getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // android.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.content.res.TypedArray obtainStyledAttributes = this.getOutputFormats.obtainStyledAttributes(null, androidx.preference.R.styleable.PreferenceFragment, androidx.core.content.res.TypedArrayUtils.getAttr(this.getOutputFormats, androidx.preference.R.attr.preferenceFragmentStyle, android.R.attr.preferenceFragmentStyle), 0);
        this.getInputFormats = obtainStyledAttributes.getResourceId(androidx.preference.R.styleable.PreferenceFragment_android_layout, this.getInputFormats);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(androidx.preference.R.styleable.PreferenceFragment_android_divider);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(androidx.preference.R.styleable.PreferenceFragment_android_dividerHeight, -1);
        boolean z = obtainStyledAttributes.getBoolean(androidx.preference.R.styleable.PreferenceFragment_allowDividerAfterLastItem, true);
        obtainStyledAttributes.recycle();
        android.view.LayoutInflater cloneInContext = layoutInflater.cloneInContext(this.getOutputFormats);
        android.view.View inflate = cloneInContext.inflate(this.getInputFormats, viewGroup, false);
        android.view.View findViewById = inflate.findViewById(android.R.id.list_container);
        if (!(findViewById instanceof android.view.ViewGroup)) {
            throw new java.lang.RuntimeException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById;
        androidx.recyclerview.widget.RecyclerView onCreateRecyclerView = onCreateRecyclerView(cloneInContext, viewGroup2, bundle);
        if (onCreateRecyclerView == null) {
            throw new java.lang.RuntimeException("Could not create RecyclerView");
        }
        this.getHighSpeedVideoFpsRanges = onCreateRecyclerView;
        onCreateRecyclerView.addItemDecoration(this.getHighSpeedVideoFpsRangesFor);
        setDivider(drawable);
        if (dimensionPixelSize != -1) {
            setDividerHeight(dimensionPixelSize);
        }
        this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap = z;
        if (this.getHighSpeedVideoFpsRanges.getParent() == null) {
            viewGroup2.addView(this.getHighSpeedVideoFpsRanges);
        }
        this.getHighSpeedVideoSizes.post(this.getInputSizeshNQ4ISI);
        return inflate;
    }

    @java.lang.Deprecated
    public void setDivider(android.graphics.drawable.Drawable drawable) {
        androidx.preference.PreferenceFragment.DividerDecoration dividerDecoration = this.getHighSpeedVideoFpsRangesFor;
        if (drawable != null) {
            dividerDecoration.getHighSpeedVideoSizes = drawable.getIntrinsicHeight();
        } else {
            dividerDecoration.getHighSpeedVideoSizes = 0;
        }
        dividerDecoration.getHighResolutionOutputSizeshNQ4ISI = drawable;
        androidx.preference.PreferenceFragment.this.getHighSpeedVideoFpsRanges.invalidateItemDecorations();
    }

    @java.lang.Deprecated
    public void setDividerHeight(int i) {
        androidx.preference.PreferenceFragment.DividerDecoration dividerDecoration = this.getHighSpeedVideoFpsRangesFor;
        dividerDecoration.getHighSpeedVideoSizes = i;
        androidx.preference.PreferenceFragment.this.getHighSpeedVideoFpsRanges.invalidateItemDecorations();
    }

    @Override // android.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        androidx.preference.PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen = getPreferenceScreen()) != null) {
            preferenceScreen.restoreHierarchyState(bundle2);
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.preference.PreferenceScreen preferenceScreen2 = getPreferenceScreen();
            if (preferenceScreen2 != null) {
                getListView().setAdapter(onCreateAdapter(preferenceScreen2));
                preferenceScreen2.onAttached();
            }
            onBindPreferences();
            java.lang.Runnable runnable = this.getHighSpeedVideoSizesFor;
            if (runnable != null) {
                runnable.run();
                this.getHighSpeedVideoSizesFor = null;
            }
        }
        this.Camera2StreamConfigurationMap = true;
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.getOutputMinFrameDuration.setOnPreferenceTreeClickListener(this);
        this.getOutputMinFrameDuration.setOnDisplayPreferenceDialogListener(this);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.getOutputMinFrameDuration.setOnPreferenceTreeClickListener(null);
        this.getOutputMinFrameDuration.setOnDisplayPreferenceDialogListener(null);
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        this.getHighSpeedVideoSizes.removeCallbacks(this.getInputSizeshNQ4ISI);
        this.getHighSpeedVideoSizes.removeMessages(1);
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            androidx.preference.PreferenceScreen preferenceScreen = getPreferenceScreen();
            if (preferenceScreen != null) {
                preferenceScreen.onDetached();
            }
            onUnbindPreferences();
        }
        this.getHighSpeedVideoFpsRanges = null;
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        androidx.preference.PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            preferenceScreen.saveHierarchyState(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @java.lang.Deprecated
    public androidx.preference.PreferenceManager getPreferenceManager() {
        return this.getOutputMinFrameDuration;
    }

    @java.lang.Deprecated
    public void setPreferenceScreen(androidx.preference.PreferenceScreen preferenceScreen) {
        if (!this.getOutputMinFrameDuration.setPreferences(preferenceScreen) || preferenceScreen == null) {
            return;
        }
        onUnbindPreferences();
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        if (!this.Camera2StreamConfigurationMap || this.getHighSpeedVideoSizes.hasMessages(1)) {
            return;
        }
        this.getHighSpeedVideoSizes.obtainMessage(1).sendToTarget();
    }

    @java.lang.Deprecated
    public androidx.preference.PreferenceScreen getPreferenceScreen() {
        return this.getOutputMinFrameDuration.getPreferenceScreen();
    }

    @Override // androidx.preference.PreferenceManager.OnPreferenceTreeClickListener
    @java.lang.Deprecated
    public boolean onPreferenceTreeClick(androidx.preference.Preference preference) {
        if (preference.getFragment() != null) {
            r1 = getCallbackFragment() instanceof androidx.preference.PreferenceFragment.OnPreferenceStartFragmentCallback ? ((androidx.preference.PreferenceFragment.OnPreferenceStartFragmentCallback) getCallbackFragment()).onPreferenceStartFragment(this, preference) : false;
            if (!r1 && (getActivity() instanceof androidx.preference.PreferenceFragment.OnPreferenceStartFragmentCallback)) {
                return ((androidx.preference.PreferenceFragment.OnPreferenceStartFragmentCallback) getActivity()).onPreferenceStartFragment(this, preference);
            }
        }
        return r1;
    }

    @Override // androidx.preference.PreferenceManager.OnNavigateToScreenListener
    @java.lang.Deprecated
    public void onNavigateToScreen(androidx.preference.PreferenceScreen preferenceScreen) {
        if (!((getCallbackFragment() instanceof androidx.preference.PreferenceFragment.OnPreferenceStartScreenCallback) && ((androidx.preference.PreferenceFragment.OnPreferenceStartScreenCallback) getCallbackFragment()).onPreferenceStartScreen(this, preferenceScreen)) && (getActivity() instanceof androidx.preference.PreferenceFragment.OnPreferenceStartScreenCallback)) {
            ((androidx.preference.PreferenceFragment.OnPreferenceStartScreenCallback) getActivity()).onPreferenceStartScreen(this, preferenceScreen);
        }
    }

    @Override // androidx.preference.DialogPreference.TargetFragment
    @java.lang.Deprecated
    public <T extends androidx.preference.Preference> T findPreference(java.lang.CharSequence charSequence) {
        androidx.preference.PreferenceManager preferenceManager = this.getOutputMinFrameDuration;
        if (preferenceManager == null) {
            return null;
        }
        return (T) preferenceManager.findPreference(charSequence);
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        androidx.preference.PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            getListView().setAdapter(onCreateAdapter(preferenceScreen));
            preferenceScreen.onAttached();
        }
        onBindPreferences();
    }

    @java.lang.Deprecated
    public final androidx.recyclerview.widget.RecyclerView getListView() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @java.lang.Deprecated
    public androidx.recyclerview.widget.RecyclerView onCreateRecyclerView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        if (this.getOutputFormats.getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (androidx.recyclerview.widget.RecyclerView) viewGroup.findViewById(androidx.preference.R.id.recycler_view)) != null) {
            return recyclerView;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) layoutInflater.inflate(androidx.preference.R.layout.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new androidx.preference.PreferenceRecyclerViewAccessibilityDelegate(recyclerView2));
        return recyclerView2;
    }

    @java.lang.Deprecated
    public androidx.recyclerview.widget.RecyclerView.LayoutManager onCreateLayoutManager() {
        return new androidx.recyclerview.widget.LinearLayoutManager(getActivity());
    }

    @java.lang.Deprecated
    protected androidx.recyclerview.widget.RecyclerView.Adapter onCreateAdapter(androidx.preference.PreferenceScreen preferenceScreen) {
        return new androidx.preference.PreferenceGroupAdapter(preferenceScreen);
    }

    @Override // androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener
    @java.lang.Deprecated
    public void onDisplayPreferenceDialog(androidx.preference.Preference preference) {
        android.app.DialogFragment newInstance;
        boolean onPreferenceDisplayDialog = getCallbackFragment() instanceof androidx.preference.PreferenceFragment.OnPreferenceDisplayDialogCallback ? ((androidx.preference.PreferenceFragment.OnPreferenceDisplayDialogCallback) getCallbackFragment()).onPreferenceDisplayDialog(this, preference) : false;
        if (!onPreferenceDisplayDialog && (getActivity() instanceof androidx.preference.PreferenceFragment.OnPreferenceDisplayDialogCallback)) {
            onPreferenceDisplayDialog = ((androidx.preference.PreferenceFragment.OnPreferenceDisplayDialogCallback) getActivity()).onPreferenceDisplayDialog(this, preference);
        }
        if (onPreferenceDisplayDialog || getFragmentManager().findFragmentByTag("androidx.preference.PreferenceFragment.DIALOG") != null) {
            return;
        }
        if (preference instanceof androidx.preference.EditTextPreference) {
            newInstance = androidx.preference.EditTextPreferenceDialogFragment.newInstance(preference.getKey());
        } else if (preference instanceof androidx.preference.ListPreference) {
            newInstance = androidx.preference.ListPreferenceDialogFragment.newInstance(preference.getKey());
        } else if (preference instanceof androidx.preference.MultiSelectListPreference) {
            newInstance = androidx.preference.MultiSelectListPreferenceDialogFragment.newInstance(preference.getKey());
        } else {
            throw new java.lang.IllegalArgumentException("Tried to display dialog for unknown preference type. Did you forget to override onDisplayPreferenceDialog()?");
        }
        newInstance.setTargetFragment(this, 0);
        newInstance.show(getFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
    }

    /* renamed from: androidx.preference.PreferenceFragment$3, reason: invalid class name */
    class AnonymousClass3 implements java.lang.Runnable {
        final /* synthetic */ androidx.preference.Preference getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

        AnonymousClass3(androidx.preference.Preference preference, java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = preference;
            this.getHighSpeedVideoSizes = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            int preferenceAdapterPosition;
            androidx.recyclerview.widget.RecyclerView.Adapter adapter = androidx.preference.PreferenceFragment.this.getHighSpeedVideoFpsRanges.getAdapter();
            if (!(adapter instanceof androidx.preference.PreferenceGroup.PreferencePositionCallback)) {
                if (adapter != 0) {
                    throw new java.lang.IllegalStateException("Adapter must implement PreferencePositionCallback");
                }
                return;
            }
            androidx.preference.Preference preference = this.getHighSpeedVideoFpsRanges;
            if (preference != null) {
                preferenceAdapterPosition = ((androidx.preference.PreferenceGroup.PreferencePositionCallback) adapter).getPreferenceAdapterPosition(preference);
            } else {
                preferenceAdapterPosition = ((androidx.preference.PreferenceGroup.PreferencePositionCallback) adapter).getPreferenceAdapterPosition(this.getHighSpeedVideoSizes);
            }
            if (preferenceAdapterPosition != -1) {
                androidx.preference.PreferenceFragment.this.getHighSpeedVideoFpsRanges.scrollToPosition(preferenceAdapterPosition);
            } else {
                adapter.registerAdapterDataObserver(new androidx.preference.PreferenceFragment.ScrollToPreferenceObserver(adapter, androidx.preference.PreferenceFragment.this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes));
            }
        }
    }

    static class ScrollToPreferenceObserver extends androidx.recyclerview.widget.RecyclerView.AdapterDataObserver {
        private final java.lang.String Camera2StreamConfigurationMap;
        private final androidx.preference.Preference getHighResolutionOutputSizeshNQ4ISI;
        private final androidx.recyclerview.widget.RecyclerView.Adapter getHighSpeedVideoFpsRangesFor;
        private final androidx.recyclerview.widget.RecyclerView getHighSpeedVideoSizes;

        ScrollToPreferenceObserver(androidx.recyclerview.widget.RecyclerView.Adapter adapter, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.preference.Preference preference, java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor = adapter;
            this.getHighSpeedVideoSizes = recyclerView;
            this.getHighResolutionOutputSizeshNQ4ISI = preference;
            this.Camera2StreamConfigurationMap = str;
        }

        private void Camera2StreamConfigurationMap() {
            int preferenceAdapterPosition;
            this.getHighSpeedVideoFpsRangesFor.unregisterAdapterDataObserver(this);
            androidx.preference.Preference preference = this.getHighResolutionOutputSizeshNQ4ISI;
            if (preference != null) {
                preferenceAdapterPosition = ((androidx.preference.PreferenceGroup.PreferencePositionCallback) this.getHighSpeedVideoFpsRangesFor).getPreferenceAdapterPosition(preference);
            } else {
                preferenceAdapterPosition = ((androidx.preference.PreferenceGroup.PreferencePositionCallback) this.getHighSpeedVideoFpsRangesFor).getPreferenceAdapterPosition(this.Camera2StreamConfigurationMap);
            }
            if (preferenceAdapterPosition != -1) {
                this.getHighSpeedVideoSizes.scrollToPosition(preferenceAdapterPosition);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            Camera2StreamConfigurationMap();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            Camera2StreamConfigurationMap();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, java.lang.Object obj) {
            Camera2StreamConfigurationMap();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            Camera2StreamConfigurationMap();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            Camera2StreamConfigurationMap();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            Camera2StreamConfigurationMap();
        }
    }

    class DividerDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
        boolean Camera2StreamConfigurationMap = true;
        android.graphics.drawable.Drawable getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoSizes;

        DividerDecoration() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(android.graphics.Canvas canvas, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
            if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
                int childCount = recyclerView.getChildCount();
                int width = recyclerView.getWidth();
                for (int i = 0; i < childCount; i++) {
                    android.view.View childAt = recyclerView.getChildAt(i);
                    if (getHighSpeedVideoSizes(childAt, recyclerView)) {
                        int y = ((int) childAt.getY()) + childAt.getHeight();
                        this.getHighResolutionOutputSizeshNQ4ISI.setBounds(0, y, width, this.getHighSpeedVideoSizes + y);
                        this.getHighResolutionOutputSizeshNQ4ISI.draw(canvas);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.State state) {
            if (getHighSpeedVideoSizes(view, recyclerView)) {
                rect.bottom = this.getHighSpeedVideoSizes;
            }
        }

        private boolean getHighSpeedVideoSizes(android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView) {
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            if (!(childViewHolder instanceof androidx.preference.PreferenceViewHolder) || !((androidx.preference.PreferenceViewHolder) childViewHolder).isDividerAllowedBelow()) {
                return false;
            }
            boolean z = this.Camera2StreamConfigurationMap;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild >= recyclerView.getChildCount() - 1) {
                return z;
            }
            androidx.recyclerview.widget.RecyclerView.ViewHolder childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(indexOfChild + 1));
            return (childViewHolder2 instanceof androidx.preference.PreferenceViewHolder) && ((androidx.preference.PreferenceViewHolder) childViewHolder2).isDividerAllowedAbove();
        }
    }

    @java.lang.Deprecated
    public void addPreferencesFromResource(int i) {
        androidx.preference.PreferenceManager preferenceManager = this.getOutputMinFrameDuration;
        if (preferenceManager != null) {
            setPreferenceScreen(preferenceManager.inflateFromResource(this.getOutputFormats, i, getPreferenceScreen()));
            return;
        }
        throw new java.lang.RuntimeException("This should be called after super.onCreate.");
    }

    @java.lang.Deprecated
    public void scrollToPreference(androidx.preference.Preference preference) {
        androidx.preference.PreferenceFragment.AnonymousClass3 anonymousClass3 = new androidx.preference.PreferenceFragment.AnonymousClass3(preference, null);
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoSizesFor = anonymousClass3;
        } else {
            anonymousClass3.run();
        }
    }

    @java.lang.Deprecated
    public void scrollToPreference(java.lang.String str) {
        androidx.preference.PreferenceFragment.AnonymousClass3 anonymousClass3 = new androidx.preference.PreferenceFragment.AnonymousClass3(null, str);
        if (this.getHighSpeedVideoFpsRanges == null) {
            this.getHighSpeedVideoSizesFor = anonymousClass3;
        } else {
            anonymousClass3.run();
        }
    }

    @java.lang.Deprecated
    public void setPreferencesFromResource(int i, java.lang.String str) {
        androidx.preference.PreferenceManager preferenceManager = this.getOutputMinFrameDuration;
        if (preferenceManager != null) {
            androidx.preference.PreferenceScreen inflateFromResource = preferenceManager.inflateFromResource(this.getOutputFormats, i, null);
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
            return;
        }
        throw new java.lang.RuntimeException("This should be called after super.onCreate.");
    }
}
