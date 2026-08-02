package com.google.android.gms.internal.ads;

import E2.o;
import F2.C;
import F2.C0222c0;
import F2.C0254t;
import F2.F0;
import F2.I0;
import F2.InterfaceC0226e0;
import F2.InterfaceC0260w;
import F2.InterfaceC0265y0;
import F2.InterfaceC0266z;
import F2.L;
import F2.Z;
import H2.m;
import I2.J;
import I2.P;
import J2.j;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.D;
import java.util.concurrent.atomic.AtomicBoolean;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzewl extends L implements m, zzazk {
    protected zzcnj zza;
    private final zzcgb zzb;
    private final Context zzc;
    private final String zze;
    private final zzewf zzf;
    private final zzewd zzg;
    private final VersionInfoParcel zzh;
    private final zzdqq zzi;
    private zzcmw zzk;
    private AtomicBoolean zzd = new AtomicBoolean();
    private long zzj = -1;

    public zzewl(zzcgb zzcgbVar, Context context, String str, zzewf zzewfVar, zzewd zzewdVar, VersionInfoParcel versionInfoParcel, zzdqq zzdqqVar) {
        this.zzb = zzcgbVar;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzewfVar;
        this.zzg = zzewdVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzdqqVar;
        zzewdVar.zzm(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzq(int i7) {
        try {
            if (this.zzd.compareAndSet(false, true)) {
                this.zzg.zzj();
                zzcmw zzcmwVar = this.zzk;
                if (zzcmwVar != null) {
                    o.f1952C.f1960f.zze(zzcmwVar);
                }
                if (this.zza != null) {
                    long j = -1;
                    if (this.zzj != -1) {
                        o.f1952C.j.getClass();
                        j = SystemClock.elapsedRealtime() - this.zzj;
                    }
                    this.zza.zze(j, i7);
                }
                zzx();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // F2.M
    public final synchronized void zzA() {
    }

    @Override // F2.M
    public final synchronized void zzB() {
        D.d("resume must be called on the main UI thread.");
    }

    @Override // F2.M
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        D.d("setAdSize must be called on the main UI thread.");
    }

    @Override // F2.M
    public final void zzH(zzazt zzaztVar) {
        this.zzg.zzo(zzaztVar);
    }

    @Override // F2.M
    public final void zzI(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        this.zzf.zzl(zzxVar);
    }

    @Override // F2.M
    public final void zzK(com.google.android.gms.ads.internal.client.zzee zzeeVar) {
    }

    @Override // F2.M
    public final void zzL(boolean z4) {
    }

    @Override // F2.M
    public final void zzM(zzbsx zzbsxVar) {
    }

    @Override // F2.M
    public final synchronized void zzN(boolean z4) {
    }

    @Override // F2.M
    public final synchronized void zzO(zzbct zzbctVar) {
    }

    @Override // F2.M
    public final void zzQ(zzbta zzbtaVar, String str) {
    }

    @Override // F2.M
    public final void zzR(String str) {
    }

    @Override // F2.M
    public final void zzS(zzbvg zzbvgVar) {
    }

    @Override // F2.M
    public final void zzT(String str) {
    }

    @Override // F2.M
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzfx zzfxVar) {
    }

    @Override // F2.M
    public final synchronized void zzX() {
    }

    @Override // F2.M
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // F2.M
    public final synchronized boolean zzZ() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzazk
    public final void zza() {
        zzq(3);
    }

    @Override // F2.M
    public final boolean zzaa() {
        return false;
    }

    @Override // F2.M
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        boolean z4;
        try {
            if (!zzmVar.f10758c.getBoolean("is_sdk_preload", false)) {
                if (((Boolean) zzbdw.zzd.zze()).booleanValue()) {
                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlh)).booleanValue()) {
                        z4 = true;
                        if (this.zzh.f10836c >= ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzli)).intValue() || !z4) {
                            D.d("loadAd must be called on the main UI thread.");
                        }
                    }
                }
                z4 = false;
                if (this.zzh.f10836c >= ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzli)).intValue()) {
                }
                D.d("loadAd must be called on the main UI thread.");
            }
            P p5 = o.f1952C.f1957c;
            if (P.g(this.zzc) && zzmVar.f10748J == null) {
                int i7 = J.f3546b;
                j.d("Failed to load the ad because app ID is missing.");
                this.zzg.zzdz(zzfcb.zzd(4, null, null));
                return false;
            }
            if (zzZ()) {
                return false;
            }
            this.zzd = new AtomicBoolean();
            return this.zzf.zzb(zzmVar, this.zze, new zzewj(this), new zzewk(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // F2.M
    public final synchronized void zzac(C0222c0 c0222c0) {
    }

    @Override // F2.M
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // H2.m
    public final void zzdE() {
    }

    @Override // H2.m
    public final void zzdi() {
    }

    @Override // H2.m
    public final void zzdo() {
    }

    @Override // H2.m
    public final synchronized void zzdp() {
        if (this.zza != null) {
            o oVar = o.f1952C;
            oVar.j.getClass();
            this.zzj = SystemClock.elapsedRealtime();
            int zza = this.zza.zza();
            if (zza > 0) {
                zzcmw zzcmwVar = new zzcmw(this.zzb.zzB(), oVar.j);
                this.zzk = zzcmwVar;
                zzcmwVar.zzd(zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzewi
                    @Override // java.lang.Runnable
                    public final void run() {
                        r0.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewh
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzewl.this.zzq(5);
                            }
                        });
                    }
                });
            }
        }
    }

    @Override // H2.m
    public final synchronized void zzdr() {
        zzcnj zzcnjVar = this.zza;
        if (zzcnjVar != null) {
            o.f1952C.j.getClass();
            zzcnjVar.zze(SystemClock.elapsedRealtime() - this.zzj, 1);
        }
    }

    @Override // H2.m
    public final void zzds(int i7) {
        if (i7 == 0) {
            throw null;
        }
        int i8 = i7 - 1;
        if (i8 == 0) {
            zzq(2);
            return;
        }
        if (i8 == 1) {
            zzq(4);
        } else if (i8 != 2) {
            zzq(6);
        } else {
            zzq(3);
        }
    }

    @Override // F2.M
    public final synchronized com.google.android.gms.ads.internal.client.zzr zzg() {
        return null;
    }

    @Override // F2.M
    public final InterfaceC0266z zzi() {
        return null;
    }

    @Override // F2.M
    public final Z zzj() {
        return null;
    }

    @Override // F2.M
    public final synchronized F0 zzk() {
        return null;
    }

    @Override // F2.M
    public final synchronized I0 zzl() {
        return null;
    }

    @Override // F2.M
    public final InterfaceC1506a zzn() {
        return null;
    }

    @Override // F2.M
    public final synchronized String zzr() {
        return this.zze;
    }

    @Override // F2.M
    public final synchronized String zzs() {
        return null;
    }

    @Override // F2.M
    public final synchronized String zzt() {
        return null;
    }

    @Override // F2.M
    public final synchronized void zzx() {
        D.d("destroy must be called on the main UI thread.");
        zzcnj zzcnjVar = this.zza;
        if (zzcnjVar != null) {
            zzcnjVar.zzb();
        }
    }

    @Override // F2.M
    public final synchronized void zzz() {
        D.d("pause must be called on the main UI thread.");
    }

    @Override // F2.M
    public final void zzC(InterfaceC0260w interfaceC0260w) {
    }

    @Override // F2.M
    public final void zzD(InterfaceC0266z interfaceC0266z) {
    }

    @Override // F2.M
    public final void zzE(F2.P p5) {
    }

    @Override // F2.M
    public final void zzG(Z z4) {
    }

    @Override // F2.M
    public final void zzJ(InterfaceC0226e0 interfaceC0226e0) {
    }

    @Override // F2.M
    public final void zzP(InterfaceC0265y0 interfaceC0265y0) {
    }

    @Override // F2.M
    public final void zzW(InterfaceC1506a interfaceC1506a) {
    }

    @Override // F2.M
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, C c3) {
    }
}
