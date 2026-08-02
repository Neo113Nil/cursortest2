package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.text.TextUtils;
import e1.k;

/* loaded from: classes.dex */
final class zzeff {
    final String zza;
    final String zzb;
    int zzc;
    long zzd;
    final Integer zze;

    public zzeff(String str, String str2, int i7, long j, Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i7;
        this.zzd = j;
        this.zze = num;
    }

    public final String toString() {
        String str = this.zza + "." + this.zzc + "." + this.zzd;
        if (!TextUtils.isEmpty(this.zzb)) {
            str = k.f(str, ".", this.zzb);
        }
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbN)).booleanValue() || this.zze == null || TextUtils.isEmpty(this.zzb)) {
            return str;
        }
        return str + "." + this.zze;
    }
}
