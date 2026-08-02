package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.L;
import I2.M;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzbwz implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final L zzc;
    private String zzd = "-1";
    private int zze = -1;

    public zzbwz(Context context, L l7) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = l7;
        this.zza = context;
    }

    private final void zzb() {
        ((M) this.zzc).c(true);
        Q0.a.m0(this.zza);
    }

    private final void zzc(String str, int i7) {
        Context context;
        zzbbp zzbbpVar = zzbby.zzaM;
        C0254t c0254t = C0254t.f2723d;
        boolean z4 = true;
        if (!((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i7 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z4 = false;
        }
        ((M) this.zzc).c(z4);
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzgg)).booleanValue() && z4 && (context = this.zza) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        boolean z4;
        try {
            zzbbp zzbbpVar = zzbby.zzaO;
            C0254t c0254t = C0254t.f2723d;
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                if (Objects.equals(str, "gad_has_consent_for_cookies")) {
                    int i7 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    M m7 = (M) this.zzc;
                    m7.l();
                    if (i7 != m7.f3562m) {
                        zzb();
                    }
                    ((M) this.zzc).a(i7);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    M m8 = (M) this.zzc;
                    m8.l();
                    if (!Objects.equals(string, m8.f3561l)) {
                        zzb();
                    }
                    ((M) this.zzc).h(string);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i8 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String valueOf = String.valueOf(str);
            int hashCode = valueOf.hashCode();
            if (hashCode != -2004976699) {
                if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                    z4 = true;
                }
                z4 = -1;
            } else {
                if (valueOf.equals("IABTCF_PurposeConsents")) {
                    z4 = false;
                }
                z4 = -1;
            }
            if (!z4) {
                if (string2.equals("-1") || this.zzd.equals(string2)) {
                    return;
                }
                this.zzd = string2;
                zzc(string2, i8);
                return;
            }
            if (!z4) {
                return;
            }
            if (!((Boolean) c0254t.f2726c.zzb(zzbby.zzaM)).booleanValue() || i8 == -1 || this.zze == i8) {
                return;
            }
            this.zze = i8;
            zzc(string2, i8);
        } catch (Throwable th) {
            o.f1952C.f1961g.zzw(th, "AdMobPlusIdlessListener.onSharedPreferenceChanged");
            J.l("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }

    public final void zza() {
        this.zzb.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.zzb, "gad_has_consent_for_cookies");
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzaO)).booleanValue()) {
            onSharedPreferenceChanged(this.zzb, "IABTCF_TCString");
        } else {
            onSharedPreferenceChanged(this.zzb, "IABTCF_PurposeConsents");
        }
    }
}
