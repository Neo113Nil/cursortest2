package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzemq implements zzeuc {
    private final zzeuc zza;
    private final zzfcw zzb;
    private final Context zzc;
    private final zzbzs zzd;

    zzemq(zzeou zzeouVar, zzfcw zzfcwVar, Context context, zzbzs zzbzsVar) {
        this.zza = zzeouVar;
        this.zzb = zzfcwVar;
        this.zzc = context;
        this.zzd = zzbzsVar;
    }

    public static /* synthetic */ zzemr zzc(zzemq zzemqVar, zzeul zzeulVar) {
        String str;
        boolean z;
        String str2;
        float f;
        int i;
        int i2;
        float f2;
        int i3;
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int statusBars;
        int displayCutout;
        int navigationBars;
        int captionBar;
        Insets insets;
        int i4;
        int i5;
        int i6;
        int i7;
        DisplayMetrics displayMetrics;
        zzfcw zzfcwVar = zzemqVar.zzb;
        com.google.android.gms.ads.internal.client.zzr zzrVar = zzfcwVar.zze;
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr != null) {
            str = null;
            z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                boolean z4 = zzrVar2.zzi;
                if (!z4 && !z2) {
                    str = zzrVar2.zza;
                    z2 = true;
                }
                if (z4) {
                    if (!z3) {
                        z = true;
                    }
                    z3 = true;
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzrVar.zza;
            z = zzrVar.zzi;
        }
        Context context = zzemqVar.zzc;
        Resources resources = context.getResources();
        Insets insets2 = Build.VERSION.SDK_INT >= 29 ? Insets.NONE : null;
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i = 0;
            i2 = 0;
        } else {
            zzbzs zzbzsVar = zzemqVar.zzd;
            f = displayMetrics.density;
            i2 = displayMetrics.widthPixels;
            int i8 = displayMetrics.heightPixels;
            str2 = zzbzsVar.zzi().zzj();
            i = i8;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zznH)).booleanValue() || Build.VERSION.SDK_INT < 35) {
            f2 = 0.0f;
            i3 = i2;
        } else {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null || f == 0.0f) {
                f2 = 0.0f;
                i3 = i2;
                insets2 = Insets.NONE;
            } else {
                currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                windowInsets = currentWindowMetrics.getWindowInsets();
                statusBars = WindowInsets.Type.statusBars();
                displayCutout = WindowInsets.Type.displayCutout();
                int i9 = statusBars | displayCutout;
                navigationBars = WindowInsets.Type.navigationBars();
                int i10 = i9 | navigationBars;
                captionBar = WindowInsets.Type.captionBar();
                insets = windowInsets.getInsets(i10 | captionBar);
                i4 = insets.left;
                int ceil = (int) Math.ceil(i4 / f);
                i5 = insets.top;
                int ceil2 = (int) Math.ceil(i5 / f);
                i6 = insets.right;
                f2 = 0.0f;
                i3 = i2;
                int ceil3 = (int) Math.ceil(i6 / f);
                i7 = insets.bottom;
                insets2 = Insets.of(ceil, ceil2, ceil3, (int) Math.ceil(i7 / f));
            }
        }
        Insets insets3 = insets2;
        StringBuilder sb = new StringBuilder();
        if (zzrVarArr != null) {
            boolean z5 = false;
            for (com.google.android.gms.ads.internal.client.zzr zzrVar3 : zzrVarArr) {
                if (zzrVar3.zzi) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i11 = zzrVar3.zze;
                    if (i11 == -1) {
                        i11 = f != f2 ? (int) (zzrVar3.zzf / f) : -1;
                    }
                    sb.append(i11);
                    sb.append("x");
                    int i12 = zzrVar3.zzb;
                    if (i12 == -2) {
                        i12 = f != f2 ? (int) (zzrVar3.zzc / f) : -2;
                    }
                    sb.append(i12);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    sb.insert(0, "|");
                }
                sb.insert(0, "320x50");
            }
        }
        return new zzemr(zzrVar, str, z, sb.toString(), f, i3, i, str2, zzfcwVar.zzq, insets3);
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final ListenableFuture zzb() {
        return zzgdn.zzm(this.zza.zzb(), new zzfve() { // from class: com.google.android.gms.internal.ads.zzemp
            @Override // com.google.android.gms.internal.ads.zzfve
            public final Object apply(Object obj) {
                return zzemq.zzc(zzemq.this, (zzeul) obj);
            }
        }, zzcaf.zzg);
    }
}
