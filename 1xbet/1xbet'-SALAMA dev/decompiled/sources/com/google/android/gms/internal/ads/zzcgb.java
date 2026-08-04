package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.F;
import I2.M;
import P2.BinderC0386l;
import P2.InterfaceC0376b;
import P2.L;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p113p3.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcgb implements zzcka {
    private static zzcgb zza;

    private static synchronized zzcgb zzE(Context context, zzboo zzbooVar, int i7, boolean z4, int i8, zzchh zzchhVar) {
        try {
            zzcgb zzcgbVar = zza;
            if (zzcgbVar != null) {
                return zzcgbVar;
            }
            o oVar = o.f1952C;
            oVar.j.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzbby.zza(context);
            if (((Boolean) zzbdq.zze.zze()).booleanValue()) {
                zzbbi.zzd(context);
            }
            zzfbw zzfbwVarZzd = zzfbw.zzd(context);
            VersionInfoParcel versionInfoParcelZzc = zzfbwVarZzd.zzc(250930000, false, i8);
            zzfbwVarZzd.zzf(zzbooVar);
            zzchw zzchwVar = new zzchw(null);
            zzcgc zzcgcVar = new zzcgc();
            zzcgcVar.zzf(versionInfoParcelZzc);
            zzcgcVar.zze(context);
            zzcgcVar.zzd(jCurrentTimeMillis);
            zzchwVar.zzb(new zzcge(zzcgcVar, null));
            zzchwVar.zzc(new zzciq(zzchhVar));
            zzcgb zzcgbVarZza = zzchwVar.zza();
            oVar.f1961g.zzu(context, versionInfoParcelZzc);
            oVar.f1963i.zzi(context);
            oVar.f1957c.B(context);
            oVar.f1957c.A(context);
            f.l0(context);
            oVar.f1960f.zzd(context);
            oVar.f1979z.b(context);
            ((F) ((zzchl) zzcgbVarZza).zzai.zzb()).a();
            zzbxn.zzb(context);
            zzbbp zzbbpVar = zzbby.zzgg;
            C0254t c0254t = C0254t.f2723d;
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                if (!((Boolean) c0254t.f2726c.zzb(zzbby.zzaL)).booleanValue()) {
                    new zzdzs(context, versionInfoParcelZzc, new zzbaw(new zzbbc(context)), new zzdyx(new zzdyt(context), (zzgbn) ((zzchl) zzcgbVarZza).zzd.zzb())).zzb(((M) oVar.f1961g.zzi()).k());
                }
            }
            zza = zzcgbVarZza;
            return zzcgbVarZza;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static zzcgb zza(Context context, zzboo zzbooVar, int i7) {
        return zzE(context, zzbooVar, 250930000, false, i7, new zzchh());
    }

    public abstract Executor zzA();

    public abstract ScheduledExecutorService zzB();

    public abstract zzbyf zzC();

    @Override // com.google.android.gms.internal.ads.zzcka
    public final zzbyf zzD() {
        return zzC();
    }

    public abstract zzcjb zzb();

    public abstract zzcnc zzc();

    public abstract zzcos zzd();

    public abstract zzcxi zze();

    public abstract zzdeq zzf();

    public abstract zzdfm zzg();

    public abstract zzdmy zzh();

    public abstract zzdqq zzi();

    public abstract zzdsa zzj();

    public abstract zzdtp zzk();

    public abstract zzdum zzl();

    public abstract zzeaq zzm();

    public abstract L zzn();

    public abstract InterfaceC0376b zzo();

    public abstract BinderC0386l zzp();

    @Override // com.google.android.gms.internal.ads.zzcka
    public final zzetk zzq(zzbuo zzbuoVar, int i7) {
        return zzr(new zzeun(zzbuoVar, i7));
    }

    public abstract zzetk zzr(zzeun zzeunVar);

    public abstract zzevf zzs();

    public abstract zzewt zzt();

    public abstract zzeyk zzu();

    public abstract zzezy zzv();

    public abstract zzfbp zzw();

    public abstract zzfbz zzx();

    public abstract zzfgb zzy();

    public abstract zzfij zzz();
}
