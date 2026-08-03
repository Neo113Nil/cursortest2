package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzbfg {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final com.google.android.gms.internal.ads.zzbfv zze;
    private final com.google.android.gms.internal.ads.zzbgc zzf;
    private int zzn;
    private final java.lang.Object zzg = new java.lang.Object();
    private final java.util.ArrayList zzh = new java.util.ArrayList();
    private final java.util.ArrayList zzi = new java.util.ArrayList();
    private final java.util.ArrayList zzj = new java.util.ArrayList();
    private int zzk = 0;
    private int zzl = 0;
    private int zzm = 0;
    private java.lang.String zzo = "";
    private java.lang.String zzp = "";
    private java.lang.String zzq = "";

    public zzbfg(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = z;
        this.zze = new com.google.android.gms.internal.ads.zzbfv(i4);
        this.zzf = new com.google.android.gms.internal.ads.zzbgc(i5, i6, i7);
    }

    private final void zzm(java.lang.String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null) {
            if (str.length() < this.zzc) {
                return;
            }
            synchronized (this.zzg) {
                this.zzh.add(str);
                this.zzk += str.length();
                if (z) {
                    this.zzi.add(str);
                    this.zzj.add(new com.google.android.gms.internal.ads.zzbfr(f, f2, f3, f4, r10.size() - 1));
                }
            }
        }
    }

    private static final java.lang.String zzn(java.util.ArrayList arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            sb.append((java.lang.String) arrayList.get(i2));
            sb.append(' ');
            i2++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        java.lang.String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.ads.zzbfg)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        java.lang.String str = ((com.google.android.gms.internal.ads.zzbfg) obj).zzo;
        return str != null && str.equals(this.zzo);
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final java.lang.String toString() {
        java.util.ArrayList arrayList = this.zzh;
        int i = this.zzl;
        int i2 = this.zzn;
        int i3 = this.zzk;
        java.lang.String zzn = zzn(arrayList, 100);
        java.lang.String zzn2 = zzn(this.zzi, 100);
        java.lang.String str = this.zzo;
        java.lang.String str2 = this.zzp;
        java.lang.String str3 = this.zzq;
        int length = java.lang.String.valueOf(i).length();
        int length2 = java.lang.String.valueOf(i2).length();
        int length3 = java.lang.String.valueOf(i3).length();
        int length4 = java.lang.String.valueOf(zzn).length();
        int length5 = java.lang.String.valueOf(zzn2).length();
        int length6 = java.lang.String.valueOf(str).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 32 + length2 + 14 + length3 + 8 + length4 + 14 + length5 + 12 + length6 + 20 + java.lang.String.valueOf(str2).length() + 32 + java.lang.String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i);
        sb.append(" score:");
        sb.append(i2);
        sb.append(" total_length:");
        sb.append(i3);
        sb.append("\n text: ");
        sb.append(zzn);
        sb.append("\n viewableText");
        sb.append(zzn2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }

    public final boolean zza() {
        boolean z;
        synchronized (this.zzg) {
            z = this.zzm == 0;
        }
        return z;
    }

    public final java.lang.String zzb() {
        return this.zzo;
    }

    public final java.lang.String zzc() {
        return this.zzq;
    }

    public final void zzd() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zze() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzf(java.lang.String str, boolean z, float f, float f2, float f3, float f4) {
        zzm(str, z, f, f2, f3, f4);
        synchronized (this.zzg) {
            if (this.zzm < 0) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("ActivityContent: negative number of WebViews.");
            }
            zzi();
        }
    }

    public final void zzg(java.lang.String str, boolean z, float f, float f2, float f3, float f4) {
        zzm(str, z, f, f2, f3, f4);
    }

    public final void zzh() {
        synchronized (this.zzg) {
            int zzj = zzj(this.zzk, this.zzl);
            if (zzj > this.zzn) {
                this.zzn = zzj;
            }
        }
    }

    public final void zzi() {
        synchronized (this.zzg) {
            int zzj = zzj(this.zzk, this.zzl);
            if (zzj > this.zzn) {
                this.zzn = zzj;
                if (!com.google.android.gms.ads.internal.zzt.zzh().zzo().zzc()) {
                    com.google.android.gms.internal.ads.zzbfv zzbfvVar = this.zze;
                    this.zzo = zzbfvVar.zza(this.zzh);
                    this.zzp = zzbfvVar.zza(this.zzi);
                }
                if (!com.google.android.gms.ads.internal.zzt.zzh().zzo().zze()) {
                    this.zzq = this.zzf.zza(this.zzi, this.zzj);
                }
            }
        }
    }

    final int zzj(int i, int i2) {
        return this.zzd ? this.zzb : (i * this.zza) + (i2 * this.zzb);
    }

    public final void zzk(int i) {
        this.zzl = i;
    }

    final int zzl() {
        return this.zzk;
    }
}
