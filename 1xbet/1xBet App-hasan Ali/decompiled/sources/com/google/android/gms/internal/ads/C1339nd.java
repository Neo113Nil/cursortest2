package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.nd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1339nd {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14657a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f14658b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Context f14659c;

    /* renamed from: d, reason: collision with root package name */
    public final C0709Wb f14660d;

    public C1339nd(Context context, C0709Wb c0709Wb) {
        this.f14659c = context;
        this.f14660d = c0709Wb;
    }

    public final synchronized void a(String str) {
        try {
            if (this.f14657a.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.f14659c) : this.f14659c.getSharedPreferences(str, 0);
            SharedPreferencesOnSharedPreferenceChangeListenerC1294md sharedPreferencesOnSharedPreferenceChangeListenerC1294md = new SharedPreferencesOnSharedPreferenceChangeListenerC1294md(0, this, str);
            this.f14657a.put(str, sharedPreferencesOnSharedPreferenceChangeListenerC1294md);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC1294md);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(C1249ld c1249ld) {
        this.f14658b.add(c1249ld);
    }
}
