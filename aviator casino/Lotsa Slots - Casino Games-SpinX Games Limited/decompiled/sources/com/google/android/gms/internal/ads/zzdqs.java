package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdqs {
    static final android.widget.ImageView.ScaleType zza = android.widget.ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final com.google.android.gms.internal.ads.zzfky zzc;
    private final com.google.android.gms.internal.ads.zzdpy zzd;
    private final com.google.android.gms.internal.ads.zzdpt zze;
    private final com.google.android.gms.internal.ads.zzdrg zzf;
    private final com.google.android.gms.internal.ads.zzdro zzg;
    private final java.util.concurrent.Executor zzh;
    private final java.util.concurrent.Executor zzi;
    private final com.google.android.gms.internal.ads.zzblt zzj;
    private final com.google.android.gms.internal.ads.zzdpq zzk;

    public zzdqs(com.google.android.gms.ads.internal.util.zzg zzgVar, com.google.android.gms.internal.ads.zzfky zzfkyVar, com.google.android.gms.internal.ads.zzdpy zzdpyVar, com.google.android.gms.internal.ads.zzdpt zzdptVar, com.google.android.gms.internal.ads.zzdrg zzdrgVar, com.google.android.gms.internal.ads.zzdro zzdroVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, com.google.android.gms.internal.ads.zzdpq zzdpqVar) {
        this.zzb = zzgVar;
        this.zzc = zzfkyVar;
        this.zzj = zzfkyVar.zzj;
        this.zzd = zzdpyVar;
        this.zze = zzdptVar;
        this.zzf = zzdrgVar;
        this.zzg = zzdroVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdpqVar;
    }

    private final boolean zzi(android.view.ViewGroup viewGroup, boolean z) {
        android.view.View zzJ = z ? this.zze.zzJ() : this.zze.zzK();
        if (zzJ == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzJ.getParent() instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) zzJ.getParent()).removeView(zzJ);
        }
        viewGroup.addView(zzJ, ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeK)).booleanValue() ? new android.widget.FrameLayout.LayoutParams(-1, -1, 17) : new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final void zza(final com.google.android.gms.internal.ads.zzdrq zzdrqVar) {
        this.zzh.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdqr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzdqs.this.zzf(zzdrqVar);
            }
        });
    }

    public final void zzb(com.google.android.gms.internal.ads.zzdrq zzdrqVar) {
        com.google.android.gms.internal.ads.zzdrg zzdrgVar;
        if (zzdrqVar == null || (zzdrgVar = this.zzf) == null || zzdrqVar.zzdA() == null || !this.zzd.zzb()) {
            return;
        }
        try {
            zzdrqVar.zzdA().addView(zzdrgVar.zza());
        } catch (com.google.android.gms.internal.ads.zzclj e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzc(com.google.android.gms.internal.ads.zzdrq zzdrqVar) {
        if (zzdrqVar == null) {
            return;
        }
        android.content.Context context = zzdrqVar.zzdF().getContext();
        if (com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzd.zza)) {
            if (!(context instanceof android.app.Activity)) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Activity context is needed for policy validator.");
                return;
            }
            com.google.android.gms.internal.ads.zzdro zzdroVar = this.zzg;
            if (zzdroVar == null || zzdrqVar.zzdA() == null) {
                return;
            }
            try {
                android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
                windowManager.addView(zzdroVar.zza(zzdrqVar.zzdA(), windowManager), com.google.android.gms.ads.internal.util.zzbs.zzk());
            } catch (com.google.android.gms.internal.ads.zzclj e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final boolean zzd(android.view.ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    public final boolean zze(android.view.ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzdrq zzdrqVar) {
        android.view.ViewGroup viewGroup;
        android.view.View view;
        final android.view.ViewGroup viewGroup2;
        com.google.android.gms.internal.ads.zzbmb zza2;
        android.graphics.drawable.Drawable drawable;
        com.google.android.gms.internal.ads.zzdpy zzdpyVar = this.zzd;
        if (zzdpyVar.zze() || zzdpyVar.zzc()) {
            java.lang.String[] strArr = {com.google.android.gms.ads.formats.NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i = 0; i < 2; i++) {
                android.view.View zzl = zzdrqVar.zzl(strArr[i]);
                if (zzl instanceof android.view.ViewGroup) {
                    viewGroup = (android.view.ViewGroup) zzl;
                    break;
                }
            }
        }
        viewGroup = null;
        android.content.Context context = zzdrqVar.zzdF().getContext();
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        com.google.android.gms.internal.ads.zzdpt zzdptVar = this.zze;
        if (zzdptVar.zzA() != null) {
            view = zzdptVar.zzA();
            com.google.android.gms.internal.ads.zzblt zzbltVar = this.zzj;
            if (zzbltVar != null && viewGroup == null) {
                zzh(layoutParams, zzbltVar.zze);
                view.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdptVar.zzz() instanceof com.google.android.gms.internal.ads.zzblm) {
            com.google.android.gms.internal.ads.zzblm zzblmVar = (com.google.android.gms.internal.ads.zzblm) zzdptVar.zzz();
            if (viewGroup == null) {
                zzh(layoutParams, zzblmVar.zzi());
                viewGroup = null;
            }
            android.view.View zzblnVar = new com.google.android.gms.internal.ads.zzbln(context, zzblmVar, layoutParams);
            zzblnVar.setContentDescription((java.lang.CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzeI));
            view = zzblnVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdrqVar.zzdF().getContext());
                zzaVar.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                android.widget.FrameLayout zzdA = zzdrqVar.zzdA();
                if (zzdA != null) {
                    zzdA.addView(zzaVar);
                }
            }
            zzdrqVar.zzh(zzdrqVar.zzm(), view, true);
        }
        com.google.android.gms.internal.ads.zzgwm zzgwmVar = com.google.android.gms.internal.ads.zzdqo.zza;
        int size = zzgwmVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            android.view.View zzl2 = zzdrqVar.zzl((java.lang.String) zzgwmVar.get(i2));
            i2++;
            if (zzl2 instanceof android.view.ViewGroup) {
                viewGroup2 = (android.view.ViewGroup) zzl2;
                break;
            }
        }
        this.zzi.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdqq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzdqs.this.zzg(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            if (zzdptVar.zzT() != null) {
                zzdptVar.zzT().zzaq(new com.google.android.gms.internal.ads.zzdqp(zzdrqVar, viewGroup2));
                return;
            }
            return;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlv)).booleanValue() && zzi(viewGroup2, false)) {
            if (zzdptVar.zzU() != null) {
                zzdptVar.zzU().zzaq(new com.google.android.gms.internal.ads.zzdqp(zzdrqVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        android.view.View zzdF = zzdrqVar.zzdF();
        android.content.Context context2 = zzdF != null ? zzdF.getContext() : null;
        if (context2 == null || (zza2 = this.zzk.zza()) == null) {
            return;
        }
        try {
            com.google.android.gms.dynamic.IObjectWrapper zzg = zza2.zzg();
            if (zzg == null || (drawable = (android.graphics.drawable.Drawable) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzg)) == null) {
                return;
            }
            android.widget.ImageView imageView = new android.widget.ImageView(context2);
            imageView.setImageDrawable(drawable);
            com.google.android.gms.dynamic.IObjectWrapper zzn = zzdrqVar.zzn();
            if (zzn != null) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhg)).booleanValue()) {
                    imageView.setScaleType((android.widget.ImageView.ScaleType) com.google.android.gms.dynamic.ObjectWrapper.unwrap(zzn));
                    imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView);
                }
            }
            imageView.setScaleType(zza);
            imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (android.os.RemoteException unused) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get main image drawable");
        }
    }

    final /* synthetic */ void zzg(android.view.ViewGroup viewGroup) {
        com.google.android.gms.internal.ads.zzdpt zzdptVar = this.zze;
        if (zzdptVar.zzJ() != null) {
            boolean z = viewGroup != null;
            if (zzdptVar.zzx() == 2 || zzdptVar.zzx() == 1) {
                this.zzb.zzr(this.zzc.zzg, java.lang.String.valueOf(zzdptVar.zzx()), z);
            } else if (zzdptVar.zzx() == 6) {
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
                java.lang.String str = this.zzc.zzg;
                zzgVar.zzr(str, "2", z);
                zzgVar.zzr(str, "1", z);
            }
        }
    }

    private static void zzh(android.widget.RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }
}
