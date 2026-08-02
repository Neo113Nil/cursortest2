package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Po implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11120a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11121b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11122c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11123d;

    public /* synthetic */ Po(Object obj, Object obj2, Object obj3, int i) {
        this.f11120a = i;
        this.f11121b = obj;
        this.f11122c = obj2;
        this.f11123d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final void k(Object obj) {
        int i;
        switch (this.f11120a) {
            case 2:
                Wq wq = (Wq) this.f11121b;
                ArrayList arrayList = wq.f12100g;
                C0572Ch c0572Ch = (C0572Ch) obj;
                if (arrayList != null && !arrayList.isEmpty()) {
                    Bundle bundle = c0572Ch.f8050b;
                    B8 b8 = wq.i;
                    if (b8 != null && (i = b8.f7778s) != 0) {
                        bundle.putBoolean("sccg_tap", b8.f7779t);
                        bundle.putInt("sccg_dir", i);
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final void o(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        ComponentName componentName2;
        int i;
        B8 b8;
        String str;
        JSONArray optJSONArray;
        switch (this.f11120a) {
            case 0:
                C0572Ch c0572Ch = (C0572Ch) obj;
                if (((Boolean) AbstractC1191k8.f14224a.s()).booleanValue()) {
                    Bundle bundle = new Bundle();
                    T2.L l5 = P2.o.f4767B.f4771c;
                    String str2 = null;
                    try {
                        ActivityManager activityManager = (ActivityManager) ((Context) this.f11121b).getSystemService("activity");
                        if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null) {
                            componentName = runningTaskInfo.topActivity;
                            if (componentName != null) {
                                componentName2 = runningTaskInfo.topActivity;
                                str2 = componentName2.getClassName();
                            }
                        }
                    } catch (Exception unused) {
                    }
                    bundle.putString("activity", str2);
                    Bundle bundle2 = new Bundle();
                    Q2.a1 a1Var = (Q2.a1) this.f11122c;
                    bundle2.putInt("width", a1Var.f4978o);
                    bundle2.putInt("height", a1Var.f4975l);
                    bundle.putBundle("size", bundle2);
                    ArrayList arrayList = (ArrayList) this.f11123d;
                    if (!arrayList.isEmpty()) {
                        bundle.putParcelableArray("parents", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
                    }
                    c0572Ch.f8049a.putBundle("view_hierarchy", bundle);
                    return;
                }
                return;
            case 1:
                Bundle bundle3 = ((C0572Ch) obj).f8049a;
                bundle3.putString("consent_string", (String) this.f11121b);
                bundle3.putString("fc_consent", (String) this.f11122c);
                Bundle bundle4 = (Bundle) this.f11123d;
                if (bundle4 != null) {
                    bundle3.putBundle("iab_consent_info", bundle4);
                    return;
                }
                return;
            case 2:
                ArrayList<String> arrayList2 = ((Wq) this.f11121b).f12100g;
                C0572Ch c0572Ch2 = (C0572Ch) obj;
                if (arrayList2 == null) {
                    return;
                }
                if (arrayList2.isEmpty()) {
                    c0572Ch2.f8049a.putInt("native_version", 0);
                    return;
                }
                Bundle bundle5 = c0572Ch2.f8049a;
                bundle5.putInt("native_version", 3);
                bundle5.putStringArrayList("native_templates", arrayList2);
                bundle5.putStringArrayList("native_custom_templates", ((Wq) this.f11121b).f12101h);
                B8 b82 = ((Wq) this.f11121b).i;
                if (b82 != null) {
                    if (b82.f7770k > 3) {
                        bundle5.putBoolean("enable_native_media_orientation", true);
                        int i5 = ((Wq) this.f11121b).i.f7777r;
                        String str3 = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "unknown" : "square" : "portrait" : "landscape" : "any";
                        if (!"unknown".equals(str3)) {
                            bundle5.putString("native_media_orientation", str3);
                        }
                    }
                    int i6 = ((Wq) this.f11121b).i.f7772m;
                    String str4 = i6 != 0 ? i6 != 1 ? i6 != 2 ? "unknown" : "landscape" : "portrait" : "any";
                    if (!"unknown".equals(str4)) {
                        bundle5.putString("native_image_orientation", str4);
                    }
                    bundle5.putBoolean("native_multiple_images", ((Wq) this.f11121b).i.f7773n);
                    bundle5.putBoolean("use_custom_mute", ((Wq) this.f11121b).i.f7776q);
                    Bundle bundle6 = c0572Ch2.f8049a;
                    B8 b83 = ((Wq) this.f11121b).i;
                    if (b83 != null && b83.f7778s != 0) {
                        bundle6.putBoolean("sccg_tap", b83.f7779t);
                        bundle6.putInt("sccg_dir", b83.f7778s);
                    }
                }
                PackageInfo packageInfo = (PackageInfo) this.f11122c;
                int i7 = packageInfo != null ? packageInfo.versionCode : 0;
                T2.I i8 = (T2.I) this.f11123d;
                i8.o();
                synchronized (i8.f5644a) {
                    i = i8.f5659r;
                }
                if (i7 > i) {
                    ((T2.I) this.f11123d).z();
                    ((T2.I) this.f11123d).A(i7);
                }
                JSONObject x5 = ((T2.I) this.f11123d).x();
                String str5 = null;
                if (x5 != null && (optJSONArray = x5.optJSONArray(((Wq) this.f11121b).f)) != null) {
                    str5 = optJSONArray.toString();
                }
                if (!TextUtils.isEmpty(str5)) {
                    bundle5.putString("native_advanced_settings", str5);
                }
                int i9 = ((Wq) this.f11121b).f12103k;
                if (i9 > 1) {
                    bundle5.putInt("max_num_ads", i9);
                }
                X9 x9 = ((Wq) this.f11121b).f12096b;
                if (x9 != null) {
                    if (TextUtils.isEmpty(x9.f12156m)) {
                        if (x9.f12154k >= 2) {
                            int i10 = x9.f12157n;
                            str = i10 != 2 ? i10 != 3 ? "l" : "p" : "l";
                        } else {
                            int i11 = x9.f12155l;
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    U2.j.f("Instream ad video aspect ratio " + i11 + " is wrong.");
                                } else {
                                    str = "p";
                                }
                            }
                            str = "l";
                        }
                        bundle5.putString("ia_var", str);
                    } else {
                        bundle5.putString("ad_tag", x9.f12156m);
                    }
                    bundle5.putBoolean("instr", true);
                }
                if (((Wq) this.f11121b).a() != null) {
                    bundle5.putBoolean("has_delayed_banner_listener", true);
                }
                if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.ub)).booleanValue() || (b8 = ((Wq) this.f11121b).i) == null) {
                    return;
                }
                if (b8.f7775p != null) {
                    Bundle bundle7 = new Bundle();
                    bundle7.putBoolean("startMuted", ((Wq) this.f11121b).i.f7775p.f4943k);
                    bundle7.putBoolean("clickToExpandRequested", ((Wq) this.f11121b).i.f7775p.f4945m);
                    bundle7.putBoolean("customControlsRequested", ((Wq) this.f11121b).i.f7775p.f4944l);
                    bundle5.putBundle("video", bundle7);
                }
                bundle5.putBoolean("disable_image_loading", ((Wq) this.f11121b).i.f7771l);
                bundle5.putInt("preferred_ad_choices_position", ((Wq) this.f11121b).i.f7774o);
                return;
            default:
                E4.a aVar = (E4.a) this.f11123d;
                try {
                    JSONObject e02 = N4.b.e0("pii", (JSONObject) obj);
                    N2.a aVar2 = (N2.a) this.f11121b;
                    if (aVar2 != null) {
                        String str6 = aVar2.f3749a;
                        if (!TextUtils.isEmpty(str6)) {
                            e02.put("rdid", str6);
                            e02.put("is_lat", aVar2.f3750b);
                            e02.put("idtype", "adid");
                            String str7 = (String) aVar.f1486l;
                            long j5 = aVar.f1485k;
                            if (str7 != null && j5 > 0) {
                                e02.put("paidv1_id_android_3p", str7);
                                e02.put("paidv1_creation_time_android_3p", j5);
                            }
                            return;
                        }
                    }
                    String str8 = (String) this.f11122c;
                    if (str8 != null) {
                        e02.put("pdid", str8);
                        e02.put("pdidtype", "ssaid");
                    }
                    return;
                } catch (JSONException e3) {
                    T2.G.n("Failed putting Ad ID.", e3);
                    return;
                }
        }
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void b(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }
}
