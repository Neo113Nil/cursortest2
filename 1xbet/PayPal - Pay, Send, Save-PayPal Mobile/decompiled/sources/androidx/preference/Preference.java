package androidx.preference;

/* loaded from: classes7.dex */
public class Preference implements java.lang.Comparable<androidx.preference.Preference> {
    public static final int DEFAULT_ORDER = Integer.MAX_VALUE;
    private androidx.preference.PreferenceManager AMEXKernel;
    private boolean AMEXKernela;
    private androidx.preference.Preference.OnPreferenceChangeListener ArtificialStackFrames;
    private boolean Camera2StreamConfigurationMap;
    private androidx.preference.Preference.OnPreferenceClickListener CoroutineDebuggingKt;
    private boolean _BOUNDARY;
    private androidx.preference.Preference.OnPreferenceCopyListener _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private androidx.preference.PreferenceGroup f2748a;
    private int accessartificialFrame;
    private boolean b;
    private boolean c;
    private java.lang.String coroutineBoundary;
    private androidx.preference.Preference.OnPreferenceChangeInternalListener coroutineCreation;
    private boolean d;
    private java.lang.CharSequence exchange;
    private int getARTIFICIAL_FRAME_PACKAGE_NAME;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private android.content.Context getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoFpsRangesFor;
    private final android.view.View.OnClickListener getHighSpeedVideoSizes;
    private java.lang.String getHighSpeedVideoSizesFor;
    private boolean getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private java.lang.Object getOutputFormats;
    private java.util.List<androidx.preference.Preference> getOutputMinFrameDuration;
    private java.lang.String getOutputMinFrameDurationlomOqCM;
    private boolean getOutputSizes;
    private boolean getOutputSizeshNQ4ISI;
    private android.os.Bundle getOutputStallDuration;
    private boolean getOutputStallDurationlomOqCM;
    private long getValidOutputFormatsForInputhNQ4ISI;
    private androidx.preference.PreferenceDataStore init;
    private int isOutputSupportedFor;
    private boolean isOutputSupportedForhNQ4ISI;
    private boolean kernelVersion;
    private boolean l;
    private int release;
    private boolean requestPINEntry;
    private androidx.preference.Preference.SummaryProvider resetTransaction;
    private java.lang.CharSequence startTransaction;
    private android.content.Intent toString;
    private android.graphics.drawable.Drawable unwrapAs;
    private int updateUI;

    interface OnPreferenceChangeInternalListener {
        void onPreferenceChange(androidx.preference.Preference preference);

        void onPreferenceHierarchyChange(androidx.preference.Preference preference);

        void onPreferenceVisibilityChange(androidx.preference.Preference preference);
    }

    public interface OnPreferenceChangeListener {
        boolean onPreferenceChange(androidx.preference.Preference preference, java.lang.Object obj);
    }

    public interface OnPreferenceClickListener {
        boolean onPreferenceClick(androidx.preference.Preference preference);
    }

    public interface SummaryProvider<T extends androidx.preference.Preference> {
        java.lang.CharSequence provideSummary(T t);
    }

    protected void onClick() {
    }

    protected java.lang.Object onGetDefaultValue(android.content.res.TypedArray typedArray, int i) {
        return null;
    }

    @java.lang.Deprecated
    public void onInitializeAccessibilityNodeInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    protected void onSetInitialValue(java.lang.Object obj) {
    }

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = Integer.MAX_VALUE;
        this.release = 0;
        this.getOutputSizes = true;
        this.d = true;
        this.b = true;
        this.getInputSizeshNQ4ISI = true;
        this._BOUNDARY = true;
        this.requestPINEntry = true;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getHighSpeedVideoFpsRangesFor = true;
        this.AMEXKernela = true;
        this.kernelVersion = true;
        this.accessartificialFrame = androidx.preference.R.layout.preference;
        this.getHighSpeedVideoSizes = new android.view.View.OnClickListener() { // from class: androidx.preference.Preference.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                androidx.preference.Preference.this.performClick(view);
            }
        };
        this.getHighSpeedVideoFpsRanges = context;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.R.styleable.Preference, i, i2);
        this.isOutputSupportedFor = androidx.core.content.res.TypedArrayUtils.getResourceId(obtainStyledAttributes, androidx.preference.R.styleable.Preference_icon, androidx.preference.R.styleable.Preference_android_icon, 0);
        this.coroutineBoundary = androidx.core.content.res.TypedArrayUtils.getString(obtainStyledAttributes, androidx.preference.R.styleable.Preference_key, androidx.preference.R.styleable.Preference_android_key);
        this.startTransaction = androidx.core.content.res.TypedArrayUtils.getText(obtainStyledAttributes, androidx.preference.R.styleable.Preference_title, androidx.preference.R.styleable.Preference_android_title);
        this.exchange = androidx.core.content.res.TypedArrayUtils.getText(obtainStyledAttributes, androidx.preference.R.styleable.Preference_summary, androidx.preference.R.styleable.Preference_android_summary);
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = androidx.core.content.res.TypedArrayUtils.getInt(obtainStyledAttributes, androidx.preference.R.styleable.Preference_order, androidx.preference.R.styleable.Preference_android_order, Integer.MAX_VALUE);
        this.getOutputMinFrameDurationlomOqCM = androidx.core.content.res.TypedArrayUtils.getString(obtainStyledAttributes, androidx.preference.R.styleable.Preference_fragment, androidx.preference.R.styleable.Preference_android_fragment);
        this.accessartificialFrame = androidx.core.content.res.TypedArrayUtils.getResourceId(obtainStyledAttributes, androidx.preference.R.styleable.Preference_layout, androidx.preference.R.styleable.Preference_android_layout, androidx.preference.R.layout.preference);
        this.updateUI = androidx.core.content.res.TypedArrayUtils.getResourceId(obtainStyledAttributes, androidx.preference.R.styleable.Preference_widgetLayout, androidx.preference.R.styleable.Preference_android_widgetLayout, 0);
        this.getOutputSizes = androidx.core.content.res.TypedArrayUtils.getBoolean(obtainStyledAttributes, androidx.preference.R.styleable.Preference_enabled, androidx.preference.R.styleable.Preference_android_enabled, true);
        this.d = androidx.core.content.res.TypedArrayUtils.getBoolean(obtainStyledAttributes, androidx.preference.R.styleable.Preference_selectable, androidx.preference.R.styleable.Preference_android_selectable, true);
        this.b = androidx.core.content.res.TypedArrayUtils.getBoolean(obtainStyledAttributes, androidx.preference.R.styleable.Preference_persistent, androidx.preference.R.styleable.Preference_android_persistent, true);
        this.getHighSpeedVideoSizesFor = androidx.core.content.res.TypedArrayUtils.getString(obtainStyledAttributes, androidx.preference.R.styleable.Preference_dependency, androidx.preference.R.styleable.Preference_android_dependency);
        int i3 = androidx.preference.R.styleable.Preference_allowDividerAbove;
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.core.content.res.TypedArrayUtils.getBoolean(obtainStyledAttributes, i3, i3, this.d);
        int i4 = androidx.preference.R.styleable.Preference_allowDividerBelow;
        this.getHighSpeedVideoFpsRangesFor = androidx.core.content.res.TypedArrayUtils.getBoolean(obtainStyledAttributes, i4, i4, this.d);
        if (obtainStyledAttributes.hasValue(androidx.preference.R.styleable.Preference_defaultValue)) {
            this.getOutputFormats = onGetDefaultValue(obtainStyledAttributes, androidx.preference.R.styleable.Preference_defaultValue);
        } else if (obtainStyledAttributes.hasValue(androidx.preference.R.styleable.Preference_android_defaultValue)) {
            this.getOutputFormats = onGetDefaultValue(obtainStyledAttributes, androidx.preference.R.styleable.Preference_android_defaultValue);
        }
        this.kernelVersion = androidx.core.content.res.TypedArrayUtils.getBoolean(obtainStyledAttributes, androidx.preference.R.styleable.Preference_shouldDisableView, androidx.preference.R.styleable.Preference_android_shouldDisableView, true);
        boolean hasValue = obtainStyledAttributes.hasValue(androidx.preference.R.styleable.Preference_singleLineTitle);
        this.getOutputSizeshNQ4ISI = hasValue;
        if (hasValue) {
            this.AMEXKernela = androidx.core.content.res.TypedArrayUtils.getBoolean(obtainStyledAttributes, androidx.preference.R.styleable.Preference_singleLineTitle, androidx.preference.R.styleable.Preference_android_singleLineTitle, true);
        }
        this.isOutputSupportedForhNQ4ISI = androidx.core.content.res.TypedArrayUtils.getBoolean(obtainStyledAttributes, androidx.preference.R.styleable.Preference_iconSpaceReserved, androidx.preference.R.styleable.Preference_android_iconSpaceReserved, false);
        int i5 = androidx.preference.R.styleable.Preference_isPreferenceVisible;
        this.requestPINEntry = androidx.core.content.res.TypedArrayUtils.getBoolean(obtainStyledAttributes, i5, i5, true);
        int i6 = androidx.preference.R.styleable.Preference_enableCopying;
        this.getInputFormats = androidx.core.content.res.TypedArrayUtils.getBoolean(obtainStyledAttributes, i6, i6, false);
        obtainStyledAttributes.recycle();
    }

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.TypedArrayUtils.getAttr(context, androidx.preference.R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }

    public Preference(android.content.Context context) {
        this(context, null);
    }

    public void setIntent(android.content.Intent intent) {
        this.toString = intent;
    }

    public android.content.Intent getIntent() {
        return this.toString;
    }

    public void setFragment(java.lang.String str) {
        this.getOutputMinFrameDurationlomOqCM = str;
    }

    public java.lang.String getFragment() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public void setPreferenceDataStore(androidx.preference.PreferenceDataStore preferenceDataStore) {
        this.init = preferenceDataStore;
    }

    public androidx.preference.PreferenceDataStore getPreferenceDataStore() {
        androidx.preference.PreferenceDataStore preferenceDataStore = this.init;
        if (preferenceDataStore != null) {
            return preferenceDataStore;
        }
        androidx.preference.PreferenceManager preferenceManager = this.AMEXKernel;
        if (preferenceManager != null) {
            return preferenceManager.getPreferenceDataStore();
        }
        return null;
    }

    public android.os.Bundle getExtras() {
        if (this.getOutputStallDuration == null) {
            this.getOutputStallDuration = new android.os.Bundle();
        }
        return this.getOutputStallDuration;
    }

    public android.os.Bundle peekExtras() {
        return this.getOutputStallDuration;
    }

    public void setLayoutResource(int i) {
        this.accessartificialFrame = i;
    }

    public final int getLayoutResource() {
        return this.accessartificialFrame;
    }

    public void setWidgetLayoutResource(int i) {
        this.updateUI = i;
    }

    public final int getWidgetLayoutResource() {
        return this.updateUI;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onBindViewHolder(androidx.preference.PreferenceViewHolder preferenceViewHolder) {
        java.lang.Integer num;
        android.widget.TextView textView;
        android.widget.ImageView imageView;
        android.view.View findViewById;
        boolean isCopyingEnabled;
        android.view.View view = preferenceViewHolder.itemView;
        view.setOnClickListener(this.getHighSpeedVideoSizes);
        view.setId(this.release);
        android.widget.TextView textView2 = (android.widget.TextView) preferenceViewHolder.findViewById(android.R.id.summary);
        if (textView2 != null) {
            java.lang.CharSequence summary = getSummary();
            if (!android.text.TextUtils.isEmpty(summary)) {
                textView2.setText(summary);
                textView2.setVisibility(0);
                num = java.lang.Integer.valueOf(textView2.getCurrentTextColor());
                textView = (android.widget.TextView) preferenceViewHolder.findViewById(android.R.id.title);
                if (textView != null) {
                    java.lang.CharSequence title = getTitle();
                    if (!android.text.TextUtils.isEmpty(title)) {
                        textView.setText(title);
                        textView.setVisibility(0);
                        if (this.getOutputSizeshNQ4ISI) {
                            textView.setSingleLine(this.AMEXKernela);
                        }
                        if (!isSelectable() && isEnabled() && num != null) {
                            textView.setTextColor(num.intValue());
                        }
                    } else {
                        textView.setVisibility(8);
                    }
                }
                imageView = (android.widget.ImageView) preferenceViewHolder.findViewById(android.R.id.icon);
                if (imageView != null) {
                    int i = this.isOutputSupportedFor;
                    if (i != 0 || this.unwrapAs != null) {
                        if (this.unwrapAs == null) {
                            this.unwrapAs = androidx.appcompat.content.res.AppCompatResources.getDrawable(this.getHighSpeedVideoFpsRanges, i);
                        }
                        android.graphics.drawable.Drawable drawable = this.unwrapAs;
                        if (drawable != null) {
                            imageView.setImageDrawable(drawable);
                        }
                    }
                    if (this.unwrapAs != null) {
                        imageView.setVisibility(0);
                    } else {
                        imageView.setVisibility(this.isOutputSupportedForhNQ4ISI ? 4 : 8);
                    }
                }
                findViewById = preferenceViewHolder.findViewById(androidx.preference.R.id.icon_frame);
                if (findViewById == null) {
                    findViewById = preferenceViewHolder.findViewById(16908350);
                }
                if (findViewById != null) {
                    if (this.unwrapAs != null) {
                        findViewById.setVisibility(0);
                    } else {
                        findViewById.setVisibility(this.isOutputSupportedForhNQ4ISI ? 4 : 8);
                    }
                }
                if (!this.kernelVersion) {
                    getHighSpeedVideoSizes(view, isEnabled());
                } else {
                    getHighSpeedVideoSizes(view, true);
                }
                boolean isSelectable = isSelectable();
                view.setFocusable(isSelectable);
                view.setClickable(isSelectable);
                preferenceViewHolder.setDividerAllowedAbove(this.getHighResolutionOutputSizeshNQ4ISI);
                preferenceViewHolder.setDividerAllowedBelow(this.getHighSpeedVideoFpsRangesFor);
                isCopyingEnabled = isCopyingEnabled();
                if (isCopyingEnabled && this._CREATION == null) {
                    this._CREATION = new androidx.preference.Preference.OnPreferenceCopyListener(this);
                }
                view.setOnCreateContextMenuListener(!isCopyingEnabled ? this._CREATION : null);
                view.setLongClickable(isCopyingEnabled);
                if (isCopyingEnabled || isSelectable) {
                }
                androidx.core.view.ViewCompat.setBackground(view, null);
                return;
            }
            textView2.setVisibility(8);
        }
        num = null;
        textView = (android.widget.TextView) preferenceViewHolder.findViewById(android.R.id.title);
        if (textView != null) {
        }
        imageView = (android.widget.ImageView) preferenceViewHolder.findViewById(android.R.id.icon);
        if (imageView != null) {
        }
        findViewById = preferenceViewHolder.findViewById(androidx.preference.R.id.icon_frame);
        if (findViewById == null) {
        }
        if (findViewById != null) {
        }
        if (!this.kernelVersion) {
        }
        boolean isSelectable2 = isSelectable();
        view.setFocusable(isSelectable2);
        view.setClickable(isSelectable2);
        preferenceViewHolder.setDividerAllowedAbove(this.getHighResolutionOutputSizeshNQ4ISI);
        preferenceViewHolder.setDividerAllowedBelow(this.getHighSpeedVideoFpsRangesFor);
        isCopyingEnabled = isCopyingEnabled();
        if (isCopyingEnabled) {
            this._CREATION = new androidx.preference.Preference.OnPreferenceCopyListener(this);
        }
        view.setOnCreateContextMenuListener(!isCopyingEnabled ? this._CREATION : null);
        view.setLongClickable(isCopyingEnabled);
        if (isCopyingEnabled) {
        }
    }

    private void getHighSpeedVideoSizes(android.view.View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                getHighSpeedVideoSizes(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public void setOrder(int i) {
        if (i != this.getARTIFICIAL_FRAME_PACKAGE_NAME) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = i;
            notifyHierarchyChanged();
        }
    }

    public int getOrder() {
        return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
    }

    public void setViewId(int i) {
        this.release = i;
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        if ((charSequence != null || this.startTransaction == null) && (charSequence == null || charSequence.equals(this.startTransaction))) {
            return;
        }
        this.startTransaction = charSequence;
        notifyChanged();
    }

    public void setTitle(int i) {
        setTitle(this.getHighSpeedVideoFpsRanges.getString(i));
    }

    public java.lang.CharSequence getTitle() {
        return this.startTransaction;
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        if (this.unwrapAs != drawable) {
            this.unwrapAs = drawable;
            this.isOutputSupportedFor = 0;
            notifyChanged();
        }
    }

    public void setIcon(int i) {
        setIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(this.getHighSpeedVideoFpsRanges, i));
        this.isOutputSupportedFor = i;
    }

    public android.graphics.drawable.Drawable getIcon() {
        int i;
        if (this.unwrapAs == null && (i = this.isOutputSupportedFor) != 0) {
            this.unwrapAs = androidx.appcompat.content.res.AppCompatResources.getDrawable(this.getHighSpeedVideoFpsRanges, i);
        }
        return this.unwrapAs;
    }

    public java.lang.CharSequence getSummary() {
        if (getSummaryProvider() != null) {
            return getSummaryProvider().provideSummary(this);
        }
        return this.exchange;
    }

    public void setSummary(java.lang.CharSequence charSequence) {
        if (getSummaryProvider() != null) {
            throw new java.lang.IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (android.text.TextUtils.equals(this.exchange, charSequence)) {
            return;
        }
        this.exchange = charSequence;
        notifyChanged();
    }

    public void setSummary(int i) {
        setSummary(this.getHighSpeedVideoFpsRanges.getString(i));
    }

    public void setEnabled(boolean z) {
        if (this.getOutputSizes != z) {
            this.getOutputSizes = z;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public boolean isEnabled() {
        return this.getOutputSizes && this.getInputSizeshNQ4ISI && this._BOUNDARY;
    }

    public void setSelectable(boolean z) {
        if (this.d != z) {
            this.d = z;
            notifyChanged();
        }
    }

    public boolean isSelectable() {
        return this.d;
    }

    public void setShouldDisableView(boolean z) {
        if (this.kernelVersion != z) {
            this.kernelVersion = z;
            notifyChanged();
        }
    }

    public boolean getShouldDisableView() {
        return this.kernelVersion;
    }

    public final void setVisible(boolean z) {
        if (this.requestPINEntry != z) {
            this.requestPINEntry = z;
            androidx.preference.Preference.OnPreferenceChangeInternalListener onPreferenceChangeInternalListener = this.coroutineCreation;
            if (onPreferenceChangeInternalListener != null) {
                onPreferenceChangeInternalListener.onPreferenceVisibilityChange(this);
            }
        }
    }

    public final boolean isVisible() {
        return this.requestPINEntry;
    }

    public final boolean isShown() {
        androidx.preference.PreferenceScreen preferenceScreen = this;
        while (preferenceScreen.isVisible() && preferenceScreen.getPreferenceManager() != null) {
            if (preferenceScreen == preferenceScreen.getPreferenceManager().getPreferenceScreen()) {
                return true;
            }
            preferenceScreen = preferenceScreen.getParent();
            if (preferenceScreen == null) {
                return false;
            }
        }
        return false;
    }

    long getHighSpeedVideoFpsRanges() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public void setKey(java.lang.String str) {
        this.coroutineBoundary = str;
        if (!this.c || hasKey()) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI();
    }

    public java.lang.String getKey() {
        return this.coroutineBoundary;
    }

    void getHighResolutionOutputSizeshNQ4ISI() {
        if (android.text.TextUtils.isEmpty(this.coroutineBoundary)) {
            throw new java.lang.IllegalStateException("Preference does not have a key assigned.");
        }
        this.c = true;
    }

    public boolean hasKey() {
        return !android.text.TextUtils.isEmpty(this.coroutineBoundary);
    }

    public boolean isPersistent() {
        return this.b;
    }

    protected boolean shouldPersist() {
        return this.AMEXKernel != null && isPersistent() && hasKey();
    }

    public void setPersistent(boolean z) {
        this.b = z;
    }

    public void setSingleLineTitle(boolean z) {
        this.getOutputSizeshNQ4ISI = true;
        this.AMEXKernela = z;
    }

    public boolean isSingleLineTitle() {
        return this.AMEXKernela;
    }

    public void setIconSpaceReserved(boolean z) {
        if (this.isOutputSupportedForhNQ4ISI != z) {
            this.isOutputSupportedForhNQ4ISI = z;
            notifyChanged();
        }
    }

    public boolean isIconSpaceReserved() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public void setCopyingEnabled(boolean z) {
        if (this.getInputFormats != z) {
            this.getInputFormats = z;
            notifyChanged();
        }
    }

    public boolean isCopyingEnabled() {
        return this.getInputFormats;
    }

    public final void setSummaryProvider(androidx.preference.Preference.SummaryProvider summaryProvider) {
        this.resetTransaction = summaryProvider;
        notifyChanged();
    }

    public final androidx.preference.Preference.SummaryProvider getSummaryProvider() {
        return this.resetTransaction;
    }

    public boolean callChangeListener(java.lang.Object obj) {
        androidx.preference.Preference.OnPreferenceChangeListener onPreferenceChangeListener = this.ArtificialStackFrames;
        return onPreferenceChangeListener == null || onPreferenceChangeListener.onPreferenceChange(this, obj);
    }

    public void setOnPreferenceChangeListener(androidx.preference.Preference.OnPreferenceChangeListener onPreferenceChangeListener) {
        this.ArtificialStackFrames = onPreferenceChangeListener;
    }

    public androidx.preference.Preference.OnPreferenceChangeListener getOnPreferenceChangeListener() {
        return this.ArtificialStackFrames;
    }

    public void setOnPreferenceClickListener(androidx.preference.Preference.OnPreferenceClickListener onPreferenceClickListener) {
        this.CoroutineDebuggingKt = onPreferenceClickListener;
    }

    public androidx.preference.Preference.OnPreferenceClickListener getOnPreferenceClickListener() {
        return this.CoroutineDebuggingKt;
    }

    protected void performClick(android.view.View view) {
        performClick();
    }

    public void performClick() {
        androidx.preference.PreferenceManager.OnPreferenceTreeClickListener onPreferenceTreeClickListener;
        if (isEnabled() && isSelectable()) {
            onClick();
            androidx.preference.Preference.OnPreferenceClickListener onPreferenceClickListener = this.CoroutineDebuggingKt;
            if (onPreferenceClickListener == null || !onPreferenceClickListener.onPreferenceClick(this)) {
                androidx.preference.PreferenceManager preferenceManager = getPreferenceManager();
                if ((preferenceManager == null || (onPreferenceTreeClickListener = preferenceManager.getOnPreferenceTreeClickListener()) == null || !onPreferenceTreeClickListener.onPreferenceTreeClick(this)) && this.toString != null) {
                    getContext().startActivity(this.toString);
                }
            }
        }
    }

    public android.content.Context getContext() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public android.content.SharedPreferences getSharedPreferences() {
        if (this.AMEXKernel == null || getPreferenceDataStore() != null) {
            return null;
        }
        return this.AMEXKernel.getSharedPreferences();
    }

    @Override // java.lang.Comparable
    public int compareTo(androidx.preference.Preference preference) {
        int i = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i2 = preference.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (i != i2) {
            return i - i2;
        }
        java.lang.CharSequence charSequence = this.startTransaction;
        java.lang.CharSequence charSequence2 = preference.startTransaction;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.startTransaction.toString());
    }

    final void getHighSpeedVideoFpsRangesFor(androidx.preference.Preference.OnPreferenceChangeInternalListener onPreferenceChangeInternalListener) {
        this.coroutineCreation = onPreferenceChangeInternalListener;
    }

    protected void notifyChanged() {
        androidx.preference.Preference.OnPreferenceChangeInternalListener onPreferenceChangeInternalListener = this.coroutineCreation;
        if (onPreferenceChangeInternalListener != null) {
            onPreferenceChangeInternalListener.onPreferenceChange(this);
        }
    }

    protected void notifyHierarchyChanged() {
        androidx.preference.Preference.OnPreferenceChangeInternalListener onPreferenceChangeInternalListener = this.coroutineCreation;
        if (onPreferenceChangeInternalListener != null) {
            onPreferenceChangeInternalListener.onPreferenceHierarchyChange(this);
        }
    }

    public androidx.preference.PreferenceManager getPreferenceManager() {
        return this.AMEXKernel;
    }

    protected void onAttachedToHierarchy(androidx.preference.PreferenceManager preferenceManager) {
        this.AMEXKernel = preferenceManager;
        if (!this.getOutputStallDurationlomOqCM) {
            this.getValidOutputFormatsForInputhNQ4ISI = preferenceManager.Camera2StreamConfigurationMap();
        }
        getHighSpeedVideoSizesFor();
    }

    protected void onAttachedToHierarchy(androidx.preference.PreferenceManager preferenceManager, long j) {
        this.getValidOutputFormatsForInputhNQ4ISI = j;
        this.getOutputStallDurationlomOqCM = true;
        try {
            onAttachedToHierarchy(preferenceManager);
        } finally {
            this.getOutputStallDurationlomOqCM = false;
        }
    }

    void getHighSpeedVideoFpsRanges(androidx.preference.PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.f2748a != null) {
            throw new java.lang.IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.f2748a = preferenceGroup;
    }

    public void onAttached() {
        getInputFormats();
    }

    public void onDetached() {
        getOutputMinFrameDuration();
        this.l = true;
    }

    final boolean Camera2StreamConfigurationMap() {
        return this.l;
    }

    final void getHighSpeedVideoSizes() {
        this.l = false;
    }

    private void getInputFormats() {
        if (android.text.TextUtils.isEmpty(this.getHighSpeedVideoSizesFor)) {
            return;
        }
        androidx.preference.Preference findPreferenceInHierarchy = findPreferenceInHierarchy(this.getHighSpeedVideoSizesFor);
        if (findPreferenceInHierarchy != null) {
            findPreferenceInHierarchy.getHighSpeedVideoSizes(this);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Dependency \"");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append("\" not found for preference \"");
        sb.append(this.coroutineBoundary);
        sb.append("\" (title: \"");
        sb.append((java.lang.Object) this.startTransaction);
        sb.append("\"");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    private void getOutputMinFrameDuration() {
        androidx.preference.Preference findPreferenceInHierarchy;
        java.lang.String str = this.getHighSpeedVideoSizesFor;
        if (str == null || (findPreferenceInHierarchy = findPreferenceInHierarchy(str)) == null) {
            return;
        }
        findPreferenceInHierarchy.getHighSpeedVideoFpsRangesFor(this);
    }

    protected <T extends androidx.preference.Preference> T findPreferenceInHierarchy(java.lang.String str) {
        androidx.preference.PreferenceManager preferenceManager = this.AMEXKernel;
        if (preferenceManager == null) {
            return null;
        }
        return (T) preferenceManager.findPreference(str);
    }

    private void getHighSpeedVideoSizes(androidx.preference.Preference preference) {
        if (this.getOutputMinFrameDuration == null) {
            this.getOutputMinFrameDuration = new java.util.ArrayList();
        }
        this.getOutputMinFrameDuration.add(preference);
        preference.onDependencyChanged(this, shouldDisableDependents());
    }

    private void getHighSpeedVideoFpsRangesFor(androidx.preference.Preference preference) {
        java.util.List<androidx.preference.Preference> list = this.getOutputMinFrameDuration;
        if (list != null) {
            list.remove(preference);
        }
    }

    public void notifyDependencyChange(boolean z) {
        java.util.List<androidx.preference.Preference> list = this.getOutputMinFrameDuration;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).onDependencyChanged(this, z);
            }
        }
    }

    public void onDependencyChanged(androidx.preference.Preference preference, boolean z) {
        if (this.getInputSizeshNQ4ISI == z) {
            this.getInputSizeshNQ4ISI = !z;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public void onParentChanged(androidx.preference.Preference preference, boolean z) {
        if (this._BOUNDARY == z) {
            this._BOUNDARY = !z;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public boolean shouldDisableDependents() {
        return !isEnabled();
    }

    public void setDependency(java.lang.String str) {
        getOutputMinFrameDuration();
        this.getHighSpeedVideoSizesFor = str;
        getInputFormats();
    }

    public java.lang.String getDependency() {
        return this.getHighSpeedVideoSizesFor;
    }

    public androidx.preference.PreferenceGroup getParent() {
        return this.f2748a;
    }

    protected void onPrepareForRemoval() {
        getOutputMinFrameDuration();
    }

    public void setDefaultValue(java.lang.Object obj) {
        this.getOutputFormats = obj;
    }

    private void getHighSpeedVideoSizesFor() {
        if (getPreferenceDataStore() != null) {
            onSetInitialValue(true, this.getOutputFormats);
            return;
        }
        if (!shouldPersist() || !getSharedPreferences().contains(this.coroutineBoundary)) {
            java.lang.Object obj = this.getOutputFormats;
            if (obj != null) {
                onSetInitialValue(false, obj);
                return;
            }
            return;
        }
        onSetInitialValue(true, null);
    }

    @java.lang.Deprecated
    protected void onSetInitialValue(boolean z, java.lang.Object obj) {
        onSetInitialValue(obj);
    }

    private void getHighSpeedVideoSizes(android.content.SharedPreferences.Editor editor) {
        if (!this.AMEXKernel.getHighResolutionOutputSizeshNQ4ISI) {
            editor.apply();
        }
    }

    protected boolean persistString(java.lang.String str) {
        if (!shouldPersist()) {
            return false;
        }
        if (android.text.TextUtils.equals(str, getPersistedString(null))) {
            return true;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putString(this.coroutineBoundary, str);
        } else {
            android.content.SharedPreferences.Editor highResolutionOutputSizeshNQ4ISI = this.AMEXKernel.getHighResolutionOutputSizeshNQ4ISI();
            highResolutionOutputSizeshNQ4ISI.putString(this.coroutineBoundary, str);
            getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI);
        }
        return true;
    }

    protected java.lang.String getPersistedString(java.lang.String str) {
        if (!shouldPersist()) {
            return str;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getString(this.coroutineBoundary, str);
        }
        return this.AMEXKernel.getSharedPreferences().getString(this.coroutineBoundary, str);
    }

    public boolean persistStringSet(java.util.Set<java.lang.String> set) {
        if (!shouldPersist()) {
            return false;
        }
        if (set.equals(getPersistedStringSet(null))) {
            return true;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putStringSet(this.coroutineBoundary, set);
        } else {
            android.content.SharedPreferences.Editor highResolutionOutputSizeshNQ4ISI = this.AMEXKernel.getHighResolutionOutputSizeshNQ4ISI();
            highResolutionOutputSizeshNQ4ISI.putStringSet(this.coroutineBoundary, set);
            getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI);
        }
        return true;
    }

    public java.util.Set<java.lang.String> getPersistedStringSet(java.util.Set<java.lang.String> set) {
        if (!shouldPersist()) {
            return set;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getStringSet(this.coroutineBoundary, set);
        }
        return this.AMEXKernel.getSharedPreferences().getStringSet(this.coroutineBoundary, set);
    }

    protected boolean persistInt(int i) {
        if (!shouldPersist()) {
            return false;
        }
        if (i == getPersistedInt(~i)) {
            return true;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putInt(this.coroutineBoundary, i);
        } else {
            android.content.SharedPreferences.Editor highResolutionOutputSizeshNQ4ISI = this.AMEXKernel.getHighResolutionOutputSizeshNQ4ISI();
            highResolutionOutputSizeshNQ4ISI.putInt(this.coroutineBoundary, i);
            getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI);
        }
        return true;
    }

    protected int getPersistedInt(int i) {
        if (!shouldPersist()) {
            return i;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getInt(this.coroutineBoundary, i);
        }
        return this.AMEXKernel.getSharedPreferences().getInt(this.coroutineBoundary, i);
    }

    protected boolean persistFloat(float f) {
        if (!shouldPersist()) {
            return false;
        }
        if (f == getPersistedFloat(Float.NaN)) {
            return true;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putFloat(this.coroutineBoundary, f);
        } else {
            android.content.SharedPreferences.Editor highResolutionOutputSizeshNQ4ISI = this.AMEXKernel.getHighResolutionOutputSizeshNQ4ISI();
            highResolutionOutputSizeshNQ4ISI.putFloat(this.coroutineBoundary, f);
            getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI);
        }
        return true;
    }

    protected float getPersistedFloat(float f) {
        if (!shouldPersist()) {
            return f;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getFloat(this.coroutineBoundary, f);
        }
        return this.AMEXKernel.getSharedPreferences().getFloat(this.coroutineBoundary, f);
    }

    protected boolean persistLong(long j) {
        if (!shouldPersist()) {
            return false;
        }
        if (j == getPersistedLong(~j)) {
            return true;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putLong(this.coroutineBoundary, j);
        } else {
            android.content.SharedPreferences.Editor highResolutionOutputSizeshNQ4ISI = this.AMEXKernel.getHighResolutionOutputSizeshNQ4ISI();
            highResolutionOutputSizeshNQ4ISI.putLong(this.coroutineBoundary, j);
            getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI);
        }
        return true;
    }

    protected long getPersistedLong(long j) {
        if (!shouldPersist()) {
            return j;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getLong(this.coroutineBoundary, j);
        }
        return this.AMEXKernel.getSharedPreferences().getLong(this.coroutineBoundary, j);
    }

    protected boolean persistBoolean(boolean z) {
        if (!shouldPersist()) {
            return false;
        }
        if (z == getPersistedBoolean(!z)) {
            return true;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            preferenceDataStore.putBoolean(this.coroutineBoundary, z);
        } else {
            android.content.SharedPreferences.Editor highResolutionOutputSizeshNQ4ISI = this.AMEXKernel.getHighResolutionOutputSizeshNQ4ISI();
            highResolutionOutputSizeshNQ4ISI.putBoolean(this.coroutineBoundary, z);
            getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI);
        }
        return true;
    }

    protected boolean getPersistedBoolean(boolean z) {
        if (!shouldPersist()) {
            return z;
        }
        androidx.preference.PreferenceDataStore preferenceDataStore = getPreferenceDataStore();
        if (preferenceDataStore != null) {
            return preferenceDataStore.getBoolean(this.coroutineBoundary, z);
        }
        return this.AMEXKernel.getSharedPreferences().getBoolean(this.coroutineBoundary, z);
    }

    public java.lang.String toString() {
        return getHighSpeedVideoFpsRangesFor().toString();
    }

    java.lang.StringBuilder getHighSpeedVideoFpsRangesFor() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.CharSequence title = getTitle();
        if (!android.text.TextUtils.isEmpty(title)) {
            sb.append(title);
            sb.append(' ');
        }
        java.lang.CharSequence summary = getSummary();
        if (!android.text.TextUtils.isEmpty(summary)) {
            sb.append(summary);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public void saveHierarchyState(android.os.Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    void dispatchSaveInstanceState(android.os.Bundle bundle) {
        if (hasKey()) {
            this.Camera2StreamConfigurationMap = false;
            android.os.Parcelable onSaveInstanceState = onSaveInstanceState();
            if (!this.Camera2StreamConfigurationMap) {
                throw new java.lang.IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (onSaveInstanceState != null) {
                bundle.putParcelable(this.coroutineBoundary, onSaveInstanceState);
            }
        }
    }

    protected android.os.Parcelable onSaveInstanceState() {
        this.Camera2StreamConfigurationMap = true;
        return androidx.preference.Preference.BaseSavedState.EMPTY_STATE;
    }

    public void restoreHierarchyState(android.os.Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    void dispatchRestoreInstanceState(android.os.Bundle bundle) {
        android.os.Parcelable parcelable;
        if (!hasKey() || (parcelable = bundle.getParcelable(this.coroutineBoundary)) == null) {
            return;
        }
        this.Camera2StreamConfigurationMap = false;
        onRestoreInstanceState(parcelable);
        if (!this.Camera2StreamConfigurationMap) {
            throw new java.lang.IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        this.Camera2StreamConfigurationMap = true;
        if (parcelable != androidx.preference.Preference.BaseSavedState.EMPTY_STATE && parcelable != null) {
            throw new java.lang.IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public static class BaseSavedState extends android.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.Preference.BaseSavedState> CREATOR = new android.os.Parcelable.Creator<androidx.preference.Preference.BaseSavedState>() { // from class: androidx.preference.Preference.BaseSavedState.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ androidx.preference.Preference.BaseSavedState createFromParcel(android.os.Parcel parcel) {
                return new androidx.preference.Preference.BaseSavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ androidx.preference.Preference.BaseSavedState[] newArray(int i) {
                return new androidx.preference.Preference.BaseSavedState[i];
            }
        };

        public BaseSavedState(android.os.Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }
    }

    static class OnPreferenceCopyListener implements android.view.View.OnCreateContextMenuListener, android.view.MenuItem.OnMenuItemClickListener {
        private final androidx.preference.Preference getHighSpeedVideoFpsRangesFor;

        OnPreferenceCopyListener(androidx.preference.Preference preference) {
            this.getHighSpeedVideoFpsRangesFor = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
            java.lang.CharSequence summary = this.getHighSpeedVideoFpsRangesFor.getSummary();
            if (!this.getHighSpeedVideoFpsRangesFor.isCopyingEnabled() || android.text.TextUtils.isEmpty(summary)) {
                return;
            }
            contextMenu.setHeaderTitle(summary);
            contextMenu.add(0, 0, 0, androidx.preference.R.string.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem menuItem) {
            android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) this.getHighSpeedVideoFpsRangesFor.getContext().getSystemService("clipboard");
            java.lang.CharSequence summary = this.getHighSpeedVideoFpsRangesFor.getSummary();
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText("Preference", summary));
            android.widget.Toast.makeText(this.getHighSpeedVideoFpsRangesFor.getContext(), this.getHighSpeedVideoFpsRangesFor.getContext().getString(androidx.preference.R.string.preference_copied, summary), 0).show();
            return true;
        }
    }
}
