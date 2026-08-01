package com.applovin.impl.sdk;

import com.applovin.impl.c5;
import com.applovin.impl.h2;
import com.applovin.impl.sdk.c;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t7;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class NativeCrashReporter implements c.a {
    private static boolean b;
    private static boolean c;
    private static final NativeCrashReporter d = new NativeCrashReporter();

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f4444a = new HashMap();

    private NativeCrashReporter() {
    }

    public static void a(l lVar) {
        if (lVar == null) {
            return;
        }
        if (!((Boolean) lVar.a(c5.z4)).booleanValue() && !t7.k(l.p())) {
            if (c) {
                try {
                    c h = lVar.h();
                    NativeCrashReporter nativeCrashReporter = d;
                    h.b((c.a) nativeCrashReporter);
                    nativeCrashReporter.disable();
                    return;
                } catch (Throwable th) {
                    lVar.Q();
                    if (p.a()) {
                        lVar.Q().a("NativeCrashReporter", "Failed to disable native crash reporter", th);
                    }
                    lVar.E().a("NativeCrashReporter", "disableInstance", th);
                    return;
                }
            }
            return;
        }
        if (a()) {
            List c2 = lVar.c(c5.A4);
            int[] iArr = new int[c2.size()];
            for (int i = 0; i < c2.size(); i++) {
                try {
                    iArr[i] = Integer.parseInt((String) c2.get(i));
                } catch (NumberFormatException unused) {
                }
            }
            File file = new File(l.p().getCacheDir(), "al-reports");
            if (file.exists()) {
                a(file, lVar);
            } else if (!file.mkdir()) {
                lVar.Q();
                if (p.a()) {
                    lVar.Q().b("NativeCrashReporter", "Failed to create reports directory");
                    return;
                }
                return;
            }
            try {
                NativeCrashReporter nativeCrashReporter2 = d;
                nativeCrashReporter2.enable(file.getAbsolutePath(), iArr, ((Boolean) lVar.a(c5.B4)).booleanValue());
                if (((Boolean) lVar.a(c5.C4)).booleanValue()) {
                    lVar.h().a((c.a) nativeCrashReporter2);
                }
            } catch (Throwable th2) {
                lVar.Q();
                if (p.a()) {
                    lVar.Q().a("NativeCrashReporter", "Failed to enable native crash reporter", th2);
                }
                lVar.E().a("NativeCrashReporter", "enableInstance", th2);
            }
        }
    }

    private native void disable();

    private native void enable(String str, int[] iArr, boolean z);

    private native void updateAdInfo(String str);

    private static boolean a() {
        if (!b) {
            b = true;
            try {
                System.loadLibrary("applovin-native-crash-reporter");
                c = true;
            } catch (Throwable th) {
                p.b("NativeCrashReporter", "Failed to load native crash reporter library", th);
            }
        }
        return c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:7|(2:9|(8:11|12|13|(1:15)(4:33|(4:36|(2:38|39)(2:41|42)|40|34)|43|44)|16|17|(2:19|(2:21|22)(1:24))(1:25)|23))|50|(1:52)|16|17|(0)(0)|23) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00eb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ec, code lost:
    
        r17.Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f3, code lost:
    
        if (com.applovin.impl.sdk.p.a() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f5, code lost:
    
        r17.Q().a("NativeCrashReporter", "Failed to delete native crash report: " + r6.getAbsolutePath(), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c5 A[Catch: all -> 0x00eb, TryCatch #1 {all -> 0x00eb, blocks: (B:17:0x00bf, B:19:0x00c5, B:21:0x00ce), top: B:16:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(File file, l lVar) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        int length = listFiles.length;
        for (int i = 0; i < length; i++) {
            File file2 = listFiles[i];
            String f = lVar.I().f(file2);
            if (StringUtils.isValidString(f)) {
                String[] split = f.split("@@@@@");
                if (split.length == 3) {
                    try {
                        String str = split[0];
                        String str2 = split[1];
                        JSONArray jSONArray = new JSONArray(split[2]);
                        if (jSONArray.length() == 0) {
                            lVar.E().a(h2.h1, str2, CollectionUtils.hashMap("error_message", str));
                        } else {
                            ArrayList arrayList = new ArrayList(jSONArray.length());
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i2, (JSONObject) null);
                                if (jSONObject != null) {
                                    HashMap<String, String> hashMap = CollectionUtils.hashMap("error_message", str);
                                    hashMap.put("source", str2);
                                    hashMap.putAll(JsonUtils.toStringMap(jSONObject));
                                    arrayList.add(hashMap);
                                }
                            }
                            lVar.E().a(h2.h1, arrayList, 0L);
                        }
                    } catch (Throwable th) {
                        lVar.Q();
                        if (p.a()) {
                            lVar.Q().a("NativeCrashReporter", "Failed to symbolicate native crash report", th);
                        }
                    }
                    if (file2.delete()) {
                        lVar.Q();
                        if (p.a()) {
                            lVar.Q().b("NativeCrashReporter", "Failed to delete native crash report: " + file2.getAbsolutePath());
                        }
                    }
                }
            }
            lVar.Q();
            if (p.a()) {
                lVar.Q().b("NativeCrashReporter", "Failed to read native crash error report: " + file2.getAbsolutePath());
            }
            if (file2.delete()) {
            }
        }
    }

    @Override // com.applovin.impl.sdk.c.a
    public void a(List list) {
        try {
            updateAdInfo(new JSONArray((Collection) list).toString());
        } catch (Throwable unused) {
        }
    }
}
