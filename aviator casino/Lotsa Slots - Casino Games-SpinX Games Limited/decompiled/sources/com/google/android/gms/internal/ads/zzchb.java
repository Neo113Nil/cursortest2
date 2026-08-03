package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzchb extends android.widget.FrameLayout implements com.google.android.gms.internal.ads.zzcgs {
    final com.google.android.gms.internal.ads.zzchp zza;
    private final com.google.android.gms.internal.ads.zzchn zzb;
    private final android.widget.FrameLayout zzc;
    private final android.view.View zzd;
    private final com.google.android.gms.internal.ads.zzbjf zze;
    private final long zzf;
    private final com.google.android.gms.internal.ads.zzcgt zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private java.lang.String zzn;
    private java.lang.String[] zzo;
    private android.graphics.Bitmap zzp;
    private final android.widget.ImageView zzq;
    private boolean zzr;

    public zzchb(android.content.Context context, com.google.android.gms.internal.ads.zzchn zzchnVar, int i, boolean z, com.google.android.gms.internal.ads.zzbjf zzbjfVar, com.google.android.gms.internal.ads.zzchm zzchmVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        super(context);
        this.zzb = zzchnVar;
        this.zze = zzbjfVar;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzchnVar.zzk());
        com.google.android.gms.internal.ads.zzcgu zzcguVar = zzchnVar.zzk().zza;
        com.google.android.gms.internal.ads.zzcho zzchoVar = new com.google.android.gms.internal.ads.zzcho(context, zzchnVar.zzs(), zzchnVar.zzm(), zzbjfVar, zzchnVar.zzi());
        com.google.android.gms.internal.ads.zzcgt zzckjVar = i == 3 ? new com.google.android.gms.internal.ads.zzckj(context, zzchoVar) : i == 2 ? new com.google.android.gms.internal.ads.zzcif(context, zzchoVar, zzchnVar, z, com.google.android.gms.internal.ads.zzchf.zza(zzchnVar), zzchmVar, zzdzlVar) : new com.google.android.gms.internal.ads.zzcgr(context, zzchnVar, z, com.google.android.gms.internal.ads.zzchf.zza(zzchnVar), zzchmVar, new com.google.android.gms.internal.ads.zzcho(context, zzchnVar.zzs(), zzchnVar.zzm(), zzbjfVar, zzchnVar.zzi()), zzdzlVar);
        this.zzg = zzckjVar;
        android.view.View view = new android.view.View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzckjVar, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzat)).booleanValue()) {
            frameLayout.addView(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaq)).booleanValue()) {
            zzD();
        }
        this.zzq = new android.widget.ImageView(context);
        this.zzf = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzav)).longValue();
        boolean booleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzas)).booleanValue();
        this.zzk = booleanValue;
        if (zzbjfVar != null) {
            zzbjfVar.zzd("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.zza = new com.google.android.gms.internal.ads.zzchp(this);
        zzckjVar.zzb(this);
    }

    private final boolean zzJ() {
        return this.zzq.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final void zzI(java.lang.String str, java.lang.String... strArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Integer zzl = zzl();
        if (zzl != null) {
            hashMap.put("playerId", zzl.toString());
        }
        hashMap.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, str);
        java.lang.String str2 = null;
        for (java.lang.String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zze("onVideoEvent", hashMap);
    }

    private final void zzL() {
        com.google.android.gms.internal.ads.zzchn zzchnVar = this.zzb;
        if (zzchnVar.zzj() == null || !this.zzi || this.zzj) {
            return;
        }
        zzchnVar.zzj().getWindow().clearFlags(128);
        this.zzi = false;
    }

    public final void finalize() throws java.lang.Throwable {
        try {
            this.zza.zza();
            final com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
            if (zzcgtVar != null) {
                com.google.android.gms.internal.ads.zzhcg zzhcgVar = com.google.android.gms.internal.ads.zzcfr.zzf;
                java.util.Objects.requireNonNull(zzcgtVar);
                zzhcgVar.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcgy
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzcgt.this.zzd();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcha
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzchb.this.zzG(z);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcgs
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zza.zzb();
            z = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzcgx(this, z));
    }

    public final void zzA(int i) {
        com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zzB(i);
    }

    public final void zzB(int i) {
        com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zzC(i);
    }

    public final void zzC(android.view.MotionEvent motionEvent) {
        com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzD() {
        com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        android.widget.TextView textView = new android.widget.TextView(zzcgtVar.getContext());
        android.content.res.Resources zzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        java.lang.String string = zzf == null ? "AdMob - " : zzf.getString(com.google.android.gms.ads.impl.R.string.watermark_label_prefix);
        java.lang.String zza = zzcgtVar.zza();
        java.lang.String.valueOf(string);
        textView.setText(java.lang.String.valueOf(string).concat(zza));
        textView.setTextColor(androidx.core.internal.view.SupportMenu.CATEGORY_MASK);
        textView.setBackgroundColor(androidx.core.view.InputDeviceCompat.SOURCE_ANY);
        android.widget.FrameLayout frameLayout = this.zzc;
        frameLayout.addView(textView, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    public final void zzE() {
        this.zza.zza();
        com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar != null) {
            zzcgtVar.zzd();
        }
        zzL();
    }

    final void zzF() {
        com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        long zzh = zzcgtVar.zzh();
        if (this.zzl == zzh || zzh <= 0) {
            return;
        }
        float f = zzh / 1000.0f;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcB)).booleanValue()) {
            zzI("timeupdate", "time", java.lang.String.valueOf(f), "totalBytes", java.lang.String.valueOf(zzcgtVar.zzo()), "qoeCachedBytes", java.lang.String.valueOf(zzcgtVar.zzn()), "qoeLoadedBytes", java.lang.String.valueOf(zzcgtVar.zzm()), "droppedFrames", java.lang.String.valueOf(zzcgtVar.zzp()), "reportTime", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        } else {
            zzI("timeupdate", "time", java.lang.String.valueOf(f));
        }
        this.zzl = zzh;
    }

    final /* synthetic */ void zzG(boolean z) {
        zzI("windowFocusChanged", "hasWindowFocus", java.lang.String.valueOf(z));
    }

    final /* synthetic */ void zzH() {
        zzI("firstFrameRendered", new java.lang.String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zza() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzcgv(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzb() {
        com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar != null && this.zzm == 0) {
            zzI("canplaythrough", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.String.valueOf(zzcgtVar.zzg() / 1000.0f), "videoWidth", java.lang.String.valueOf(zzcgtVar.zzk()), "videoHeight", java.lang.String.valueOf(zzcgtVar.zzl()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzc() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcD)).booleanValue()) {
            this.zza.zzb();
        }
        com.google.android.gms.internal.ads.zzchn zzchnVar = this.zzb;
        if (zzchnVar.zzj() != null && !this.zzi) {
            boolean z = (zzchnVar.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z;
            if (!z) {
                zzchnVar.zzj().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzd() {
        zzI("pause", new java.lang.String[0]);
        zzL();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zze() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcD)).booleanValue()) {
            this.zza.zza();
        }
        zzI(com.ironsource.X3.i.g0, new java.lang.String[0]);
        zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzf(java.lang.String str, java.lang.String str2) {
        zzI("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzg(java.lang.String str, java.lang.String str2) {
        zzI("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzh() {
        if (this.zzr && this.zzp != null && !zzJ()) {
            android.widget.ImageView imageView = this.zzq;
            imageView.setImageBitmap(this.zzp);
            imageView.invalidate();
            android.widget.FrameLayout frameLayout = this.zzc;
            frameLayout.addView(imageView, new android.widget.FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.internal.ads.zzcgw(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzi() {
        if (this.zzh && zzJ()) {
            this.zzc.removeView(this.zzq);
        }
        com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null || this.zzp == null) {
            return;
        }
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        if (zzcgtVar.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(elapsedRealtime2).length() + 26);
            sb.append("Spinner frame grab took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (elapsedRealtime2 > this.zzf) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            com.google.android.gms.internal.ads.zzbjf zzbjfVar = this.zze;
            if (zzbjfVar != null) {
                zzbjfVar.zzd("spinner_jank", java.lang.Long.toString(elapsedRealtime2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzj(int i, int i2) {
        if (this.zzk) {
            com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzau;
            int max = java.lang.Math.max(i / ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).intValue(), 1);
            int max2 = java.lang.Math.max(i2 / ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).intValue(), 1);
            android.graphics.Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = android.graphics.Bitmap.createBitmap(max, max2, android.graphics.Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzk() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzcgz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzchb.this.zzH();
            }
        });
    }

    public final java.lang.Integer zzl() {
        com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar != null) {
            return zzcgtVar.zzw();
        }
        return null;
    }

    public final void zzm(int i) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzat)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzn(int i, int i2, int i3, int i4) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = java.lang.String.valueOf(i).length();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 25 + java.lang.String.valueOf(i2).length() + 3 + java.lang.String.valueOf(i3).length() + 3 + java.lang.String.valueOf(i4).length());
            sb.append("Set video bounds to x:");
            sb.append(i);
            sb.append(";y:");
            sb.append(i2);
            sb.append(";w:");
            sb.append(i3);
            sb.append(";h:");
            sb.append(i4);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzo(java.lang.String str, java.lang.String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzp(float f, float f2) {
        com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar != null) {
            zzcgtVar.zzj(f, f2);
        }
    }

    public final void zzq(java.lang.Integer num) {
        com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        if (android.text.TextUtils.isEmpty(this.zzn)) {
            zzI("no_src", new java.lang.String[0]);
        } else {
            zzcgtVar.zzx(this.zzn, this.zzo, num);
        }
    }

    public final void zzr() {
        com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zzf();
    }

    public final void zzs() {
        com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zze();
    }

    public final void zzt(int i) {
        com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zzi(i);
    }

    public final void zzu() {
        com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zzb.zza(true);
        zzcgtVar.zzq();
    }

    public final void zzv() {
        com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zzb.zza(false);
        zzcgtVar.zzq();
    }

    public final void zzw(float f) {
        com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zzb.zzb(f);
        zzcgtVar.zzq();
    }

    public final void zzx(int i) {
        com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zzy(i);
    }

    public final void zzy(int i) {
        com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zzz(i);
    }

    public final void zzz(int i) {
        com.google.android.gms.internal.ads.zzcgt zzcgtVar = this.zzg;
        if (zzcgtVar == null) {
            return;
        }
        zzcgtVar.zzA(i);
    }
}
