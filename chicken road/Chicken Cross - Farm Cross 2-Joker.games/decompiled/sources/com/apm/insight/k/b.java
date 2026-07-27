package com.apm.insight.k;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.b;
import com.apm.insight.k.c;
import com.apm.insight.l.n;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.o;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C4658ta;
import com.ironsource.U3;
import com.unity3d.ads.BuildConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CrashFileCollector.java */
/* loaded from: classes5.dex */
public final class b {
    private static volatile b b;

    /* renamed from: a, reason: collision with root package name */
    private Context f4004a;
    private C0064b f;
    private HashMap<String, C0064b> g;
    private List<File> c = new ArrayList();
    private List<File> d = new ArrayList();
    private int e = -1;
    private volatile boolean h = false;
    private Runnable i = new Runnable() { // from class: com.apm.insight.k.b.1
        @Override // java.lang.Runnable
        public final void run() {
            b.this.f();
        }
    };
    private Runnable j = new Runnable() { // from class: com.apm.insight.k.b.2
        @Override // java.lang.Runnable
        public final void run() {
            b.this.d();
        }
    };

    private b(Context context) {
        this.f4004a = context;
    }

    public static b a() {
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b(com.apm.insight.e.g());
                }
            }
        }
        return b;
    }

    /* compiled from: CrashFileCollector.java */
    /* renamed from: com.apm.insight.k.b$b, reason: collision with other inner class name */
    static class C0064b {

        /* renamed from: a, reason: collision with root package name */
        String f4010a;
        a d;
        a e;
        List<a> b = new ArrayList();
        List<a> c = new ArrayList();
        boolean f = false;
        int g = 0;

        C0064b(String str) {
            this.f4010a = str;
        }
    }

    /* compiled from: CrashFileCollector.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        File f4009a;
        long b;
        long c;
        CrashType d;
        String e;

        a(File file, CrashType crashType) {
            this.b = -1L;
            this.c = -1L;
            this.f4009a = file;
            this.d = crashType;
            this.e = file.getName();
        }

        a(File file, long j, CrashType crashType) {
            this.c = -1L;
            this.f4009a = file;
            this.b = j;
            this.d = crashType;
            this.e = file.getName();
        }
    }

    public final void a(boolean z) {
        if (!Npth.isStopUpload() && z) {
            if (this.f == null) {
                this.f = new C0064b("old_uuid");
                HashMap<String, C0064b> hashMap = new HashMap<>();
                this.g = hashMap;
                a(hashMap);
                a(this.g, this.f);
                com.apm.insight.l.f.a(com.apm.insight.l.j.b(this.f4004a));
                b(this.g);
                b(this.f, true, null);
                a(this.f, true, null);
                this.f = null;
                if (this.g.isEmpty()) {
                    e();
                } else {
                    f();
                }
            }
            g();
            com.apm.insight.a.c();
        }
    }

    public final void b() {
        try {
            if (!this.h && com.apm.insight.l.a.b(com.apm.insight.e.g())) {
                m.a().a(this.j);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean c() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.h || this.g == null) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.f4004a)) {
            e();
        }
        if (this.e == -1) {
            if (com.apm.insight.runtime.a.a() && com.apm.insight.runtime.a.f()) {
                this.e = 1;
            } else {
                this.e = 0;
            }
        }
        boolean z = this.e == 1;
        com.apm.insight.runtime.f fVar = new com.apm.insight.runtime.f(this.f4004a);
        Iterator<C0064b> it = this.g.values().iterator();
        while (it.hasNext()) {
            b(it.next(), z, fVar);
        }
        Iterator<C0064b> it2 = this.g.values().iterator();
        while (it2.hasNext()) {
            a(it2.next(), z, fVar);
        }
        Iterator<C0064b> it3 = this.g.values().iterator();
        while (it3.hasNext()) {
            com.apm.insight.l.f.a(com.apm.insight.l.j.a(this.f4004a, it3.next().f4010a));
        }
        fVar.a();
        com.apm.insight.runtime.b.a();
        e();
    }

    private void e() {
        this.h = true;
        this.g = null;
        NativeImpl.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.h) {
            return;
        }
        if (com.apm.insight.l.k.b(this.f4004a) && (System.currentTimeMillis() - com.apm.insight.e.j() > 5000 || !com.apm.insight.e.i().isApmExists() || Npth.hasCrash())) {
            d();
        } else {
            m.a().a(this.i, 5000L);
        }
    }

    private void a(HashMap<String, C0064b> hashMap) {
        File[] listFiles = com.apm.insight.l.j.f(this.f4004a).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (int i = 0; i < listFiles.length && i < 5; i++) {
            File file = listFiles[i];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0064b c0064b = hashMap.get(name);
                    if (c0064b == null) {
                        c0064b = new C0064b(name);
                        hashMap.put(name, c0064b);
                    }
                    JSONArray a2 = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.l(file), com.apm.insight.l.j.m(file));
                    c0064b.g = a2.length();
                    if (c0064b.g > 0) {
                        try {
                            com.apm.insight.l.f.a(com.apm.insight.l.j.n(file), a2);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    private void b(HashMap<String, C0064b> hashMap) {
        File[] listFiles = com.apm.insight.l.j.d(this.f4004a).listFiles();
        if (listFiles == null || listFiles.length == 0) {
            return;
        }
        for (int i = 0; i < listFiles.length && i < 5; i++) {
            File file = listFiles[i];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0064b c0064b = hashMap.get(name);
                    if (c0064b == null) {
                        c0064b = new C0064b(name);
                        hashMap.put(name, c0064b);
                    }
                    c0064b.c.add(new a(file, CrashType.NATIVE));
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc A[Catch: all -> 0x0134, TryCatch #0 {all -> 0x0134, blocks: (B:10:0x0023, B:12:0x0031, B:15:0x0036, B:19:0x003e, B:23:0x004e, B:25:0x0054, B:27:0x0059, B:29:0x0065, B:31:0x0070, B:36:0x008a, B:50:0x00d4, B:52:0x00dc, B:53:0x00e4, B:55:0x00ef, B:57:0x0109, B:60:0x00fb, B:62:0x00ff, B:64:0x0107, B:65:0x00cc, B:66:0x00cf, B:67:0x00d2, B:68:0x00a3, B:71:0x00ad, B:74:0x00b7, B:78:0x010f, B:80:0x0130, B:34:0x007c), top: B:9:0x0023, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef A[Catch: all -> 0x0134, TryCatch #0 {all -> 0x0134, blocks: (B:10:0x0023, B:12:0x0031, B:15:0x0036, B:19:0x003e, B:23:0x004e, B:25:0x0054, B:27:0x0059, B:29:0x0065, B:31:0x0070, B:36:0x008a, B:50:0x00d4, B:52:0x00dc, B:53:0x00e4, B:55:0x00ef, B:57:0x0109, B:60:0x00fb, B:62:0x00ff, B:64:0x0107, B:65:0x00cc, B:66:0x00cf, B:67:0x00d2, B:68:0x00a3, B:71:0x00ad, B:74:0x00b7, B:78:0x010f, B:80:0x0130, B:34:0x007c), top: B:9:0x0023, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d2 A[Catch: all -> 0x0134, TryCatch #0 {all -> 0x0134, blocks: (B:10:0x0023, B:12:0x0031, B:15:0x0036, B:19:0x003e, B:23:0x004e, B:25:0x0054, B:27:0x0059, B:29:0x0065, B:31:0x0070, B:36:0x008a, B:50:0x00d4, B:52:0x00dc, B:53:0x00e4, B:55:0x00ef, B:57:0x0109, B:60:0x00fb, B:62:0x00ff, B:64:0x0107, B:65:0x00cc, B:66:0x00cf, B:67:0x00d2, B:68:0x00a3, B:71:0x00ad, B:74:0x00b7, B:78:0x010f, B:80:0x0130, B:34:0x007c), top: B:9:0x0023, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(HashMap<String, C0064b> hashMap, C0064b c0064b) {
        char c;
        CrashType crashType;
        C0064b c0064b2;
        a aVar;
        File[] listFiles = com.apm.insight.l.j.a(this.f4004a).listFiles();
        if (listFiles == null) {
            return;
        }
        Arrays.sort(listFiles, Collections.reverseOrder());
        char c2 = 0;
        int i = 0;
        while (i < listFiles.length) {
            File file = listFiles[i];
            try {
                if (com.apm.insight.e.a.a().a(file.getAbsolutePath())) {
                    com.apm.insight.l.f.a(file);
                } else if (!com.apm.insight.l.f.e(file) && !com.apm.insight.g.a.a().b(file.getName())) {
                    if (file.isFile()) {
                        com.apm.insight.l.f.a(file);
                    } else {
                        String name = file.getName();
                        if (name.endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                            String[] split = name.split("_");
                            if (split.length < 5) {
                                c0064b.b.add(new a(file, null));
                            } else {
                                try {
                                    long parseLong = Long.parseLong(split[c2]);
                                    long parseLong2 = Long.parseLong(split[4]);
                                    String str = split[2];
                                    String str2 = split[1];
                                    int hashCode = str2.hashCode();
                                    if (hashCode == -1109843021) {
                                        if (str2.equals("launch")) {
                                            c = 0;
                                            if (c != 0) {
                                            }
                                            c0064b2 = hashMap.get(str);
                                            if (c0064b2 == null) {
                                            }
                                            aVar = new a(file, parseLong, crashType);
                                            aVar.c = parseLong2;
                                            if (c0064b2.d != null) {
                                            }
                                            c0064b2.d = aVar;
                                            c0064b2.b.add(aVar);
                                        }
                                        c = 65535;
                                        if (c != 0) {
                                        }
                                        c0064b2 = hashMap.get(str);
                                        if (c0064b2 == null) {
                                        }
                                        aVar = new a(file, parseLong, crashType);
                                        aVar.c = parseLong2;
                                        if (c0064b2.d != null) {
                                        }
                                        c0064b2.d = aVar;
                                        c0064b2.b.add(aVar);
                                    } else if (hashCode != 96741) {
                                        if (hashCode == 3254818 && str2.equals("java")) {
                                            c = 1;
                                            if (c != 0) {
                                                crashType = CrashType.LAUNCH;
                                            } else if (c == 1) {
                                                crashType = CrashType.JAVA;
                                            } else {
                                                crashType = c != 2 ? null : CrashType.ANR;
                                            }
                                            c0064b2 = hashMap.get(str);
                                            if (c0064b2 == null) {
                                                c0064b2 = new C0064b(str);
                                                hashMap.put(str, c0064b2);
                                            }
                                            aVar = new a(file, parseLong, crashType);
                                            aVar.c = parseLong2;
                                            if ((c0064b2.d != null || c0064b2.d.b > aVar.b) && crashType != null && crashType != CrashType.ANR && !name.contains("ignore")) {
                                                c0064b2.d = aVar;
                                            }
                                            c0064b2.b.add(aVar);
                                        }
                                        c = 65535;
                                        if (c != 0) {
                                        }
                                        c0064b2 = hashMap.get(str);
                                        if (c0064b2 == null) {
                                        }
                                        aVar = new a(file, parseLong, crashType);
                                        aVar.c = parseLong2;
                                        if (c0064b2.d != null) {
                                        }
                                        c0064b2.d = aVar;
                                        c0064b2.b.add(aVar);
                                    } else {
                                        if (str2.equals("anr")) {
                                            c = 2;
                                            if (c != 0) {
                                            }
                                            c0064b2 = hashMap.get(str);
                                            if (c0064b2 == null) {
                                            }
                                            aVar = new a(file, parseLong, crashType);
                                            aVar.c = parseLong2;
                                            if (c0064b2.d != null) {
                                            }
                                            c0064b2.d = aVar;
                                            c0064b2.b.add(aVar);
                                        }
                                        c = 65535;
                                        if (c != 0) {
                                        }
                                        c0064b2 = hashMap.get(str);
                                        if (c0064b2 == null) {
                                        }
                                        aVar = new a(file, parseLong, crashType);
                                        aVar.c = parseLong2;
                                        if (c0064b2.d != null) {
                                        }
                                        c0064b2.d = aVar;
                                        c0064b2.b.add(aVar);
                                    }
                                } catch (Throwable unused) {
                                    c0064b.b.add(new a(file, null));
                                    com.apm.insight.c.a();
                                    com.apm.insight.runtime.j.a(new RuntimeException("err format crashTime:".concat(String.valueOf(name))), "NPTH_CATCH");
                                }
                            }
                        } else {
                            com.apm.insight.l.f.a(file);
                        }
                    }
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
            }
            i++;
            c2 = 0;
        }
    }

    private static JSONObject a(com.apm.insight.nativecrash.a aVar) {
        JSONObject b2 = aVar.b();
        if (b2 != null && b2.length() != 0) {
            return b2;
        }
        if (com.apm.insight.e.d()) {
            aVar.j();
        }
        if (!aVar.a()) {
            aVar.i();
            return null;
        }
        if (!aVar.d()) {
            aVar.i();
            return null;
        }
        if (aVar.e()) {
            aVar.i();
            return null;
        }
        aVar.c();
        return aVar.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0157 A[Catch: all -> 0x016c, TryCatch #4 {all -> 0x016c, blocks: (B:55:0x014b, B:57:0x0157, B:58:0x0166), top: B:54:0x014b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(final C0064b c0064b, boolean z, com.apm.insight.runtime.f fVar) {
        Iterator<a> it;
        final File file;
        CrashType crashType;
        if (c0064b.b.isEmpty()) {
            return;
        }
        if (c0064b.e == null) {
            c0064b.e = c0064b.d;
        }
        for (Iterator<a> it2 = c0064b.b.iterator(); it2.hasNext(); it2 = it) {
            a next = it2.next();
            try {
                File file2 = next.f4009a;
                CrashType crashType2 = next.d;
                it = it2;
                try {
                    final com.apm.insight.f.b a2 = a(file2, crashType2, c0064b.f4010a, next.b, next.c);
                    if (a2 == null) {
                        com.apm.insight.l.f.a(file2);
                    } else {
                        JSONObject b2 = a2.b();
                        if (b2 == null) {
                            com.apm.insight.l.f.a(file2);
                        } else {
                            JSONObject optJSONObject = b2.optJSONObject("header");
                            if (optJSONObject == null) {
                                com.apm.insight.l.f.a(file2);
                            } else {
                                if (crashType2 == null) {
                                    file = file2;
                                    if (new File(file, file2.getName()).exists() || file.getName().split("_").length < 5) {
                                        if (e.b(a2.a(), b2.toString()).a()) {
                                            com.apm.insight.l.f.a(file);
                                        }
                                    }
                                } else {
                                    file = file2;
                                }
                                File a3 = com.apm.insight.entity.b.a(file);
                                if (!a3.exists()) {
                                    com.apm.insight.l.f.a(file);
                                } else {
                                    try {
                                        JSONArray jSONArray = new JSONArray(com.apm.insight.l.f.a(a3, "\n"));
                                        JSONObject optJSONObject2 = crashType2 == CrashType.LAUNCH ? ((JSONArray) b2.opt("data")).optJSONObject(0) : b2;
                                        if ((!z && c0064b.e != next) || next.e.contains("ignore")) {
                                            try {
                                                com.apm.insight.entity.a.a(optJSONObject2, "filters", C4658ta.b, String.valueOf(String.valueOf(optJSONObject.opt(C4658ta.b))));
                                                crashType = crashType2;
                                                try {
                                                    com.apm.insight.entity.a.a(optJSONObject2, "filters", "has_ignore", String.valueOf(next.e.contains("ignore")));
                                                    optJSONObject.put(C4658ta.b, 2010);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    com.apm.insight.c.a();
                                                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                                    com.apm.insight.entity.a.a(optJSONObject2, "filters", "start_uuid", c0064b.f4010a);
                                                    com.apm.insight.entity.a.a(optJSONObject2, "filters", "leak_threads_count", String.valueOf(c0064b.g));
                                                    com.apm.insight.entity.a.a(optJSONObject2, "filters", "crash_thread_name", optJSONObject2.optString("crash_thread_name", "unknown"));
                                                    com.apm.insight.entity.b.a(b2, jSONArray, new b.a() { // from class: com.apm.insight.k.b.3
                                                        @Override // com.apm.insight.entity.b.a
                                                        public final void a(JSONObject jSONObject) {
                                                            e.a(a2.a(), jSONObject.toString(), new File(file, "logZip"), com.apm.insight.l.j.a(b.this.f4004a, c0064b.f4010a));
                                                        }
                                                    });
                                                    if (!com.apm.insight.l.f.a(file)) {
                                                    }
                                                    c.a(crashType, b2);
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                crashType = crashType2;
                                            }
                                        } else {
                                            crashType = crashType2;
                                            if (fVar != null && !fVar.a(optJSONObject2.optString("crash_md5", BuildConfig.FLAVOR))) {
                                                com.apm.insight.l.f.a(next.f4009a);
                                            }
                                        }
                                        com.apm.insight.entity.a.a(optJSONObject2, "filters", "start_uuid", c0064b.f4010a);
                                        com.apm.insight.entity.a.a(optJSONObject2, "filters", "leak_threads_count", String.valueOf(c0064b.g));
                                        com.apm.insight.entity.a.a(optJSONObject2, "filters", "crash_thread_name", optJSONObject2.optString("crash_thread_name", "unknown"));
                                        try {
                                            com.apm.insight.entity.b.a(b2, jSONArray, new b.a() { // from class: com.apm.insight.k.b.3
                                                @Override // com.apm.insight.entity.b.a
                                                public final void a(JSONObject jSONObject) {
                                                    e.a(a2.a(), jSONObject.toString(), new File(file, "logZip"), com.apm.insight.l.j.a(b.this.f4004a, c0064b.f4010a));
                                                }
                                            });
                                            if (!com.apm.insight.l.f.a(file)) {
                                                com.apm.insight.e.a.a().a(com.apm.insight.d.a.b(file.getAbsolutePath()));
                                            }
                                            c.a(crashType, b2);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            com.apm.insight.c.a();
                                            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                            com.apm.insight.l.f.a(next.f4009a);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                    com.apm.insight.l.f.a(next.f4009a);
                }
            } catch (Throwable th5) {
                th = th5;
                it = it2;
            }
        }
    }

    private void b(final C0064b c0064b, boolean z, com.apm.insight.runtime.f fVar) {
        boolean z2;
        JSONObject a2;
        if (c0064b.c.size() <= 1 && c0064b.c.isEmpty()) {
            c0064b.e = c0064b.d;
            return;
        }
        boolean b2 = com.apm.insight.l.k.b(this.f4004a);
        c0064b.e = c0064b.d;
        com.apm.insight.nativecrash.a aVar = new com.apm.insight.nativecrash.a(this.f4004a);
        for (a aVar2 : c0064b.c) {
            final File file = aVar2.f4009a;
            try {
                aVar.a(file);
                a2 = a(aVar);
            } catch (Throwable th) {
                th = th;
                z2 = b2;
            }
            if (a2 != null && a2.length() != 0) {
                if (a2.length() != 0) {
                    if (!z) {
                        long optLong = a2.optLong("crash_time");
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            z2 = b2;
                        }
                        if (c0064b.e == null) {
                            c0064b.e = aVar2;
                            c0064b.f = true;
                            if (fVar == null || fVar.a(BuildConfig.FLAVOR)) {
                                z2 = b2;
                            } else {
                                aVar.i();
                            }
                        } else {
                            if (c0064b.f) {
                                z2 = b2;
                            } else {
                                z2 = b2;
                                try {
                                } catch (Throwable th3) {
                                    th = th3;
                                    com.apm.insight.c.a();
                                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                                    com.apm.insight.l.f.a(file);
                                    b2 = z2;
                                }
                                if (optLong < c0064b.e.b) {
                                    c0064b.e = aVar2;
                                    if (fVar != null && !fVar.a(BuildConfig.FLAVOR)) {
                                        aVar.i();
                                        b2 = z2;
                                    } else {
                                        a(file);
                                        c0064b.f = true;
                                    }
                                }
                            }
                            com.apm.insight.entity.a.a(a2, "filters", C4658ta.b, String.valueOf(a2.optJSONObject("header").opt(C4658ta.b)));
                            a2.optJSONObject("header").put(C4658ta.b, 2010);
                        }
                    } else {
                        z2 = b2;
                        if (fVar != null && !fVar.a(BuildConfig.FLAVOR)) {
                            aVar.i();
                        }
                    }
                    com.apm.insight.entity.a.a(a2, "filters", "start_uuid", c0064b.f4010a);
                    com.apm.insight.entity.a.a(a2, "filters", "crash_thread_name", a2.optString("crash_thread_name", "unknown"));
                    if (z2) {
                        try {
                            c.a aVar3 = new c.a(a2, CrashType.NATIVE);
                            com.apm.insight.entity.b.a(a2, com.apm.insight.entity.b.a(aVar3.c(), aVar3.a(), o.a().b(aVar3.b() == -1 ? System.currentTimeMillis() : aVar3.b())), new b.a() { // from class: com.apm.insight.k.b.4
                                @Override // com.apm.insight.entity.b.a
                                public final void a(JSONObject jSONObject) {
                                    d.a();
                                    d.a(jSONObject, file, com.apm.insight.l.j.a(b.this.f4004a, c0064b.f4010a));
                                }
                            });
                            if (!aVar.i()) {
                                aVar.f();
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                            com.apm.insight.l.f.a(file);
                            b2 = z2;
                        }
                    }
                    c.a(CrashType.NATIVE, a2);
                } else {
                    z2 = b2;
                }
                b2 = z2;
            }
            z2 = b2;
            aVar.i();
            b2 = z2;
        }
    }

    private static boolean a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    private com.apm.insight.f.b a(File file, CrashType crashType, String str, long j, long j2) {
        com.apm.insight.f.b bVar;
        try {
            try {
                if (file.isFile()) {
                    com.apm.insight.l.f.a(file);
                    return null;
                }
                boolean z = crashType == CrashType.LAUNCH;
                if (crashType == null) {
                    try {
                        return com.apm.insight.l.f.b(new File(file, file.getName()).getAbsolutePath());
                    } catch (Throwable th) {
                        th = th;
                        bVar = null;
                        com.apm.insight.l.f.a(file);
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                        return bVar;
                    }
                }
                com.apm.insight.f.b a2 = com.apm.insight.l.f.a(file, crashType);
                try {
                    JSONObject b2 = a2.b();
                    try {
                        if (a2.b() != null) {
                            if (crashType == CrashType.ANR) {
                                return a2;
                            }
                            b2.put("crash_time", j);
                            b2.put("app_start_time", j2);
                            JSONObject optJSONObject = b2.optJSONObject("header");
                            if (optJSONObject == null) {
                                optJSONObject = Header.a(j).f();
                            } else if (z) {
                                b2.remove("header");
                            }
                            String optString = optJSONObject.optString("sdk_version_name", null);
                            if (optString == null) {
                                optString = "2008-20250701130429";
                            }
                            com.apm.insight.entity.a.a(b2, "filters", "sdk_version", optString);
                            JSONArray optJSONArray = b2.optJSONArray("logcat");
                            if (optJSONArray == null || optJSONArray.length() == 0) {
                                b2.put("logcat", com.apm.insight.runtime.h.a(str));
                            }
                            com.apm.insight.entity.a.a(b2, "filters", "has_dump", "true");
                            com.apm.insight.entity.a.a(b2, "filters", "has_logcat", String.valueOf(!com.apm.insight.a.a(b2, "logcat")));
                            com.apm.insight.entity.a.a(b2, "filters", "memory_leak", String.valueOf(com.apm.insight.entity.a.a(str)));
                            com.apm.insight.entity.a.a(b2, "filters", "fd_leak", String.valueOf(com.apm.insight.entity.a.b(str)));
                            com.apm.insight.entity.a.a(b2, "filters", "threads_leak", String.valueOf(com.apm.insight.entity.a.c(str)));
                            com.apm.insight.entity.a.a(b2, "filters", "is_64_devices", String.valueOf(Header.a()));
                            com.apm.insight.entity.a.a(b2, "filters", "is_64_runtime", String.valueOf(NativeImpl.f()));
                            com.apm.insight.entity.a.a(b2, "filters", "is_x86_devices", String.valueOf(Header.b()));
                            com.apm.insight.entity.a.a(b2, "filters", "has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(str).exists()));
                            com.apm.insight.entity.a.a(b2, "filters", "is_root", String.valueOf(com.apm.insight.nativecrash.a.k()));
                            b2.put("launch_did", com.apm.insight.i.a.a(this.f4004a));
                            b2.put("crash_uuid", file.getName());
                            try {
                                long parseLong = Long.parseLong(com.apm.insight.runtime.b.a(j, str));
                                com.apm.insight.entity.a.a(b2, "filters", "lastAliveTime", Math.abs(parseLong - j) < 60000 ? "< 60s" : "> 60s");
                                b2.put("lastAliveTime", String.valueOf(parseLong));
                            } catch (Throwable unused) {
                                b2.put("lastAliveTime", "unknown");
                                com.apm.insight.entity.a.a(b2, "filters", "lastAliveTime", "unknown");
                            }
                            b2.put("has_dump", "true");
                            if (b2.opt(U3.a.k) == null) {
                                com.apm.insight.e.g();
                                com.apm.insight.entity.a.a(b2, n.a());
                            }
                            if (Header.b(optJSONObject)) {
                                com.apm.insight.entity.a.a(b2, "filters", "unauthentic_version", "unauthentic_version");
                            }
                            com.apm.insight.entity.d.b(b2);
                            a2.b().put("upload_scene", "launch_scan");
                            if (z) {
                                JSONObject jSONObject = new JSONObject();
                                b2.put("event_type", "start_crash");
                                b2.put("stack", b2.remove("data"));
                                jSONObject.put("data", new JSONArray().put(b2));
                                jSONObject.put("header", optJSONObject);
                                a2.a(jSONObject);
                            } else {
                                b2.put("isJava", 1);
                            }
                        } else {
                            com.apm.insight.l.f.a(file);
                        }
                        return a2;
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = a2;
                        com.apm.insight.l.f.a(file);
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                        return bVar;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            bVar = null;
        }
    }

    private void g() {
        File[] listFiles = com.apm.insight.l.j.i(this.f4004a).listFiles();
        if (listFiles == null) {
            return;
        }
        for (int i = 0; i < listFiles.length && i < 5; i++) {
            File file = listFiles[i];
            if (file.getName().endsWith(".atmp")) {
                com.apm.insight.a.a.a();
                file.getAbsolutePath();
            } else {
                try {
                    com.apm.insight.f.b c = com.apm.insight.l.f.c(file.getAbsolutePath());
                    if (c != null) {
                        if (c.b() != null) {
                            c.b().put("upload_scene", "launch_scan");
                        }
                        if (e.a(e.d(), c.e(), c.d(), c.f(), c.g())) {
                            com.apm.insight.l.f.a(file);
                            String c2 = c.c();
                            if (!TextUtils.isEmpty(c2)) {
                                com.apm.insight.l.f.a(new File(c2));
                            }
                        }
                    } else {
                        com.apm.insight.l.f.a(file);
                    }
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                }
            }
        }
    }
}
