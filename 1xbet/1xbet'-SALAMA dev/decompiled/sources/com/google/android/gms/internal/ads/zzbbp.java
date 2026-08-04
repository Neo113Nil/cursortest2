package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbbp {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    public zzbbp(int i7, String str, Object obj, Object obj2, zzbbo zzbboVar) {
        this.zza = i7;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        C0254t.f2723d.f2724a.zzd(this);
    }

    public static zzbbp zzf(int i7, String str, float f7, float f8) {
        return new zzbbm(1, str, Float.valueOf(f7), Float.valueOf(f8));
    }

    public static zzbbp zzg(int i7, String str, int i8, int i9) {
        return new zzbbk(1, str, Integer.valueOf(i8), Integer.valueOf(i9));
    }

    public static zzbbp zzh(int i7, String str, long j, long j3) {
        return new zzbbl(1, str, Long.valueOf(j), Long.valueOf(j3));
    }

    public static zzbbp zzi(int i7, String str) {
        zzbbn zzbbnVar = new zzbbn(1, "gads:sdk_core_constants:experiment_id", null, null);
        C0254t.f2723d.f2724a.zzc(zzbbnVar);
        return zzbbnVar;
    }

    public abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    public abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzj() {
        return C0254t.f2723d.f2726c.zzb(this);
    }

    public final Object zzk() {
        return C0254t.f2723d.f2726c.zzf() ? this.zzd : this.zzc;
    }

    public final String zzl() {
        return this.zzb;
    }
}
