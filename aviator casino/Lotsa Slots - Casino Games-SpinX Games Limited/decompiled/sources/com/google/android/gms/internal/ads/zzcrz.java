package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcrz implements com.google.android.gms.internal.ads.zzcrt {
    private final com.google.android.gms.internal.ads.zzecr zza;

    zzcrz(com.google.android.gms.internal.ads.zzecr zzecrVar) {
        this.zza = zzecrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrt
    public final void zza(java.util.Map map) {
        char c;
        java.lang.String str = (java.lang.String) map.get("gesture");
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 97520651) {
            if (hashCode == 109399814 && str.equals("shake")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("flick")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            this.zza.zze(com.google.android.gms.internal.ads.zzecn.SHAKE);
        } else if (c != 1) {
            this.zza.zze(com.google.android.gms.internal.ads.zzecn.NONE);
        } else {
            this.zza.zze(com.google.android.gms.internal.ads.zzecn.FLICK);
        }
    }
}
