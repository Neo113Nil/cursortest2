package com.onesignal.inAppMessages.internal.preferences.impl;

import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController;
import g4.AbstractC0465j;
import java.util.Set;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class InAppPreferencesController implements IInAppPreferencesController {
    private final IPreferencesService _prefs;

    public InAppPreferencesController(IPreferencesService _prefs) {
        i.e(_prefs, "_prefs");
        this._prefs = _prefs;
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public void cleanInAppMessageClickedClickIds(Set<String> set) {
        Set<String> stringSet;
        if (set == null || set.isEmpty() || (stringSet = this._prefs.getStringSet("OneSignal", PreferenceOneSignalKeys.PREFS_OS_CLICKED_CLICK_IDS_IAMS, null)) == null || stringSet.isEmpty()) {
            return;
        }
        Set<String> W02 = AbstractC0465j.W0(stringSet);
        W02.removeAll(set);
        this._prefs.saveStringSet("OneSignal", PreferenceOneSignalKeys.PREFS_OS_CLICKED_CLICK_IDS_IAMS, W02);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public void cleanInAppMessageIds(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        Set<String> stringSet = this._prefs.getStringSet("OneSignal", PreferenceOneSignalKeys.PREFS_OS_DISMISSED_IAMS, null);
        Set<String> stringSet2 = this._prefs.getStringSet("OneSignal", PreferenceOneSignalKeys.PREFS_OS_IMPRESSIONED_IAMS, null);
        if (stringSet != null && !stringSet.isEmpty()) {
            Set<String> W02 = AbstractC0465j.W0(stringSet);
            W02.removeAll(set);
            this._prefs.saveStringSet("OneSignal", PreferenceOneSignalKeys.PREFS_OS_DISMISSED_IAMS, W02);
        }
        if (stringSet2 == null || stringSet2.isEmpty()) {
            return;
        }
        Set<String> W03 = AbstractC0465j.W0(stringSet2);
        W03.removeAll(set);
        this._prefs.saveStringSet("OneSignal", PreferenceOneSignalKeys.PREFS_OS_IMPRESSIONED_IAMS, W03);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public Set<String> getClickedMessagesId() {
        return this._prefs.getStringSet("OneSignal", PreferenceOneSignalKeys.PREFS_OS_CLICKED_CLICK_IDS_IAMS, null);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public Set<String> getDismissedMessagesId() {
        return this._prefs.getStringSet("OneSignal", PreferenceOneSignalKeys.PREFS_OS_DISMISSED_IAMS, null);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public Set<String> getImpressionesMessagesId() {
        return this._prefs.getStringSet("OneSignal", PreferenceOneSignalKeys.PREFS_OS_IMPRESSIONED_IAMS, null);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public Long getLastTimeInAppDismissed() {
        return this._prefs.getLong("OneSignal", PreferenceOneSignalKeys.PREFS_OS_IAM_LAST_DISMISSED_TIME, null);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public String getSavedIAMs() {
        return this._prefs.getString("OneSignal", PreferenceOneSignalKeys.PREFS_OS_CACHED_IAMS, null);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public Set<String> getViewPageImpressionedIds() {
        return this._prefs.getStringSet("OneSignal", PreferenceOneSignalKeys.PREFS_OS_PAGE_IMPRESSIONED_IAMS, null);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public void setClickedMessagesId(Set<String> set) {
        this._prefs.saveStringSet("OneSignal", PreferenceOneSignalKeys.PREFS_OS_CLICKED_CLICK_IDS_IAMS, set);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public void setDismissedMessagesId(Set<String> set) {
        this._prefs.saveStringSet("OneSignal", PreferenceOneSignalKeys.PREFS_OS_DISMISSED_IAMS, set);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public void setImpressionesMessagesId(Set<String> set) {
        this._prefs.saveStringSet("OneSignal", PreferenceOneSignalKeys.PREFS_OS_IMPRESSIONED_IAMS, set);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public void setLastTimeInAppDismissed(Long l2) {
        this._prefs.saveLong("OneSignal", PreferenceOneSignalKeys.PREFS_OS_IAM_LAST_DISMISSED_TIME, l2);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public void setSavedIAMs(String str) {
        this._prefs.saveString("OneSignal", PreferenceOneSignalKeys.PREFS_OS_CACHED_IAMS, str);
    }

    @Override // com.onesignal.inAppMessages.internal.preferences.IInAppPreferencesController
    public void setViewPageImpressionedIds(Set<String> set) {
        this._prefs.saveStringSet("OneSignal", PreferenceOneSignalKeys.PREFS_OS_PAGE_IMPRESSIONED_IAMS, set);
    }
}
