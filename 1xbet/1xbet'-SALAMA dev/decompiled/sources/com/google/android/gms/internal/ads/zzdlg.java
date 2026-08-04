package com.google.android.gms.internal.ads;

import E2.o;
import F2.I0;
import I2.J;
import J2.j;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.D;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class zzdlg extends zzbll implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbev {
    private View zza;
    private I0 zzb;
    private zzdgx zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdlg(zzdgx zzdgxVar, zzdhc zzdhcVar) {
        this.zza = zzdhcVar.zzf();
        this.zzb = zzdhcVar.zzj();
        this.zzc = zzdgxVar;
        if (zzdhcVar.zzs() != null) {
            zzdhcVar.zzs().zzap(this);
        }
    }

    private final void zzg() {
        View view;
        zzdgx zzdgxVar = this.zzc;
        if (zzdgxVar == null || (view = this.zza) == null) {
            return;
        }
        zzdgxVar.zzB(view, Collections.emptyMap(), Collections.emptyMap(), zzdgx.zzY(this.zza));
    }

    private final void zzh() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private static final void zzi(zzblp zzblpVar, int i7) {
        try {
            zzblpVar.zze(i7);
        } catch (RemoteException e7) {
            int i8 = J.f3546b;
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final I0 zzb() {
        D.d("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        int i7 = J.f3546b;
        j.d("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final zzbfg zzc() {
        D.d("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i7 = J.f3546b;
            j.d("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdgx zzdgxVar = this.zzc;
        if (zzdgxVar == null || zzdgxVar.zzc() == null) {
            return null;
        }
        return zzdgxVar.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final void zzd() {
        D.d("#008 Must be called on the main UI thread.");
        zzh();
        zzdgx zzdgxVar = this.zzc;
        if (zzdgxVar != null) {
            zzdgxVar.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final void zze(p105o3.a aVar) {
        D.d("#008 Must be called on the main UI thread.");
        zzf(aVar, new zzdlf(this));
    }

    @Override // com.google.android.gms.internal.ads.zzblm
    public final void zzf(p105o3.a aVar, zzblp zzblpVar) {
        D.d("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i7 = J.f3546b;
            j.d("Instream ad can not be shown after destroy().");
            zzi(zzblpVar, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            int i8 = J.f3546b;
            j.d("Instream internal error: ".concat(str));
            zzi(zzblpVar, 0);
            return;
        }
        if (this.zze) {
            int i9 = J.f3546b;
            j.d("Instream ad should not be used again.");
            zzi(zzblpVar, 1);
            return;
        }
        this.zze = true;
        zzh();
        ((ViewGroup) p105o3.b.t0(aVar)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
        zzbzn zzbznVar = o.f1952C.f1954B;
        zzbzn.zza(this.zza, this);
        zzbzn.zzb(this.zza, this);
        zzg();
        try {
            zzblpVar.zzf();
        } catch (RemoteException e7) {
            int i10 = J.f3546b;
            j.i("#007 Could not call remote method.", e7);
        }
    }
}
