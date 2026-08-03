package androidx.preference;

/* loaded from: classes2.dex */
public class PreferenceGroupAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.preference.PreferenceViewHolder> implements androidx.preference.Preference.OnPreferenceChangeInternalListener, androidx.preference.PreferenceGroup.PreferencePositionCallback {
    private androidx.preference.PreferenceGroup mPreferenceGroup;
    private java.util.List<androidx.preference.PreferenceGroupAdapter.PreferenceResourceDescriptor> mPreferenceResourceDescriptors;
    private java.util.List<androidx.preference.Preference> mPreferences;
    private java.util.List<androidx.preference.Preference> mVisiblePreferences;
    private java.lang.Runnable mSyncRunnable = new java.lang.Runnable() { // from class: androidx.preference.PreferenceGroupAdapter.1
        @Override // java.lang.Runnable
        public void run() {
            androidx.preference.PreferenceGroupAdapter.this.updatePreferences();
        }
    };
    private android.os.Handler mHandler = new android.os.Handler();

    public PreferenceGroupAdapter(androidx.preference.PreferenceGroup preferenceGroup) {
        this.mPreferenceGroup = preferenceGroup;
        this.mPreferenceGroup.setOnPreferenceChangeInternalListener(this);
        this.mPreferences = new java.util.ArrayList();
        this.mVisiblePreferences = new java.util.ArrayList();
        this.mPreferenceResourceDescriptors = new java.util.ArrayList();
        androidx.preference.PreferenceGroup preferenceGroup2 = this.mPreferenceGroup;
        if (preferenceGroup2 instanceof androidx.preference.PreferenceScreen) {
            setHasStableIds(((androidx.preference.PreferenceScreen) preferenceGroup2).shouldUseGeneratedIds());
        } else {
            setHasStableIds(true);
        }
        updatePreferences();
    }

    void updatePreferences() {
        java.util.Iterator<androidx.preference.Preference> it = this.mPreferences.iterator();
        while (it.hasNext()) {
            it.next().setOnPreferenceChangeInternalListener(null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(this.mPreferences.size());
        this.mPreferences = arrayList;
        flattenPreferenceGroup(arrayList, this.mPreferenceGroup);
        final java.util.List<androidx.preference.Preference> list = this.mVisiblePreferences;
        final java.util.List<androidx.preference.Preference> createVisiblePreferencesList = createVisiblePreferencesList(this.mPreferenceGroup);
        this.mVisiblePreferences = createVisiblePreferencesList;
        androidx.preference.PreferenceManager preferenceManager = this.mPreferenceGroup.getPreferenceManager();
        if (preferenceManager != null && preferenceManager.getPreferenceComparisonCallback() != null) {
            final androidx.preference.PreferenceManager.PreferenceComparisonCallback preferenceComparisonCallback = preferenceManager.getPreferenceComparisonCallback();
            androidx.recyclerview.widget.DiffUtil.calculateDiff(new androidx.recyclerview.widget.DiffUtil.Callback() { // from class: androidx.preference.PreferenceGroupAdapter.2
                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public int getOldListSize() {
                    return list.size();
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public int getNewListSize() {
                    return createVisiblePreferencesList.size();
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean areItemsTheSame(int i, int i2) {
                    return preferenceComparisonCallback.arePreferenceItemsTheSame((androidx.preference.Preference) list.get(i), (androidx.preference.Preference) createVisiblePreferencesList.get(i2));
                }

                @Override // androidx.recyclerview.widget.DiffUtil.Callback
                public boolean areContentsTheSame(int i, int i2) {
                    return preferenceComparisonCallback.arePreferenceContentsTheSame((androidx.preference.Preference) list.get(i), (androidx.preference.Preference) createVisiblePreferencesList.get(i2));
                }
            }).dispatchUpdatesTo(this);
        } else {
            notifyDataSetChanged();
        }
        java.util.Iterator<androidx.preference.Preference> it2 = this.mPreferences.iterator();
        while (it2.hasNext()) {
            it2.next().clearWasDetached();
        }
    }

    private void flattenPreferenceGroup(java.util.List<androidx.preference.Preference> list, androidx.preference.PreferenceGroup preferenceGroup) {
        preferenceGroup.sortPreferences();
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            androidx.preference.Preference preference = preferenceGroup.getPreference(i);
            list.add(preference);
            androidx.preference.PreferenceGroupAdapter.PreferenceResourceDescriptor preferenceResourceDescriptor = new androidx.preference.PreferenceGroupAdapter.PreferenceResourceDescriptor(preference);
            if (!this.mPreferenceResourceDescriptors.contains(preferenceResourceDescriptor)) {
                this.mPreferenceResourceDescriptors.add(preferenceResourceDescriptor);
            }
            if (preference instanceof androidx.preference.PreferenceGroup) {
                androidx.preference.PreferenceGroup preferenceGroup2 = (androidx.preference.PreferenceGroup) preference;
                if (preferenceGroup2.isOnSameScreenAsChildren()) {
                    flattenPreferenceGroup(list, preferenceGroup2);
                }
            }
            preference.setOnPreferenceChangeInternalListener(this);
        }
    }

    private java.util.List<androidx.preference.Preference> createVisiblePreferencesList(androidx.preference.PreferenceGroup preferenceGroup) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int preferenceCount = preferenceGroup.getPreferenceCount();
        int i = 0;
        for (int i2 = 0; i2 < preferenceCount; i2++) {
            androidx.preference.Preference preference = preferenceGroup.getPreference(i2);
            if (preference.isVisible()) {
                if (!isGroupExpandable(preferenceGroup) || i < preferenceGroup.getInitialExpandedChildrenCount()) {
                    arrayList.add(preference);
                } else {
                    arrayList2.add(preference);
                }
                if (preference instanceof androidx.preference.PreferenceGroup) {
                    androidx.preference.PreferenceGroup preferenceGroup2 = (androidx.preference.PreferenceGroup) preference;
                    if (!preferenceGroup2.isOnSameScreenAsChildren()) {
                        continue;
                    } else {
                        if (isGroupExpandable(preferenceGroup) && isGroupExpandable(preferenceGroup2)) {
                            throw new java.lang.IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (androidx.preference.Preference preference2 : createVisiblePreferencesList(preferenceGroup2)) {
                            if (!isGroupExpandable(preferenceGroup) || i < preferenceGroup.getInitialExpandedChildrenCount()) {
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
        if (isGroupExpandable(preferenceGroup) && i > preferenceGroup.getInitialExpandedChildrenCount()) {
            arrayList.add(createExpandButton(preferenceGroup, arrayList2));
        }
        return arrayList;
    }

    private androidx.preference.ExpandButton createExpandButton(final androidx.preference.PreferenceGroup preferenceGroup, java.util.List<androidx.preference.Preference> list) {
        androidx.preference.ExpandButton expandButton = new androidx.preference.ExpandButton(preferenceGroup.getContext(), list, preferenceGroup.getId());
        expandButton.setOnPreferenceClickListener(new androidx.preference.Preference.OnPreferenceClickListener() { // from class: androidx.preference.PreferenceGroupAdapter.3
            @Override // androidx.preference.Preference.OnPreferenceClickListener
            public boolean onPreferenceClick(androidx.preference.Preference preference) {
                preferenceGroup.setInitialExpandedChildrenCount(Integer.MAX_VALUE);
                androidx.preference.PreferenceGroupAdapter.this.onPreferenceHierarchyChange(preference);
                androidx.preference.PreferenceGroup.OnExpandButtonClickListener onExpandButtonClickListener = preferenceGroup.getOnExpandButtonClickListener();
                if (onExpandButtonClickListener == null) {
                    return true;
                }
                onExpandButtonClickListener.onExpandButtonClick();
                return true;
            }
        });
        return expandButton;
    }

    private boolean isGroupExpandable(androidx.preference.PreferenceGroup preferenceGroup) {
        return preferenceGroup.getInitialExpandedChildrenCount() != Integer.MAX_VALUE;
    }

    public androidx.preference.Preference getItem(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        return this.mVisiblePreferences.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mVisiblePreferences.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (hasStableIds()) {
            return getItem(i).getId();
        }
        return -1L;
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeInternalListener
    public void onPreferenceChange(androidx.preference.Preference preference) {
        int indexOf = this.mVisiblePreferences.indexOf(preference);
        if (indexOf != -1) {
            notifyItemChanged(indexOf, preference);
        }
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeInternalListener
    public void onPreferenceHierarchyChange(androidx.preference.Preference preference) {
        this.mHandler.removeCallbacks(this.mSyncRunnable);
        this.mHandler.post(this.mSyncRunnable);
    }

    @Override // androidx.preference.Preference.OnPreferenceChangeInternalListener
    public void onPreferenceVisibilityChange(androidx.preference.Preference preference) {
        onPreferenceHierarchyChange(preference);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        androidx.preference.PreferenceGroupAdapter.PreferenceResourceDescriptor preferenceResourceDescriptor = new androidx.preference.PreferenceGroupAdapter.PreferenceResourceDescriptor(getItem(i));
        int indexOf = this.mPreferenceResourceDescriptors.indexOf(preferenceResourceDescriptor);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.mPreferenceResourceDescriptors.size();
        this.mPreferenceResourceDescriptors.add(preferenceResourceDescriptor);
        return size;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public androidx.preference.PreferenceViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
        androidx.preference.PreferenceGroupAdapter.PreferenceResourceDescriptor preferenceResourceDescriptor = this.mPreferenceResourceDescriptors.get(i);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(viewGroup.getContext());
        android.content.res.TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((android.util.AttributeSet) null, androidx.preference.R.styleable.BackgroundStyle);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(androidx.preference.R.styleable.BackgroundStyle_android_selectableItemBackground);
        if (drawable == null) {
            drawable = androidx.appcompat.content.res.AppCompatResources.getDrawable(viewGroup.getContext(), android.R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        android.view.View inflate = from.inflate(preferenceResourceDescriptor.mLayoutResId, viewGroup, false);
        if (inflate.getBackground() == null) {
            androidx.core.view.ViewCompat.setBackground(inflate, drawable);
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate.findViewById(android.R.id.widget_frame);
        if (viewGroup2 != null) {
            if (preferenceResourceDescriptor.mWidgetLayoutResId != 0) {
                from.inflate(preferenceResourceDescriptor.mWidgetLayoutResId, viewGroup2);
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
        int size = this.mVisiblePreferences.size();
        for (int i = 0; i < size; i++) {
            if (android.text.TextUtils.equals(str, this.mVisiblePreferences.get(i).getKey())) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.preference.PreferenceGroup.PreferencePositionCallback
    public int getPreferenceAdapterPosition(androidx.preference.Preference preference) {
        int size = this.mVisiblePreferences.size();
        for (int i = 0; i < size; i++) {
            androidx.preference.Preference preference2 = this.mVisiblePreferences.get(i);
            if (preference2 != null && preference2.equals(preference)) {
                return i;
            }
        }
        return -1;
    }

    private static class PreferenceResourceDescriptor {
        java.lang.String mClassName;
        int mLayoutResId;
        int mWidgetLayoutResId;

        PreferenceResourceDescriptor(androidx.preference.Preference preference) {
            this.mClassName = preference.getClass().getName();
            this.mLayoutResId = preference.getLayoutResource();
            this.mWidgetLayoutResId = preference.getWidgetLayoutResource();
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof androidx.preference.PreferenceGroupAdapter.PreferenceResourceDescriptor)) {
                return false;
            }
            androidx.preference.PreferenceGroupAdapter.PreferenceResourceDescriptor preferenceResourceDescriptor = (androidx.preference.PreferenceGroupAdapter.PreferenceResourceDescriptor) obj;
            return this.mLayoutResId == preferenceResourceDescriptor.mLayoutResId && this.mWidgetLayoutResId == preferenceResourceDescriptor.mWidgetLayoutResId && android.text.TextUtils.equals(this.mClassName, preferenceResourceDescriptor.mClassName);
        }

        public int hashCode() {
            return ((((com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.mLayoutResId) * 31) + this.mWidgetLayoutResId) * 31) + this.mClassName.hashCode();
        }
    }
}
