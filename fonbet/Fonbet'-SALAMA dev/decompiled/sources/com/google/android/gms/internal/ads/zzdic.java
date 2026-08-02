package com.google.android.gms.internal.ads;

import B2.d;
import F2.C0254t;
import I2.J;
import I2.L;
import I2.M;
import J2.j;
import a.AbstractC0603a;
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
import java.util.concurrent.Executor;
import o3.BinderC1507b;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzdic {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final L zzb;
    private final zzfba zzc;
    private final zzdhh zzd;
    private final zzdhc zze;
    private final zzdiq zzf;
    private final zzdiy zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbey zzj;
    private final zzdgz zzk;

    public zzdic(L l7, zzfba zzfbaVar, zzdhh zzdhhVar, zzdhc zzdhcVar, zzdiq zzdiqVar, zzdiy zzdiyVar, Executor executor, Executor executor2, zzdgz zzdgzVar) {
        this.zzb = l7;
        this.zzc = zzfbaVar;
        this.zzj = zzfbaVar.zzi;
        this.zzd = zzdhhVar;
        this.zze = zzdhcVar;
        this.zzf = zzdiqVar;
        this.zzg = zzdiyVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdgzVar;
    }

    public static /* synthetic */ void zza(zzdic zzdicVar, ViewGroup viewGroup) {
        zzdhc zzdhcVar = zzdicVar.zze;
        if (zzdhcVar.zzf() != null) {
            boolean z4 = viewGroup != null;
            if (zzdhcVar.zzc() == 2 || zzdhcVar.zzc() == 1) {
                L l7 = zzdicVar.zzb;
                M m7 = (M) l7;
                m7.e(zzdicVar.zzc.zzf, String.valueOf(zzdhcVar.zzc()), z4);
                return;
            }
            if (zzdhcVar.zzc() == 6) {
                ((M) zzdicVar.zzb).e(zzdicVar.zzc.zzf, "2", z4);
                ((M) zzdicVar.zzb).e(zzdicVar.zzc.zzf, "1", z4);
            }
        }
    }

    public static void zzb(final zzdic zzdicVar, zzdja zzdjaVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzbfg zza2;
        Drawable drawable;
        if (zzdicVar.zzd.zzf() || zzdicVar.zzd.zze()) {
            String[] strArr = {"1098", "3011"};
            for (int i7 = 0; i7 < 2; i7++) {
                View zzg = zzdjaVar.zzg(strArr[i7]);
                if (zzg != null && (zzg instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = zzdjaVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdhc zzdhcVar = zzdicVar.zze;
        if (zzdhcVar.zze() != null) {
            zzbey zzbeyVar = zzdicVar.zzj;
            view = zzdhcVar.zze();
            if (zzbeyVar != null && viewGroup == null) {
                zzh(layoutParams, zzbeyVar.zze);
                view.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdhcVar.zzl() instanceof zzbet) {
            zzbet zzbetVar = (zzbet) zzdhcVar.zzl();
            if (viewGroup == null) {
                zzh(layoutParams, zzbetVar.zzc());
                viewGroup = null;
            }
            View zzbeuVar = new zzbeu(context, zzbetVar, layoutParams);
            zzbeuVar.setContentDescription((CharSequence) C0254t.f2723d.f2726c.zzb(zzbby.zzdY));
            view = zzbeuVar;
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
                d dVar = new d(zzdjaVar.zzf().getContext());
                dVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                dVar.addView(view);
                FrameLayout zzh = zzdjaVar.zzh();
                if (zzh != null) {
                    zzh.addView(dVar);
                }
            }
            zzdjaVar.zzq(zzdjaVar.zzk(), view, true);
        }
        zzfwh zzfwhVar = zzdhy.zza;
        int size = zzfwhVar.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzg2 = zzdjaVar.zzg((String) zzfwhVar.get(i8));
            i8++;
            if (zzg2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzg2;
                break;
            }
        }
        zzdicVar.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhz
            @Override // java.lang.Runnable
            public final void run() {
                zzdic.zza(zzdic.this, viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzdicVar.zzi(viewGroup2, true)) {
            zzdhc zzdhcVar2 = zzdicVar.zze;
            if (zzdhcVar2.zzs() != null) {
                zzdhcVar2.zzs().zzar(new zzdib(zzdjaVar, viewGroup2));
                return;
            }
            return;
        }
        zzbbp zzbbpVar = zzbby.zzjZ;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && zzdicVar.zzi(viewGroup2, false)) {
            zzdhc zzdhcVar3 = zzdicVar.zze;
            if (zzdhcVar3.zzq() != null) {
                zzdhcVar3.zzq().zzar(new zzdib(zzdjaVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View zzf = zzdjaVar.zzf();
        Context context2 = zzf != null ? zzf.getContext() : null;
        if (context2 == null || (zza2 = zzdicVar.zzk.zza()) == null) {
            return;
        }
        try {
            InterfaceC1506a zzi = zza2.zzi();
            if (zzi == null || (drawable = (Drawable) BinderC1507b.t0(zzi)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            InterfaceC1506a zzj = zzdjaVar.zzj();
            if (zzj != null) {
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzgf)).booleanValue()) {
                    imageView.setScaleType((ImageView.ScaleType) BinderC1507b.t0(zzj));
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView);
                }
            }
            imageView.setScaleType(zza);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            int i9 = J.f3546b;
            j.g("Could not get main image drawable");
        }
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i7) {
        if (i7 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i7 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i7 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z4) {
        View zzf = z4 ? this.zze.zzf() : this.zze.zzg();
        if (zzf == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzf.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzf.getParent()).removeView(zzf);
        }
        viewGroup.addView(zzf, ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzea)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final void zzc(zzdja zzdjaVar) {
        if (zzdjaVar == null || this.zzf == null || zzdjaVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdjaVar.zzh().addView(this.zzf.zza());
        } catch (zzcen e7) {
            J.l("web view can not be obtained", e7);
        }
    }

    public final void zzd(zzdja zzdjaVar) {
        if (zzdjaVar == null) {
            return;
        }
        Context context = zzdjaVar.zzf().getContext();
        if (AbstractC0603a.G0(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                int i7 = J.f3546b;
                j.b("Activity context is needed for policy validator.");
            } else {
                if (this.zzg == null || zzdjaVar.zzh() == null) {
                    return;
                }
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.addView(this.zzg.zza(zzdjaVar.zzh(), windowManager), AbstractC0603a.A0());
                } catch (zzcen e7) {
                    J.l("web view can not be obtained", e7);
                }
            }
        }
    }

    public final void zze(final zzdja zzdjaVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdia
            @Override // java.lang.Runnable
            public final void run() {
                zzdic.zzb(zzdic.this, zzdjaVar);
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }
}
