package w1;

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
import org.json.JSONObject;

/* renamed from: w1.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1707i1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f17741a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f17742b;

    /* renamed from: c, reason: collision with root package name */
    public static Context f17743c;

    public static Context a() {
        return f17743c;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d A[Catch: all -> 0x00fe, IOException -> 0x0102, TryCatch #7 {IOException -> 0x0102, all -> 0x00fe, blocks: (B:17:0x00ba, B:19:0x00c0, B:21:0x00ca, B:23:0x00d9, B:28:0x00e0, B:41:0x0121, B:43:0x0127, B:45:0x012d, B:47:0x00f4, B:50:0x0105, B:53:0x010f, B:27:0x0132), top: B:16:0x00ba }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap b() {
        BufferedReader bufferedReader;
        FileInputStream fileInputStream;
        char c3;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("mem.java.max", Long.toString(Runtime.getRuntime().maxMemory()));
        } catch (RuntimeException e7) {
            Log.getStackTraceString(e7);
        }
        try {
            Debug.getMemoryInfo(new Debug.MemoryInfo());
            hashMap.put("mem.pss", Long.toString(r1.getTotalPss() * 1024));
        } catch (RuntimeException e8) {
            Log.getStackTraceString(e8);
        }
        K2 k22 = (K2) H2.a().f17405i.f17656B;
        hashMap.put("application.state", Integer.toString(L.f(k22 == null ? 1 : k22.f17444b)));
        H2.a().f17398b.getClass();
        hashMap.put("net.status", Integer.toString(t.e.e(Y.n())));
        hashMap.put(Device.JsonKeys.ORIENTATION, Integer.toString(H2.a().f17399c.f17452A));
        Pattern compile = Pattern.compile("^Vm(RSS|Size|Peak):\\s+(\\d+)\\s+kB$");
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(new File(new File("/proc/" + Integer.toString(Process.myPid())), "status"));
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            } catch (IOException e9) {
                e = e9;
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
                bufferedReader = null;
            }
        } catch (IOException e10) {
            e = e10;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
        try {
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                Matcher matcher = compile.matcher(readLine);
                if (matcher.find()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (!TextUtils.isEmpty(group) && !TextUtils.isEmpty(group2)) {
                        int hashCode = group.hashCode();
                        if (hashCode == 81458) {
                            if (group.equals("RSS")) {
                                c3 = 0;
                                if (c3 != 0) {
                                }
                            }
                            c3 = 65535;
                            if (c3 != 0) {
                            }
                        } else if (hashCode != 2483455) {
                            if (hashCode == 2577441 && group.equals("Size")) {
                                c3 = 1;
                                if (c3 != 0) {
                                    hashMap.put("mem.rss", group2);
                                } else if (c3 == 1) {
                                    hashMap.put("mem.virt", group2);
                                } else if (c3 == 2) {
                                    hashMap.put("mem.virt.max", group2);
                                }
                            }
                            c3 = 65535;
                            if (c3 != 0) {
                            }
                        } else {
                            if (group.equals("Peak")) {
                                c3 = 2;
                                if (c3 != 0) {
                                }
                            }
                            c3 = 65535;
                            if (c3 != 0) {
                            }
                        }
                    }
                }
            }
            AbstractC1706i0.h(fileInputStream);
        } catch (IOException e11) {
            e = e11;
            fileInputStream2 = fileInputStream;
            try {
                Log.getStackTraceString(e);
                AbstractC1706i0.h(fileInputStream2);
                AbstractC1706i0.h(bufferedReader);
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                hashMap.put("disk.size.free", Long.toString(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()));
                StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                hashMap.put("disk.size.total", Long.toString(statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()));
                return hashMap;
            } catch (Throwable th3) {
                th = th3;
                AbstractC1706i0.h(fileInputStream2);
                AbstractC1706i0.h(bufferedReader);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream2 = fileInputStream;
            AbstractC1706i0.h(fileInputStream2);
            AbstractC1706i0.h(bufferedReader);
            throw th;
        }
        AbstractC1706i0.h(bufferedReader);
        StatFs statFs3 = new StatFs(Environment.getDataDirectory().getPath());
        hashMap.put("disk.size.free", Long.toString(statFs3.getAvailableBlocksLong() * statFs3.getBlockSizeLong()));
        StatFs statFs22 = new StatFs(Environment.getDataDirectory().getPath());
        hashMap.put("disk.size.total", Long.toString(statFs22.getBlockCountLong() * statFs22.getBlockSizeLong()));
        return hashMap;
    }

    public static JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : H2.a().f17403g.f17297A.f17381a.entrySet()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", entry.getValue());
            jSONObject.put("type", ((H) entry.getKey()).f17390a);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    public static JSONObject d(Map map) {
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
            SharedPreferences.Editor edit = f17743c.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
            edit.putInt("com.flurry.sdk.".concat(str), i7);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    public static void f(String str, long j) {
        try {
            SharedPreferences.Editor edit = f17743c.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
            edit.putLong("com.flurry.sdk.".concat(str), j);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    public static void g(String str, String str2) {
        try {
            SharedPreferences.Editor edit = f17743c.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit();
            edit.putString("com.flurry.sdk.".concat(str), str2);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    public static int h(int i7, String str) {
        try {
            return f17743c.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).getInt("com.flurry.sdk.".concat(str), i7);
        } catch (Throwable unused) {
            return i7;
        }
    }

    public static long i(String str, long j) {
        try {
            return f17743c.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).getLong("com.flurry.sdk.".concat(str), j);
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
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo;
        if (context != null) {
            PackageManager packageManager = context.getPackageManager();
            Object packageName = context.getPackageName();
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    of = PackageManager.PackageInfoFlags.of(0L);
                    packageInfo = packageManager.getPackageInfo((String) packageName, of);
                    packageName = packageInfo;
                } else {
                    packageName = packageManager.getPackageInfo((String) packageName, 0);
                }
                return packageName;
            } catch (PackageManager.NameNotFoundException unused) {
                AbstractC1706i0.o(3, "Cannot find package info for package: ".concat(String.valueOf(packageName)));
            }
        }
        return null;
    }

    public static String k(String str, String str2) {
        try {
            return f17743c.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).getString("com.flurry.sdk.".concat(str), str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static void l(String str) {
        try {
            f17743c.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0).edit().remove("com.flurry.sdk.".concat(str)).apply();
        } catch (Throwable unused) {
        }
    }

    public static long m(Context context) {
        long longVersionCode;
        PackageInfo j = j(context);
        if (j == null) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 28) {
            return j.versionCode;
        }
        longVersionCode = j.getLongVersionCode();
        return longVersionCode;
    }

    public static boolean n() {
        K2 k22 = (K2) H2.a().f17405i.f17656B;
        return t.e.b(k22 == null ? 1 : k22.f17444b, 2);
    }

    public static Context o() {
        return f17743c;
    }
}
