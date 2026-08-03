package com.google.firebase.crashlytics.internal.settings;

/* loaded from: classes3.dex */
interface SettingsJsonTransform {
    com.google.firebase.crashlytics.internal.settings.Settings buildFromJson(com.google.firebase.crashlytics.internal.common.CurrentTimeProvider currentTimeProvider, org.json.JSONObject jSONObject) throws org.json.JSONException;
}
