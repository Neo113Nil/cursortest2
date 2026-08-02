package U2;

import Q2.r;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC1461q8;
import com.google.android.gms.internal.ads.C0844ca;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.Jt;
import f3.AbstractC1952a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final Jt f5861b = new Jt(Looper.getMainLooper(), 0);

    /* renamed from: c, reason: collision with root package name */
    public static final String f5862c = J2.j.class.getName();

    /* renamed from: d, reason: collision with root package name */
    public static final String f5863d = V2.a.class.getName();

    /* renamed from: e, reason: collision with root package name */
    public static final String f5864e = K2.c.class.getName();
    public static final String f = C0844ca.class.getName();

    /* renamed from: g, reason: collision with root package name */
    public static final String f5865g = AbstractC1952a.class.getName();

    /* renamed from: h, reason: collision with root package name */
    public static final String f5866h = J2.f.class.getName();

    /* renamed from: a, reason: collision with root package name */
    public float f5867a;

    public static boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) AbstractC1461q8.f15108d.s());
    }

    public static final int i(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    public static final boolean j() {
        boolean booleanValue = ((Boolean) r.f5053d.f5056c.a(F7.Xa)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return booleanValue && Build.HARDWARE.contains("ranchu");
    }

    public static final void k(Context context, String str, Bundle bundle, d dVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            j3.f.f17514b.getClass();
            str = j3.f.a(context) + ".244410000";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str2 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str2, bundle.getString(str2));
        }
        dVar.d(appendQueryParameter.toString());
    }

    public static final int l(Context context, int i) {
        return i(context.getResources().getDisplayMetrics(), i);
    }

    public static final String m(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || j()) {
            string = "emulator";
        }
        return n(string, "MD5");
    }

    public static String n(String str, String str2) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public final JSONArray a(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b(jSONArray, it.next());
        }
        return jSONArray;
    }

    public final void b(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(f((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(g((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(e((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    public final void c(JSONObject jSONObject, String str, Object obj) {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) r.f5053d.f5056c.a(F7.f8871o)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, f((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, g((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), a((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, a(Arrays.asList((Object[]) obj)));
            return;
        }
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr == null) {
                numArr = new Integer[0];
            } else {
                int length = iArr.length;
                Integer[] numArr2 = new Integer[length];
                while (i < length) {
                    numArr2[i] = Integer.valueOf(iArr[i]);
                    i++;
                }
                numArr = numArr2;
            }
            jSONObject.put(str, e(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr2 = (double[]) obj;
            if (dArr2 == null) {
                dArr = new Double[0];
            } else {
                int length2 = dArr2.length;
                Double[] dArr3 = new Double[length2];
                while (i < length2) {
                    dArr3[i] = Double.valueOf(dArr2[i]);
                    i++;
                }
                dArr = dArr3;
            }
            jSONObject.put(str, e(dArr));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr == null) {
                lArr = new Long[0];
            } else {
                int length3 = jArr.length;
                Long[] lArr2 = new Long[length3];
                while (i < length3) {
                    lArr2[i] = Long.valueOf(jArr[i]);
                    i++;
                }
                lArr = lArr2;
            }
            jSONObject.put(str, e(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            boolArr = new Boolean[0];
        } else {
            int length4 = zArr.length;
            Boolean[] boolArr2 = new Boolean[length4];
            while (i < length4) {
                boolArr2[i] = Boolean.valueOf(zArr[i]);
                i++;
            }
            boolArr = boolArr2;
        }
        jSONObject.put(str, e(boolArr));
    }

    public final int d(Context context, int i) {
        if (this.f5867a < 0.0f) {
            synchronized (this) {
                try {
                    if (this.f5867a < 0.0f) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.f5867a = displayMetrics.density;
                    }
                } finally {
                }
            }
        }
        return Math.round(i / this.f5867a);
    }

    public final JSONArray e(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            b(jSONArray, obj);
        }
        return jSONArray;
    }

    public final JSONObject f(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            c(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject g(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                c(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e3) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e3.getMessage())));
        }
    }
}
