package com.apm.insight.b;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.b;
import com.apm.insight.l.c;
import com.apm.insight.l.m;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.l;
import com.apm.insight.runtime.n;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.UnityAdsConstants;
import io.ktor.sse.ServerSentEventKt;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ANRManager.java */
/* loaded from: classes5.dex */
public final class b {
    private static volatile boolean z = true;

    /* renamed from: a, reason: collision with root package name */
    private c f3948a;
    private final Context b;
    private volatile boolean c;
    private JSONObject g;
    private JSONObject h;
    private JSONArray m;
    private JSONObject n;
    private JSONArray q;
    private JSONArray r;
    private JSONObject s;
    private boolean t;
    private volatile boolean v;
    private long d = -1;
    private File e = null;
    private boolean f = true;
    private String i = "unknown";
    private String j = "unknown";
    private String k = "unknown";
    private String l = "npth_inner_default";
    private int o = 0;
    private long p = -1;
    private final Object u = new Object();
    private long w = -1;
    private long x = 0;
    private final Runnable y = new Runnable() { // from class: com.apm.insight.b.b.1
        @Override // java.lang.Runnable
        public final void run() {
            try {
                b.this.g();
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
            }
        }
    };
    private int A = 0;
    private List<Pattern> B = null;
    private Pattern C = null;
    private File D = null;

    public b(Context context) {
        this.b = context;
    }

    public final void a() {
        if (this.c) {
            return;
        }
        this.f3948a = new c(this);
        this.d = com.apm.insight.e.j();
        this.c = true;
    }

    public final void b() {
        if (this.c) {
            this.c = false;
            c cVar = this.f3948a;
            if (cVar != null) {
                cVar.b();
            }
            this.f3948a = null;
        }
    }

    public final void c() {
        c cVar = this.f3948a;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void d() {
        synchronized (this.u) {
        }
        this.y.run();
    }

    public final void e() {
        if (NativeImpl.h()) {
            try {
                com.apm.insight.l.f.a(i(), String.valueOf(this.A + 1), false);
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
            }
        }
        this.w = SystemClock.uptimeMillis();
        this.v = true;
    }

    public final void f() {
        File i = i();
        try {
            int intValue = Integer.decode(com.apm.insight.l.f.a(i.getAbsolutePath(), "\n")).intValue();
            this.A = intValue;
            if (intValue >= 2) {
                NativeImpl.a(false);
            } else {
                NativeImpl.a(true);
            }
        } catch (IOException unused) {
            NativeImpl.a(true);
        } catch (Throwable unused2) {
            com.apm.insight.l.f.a(i);
        }
    }

    private boolean a(long j) {
        if (this.v) {
            this.v = false;
            b(j);
        }
        return false;
    }

    private static boolean h() {
        boolean a2 = com.apm.insight.l.a.a();
        boolean z2 = !a2;
        if (a2 || com.apm.insight.runtime.a.b.d().e() > 2000) {
            return z2;
        }
        return false;
    }

    private void b(long j) {
        if (this.x != this.w) {
            try {
                this.p = System.currentTimeMillis();
                if (com.apm.insight.e.x()) {
                    this.r = f.b().b();
                    this.q = j.a(j);
                    this.h = f.b().a(j).a();
                }
                JSONObject jSONObject = new JSONObject();
                this.s = jSONObject;
                com.apm.insight.l.a.a(this.b, jSONObject);
                this.t = h();
                this.f = !Npth.hasCrash();
            } catch (Throwable unused) {
            }
            try {
                this.d = this.p;
                String b = com.apm.insight.l.j.b();
                File file = new File(new File(com.apm.insight.l.j.f(this.b), b), "trace_" + com.apm.insight.l.a.b().replace(AbstractJsonLexerKt.COLON, '_') + ".txt");
                file.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                n.a("anr_trace", b);
                NativeImpl.i(file.getAbsolutePath());
                try {
                    JSONArray a2 = com.apm.insight.l.f.a(file.getAbsolutePath());
                    this.m = a2;
                    a(a2);
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                }
                if (this.g == null) {
                    this.g = d.a();
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th2, "NPTH_CATCH");
            }
            com.apm.insight.a.d();
        } else {
            try {
                this.d = this.p;
                String b2 = com.apm.insight.l.j.b();
                File file2 = new File(new File(com.apm.insight.l.j.f(this.b), b2), "trace" + com.apm.insight.l.a.b().replace(AbstractJsonLexerKt.COLON, '_') + ".txt");
                file2.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file2, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                n.a("anr_trace", b2);
                NativeImpl.i(file2.getAbsolutePath());
                try {
                    JSONArray a3 = com.apm.insight.l.f.a(file2.getAbsolutePath());
                    this.m = a3;
                    a(a3);
                } catch (IOException unused3) {
                } catch (Throwable th3) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.j.a(th3, "NPTH_CATCH");
                }
                if (this.g == null) {
                    this.g = d.a();
                }
            } catch (Throwable th4) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th4, "NPTH_CATCH");
            }
        }
        long j2 = this.w;
        this.x = j2;
        this.w = -1L;
        if (j2 == -1) {
            this.x = (-1) - 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(JSONArray jSONArray) {
        int[] iArr;
        int[] iArr2;
        if (jSONArray == null) {
            return;
        }
        this.g = null;
        this.n = null;
        this.o = 0;
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        this.i = "unknown";
        this.j = "unknown";
        this.k = "unknown";
        int[] iArr3 = {0, 0, 0};
        JSONArray jSONArray5 = jSONArray4;
        String str = null;
        boolean z2 = false;
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (TextUtils.isEmpty(optString)) {
                if (jSONArray5.length() > 0 && !TextUtils.isEmpty(str)) {
                    if (this.g == null && U3.i.Z.equals(str)) {
                        this.g = c(jSONArray5);
                    } else {
                        jSONArray2.put(a(str, jSONArray5));
                    }
                    try {
                        if (!U3.i.Z.equals(str)) {
                            str = str.substring(0, str.indexOf(40)).trim();
                        }
                    } catch (Throwable unused) {
                    }
                    String str2 = str;
                    if (!a(str2)) {
                        try {
                            iArr2 = b(jSONArray5);
                        } catch (IllegalArgumentException e) {
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.j.a(e, "NPTH_CATCH");
                            iArr2 = null;
                            if (iArr2 != null) {
                            }
                            if (jSONArray5.length() > 0) {
                            }
                            str = null;
                        } catch (Throwable unused2) {
                            iArr2 = null;
                            if (iArr2 != null) {
                            }
                            if (jSONArray5.length() > 0) {
                            }
                            str = null;
                        }
                        if (iArr2 != null) {
                            int i2 = iArr2[0];
                            if (i2 > iArr3[0]) {
                                iArr3[0] = i2;
                                this.i = str2;
                            }
                            int i3 = iArr2[1];
                            if (i3 > iArr3[1]) {
                                iArr3[1] = i3;
                                this.j = str2;
                            }
                            int i4 = iArr2[2];
                            if (i4 > iArr3[2]) {
                                iArr3[2] = i4;
                                this.k = str2;
                            }
                        }
                    }
                }
                if (jSONArray5.length() > 0) {
                    jSONArray5 = new JSONArray();
                }
                str = null;
            } else {
                if (!z2) {
                    if (optString.startsWith("DALVIK THREADS") || optString.startsWith("suspend") || optString.startsWith("\"")) {
                        z2 = true;
                    }
                    jSONArray3.put(optString);
                } else if (z2) {
                    if (optString.contains(" prio=")) {
                        if (jSONArray5.length() > 0 && !TextUtils.isEmpty(str)) {
                            if (this.g == null && U3.i.Z.equals(str)) {
                                this.g = c(jSONArray5);
                            } else {
                                jSONArray2.put(a(str, jSONArray5));
                            }
                            try {
                                if (!U3.i.Z.equals(str)) {
                                    str = str.substring(0, str.indexOf(40)).trim();
                                }
                            } catch (Throwable unused3) {
                            }
                            String str3 = str;
                            if (!a(str3)) {
                                try {
                                    iArr = b(jSONArray5);
                                } catch (IllegalArgumentException e2) {
                                    com.apm.insight.c.a();
                                    com.apm.insight.runtime.j.a(e2, "NPTH_CATCH");
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    String substring = optString.substring(1, optString.indexOf(34, 1));
                                    if (!U3.i.Z.equals(substring)) {
                                    }
                                    if (jSONArray5.length() > 0) {
                                    }
                                    jSONArray5.put(optString);
                                } catch (Throwable unused4) {
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    String substring2 = optString.substring(1, optString.indexOf(34, 1));
                                    if (!U3.i.Z.equals(substring2)) {
                                    }
                                    if (jSONArray5.length() > 0) {
                                    }
                                    jSONArray5.put(optString);
                                }
                                if (iArr != null) {
                                    int i5 = iArr[0];
                                    if (i5 > iArr3[0]) {
                                        iArr3[0] = i5;
                                        this.i = str3;
                                    }
                                    int i6 = iArr[1];
                                    if (i6 > iArr3[1]) {
                                        iArr3[1] = i6;
                                        this.j = str3;
                                    }
                                    int i7 = iArr[2];
                                    if (i7 > iArr3[2]) {
                                        iArr3[2] = i7;
                                        this.k = str3;
                                    }
                                }
                            }
                        }
                        String substring22 = optString.substring(1, optString.indexOf(34, 1));
                        str = !U3.i.Z.equals(substring22) ? substring22 + "  (" + optString.substring(optString.indexOf(34, 2) + 1) + " )" : substring22;
                        if (jSONArray5.length() > 0) {
                            jSONArray5 = new JSONArray();
                        }
                        jSONArray5.put(optString);
                    } else if (TextUtils.isEmpty(str)) {
                        jSONArray3.put(optString);
                    } else {
                        jSONArray5.put(optString);
                    }
                }
            }
        }
        if (jSONArray2.length() > 0) {
            this.m = jSONArray3;
            try {
                JSONObject jSONObject = new JSONObject();
                this.n = jSONObject;
                jSONObject.put("thread_all_count", jSONArray2.length());
                this.n.put("thread_stacks", jSONArray2);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
    }

    private boolean a(String str) {
        if (this.B == null) {
            JSONArray b = com.apm.insight.runtime.a.b();
            if (b != null) {
                this.B = new LinkedList();
                this.l = b.optString(0);
                for (int i = 1; i < b.length(); i++) {
                    try {
                        this.B.add(Pattern.compile(b.optString(i)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.B == null) {
                LinkedList linkedList = new LinkedList();
                this.B = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.B.add(Pattern.compile("^default_npth_thread$"));
                this.B.add(Pattern.compile("^RenderThread$"));
                this.B.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        Iterator<Pattern> it = this.B.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private int[] b(JSONArray jSONArray) throws IllegalArgumentException {
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            int indexOf = (optString == null || optString.isEmpty()) ? -1 : optString.indexOf("utm=");
            if (indexOf > 0) {
                if (this.C == null) {
                    this.C = Pattern.compile("[^0-9]+");
                }
                String[] split = this.C.split(optString.substring(indexOf));
                if (split == null || split.length < 2) {
                    return null;
                }
                int intValue = Integer.decode(split[1]).intValue();
                int intValue2 = Integer.decode(split[2]).intValue();
                return new int[]{intValue, intValue2, intValue + intValue2};
            }
        }
        return null;
    }

    private JSONObject c(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray b = com.apm.insight.a.b(jSONArray);
        if (b.length() != jSONArray.length()) {
            this.o++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < b.length(); i++) {
                sb.append(b.getString(i)).append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private JSONObject a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray b = com.apm.insight.a.b(jSONArray);
        if (b.length() != jSONArray.length()) {
            this.o++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private File i() {
        if (this.D == null) {
            this.D = new File(this.b.getFilesDir(), "has_anr_signal_" + com.apm.insight.l.a.b().replaceAll(ServerSentEventKt.COLON, "_"));
        }
        return this.D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0201, code lost:
    
        if (r3 != 5) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02bc A[LOOP:2: B:90:0x01eb->B:119:0x02bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c8 A[EDGE_INSN: B:120:0x02c8->B:121:0x02c8 BREAK  A[LOOP:2: B:90:0x01eb->B:119:0x02bc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0404 A[EDGE_INSN: B:19:0x0404->B:20:0x0404 BREAK  A[LOOP:0: B:2:0x0045->B:36:0x03ec], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x03ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(String str, JSONObject jSONObject) throws JSONException {
        HashMap hashMap;
        HashMap hashMap2;
        String[] strArr;
        int i;
        String str2;
        char c;
        char c2;
        String str3;
        char c3;
        boolean z2;
        String str4;
        String str5;
        String trim;
        String str6;
        HashMap hashMap3;
        String str7;
        int i2;
        char c4;
        String[] strArr2;
        String str8;
        float floatValue;
        float floatValue2;
        b bVar = this;
        SystemClock.uptimeMillis();
        String[] split = str.split("\n");
        float[] fArr = new float[3];
        int i3 = 0;
        Float valueOf = Float.valueOf(-1.0f);
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        fArr[2] = -1.0f;
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        HashMap hashMap6 = new HashMap();
        HashMap hashMap7 = new HashMap();
        HashMap hashMap8 = new HashMap();
        int length = split.length;
        String str9 = "unknown";
        char c5 = 0;
        boolean z3 = false;
        String str10 = "unknown";
        String str11 = str10;
        while (true) {
            if (i3 >= length) {
                hashMap = hashMap7;
                hashMap2 = hashMap8;
                break;
            }
            String str12 = split[i3];
            if (TextUtils.isEmpty(str12)) {
                strArr = split;
                hashMap = hashMap7;
                hashMap2 = hashMap8;
                i = length;
                str2 = str9;
                c = c5;
            } else {
                strArr = split;
                i = length;
                if (c5 == 0) {
                    c2 = c5;
                    hashMap = hashMap7;
                    hashMap2 = hashMap8;
                    str2 = str9;
                    str3 = str10;
                    String trim2 = str12.trim();
                    if (trim2.startsWith("tag:")) {
                        str10 = trim2.replace("tag:", "").trim();
                        c3 = 4;
                        c = 1;
                        if (c >= c3) {
                        }
                    }
                    str10 = str3;
                    c = c2;
                } else if (c5 == 1) {
                    c2 = c5;
                    hashMap = hashMap7;
                    hashMap2 = hashMap8;
                    str2 = str9;
                    str12 = str12.trim();
                    String lowerCase = str12.toLowerCase();
                    if (lowerCase.startsWith("shortmsg")) {
                        str12.substring(str12.indexOf(58));
                        z2 = false;
                    } else if (lowerCase.startsWith("reason:")) {
                        str12.substring(str12.indexOf(58));
                        z2 = true;
                    } else {
                        str3 = str10;
                        if (lowerCase.contains("appfreeze")) {
                            c = '\n';
                            str11 = "AppFreeze";
                            str10 = str3;
                        }
                        str10 = str3;
                        c = c2;
                    }
                    if (lowerCase.contains("input dispatch")) {
                        str5 = "Input dispatching timed out";
                    } else if (lowerCase.contains("broadcast of intent")) {
                        str5 = "Broadcast of Intent";
                    } else if (lowerCase.contains("executing service")) {
                        str4 = str10;
                        if (!"null".equalsIgnoreCase(str4)) {
                            str11 = "executing service";
                            str10 = str4;
                            if (z2) {
                            }
                            trim = str12.trim();
                            if (trim.startsWith("Load:")) {
                            }
                        } else {
                            str10 = str12.substring(str12.indexOf("service ") + 8).trim();
                            str11 = "executing service";
                            if (z2) {
                                c3 = 4;
                                c = 2;
                                if (c >= c3) {
                                }
                            }
                            trim = str12.trim();
                            if (trim.startsWith("Load:")) {
                            }
                        }
                    } else {
                        str4 = str10;
                        if (lowerCase.contains("service.startforeground")) {
                            str11 = "not call Service.startForeground";
                            str10 = str4;
                            if (z2) {
                            }
                            trim = str12.trim();
                            if (trim.startsWith("Load:")) {
                            }
                        } else {
                            str10 = str4;
                            str11 = str2;
                            if (z2) {
                            }
                            trim = str12.trim();
                            if (trim.startsWith("Load:")) {
                            }
                        }
                    }
                    str11 = str5;
                    if (z2) {
                    }
                    trim = str12.trim();
                    if (trim.startsWith("Load:")) {
                    }
                } else if (c5 != 2) {
                    if (c5 != 3) {
                        c2 = c5;
                        hashMap = hashMap7;
                        hashMap2 = hashMap8;
                        str2 = str9;
                        str3 = str10;
                    } else {
                        String[] split2 = str12.split("\\s");
                        c2 = c5;
                        str2 = str9;
                        if (split2.length >= 2) {
                            if ("CPU".equalsIgnoreCase(split2[0]) && "usage".equalsIgnoreCase(split2[1])) {
                                if (str12.contains("ago")) {
                                    z3 = true;
                                }
                                if (hashMap4.isEmpty() && hashMap5.isEmpty() && hashMap6.isEmpty() && hashMap8.isEmpty() && hashMap7.isEmpty()) {
                                    hashMap = hashMap7;
                                    hashMap2 = hashMap8;
                                    c = c2;
                                    c3 = 4;
                                    if (c >= c3) {
                                        break;
                                    }
                                }
                            } else if (hashMap4.isEmpty() || hashMap5.isEmpty() || hashMap6.isEmpty() || hashMap8.isEmpty() || hashMap7.isEmpty()) {
                                if (hashMap4.isEmpty() && split2[1].equalsIgnoreCase("TOTAL:")) {
                                    str6 = "";
                                    hashMap3 = hashMap4;
                                } else if (str12.contains(bVar.b.getPackageName())) {
                                    str6 = "";
                                    int i4 = 0;
                                    while (i4 < split2.length) {
                                        if (split2[i4].contains(bVar.b.getPackageName())) {
                                            StringBuilder sb = new StringBuilder();
                                            String str13 = split2[i4];
                                            str6 = sb.append(str13.substring(str13.indexOf(47) + 1, split2[i4].length() - 1)).append('_').toString();
                                        }
                                        i4++;
                                        bVar = this;
                                    }
                                    hashMap3 = hashMap6;
                                } else if (hashMap5.isEmpty() && str12.contains("system_server:")) {
                                    str6 = "";
                                    hashMap3 = hashMap5;
                                } else if (hashMap8.isEmpty() && str12.contains("kswapd")) {
                                    str6 = "";
                                    hashMap3 = hashMap8;
                                } else if (!hashMap7.isEmpty() || !str12.contains("dex2oat")) {
                                    str6 = "";
                                    hashMap3 = null;
                                } else {
                                    str6 = "";
                                    hashMap3 = hashMap7;
                                }
                                if (hashMap3 != null) {
                                    int i5 = 0;
                                    try {
                                        do {
                                            str7 = "%";
                                            if (!split2[i5].contains("%")) {
                                                i5++;
                                            }
                                            break;
                                        } while (i5 < split2.length);
                                        break;
                                        floatValue2 = Float.valueOf(split2[i5].replace("%", "")).floatValue();
                                        hashMap = hashMap7;
                                    } catch (Throwable unused) {
                                        hashMap = hashMap7;
                                    }
                                    try {
                                        String str14 = str6 + U3.i.l;
                                        if (hashMap3 == hashMap4) {
                                            hashMap2 = hashMap8;
                                        } else {
                                            hashMap2 = hashMap8;
                                            try {
                                                floatValue2 /= com.apm.insight.l.d.d();
                                            } catch (Throwable unused2) {
                                                hashMap3.put(str6 + U3.i.l, valueOf);
                                                i2 = i5 + 3;
                                                char c6 = 0;
                                                while (i2 < split2.length) {
                                                }
                                                str3 = str10;
                                                str10 = str3;
                                                c = c2;
                                                c3 = 4;
                                                if (c >= c3) {
                                                }
                                            }
                                        }
                                        hashMap3.put(str14, Float.valueOf(floatValue2));
                                    } catch (Throwable unused3) {
                                        hashMap2 = hashMap8;
                                        hashMap3.put(str6 + U3.i.l, valueOf);
                                        i2 = i5 + 3;
                                        char c62 = 0;
                                        while (i2 < split2.length) {
                                        }
                                        str3 = str10;
                                        str10 = str3;
                                        c = c2;
                                        c3 = 4;
                                        if (c >= c3) {
                                        }
                                    }
                                    i2 = i5 + 3;
                                    char c622 = 0;
                                    while (i2 < split2.length) {
                                        String str15 = "softirq";
                                        if (c622 == 0) {
                                            c4 = c622;
                                            if ("user".equalsIgnoreCase(split2[i2])) {
                                                str15 = "user";
                                                c622 = 1;
                                                if (str15 == null) {
                                                }
                                                if (c622 < 6) {
                                                }
                                            }
                                        } else if (c622 == 1) {
                                            c4 = c622;
                                        } else if (c622 == 2) {
                                            c4 = c622;
                                            if ("iowait".equalsIgnoreCase(split2[i2])) {
                                                str15 = "iowait";
                                                c622 = 3;
                                                if (str15 == null) {
                                                }
                                                if (c622 < 6) {
                                                }
                                            }
                                            if ("irq".equalsIgnoreCase(split2[i2])) {
                                            }
                                            if ("softirq".equalsIgnoreCase(split2[i2])) {
                                            }
                                            if ("softirq".equalsIgnoreCase(split2[i2])) {
                                            }
                                            c622 = c4;
                                            str15 = null;
                                            if (str15 == null) {
                                            }
                                            if (c622 < 6) {
                                            }
                                        } else if (c622 == 3) {
                                            c4 = c622;
                                            if ("irq".equalsIgnoreCase(split2[i2])) {
                                                str15 = "irq";
                                                c622 = 4;
                                                if (str15 == null) {
                                                }
                                                if (c622 < 6) {
                                                }
                                            }
                                            if ("softirq".equalsIgnoreCase(split2[i2])) {
                                            }
                                            if ("softirq".equalsIgnoreCase(split2[i2])) {
                                            }
                                            c622 = c4;
                                            str15 = null;
                                            if (str15 == null) {
                                            }
                                            if (c622 < 6) {
                                            }
                                        } else if (c622 != 4) {
                                            c4 = c622;
                                        } else {
                                            c4 = c622;
                                            if ("softirq".equalsIgnoreCase(split2[i2])) {
                                                c622 = 5;
                                                if (str15 == null) {
                                                    try {
                                                        floatValue = Float.valueOf(split2[i2 - 1].replace(str7, "")).floatValue();
                                                        strArr2 = split2;
                                                    } catch (Throwable unused4) {
                                                        strArr2 = split2;
                                                    }
                                                    try {
                                                        String str16 = str6 + str15;
                                                        if (hashMap3 == hashMap4) {
                                                            str8 = str7;
                                                        } else {
                                                            str8 = str7;
                                                            try {
                                                                floatValue /= com.apm.insight.l.d.d();
                                                            } catch (Throwable unused5) {
                                                                hashMap3.put(str6 + str15, valueOf);
                                                                if (c622 < 6) {
                                                                }
                                                            }
                                                        }
                                                        hashMap3.put(str16, Float.valueOf(floatValue));
                                                    } catch (Throwable unused6) {
                                                        str8 = str7;
                                                        hashMap3.put(str6 + str15, valueOf);
                                                        if (c622 < 6) {
                                                        }
                                                    }
                                                } else {
                                                    strArr2 = split2;
                                                    str8 = str7;
                                                }
                                                if (c622 < 6) {
                                                    break;
                                                }
                                                i2 += 3;
                                                split2 = strArr2;
                                                str7 = str8;
                                            }
                                            if ("softirq".equalsIgnoreCase(split2[i2])) {
                                                c622 = 6;
                                                if (str15 == null) {
                                                }
                                                if (c622 < 6) {
                                                }
                                            }
                                            c622 = c4;
                                            str15 = null;
                                            if (str15 == null) {
                                            }
                                            if (c622 < 6) {
                                            }
                                        }
                                        if ("kernel".equalsIgnoreCase(split2[i2])) {
                                            str15 = "kernel";
                                            c622 = 2;
                                            if (str15 == null) {
                                            }
                                            if (c622 < 6) {
                                            }
                                        }
                                        if ("iowait".equalsIgnoreCase(split2[i2])) {
                                        }
                                        if ("irq".equalsIgnoreCase(split2[i2])) {
                                        }
                                        if ("softirq".equalsIgnoreCase(split2[i2])) {
                                        }
                                        if ("softirq".equalsIgnoreCase(split2[i2])) {
                                        }
                                        c622 = c4;
                                        str15 = null;
                                        if (str15 == null) {
                                        }
                                        if (c622 < 6) {
                                        }
                                    }
                                    str3 = str10;
                                }
                            }
                            hashMap = hashMap7;
                            hashMap2 = hashMap8;
                            c3 = 4;
                            c = 4;
                            if (c >= c3) {
                            }
                        }
                        hashMap = hashMap7;
                        hashMap2 = hashMap8;
                        str3 = str10;
                    }
                    str10 = str3;
                    c = c2;
                } else {
                    c2 = c5;
                    hashMap = hashMap7;
                    hashMap2 = hashMap8;
                    str2 = str9;
                    trim = str12.trim();
                    if (trim.startsWith("Load:")) {
                        c = c2;
                    } else {
                        String[] split3 = trim.replace("Load:", "").trim().split("/");
                        if (3 == split3.length) {
                            for (int i6 = 0; i6 < split3.length; i6++) {
                                fArr[i6] = Float.valueOf(split3[i6]).floatValue();
                            }
                        }
                        c = 3;
                    }
                }
                c3 = 4;
                if (c >= c3) {
                }
            }
            i3++;
            bVar = this;
            c5 = c;
            split = strArr;
            length = i;
            str9 = str2;
            hashMap7 = hashMap;
            hashMap8 = hashMap2;
        }
        jSONObject.put("anr_tag", str10);
        jSONObject.put("anr_has_ago", String.valueOf(z3));
        jSONObject.put("anr_reason", str11);
        a(hashMap6, jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        a(hashMap4, jSONObject, U3.i.l);
        if (hashMap5.isEmpty()) {
            jSONObject.put("npth_anr_systemserver_total", "not found");
        } else {
            jSONObject.put("npth_anr_systemserver_total", b(c.AnonymousClass1.a(hashMap5).floatValue()));
        }
        if (hashMap2.isEmpty()) {
            jSONObject.put("npth_anr_kswapd_total", "not found");
        } else {
            jSONObject.put("npth_anr_kswapd_total", b(c.AnonymousClass1.a(hashMap2).floatValue()));
        }
        if (hashMap.isEmpty()) {
            jSONObject.put("npth_anr_dex2oat_total", "not found");
        } else {
            jSONObject.put("npth_anr_dex2oat_total", b(c.AnonymousClass1.a(hashMap).floatValue()));
        }
    }

    private static void a(HashMap<String, Float> hashMap, JSONObject jSONObject, String str) throws JSONException {
        String concat = "npth_anr_".concat(String.valueOf(str));
        if (hashMap.isEmpty()) {
            jSONObject.put(concat + "_total", "not found");
            return;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (Map.Entry<String, Float> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            if (key.endsWith("user")) {
                f += entry.getValue().floatValue();
            } else if (key.endsWith("kernel")) {
                f2 += entry.getValue().floatValue();
            } else if (key.endsWith("iowait")) {
                f3 += entry.getValue().floatValue();
            } else if (key.endsWith("irq")) {
                f4 += entry.getValue().floatValue();
            } else if (key.endsWith("softirq")) {
                f5 += entry.getValue().floatValue();
            }
        }
        float f6 = f + f2 + f3 + f4 + f5;
        jSONObject.put(concat + "_total", b(f6));
        jSONObject.put(concat + "_kernel_user_ratio", a(f2, f6));
        jSONObject.put(concat + "_iowait_user_ratio", a(f3, f6));
    }

    private static String a(float f, float f2) {
        if (f2 > 0.0f) {
            return a(f / f2);
        }
        return f > 0.0f ? "100%" : "0%";
    }

    private static String a(float f) {
        if (f <= 0.0f) {
            return "0%";
        }
        if (f <= 0.1f) {
            return "0% - 10%";
        }
        if (f <= 0.3f) {
            return "10% - 30%";
        }
        if (f <= 0.6f) {
            return "30% - 60%";
        }
        if (f <= 0.9f) {
            return "60% - 90%";
        }
        return "90% - 100%";
    }

    private static String b(float f) {
        return a(f / 100.0f);
    }

    private static void b(String str, JSONArray jSONArray) {
        for (ICrashCallback iCrashCallback : l.a().e()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(CrashType.ANR, str, (Thread) null, jSONArray);
                } else {
                    iCrashCallback.onCrash(CrashType.ANR, str, null);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:39|41|42|(0)|45|(0)|48|(22:50|53|54|(0)(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|66|(0)|69|70|71|72|73|(0)|77|78|(0)|82)|120|54|(0)(0)|57|(0)(0)|60|(0)(0)|63|(0)(0)|66|(0)|69|70|71|72|73|(0)|77|78|(0)|82) */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x03ba, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x03bc, code lost:
    
        com.apm.insight.c.a();
        com.apm.insight.runtime.j.a(r0, "NPTH_CATCH");
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0233 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019e A[Catch: all -> 0x0432, TryCatch #1 {all -> 0x0432, blocks: (B:42:0x014f, B:44:0x019e, B:45:0x01ad, B:47:0x01d0, B:48:0x01d5, B:50:0x01db, B:53:0x01e2, B:54:0x01ea, B:71:0x03c7, B:82:0x0416, B:120:0x01e5), top: B:41:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d0 A[Catch: all -> 0x0432, TryCatch #1 {all -> 0x0432, blocks: (B:42:0x014f, B:44:0x019e, B:45:0x01ad, B:47:0x01d0, B:48:0x01d5, B:50:0x01db, B:53:0x01e2, B:54:0x01ea, B:71:0x03c7, B:82:0x0416, B:120:0x01e5), top: B:41:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03ad A[Catch: all -> 0x03c5, TRY_LEAVE, TryCatch #4 {all -> 0x03c5, blocks: (B:117:0x0238, B:57:0x023f, B:60:0x02ab, B:63:0x0358, B:66:0x037e, B:68:0x03ad, B:89:0x03bc, B:70:0x03b6), top: B:116:0x0238, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03dd A[Catch: all -> 0x03e4, TRY_LEAVE, TryCatch #2 {all -> 0x03e4, blocks: (B:73:0x03cf, B:75:0x03dd), top: B:72:0x03cf }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x040b A[Catch: all -> 0x0416, TRY_LEAVE, TryCatch #5 {all -> 0x0416, blocks: (B:78:0x03e4, B:80:0x040b), top: B:77:0x03e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean g() {
        String str;
        String str2;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        boolean z2;
        JSONObject jSONObject2;
        boolean z3;
        String str3;
        String str4;
        JSONArray jSONArray3;
        final long j;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject b;
        JSONObject optJSONObject;
        JSONObject jSONObject5;
        JSONArray a2;
        long j2;
        String str5;
        int i;
        JSONObject jSONObject6;
        JSONObject jSONObject7;
        boolean b2 = com.apm.insight.runtime.i.a().b();
        long uptimeMillis = SystemClock.uptimeMillis();
        a(uptimeMillis);
        String a3 = d.a(this.b);
        long currentTimeMillis = System.currentTimeMillis();
        String str6 = Constants.NORMAL;
        TextUtils.isEmpty(a3);
        if (TextUtils.isEmpty(a3)) {
            str = "unknown";
            str2 = "unknown";
            jSONArray = null;
            jSONArray2 = null;
            jSONObject = null;
            z2 = false;
            jSONObject2 = null;
            z3 = false;
            str3 = Constants.NORMAL;
            str4 = "unknown";
            jSONArray3 = null;
            j = currentTimeMillis;
            jSONObject3 = null;
        } else {
            synchronized (this.u) {
            }
            if (this.g != null && System.currentTimeMillis() - this.d <= 20000) {
                str6 = "trace_last";
            } else {
                if (this.v) {
                    this.v = false;
                    str6 = "trace_after";
                }
                b(uptimeMillis);
            }
            JSONObject jSONObject8 = this.g;
            String str7 = this.i;
            String str8 = this.j;
            String str9 = this.k;
            JSONArray jSONArray4 = this.m;
            JSONArray jSONArray5 = this.r;
            JSONArray jSONArray6 = this.q;
            JSONObject jSONObject9 = this.s;
            JSONObject jSONObject10 = this.h;
            z3 = this.t;
            long j3 = this.p;
            this.g = null;
            this.m = null;
            this.q = null;
            this.h = null;
            this.r = null;
            this.i = "unknown";
            this.j = "unknown";
            this.k = "unknown";
            this.o = 0;
            jSONArray2 = jSONArray6;
            str2 = str9;
            str4 = str7;
            jSONArray3 = jSONArray4;
            jSONObject2 = jSONObject10;
            jSONObject = jSONObject9;
            jSONArray = jSONArray5;
            str = str8;
            str3 = str6;
            j = j3;
            jSONObject3 = jSONObject8;
            z2 = true;
        }
        if (TextUtils.isEmpty(a3)) {
            if (this.g != null && System.currentTimeMillis() - this.d > 20000) {
                this.g = null;
                this.m = null;
                this.q = null;
                this.h = null;
                this.r = null;
                this.i = "unknown";
                this.j = "unknown";
                this.k = "unknown";
                this.o = 0;
                this.e = null;
                return false;
            }
            if (this.g == null || System.currentTimeMillis() - this.d <= 2000 || !NativeImpl.h()) {
                return false;
            }
            com.apm.insight.l.f.a(i());
            return false;
        }
        if (jSONObject3 == null) {
            if (jSONArray2 == null) {
                try {
                    jSONArray = f.b().b();
                    jSONArray2 = j.a(uptimeMillis);
                    jSONObject6 = jSONObject3;
                    try {
                        jSONObject2 = f.b().a(uptimeMillis).a();
                        jSONObject7 = new JSONObject();
                    } catch (Throwable unused) {
                    }
                    try {
                        com.apm.insight.l.a.a(this.b, jSONObject7);
                        jSONObject = jSONObject7;
                    } catch (Throwable unused2) {
                        jSONObject = jSONObject7;
                        jSONObject3 = jSONObject6;
                        JSONObject jSONObject11 = jSONObject2;
                        if (jSONObject3 != null) {
                            try {
                                jSONObject3.put("pid", Process.myPid());
                                jSONObject3.put("package", this.b.getPackageName());
                                jSONObject3.put("is_remote_process", 0);
                                jSONObject3.put("is_new_stack", 10);
                                com.apm.insight.entity.a aVar = new com.apm.insight.entity.a(new JSONObject());
                                String str10 = str2;
                                aVar.a("data", (Object) jSONObject3.toString());
                                JSONObject jSONObject12 = jSONObject3;
                                aVar.a("is_anr", (Object) 1);
                                aVar.a("anrType", (Object) str3);
                                if (com.apm.insight.e.x()) {
                                }
                                aVar.a("anr_time", Long.valueOf(System.currentTimeMillis()));
                                aVar.a("crash_time", Long.valueOf(j));
                                com.apm.insight.c.a.b();
                                aVar.c(jSONObject);
                                aVar.a("anr_info", (Object) a3);
                                if (jSONArray3 != null) {
                                }
                                jSONObject4 = this.n;
                                if (jSONObject4 != null) {
                                    b = this.n;
                                    aVar.a("all_thread_stacks", b);
                                    com.apm.insight.entity.a a4 = com.apm.insight.runtime.a.f.a().a(CrashType.ANR, aVar);
                                    a4.a("is_background", Boolean.valueOf(z3));
                                    a4.a("logcat", (Object) com.apm.insight.runtime.h.a(com.apm.insight.e.f()));
                                    a4.a("has_dump", (Object) "true");
                                    a4.a("crash_uuid", (Object) com.apm.insight.e.a(j, CrashType.ANR, false, false));
                                    optJSONObject = a4.c().optJSONObject("filters");
                                    com.apm.insight.entity.d.b(a4.c());
                                    if (optJSONObject != null) {
                                    }
                                    jSONObject5.put("anrType", str3);
                                    jSONObject5.put("max_utm_thread", str4);
                                    jSONObject5.put("max_stm_thread", str);
                                    jSONObject5.put("max_utm_stm_thread", str10);
                                    jSONObject5.put("max_utm_thread_version", this.l);
                                    j2 = j - com.apm.insight.e.j();
                                    if (j2 >= 30000) {
                                    }
                                    jSONObject5.put("crash_length", str5);
                                    jSONObject5.put("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.c()));
                                    jSONObject5.put("npth_force_apm_crash", String.valueOf(com.apm.insight.c.a.b()));
                                    jSONObject5.put("sdk_version", "2008-20250701130429");
                                    jSONObject5.put("has_logcat", String.valueOf(a4.a()));
                                    jSONObject5.put("memory_leak", String.valueOf(com.apm.insight.entity.a.a(com.apm.insight.e.f())));
                                    jSONObject5.put("fd_leak", String.valueOf(com.apm.insight.entity.a.b(com.apm.insight.e.f())));
                                    jSONObject5.put("threads_leak", String.valueOf(com.apm.insight.entity.a.c(com.apm.insight.e.f())));
                                    jSONObject5.put("is_64_devices", String.valueOf(Header.a()));
                                    jSONObject5.put("is_64_runtime", String.valueOf(NativeImpl.f()));
                                    jSONObject5.put("is_x86_devices", String.valueOf(Header.b()));
                                    jSONObject5.put("has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(com.apm.insight.e.f()).exists()));
                                    jSONObject5.put("is_root", !com.apm.insight.nativecrash.a.k() ? "true" : "false");
                                    jSONObject5.put("anr_normal_trace", String.valueOf(!this.v));
                                    jSONObject5.put("anr_no_run", String.valueOf(b2));
                                    jSONObject5.put("crash_after_crash", !Npth.hasCrash() ? "true" : "false");
                                    jSONObject5.put("from_file", String.valueOf(d.b()));
                                    jSONObject5.put("has_dump", "true");
                                    jSONObject5.put("from_kill", "false");
                                    jSONObject5.put("last_resume_activity", com.apm.insight.runtime.a.b.d().h());
                                    i = this.o;
                                    if (i > 0) {
                                    }
                                    a(a3, jSONObject5);
                                    com.apm.insight.a.a.a();
                                    CrashType crashType = CrashType.ANR;
                                    com.apm.insight.e.e();
                                    if (com.apm.insight.a.e().length() > 1024) {
                                    }
                                    a2 = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
                                    jSONObject5.put("leak_threads_count", String.valueOf(a2.length()));
                                    if (a2.length() > 0) {
                                    }
                                    String optString = jSONObject12.optString("mainStackFromTrace");
                                    JSONArray a5 = com.apm.insight.entity.b.a(optString);
                                    com.apm.insight.entity.b.a(a4.c(), a5, new b.a() { // from class: com.apm.insight.b.b.2
                                        @Override // com.apm.insight.entity.b.a
                                        public final void a(JSONObject jSONObject13) {
                                            com.apm.insight.k.d.a().a(jSONObject13, j, b.this.f);
                                        }
                                    });
                                    b(optString, a5);
                                }
                                b = m.b((String) null);
                                aVar.a("all_thread_stacks", b);
                                com.apm.insight.entity.a a42 = com.apm.insight.runtime.a.f.a().a(CrashType.ANR, aVar);
                                a42.a("is_background", Boolean.valueOf(z3));
                                a42.a("logcat", (Object) com.apm.insight.runtime.h.a(com.apm.insight.e.f()));
                                a42.a("has_dump", (Object) "true");
                                a42.a("crash_uuid", (Object) com.apm.insight.e.a(j, CrashType.ANR, false, false));
                                optJSONObject = a42.c().optJSONObject("filters");
                                com.apm.insight.entity.d.b(a42.c());
                                if (optJSONObject != null) {
                                }
                                jSONObject5.put("anrType", str3);
                                jSONObject5.put("max_utm_thread", str4);
                                jSONObject5.put("max_stm_thread", str);
                                jSONObject5.put("max_utm_stm_thread", str10);
                                jSONObject5.put("max_utm_thread_version", this.l);
                                j2 = j - com.apm.insight.e.j();
                                if (j2 >= 30000) {
                                }
                                jSONObject5.put("crash_length", str5);
                                jSONObject5.put("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.c()));
                                jSONObject5.put("npth_force_apm_crash", String.valueOf(com.apm.insight.c.a.b()));
                                jSONObject5.put("sdk_version", "2008-20250701130429");
                                jSONObject5.put("has_logcat", String.valueOf(a42.a()));
                                jSONObject5.put("memory_leak", String.valueOf(com.apm.insight.entity.a.a(com.apm.insight.e.f())));
                                jSONObject5.put("fd_leak", String.valueOf(com.apm.insight.entity.a.b(com.apm.insight.e.f())));
                                jSONObject5.put("threads_leak", String.valueOf(com.apm.insight.entity.a.c(com.apm.insight.e.f())));
                                jSONObject5.put("is_64_devices", String.valueOf(Header.a()));
                                jSONObject5.put("is_64_runtime", String.valueOf(NativeImpl.f()));
                                jSONObject5.put("is_x86_devices", String.valueOf(Header.b()));
                                jSONObject5.put("has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(com.apm.insight.e.f()).exists()));
                                jSONObject5.put("is_root", !com.apm.insight.nativecrash.a.k() ? "true" : "false");
                                jSONObject5.put("anr_normal_trace", String.valueOf(!this.v));
                                jSONObject5.put("anr_no_run", String.valueOf(b2));
                                jSONObject5.put("crash_after_crash", !Npth.hasCrash() ? "true" : "false");
                                jSONObject5.put("from_file", String.valueOf(d.b()));
                                jSONObject5.put("has_dump", "true");
                                jSONObject5.put("from_kill", "false");
                                jSONObject5.put("last_resume_activity", com.apm.insight.runtime.a.b.d().h());
                                i = this.o;
                                if (i > 0) {
                                }
                                a(a3, jSONObject5);
                                com.apm.insight.a.a.a();
                                CrashType crashType2 = CrashType.ANR;
                                com.apm.insight.e.e();
                                if (com.apm.insight.a.e().length() > 1024) {
                                }
                                a2 = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
                                jSONObject5.put("leak_threads_count", String.valueOf(a2.length()));
                                if (a2.length() > 0) {
                                }
                                String optString2 = jSONObject12.optString("mainStackFromTrace");
                                JSONArray a52 = com.apm.insight.entity.b.a(optString2);
                                com.apm.insight.entity.b.a(a42.c(), a52, new b.a() { // from class: com.apm.insight.b.b.2
                                    @Override // com.apm.insight.entity.b.a
                                    public final void a(JSONObject jSONObject13) {
                                        com.apm.insight.k.d.a().a(jSONObject13, j, b.this.f);
                                    }
                                });
                                b(optString2, a52);
                            } catch (Throwable th) {
                                com.apm.insight.c.a();
                                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                            }
                        }
                        return z2;
                    }
                } catch (Throwable unused3) {
                    jSONObject6 = jSONObject3;
                }
            } else {
                jSONObject6 = jSONObject3;
            }
            jSONObject3 = d.a();
        }
        JSONObject jSONObject112 = jSONObject2;
        if (jSONObject3 != null && jSONObject3.length() > 0) {
            jSONObject3.put("pid", Process.myPid());
            jSONObject3.put("package", this.b.getPackageName());
            jSONObject3.put("is_remote_process", 0);
            jSONObject3.put("is_new_stack", 10);
            com.apm.insight.entity.a aVar2 = new com.apm.insight.entity.a(new JSONObject());
            String str102 = str2;
            aVar2.a("data", (Object) jSONObject3.toString());
            JSONObject jSONObject122 = jSONObject3;
            aVar2.a("is_anr", (Object) 1);
            aVar2.a("anrType", (Object) str3);
            if (com.apm.insight.e.x()) {
                aVar2.a("history_message", (Object) jSONArray);
                aVar2.a("current_message", jSONObject112);
                aVar2.a("pending_messages", (Object) jSONArray2);
            }
            aVar2.a("anr_time", Long.valueOf(System.currentTimeMillis()));
            aVar2.a("crash_time", Long.valueOf(j));
            com.apm.insight.c.a.b();
            aVar2.c(jSONObject);
            aVar2.a("anr_info", (Object) a3);
            if (jSONArray3 != null) {
                aVar2.a("dump_trace", (Object) jSONArray3);
            }
            jSONObject4 = this.n;
            if (jSONObject4 != null && jSONObject4.length() != 0) {
                b = this.n;
                aVar2.a("all_thread_stacks", b);
                com.apm.insight.entity.a a422 = com.apm.insight.runtime.a.f.a().a(CrashType.ANR, aVar2);
                a422.a("is_background", Boolean.valueOf(z3));
                a422.a("logcat", (Object) com.apm.insight.runtime.h.a(com.apm.insight.e.f()));
                a422.a("has_dump", (Object) "true");
                a422.a("crash_uuid", (Object) com.apm.insight.e.a(j, CrashType.ANR, false, false));
                optJSONObject = a422.c().optJSONObject("filters");
                com.apm.insight.entity.d.b(a422.c());
                if (optJSONObject != null) {
                    try {
                        jSONObject5 = new JSONObject();
                        try {
                            a422.a("filters", jSONObject5);
                        } catch (Throwable unused4) {
                            optJSONObject = jSONObject5;
                            jSONObject5 = optJSONObject;
                            com.apm.insight.a.a.a();
                            CrashType crashType22 = CrashType.ANR;
                            com.apm.insight.e.e();
                            if (com.apm.insight.a.e().length() > 1024) {
                            }
                            a2 = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
                            jSONObject5.put("leak_threads_count", String.valueOf(a2.length()));
                            if (a2.length() > 0) {
                            }
                            String optString22 = jSONObject122.optString("mainStackFromTrace");
                            JSONArray a522 = com.apm.insight.entity.b.a(optString22);
                            com.apm.insight.entity.b.a(a422.c(), a522, new b.a() { // from class: com.apm.insight.b.b.2
                                @Override // com.apm.insight.entity.b.a
                                public final void a(JSONObject jSONObject13) {
                                    com.apm.insight.k.d.a().a(jSONObject13, j, b.this.f);
                                }
                            });
                            b(optString22, a522);
                            return z2;
                        }
                    } catch (Throwable unused5) {
                        jSONObject5 = optJSONObject;
                        com.apm.insight.a.a.a();
                        CrashType crashType222 = CrashType.ANR;
                        com.apm.insight.e.e();
                        if (com.apm.insight.a.e().length() > 1024) {
                        }
                        a2 = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
                        jSONObject5.put("leak_threads_count", String.valueOf(a2.length()));
                        if (a2.length() > 0) {
                        }
                        String optString222 = jSONObject122.optString("mainStackFromTrace");
                        JSONArray a5222 = com.apm.insight.entity.b.a(optString222);
                        com.apm.insight.entity.b.a(a422.c(), a5222, new b.a() { // from class: com.apm.insight.b.b.2
                            @Override // com.apm.insight.entity.b.a
                            public final void a(JSONObject jSONObject13) {
                                com.apm.insight.k.d.a().a(jSONObject13, j, b.this.f);
                            }
                        });
                        b(optString222, a5222);
                        return z2;
                    }
                } else {
                    jSONObject5 = optJSONObject;
                }
                jSONObject5.put("anrType", str3);
                jSONObject5.put("max_utm_thread", str4);
                jSONObject5.put("max_stm_thread", str);
                jSONObject5.put("max_utm_stm_thread", str102);
                jSONObject5.put("max_utm_thread_version", this.l);
                j2 = j - com.apm.insight.e.j();
                if (j2 >= 30000) {
                    str5 = "0 - 30s";
                } else if (j2 < 60000) {
                    str5 = "30s - 1min";
                } else if (j2 < UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
                    str5 = "1min - 2min";
                } else if (j2 < 300000) {
                    str5 = "2min - 5min";
                } else if (j2 < 600000) {
                    str5 = "5min - 10min";
                } else if (j2 < 1800000) {
                    str5 = "10min - 30min";
                } else if (j2 < 3600000) {
                    str5 = "30min - 1h";
                } else {
                    str5 = "1h - ";
                }
                jSONObject5.put("crash_length", str5);
                jSONObject5.put("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.c()));
                jSONObject5.put("npth_force_apm_crash", String.valueOf(com.apm.insight.c.a.b()));
                jSONObject5.put("sdk_version", "2008-20250701130429");
                jSONObject5.put("has_logcat", String.valueOf(a422.a()));
                jSONObject5.put("memory_leak", String.valueOf(com.apm.insight.entity.a.a(com.apm.insight.e.f())));
                jSONObject5.put("fd_leak", String.valueOf(com.apm.insight.entity.a.b(com.apm.insight.e.f())));
                jSONObject5.put("threads_leak", String.valueOf(com.apm.insight.entity.a.c(com.apm.insight.e.f())));
                jSONObject5.put("is_64_devices", String.valueOf(Header.a()));
                jSONObject5.put("is_64_runtime", String.valueOf(NativeImpl.f()));
                jSONObject5.put("is_x86_devices", String.valueOf(Header.b()));
                jSONObject5.put("has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(com.apm.insight.e.f()).exists()));
                jSONObject5.put("is_root", !com.apm.insight.nativecrash.a.k() ? "true" : "false");
                jSONObject5.put("anr_normal_trace", String.valueOf(!this.v));
                jSONObject5.put("anr_no_run", String.valueOf(b2));
                jSONObject5.put("crash_after_crash", !Npth.hasCrash() ? "true" : "false");
                jSONObject5.put("from_file", String.valueOf(d.b()));
                jSONObject5.put("has_dump", "true");
                jSONObject5.put("from_kill", "false");
                jSONObject5.put("last_resume_activity", com.apm.insight.runtime.a.b.d().h());
                i = this.o;
                if (i > 0) {
                    jSONObject5.put("may_have_stack_overflow", String.valueOf(i));
                }
                a(a3, jSONObject5);
                com.apm.insight.a.a.a();
                CrashType crashType2222 = CrashType.ANR;
                com.apm.insight.e.e();
                if (com.apm.insight.a.e().length() > 1024) {
                    a422.a("has_system_traces", "true");
                }
                a2 = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
                jSONObject5.put("leak_threads_count", String.valueOf(a2.length()));
                if (a2.length() > 0) {
                    com.apm.insight.l.f.a(com.apm.insight.l.j.g(com.apm.insight.e.f()), a2);
                }
                String optString2222 = jSONObject122.optString("mainStackFromTrace");
                JSONArray a52222 = com.apm.insight.entity.b.a(optString2222);
                com.apm.insight.entity.b.a(a422.c(), a52222, new b.a() { // from class: com.apm.insight.b.b.2
                    @Override // com.apm.insight.entity.b.a
                    public final void a(JSONObject jSONObject13) {
                        com.apm.insight.k.d.a().a(jSONObject13, j, b.this.f);
                    }
                });
                b(optString2222, a52222);
            }
            b = m.b((String) null);
            aVar2.a("all_thread_stacks", b);
            com.apm.insight.entity.a a4222 = com.apm.insight.runtime.a.f.a().a(CrashType.ANR, aVar2);
            a4222.a("is_background", Boolean.valueOf(z3));
            a4222.a("logcat", (Object) com.apm.insight.runtime.h.a(com.apm.insight.e.f()));
            a4222.a("has_dump", (Object) "true");
            a4222.a("crash_uuid", (Object) com.apm.insight.e.a(j, CrashType.ANR, false, false));
            optJSONObject = a4222.c().optJSONObject("filters");
            com.apm.insight.entity.d.b(a4222.c());
            if (optJSONObject != null) {
            }
            jSONObject5.put("anrType", str3);
            jSONObject5.put("max_utm_thread", str4);
            jSONObject5.put("max_stm_thread", str);
            jSONObject5.put("max_utm_stm_thread", str102);
            jSONObject5.put("max_utm_thread_version", this.l);
            j2 = j - com.apm.insight.e.j();
            if (j2 >= 30000) {
            }
            jSONObject5.put("crash_length", str5);
            jSONObject5.put("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.c()));
            jSONObject5.put("npth_force_apm_crash", String.valueOf(com.apm.insight.c.a.b()));
            jSONObject5.put("sdk_version", "2008-20250701130429");
            jSONObject5.put("has_logcat", String.valueOf(a4222.a()));
            jSONObject5.put("memory_leak", String.valueOf(com.apm.insight.entity.a.a(com.apm.insight.e.f())));
            jSONObject5.put("fd_leak", String.valueOf(com.apm.insight.entity.a.b(com.apm.insight.e.f())));
            jSONObject5.put("threads_leak", String.valueOf(com.apm.insight.entity.a.c(com.apm.insight.e.f())));
            jSONObject5.put("is_64_devices", String.valueOf(Header.a()));
            jSONObject5.put("is_64_runtime", String.valueOf(NativeImpl.f()));
            jSONObject5.put("is_x86_devices", String.valueOf(Header.b()));
            jSONObject5.put("has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(com.apm.insight.e.f()).exists()));
            jSONObject5.put("is_root", !com.apm.insight.nativecrash.a.k() ? "true" : "false");
            jSONObject5.put("anr_normal_trace", String.valueOf(!this.v));
            jSONObject5.put("anr_no_run", String.valueOf(b2));
            jSONObject5.put("crash_after_crash", !Npth.hasCrash() ? "true" : "false");
            jSONObject5.put("from_file", String.valueOf(d.b()));
            jSONObject5.put("has_dump", "true");
            jSONObject5.put("from_kill", "false");
            jSONObject5.put("last_resume_activity", com.apm.insight.runtime.a.b.d().h());
            i = this.o;
            if (i > 0) {
            }
            a(a3, jSONObject5);
            com.apm.insight.a.a.a();
            CrashType crashType22222 = CrashType.ANR;
            com.apm.insight.e.e();
            if (com.apm.insight.a.e().length() > 1024) {
            }
            a2 = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
            jSONObject5.put("leak_threads_count", String.valueOf(a2.length()));
            if (a2.length() > 0) {
            }
            String optString22222 = jSONObject122.optString("mainStackFromTrace");
            JSONArray a522222 = com.apm.insight.entity.b.a(optString22222);
            com.apm.insight.entity.b.a(a4222.c(), a522222, new b.a() { // from class: com.apm.insight.b.b.2
                @Override // com.apm.insight.entity.b.a
                public final void a(JSONObject jSONObject13) {
                    com.apm.insight.k.d.a().a(jSONObject13, j, b.this.f);
                }
            });
            b(optString22222, a522222);
        }
        return z2;
    }
}
