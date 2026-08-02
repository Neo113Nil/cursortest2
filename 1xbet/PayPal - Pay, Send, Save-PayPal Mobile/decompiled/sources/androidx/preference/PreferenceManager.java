package androidx.preference;

/* loaded from: classes7.dex */
public class PreferenceManager {
    public static final java.lang.String KEY_HAS_SET_DEFAULT_VALUES = "_has_set_default_values";
    private androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    private android.content.SharedPreferences.Editor getHighSpeedVideoFpsRanges;
    private android.content.Context getHighSpeedVideoSizes;
    private androidx.preference.PreferenceDataStore getHighSpeedVideoSizesFor;
    private androidx.preference.PreferenceScreen getInputFormats;
    private androidx.preference.PreferenceManager.PreferenceComparisonCallback getInputSizeshNQ4ISI;
    private androidx.preference.PreferenceManager.OnNavigateToScreenListener getOutputFormats;
    private androidx.preference.PreferenceManager.OnPreferenceTreeClickListener getOutputMinFrameDuration;
    private java.lang.String getOutputMinFrameDurationlomOqCM;
    private int getOutputStallDuration;
    private android.content.SharedPreferences getOutputStallDurationlomOqCM;
    private long getHighSpeedVideoFpsRangesFor = 0;
    private int getOutputSizes = 0;

    public interface OnDisplayPreferenceDialogListener {
        void onDisplayPreferenceDialog(androidx.preference.Preference preference);
    }

    public interface OnNavigateToScreenListener {
        void onNavigateToScreen(androidx.preference.PreferenceScreen preferenceScreen);
    }

    public interface OnPreferenceTreeClickListener {
        boolean onPreferenceTreeClick(androidx.preference.Preference preference);
    }

    public static abstract class PreferenceComparisonCallback {
        public abstract boolean arePreferenceContentsTheSame(androidx.preference.Preference preference, androidx.preference.Preference preference2);

        public abstract boolean arePreferenceItemsTheSame(androidx.preference.Preference preference, androidx.preference.Preference preference2);
    }

    public PreferenceManager(android.content.Context context) {
        this.getHighSpeedVideoSizes = context;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(context.getPackageName());
        sb.append("_preferences");
        setSharedPreferencesName(sb.toString());
    }

    public static void setDefaultValues(android.content.Context context, java.lang.String str, int i, int i2, boolean z) {
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(KEY_HAS_SET_DEFAULT_VALUES, 0);
        if (z || !sharedPreferences.getBoolean(KEY_HAS_SET_DEFAULT_VALUES, false)) {
            androidx.preference.PreferenceManager preferenceManager = new androidx.preference.PreferenceManager(context);
            preferenceManager.setSharedPreferencesName(str);
            preferenceManager.setSharedPreferencesMode(i);
            preferenceManager.inflateFromResource(context, i2, null);
            sharedPreferences.edit().putBoolean(KEY_HAS_SET_DEFAULT_VALUES, true).apply();
        }
    }

    public androidx.preference.PreferenceScreen createPreferenceScreen(android.content.Context context) {
        androidx.preference.PreferenceScreen preferenceScreen = new androidx.preference.PreferenceScreen(context, null);
        preferenceScreen.onAttachedToHierarchy(this);
        return preferenceScreen;
    }

    final long Camera2StreamConfigurationMap() {
        long j;
        synchronized (this) {
            j = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = 1 + j;
        }
        return j;
    }

    public java.lang.String getSharedPreferencesName() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public void setSharedPreferencesName(java.lang.String str) {
        this.getOutputMinFrameDurationlomOqCM = str;
        this.getOutputStallDurationlomOqCM = null;
    }

    public int getSharedPreferencesMode() {
        return this.getOutputStallDuration;
    }

    public void setSharedPreferencesMode(int i) {
        this.getOutputStallDuration = i;
        this.getOutputStallDurationlomOqCM = null;
    }

    public void setStorageDefault() {
        this.getOutputSizes = 0;
        this.getOutputStallDurationlomOqCM = null;
    }

    public void setStorageDeviceProtected() {
        this.getOutputSizes = 1;
        this.getOutputStallDurationlomOqCM = null;
    }

    public boolean isStorageDefault() {
        return this.getOutputSizes == 0;
    }

    public boolean isStorageDeviceProtected() {
        return this.getOutputSizes == 1;
    }

    public void setPreferenceDataStore(androidx.preference.PreferenceDataStore preferenceDataStore) {
        this.getHighSpeedVideoSizesFor = preferenceDataStore;
    }

    public androidx.preference.PreferenceDataStore getPreferenceDataStore() {
        return this.getHighSpeedVideoSizesFor;
    }

    public android.content.SharedPreferences getSharedPreferences() {
        android.content.Context createDeviceProtectedStorageContext;
        if (getPreferenceDataStore() != null) {
            return null;
        }
        if (this.getOutputStallDurationlomOqCM == null) {
            if (this.getOutputSizes == 1) {
                createDeviceProtectedStorageContext = androidx.core.content.ContextCompat.createDeviceProtectedStorageContext(this.getHighSpeedVideoSizes);
            } else {
                createDeviceProtectedStorageContext = this.getHighSpeedVideoSizes;
            }
            this.getOutputStallDurationlomOqCM = createDeviceProtectedStorageContext.getSharedPreferences(this.getOutputMinFrameDurationlomOqCM, this.getOutputStallDuration);
        }
        return this.getOutputStallDurationlomOqCM;
    }

    public androidx.preference.PreferenceScreen getPreferenceScreen() {
        return this.getInputFormats;
    }

    public boolean setPreferences(androidx.preference.PreferenceScreen preferenceScreen) {
        androidx.preference.PreferenceScreen preferenceScreen2 = this.getInputFormats;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.onDetached();
        }
        this.getInputFormats = preferenceScreen;
        return true;
    }

    public <T extends androidx.preference.Preference> T findPreference(java.lang.CharSequence charSequence) {
        androidx.preference.PreferenceScreen preferenceScreen = this.getInputFormats;
        if (preferenceScreen == null) {
            return null;
        }
        return (T) preferenceScreen.findPreference(charSequence);
    }

    final android.content.SharedPreferences.Editor getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getHighSpeedVideoSizesFor != null) {
            return null;
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            if (this.getHighSpeedVideoFpsRanges == null) {
                this.getHighSpeedVideoFpsRanges = getSharedPreferences().edit();
            }
            return this.getHighSpeedVideoFpsRanges;
        }
        return getSharedPreferences().edit();
    }

    public android.content.Context getContext() {
        return this.getHighSpeedVideoSizes;
    }

    public androidx.preference.PreferenceManager.PreferenceComparisonCallback getPreferenceComparisonCallback() {
        return this.getInputSizeshNQ4ISI;
    }

    public void setPreferenceComparisonCallback(androidx.preference.PreferenceManager.PreferenceComparisonCallback preferenceComparisonCallback) {
        this.getInputSizeshNQ4ISI = preferenceComparisonCallback;
    }

    public androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener getOnDisplayPreferenceDialogListener() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setOnDisplayPreferenceDialogListener(androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener onDisplayPreferenceDialogListener) {
        this.Camera2StreamConfigurationMap = onDisplayPreferenceDialogListener;
    }

    public void showDialog(androidx.preference.Preference preference) {
        androidx.preference.PreferenceManager.OnDisplayPreferenceDialogListener onDisplayPreferenceDialogListener = this.Camera2StreamConfigurationMap;
        if (onDisplayPreferenceDialogListener != null) {
            onDisplayPreferenceDialogListener.onDisplayPreferenceDialog(preference);
        }
    }

    public void setOnPreferenceTreeClickListener(androidx.preference.PreferenceManager.OnPreferenceTreeClickListener onPreferenceTreeClickListener) {
        this.getOutputMinFrameDuration = onPreferenceTreeClickListener;
    }

    public androidx.preference.PreferenceManager.OnPreferenceTreeClickListener getOnPreferenceTreeClickListener() {
        return this.getOutputMinFrameDuration;
    }

    public void setOnNavigateToScreenListener(androidx.preference.PreferenceManager.OnNavigateToScreenListener onNavigateToScreenListener) {
        this.getOutputFormats = onNavigateToScreenListener;
    }

    public androidx.preference.PreferenceManager.OnNavigateToScreenListener getOnNavigateToScreenListener() {
        return this.getOutputFormats;
    }

    public static class SimplePreferenceComparisonCallback extends androidx.preference.PreferenceManager.PreferenceComparisonCallback {
        @Override // androidx.preference.PreferenceManager.PreferenceComparisonCallback
        public boolean arePreferenceItemsTheSame(androidx.preference.Preference preference, androidx.preference.Preference preference2) {
            return preference.getHighSpeedVideoFpsRanges() == preference2.getHighSpeedVideoFpsRanges();
        }

        @Override // androidx.preference.PreferenceManager.PreferenceComparisonCallback
        public boolean arePreferenceContentsTheSame(androidx.preference.Preference preference, androidx.preference.Preference preference2) {
            if (preference.getClass() != preference2.getClass()) {
                return false;
            }
            if ((preference == preference2 && preference.Camera2StreamConfigurationMap()) || !android.text.TextUtils.equals(preference.getTitle(), preference2.getTitle()) || !android.text.TextUtils.equals(preference.getSummary(), preference2.getSummary())) {
                return false;
            }
            android.graphics.drawable.Drawable icon = preference.getIcon();
            android.graphics.drawable.Drawable icon2 = preference2.getIcon();
            if ((icon != icon2 && (icon == null || !icon.equals(icon2))) || preference.isEnabled() != preference2.isEnabled() || preference.isSelectable() != preference2.isSelectable()) {
                return false;
            }
            if (!(preference instanceof androidx.preference.TwoStatePreference) || ((androidx.preference.TwoStatePreference) preference).isChecked() == ((androidx.preference.TwoStatePreference) preference2).isChecked()) {
                return !(preference instanceof androidx.preference.DropDownPreference) || preference == preference2;
            }
            return false;
        }
    }

    public static android.content.SharedPreferences getDefaultSharedPreferences(android.content.Context context) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(context.getPackageName());
        sb.append("_preferences");
        return context.getSharedPreferences(sb.toString(), 0);
    }

    public static void setDefaultValues(android.content.Context context, int i, boolean z) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(context.getPackageName());
        sb.append("_preferences");
        setDefaultValues(context, sb.toString(), 0, i, z);
    }

    public androidx.preference.PreferenceScreen inflateFromResource(android.content.Context context, int i, androidx.preference.PreferenceScreen preferenceScreen) {
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        androidx.preference.PreferenceScreen preferenceScreen2 = (androidx.preference.PreferenceScreen) new androidx.preference.PreferenceInflater(context, this).getHighResolutionOutputSizeshNQ4ISI(i, preferenceScreen);
        preferenceScreen2.onAttachedToHierarchy(this);
        android.content.SharedPreferences.Editor editor = this.getHighSpeedVideoFpsRanges;
        if (editor != null) {
            editor.apply();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = false;
        return preferenceScreen2;
    }
}
