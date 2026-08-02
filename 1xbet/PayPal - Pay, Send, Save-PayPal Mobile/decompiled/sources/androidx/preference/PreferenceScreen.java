package androidx.preference;

/* loaded from: classes7.dex */
public final class PreferenceScreen extends androidx.preference.PreferenceGroup {
    private boolean Camera2StreamConfigurationMap;

    @Override // androidx.preference.PreferenceGroup
    protected final boolean isOnSameScreenAsChildren() {
        return false;
    }

    public PreferenceScreen(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, androidx.core.content.res.TypedArrayUtils.getAttr(context, androidx.preference.R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.Camera2StreamConfigurationMap = true;
    }

    @Override // androidx.preference.Preference
    protected final void onClick() {
        androidx.preference.PreferenceManager.OnNavigateToScreenListener onNavigateToScreenListener;
        if (getIntent() != null || getFragment() != null || getPreferenceCount() == 0 || (onNavigateToScreenListener = getPreferenceManager().getOnNavigateToScreenListener()) == null) {
            return;
        }
        onNavigateToScreenListener.onNavigateToScreen(this);
    }

    public final boolean shouldUseGeneratedIds() {
        return this.Camera2StreamConfigurationMap;
    }

    public final void setShouldUseGeneratedIds(boolean z) {
        if (isAttached()) {
            throw new java.lang.IllegalStateException("Cannot change the usage of generated IDs while attached to the preference hierarchy");
        }
        this.Camera2StreamConfigurationMap = z;
    }
}
