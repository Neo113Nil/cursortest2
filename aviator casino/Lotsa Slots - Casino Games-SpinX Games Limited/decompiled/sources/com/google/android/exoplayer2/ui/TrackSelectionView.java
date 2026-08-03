package com.google.android.exoplayer2.ui;

/* loaded from: classes3.dex */
public class TrackSelectionView extends android.widget.LinearLayout {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final com.google.android.exoplayer2.ui.TrackSelectionView.ComponentListener componentListener;
    private final android.widget.CheckedTextView defaultView;
    private final android.widget.CheckedTextView disableView;
    private final android.view.LayoutInflater inflater;
    private boolean isDisabled;
    private com.google.android.exoplayer2.ui.TrackSelectionView.TrackSelectionListener listener;
    private final java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> overrides;
    private final int selectableItemBackgroundResourceId;
    private final java.util.List<com.google.android.exoplayer2.Tracks.Group> trackGroups;
    private java.util.Comparator<com.google.android.exoplayer2.ui.TrackSelectionView.TrackInfo> trackInfoComparator;
    private com.google.android.exoplayer2.ui.TrackNameProvider trackNameProvider;
    private android.widget.CheckedTextView[][] trackViews;

    public interface TrackSelectionListener {
        void onTrackSelectionChanged(boolean z, java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> map);
    }

    public static java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> filterOverrides(java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> map, java.util.List<com.google.android.exoplayer2.Tracks.Group> list, boolean z) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i = 0; i < list.size(); i++) {
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride trackSelectionOverride = map.get(list.get(i).getMediaTrackGroup());
            if (trackSelectionOverride != null && (z || hashMap.isEmpty())) {
                hashMap.put(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
            }
        }
        return hashMap;
    }

    public TrackSelectionView(android.content.Context context) {
        this(context, null);
    }

    public TrackSelectionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.selectableItemBackgroundResourceId = resourceId;
        obtainStyledAttributes.recycle();
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        this.inflater = from;
        com.google.android.exoplayer2.ui.TrackSelectionView.ComponentListener componentListener = new com.google.android.exoplayer2.ui.TrackSelectionView.ComponentListener();
        this.componentListener = componentListener;
        this.trackNameProvider = new com.google.android.exoplayer2.ui.DefaultTrackNameProvider(getResources());
        this.trackGroups = new java.util.ArrayList();
        this.overrides = new java.util.HashMap();
        android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) from.inflate(android.R.layout.simple_list_item_single_choice, (android.view.ViewGroup) this, false);
        this.disableView = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.google.android.exoplayer2.ui.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(componentListener);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(com.google.android.exoplayer2.ui.R.layout.exo_list_divider, (android.view.ViewGroup) this, false));
        android.widget.CheckedTextView checkedTextView2 = (android.widget.CheckedTextView) from.inflate(android.R.layout.simple_list_item_single_choice, (android.view.ViewGroup) this, false);
        this.defaultView = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.google.android.exoplayer2.ui.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(componentListener);
        addView(checkedTextView2);
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.allowAdaptiveSelections != z) {
            this.allowAdaptiveSelections = z;
            updateViews();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.allowMultipleOverrides != z) {
            this.allowMultipleOverrides = z;
            if (!z && this.overrides.size() > 1) {
                java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> filterOverrides = filterOverrides(this.overrides, this.trackGroups, false);
                this.overrides.clear();
                this.overrides.putAll(filterOverrides);
            }
            updateViews();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.disableView.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(com.google.android.exoplayer2.ui.TrackNameProvider trackNameProvider) {
        this.trackNameProvider = (com.google.android.exoplayer2.ui.TrackNameProvider) com.google.android.exoplayer2.util.Assertions.checkNotNull(trackNameProvider);
        updateViews();
    }

    public void init(java.util.List<com.google.android.exoplayer2.Tracks.Group> list, boolean z, java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> map, final java.util.Comparator<com.google.android.exoplayer2.Format> comparator, com.google.android.exoplayer2.ui.TrackSelectionView.TrackSelectionListener trackSelectionListener) {
        this.isDisabled = z;
        this.trackInfoComparator = comparator == null ? null : new java.util.Comparator() { // from class: com.google.android.exoplayer2.ui.TrackSelectionView$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int compare;
                compare = comparator.compare(((com.google.android.exoplayer2.ui.TrackSelectionView.TrackInfo) obj).getFormat(), ((com.google.android.exoplayer2.ui.TrackSelectionView.TrackInfo) obj2).getFormat());
                return compare;
            }
        };
        this.listener = trackSelectionListener;
        this.trackGroups.clear();
        this.trackGroups.addAll(list);
        this.overrides.clear();
        this.overrides.putAll(filterOverrides(map, list, this.allowMultipleOverrides));
        updateViews();
    }

    public boolean getIsDisabled() {
        return this.isDisabled;
    }

    public java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> getOverrides() {
        return this.overrides;
    }

    private void updateViews() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.trackGroups.isEmpty()) {
            this.disableView.setEnabled(false);
            this.defaultView.setEnabled(false);
            return;
        }
        this.disableView.setEnabled(true);
        this.defaultView.setEnabled(true);
        this.trackViews = new android.widget.CheckedTextView[this.trackGroups.size()][];
        boolean shouldEnableMultiGroupSelection = shouldEnableMultiGroupSelection();
        for (int i = 0; i < this.trackGroups.size(); i++) {
            com.google.android.exoplayer2.Tracks.Group group = this.trackGroups.get(i);
            boolean shouldEnableAdaptiveSelection = shouldEnableAdaptiveSelection(group);
            this.trackViews[i] = new android.widget.CheckedTextView[group.length];
            int i2 = group.length;
            com.google.android.exoplayer2.ui.TrackSelectionView.TrackInfo[] trackInfoArr = new com.google.android.exoplayer2.ui.TrackSelectionView.TrackInfo[i2];
            for (int i3 = 0; i3 < group.length; i3++) {
                trackInfoArr[i3] = new com.google.android.exoplayer2.ui.TrackSelectionView.TrackInfo(group, i3);
            }
            java.util.Comparator<com.google.android.exoplayer2.ui.TrackSelectionView.TrackInfo> comparator = this.trackInfoComparator;
            if (comparator != null) {
                java.util.Arrays.sort(trackInfoArr, comparator);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                if (i4 == 0) {
                    addView(this.inflater.inflate(com.google.android.exoplayer2.ui.R.layout.exo_list_divider, (android.view.ViewGroup) this, false));
                }
                android.widget.CheckedTextView checkedTextView = (android.widget.CheckedTextView) this.inflater.inflate((shouldEnableAdaptiveSelection || shouldEnableMultiGroupSelection) ? android.R.layout.simple_list_item_multiple_choice : android.R.layout.simple_list_item_single_choice, (android.view.ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.selectableItemBackgroundResourceId);
                checkedTextView.setText(this.trackNameProvider.getTrackName(trackInfoArr[i4].getFormat()));
                checkedTextView.setTag(trackInfoArr[i4]);
                if (group.isTrackSupported(i4)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.componentListener);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.trackViews[i][i4] = checkedTextView;
                addView(checkedTextView);
            }
        }
        updateViewStates();
    }

    private void updateViewStates() {
        this.disableView.setChecked(this.isDisabled);
        this.defaultView.setChecked(!this.isDisabled && this.overrides.size() == 0);
        for (int i = 0; i < this.trackViews.length; i++) {
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride trackSelectionOverride = this.overrides.get(this.trackGroups.get(i).getMediaTrackGroup());
            int i2 = 0;
            while (true) {
                android.widget.CheckedTextView[] checkedTextViewArr = this.trackViews[i];
                if (i2 < checkedTextViewArr.length) {
                    if (trackSelectionOverride != null) {
                        this.trackViews[i][i2].setChecked(trackSelectionOverride.trackIndices.contains(java.lang.Integer.valueOf(((com.google.android.exoplayer2.ui.TrackSelectionView.TrackInfo) com.google.android.exoplayer2.util.Assertions.checkNotNull(checkedTextViewArr[i2].getTag())).trackIndex)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClick(android.view.View view) {
        if (view == this.disableView) {
            onDisableViewClicked();
        } else if (view == this.defaultView) {
            onDefaultViewClicked();
        } else {
            onTrackViewClicked(view);
        }
        updateViewStates();
        com.google.android.exoplayer2.ui.TrackSelectionView.TrackSelectionListener trackSelectionListener = this.listener;
        if (trackSelectionListener != null) {
            trackSelectionListener.onTrackSelectionChanged(getIsDisabled(), getOverrides());
        }
    }

    private void onDisableViewClicked() {
        this.isDisabled = true;
        this.overrides.clear();
    }

    private void onDefaultViewClicked() {
        this.isDisabled = false;
        this.overrides.clear();
    }

    private void onTrackViewClicked(android.view.View view) {
        this.isDisabled = false;
        com.google.android.exoplayer2.ui.TrackSelectionView.TrackInfo trackInfo = (com.google.android.exoplayer2.ui.TrackSelectionView.TrackInfo) com.google.android.exoplayer2.util.Assertions.checkNotNull(view.getTag());
        com.google.android.exoplayer2.source.TrackGroup mediaTrackGroup = trackInfo.trackGroup.getMediaTrackGroup();
        int i = trackInfo.trackIndex;
        com.google.android.exoplayer2.trackselection.TrackSelectionOverride trackSelectionOverride = this.overrides.get(mediaTrackGroup);
        if (trackSelectionOverride == null) {
            if (!this.allowMultipleOverrides && this.overrides.size() > 0) {
                this.overrides.clear();
            }
            this.overrides.put(mediaTrackGroup, new com.google.android.exoplayer2.trackselection.TrackSelectionOverride(mediaTrackGroup, com.google.common.collect.ImmutableList.of(java.lang.Integer.valueOf(i))));
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(trackSelectionOverride.trackIndices);
        boolean isChecked = ((android.widget.CheckedTextView) view).isChecked();
        boolean shouldEnableAdaptiveSelection = shouldEnableAdaptiveSelection(trackInfo.trackGroup);
        boolean z = shouldEnableAdaptiveSelection || shouldEnableMultiGroupSelection();
        if (isChecked && z) {
            arrayList.remove(java.lang.Integer.valueOf(i));
            if (arrayList.isEmpty()) {
                this.overrides.remove(mediaTrackGroup);
                return;
            } else {
                this.overrides.put(mediaTrackGroup, new com.google.android.exoplayer2.trackselection.TrackSelectionOverride(mediaTrackGroup, arrayList));
                return;
            }
        }
        if (isChecked) {
            return;
        }
        if (shouldEnableAdaptiveSelection) {
            arrayList.add(java.lang.Integer.valueOf(i));
            this.overrides.put(mediaTrackGroup, new com.google.android.exoplayer2.trackselection.TrackSelectionOverride(mediaTrackGroup, arrayList));
        } else {
            this.overrides.put(mediaTrackGroup, new com.google.android.exoplayer2.trackselection.TrackSelectionOverride(mediaTrackGroup, com.google.common.collect.ImmutableList.of(java.lang.Integer.valueOf(i))));
        }
    }

    private boolean shouldEnableAdaptiveSelection(com.google.android.exoplayer2.Tracks.Group group) {
        return this.allowAdaptiveSelections && group.isAdaptiveSupported();
    }

    private boolean shouldEnableMultiGroupSelection() {
        return this.allowMultipleOverrides && this.trackGroups.size() > 1;
    }

    private class ComponentListener implements android.view.View.OnClickListener {
        private ComponentListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            com.google.android.exoplayer2.ui.TrackSelectionView.this.onClick(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class TrackInfo {
        public final com.google.android.exoplayer2.Tracks.Group trackGroup;
        public final int trackIndex;

        public TrackInfo(com.google.android.exoplayer2.Tracks.Group group, int i) {
            this.trackGroup = group;
            this.trackIndex = i;
        }

        public com.google.android.exoplayer2.Format getFormat() {
            return this.trackGroup.getTrackFormat(this.trackIndex);
        }
    }
}
