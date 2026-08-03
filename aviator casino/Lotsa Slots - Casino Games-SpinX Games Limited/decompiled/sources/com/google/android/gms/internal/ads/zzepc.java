package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzepc {
    final java.lang.String zza;
    final java.lang.String zzb;
    int zzc;
    long zzd;
    final java.lang.Integer zze;

    zzepc(java.lang.String str, java.lang.String str2, int i, long j, java.lang.Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = j;
        this.zze = num;
    }

    public final java.lang.String toString() {
        java.lang.Integer num;
        java.lang.String str = this.zza;
        int i = this.zzc;
        long j = this.zzd;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 1 + java.lang.String.valueOf(i).length() + 1 + java.lang.String.valueOf(j).length());
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".");
        sb.append(j);
        java.lang.String sb2 = sb.toString();
        java.lang.String str2 = this.zzb;
        if (!android.text.TextUtils.isEmpty(str2)) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(sb2.length() + 1 + java.lang.String.valueOf(str2).length());
            sb3.append(sb2);
            sb3.append(".");
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcn)).booleanValue() || (num = this.zze) == null || android.text.TextUtils.isEmpty(str2)) {
            return sb2;
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder(sb2.length() + 1 + num.toString().length());
        sb4.append(sb2);
        sb4.append(".");
        sb4.append(num);
        return sb4.toString();
    }
}
