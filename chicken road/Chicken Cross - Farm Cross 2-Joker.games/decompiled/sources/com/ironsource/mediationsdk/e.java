package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.appevents.UserDataStore;
import com.ironsource.C4293aa;
import com.ironsource.C4457i5;
import com.ironsource.C4491k4;
import com.ironsource.C4561o2;
import com.ironsource.C4597q2;
import com.ironsource.I9;
import com.ironsource.S1;
import com.ironsource.Te;
import com.ironsource.Y1;
import com.ironsource.Z1;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f8407a = "1";
    private final String b = "102";
    private final String c = "102";
    private final String d = "GenericNotifications";
    private f e;
    private IronSource.a f;
    private C4597q2 g;
    private S1 h;
    private ISBannerSize i;

    public e(f fVar) {
        this.e = fVar;
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, Z1 z1, int i, C4293aa c4293aa, ISBannerSize iSBannerSize) {
        this.i = iSBannerSize;
        a(context, map, list, z1, i, c4293aa);
    }

    public void a(Context context, h hVar, S1 s1) {
        try {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.e.a(context, hVar, s1));
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error("execute auction exception " + e.getMessage());
            if (s1 != null) {
                s1.a(1000, e.getMessage(), 0, Y1.f8018a.a(this.e.a(), 1000), 0L);
            }
        }
    }

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        protected S1 f8408a;
        protected d.a b;
        protected int c;
        protected String d;
        protected long e;
        protected int f;
        private int h;
        private final URL k;
        private final JSONObject l;
        private final boolean m;
        private final int n;
        private final long o;
        private final boolean p;
        private final boolean q;
        private final boolean r;
        protected String i = "";
        protected int j = 0;
        protected String g = a((Integer) null);

        public a(S1 s1, URL url, JSONObject jSONObject, boolean z, C4597q2 c4597q2) {
            this.f8408a = s1;
            this.k = url;
            this.l = jSONObject;
            this.m = z;
            this.n = c4597q2.g();
            this.o = c4597q2.m();
            this.p = c4597q2.o();
            this.q = c4597q2.p();
            this.h = c4597q2.d();
            this.r = c4597q2.n();
        }

        private void a(long j, long j2) {
            long time = j - (new Date().getTime() - j2);
            if (time > 0) {
                SystemClock.sleep(time);
            }
        }

        protected boolean b() {
            long time;
            IronLog ironLog;
            int responseCode;
            this.e = new Date().getTime();
            try {
                this.h = this.j == 1015 ? 1 : this.h;
                this.f = 0;
                HttpURLConnection httpURLConnection = null;
                while (true) {
                    int i = this.f;
                    int i2 = this.n;
                    if (i >= i2) {
                        this.f = i2 - 1;
                        this.g = a(Integer.valueOf(this.c));
                        return false;
                    }
                    try {
                        time = new Date().getTime();
                        String str = "Auction Handler: auction trial " + (this.f + 1) + " out of " + this.n + " max trials";
                        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, str, 0);
                        IronSourceUtils.i(str);
                        httpURLConnection = a(this.k, this.o);
                        ironLog = IronLog.INTERNAL;
                        ironLog.verbose("parameters for auction url: " + this.k.getQuery());
                        ironLog.verbose("parameters for auction POST data: " + this.l);
                        a(httpURLConnection, this.l, this.p);
                        responseCode = httpURLConnection.getResponseCode();
                    } catch (SocketTimeoutException e) {
                        C4491k4.d().a(e);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.c = 1006;
                        this.d = "Connection timed out";
                        IronLog.INTERNAL.error("Auction socket timeout exception " + e.getMessage());
                    } catch (Throwable th) {
                        C4491k4.d().a(th);
                        IronLog.INTERNAL.error("getting exception " + th);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.c = 1000;
                        this.d = th.getMessage();
                        this.g = a(Integer.valueOf(this.c));
                        return false;
                    }
                    if (responseCode == 200 || responseCode == 204) {
                        break;
                    }
                    this.c = 1001;
                    String str2 = "Auction response code not valid, error code response from server - " + responseCode;
                    this.d = str2;
                    ironLog.error(str2);
                    httpURLConnection.disconnect();
                    if (this.f < this.n - 1) {
                        a(this.o, time);
                    }
                    this.f++;
                }
                try {
                    a(a(httpURLConnection), this.m, this.q);
                    httpURLConnection.disconnect();
                    return true;
                } catch (JSONException e2) {
                    C4491k4.d().a(e2);
                    if (e2.getMessage() != null && e2.getMessage().equalsIgnoreCase("decryption error")) {
                        this.c = 1003;
                        this.d = "Auction decryption error";
                    } else if (e2.getMessage() == null || !e2.getMessage().equalsIgnoreCase("decompression error")) {
                        this.c = 1002;
                        this.d = "Auction parsing error";
                    } else {
                        this.c = 1008;
                        this.d = "Auction decompression error";
                    }
                    this.g = a(Integer.valueOf(this.c));
                    IronLog.INTERNAL.error("Auction handle response exception " + e2.getMessage());
                    httpURLConnection.disconnect();
                    return false;
                }
            } catch (Exception e3) {
                C4491k4.d().a(e3);
                this.c = 1007;
                this.d = e3.getMessage();
                this.f = 0;
                this.g = a(Integer.valueOf(this.c));
                IronLog.INTERNAL.error("Auction request exception " + e3.getMessage());
                return false;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean b = b();
            S1 s1 = this.f8408a;
            if (s1 == null) {
                return;
            }
            a(b, s1, new Date().getTime() - this.e);
        }

        private String a() {
            if (this.h == 2) {
                return C4457i5.b().d();
            }
            return C4457i5.b().c();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void a(HttpURLConnection httpURLConnection, JSONObject jSONObject, boolean z) throws Exception {
            String a2;
            String e;
            String format;
            OutputStream outputStream = httpURLConnection.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            if (this.h == 2) {
                try {
                    a2 = C4457i5.b().a();
                } catch (JSONException e2) {
                    C4491k4.d().a(e2);
                    this.i = e2.getLocalizedMessage();
                    this.j = 1015;
                    this.h = 1;
                    IronLog.INTERNAL.error("get encrypted session key exception " + e2.getMessage());
                }
                String jSONObject2 = jSONObject.toString();
                String a3 = a();
                if (!z) {
                    IronLog.INTERNAL.verbose("compressing and encrypting auction request");
                    e = I9.a(a3, jSONObject2);
                } else {
                    e = I9.e(a3, jSONObject2);
                }
                if (this.h != 2) {
                    format = String.format("{\"sk\" : \"%1$s\", \"ct\" : \"%2$s\"}", a2, e);
                } else {
                    format = String.format("{\"request\" : \"%1$s\"}", e);
                }
                bufferedWriter.write(format);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStreamWriter.close();
                outputStream.close();
            }
            a2 = "";
            String jSONObject22 = jSONObject.toString();
            String a32 = a();
            if (!z) {
            }
            if (this.h != 2) {
            }
            bufferedWriter.write(format);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStream.close();
        }

        private HttpURLConnection a(URL url, long j) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setReadTimeout((int) j);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            return httpURLConnection;
        }

        protected JSONObject a(JSONObject jSONObject, boolean z) throws JSONException {
            String str;
            String a2 = a();
            if (this.h == 2) {
                str = UserDataStore.CITY;
            } else {
                str = Te.n;
            }
            String string = jSONObject.getString(str);
            if (z) {
                return b(a2, string);
            }
            return a(a2, string);
        }

        protected void a(String str, boolean z, boolean z2) throws JSONException {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (z) {
                    jSONObject = a(jSONObject, z2);
                }
                d.a a2 = d.b().a(jSONObject);
                this.b = a2;
                this.c = a2.c();
                this.d = this.b.d();
                return;
            }
            throw new JSONException("empty response");
        }

        private JSONObject a(String str, String str2) throws JSONException {
            String b = I9.b(str, str2);
            if (!TextUtils.isEmpty(b)) {
                return new JSONObject(b);
            }
            throw new JSONException("decryption error");
        }

        private String a(HttpURLConnection httpURLConnection) throws IOException {
            InputStreamReader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
            }
        }

        protected void a(boolean z, S1 s1, long j) {
            if (z) {
                s1.a(this.b.h(), this.b.a(), this.b.e(), this.b.f(), this.b.b(), this.f + 1, j, this.j, this.i);
            } else {
                s1.a(this.c, this.d, this.f + 1, this.g, j);
            }
        }

        private String a(Integer num) {
            return Y1.f8018a.a(this.r, num);
        }

        private JSONObject b(String str, String str2) throws JSONException {
            IronLog.INTERNAL.verbose("decrypting and decompressing auction response");
            String d = I9.d(str, str2);
            if (d != null) {
                return new JSONObject(d);
            }
            throw new JSONException("decompression error");
        }
    }

    @Deprecated
    public e(IronSource.a aVar, C4597q2 c4597q2, S1 s1) {
        this.f = aVar;
        this.g = c4597q2;
        this.h = s1;
    }

    @Deprecated
    public void a(Context context, Map<String, Object> map, List<String> list, Z1 z1, int i, C4293aa c4293aa) {
        try {
            boolean g = IronSourceUtils.g();
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new a(this.h, new URL(this.g.a(false)), a(map, list, z1, i, g, c4293aa), g, this.g));
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error("execute auction exception " + e.getMessage());
            this.h.a(1000, e.getMessage(), 0, Y1.f8018a.a(this.g.n(), 1000), 0L);
        }
    }

    public void a(C4561o2 c4561o2, int i, C4561o2 c4561o22, String str) {
        Iterator<String> it = c4561o2.b().iterator();
        while (it.hasNext()) {
            d.b().a("reportImpression", c4561o2.c(), d.b().a(it.next(), i, c4561o2, "", "", str));
        }
        if (c4561o22 != null) {
            Iterator<String> it2 = c4561o22.b().iterator();
            while (it2.hasNext()) {
                d.b().a("reportImpression", "GenericNotifications", d.b().a(it2.next(), i, c4561o2, "", "102", str));
            }
        }
    }

    public void a(C4561o2 c4561o2, int i, C4561o2 c4561o22) {
        Iterator<String> it = c4561o2.h().iterator();
        while (it.hasNext()) {
            d.b().a("reportLoadSuccess", c4561o2.c(), d.b().a(it.next(), i, c4561o2, "", "", ""));
        }
        if (c4561o22 != null) {
            Iterator<String> it2 = c4561o22.h().iterator();
            while (it2.hasNext()) {
                d.b().a("reportLoadSuccess", "GenericNotifications", d.b().a(it2.next(), i, c4561o2, "", "102", ""));
            }
        }
    }

    public void a(CopyOnWriteArrayList<u> copyOnWriteArrayList, ConcurrentHashMap<String, C4561o2> concurrentHashMap, int i, C4561o2 c4561o2, C4561o2 c4561o22) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<u> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        a(arrayList, concurrentHashMap, i, c4561o2, c4561o22);
    }

    public void a(ArrayList<String> arrayList, ConcurrentHashMap<String, C4561o2> concurrentHashMap, int i, C4561o2 c4561o2, C4561o2 c4561o22) {
        int j = c4561o22.j();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!next.equals(c4561o22.c())) {
                C4561o2 c4561o23 = concurrentHashMap.get(next);
                int j2 = c4561o23.j();
                String i2 = c4561o23.i();
                String str = j2 < j ? "1" : "102";
                IronLog.INTERNAL.verbose("instance=" + c4561o23.c() + ", instancePriceOrder= " + j2 + ", loseReasonCode=" + str + ", winnerInstance=" + c4561o22.c() + ", winnerInstancePriceOrder=" + j);
                Iterator<String> it2 = c4561o23.g().iterator();
                while (it2.hasNext()) {
                    d.b().a("reportAuctionLose", c4561o23.c(), d.b().a(it2.next(), i, c4561o22, i2, str, ""));
                }
            }
        }
        if (c4561o2 != null) {
            Iterator<String> it3 = c4561o2.g().iterator();
            while (it3.hasNext()) {
                d.b().a("reportAuctionLose", "GenericNotifications", d.b().a(it3.next(), i, c4561o22, "", "102", ""));
            }
        }
    }

    private JSONObject a(Map<String, Object> map, List<String> list, Z1 z1, int i, boolean z, C4293aa c4293aa) throws JSONException {
        h hVar = new h(this.f);
        hVar.a(map);
        hVar.a(list);
        hVar.a(z1);
        hVar.a(i);
        hVar.a(this.i);
        hVar.a(c4293aa);
        hVar.b(z);
        return d.b().a(hVar);
    }

    public boolean a() {
        return this.e.b();
    }
}
