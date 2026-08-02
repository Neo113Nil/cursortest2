package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.bd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC0803bd implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12831a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f12832b;

    /* renamed from: c, reason: collision with root package name */
    public final T2.I f12833c;

    /* renamed from: d, reason: collision with root package name */
    public String f12834d = "-1";

    /* renamed from: e, reason: collision with root package name */
    public int f12835e = -1;

    public SharedPreferencesOnSharedPreferenceChangeListenerC0803bd(Context context, T2.I i) {
        this.f12832b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f12833c = i;
        this.f12831a = context;
    }

    public final void a(String str, int i) {
        Context context;
        A7 a7 = F7.f8656A0;
        Q2.r rVar = Q2.r.f5053d;
        boolean z3 = true;
        if (!((Boolean) rVar.f5056c.a(a7)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z3 = false;
        }
        this.f12833c.d(z3);
        if (((Boolean) rVar.f5056c.a(F7.P5)).booleanValue() && z3 && (context = this.f12831a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        boolean z3;
        try {
            A7 a7 = F7.f8666C0;
            Q2.r rVar = Q2.r.f5053d;
            if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                boolean equals = Objects.equals(str, "gad_has_consent_for_cookies");
                Context context = this.f12831a;
                T2.I i = this.f12833c;
                if (equals) {
                    int i5 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    i.o();
                    if (i5 != i.f5654m) {
                        i.d(true);
                        G4.l.R(context);
                    }
                    i.a(i5);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    i.o();
                    if (!Objects.equals(string, i.f5653l)) {
                        i.d(true);
                        G4.l.R(context);
                    }
                    i.j(string);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i6 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String valueOf = String.valueOf(str);
            int hashCode = valueOf.hashCode();
            if (hashCode != -2004976699) {
                if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                    z3 = true;
                }
                z3 = -1;
            } else {
                if (valueOf.equals("IABTCF_PurposeConsents")) {
                    z3 = false;
                }
                z3 = -1;
            }
            if (!z3) {
                if (string2.equals("-1") || this.f12834d.equals(string2)) {
                    return;
                }
                this.f12834d = string2;
                a(string2, i6);
                return;
            }
            if (!z3) {
                return;
            }
            if (!((Boolean) rVar.f5056c.a(F7.f8656A0)).booleanValue() || i6 == -1 || this.f12835e == i6) {
                return;
            }
            this.f12835e = i6;
            a(string2, i6);
        } catch (Throwable th) {
            P2.o.f4767B.f4774g.i("AdMobPlusIdlessListener.onSharedPreferenceChanged", th);
            T2.G.n("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }
}
