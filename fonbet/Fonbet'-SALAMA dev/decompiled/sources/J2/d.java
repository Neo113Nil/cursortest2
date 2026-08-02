package J2;

import F2.C0254t;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
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
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzflw;
import com.google.android.gms.internal.ads.zzfpq;
import io.sentry.protocol.OperatingSystem;
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
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final zzfpq f3805b = new zzfpq(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    public static final String f3806c = AdView.class.getName();

    /* renamed from: d, reason: collision with root package name */
    public static final String f3807d = K2.a.class.getName();

    /* renamed from: e, reason: collision with root package name */
    public static final String f3808e = AdManagerAdView.class.getName();

    /* renamed from: f, reason: collision with root package name */
    public static final String f3809f = z2.c.class.getName();

    /* renamed from: g, reason: collision with root package name */
    public static final String f3810g = zzflw.class.getName();

    /* renamed from: h, reason: collision with root package name */
    public static final String f3811h = y2.g.class.getName();

    /* renamed from: a, reason: collision with root package name */
    public float f3812a;

    public static String a(String str, String str2) {
        for (int i7 = 0; i7 < 2; i7++) {
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

    public static final void e(y2.l lVar, zzr zzrVar, String str, int i7, int i8) {
        if (lVar.getChildCount() != 0) {
            return;
        }
        Context context = lVar.getContext();
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setText(str);
        textView.setTextColor(i7);
        textView.setBackgroundColor(i8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i7);
        int p5 = p(3, context);
        int i9 = zzrVar.f10776f;
        int i10 = zzrVar.f10773c;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(i9 - p5, i10 - p5, 17));
        lVar.addView(frameLayout, i9, i10);
    }

    public static int f(int i7, Context context) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i8 = configuration.orientation;
        if (i7 == 0) {
            i7 = i8;
        }
        return i7 == i8 ? Math.round(displayMetrics.heightPixels / displayMetrics.density) : Math.round(displayMetrics.widthPixels / displayMetrics.density);
    }

    public static y2.j h(int i7, Context context, int i8) {
        int f7 = f(i8, context);
        if (f7 == -1) {
            return y2.j.f18162q;
        }
        return new y2.j(i7, Math.max(Math.min(i7 > 655 ? Math.round((i7 / 728.0f) * 90.0f) : i7 > 632 ? 81 : i7 > 526 ? Math.round((i7 / 468.0f) * 60.0f) : i7 > 432 ? 68 : Math.round((i7 / 320.0f) * 50.0f), Math.min(90, Math.round(f7 * 0.15f))), 50));
    }

    public static boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzbeh.zzd.zze());
    }

    public static final int m(DisplayMetrics displayMetrics, int i7) {
        return (int) TypedValue.applyDimension(1, i7, displayMetrics);
    }

    public static final boolean n() {
        boolean booleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlt)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return booleanValue && Build.HARDWARE.contains("ranchu");
    }

    public static final void o(Context context, String str, Bundle bundle, c cVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString(OperatingSystem.TYPE, Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            com.google.android.gms.common.d.f11217b.getClass();
            str = com.google.android.gms.common.g.getApkVersion(context) + ".250930000";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str2 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str2, bundle.getString(str2));
        }
        cVar.zza(appendQueryParameter.toString());
    }

    public static final int p(int i7, Context context) {
        return m(context.getResources().getDisplayMetrics(), i7);
    }

    public static final String q(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || n()) {
            string = "emulator";
        }
        return a(string, "MD5");
    }

    public final JSONArray b(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c(jSONArray, it.next());
        }
        return jSONArray;
    }

    public final void c(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(j((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(k((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(b((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(i((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    public final void d(JSONObject jSONObject, String str, Object obj) {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzo)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, j((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, k((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), b((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, b(Arrays.asList((Object[]) obj)));
            return;
        }
        int i7 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            if (iArr == null) {
                numArr = new Integer[0];
            } else {
                int length = iArr.length;
                Integer[] numArr2 = new Integer[length];
                while (i7 < length) {
                    numArr2[i7] = Integer.valueOf(iArr[i7]);
                    i7++;
                }
                numArr = numArr2;
            }
            jSONObject.put(str, i(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr2 = (double[]) obj;
            if (dArr2 == null) {
                dArr = new Double[0];
            } else {
                int length2 = dArr2.length;
                Double[] dArr3 = new Double[length2];
                while (i7 < length2) {
                    dArr3[i7] = Double.valueOf(dArr2[i7]);
                    i7++;
                }
                dArr = dArr3;
            }
            jSONObject.put(str, i(dArr));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            if (jArr == null) {
                lArr = new Long[0];
            } else {
                int length3 = jArr.length;
                Long[] lArr2 = new Long[length3];
                while (i7 < length3) {
                    lArr2[i7] = Long.valueOf(jArr[i7]);
                    i7++;
                }
                lArr = lArr2;
            }
            jSONObject.put(str, i(lArr));
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
            while (i7 < length4) {
                boolArr2[i7] = Boolean.valueOf(zArr[i7]);
                i7++;
            }
            boolArr = boolArr2;
        }
        jSONObject.put(str, i(boolArr));
    }

    public final int g(int i7, Context context) {
        if (this.f3812a < 0.0f) {
            synchronized (this) {
                try {
                    if (this.f3812a < 0.0f) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.f3812a = displayMetrics.density;
                    }
                } finally {
                }
            }
        }
        return Math.round(i7 / this.f3812a);
    }

    public final JSONArray i(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            c(jSONArray, obj);
        }
        return jSONArray;
    }

    public final JSONObject j(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            d(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject k(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                d(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e7) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e7.getMessage())));
        }
    }
}
