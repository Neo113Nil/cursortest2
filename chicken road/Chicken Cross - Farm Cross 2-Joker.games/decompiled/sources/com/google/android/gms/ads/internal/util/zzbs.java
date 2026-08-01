package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzgty;
import com.google.android.gms.internal.ads.zzguz;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nonnull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbs {
    public static boolean zza(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzey)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzez)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:3|4|5|(2:8|6)|9|10|(1:12)(1:66)|13|14|(7:57|58|17|18|19|20|(10:22|(8:26|27|(2:29|(1:31)(1:49))(1:50)|32|33|(3:42|43|(1:45))|35|(2:37|38))|51|27|(0)(0)|32|33|(0)|35|(0))(10:52|(8:54|27|(0)(0)|32|33|(0)|35|(0))|51|27|(0)(0)|32|33|(0)|35|(0)))|16|17|18|19|20|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0168, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0169, code lost:
    
        r2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0163 A[Catch: JSONException -> 0x0168, TRY_LEAVE, TryCatch #6 {JSONException -> 0x0168, blocks: (B:19:0x012f, B:31:0x015a, B:49:0x015e, B:50:0x0163), top: B:18:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject zzb(Context context, View view) {
        String str;
        int hashCode;
        boolean z;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view != null) {
            try {
                int[] zzg = zzg(view);
                int[] iArr = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                for (ViewParent parent = view.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    iArr[0] = Math.min(viewGroup.getMeasuredWidth(), iArr[0]);
                    iArr[1] = Math.min(viewGroup.getMeasuredHeight(), iArr[1]);
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, view.getMeasuredWidth()));
                jSONObject3.put("height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, view.getMeasuredHeight()));
                jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg[0]));
                jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg[1]));
                jSONObject3.put("maximum_visible_width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArr[0]));
                jSONObject3.put("maximum_visible_height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArr[1]));
                jSONObject3.put("relative_to", "window");
                jSONObject2.put("frame", jSONObject3);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObject = zzl(context, rect);
                } else {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("width", 0);
                    jSONObject4.put("height", 0);
                    jSONObject4.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg[0]));
                    jSONObject4.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg[1]));
                    jSONObject4.put("relative_to", "window");
                    jSONObject = jSONObject4;
                }
                jSONObject2.put("visible_bounds", jSONObject);
            } catch (Exception unused) {
                int i = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get native ad view bounding box");
            }
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                try {
                    str = (String) parent2.getClass().getMethod("getTemplateTypeName", new Class[0]).invoke(parent2, new Object[0]);
                } catch (IllegalAccessException e) {
                    e = e;
                    int i2 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode != -2066603854) {
                    }
                } catch (NoSuchMethodException unused2) {
                } catch (SecurityException e2) {
                    e = e2;
                    int i22 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode != -2066603854) {
                    }
                } catch (InvocationTargetException e3) {
                    e = e3;
                    int i222 = zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode != -2066603854) {
                    }
                }
                hashCode = str.hashCode();
                if (hashCode != -2066603854) {
                    if (hashCode == 2019754500 && str.equals("medium_template")) {
                        z = true;
                        if (z) {
                            jSONObject2.put("native_template_type", 1);
                        } else if (!z) {
                            jSONObject2.put("native_template_type", 0);
                        } else {
                            jSONObject2.put("native_template_type", 2);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjn)).booleanValue()) {
                            try {
                                if (view.getLayoutParams() != null) {
                                    jSONObject2.put("view_width_layout_type", zzm(r0.width) - 1);
                                    jSONObject2.put("view_height_layout_type", zzm(r0.height) - 1);
                                }
                            } catch (Exception unused3) {
                                zze.zza("Unable to get native ad view layout types");
                            }
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjr)).booleanValue()) {
                            try {
                                jSONObject2.put("alpha", view.getAlpha());
                            } catch (JSONException e4) {
                                int i3 = zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not log container view alpha signal to JSON", e4);
                            }
                        }
                    }
                    z = -1;
                    if (z) {
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjn)).booleanValue()) {
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjr)).booleanValue()) {
                    }
                } else {
                    if (str.equals("small_template")) {
                        z = false;
                        if (z) {
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjn)).booleanValue()) {
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjr)).booleanValue()) {
                        }
                    }
                    z = -1;
                    if (z) {
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjn)).booleanValue()) {
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjr)).booleanValue()) {
                    }
                }
            }
            str = "";
            hashCode = str.hashCode();
            if (hashCode != -2066603854) {
            }
        }
        return jSONObject2;
    }

    public static JSONObject zzc(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                boolean z = true;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjj)).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjk)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        if (zzs.zzA(view) == 0) {
                            z = false;
                        }
                        jSONObject.put("contained_in_scroll_view", z);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjl)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        jSONObject.put("scroll_view_type", zzs.zzA(view));
                    }
                } else {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof AdapterView)) {
                        parent = parent.getParent();
                    }
                    if ((parent == null ? -1 : ((AdapterView) parent).getPositionForView(view)) == -1) {
                        z = false;
                    }
                    jSONObject.put("contained_in_scroll_view", z);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject zzd(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                com.google.android.gms.ads.internal.zzt.zzc();
                jSONObject.put("can_show_on_lock_screen", zzs.zzo(view));
                com.google.android.gms.ads.internal.zzt.zzc();
                jSONObject.put("is_keyguard_locked", zzs.zzG(context));
            } catch (JSONException unused) {
                int i = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static JSONObject zze(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        String str;
        String str2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        ViewGroup.LayoutParams layoutParams;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject3 = new JSONObject();
        if (map != null && view != null) {
            int[] zzg = zzg(view);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] zzg2 = zzg(view2);
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject jSONObject5 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        JSONObject jSONObject6 = jSONObject3;
                        try {
                            jSONObject5.put("width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, view2.getMeasuredWidth()));
                            jSONObject5.put("height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, view2.getMeasuredHeight()));
                            jSONObject5.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg2[0] - zzg[0]));
                            jSONObject5.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg2[1] - zzg[1]));
                            jSONObject5.put(str4, str3);
                            jSONObject4.put("frame", jSONObject5);
                            Rect rect = new Rect();
                            if (view2.getLocalVisibleRect(rect)) {
                                jSONObject2 = zzl(context, rect);
                            } else {
                                jSONObject2 = new JSONObject();
                                jSONObject2.put("width", 0);
                                jSONObject2.put("height", 0);
                                jSONObject2.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg2[0] - zzg[0]));
                                jSONObject2.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzg2[1] - zzg[1]));
                                jSONObject2.put(str4, str3);
                            }
                            jSONObject4.put("visible_bounds", jSONObject2);
                            if (((String) entry.getKey()).equals("3010")) {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjm)).booleanValue()) {
                                    jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjn)).booleanValue() && (layoutParams = view2.getLayoutParams()) != null) {
                                    jSONObject4.put("view_width_layout_type", zzm(layoutParams.width) - 1);
                                    jSONObject4.put("view_height_layout_type", zzm(layoutParams.height) - 1);
                                }
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjq)).booleanValue()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(Integer.valueOf(view2.getId()));
                                    for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        arrayList.add(Integer.valueOf(((View) parent).getId()));
                                    }
                                    jSONObject4.put("view_path", TextUtils.join("/", arrayList));
                                }
                                if (scaleType != null) {
                                    jSONObject4.put("mediaview_scale_type", scaleType.ordinal());
                                }
                            }
                            if (view2 instanceof TextView) {
                                TextView textView = (TextView) view2;
                                jSONObject4.put("text_color", textView.getCurrentTextColor());
                                str = str3;
                                str2 = str4;
                                try {
                                    jSONObject4.put(ViewHierarchyConstants.TEXT_SIZE, textView.getTextSize());
                                    jSONObject4.put("text", textView.getText());
                                } catch (JSONException unused) {
                                    jSONObject = jSONObject6;
                                    int i = zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get asset views information");
                                    it = it2;
                                    jSONObject3 = jSONObject;
                                    str3 = str;
                                    str4 = str2;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            jSONObject4.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjr)).booleanValue()) {
                                jSONObject4.put("alpha", view2.getAlpha());
                            }
                            jSONObject = jSONObject6;
                        } catch (JSONException unused2) {
                            str = str3;
                            str2 = str4;
                        }
                    } catch (JSONException unused3) {
                        str = str3;
                        str2 = str4;
                        jSONObject = jSONObject3;
                    }
                    try {
                        jSONObject.put((String) entry.getKey(), jSONObject4);
                    } catch (JSONException unused4) {
                        int i2 = zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to get asset views information");
                        it = it2;
                        jSONObject3 = jSONObject;
                        str3 = str;
                        str4 = str2;
                    }
                    it = it2;
                    jSONObject3 = jSONObject;
                    str3 = str;
                    str4 = str2;
                }
            }
        }
        return jSONObject3;
    }

    public static JSONObject zzf(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e) {
            e = e;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, point2.x));
                jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, point2.y));
                jSONObject3.put("start_x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, point.x));
                jSONObject3.put("start_y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e2) {
                int i = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while putting signals into JSON object.", e2);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e3) {
            e = e3;
            jSONObject2 = jSONObject;
            int i2 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static int[] zzg(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    public static Point zzh(MotionEvent motionEvent, View view) {
        int[] zzg = zzg(view);
        return new Point(((int) motionEvent.getRawX()) - zzg[0], ((int) motionEvent.getRawY()) - zzg[1]);
    }

    public static boolean zzi(Context context, zzfld zzfldVar) {
        if (!zzfldVar.zzN) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjs)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjv)).booleanValue();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjt);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = zzguz.zza(zzgty.zzd(';')).zzf(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static JSONObject zzj(@Nonnull Context context) {
        JSONObject jSONObject = new JSONObject();
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics zzv = zzs.zzv((WindowManager) context.getSystemService("window"));
        try {
            jSONObject.put("width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzv.widthPixels));
            jSONObject.put("height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, zzv.heightPixels));
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static WindowManager.LayoutParams zzk() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzju)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    private static JSONObject zzl(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, rect.right - rect.left));
        jSONObject.put("height", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, rect.bottom - rect.top));
        jSONObject.put("x", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, rect.left));
        jSONObject.put("y", com.google.android.gms.ads.internal.client.zzay.zza().zza(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    private static int zzm(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
    }
}
