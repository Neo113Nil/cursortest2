package com.google.android.gms.internal.ads;

import F2.I0;
import F2.V0;
import I2.J;
import J2.j;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import io.sentry.SentryLogEvent;
import java.util.Collections;
import java.util.List;
import o3.BinderC1507b;
import o3.InterfaceC1506a;
import r.l;

/* loaded from: classes.dex */
public final class zzdhc {
    private int zza;
    private I0 zzb;
    private zzbfc zzc;
    private View zzd;
    private List zze;
    private V0 zzg;
    private Bundle zzh;
    private zzceb zzi;
    private zzceb zzj;
    private zzceb zzk;
    private zzebm zzl;
    private I3.b zzm;
    private zzbzf zzn;
    private View zzo;
    private View zzp;
    private InterfaceC1506a zzq;
    private double zzr;
    private zzbfj zzs;
    private zzbfj zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final l zzv = new l();
    private final l zzw = new l();
    private List zzf = Collections.emptyList();

    public static zzdhc zzag(zzboz zzbozVar) {
        try {
            zzdhb zzak = zzak(zzbozVar.zzg(), null);
            zzbfc zzh = zzbozVar.zzh();
            View view = (View) zzam(zzbozVar.zzj());
            String zzo = zzbozVar.zzo();
            List zzr = zzbozVar.zzr();
            String zzm = zzbozVar.zzm();
            Bundle zzf = zzbozVar.zzf();
            String zzn = zzbozVar.zzn();
            View view2 = (View) zzam(zzbozVar.zzk());
            InterfaceC1506a zzl = zzbozVar.zzl();
            String zzq = zzbozVar.zzq();
            String zzp = zzbozVar.zzp();
            double zze = zzbozVar.zze();
            zzbfj zzi = zzbozVar.zzi();
            zzdhc zzdhcVar = new zzdhc();
            zzdhcVar.zza = 2;
            zzdhcVar.zzb = zzak;
            zzdhcVar.zzc = zzh;
            zzdhcVar.zzd = view;
            zzdhcVar.zzZ("headline", zzo);
            zzdhcVar.zze = zzr;
            zzdhcVar.zzZ(SentryLogEvent.JsonKeys.BODY, zzm);
            zzdhcVar.zzh = zzf;
            zzdhcVar.zzZ("call_to_action", zzn);
            zzdhcVar.zzo = view2;
            zzdhcVar.zzq = zzl;
            zzdhcVar.zzZ("store", zzq);
            zzdhcVar.zzZ("price", zzp);
            zzdhcVar.zzr = zze;
            zzdhcVar.zzs = zzi;
            return zzdhcVar;
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.h("Failed to get native ad from app install ad mapper", e7);
            return null;
        }
    }

    public static zzdhc zzah(zzbpa zzbpaVar) {
        try {
            zzdhb zzak = zzak(zzbpaVar.zzf(), null);
            zzbfc zzg = zzbpaVar.zzg();
            View view = (View) zzam(zzbpaVar.zzi());
            String zzo = zzbpaVar.zzo();
            List zzp = zzbpaVar.zzp();
            String zzm = zzbpaVar.zzm();
            Bundle zze = zzbpaVar.zze();
            String zzn = zzbpaVar.zzn();
            View view2 = (View) zzam(zzbpaVar.zzj());
            InterfaceC1506a zzk = zzbpaVar.zzk();
            String zzl = zzbpaVar.zzl();
            zzbfj zzh = zzbpaVar.zzh();
            zzdhc zzdhcVar = new zzdhc();
            zzdhcVar.zza = 1;
            zzdhcVar.zzb = zzak;
            zzdhcVar.zzc = zzg;
            zzdhcVar.zzd = view;
            zzdhcVar.zzZ("headline", zzo);
            zzdhcVar.zze = zzp;
            zzdhcVar.zzZ(SentryLogEvent.JsonKeys.BODY, zzm);
            zzdhcVar.zzh = zze;
            zzdhcVar.zzZ("call_to_action", zzn);
            zzdhcVar.zzo = view2;
            zzdhcVar.zzq = zzk;
            zzdhcVar.zzZ("advertiser", zzl);
            zzdhcVar.zzt = zzh;
            return zzdhcVar;
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.h("Failed to get native ad from content ad mapper", e7);
            return null;
        }
    }

    public static zzdhc zzai(zzboz zzbozVar) {
        try {
            return zzal(zzak(zzbozVar.zzg(), null), zzbozVar.zzh(), (View) zzam(zzbozVar.zzj()), zzbozVar.zzo(), zzbozVar.zzr(), zzbozVar.zzm(), zzbozVar.zzf(), zzbozVar.zzn(), (View) zzam(zzbozVar.zzk()), zzbozVar.zzl(), zzbozVar.zzq(), zzbozVar.zzp(), zzbozVar.zze(), zzbozVar.zzi(), null, 0.0f);
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.h("Failed to get native ad assets from app install ad mapper", e7);
            return null;
        }
    }

    public static zzdhc zzaj(zzbpa zzbpaVar) {
        try {
            return zzal(zzak(zzbpaVar.zzf(), null), zzbpaVar.zzg(), (View) zzam(zzbpaVar.zzi()), zzbpaVar.zzo(), zzbpaVar.zzp(), zzbpaVar.zzm(), zzbpaVar.zze(), zzbpaVar.zzn(), (View) zzam(zzbpaVar.zzj()), zzbpaVar.zzk(), null, null, -1.0d, zzbpaVar.zzh(), zzbpaVar.zzl(), 0.0f);
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.h("Failed to get native ad assets from content ad mapper", e7);
            return null;
        }
    }

    private static zzdhb zzak(I0 i02, zzbpd zzbpdVar) {
        if (i02 == null) {
            return null;
        }
        return new zzdhb(i02, zzbpdVar);
    }

    private static zzdhc zzal(I0 i02, zzbfc zzbfcVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, InterfaceC1506a interfaceC1506a, String str4, String str5, double d7, zzbfj zzbfjVar, String str6, float f7) {
        zzdhc zzdhcVar = new zzdhc();
        zzdhcVar.zza = 6;
        zzdhcVar.zzb = i02;
        zzdhcVar.zzc = zzbfcVar;
        zzdhcVar.zzd = view;
        zzdhcVar.zzZ("headline", str);
        zzdhcVar.zze = list;
        zzdhcVar.zzZ(SentryLogEvent.JsonKeys.BODY, str2);
        zzdhcVar.zzh = bundle;
        zzdhcVar.zzZ("call_to_action", str3);
        zzdhcVar.zzo = view2;
        zzdhcVar.zzq = interfaceC1506a;
        zzdhcVar.zzZ("store", str4);
        zzdhcVar.zzZ("price", str5);
        zzdhcVar.zzr = d7;
        zzdhcVar.zzs = zzbfjVar;
        zzdhcVar.zzZ("advertiser", str6);
        zzdhcVar.zzR(f7);
        return zzdhcVar;
    }

    private static Object zzam(InterfaceC1506a interfaceC1506a) {
        if (interfaceC1506a == null) {
            return null;
        }
        return BinderC1507b.t0(interfaceC1506a);
    }

    public static zzdhc zzt(zzbpd zzbpdVar) {
        try {
            return zzal(zzak(zzbpdVar.zzj(), zzbpdVar), zzbpdVar.zzk(), (View) zzam(zzbpdVar.zzm()), zzbpdVar.zzs(), zzbpdVar.zzv(), zzbpdVar.zzq(), zzbpdVar.zzi(), zzbpdVar.zzr(), (View) zzam(zzbpdVar.zzn()), zzbpdVar.zzo(), zzbpdVar.zzu(), zzbpdVar.zzt(), zzbpdVar.zze(), zzbpdVar.zzl(), zzbpdVar.zzp(), zzbpdVar.zzf());
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.h("Failed to get native ad assets from unified ad mapper", e7);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzu;
    }

    public final synchronized String zzB() {
        return zzF("headline");
    }

    public final synchronized String zzC() {
        return this.zzy;
    }

    public final synchronized String zzD() {
        return zzF("price");
    }

    public final synchronized String zzE() {
        return zzF("store");
    }

    public final synchronized String zzF(String str) {
        return (String) this.zzw.getOrDefault(str, null);
    }

    public final synchronized List zzG() {
        return this.zze;
    }

    public final synchronized List zzH() {
        return this.zzf;
    }

    public final synchronized void zzI() {
        try {
            zzceb zzcebVar = this.zzi;
            if (zzcebVar != null) {
                zzcebVar.destroy();
                this.zzi = null;
            }
            zzceb zzcebVar2 = this.zzj;
            if (zzcebVar2 != null) {
                zzcebVar2.destroy();
                this.zzj = null;
            }
            zzceb zzcebVar3 = this.zzk;
            if (zzcebVar3 != null) {
                zzcebVar3.destroy();
                this.zzk = null;
            }
            I3.b bVar = this.zzm;
            if (bVar != null) {
                bVar.cancel(false);
                this.zzm = null;
            }
            zzbzf zzbzfVar = this.zzn;
            if (zzbzfVar != null) {
                zzbzfVar.cancel(false);
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
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzJ(zzbfc zzbfcVar) {
        this.zzc = zzbfcVar;
    }

    public final synchronized void zzK(String str) {
        this.zzu = str;
    }

    public final synchronized void zzL(V0 v02) {
        this.zzg = v02;
    }

    public final synchronized void zzM(zzbfj zzbfjVar) {
        this.zzs = zzbfjVar;
    }

    public final synchronized void zzN(String str, zzbew zzbewVar) {
        if (zzbewVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbewVar);
        }
    }

    public final synchronized void zzO(zzceb zzcebVar) {
        this.zzj = zzcebVar;
    }

    public final synchronized void zzP(List list) {
        this.zze = list;
    }

    public final synchronized void zzQ(zzbfj zzbfjVar) {
        this.zzt = zzbfjVar;
    }

    public final synchronized void zzR(float f7) {
        this.zzx = f7;
    }

    public final synchronized void zzS(List list) {
        this.zzf = list;
    }

    public final synchronized void zzT(zzceb zzcebVar) {
        this.zzk = zzcebVar;
    }

    public final synchronized void zzU(I3.b bVar) {
        this.zzm = bVar;
    }

    public final synchronized void zzV(String str) {
        this.zzy = str;
    }

    public final synchronized void zzW(zzebm zzebmVar) {
        this.zzl = zzebmVar;
    }

    public final synchronized void zzX(zzbzf zzbzfVar) {
        this.zzn = zzbzfVar;
    }

    public final synchronized void zzY(double d7) {
        this.zzr = d7;
    }

    public final synchronized void zzZ(String str, String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized double zza() {
        return this.zzr;
    }

    public final synchronized void zzaa(int i7) {
        this.zza = i7;
    }

    public final synchronized void zzab(I0 i02) {
        this.zzb = i02;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized void zzad(zzceb zzcebVar) {
        this.zzi = zzcebVar;
    }

    public final synchronized void zzae(View view) {
        this.zzp = view;
    }

    public final synchronized boolean zzaf() {
        return this.zzj != null;
    }

    public final synchronized float zzb() {
        return this.zzx;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        try {
            if (this.zzh == null) {
                this.zzh = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzo;
    }

    public final synchronized View zzg() {
        return this.zzp;
    }

    public final synchronized l zzh() {
        return this.zzv;
    }

    public final synchronized l zzi() {
        return this.zzw;
    }

    public final synchronized I0 zzj() {
        return this.zzb;
    }

    public final synchronized V0 zzk() {
        return this.zzg;
    }

    public final synchronized zzbfc zzl() {
        return this.zzc;
    }

    public final zzbfj zzm() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbfi.zzg((IBinder) obj);
        }
        return null;
    }

    public final synchronized zzbfj zzn() {
        return this.zzs;
    }

    public final synchronized zzbfj zzo() {
        return this.zzt;
    }

    public final synchronized zzbzf zzp() {
        return this.zzn;
    }

    public final synchronized zzceb zzq() {
        return this.zzj;
    }

    public final synchronized zzceb zzr() {
        return this.zzk;
    }

    public final synchronized zzceb zzs() {
        return this.zzi;
    }

    public final synchronized zzebm zzu() {
        return this.zzl;
    }

    public final synchronized InterfaceC1506a zzv() {
        return this.zzq;
    }

    public final synchronized I3.b zzw() {
        return this.zzm;
    }

    public final synchronized String zzx() {
        return zzF("advertiser");
    }

    public final synchronized String zzy() {
        return zzF(SentryLogEvent.JsonKeys.BODY);
    }

    public final synchronized String zzz() {
        return zzF("call_to_action");
    }
}
