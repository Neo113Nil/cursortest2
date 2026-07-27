package F1;

import A0.j;
import A0.k;
import A0.r;
import G0.l;
import I1.x;
import T1.c;
import Y1.A;
import Y1.C0081e;
import Y1.C0084h;
import Y1.n;
import Y1.y;
import android.app.usage.UsageStatsManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.location.LocationManager;
import android.util.Log;
import android.view.View;
import b2.InterfaceC0166c;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.adinformation.ImageResourceConfig;
import com.startapp.sdk.internal.aa;
import com.startapp.sdk.internal.g7;
import com.startapp.sdk.internal.i2;
import com.startapp.sdk.internal.i8;
import com.startapp.sdk.internal.s1;
import com.startapp.sdk.internal.t1;
import com.startapp.sdk.internal.zi;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import io.appmetrica.analytics.impl.C0637l2;
import io.appmetrica.analytics.impl.C0644l9;
import io.appmetrica.analytics.impl.C2;
import io.appmetrica.analytics.impl.E2;
import io.appmetrica.analytics.impl.P5;
import io.appmetrica.analytics.location.impl.u;
import j1.C1054b;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import l1.d;
import l1.e;
import m0.C1120h;
import m0.InterfaceC1128p;
import m0.InterfaceC1129q;
import org.json.JSONException;
import org.json.JSONObject;
import z0.i;
import z0.m;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements FunctionWithThrowable, I0.b, c, InterfaceC1129q, InterfaceC1128p, InterfaceC0166c, i2, g7, zi, T1.b, ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f378b;

    public /* synthetic */ b(int i3, Object obj) {
        this.f377a = i3;
        this.f378b = obj;
    }

    @Override // com.startapp.sdk.internal.g7
    public Object a(Object obj) {
        switch (this.f377a) {
            case 18:
                return aa.a((aa) this.f378b, (Throwable) obj);
            case C0644l9.f7759C /* 19 */:
            default:
                return ((t1) this.f378b).a((Throwable) obj);
            case C0644l9.f7760D /* 20 */:
                return ((s1) this.f378b).a((Throwable) obj);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        E2 a3;
        switch (this.f377a) {
            case 0:
                return u.a((u) this.f378b, (LocationManager) obj);
            default:
                a3 = C2.a((C0637l2) this.f378b, (UsageStatsManager) obj);
                return a3;
        }
    }

    public y0.b b(j jVar) {
        y0.c cVar = (y0.c) this.f378b;
        String t3 = X0.a.t("CctTransportBackend");
        boolean isLoggable = Log.isLoggable(t3, 4);
        URL url = (URL) jVar.f67c;
        if (isLoggable) {
            Log.i(t3, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(cVar.f10582g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.8 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) jVar.f66b;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    b0.j jVar2 = cVar.f10577a;
                    i iVar = (i) jVar.f68d;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    d dVar = (d) jVar2.f2462a;
                    e eVar = new e(bufferedWriter, dVar.f9923a, dVar.f9924b, dVar.f9925c, dVar.f9926d);
                    eVar.e(iVar);
                    eVar.g();
                    eVar.f9928b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String t4 = X0.a.t("CctTransportBackend");
                    if (Log.isLoggable(t4, 4)) {
                        Log.i(t4, String.format("Status Code: %d", valueOf));
                    }
                    X0.a.p("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    X0.a.p("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new y0.b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new y0.b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            y0.b bVar = new y0.b(responseCode, null, m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f10689a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (C1054b e3) {
            e = e3;
            X0.a.r("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new y0.b(400, null, 0L);
        } catch (ConnectException e4) {
            e = e4;
            X0.a.r("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new y0.b(500, null, 0L);
        } catch (UnknownHostException e5) {
            e = e5;
            X0.a.r("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new y0.b(500, null, 0L);
        } catch (IOException e6) {
            e = e6;
            X0.a.r("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new y0.b(400, null, 0L);
        }
    }

    public void c(C1120h c1120h) {
        ((C0081e) this.f378b).a(F2.b.s(c1120h));
    }

    public void d(C1120h c1120h) {
        n s3 = F2.b.s(c1120h);
        C0084h c0084h = new C0084h();
        c0084h.f1680a = s3;
        c0084h.f1681b = "";
        ((C0081e) this.f378b).a(c0084h);
    }

    @Override // T1.b
    public void e(Object obj, a1.e eVar) {
        switch (this.f377a) {
            case 22:
                Pigeon.AppMetricaConfigConverterPigeon.lambda$setup$0((Pigeon.AppMetricaConfigConverterPigeon) this.f378b, obj, eVar);
                break;
            case 23:
                Pigeon.AppMetricaLibraryAdapterPigeon.lambda$setup$0((Pigeon.AppMetricaLibraryAdapterPigeon) this.f378b, obj, eVar);
                break;
            default:
                Pigeon.InitialDeepLinkHolderPigeon.lambda$setup$0((Pigeon.InitialDeepLinkHolderPigeon) this.f378b, obj, eVar);
                break;
        }
    }

    @Override // I0.b
    public Object execute() {
        SQLiteDatabase a3;
        Object obj = this.f378b;
        switch (this.f377a) {
            case 1:
                H0.i iVar = (H0.i) ((H0.c) obj);
                iVar.getClass();
                int i3 = D0.b.f265e;
                D0.a aVar = new D0.a();
                aVar.f261a = null;
                aVar.f262b = new ArrayList();
                aVar.f263c = null;
                aVar.f264d = "";
                HashMap hashMap = new HashMap();
                a3 = iVar.a();
                a3.beginTransaction();
                try {
                    D0.b bVar = (D0.b) H0.i.h(a3.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new F0.b(iVar, hashMap, aVar, 4));
                    a3.setTransactionSuccessful();
                    return bVar;
                } finally {
                }
            case 2:
                H0.i iVar2 = (H0.i) ((H0.d) obj);
                long c3 = iVar2.f499b.c() - iVar2.f501d.f488d;
                a3 = iVar2.a();
                a3.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(c3)};
                    Cursor rawQuery = a3.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    try {
                        Cursor cursor = rawQuery;
                        while (cursor.moveToNext()) {
                            iVar2.e(cursor.getInt(0), D0.d.MESSAGE_TOO_OLD, cursor.getString(1));
                        }
                        rawQuery.close();
                        int delete = a3.delete("events", "timestamp_ms < ?", strArr);
                        a3.setTransactionSuccessful();
                        a3.endTransaction();
                        return Integer.valueOf(delete);
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                } finally {
                }
            case 3:
                H0.i iVar3 = (H0.i) ((l) obj).f426i;
                a3 = iVar3.a();
                a3.beginTransaction();
                try {
                    a3.compileStatement("DELETE FROM log_event_dropped").execute();
                    a3.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + iVar3.f499b.c()).execute();
                    a3.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                G0.n nVar = (G0.n) obj;
                Iterator it = ((Iterable) ((H0.i) nVar.f430b).c(new r(3))).iterator();
                while (it.hasNext()) {
                    nVar.f431c.a((k) it.next(), 1, false);
                }
                return null;
        }
    }

    public void f(C1120h c1120h) {
        n s3 = F2.b.s(c1120h);
        Y1.k kVar = new Y1.k();
        kVar.f1686a = s3;
        kVar.f1687b = "";
        ((C0081e) this.f378b).a(kVar);
    }

    @Override // T1.c
    public void l(Object obj) {
        boolean z3 = false;
        if (obj != null) {
            try {
                z3 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e3) {
                Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e3);
            }
        }
        ((x) ((b) this.f378b).f378b).a(z3);
    }

    @Override // m0.InterfaceC1128p
    public void onPurchaseHistoryResponse(C1120h c1120h, List list) {
        List list2;
        n s3 = F2.b.s(c1120h);
        if (list == null) {
            list2 = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) it.next();
                Long valueOf = Long.valueOf(purchaseHistoryRecord.f2543c.optLong("purchaseTime"));
                String b3 = purchaseHistoryRecord.b();
                ArrayList a3 = purchaseHistoryRecord.a();
                String optString = purchaseHistoryRecord.f2543c.optString("developerPayload");
                Long valueOf2 = Long.valueOf(r5.optInt("quantity", 1));
                Y1.x xVar = new Y1.x();
                xVar.f1747a = valueOf2;
                xVar.f1748b = valueOf;
                xVar.f1749c = optString;
                String str = purchaseHistoryRecord.f2541a;
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"originalJson\" is null.");
                }
                xVar.f1750d = str;
                if (b3 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
                }
                xVar.f1751e = b3;
                String str2 = purchaseHistoryRecord.f2542b;
                if (str2 == null) {
                    throw new IllegalStateException("Nonnull field \"signature\" is null.");
                }
                xVar.f = str2;
                xVar.f1752g = a3;
                arrayList.add(xVar);
            }
            list2 = arrayList;
        }
        y yVar = new y();
        yVar.f1753a = s3;
        if (list2 == null) {
            throw new IllegalStateException("Nonnull field \"purchases\" is null.");
        }
        yVar.f1754b = list2;
        ((C0081e) this.f378b).a(yVar);
    }

    @Override // m0.InterfaceC1129q
    public void onQueryPurchasesResponse(C1120h c1120h, List list) {
        n s3 = F2.b.s(c1120h);
        List t3 = F2.b.t(list);
        A a3 = new A();
        a3.f1636a = s3;
        if (t3 == null) {
            throw new IllegalStateException("Nonnull field \"purchases\" is null.");
        }
        a3.f1637b = t3;
        ((C0081e) this.f378b).a(a3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public void onWaitFinished() {
        P5.a((P5) this.f378b);
    }

    @Override // com.startapp.sdk.internal.i2
    public void a(Bitmap bitmap, int i3) {
        ((ImageResourceConfig) this.f378b).a(bitmap, i3);
    }

    @Override // com.startapp.sdk.internal.zi
    public void a(List list, VASTErrorCodes vASTErrorCodes) {
        i8.a((i8) this.f378b, list, vASTErrorCodes);
    }

    @Override // b2.InterfaceC0166c
    public boolean a(View view) {
        for (Class cls : (Class[]) this.f378b) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }
}
