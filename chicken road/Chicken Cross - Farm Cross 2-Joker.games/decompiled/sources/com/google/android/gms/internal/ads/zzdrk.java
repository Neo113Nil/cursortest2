package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes9.dex */
public final class zzdrk extends zzbnd implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdso {
    private final WeakReference zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzdqm zze;
    private zzbfi zzf;

    public zzdrk(View view, HashMap hashMap, HashMap hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcgw.zza(view, this);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcgw.zzb(view, this);
        this.zza = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.zzb.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
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
        this.zzf = new zzbfi(view.getContext(), view);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdqm zzdqmVar = this.zze;
        if (zzdqmVar != null) {
            zzdqmVar.zzi(view, zzdF(), zzh(), zzi(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdqm zzdqmVar = this.zze;
        if (zzdqmVar != null) {
            zzdqmVar.zzu(zzdF(), zzh(), zzi(), zzdqm.zzI(zzdF()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdqm zzdqmVar = this.zze;
        if (zzdqmVar != null) {
            zzdqmVar.zzu(zzdF(), zzh(), zzi(), zzdqm.zzI(zzdF()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdqm zzdqmVar = this.zze;
        if (zzdqmVar != null) {
            zzdqmVar.zzk(view, motionEvent, zzdF());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbne
    public final synchronized void zza(IObjectWrapper iObjectWrapper) {
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzdqm)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzdqm zzdqmVar = this.zze;
        if (zzdqmVar != null) {
            zzdqmVar.zzh(this);
        }
        zzdqm zzdqmVar2 = (zzdqm) unwrap;
        if (!zzdqmVar2.zzJ()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
        } else {
            this.zze = zzdqmVar2;
            zzdqmVar2.zzg(this);
            this.zze.zzN(zzdF());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbne
    public final synchronized void zzb() {
        zzdqm zzdqmVar = this.zze;
        if (zzdqmVar != null) {
            zzdqmVar.zzh(this);
            this.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbne
    public final synchronized void zzc(IObjectWrapper iObjectWrapper) {
        if (this.zze != null) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (!(unwrap instanceof View)) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.zze.zzx((View) unwrap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final FrameLayout zzdA() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final View zzdF() {
        return (View) this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final zzbfi zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized void zzg(String str, View view, boolean z) {
        this.zzd.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.zzb.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized Map zzh() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized Map zzi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized Map zzj() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized View zzk(String str) {
        WeakReference weakReference = (WeakReference) this.zzd.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized String zzl() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized IObjectWrapper zzm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized JSONObject zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized JSONObject zzo() {
        zzdqm zzdqmVar = this.zze;
        if (zzdqmVar == null) {
            return null;
        }
        return zzdqmVar.zzw(zzdF(), zzh(), zzi());
    }
}
