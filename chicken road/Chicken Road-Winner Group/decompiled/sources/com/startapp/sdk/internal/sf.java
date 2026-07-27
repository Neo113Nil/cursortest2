package com.startapp.sdk.internal;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class sf implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4338a;

    /* renamed from: b, reason: collision with root package name */
    public final b5 f4339b;

    public sf(SharedPreferences sharedPreferences) {
        this.f4338a = sharedPreferences;
        this.f4339b = null;
    }

    @Override // android.content.SharedPreferences
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rf edit() {
        return new rf(this.f4338a.edit(), this.f4338a.getAll(), this.f4339b);
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        try {
            return this.f4338a.contains(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        try {
            return this.f4338a.getAll();
        } catch (Throwable unused) {
            return Collections.EMPTY_MAP;
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z3) {
        try {
            return this.f4338a.getBoolean(str, z3);
        } catch (Throwable unused) {
            return z3;
        }
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        try {
            return this.f4338a.getFloat(str, f);
        } catch (Throwable unused) {
            return f;
        }
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i3) {
        try {
            return this.f4338a.getInt(str, i3);
        } catch (Throwable unused) {
            return i3;
        }
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j3) {
        try {
            return this.f4338a.getLong(str, j3);
        } catch (Throwable unused) {
            return j3;
        }
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        try {
            return this.f4338a.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        try {
            return this.f4338a.getStringSet(str, set);
        } catch (Throwable unused) {
            return set;
        }
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f4338a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f4338a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public sf(SharedPreferences sharedPreferences, b5 b5Var) {
        this.f4338a = sharedPreferences;
        this.f4339b = b5Var;
    }
}
