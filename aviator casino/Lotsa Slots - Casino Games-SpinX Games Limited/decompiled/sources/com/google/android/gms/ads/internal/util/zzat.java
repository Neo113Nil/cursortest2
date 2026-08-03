package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzat {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzecr zzb;
    private java.lang.String zzc;
    private java.lang.String zzd;
    private java.lang.String zze;
    private java.lang.String zzf;
    private int zzg;
    private int zzh;
    private android.graphics.PointF zzi;
    private android.graphics.PointF zzj;
    private android.os.Handler zzk;
    private java.lang.Runnable zzl;

    public zzat(android.content.Context context) {
        this.zzg = 0;
        this.zzl = new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.util.zzas
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.ads.internal.util.zzat.this.zzg();
            }
        };
        this.zza = context;
        this.zzh = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzt.zzs().zza();
        this.zzk = com.google.android.gms.ads.internal.zzt.zzs().zzb();
        this.zzb = com.google.android.gms.ads.internal.zzt.zzo().zzb();
    }

    private final boolean zzs(float f, float f2, float f3, float f4) {
        return java.lang.Math.abs(this.zzi.x - f) < ((float) this.zzh) && java.lang.Math.abs(this.zzi.y - f2) < ((float) this.zzh) && java.lang.Math.abs(this.zzj.x - f3) < ((float) this.zzh) && java.lang.Math.abs(this.zzj.y - f4) < ((float) this.zzh);
    }

    private final void zzt(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int zzu = zzu(arrayList, "None", true);
        final int zzu2 = zzu(arrayList, "Shake", true);
        final int zzu3 = zzu(arrayList, "Flick", true);
        int ordinal = this.zzb.zzf().ordinal();
        final int i = ordinal != 1 ? ordinal != 2 ? zzu : zzu3 : zzu2;
        com.google.android.gms.ads.internal.zzt.zzc();
        android.app.AlertDialog.Builder zzN = com.google.android.gms.ads.internal.util.zzs.zzN(context);
        final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(i);
        zzN.setTitle("Setup gesture");
        zzN.setSingleChoiceItems((java.lang.CharSequence[]) arrayList.toArray(new java.lang.String[0]), i, new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaj
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(android.content.DialogInterface dialogInterface, int i2) {
                atomicInteger.set(i2);
            }
        });
        zzN.setNegativeButton("Dismiss", new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzak
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(android.content.DialogInterface dialogInterface, int i2) {
                com.google.android.gms.ads.internal.util.zzat.this.zzb();
            }
        });
        zzN.setPositiveButton("Save", new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzal
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(android.content.DialogInterface dialogInterface, int i2) {
                com.google.android.gms.ads.internal.util.zzat.this.zzi(atomicInteger, i, zzu2, zzu3, dialogInterface, i2);
            }
        });
        zzN.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzam
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(android.content.DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.util.zzat.this.zzb();
            }
        });
        zzN.create().show();
    }

    private static final int zzu(java.util.List list, java.lang.String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.zzc);
        sb.append(",DebugSignal: ");
        sb.append(this.zzf);
        sb.append(",AFMA Version: ");
        sb.append(this.zze);
        sb.append(",Ad Unit ID: ");
        sb.append(this.zzd);
        sb.append("}");
        return sb.toString();
    }

    public final void zza(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.zzg = 0;
            this.zzi = new android.graphics.PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.zzg;
        if (i == -1) {
            return;
        }
        if (i == 0) {
            if (actionMasked == 5) {
                this.zzg = 5;
                this.zzj = new android.graphics.PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.zzk.postDelayed(this.zzl, ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfR)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i2 = 0; i2 < historySize; i2++) {
                    z |= !zzs(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                }
                if (zzs(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.zzg = -1;
            this.zzk.removeCallbacks(this.zzl);
        }
    }

    public final void zzb() {
        try {
            android.content.Context context = this.zza;
            if (!(context instanceof android.app.Activity)) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Can not create dialog without Activity Context");
                return;
            }
            java.lang.String str = "Creative preview (enabled)";
            if (true == android.text.TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzo().zzi())) {
                str = "Creative preview";
            }
            java.lang.String str2 = true != com.google.android.gms.ads.internal.zzt.zzo().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            java.util.ArrayList arrayList = new java.util.ArrayList();
            final int zzu = zzu(arrayList, "Ad information", true);
            final int zzu2 = zzu(arrayList, str, true);
            final int zzu3 = zzu(arrayList, str2, true);
            boolean booleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkD)).booleanValue();
            final int zzu4 = zzu(arrayList, "Open ad inspector", booleanValue);
            final int zzu5 = zzu(arrayList, "Ad inspector settings", booleanValue);
            com.google.android.gms.ads.internal.zzt.zzc();
            android.app.AlertDialog.Builder zzN = com.google.android.gms.ads.internal.util.zzs.zzN(context);
            zzN.setTitle("Select a debug mode").setItems((java.lang.CharSequence[]) arrayList.toArray(new java.lang.String[0]), new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzad
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(android.content.DialogInterface dialogInterface, int i2) {
                    com.google.android.gms.ads.internal.util.zzat.this.zzh(zzu, zzu2, zzu3, zzu4, zzu5, dialogInterface, i2);
                }
            });
            zzN.create().show();
        } catch (android.view.WindowManager.BadTokenException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("", e);
        }
    }

    public final void zzc(java.lang.String str) {
        this.zzd = str;
    }

    public final void zzd(java.lang.String str) {
        this.zze = str;
    }

    public final void zze(java.lang.String str) {
        this.zzc = str;
    }

    public final void zzf(java.lang.String str) {
        this.zzf = str;
    }

    final /* synthetic */ void zzg() {
        this.zzg = 4;
        zzb();
    }

    final /* synthetic */ void zzh(int i, int i2, int i3, int i4, int i5, android.content.DialogInterface dialogInterface, int i6) {
        if (i6 != i) {
            if (i6 == i2) {
                int i7 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Debug mode [Creative Preview] selected.");
                com.google.android.gms.internal.ads.zzcfr.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.ads.internal.util.zzat.this.zzo();
                    }
                });
                return;
            }
            if (i6 == i3) {
                int i8 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Debug mode [Troubleshooting] selected.");
                com.google.android.gms.internal.ads.zzcfr.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.ads.internal.util.zzat.this.zzp();
                    }
                });
                return;
            }
            if (i6 == i4) {
                com.google.android.gms.internal.ads.zzecr zzecrVar = this.zzb;
                final com.google.android.gms.internal.ads.zzhcg zzhcgVar = com.google.android.gms.internal.ads.zzcfr.zzf;
                com.google.android.gms.internal.ads.zzhcg zzhcgVar2 = com.google.android.gms.internal.ads.zzcfr.zza;
                if (zzecrVar.zzs()) {
                    zzhcgVar.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaq
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.ads.internal.util.zzat.this.zzl();
                        }
                    });
                    return;
                } else {
                    zzhcgVar2.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.util.zzap
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.ads.internal.util.zzat.this.zzk(zzhcgVar);
                        }
                    });
                    return;
                }
            }
            if (i6 == i5) {
                com.google.android.gms.internal.ads.zzecr zzecrVar2 = this.zzb;
                final com.google.android.gms.internal.ads.zzhcg zzhcgVar3 = com.google.android.gms.internal.ads.zzcfr.zzf;
                com.google.android.gms.internal.ads.zzhcg zzhcgVar4 = com.google.android.gms.internal.ads.zzcfr.zza;
                if (zzecrVar2.zzs()) {
                    zzhcgVar3.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.util.zzae
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.ads.internal.util.zzat.this.zzn();
                        }
                    });
                    return;
                } else {
                    zzhcgVar4.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.util.zzar
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.ads.internal.util.zzat.this.zzm(zzhcgVar3);
                        }
                    });
                    return;
                }
            }
            return;
        }
        android.content.Context context = this.zza;
        if (!(context instanceof android.app.Activity)) {
            int i9 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Can not create dialog without Activity Context");
            return;
        }
        java.lang.String str = this.zzc;
        final java.lang.String str2 = "No debug information";
        if (!android.text.TextUtils.isEmpty(str)) {
            android.net.Uri build = new android.net.Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            com.google.android.gms.ads.internal.zzt.zzc();
            java.util.Map zzT = com.google.android.gms.ads.internal.util.zzs.zzT(build);
            for (java.lang.String str3 : zzT.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append((java.lang.String) zzT.get(str3));
                sb.append("\n\n");
            }
            java.lang.String trim = sb.toString().trim();
            if (!android.text.TextUtils.isEmpty(trim)) {
                str2 = trim;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        android.app.AlertDialog.Builder zzN = com.google.android.gms.ads.internal.util.zzs.zzN(context);
        zzN.setMessage(str2);
        zzN.setTitle("Ad Information");
        zzN.setPositiveButton("Share", new android.content.DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzan
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(android.content.DialogInterface dialogInterface2, int i10) {
                com.google.android.gms.ads.internal.util.zzat.this.zzj(str2, dialogInterface2, i10);
            }
        });
        zzN.setNegativeButton("Close", com.google.android.gms.ads.internal.util.zzao.zza);
        zzN.create().show();
    }

    final /* synthetic */ void zzi(java.util.concurrent.atomic.AtomicInteger atomicInteger, int i, int i2, int i3, android.content.DialogInterface dialogInterface, int i4) {
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                this.zzb.zze(com.google.android.gms.internal.ads.zzecn.SHAKE);
            } else if (atomicInteger.get() == i3) {
                this.zzb.zze(com.google.android.gms.internal.ads.zzecn.FLICK);
            } else {
                this.zzb.zze(com.google.android.gms.internal.ads.zzecn.NONE);
            }
        }
        zzb();
    }

    final /* synthetic */ void zzj(java.lang.String str, android.content.DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzY(this.zza, android.content.Intent.createChooser(new android.content.Intent("android.intent.action.SEND").setType(androidx.webkit.internal.AssetHelper.DEFAULT_MIME_TYPE).putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    final /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzhcg zzhcgVar) {
        com.google.android.gms.ads.internal.util.zzax zzo = com.google.android.gms.ads.internal.zzt.zzo();
        android.content.Context context = this.zza;
        if (zzo.zze(context, this.zzd, this.zze)) {
            zzhcgVar.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.util.zzai
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.ads.internal.util.zzat.this.zzr();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzt.zzo().zzf(context, this.zzd, this.zze);
        }
    }

    final /* synthetic */ void zzl() {
        com.google.android.gms.ads.internal.zzt.zzo().zzc(this.zza);
    }

    final /* synthetic */ void zzm(com.google.android.gms.internal.ads.zzhcg zzhcgVar) {
        com.google.android.gms.ads.internal.util.zzax zzo = com.google.android.gms.ads.internal.zzt.zzo();
        android.content.Context context = this.zza;
        if (zzo.zze(context, this.zzd, this.zze)) {
            zzhcgVar.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.internal.util.zzah
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.ads.internal.util.zzat.this.zzq();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzt.zzo().zzf(context, this.zzd, this.zze);
        }
    }

    final /* synthetic */ void zzn() {
        zzt(this.zza);
    }

    final /* synthetic */ void zzo() {
        com.google.android.gms.ads.internal.util.zzax zzo = com.google.android.gms.ads.internal.zzt.zzo();
        android.content.Context context = this.zza;
        java.lang.String str = this.zzd;
        java.lang.String str2 = this.zze;
        if (!zzo.zzd(context, str, str2)) {
            zzo.zzn(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        java.lang.String str3 = zzo.zza;
        if ("2".equals(str3)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Creative is not pushed for this device.");
            zzo.zzn(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(str3)) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("The app is not linked for creative preview.");
            zzo.zzf(context, str, str2);
        } else if ("0".equals(str3)) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Device is linked for in app preview.");
            zzo.zzn(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    final /* synthetic */ void zzp() {
        com.google.android.gms.ads.internal.util.zzax zzo = com.google.android.gms.ads.internal.zzt.zzo();
        java.lang.String str = this.zzd;
        java.lang.String str2 = this.zze;
        java.lang.String str3 = this.zzf;
        boolean zzm = zzo.zzm();
        android.content.Context context = this.zza;
        zzo.zzl(zzo.zze(context, str, str2));
        if (!zzo.zzm()) {
            zzo.zzf(context, str, str2);
            return;
        }
        if (!zzm && !android.text.TextUtils.isEmpty(str3)) {
            zzo.zzh(context, str2, str3, str);
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Device is linked for debug signals.");
        zzo.zzn(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    final /* synthetic */ void zzq() {
        zzt(this.zza);
    }

    final /* synthetic */ void zzr() {
        com.google.android.gms.ads.internal.zzt.zzo().zzc(this.zza);
    }

    public zzat(android.content.Context context, java.lang.String str) {
        this(context);
        this.zzc = str;
    }
}
