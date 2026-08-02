package w1;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import io.sentry.SentryLogEvents;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: w1.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1706i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f17733a = {"resource", "http"};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f17734b = {4, 8};

    /* renamed from: c, reason: collision with root package name */
    public static boolean f17735c = false;

    /* renamed from: d, reason: collision with root package name */
    public static int f17736d = 4 | 8;

    /* renamed from: e, reason: collision with root package name */
    public static u1.c f17737e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f17738f = false;

    /* renamed from: g, reason: collision with root package name */
    public static int f17739g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static String f17740h;

    public static ActivityManager.MemoryInfo a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    public static String b(Context context) {
        List<ResolveInfo> queryIntentActivities;
        List<ResolveInfo> queryIntentActivities2;
        PackageManager.ResolveInfoFlags of;
        PackageManager.ResolveInfoFlags of2;
        String str = f17740h;
        if (str != null) {
            return str;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        if (Build.VERSION.SDK_INT >= 33) {
            of2 = PackageManager.ResolveInfoFlags.of(0L);
            queryIntentActivities = packageManager.queryIntentActivities(intent, of2);
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        }
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("androidx.browser.customtabs.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f17740h = null;
        } else if (arrayList.size() == 1) {
            f17740h = (String) arrayList.get(0);
        } else {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    PackageManager packageManager2 = context.getPackageManager();
                    if (Build.VERSION.SDK_INT >= 33) {
                        of = PackageManager.ResolveInfoFlags.of(64L);
                        queryIntentActivities2 = packageManager2.queryIntentActivities(intent, of);
                    } else {
                        queryIntentActivities2 = packageManager2.queryIntentActivities(intent, 64);
                    }
                    if (queryIntentActivities2 != null && queryIntentActivities2.size() != 0) {
                        for (ResolveInfo resolveInfo2 : queryIntentActivities2) {
                            IntentFilter intentFilter = resolveInfo2.filter;
                            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo2.activityInfo != null) {
                                break;
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                }
                if (arrayList.contains(str2)) {
                    f17740h = str2;
                }
            }
            if (arrayList.contains("com.android.chrome")) {
                f17740h = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                f17740h = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                f17740h = "com.chrome.dev";
            } else if (arrayList.contains("com.google.android.apps.chrome")) {
                f17740h = "com.google.android.apps.chrome";
            }
        }
        return f17740h;
    }

    public static String c(String str) {
        return str == null ? "" : str.length() <= 255 ? str : str.substring(0, 255);
    }

    public static String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        for (byte b7 : bArr) {
            sb.append(cArr[(byte) ((b7 & 240) >> 4)]);
            sb.append(cArr[(byte) (b7 & 15)]);
        }
        return sb.toString();
    }

    public static ArrayList e(JSONObject jSONObject) {
        String optString;
        JSONArray optJSONArray = jSONObject.optJSONArray("variants");
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
            if (optJSONObject != null) {
                C1764z0 a2 = C1764z0.a(optJSONObject.optString("document", C1764z0.f17942d.f17943a));
                B0 b02 = new B0();
                b02.f17286d = new HashMap();
                b02.f17283a = a2;
                b02.f17284b = optJSONObject.optInt("id");
                b02.f17285c = optJSONObject.optInt("version");
                JSONArray optJSONArray2 = optJSONObject.optJSONArray(SentryLogEvents.JsonKeys.ITEMS);
                if (optJSONArray2 != null) {
                    for (int i8 = 0; i8 < optJSONArray2.length(); i8++) {
                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i8);
                        if (optJSONObject2 != null && (optString = optJSONObject2.optString("name", null)) != null) {
                            C1749u0 c1749u0 = new C1749u0();
                            String optString2 = optJSONObject2.optString("type");
                            if ("string".equals(optString2)) {
                                c1749u0.f17878a = 1;
                                c1749u0.f17879b = optJSONObject2.optString("value");
                            } else if ("localizedString".equals(optString2)) {
                                c1749u0.f17878a = 2;
                                c1749u0.f17879b = optJSONObject2.optJSONObject("value");
                            } else if ("tombstone".equals(optString2)) {
                                c1749u0.f17878a = 3;
                            } else {
                                q("Unknown ConfigItem type: ".concat(String.valueOf(optString2)));
                            }
                            b02.f17286d.put(optString, c1749u0);
                        }
                    }
                }
                arrayList.add(b02);
            }
        }
        return arrayList;
    }

    public static void f() {
        if (f17735c) {
            return;
        }
        f17735c = true;
        u1.c g3 = u1.c.g();
        f17737e = g3;
        u1.j jVar = new u1.j(2);
        g3.getClass();
        ((C1755w0) g3.f16591b).i(jVar, C1764z0.f17942d);
        u1.c cVar = f17737e;
        cVar.getClass();
        if (r.f17840z.get()) {
            ((C1755w0) cVar.f16591b).m();
        } else {
            q("Flurry SDK must be initialized before fetching config");
        }
    }

    public static void g(L5.L l7, L5.L l8) {
        boolean z4;
        FileChannel fileChannel;
        Object[] objArr = {l7, l8};
        int i7 = 0;
        while (true) {
            if (i7 >= 2) {
                z4 = true;
                break;
            } else {
                if (objArr[i7] == null) {
                    z4 = false;
                    break;
                }
                i7++;
            }
        }
        if (!z4) {
            return;
        }
        String str = l7.f4417a;
        String str2 = l8.f4417a;
        String str3 = l7.f4418b;
        String str4 = l8.f4418b;
        String[] strArr = {str, str3, str2, str4};
        for (int i8 = 0; i8 < 4; i8++) {
            if (TextUtils.isEmpty(strArr[i8])) {
                return;
            }
        }
        FileChannel fileChannel2 = null;
        try {
            File file = new File(l7.f4417a, str3);
            File file2 = new File(l8.f4417a, str4);
            file2.getParentFile().mkdirs();
            file2.delete();
            FileChannel channel = new FileInputStream(file).getChannel();
            try {
                fileChannel2 = new FileOutputStream(file2).getChannel();
                fileChannel2.transferFrom(channel, 0L, channel.size());
                h(channel);
                h(fileChannel2);
                new File(l7.f4417a, l7.f4418b).delete();
            } catch (Exception e7) {
                e = e7;
                FileChannel fileChannel3 = fileChannel2;
                fileChannel2 = channel;
                fileChannel = fileChannel3;
                try {
                    e.getMessage();
                    h(fileChannel2);
                    h(fileChannel);
                } catch (Throwable th) {
                    th = th;
                    h(fileChannel2);
                    h(fileChannel);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                FileChannel fileChannel4 = fileChannel2;
                fileChannel2 = channel;
                fileChannel = fileChannel4;
                h(fileChannel2);
                h(fileChannel);
                throw th;
            }
        } catch (Exception e8) {
            e = e8;
            fileChannel = null;
        } catch (Throwable th3) {
            th = th3;
            fileChannel = null;
        }
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void i(String str, int i7, String str2, boolean z4) {
        if (i7 < 100) {
            return;
        }
        String valueOf = String.valueOf(H2.a().f17406k.f17722A.get());
        long i8 = AbstractC1707i1.i("last_streaming_session_id", Long.MIN_VALUE);
        HashMap hashMap = new HashMap();
        hashMap.put("fl.response.code", String.valueOf(i7));
        if (!TextUtils.isEmpty(str) && str.contains("status code")) {
            StringBuilder sb = new StringBuilder();
            for (String str3 : str.split("<!--|-->")) {
                if (!str3.contains("timestamp")) {
                    String trim = str3.trim();
                    if (trim.length() > 0) {
                        sb.append("<");
                        sb.append(trim);
                        sb.append(">");
                    }
                }
            }
            str = sb.toString();
        }
        hashMap.put("fl.message", str);
        hashMap.put("fl.current.session", Boolean.toString(z4));
        hashMap.put("fl.current.session.id", valueOf);
        hashMap.put("fl.report.identifier", str2);
        if (i8 != Long.MIN_VALUE) {
            hashMap.put("fl.last.session.id", String.valueOf(i8));
        }
    }

    public static void j(String str, String str2, Throwable th) {
        Map emptyMap = Collections.emptyMap();
        AtomicBoolean atomicBoolean = r.f17840z;
        if (atomicBoolean.get() && u1.b.a()) {
            r i7 = r.i();
            if (!atomicBoolean.get()) {
                o(2, "Invalid call to onError. Flurry is not initialized");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            if (emptyMap != null) {
                hashMap.putAll(emptyMap);
            }
            i7.d(new C1693f(str, currentTimeMillis, str2, th, hashMap));
        }
    }

    public static boolean k(int i7) {
        return Build.VERSION.SDK_INT >= i7;
    }

    public static boolean l(String str) {
        Context context = AbstractC1707i1.f17743c;
        return context != null && context.checkCallingOrSelfPermission(str) == 0;
    }

    public static void m() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Must be called from a background thread!");
        }
    }

    public static String n(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Base64.encodeToString(str.getBytes("UTF-8"), 2);
        } catch (UnsupportedEncodingException e7) {
            e7.getMessage();
            return "";
        }
    }

    public static void o(int i7, String str) {
        if (f17738f || f17739g > i7) {
            return;
        }
        int i8 = 0;
        int length = TextUtils.isEmpty(str) ? 0 : str.length();
        while (i8 < length) {
            int i9 = 4000 > length - i8 ? length : i8 + 4000;
            if (Log.println(i7, "FlurryAgent", str.substring(i8, i9)) <= 0) {
                return;
            } else {
                i8 = i9;
            }
        }
    }

    public static void p(int i7, String str, Throwable th) {
        o(i7, str + '\n' + Log.getStackTraceString(th));
    }

    public static void q(String str) {
        o(6, str);
    }

    public static void r(String str, Throwable th) {
        p(6, str, th);
    }

    public static byte[] s(String str) {
        byte[] bArr = new byte[str.length() / 2];
        char[] charArray = str.toCharArray();
        for (int i7 = 0; i7 < charArray.length; i7 += 2) {
            StringBuilder sb = new StringBuilder(2);
            sb.append(charArray[i7]);
            sb.append(charArray[i7 + 1]);
            bArr[i7 / 2] = (byte) Integer.parseInt(sb.toString(), 16);
        }
        return bArr;
    }

    public static void t(String str) {
        o(5, str);
    }
}
