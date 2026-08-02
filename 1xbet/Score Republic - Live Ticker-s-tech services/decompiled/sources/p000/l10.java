package p000;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class l10 implements m10 {

    /* JADX INFO: renamed from: m */
    public static final Object f4629m = new Object();

    /* JADX INFO: renamed from: a */
    public final w00 f4630a;

    /* JADX INFO: renamed from: b */
    public final j10 f4631b;

    /* JADX INFO: renamed from: c */
    public final f50 f4632c;

    /* JADX INFO: renamed from: d */
    public final dh1 f4633d;

    /* JADX INFO: renamed from: e */
    public final dh0 f4634e;

    /* JADX INFO: renamed from: f */
    public final pz0 f4635f;

    /* JADX INFO: renamed from: g */
    public final Object f4636g;

    /* JADX INFO: renamed from: h */
    public final ExecutorService f4637h;

    /* JADX INFO: renamed from: i */
    public final v61 f4638i;

    /* JADX INFO: renamed from: j */
    public String f4639j;

    /* JADX INFO: renamed from: k */
    public final HashSet f4640k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f4641l;

    static {
        new AtomicInteger(1);
    }

    public l10(w00 w00Var, my0 my0Var, ExecutorService executorService, v61 v61Var) {
        w00Var.m5224a();
        j10 j10Var = new j10(w00Var.f8318a, my0Var);
        f50 f50Var = new f50(19, (Object) w00Var, false);
        if (aa0.f107k == null) {
            aa0.f107k = new aa0(16);
        }
        aa0 aa0Var = aa0.f107k;
        if (dh1.f1651c == null) {
            dh1.f1651c = new dh1(aa0Var);
        }
        dh1 dh1Var = dh1.f1651c;
        dh0 dh0Var = new dh0(new C0399kk(2, w00Var));
        pz0 pz0Var = new pz0();
        this.f4636g = new Object();
        this.f4640k = new HashSet();
        this.f4641l = new ArrayList();
        this.f4630a = w00Var;
        this.f4631b = j10Var;
        this.f4632c = f50Var;
        this.f4633d = dh1Var;
        this.f4634e = dh0Var;
        this.f4635f = pz0Var;
        this.f4637h = executorService;
        this.f4638i = v61Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m3139a() {
        C0389ka c0389kaM1622Y;
        int i;
        synchronized (f4629m) {
            try {
                w00 w00Var = this.f4630a;
                w00Var.m5224a();
                C0312i6 c0312i6M2533e = C0312i6.m2533e(w00Var.f8318a);
                try {
                    c0389kaM1622Y = this.f4632c.m1622Y();
                    int i2 = c0389kaM1622Y.f4323b;
                    i = 1;
                    if (i2 == 2 || i2 == 1) {
                        String strM3144f = m3144f(c0389kaM1622Y);
                        f50 f50Var = this.f4632c;
                        C0352ja c0352jaM3001a = c0389kaM1622Y.m3001a();
                        c0352jaM3001a.f3864a = strM3144f;
                        c0352jaM3001a.f3865b = 3;
                        c0389kaM1622Y = c0352jaM3001a.m2832a();
                        f50Var.m1613P(c0389kaM1622Y);
                    }
                    if (c0312i6M2533e != null) {
                        c0312i6M2533e.m2552x();
                    }
                } catch (Throwable th) {
                    if (c0312i6M2533e != null) {
                        c0312i6M2533e.m2552x();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m3147i(c0389kaM1622Y);
        this.f4638i.execute(new k10(this, i));
    }

    /* JADX INFO: renamed from: b */
    public final C0389ka m3140b(C0389ka c0389ka) throws n10 {
        int i;
        C0611qa c0611qa;
        C0611qa c0611qaM2761f;
        j10 j10Var = this.f4631b;
        w00 w00Var = this.f4630a;
        w00Var.m5224a();
        String str = w00Var.f8320c.f6650a;
        String str2 = c0389ka.f4322a;
        w00 w00Var2 = this.f4630a;
        w00Var2.m5224a();
        String str3 = w00Var2.f8320c.f6656g;
        String str4 = c0389ka.f4325d;
        C0505nf c0505nf = j10Var.f3773c;
        if (!c0505nf.m3531a()) {
            throw new n10("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlM2757a = j10.m2757a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i2 = 0;
        while (true) {
            if (i2 > 1) {
                throw new n10("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionM2765c = j10Var.m2765c(urlM2757a, str);
            try {
                try {
                    httpURLConnectionM2765c.setRequestMethod("POST");
                    httpURLConnectionM2765c.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionM2765c.setDoOutput(true);
                    j10.m2763h(httpURLConnectionM2765c);
                    int responseCode = httpURLConnectionM2765c.getResponseCode();
                    c0505nf.m3532b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        c0611qaM2761f = j10.m2761f(httpURLConnectionM2765c);
                        httpURLConnectionM2765c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    j10.m2758b(httpURLConnectionM2765c, null, str, str3);
                    i = i2;
                    try {
                        if (responseCode == 401 || responseCode == 404) {
                            if (((byte) (0 | 1)) != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            c0611qa = new C0611qa(3, 0L, null);
                        } else {
                            if (responseCode == 429) {
                                throw new n10("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                if (((byte) (0 | 1)) != 1) {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                                c0611qa = new C0611qa(2, 0L, null);
                            }
                            httpURLConnectionM2765c.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i2 = i + 1;
                        }
                        httpURLConnectionM2765c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c0611qaM2761f = c0611qa;
                        break;
                    } catch (IOException | AssertionError unused) {
                    }
                } catch (Throwable th) {
                    httpURLConnectionM2765c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused2) {
                i = i2;
            }
        }
        int iM292o = AbstractC0024an.m292o(c0611qaM2761f.f6434c);
        if (iM292o == 0) {
            String str5 = c0611qaM2761f.f6432a;
            long j = c0611qaM2761f.f6433b;
            this.f4633d.f1652a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            C0352ja c0352jaM3001a = c0389ka.m3001a();
            c0352jaM3001a.f3866c = str5;
            c0352jaM3001a.f3868e = j;
            byte b = (byte) (c0352jaM3001a.f3871h | 1);
            c0352jaM3001a.f3869f = jCurrentTimeMillis;
            c0352jaM3001a.f3871h = (byte) (b | 2);
            return c0352jaM3001a.m2832a();
        }
        if (iM292o == 1) {
            C0352ja c0352jaM3001a2 = c0389ka.m3001a();
            c0352jaM3001a2.f3870g = "BAD CONFIG";
            c0352jaM3001a2.f3865b = 5;
            return c0352jaM3001a2.m2832a();
        }
        if (iM292o != 2) {
            throw new n10("Firebase Installations Service is unavailable. Please try again later.");
        }
        synchronized (this) {
            this.f4639j = null;
        }
        C0352ja c0352jaM3001a3 = c0389ka.m3001a();
        c0352jaM3001a3.f3865b = 2;
        return c0352jaM3001a3.m2832a();
    }

    /* JADX INFO: renamed from: c */
    public final v92 m3141c() {
        String str;
        m3143e();
        synchronized (this) {
            str = this.f4639j;
        }
        if (str != null) {
            return hn0.m2316j(str);
        }
        qc1 qc1Var = new qc1();
        y70 y70Var = new y70(qc1Var);
        synchronized (this.f4636g) {
            this.f4641l.add(y70Var);
        }
        v92 v92Var = qc1Var.f6465a;
        this.f4637h.execute(new k10(this, 0));
        return v92Var;
    }

    /* JADX INFO: renamed from: d */
    public final v92 m3142d() {
        m3143e();
        qc1 qc1Var = new qc1();
        x70 x70Var = new x70(this.f4633d, qc1Var);
        synchronized (this.f4636g) {
            this.f4641l.add(x70Var);
        }
        v92 v92Var = qc1Var.f6465a;
        this.f4637h.execute(new k10(this, 2));
        return v92Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m3143e() {
        w00 w00Var = this.f4630a;
        w00Var.m5224a();
        p80.m3861f(w00Var.f8320c.f6651b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        w00Var.m5224a();
        p80.m3861f(w00Var.f8320c.f6656g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        w00Var.m5224a();
        p80.m3861f(w00Var.f8320c.f6650a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        w00Var.m5224a();
        String str = w00Var.f8320c.f6651b;
        Pattern pattern = dh1.f1650b;
        p80.m3857a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        w00Var.m5224a();
        p80.m3857a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", dh1.f1650b.matcher(w00Var.f8320c.f6650a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d A[Catch: all -> 0x003f, DONT_GENERATE, TRY_ENTER, TryCatch #1 {all -> 0x003f, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003d, B:19:0x0041, B:20:0x0045, B:28:0x0059, B:12:0x0031, B:13:0x003a), top: B:35:0x002e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0041 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003d, B:19:0x0041, B:20:0x0045, B:28:0x0059, B:12:0x0031, B:13:0x003a), top: B:35:0x002e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX INFO: renamed from: f */
    public final String m3144f(C0389ka c0389ka) {
        ac0 ac0Var;
        String string;
        w00 w00Var = this.f4630a;
        w00Var.m5224a();
        if (!w00Var.f8319b.equals("CHIME_ANDROID_SDK")) {
            w00 w00Var2 = this.f4630a;
            w00Var2.m5224a();
            if ("[DEFAULT]".equals(w00Var2.f8319b)) {
                if (c0389ka.f4323b == 1) {
                    ac0Var = (ac0) this.f4634e.get();
                    synchronized (ac0Var.f138a) {
                        try {
                            synchronized (ac0Var.f138a) {
                                string = ac0Var.f138a.getString("|S|id", null);
                            }
                            if (string != null) {
                                string = ac0Var.m174a();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f4635f.getClass();
                    return pz0.m4014a();
                }
            }
        } else if (c0389ka.f4323b == 1) {
            ac0Var = (ac0) this.f4634e.get();
            synchronized (ac0Var.f138a) {
                synchronized (ac0Var.f138a) {
                    string = ac0Var.f138a.getString("|S|id", null);
                    if (string != null) {
                        string = ac0Var.m174a();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f4635f.getClass();
                    return pz0.m4014a();
                }
            }
        }
        this.f4635f.getClass();
        return pz0.m4014a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [j10] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [ba] */
    /* JADX INFO: renamed from: g */
    public final C0389ka m3145g(C0389ka c0389ka) throws n10 {
        String str = c0389ka.f4322a;
        String string = null;
        if (str != null && str.length() == 11) {
            ac0 ac0Var = (ac0) this.f4634e.get();
            synchronized (ac0Var.f138a) {
                try {
                    String[] strArr = ac0.f137c;
                    int i = 0;
                    while (true) {
                        if (i >= 4) {
                            break;
                        }
                        String str2 = strArr[i];
                        String string2 = ac0Var.f138a.getString("|T|" + ac0Var.f139b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        j10 j10Var = this.f4631b;
        w00 w00Var = this.f4630a;
        w00Var.m5224a();
        String str3 = w00Var.f8320c.f6650a;
        String str4 = c0389ka.f4322a;
        w00 w00Var2 = this.f4630a;
        w00Var2.m5224a();
        String str5 = w00Var2.f8320c.f6656g;
        w00 w00Var3 = this.f4630a;
        w00Var3.m5224a();
        String str6 = w00Var3.f8320c.f6651b;
        C0505nf c0505nf = j10Var.f3773c;
        if (!c0505nf.m3531a()) {
            throw new n10("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlM2757a = j10.m2757a("projects/" + str5 + "/installations");
        int i2 = 0;
        C0055ba c0055ba = j10Var;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionM2765c = c0055ba.m2765c(urlM2757a, str3);
            try {
                try {
                    httpURLConnectionM2765c.setRequestMethod("POST");
                    httpURLConnectionM2765c.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionM2765c.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    j10.m2762g(httpURLConnectionM2765c, str4, str6);
                    int responseCode = httpURLConnectionM2765c.getResponseCode();
                    c0505nf.m3532b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        C0055ba c0055baM2760e = j10.m2760e(httpURLConnectionM2765c);
                        httpURLConnectionM2765c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c0055ba = c0055baM2760e;
                    } else {
                        try {
                            j10.m2758b(httpURLConnectionM2765c, str6, str3, str5);
                            if (responseCode == 429) {
                                throw new n10("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                C0055ba c0055ba2 = new C0055ba(null, null, null, null, 2);
                                httpURLConnectionM2765c.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                c0055ba = c0055ba2;
                            } else {
                                httpURLConnectionM2765c.disconnect();
                                TrafficStats.clearThreadStatsTag();
                                i2++;
                                c0055ba = c0055ba;
                            }
                        } catch (IOException | AssertionError unused2) {
                            httpURLConnectionM2765c.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    int iM292o = AbstractC0024an.m292o(c0055ba.f799e);
                    if (iM292o != 0) {
                        if (iM292o != 1) {
                            throw new n10("Firebase Installations Service is unavailable. Please try again later.");
                        }
                        C0352ja c0352jaM3001a = c0389ka.m3001a();
                        c0352jaM3001a.f3870g = "BAD CONFIG";
                        c0352jaM3001a.f3865b = 5;
                        return c0352jaM3001a.m2832a();
                    }
                    String str7 = c0055ba.f796b;
                    String str8 = c0055ba.f797c;
                    this.f4633d.f1652a.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    C0611qa c0611qa = c0055ba.f798d;
                    String str9 = c0611qa.f6432a;
                    long j = c0611qa.f6433b;
                    C0352ja c0352jaM3001a2 = c0389ka.m3001a();
                    c0352jaM3001a2.f3864a = str7;
                    c0352jaM3001a2.f3865b = 4;
                    c0352jaM3001a2.f3866c = str9;
                    c0352jaM3001a2.f3867d = str8;
                    c0352jaM3001a2.f3868e = j;
                    byte b = (byte) (c0352jaM3001a2.f3871h | 1);
                    c0352jaM3001a2.f3869f = jCurrentTimeMillis;
                    c0352jaM3001a2.f3871h = (byte) (b | 2);
                    return c0352jaM3001a2.m2832a();
                } catch (Throwable th2) {
                    httpURLConnectionM2765c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused3) {
            }
        }
        throw new n10("Firebase Installations Service is unavailable. Please try again later.");
    }

    /* JADX INFO: renamed from: h */
    public final void m3146h(Exception exc) {
        synchronized (this.f4636g) {
            try {
                Iterator it = this.f4641l.iterator();
                while (it.hasNext()) {
                    if (((fa1) it.next()).mo1753a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3147i(C0389ka c0389ka) {
        synchronized (this.f4636g) {
            try {
                Iterator it = this.f4641l.iterator();
                while (it.hasNext()) {
                    if (((fa1) it.next()).mo1754b(c0389ka)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
