package com.helpshift.storage;

/* loaded from: classes5.dex */
public interface ISharedPreferencesStore {
    void clear();

    boolean getBoolean(java.lang.String str);

    int getInt(java.lang.String str);

    int getInt(java.lang.String str, int i);

    long getLong(java.lang.String str);

    java.lang.String getString(java.lang.String str);

    void putBoolean(java.lang.String str, boolean z);

    void putInt(java.lang.String str, int i);

    void putLong(java.lang.String str, long j);

    void putString(java.lang.String str, java.lang.String str2);

    void remove(java.lang.String str);
}
