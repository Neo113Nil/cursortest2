package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class zzbs {
    private int zza;
    private int zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzfwh zzi;
    private zzfwh zzj;
    private zzfwh zzk;
    private int zzl;
    private int zzm;
    private zzfwh zzn;
    private zzbr zzo;
    private zzfwh zzp;
    private boolean zzq;
    private HashMap zzr;
    private HashSet zzs;

    public zzbs() {
        this.zza = f.API_PRIORITY_OTHER;
        this.zzb = f.API_PRIORITY_OTHER;
        this.zzc = f.API_PRIORITY_OTHER;
        this.zzd = f.API_PRIORITY_OTHER;
        this.zze = f.API_PRIORITY_OTHER;
        this.zzf = f.API_PRIORITY_OTHER;
        this.zzg = true;
        this.zzh = true;
        this.zzi = zzfwh.zzn();
        this.zzj = zzfwh.zzn();
        this.zzk = zzfwh.zzn();
        this.zzl = f.API_PRIORITY_OTHER;
        this.zzm = f.API_PRIORITY_OTHER;
        this.zzn = zzfwh.zzn();
        this.zzo = zzbr.zza;
        this.zzp = zzfwh.zzn();
        this.zzq = true;
        this.zzr = new HashMap();
        this.zzs = new HashSet();
    }

    private final void zzu(zzbt zzbtVar) {
        this.zza = zzbtVar.zza;
        this.zzb = zzbtVar.zzb;
        this.zzc = zzbtVar.zzc;
        this.zzd = zzbtVar.zzd;
        this.zze = zzbtVar.zzi;
        this.zzf = zzbtVar.zzj;
        this.zzg = zzbtVar.zzk;
        this.zzh = zzbtVar.zzl;
        this.zzi = zzbtVar.zzm;
        this.zzj = zzbtVar.zzn;
        this.zzk = zzbtVar.zzp;
        this.zzl = zzbtVar.zzr;
        this.zzm = zzbtVar.zzs;
        this.zzn = zzbtVar.zzt;
        this.zzo = zzbtVar.zzu;
        this.zzp = zzbtVar.zzv;
        this.zzq = zzbtVar.zzx;
        this.zzs = new HashSet(zzbtVar.zzE);
        this.zzr = new HashMap(zzbtVar.zzD);
    }

    public final zzbs zzj(zzbt zzbtVar) {
        zzu(zzbtVar);
        return this;
    }

    public zzbs(zzbt zzbtVar) {
        zzu(zzbtVar);
    }
}
