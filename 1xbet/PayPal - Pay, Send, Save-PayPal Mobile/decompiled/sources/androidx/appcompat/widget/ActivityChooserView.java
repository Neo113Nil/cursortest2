package androidx.appcompat.widget;

/* loaded from: classes5.dex */
public class ActivityChooserView extends android.view.ViewGroup implements androidx.appcompat.widget.ActivityChooserModel.ActivityChooserModelClient {
    final android.view.View Camera2StreamConfigurationMap;
    final android.widget.FrameLayout getHighResolutionOutputSizeshNQ4ISI;
    final android.graphics.drawable.Drawable getHighSpeedVideoFpsRanges;
    final androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final android.database.DataSetObserver getHighSpeedVideoSizesFor;
    boolean getInputFormats;
    final android.widget.ImageView getInputSizeshNQ4ISI;
    final android.widget.FrameLayout getOutputFormats;
    int getOutputMinFrameDuration;
    private final androidx.appcompat.widget.ActivityChooserView.Callbacks getOutputMinFrameDurationlomOqCM;
    private boolean getOutputSizes;
    android.widget.PopupWindow.OnDismissListener getOutputSizeshNQ4ISI;
    androidx.core.view.ActionProvider getOutputStallDuration;
    private final android.widget.ImageView getOutputStallDurationlomOqCM;
    private final int isOutputSupportedFor;
    private androidx.appcompat.widget.ListPopupWindow isOutputSupportedForhNQ4ISI;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener toString;

    public ActivityChooserView(android.content.Context context) {
        this(context, null);
    }

    public ActivityChooserView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getHighSpeedVideoSizesFor = new android.database.DataSetObserver() { // from class: androidx.appcompat.widget.ActivityChooserView.1
            @Override // android.database.DataSetObserver
            public void onChanged() {
                super.onChanged();
                androidx.appcompat.widget.ActivityChooserView.this.getHighSpeedVideoFpsRangesFor.notifyDataSetChanged();
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                super.onInvalidated();
                androidx.appcompat.widget.ActivityChooserView.this.getHighSpeedVideoFpsRangesFor.notifyDataSetInvalidated();
            }
        };
        this.toString = new android.view.ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.ActivityChooserView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (androidx.appcompat.widget.ActivityChooserView.this.isShowingPopup()) {
                    if (!androidx.appcompat.widget.ActivityChooserView.this.isShown()) {
                        androidx.appcompat.widget.ActivityChooserView.this.getHighSpeedVideoFpsRangesFor().dismiss();
                        return;
                    }
                    androidx.appcompat.widget.ActivityChooserView.this.getHighSpeedVideoFpsRangesFor().show();
                    if (androidx.appcompat.widget.ActivityChooserView.this.getOutputStallDuration != null) {
                        androidx.appcompat.widget.ActivityChooserView.this.getOutputStallDuration.subUiVisibilityChanged(true);
                    }
                }
            }
        };
        this.getOutputMinFrameDuration = 4;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.ActivityChooserView, i, 0);
        androidx.core.view.ViewCompat.saveAttributeDataForStyleable(this, context, androidx.appcompat.R.styleable.ActivityChooserView, attributeSet, obtainStyledAttributes, i, 0);
        this.getOutputMinFrameDuration = obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.ActivityChooserView_initialActivityCount, 4);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        android.view.LayoutInflater.from(getContext()).inflate(androidx.appcompat.R.layout.abc_activity_chooser_view, (android.view.ViewGroup) this, true);
        androidx.appcompat.widget.ActivityChooserView.Callbacks callbacks = new androidx.appcompat.widget.ActivityChooserView.Callbacks();
        this.getOutputMinFrameDurationlomOqCM = callbacks;
        android.view.View findViewById = findViewById(androidx.appcompat.R.id.activity_chooser_view_content);
        this.Camera2StreamConfigurationMap = findViewById;
        this.getHighSpeedVideoFpsRanges = findViewById.getBackground();
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(androidx.appcompat.R.id.default_activity_button);
        this.getHighResolutionOutputSizeshNQ4ISI = frameLayout;
        frameLayout.setOnClickListener(callbacks);
        frameLayout.setOnLongClickListener(callbacks);
        this.getInputSizeshNQ4ISI = (android.widget.ImageView) frameLayout.findViewById(androidx.appcompat.R.id.image);
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) findViewById(androidx.appcompat.R.id.expand_activities_button);
        frameLayout2.setOnClickListener(callbacks);
        frameLayout2.setAccessibilityDelegate(new android.view.View.AccessibilityDelegate() { // from class: androidx.appcompat.widget.ActivityChooserView.3
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCanOpenPopup(true);
            }
        });
        frameLayout2.setOnTouchListener(new androidx.appcompat.widget.ForwardingListener(frameLayout2) { // from class: androidx.appcompat.widget.ActivityChooserView.4
            @Override // androidx.appcompat.widget.ForwardingListener
            public androidx.appcompat.view.menu.ShowableListMenu getPopup() {
                return androidx.appcompat.widget.ActivityChooserView.this.getHighSpeedVideoFpsRangesFor();
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            protected boolean onForwardingStarted() {
                androidx.appcompat.widget.ActivityChooserView.this.showPopup();
                return true;
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            protected boolean onForwardingStopped() {
                androidx.appcompat.widget.ActivityChooserView.this.dismissPopup();
                return true;
            }
        });
        this.getOutputFormats = frameLayout2;
        android.widget.ImageView imageView = (android.widget.ImageView) frameLayout2.findViewById(androidx.appcompat.R.id.image);
        this.getOutputStallDurationlomOqCM = imageView;
        imageView.setImageDrawable(drawable);
        androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter activityChooserViewAdapter = new androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter();
        this.getHighSpeedVideoFpsRangesFor = activityChooserViewAdapter;
        activityChooserViewAdapter.registerDataSetObserver(new android.database.DataSetObserver() { // from class: androidx.appcompat.widget.ActivityChooserView.5
            @Override // android.database.DataSetObserver
            public void onChanged() {
                super.onChanged();
                androidx.appcompat.widget.ActivityChooserView activityChooserView = androidx.appcompat.widget.ActivityChooserView.this;
                if (activityChooserView.getHighSpeedVideoFpsRangesFor.getCount() > 0) {
                    activityChooserView.getOutputFormats.setEnabled(true);
                } else {
                    activityChooserView.getOutputFormats.setEnabled(false);
                }
                int highSpeedVideoFpsRangesFor = activityChooserView.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor();
                int highSpeedVideoFpsRanges = activityChooserView.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges();
                if (highSpeedVideoFpsRangesFor == 1 || (highSpeedVideoFpsRangesFor > 1 && highSpeedVideoFpsRanges > 0)) {
                    activityChooserView.getHighResolutionOutputSizeshNQ4ISI.setVisibility(0);
                    android.content.pm.ResolveInfo Camera2StreamConfigurationMap = activityChooserView.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap();
                    android.content.pm.PackageManager packageManager = activityChooserView.getContext().getPackageManager();
                    activityChooserView.getInputSizeshNQ4ISI.setImageDrawable(Camera2StreamConfigurationMap.loadIcon(packageManager));
                    if (activityChooserView.getHighSpeedVideoSizes != 0) {
                        activityChooserView.getHighResolutionOutputSizeshNQ4ISI.setContentDescription(activityChooserView.getContext().getString(activityChooserView.getHighSpeedVideoSizes, Camera2StreamConfigurationMap.loadLabel(packageManager)));
                    }
                } else {
                    activityChooserView.getHighResolutionOutputSizeshNQ4ISI.setVisibility(8);
                }
                if (activityChooserView.getHighResolutionOutputSizeshNQ4ISI.getVisibility() == 0) {
                    activityChooserView.Camera2StreamConfigurationMap.setBackgroundDrawable(activityChooserView.getHighSpeedVideoFpsRanges);
                } else {
                    activityChooserView.Camera2StreamConfigurationMap.setBackgroundDrawable(null);
                }
            }
        });
        android.content.res.Resources resources = context.getResources();
        this.isOutputSupportedFor = java.lang.Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(androidx.appcompat.R.dimen.abc_config_prefDialogWidth));
    }

    @Override // androidx.appcompat.widget.ActivityChooserModel.ActivityChooserModelClient
    public void setActivityChooserModel(androidx.appcompat.widget.ActivityChooserModel activityChooserModel) {
        androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter activityChooserViewAdapter = this.getHighSpeedVideoFpsRangesFor;
        androidx.appcompat.widget.ActivityChooserModel activityChooserModel2 = androidx.appcompat.widget.ActivityChooserView.this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
        if (activityChooserModel2 != null && androidx.appcompat.widget.ActivityChooserView.this.isShown()) {
            activityChooserModel2.unregisterObserver(androidx.appcompat.widget.ActivityChooserView.this.getHighSpeedVideoSizesFor);
        }
        activityChooserViewAdapter.getHighResolutionOutputSizeshNQ4ISI = activityChooserModel;
        if (activityChooserModel != null && androidx.appcompat.widget.ActivityChooserView.this.isShown()) {
            activityChooserModel.registerObserver(androidx.appcompat.widget.ActivityChooserView.this.getHighSpeedVideoSizesFor);
        }
        activityChooserViewAdapter.notifyDataSetChanged();
        if (isShowingPopup()) {
            dismissPopup();
            showPopup();
        }
    }

    public void setExpandActivityOverflowButtonDrawable(android.graphics.drawable.Drawable drawable) {
        this.getOutputStallDurationlomOqCM.setImageDrawable(drawable);
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.getOutputStallDurationlomOqCM.setContentDescription(getContext().getString(i));
    }

    public void setProvider(androidx.core.view.ActionProvider actionProvider) {
        this.getOutputStallDuration = actionProvider;
    }

    public boolean showPopup() {
        if (isShowingPopup() || !this.getOutputSizes) {
            return false;
        }
        this.getInputFormats = false;
        getHighSpeedVideoSizes(this.getOutputMinFrameDuration);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    final void getHighSpeedVideoSizes(int i) {
        if (this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI == null) {
            throw new java.lang.IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.toString);
        ?? r0 = this.getHighResolutionOutputSizeshNQ4ISI.getVisibility() == 0 ? 1 : 0;
        int highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor();
        if (i != Integer.MAX_VALUE && highSpeedVideoFpsRangesFor > i + r0) {
            androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter activityChooserViewAdapter = this.getHighSpeedVideoFpsRangesFor;
            if (!activityChooserViewAdapter.getHighSpeedVideoSizes) {
                activityChooserViewAdapter.getHighSpeedVideoSizes = true;
                activityChooserViewAdapter.notifyDataSetChanged();
            }
            androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter activityChooserViewAdapter2 = this.getHighSpeedVideoFpsRangesFor;
            int i2 = i - 1;
            if (activityChooserViewAdapter2.getHighSpeedVideoFpsRanges != i2) {
                activityChooserViewAdapter2.getHighSpeedVideoFpsRanges = i2;
                activityChooserViewAdapter2.notifyDataSetChanged();
            }
        } else {
            androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter activityChooserViewAdapter3 = this.getHighSpeedVideoFpsRangesFor;
            if (activityChooserViewAdapter3.getHighSpeedVideoSizes) {
                activityChooserViewAdapter3.getHighSpeedVideoSizes = false;
                activityChooserViewAdapter3.notifyDataSetChanged();
            }
            androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter activityChooserViewAdapter4 = this.getHighSpeedVideoFpsRangesFor;
            if (activityChooserViewAdapter4.getHighSpeedVideoFpsRanges != i) {
                activityChooserViewAdapter4.getHighSpeedVideoFpsRanges = i;
                activityChooserViewAdapter4.notifyDataSetChanged();
            }
        }
        androidx.appcompat.widget.ListPopupWindow highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor();
        if (highSpeedVideoFpsRangesFor2.isShowing()) {
            return;
        }
        if (this.getInputFormats || r0 == 0) {
            androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter activityChooserViewAdapter5 = this.getHighSpeedVideoFpsRangesFor;
            if (!activityChooserViewAdapter5.Camera2StreamConfigurationMap || activityChooserViewAdapter5.getHighSpeedVideoFpsRangesFor != r0) {
                activityChooserViewAdapter5.Camera2StreamConfigurationMap = true;
                activityChooserViewAdapter5.getHighSpeedVideoFpsRangesFor = r0;
                activityChooserViewAdapter5.notifyDataSetChanged();
            }
        } else {
            androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter activityChooserViewAdapter6 = this.getHighSpeedVideoFpsRangesFor;
            if (activityChooserViewAdapter6.Camera2StreamConfigurationMap || activityChooserViewAdapter6.getHighSpeedVideoFpsRangesFor) {
                activityChooserViewAdapter6.Camera2StreamConfigurationMap = false;
                activityChooserViewAdapter6.getHighSpeedVideoFpsRangesFor = false;
                activityChooserViewAdapter6.notifyDataSetChanged();
            }
        }
        highSpeedVideoFpsRangesFor2.setContentWidth(java.lang.Math.min(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(), this.isOutputSupportedFor));
        highSpeedVideoFpsRangesFor2.show();
        androidx.core.view.ActionProvider actionProvider = this.getOutputStallDuration;
        if (actionProvider != null) {
            actionProvider.subUiVisibilityChanged(true);
        }
        highSpeedVideoFpsRangesFor2.getListView().setContentDescription(getContext().getString(androidx.appcompat.R.string.abc_activitychooserview_choose_application));
        highSpeedVideoFpsRangesFor2.getListView().setSelector(new android.graphics.drawable.ColorDrawable(0));
    }

    public boolean dismissPopup() {
        if (!isShowingPopup()) {
            return true;
        }
        getHighSpeedVideoFpsRangesFor().dismiss();
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.toString);
        return true;
    }

    public boolean isShowingPopup() {
        return getHighSpeedVideoFpsRangesFor().isShowing();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.appcompat.widget.ActivityChooserModel activityChooserModel = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
        if (activityChooserModel != null) {
            activityChooserModel.registerObserver(this.getHighSpeedVideoSizesFor);
        }
        this.getOutputSizes = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.ActivityChooserModel activityChooserModel = this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
        if (activityChooserModel != null) {
            activityChooserModel.unregisterObserver(this.getHighSpeedVideoSizesFor);
        }
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.toString);
        }
        if (isShowingPopup()) {
            dismissPopup();
        }
        this.getOutputSizes = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        android.view.View view = this.Camera2StreamConfigurationMap;
        if (this.getHighResolutionOutputSizeshNQ4ISI.getVisibility() != 0) {
            i2 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.Camera2StreamConfigurationMap.layout(0, 0, i3 - i, i4 - i2);
        if (isShowingPopup()) {
            return;
        }
        dismissPopup();
    }

    public androidx.appcompat.widget.ActivityChooserModel getDataModel() {
        return this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener onDismissListener) {
        this.getOutputSizeshNQ4ISI = onDismissListener;
    }

    public void setInitialActivityCount(int i) {
        this.getOutputMinFrameDuration = i;
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    final androidx.appcompat.widget.ListPopupWindow getHighSpeedVideoFpsRangesFor() {
        if (this.isOutputSupportedForhNQ4ISI == null) {
            androidx.appcompat.widget.ListPopupWindow listPopupWindow = new androidx.appcompat.widget.ListPopupWindow(getContext());
            this.isOutputSupportedForhNQ4ISI = listPopupWindow;
            listPopupWindow.setAdapter(this.getHighSpeedVideoFpsRangesFor);
            this.isOutputSupportedForhNQ4ISI.setAnchorView(this);
            this.isOutputSupportedForhNQ4ISI.setModal(true);
            this.isOutputSupportedForhNQ4ISI.setOnItemClickListener(this.getOutputMinFrameDurationlomOqCM);
            this.isOutputSupportedForhNQ4ISI.setOnDismissListener(this.getOutputMinFrameDurationlomOqCM);
        }
        return this.isOutputSupportedForhNQ4ISI;
    }

    class Callbacks implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.PopupWindow.OnDismissListener {
        Callbacks() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long j) {
            int itemViewType = ((androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    androidx.appcompat.widget.ActivityChooserView.this.getHighSpeedVideoSizes(Integer.MAX_VALUE);
                    return;
                }
                throw new java.lang.IllegalArgumentException();
            }
            androidx.appcompat.widget.ActivityChooserView.this.dismissPopup();
            if (!androidx.appcompat.widget.ActivityChooserView.this.getInputFormats) {
                if (!androidx.appcompat.widget.ActivityChooserView.this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap) {
                    i++;
                }
                android.content.Intent highSpeedVideoFpsRanges = androidx.appcompat.widget.ActivityChooserView.this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(i);
                if (highSpeedVideoFpsRanges != null) {
                    highSpeedVideoFpsRanges.addFlags(524288);
                    androidx.appcompat.widget.ActivityChooserView.this.getContext().startActivity(highSpeedVideoFpsRanges);
                    return;
                }
                return;
            }
            if (i > 0) {
                androidx.appcompat.widget.ActivityChooserModel activityChooserModel = androidx.appcompat.widget.ActivityChooserView.this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI;
                synchronized (activityChooserModel.getInputFormats) {
                    activityChooserModel.getHighSpeedVideoSizes();
                    androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo activityResolveInfo = activityChooserModel.getHighSpeedVideoSizes.get(i);
                    androidx.appcompat.widget.ActivityChooserModel.ActivityResolveInfo activityResolveInfo2 = activityChooserModel.getHighSpeedVideoSizes.get(0);
                    activityChooserModel.getHighSpeedVideoSizes(new androidx.appcompat.widget.ActivityChooserModel.HistoricalRecord(new android.content.ComponentName(activityResolveInfo.resolveInfo.activityInfo.packageName, activityResolveInfo.resolveInfo.activityInfo.name), java.lang.System.currentTimeMillis(), activityResolveInfo2 != null ? (activityResolveInfo2.weight - activityResolveInfo.weight) + 5.0f : 1.0f));
                }
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (view == androidx.appcompat.widget.ActivityChooserView.this.getHighResolutionOutputSizeshNQ4ISI) {
                androidx.appcompat.widget.ActivityChooserView.this.dismissPopup();
                android.content.Intent highSpeedVideoFpsRanges = androidx.appcompat.widget.ActivityChooserView.this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(androidx.appcompat.widget.ActivityChooserView.this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(androidx.appcompat.widget.ActivityChooserView.this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap()));
                if (highSpeedVideoFpsRanges != null) {
                    highSpeedVideoFpsRanges.addFlags(524288);
                    androidx.appcompat.widget.ActivityChooserView.this.getContext().startActivity(highSpeedVideoFpsRanges);
                    return;
                }
                return;
            }
            if (view == androidx.appcompat.widget.ActivityChooserView.this.getOutputFormats) {
                androidx.appcompat.widget.ActivityChooserView.this.getInputFormats = false;
                androidx.appcompat.widget.ActivityChooserView activityChooserView = androidx.appcompat.widget.ActivityChooserView.this;
                activityChooserView.getHighSpeedVideoSizes(activityChooserView.getOutputMinFrameDuration);
                return;
            }
            throw new java.lang.IllegalArgumentException();
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(android.view.View view) {
            if (view == androidx.appcompat.widget.ActivityChooserView.this.getHighResolutionOutputSizeshNQ4ISI) {
                if (androidx.appcompat.widget.ActivityChooserView.this.getHighSpeedVideoFpsRangesFor.getCount() > 0) {
                    androidx.appcompat.widget.ActivityChooserView.this.getInputFormats = true;
                    androidx.appcompat.widget.ActivityChooserView activityChooserView = androidx.appcompat.widget.ActivityChooserView.this;
                    activityChooserView.getHighSpeedVideoSizes(activityChooserView.getOutputMinFrameDuration);
                }
                return true;
            }
            throw new java.lang.IllegalArgumentException();
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (androidx.appcompat.widget.ActivityChooserView.this.getOutputSizeshNQ4ISI != null) {
                androidx.appcompat.widget.ActivityChooserView.this.getOutputSizeshNQ4ISI.onDismiss();
            }
            if (androidx.appcompat.widget.ActivityChooserView.this.getOutputStallDuration != null) {
                androidx.appcompat.widget.ActivityChooserView.this.getOutputStallDuration.subUiVisibilityChanged(false);
            }
        }
    }

    class ActivityChooserViewAdapter extends android.widget.BaseAdapter {
        boolean Camera2StreamConfigurationMap;
        androidx.appcompat.widget.ActivityChooserModel getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges = 4;
        boolean getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        ActivityChooserViewAdapter() {
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return (this.getHighSpeedVideoSizes && i == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int highSpeedVideoFpsRangesFor = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor();
            if (!this.Camera2StreamConfigurationMap && this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap() != null) {
                highSpeedVideoFpsRangesFor--;
            }
            int min = java.lang.Math.min(highSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            return this.getHighSpeedVideoSizes ? min + 1 : min;
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new java.lang.IllegalArgumentException();
            }
            if (!this.Camera2StreamConfigurationMap && this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap() != null) {
                i++;
            }
            return this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(i);
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    if (view != null && view.getId() == 1) {
                        return view;
                    }
                    android.view.View inflate = android.view.LayoutInflater.from(androidx.appcompat.widget.ActivityChooserView.this.getContext()).inflate(androidx.appcompat.R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
                    inflate.setId(1);
                    ((android.widget.TextView) inflate.findViewById(androidx.appcompat.R.id.title)).setText(androidx.appcompat.widget.ActivityChooserView.this.getContext().getString(androidx.appcompat.R.string.abc_activity_chooser_view_see_all));
                    return inflate;
                }
                throw new java.lang.IllegalArgumentException();
            }
            if (view == null || view.getId() != androidx.appcompat.R.id.list_item) {
                view = android.view.LayoutInflater.from(androidx.appcompat.widget.ActivityChooserView.this.getContext()).inflate(androidx.appcompat.R.layout.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            android.content.pm.PackageManager packageManager = androidx.appcompat.widget.ActivityChooserView.this.getContext().getPackageManager();
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(androidx.appcompat.R.id.icon);
            android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) getItem(i);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((android.widget.TextView) view.findViewById(androidx.appcompat.R.id.title)).setText(resolveInfo.loadLabel(packageManager));
            if (this.Camera2StreamConfigurationMap && i == 0 && this.getHighSpeedVideoFpsRangesFor) {
                view.setActivated(true);
                return view;
            }
            view.setActivated(false);
            return view;
        }

        public final int getHighSpeedVideoFpsRangesFor() {
            int i = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = Integer.MAX_VALUE;
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int i2 = 0;
            android.view.View view = null;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = java.lang.Math.max(i2, view.getMeasuredWidth());
            }
            this.getHighSpeedVideoFpsRanges = i;
            return i2;
        }
    }

    public static class InnerLayout extends android.widget.LinearLayout {
        private static final int[] Camera2StreamConfigurationMap = {android.R.attr.background};

        public InnerLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            androidx.appcompat.widget.TintTypedArray obtainStyledAttributes = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(context, attributeSet, Camera2StreamConfigurationMap);
            setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
            obtainStyledAttributes.recycle();
        }
    }
}
