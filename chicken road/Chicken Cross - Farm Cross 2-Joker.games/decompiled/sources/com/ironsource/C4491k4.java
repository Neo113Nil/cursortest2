package com.ironsource;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.U3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import io.ktor.sse.ServerSentEventKt;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.k4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4491k4 {
    private static final String k = "1.0.6";
    public static String l = "";

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4673u7 f8282a;
    private String b;
    private String c;
    private String d;
    private String e;
    private ContextProvider f;
    public Thread.UncaughtExceptionHandler g;
    public String h;
    private String i;
    private boolean j;

    /* renamed from: com.ironsource.k4$a */
    class a implements InterfaceC4325b {
        a() {
        }

        @Override // com.ironsource.InterfaceC4325b
        public void a() {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            StringBuilder sb = new StringBuilder(128);
            for (Thread thread : allStackTraces.keySet()) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace != null && stackTrace.length > 0) {
                    sb.append("*** Thread Name ").append(thread.getName()).append(" Thread ID ").append(thread.getId()).append(" (").append(thread.getState().toString()).append(") ***\n");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        sb.append(stackTraceElement.toString()).append(ServerSentEventKt.SPACE).append(thread.getState().toString()).append("\n");
                    }
                }
            }
            C4491k4.l = sb.toString();
        }

        @Override // com.ironsource.InterfaceC4325b
        public void b() {
        }
    }

    /* renamed from: com.ironsource.k4$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f8284a;
        final /* synthetic */ String b;

        b(Context context, String str) {
            this.f8284a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String I = C4491k4.this.f8282a.I(this.f8284a);
                if (!TextUtils.isEmpty(I)) {
                    C4491k4.this.c = I;
                }
                String c = C4491k4.this.f8282a.c(this.f8284a);
                if (!TextUtils.isEmpty(c)) {
                    C4491k4.this.e = c;
                }
                SharedPreferences.Editor edit = this.f8284a.getSharedPreferences("CRep", 0).edit();
                edit.putString("String1", C4491k4.this.c);
                edit.putString("sId", this.b);
                edit.apply();
            } catch (Exception e) {
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    /* renamed from: com.ironsource.k4$c */
    class c extends RunnableC4509l4 {
        c(JSONObject jSONObject) {
            super(jSONObject);
        }
    }

    /* renamed from: com.ironsource.k4$d */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        static volatile C4491k4 f8285a = new C4491k4();

        private d() {
        }
    }

    private C4491k4() {
        this.j = false;
        this.f8282a = Ib.a0().a();
        this.f = ContextProvider.getInstance();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.g = defaultUncaughtExceptionHandler;
        this.i = ServerSentEventKt.SPACE;
        this.h = "https://o-crash.mediation.unity3d.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new C4456i4(defaultUncaughtExceptionHandler));
    }

    static List<I5> c() {
        return null;
    }

    public static C4491k4 d() {
        return d.f8285a;
    }

    public void a(HashSet<String> hashSet, String str, String str2, boolean z, String str3, int i, boolean z2) {
        Context applicationContext = this.f.getApplicationContext();
        if (applicationContext != null) {
            Log.d("automation_log", "init ISCrashReporter");
            if (!TextUtils.isEmpty(str2)) {
                this.i = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.h = str;
            }
            this.d = str3;
            if (z) {
                new C4282a(i).a(z2).b(true).a(new a()).start();
            }
            a(applicationContext, hashSet);
            new Thread(new b(applicationContext, str3)).start();
        }
        this.j = true;
        IronLog.INTERNAL.verbose("initialized");
    }

    public String b() {
        return k;
    }

    String e() {
        return this.i;
    }

    public void a(Throwable th) {
        IronLog.INTERNAL.verbose("isInitialized=" + this.j);
        if (!this.j || th == null) {
            return;
        }
        new I5(new C4473j4(th).b(), "" + System.currentTimeMillis(), "Caught_IS_Crash").a();
    }

    private void a(Context context, HashSet<String> hashSet) {
        String a2 = a(a());
        if (a2.equals("none")) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
        String string = sharedPreferences.getString("String1", this.c);
        String string2 = sharedPreferences.getString("sId", this.d);
        List<I5> b2 = B4.b();
        IronLog.INTERNAL.verbose("reportList size " + b2.size());
        for (I5 i5 : b2) {
            JSONObject jSONObject = new JSONObject();
            String b3 = i5.b();
            String e = i5.e();
            String d2 = i5.d();
            String packageName = context.getPackageName();
            JSONObject jSONObject2 = new JSONObject();
            try {
                ActivityManager.MemoryInfo o = this.f8282a.o(context);
                if (o != null) {
                    jSONObject2.put("availRam", this.f8282a.c(o));
                    jSONObject2.put(L6.x, this.f8282a.b(o));
                    jSONObject2.put("mThreshold", this.f8282a.a(o));
                }
                String t = this.f8282a.t();
                if (t != null) {
                    jSONObject2.put(L6.z, t);
                }
                jSONObject2.put("crashDate", b3);
                jSONObject2.put("stacktraceCrash", e);
                jSONObject2.put("crashType", d2);
                jSONObject2.put("CrashReporterVersion", k);
                jSONObject2.put(U3.j.q, "9.5.0");
                jSONObject2.put(U3.j.x, this.f8282a.d(context));
                jSONObject2.put("appVersion", C1.b(context, packageName));
                jSONObject2.put(U3.j.n, this.f8282a.i());
                jSONObject2.put("network", a2);
                jSONObject2.put(U3.j.p, this.f8282a.e());
                jSONObject2.put("deviceModel", this.f8282a.l());
                jSONObject2.put("totalRam", this.f8282a.r(context));
                jSONObject2.put(Ta.o, this.f8282a.f());
                jSONObject2.put("advertisingId", string);
                jSONObject2.put("deviceOEM", this.f8282a.q());
                jSONObject2.put("systemProperties", System.getProperties());
                jSONObject2.put("bundleId", packageName);
                jSONObject2.put("sId", string2);
                if (!TextUtils.isEmpty(this.e)) {
                    jSONObject2.put(U3.j.M, Boolean.parseBoolean(this.e));
                }
                if (hashSet == null || hashSet.isEmpty()) {
                    jSONObject = jSONObject2;
                } else {
                    Iterator<String> it = hashSet.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            if (jSONObject2.has(next)) {
                                jSONObject.put(next, jSONObject2.opt(next));
                            }
                        } catch (Exception e2) {
                            IronLog.INTERNAL.error(e2.toString());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (jSONObject.length() == 0) {
                Log.d("ISCrashReport", " Is Empty");
            } else {
                new Thread(new c(jSONObject)).start();
            }
        }
        B4.a();
    }

    Context a() {
        return this.f.getApplicationContext();
    }

    private String a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return Q3.b;
            }
            return networkCapabilities.hasTransport(0) ? Q3.g : "none";
        } catch (Exception e) {
            IronLog.INTERNAL.error(e.toString());
            return "none";
        }
    }
}
