package com.google.firebase.crashlytics.internal.settings;

/* loaded from: classes3.dex */
public interface SettingsProvider {
    com.google.android.gms.tasks.Task<com.google.firebase.crashlytics.internal.settings.Settings> getSettingsAsync();

    com.google.firebase.crashlytics.internal.settings.Settings getSettingsSync();
}
