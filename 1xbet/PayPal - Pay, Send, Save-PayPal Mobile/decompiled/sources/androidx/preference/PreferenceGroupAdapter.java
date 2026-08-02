package androidx.preference;

/* loaded from: classes7.dex */
public class PreferenceGroupAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.preference.PreferenceViewHolder> implements androidx.preference.Preference.OnPreferenceChangeInternalListener, androidx.preference.PreferenceGroup.PreferencePositionCallback {
    private java.util.List<androidx.preference.Preference> Camera2StreamConfigurationMap;
    private androidx.preference.PreferenceGroup getHighSpeedVideoFpsRanges;
    private java.util.List<androidx.preference.PreferenceGroupAdapter.PreferenceResourceDescriptor> getHighSpeedVideoFpsRangesFor;
    private java.util.List<androidx.preference.Preference> getInputFormats;
    private java.lang.Runnable getHighSpeedVideoSizes = new java.lang.Runnable() { // from class: androidx.preference.PreferenceGroupAdapter.1
        @Override // java.lang.Runnable
        public void run() {
            androidx.preference.PreferenceGroupAdapter.this.getHighSpeedVideoFpsRangesFor();
        }
    };
    private android.os.Handler getHighResolutionOutputSizeshNQ4ISI = new android.os.Handler();

    public PreferenceGroupAdapter(androidx.preference.PreferenceGroup preferenceGroup) {
        this.getHighSpeedVideoFpsRanges = preferenceGroup;
        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this);
        this.Camera2StreamConfigurationMap = new java.util.ArrayList();
        this.getInputFormats = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        androidx.preference.PreferenceGroup preferenceGroup2 = this.getHighSpeedVideoFpsRanges;
        if (preferenceGroup2 instanceof androidx.preference.PreferenceScreen) {
            setHasStableIds(((androidx.preference.PreferenceScreen) preferenceGroup2).shouldUseGeneratedIds());
        } else {
            setHasStableIds(true);
        }
        getHighSpeedVideoFpsRangesFor();
    }

    final void getHighSpeedVideoFpsRangesFor() {
        java.util.Iterator<androidx.preference.Preference> it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            it.next().getHighSpeedVideoFpsRangesFor((androidx.preference.Preference.OnPreferenceChangeInternalListener) null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.Camera2StreamConfigurationMap.size());
        this.Camera2StreamConfigurationMap = arrayList;
        getHighSpeedVideoFpsRanges(arrayList, this.getHighSpeedVideoFpsRanges);
        final java.util.List<androidx.preference.Preference> list = this.getInputFormats;
        final java.util.List<androidx.preference.Preference> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges);
        this.getInputFormats = highResolutionOutputSizeshNQ4ISI;
        androidx.preference.PreferenceManager preferenceManager = this.getHighSpeedVideoFpsRanges.getPreferenceManager();
        if (preferenceManager != null && preferenceManager.getPreferenceComparisonCallback() != null) {
            final androidx.preference.PreferenceManager.PreferenceComparisonCallback preferenceComparisonCallback = preferenceManager.getPreferenceComparisonCallback();
            androidx.recyclerview.widget.DiffUtil.calculateDiff(new androidx.recyclerview.widget.DiffUtil.Callback() { // from class: androidx.preference.PreferenceGroupAdapter.2
                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                /* renamed from: getOldListSize */
                public int getGetHighResolutionOutputSizeshNQ4ISI() {
                    return list.size();
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                /* renamed from: getNewListSize */
                public int getGetHighSpeedVideoFpsRangesFor() {
                    return highResolutionOutputSizeshNQ4ISI.size();
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean areItemsTheSame(int i, int i2) {
                    return preferenceComparisonCallback.arePreferenceItemsTheSame((androidx.preference.Preference) list.get(i), (androidx.preference.Preference) highResolutionOutputSizeshNQ4ISI.get(i2));
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean areContentsTheSame(int i, int i2) {
                    return preferenceComparisonCallback.arePreferenceContentsTheSame((androidx.preference.Preference) list.get(i), (androidx.preference.Preference) highResolutionOutputSizeshNQ4ISI.get(i2));
                }
            }).dispatchUpdatesTo(this);
        } else {
            notifyDataSetChanged();
        }
        java.util.Iterator<androidx.preference.Preference> it2 = this.Camera2StreamConfigurationMap.iterator();
        while (it2.hasNext()) {
            it2.next().getHighSpeedVideoSizes();
        }
    }

    private java.util.List<androidx.preference.Preference> getHighResolutionOutputSizeshNQ4ISI(final androidx.preference.PreferenceGroup preferenceGroup) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int preferenceCount = preferenceGroup.getPreferenceCount();
        int i = 0;
        for (int i2 = 0; i2 < preferenceCount; i2++) {
            androidx.preference.Preference preference = preferenceGroup.getPreference(i2);
            if (preference.isVisible()) {
                if (preferenceGroup.getInitialExpandedChildrenCount() == Integer.MAX_VALUE || i < preferenceGroup.getInitialExpandedChildrenCount()) {
                    arrayList.add(preference);
                } else {
                    arrayList2.add(preference);
                }
                if (preference instanceof androidx.preference.PreferenceGroup) {
                    androidx.preference.PreferenceGroup preferenceGroup2 = (androidx.preference.PreferenceGroup) preference;
                    if (!preferenceGroup2.isOnSameScreenAsChildren()) {
                        continue;
                    } else {
                        if (preferenceGroup.getInitialExpandedChildrenCount() != Integer.MAX_VALUE && preferenceGroup2.getInitialExpandedChildrenCount() != Integer.MAX_VALUE) {
                            throw new java.lang.IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (androidx.preference.Preference preference2 : getHighResolutionOutputSizeshNQ4ISI(preferenceGroup2)) {
                            if (preferenceGroup.getInitialExpandedChildrenCount() == Integer.MAX_VALUE || i < preferenceGroup.getInitialExpandedChildrenCount()) {
                                arrayList.add(preference2);
                            } else {
                                arrayList2.add(preference2);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (preferenceGroup.getInitialExpandedChildrenCount() != Integer.MAX_VALUE && i > preferenceGroup.getInitialExpandedChildrenCount()) {
            androidx.preference.ExpandButton expandButton = new androidx.preference.ExpandButton(preferenceGroup.getContext(), arrayList2, preferenceGroup.getHighSpeedVideoFpsRanges());
            expandButton.setOnPreferenceClickListener(new androidx.preference.Preference.OnPreferenceClickListener() { // from class: androidx.preference.PreferenceGroupAdapter.3
                @Override // androidx.preference.Preference.OnPreferenceClickListener
                public boolean onPreferenceClick(androidx.preference.Preference preference3) {
                    preferenceGroup.setInitialExpandedChildrenCount(Integer.MAX_VALUE);
                    androidx.preference.PreferenceGroupAdapter.this.onPreferenceHierarchyChange(preference3);
                    androidx.preference.PreferenceGroup.OnExpandButtonClickListener onExpandButtonClickListener = preferenceGroup.getOnExpandButtonClickListener();
                    if (onExpandButtonClickListener == null) {
                        return true;
                    }
                    onExpandButtonClickListener.onExpandButtonClick();
                    return true;
                }
            });
            arrayList.add(expandButton);
        }
        return arrayList;
    }

    public androidx.preference.Preference getItem(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        return this.getInputFormats.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.getInputFormats.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (hasStableIds()) {
            return getItem(i).getHighSpeedVideoFpsRanges();
        }
        return -1L;
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeInternalListener
    public void onPreferenceChange(androidx.preference.Preference preference) {
        int indexOf = this.getInputFormats.indexOf(preference);
        if (indexOf != -1) {
            notifyItemChanged(indexOf, preference);
        }
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeInternalListener
    public void onPreferenceHierarchyChange(androidx.preference.Preference preference) {
        this.getHighResolutionOutputSizeshNQ4ISI.removeCallbacks(this.getHighSpeedVideoSizes);
        this.getHighResolutionOutputSizeshNQ4ISI.post(this.getHighSpeedVideoSizes);
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeInternalListener
    public void onPreferenceVisibilityChange(androidx.preference.Preference preference) {
        onPreferenceHierarchyChange(preference);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        androidx.preference.PreferenceGroupAdapter.PreferenceResourceDescriptor preferenceResourceDescriptor = new androidx.preference.PreferenceGroupAdapter.PreferenceResourceDescriptor(getItem(i));
        int indexOf = this.getHighSpeedVideoFpsRangesFor.indexOf(preferenceResourceDescriptor);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.getHighSpeedVideoFpsRangesFor.size();
        this.getHighSpeedVideoFpsRangesFor.add(preferenceResourceDescriptor);
        return size;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public androidx.preference.PreferenceViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        androidx.preference.PreferenceGroupAdapter.PreferenceResourceDescriptor preferenceResourceDescriptor = this.getHighSpeedVideoFpsRangesFor.get(i);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(viewGroup.getContext());
        android.content.res.TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((android.util.AttributeSet) null, androidx.preference.R.styleable.BackgroundStyle);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(androidx.preference.R.styleable.BackgroundStyle_android_selectableItemBackground);
        if (drawable == null) {
            drawable = androidx.appcompat.content.res.AppCompatResources.getDrawable(viewGroup.getContext(), android.R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        android.view.View inflate = from.inflate(preferenceResourceDescriptor.getHighSpeedVideoSizes, viewGroup, false);
        if (inflate.getBackground() == null) {
            androidx.core.view.ViewCompat.setBackground(inflate, drawable);
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate.findViewById(android.R.id.widget_frame);
        if (viewGroup2 != null) {
            if (preferenceResourceDescriptor.Camera2StreamConfigurationMap != 0) {
                from.inflate(preferenceResourceDescriptor.Camera2StreamConfigurationMap, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new androidx.preference.PreferenceViewHolder(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(androidx.preference.PreferenceViewHolder preferenceViewHolder, int i) {
        getItem(i).onBindViewHolder(preferenceViewHolder);
    }

    @Override // androidx.preference.PreferenceGroup.PreferencePositionCallback
    public int getPreferenceAdapterPosition(java.lang.String str) {
        int size = this.getInputFormats.size();
        for (int i = 0; i < size; i++) {
            if (android.text.TextUtils.equals(str, this.getInputFormats.get(i).getKey())) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.preference.PreferenceGroup.PreferencePositionCallback
    public int getPreferenceAdapterPosition(androidx.preference.Preference preference) {
        int size = this.getInputFormats.size();
        for (int i = 0; i < size; i++) {
            androidx.preference.Preference preference2 = this.getInputFormats.get(i);
            if (preference2 != null && preference2.equals(preference)) {
                return i;
            }
        }
        return -1;
    }

    static class PreferenceResourceDescriptor {
        int Camera2StreamConfigurationMap;
        java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoSizes;

        PreferenceResourceDescriptor(androidx.preference.Preference preference) {
            this.getHighResolutionOutputSizeshNQ4ISI = preference.getClass().getName();
            this.getHighSpeedVideoSizes = preference.getLayoutResource();
            this.Camera2StreamConfigurationMap = preference.getWidgetLayoutResource();
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.preference.PreferenceGroupAdapter.PreferenceResourceDescriptor)) {
                return false;
            }
            androidx.preference.PreferenceGroupAdapter.PreferenceResourceDescriptor preferenceResourceDescriptor = (androidx.preference.PreferenceGroupAdapter.PreferenceResourceDescriptor) obj;
            return this.getHighSpeedVideoSizes == preferenceResourceDescriptor.getHighSpeedVideoSizes && this.Camera2StreamConfigurationMap == preferenceResourceDescriptor.Camera2StreamConfigurationMap && android.text.TextUtils.equals(this.getHighResolutionOutputSizeshNQ4ISI, preferenceResourceDescriptor.getHighResolutionOutputSizeshNQ4ISI);
        }

        public int hashCode() {
            return ((((this.getHighSpeedVideoSizes + 527) * 31) + this.Camera2StreamConfigurationMap) * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        }
    }

    private void getHighSpeedVideoFpsRanges(java.util.List<androidx.preference.Preference> list, androidx.preference.PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            java.util.Collections.sort(preferenceGroup.getHighSpeedVideoSizes);
        }
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            androidx.preference.Preference preference = preferenceGroup.getPreference(i);
            list.add(preference);
            androidx.preference.PreferenceGroupAdapter.PreferenceResourceDescriptor preferenceResourceDescriptor = new androidx.preference.PreferenceGroupAdapter.PreferenceResourceDescriptor(preference);
            if (!this.getHighSpeedVideoFpsRangesFor.contains(preferenceResourceDescriptor)) {
                this.getHighSpeedVideoFpsRangesFor.add(preferenceResourceDescriptor);
            }
            if (preference instanceof androidx.preference.PreferenceGroup) {
                androidx.preference.PreferenceGroup preferenceGroup2 = (androidx.preference.PreferenceGroup) preference;
                if (preferenceGroup2.isOnSameScreenAsChildren()) {
                    getHighSpeedVideoFpsRanges(list, preferenceGroup2);
                }
            }
            preference.getHighSpeedVideoFpsRangesFor(this);
        }
    }
}
