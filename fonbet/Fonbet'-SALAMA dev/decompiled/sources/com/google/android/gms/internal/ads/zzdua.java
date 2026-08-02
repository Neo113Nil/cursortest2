package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import F2.InterfaceC0257u0;
import H2.m;
import I2.J;
import J2.j;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;
import w1.C1718l0;

/* loaded from: classes.dex */
public final class zzdua implements m, zzcfr {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private zzdtp zzc;
    private zzceb zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private InterfaceC0257u0 zzh;
    private boolean zzi;

    public zzdua(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = versionInfoParcel;
    }

    public static /* synthetic */ void zzh(zzdua zzduaVar, String str) {
        JSONObject zze = zzduaVar.zzc.zze();
        if (!TextUtils.isEmpty(str)) {
            try {
                zze.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        zzduaVar.zzd.zzb("window.inspectorInfo", zze.toString());
    }

    private final synchronized boolean zzl(InterfaceC0257u0 interfaceC0257u0) {
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziU)).booleanValue()) {
            int i7 = J.f3546b;
            j.g("Ad inspector had an internal error.");
            try {
                interfaceC0257u0.zze(zzfcb.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.zzc == null) {
            int i8 = J.f3546b;
            j.g("Ad inspector had an internal error.");
            try {
                o.f1952C.f1961g.zzw(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                interfaceC0257u0.zze(zzfcb.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.zze && !this.zzf) {
            o.f1952C.j.getClass();
            if (System.currentTimeMillis() >= this.zzg + ((Integer) r1.f2726c.zzb(zzbby.zziX)).intValue()) {
                return true;
            }
        }
        int i9 = J.f3546b;
        j.g("Ad inspector cannot be opened because it is already open.");
        try {
            interfaceC0257u0.zze(zzfcb.zzd(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfr
    public final synchronized void zza(boolean z4, int i7, String str, String str2) {
        if (z4) {
            J.k("Ad inspector loaded.");
            this.zze = true;
            zzk("");
            return;
        }
        int i8 = J.f3546b;
        j.g("Ad inspector failed to load.");
        try {
            o.f1952C.f1961g.zzw(new Exception("Failed to load UI. Error code: " + i7 + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            InterfaceC0257u0 interfaceC0257u0 = this.zzh;
            if (interfaceC0257u0 != null) {
                interfaceC0257u0.zze(zzfcb.zzd(17, null, null));
            }
        } catch (RemoteException e7) {
            o.f1952C.f1961g.zzw(e7, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
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
        this.zzf = true;
        zzk("");
    }

    @Override // H2.m
    public final void zzdr() {
    }

    @Override // H2.m
    public final synchronized void zzds(int i7) {
        this.zzd.destroy();
        if (!this.zzi) {
            J.k("Inspector closed.");
            InterfaceC0257u0 interfaceC0257u0 = this.zzh;
            if (interfaceC0257u0 != null) {
                try {
                    interfaceC0257u0.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    public final Activity zzg() {
        zzceb zzcebVar = this.zzd;
        if (zzcebVar == null || zzcebVar.zzaE()) {
            return null;
        }
        return this.zzd.zzi();
    }

    public final void zzi(zzdtp zzdtpVar) {
        this.zzc = zzdtpVar;
    }

    public final synchronized void zzj(InterfaceC0257u0 interfaceC0257u0, zzbjt zzbjtVar, zzbjm zzbjmVar, zzbja zzbjaVar) {
        if (zzl(interfaceC0257u0)) {
            try {
                o oVar = o.f1952C;
                zzceo zzceoVar = oVar.f1958d;
                zzceb zza = zzceo.zza(this.zza, zzcfv.zza(), "", false, false, null, null, this.zzb, null, null, null, zzbaw.zza(), null, null, null, null, null);
                this.zzd = zza;
                zzcft zzN = zza.zzN();
                if (zzN == null) {
                    int i7 = J.f3546b;
                    j.g("Failed to obtain a web view for the ad inspector");
                    try {
                        oVar.f1961g.zzw(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        interfaceC0257u0.zze(zzfcb.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e7) {
                        o.f1952C.f1961g.zzw(e7, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.zzh = interfaceC0257u0;
                zzN.zzV(null, null, null, null, null, false, null, null, null, null, null, null, null, zzbjtVar, null, new zzbjs(this.zza), zzbjmVar, zzbjaVar, null);
                zzN.zzC(this);
                this.zzd.loadUrl((String) C0254t.f2723d.f2726c.zzb(zzbby.zziV));
                C1718l0.o(this.zza, new AdOverlayInfoParcel(this, this.zzd, this.zzb), true, null);
                oVar.j.getClass();
                this.zzg = System.currentTimeMillis();
            } catch (zzcen e8) {
                int i8 = J.f3546b;
                j.h("Failed to obtain a web view for the ad inspector", e8);
                try {
                    o.f1952C.f1961g.zzw(e8, "InspectorUi.openInspector 0");
                    interfaceC0257u0.zze(zzfcb.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e9) {
                    o.f1952C.f1961g.zzw(e9, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void zzk(final String str) {
        if (this.zze && this.zzf) {
            zzbza.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtz
                @Override // java.lang.Runnable
                public final void run() {
                    zzdua.zzh(zzdua.this, str);
                }
            });
        }
    }
}
