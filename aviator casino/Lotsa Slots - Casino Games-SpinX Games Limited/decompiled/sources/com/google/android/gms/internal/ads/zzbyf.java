package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbyf extends com.google.android.gms.internal.ads.zzbyg implements com.google.android.gms.internal.ads.zzbpq {
    android.util.DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final com.google.android.gms.internal.ads.zzcku zzh;
    private final android.content.Context zzi;
    private final android.view.WindowManager zzj;
    private final com.google.android.gms.internal.ads.zzbhx zzk;
    private float zzl;
    private int zzm;

    public zzbyf(com.google.android.gms.internal.ads.zzcku zzckuVar, android.content.Context context, com.google.android.gms.internal.ads.zzbhx zzbhxVar) {
        super(zzckuVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzckuVar;
        this.zzi = context;
        this.zzk = zzbhxVar;
        this.zzj = (android.view.WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* synthetic */ void zza(java.lang.Object obj, java.util.Map map) {
        org.json.JSONObject jSONObject;
        this.zza = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzay.zza();
        android.util.DisplayMetrics displayMetrics = this.zza;
        this.zzb = com.google.android.gms.ads.internal.util.client.zzf.zzC(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzay.zza();
        android.util.DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzC(displayMetrics2, displayMetrics2.heightPixels);
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zzh;
        android.app.Activity zzj = zzckuVar.zzj();
        if (zzj == null || zzj.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            com.google.android.gms.ads.internal.zzt.zzc();
            int[] zzV = com.google.android.gms.ads.internal.util.zzs.zzV(zzj);
            com.google.android.gms.ads.internal.client.zzay.zza();
            this.zzd = com.google.android.gms.ads.internal.util.client.zzf.zzC(this.zza, zzV[0]);
            com.google.android.gms.ads.internal.client.zzay.zza();
            this.zze = com.google.android.gms.ads.internal.util.client.zzf.zzC(this.zza, zzV[1]);
        }
        if (zzckuVar.zzN().zzg()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            zzckuVar.measure(0, 0);
        }
        zzl(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        com.google.android.gms.internal.ads.zzbye zzbyeVar = new com.google.android.gms.internal.ads.zzbye();
        com.google.android.gms.internal.ads.zzbhx zzbhxVar = this.zzk;
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.setData(android.net.Uri.parse("tel:"));
        zzbyeVar.zzb(zzbhxVar.zzc(intent));
        android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW");
        intent2.setData(android.net.Uri.parse("sms:"));
        zzbyeVar.zza(zzbhxVar.zzc(intent2));
        zzbyeVar.zzc(zzbhxVar.zzb());
        zzbyeVar.zzd(zzbhxVar.zza());
        zzbyeVar.zze(true);
        boolean zzf = zzbyeVar.zzf();
        boolean zzg = zzbyeVar.zzg();
        boolean zzh = zzbyeVar.zzh();
        boolean zzi = zzbyeVar.zzi();
        try {
            jSONObject = new org.json.JSONObject().put("sms", zzf).put("tel", zzg).put("calendar", zzh).put("storePicture", zzi).put("inlineVideo", zzbyeVar.zzj());
        } catch (org.json.JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        zzckuVar.zzd("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        zzckuVar.getLocationOnScreen(iArr);
        android.content.Context context = this.zzi;
        zzb(com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArr[0]), com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArr[1]));
        if (com.google.android.gms.ads.internal.util.zze.zzm(2)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Dispatching Ready Event.");
        }
        zzh(zzckuVar.zzs().afmaVersion);
    }

    public final void zzb(int i, int i2) {
        int i3;
        android.content.Context context = this.zzi;
        int i4 = 0;
        if (context instanceof android.app.Activity) {
            com.google.android.gms.ads.internal.zzt.zzc();
            i3 = com.google.android.gms.ads.internal.util.zzs.zzW((android.app.Activity) context)[0];
        } else {
            i3 = 0;
        }
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zzh;
        if (zzckuVar.zzN() == null || !zzckuVar.zzN().zzg()) {
            int width = zzckuVar.getWidth();
            int height = zzckuVar.getHeight();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzaE)).booleanValue()) {
                if (width == 0) {
                    width = zzckuVar.zzN() != null ? zzckuVar.zzN().zzb : 0;
                }
                if (height == 0) {
                    if (zzckuVar.zzN() != null) {
                        i4 = zzckuVar.zzN().zza;
                    }
                    this.zzf = com.google.android.gms.ads.internal.client.zzay.zza().zza(context, width);
                    this.zzg = com.google.android.gms.ads.internal.client.zzay.zza().zza(context, i4);
                }
            }
            i4 = height;
            this.zzf = com.google.android.gms.ads.internal.client.zzay.zza().zza(context, width);
            this.zzg = com.google.android.gms.ads.internal.client.zzay.zza().zza(context, i4);
        }
        zzj(i, i2 - i3, this.zzf, this.zzg);
        zzckuVar.zzP().zzP(i, i2);
    }
}
