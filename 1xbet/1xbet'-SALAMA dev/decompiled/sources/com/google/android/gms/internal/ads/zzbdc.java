package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
final class zzbdc extends R2.b {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbdd zzb;

    public zzbdc(zzbdd zzbddVar, String str) {
        this.zza = str;
        this.zzb = zzbddVar;
    }

    @Override // R2.b
    public final void onFailure(String str) {
        int i7 = J.f3546b;
        j.g("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbdd zzbddVar = this.zzb;
            zzbddVar.zzg.c(zzbddVar.zzc(this.zza, str).toString(), null);
        } catch (JSONException e7) {
            j.e("Error creating PACT Error Response JSON: ", e7);
        }
    }

    @Override // R2.b
    public final void onSuccess(R2.a aVar) {
        String str = aVar.f6014a.f2645b;
        try {
            zzbdd zzbddVar = this.zzb;
            zzbddVar.zzg.c(zzbddVar.zzd(this.zza, str).toString(), null);
        } catch (JSONException e7) {
            int i7 = J.f3546b;
            j.e("Error creating PACT Signal Response JSON: ", e7);
        }
    }
}
