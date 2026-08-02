package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import q3.C2308a;

/* renamed from: com.google.android.gms.internal.ads.md, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC1294md implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14500a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14501b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14502c;

    public /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC1294md(int i, Object obj, String str) {
        this.f14500a = i;
        this.f14502c = obj;
        this.f14501b = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        switch (this.f14500a) {
            case 0:
                synchronized (((C1339nd) this.f14502c)) {
                    try {
                        ArrayList arrayList = ((C1339nd) this.f14502c).f14658b;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            C1249ld c1249ld = (C1249ld) obj;
                            String str2 = (String) this.f14501b;
                            C1339nd c1339nd = c1249ld.f14387a;
                            HashMap hashMap = c1249ld.f14388b;
                            c1339nd.getClass();
                            if (hashMap.containsKey(str2) && ((Set) hashMap.get(str2)).contains(str)) {
                                C0709Wb c0709Wb = c1339nd.f14660d;
                                ((C2308a) c0709Wb.f12040l).getClass();
                                ((C0892dd) c0709Wb.f12041m).a(-1, System.currentTimeMillis());
                            }
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                C1616tl c1616tl = (C1616tl) this.f14502c;
                c1616tl.f15721j.set(G4.l.Q(c1616tl.f15715b, (String) this.f14501b));
                return;
            default:
                if (str != null && ((List) this.f14502c).contains(str)) {
                    try {
                        Object obj2 = sharedPreferences.getAll().get(str);
                        JSONObject jSONObject = (JSONObject) this.f14501b;
                        if (obj2 == null) {
                            jSONObject.remove(str);
                        } else {
                            jSONObject.put(str, obj2);
                        }
                        return;
                    } catch (JSONException e3) {
                        P2.o.f4767B.f4774g.h("InspectorSharedPreferenceCollector.onSharedPreferenceChanged", e3);
                        return;
                    }
                }
                return;
        }
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC1294md() {
        this.f14500a = 2;
        this.f14501b = new JSONObject();
    }
}
