package com.startapp.sdk.internal;

import android.content.SharedPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest$RequestReason;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class rf implements SharedPreferences.Editor {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f4299a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f4300b;

    /* renamed from: c, reason: collision with root package name */
    public final b5 f4301c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4302d;

    public rf(SharedPreferences.Editor editor, Map map, b5 b5Var) {
        this.f4299a = editor;
        this.f4300b = map;
        this.f4301c = b5Var;
    }

    public final void a(String str, Object obj) {
        if (this.f4301c == null || si.a(this.f4300b.get(str), obj)) {
            return;
        }
        this.f4302d = true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        this.f4299a.apply();
        b5 b5Var = this.f4301c;
        if (b5Var == null || !this.f4302d) {
            return;
        }
        this.f4302d = false;
        mg.f4061d.a(b5Var.f3489a.f3528a, MetaDataRequest$RequestReason.EXTRAS);
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        if (!this.f4300b.isEmpty()) {
            this.f4302d = true;
        }
        this.f4299a.clear();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        return this.f4299a.commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z3) {
        a(str, Boolean.valueOf(z3));
        this.f4299a.putBoolean(str, z3);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        a(str, Float.valueOf(f));
        this.f4299a.putFloat(str, f);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i3) {
        a(str, Integer.valueOf(i3));
        this.f4299a.putInt(str, i3);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j3) {
        a(str, Long.valueOf(j3));
        this.f4299a.putLong(str, j3);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        this.f4299a.putString(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        this.f4299a.putStringSet(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        if (this.f4300b.containsKey(str)) {
            this.f4302d = true;
        }
        this.f4299a.remove(str);
        return this;
    }
}
