package androidx.preference;

/* loaded from: classes7.dex */
final class ExpandButton extends androidx.preference.Preference {
    private long Camera2StreamConfigurationMap;

    ExpandButton(android.content.Context context, java.util.List<androidx.preference.Preference> list, long j) {
        super(context);
        setLayoutResource(androidx.preference.R.layout.expand_button);
        setIcon(androidx.preference.R.drawable.ic_arrow_down_24dp);
        setTitle(androidx.preference.R.string.expand_button_title);
        setOrder(999);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.CharSequence charSequence = null;
        for (androidx.preference.Preference preference : list) {
            java.lang.CharSequence title = preference.getTitle();
            boolean z = preference instanceof androidx.preference.PreferenceGroup;
            if (z && !android.text.TextUtils.isEmpty(title)) {
                arrayList.add((androidx.preference.PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.getParent())) {
                if (z) {
                    arrayList.add((androidx.preference.PreferenceGroup) preference);
                }
            } else if (!android.text.TextUtils.isEmpty(title)) {
                charSequence = charSequence == null ? title : getContext().getString(androidx.preference.R.string.summary_collapsed_preference_list, charSequence, title);
            }
        }
        setSummary(charSequence);
        this.Camera2StreamConfigurationMap = j + 1000000;
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(androidx.preference.PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        preferenceViewHolder.setDividerAllowedAbove(false);
    }

    @Override // androidx.preference.Preference
    final long getHighSpeedVideoFpsRanges() {
        return this.Camera2StreamConfigurationMap;
    }
}
