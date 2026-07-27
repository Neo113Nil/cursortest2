package com.applovin.impl;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4761z5;
import com.ironsource.U3;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.UByte$$ExternalSyntheticBackport0;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class t7 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f4514a = {60, 60, 24, 7, 4, 12};
    private static final String[] b = {" second", " minute", " hour", " day", " week", " month"};
    private static final String[] c = {CmcdData.Factory.STREAMING_FORMAT_SS, InneractiveMediationDefs.GENDER_MALE, "h", "d", "w", "mth"};
    private static final DecimalFormat d = new DecimalFormat();
    private static final Random e = new Random();
    private static Boolean f;
    private static Boolean g;
    private static String h;
    private static Boolean i;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    class b extends y4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4515a;

        b(String str) {
            this.f4515a = str;
        }

        @Override // com.applovin.impl.y4
        protected Map a() {
            return CollectionUtils.hashMap("name", "Utils:" + this.f4515a);
        }
    }

    public static double a(long j) {
        return j / 1024.0d;
    }

    public static int a(int i2, int i3) {
        return (i2 < 0 || i2 > 100) ? i3 : i2;
    }

    public static String a(Map map, boolean z) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            TreeMap treeMap = new TreeMap(new a());
            treeMap.putAll(map);
            map = treeMap;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(U3.j.c);
            }
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) value;
                if (str.contains(U3.j.c)) {
                    value = str.replace(U3.j.c, "%26");
                }
            }
            sb.append(entry.getKey()).append(C4761z5.U).append(value);
        }
        return sb.toString();
    }

    public static void a() {
    }

    public static boolean a(long j, long j2) {
        return (j & j2) != 0;
    }

    public static float b(float f2) {
        return f2 * 1000.0f;
    }

    public static long b(long j) {
        return j * 8;
    }

    public static void b() {
    }

    public static int c(int i2) {
        return a(i2, 95);
    }

    public static void c() {
    }

    public static double d(long j) {
        return j / 1000.0d;
    }

    public static int d(int i2) {
        return i2 * 1024;
    }

    public static long e(String str) {
        if (!StringUtils.isValidString(str)) {
            return Long.MAX_VALUE;
        }
        try {
            return Color.parseColor(str);
        } catch (Throwable unused) {
            return Long.MAX_VALUE;
        }
    }

    public static String f(String str) {
        return (str == null || str.length() <= 4) ? "NOKEY" : str.substring(str.length() - 4);
    }

    public static int g(String str) {
        int i2 = 0;
        for (String str2 : str.replaceAll("-beta", ".").split("\\.")) {
            if (str2.length() > 2) {
                com.applovin.impl.sdk.p.h("Utils", "Version number components cannot be longer than two digits -> " + str);
                return i2;
            }
            i2 = (i2 * 100) + Integer.parseInt(str2);
        }
        return !str.contains("-beta") ? (i2 * 100) + 99 : i2;
    }

    public static boolean h() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("Utils", "Exception thrown while getting memory state.", th);
        }
        int i2 = runningAppProcessInfo.importance;
        return i2 == 100 || i2 == 200;
    }

    public static boolean i() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean j() {
        return !a("com.applovin.sdk.AppLovinSdk");
    }

    public static boolean k() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                String displayName = networkInterfaces.nextElement().getDisplayName();
                if (displayName.contains("tun") || displayName.contains("ppp") || displayName.contains("ipsec")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("Utils", "Unable to check Network Interfaces", th);
            return false;
        }
    }

    public static boolean l() {
        Context p = com.applovin.impl.sdk.l.p();
        if (p != null) {
            return y.a(p).a("applovin.sdk.verbose_logging");
        }
        return false;
    }

    public static boolean m(Context context) {
        if (context == null) {
            context = com.applovin.impl.sdk.l.p();
        }
        if (context != null) {
            return y.a(context).a("applovin.sdk.verbose_logging", false);
        }
        return false;
    }

    public static void b(String str, String str2) {
        if (str == null || str.length() <= d(8)) {
            return;
        }
        com.applovin.impl.sdk.p.j(str2, "Provided custom data parameter longer than supported (" + str.length() + " bytes, " + d(8) + " maximum)");
    }

    public static long c(float f2) {
        return a(b(f2));
    }

    public static Boolean i(Context context) {
        if (context == null) {
            return null;
        }
        Boolean bool = i;
        if (bool != null) {
            return bool;
        }
        try {
            String a2 = y.a(context).a();
            String c2 = c(context);
            if (c2 == null) {
                return null;
            }
            if (c2.equals(a2)) {
                Boolean bool2 = Boolean.TRUE;
                i = bool2;
                return bool2;
            }
            if (TextUtils.isEmpty(a2) && c2.equals(context.getPackageName())) {
                Boolean bool3 = Boolean.TRUE;
                i = bool3;
                return bool3;
            }
            Boolean bool4 = Boolean.FALSE;
            i = bool4;
            return bool4;
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.b("Utils", "Unable to determine if the current process is the main process", th);
            return null;
        }
    }

    public static boolean j(Context context) {
        if (g == null) {
            g = Boolean.valueOf("com.applovin.apps.playables".equals(context.getPackageName()));
        }
        return g.booleanValue();
    }

    public static double c(long j) {
        return a(b(j));
    }

    public static int d(Context context) {
        WindowManager f2 = f(context);
        if (f2 == null) {
            return 0;
        }
        return f2.getDefaultDisplay().getRotation();
    }

    public static boolean c(com.applovin.impl.sdk.l lVar) {
        String str = lVar.p0().getExtraParameters().get("run_in_release_mode");
        return ((StringUtils.isValidString(str) && Boolean.parseBoolean(str)) || (com.applovin.impl.sdk.l.p().getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static boolean l(Context context) {
        if (context == null) {
            return false;
        }
        try {
            context.getResources();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String b(Class cls, String str) {
        try {
            Field a2 = a(cls, str);
            a2.setAccessible(true);
            return (String) a2.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String e() {
        try {
            for (Field field : Build.VERSION_CODES.class.getFields()) {
                if (field.getInt(null) == Build.VERSION.SDK_INT) {
                    return field.getName();
                }
            }
            return "";
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("Utils", "Unable to get Android SDK codename", th);
            return "";
        }
    }

    public static long c(byte[] bArr) {
        return a(bArr, 0);
    }

    public static WindowManager f(Context context) {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        StrictMode.setVmPolicy(vmPolicy);
        return windowManager;
    }

    public static String c(String str) {
        return str.replace("ALPlayableAnalytics.trackEvent = ", "ALPlayableAnalytics.trackEvent = function (eventName) {const SDK_URL = 'applovin://com.applovin.sdk/playable_event';if (!Object.values(ALPlayableEvent).includes(eventName)) {var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=0&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();return;}var aTag = document.createElement('a');aTag.setAttribute('href', SDK_URL + '?success=1&type=' + encodeURIComponent(eventName));aTag.innerHTML = 'empty';aTag.click();}; ALPlayableAnalytics.trackEvent_ignore = ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(AppLovinAd appLovinAd, com.applovin.impl.sdk.l lVar) {
        if (appLovinAd instanceof AppLovinAdBase) {
            AppLovinAdBase appLovinAdBase = (AppLovinAdBase) appLovinAd;
            String k0 = lVar.k0();
            String k02 = appLovinAdBase.getSdk().k0();
            if (k0.equals(k02)) {
                return;
            }
            String str = "Ad was loaded from sdk with key: " + k02 + ", but is being rendered from sdk with key: " + k0;
            com.applovin.impl.sdk.p.h("AppLovinAd", str);
            a(str, appLovinAdBase, "AppLovinAd", lVar);
        }
    }

    public static String d() {
        try {
            return Build.VERSION.RELEASE + " (" + e() + " - API " + Build.VERSION.SDK_INT + ")";
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("Utils", "Unable to get Android OS info", th);
            return "";
        }
    }

    public static String c(Context context) {
        int myPid;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return null;
        }
        if (StringUtils.isValidString(h)) {
            return h;
        }
        try {
            myPid = Process.myPid();
            runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.b("Utils", "Unable to determine process name", th);
        }
        if (runningAppProcesses == null) {
            com.applovin.impl.sdk.p.c("Utils", "No running app processes. Unable to determine process name");
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (myPid == runningAppProcessInfo.pid) {
                String str = runningAppProcessInfo.processName;
                h = str;
                return str;
            }
        }
        return null;
    }

    public static com.applovin.impl.sdk.l f() {
        com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.E0;
        if (lVar != null) {
            return lVar;
        }
        Context p = com.applovin.impl.sdk.l.p();
        if (p == null) {
            return null;
        }
        return AppLovinSdk.getInstance(p).a();
    }

    public static boolean h(Context context) {
        if (f == null) {
            f = Boolean.valueOf("com.applovin.apps.dspdemo".equals(context.getPackageName()));
        }
        return f.booleanValue();
    }

    public static boolean k(Context context) {
        String packageName = context.getPackageName();
        return "com.revolverolver.fliptrickster".equals(packageName) || "com.mindstormstudios.idlemakeover".equals(packageName);
    }

    public static byte[] d(byte[] bArr) {
        if (bArr == null || bArr.length == 0 || !b(bArr)) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        byte[] bArr2 = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr2);
            if (read > 0) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static boolean e(com.applovin.impl.sdk.l lVar) {
        if (((Boolean) lVar.a(c5.i2)).booleanValue()) {
            return lVar.p0().isMuted();
        }
        return ((Boolean) lVar.a(c5.g2)).booleanValue();
    }

    public static boolean g(Context context) {
        return y.a(context).a("applovin.sdk.is_test_environment");
    }

    public static String b(Context context) {
        Point b2 = p0.b(context);
        int i2 = b2.x;
        int i3 = b2.y;
        int d2 = d(context);
        if ((i2 > i3 && (d2 == 0 || d2 == 2)) || (i3 > i2 && (d2 == 1 || d2 == 3))) {
            return a(d2);
        }
        return b(d2);
    }

    public static int g() {
        if (p0.b()) {
            return WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout();
        }
        return 0;
    }

    public static Context e(Context context) {
        return l(context) ? context : com.applovin.impl.sdk.l.p();
    }

    public static String d(String str) {
        return a(str, str.split("\\.").length);
    }

    public static boolean d(com.applovin.impl.sdk.l lVar) {
        String str = lVar.p0().getExtraParameters().get("user_agent_collection_enabled");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return true;
    }

    private static String b(int i2) {
        if (i2 == 0) {
            return U3.i.D;
        }
        if (i2 == 1) {
            return "landscape_right";
        }
        if (i2 == 2) {
            return "portrait_upside_down";
        }
        if (i2 != 3) {
            return "unknown";
        }
        return "landscape_left";
    }

    public static Map a(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                hashMap.put((String) entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return hashMap;
    }

    private static long b(String str) {
        if (str == null) {
            return 0L;
        }
        return new File(str).length();
    }

    public static boolean b(byte[] bArr) {
        return bArr.length >= 2 && bArr[0] == 31 && bArr[1] == -117;
    }

    public static boolean b(com.applovin.impl.sdk.l lVar) {
        try {
            JSONObject.wrap(JSONObject.NULL);
            return true;
        } catch (Throwable th) {
            lVar.Q();
            if (!com.applovin.impl.sdk.p.a()) {
                return false;
            }
            lVar.Q().d("Utils", "Failed to wrap JSONObject with exception", th);
            return false;
        }
    }

    public static boolean a(String str, List list) {
        return StringUtils.startsWithAtLeastOnePrefix(str, list);
    }

    public static boolean b(List list) {
        Context p = com.applovin.impl.sdk.l.p();
        if (p == null) {
            com.applovin.impl.sdk.p.h("Utils", "Failed to check whether or not app is member of package names");
            return false;
        }
        return list.contains(p.getPackageName());
    }

    public static long a(com.applovin.impl.sdk.l lVar) {
        long longValue = ((Long) lVar.a(c5.R5)).longValue();
        long longValue2 = ((Long) lVar.a(c5.S5)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        return (longValue <= 0 || longValue2 <= 0) ? currentTimeMillis : currentTimeMillis + (longValue - longValue2);
    }

    public static void a(String str, String str2, Map map) {
        if (map.containsKey(str)) {
            map.put(str2, map.get(str));
            map.remove(str);
        }
    }

    public static WebView b(Context context, String str) {
        return a(context, str, false);
    }

    private static long a(float f2) {
        return Math.round(f2);
    }

    public static String a(long j, boolean z) {
        String str;
        String[] strArr = z ? b : c;
        long currentTimeMillis = (System.currentTimeMillis() - j) / 1000;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            long j2 = f4514a[i2];
            if (currentTimeMillis < j2) {
                if (currentTimeMillis <= 0) {
                    return z ? "just now" : "now";
                }
                String str2 = "";
                if (!z || currentTimeMillis <= 1) {
                    str = "";
                } else {
                    str = CmcdData.Factory.STREAMING_FORMAT_SS;
                }
                if (z) {
                    str2 = " ago";
                }
                return String.format("%d%s%s%s", Long.valueOf(currentTimeMillis), strArr[i2], str, str2);
            }
            currentTimeMillis /= j2;
        }
        return z ? "just now" : "now";
    }

    public static double a(String str, double d2) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("Utils", "Failed to parse double from String: " + str, th);
            return d2;
        }
    }

    public static String a(Uri uri, String str, com.applovin.impl.sdk.l lVar) {
        List c2 = lVar.c(c5.H0);
        String lastPathSegment = uri.getLastPathSegment();
        if (c2.contains(lastPathSegment)) {
            return lastPathSegment;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (it.hasNext()) {
            String queryParameter = uri.getQueryParameter(it.next());
            if (StringUtils.isValidString(queryParameter)) {
                arrayList.add(queryParameter);
            }
        }
        arrayList.addAll(uri.getPathSegments());
        String encodeUriString = StringUtils.encodeUriString(TextUtils.join("_", arrayList));
        Integer num = (Integer) lVar.a(c5.I0);
        int length = StringUtils.emptyIfNull(encodeUriString).length() + StringUtils.emptyIfNull(str).length();
        if (length > num.intValue() && StringUtils.isValidString(encodeUriString)) {
            encodeUriString = encodeUriString.substring(length - num.intValue());
        }
        return (StringUtils.isValidString(encodeUriString) && StringUtils.isValidString(str)) ? str + encodeUriString : encodeUriString;
    }

    public static void a(String str, MaxAdFormat maxAdFormat, JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        if (jSONObject.has("no_fill_reason")) {
            String str2 = "\n**************************************************\nNO FILL received:\n..ID: \"" + str + "\"\n..FORMAT: \"" + (maxAdFormat != null ? maxAdFormat.getLabel() : "None") + "\"\n..SDK KEY: \"" + lVar.k0() + "\"\n..PACKAGE NAME: \"" + com.applovin.impl.sdk.l.p().getPackageName() + "\"\n..Reason: " + JsonUtils.getObject(jSONObject, "no_fill_reason", new Object()) + "\n**************************************************\n";
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("AppLovinSdk", str2);
            }
        }
    }

    public static AppLovinAd a(AppLovinAd appLovinAd, com.applovin.impl.sdk.l lVar) {
        if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
            return appLovinAd;
        }
        com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd;
        AppLovinAd dequeueAd = lVar.l().dequeueAd(cVar.getAdZone());
        lVar.Q();
        if (com.applovin.impl.sdk.p.a()) {
            lVar.Q().a("Utils", "Dequeued ad for dummy ad: " + dequeueAd);
        }
        if (dequeueAd != null) {
            cVar.a(dequeueAd);
            ((AppLovinAdImpl) dequeueAd).setDummyAd(cVar);
            return dequeueAd;
        }
        return cVar.f();
    }

    public static u a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        return u.a(AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", null)), AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", null)), JsonUtils.getString(jSONObject, "zone_id", null), true, JsonUtils.getBoolean(jSONObject, "is_direct_sold", Boolean.FALSE).booleanValue());
    }

    public static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return a(superclass, str);
        }
    }

    public static List a(JSONObject jSONObject, String str, String str2, com.applovin.impl.sdk.l lVar) {
        return a(jSONObject, str, null, str2, null, false, lVar);
    }

    public static List a(JSONObject jSONObject, String str, Map map, String str2, Map map2, boolean z, com.applovin.impl.sdk.l lVar) {
        if (map == null) {
            map = new HashMap(1);
        }
        Map map3 = map;
        map3.put("{CLCODE}", str);
        return a(jSONObject, map3, str2, map2, z, lVar);
    }

    public static List a(JSONObject jSONObject, Map map, String str, Map map2, boolean z, com.applovin.impl.sdk.l lVar) {
        ArrayList arrayList = new ArrayList(jSONObject.length() + 1);
        if (StringUtils.isValidString(str)) {
            arrayList.add(new e(str, null, map2, z));
        }
        if (jSONObject.length() <= 0) {
            return arrayList;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    String optString = jSONObject.optString(next);
                    String replace = StringUtils.replace(next, map);
                    if (AppLovinSdkUtils.isValidString(optString)) {
                        optString = StringUtils.replace(optString, map);
                    }
                    arrayList.add(new e(replace, optString, map2, z));
                }
            } catch (Throwable th) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("Utils", "Failed to create and add postback url.", th);
                }
            }
        }
        return arrayList;
    }

    public static void a(com.applovin.impl.sdk.l lVar, String str) {
        String k0 = lVar.k0();
        if (((Boolean) lVar.a(c5.x)).booleanValue()) {
            if (k0 == null || k0.length() != 86) {
                a(TextUtils.isEmpty(k0) ? "Empty SDK key" : "Invalid SDK key length", str, lVar);
            }
        }
    }

    private static void a(String str, String str2, com.applovin.impl.sdk.l lVar) {
        a(str, (AppLovinAdBase) null, str2, lVar);
    }

    private static void a(String str, AppLovinAdBase appLovinAdBase, String str2, com.applovin.impl.sdk.l lVar) {
        StringBuilder sb = new StringBuilder("sdkKey=");
        sb.append(lVar.k0());
        if (appLovinAdBase != null) {
            sb.append(",adSdkKey=").append(appLovinAdBase.getSdk().k0());
        }
        HashMap hashMap = new HashMap();
        CollectionUtils.putStringIfValid("details", sb.toString(), hashMap);
        CollectionUtils.putStringIfValid("error_message", str, hashMap);
        lVar.E().a(h2.e1, str2, hashMap);
    }

    public static Map a(Map map, com.applovin.impl.sdk.l lVar) {
        Map map2 = CollectionUtils.map(map);
        for (String str : map2.keySet()) {
            String str2 = (String) map2.get(str);
            if (str2 != null) {
                map2.put(str, StringUtils.encodeUriString(str2));
            }
        }
        return map2;
    }

    public static String a(Context context, String str, com.applovin.impl.sdk.l lVar) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(context.getPackageName());
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (queryIntentActivities.isEmpty()) {
                return null;
            }
            return queryIntentActivities.get(0).activityInfo.name;
        } catch (Throwable th) {
            lVar.E().a(str, th);
            return null;
        }
    }

    private static String a(int i2) {
        if (i2 == 0) {
            return "landscape_right";
        }
        if (i2 == 1) {
            return "portrait_upside_down";
        }
        if (i2 == 2) {
            return "landscape_left";
        }
        if (i2 != 3) {
            return "unknown";
        }
        return U3.i.D;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (a((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void a(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(1);
        thread.start();
    }

    public static void a(Closeable closeable, com.applovin.impl.sdk.l lVar) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th) {
            if (lVar != null) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("Utils", "Unable to close stream: " + closeable, th);
                }
            }
        }
    }

    public static void a(HttpURLConnection httpURLConnection, com.applovin.impl.sdk.l lVar) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Throwable th) {
            if (lVar != null) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("Utils", "Unable to disconnect connection: " + httpURLConnection, th);
                }
            }
        }
    }

    public static void a(final String str, final Context context) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.t7$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                t7.a(context, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, String str) {
        Toast makeText = Toast.makeText(context, str, 0);
        makeText.setMargin(0.0f, 0.1f);
        makeText.show();
    }

    public static void a(String str, MaxAd maxAd, Context context) {
        Toast.makeText(context, maxAd.getFormat().getLabel() + ": " + str, 1).show();
    }

    public static boolean a(AppLovinAdSize appLovinAdSize) {
        return appLovinAdSize == AppLovinAdSize.BANNER || appLovinAdSize == AppLovinAdSize.MREC || appLovinAdSize == AppLovinAdSize.LEADER;
    }

    public static String a(Object obj) {
        if (obj instanceof c3) {
            return ((c3) obj).T();
        }
        if (a4.a(obj)) {
            return ((com.applovin.impl.sdk.ad.b) obj).getMediationServeId();
        }
        return null;
    }

    public static List a(boolean z, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.l lVar, Context context) {
        if (bVar instanceof u7) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = new ArrayList(bVar.m().keySet()).iterator();
        while (it.hasNext()) {
            Uri parse = Uri.parse((String) it.next());
            if (a(parse, lVar, context)) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().b("Utils", "Cached HTML asset missing: " + parse);
                }
                arrayList.add(parse);
            }
        }
        Uri n0 = bVar.n0();
        if (z && n0 != null && a(n0, lVar, context)) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("Utils", "Cached video missing: " + n0);
            }
            arrayList.add(n0);
        }
        return arrayList;
    }

    private static boolean a(Uri uri, com.applovin.impl.sdk.l lVar, Context context) {
        return !lVar.I().c(uri.getLastPathSegment(), context) || (((Boolean) lVar.a(c5.f6)).booleanValue() && (b(uri.getPath()) > 0L ? 1 : (b(uri.getPath()) == 0L ? 0 : -1)) == 0);
    }

    public static boolean a(List list, com.applovin.impl.sdk.ad.b bVar) {
        if (list.isEmpty()) {
            return false;
        }
        List S = bVar.S();
        Map m = bVar.m();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (S.contains((String) m.get(((Uri) it.next()).toString()))) {
                return true;
            }
        }
        return false;
    }

    public static void a(MaxError maxError, String str, Context context) {
        StringBuilder sb = new StringBuilder();
        if (maxError.getCode() == -5001) {
            for (MaxNetworkResponseInfo maxNetworkResponseInfo : maxError.getWaterfall().getNetworkResponses()) {
                MaxError error = maxNetworkResponseInfo.getError();
                String name = maxNetworkResponseInfo.getMediatedNetwork().getName();
                sb.append("\nFailed to load " + str + " from " + name + ":\n");
                sb.append("\nMAX Error " + error.getCode() + ": " + error.getMessage() + "\n");
                sb.append("\n" + name + " Error " + error.getMediatedNetworkErrorCode() + ": " + error.getMediatedNetworkErrorMessage() + "\n\n");
            }
        } else {
            sb.append("Failed to load " + str + " with error " + maxError.getCode() + ": " + maxError.getMessage());
        }
        a("", sb.toString(), context);
    }

    public static void a(String str, String str2, Context context) {
        new AlertDialog.Builder(context).setTitle(str).setMessage(str2).setNegativeButton(R.string.ok, (DialogInterface.OnClickListener) null).create().show();
    }

    public static boolean a(double d2) {
        if (d2 >= 100.0d) {
            return true;
        }
        return d2 > 0.0d && ((double) e.nextFloat()) < d2 / 100.0d;
    }

    public static byte[] a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static long a(byte[] bArr, int i2) {
        int i3 = i2 + 8;
        if (bArr.length < i3) {
            throw new IllegalArgumentException("byte array must be at least 8 bytes long");
        }
        long j = 0;
        while (i2 < i3) {
            j |= (bArr[i2] & 255) << (i2 * 8);
            i2++;
        }
        return j;
    }

    public static int a(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "always_finish_activities", 0);
    }

    public static String a(String str, int i2) {
        String[] split = StringUtils.toDigitsOnlyVersionString(str).split("\\.");
        if (split.length == i2) {
            return UByte$$ExternalSyntheticBackport0.m((CharSequence) ".", (CharSequence[]) split);
        }
        if (split.length > i2) {
            return UByte$$ExternalSyntheticBackport0.m((CharSequence) ".", (Iterable) new ArrayList(Arrays.asList(split)).subList(0, i2));
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(split));
        arrayList.addAll(Collections.nCopies(i2 - arrayList.size(), "0"));
        return UByte$$ExternalSyntheticBackport0.m((CharSequence) ".", (Iterable) arrayList);
    }

    public static int a(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return 0;
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (TextUtils.isEmpty(str2)) {
            return 1;
        }
        String digitsOnlyVersionString = StringUtils.toDigitsOnlyVersionString(str);
        String digitsOnlyVersionString2 = StringUtils.toDigitsOnlyVersionString(str2);
        try {
            String[] split = digitsOnlyVersionString.split("\\.");
            String[] split2 = digitsOnlyVersionString2.split("\\.");
            int max = Math.max(split.length, split2.length);
            int i2 = 0;
            while (i2 < max) {
                String str3 = i2 < split.length ? split[i2] : "0";
                String str4 = i2 < split2.length ? split2[i2] : "0";
                int parseInt = Integer.parseInt(str3);
                int parseInt2 = Integer.parseInt(str4);
                if (parseInt < parseInt2) {
                    return -1;
                }
                if (parseInt > parseInt2) {
                    return 1;
                }
                i2++;
            }
            return 0;
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("Utils", "Failed to process version string.", th);
            return 0;
        }
    }

    public static WebView a(Context context, String str, boolean z) {
        try {
            WebView webView = new WebView(context);
            if (z) {
                webView.setWebViewClient(new b(str));
            }
            return webView;
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("Utils", "Failed to initialize WebView for " + str + ".", th);
            return null;
        }
    }

    public static void a(Uri uri, Activity activity, com.applovin.impl.sdk.l lVar) {
        if (activity == null) {
            activity = lVar.w0();
        }
        Intent intent = new Intent(activity, (Class<?>) AppLovinWebViewActivity.class);
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, lVar.k0());
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, uri.toString());
        activity.startActivity(intent);
    }

    public static String a(int i2, Context context, com.applovin.impl.sdk.l lVar) {
        if (i2 == 0) {
            return "";
        }
        try {
            InputStream openRawResource = context.getResources().openRawResource(i2);
            try {
                byte[] bArr = new byte[openRawResource.available()];
                openRawResource.read(bArr);
                return new String(bArr);
            } catch (IOException e2) {
                if (lVar != null) {
                    lVar.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        lVar.Q().a("Utils", "Opening raw resource file threw exception", e2);
                    }
                }
                return "";
            } finally {
                a(openRawResource, lVar);
            }
        } catch (Throwable th) {
            if (lVar != null) {
                lVar.Q();
                if (com.applovin.impl.sdk.p.a()) {
                    lVar.Q().a("Utils", "Failed to retrieve resource " + i2, th);
                }
            }
            return "";
        }
    }

    public static boolean a(MaxAdFormat maxAdFormat, MaxAdFormat maxAdFormat2) {
        return (maxAdFormat == null || maxAdFormat2 == null || (maxAdFormat != maxAdFormat2 && ((!maxAdFormat.isAdViewAd() || !maxAdFormat2.isAdViewAd()) && (!maxAdFormat.isFullscreenAd() || !maxAdFormat2.isFullscreenAd())))) ? false : true;
    }

    public static boolean a(String str, com.applovin.impl.sdk.l lVar) {
        if (str == null) {
            return false;
        }
        return StringUtils.containsAtLeastOneSubstring(str, lVar.c(c5.t0));
    }

    public static ActivityManager.MemoryInfo a(ActivityManager activityManager) {
        if (activityManager == null) {
            return null;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        try {
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo;
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.b("Utils", "Unable to collect memory info.", th);
            return null;
        }
    }

    public static String a(AppLovinSdkSettings appLovinSdkSettings) {
        String emptyIfNull = StringUtils.emptyIfNull(appLovinSdkSettings.getExtraParameters().get("applovin_unity_metadata"));
        if (TextUtils.isEmpty(emptyIfNull)) {
            return null;
        }
        Map<String, String> tryToStringMap = JsonUtils.tryToStringMap(JsonUtils.jsonObjectFromJsonString(emptyIfNull, new JSONObject()));
        if (CollectionUtils.isEmpty(tryToStringMap)) {
            return null;
        }
        return tryToStringMap.get("UnityVersion");
    }

    public static void a(String str, int i2, int i3, s1 s1Var) {
        if (i2 > i3) {
            s1Var.a(h2.g1, str, CollectionUtils.hashMap("details", i2 + " Leaking Instances"));
        }
    }

    public static void a(float f2, long j, com.applovin.impl.sdk.l lVar) {
        Vibrator vibrator = (Vibrator) com.applovin.impl.sdk.l.p().getSystemService("vibrator");
        if (vibrator == null || !vibrator.hasVibrator()) {
            return;
        }
        try {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("Utils", "Vibrating with intensity: " + f2 + " for duration: " + j + "ms");
            }
            if (p0.d()) {
                vibrator.vibrate(VibrationEffect.createOneShot(j, Math.max(1, Math.min(255, (int) (255.0f * f2)))));
            } else {
                vibrator.vibrate(j);
            }
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("Utils", "Failed to vibrate", th);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("top_main_method", th.toString());
            hashMap.put("details", "intensity=" + f2 + ", duration=" + j);
            lVar.E().a(h2.d1, "hapticsVibrate", hashMap);
        }
    }

    public static List a(String str, List list, com.applovin.impl.sdk.l lVar) {
        if (CollectionUtils.isEmpty(list)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null || CollectionUtils.isEmpty(arrayList)) {
                        break;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str2 = (String) it.next();
                        if (StringUtils.containsIgnoreCase(readLine, str2)) {
                            arrayList2.add(str2);
                            it.remove();
                        }
                    }
                } finally {
                }
            }
            bufferedReader.close();
        } catch (Throwable th) {
            lVar.E().b("Utils", "getStringsPresentInFileLines", th);
        }
        return arrayList2;
    }

    public static PackageInfo a(Context context, int i2) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), i2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
