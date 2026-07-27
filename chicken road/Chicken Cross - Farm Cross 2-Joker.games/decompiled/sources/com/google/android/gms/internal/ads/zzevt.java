package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.RoundedCorner;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzevt implements zzfdi {
    private final zzfdi zza;
    private final zzflw zzb;
    private final Context zzc;
    private final zzcfv zzd;

    zzevt(zzexw zzexwVar, zzflw zzflwVar, Context context, zzcfv zzcfvVar) {
        this.zza = zzexwVar;
        this.zzb = zzflwVar;
        this.zzc = context;
        this.zzd = zzcfvVar;
    }

    private static final int zzd(WindowInsets windowInsets, int i) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    private static final int zze(int i, float f) {
        if (f == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i / f);
    }

    private static final Insets zzf(Insets insets, float f) {
        return f == 0.0f ? Insets.NONE : Insets.of((int) Math.ceil(insets.left / f), (int) Math.ceil(insets.top / f), (int) Math.ceil(insets.right / f), (int) Math.ceil(insets.bottom / f));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return zzhcy.zzk(this.zza.zza(), new zzgub() { // from class: com.google.android.gms.internal.ads.zzevs
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ Object apply(Object obj) {
                return zzevt.this.zzc((zzfdr) obj);
            }
        }, zzcgj.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d8, code lost:
    
        if (r8 <= r5) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzevu zzc(zzfdr zzfdrVar) {
        boolean z;
        String str;
        int i;
        int i2;
        int i3;
        float f;
        String str2;
        zzbix zzbixVar;
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr;
        int i4;
        String str3;
        Window window;
        View decorView;
        WindowInsetsCompat rootWindowInsets;
        Insets zzf;
        Insets insets;
        zzevr zzevrVar;
        WindowManager windowManager;
        WindowManager windowManager2;
        WindowManager windowManager3;
        DisplayMetrics displayMetrics;
        int i5;
        WindowManager windowManager4;
        DisplayMetrics displayMetrics2;
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zzb.zzf;
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr2 = zzrVar.zzg;
        if (zzrVarArr2 != null) {
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            str = null;
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr2) {
                boolean z4 = zzrVar2.zzi;
                if (!z4 && !z2) {
                    str = zzrVar2.zza;
                    z2 = true;
                }
                if (z4) {
                    if (z3) {
                        z3 = true;
                    } else {
                        z3 = true;
                        z = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzrVar.zza;
            z = zzrVar.zzi;
        }
        Context context = this.zzc;
        Resources resources = context.getResources();
        Activity zzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
        if (zzd != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpn)).booleanValue()) {
                try {
                    i = context.getPackageManager().getActivityInfo(zzd.getComponentName(), 0).screenOrientation;
                } catch (PackageManager.NameNotFoundException e) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdSizeParcelSignal.Source.readOrientationFromManifest");
                }
                if (resources != null || (displayMetrics2 = resources.getDisplayMetrics()) == null) {
                    i2 = 0;
                    i3 = 0;
                    f = 0.0f;
                    str2 = null;
                } else {
                    zzcfv zzcfvVar = this.zzd;
                    float f2 = displayMetrics2.density;
                    i3 = displayMetrics2.widthPixels;
                    i2 = displayMetrics2.heightPixels;
                    str2 = zzcfvVar.zzp().zzu();
                    f = f2;
                }
                zzbixVar = zzbjg.zzpk;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue() && Build.VERSION.SDK_INT <= 34 && Build.VERSION.SDK_INT >= 28 && (windowManager4 = (WindowManager) this.zzc.getSystemService("window")) != null) {
                    if (Build.VERSION.SDK_INT < 30) {
                        WindowMetrics currentWindowMetrics = windowManager4.getCurrentWindowMetrics();
                        i3 = currentWindowMetrics.getBounds().width();
                        i2 = currentWindowMetrics.getBounds().height();
                    } else {
                        Point point = new Point();
                        windowManager4.getDefaultDisplay().getRealSize(point);
                        i3 = point.x;
                        i2 = point.y;
                    }
                }
                int i6 = i2;
                StringBuilder sb = new StringBuilder();
                zzrVarArr = zzrVar.zzg;
                if (zzrVarArr != null) {
                    int i7 = 0;
                    boolean z5 = false;
                    while (i7 < zzrVarArr.length) {
                        com.google.android.gms.ads.internal.client.zzr zzrVar3 = zzrVarArr[i7];
                        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr3 = zzrVarArr;
                        if (zzrVar3.zzi) {
                            z5 = true;
                        } else {
                            if (sb.length() != 0) {
                                sb.append("|");
                            }
                            int i8 = zzrVar3.zze;
                            if (i8 == -1) {
                                i8 = f != 0.0f ? (int) (zzrVar3.zzf / f) : -1;
                            }
                            sb.append(i8);
                            sb.append("x");
                            int i9 = zzrVar3.zzb;
                            if (i9 == -2) {
                                i9 = f != 0.0f ? (int) (zzrVar3.zzc / f) : -2;
                            }
                            sb.append(i9);
                        }
                        i7++;
                        zzrVarArr = zzrVarArr3;
                    }
                    if (z5) {
                        if (sb.length() != 0) {
                            i5 = 0;
                            sb.insert(0, "|");
                        } else {
                            i5 = 0;
                        }
                        sb.insert(i5, "320x50");
                    }
                }
                String sb2 = sb.toString();
                zzflw zzflwVar = this.zzb;
                if (Build.VERSION.SDK_INT < 35) {
                    zzbix zzbixVar2 = zzbjg.zzpe;
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar2)).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpf)).booleanValue()) {
                            i4 = i;
                            str3 = str2;
                            insets = null;
                        }
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpi)).booleanValue()) {
                        Context context2 = this.zzc;
                        WindowManager windowManager5 = (WindowManager) context2.getSystemService("window");
                        if (windowManager5 != null) {
                            i4 = i;
                            if (Build.VERSION.SDK_INT >= 30) {
                                WindowMetrics currentWindowMetrics2 = windowManager5.getCurrentWindowMetrics();
                                int width = currentWindowMetrics2.getBounds().width();
                                int height = currentWindowMetrics2.getBounds().height();
                                Resources resources2 = context2.getResources();
                                if (resources2 != null && (displayMetrics = resources2.getDisplayMetrics()) != null) {
                                    int i10 = displayMetrics.widthPixels;
                                    int i11 = displayMetrics.heightPixels;
                                    if (width <= i10) {
                                    }
                                    str3 = str2;
                                    insets = null;
                                }
                            }
                            Context context3 = this.zzc;
                            Insets insets2 = Insets.NONE;
                            windowManager2 = (WindowManager) context3.getSystemService("window");
                            if (windowManager2 != null) {
                                WindowInsets windowInsets = windowManager2.getCurrentWindowMetrics().getWindowInsets();
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar2)).booleanValue()) {
                                    insets2 = Insets.toCompatInsets(windowInsets.getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar()));
                                } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpf)).booleanValue()) {
                                    insets2 = Insets.toCompatInsets(windowInsets.getInsets(WindowInsets.Type.displayCutout()));
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpg)).booleanValue() && (windowManager3 = (WindowManager) context3.getSystemService("window")) != null) {
                                        WindowInsets windowInsets2 = windowManager3.getCurrentWindowMetrics().getWindowInsets();
                                        int zzd2 = zzd(windowInsets2, 0);
                                        int zzd3 = zzd(windowInsets2, 1);
                                        str3 = str2;
                                        int zzd4 = zzd(windowInsets2, 3);
                                        int zzd5 = zzd(windowInsets2, 2);
                                        insets2 = i6 >= i3 ? Insets.of(insets2.left, Math.max(insets2.top, Math.max(zzd2, zzd3)), insets2.right, Math.max(insets2.bottom, Math.max(zzd4, zzd5))) : Insets.of(Math.max(insets2.left, Math.max(zzd2, zzd4)), insets2.top, Math.max(insets2.right, Math.max(zzd3, zzd5)), insets2.bottom);
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzph)).booleanValue() && i6 < i3) {
                                            int max = Math.max(insets2.left, insets2.right);
                                            insets2 = Insets.of(max, insets2.top, max, insets2.bottom);
                                        }
                                        zzf = zzf(insets2, f);
                                        insets = zzf;
                                    }
                                }
                            }
                            str3 = str2;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzph)).booleanValue()) {
                                int max2 = Math.max(insets2.left, insets2.right);
                                insets2 = Insets.of(max2, insets2.top, max2, insets2.bottom);
                            }
                            zzf = zzf(insets2, f);
                            insets = zzf;
                        }
                    }
                    i4 = i;
                    Context context32 = this.zzc;
                    Insets insets22 = Insets.NONE;
                    windowManager2 = (WindowManager) context32.getSystemService("window");
                    if (windowManager2 != null) {
                    }
                    str3 = str2;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzph)).booleanValue()) {
                    }
                    zzf = zzf(insets22, f);
                    insets = zzf;
                } else {
                    i4 = i;
                    str3 = str2;
                    if (Build.VERSION.SDK_INT <= 34 && Build.VERSION.SDK_INT >= 28 && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
                        Insets insets3 = Insets.NONE;
                        if (Build.VERSION.SDK_INT >= 30) {
                            WindowManager windowManager6 = (WindowManager) this.zzc.getSystemService("window");
                            if (windowManager6 != null) {
                                insets3 = Insets.toCompatInsets(windowManager6.getCurrentWindowMetrics().getWindowInsets().getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar()));
                            }
                        } else {
                            Activity zzd6 = com.google.android.gms.ads.internal.zzt.zzg().zzd();
                            if (zzd6 != null && (window = zzd6.getWindow()) != null && (decorView = window.getDecorView()) != null && (rootWindowInsets = ViewCompat.getRootWindowInsets(decorView)) != null) {
                                insets3 = rootWindowInsets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
                            }
                        }
                        zzf = zzf(insets3, f);
                        insets = zzf;
                    }
                    insets = null;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpj)).booleanValue() || Build.VERSION.SDK_INT < 31 || f == 0.0f || (windowManager = (WindowManager) this.zzc.getSystemService("window")) == null) {
                    zzevrVar = null;
                } else {
                    WindowInsets windowInsets3 = windowManager.getCurrentWindowMetrics().getWindowInsets();
                    zzevrVar = new zzevr(zze(zzd(windowInsets3, 0), f), zze(zzd(windowInsets3, 1), f), zze(zzd(windowInsets3, 3), f), zze(zzd(windowInsets3, 2), f));
                }
                return new zzevu(zzrVar, str, z, sb2, f, i3, i6, str3, i4, zzflwVar.zzr, insets, zzevrVar);
            }
        }
        i = -1;
        if (resources != null) {
        }
        i2 = 0;
        i3 = 0;
        f = 0.0f;
        str2 = null;
        zzbixVar = zzbjg.zzpk;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
            if (Build.VERSION.SDK_INT < 30) {
            }
        }
        int i62 = i2;
        StringBuilder sb3 = new StringBuilder();
        zzrVarArr = zzrVar.zzg;
        if (zzrVarArr != null) {
        }
        String sb22 = sb3.toString();
        zzflw zzflwVar2 = this.zzb;
        if (Build.VERSION.SDK_INT < 35) {
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpj)).booleanValue()) {
        }
        zzevrVar = null;
        return new zzevu(zzrVar, str, z, sb22, f, i3, i62, str3, i4, zzflwVar2.zzr, insets, zzevrVar);
    }
}
