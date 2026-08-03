package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaov {
    private int zzf;
    private int zzh;
    private float zzn;
    private java.lang.String zza = "";
    private java.lang.String zzb = "";
    private java.util.Set zzc = java.util.Collections.emptySet();
    private java.lang.String zzd = "";
    private java.lang.String zze = null;
    private boolean zzg = false;
    private boolean zzi = false;
    private int zzj = -1;
    private int zzk = -1;
    private int zzl = -1;
    private int zzm = -1;
    private int zzo = -1;
    private boolean zzp = false;

    private static int zzA(int i, java.lang.String str, java.lang.String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    public final void zza(java.lang.String str) {
        this.zza = str;
    }

    public final void zzb(java.lang.String str) {
        this.zzb = str;
    }

    public final void zzc(java.lang.String[] strArr) {
        this.zzc = new java.util.HashSet(java.util.Arrays.asList(strArr));
    }

    public final void zzd(java.lang.String str) {
        this.zzd = str;
    }

    public final int zze(java.lang.String str, java.lang.String str2, java.util.Set set, java.lang.String str3) {
        if (this.zza.isEmpty() && this.zzb.isEmpty() && this.zzc.isEmpty() && this.zzd.isEmpty()) {
            return android.text.TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int zzA = zzA(zzA(zzA(0, this.zza, str, 1073741824), this.zzb, str2, 2), this.zzd, str3, 4);
        if (zzA == -1 || !set.containsAll(this.zzc)) {
            return 0;
        }
        return zzA + (this.zzc.size() * 4);
    }

    public final int zzf() {
        int i = this.zzk;
        if (i == -1 && this.zzl == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.zzl == 1 ? 2 : 0);
    }

    public final boolean zzg() {
        return this.zzj == 1;
    }

    public final com.google.android.gms.internal.ads.zzaov zzh(boolean z) {
        this.zzj = 1;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaov zzi(boolean z) {
        this.zzk = 1;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaov zzj(boolean z) {
        this.zzl = 1;
        return this;
    }

    public final java.lang.String zzk() {
        return this.zze;
    }

    public final com.google.android.gms.internal.ads.zzaov zzl(java.lang.String str) {
        this.zze = com.google.android.gms.internal.ads.zzgss.zza(str);
        return this;
    }

    public final int zzm() {
        if (this.zzg) {
            return this.zzf;
        }
        throw new java.lang.IllegalStateException("Font color not defined");
    }

    public final com.google.android.gms.internal.ads.zzaov zzn(int i) {
        this.zzf = i;
        this.zzg = true;
        return this;
    }

    public final boolean zzo() {
        return this.zzg;
    }

    public final int zzp() {
        if (this.zzi) {
            return this.zzh;
        }
        throw new java.lang.IllegalStateException("Background color not defined.");
    }

    public final com.google.android.gms.internal.ads.zzaov zzq(int i) {
        this.zzh = i;
        this.zzi = true;
        return this;
    }

    public final boolean zzr() {
        return this.zzi;
    }

    public final com.google.android.gms.internal.ads.zzaov zzs(float f) {
        this.zzn = f;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzaov zzt(int i) {
        this.zzm = i;
        return this;
    }

    public final int zzu() {
        return this.zzm;
    }

    public final float zzv() {
        return this.zzn;
    }

    public final com.google.android.gms.internal.ads.zzaov zzw(int i) {
        this.zzo = i;
        return this;
    }

    public final int zzx() {
        return this.zzo;
    }

    public final com.google.android.gms.internal.ads.zzaov zzy(boolean z) {
        this.zzp = z;
        return this;
    }

    public final boolean zzz() {
        return this.zzp;
    }
}
