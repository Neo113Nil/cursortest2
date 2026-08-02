package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import e1.k;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class zzapb implements Comparable {
    private final zzapm zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzapf zzf;
    private Integer zzg;
    private zzape zzh;
    private boolean zzi;
    private zzaok zzj;
    private zzapa zzk;
    private final zzaop zzl;

    public zzapb(int i7, String str, zzapf zzapfVar) {
        Uri parse;
        String host;
        this.zza = zzapm.zza ? new zzapm() : null;
        this.zze = new Object();
        int i8 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i7;
        this.zzc = str;
        this.zzf = zzapfVar;
        this.zzl = new zzaop();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i8 = host.hashCode();
        }
        this.zzd = i8;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzapb) obj).zzg.intValue();
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzw();
        return "[ ] " + this.zzc + " " + "0x".concat(valueOf) + " NORMAL " + this.zzg;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzaok zzd() {
        return this.zzj;
    }

    public final zzapb zze(zzaok zzaokVar) {
        this.zzj = zzaokVar;
        return this;
    }

    public final zzapb zzf(zzape zzapeVar) {
        this.zzh = zzapeVar;
        return this;
    }

    public final zzapb zzg(int i7) {
        this.zzg = Integer.valueOf(i7);
        return this;
    }

    public abstract zzaph zzh(zzaox zzaoxVar);

    public final String zzj() {
        int i7 = this.zzb;
        String str = this.zzc;
        return i7 != 0 ? k.f(Integer.toString(1), "-", str) : str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzapm.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzapk zzapkVar) {
        zzapf zzapfVar;
        synchronized (this.zze) {
            zzapfVar = this.zzf;
        }
        zzapfVar.zza(zzapkVar);
    }

    public abstract void zzo(Object obj);

    public final void zzp(String str) {
        zzape zzapeVar = this.zzh;
        if (zzapeVar != null) {
            zzapeVar.zzb(this);
        }
        if (zzapm.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzaoz(this, str, id));
            } else {
                this.zza.zza(str, id);
                this.zza.zzb(toString());
            }
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final void zzr() {
        zzapa zzapaVar;
        synchronized (this.zze) {
            zzapaVar = this.zzk;
        }
        if (zzapaVar != null) {
            zzapaVar.zza(this);
        }
    }

    public final void zzs(zzaph zzaphVar) {
        zzapa zzapaVar;
        synchronized (this.zze) {
            zzapaVar = this.zzk;
        }
        if (zzapaVar != null) {
            zzapaVar.zzb(this, zzaphVar);
        }
    }

    public final void zzt(int i7) {
        zzape zzapeVar = this.zzh;
        if (zzapeVar != null) {
            zzapeVar.zzc(this, i7);
        }
    }

    public final void zzu(zzapa zzapaVar) {
        synchronized (this.zze) {
            this.zzk = zzapaVar;
        }
    }

    public final boolean zzv() {
        boolean z4;
        synchronized (this.zze) {
            z4 = this.zzi;
        }
        return z4;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() {
        return null;
    }

    public final zzaop zzy() {
        return this.zzl;
    }
}
