package com.google.android.gms.internal.ads;

import E2.o;
import I2.J;
import J2.j;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import o3.BinderC1507b;
import o3.InterfaceC1506a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdhw extends zzbfs implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdja {
    private final WeakReference zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzdgx zze;
    private zzaxy zzf;

    public zzdhw(View view, HashMap hashMap, HashMap hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        o oVar = o.f1952C;
        zzbzn zzbznVar = oVar.f1954B;
        zzbzn.zza(view, this);
        zzbzn zzbznVar2 = oVar.f1954B;
        zzbzn.zzb(view, this);
        this.zza = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.zzb.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.zzd.putAll(this.zzb);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.zzc.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.zzd.putAll(this.zzc);
        this.zzf = new zzaxy(view.getContext(), view);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdgx zzdgxVar = this.zze;
        if (zzdgxVar != null) {
            zzdgxVar.zzD(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdgx zzdgxVar = this.zze;
        if (zzdgxVar != null) {
            zzdgxVar.zzB(zzf(), zzl(), zzm(), zzdgx.zzY(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdgx zzdgxVar = this.zze;
        if (zzdgxVar != null) {
            zzdgxVar.zzB(zzf(), zzl(), zzm(), zzdgx.zzY(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdgx zzdgxVar = this.zze;
        if (zzdgxVar != null) {
            zzdgxVar.zzL(view, motionEvent, zzf());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final synchronized void zzb(InterfaceC1506a interfaceC1506a) {
        try {
            if (this.zze != null) {
                Object t02 = BinderC1507b.t0(interfaceC1506a);
                if (!(t02 instanceof View)) {
                    int i7 = J.f3546b;
                    j.g("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.zze.zzN((View) t02);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final synchronized void zzc(InterfaceC1506a interfaceC1506a) {
        Object t02 = BinderC1507b.t0(interfaceC1506a);
        if (!(t02 instanceof zzdgx)) {
            int i7 = J.f3546b;
            j.g("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzdgx zzdgxVar = this.zze;
        if (zzdgxVar != null) {
            zzdgxVar.zzT(this);
        }
        zzdgx zzdgxVar2 = (zzdgx) t02;
        if (!zzdgxVar2.zzU()) {
            int i8 = J.f3546b;
            j.d("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
        } else {
            this.zze = zzdgxVar2;
            zzdgxVar2.zzS(this);
            this.zze.zzK(zzf());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final synchronized void zzd() {
        zzdgx zzdgxVar = this.zze;
        if (zzdgxVar != null) {
            zzdgxVar.zzT(this);
            this.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final View zzf() {
        return (View) this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final synchronized View zzg(String str) {
        WeakReference weakReference = (WeakReference) this.zzd.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final FrameLayout zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final zzaxy zzi() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final synchronized InterfaceC1506a zzj() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.zzdja
    public final synchronized String zzk() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final synchronized Map zzl() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final synchronized Map zzm() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final synchronized Map zzn() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final synchronized JSONObject zzp() {
        zzdgx zzdgxVar = this.zze;
        if (zzdgxVar == null) {
            return null;
        }
        return zzdgxVar.zzj(zzf(), zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdja
    public final synchronized void zzq(String str, View view, boolean z4) {
        this.zzd.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.zzb.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }
}
