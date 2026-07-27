package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.U3;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdqr {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzea zzb;
    private zzbmo zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzew zzg;
    private Bundle zzh;
    private zzclm zzi;
    private zzclm zzj;
    private zzclm zzk;
    private zzeml zzl;
    private ListenableFuture zzm;
    private zzcgo zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbmv zzs;
    private zzbmv zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final SimpleArrayMap zzv = new SimpleArrayMap();
    private final SimpleArrayMap zzw = new SimpleArrayMap();
    private List zzf = Collections.emptyList();

    public static zzdqr zzaf(zzbwj zzbwjVar) {
        try {
            return zzak(zzam(zzbwjVar.zzn(), zzbwjVar), zzbwjVar.zzo(), (View) zzal(zzbwjVar.zzp()), zzbwjVar.zze(), zzbwjVar.zzf(), zzbwjVar.zzg(), zzbwjVar.zzs(), zzbwjVar.zzi(), (View) zzal(zzbwjVar.zzq()), zzbwjVar.zzr(), zzbwjVar.zzl(), zzbwjVar.zzm(), zzbwjVar.zzk(), zzbwjVar.zzh(), zzbwjVar.zzj(), zzbwjVar.zzz());
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public static zzdqr zzag(zzbwg zzbwgVar) {
        try {
            zzdqq zzam = zzam(zzbwgVar.zzs(), null);
            zzbmo zzt = zzbwgVar.zzt();
            View view = (View) zzal(zzbwgVar.zzr());
            String zze = zzbwgVar.zze();
            List zzf = zzbwgVar.zzf();
            String zzg = zzbwgVar.zzg();
            Bundle zzp = zzbwgVar.zzp();
            String zzi = zzbwgVar.zzi();
            View view2 = (View) zzal(zzbwgVar.zzu());
            IObjectWrapper zzv = zzbwgVar.zzv();
            String zzj = zzbwgVar.zzj();
            zzbmv zzh = zzbwgVar.zzh();
            zzdqr zzdqrVar = new zzdqr();
            zzdqrVar.zza = 1;
            zzdqrVar.zzb = zzam;
            zzdqrVar.zzc = zzt;
            zzdqrVar.zzd = view;
            zzdqrVar.zzs("headline", zze);
            zzdqrVar.zze = zzf;
            zzdqrVar.zzs("body", zzg);
            zzdqrVar.zzh = zzp;
            zzdqrVar.zzs("call_to_action", zzi);
            zzdqrVar.zzo = view2;
            zzdqrVar.zzq = zzv;
            zzdqrVar.zzs(U3.i.F0, zzj);
            zzdqrVar.zzt = zzh;
            return zzdqrVar;
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdqr zzah(zzbwf zzbwfVar) {
        try {
            zzdqq zzam = zzam(zzbwfVar.zzt(), null);
            zzbmo zzv = zzbwfVar.zzv();
            View view = (View) zzal(zzbwfVar.zzu());
            String zze = zzbwfVar.zze();
            List zzf = zzbwfVar.zzf();
            String zzg = zzbwfVar.zzg();
            Bundle zzr = zzbwfVar.zzr();
            String zzi = zzbwfVar.zzi();
            View view2 = (View) zzal(zzbwfVar.zzw());
            IObjectWrapper zzx = zzbwfVar.zzx();
            String zzk = zzbwfVar.zzk();
            String zzl = zzbwfVar.zzl();
            double zzj = zzbwfVar.zzj();
            zzbmv zzh = zzbwfVar.zzh();
            zzdqr zzdqrVar = new zzdqr();
            zzdqrVar.zza = 2;
            zzdqrVar.zzb = zzam;
            zzdqrVar.zzc = zzv;
            zzdqrVar.zzd = view;
            zzdqrVar.zzs("headline", zze);
            zzdqrVar.zze = zzf;
            zzdqrVar.zzs("body", zzg);
            zzdqrVar.zzh = zzr;
            zzdqrVar.zzs("call_to_action", zzi);
            zzdqrVar.zzo = view2;
            zzdqrVar.zzq = zzx;
            zzdqrVar.zzs(U3.i.U, zzk);
            zzdqrVar.zzs("price", zzl);
            zzdqrVar.zzr = zzj;
            zzdqrVar.zzs = zzh;
            return zzdqrVar;
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzdqr zzai(zzbwf zzbwfVar) {
        try {
            return zzak(zzam(zzbwfVar.zzt(), null), zzbwfVar.zzv(), (View) zzal(zzbwfVar.zzu()), zzbwfVar.zze(), zzbwfVar.zzf(), zzbwfVar.zzg(), zzbwfVar.zzr(), zzbwfVar.zzi(), (View) zzal(zzbwfVar.zzw()), zzbwfVar.zzx(), zzbwfVar.zzk(), zzbwfVar.zzl(), zzbwfVar.zzj(), zzbwfVar.zzh(), null, 0.0f);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdqr zzaj(zzbwg zzbwgVar) {
        try {
            return zzak(zzam(zzbwgVar.zzs(), null), zzbwgVar.zzt(), (View) zzal(zzbwgVar.zzr()), zzbwgVar.zze(), zzbwgVar.zzf(), zzbwgVar.zzg(), zzbwgVar.zzp(), zzbwgVar.zzi(), (View) zzal(zzbwgVar.zzu()), zzbwgVar.zzv(), null, null, -1.0d, zzbwgVar.zzh(), zzbwgVar.zzj(), 0.0f);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdqr zzak(com.google.android.gms.ads.internal.client.zzea zzeaVar, zzbmo zzbmoVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbmv zzbmvVar, String str6, float f) {
        zzdqr zzdqrVar = new zzdqr();
        zzdqrVar.zza = 6;
        zzdqrVar.zzb = zzeaVar;
        zzdqrVar.zzc = zzbmoVar;
        zzdqrVar.zzd = view;
        zzdqrVar.zzs("headline", str);
        zzdqrVar.zze = list;
        zzdqrVar.zzs("body", str2);
        zzdqrVar.zzh = bundle;
        zzdqrVar.zzs("call_to_action", str3);
        zzdqrVar.zzo = view2;
        zzdqrVar.zzq = iObjectWrapper;
        zzdqrVar.zzs(U3.i.U, str4);
        zzdqrVar.zzs("price", str5);
        zzdqrVar.zzr = d;
        zzdqrVar.zzs = zzbmvVar;
        zzdqrVar.zzs(U3.i.F0, str6);
        zzdqrVar.zzu(f);
        return zzdqrVar;
    }

    private static Object zzal(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    private static zzdqq zzam(com.google.android.gms.ads.internal.client.zzea zzeaVar, zzbwj zzbwjVar) {
        if (zzeaVar == null) {
            return null;
        }
        return new zzdqq(zzeaVar, zzbwjVar);
    }

    public final synchronized View zzA() {
        return this.zzd;
    }

    public final synchronized String zzB() {
        return zzw("headline");
    }

    public final synchronized List zzC() {
        return this.zze;
    }

    public final zzbmv zzD() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbmu.zzg((IBinder) obj);
        }
        return null;
    }

    public final synchronized List zzE() {
        return this.zzf;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzew zzF() {
        return this.zzg;
    }

    public final synchronized String zzG() {
        return zzw("body");
    }

    public final synchronized Bundle zzH() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized String zzI() {
        return zzw("call_to_action");
    }

    public final synchronized View zzJ() {
        return this.zzo;
    }

    public final synchronized View zzK() {
        return this.zzp;
    }

    public final synchronized IObjectWrapper zzL() {
        return this.zzq;
    }

    public final synchronized String zzM() {
        return zzw(U3.i.U);
    }

    public final synchronized String zzN() {
        return zzw("price");
    }

    public final synchronized double zzO() {
        return this.zzr;
    }

    public final synchronized zzbmv zzP() {
        return this.zzs;
    }

    public final synchronized String zzQ() {
        return zzw(U3.i.F0);
    }

    public final synchronized zzbmv zzR() {
        return this.zzt;
    }

    public final synchronized String zzS() {
        return this.zzu;
    }

    public final synchronized zzclm zzT() {
        return this.zzi;
    }

    public final synchronized zzclm zzU() {
        return this.zzj;
    }

    public final synchronized boolean zzV() {
        return this.zzj != null;
    }

    public final synchronized zzclm zzW() {
        return this.zzk;
    }

    public final synchronized ListenableFuture zzX() {
        return this.zzm;
    }

    public final synchronized zzcgo zzY() {
        return this.zzn;
    }

    public final synchronized zzeml zzZ() {
        return this.zzl;
    }

    public final synchronized void zza(int i) {
        this.zza = i;
    }

    public final synchronized SimpleArrayMap zzaa() {
        return this.zzv;
    }

    public final synchronized float zzab() {
        return this.zzx;
    }

    public final synchronized String zzac() {
        return this.zzy;
    }

    public final synchronized SimpleArrayMap zzad() {
        return this.zzw;
    }

    public final synchronized void zzae() {
        zzclm zzclmVar = this.zzi;
        if (zzclmVar != null) {
            zzclmVar.destroy();
            this.zzi = null;
        }
        zzclm zzclmVar2 = this.zzj;
        if (zzclmVar2 != null) {
            zzclmVar2.destroy();
            this.zzj = null;
        }
        zzclm zzclmVar3 = this.zzk;
        if (zzclmVar3 != null) {
            zzclmVar3.destroy();
            this.zzk = null;
        }
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.zzm = null;
        }
        zzcgo zzcgoVar = this.zzn;
        if (zzcgoVar != null) {
            zzcgoVar.cancel(false);
            this.zzn = null;
        }
        this.zzl = null;
        this.zzv.clear();
        this.zzw.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
    }

    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        this.zzb = zzeaVar;
    }

    public final synchronized void zzc(zzbmo zzbmoVar) {
        this.zzc = zzbmoVar;
    }

    public final synchronized void zzd(List list) {
        this.zze = list;
    }

    public final synchronized void zze(List list) {
        this.zzf = list;
    }

    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzew zzewVar) {
        this.zzg = zzewVar;
    }

    public final synchronized void zzg(View view) {
        this.zzo = view;
    }

    public final synchronized void zzh(View view) {
        this.zzp = view;
    }

    public final synchronized void zzi(double d) {
        this.zzr = d;
    }

    public final synchronized void zzj(zzbmv zzbmvVar) {
        this.zzs = zzbmvVar;
    }

    public final synchronized void zzk(zzbmv zzbmvVar) {
        this.zzt = zzbmvVar;
    }

    public final synchronized void zzl(String str) {
        this.zzu = str;
    }

    public final synchronized void zzm(zzclm zzclmVar) {
        this.zzi = zzclmVar;
    }

    public final synchronized void zzn(zzclm zzclmVar) {
        this.zzj = zzclmVar;
    }

    public final synchronized void zzo(zzclm zzclmVar) {
        this.zzk = zzclmVar;
    }

    public final synchronized void zzp(ListenableFuture listenableFuture) {
        this.zzm = listenableFuture;
    }

    public final synchronized void zzq(zzeml zzemlVar) {
        this.zzl = zzemlVar;
    }

    public final synchronized void zzr(zzcgo zzcgoVar) {
        this.zzn = zzcgoVar;
    }

    public final synchronized void zzs(String str, String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized void zzt(String str, zzbmg zzbmgVar) {
        if (zzbmgVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbmgVar);
        }
    }

    public final synchronized void zzu(float f) {
        this.zzx = f;
    }

    public final synchronized void zzv(String str) {
        this.zzy = str;
    }

    public final synchronized String zzw(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized int zzx() {
        return this.zza;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzea zzy() {
        return this.zzb;
    }

    public final synchronized zzbmo zzz() {
        return this.zzc;
    }
}
