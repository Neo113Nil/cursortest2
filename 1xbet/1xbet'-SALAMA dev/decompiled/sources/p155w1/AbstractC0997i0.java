package p155w1;

import L5.L;
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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p145u1.b;
import p145u1.c;
import p145u1.j;

/* JADX INFO: renamed from: w1.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0997i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f17739a = {"resource", "http"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f17740b = {4, 8};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f17741c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f17742d = 4 | 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static c f17743e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f17744f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f17745g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f17746h;

    public static ActivityManager.MemoryInfo a(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x0103  */
    public static String b(Context context) {
        String str = f17746h;
        if (str != null) {
            return str;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        String str2 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("androidx.browser.customtabs.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f17746h = null;
        } else if (arrayList.size() == 1) {
            f17746h = (String) arrayList.get(0);
        } else if (!TextUtils.isEmpty(str2)) {
            try {
                PackageManager packageManager2 = context.getPackageManager();
                List<ResolveInfo> listQueryIntentActivities2 = Build.VERSION.SDK_INT >= 33 ? packageManager2.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(64L)) : packageManager2.queryIntentActivities(intent, 64);
                if (listQueryIntentActivities2 != null && listQueryIntentActivities2.size() != 0) {
                    Iterator<ResolveInfo> it = listQueryIntentActivities2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ResolveInfo next = it.next();
                            IntentFilter intentFilter = next.filter;
                            if (intentFilter == null || intentFilter.countDataAuthorities() == 0 || intentFilter.countDataPaths() == 0 || next.activityInfo == null) {
                            }
                        } else if (arrayList.contains(str2)) {
                            f17746h = str2;
                        }
                        if (arrayList.contains("com.android.chrome")) {
                            f17746h = "com.android.chrome";
                        } else if (arrayList.contains("com.chrome.beta")) {
                            f17746h = "com.chrome.beta";
                        } else if (arrayList.contains("com.chrome.dev")) {
                            f17746h = "com.chrome.dev";
                        } else if (arrayList.contains("com.google.android.apps.chrome")) {
                            f17746h = "com.google.android.apps.chrome";
                        }
                    }
                } else if (arrayList.contains(str2)) {
                    f17746h = str2;
                } else if (arrayList.contains("com.android.chrome")) {
                    f17746h = "com.android.chrome";
                } else if (arrayList.contains("com.chrome.beta")) {
                    f17746h = "com.chrome.beta";
                } else if (arrayList.contains("com.chrome.dev")) {
                    f17746h = "com.chrome.dev";
                } else if (arrayList.contains("com.google.android.apps.chrome")) {
                    f17746h = "com.google.android.apps.chrome";
                }
            } catch (RuntimeException unused) {
            }
        } else if (arrayList.contains("com.android.chrome")) {
            f17746h = "com.android.chrome";
        } else if (arrayList.contains("com.chrome.beta")) {
            f17746h = "com.chrome.beta";
        } else if (arrayList.contains("com.chrome.dev")) {
            f17746h = "com.chrome.dev";
        } else if (arrayList.contains("com.google.android.apps.chrome")) {
            f17746h = "com.google.android.apps.chrome";
        }
        return f17746h;
    }

    public static String c(String str) {
        if (str == null) {
            return "";
        }
        return str.length() <= 255 ? str : str.substring(0, 255);
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
        String strOptString;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("variants");
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i7);
            if (jSONObjectOptJSONObject != null) {
                C1055z0 c1055z0A = C1055z0.a(jSONObjectOptJSONObject.optString("document", C1055z0.f17948d.f17949a));
                B0 b7 = new B0();
                b7.f17292d = new HashMap();
                b7.f17289a = c1055z0A;
                b7.f17290b = jSONObjectOptJSONObject.optInt("id");
                b7.f17291c = jSONObjectOptJSONObject.optInt("version");
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(SentryLogEvents.JsonKeys.ITEMS);
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i8 = 0; i8 < jSONArrayOptJSONArray2.length(); i8++) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i8);
                        if (jSONObjectOptJSONObject2 != null && (strOptString = jSONObjectOptJSONObject2.optString("name", null)) != null) {
                            C1040u0 c1040u0 = new C1040u0();
                            String strOptString2 = jSONObjectOptJSONObject2.optString("type");
                            if ("string".equals(strOptString2)) {
                                c1040u0.f17884a = 1;
                                c1040u0.f17885b = jSONObjectOptJSONObject2.optString("value");
                            } else if ("localizedString".equals(strOptString2)) {
                                c1040u0.f17884a = 2;
                                c1040u0.f17885b = jSONObjectOptJSONObject2.optJSONObject("value");
                            } else if ("tombstone".equals(strOptString2)) {
                                c1040u0.f17884a = 3;
                            } else {
                                q("Unknown ConfigItem type: ".concat(String.valueOf(strOptString2)));
                            }
                            b7.f17292d.put(strOptString, c1040u0);
                        }
                    }
                }
                arrayList.add(b7);
            }
        }
        return arrayList;
    }

    public static void f() {
        if (f17741c) {
            return;
        }
        f17741c = true;
        c cVarG = c.g();
        f17743e = cVarG;
        j jVar = new j(2);
        cVarG.getClass();
        ((C1046w0) cVarG.f16597b).i(jVar, C1055z0.f17948d);
        c cVar = f17743e;
        cVar.getClass();
        if (r.f17846z.get()) {
            ((C1046w0) cVar.f16597b).m();
        } else {
            q("Flurry SDK must be initialized before fetching config");
        }
    }

    public static void g(L l7, L l8) throws Throwable {
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
        FileChannel channel = null;
        try {
            File file = new File(l7.f4417a, str3);
            File file2 = new File(l8.f4417a, str4);
            file2.getParentFile().mkdirs();
            file2.delete();
            FileChannel channel2 = new FileInputStream(file).getChannel();
            try {
                channel = new FileOutputStream(file2).getChannel();
                channel.transferFrom(channel2, 0L, channel2.size());
                h(channel2);
                h(channel);
                new File(l7.f4417a, l7.f4418b).delete();
            } catch (Exception e7) {
                e = e7;
                FileChannel fileChannel2 = channel;
                channel = channel2;
                fileChannel = fileChannel2;
                try {
                    e.getMessage();
                    h(channel);
                    h(fileChannel);
                } catch (Throwable th) {
                    th = th;
                    h(channel);
                    h(fileChannel);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                FileChannel fileChannel3 = channel;
                channel = channel2;
                fileChannel = fileChannel3;
                h(channel);
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
        String strValueOf = String.valueOf(H2.a().f17412k.f17728A.get());
        long jI = AbstractC0998i1.i("last_streaming_session_id", Long.MIN_VALUE);
        HashMap map = new HashMap();
        map.put("fl.response.code", String.valueOf(i7));
        if (!TextUtils.isEmpty(str) && str.contains("status code")) {
            StringBuilder sb = new StringBuilder();
            for (String str3 : str.split("<!--|-->")) {
                if (!str3.contains("timestamp")) {
                    String strTrim = str3.trim();
                    if (strTrim.length() > 0) {
                        sb.append("<");
                        sb.append(strTrim);
                        sb.append(">");
                    }
                }
            }
            str = sb.toString();
        }
        map.put("fl.message", str);
        map.put("fl.current.session", Boolean.toString(z4));
        map.put("fl.current.session.id", strValueOf);
        map.put("fl.report.identifier", str2);
        if (jI != Long.MIN_VALUE) {
            map.put("fl.last.session.id", String.valueOf(jI));
        }
    }

    public static void j(String str, String str2, Throwable th) {
        Map mapEmptyMap = Collections.emptyMap();
        AtomicBoolean atomicBoolean = r.f17846z;
        if (atomicBoolean.get() && b.a()) {
            r rVarI = r.i();
            if (!atomicBoolean.get()) {
                o(2, "Invalid call to onError. Flurry is not initialized");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            if (mapEmptyMap != null) {
                map.putAll(mapEmptyMap);
            }
            rVarI.d(new C0984f(str, jCurrentTimeMillis, str2, th, map));
        }
    }

    public static boolean k(int i7) {
        return Build.VERSION.SDK_INT >= i7;
    }

    public static boolean l(String str) {
        Context context = AbstractC0998i1.f17749c;
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
        if (f17744f || f17745g > i7) {
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
