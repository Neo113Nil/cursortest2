package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0252s;
import F2.C0254t;
import F2.InterfaceC0244n0;
import F2.InterfaceC0250q0;
import I2.J;
import I2.P;
import J2.d;
import J2.j;
import a.AbstractC0603a;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import m3.InterfaceC1436a;
import m3.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdfy implements zzdhk {
    private InterfaceC0244n0 zzC;
    private final zzdie zzD;
    private final Context zza;
    private final zzdhn zzb;
    private final JSONObject zzc;
    private final zzdmf zzd;
    private final zzdhc zze;
    private final zzauo zzf;
    private final zzcvi zzg;
    private final zzcuo zzh;
    private final zzdcn zzi;
    private final zzfaf zzj;
    private final VersionInfoParcel zzk;
    private final zzfba zzl;
    private final zzcmk zzm;
    private final zzdii zzn;
    private final InterfaceC1436a zzo;
    private final zzdcj zzp;
    private final zzfia zzq;
    private final zzdnv zzr;
    private final zzffy zzs;
    private final zzeaq zzt;
    private boolean zzv;
    private boolean zzu = false;
    private boolean zzw = false;
    private boolean zzx = false;
    private Point zzy = new Point();
    private Point zzz = new Point();
    private long zzA = 0;
    private long zzB = 0;

    public zzdfy(Context context, zzdhn zzdhnVar, JSONObject jSONObject, zzdmf zzdmfVar, zzdhc zzdhcVar, zzauo zzauoVar, zzcvi zzcviVar, zzcuo zzcuoVar, zzdcn zzdcnVar, zzfaf zzfafVar, VersionInfoParcel versionInfoParcel, zzfba zzfbaVar, zzcmk zzcmkVar, zzdii zzdiiVar, InterfaceC1436a interfaceC1436a, zzdcj zzdcjVar, zzfia zzfiaVar, zzffy zzffyVar, zzeaq zzeaqVar, zzdnv zzdnvVar, zzdie zzdieVar) {
        this.zza = context;
        this.zzb = zzdhnVar;
        this.zzc = jSONObject;
        this.zzd = zzdmfVar;
        this.zze = zzdhcVar;
        this.zzf = zzauoVar;
        this.zzg = zzcviVar;
        this.zzh = zzcuoVar;
        this.zzi = zzdcnVar;
        this.zzj = zzfafVar;
        this.zzk = versionInfoParcel;
        this.zzl = zzfbaVar;
        this.zzm = zzcmkVar;
        this.zzn = zzdiiVar;
        this.zzo = interfaceC1436a;
        this.zzp = zzdcjVar;
        this.zzq = zzfiaVar;
        this.zzs = zzffyVar;
        this.zzt = zzeaqVar;
        this.zzr = zzdnvVar;
        this.zzD = zzdieVar;
    }

    private final String zzE(View view) {
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdJ)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzc().zzh(this.zza, view, null);
        } catch (Exception unused) {
            int i7 = J.f3546b;
            j.d("Exception getting data.");
            return null;
        }
    }

    private final String zzF(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int zzc = this.zze.zzc();
        if (zzc == 1) {
            return "1099";
        }
        if (zzc == 2) {
            return "2099";
        }
        if (zzc != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzG(String str) {
        JSONObject optJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    private final boolean zzH() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzI(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z4, View view) {
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdJ)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z4);
            Context context = this.zza;
            JSONObject jSONObject7 = new JSONObject();
            P p5 = o.f1952C.f1957c;
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            zzdfx zzdfxVar = null;
            try {
                int i7 = displayMetrics.widthPixels;
                C0252s c0252s = C0252s.f2717f;
                jSONObject7.put("width", c0252s.f2718a.g(i7, context));
                jSONObject7.put("height", c0252s.f2718a.g(displayMetrics.heightPixels, context));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziE)).booleanValue()) {
                this.zzd.zzl("/clickRecorded", new zzdfv(this, zzdfxVar));
            } else {
                this.zzd.zzl("/logScionEvent", new zzdfu(this, zzdfxVar));
            }
            this.zzd.zzl("/nativeImpression", new zzdfw(this, view, null));
            zzbzd.zza(this.zzd.zzg("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzu) {
                return true;
            }
            zzfaf zzfafVar = this.zzj;
            this.zzu = o.f1952C.f1967n.i(this.zza, this.zzk.f10834a, zzfafVar.zzC.toString(), this.zzl.zzf);
            return true;
        } catch (JSONException e7) {
            int i8 = J.f3546b;
            j.e("Unable to create impression JSON.", e7);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzA(View view, Map map) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final boolean zzB() {
        if (zza() == 0) {
            return true;
        }
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlz)).booleanValue()) {
            return this.zzl.zzi.zzj;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final boolean zzC() {
        return zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final boolean zzD(Bundle bundle) {
        JSONObject jSONObject;
        JSONObject j;
        if (!zzG("impression_reporting")) {
            int i7 = J.f3546b;
            j.d("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        d dVar = C0252s.f2717f.f2718a;
        dVar.getClass();
        if (bundle != null) {
            try {
                j = dVar.j(bundle);
            } catch (JSONException e7) {
                j.e("Error converting Bundle to JSON", e7);
                jSONObject = null;
            }
        } else {
            j = null;
        }
        jSONObject = j;
        return zzI(null, null, null, null, ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlv)).booleanValue() ? zzE(null) : null, jSONObject, false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final int zza() {
        if (this.zzl.zzi == null) {
            return 0;
        }
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlz)).booleanValue()) {
            return this.zzl.zzi.zzi;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject C02 = AbstractC0603a.C0(context, map, map2, view, scaleType);
        JSONObject F02 = AbstractC0603a.F0(context, view);
        JSONObject E02 = AbstractC0603a.E0(view);
        JSONObject D02 = AbstractC0603a.D0(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", C02);
            jSONObject.put("ad_view_signal", F02);
            jSONObject.put("scroll_view_signal", E02);
            jSONObject.put("lock_screen_signal", D02);
            return jSONObject;
        } catch (JSONException e7) {
            int i7 = J.f3546b;
            j.e("Unable to create native ad view signals JSON.", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject zze = zze(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzx && zzH()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (zze != null) {
                jSONObject.put("nas", zze);
            }
        } catch (JSONException e7) {
            int i7 = J.f3546b;
            j.e("Unable to create native click meta data JSON.", e7);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzh() {
        try {
            InterfaceC0244n0 interfaceC0244n0 = this.zzC;
            if (interfaceC0244n0 != null) {
                interfaceC0244n0.zze();
            }
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzi() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzj() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzk(InterfaceC0250q0 interfaceC0250q0) {
        try {
            if (this.zzw) {
                return;
            }
            if (interfaceC0250q0 == null) {
                zzdhc zzdhcVar = this.zze;
                if (zzdhcVar.zzk() != null) {
                    this.zzw = true;
                    this.zzq.zzd(zzdhcVar.zzk().f2643b, this.zzj.zzax, this.zzs);
                    zzh();
                    return;
                }
            }
            this.zzw = true;
            this.zzq.zzd(interfaceC0250q0.zzf(), this.zzj.zzax, this.zzs);
            zzh();
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzl(View view, View view2, Map map, Map map2, boolean z4, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject C02 = AbstractC0603a.C0(context, map, map2, view2, scaleType);
        JSONObject F02 = AbstractC0603a.F0(context, view2);
        JSONObject E02 = AbstractC0603a.E0(view2);
        JSONObject D02 = AbstractC0603a.D0(context, view2);
        String zzF = zzF(view, map);
        zzo(true == ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzdQ)).booleanValue() ? view2 : view, F02, C02, E02, D02, zzF, AbstractC0603a.B0(zzF, context, this.zzz, this.zzy), null, z4, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzm(String str) {
        zzo(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzn(Bundle bundle) {
        if (bundle == null) {
            int i7 = J.f3546b;
            j.b("Click data is null. No click is reported.");
            return;
        }
        if (!zzG("click_reporting")) {
            int i8 = J.f3546b;
            j.d("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        Bundle bundle2 = bundle.getBundle("click_signal");
        JSONObject jSONObject = null;
        String string = bundle2 != null ? bundle2.getString("asset_id") : null;
        d dVar = C0252s.f2717f.f2718a;
        dVar.getClass();
        try {
            jSONObject = dVar.j(bundle);
        } catch (JSONException e7) {
            j.e("Error converting Bundle to JSON", e7);
        }
        zzo(null, null, null, null, null, string, null, jSONObject, false, false);
    }

    public final void zzo(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z4, boolean z7) {
        String str2;
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzA()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zze.zzc());
            jSONObject8.put("view_aware_api_used", z4);
            zzbey zzbeyVar = this.zzl.zzi;
            jSONObject8.put("custom_mute_requested", zzbeyVar != null && zzbeyVar.zzg);
            jSONObject8.put("custom_mute_enabled", (this.zze.zzH().isEmpty() || this.zze.zzk() == null) ? false : true);
            if (this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            ((m3.b) this.zzo).getClass();
            jSONObject8.put("timestamp", System.currentTimeMillis());
            if (this.zzx && zzH()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z7) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzA()) != null);
            try {
                JSONObject optJSONObject = this.zzc.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.zzf.zzc().zzd(this.zza, optJSONObject.optString("click_string"), view);
            } catch (Exception e7) {
                int i7 = J.f3546b;
                j.e("Exception obtaining click signals", e7);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            jSONObject8.put("open_chrome_custom_tab", true);
            zzbbp zzbbpVar = zzbby.zziI;
            C0254t c0254t = C0254t.f2723d;
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && c.i()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zziJ)).booleanValue() && c.i()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            ((m3.b) this.zzo).getClass();
            long currentTimeMillis = System.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", currentTimeMillis - this.zzA);
            jSONObject9.put("time_from_last_touch", currentTimeMillis - this.zzB);
            jSONObject7.put("touch_signal", jSONObject9);
            if (this.zzj.zzb()) {
                JSONObject jSONObject10 = (JSONObject) this.zzc.get("tracking_urls_and_actions");
                String string = jSONObject10 != null ? jSONObject10.getString("gws_query_id") : null;
                if (string != null) {
                    this.zzt.zzq(string, this.zze);
                }
            }
            zzbzd.zza(this.zzd.zzg("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e8) {
            int i8 = J.f3546b;
            j.e("Unable to create click JSON.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzp(View view, View view2, Map map, Map map2, boolean z4, ImageView.ScaleType scaleType, int i7) {
        JSONObject jSONObject;
        boolean z7 = false;
        if (this.zzc.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlz)).booleanValue()) {
                z7 = true;
            }
        }
        if (!z7) {
            if (!this.zzx) {
                int i8 = J.f3546b;
                j.b("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzH()) {
                int i9 = J.f3546b;
                j.b("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject C02 = AbstractC0603a.C0(this.zza, map, map2, view2, scaleType);
        JSONObject F02 = AbstractC0603a.F0(this.zza, view2);
        JSONObject E02 = AbstractC0603a.E0(view2);
        JSONObject D02 = AbstractC0603a.D0(this.zza, view2);
        String zzF = zzF(view, map);
        JSONObject B02 = AbstractC0603a.B0(zzF, this.zza, this.zzz, this.zzy);
        if (z7) {
            try {
                JSONObject jSONObject2 = this.zzc;
                Point point = this.zzz;
                Point point2 = this.zzy;
                try {
                    jSONObject = new JSONObject();
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
                        jSONObject.put("duration_ms", i7);
                    } catch (Exception e7) {
                        e = e7;
                        int i10 = J.f3546b;
                        j.e("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                        zzo(view2, F02, C02, E02, D02, zzF, B02, null, z4, true);
                    }
                } catch (Exception e8) {
                    e = e8;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e9) {
                int i11 = J.f3546b;
                j.e("Error occurred while adding CustomClickGestureSignals to adJson.", e9);
                o.f1952C.f1961g.zzw(e9, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzo(view2, F02, C02, E02, D02, zzF, B02, null, z4, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzq() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzbzd.zza(this.zzd.zzg("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e7) {
            int i7 = J.f3546b;
            j.e("", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzr(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        zzI(AbstractC0603a.F0(context, view), AbstractC0603a.C0(context, map, map2, view, scaleType), AbstractC0603a.E0(view), AbstractC0603a.D0(context, view), zzE(view), null, AbstractC0603a.G0(context, this.zzj), view);
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzs() {
        zzI(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzt(View view, MotionEvent motionEvent, View view2) {
        int[] iArr = new int[2];
        if (view2 != null) {
            view2.getLocationOnScreen(iArr);
        }
        this.zzy = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        ((m3.b) this.zzo).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        this.zzB = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
            this.zzA = currentTimeMillis;
            this.zzz = this.zzy;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzy;
        obtain.setLocation(point.x, point.y);
        this.zzf.zzd(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzu(Bundle bundle) {
        if (bundle == null) {
            int i7 = J.f3546b;
            j.b("Touch event data is null. No touch event is reported.");
        } else if (!zzG("touch_reporting")) {
            int i8 = J.f3546b;
            j.d("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            this.zzf.zzc().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzv(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i7 = J.f3546b;
            j.g("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdii zzdiiVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdiiVar);
        view.setClickable(true);
        zzdiiVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzw() {
        this.zzx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzx(InterfaceC0244n0 interfaceC0244n0) {
        this.zzC = interfaceC0244n0;
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzy(zzbha zzbhaVar) {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzc(zzbhaVar);
        } else {
            int i7 = J.f3546b;
            j.g("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhk
    public final void zzz(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (!this.zzv) {
            this.zzp.zza(view);
            this.zzv = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean H02 = AbstractC0603a.H0(this.zzk.f10836c);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (H02) {
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
                    if (H02) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }
}
