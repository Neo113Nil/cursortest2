package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeuv implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzfck zza;
    private final com.google.android.gms.internal.ads.zzfky zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzcfd zzd;

    zzeuv(com.google.android.gms.internal.ads.zzewy zzewyVar, com.google.android.gms.internal.ads.zzfky zzfkyVar, android.content.Context context, com.google.android.gms.internal.ads.zzcfd zzcfdVar) {
        this.zza = zzewyVar;
        this.zzb = zzfkyVar;
        this.zzc = context;
        this.zzd = zzcfdVar;
    }

    private static final int zzd(android.view.WindowInsets windowInsets, int i) {
        android.view.RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }

    private static final int zze(int i, float f) {
        if (f == 0.0f) {
            return 0;
        }
        return (int) java.lang.Math.ceil(i / f);
    }

    private static final androidx.core.graphics.Insets zzf(androidx.core.graphics.Insets insets, float f) {
        return f == 0.0f ? androidx.core.graphics.Insets.NONE : androidx.core.graphics.Insets.of((int) java.lang.Math.ceil(insets.left / f), (int) java.lang.Math.ceil(insets.top / f), (int) java.lang.Math.ceil(insets.right / f), (int) java.lang.Math.ceil(insets.bottom / f));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return com.google.android.gms.internal.ads.zzhbw.zzk(this.zza.zza(), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzeuu
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzeuv.this.zzc((com.google.android.gms.internal.ads.zzfct) obj);
            }
        }, com.google.android.gms.internal.ads.zzcfr.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
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
    final /* synthetic */ com.google.android.gms.internal.ads.zzeuw zzc(com.google.android.gms.internal.ads.zzfct zzfctVar) {
        java.lang.String str;
        boolean z;
        int i;
        int i2;
        float f;
        java.lang.String str2;
        int i3;
        com.google.android.gms.internal.ads.zzbih zzbihVar;
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr;
        int i4;
        java.lang.String str3;
        android.view.Window window;
        android.view.View decorView;
        androidx.core.view.WindowInsetsCompat rootWindowInsets;
        androidx.core.graphics.Insets zzf;
        androidx.core.graphics.Insets insets;
        com.google.android.gms.internal.ads.zzeut zzeutVar;
        android.view.WindowManager windowManager;
        android.view.WindowManager windowManager2;
        android.view.WindowManager windowManager3;
        android.util.DisplayMetrics displayMetrics;
        int i5;
        android.view.WindowManager windowManager4;
        android.util.DisplayMetrics displayMetrics2;
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zzb.zzf;
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr2 = zzrVar.zzg;
        if (zzrVarArr2 != null) {
            boolean z2 = false;
            boolean z3 = false;
            str = null;
            z = false;
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
        android.content.Context context = this.zzc;
        android.content.res.Resources resources = context.getResources();
        android.app.Activity zzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
        if (zzd != null) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoW)).booleanValue()) {
                try {
                    i = context.getPackageManager().getActivityInfo(zzd.getComponentName(), 0).screenOrientation;
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdSizeParcelSignal.Source.readOrientationFromManifest");
                }
                if (resources != null || (displayMetrics2 = resources.getDisplayMetrics()) == null) {
                    i2 = 0;
                    f = 0.0f;
                    str2 = null;
                    i3 = 0;
                } else {
                    com.google.android.gms.internal.ads.zzcfd zzcfdVar = this.zzd;
                    float f2 = displayMetrics2.density;
                    i3 = displayMetrics2.widthPixels;
                    i2 = displayMetrics2.heightPixels;
                    str2 = zzcfdVar.zzo().zzu();
                    f = f2;
                }
                zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzoT;
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue() && android.os.Build.VERSION.SDK_INT <= 34 && android.os.Build.VERSION.SDK_INT >= 28 && (windowManager4 = (android.view.WindowManager) this.zzc.getSystemService("window")) != null) {
                    if (android.os.Build.VERSION.SDK_INT < 30) {
                        android.view.WindowMetrics currentWindowMetrics = windowManager4.getCurrentWindowMetrics();
                        i3 = currentWindowMetrics.getBounds().width();
                        i2 = currentWindowMetrics.getBounds().height();
                    } else {
                        android.graphics.Point point = new android.graphics.Point();
                        windowManager4.getDefaultDisplay().getRealSize(point);
                        i3 = point.x;
                        i2 = point.y;
                    }
                }
                int i6 = i2;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
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
                java.lang.String sb2 = sb.toString();
                com.google.android.gms.internal.ads.zzfky zzfkyVar = this.zzb;
                if (android.os.Build.VERSION.SDK_INT < 35) {
                    com.google.android.gms.internal.ads.zzbih zzbihVar2 = com.google.android.gms.internal.ads.zzbiq.zzoN;
                    if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar2)).booleanValue()) {
                        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoO)).booleanValue()) {
                            i4 = i;
                            str3 = str2;
                            insets = null;
                        }
                    }
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoR)).booleanValue()) {
                        android.content.Context context2 = this.zzc;
                        android.view.WindowManager windowManager5 = (android.view.WindowManager) context2.getSystemService("window");
                        if (windowManager5 != null) {
                            i4 = i;
                            if (android.os.Build.VERSION.SDK_INT >= 30) {
                                android.view.WindowMetrics currentWindowMetrics2 = windowManager5.getCurrentWindowMetrics();
                                int width = currentWindowMetrics2.getBounds().width();
                                int height = currentWindowMetrics2.getBounds().height();
                                android.content.res.Resources resources2 = context2.getResources();
                                if (resources2 != null && (displayMetrics = resources2.getDisplayMetrics()) != null) {
                                    int i10 = displayMetrics.widthPixels;
                                    int i11 = displayMetrics.heightPixels;
                                    if (width <= i10) {
                                    }
                                    str3 = str2;
                                    insets = null;
                                }
                            }
                            android.content.Context context3 = this.zzc;
                            androidx.core.graphics.Insets insets2 = androidx.core.graphics.Insets.NONE;
                            windowManager2 = (android.view.WindowManager) context3.getSystemService("window");
                            if (windowManager2 != null) {
                                android.view.WindowInsets windowInsets = windowManager2.getCurrentWindowMetrics().getWindowInsets();
                                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar2)).booleanValue()) {
                                    insets2 = androidx.core.graphics.Insets.toCompatInsets(windowInsets.getInsets(android.view.WindowInsets.Type.statusBars() | android.view.WindowInsets.Type.displayCutout() | android.view.WindowInsets.Type.navigationBars() | android.view.WindowInsets.Type.captionBar()));
                                } else if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoO)).booleanValue()) {
                                    insets2 = androidx.core.graphics.Insets.toCompatInsets(windowInsets.getInsets(android.view.WindowInsets.Type.displayCutout()));
                                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoP)).booleanValue() && (windowManager3 = (android.view.WindowManager) context3.getSystemService("window")) != null) {
                                        android.view.WindowInsets windowInsets2 = windowManager3.getCurrentWindowMetrics().getWindowInsets();
                                        int zzd2 = zzd(windowInsets2, 0);
                                        int zzd3 = zzd(windowInsets2, 1);
                                        str3 = str2;
                                        int zzd4 = zzd(windowInsets2, 3);
                                        int zzd5 = zzd(windowInsets2, 2);
                                        insets2 = i6 >= i3 ? androidx.core.graphics.Insets.of(insets2.left, java.lang.Math.max(insets2.top, java.lang.Math.max(zzd2, zzd3)), insets2.right, java.lang.Math.max(insets2.bottom, java.lang.Math.max(zzd4, zzd5))) : androidx.core.graphics.Insets.of(java.lang.Math.max(insets2.left, java.lang.Math.max(zzd2, zzd4)), insets2.top, java.lang.Math.max(insets2.right, java.lang.Math.max(zzd3, zzd5)), insets2.bottom);
                                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoQ)).booleanValue() && i6 < i3) {
                                            int max = java.lang.Math.max(insets2.left, insets2.right);
                                            insets2 = androidx.core.graphics.Insets.of(max, insets2.top, max, insets2.bottom);
                                        }
                                        zzf = zzf(insets2, f);
                                        insets = zzf;
                                    }
                                }
                            }
                            str3 = str2;
                            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoQ)).booleanValue()) {
                                int max2 = java.lang.Math.max(insets2.left, insets2.right);
                                insets2 = androidx.core.graphics.Insets.of(max2, insets2.top, max2, insets2.bottom);
                            }
                            zzf = zzf(insets2, f);
                            insets = zzf;
                        }
                    }
                    i4 = i;
                    android.content.Context context32 = this.zzc;
                    androidx.core.graphics.Insets insets22 = androidx.core.graphics.Insets.NONE;
                    windowManager2 = (android.view.WindowManager) context32.getSystemService("window");
                    if (windowManager2 != null) {
                    }
                    str3 = str2;
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoQ)).booleanValue()) {
                    }
                    zzf = zzf(insets22, f);
                    insets = zzf;
                } else {
                    i4 = i;
                    str3 = str2;
                    if (android.os.Build.VERSION.SDK_INT <= 34 && android.os.Build.VERSION.SDK_INT >= 28 && ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
                        androidx.core.graphics.Insets insets3 = androidx.core.graphics.Insets.NONE;
                        if (android.os.Build.VERSION.SDK_INT >= 30) {
                            android.view.WindowManager windowManager6 = (android.view.WindowManager) this.zzc.getSystemService("window");
                            if (windowManager6 != null) {
                                insets3 = androidx.core.graphics.Insets.toCompatInsets(windowManager6.getCurrentWindowMetrics().getWindowInsets().getInsets(android.view.WindowInsets.Type.statusBars() | android.view.WindowInsets.Type.displayCutout() | android.view.WindowInsets.Type.navigationBars() | android.view.WindowInsets.Type.captionBar()));
                            }
                        } else {
                            android.app.Activity zzd6 = com.google.android.gms.ads.internal.zzt.zzg().zzd();
                            if (zzd6 != null && (window = zzd6.getWindow()) != null && (decorView = window.getDecorView()) != null && (rootWindowInsets = androidx.core.view.ViewCompat.getRootWindowInsets(decorView)) != null) {
                                insets3 = rootWindowInsets.getInsets(androidx.core.view.WindowInsetsCompat.Type.systemBars() | androidx.core.view.WindowInsetsCompat.Type.displayCutout());
                            }
                        }
                        zzf = zzf(insets3, f);
                        insets = zzf;
                    }
                    insets = null;
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoS)).booleanValue() || android.os.Build.VERSION.SDK_INT < 31 || f == 0.0f || (windowManager = (android.view.WindowManager) this.zzc.getSystemService("window")) == null) {
                    zzeutVar = null;
                } else {
                    android.view.WindowInsets windowInsets3 = windowManager.getCurrentWindowMetrics().getWindowInsets();
                    zzeutVar = new com.google.android.gms.internal.ads.zzeut(zze(zzd(windowInsets3, 0), f), zze(zzd(windowInsets3, 1), f), zze(zzd(windowInsets3, 3), f), zze(zzd(windowInsets3, 2), f));
                }
                return new com.google.android.gms.internal.ads.zzeuw(zzrVar, str, z, sb2, f, i3, i6, str3, i4, zzfkyVar.zzr, insets, zzeutVar);
            }
        }
        i = -1;
        if (resources != null) {
        }
        i2 = 0;
        f = 0.0f;
        str2 = null;
        i3 = 0;
        zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzoT;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue()) {
            if (android.os.Build.VERSION.SDK_INT < 30) {
            }
        }
        int i62 = i2;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        zzrVarArr = zzrVar.zzg;
        if (zzrVarArr != null) {
        }
        java.lang.String sb22 = sb3.toString();
        com.google.android.gms.internal.ads.zzfky zzfkyVar2 = this.zzb;
        if (android.os.Build.VERSION.SDK_INT < 35) {
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoS)).booleanValue()) {
        }
        zzeutVar = null;
        return new com.google.android.gms.internal.ads.zzeuw(zzrVar, str, z, sb22, f, i3, i62, str3, i4, zzfkyVar2.zzr, insets, zzeutVar);
    }
}
