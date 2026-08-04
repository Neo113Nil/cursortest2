package p003a;

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
import com.google.crypto.tink.shaded.protobuf.AbstractC0825e;
import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.crypto.tink.shaded.protobuf.AbstractC0833m;
import com.google.crypto.tink.shaded.protobuf.AbstractC0838s;
import com.google.crypto.tink.shaded.protobuf.AbstractC0843x;
import com.google.crypto.tink.shaded.protobuf.C;
import com.google.crypto.tink.shaded.protobuf.C0824d;
import com.google.crypto.tink.shaded.protobuf.InterfaceC0845z;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.c0;
import com.google.crypto.tink.shaded.protobuf.f0;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.firebase.firestore.FirebaseFirestore;
import com.salamadev.nabilalawadi.kisaskoran.R;
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
import org.json.JSONException;
import org.json.JSONObject;
import p031e1.k;
import p050g6.i;
import p065i6.g;
import p085l6.b;
import p155w1.F0;
import p155w1.P2;
import p155w1.V0;
import t6.h;
import v4.c;
import v4.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f7923a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f7924b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f7925c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Field f7926d;

    public static int A(byte[] bArr, int i7, InterfaceC0845z interfaceC0845z, C0824d c0824d) throws C {
        AbstractC0843x abstractC0843x = (AbstractC0843x) interfaceC0845z;
        int iM = M(bArr, i7, c0824d);
        int i8 = c0824d.f11761a + iM;
        while (iM < i8) {
            iM = M(bArr, iM, c0824d);
            abstractC0843x.t(e.d(c0824d.f11761a));
        }
        if (iM == i8) {
            return iM;
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

    public static int B(byte[] bArr, int i7, InterfaceC0845z interfaceC0845z, C0824d c0824d) throws C {
        J j = (J) interfaceC0845z;
        int iM = M(bArr, i7, c0824d);
        int i8 = c0824d.f11761a + iM;
        while (iM < i8) {
            iM = O(bArr, iM, c0824d);
            j.t(e.e(c0824d.f11762b));
        }
        if (iM == i8) {
            return iM;
        }
        throw C.g();
    }

    public static JSONObject B0(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    int i7 = point2.x;
                    C0252s c0252s = C0252s.f2717f;
                    jSONObject3.put("x", c0252s.f2718a.g(i7, context));
                    jSONObject3.put("y", c0252s.f2718a.g(point2.y, context));
                    jSONObject3.put("start_x", c0252s.f2718a.g(point.x, context));
                    jSONObject3.put("start_y", c0252s.f2718a.g(point.y, context));
                    jSONObject = jSONObject3;
                } catch (JSONException e7) {
                    int i8 = I2.J.f3546b;
                    j.e("Error occurred while putting signals into JSON object.", e7);
                }
                jSONObject2.put("click_point", jSONObject);
                jSONObject2.put("asset_id", str);
                return jSONObject2;
            } catch (Exception e8) {
                e = e8;
                jSONObject = jSONObject2;
                int i9 = I2.J.f3546b;
                j.e("Error occurred while grabbing click signals.", e);
                return jSONObject;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public static int C(byte[] bArr, int i7, InterfaceC0845z interfaceC0845z, C0824d c0824d) throws C {
        AbstractC0843x abstractC0843x = (AbstractC0843x) interfaceC0845z;
        int iM = M(bArr, i7, c0824d);
        int i8 = c0824d.f11761a + iM;
        while (iM < i8) {
            iM = M(bArr, iM, c0824d);
            abstractC0843x.t(c0824d.f11761a);
        }
        if (iM == i8) {
            return iM;
        }
        throw C.g();
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01cc  */
    public static JSONObject C0(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        Map map3;
        int[] iArr;
        JSONObject jSONObject;
        boolean z4;
        Map map4 = map2;
        JSONObject jSONObject2 = new JSONObject();
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
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    Iterator it2 = it;
                    try {
                        int measuredWidth = view2.getMeasuredWidth();
                        JSONObject jSONObject5 = jSONObject2;
                        try {
                            C0252s c0252s = C0252s.f2717f;
                            try {
                                d dVar = c0252s.f2718a;
                                d dVar2 = c0252s.f2718a;
                                jSONObject4.put("width", dVar.g(measuredWidth, context));
                                jSONObject4.put("height", dVar2.g(view2.getMeasuredHeight(), context));
                                jSONObject4.put("x", dVar2.g(iArr3[0] - iArr2[0], context));
                                jSONObject4.put("y", dVar2.g(iArr3[1] - iArr2[1], context));
                                jSONObject4.put("relative_to", "ad_view");
                                jSONObject3.put("frame", jSONObject4);
                                Rect rect = new Rect();
                                if (view2.getLocalVisibleRect(rect)) {
                                    jSONObject = I0(context, rect);
                                } else {
                                    jSONObject = new JSONObject();
                                    jSONObject.put("width", 0);
                                    jSONObject.put("height", 0);
                                    jSONObject.put("x", dVar2.g(iArr3[0] - iArr2[0], context));
                                    jSONObject.put("y", dVar2.g(iArr3[1] - iArr2[1], context));
                                    jSONObject.put("relative_to", "ad_view");
                                }
                                jSONObject3.put("visible_bounds", jSONObject);
                                if (((String) entry.getKey()).equals("3010")) {
                                    zzbbp zzbbpVar = zzbby.zzhV;
                                    C0254t c0254t = C0254t.f2723d;
                                    zzbbw zzbbwVar = c0254t.f2726c;
                                    zzbbw zzbbwVar2 = c0254t.f2726c;
                                    if (((Boolean) zzbbwVar.zzb(zzbbpVar)).booleanValue()) {
                                        jSONObject3.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                                    }
                                    if (((Boolean) zzbbwVar2.zzb(zzbby.zzhW)).booleanValue()) {
                                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                        jSONObject3.put("view_width_layout_type", J0(layoutParams.width) - 1);
                                        jSONObject3.put("view_height_layout_type", J0(layoutParams.height) - 1);
                                    }
                                    if (((Boolean) zzbbwVar2.zzb(zzbby.zzhX)).booleanValue()) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(Integer.valueOf(view2.getId()));
                                        for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                            arrayList.add(Integer.valueOf(((View) parent).getId()));
                                        }
                                        jSONObject3.put("view_path", TextUtils.join("/", arrayList));
                                    }
                                    if (scaleType != null) {
                                        jSONObject3.put("mediaview_scale_type", scaleType.ordinal());
                                    }
                                }
                                if (view2 instanceof TextView) {
                                    try {
                                        TextView textView = (TextView) view2;
                                        jSONObject3.put("text_color", textView.getCurrentTextColor());
                                        iArr = iArr2;
                                        try {
                                            jSONObject3.put("font_size", textView.getTextSize());
                                            jSONObject3.put("text", textView.getText());
                                        } catch (JSONException unused) {
                                            map3 = map2;
                                            jSONObject2 = jSONObject5;
                                            int i8 = I2.J.f3546b;
                                            j.g("Unable to get asset views information");
                                            map4 = map3;
                                            iArr2 = iArr;
                                            i7 = 2;
                                            it = it2;
                                        }
                                    } catch (JSONException unused2) {
                                        iArr = iArr2;
                                    }
                                } else {
                                    iArr = iArr2;
                                }
                                map3 = map2;
                                if (map3 != null) {
                                    try {
                                        if (map3.containsKey(entry.getKey()) && view2.isClickable()) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                    } catch (JSONException unused3) {
                                        jSONObject2 = jSONObject5;
                                        int i9 = I2.J.f3546b;
                                        j.g("Unable to get asset views information");
                                        map4 = map3;
                                        iArr2 = iArr;
                                        i7 = 2;
                                        it = it2;
                                    }
                                } else {
                                    z4 = false;
                                }
                                jSONObject3.put("is_clickable", z4);
                                jSONObject2 = jSONObject5;
                                try {
                                    jSONObject2.put((String) entry.getKey(), jSONObject3);
                                } catch (JSONException unused4) {
                                    int i10 = I2.J.f3546b;
                                    j.g("Unable to get asset views information");
                                }
                            } catch (JSONException unused5) {
                                map3 = map2;
                                iArr = iArr2;
                                jSONObject2 = jSONObject5;
                                int i11 = I2.J.f3546b;
                                j.g("Unable to get asset views information");
                                map4 = map3;
                                iArr2 = iArr;
                                i7 = 2;
                                it = it2;
                            }
                        } catch (JSONException unused6) {
                            map3 = map4;
                        }
                    } catch (JSONException unused7) {
                        map3 = map4;
                        iArr = iArr2;
                    }
                    map4 = map3;
                    iArr2 = iArr;
                    i7 = 2;
                    it = it2;
                }
            }
        }
        return jSONObject2;
    }

    public static int D(byte[] bArr, int i7, InterfaceC0845z interfaceC0845z, C0824d c0824d) throws C {
        J j = (J) interfaceC0845z;
        int iM = M(bArr, i7, c0824d);
        int i8 = c0824d.f11761a + iM;
        while (iM < i8) {
            iM = O(bArr, iM, c0824d);
            j.t(c0824d.f11762b);
        }
        if (iM == i8) {
            return iM;
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

    public static int E(int i7, byte[] bArr, int i8, int i9, InterfaceC0845z interfaceC0845z, C0824d c0824d) {
        AbstractC0843x abstractC0843x = (AbstractC0843x) interfaceC0845z;
        int iM = M(bArr, i8, c0824d);
        abstractC0843x.t(e.d(c0824d.f11761a));
        while (iM < i9) {
            int iM2 = M(bArr, iM, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            iM = M(bArr, iM2, c0824d);
            abstractC0843x.t(e.d(c0824d.f11761a));
        }
        return iM;
    }

    public static JSONObject E0(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                boolean z4 = true;
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
                        z4 = false;
                    }
                    jSONObject.put("contained_in_scroll_view", z4);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static int F(int i7, byte[] bArr, int i8, int i9, InterfaceC0845z interfaceC0845z, C0824d c0824d) {
        J j = (J) interfaceC0845z;
        int iO = O(bArr, i8, c0824d);
        j.t(e.e(c0824d.f11762b));
        while (iO < i9) {
            int iM = M(bArr, iO, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            iO = O(bArr, iM, c0824d);
            j.t(e.e(c0824d.f11762b));
        }
        return iO;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0136  */
    public static JSONObject F0(Context context, View view) {
        String str;
        byte b7;
        JSONObject jSONObjectI0;
        JSONObject jSONObject = new JSONObject();
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
                JSONObject jSONObject2 = new JSONObject();
                int measuredWidth = view.getMeasuredWidth();
                C0252s c0252s = C0252s.f2717f;
                d dVar = c0252s.f2718a;
                d dVar2 = c0252s.f2718a;
                jSONObject2.put("width", dVar.g(measuredWidth, context));
                jSONObject2.put("height", dVar2.g(view.getMeasuredHeight(), context));
                jSONObject2.put("x", dVar2.g(iArr[0], context));
                jSONObject2.put("y", dVar2.g(iArr[1], context));
                jSONObject2.put("maximum_visible_width", dVar2.g(iArr2[0], context));
                jSONObject2.put("maximum_visible_height", dVar2.g(iArr2[1], context));
                jSONObject2.put("relative_to", "window");
                jSONObject.put("frame", jSONObject2);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    jSONObjectI0 = I0(context, rect);
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("width", 0);
                    jSONObject3.put("height", 0);
                    jSONObject3.put("x", dVar2.g(iArr[0], context));
                    jSONObject3.put("y", dVar2.g(iArr[1], context));
                    jSONObject3.put("relative_to", "window");
                    jSONObjectI0 = jSONObject3;
                }
                jSONObject.put("visible_bounds", jSONObjectI0);
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
                } catch (NoSuchMethodException unused2) {
                    str = "";
                } catch (SecurityException e8) {
                    e = e8;
                    int i9 = I2.J.f3546b;
                    j.e("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                } catch (InvocationTargetException e9) {
                    e = e9;
                    int i10 = I2.J.f3546b;
                    j.e("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                }
            } else {
                str = "";
            }
            try {
                int iHashCode = str.hashCode();
                if (iHashCode != -2066603854) {
                    if (iHashCode == 2019754500 && str.equals("medium_template")) {
                        b7 = 1;
                    } else {
                        b7 = -1;
                    }
                } else if (str.equals("small_template")) {
                    b7 = 0;
                } else {
                    b7 = -1;
                }
                if (b7 == 0) {
                    jSONObject.put("native_template_type", 1);
                } else if (b7 != 1) {
                    jSONObject.put("native_template_type", 0);
                } else {
                    jSONObject.put("native_template_type", 2);
                }
            } catch (JSONException e10) {
                int i11 = I2.J.f3546b;
                j.e("Could not log native template signal to JSON", e10);
            }
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhW)).booleanValue()) {
                try {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    jSONObject.put("view_width_layout_type", J0(layoutParams.width) - 1);
                    jSONObject.put("view_height_layout_type", J0(layoutParams.height) - 1);
                } catch (Exception unused3) {
                    I2.J.k("Unable to get native ad view layout types");
                }
            }
        }
        return jSONObject;
    }

    public static int G(byte[] bArr, int i7, C0824d c0824d) throws C {
        int iM = M(bArr, i7, c0824d);
        int i8 = c0824d.f11761a;
        if (i8 < 0) {
            throw C.e();
        }
        if (i8 == 0) {
            c0824d.f11763c = "";
            return iM;
        }
        c0824d.f11763c = new String(bArr, iM, i8, A.f11702a);
        return iM + i8;
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

    public static int H(int i7, byte[] bArr, int i8, int i9, InterfaceC0845z interfaceC0845z, C0824d c0824d) throws C {
        int iM = M(bArr, i8, c0824d);
        int i10 = c0824d.f11761a;
        if (i10 < 0) {
            throw C.e();
        }
        if (i10 == 0) {
            interfaceC0845z.add("");
        } else {
            interfaceC0845z.add(new String(bArr, iM, i10, A.f11702a));
            iM += i10;
        }
        while (iM < i9) {
            int iM2 = M(bArr, iM, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            iM = M(bArr, iM2, c0824d);
            int i11 = c0824d.f11761a;
            if (i11 < 0) {
                throw C.e();
            }
            if (i11 == 0) {
                interfaceC0845z.add("");
            } else {
                interfaceC0845z.add(new String(bArr, iM, i11, A.f11702a));
                iM += i11;
            }
        }
        return iM;
    }

    public static boolean H0(int i7) {
        zzbbp zzbbpVar = zzbby.zzdG;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            return ((Boolean) c0254t.f2726c.zzb(zzbby.zzdH)).booleanValue() || i7 <= 15299999;
        }
        return true;
    }

    public static int I(int i7, byte[] bArr, int i8, int i9, InterfaceC0845z interfaceC0845z, C0824d c0824d) throws C {
        int iM = M(bArr, i8, c0824d);
        int i10 = c0824d.f11761a;
        if (i10 < 0) {
            throw C.e();
        }
        if (i10 == 0) {
            interfaceC0845z.add("");
        } else {
            int i11 = iM + i10;
            if (r0.f11823a.J(bArr, iM, i11) != 0) {
                throw C.b();
            }
            interfaceC0845z.add(new String(bArr, iM, i10, A.f11702a));
            iM = i11;
        }
        while (iM < i9) {
            int iM2 = M(bArr, iM, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            iM = M(bArr, iM2, c0824d);
            int i12 = c0824d.f11761a;
            if (i12 < 0) {
                throw C.e();
            }
            if (i12 == 0) {
                interfaceC0845z.add("");
            } else {
                int i13 = iM + i12;
                if (r0.f11823a.J(bArr, iM, i13) != 0) {
                    throw C.b();
                }
                interfaceC0845z.add(new String(bArr, iM, i12, A.f11702a));
                iM = i13;
            }
        }
        return iM;
    }

    public static JSONObject I0(Context context, Rect rect) throws JSONException {
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

    public static int J(byte[] bArr, int i7, C0824d c0824d) throws C {
        int iM = M(bArr, i7, c0824d);
        int i8 = c0824d.f11761a;
        if (i8 < 0) {
            throw C.e();
        }
        if (i8 == 0) {
            c0824d.f11763c = "";
            return iM;
        }
        c0824d.f11763c = r0.f11823a.t(bArr, iM, i8);
        return iM + i8;
    }

    public static int J0(int i7) {
        if (i7 != -2) {
            return i7 != -1 ? 2 : 3;
        }
        return 4;
    }

    public static int K(int i7, byte[] bArr, int i8, int i9, f0 f0Var, C0824d c0824d) throws C {
        if ((i7 >>> 3) == 0) {
            throw C.a();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int iO = O(bArr, i8, c0824d);
            f0Var.d(i7, Long.valueOf(c0824d.f11762b));
            return iO;
        }
        if (i10 == 1) {
            f0Var.d(i7, Long.valueOf(p(i8, bArr)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int iM = M(bArr, i8, c0824d);
            int i11 = c0824d.f11761a;
            if (i11 < 0) {
                throw C.e();
            }
            if (i11 > bArr.length - iM) {
                throw C.g();
            }
            if (i11 == 0) {
                f0Var.d(i7, AbstractC0829i.f11779b);
            } else {
                f0Var.d(i7, AbstractC0829i.t(bArr, iM, i11));
            }
            return iM + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw C.a();
            }
            f0Var.d(i7, Integer.valueOf(n(i8, bArr)));
            return i8 + 4;
        }
        f0 f0VarC = f0.c();
        int i12 = (i7 & (-8)) | 4;
        int i13 = 0;
        while (i8 < i9) {
            int iM2 = M(bArr, i8, c0824d);
            int i14 = c0824d.f11761a;
            if (i14 == i12) {
                i13 = i14;
                i8 = iM2;
                break;
            }
            i13 = i14;
            i8 = K(i14, bArr, iM2, i9, f0VarC, c0824d);
        }
        if (i8 > i9 || i13 != i12) {
            throw C.f();
        }
        f0Var.d(i7, f0VarC);
        return i8;
    }

    public static int L(int i7, byte[] bArr, int i8, C0824d c0824d) {
        int i9 = i7 & 127;
        int i10 = i8 + 1;
        byte b7 = bArr[i8];
        if (b7 >= 0) {
            c0824d.f11761a = i9 | (b7 << 7);
            return i10;
        }
        int i11 = i9 | ((b7 & 127) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i10];
        if (b8 >= 0) {
            c0824d.f11761a = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & 127) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            c0824d.f11761a = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & 127) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            c0824d.f11761a = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & 127) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                c0824d.f11761a = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static int M(byte[] bArr, int i7, C0824d c0824d) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return L(b7, bArr, i8, c0824d);
        }
        c0824d.f11761a = b7;
        return i8;
    }

    public static int N(int i7, byte[] bArr, int i8, int i9, InterfaceC0845z interfaceC0845z, C0824d c0824d) {
        AbstractC0843x abstractC0843x = (AbstractC0843x) interfaceC0845z;
        int iM = M(bArr, i8, c0824d);
        abstractC0843x.t(c0824d.f11761a);
        while (iM < i9) {
            int iM2 = M(bArr, iM, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            iM = M(bArr, iM2, c0824d);
            abstractC0843x.t(c0824d.f11761a);
        }
        return iM;
    }

    public static int O(byte[] bArr, int i7, C0824d c0824d) {
        int i8 = i7 + 1;
        long j = bArr[i7];
        if (j >= 0) {
            c0824d.f11762b = j;
            return i8;
        }
        int i9 = i7 + 2;
        byte b7 = bArr[i8];
        long j3 = (j & 127) | (((long) (b7 & 127)) << 7);
        int i10 = 7;
        while (b7 < 0) {
            int i11 = i9 + 1;
            byte b8 = bArr[i9];
            i10 += 7;
            j3 |= ((long) (b8 & 127)) << i10;
            b7 = b8;
            i9 = i11;
        }
        c0824d.f11762b = j3;
        return i9;
    }

    public static int P(int i7, byte[] bArr, int i8, int i9, InterfaceC0845z interfaceC0845z, C0824d c0824d) {
        J j = (J) interfaceC0845z;
        int iO = O(bArr, i8, c0824d);
        j.t(c0824d.f11762b);
        while (iO < i9) {
            int iM = M(bArr, iO, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            iO = O(bArr, iM, c0824d);
            j.t(c0824d.f11762b);
        }
        return iO;
    }

    public static SafeParcelable Q(byte[] bArr, Parcelable.Creator creator) {
        D.i(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return safeParcelable;
    }

    public static boolean R(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
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
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
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

    public static boolean S(InterfaceC0355k interfaceC0355k, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC0355k == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC0355k.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
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
                            Object objInvoke = method.invoke(actionBar, keyEvent);
                            if (objInvoke != null) {
                                zBooleanValue = ((Boolean) objInvoke).booleanValue();
                            }
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                    if (zBooleanValue) {
                        return true;
                    }
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
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
                onKeyListener = null;
            }
        } else {
            onKeyListener = null;
        }
        if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window2 = dialog.getWindow();
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (U.b(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
    }

    public static final b T(Enum[] enumArr) {
        h.e(enumArr, "entries");
        return new b(enumArr);
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

    public static B V(Map map) {
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
        switch (str2) {
            case "not-in":
                return new B4.A(c0074s, EnumC0176i.NOT_IN, (List) obj);
            case "<":
                return new B4.A(c0074s, EnumC0176i.LESS_THAN, obj);
            case ">":
                return new B4.A(c0074s, EnumC0176i.GREATER_THAN, obj);
            case "!=":
                return new B4.A(c0074s, EnumC0176i.NOT_EQUAL, obj);
            case "<=":
                return new B4.A(c0074s, EnumC0176i.LESS_THAN_OR_EQUAL, obj);
            case "==":
                return new B4.A(c0074s, EnumC0176i.EQUAL, obj);
            case ">=":
                return new B4.A(c0074s, EnumC0176i.GREATER_THAN_OR_EQUAL, obj);
            case "in":
                return new B4.A(c0074s, EnumC0176i.IN, (List) obj);
            case "array-contains":
                return new B4.A(c0074s, EnumC0176i.ARRAY_CONTAINS, obj);
            case "array-contains-any":
                return new B4.A(c0074s, EnumC0176i.ARRAY_CONTAINS_ANY, (List) obj);
            default:
                throw new Error("Invalid operator");
        }
    }

    public static g W(g gVar, p065i6.h hVar) {
        h.e(hVar, "key");
        if (h.a(gVar.getKey(), hVar)) {
            return gVar;
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
        return p136t.e.b(dVar.f3311b, 3) == (enumC0176i2.equals(enumC0176i) || enumC0176i2.equals(EnumC0176i.ARRAY_CONTAINS_ANY));
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
        boolean zB = p136t.e.b(i7, 1);
        int i8 = a2.f2084a;
        return (zB && p136t.e.b(i8, 1)) || (p136t.e.b(i7, 2) && p136t.e.b(i8, 2));
    }

    public static final List c(Throwable th) {
        return i.M0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public static int c0(Object obj, c0 c0Var, byte[] bArr, int i7, int i8, int i9, C0824d c0824d) {
        int iJ = ((com.google.crypto.tink.shaded.protobuf.T) c0Var).J(obj, bArr, i7, i8, i9, c0824d);
        c0824d.f11763c = obj;
        return iJ;
    }

    public static void d(StringBuilder sb, Object obj) {
        int iLastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static int d0(Object obj, c0 c0Var, byte[] bArr, int i7, int i8, C0824d c0824d) throws C {
        int iL = i7 + 1;
        int i9 = bArr[i7];
        if (i9 < 0) {
            iL = L(i9, bArr, iL, c0824d);
            i9 = c0824d.f11761a;
        }
        int i10 = iL;
        if (i9 < 0 || i9 > i8 - i10) {
            throw C.g();
        }
        int i11 = i9 + i10;
        c0Var.g(obj, bArr, i10, i11, c0824d);
        c0824d.f11763c = obj;
        return i11;
    }

    public static void e(String str, boolean z4, Object... objArr) {
        if (!z4) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static p065i6.i e0(g gVar, p065i6.h hVar) {
        h.e(hVar, "key");
        return h.a(gVar.getKey(), hVar) ? p065i6.j.f14074a : gVar;
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int g(Context context, String str) {
        int iC;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strD = AbstractC0214j.d(str);
        if (strD != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int iMyUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                AppOpsManager appOpsManagerC = AbstractC0215k.c(context);
                iC = AbstractC0215k.a(appOpsManagerC, strD, Binder.getCallingUid(), packageName);
                if (iC == 0) {
                    iC = AbstractC0215k.a(appOpsManagerC, strD, iMyUid, AbstractC0215k.b(context));
                }
            } else {
                iC = AbstractC0214j.c((AppOpsManager) AbstractC0214j.a(context, AppOpsManager.class), strD, packageName);
            }
            if (iC != 0) {
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

    public static final p044f6.e h(Throwable th) {
        h.e(th, SentryEvent.JsonKeys.EXCEPTION);
        return new p044f6.e(th);
    }

    public static ArrayList h0(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C0074s.b((String[]) ((List) it.next()).toArray(new String[0])));
        }
        return arrayList;
    }

    public static int i(int i7, byte[] bArr, int i8, int i9, InterfaceC0845z interfaceC0845z, C0824d c0824d) {
        AbstractC0825e abstractC0825e = (AbstractC0825e) interfaceC0845z;
        int iO = O(bArr, i8, c0824d);
        abstractC0825e.t(c0824d.f11762b != 0);
        while (iO < i9) {
            int iM = M(bArr, iO, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            iO = O(bArr, iM, c0824d);
            abstractC0825e.t(c0824d.f11762b != 0);
        }
        return iO;
    }

    public static int i0(int i7) {
        String str;
        int iE = p136t.e.e(i7);
        if (iE == 0) {
            return 1;
        }
        if (iE == 1) {
            return 2;
        }
        if (i7 != 1) {
            str = i7 != 2 ? "null" : "CACHE";
        } else {
            str = "DEFAULT_SOURCE";
        }
        throw new IllegalArgumentException("Unknown ListenSource value: ".concat(str));
    }

    public static int j(byte[] bArr, int i7, C0824d c0824d) throws C {
        int iM = M(bArr, i7, c0824d);
        int i8 = c0824d.f11761a;
        if (i8 < 0) {
            throw C.e();
        }
        if (i8 > bArr.length - iM) {
            throw C.g();
        }
        if (i8 == 0) {
            c0824d.f11763c = AbstractC0829i.f11779b;
            return iM;
        }
        c0824d.f11763c = AbstractC0829i.t(bArr, iM, i8);
        return iM + i8;
    }

    public static EnumC0071o j0(int i7) {
        int iE;
        String str;
        EnumC0071o enumC0071o = EnumC0071o.f1181a;
        if (i7 == 0 || (iE = p136t.e.e(i7)) == 0) {
            return enumC0071o;
        }
        if (iE == 1) {
            return EnumC0071o.f1182b;
        }
        if (iE == 2) {
            return EnumC0071o.f1183c;
        }
        if (i7 == 1) {
            str = "NONE";
        } else if (i7 != 2) {
            str = i7 != 3 ? "null" : "PREVIOUS";
        } else {
            str = "ESTIMATE";
        }
        throw new IllegalArgumentException("Unknown server timestamp behavior: ".concat(str));
    }

    public static int k(int i7, byte[] bArr, int i8, int i9, InterfaceC0845z interfaceC0845z, C0824d c0824d) throws C {
        int iM = M(bArr, i8, c0824d);
        int i10 = c0824d.f11761a;
        if (i10 < 0) {
            throw C.e();
        }
        if (i10 > bArr.length - iM) {
            throw C.g();
        }
        if (i10 == 0) {
            interfaceC0845z.add(AbstractC0829i.f11779b);
        } else {
            interfaceC0845z.add(AbstractC0829i.t(bArr, iM, i10));
            iM += i10;
        }
        while (iM < i9) {
            int iM2 = M(bArr, iM, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            iM = M(bArr, iM2, c0824d);
            int i11 = c0824d.f11761a;
            if (i11 < 0) {
                throw C.e();
            }
            if (i11 > bArr.length - iM) {
                throw C.g();
            }
            if (i11 == 0) {
                interfaceC0845z.add(AbstractC0829i.f11779b);
            } else {
                interfaceC0845z.add(AbstractC0829i.t(bArr, iM, i11));
                iM += i11;
            }
        }
        return iM;
    }

    public static int k0(int i7) {
        String str;
        int iE = p136t.e.e(i7);
        if (iE == 0) {
            return 1;
        }
        if (iE == 1) {
            return 2;
        }
        if (iE == 2) {
            return 3;
        }
        if (i7 == 1) {
            str = "SERVER_AND_CACHE";
        } else if (i7 != 2) {
            str = i7 != 3 ? "null" : "CACHE";
        } else {
            str = "SERVER";
        }
        throw new IllegalArgumentException("Unknown source: ".concat(str));
    }

    public static double l(int i7, byte[] bArr) {
        return Double.longBitsToDouble(p(i7, bArr));
    }

    public static Z l0(FirebaseFirestore firebaseFirestore, String str, boolean z4, t tVar) {
        try {
            Z zC = z4 ? firebaseFirestore.c(str) : firebaseFirestore.b(str);
            if (tVar == null) {
                return zC;
            }
            Map map = tVar.f3413i;
            if (map != null) {
                zC = zC.j(V(map));
            }
            List<List> list = tVar.f3405a;
            Objects.requireNonNull(list);
            for (List list2 : list) {
                C0074s c0074s = (C0074s) list2.get(0);
                String str2 = (String) list2.get(1);
                Object obj = list2.get(2);
                if ("==".equals(str2)) {
                    zC.getClass();
                    zC = zC.j(new B4.A(c0074s, EnumC0176i.EQUAL, obj));
                } else if ("!=".equals(str2)) {
                    zC.getClass();
                    zC = zC.j(new B4.A(c0074s, EnumC0176i.NOT_EQUAL, obj));
                } else if ("<".equals(str2)) {
                    zC.getClass();
                    zC = zC.j(new B4.A(c0074s, EnumC0176i.LESS_THAN, obj));
                } else if ("<=".equals(str2)) {
                    zC.getClass();
                    zC = zC.j(new B4.A(c0074s, EnumC0176i.LESS_THAN_OR_EQUAL, obj));
                } else if (">".equals(str2)) {
                    zC.getClass();
                    zC = zC.j(new B4.A(c0074s, EnumC0176i.GREATER_THAN, obj));
                } else if (">=".equals(str2)) {
                    zC.getClass();
                    zC = zC.j(new B4.A(c0074s, EnumC0176i.GREATER_THAN_OR_EQUAL, obj));
                } else if ("array-contains".equals(str2)) {
                    zC.getClass();
                    zC = zC.j(new B4.A(c0074s, EnumC0176i.ARRAY_CONTAINS, obj));
                } else if ("array-contains-any".equals(str2)) {
                    zC.getClass();
                    zC = zC.j(new B4.A(c0074s, EnumC0176i.ARRAY_CONTAINS_ANY, (List) obj));
                } else if ("in".equals(str2)) {
                    zC.getClass();
                    zC = zC.j(new B4.A(c0074s, EnumC0176i.IN, (List) obj));
                } else if ("not-in".equals(str2)) {
                    zC.getClass();
                    zC = zC.j(new B4.A(c0074s, EnumC0176i.NOT_IN, (List) obj));
                } else {
                    Log.w("FLTFirestoreMsgCodec", "An invalid query operator " + str2 + " was received but not handled.");
                }
            }
            Long l7 = tVar.f3407c;
            if (l7 != null) {
                zC = zC.d(l7.longValue());
            }
            Long l8 = tVar.f3408d;
            if (l8 != null) {
                zC = zC.e(l8.longValue());
            }
            List<List> list3 = tVar.f3406b;
            if (list3 == null) {
                return zC;
            }
            for (List list4 : list3) {
                zC = zC.f((C0074s) list4.get(0), ((Boolean) list4.get(1)).booleanValue() ? 2 : 1);
            }
            List list5 = tVar.f3409e;
            if (list5 != null) {
                Object[] array = list5.toArray();
                Objects.requireNonNull(array);
                C0170c c0170cB = zC.b("startAt", true, array);
                E4.C c3 = zC.f1135a;
                zC = new Z(new E4.C(c3.f2095f, c3.f2096g, c3.f2094e, c3.f2090a, c3.f2097h, c3.f2098i, c0170cB, c3.f2099k), zC.f1136b);
            }
            List list6 = tVar.f3410f;
            if (list6 != null) {
                Object[] array2 = list6.toArray();
                Objects.requireNonNull(array2);
                C0170c c0170cB2 = zC.b("startAfter", false, array2);
                E4.C c4 = zC.f1135a;
                zC = new Z(new E4.C(c4.f2095f, c4.f2096g, c4.f2094e, c4.f2090a, c4.f2097h, c4.f2098i, c0170cB2, c4.f2099k), zC.f1136b);
            }
            List list7 = tVar.f3411g;
            if (list7 != null) {
                Object[] array3 = list7.toArray();
                Objects.requireNonNull(array3);
                C0170c c0170cB3 = zC.b("endAt", true, array3);
                E4.C c7 = zC.f1135a;
                zC = new Z(new E4.C(c7.f2095f, c7.f2096g, c7.f2094e, c7.f2090a, c7.f2097h, c7.f2098i, c7.j, c0170cB3), zC.f1136b);
            }
            List list8 = tVar.f3412h;
            if (list8 == null) {
                return zC;
            }
            Object[] array4 = list8.toArray();
            Objects.requireNonNull(array4);
            C0170c c0170cB4 = zC.b("endBefore", false, array4);
            E4.C c8 = zC.f1135a;
            return new Z(new E4.C(c8.f2095f, c8.f2096g, c8.f2094e, c8.f2090a, c8.f2097h, c8.f2098i, c8.j, c0170cB4), zC.f1136b);
        } catch (Exception e7) {
            Log.e("FLTFirestoreMsgCodec", "An error occurred while parsing query arguments, this is most likely an error with this SDK.", e7);
            return null;
        }
    }

    public static int m(int i7, byte[] bArr, int i8, int i9, InterfaceC0845z interfaceC0845z, C0824d c0824d) {
        AbstractC0833m abstractC0833m = (AbstractC0833m) interfaceC0845z;
        abstractC0833m.t(l(i8, bArr));
        int i10 = i8 + 8;
        while (i10 < i9) {
            int iM = M(bArr, i10, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            abstractC0833m.t(Double.longBitsToDouble(p(iM, bArr)));
            i10 = iM + 8;
        }
        return i10;
    }

    public static p065i6.i m0(g gVar, p065i6.i iVar) {
        h.e(iVar, "context");
        return iVar == p065i6.j.f14074a ? gVar : (p065i6.i) iVar.fold(gVar, new p065i6.b(1));
    }

    public static int n(int i7, byte[] bArr) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public static P2 n0(C0095a c0095a) {
        c0095a.E(1);
        int iV = c0095a.v();
        long j = ((long) c0095a.f1463a) + ((long) iV);
        int i7 = iV / 18;
        long[] jArrCopyOf = new long[i7];
        long[] jArrCopyOf2 = new long[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            long jN = c0095a.n();
            if (jN == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i8);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i8);
                break;
            }
            jArrCopyOf[i8] = jN;
            jArrCopyOf2[i8] = c0095a.n();
            c0095a.E(2);
        }
        c0095a.E((int) (j - ((long) c0095a.f1463a)));
        return new P2(8, jArrCopyOf, jArrCopyOf2, false);
    }

    public static int o(int i7, byte[] bArr, int i8, int i9, InterfaceC0845z interfaceC0845z, C0824d c0824d) {
        AbstractC0843x abstractC0843x = (AbstractC0843x) interfaceC0845z;
        abstractC0843x.t(n(i8, bArr));
        int i10 = i8 + 4;
        while (i10 < i9) {
            int iM = M(bArr, i10, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            abstractC0843x.t(n(iM, bArr));
            i10 = iM + 4;
        }
        return i10;
    }

    public static void o0(f fVar, final C0413i c0413i) {
        I4.j jVar;
        h.e(fVar, "binaryMessenger");
        n c0406b = (c0413i == null || (jVar = c0413i.f6174a) == null) ? new C0406b() : jVar.a();
        Object obj = null;
        F0 f7 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedBy", c0406b, obj, 1);
        if (c0413i != null) {
            final int i7 = 0;
            f7.M(new A5.b() { // from class: R5.G
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
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
                                listW0 = Y4.D.D(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0413i3.getClass();
                                listW1 = Y4.D.D(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                                listW4 = Y4.D.D(x509Certificate);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
                            break;
                    }
                }
            });
        } else {
            f7.M(null);
        }
        F0 f8 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedTo", c0406b, obj, 1);
        if (c0413i != null) {
            final int i8 = 1;
            f8.M(new A5.b() { // from class: R5.G
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
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
                                listW0 = Y4.D.D(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0413i3.getClass();
                                listW1 = Y4.D.D(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                                listW4 = Y4.D.D(x509Certificate);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
                            break;
                    }
                }
            });
        } else {
            f8.M(null);
        }
        F0 f9 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotAfterMsSinceEpoch", c0406b, obj, 1);
        if (c0413i != null) {
            final int i9 = 2;
            f9.M(new A5.b() { // from class: R5.G
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
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
                                listW0 = Y4.D.D(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0413i3.getClass();
                                listW1 = Y4.D.D(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                                listW4 = Y4.D.D(x509Certificate);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
                            break;
                    }
                }
            });
        } else {
            f9.M(null);
        }
        F0 f10 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotBeforeMsSinceEpoch", c0406b, obj, 1);
        if (c0413i != null) {
            final int i10 = 3;
            f10.M(new A5.b() { // from class: R5.G
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
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
                                listW0 = Y4.D.D(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0413i3.getClass();
                                listW1 = Y4.D.D(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                                listW4 = Y4.D.D(x509Certificate);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
                            break;
                    }
                }
            });
        } else {
            f10.M(null);
        }
        F0 f11 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getX509Certificate", c0406b, obj, 1);
        if (c0413i == null) {
            f11.M(null);
        } else {
            final int i11 = 4;
            f11.M(new A5.b() { // from class: R5.G
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
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
                                listW0 = Y4.D.D(sslCertificate.getIssuedBy());
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                c0413i3.getClass();
                                listW1 = Y4.D.D(sslCertificate2.getIssuedTo());
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                                listW3 = Y4.D.D(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                                listW4 = Y4.D.D(x509Certificate);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
                            break;
                    }
                }
            });
        }
    }

    public static long p(int i7, byte[] bArr) {
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    public static final void p0(Object obj) {
        if (obj instanceof p044f6.e) {
            throw ((p044f6.e) obj).f13008a;
        }
    }

    public static int q(int i7, byte[] bArr, int i8, int i9, InterfaceC0845z interfaceC0845z, C0824d c0824d) {
        J j = (J) interfaceC0845z;
        j.t(p(i8, bArr));
        int i10 = i8 + 8;
        while (i10 < i9) {
            int iM = M(bArr, i10, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            j.t(p(iM, bArr));
            i10 = iM + 8;
        }
        return i10;
    }

    public static H5.o q0(C0065i c0065i, EnumC0071o enumC0071o) {
        String str;
        int i7 = c0065i.f1162a;
        int iE = p136t.e.e(i7);
        int i8 = 1;
        if (iE != 0) {
            if (iE == 1) {
                i8 = 2;
            } else {
                if (iE != 2) {
                    if (i7 == 1) {
                        str = "ADDED";
                    } else if (i7 != 2) {
                        str = i7 != 3 ? "null" : "REMOVED";
                    } else {
                        str = "MODIFIED";
                    }
                    throw new IllegalArgumentException("Unknown change type: ".concat(str));
                }
                i8 = 3;
            }
        }
        Long lValueOf = Long.valueOf(c0065i.f1164c);
        Long lValueOf2 = Long.valueOf(c0065i.f1165d);
        q qVarR0 = r0(c0065i.f1163b, enumC0071o);
        H5.o oVar = new H5.o();
        if (i8 == 0) {
            throw new IllegalStateException("Nonnull field \"type\" is null.");
        }
        oVar.f3389a = i8;
        oVar.f3390b = qVarR0;
        oVar.f3391c = lValueOf;
        oVar.f3392d = lValueOf2;
        return oVar;
    }

    public static float r(int i7, byte[] bArr) {
        return Float.intBitsToFloat(n(i7, bArr));
    }

    public static q r0(C0072p c0072p, EnumC0071o enumC0071o) {
        v vVarT0 = t0(c0072p.f1189d);
        HashMap mapA = c0072p.a(enumC0071o);
        H4.h hVar = c0072p.f1187b;
        hVar.getClass();
        String strC = hVar.f3318a.c();
        q qVar = new q();
        if (strC == null) {
            throw new IllegalStateException("Nonnull field \"path\" is null.");
        }
        qVar.f3395a = strC;
        qVar.f3396b = mapA;
        qVar.f3397c = vVarT0;
        return qVar;
    }

    public static int s(int i7, byte[] bArr, int i8, int i9, InterfaceC0845z interfaceC0845z, C0824d c0824d) {
        AbstractC0838s abstractC0838s = (AbstractC0838s) interfaceC0845z;
        abstractC0838s.t(r(i8, bArr));
        int i10 = i8 + 4;
        while (i10 < i9) {
            int iM = M(bArr, i10, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            abstractC0838s.t(Float.intBitsToFloat(n(iM, bArr)));
            i10 = iM + 4;
        }
        return i10;
    }

    public static u s0(B4.c0 c0Var, EnumC0071o enumC0071o) {
        v vVarT0 = t0(c0Var.f1145f);
        List listL = c0Var.l();
        ArrayList arrayList = new ArrayList(listL.size());
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            arrayList.add(q0((C0065i) it.next(), enumC0071o));
        }
        ArrayList arrayListM = c0Var.m();
        ArrayList arrayList2 = new ArrayList(arrayListM.size());
        Iterator it2 = arrayListM.iterator();
        while (it2.hasNext()) {
            arrayList2.add(r0((C0072p) it2.next(), enumC0071o));
        }
        u uVar = new u();
        uVar.f3414a = arrayList2;
        uVar.f3415b = arrayList;
        uVar.f3416c = vVarT0;
        return uVar;
    }

    public static int t(c0 c0Var, int i7, byte[] bArr, int i8, int i9, InterfaceC0845z interfaceC0845z, C0824d c0824d) {
        int i10 = (i7 & (-8)) | 4;
        Object objD = c0Var.d();
        int iC0 = c0(objD, c0Var, bArr, i8, i9, i10, c0824d);
        c0Var.b(objD);
        c0824d.f11763c = objD;
        interfaceC0845z.add(objD);
        while (iC0 < i9) {
            int iM = M(bArr, iC0, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            Object objD2 = c0Var.d();
            int iC1 = c0(objD2, c0Var, bArr, iM, i9, i10, c0824d);
            c0Var.b(objD2);
            c0824d.f11763c = objD2;
            interfaceC0845z.add(objD2);
            iC0 = iC1;
        }
        return iC0;
    }

    public static v t0(B4.f0 f0Var) {
        Boolean boolValueOf = Boolean.valueOf(f0Var.f1157a);
        Boolean boolValueOf2 = Boolean.valueOf(f0Var.f1158b);
        v vVar = new v();
        vVar.f3417a = boolValueOf;
        vVar.f3418b = boolValueOf2;
        return vVar;
    }

    public static int u(c0 c0Var, int i7, byte[] bArr, int i8, int i9, InterfaceC0845z interfaceC0845z, C0824d c0824d) throws C {
        Object objD = c0Var.d();
        int iD0 = d0(objD, c0Var, bArr, i8, i9, c0824d);
        c0Var.b(objD);
        c0824d.f11763c = objD;
        interfaceC0845z.add(objD);
        while (iD0 < i9) {
            int iM = M(bArr, iD0, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            Object objD2 = c0Var.d();
            int iD1 = d0(objD2, c0Var, bArr, iM, i9, c0824d);
            c0Var.b(objD2);
            c0824d.f11763c = objD2;
            interfaceC0845z.add(objD2);
            iD0 = iD1;
        }
        return iD0;
    }

    public static D3.j u0(Object obj) {
        return new D3.j(obj.getClass().getSimpleName());
    }

    public static int v(byte[] bArr, int i7, InterfaceC0845z interfaceC0845z, C0824d c0824d) throws C {
        AbstractC0825e abstractC0825e = (AbstractC0825e) interfaceC0845z;
        int iM = M(bArr, i7, c0824d);
        int i8 = c0824d.f11761a + iM;
        while (iM < i8) {
            iM = O(bArr, iM, c0824d);
            abstractC0825e.t(c0824d.f11762b != 0);
        }
        if (iM == i8) {
            return iM;
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

    public static int w(byte[] bArr, int i7, InterfaceC0845z interfaceC0845z, C0824d c0824d) throws C {
        AbstractC0833m abstractC0833m = (AbstractC0833m) interfaceC0845z;
        int iM = M(bArr, i7, c0824d);
        int i8 = c0824d.f11761a + iM;
        while (iM < i8) {
            abstractC0833m.t(Double.longBitsToDouble(p(iM, bArr)));
            iM += 8;
        }
        if (iM == i8) {
            return iM;
        }
        throw C.g();
    }

    public static List w0(Throwable th) {
        if (th instanceof C0405a) {
            C0405a c0405a = (C0405a) th;
            return i.M0(c0405a.f6128a, c0405a.f6129b, c0405a.f6130c);
        }
        return i.M0(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public static int x(byte[] bArr, int i7, InterfaceC0845z interfaceC0845z, C0824d c0824d) throws C {
        AbstractC0843x abstractC0843x = (AbstractC0843x) interfaceC0845z;
        int iM = M(bArr, i7, c0824d);
        int i8 = c0824d.f11761a + iM;
        while (iM < i8) {
            abstractC0843x.t(n(iM, bArr));
            iM += 4;
        }
        if (iM == i8) {
            return iM;
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

    public static int y(byte[] bArr, int i7, InterfaceC0845z interfaceC0845z, C0824d c0824d) throws C {
        J j = (J) interfaceC0845z;
        int iM = M(bArr, i7, c0824d);
        int i8 = c0824d.f11761a + iM;
        while (iM < i8) {
            j.t(p(iM, bArr));
            iM += 8;
        }
        if (iM == i8) {
            return iM;
        }
        throw C.g();
    }

    public static Status y0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499, null, null, null);
        }
        String[] strArrSplit = str.split(":", 2);
        strArrSplit[0] = strArrSplit[0].trim();
        if (strArrSplit.length > 1 && (str2 = strArrSplit[1]) != null) {
            strArrSplit[1] = str2.trim();
        }
        List listAsList = Arrays.asList(strArrSplit);
        return listAsList.size() > 1 ? z0((String) listAsList.get(0), (String) listAsList.get(1)) : z0((String) listAsList.get(0), null);
    }

    public static int z(byte[] bArr, int i7, InterfaceC0845z interfaceC0845z, C0824d c0824d) throws C {
        AbstractC0838s abstractC0838s = (AbstractC0838s) interfaceC0845z;
        int iM = M(bArr, i7, c0824d);
        int i8 = c0824d.f11761a + iM;
        while (iM < i8) {
            abstractC0838s.t(Float.intBitsToFloat(n(iM, bArr)));
            iM += 4;
        }
        if (iM == i8) {
            return iM;
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
        if (i7 == 17499) {
            return str2 != null ? new Status(i7, k.f(str, ":", str2), null, null) : new Status(i7, str, null, null);
        }
        return new Status(i7, str2, null, null);
    }

    public abstract a Y(c cVar);

    public abstract r f0();
}
