package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.webkit.CookieManager;
import androidx.core.os.EnvironmentCompat;
import androidx.webkit.ProxyConfig;
import com.facebook.C0688a;
import com.facebook.C0728q;
import com.facebook.internal.E;
import com.facebook.z;
import com.google.firebase.messaging.Constants;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

@SourceDebugExtension({"SMAP\nUtility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utility.kt\ncom/facebook/internal/Utility\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,1303:1\n37#2,2:1304\n37#2,2:1306\n37#2,2:1309\n37#2,2:1311\n1#3:1308\n107#4:1313\n79#4,22:1314\n*S KotlinDebug\n*F\n+ 1 Utility.kt\ncom/facebook/internal/Utility\n*L\n209#1:1304,2\n211#1:1306,2\n447#1:1309,2\n449#1:1311,2\n452#1:1313\n452#1:1314,22\n*E\n"})
/* loaded from: classes3.dex */
public final class E {
    public static volatile int b;
    public static volatile Locale j;
    public static final E a = new E();
    public static volatile long c = -1;
    public static volatile long d = -1;
    public static volatile long e = -1;
    public static volatile String f = "";
    public static volatile String g = "";
    public static volatile String h = "NoCarrier";
    public static volatile String i = "";

    public interface a {
        void a(JSONObject jSONObject);

        void b(C0728q c0728q);
    }

    @JvmStatic
    public static final boolean A(Uri uri) {
        boolean equals;
        boolean equals2;
        boolean equals3;
        if (uri == null) {
            return false;
        }
        equals = StringsKt__StringsJVMKt.equals(ProxyConfig.MATCH_HTTP, uri.getScheme(), true);
        if (equals) {
            return true;
        }
        equals2 = StringsKt__StringsJVMKt.equals(ProxyConfig.MATCH_HTTPS, uri.getScheme(), true);
        if (equals2) {
            return true;
        }
        equals3 = StringsKt__StringsJVMKt.equals("fbstaging", uri.getScheme(), true);
        return equals3;
    }

    @JvmStatic
    public static final ArrayList B(JSONArray jsonArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jsonArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(jsonArray.getString(i2));
        }
        return arrayList;
    }

    @JvmStatic
    public static final HashMap C(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                Intrinsics.checkNotNullExpressionValue(key, "key");
                String string = jSONObject.getString(key);
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
                hashMap.put(key, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    @JvmStatic
    public static final String D(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        String str = "";
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            str = jSONObject.toString();
        } catch (JSONException unused) {
        }
        Intrinsics.checkNotNullExpressionValue(str, "{\n      try {\n        va…\n        \"\"\n      }\n    }");
        return str;
    }

    @JvmStatic
    public static final Bundle E(String str) {
        List split$default;
        List split$default2;
        Bundle bundle = new Bundle();
        if (!z(str)) {
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
            split$default = StringsKt__StringsKt.split$default(str, new String[]{"&"}, false, 0, 6, (Object) null);
            for (String str2 : (String[]) split$default.toArray(new String[0])) {
                split$default2 = StringsKt__StringsKt.split$default(str2, new String[]{"="}, false, 0, 6, (Object) null);
                String[] strArr = (String[]) split$default2.toArray(new String[0]);
                try {
                    if (strArr.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), URLDecoder.decode(strArr[1], "UTF-8"));
                    } else if (strArr.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException unused) {
                    com.facebook.w wVar = com.facebook.w.a;
                }
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void F(Bundle bundle, JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (jSONArray instanceof boolean[]) {
            bundle.putBooleanArray("media", (boolean[]) jSONArray);
            return;
        }
        if (jSONArray instanceof double[]) {
            bundle.putDoubleArray("media", (double[]) jSONArray);
            return;
        }
        if (jSONArray instanceof int[]) {
            bundle.putIntArray("media", (int[]) jSONArray);
        } else if (jSONArray instanceof long[]) {
            bundle.putLongArray("media", (long[]) jSONArray);
        } else {
            bundle.putString("media", jSONArray.toString());
        }
    }

    @JvmStatic
    public static final HashMap G(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < readInt; i2++) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (readString != null && readString2 != null) {
                hashMap.put(readString, readString2);
            }
        }
        return hashMap;
    }

    @JvmStatic
    public static final String H(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new BufferedInputStream(inputStream));
        try {
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[2048];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    String sb2 = sb.toString();
                    CloseableKt.closeFinally(inputStreamReader, null);
                    Intrinsics.checkNotNullExpressionValue(sb2, "InputStreamReader(buffer…gBuilder.toString()\n    }");
                    return sb2;
                }
                sb.append(cArr, 0, read);
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void I(JSONObject params, Context appContext) throws JSONException {
        Locale locale;
        int i2;
        int i3;
        Display display;
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        a.getClass();
        int i4 = 0;
        if (c == -1 || System.currentTimeMillis() - c >= 1800000) {
            c = System.currentTimeMillis();
            try {
                TimeZone timeZone = TimeZone.getDefault();
                String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
                Intrinsics.checkNotNullExpressionValue(displayName, "tz.getDisplayName(tz.inD…(Date()), TimeZone.SHORT)");
                f = displayName;
                String id2 = timeZone.getID();
                Intrinsics.checkNotNullExpressionValue(id2, "tz.id");
                g = id2;
            } catch (AssertionError unused) {
            } catch (Exception unused2) {
                com.facebook.w wVar = com.facebook.w.a;
            }
            if (Intrinsics.areEqual(h, "NoCarrier")) {
                try {
                    Object systemService = appContext.getSystemService("phone");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
                    String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                    Intrinsics.checkNotNullExpressionValue(networkOperatorName, "telephonyManager.networkOperatorName");
                    h = networkOperatorName;
                } catch (Exception unused3) {
                    com.facebook.w wVar2 = com.facebook.w.a;
                }
            }
            try {
                if (Intrinsics.areEqual("mounted", Environment.getExternalStorageState())) {
                    StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    d = statFs.getBlockCount() * statFs.getBlockSize();
                }
                d = Math.round(d / 1.073741824E9d);
            } catch (Exception unused4) {
            }
            try {
                if (Intrinsics.areEqual("mounted", Environment.getExternalStorageState())) {
                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    e = statFs2.getAvailableBlocks() * statFs2.getBlockSize();
                }
                e = Math.round(e / 1.073741824E9d);
            } catch (Exception unused5) {
            }
        }
        String packageName = appContext.getPackageName();
        int i5 = -1;
        try {
            packageInfo = appContext.getPackageManager().getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException unused6) {
        }
        if (packageInfo == null) {
            return;
        }
        i5 = packageInfo.versionCode;
        i = packageInfo.versionName;
        jSONArray.put(packageName);
        jSONArray.put(i5);
        jSONArray.put(i);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = appContext.getResources().getConfiguration().getLocales().get(0);
        } catch (Exception unused7) {
            locale = Locale.getDefault();
        }
        j = locale;
        StringBuilder sb = new StringBuilder();
        Locale locale2 = j;
        String language = locale2 != null ? locale2.getLanguage() : null;
        if (language == null) {
            language = "";
        }
        sb.append(language);
        sb.append('_');
        Locale locale3 = j;
        String country = locale3 != null ? locale3.getCountry() : null;
        sb.append(country != null ? country : "");
        jSONArray.put(sb.toString());
        jSONArray.put(f);
        jSONArray.put(h);
        double d2 = 0.0d;
        try {
            Object systemService2 = appContext.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
            DisplayManager displayManager = systemService2 instanceof DisplayManager ? (DisplayManager) systemService2 : null;
            display = displayManager != null ? displayManager.getDisplay(0) : null;
        } catch (Exception unused8) {
        }
        if (display != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getMetrics(displayMetrics);
            int i6 = displayMetrics.widthPixels;
            try {
                i4 = displayMetrics.heightPixels;
                d2 = displayMetrics.density;
            } catch (Exception unused9) {
            }
            i2 = i4;
            i4 = i6;
            jSONArray.put(i4);
            jSONArray.put(i2);
            jSONArray.put(new DecimalFormat("#.##").format(d2));
            a.getClass();
            if (b <= 0) {
                i3 = b;
            } else {
                try {
                    File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new D());
                    if (listFiles != null) {
                        b = listFiles.length;
                    }
                } catch (Exception unused10) {
                    com.facebook.w wVar3 = com.facebook.w.a;
                }
                if (b <= 0) {
                    b = Math.max(Runtime.getRuntime().availableProcessors(), 1);
                }
                i3 = b;
            }
            jSONArray.put(i3);
            jSONArray.put(d);
            jSONArray.put(e);
            jSONArray.put(g);
            params.put("extinfo", jSONArray.toString());
        }
        i2 = 0;
        jSONArray.put(i4);
        jSONArray.put(i2);
        jSONArray.put(new DecimalFormat("#.##").format(d2));
        a.getClass();
        if (b <= 0) {
        }
        jSONArray.put(i3);
        jSONArray.put(d);
        jSONArray.put(e);
        jSONArray.put(g);
        params.put("extinfo", jSONArray.toString());
    }

    @JvmStatic
    public static final String J(String str) {
        if (str == null) {
            return null;
        }
        a.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return t("SHA-256", bytes);
    }

    @JvmStatic
    public static final void K(Parcel parcel, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    @JvmStatic
    public static final Uri a(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(ProxyConfig.MATCH_HTTPS);
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        return build;
    }

    public static void b(String str) {
        List split$default;
        List split$default2;
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        split$default = StringsKt__StringsKt.split$default(cookie, new String[]{";"}, false, 0, 6, (Object) null);
        for (String str2 : (String[]) split$default.toArray(new String[0])) {
            split$default2 = StringsKt__StringsKt.split$default(str2, new String[]{"="}, false, 0, 6, (Object) null);
            String[] strArr = (String[]) split$default2.toArray(new String[0]);
            if (strArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                String str3 = strArr[0];
                int length = str3.length() - 1;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length) {
                    boolean z2 = Intrinsics.compare((int) str3.charAt(!z ? i2 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                sb.append(str3.subSequence(i2, length + 1).toString());
                sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                cookieManager.setCookie(str, sb.toString());
            }
        }
        cookieManager.flush();
    }

    @JvmStatic
    public static final void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            a.getClass();
            b("facebook.com");
            b(".facebook.com");
            b("https://facebook.com");
            b("https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    public static final String d(String str) {
        return z(str) ? "" : str;
    }

    @JvmStatic
    public static final HashSet<String> e(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet<String> hashSet = new HashSet<>();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            String string = jSONArray.getString(i2);
            Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    @JvmStatic
    public static final ArrayList f(JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jsonArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String string = jsonArray.getString(i2);
                Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    @JvmStatic
    public static final HashMap g(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jsonObject.names();
        if (names != null) {
            int length = names.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    String string = names.getString(i2);
                    Intrinsics.checkNotNullExpressionValue(string, "keys.getString(i)");
                    Object value = jsonObject.get(string);
                    if (value instanceof JSONObject) {
                        value = g((JSONObject) value);
                    }
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    hashMap.put(string, value);
                } catch (JSONException unused) {
                    com.facebook.w wVar = com.facebook.w.a;
                }
            }
        }
        return hashMap;
    }

    @JvmStatic
    public static final HashMap h(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            String optString = jsonObject.optString(key);
            if (optString != null) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                hashMap.put(key, optString);
            }
        }
        return hashMap;
    }

    @JvmStatic
    public static final int i(InputStream inputStream, OutputStream outputStream) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byte[] bArr = new byte[8192];
            int i2 = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(bufferedInputStream, null);
                    return i2;
                }
                outputStream.write(bArr, 0, read);
                i2 += read;
            }
        } finally {
        }
    }

    @JvmStatic
    public static final void j(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @JvmStatic
    public static final String k(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        String simpleName = context.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "{\n      context.javaClass.simpleName\n    }");
        return simpleName;
    }

    @JvmStatic
    public static final String l(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            com.facebook.w wVar = com.facebook.w.a;
            F.f();
            String str = com.facebook.w.f;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i2 = applicationInfo.labelRes;
            if (i2 == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i2);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(stringId)");
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    @JvmStatic
    public static final Date m(Bundle bundle, String str, Date dateBase) {
        long parseLong;
        Intrinsics.checkNotNullParameter(dateBase, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            parseLong = ((Number) obj).longValue();
        } else {
            if (!(obj instanceof String)) {
                return null;
            }
            try {
                parseLong = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (parseLong == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((parseLong * 1000) + dateBase.getTime());
    }

    @JvmStatic
    public static final JSONObject n() {
        if (com.facebook.internal.instrument.crashshield.a.b(E.class)) {
            return null;
        }
        try {
            String string = com.facebook.w.a().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                    com.facebook.w wVar = com.facebook.w.a;
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, E.class);
            return null;
        }
    }

    @JvmStatic
    public static final void o(final a callback, final String accessToken) {
        String str;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ConcurrentHashMap<String, JSONObject> concurrentHashMap = z.a;
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        JSONObject jSONObject = z.a.get(accessToken);
        if (jSONObject != null) {
            callback.a(jSONObject);
            return;
        }
        z.b bVar = new z.b() { // from class: com.facebook.internal.C
            @Override // com.facebook.z.b
            public final void a(com.facebook.E response) {
                E.a callback2 = E.a.this;
                Intrinsics.checkNotNullParameter(callback2, "$callback");
                String key = accessToken;
                Intrinsics.checkNotNullParameter(key, "$accessToken");
                Intrinsics.checkNotNullParameter(response, "response");
                com.facebook.t tVar = response.c;
                JSONObject value = response.d;
                if (tVar != null) {
                    callback2.b(tVar.k);
                    return;
                }
                if (value == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ConcurrentHashMap<String, JSONObject> concurrentHashMap2 = z.a;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                z.a.put(key, value);
                callback2.a(value);
            }
        };
        a.getClass();
        Bundle bundle = new Bundle();
        C0688a.Companion.getClass();
        C0688a b2 = C0688a.b.b();
        if (b2 == null || (str = b2.m) == null) {
            str = "facebook";
        }
        bundle.putString("fields", Intrinsics.areEqual(str, "instagram") ? "id,name,profile_picture" : "id,name,first_name,middle_name,last_name");
        bundle.putString("access_token", accessToken);
        com.facebook.z.Companion.getClass();
        com.facebook.z zVar = new com.facebook.z(null, "me", null, null, new com.facebook.A(), 32);
        Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        zVar.d = bundle;
        zVar.h = com.facebook.F.a;
        zVar.j(bVar);
        zVar.d();
    }

    @JvmStatic
    public static final String p(Context context) {
        int i2 = F.a;
        Intrinsics.checkNotNullParameter("context", "name");
        if (context != null) {
            return com.facebook.w.b();
        }
        throw new NullPointerException("Argument 'context' cannot be null");
    }

    @JvmStatic
    public static final Method q(Class<?> clazz, String methodName, Class<?>... parameterTypes) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @JvmStatic
    public static final Method r(String className, String methodName, Class<?>... parameterTypes) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        try {
            Class<?> clazz = Class.forName(className);
            Intrinsics.checkNotNullExpressionValue(clazz, "clazz");
            return q(clazz, methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @JvmStatic
    public static final Object s(JSONObject jsonObject, String str, String str2) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Object opt = jsonObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 == null) {
            throw new C0728q("Got an unexpected non-JSON object.");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(str2, opt);
        return jSONObject;
    }

    public static String t(String str, byte[] bArr) {
        try {
            MessageDigest hash = MessageDigest.getInstance(str);
            Intrinsics.checkNotNullExpressionValue(hash, "hash");
            hash.update(bArr);
            byte[] digest = hash.digest();
            StringBuilder sb = new StringBuilder();
            Intrinsics.checkNotNullExpressionValue(digest, "digest");
            for (byte b2 : digest) {
                sb.append(Integer.toHexString((b2 >> 4) & 15));
                sb.append(Integer.toHexString(b2 & 15));
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "builder.toString()");
            return sb2;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @JvmStatic
    public static final Object u(Object obj, Method method, Object... args) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(args, args.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean v() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{com.facebook.w.b()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            intent.setData(Uri.parse(format));
            Context a2 = com.facebook.w.a();
            PackageManager packageManager = a2.getPackageManager();
            String packageName = a2.getPackageName();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "packageManager.queryInte…nager.MATCH_DEFAULT_ONLY)");
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @JvmStatic
    public static final boolean w(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String DEVICE = Build.DEVICE;
        if (DEVICE == null) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
        return new Regex(".+_cheets|cheets_.+").matches(DEVICE);
    }

    @JvmStatic
    public static final boolean x() {
        if (com.facebook.internal.instrument.crashshield.a.b(E.class)) {
            return false;
        }
        try {
            JSONObject n = n();
            if (n == null) {
                return false;
            }
            try {
                JSONArray jSONArray = n.getJSONArray("data_processing_options");
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    String string = jSONArray.getString(i2);
                    Intrinsics.checkNotNullExpressionValue(string, "options.getString(i)");
                    String lowerCase = string.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                    if (Intrinsics.areEqual(lowerCase, "ldu")) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                com.facebook.w wVar = com.facebook.w.a;
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, E.class);
            return false;
        }
    }

    public static boolean y(Context context) {
        Method r = r("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (r != null) {
            Object u = u(null, r, context);
            if ((u instanceof Integer) && Intrinsics.areEqual(u, (Object) 0)) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    public static final boolean z(String str) {
        return str == null || str.length() == 0;
    }
}
