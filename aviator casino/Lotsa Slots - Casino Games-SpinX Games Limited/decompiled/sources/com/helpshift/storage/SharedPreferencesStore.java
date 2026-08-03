package com.helpshift.storage;

/* loaded from: classes5.dex */
public class SharedPreferencesStore implements com.helpshift.storage.ISharedPreferencesStore {
    private final android.content.SharedPreferences preferences;

    public SharedPreferencesStore(android.content.Context context, java.lang.String str, int i) {
        this.preferences = context.getSharedPreferences(str, i);
    }

    @Override // com.helpshift.storage.ISharedPreferencesStore
    public java.lang.String getString(java.lang.String str) {
        return this.preferences.getString(str, "");
    }

    @Override // com.helpshift.storage.ISharedPreferencesStore
    public void putString(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences.Editor edit = this.preferences.edit();
        edit.putString(str, str2);
        if (edit.commit()) {
            return;
        }
        edit.commit();
    }

    @Override // com.helpshift.storage.ISharedPreferencesStore
    public void remove(java.lang.String str) {
        android.content.SharedPreferences.Editor edit = this.preferences.edit();
        edit.remove(str);
        if (edit.commit()) {
            return;
        }
        edit.commit();
    }

    @Override // com.helpshift.storage.ISharedPreferencesStore
    public void putLong(java.lang.String str, long j) {
        android.content.SharedPreferences.Editor edit = this.preferences.edit();
        edit.putLong(str, j);
        if (edit.commit()) {
            return;
        }
        edit.commit();
    }

    @Override // com.helpshift.storage.ISharedPreferencesStore
    public long getLong(java.lang.String str) {
        return this.preferences.getLong(str, 0L);
    }

    @Override // com.helpshift.storage.ISharedPreferencesStore
    public void putInt(java.lang.String str, int i) {
        android.content.SharedPreferences.Editor edit = this.preferences.edit();
        edit.putInt(str, i);
        if (edit.commit()) {
            return;
        }
        edit.commit();
    }

    @Override // com.helpshift.storage.ISharedPreferencesStore
    public int getInt(java.lang.String str) {
        return this.preferences.getInt(str, 0);
    }

    @Override // com.helpshift.storage.ISharedPreferencesStore
    public int getInt(java.lang.String str, int i) {
        return this.preferences.getInt(str, i);
    }

    @Override // com.helpshift.storage.ISharedPreferencesStore
    public void putBoolean(java.lang.String str, boolean z) {
        android.content.SharedPreferences.Editor edit = this.preferences.edit();
        edit.putBoolean(str, z);
        if (edit.commit()) {
            return;
        }
        edit.commit();
    }

    @Override // com.helpshift.storage.ISharedPreferencesStore
    public boolean getBoolean(java.lang.String str) {
        return this.preferences.getBoolean(str, false);
    }

    @Override // com.helpshift.storage.ISharedPreferencesStore
    public void clear() {
        this.preferences.edit().clear().commit();
    }
}
