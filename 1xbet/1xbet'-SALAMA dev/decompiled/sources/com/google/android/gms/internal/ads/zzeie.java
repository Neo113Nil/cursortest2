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
import I2.J;
import I2.P;
import J2.j;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.D;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class zzeie extends L {
    private final Context zza;
    private final InterfaceC0266z zzb;
    private final zzfba zzc;
    private final zzcnp zzd;
    private final ViewGroup zze;
    private final zzdqq zzf;

    public zzeie(Context context, InterfaceC0266z interfaceC0266z, zzfba zzfbaVar, zzcnp zzcnpVar, zzdqq zzdqqVar) {
        this.zza = context;
        this.zzb = interfaceC0266z;
        this.zzc = zzfbaVar;
        this.zzd = zzcnpVar;
        this.zzf = zzdqqVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View viewZzd = zzcnpVar.zzd();
        P p5 = o.f1952C.f1957c;
        frameLayout.addView(viewZzd, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().f10773c);
        frameLayout.setMinimumWidth(zzg().f10776f);
        this.zze = frameLayout;
    }

    @Override // F2.M
    public final void zzA() {
        this.zzd.zzh();
    }

    @Override // F2.M
    public final void zzB() {
        D.d("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzc(null);
    }

    @Override // F2.M
    public final void zzC(InterfaceC0260w interfaceC0260w) {
        int i7 = J.f3546b;
        j.f("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // F2.M
    public final void zzD(InterfaceC0266z interfaceC0266z) {
        int i7 = J.f3546b;
        j.f("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // F2.M
    public final void zzE(F2.P p5) {
        int i7 = J.f3546b;
        j.f("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // F2.M
    public final void zzF(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        D.d("setAdSize must be called on the main UI thread.");
        zzcnp zzcnpVar = this.zzd;
        if (zzcnpVar != null) {
            zzcnpVar.zzi(this.zze, zzrVar);
        }
    }

    @Override // F2.M
    public final void zzG(Z z4) {
        zzejd zzejdVar = this.zzc.zzc;
        if (zzejdVar != null) {
            zzejdVar.zzm(z4);
        }
    }

    @Override // F2.M
    public final void zzH(zzazt zzaztVar) {
    }

    @Override // F2.M
    public final void zzI(com.google.android.gms.ads.internal.client.zzx zzxVar) {
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
    public final void zzN(boolean z4) {
        int i7 = J.f3546b;
        j.f("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // F2.M
    public final void zzO(zzbct zzbctVar) {
        int i7 = J.f3546b;
        j.f("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // F2.M
    public final void zzP(InterfaceC0265y0 interfaceC0265y0) {
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlA)).booleanValue()) {
            int i7 = J.f3546b;
            j.f("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        zzejd zzejdVar = this.zzc.zzc;
        if (zzejdVar != null) {
            try {
                if (!interfaceC0265y0.zzf()) {
                    this.zzf.zze();
                }
            } catch (RemoteException e7) {
                int i8 = J.f3546b;
                j.c("Error in making CSI ping for reporting paid event callback", e7);
            }
            zzejdVar.zzl(interfaceC0265y0);
        }
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
    public final void zzU(com.google.android.gms.ads.internal.client.zzfx zzfxVar) {
        int i7 = J.f3546b;
        j.f("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // F2.M
    public final void zzX() {
    }

    @Override // F2.M
    public final boolean zzY() {
        zzcnp zzcnpVar = this.zzd;
        return zzcnpVar != null && zzcnpVar.zzr();
    }

    @Override // F2.M
    public final boolean zzZ() {
        return false;
    }

    @Override // F2.M
    public final boolean zzaa() {
        return false;
    }

    @Override // F2.M
    public final boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        int i7 = J.f3546b;
        j.f("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // F2.M
    public final void zzac(C0222c0 c0222c0) {
        int i7 = J.f3546b;
        j.f("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // F2.M
    public final Bundle zzd() {
        int i7 = J.f3546b;
        j.f("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // F2.M
    public final com.google.android.gms.ads.internal.client.zzr zzg() {
        D.d("getAdSize must be called on the main UI thread.");
        return zzfbg.zza(this.zza, Collections.singletonList(this.zzd.zzf()));
    }

    @Override // F2.M
    public final InterfaceC0266z zzi() {
        return this.zzb;
    }

    @Override // F2.M
    public final Z zzj() {
        return this.zzc.zzn;
    }

    @Override // F2.M
    public final F0 zzk() {
        return this.zzd.zzl();
    }

    @Override // F2.M
    public final I0 zzl() {
        return this.zzd.zze();
    }

    @Override // F2.M
    public final p105o3.a zzn() {
        return new p105o3.b(this.zze);
    }

    @Override // F2.M
    public final String zzr() {
        return this.zzc.zzf;
    }

    @Override // F2.M
    public final String zzs() {
        if (this.zzd.zzl() != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    @Override // F2.M
    public final String zzt() {
        if (this.zzd.zzl() != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    @Override // F2.M
    public final void zzx() {
        D.d("destroy must be called on the main UI thread.");
        this.zzd.zzb();
    }

    @Override // F2.M
    public final void zzz() {
        D.d("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzb(null);
    }

    @Override // F2.M
    public final void zzJ(InterfaceC0226e0 interfaceC0226e0) {
    }

    @Override // F2.M
    public final void zzW(p105o3.a aVar) {
    }

    @Override // F2.M
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, C c3) {
    }
}
