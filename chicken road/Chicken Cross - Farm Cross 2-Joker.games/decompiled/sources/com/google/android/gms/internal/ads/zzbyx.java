package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbyx extends zzbyy implements zzbqh {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzclm zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbin zzk;
    private float zzl;
    private int zzm;

    public zzbyx(zzclm zzclmVar, Context context, zzbin zzbinVar) {
        super(zzclmVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzclmVar;
        this.zzi = context;
        this.zzk = zzbinVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObject;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzay.zza();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = com.google.android.gms.ads.internal.util.client.zzf.zzC(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzay.zza();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzC(displayMetrics2, displayMetrics2.heightPixels);
        zzclm zzclmVar = this.zzh;
        Activity zzj = zzclmVar.zzj();
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
        if (zzclmVar.zzN().zzg()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            zzclmVar.measure(0, 0);
        }
        zzl(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbyw zzbywVar = new zzbyw();
        zzbin zzbinVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbywVar.zzb(zzbinVar.zzc(intent));
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbywVar.zza(zzbinVar.zzc(intent2));
        zzbywVar.zzc(zzbinVar.zzb());
        zzbywVar.zzd(zzbinVar.zza());
        zzbywVar.zze(true);
        boolean zzf = zzbywVar.zzf();
        boolean zzg = zzbywVar.zzg();
        boolean zzh = zzbywVar.zzh();
        boolean zzi = zzbywVar.zzi();
        try {
            jSONObject = new JSONObject().put("sms", zzf).put("tel", zzg).put("calendar", zzh).put("storePicture", zzi).put("inlineVideo", zzbywVar.zzj());
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        zzclmVar.zzd("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        zzclmVar.getLocationOnScreen(iArr);
        Context context = this.zzi;
        zzb(com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArr[0]), com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArr[1]));
        if (com.google.android.gms.ads.internal.util.zze.zzm(2)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Dispatching Ready Event.");
        }
        zzh(zzclmVar.zzs().afmaVersion);
    }

    public final void zzb(int i, int i2) {
        int i3;
        Context context = this.zzi;
        int i4 = 0;
        if (context instanceof Activity) {
            com.google.android.gms.ads.internal.zzt.zzc();
            i3 = com.google.android.gms.ads.internal.util.zzs.zzW((Activity) context)[0];
        } else {
            i3 = 0;
        }
        zzclm zzclmVar = this.zzh;
        if (zzclmVar.zzN() == null || !zzclmVar.zzN().zzg()) {
            int width = zzclmVar.getWidth();
            int height = zzclmVar.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaJ)).booleanValue()) {
                if (width == 0) {
                    width = zzclmVar.zzN() != null ? zzclmVar.zzN().zzb : 0;
                }
                if (height == 0) {
                    if (zzclmVar.zzN() != null) {
                        i4 = zzclmVar.zzN().zza;
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
        zzclmVar.zzP().zzP(i, i2);
    }
}
