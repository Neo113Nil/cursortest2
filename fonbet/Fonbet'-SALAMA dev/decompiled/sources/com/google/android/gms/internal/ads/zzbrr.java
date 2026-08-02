package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0252s;
import F2.C0254t;
import I2.J;
import I2.P;
import J2.d;
import J2.j;
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

/* loaded from: classes.dex */
public final class zzbrr extends zzbrs implements zzbiz {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzceb zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbbg zzk;
    private float zzl;
    private int zzm;

    public zzbrr(zzceb zzcebVar, Context context, zzbbg zzbbgVar) {
        super(zzcebVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcebVar;
        this.zzi = context;
        this.zzk = zzbbgVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        boolean z4;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        JSONObject jSONObject;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        d dVar = C0252s.f2717f.f2718a;
        this.zzb = Math.round(r9.widthPixels / this.zza.density);
        this.zzc = Math.round(r9.heightPixels / this.zza.density);
        Activity zzi = this.zzh.zzi();
        if (zzi == null || zzi.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            P p5 = o.f1952C.f1957c;
            int[] m7 = P.m(zzi);
            this.zzd = Math.round(m7[0] / this.zza.density);
            this.zze = Math.round(m7[1] / this.zza.density);
        }
        if (this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzj(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbrq zzbrqVar = new zzbrq();
        zzbbg zzbbgVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbrqVar.zze(zzbbgVar.zza(intent));
        zzbbg zzbbgVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbrqVar.zzc(zzbbgVar2.zza(intent2));
        zzbrqVar.zza(this.zzk.zzb());
        zzbrqVar.zzd(this.zzk.zzc());
        zzbrqVar.zzb(true);
        z4 = zzbrqVar.zza;
        z7 = zzbrqVar.zzb;
        z8 = zzbrqVar.zzc;
        z9 = zzbrqVar.zzd;
        z10 = zzbrqVar.zze;
        zzceb zzcebVar = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", z4).put("tel", z7).put("calendar", z8).put("storePicture", z9).put("inlineVideo", z10);
        } catch (JSONException e7) {
            int i7 = J.f3546b;
            j.e("Error occurred while obtaining the MRAID capabilities.", e7);
            jSONObject = null;
        }
        zzcebVar.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        Context context = this.zzi;
        C0252s c0252s = C0252s.f2717f;
        zzb(c0252s.f2718a.g(iArr[0], context), c0252s.f2718a.g(iArr[1], this.zzi));
        if (j.j(2)) {
            j.f("Dispatching Ready Event.");
        }
        zzi(this.zzh.zzm().f10834a);
    }

    public final void zzb(int i7, int i8) {
        int i9;
        Context context = this.zzi;
        int i10 = 0;
        if (context instanceof Activity) {
            P p5 = o.f1952C.f1957c;
            i9 = P.n((Activity) context)[0];
        } else {
            i9 = 0;
        }
        if (this.zzh.zzO() == null || !this.zzh.zzO().zzi()) {
            zzceb zzcebVar = this.zzh;
            int width = zzcebVar.getWidth();
            int height = zzcebVar.getHeight();
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzaf)).booleanValue()) {
                if (width == 0) {
                    width = this.zzh.zzO() != null ? this.zzh.zzO().zzb : 0;
                }
                if (height == 0) {
                    if (this.zzh.zzO() != null) {
                        i10 = this.zzh.zzO().zza;
                    }
                    Context context2 = this.zzi;
                    C0252s c0252s = C0252s.f2717f;
                    this.zzf = c0252s.f2718a.g(width, context2);
                    this.zzg = c0252s.f2718a.g(i10, this.zzi);
                }
            }
            i10 = height;
            Context context22 = this.zzi;
            C0252s c0252s2 = C0252s.f2717f;
            this.zzf = c0252s2.f2718a.g(width, context22);
            this.zzg = c0252s2.f2718a.g(i10, this.zzi);
        }
        zzg(i7, i8 - i9, this.zzf, this.zzg);
        this.zzh.zzN().zzD(i7, i8);
    }
}
