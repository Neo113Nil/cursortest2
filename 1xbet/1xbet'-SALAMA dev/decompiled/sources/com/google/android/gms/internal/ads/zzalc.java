package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzalc {
    private int zzf;
    private int zzh;
    private float zzn;
    private String zza = "";
    private String zzb = "";
    private Set zzc = Collections.emptySet();
    private String zzd = "";
    private String zze = null;
    private boolean zzg = false;
    private boolean zzi = false;
    private int zzj = -1;
    private int zzk = -1;
    private int zzl = -1;
    private int zzm = -1;
    private int zzo = -1;
    private boolean zzp = false;

    private static int zzA(int i7, String str, String str2, int i8) {
        if (str.isEmpty() || i7 == -1) {
            return i7;
        }
        if (str.equals(str2)) {
            return i7 + i8;
        }
        return -1;
    }

    public final float zza() {
        return this.zzn;
    }

    public final int zzb() {
        if (this.zzi) {
            return this.zzh;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final int zzc() {
        if (this.zzg) {
            return this.zzf;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final int zzd() {
        return this.zzm;
    }

    public final int zze() {
        return this.zzo;
    }

    public final int zzf(String str, String str2, Set set, String str3) {
        if (this.zza.isEmpty() && this.zzb.isEmpty() && this.zzc.isEmpty() && this.zzd.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iZzA = zzA(zzA(zzA(0, this.zza, str, 1073741824), this.zzb, str2, 2), this.zzd, str3, 4);
        if (iZzA == -1 || !set.containsAll(this.zzc)) {
            return 0;
        }
        return (this.zzc.size() * 4) + iZzA;
    }

    public final int zzg() {
        int i7 = this.zzk;
        if (i7 == -1 && this.zzl == -1) {
            return -1;
        }
        return (i7 == 1 ? 1 : 0) | (this.zzl == 1 ? 2 : 0);
    }

    public final zzalc zzh(int i7) {
        this.zzh = i7;
        this.zzi = true;
        return this;
    }

    public final zzalc zzi(boolean z4) {
        this.zzk = 1;
        return this;
    }

    public final zzalc zzj(boolean z4) {
        this.zzp = z4;
        return this;
    }

    public final zzalc zzk(int i7) {
        this.zzf = i7;
        this.zzg = true;
        return this;
    }

    public final zzalc zzl(String str) {
        this.zze = zzfsn.zza(str);
        return this;
    }

    public final zzalc zzm(float f7) {
        this.zzn = f7;
        return this;
    }

    public final zzalc zzn(int i7) {
        this.zzm = i7;
        return this;
    }

    public final zzalc zzo(boolean z4) {
        this.zzl = 1;
        return this;
    }

    public final zzalc zzp(int i7) {
        this.zzo = i7;
        return this;
    }

    public final zzalc zzq(boolean z4) {
        this.zzj = 1;
        return this;
    }

    public final String zzr() {
        return this.zze;
    }

    public final void zzs(String[] strArr) {
        this.zzc = new HashSet(Arrays.asList(strArr));
    }

    public final void zzt(String str) {
        this.zza = str;
    }

    public final void zzu(String str) {
        this.zzb = str;
    }

    public final void zzv(String str) {
        this.zzd = str;
    }

    public final boolean zzw() {
        return this.zzp;
    }

    public final boolean zzx() {
        return this.zzi;
    }

    public final boolean zzy() {
        return this.zzg;
    }

    public final boolean zzz() {
        return this.zzj == 1;
    }
}
