package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
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

    /* JADX WARN: Code duplicated, block: B:28:0x0067 A[PHI: r7
      0x0067: PHI (r7v1 int) = (r7v0 int), (r7v3 int), (r7v3 int), (r7v3 int) binds: [B:16:0x0034, B:21:0x004f, B:23:0x0053, B:25:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0074 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:31:0x006c, B:33:0x0074, B:35:0x0080, B:39:0x0088, B:40:0x0090, B:42:0x00a2, B:43:0x00bb, B:45:0x00c3, B:47:0x00c5, B:55:0x0103, B:56:0x010e, B:50:0x00e8, B:52:0x00ec, B:54:0x00f6), top: B:60:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0080 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:31:0x006c, B:33:0x0074, B:35:0x0080, B:39:0x0088, B:40:0x0090, B:42:0x00a2, B:43:0x00bb, B:45:0x00c3, B:47:0x00c5, B:55:0x0103, B:56:0x010e, B:50:0x00e8, B:52:0x00ec, B:54:0x00f6), top: B:60:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a2 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:31:0x006c, B:33:0x0074, B:35:0x0080, B:39:0x0088, B:40:0x0090, B:42:0x00a2, B:43:0x00bb, B:45:0x00c3, B:47:0x00c5, B:55:0x0103, B:56:0x010e, B:50:0x00e8, B:52:0x00ec, B:54:0x00f6), top: B:60:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3 A[Catch: all -> 0x0085, DONT_GENERATE, TryCatch #0 {all -> 0x0085, blocks: (B:31:0x006c, B:33:0x0074, B:35:0x0080, B:39:0x0088, B:40:0x0090, B:42:0x00a2, B:43:0x00bb, B:45:0x00c3, B:47:0x00c5, B:55:0x0103, B:56:0x010e, B:50:0x00e8, B:52:0x00ec, B:54:0x00f6), top: B:60:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:31:0x006c, B:33:0x0074, B:35:0x0080, B:39:0x0088, B:40:0x0090, B:42:0x00a2, B:43:0x00bb, B:45:0x00c3, B:47:0x00c5, B:55:0x0103, B:56:0x010e, B:50:0x00e8, B:52:0x00ec, B:54:0x00f6), top: B:60:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:60:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        Integer numValueOf;
        int i7;
        com.google.android.gms.ads.internal.client.zze zzeVarZzb;
        zzefg zzefgVar;
        zzefg zzefgVar2;
        com.google.android.gms.ads.internal.client.zze zzeVarZza;
        int i8;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        ((p090m3.b) this.zzg.zza).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            i7 = 2;
        } else if (th instanceof zzeeo) {
            i7 = 3;
        } else {
            if (!(th instanceof CancellationException)) {
                if (th instanceof zzfbh) {
                    i7 = 5;
                } else {
                    int i9 = 6;
                    if (th instanceof zzdus) {
                        i9 = zzfcb.zza(th).f10720a == 3 ? 1 : 6;
                        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbN)).booleanValue() && (th instanceof zzebv) && (zzeVarZzb = ((zzebv) th).zzb()) != null) {
                            numValueOf = Integer.valueOf(zzeVarZzb.f10720a);
                        } else {
                            numValueOf = null;
                        }
                    } else {
                        numValueOf = null;
                    }
                    i7 = i9;
                }
                synchronized (this.zzg) {
                    try {
                        zzefgVar = this.zzg;
                        if (zzefgVar.zze) {
                            zzefgVar.zzb.zza(this.zzb, this.zzc, i7, th instanceof zzebv ? (zzebv) th : null, jElapsedRealtime);
                        }
                        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziq)).booleanValue()) {
                            zzfia zzfiaVar = this.zzg.zzc;
                            zzfhv zzfhvVar = this.zze;
                            zzfar zzfarVar = this.zzf;
                            zzfaf zzfafVar = this.zzc;
                            zzfiaVar.zze(zzfhvVar.zzd(zzfarVar, zzfafVar, zzfafVar.zzn), this.zzc.zzax);
                        }
                        zzefgVar2 = this.zzg;
                        if (zzefgVar2.zzg) {
                            return;
                        }
                        LinkedHashMap linkedHashMap = zzefgVar2.zzd;
                        zzfaf zzfafVar2 = this.zzc;
                        linkedHashMap.put(zzfafVar2, new zzeff(this.zzd, zzfafVar2.zzaf, i7, jElapsedRealtime, numValueOf));
                        zzeVarZza = zzfcb.zza(th);
                        i8 = zzeVarZza.f10720a;
                        if ((i8 != 3 || i8 == 0) && (zzeVar = zzeVarZza.f10723d) != null && !zzeVar.f10722c.equals("com.google.android.gms.ads")) {
                        }
                        this.zzg.zzf.zzf(this.zzc, jElapsedRealtime, zzeVarZza);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            i7 = 4;
        }
        numValueOf = null;
        synchronized (this.zzg) {
            zzefgVar = this.zzg;
            if (zzefgVar.zze) {
                zzefgVar.zzb.zza(this.zzb, this.zzc, i7, th instanceof zzebv ? (zzebv) th : null, jElapsedRealtime);
            }
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziq)).booleanValue()) {
                zzfia zzfiaVar2 = this.zzg.zzc;
                zzfhv zzfhvVar2 = this.zze;
                zzfar zzfarVar2 = this.zzf;
                zzfaf zzfafVar3 = this.zzc;
                zzfiaVar2.zze(zzfhvVar2.zzd(zzfarVar2, zzfafVar3, zzfafVar3.zzn), this.zzc.zzax);
            }
            zzefgVar2 = this.zzg;
            if (zzefgVar2.zzg) {
                return;
            }
            LinkedHashMap linkedHashMap2 = zzefgVar2.zzd;
            zzfaf zzfafVar4 = this.zzc;
            linkedHashMap2.put(zzfafVar4, new zzeff(this.zzd, zzfafVar4.zzaf, i7, jElapsedRealtime, numValueOf));
            zzeVarZza = zzfcb.zza(th);
            i8 = zzeVarZza.f10720a;
            zzeVarZza = i8 != 3 ? zzfcb.zza(new zzebv(13, zzeVarZza.f10723d)) : zzfcb.zza(new zzebv(13, zzeVarZza.f10723d));
            this.zzg.zzf.zzf(this.zzc, jElapsedRealtime, zzeVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zzb(Object obj) {
        ((p090m3.b) this.zzg.zza).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zza;
        synchronized (this.zzg) {
            try {
                zzefg zzefgVar = this.zzg;
                if (zzefgVar.zze) {
                    zzefgVar.zzb.zza(this.zzb, this.zzc, 0, null, jElapsedRealtime);
                }
                zzefg zzefgVar2 = this.zzg;
                if (zzefgVar2.zzg) {
                    return;
                }
                if (zzefgVar2.zzq(this.zzc)) {
                    ((zzeff) this.zzg.zzd.get(this.zzc)).zzd = jElapsedRealtime;
                } else {
                    LinkedHashMap linkedHashMap = this.zzg.zzd;
                    zzfaf zzfafVar = this.zzc;
                    linkedHashMap.put(zzfafVar, new zzeff(this.zzd, zzfafVar.zzaf, 0, jElapsedRealtime, null));
                }
                this.zzg.zzf.zzg(this.zzc, jElapsedRealtime, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
