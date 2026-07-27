package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes9.dex */
public final class zzdpl implements zzdqz {
    private com.google.android.gms.ads.internal.client.zzdc zzC;
    private final zzdge zzD;
    private final zzdrs zzE;
    private final com.google.android.gms.ads.internal.zzb zzF;
    private final zzdck zzG;
    private final Context zza;
    private final zzdrb zzb;
    private final JSONObject zzc;
    private final zzdvv zzd;
    private final zzdqr zze;
    private final zzbbd zzf;
    private final zzdeh zzg;
    private final zzddn zzh;
    private final zzdlu zzi;
    private final zzfld zzj;
    private final VersionInfoParcel zzk;
    private final zzflw zzl;
    private final zzcuy zzm;
    private final zzdrw zzn;
    private final Clock zzo;
    private final zzdlq zzp;
    private final zzfte zzq;
    private final zzdxl zzr;
    private final zzfrg zzs;
    private final zzelp zzt;
    private boolean zzv;
    private boolean zzu = false;
    private boolean zzw = false;
    private boolean zzx = false;
    private Point zzy = new Point();
    private Point zzz = new Point();
    private long zzA = 0;
    private long zzB = 0;

    public zzdpl(Context context, zzdrb zzdrbVar, JSONObject jSONObject, zzdvv zzdvvVar, zzdqr zzdqrVar, zzbbd zzbbdVar, zzdeh zzdehVar, zzddn zzddnVar, zzdlu zzdluVar, zzfld zzfldVar, VersionInfoParcel versionInfoParcel, zzflw zzflwVar, zzcuy zzcuyVar, zzdrw zzdrwVar, Clock clock, zzdlq zzdlqVar, zzfte zzfteVar, zzfrg zzfrgVar, zzelp zzelpVar, zzdxl zzdxlVar, zzdrs zzdrsVar, zzdge zzdgeVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcef zzcefVar, zzdck zzdckVar) {
        this.zza = context;
        this.zzb = zzdrbVar;
        this.zzc = jSONObject;
        this.zzd = zzdvvVar;
        this.zze = zzdqrVar;
        this.zzf = zzbbdVar;
        this.zzg = zzdehVar;
        this.zzh = zzddnVar;
        this.zzi = zzdluVar;
        this.zzj = zzfldVar;
        this.zzk = versionInfoParcel;
        this.zzl = zzflwVar;
        this.zzm = zzcuyVar;
        this.zzn = zzdrwVar;
        this.zzo = clock;
        this.zzp = zzdlqVar;
        this.zzq = zzfteVar;
        this.zzs = zzfrgVar;
        this.zzt = zzelpVar;
        this.zzr = zzdxlVar;
        this.zzE = zzdrsVar;
        this.zzD = zzdgeVar;
        this.zzF = zzbVar;
        this.zzG = zzdckVar;
    }

    private final boolean zzG(String str) {
        JSONObject optJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    private final String zzH(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int zzx = this.zze.zzx();
        if (zzx == 1) {
            return "1099";
        }
        if (zzx == 2) {
            return "2099";
        }
        if (zzx != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzI() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final void zzJ() {
        com.google.android.gms.ads.internal.zzb zzbVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpx)).booleanValue() || (zzbVar = this.zzF) == null) {
            return;
        }
        zzbVar.zza();
    }

    private final boolean zzK(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z, View view) {
        zzdck zzdckVar;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeB)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            jSONObject6.put("screen", com.google.android.gms.ads.internal.util.zzbs.zzj(this.zza));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpz)).booleanValue() && (zzdckVar = this.zzG) != null && zzdckVar.zza() > 0) {
                jSONObject6.put("placement_id", zzdckVar.zza());
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjY)).booleanValue()) {
                this.zzd.zzd("/clickRecorded", new zzdpi(this, null));
            } else {
                this.zzd.zzd("/logScionEvent", new zzdph(this, null));
            }
            zzdvv zzdvvVar = this.zzd;
            zzdvvVar.zzd("/nativeImpression", new zzdpj(this, view, null));
            zzdvvVar.zzd("/nativeImpressionFlowControl", new zzdpk(this, this.zzq, this.zzj.zzax, this.zzs, null));
            zzcgm.zza(zzdvvVar.zzc("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression", zzcgj.zzh);
            if (this.zzu) {
                return true;
            }
            this.zzu = com.google.android.gms.ads.internal.zzt.zzo().zzg(this.zza, this.zzk.afmaVersion, this.zzj.zzC.toString(), this.zzl.zzg);
            return true;
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create impression JSON.", e);
            return false;
        }
    }

    private final String zzL(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeB)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzb().zzj(this.zza, view, null);
        } catch (Exception unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Exception getting data.");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzA() {
        this.zzd.zzb();
    }

    final /* synthetic */ void zzB(View view) {
        this.zzE.zza(view, this.zzj);
    }

    final /* synthetic */ zzdeh zzC() {
        return this.zzg;
    }

    final /* synthetic */ zzddn zzD() {
        return this.zzh;
    }

    final /* synthetic */ zzdlu zzE() {
        return this.zzi;
    }

    final /* synthetic */ zzdge zzF() {
        return this.zzD;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zza(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (!this.zzv) {
            this.zzp.zza(view);
            this.zzv = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzo(this);
        boolean zza = com.google.android.gms.ads.internal.util.zzbs.zza(this.zzk.clientJarVersion);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zza) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zza) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzb(View view, Map map) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzc(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view2, scaleType);
        JSONObject zzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view2);
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view2);
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view2);
        String zzH = zzH(view, map);
        zzi(true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeI)).booleanValue() ? view2 : view, zzb, zze, zzc, zzd, zzH, com.google.android.gms.ads.internal.util.zzbs.zzf(zzH, context, this.zzz, this.zzy), null, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzd(String str) {
        zzi(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zze(Bundle bundle) {
        if (bundle == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Click data is null. No click is reported.");
        } else if (zzG("click_reporting")) {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zzi(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.client.zzay.zza().zzn(bundle, null), false, false);
        } else {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzf(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.zzc;
        boolean z2 = false;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznj)).booleanValue()) {
                z2 = true;
            }
        }
        if (!z2) {
            if (!this.zzx) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzI()) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        Context context = this.zza;
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view2, scaleType);
        JSONObject zzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view2);
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view2);
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view2);
        String zzH = zzH(view, map);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbs.zzf(zzH, context, this.zzz, this.zzy);
        if (z2) {
            try {
                Point point = this.zzz;
                Point point2 = this.zzy;
                try {
                    jSONObject = new JSONObject();
                } catch (Exception e) {
                    e = e;
                    jSONObject = null;
                }
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    if (point != null) {
                        jSONObject3.put("x", point.x);
                        jSONObject3.put("y", point.y);
                    }
                    if (point2 != null) {
                        jSONObject4.put("x", point2.x);
                        jSONObject4.put("y", point2.y);
                    }
                    jSONObject.put("start_point", jSONObject3);
                    jSONObject.put("end_point", jSONObject4);
                    jSONObject.put("duration_ms", i);
                } catch (Exception e2) {
                    e = e2;
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while grabbing custom click gesture signals.", e);
                    jSONObject2.put("custom_click_gesture_signal", jSONObject);
                    zzi(view2, zzb, zze, zzc, zzd, zzH, zzf, null, z, true);
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e3) {
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e3, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzi(view2, zzb, zze, zzc, zzd, zzH, zzf, null, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzg() {
        this.zzx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final boolean zzh() {
        return zzI();
    }

    protected final void zzi(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        String str2;
        try {
            zzJ();
            JSONObject jSONObject7 = new JSONObject();
            JSONObject jSONObject8 = this.zzc;
            jSONObject7.put("ad", jSONObject8);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            zzdrb zzdrbVar = this.zzb;
            zzdqr zzdqrVar = this.zze;
            jSONObject7.put("has_custom_click_handler", zzdrbVar.zzg(zzdqrVar.zzS()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", zzdqrVar.zzx());
            jSONObject9.put("view_aware_api_used", z);
            zzbmk zzbmkVar = this.zzl.zzj;
            jSONObject9.put("custom_mute_requested", zzbmkVar != null && zzbmkVar.zzg);
            jSONObject9.put("custom_mute_enabled", (zzdqrVar.zzE().isEmpty() || zzdqrVar.zzF() == null) ? false : true);
            if (this.zzn.zzb() != null && jSONObject8.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject9.put("timestamp", this.zzo.currentTimeMillis());
            if (this.zzx && zzI()) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", zzdrbVar.zzg(zzdqrVar.zzS()) != null);
            try {
                JSONObject optJSONObject = jSONObject8.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.zzf.zzb().zzg(this.zza, optJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception obtaining click signals", e);
                str2 = null;
            }
            jSONObject9.put("click_signals", str2);
            jSONObject9.put("open_chrome_custom_tab", true);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkc)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkd)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            long currentTimeMillis = this.zzo.currentTimeMillis();
            jSONObject10.put("time_from_last_touch_down", currentTimeMillis - this.zzA);
            jSONObject10.put("time_from_last_touch", currentTimeMillis - this.zzB);
            jSONObject7.put("touch_signal", jSONObject10);
            if (this.zzj.zzb()) {
                JSONObject jSONObject11 = (JSONObject) this.zzc.get("tracking_urls_and_actions");
                String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                if (string != null) {
                    this.zzt.zzb(string, this.zze);
                }
            }
            zzcgm.zza(this.zzd.zzc("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick", zzcgj.zzh);
        } catch (JSONException e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create click JSON.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzj(View view, MotionEvent motionEvent, View view2) {
        this.zzy = com.google.android.gms.ads.internal.util.zzbs.zzh(motionEvent, view2);
        long currentTimeMillis = this.zzo.currentTimeMillis();
        this.zzB = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzr.zza(motionEvent);
            this.zzA = currentTimeMillis;
            this.zzz = this.zzy;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(this.zzy.x, this.zzy.y);
        this.zzf.zzc(obtain);
        obtain.recycle();
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzk(Bundle bundle) {
        if (bundle == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Touch event data is null. No touch event is reported.");
        } else {
            if (!zzG("touch_reporting")) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
                return;
            }
            this.zzf.zzb().zze((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
            zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final JSONObject zzl(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType);
        JSONObject zzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view);
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view);
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", zze);
            jSONObject.put("ad_view_signal", zzb);
            jSONObject.put("scroll_view_signal", zzc);
            jSONObject.put("lock_screen_signal", zzd);
            return jSONObject;
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final JSONObject zzm(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject zzl = zzl(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzx && zzI()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (zzl != null) {
                jSONObject.put("nas", zzl);
            }
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzn() {
        zzK(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzo(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdrw zzdrwVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdrwVar);
        view.setClickable(true);
        zzdrwVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzp(zzboj zzbojVar) {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zza(zzbojVar);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzq() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzr(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        try {
            if (this.zzw) {
                return;
            }
            if (zzdgVar == null) {
                zzdqr zzdqrVar = this.zze;
                if (zzdqrVar.zzF() != null) {
                    this.zzw = true;
                    this.zzq.zzb(zzdqrVar.zzF().zzf(), this.zzj.zzax, this.zzs, null);
                    zzt();
                    return;
                }
            }
            this.zzw = true;
            this.zzq.zzb(zzdgVar.zzf(), this.zzj.zzax, this.zzs, null);
            zzt();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzs(com.google.android.gms.ads.internal.client.zzdc zzdcVar) {
        this.zzC = zzdcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzt() {
        try {
            com.google.android.gms.ads.internal.client.zzdc zzdcVar = this.zzC;
            if (zzdcVar != null) {
                zzdcVar.zze();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final int zzu() {
        zzbmk zzbmkVar = this.zzl.zzj;
        if (zzbmkVar == null) {
            return 0;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznj)).booleanValue()) {
            return zzbmkVar.zzi;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final boolean zzv() {
        if (zzu() == 0) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznj)).booleanValue()) {
            return this.zzl.zzj.zzj;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzw(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        zzK(com.google.android.gms.ads.internal.util.zzbs.zzb(context, view), com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType), com.google.android.gms.ads.internal.util.zzbs.zzc(view), com.google.android.gms.ads.internal.util.zzbs.zzd(context, view), zzL(view), null, com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzj), view);
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzx(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType);
        JSONObject zzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view);
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view);
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view);
        boolean zzi = com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzj);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            jSONObject.put("asset_view_signal", zze);
            jSONObject.put("ad_view_signal", zzb);
            jSONObject.put("scroll_view_signal", zzc);
            jSONObject.put("lock_screen_signal", zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeB)).booleanValue()) {
                jSONObject.put("view_signals", zzL(view));
            }
            jSONObject.put("policy_validator_enabled", zzi);
            jSONObject.put("screen", com.google.android.gms.ads.internal.util.zzbs.zzj(context));
            zzcgm.zza(this.zzd.zzc("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging", zzcgj.zzh);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create native ad signals logging JSON.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final void zzy() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzcgm.zza(this.zzd.zzc("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression", zzcgj.zzh);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqz
    public final boolean zzz(Bundle bundle) {
        if (zzG("impression_reporting")) {
            return zzK(null, null, null, null, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznc)).booleanValue() ? zzL(null) : null, com.google.android.gms.ads.internal.client.zzay.zza().zzn(bundle, null), false, null);
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }
}
