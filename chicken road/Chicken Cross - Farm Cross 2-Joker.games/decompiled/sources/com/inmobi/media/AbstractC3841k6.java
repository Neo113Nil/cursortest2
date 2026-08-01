package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.hardware.display.DisplayManager;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import com.ironsource.U3;
import io.ktor.sse.ServerSentEventKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.k6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3841k6 {
    public static String c;
    public static JSONObject f;
    public static Integer g;
    public static Float h;
    public static final boolean i;

    /* renamed from: a, reason: collision with root package name */
    public static final C3900m6 f7196a = new C3900m6(0, 0, 2.0f);
    public static final C3813j6 b = new C3813j6(0, 0);
    public static float d = -1.0f;
    public static boolean e = true;

    static {
        Y5.f6965a.getClass();
        i = Y5.w();
    }

    public static String a() {
        Display a2;
        Context context = AbstractC3914mk.f7252a;
        if (context == null || (a2 = a(context)) == null) {
            return "0x0";
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        a2.getMetrics(displayMetrics);
        return displayMetrics.widthPixels + "x" + displayMetrics.heightPixels;
    }

    public static float b() {
        Display a2;
        if (d == -1.0f) {
            Context context = AbstractC3914mk.f7252a;
            if (context == null || (a2 = a(context)) == null) {
                return 2.0f;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            a2.getMetrics(displayMetrics);
            float f2 = displayMetrics.density;
            if (f2 == 0.0f) {
                return 2.0f;
            }
            d = f2;
        }
        return d;
    }

    public static HashMap c() {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("d-device-screen-density", String.valueOf(b()));
            hashMap.put("d-device-screen-size", e());
            hashMap.put("d-density-dependent-screen-size", a());
            hashMap.put("d-orientation", String.valueOf((int) g()));
            Float f2 = h;
            hashMap.put("d-textsize", String.valueOf(f2 != null ? f2.floatValue() : 37.0f));
            return hashMap;
        } catch (Exception e2) {
            Intrinsics.checkNotNullExpressionValue("k6", "TAG");
            String str = "SDK encountered unexpected error in getting display info; " + e2.getMessage();
            return hashMap;
        }
    }

    public static C3900m6 d() {
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return f7196a;
        }
        Display a2 = a(context);
        if (a2 == null) {
            return f7196a;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        a2.getMetrics(displayMetrics);
        float f2 = displayMetrics.density;
        return new C3900m6((int) (displayMetrics.widthPixels / f2), (int) (displayMetrics.heightPixels / f2), f2);
    }

    public static String e() {
        C3900m6 d2 = d();
        return d2.f7240a + "X" + d2.b;
    }

    public static Integer f() {
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return null;
        }
        int i2 = Settings.Secure.getInt(context.getContentResolver(), "navigation_mode", -1);
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        return i2 != 2 ? null : 1;
    }

    public static byte g() {
        Display a2;
        int rotation;
        Context context = AbstractC3914mk.f7252a;
        if (context == null || (a2 = a(context)) == null || (rotation = a2.getRotation()) == 0) {
            return (byte) 1;
        }
        if (rotation == 1) {
            return (byte) 3;
        }
        if (rotation == 2) {
            return (byte) 2;
        }
        if (rotation == 3) {
            return (byte) 4;
        }
        Intrinsics.checkNotNullExpressionValue("k6", "TAG");
        String str = "UnHandled Orientation ( " + rotation + " ) in getOrientation()";
        return (byte) 1;
    }

    public static C3900m6 h() {
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return f7196a;
        }
        Display a2 = a(context);
        if (a2 == null) {
            return f7196a;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        a2.getRealMetrics(displayMetrics);
        float f2 = displayMetrics.density;
        return new C3900m6((int) (displayMetrics.widthPixels / f2), (int) (displayMetrics.heightPixels / f2), f2);
    }

    public static void i() {
        if (i) {
            if (f() != null) {
                Intrinsics.checkNotNullExpressionValue("k6", "TAG");
                return;
            }
            Context context = AbstractC3914mk.f7252a;
            if (context == null) {
                return;
            }
            ConcurrentHashMap concurrentHashMap = Db.b;
            Db a2 = Cb.a(context, "display_info_store");
            Intrinsics.checkNotNullParameter("nav_bar_type", "key");
            int i2 = a2.f6510a.getInt("nav_bar_type", -1);
            Integer valueOf = Integer.valueOf(i2);
            g = valueOf;
            if (i2 == -1) {
                valueOf = null;
            }
            g = valueOf;
            Intrinsics.checkNotNullExpressionValue("k6", "TAG");
            String str = "Replenished NavBar - " + g;
        }
    }

    public static void j() {
        Context context;
        if (i && (context = AbstractC3914mk.f7252a) != null) {
            ConcurrentHashMap concurrentHashMap = Db.b;
            Db a2 = Cb.a(context, "display_info_store");
            Intrinsics.checkNotNullParameter("safe_area", "key");
            JSONObject jSONObject = null;
            String string = a2.f6510a.getString("safe_area", null);
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException unused) {
                    Intrinsics.checkNotNullExpressionValue("k6", "TAG");
                }
            }
            f = jSONObject;
            Intrinsics.checkNotNullExpressionValue("k6", "TAG");
            String str = "Replenished Safe Area " + f;
        }
    }

    public static void a(final Integer num) {
        final Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.k6$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3841k6.a(num, context);
            }
        };
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
    }

    public static final void b(WindowInsets windowInsets, Context context) {
        try {
            String insets = windowInsets.getSystemGestureInsets().toString();
            Intrinsics.checkNotNullExpressionValue(insets, "toString(...)");
            String[] strArr = (String[]) new Regex("Insets").split(insets, 0).toArray(new String[0]);
            StringBuffer stringBuffer = new StringBuffer();
            if (strArr.length > 1) {
                String[] strArr2 = (String[]) new Regex(",").split(new Regex("[^0-9,=a-zA-Z]*").replace(strArr[1], ""), 0).toArray(new String[0]);
                stringBuffer.append("{");
                int length = strArr2.length;
                for (int i2 = 0; i2 < length; i2++) {
                    String[] strArr3 = (String[]) new Regex(U3.j.b).split(strArr2[i2], 0).toArray(new String[0]);
                    if (strArr3.length == 2) {
                        stringBuffer.append("\"" + strArr3[0] + "\"");
                        stringBuffer.append(ServerSentEventKt.COLON);
                        stringBuffer.append(AbstractC3727g4.b(Integer.parseInt(strArr3[1]) / b()));
                        if (i2 < strArr2.length - 1) {
                            stringBuffer.append(", ");
                        }
                    }
                }
                stringBuffer.append("}");
            }
            if (stringBuffer.length() > 0) {
                c = stringBuffer.toString();
                ConcurrentHashMap concurrentHashMap = Db.b;
                Intrinsics.checkNotNull(context);
                Cb.a(context, "display_info_store").a("gesture_margin", stringBuffer.toString(), false);
            }
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("k6", "TAG");
        }
    }

    public static final void c(Context context) {
        Window window;
        WindowInsets rootWindowInsets;
        if (e || !(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null) {
            return;
        }
        a(rootWindowInsets, context);
    }

    public static void a(final LinkedHashMap value) {
        Intrinsics.checkNotNullParameter(value, "value");
        final Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.k6$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3841k6.a(value, context);
            }
        };
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
    }

    public static void a(final WindowInsets insets, final Context context) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (e) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.k6$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3841k6.b(insets, context);
            }
        };
        Context context2 = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC3914mk.h.submit(runnable);
    }

    public static Display a(Context context) {
        Y5.f6965a.getClass();
        Object systemService = context.getSystemService("display");
        DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
        if (displayManager != null) {
            return displayManager.getDisplay(0);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r3.bottom == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r3.bottom == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r3.right == 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(WindowInsets insets) {
        int i2;
        Intrinsics.checkNotNullParameter(insets, "insets");
        Y5.f6965a.getClass();
        if (Y5.t()) {
            Hg a2 = Ig.a(g());
            Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemGestures());
            Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
            int ordinal = a2.ordinal();
            i2 = 1;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (insets2.right == 0) {
                        }
                    }
                } else if (insets2.left == 0) {
                }
                Intrinsics.checkNotNullExpressionValue("k6", "TAG");
                String str = "getNavigationBarTypeByInsets - " + i2;
                return i2;
            }
            if (insets2.left == 0) {
            }
            Intrinsics.checkNotNullExpressionValue("k6", "TAG");
            String str2 = "getNavigationBarTypeByInsets - " + i2;
            return i2;
        }
        i2 = 0;
        Intrinsics.checkNotNullExpressionValue("k6", "TAG");
        String str22 = "getNavigationBarTypeByInsets - " + i2;
        return i2;
    }

    public static final void a(Map map, Context context) {
        Intrinsics.checkNotNullExpressionValue("k6", "TAG");
        String str = "safe Area cached - " + map;
        if (f == null) {
            f = new JSONObject();
        }
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            JSONObject jSONObject = f;
            if (jSONObject != null) {
                jSONObject.put(String.valueOf(intValue), map.get(Integer.valueOf(intValue)));
            }
        }
        ConcurrentHashMap concurrentHashMap = Db.b;
        Db a2 = Cb.a(context, "display_info_store");
        JSONObject jSONObject2 = f;
        a2.a("safe_area", jSONObject2 != null ? jSONObject2.toString() : null, false);
    }

    public static final void a(Integer num, Context context) {
        Intrinsics.checkNotNullExpressionValue("k6", "TAG");
        String str = "navBarType cached - " + num;
        g = num;
        ConcurrentHashMap concurrentHashMap = Db.b;
        Cb.a(context, "display_info_store").a("nav_bar_type", num != null ? num.intValue() : -1, false);
    }

    public static C3813j6 b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Display a2 = a(context);
        if (a2 == null) {
            return b;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        a2.getRealMetrics(displayMetrics);
        return new C3813j6(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
