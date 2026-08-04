package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.P;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzepe implements zzesh {
    private final Context zza;
    private final zzgbn zzb;

    public zzepe(Context context, zzgbn zzgbnVar) {
        this.zza = context;
        this.zzb = zzgbnVar;
    }

    public static zzepc zzc(zzepe zzepeVar) {
        Bundle bundle;
        o oVar = o.f1952C;
        P p5 = oVar.f1957c;
        zzbbp zzbbpVar = zzbby.zzfZ;
        C0254t c0254t = C0254t.f2723d;
        String string = !((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() ? "" : zzepeVar.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) c0254t.f2726c.zzb(zzbby.zzgb)).booleanValue() ? zzepeVar.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        P p7 = oVar.f1957c;
        Context context = zzepeVar.zza;
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzga)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i7 = 0; i7 < 4; i7++) {
                String str = strArr[i7];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new zzepc(string, string2, bundle, null);
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 18;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepe.zzc(this.zza);
            }
        });
    }
}
