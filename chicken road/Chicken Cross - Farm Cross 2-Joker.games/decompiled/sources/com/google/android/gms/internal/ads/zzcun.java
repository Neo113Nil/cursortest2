package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcun implements zzddp, zzdfd, zzdej, com.google.android.gms.ads.internal.client.zza, zzdef, zzdln, zzdgk {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzflo zze;
    private final zzfld zzf;
    private final zzfta zzg;
    private final zzfmj zzh;
    private final zzbbd zzi;
    private final zzbkn zzj;
    private final WeakReference zzk;
    private final WeakReference zzl;
    private final zzdcs zzm;
    private final zzdge zzn;
    private final zzdck zzo;
    private final Set zzp;
    private boolean zzq;
    private final AtomicBoolean zzr = new AtomicBoolean();
    private zzcfw zzs = null;

    zzcun(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzflo zzfloVar, zzfld zzfldVar, zzfta zzftaVar, zzfmj zzfmjVar, View view, zzclm zzclmVar, zzbbd zzbbdVar, zzbkn zzbknVar, zzbkp zzbkpVar, zzfrg zzfrgVar, zzdcs zzdcsVar, zzdge zzdgeVar, zzdck zzdckVar, Set set) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfloVar;
        this.zzf = zzfldVar;
        this.zzg = zzftaVar;
        this.zzh = zzfmjVar;
        this.zzi = zzbbdVar;
        this.zzk = new WeakReference(view);
        this.zzl = new WeakReference(zzclmVar);
        this.zzj = zzbknVar;
        this.zzm = zzdcsVar;
        this.zzn = zzdgeVar;
        this.zzo = zzdckVar;
        this.zzp = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzA, reason: merged with bridge method [inline-methods] */
    public final List zzp() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmZ)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            Context context = this.zza;
            if (com.google.android.gms.ads.internal.util.zzs.zzE(context)) {
                com.google.android.gms.ads.internal.zzt.zzc();
                Integer zzu = com.google.android.gms.ads.internal.util.zzs.zzu(context);
                if (zzu != null) {
                    Integer valueOf = Integer.valueOf(Math.min(zzu.intValue(), 20));
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.zzf.zzd.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(valueOf.intValue())).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    private final void zzy(final int i, final int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzo();
        } else {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcun.this.zzm(i, i2);
                }
            }, i2, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final void zzo() {
        String str;
        int i;
        zzfld zzfldVar = this.zzf;
        List list = zzfldVar.zzd;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpB)).booleanValue() && this.zzs == null) {
            this.zzs = com.google.android.gms.ads.internal.zzt.zzh().zzs().zzm(this.zzp, this.zze.zza.zza.zzg);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeB)).booleanValue()) {
            str = this.zzi.zzb().zzj(this.zza, (View) this.zzk.get(), null);
        } else {
            str = null;
        }
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbi)).booleanValue() && this.zze.zzb.zzb.zzh) || !((Boolean) zzblg.zzh.zze()).booleanValue()) {
            this.zzh.zza(this.zzg.zzb(this.zze, zzfldVar, false, str, null, zzp(), this.zzo, this.zzs), this.zzn);
            return;
        }
        if (((Boolean) zzblg.zzg.zze()).booleanValue() && ((i = zzfldVar.zzb) == 1 || i == 2 || i == 5)) {
        }
        zzhcy.zzr((zzhcq) zzhcy.zzi(zzhcq.zzw(zzhcy.zza(null)), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbM)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcuh(this, str), this.zzb);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbi)).booleanValue() && this.zze.zzb.zzb.zzh) && ((Boolean) zzblg.zzd.zze()).booleanValue()) {
            zzhcy.zzr((zzhcq) zzhcy.zzg(zzhcq.zzw(this.zzj.zzb()), Throwable.class, zzcum.zza, zzcgj.zzh), new zzcug(this), this.zzb);
            return;
        }
        zzfmj zzfmjVar = this.zzh;
        zzfta zzftaVar = this.zzg;
        zzflo zzfloVar = this.zze;
        zzfld zzfldVar = this.zzf;
        zzfmjVar.zzb(zzftaVar.zza(zzfloVar, zzfldVar, zzfldVar.zzc), true == com.google.android.gms.ads.internal.zzt.zzh().zzt(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzd(zzcch zzcchVar, String str, String str2) {
        zzfta zzftaVar = this.zzg;
        zzfmj zzfmjVar = this.zzh;
        zzfld zzfldVar = this.zzf;
        zzfmjVar.zza(zzftaVar.zzc(zzfldVar, zzfldVar.zzh, zzcchVar), null);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void zzdr() {
        if (this.zzr.compareAndSet(false, true)) {
            int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeK)).intValue();
            if (intValue > 0) {
                zzy(intValue, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeL)).intValue());
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeJ)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcui
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcun.this.zzl();
                    }
                });
            } else {
                zzo();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzds() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzdt() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zze() {
        zzfta zzftaVar = this.zzg;
        zzflo zzfloVar = this.zze;
        zzfmj zzfmjVar = this.zzh;
        zzfld zzfldVar = this.zzf;
        zzfmjVar.zza(zzftaVar.zza(zzfloVar, zzfldVar, zzfldVar.zzg), null);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzf() {
        zzfta zzftaVar = this.zzg;
        zzflo zzfloVar = this.zze;
        zzfmj zzfmjVar = this.zzh;
        zzfld zzfldVar = this.zzf;
        zzfmjVar.zza(zzftaVar.zza(zzfloVar, zzfldVar, zzfldVar.zzi), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final synchronized void zzg() {
        zzdcs zzdcsVar;
        if (this.zzq) {
            ArrayList arrayList = new ArrayList(zzp());
            zzfld zzfldVar = this.zzf;
            arrayList.addAll(zzfldVar.zzf);
            this.zzh.zza(this.zzg.zzb(this.zze, zzfldVar, true, null, null, arrayList, null, null), null);
        } else {
            zzfmj zzfmjVar = this.zzh;
            zzfta zzftaVar = this.zzg;
            zzflo zzfloVar = this.zze;
            zzfld zzfldVar2 = this.zzf;
            zzfmjVar.zza(zzftaVar.zza(zzfloVar, zzfldVar2, zzfldVar2.zzm), null);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeG)).booleanValue() && (zzdcsVar = this.zzm) != null) {
                List list = zzdcsVar.zzb().zzm;
                String zzg = zzdcsVar.zzc().zzg();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(zzfta.zzd((String) it.next(), "@gw_adnetstatus@", zzg));
                }
                long zzh = zzdcsVar.zzc().zzh();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(zzfta.zzd((String) it2.next(), "@gw_ttr@", Long.toString(zzh, 10)));
                }
                zzfmjVar.zza(zzftaVar.zza(zzdcsVar.zza(), zzdcsVar.zzb(), arrayList3), null);
            }
            zzfmjVar.zza(zzftaVar.zza(zzfloVar, zzfldVar2, zzfldVar2.zzf), null);
        }
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdln
    public final void zzi() {
        zzfta zzftaVar = this.zzg;
        zzflo zzfloVar = this.zze;
        zzfmj zzfmjVar = this.zzh;
        zzfld zzfldVar = this.zzf;
        zzfmjVar.zza(zzftaVar.zza(zzfloVar, zzfldVar, zzfldVar.zzau), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcl)).booleanValue()) {
            int i = zzeVar.zza;
            zzfld zzfldVar = this.zzf;
            ArrayList arrayList = new ArrayList();
            for (String str : zzfldVar.zzo) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2);
                sb.append("2.");
                sb.append(i);
                arrayList.add(zzfta.zzd(str, "@gw_mpe@", sb.toString()));
            }
            this.zzh.zza(this.zzg.zza(this.zze, zzfldVar, arrayList), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgk
    public final void zzk() {
        zzfld zzfldVar = this.zzf;
        if (zzfldVar.zze == 4) {
            this.zzh.zza(this.zzg.zza(this.zze, zzfldVar, zzfldVar.zzaA), null);
        }
    }

    final /* synthetic */ void zzl() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcul
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcun.this.zzo();
            }
        });
    }

    final /* synthetic */ void zzm(final int i, final int i2) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcun.this.zzn(i, i2);
            }
        });
    }

    final /* synthetic */ void zzn(int i, int i2) {
        zzy(i - 1, i2);
    }

    final /* synthetic */ Context zzq() {
        return this.zza;
    }

    final /* synthetic */ zzflo zzr() {
        return this.zze;
    }

    final /* synthetic */ zzfld zzs() {
        return this.zzf;
    }

    final /* synthetic */ zzfta zzt() {
        return this.zzg;
    }

    final /* synthetic */ zzfmj zzu() {
        return this.zzh;
    }

    final /* synthetic */ zzdge zzv() {
        return this.zzn;
    }

    final /* synthetic */ zzdck zzw() {
        return this.zzo;
    }

    final /* synthetic */ zzcfw zzx() {
        return this.zzs;
    }
}
