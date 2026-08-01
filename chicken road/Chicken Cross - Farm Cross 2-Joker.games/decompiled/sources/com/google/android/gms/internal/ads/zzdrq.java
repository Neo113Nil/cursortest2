package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdrq {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzflw zzc;
    private final zzdqw zzd;
    private final zzdqr zze;
    private final zzdse zzf;
    private final zzdsm zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbmk zzj;
    private final zzdqo zzk;

    public zzdrq(com.google.android.gms.ads.internal.util.zzg zzgVar, zzflw zzflwVar, zzdqw zzdqwVar, zzdqr zzdqrVar, zzdse zzdseVar, zzdsm zzdsmVar, Executor executor, Executor executor2, zzdqo zzdqoVar) {
        this.zzb = zzgVar;
        this.zzc = zzflwVar;
        this.zzj = zzflwVar.zzj;
        this.zzd = zzdqwVar;
        this.zze = zzdqrVar;
        this.zzf = zzdseVar;
        this.zzg = zzdsmVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdqoVar;
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z) {
        View zzJ = z ? this.zze.zzJ() : this.zze.zzK();
        if (zzJ == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzJ.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzJ.getParent()).removeView(zzJ);
        }
        viewGroup.addView(zzJ, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeS)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final void zza(final zzdso zzdsoVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdrq.this.zzf(zzdsoVar);
            }
        });
    }

    public final void zzb(zzdso zzdsoVar) {
        zzdse zzdseVar;
        if (zzdsoVar == null || (zzdseVar = this.zzf) == null || zzdsoVar.zzdA() == null || !this.zzd.zzb()) {
            return;
        }
        try {
            zzdsoVar.zzdA().addView(zzdseVar.zza());
        } catch (zzcmb e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzc(zzdso zzdsoVar) {
        if (zzdsoVar == null) {
            return;
        }
        Context context = zzdsoVar.zzdF().getContext();
        if (com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Activity context is needed for policy validator.");
                return;
            }
            zzdsm zzdsmVar = this.zzg;
            if (zzdsmVar == null || zzdsoVar.zzdA() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(zzdsmVar.zza(zzdsoVar.zzdA(), windowManager), com.google.android.gms.ads.internal.util.zzbs.zzk());
            } catch (zzcmb e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final boolean zzd(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    public final boolean zze(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    final /* synthetic */ void zzf(zzdso zzdsoVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzbms zza2;
        Drawable drawable;
        zzdqw zzdqwVar = this.zzd;
        if (zzdqwVar.zze() || zzdqwVar.zzc()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i = 0; i < 2; i++) {
                View zzk = zzdsoVar.zzk(strArr[i]);
                if (zzk instanceof ViewGroup) {
                    viewGroup = (ViewGroup) zzk;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = zzdsoVar.zzdF().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdqr zzdqrVar = this.zze;
        if (zzdqrVar.zzA() != null) {
            view = zzdqrVar.zzA();
            zzbmk zzbmkVar = this.zzj;
            if (zzbmkVar != null && viewGroup == null) {
                zzh(layoutParams, zzbmkVar.zze);
                view.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdqrVar.zzz() instanceof zzbmd) {
            zzbmd zzbmdVar = (zzbmd) zzdqrVar.zzz();
            if (viewGroup == null) {
                zzh(layoutParams, zzbmdVar.zzh());
                viewGroup = null;
            }
            View zzbmeVar = new zzbme(context, zzbmdVar, layoutParams);
            zzbmeVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeQ));
            view = zzbmeVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdsoVar.zzdF().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzdA = zzdsoVar.zzdA();
                if (zzdA != null) {
                    zzdA.addView(zzaVar);
                }
            }
            zzdsoVar.zzg(zzdsoVar.zzl(), view, true);
        }
        zzgxm zzgxmVar = zzdrm.zza;
        int size = zzgxmVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzk2 = zzdsoVar.zzk((String) zzgxmVar.get(i2));
            i2++;
            if (zzk2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzk2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdro
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdrq.this.zzg(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            if (zzdqrVar.zzT() != null) {
                zzdqrVar.zzT().zzaq(new zzdrn(zzdsoVar, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlG)).booleanValue() && zzi(viewGroup2, false)) {
            if (zzdqrVar.zzU() != null) {
                zzdqrVar.zzU().zzaq(new zzdrn(zzdsoVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View zzdF = zzdsoVar.zzdF();
        Context context2 = zzdF != null ? zzdF.getContext() : null;
        if (context2 == null || (zza2 = this.zzk.zza()) == null) {
            return;
        }
        try {
            IObjectWrapper zzg = zza2.zzg();
            if (zzg == null || (drawable = (Drawable) ObjectWrapper.unwrap(zzg)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            IObjectWrapper zzm = zzdsoVar.zzm();
            if (zzm == null || !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhm)).booleanValue()) {
                imageView.setScaleType(zza);
            } else {
                imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzm));
            }
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get main image drawable");
        }
    }

    final /* synthetic */ void zzg(ViewGroup viewGroup) {
        zzdqr zzdqrVar = this.zze;
        if (zzdqrVar.zzJ() != null) {
            boolean z = viewGroup != null;
            if (zzdqrVar.zzx() == 2 || zzdqrVar.zzx() == 1) {
                this.zzb.zzr(this.zzc.zzg, String.valueOf(zzdqrVar.zzx()), z);
            } else if (zzdqrVar.zzx() == 6) {
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
                String str = this.zzc.zzg;
                zzgVar.zzr(str, "2", z);
                zzgVar.zzr(str, "1", z);
            }
        }
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i) {
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
