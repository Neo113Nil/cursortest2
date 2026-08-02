package p000;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingRegistrar;
import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplayRegistrar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: mf */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0468mf implements InterfaceC0254gm, InterfaceC0436lk, nw0, InterfaceC0554or, ic1, iu0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5032j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f5033k;

    public /* synthetic */ C0468mf(int i, Object obj) {
        this.f5032j = i;
        this.f5033k = obj;
    }

    @Override // p000.InterfaceC0554or
    /* JADX INFO: renamed from: a */
    public void mo1169a(my0 my0Var) {
        ((ry0) this.f5033k).f6989a = my0Var.get();
    }

    @Override // p000.InterfaceC0254gm
    public void accept(Object obj) {
        int i = this.f5032j;
        Object obj2 = this.f5033k;
        switch (i) {
            case 1:
                x00 x00Var = (x00) obj2;
                te1 te1Var = (te1) obj;
                C0615qe c0615qe = x00Var.f8732c;
                if (c0615qe != null) {
                    zc0 zc0Var = te1Var.f7441a;
                    C0547ok c0547ok = x00Var.f8730a;
                    c0615qe.displayMessage(zc0Var, new C0963zt((yc0) c0547ok.f5762a, (kc1) c0547ok.f5763b, (p51) c0547ok.f5764c, (xz0) c0547ok.f5765d, (C0463ma) c0547ok.f5766e, (aq0) c0547ok.f5767f, (C0312i6) c0547ok.f5768g, zc0Var, te1Var.f7442b));
                }
                break;
            case 4:
                C0900y3 c0900y3 = (C0900y3) obj2;
                c0900y3.getClass();
                HashSet hashSet = new HashSet();
                Iterator it = ((C0599pz) obj).m4013q().iterator();
                while (it.hasNext()) {
                    for (C0176ej c0176ej : ((C0948ze) it.next()).m5886t()) {
                        if (!TextUtils.isEmpty(c0176ej.m1428n().m255o())) {
                            hashSet.add(c0176ej.m1428n().m255o());
                        }
                    }
                }
                if (hashSet.size() > 50) {
                    n80.m3497f("Too many contextual triggers defined - limiting to 50");
                }
                n80.m3496e("Updating contextual triggers for the following analytics events: " + hashSet);
                c0900y3.f9140c.mo620p(hashSet);
                break;
            default:
                wc1 wc1Var = (wc1) obj2;
                C0599pz c0599pz = (C0599pz) obj;
                x90 x90Var = (x90) wc1Var.f8509d;
                if (!wc1Var.f8507b) {
                    if (wc1Var.f8508c) {
                        int i2 = wc1Var.f8506a + 1;
                        wc1Var.f8506a = i2;
                        if (i2 >= 5) {
                            wc1Var.f8508c = false;
                            x90Var.m5613a("fresh_install", false);
                        }
                    }
                    Iterator it2 = c0599pz.m4013q().iterator();
                    while (it2.hasNext()) {
                        if (((C0948ze) it2.next()).m5883q()) {
                            wc1Var.f8507b = true;
                            x90Var.m5613a("test_device", true);
                            n80.m3497f("Setting this device as a test device");
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public C0505nf m3378b(qd0 qd0Var) throws IOException {
        C0542of c0542of = (C0542of) this.f5033k;
        URL url = (URL) qd0Var.f6471k;
        String strConcat = "TRuntime.".concat("CctTransportBackend");
        if (Log.isLoggable(strConcat, 4)) {
            Log.i(strConcat, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(c0542of.f5715g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) qd0Var.f6473m;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    jg0 jg0Var = c0542of.f5709a;
                    C0721t9 c0721t9 = (C0721t9) qd0Var.f6472l;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    ng0 ng0Var = (ng0) jg0Var.f3922k;
                    qg0 qg0Var = new qg0(bufferedWriter, ng0Var.f5426a, ng0Var.f5427b, ng0Var.f5428c, ng0Var.f5429d);
                    qg0Var.m4097f(c0721t9);
                    qg0Var.m4099h();
                    qg0Var.f6490b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strConcat2 = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(strConcat2, 4)) {
                        Log.i(strConcat2, String.format("Status Code: %d", numValueOf));
                    }
                    o80.m3648j("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    o80.m3648j("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new C0505nf(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new C0505nf(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            C0505nf c0505nf = new C0505nf(responseCode, null, C0242ga.m2009a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f2675a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c0505nf;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (ConnectException | UnknownHostException e) {
            o80.m3649k("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new C0505nf(500, null, 0L);
        } catch (IOException | C0855ww e2) {
            o80.m3649k("CctTransportBackend", "Couldn't encode request, returning with 400", e2);
            return new C0505nf(400, null, 0L);
        }
    }

    @Override // p000.ic1
    /* JADX INFO: renamed from: c */
    public Object mo1085c() {
        int i = this.f5032j;
        Object obj = this.f5033k;
        switch (i) {
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                g41 g41Var = ((ng1) obj).f5438i;
                SQLiteDatabase sQLiteDatabaseM1980a = g41Var.m1980a();
                sQLiteDatabaseM1980a.beginTransaction();
                try {
                    sQLiteDatabaseM1980a.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseM1980a.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + g41Var.f2611k.mo159g()).execute();
                    sQLiteDatabaseM1980a.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseM1980a.endTransaction();
                }
            default:
                f71 f71Var = (f71) obj;
                Iterator it = ((Iterable) ((g41) f71Var.f2335l).m1981i(new dd0(21))).iterator();
                while (it.hasNext()) {
                    ((qd0) f71Var.f2336m).m4086x((C0648ra) it.next(), 1, false);
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m3379d(byte[] bArr) {
        ((n71) this.f5033k).m3490b(new C0832w9(bArr, null));
    }

    @Override // p000.iu0
    /* JADX INFO: renamed from: j */
    public void mo86j(v92 v92Var) {
        int i = this.f5032j;
        Object obj = this.f5033k;
        switch (i) {
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                j22.m2795d((Intent) obj);
                break;
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                ((ok1) obj).f5780b.m4063d(null);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // p000.nw0
    public boolean test(Object obj) {
        String str = (String) this.f5033k;
        C0948ze c0948ze = (C0948ze) obj;
        if (str.equals("ON_FOREGROUND") && c0948ze.m5883q()) {
            return true;
        }
        for (C0176ej c0176ej : c0948ze.m5886t()) {
            if (c0176ej.m1429o().toString().equals(str) || c0176ej.m1428n().m255o().equals(str)) {
                n80.m3496e("The event " + str + " is contained in the list of triggers");
                return true;
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0436lk
    /* JADX INFO: renamed from: x */
    public Object mo532x(C0902y5 c0902y5) {
        int i = this.f5032j;
        Object obj = this.f5033k;
        switch (i) {
            case 2:
                return ((FirebaseInAppMessagingDisplayRegistrar) obj).buildFirebaseInAppMessagingUI(c0902y5);
            default:
                return ((FirebaseInAppMessagingRegistrar) obj).providesFirebaseInAppMessaging(c0902y5);
        }
    }
}
