package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import m3.InterfaceC1436a;

/* loaded from: classes.dex */
final class zzefe implements zzgay {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfai zzb;
    final /* synthetic */ zzfaf zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfhv zze;
    final /* synthetic */ zzfar zzf;
    final /* synthetic */ zzefg zzg;

    public zzefe(zzefg zzefgVar, long j, zzfai zzfaiVar, zzfaf zzfafVar, String str, zzfhv zzfhvVar, zzfar zzfarVar) {
        this.zza = j;
        this.zzb = zzfaiVar;
        this.zzc = zzfafVar;
        this.zzd = str;
        this.zze = zzfhvVar;
        this.zzf = zzfarVar;
        this.zzg = zzefgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgay
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Throwable th) {
        InterfaceC1436a interfaceC1436a;
        Integer num;
        int i7;
        com.google.android.gms.ads.internal.client.zze zzb;
        boolean z4;
        boolean z7;
        LinkedHashMap linkedHashMap;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzebw zzebwVar;
        zzfia zzfiaVar;
        zzefi zzefiVar;
        interfaceC1436a = this.zzg.zza;
        ((m3.b) interfaceC1436a).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            i7 = 2;
        } else if (th instanceof zzeeo) {
            i7 = 3;
        } else if (th instanceof CancellationException) {
            i7 = 4;
        } else if (th instanceof zzfbh) {
            i7 = 5;
        } else {
            if (th instanceof zzdus) {
                r7 = zzfcb.zza(th).f10720a == 3 ? 1 : 6;
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbN)).booleanValue() && (th instanceof zzebv) && (zzb = ((zzebv) th).zzb()) != null) {
                    num = Integer.valueOf(zzb.f10720a);
                    i7 = r7;
                    synchronized (this.zzg) {
                        try {
                            zzefg zzefgVar = this.zzg;
                            z4 = zzefgVar.zze;
                            if (z4) {
                                zzefiVar = zzefgVar.zzb;
                                zzefiVar.zza(this.zzb, this.zzc, i7, th instanceof zzebv ? (zzebv) th : null, elapsedRealtime);
                            }
                            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziq)).booleanValue()) {
                                zzfiaVar = this.zzg.zzc;
                                zzfhv zzfhvVar = this.zze;
                                zzfar zzfarVar = this.zzf;
                                zzfaf zzfafVar = this.zzc;
                                zzfiaVar.zze(zzfhvVar.zzd(zzfarVar, zzfafVar, zzfafVar.zzn), this.zzc.zzax);
                            }
                            zzefg zzefgVar2 = this.zzg;
                            z7 = zzefgVar2.zzg;
                            if (z7) {
                                return;
                            }
                            linkedHashMap = zzefgVar2.zzd;
                            zzfaf zzfafVar2 = this.zzc;
                            linkedHashMap.put(zzfafVar2, new zzeff(this.zzd, zzfafVar2.zzaf, i7, elapsedRealtime, num));
                            com.google.android.gms.ads.internal.client.zze zza = zzfcb.zza(th);
                            int i8 = zza.f10720a;
                            if ((i8 == 3 || i8 == 0) && (zzeVar = zza.f10723d) != null && !zzeVar.f10722c.equals("com.google.android.gms.ads")) {
                                zza = zzfcb.zza(new zzebv(13, zza.f10723d));
                            }
                            zzebwVar = this.zzg.zzf;
                            zzebwVar.zzf(this.zzc, elapsedRealtime, zza);
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            num = null;
            i7 = r7;
            synchronized (this.zzg) {
            }
        }
        num = null;
        synchronized (this.zzg) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zzb(Object obj) {
        InterfaceC1436a interfaceC1436a;
        boolean z4;
        boolean z7;
        boolean zzq;
        LinkedHashMap linkedHashMap;
        zzebw zzebwVar;
        LinkedHashMap linkedHashMap2;
        zzefi zzefiVar;
        interfaceC1436a = this.zzg.zza;
        ((m3.b) interfaceC1436a).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zza;
        synchronized (this.zzg) {
            try {
                zzefg zzefgVar = this.zzg;
                z4 = zzefgVar.zze;
                if (z4) {
                    zzefiVar = zzefgVar.zzb;
                    zzefiVar.zza(this.zzb, this.zzc, 0, null, elapsedRealtime);
                }
                zzefg zzefgVar2 = this.zzg;
                z7 = zzefgVar2.zzg;
                if (z7) {
                    return;
                }
                zzq = zzefgVar2.zzq(this.zzc);
                if (zzq) {
                    linkedHashMap2 = this.zzg.zzd;
                    ((zzeff) linkedHashMap2.get(this.zzc)).zzd = elapsedRealtime;
                } else {
                    linkedHashMap = this.zzg.zzd;
                    zzfaf zzfafVar = this.zzc;
                    linkedHashMap.put(zzfafVar, new zzeff(this.zzd, zzfafVar.zzaf, 0, elapsedRealtime, null));
                }
                zzebwVar = this.zzg.zzf;
                zzebwVar.zzg(this.zzc, elapsedRealtime, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
