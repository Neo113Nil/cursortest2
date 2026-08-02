package a;

import A5.b;
import A5.f;
import A5.n;
import B4.B;
import B4.C0065i;
import B4.C0072p;
import B4.C0074s;
import B4.C0081z;
import B4.EnumC0071o;
import B4.Z;
import C1.C0095a;
import E2.o;
import E4.C0170c;
import E4.C0177j;
import E4.EnumC0176i;
import E5.C0203v;
import F.AbstractC0214j;
import F.AbstractC0215k;
import F2.C0252s;
import F2.C0254t;
import H5.q;
import H5.t;
import H5.u;
import H5.v;
import I2.P;
import J2.d;
import J2.j;
import L3.e;
import P.InterfaceC0355k;
import P.T;
import P.U;
import R5.C0405a;
import R5.C0406b;
import R5.C0413i;
import a.AbstractC0603a;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.http.SslCertificate;
import android.os.Binder;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzbbp;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzfaf;
import com.google.android.gms.internal.ads.zzfss;
import com.google.android.gms.internal.ads.zzftw;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.AbstractC0869e;
import com.google.crypto.tink.shaded.protobuf.AbstractC0873i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0877m;
import com.google.crypto.tink.shaded.protobuf.AbstractC0882s;
import com.google.crypto.tink.shaded.protobuf.AbstractC0887x;
import com.google.crypto.tink.shaded.protobuf.C;
import com.google.crypto.tink.shaded.protobuf.C0868d;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0889z;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.c0;
import com.google.crypto.tink.shaded.protobuf.f0;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.firebase.firestore.FirebaseFirestore;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import e1.k;
import f6.C1112e;
import g6.AbstractC1160i;
import i6.C1285b;
import i6.C1293j;
import i6.InterfaceC1290g;
import i6.InterfaceC1291h;
import i6.InterfaceC1292i;
import io.sentry.SentryEvent;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import l6.C1412b;
import org.json.JSONException;
import org.json.JSONObject;
import t6.h;
import v4.c;
import v4.r;
import w1.F0;
import w1.P2;
import w1.V0;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0603a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f7923a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f7924b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f7925c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Field f7926d;

    public static int A(byte[] bArr, int i7, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        AbstractC0887x abstractC0887x = (AbstractC0887x) interfaceC0889z;
        int M7 = M(bArr, i7, c0868d);
        int i8 = c0868d.f11761a + M7;
        while (M7 < i8) {
            M7 = M(bArr, M7, c0868d);
            abstractC0887x.t(e.d(c0868d.f11761a));
        }
        if (M7 == i8) {
            return M7;
        }
        throw C.g();
    }

    public static WindowManager.LayoutParams A0() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzia)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static int B(byte[] bArr, int i7, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        J j = (J) interfaceC0889z;
        int M7 = M(bArr, i7, c0868d);
        int i8 = c0868d.f11761a + M7;
        while (M7 < i8) {
            M7 = O(bArr, M7, c0868d);
            j.t(e.e(c0868d.f11762b));
        }
        if (M7 == i8) {
            return M7;
        }
        throw C.g();
    }

    public static JSONObject B0(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e7) {
            e = e7;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                int i7 = point2.x;
                C0252s c0252s = C0252s.f2717f;
                jSONObject3.put("x", c0252s.f2718a.g(i7, context));
                jSONObject3.put("y", c0252s.f2718a.g(point2.y, context));
                jSONObject3.put("start_x", c0252s.f2718a.g(point.x, context));
                jSONObject3.put("start_y", c0252s.f2718a.g(point.y, context));
                jSONObject2 = jSONObject3;
            } catch (JSONException e8) {
                int i8 = I2.J.f3546b;
                j.e("Error occurred while putting signals into JSON object.", e8);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e9) {
            e = e9;
            jSONObject2 = jSONObject;
            int i9 = I2.J.f3546b;
            j.e("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static int C(byte[] bArr, int i7, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        AbstractC0887x abstractC0887x = (AbstractC0887x) interfaceC0889z;
        int M7 = M(bArr, i7, c0868d);
        int i8 = c0868d.f11761a + M7;
        while (M7 < i8) {
            M7 = M(bArr, M7, c0868d);
            abstractC0887x.t(c0868d.f11761a);
        }
        if (M7 == i8) {
            return M7;
        }
        throw C.g();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:9|10|11|12|13|14|15|(11:17|18|19|20|(1:22)(1:79)|23|(9:25|26|27|(1:29)|30|(1:32)|33|(4:35|(2:38|36)|39|40)|(1:42))|43|(5:69|70|71|72|73)(1:45)|46|47)|(3:60|61|(7:65|50|51|52|53|54|55))|49|50|51|52|53|54|55) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject C0(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        Map map3;
        int[] iArr;
        int measuredWidth;
        JSONObject jSONObject;
        C0252s c0252s;
        JSONObject jSONObject2;
        TextView textView;
        boolean z4;
        Map map4 = map2;
        JSONObject jSONObject3 = new JSONObject();
        if (map != null && view != null) {
            int i7 = 2;
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] iArr3 = new int[i7];
                    view2.getLocationOnScreen(iArr3);
                    JSONObject jSONObject4 = new JSONObject();
                    JSONObject jSONObject5 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        measuredWidth = view2.getMeasuredWidth();
                        jSONObject = jSONObject3;
                        try {
                            c0252s = C0252s.f2717f;
                        } catch (JSONException unused) {
                            map3 = map4;
                        }
                    } catch (JSONException unused2) {
                        map3 = map4;
                        iArr = iArr2;
                    }
                    try {
                        d dVar = c0252s.f2718a;
                        d dVar2 = c0252s.f2718a;
                        jSONObject5.put("width", dVar.g(measuredWidth, context));
                        jSONObject5.put("height", dVar2.g(view2.getMeasuredHeight(), context));
                        jSONObject5.put("x", dVar2.g(iArr3[0] - iArr2[0], context));
                        jSONObject5.put("y", dVar2.g(iArr3[1] - iArr2[1], context));
                        jSONObject5.put("relative_to", "ad_view");
                        jSONObject4.put("frame", jSONObject5);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject2 = I0(context, rect);
                        } else {
                            jSONObject2 = new JSONObject();
                            jSONObject2.put("width", 0);
                            jSONObject2.put("height", 0);
                            jSONObject2.put("x", dVar2.g(iArr3[0] - iArr2[0], context));
                            jSONObject2.put("y", dVar2.g(iArr3[1] - iArr2[1], context));
                            jSONObject2.put("relative_to", "ad_view");
                        }
                        jSONObject4.put("visible_bounds", jSONObject2);
                        if (((String) entry.getKey()).equals("3010")) {
                            zzbbp zzbbpVar = zzbby.zzhV;
                            C0254t c0254t = C0254t.f2723d;
                            zzbbw zzbbwVar = c0254t.f2726c;
                            zzbbw zzbbwVar2 = c0254t.f2726c;
                            if (((Boolean) zzbbwVar.zzb(zzbbpVar)).booleanValue()) {
                                jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                            }
                            if (((Boolean) zzbbwVar2.zzb(zzbby.zzhW)).booleanValue()) {
                                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                jSONObject4.put("view_width_layout_type", J0(layoutParams.width) - 1);
                                jSONObject4.put("view_height_layout_type", J0(layoutParams.height) - 1);
                            }
                            if (((Boolean) zzbbwVar2.zzb(zzbby.zzhX)).booleanValue()) {
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
                            try {
                                textView = (TextView) view2;
                                jSONObject4.put("text_color", textView.getCurrentTextColor());
                                iArr = iArr2;
                            } catch (JSONException unused3) {
                                iArr = iArr2;
                            }
                            try {
                                jSONObject4.put("font_size", textView.getTextSize());
                                jSONObject4.put("text", textView.getText());
                            } catch (JSONException unused4) {
                                map3 = map2;
                                jSONObject3 = jSONObject;
                                int i8 = I2.J.f3546b;
                                j.g("Unable to get asset views information");
                                map4 = map3;
                                iArr2 = iArr;
                                i7 = 2;
                                it = it2;
                            }
                        } else {
                            iArr = iArr2;
                        }
                        map3 = map2;
                    } catch (JSONException unused5) {
                        map3 = map2;
                        iArr = iArr2;
                        jSONObject3 = jSONObject;
                        int i82 = I2.J.f3546b;
                        j.g("Unable to get asset views information");
                        map4 = map3;
                        iArr2 = iArr;
                        i7 = 2;
                        it = it2;
                    }
                    if (map3 != null) {
                        try {
                        } catch (JSONException unused6) {
                            jSONObject3 = jSONObject;
                            int i822 = I2.J.f3546b;
                            j.g("Unable to get asset views information");
                            map4 = map3;
                            iArr2 = iArr;
                            i7 = 2;
                            it = it2;
                        }
                        if (map3.containsKey(entry.getKey()) && view2.isClickable()) {
                            z4 = true;
                            jSONObject4.put("is_clickable", z4);
                            jSONObject3 = jSONObject;
                            jSONObject3.put((String) entry.getKey(), jSONObject4);
                            map4 = map3;
                            iArr2 = iArr;
                            i7 = 2;
                            it = it2;
                        }
                    }
                    z4 = false;
                    jSONObject4.put("is_clickable", z4);
                    jSONObject3 = jSONObject;
                    jSONObject3.put((String) entry.getKey(), jSONObject4);
                    map4 = map3;
                    iArr2 = iArr;
                    i7 = 2;
                    it = it2;
                }
            }
        }
        return jSONObject3;
    }

    public static int D(byte[] bArr, int i7, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        J j = (J) interfaceC0889z;
        int M7 = M(bArr, i7, c0868d);
        int i8 = c0868d.f11761a + M7;
        while (M7 < i8) {
            M7 = O(bArr, M7, c0868d);
            j.t(c0868d.f11762b);
        }
        if (M7 == i8) {
            return M7;
        }
        throw C.g();
    }

    public static JSONObject D0(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                P p5 = o.f1952C.f1957c;
                jSONObject.put("can_show_on_lock_screen", P.D(view));
                boolean z4 = false;
                if (context != null) {
                    Object systemService = context.getSystemService("keyguard");
                    KeyguardManager keyguardManager = (systemService == null || !(systemService instanceof KeyguardManager)) ? null : (KeyguardManager) systemService;
                    if (keyguardManager != null && keyguardManager.isKeyguardLocked()) {
                        z4 = true;
                    }
                }
                jSONObject.put("is_keyguard_locked", z4);
            } catch (JSONException unused) {
                int i7 = I2.J.f3546b;
                j.g("Unable to get lock screen information");
            }
        }
        return jSONObject;
    }

    public static int E(int i7, byte[] bArr, int i8, int i9, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        AbstractC0887x abstractC0887x = (AbstractC0887x) interfaceC0889z;
        int M7 = M(bArr, i8, c0868d);
        abstractC0887x.t(e.d(c0868d.f11761a));
        while (M7 < i9) {
            int M8 = M(bArr, M7, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            M7 = M(bArr, M8, c0868d);
            abstractC0887x.t(e.d(c0868d.f11761a));
        }
        return M7;
    }

    public static JSONObject E0(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhU)).booleanValue()) {
                    P p5 = o.f1952C.f1957c;
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof ScrollView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", parent != null);
                } else {
                    P p7 = o.f1952C.f1957c;
                    ViewParent parent2 = view.getParent();
                    while (parent2 != null && !(parent2 instanceof AdapterView)) {
                        parent2 = parent2.getParent();
                    }
                    if ((parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) == -1) {
                        r2 = false;
                    }
                    jSONObject.put("contained_in_scroll_view", r2);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static int F(int i7, byte[] bArr, int i8, int i9, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        J j = (J) interfaceC0889z;
        int O7 = O(bArr, i8, c0868d);
        j.t(e.e(c0868d.f11762b));
        while (O7 < i9) {
            int M7 = M(bArr, O7, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            O7 = O(bArr, M7, c0868d);
            j.t(e.e(c0868d.f11762b));
        }
        return O7;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:3|(9:4|5|(2:8|6)|9|10|11|12|(1:14)(1:60)|15)|16|(7:51|52|19|20|21|22|(8:24|(6:28|29|(2:31|(1:33)(1:42))(1:43)|34|35|(2:37|38))|44|29|(0)(0)|34|35|(0))(8:45|(6:47|29|(0)(0)|34|35|(0))|44|29|(0)(0)|34|35|(0)))|18|19|20|21|22|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0142, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014e, code lost:
    
        r2 = I2.J.f3546b;
        J2.j.e("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0149 A[Catch: JSONException -> 0x0142, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0142, blocks: (B:21:0x0113, B:33:0x013e, B:42:0x0144, B:43:0x0149), top: B:20:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject F0(Context context, View view) {
        String str;
        int hashCode;
        boolean z4;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view != null) {
            try {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int[] iArr2 = {view.getMeasuredWidth(), view.getMeasuredHeight()};
                for (ViewParent parent = view.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    iArr2[0] = Math.min(viewGroup.getMeasuredWidth(), iArr2[0]);
                    iArr2[1] = Math.min(viewGroup.getMeasuredHeight(), iArr2[1]);
                }
                JSONObject jSONObject3 = new JSONObject();
                int measuredWidth = view.getMeasuredWidth();
                C0252s c0252s = C0252s.f2717f;
                d dVar = c0252s.f2718a;
                d dVar2 = c0252s.f2718a;
                jSONObject3.put("width", dVar.g(measuredWidth, context));
                jSONObject3.put("height", dVar2.g(view.getMeasuredHeight(), context));
                jSONObject3.put("x", dVar2.g(iArr[0], context));
                jSONObject3.put("y", dVar2.g(iArr[1], context));
                jSONObject3.put("maximum_visible_width", dVar2.g(iArr2[0], context));
                jSONObject3.put("maximum_visible_height", dVar2.g(iArr2[1], context));
                jSONObject3.put("relative_to", "window");
                jSONObject2.put("frame", jSONObject3);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObject = I0(context, rect);
                } else {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("width", 0);
                    jSONObject4.put("height", 0);
                    jSONObject4.put("x", dVar2.g(iArr[0], context));
                    jSONObject4.put("y", dVar2.g(iArr[1], context));
                    jSONObject4.put("relative_to", "window");
                    jSONObject = jSONObject4;
                }
                jSONObject2.put("visible_bounds", jSONObject);
            } catch (Exception unused) {
                int i7 = I2.J.f3546b;
                j.g("Unable to get native ad view bounding box");
            }
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                try {
                    str = (String) parent2.getClass().getMethod("getTemplateTypeName", null).invoke(parent2, null);
                } catch (IllegalAccessException e7) {
                    e = e7;
                    int i8 = I2.J.f3546b;
                    j.e("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode != -2066603854) {
                    }
                } catch (NoSuchMethodException unused2) {
                } catch (SecurityException e8) {
                    e = e8;
                    int i82 = I2.J.f3546b;
                    j.e("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode != -2066603854) {
                    }
                } catch (InvocationTargetException e9) {
                    e = e9;
                    int i822 = I2.J.f3546b;
                    j.e("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode != -2066603854) {
                    }
                }
                hashCode = str.hashCode();
                if (hashCode != -2066603854) {
                    if (hashCode == 2019754500 && str.equals("medium_template")) {
                        z4 = true;
                        if (z4) {
                            jSONObject2.put("native_template_type", 1);
                        } else if (!z4) {
                            jSONObject2.put("native_template_type", 0);
                        } else {
                            jSONObject2.put("native_template_type", 2);
                        }
                        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhW)).booleanValue()) {
                            try {
                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                jSONObject2.put("view_width_layout_type", J0(layoutParams.width) - 1);
                                jSONObject2.put("view_height_layout_type", J0(layoutParams.height) - 1);
                            } catch (Exception unused3) {
                                I2.J.k("Unable to get native ad view layout types");
                            }
                        }
                    }
                    z4 = -1;
                    if (z4) {
                    }
                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhW)).booleanValue()) {
                    }
                } else {
                    if (str.equals("small_template")) {
                        z4 = false;
                        if (z4) {
                        }
                        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhW)).booleanValue()) {
                        }
                    }
                    z4 = -1;
                    if (z4) {
                    }
                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhW)).booleanValue()) {
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

    public static int G(byte[] bArr, int i7, C0868d c0868d) {
        int M7 = M(bArr, i7, c0868d);
        int i8 = c0868d.f11761a;
        if (i8 < 0) {
            throw C.e();
        }
        if (i8 == 0) {
            c0868d.f11763c = "";
            return M7;
        }
        c0868d.f11763c = new String(bArr, M7, i8, A.f11702a);
        return M7 + i8;
    }

    public static boolean G0(Context context, zzfaf zzfafVar) {
        if (!zzfafVar.zzN) {
            return false;
        }
        zzbbp zzbbpVar = zzbby.zzhY;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            return ((Boolean) c0254t.f2726c.zzb(zzbby.zzib)).booleanValue();
        }
        String str = (String) c0254t.f2726c.zzb(zzbby.zzhZ);
        if (!str.isEmpty() && context != null) {
            String packageName = context.getPackageName();
            Iterator it = zzftw.zzb(zzfss.zzc(';')).zzd(str).iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int H(int i7, byte[] bArr, int i8, int i9, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        int M7 = M(bArr, i8, c0868d);
        int i10 = c0868d.f11761a;
        if (i10 < 0) {
            throw C.e();
        }
        if (i10 == 0) {
            interfaceC0889z.add("");
        } else {
            interfaceC0889z.add(new String(bArr, M7, i10, A.f11702a));
            M7 += i10;
        }
        while (M7 < i9) {
            int M8 = M(bArr, M7, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            M7 = M(bArr, M8, c0868d);
            int i11 = c0868d.f11761a;
            if (i11 < 0) {
                throw C.e();
            }
            if (i11 == 0) {
                interfaceC0889z.add("");
            } else {
                interfaceC0889z.add(new String(bArr, M7, i11, A.f11702a));
                M7 += i11;
            }
        }
        return M7;
    }

    public static boolean H0(int i7) {
        zzbbp zzbbpVar = zzbby.zzdG;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            return ((Boolean) c0254t.f2726c.zzb(zzbby.zzdH)).booleanValue() || i7 <= 15299999;
        }
        return true;
    }

    public static int I(int i7, byte[] bArr, int i8, int i9, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        int M7 = M(bArr, i8, c0868d);
        int i10 = c0868d.f11761a;
        if (i10 < 0) {
            throw C.e();
        }
        if (i10 == 0) {
            interfaceC0889z.add("");
        } else {
            int i11 = M7 + i10;
            if (r0.f11823a.J(bArr, M7, i11) != 0) {
                throw C.b();
            }
            interfaceC0889z.add(new String(bArr, M7, i10, A.f11702a));
            M7 = i11;
        }
        while (M7 < i9) {
            int M8 = M(bArr, M7, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            M7 = M(bArr, M8, c0868d);
            int i12 = c0868d.f11761a;
            if (i12 < 0) {
                throw C.e();
            }
            if (i12 == 0) {
                interfaceC0889z.add("");
            } else {
                int i13 = M7 + i12;
                if (r0.f11823a.J(bArr, M7, i13) != 0) {
                    throw C.b();
                }
                interfaceC0889z.add(new String(bArr, M7, i12, A.f11702a));
                M7 = i13;
            }
        }
        return M7;
    }

    public static JSONObject I0(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        int i7 = rect.right - rect.left;
        C0252s c0252s = C0252s.f2717f;
        jSONObject.put("width", c0252s.f2718a.g(i7, context));
        int i8 = rect.bottom - rect.top;
        d dVar = c0252s.f2718a;
        jSONObject.put("height", dVar.g(i8, context));
        jSONObject.put("x", dVar.g(rect.left, context));
        jSONObject.put("y", dVar.g(rect.top, context));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static int J(byte[] bArr, int i7, C0868d c0868d) {
        int M7 = M(bArr, i7, c0868d);
        int i8 = c0868d.f11761a;
        if (i8 < 0) {
            throw C.e();
        }
        if (i8 == 0) {
            c0868d.f11763c = "";
            return M7;
        }
        c0868d.f11763c = r0.f11823a.t(bArr, M7, i8);
        return M7 + i8;
    }

    public static int J0(int i7) {
        if (i7 != -2) {
            return i7 != -1 ? 2 : 3;
        }
        return 4;
    }

    public static int K(int i7, byte[] bArr, int i8, int i9, f0 f0Var, C0868d c0868d) {
        if ((i7 >>> 3) == 0) {
            throw C.a();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int O7 = O(bArr, i8, c0868d);
            f0Var.d(i7, Long.valueOf(c0868d.f11762b));
            return O7;
        }
        if (i10 == 1) {
            f0Var.d(i7, Long.valueOf(p(i8, bArr)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int M7 = M(bArr, i8, c0868d);
            int i11 = c0868d.f11761a;
            if (i11 < 0) {
                throw C.e();
            }
            if (i11 > bArr.length - M7) {
                throw C.g();
            }
            if (i11 == 0) {
                f0Var.d(i7, AbstractC0873i.f11779b);
            } else {
                f0Var.d(i7, AbstractC0873i.t(bArr, M7, i11));
            }
            return M7 + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw C.a();
            }
            f0Var.d(i7, Integer.valueOf(n(i8, bArr)));
            return i8 + 4;
        }
        f0 c3 = f0.c();
        int i12 = (i7 & (-8)) | 4;
        int i13 = 0;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            int M8 = M(bArr, i8, c0868d);
            int i14 = c0868d.f11761a;
            if (i14 == i12) {
                i13 = i14;
                i8 = M8;
                break;
            }
            i13 = i14;
            i8 = K(i14, bArr, M8, i9, c3, c0868d);
        }
        if (i8 > i9 || i13 != i12) {
            throw C.f();
        }
        f0Var.d(i7, c3);
        return i8;
    }

    public static int L(int i7, byte[] bArr, int i8, C0868d c0868d) {
        int i9 = i7 & 127;
        int i10 = i8 + 1;
        byte b7 = bArr[i8];
        if (b7 >= 0) {
            c0868d.f11761a = i9 | (b7 << 7);
            return i10;
        }
        int i11 = i9 | ((b7 & Byte.MAX_VALUE) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i10];
        if (b8 >= 0) {
            c0868d.f11761a = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & Byte.MAX_VALUE) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            c0868d.f11761a = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & Byte.MAX_VALUE) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            c0868d.f11761a = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                c0868d.f11761a = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static int M(byte[] bArr, int i7, C0868d c0868d) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return L(b7, bArr, i8, c0868d);
        }
        c0868d.f11761a = b7;
        return i8;
    }

    public static int N(int i7, byte[] bArr, int i8, int i9, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        AbstractC0887x abstractC0887x = (AbstractC0887x) interfaceC0889z;
        int M7 = M(bArr, i8, c0868d);
        abstractC0887x.t(c0868d.f11761a);
        while (M7 < i9) {
            int M8 = M(bArr, M7, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            M7 = M(bArr, M8, c0868d);
            abstractC0887x.t(c0868d.f11761a);
        }
        return M7;
    }

    public static int O(byte[] bArr, int i7, C0868d c0868d) {
        int i8 = i7 + 1;
        long j = bArr[i7];
        if (j >= 0) {
            c0868d.f11762b = j;
            return i8;
        }
        int i9 = i7 + 2;
        byte b7 = bArr[i8];
        long j3 = (j & 127) | ((b7 & Byte.MAX_VALUE) << 7);
        int i10 = 7;
        while (b7 < 0) {
            int i11 = i9 + 1;
            i10 += 7;
            j3 |= (r10 & Byte.MAX_VALUE) << i10;
            b7 = bArr[i9];
            i9 = i11;
        }
        c0868d.f11762b = j3;
        return i9;
    }

    public static int P(int i7, byte[] bArr, int i8, int i9, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        J j = (J) interfaceC0889z;
        int O7 = O(bArr, i8, c0868d);
        j.t(c0868d.f11762b);
        while (O7 < i9) {
            int M7 = M(bArr, O7, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            O7 = O(bArr, M7, c0868d);
            j.t(c0868d.f11762b);
        }
        return O7;
    }

    public static SafeParcelable Q(byte[] bArr, Parcelable.Creator creator) {
        D.i(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }

    public static boolean R(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = U.f5037a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = T.f5033d;
        T t7 = (T) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (t7 == null) {
            t7 = new T();
            t7.f5034a = null;
            t7.f5035b = null;
            t7.f5036c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, t7);
        }
        WeakReference weakReference2 = t7.f5036c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        t7.f5036c = new WeakReference(keyEvent);
        if (t7.f5035b == null) {
            t7.f5035b = new SparseArray();
        }
        SparseArray sparseArray = t7.f5035b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        throw k.c(arrayList, size);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean S(InterfaceC0355k interfaceC0355k, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z4 = false;
        if (interfaceC0355k == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC0355k.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window2 = activity.getWindow();
            if (window2.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f7923a) {
                        try {
                            f7924b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f7923a = true;
                    }
                    Method method = f7924b;
                    if (method != null) {
                        try {
                            Object invoke = method.invoke(actionBar, keyEvent);
                            if (invoke != null) {
                                z4 = ((Boolean) invoke).booleanValue();
                            }
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                    if (z4) {
                        return true;
                    }
                }
            }
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window2.getDecorView();
            if (U.b(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && U.b(view, keyEvent)) || interfaceC0355k.superDispatchKeyEvent(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f7925c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f7926d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f7925c = true;
        }
        Field field = f7926d;
        if (field != null) {
            try {
                onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused4) {
            }
            if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            window = dialog.getWindow();
            if (!window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView2 = window.getDecorView();
            if (U.b(decorView2, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
        }
        onKeyListener = null;
        if (onKeyListener == null) {
        }
        window = dialog.getWindow();
        if (!window.superDispatchKeyEvent(keyEvent)) {
        }
    }

    public static final C1412b T(Enum[] enumArr) {
        h.e(enumArr, "entries");
        return new C1412b(enumArr);
    }

    public static InvocationHandler U() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e7) {
                throw new RuntimeException(e7);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0086, code lost:
    
        if (r4.equals(">") == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static B V(Map map) {
        char c3 = 2;
        if (!map.containsKey("fieldPath")) {
            String str = (String) map.get("op");
            List list = (List) map.get("queries");
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(V((Map) it.next()));
            }
            if (str.equals("OR")) {
                return new C0081z(2, Arrays.asList((B[]) arrayList.toArray(new B[0])));
            }
            if (str.equals("AND")) {
                return new C0081z(1, Arrays.asList((B[]) arrayList.toArray(new B[0])));
            }
            throw new Error("Invalid operator");
        }
        String str2 = (String) map.get("op");
        C0074s c0074s = (C0074s) map.get("fieldPath");
        Object obj = map.get("value");
        str2.getClass();
        switch (str2.hashCode()) {
            case -1039747489:
                if (str2.equals("not-in")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 60:
                if (str2.equals("<")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 62:
                break;
            case 1084:
                if (str2.equals("!=")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 1921:
                if (str2.equals("<=")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 1952:
                if (str2.equals("==")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 1983:
                if (str2.equals(">=")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 3365:
                if (str2.equals("in")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 135338771:
                if (str2.equals("array-contains")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 355289138:
                if (str2.equals("array-contains-any")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
                return new B4.A(c0074s, EnumC0176i.NOT_IN, (List) obj);
            case 1:
                return new B4.A(c0074s, EnumC0176i.LESS_THAN, obj);
            case 2:
                return new B4.A(c0074s, EnumC0176i.GREATER_THAN, obj);
            case 3:
                return new B4.A(c0074s, EnumC0176i.NOT_EQUAL, obj);
            case 4:
                return new B4.A(c0074s, EnumC0176i.LESS_THAN_OR_EQUAL, obj);
            case 5:
                return new B4.A(c0074s, EnumC0176i.EQUAL, obj);
            case 6:
                return new B4.A(c0074s, EnumC0176i.GREATER_THAN_OR_EQUAL, obj);
            case 7:
                return new B4.A(c0074s, EnumC0176i.IN, (List) obj);
            case '\b':
                return new B4.A(c0074s, EnumC0176i.ARRAY_CONTAINS, obj);
            case '\t':
                return new B4.A(c0074s, EnumC0176i.ARRAY_CONTAINS_ANY, (List) obj);
            default:
                throw new Error("Invalid operator");
        }
    }

    public static InterfaceC1290g W(InterfaceC1290g interfaceC1290g, InterfaceC1291h interfaceC1291h) {
        h.e(interfaceC1291h, "key");
        if (h.a(interfaceC1290g.getKey(), interfaceC1291h)) {
            return interfaceC1290g;
        }
        return null;
    }

    public static float X(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return V.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static boolean Z(byte b7) {
        return b7 > -65;
    }

    public static Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static boolean a0(C0177j c0177j, H4.d dVar) {
        if (c0177j == null) {
            return false;
        }
        if (!c0177j.f2201c.equals(dVar.f3310a)) {
            return false;
        }
        EnumC0176i enumC0176i = EnumC0176i.ARRAY_CONTAINS;
        EnumC0176i enumC0176i2 = c0177j.f2199a;
        return t.e.b(dVar.f3311b, 3) == (enumC0176i2.equals(enumC0176i) || enumC0176i2.equals(EnumC0176i.ARRAY_CONTAINS_ANY));
    }

    public static Object b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static boolean b0(E4.A a2, H4.d dVar) {
        if (!a2.f2085b.equals(dVar.f3310a)) {
            return false;
        }
        int i7 = dVar.f3311b;
        boolean b7 = t.e.b(i7, 1);
        int i8 = a2.f2084a;
        return (b7 && t.e.b(i8, 1)) || (t.e.b(i7, 2) && t.e.b(i8, 2));
    }

    public static final List c(Throwable th) {
        return AbstractC1160i.M0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public static int c0(Object obj, c0 c0Var, byte[] bArr, int i7, int i8, int i9, C0868d c0868d) {
        int J5 = ((com.google.crypto.tink.shaded.protobuf.T) c0Var).J(obj, bArr, i7, i8, i9, c0868d);
        c0868d.f11763c = obj;
        return J5;
    }

    public static void d(StringBuilder sb, Object obj) {
        int lastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static int d0(Object obj, c0 c0Var, byte[] bArr, int i7, int i8, C0868d c0868d) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = L(i10, bArr, i9, c0868d);
            i10 = c0868d.f11761a;
        }
        int i11 = i9;
        if (i10 < 0 || i10 > i8 - i11) {
            throw C.g();
        }
        int i12 = i10 + i11;
        c0Var.g(obj, bArr, i11, i12, c0868d);
        c0868d.f11763c = obj;
        return i12;
    }

    public static void e(String str, boolean z4, Object... objArr) {
        if (!z4) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static InterfaceC1292i e0(InterfaceC1290g interfaceC1290g, InterfaceC1291h interfaceC1291h) {
        h.e(interfaceC1291h, "key");
        return h.a(interfaceC1290g.getKey(), interfaceC1291h) ? C1293j.f14068a : interfaceC1290g;
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int g(Context context, String str) {
        int c3;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d7 = AbstractC0214j.d(str);
        if (d7 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                c3 = AbstractC0214j.c((AppOpsManager) AbstractC0214j.a(context, AppOpsManager.class), d7, packageName);
            } else if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager c4 = AbstractC0215k.c(context);
                c3 = AbstractC0215k.a(c4, d7, Binder.getCallingUid(), packageName);
                if (c3 == 0) {
                    c3 = AbstractC0215k.a(c4, d7, myUid, AbstractC0215k.b(context));
                }
            } else {
                c3 = AbstractC0214j.c((AppOpsManager) AbstractC0214j.a(context, AppOpsManager.class), d7, packageName);
            }
            if (c3 != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static float g0(EdgeEffect edgeEffect, float f7, float f8) {
        if (Build.VERSION.SDK_INT >= 31) {
            return V.e.c(edgeEffect, f7, f8);
        }
        V.d.a(edgeEffect, f7, f8);
        return f7;
    }

    public static final C1112e h(Throwable th) {
        h.e(th, SentryEvent.JsonKeys.EXCEPTION);
        return new C1112e(th);
    }

    public static ArrayList h0(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C0074s.b((String[]) ((List) it.next()).toArray(new String[0])));
        }
        return arrayList;
    }

    public static int i(int i7, byte[] bArr, int i8, int i9, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        AbstractC0869e abstractC0869e = (AbstractC0869e) interfaceC0889z;
        int O7 = O(bArr, i8, c0868d);
        abstractC0869e.t(c0868d.f11762b != 0);
        while (O7 < i9) {
            int M7 = M(bArr, O7, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            O7 = O(bArr, M7, c0868d);
            abstractC0869e.t(c0868d.f11762b != 0);
        }
        return O7;
    }

    public static int i0(int i7) {
        int e7 = t.e.e(i7);
        if (e7 == 0) {
            return 1;
        }
        if (e7 == 1) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown ListenSource value: ".concat(i7 != 1 ? i7 != 2 ? "null" : "CACHE" : "DEFAULT_SOURCE"));
    }

    public static int j(byte[] bArr, int i7, C0868d c0868d) {
        int M7 = M(bArr, i7, c0868d);
        int i8 = c0868d.f11761a;
        if (i8 < 0) {
            throw C.e();
        }
        if (i8 > bArr.length - M7) {
            throw C.g();
        }
        if (i8 == 0) {
            c0868d.f11763c = AbstractC0873i.f11779b;
            return M7;
        }
        c0868d.f11763c = AbstractC0873i.t(bArr, M7, i8);
        return M7 + i8;
    }

    public static EnumC0071o j0(int i7) {
        EnumC0071o enumC0071o = EnumC0071o.f1181a;
        if (i7 == 0) {
            return enumC0071o;
        }
        int e7 = t.e.e(i7);
        if (e7 == 0) {
            return enumC0071o;
        }
        if (e7 == 1) {
            return EnumC0071o.f1182b;
        }
        if (e7 == 2) {
            return EnumC0071o.f1183c;
        }
        throw new IllegalArgumentException("Unknown server timestamp behavior: ".concat(i7 != 1 ? i7 != 2 ? i7 != 3 ? "null" : "PREVIOUS" : "ESTIMATE" : "NONE"));
    }

    public static int k(int i7, byte[] bArr, int i8, int i9, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        int M7 = M(bArr, i8, c0868d);
        int i10 = c0868d.f11761a;
        if (i10 < 0) {
            throw C.e();
        }
        if (i10 > bArr.length - M7) {
            throw C.g();
        }
        if (i10 == 0) {
            interfaceC0889z.add(AbstractC0873i.f11779b);
        } else {
            interfaceC0889z.add(AbstractC0873i.t(bArr, M7, i10));
            M7 += i10;
        }
        while (M7 < i9) {
            int M8 = M(bArr, M7, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            M7 = M(bArr, M8, c0868d);
            int i11 = c0868d.f11761a;
            if (i11 < 0) {
                throw C.e();
            }
            if (i11 > bArr.length - M7) {
                throw C.g();
            }
            if (i11 == 0) {
                interfaceC0889z.add(AbstractC0873i.f11779b);
            } else {
                interfaceC0889z.add(AbstractC0873i.t(bArr, M7, i11));
                M7 += i11;
            }
        }
        return M7;
    }

    public static int k0(int i7) {
        int e7 = t.e.e(i7);
        if (e7 == 0) {
            return 1;
        }
        if (e7 == 1) {
            return 2;
        }
        if (e7 == 2) {
            return 3;
        }
        throw new IllegalArgumentException("Unknown source: ".concat(i7 != 1 ? i7 != 2 ? i7 != 3 ? "null" : "CACHE" : "SERVER" : "SERVER_AND_CACHE"));
    }

    public static double l(int i7, byte[] bArr) {
        return Double.longBitsToDouble(p(i7, bArr));
    }

    public static Z l0(FirebaseFirestore firebaseFirestore, String str, boolean z4, t tVar) {
        try {
            Z c3 = z4 ? firebaseFirestore.c(str) : firebaseFirestore.b(str);
            if (tVar == null) {
                return c3;
            }
            Map map = tVar.f3413i;
            if (map != null) {
                c3 = c3.j(V(map));
            }
            List<List> list = tVar.f3405a;
            Objects.requireNonNull(list);
            for (List list2 : list) {
                C0074s c0074s = (C0074s) list2.get(0);
                String str2 = (String) list2.get(1);
                Object obj = list2.get(2);
                if ("==".equals(str2)) {
                    c3.getClass();
                    c3 = c3.j(new B4.A(c0074s, EnumC0176i.EQUAL, obj));
                } else if ("!=".equals(str2)) {
                    c3.getClass();
                    c3 = c3.j(new B4.A(c0074s, EnumC0176i.NOT_EQUAL, obj));
                } else if ("<".equals(str2)) {
                    c3.getClass();
                    c3 = c3.j(new B4.A(c0074s, EnumC0176i.LESS_THAN, obj));
                } else if ("<=".equals(str2)) {
                    c3.getClass();
                    c3 = c3.j(new B4.A(c0074s, EnumC0176i.LESS_THAN_OR_EQUAL, obj));
                } else if (">".equals(str2)) {
                    c3.getClass();
                    c3 = c3.j(new B4.A(c0074s, EnumC0176i.GREATER_THAN, obj));
                } else if (">=".equals(str2)) {
                    c3.getClass();
                    c3 = c3.j(new B4.A(c0074s, EnumC0176i.GREATER_THAN_OR_EQUAL, obj));
                } else if ("array-contains".equals(str2)) {
                    c3.getClass();
                    c3 = c3.j(new B4.A(c0074s, EnumC0176i.ARRAY_CONTAINS, obj));
                } else if ("array-contains-any".equals(str2)) {
                    c3.getClass();
                    c3 = c3.j(new B4.A(c0074s, EnumC0176i.ARRAY_CONTAINS_ANY, (List) obj));
                } else if ("in".equals(str2)) {
                    c3.getClass();
                    c3 = c3.j(new B4.A(c0074s, EnumC0176i.IN, (List) obj));
                } else if ("not-in".equals(str2)) {
                    c3.getClass();
                    c3 = c3.j(new B4.A(c0074s, EnumC0176i.NOT_IN, (List) obj));
                } else {
                    Log.w("FLTFirestoreMsgCodec", "An invalid query operator " + str2 + " was received but not handled.");
                }
            }
            Long l7 = tVar.f3407c;
            if (l7 != null) {
                c3 = c3.d(l7.longValue());
            }
            Long l8 = tVar.f3408d;
            if (l8 != null) {
                c3 = c3.e(l8.longValue());
            }
            List<List> list3 = tVar.f3406b;
            if (list3 == null) {
                return c3;
            }
            for (List list4 : list3) {
                c3 = c3.f((C0074s) list4.get(0), ((Boolean) list4.get(1)).booleanValue() ? 2 : 1);
            }
            List list5 = tVar.f3409e;
            if (list5 != null) {
                Object[] array = list5.toArray();
                Objects.requireNonNull(array);
                C0170c b7 = c3.b("startAt", true, array);
                E4.C c4 = c3.f1135a;
                c3 = new Z(new E4.C(c4.f2095f, c4.f2096g, c4.f2094e, c4.f2090a, c4.f2097h, c4.f2098i, b7, c4.f2099k), c3.f1136b);
            }
            List list6 = tVar.f3410f;
            if (list6 != null) {
                Object[] array2 = list6.toArray();
                Objects.requireNonNull(array2);
                C0170c b8 = c3.b("startAfter", false, array2);
                E4.C c7 = c3.f1135a;
                c3 = new Z(new E4.C(c7.f2095f, c7.f2096g, c7.f2094e, c7.f2090a, c7.f2097h, c7.f2098i, b8, c7.f2099k), c3.f1136b);
            }
            List list7 = tVar.f3411g;
            if (list7 != null) {
                Object[] array3 = list7.toArray();
                Objects.requireNonNull(array3);
                C0170c b9 = c3.b("endAt", true, array3);
                E4.C c8 = c3.f1135a;
                c3 = new Z(new E4.C(c8.f2095f, c8.f2096g, c8.f2094e, c8.f2090a, c8.f2097h, c8.f2098i, c8.j, b9), c3.f1136b);
            }
            List list8 = tVar.f3412h;
            if (list8 == null) {
                return c3;
            }
            Object[] array4 = list8.toArray();
            Objects.requireNonNull(array4);
            C0170c b10 = c3.b("endBefore", false, array4);
            E4.C c9 = c3.f1135a;
            return new Z(new E4.C(c9.f2095f, c9.f2096g, c9.f2094e, c9.f2090a, c9.f2097h, c9.f2098i, c9.j, b10), c3.f1136b);
        } catch (Exception e7) {
            Log.e("FLTFirestoreMsgCodec", "An error occurred while parsing query arguments, this is most likely an error with this SDK.", e7);
            return null;
        }
    }

    public static int m(int i7, byte[] bArr, int i8, int i9, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        AbstractC0877m abstractC0877m = (AbstractC0877m) interfaceC0889z;
        abstractC0877m.t(l(i8, bArr));
        int i10 = i8 + 8;
        while (i10 < i9) {
            int M7 = M(bArr, i10, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            abstractC0877m.t(Double.longBitsToDouble(p(M7, bArr)));
            i10 = M7 + 8;
        }
        return i10;
    }

    public static InterfaceC1292i m0(InterfaceC1290g interfaceC1290g, InterfaceC1292i interfaceC1292i) {
        h.e(interfaceC1292i, "context");
        return interfaceC1292i == C1293j.f14068a ? interfaceC1290g : (InterfaceC1292i) interfaceC1292i.fold(interfaceC1290g, new C1285b(1));
    }

    public static int n(int i7, byte[] bArr) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public static P2 n0(C0095a c0095a) {
        c0095a.E(1);
        int v6 = c0095a.v();
        long j = c0095a.f1463a + v6;
        int i7 = v6 / 18;
        long[] jArr = new long[i7];
        long[] jArr2 = new long[i7];
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                break;
            }
            long n2 = c0095a.n();
            if (n2 == -1) {
                jArr = Arrays.copyOf(jArr, i8);
                jArr2 = Arrays.copyOf(jArr2, i8);
                break;
            }
            jArr[i8] = n2;
            jArr2[i8] = c0095a.n();
            c0095a.E(2);
            i8++;
        }
        c0095a.E((int) (j - c0095a.f1463a));
        return new P2(8, jArr, jArr2, false);
    }

    public static int o(int i7, byte[] bArr, int i8, int i9, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        AbstractC0887x abstractC0887x = (AbstractC0887x) interfaceC0889z;
        abstractC0887x.t(n(i8, bArr));
        int i10 = i8 + 4;
        while (i10 < i9) {
            int M7 = M(bArr, i10, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            abstractC0887x.t(n(M7, bArr));
            i10 = M7 + 4;
        }
        return i10;
    }

    public static void o0(f fVar, final C0413i c0413i) {
        I4.j jVar;
        h.e(fVar, "binaryMessenger");
        n c0406b = (c0413i == null || (jVar = c0413i.f6174a) == null) ? new C0406b() : jVar.a();
        Object obj = null;
        F0 f02 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedBy", c0406b, obj, 1);
        if (c0413i != null) {
            final int i7 = 0;
            f02.M(new b() { // from class: R5.G
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    X509Certificate x509Certificate;
                    switch (i7) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c0413i2.getClass();
                                w02 = Y4.D.D(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0413i3.getClass();
                                w03 = Y4.D.D(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c0413i4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                w04 = Y4.D.D(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c0413i5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                w05 = Y4.D.D(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        default:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c0413i6.f6174a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                w06 = Y4.D.D(x509Certificate);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                    }
                }
            });
        } else {
            f02.M(null);
        }
        F0 f03 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedTo", c0406b, obj, 1);
        if (c0413i != null) {
            final int i8 = 1;
            f03.M(new b() { // from class: R5.G
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    X509Certificate x509Certificate;
                    switch (i8) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c0413i2.getClass();
                                w02 = Y4.D.D(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0413i3.getClass();
                                w03 = Y4.D.D(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c0413i4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                w04 = Y4.D.D(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c0413i5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                w05 = Y4.D.D(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        default:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c0413i6.f6174a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                w06 = Y4.D.D(x509Certificate);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                    }
                }
            });
        } else {
            f03.M(null);
        }
        F0 f04 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotAfterMsSinceEpoch", c0406b, obj, 1);
        if (c0413i != null) {
            final int i9 = 2;
            f04.M(new b() { // from class: R5.G
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    X509Certificate x509Certificate;
                    switch (i9) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c0413i2.getClass();
                                w02 = Y4.D.D(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0413i3.getClass();
                                w03 = Y4.D.D(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c0413i4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                w04 = Y4.D.D(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c0413i5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                w05 = Y4.D.D(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        default:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c0413i6.f6174a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                w06 = Y4.D.D(x509Certificate);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                    }
                }
            });
        } else {
            f04.M(null);
        }
        F0 f05 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotBeforeMsSinceEpoch", c0406b, obj, 1);
        if (c0413i != null) {
            final int i10 = 3;
            f05.M(new b() { // from class: R5.G
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    X509Certificate x509Certificate;
                    switch (i10) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c0413i2.getClass();
                                w02 = Y4.D.D(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0413i3.getClass();
                                w03 = Y4.D.D(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c0413i4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                w04 = Y4.D.D(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c0413i5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                w05 = Y4.D.D(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        default:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c0413i6.f6174a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                w06 = Y4.D.D(x509Certificate);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                    }
                }
            });
        } else {
            f05.M(null);
        }
        F0 f06 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getX509Certificate", c0406b, obj, 1);
        if (c0413i == null) {
            f06.M(null);
        } else {
            final int i11 = 4;
            f06.M(new b() { // from class: R5.G
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    X509Certificate x509Certificate;
                    switch (i11) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                c0413i2.getClass();
                                w02 = Y4.D.D(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0413i3.getClass();
                                w03 = Y4.D.D(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                c0413i4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                w04 = Y4.D.D(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0413i c0413i5 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                c0413i5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                w05 = Y4.D.D(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        default:
                            C0413i c0413i6 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                c0413i6.f6174a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                w06 = Y4.D.D(x509Certificate);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                    }
                }
            });
        }
    }

    public static long p(int i7, byte[] bArr) {
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public static final void p0(Object obj) {
        if (obj instanceof C1112e) {
            throw ((C1112e) obj).f13002a;
        }
    }

    public static int q(int i7, byte[] bArr, int i8, int i9, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        J j = (J) interfaceC0889z;
        j.t(p(i8, bArr));
        int i10 = i8 + 8;
        while (i10 < i9) {
            int M7 = M(bArr, i10, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            j.t(p(M7, bArr));
            i10 = M7 + 8;
        }
        return i10;
    }

    public static H5.o q0(C0065i c0065i, EnumC0071o enumC0071o) {
        int i7 = c0065i.f1162a;
        int e7 = t.e.e(i7);
        int i8 = 1;
        if (e7 != 0) {
            if (e7 == 1) {
                i8 = 2;
            } else {
                if (e7 != 2) {
                    throw new IllegalArgumentException("Unknown change type: ".concat(i7 != 1 ? i7 != 2 ? i7 != 3 ? "null" : "REMOVED" : "MODIFIED" : "ADDED"));
                }
                i8 = 3;
            }
        }
        Long valueOf = Long.valueOf(c0065i.f1164c);
        Long valueOf2 = Long.valueOf(c0065i.f1165d);
        q r02 = r0(c0065i.f1163b, enumC0071o);
        H5.o oVar = new H5.o();
        if (i8 == 0) {
            throw new IllegalStateException("Nonnull field \"type\" is null.");
        }
        oVar.f3389a = i8;
        oVar.f3390b = r02;
        oVar.f3391c = valueOf;
        oVar.f3392d = valueOf2;
        return oVar;
    }

    public static float r(int i7, byte[] bArr) {
        return Float.intBitsToFloat(n(i7, bArr));
    }

    public static q r0(C0072p c0072p, EnumC0071o enumC0071o) {
        v t02 = t0(c0072p.f1189d);
        HashMap a2 = c0072p.a(enumC0071o);
        H4.h hVar = c0072p.f1187b;
        hVar.getClass();
        String c3 = hVar.f3318a.c();
        q qVar = new q();
        if (c3 == null) {
            throw new IllegalStateException("Nonnull field \"path\" is null.");
        }
        qVar.f3395a = c3;
        qVar.f3396b = a2;
        qVar.f3397c = t02;
        return qVar;
    }

    public static int s(int i7, byte[] bArr, int i8, int i9, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        AbstractC0882s abstractC0882s = (AbstractC0882s) interfaceC0889z;
        abstractC0882s.t(r(i8, bArr));
        int i10 = i8 + 4;
        while (i10 < i9) {
            int M7 = M(bArr, i10, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            abstractC0882s.t(Float.intBitsToFloat(n(M7, bArr)));
            i10 = M7 + 4;
        }
        return i10;
    }

    public static u s0(B4.c0 c0Var, EnumC0071o enumC0071o) {
        v t02 = t0(c0Var.f1145f);
        List l7 = c0Var.l();
        ArrayList arrayList = new ArrayList(l7.size());
        Iterator it = l7.iterator();
        while (it.hasNext()) {
            arrayList.add(q0((C0065i) it.next(), enumC0071o));
        }
        ArrayList m7 = c0Var.m();
        ArrayList arrayList2 = new ArrayList(m7.size());
        Iterator it2 = m7.iterator();
        while (it2.hasNext()) {
            arrayList2.add(r0((C0072p) it2.next(), enumC0071o));
        }
        u uVar = new u();
        uVar.f3414a = arrayList2;
        uVar.f3415b = arrayList;
        uVar.f3416c = t02;
        return uVar;
    }

    public static int t(c0 c0Var, int i7, byte[] bArr, int i8, int i9, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        int i10 = (i7 & (-8)) | 4;
        Object d7 = c0Var.d();
        int c0 = c0(d7, c0Var, bArr, i8, i9, i10, c0868d);
        c0Var.b(d7);
        c0868d.f11763c = d7;
        interfaceC0889z.add(d7);
        while (c0 < i9) {
            int M7 = M(bArr, c0, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            Object d8 = c0Var.d();
            int c02 = c0(d8, c0Var, bArr, M7, i9, i10, c0868d);
            c0Var.b(d8);
            c0868d.f11763c = d8;
            interfaceC0889z.add(d8);
            c0 = c02;
        }
        return c0;
    }

    public static v t0(B4.f0 f0Var) {
        Boolean valueOf = Boolean.valueOf(f0Var.f1157a);
        Boolean valueOf2 = Boolean.valueOf(f0Var.f1158b);
        v vVar = new v();
        vVar.f3417a = valueOf;
        vVar.f3418b = valueOf2;
        return vVar;
    }

    public static int u(c0 c0Var, int i7, byte[] bArr, int i8, int i9, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        Object d7 = c0Var.d();
        int d02 = d0(d7, c0Var, bArr, i8, i9, c0868d);
        c0Var.b(d7);
        c0868d.f11763c = d7;
        interfaceC0889z.add(d7);
        while (d02 < i9) {
            int M7 = M(bArr, d02, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            Object d8 = c0Var.d();
            int d03 = d0(d8, c0Var, bArr, M7, i9, c0868d);
            c0Var.b(d8);
            c0868d.f11763c = d8;
            interfaceC0889z.add(d8);
            d02 = d03;
        }
        return d02;
    }

    public static D3.j u0(Object obj) {
        return new D3.j(obj.getClass().getSimpleName());
    }

    public static int v(byte[] bArr, int i7, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        AbstractC0869e abstractC0869e = (AbstractC0869e) interfaceC0889z;
        int M7 = M(bArr, i7, c0868d);
        int i8 = c0868d.f11761a + M7;
        while (M7 < i8) {
            M7 = O(bArr, M7, c0868d);
            abstractC0869e.t(c0868d.f11762b != 0);
        }
        if (M7 == i8) {
            return M7;
        }
        throw C.g();
    }

    public static ArrayList v0(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof C0203v) {
            C0203v c0203v = (C0203v) th;
            arrayList.add(c0203v.f2410a);
            arrayList.add(c0203v.getMessage());
            arrayList.add(c0203v.f2411b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }

    public static int w(byte[] bArr, int i7, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        AbstractC0877m abstractC0877m = (AbstractC0877m) interfaceC0889z;
        int M7 = M(bArr, i7, c0868d);
        int i8 = c0868d.f11761a + M7;
        while (M7 < i8) {
            abstractC0877m.t(Double.longBitsToDouble(p(M7, bArr)));
            M7 += 8;
        }
        if (M7 == i8) {
            return M7;
        }
        throw C.g();
    }

    public static List w0(Throwable th) {
        if (th instanceof C0405a) {
            C0405a c0405a = (C0405a) th;
            return AbstractC1160i.M0(c0405a.f6128a, c0405a.f6129b, c0405a.f6130c);
        }
        return AbstractC1160i.M0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public static int x(byte[] bArr, int i7, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        AbstractC0887x abstractC0887x = (AbstractC0887x) interfaceC0889z;
        int M7 = M(bArr, i7, c0868d);
        int i8 = c0868d.f11761a + M7;
        while (M7 < i8) {
            abstractC0887x.t(n(M7, bArr));
            M7 += 4;
        }
        if (M7 == i8) {
            return M7;
        }
        throw C.g();
    }

    public static void x0(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static int y(byte[] bArr, int i7, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        J j = (J) interfaceC0889z;
        int M7 = M(bArr, i7, c0868d);
        int i8 = c0868d.f11761a + M7;
        while (M7 < i8) {
            j.t(p(M7, bArr));
            M7 += 8;
        }
        if (M7 == i8) {
            return M7;
        }
        throw C.g();
    }

    public static Status y0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499, null, null, null);
        }
        String[] split = str.split(":", 2);
        split[0] = split[0].trim();
        if (split.length > 1 && (str2 = split[1]) != null) {
            split[1] = str2.trim();
        }
        List asList = Arrays.asList(split);
        return asList.size() > 1 ? z0((String) asList.get(0), (String) asList.get(1)) : z0((String) asList.get(0), null);
    }

    public static int z(byte[] bArr, int i7, InterfaceC0889z interfaceC0889z, C0868d c0868d) {
        AbstractC0882s abstractC0882s = (AbstractC0882s) interfaceC0889z;
        int M7 = M(bArr, i7, c0868d);
        int i8 = c0868d.f11761a + M7;
        while (M7 < i8) {
            abstractC0882s.t(Float.intBitsToFloat(n(M7, bArr)));
            M7 += 4;
        }
        if (M7 == i8) {
            return M7;
        }
        throw C.g();
    }

    public static Status z0(String str, String str2) {
        int i7;
        str.getClass();
        switch (str) {
            case "USER_CANCELLED":
                i7 = 18001;
                break;
            case "INVALID_RECIPIENT_EMAIL":
                i7 = 17033;
                break;
            case "WEB_CONTEXT_ALREADY_PRESENTED":
                i7 = 17057;
                break;
            case "INTERNAL_SUCCESS_SIGN_OUT":
                i7 = 17091;
                break;
            case "INVALID_IDP_RESPONSE":
            case "INVALID_LOGIN_CREDENTIALS":
            case "INVALID_PENDING_TOKEN":
                i7 = 17004;
                break;
            case "DYNAMIC_LINK_NOT_ACTIVATED":
                i7 = 17068;
                break;
            case "QUOTA_EXCEEDED":
                i7 = 17052;
                break;
            case "WEB_NETWORK_REQUEST_FAILED":
                i7 = 17061;
                break;
            case "INVALID_RECAPTCHA_VERSION":
                i7 = 17206;
                break;
            case "RECAPTCHA_NOT_ENABLED":
                i7 = 17200;
                break;
            case "EXPIRED_OOB_CODE":
                i7 = 17029;
                break;
            case "UNAUTHORIZED_DOMAIN":
                i7 = 17038;
                break;
            case "INVALID_OOB_CODE":
                i7 = 17030;
                break;
            case "MISSING_EMAIL":
                i7 = 17034;
                break;
            case "INVALID_CODE":
                i7 = 17044;
                break;
            case "INVALID_HOSTING_LINK_DOMAIN":
                i7 = 17214;
                break;
            case "TOKEN_EXPIRED":
                i7 = 17021;
                break;
            case "INVALID_TENANT_ID":
                i7 = 17079;
                break;
            case "ALTERNATE_CLIENT_IDENTIFIER_REQUIRED":
                i7 = 18002;
                break;
            case "INVALID_SESSION_INFO":
                i7 = 17046;
                break;
            case "SECOND_FACTOR_EXISTS":
                i7 = 17087;
                break;
            case "INVALID_EMAIL":
            case "INVALID_IDENTIFIER":
                i7 = 17008;
                break;
            case "ADMIN_ONLY_OPERATION":
                i7 = 17085;
                break;
            case "MISSING_OR_INVALID_NONCE":
                i7 = 17094;
                break;
            case "INVALID_CERT_HASH":
                i7 = 17064;
                break;
            case "NO_SUCH_PROVIDER":
                i7 = 17016;
                break;
            case "MFA_ENROLLMENT_NOT_FOUND":
                i7 = 17084;
                break;
            case "MISSING_PASSWORD":
                i7 = 17035;
                break;
            case "CREDENTIAL_TOO_OLD_LOGIN_AGAIN":
                i7 = 17014;
                break;
            case "TIMEOUT":
            case "<<Network Error>>":
                i7 = 17020;
                break;
            case "INVALID_REQ_TYPE":
                i7 = 17207;
                break;
            case "INVALID_RECAPTCHA_ACTION":
                i7 = 17203;
                break;
            case "OPERATION_NOT_ALLOWED":
            case "PASSWORD_LOGIN_DISABLED":
                i7 = 17006;
                break;
            case "WEB_INTERNAL_ERROR":
                i7 = 17062;
                break;
            case "SECOND_FACTOR_LIMIT_EXCEEDED":
                i7 = 17088;
                break;
            case "MISSING_MFA_ENROLLMENT_ID":
                i7 = 17082;
                break;
            case "USER_NOT_FOUND":
            case "EMAIL_NOT_FOUND":
                i7 = 17011;
                break;
            case "CAPTCHA_CHECK_FAILED":
                i7 = 17056;
                break;
            case "WEAK_PASSWORD":
                i7 = 17026;
                break;
            case "UNSUPPORTED_FIRST_FACTOR":
                i7 = 17089;
                break;
            case "INVALID_SENDER":
                i7 = 17032;
                break;
            case "MISSING_PHONE_NUMBER":
                i7 = 17041;
                break;
            case "INVALID_DYNAMIC_LINK_DOMAIN":
                i7 = 17074;
                break;
            case "MISSING_MFA_PENDING_CREDENTIAL":
                i7 = 17081;
                break;
            case "UNSUPPORTED_PASSTHROUGH_OPERATION":
                i7 = 17095;
                break;
            case "EMAIL_EXISTS":
                i7 = 17007;
                break;
            case "INVALID_ID_TOKEN":
                i7 = 17017;
                break;
            case "WEB_STORAGE_UNSUPPORTED":
                i7 = 17065;
                break;
            case "MISSING_CLIENT_TYPE":
                i7 = 17204;
                break;
            case "MISSING_RECAPTCHA_VERSION":
                i7 = 17205;
                break;
            case "UNVERIFIED_EMAIL":
                i7 = 17086;
                break;
            case "REJECTED_CREDENTIAL":
                i7 = 17075;
                break;
            case "INVALID_MFA_PENDING_CREDENTIAL":
                i7 = 17083;
                break;
            case "INVALID_VERIFICATION_PROOF":
                i7 = 17049;
                break;
            case "INVALID_PROVIDER_ID":
                i7 = 17071;
                break;
            case "CREDENTIAL_MISMATCH":
                i7 = 17002;
                break;
            case "WEB_CONTEXT_CANCELED":
                i7 = 17058;
                break;
            case "REQUIRES_SECOND_FACTOR_AUTH":
                i7 = 17078;
                break;
            case "MISSING_CLIENT_IDENTIFIER":
                i7 = 17093;
                break;
            case "INVALID_MESSAGE_PAYLOAD":
                i7 = 17031;
                break;
            case "RESET_PASSWORD_EXCEED_LIMIT":
            case "TOO_MANY_ATTEMPTS_TRY_LATER":
                i7 = 17010;
                break;
            case "INVALID_CUSTOM_TOKEN":
                i7 = 17000;
                break;
            case "INVALID_PASSWORD":
                i7 = 17009;
                break;
            case "INVALID_RECAPTCHA_TOKEN":
                i7 = 17202;
                break;
            case "SESSION_EXPIRED":
                i7 = 17051;
                break;
            case "MISSING_CODE":
                i7 = 17043;
                break;
            case "FEDERATED_USER_ID_ALREADY_LINKED":
                i7 = 17025;
                break;
            case "MISSING_RECAPTCHA_TOKEN":
                i7 = 17201;
                break;
            case "USER_DISABLED":
                i7 = 17005;
                break;
            case "INVALID_PHONE_NUMBER":
                i7 = 17042;
                break;
            case "INVALID_APP_CREDENTIAL":
                i7 = 17028;
                break;
            case "MISSING_CONTINUE_URI":
                i7 = 17040;
                break;
            case "MISSING_SESSION_INFO":
                i7 = 17045;
                break;
            case "EMAIL_CHANGE_NEEDS_VERIFICATION":
                i7 = 17090;
                break;
            case "UNSUPPORTED_TENANT_OPERATION":
                i7 = 17073;
                break;
            default:
                i7 = 17499;
                break;
        }
        return i7 == 17499 ? str2 != null ? new Status(i7, k.f(str, ":", str2), null, null) : new Status(i7, str, null, null) : new Status(i7, str2, null, null);
    }

    public abstract AbstractC0603a Y(c cVar);

    public abstract r f0();
}
