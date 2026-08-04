package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzcmv implements zzheg {
    private final zzhep zza;

    public zzcmv(zzhep zzhepVar) {
        this.zza = zzhepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzcqn) this.zza).zza().zzz);
        } catch (JSONException unused) {
            return null;
        }
    }
}
