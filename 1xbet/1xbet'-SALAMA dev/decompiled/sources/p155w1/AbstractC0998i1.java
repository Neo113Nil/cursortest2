package p155w1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import io.sentry.protocol.Device;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p136t.e;

/* JADX INFO: renamed from: w1.i1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0998i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f17747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f17748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Context f17749c;

    public static Context a() {
        return f17749c;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0119  */
    public static HashMap b() throws Throwable {
        BufferedReader bufferedReader;
        byte b7;
        HashMap map = new HashMap();
        try {
            map.put("mem.java.max", Long.toString(Runtime.getRuntime().maxMemory()));
        } catch (RuntimeException e7) {
            Log.getStackTraceString(e7);
        }
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            map.put("mem.pss", Long.toString(((long) memoryInfo.getTotalPss()) * 1024));
        } catch (RuntimeException e8) {
            Log.getStackTraceString(e8);
        }
        K2 k7 = (K2) H2.a().f17411i.f17662B;
        map.put("application.state", Integer.toString(L.f(k7 == null ? 1 : k7.f17450b)));
        H2.a().f17404b.getClass();
        map.put("net.status", Integer.toString(e.e(Y.n())));
        map.put(Device.JsonKeys.ORIENTATION, Integer.toString(H2.a().f17405c.f17458A));
        Pattern patternCompile = Pattern.compile("^Vm(RSS|Size|Peak):\\s+(\\d+)\\s+kB$");
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(new File(new File("/proc/" + Integer.toString(Process.myPid())), "status"));
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2));
                try {
                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                        Matcher matcher = patternCompile.matcher(line);
                        if (matcher.find()) {
                            String strGroup = matcher.group(1);
                            String strGroup2 = matcher.group(2);
                            if (!TextUtils.isEmpty(strGroup) && !TextUtils.isEmpty(strGroup2)) {
                                int iHashCode = strGroup.hashCode();
                                if (iHashCode != 81458) {
                                    if (iHashCode != 2483455) {
                                        if (iHashCode == 2577441 && strGroup.equals("Size")) {
                                            b7 = 1;
                                        } else {
                                            b7 = -1;
                                        }
                                    } else if (strGroup.equals("Peak")) {
                                        b7 = 2;
                                    } else {
                                        b7 = -1;
                                    }
                                } else if (strGroup.equals("RSS")) {
                                    b7 = 0;
                                } else {
                                    b7 = -1;
                                }
                                if (b7 == 0) {
                                    map.put("mem.rss", strGroup2);
                                } else if (b7 == 1) {
                                    map.put("mem.virt", strGroup2);
                                } else if (b7 == 2) {
                                    map.put("mem.virt.max", strGroup2);
                                }
                            }
                        }
                    }
                    AbstractC0997i0.h(fileInputStream2);
                } catch (IOException e9) {
                    e = e9;
                    fileInputStream = fileInputStream2;
                    try {
                        Log.getStackTraceString(e);
                        AbstractC0997i0.h(fileInputStream);
                    } catch (Throwable th) {
                        th = th;
                        AbstractC0997i0.h(fileInputStream);
                        AbstractC0997i0.h(bufferedReader);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    AbstractC0997i0.h(fileInputStream);
                    AbstractC0997i0.h(bufferedReader);
                    throw th;
                }
            } catch (IOException e10) {
                e = e10;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (IOException e11) {
            e = e11;
            bufferedReader = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
        }
        AbstractC0997i0.h(bufferedReader);
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        map.put("disk.size.free", Long.toString(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()));
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        map.put("disk.size.total", Long.toString(statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()));
        return map;
    }

    public static JSONArray c() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : H2.a().f17409g.f17303A.f17387a.entrySet()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", entry.getValue());
            jSONObject.put("type", ((H) entry.getKey()).f17396a);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static JSONObject d(Map map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    public static void e(int i7, String str) {
        try {
            SharedPreferences.Editor editorEdit = f17749c.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
            editorEdit.putInt("com.flurry.sdk.".concat(str), i7);
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }

    public static void f(String str, long j) {
        try {
            SharedPreferences.Editor editorEdit = f17749c.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
            editorEdit.putLong("com.flurry.sdk.".concat(str), j);
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }

    public static void g(String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = f17749c.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
            editorEdit.putString("com.flurry.sdk.".concat(str), str2);
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }

    public static int h(int i7, String str) {
        try {
            return f17749c.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).getInt("com.flurry.sdk.".concat(str), i7);
        } catch (Throwable unused) {
            return i7;
        }
    }

    public static long i(String str, long j) {
        try {
            return f17749c.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).getLong("com.flurry.sdk.".concat(str), j);
        } catch (Throwable unused) {
            return j;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.content.pm.PackageInfo] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static PackageInfo j(Context context) {
        if (context != null) {
            PackageManager packageManager = context.getPackageManager();
            Object packageName = context.getPackageName();
            try {
                packageName = Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo((String) packageName, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo((String) packageName, 0);
                return packageName;
            } catch (PackageManager.NameNotFoundException unused) {
                AbstractC0997i0.o(3, "Cannot find package info for package: ".concat(String.valueOf(packageName)));
            }
        }
        return null;
    }

    public static String k(String str, String str2) {
        try {
            return f17749c.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).getString("com.flurry.sdk.".concat(str), str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static void l(String str) {
        try {
            f17749c.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit().remove("com.flurry.sdk.".concat(str)).apply();
        } catch (Throwable unused) {
        }
    }

    public static long m(Context context) {
        PackageInfo packageInfoJ = j(context);
        if (packageInfoJ == null) {
            return 0L;
        }
        return Build.VERSION.SDK_INT >= 28 ? packageInfoJ.getLongVersionCode() : packageInfoJ.versionCode;
    }

    public static boolean n() {
        K2 k7 = (K2) H2.a().f17411i.f17662B;
        return e.b(k7 == null ? 1 : k7.f17450b, 2);
    }

    public static Context o() {
        return f17749c;
    }
}
