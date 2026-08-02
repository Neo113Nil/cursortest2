package com.google.android.gms.internal.ads;

import E2.o;
import I2.J;
import I2.M;
import J2.j;
import java.util.ArrayList;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzaym {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzazb zze;
    private final zzazj zzf;
    private int zzn;
    private final Object zzg = new Object();
    private final ArrayList zzh = new ArrayList();
    private final ArrayList zzi = new ArrayList();
    private final ArrayList zzj = new ArrayList();
    private int zzk = 0;
    private int zzl = 0;
    private int zzm = 0;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    public zzaym(int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z4) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = z4;
        this.zze = new zzazb(i10);
        this.zzf = new zzazj(i11, i12, i13);
    }

    private final void zzm(String str, boolean z4, float f7, float f8, float f9, float f10) {
        if (str != null) {
            if (str.length() < this.zzc) {
                return;
            }
            synchronized (this.zzg) {
                try {
                    this.zzh.add(str);
                    this.zzk += str.length();
                    if (z4) {
                        this.zzi.add(str);
                        this.zzj.add(new zzayx(f7, f8, f9, f10, this.zzi.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final String zzn(ArrayList arrayList, int i7) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            sb.append((String) arrayList.get(i8));
            sb.append(' ');
            i8++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaym)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzaym) obj).zzo;
        return str != null && str.equals(this.zzo);
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.zzh;
        int i7 = this.zzl;
        int i8 = this.zzn;
        int i9 = this.zzk;
        String zzn = zzn(arrayList, 100);
        String zzn2 = zzn(this.zzi, 100);
        String str = this.zzo;
        String str2 = this.zzp;
        String str3 = this.zzq;
        StringBuilder g3 = AbstractC1663a.g("ActivityContent fetchId: ", i7, " score:", i8, " total_length:");
        g3.append(i9);
        g3.append("\n text: ");
        g3.append(zzn);
        g3.append("\n viewableText");
        g3.append(zzn2);
        g3.append("\n signture: ");
        g3.append(str);
        g3.append("\n viewableSignture: ");
        g3.append(str2);
        g3.append("\n viewableSignatureForVertical: ");
        g3.append(str3);
        return g3.toString();
    }

    public final int zza(int i7, int i8) {
        if (this.zzd) {
            return this.zzb;
        }
        return (i8 * this.zzb) + (i7 * this.zza);
    }

    public final int zzb() {
        return this.zzk;
    }

    public final String zzc() {
        return this.zzo;
    }

    public final String zzd() {
        return this.zzq;
    }

    public final void zze() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zzf() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzg(int i7) {
        this.zzl = i7;
    }

    public final void zzh(String str, boolean z4, float f7, float f8, float f9, float f10) {
        zzm(str, z4, f7, f8, f9, f10);
    }

    public final void zzi(String str, boolean z4, float f7, float f8, float f9, float f10) {
        zzm(str, z4, f7, f8, f9, f10);
        synchronized (this.zzg) {
            try {
                if (this.zzm < 0) {
                    int i7 = J.f3546b;
                    j.b("ActivityContent: negative number of WebViews.");
                }
                zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj() {
        synchronized (this.zzg) {
            try {
                int zza = zza(this.zzk, this.zzl);
                if (zza > this.zzn) {
                    this.zzn = zza;
                    o oVar = o.f1952C;
                    if (!((M) oVar.f1961g.zzi()).i()) {
                        this.zzo = this.zze.zza(this.zzh);
                        this.zzp = this.zze.zza(this.zzi);
                    }
                    if (!((M) oVar.f1961g.zzi()).j()) {
                        this.zzq = this.zzf.zza(this.zzi, this.zzj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzk() {
        synchronized (this.zzg) {
            try {
                int zza = zza(this.zzk, this.zzl);
                if (zza > this.zzn) {
                    this.zzn = zza;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzl() {
        boolean z4;
        synchronized (this.zzg) {
            z4 = this.zzm == 0;
        }
        return z4;
    }
}
