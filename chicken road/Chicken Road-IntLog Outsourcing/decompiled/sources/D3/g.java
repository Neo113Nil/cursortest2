package D3;

import B0.t;
import B4.k;
import E.C0028c;
import G0.C0060j;
import G0.InterfaceC0068s;
import G0.P;
import G0.r;
import H2.l;
import H2.m;
import H2.n;
import M2.B;
import M2.C;
import M2.C0101e;
import M2.C0102f;
import M2.C0103g;
import M2.C0104h;
import M2.C0108l;
import M2.E;
import M2.o;
import a1.C0178b;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import b0.InterfaceC0260a;
import b0.InterfaceC0261b;
import b1.C0273j;
import b1.C0274k;
import c0.C0305g;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.chickyneer.roadway.MainActivity;
import com.google.android.gms.tasks.Task;
import com.onesignal.core.internal.permissions.PermissionsViewModel;
import f2.D;
import f2.F;
import h2.C0482c;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import io.appmetrica.analytics.impl.C0786l2;
import io.appmetrica.analytics.impl.C0793l9;
import io.appmetrica.analytics.impl.C2;
import io.appmetrica.analytics.impl.E2;
import io.appmetrica.analytics.impl.P5;
import io.appmetrica.analytics.location.impl.u;
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
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import n2.AbstractC1341c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements H2.c, m, InterfaceC0068s, r, N1.d, d1.b, c1.g, I1.a, I1.c, H2.b, FunctionWithThrowable, ActivationBarrierCallback, InterfaceC0260a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f448b;

    public /* synthetic */ g(int i2, Object obj) {
        this.f447a = i2;
        this.f448b = obj;
    }

    @Override // b0.InterfaceC0260a
    public InterfaceC0261b a(X4.i iVar) {
        Context context = (Context) this.f448b;
        B3.d callback = (B3.d) iVar.f3573e;
        kotlin.jvm.internal.i.e(callback, "callback");
        String str = (String) iVar.f3572d;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new C0305g(context, str, callback, true, true);
    }

    @Override // c1.g, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        E2 a6;
        switch (this.f447a) {
            case 17:
                Cursor cursor = (Cursor) obj;
                c1.i iVar = (c1.i) this.f448b;
                iVar.getClass();
                while (cursor.moveToNext()) {
                    iVar.o(cursor.getInt(0), Y0.c.MESSAGE_TOO_OLD, cursor.getString(1));
                }
                return null;
            case C0793l9.f8684F /* 25 */:
                a6 = C2.a((C0786l2) this.f448b, (UsageStatsManager) obj);
                return a6;
            default:
                return u.a((u) this.f448b, (LocationManager) obj);
        }
    }

    @Override // H2.c
    public void b(Object obj) {
        boolean z = false;
        if (obj != null) {
            try {
                z = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e3) {
                Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e3);
            }
        }
        ((P) ((g) this.f448b).f448b).d(z);
    }

    @Override // H2.b
    public void c(Object obj, t tVar) {
        switch (this.f447a) {
            case 22:
                Pigeon.AppMetricaConfigConverterPigeon.lambda$setup$0((Pigeon.AppMetricaConfigConverterPigeon) this.f448b, obj, tVar);
                break;
            case 23:
                Pigeon.AppMetricaLibraryAdapterPigeon.lambda$setup$0((Pigeon.AppMetricaLibraryAdapterPigeon) this.f448b, obj, tVar);
                break;
            default:
                Pigeon.InitialDeepLinkHolderPigeon.lambda$setup$0((Pigeon.InitialDeepLinkHolderPigeon) this.f448b, obj, tVar);
                break;
        }
    }

    @Override // N1.d
    public Object d(B.d dVar) {
        return this.f448b;
    }

    public T0.c e(Object obj) {
        T0.b bVar = (T0.b) obj;
        T0.d dVar = (T0.d) this.f448b;
        URL url = bVar.f2769a;
        String s2 = AbstractC1341c.s("CctTransportBackend");
        if (Log.isLoggable(s2, 4)) {
            Log.i(s2, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) bVar.f2769a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(dVar.f2781g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = bVar.f2771c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    C0482c c0482c = dVar.f2775a;
                    U0.i iVar = bVar.f2770b;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    T1.d dVar2 = (T1.d) c0482c.f5783b;
                    T1.e eVar = new T1.e(bufferedWriter, dVar2.f2789a, dVar2.f2790b, dVar2.f2791c, dVar2.f2792d);
                    eVar.f(iVar);
                    eVar.h();
                    eVar.f2794b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String s4 = AbstractC1341c.s("CctTransportBackend");
                    if (Log.isLoggable(s4, 4)) {
                        Log.i(s4, String.format("Status Code: %d", valueOf));
                    }
                    AbstractC1341c.f("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC1341c.f("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new T0.c(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new T0.c(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            T0.c cVar = new T0.c(responseCode, null, U0.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f3141a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return cVar;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (R1.b e3) {
            e = e3;
            AbstractC1341c.h("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new T0.c(400, null, 0L);
        } catch (ConnectException e6) {
            e = e6;
            AbstractC1341c.h("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new T0.c(PermissionsViewModel.DELAY_TIME_CALLBACK_CALL, null, 0L);
        } catch (UnknownHostException e7) {
            e = e7;
            AbstractC1341c.h("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new T0.c(PermissionsViewModel.DELAY_TIME_CALLBACK_CALL, null, 0L);
        } catch (IOException e8) {
            e = e8;
            AbstractC1341c.h("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new T0.c(400, null, 0L);
        }
    }

    @Override // d1.b
    public Object execute() {
        SQLiteDatabase a6;
        Object obj = this.f448b;
        switch (this.f447a) {
            case 13:
                c1.i iVar = (c1.i) ((c1.c) obj);
                iVar.getClass();
                int i2 = Y0.a.f3661e;
                B0.i iVar2 = new B0.i(4);
                iVar2.f153b = null;
                iVar2.f154c = new ArrayList();
                iVar2.f155d = null;
                iVar2.f156e = "";
                HashMap hashMap = new HashMap();
                a6 = iVar.a();
                a6.beginTransaction();
                try {
                    Y0.a aVar = (Y0.a) c1.i.y(a6.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C0178b(iVar, hashMap, iVar2, 3));
                    a6.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 14:
                c1.i iVar3 = (c1.i) ((c1.d) obj);
                long e3 = iVar3.f4909b.e() - iVar3.f4911d.f4897d;
                a6 = iVar3.a();
                a6.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(e3)};
                    c1.i.y(a6.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new g(17, iVar3));
                    int delete = a6.delete("events", "timestamp_ms < ?", strArr);
                    a6.setTransactionSuccessful();
                    a6.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 15:
                c1.i iVar4 = (c1.i) ((C0273j) obj).f4795i;
                a6 = iVar4.a();
                a6.beginTransaction();
                try {
                    a6.compileStatement("DELETE FROM log_event_dropped").execute();
                    a6.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + iVar4.f4909b.e()).execute();
                    a6.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                C0274k c0274k = (C0274k) obj;
                Iterator it = ((Iterable) ((c1.i) c0274k.f4797b).c(new C0028c(20))).iterator();
                while (it.hasNext()) {
                    c0274k.f4798c.a((V0.i) it.next(), 1, false);
                }
                return null;
        }
    }

    public void f(C0060j c0060j) {
        ((C0104h) this.f448b).a(AbstractC1341c.j(c0060j));
    }

    public void g(C0060j c0060j) {
        M2.r j2 = AbstractC1341c.j(c0060j);
        C0108l c0108l = new C0108l();
        c0108l.f1880a = j2;
        c0108l.f1881b = "";
        ((C0101e) this.f448b).a(c0108l);
    }

    public void h(C0060j c0060j) {
        M2.r j2 = AbstractC1341c.j(c0060j);
        o oVar = new o();
        oVar.f1886a = j2;
        oVar.f1887b = "";
        ((C0103g) this.f448b).a(oVar);
    }

    @Override // I1.a
    public Object j(Task task) {
        Object obj;
        ((M0.e) this.f448b).getClass();
        I1.o oVar = (I1.o) task;
        synchronized (oVar.f1263a) {
            o1.u.i("Task is not yet complete", oVar.f1265c);
            if (oVar.f1266d) {
                throw new CancellationException("Task is already canceled.");
            }
            if (IOException.class.isInstance(oVar.f1268f)) {
                throw ((Throwable) IOException.class.cast(oVar.f1268f));
            }
            Exception exc = oVar.f1268f;
            if (exc != null) {
                throw new I1.f(exc);
            }
            obj = oVar.f1267e;
        }
        Bundle bundle = (Bundle) obj;
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null || (string = bundle.getString("unregistered")) != null) {
            return string;
        }
        String string2 = bundle.getString("error");
        if ("RST".equals(string2)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string2 != null) {
            throw new IOException(string2);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    @Override // I1.c
    public void onComplete(Task task) {
        switch (this.f447a) {
            case C0793l9.f8681C /* 19 */:
                D.b((Intent) this.f448b);
                break;
            case C0793l9.f8682D /* 20 */:
                ((F) this.f448b).f5571b.d(null);
                break;
            default:
                ((ScheduledFuture) this.f448b).cancel(false);
                break;
        }
    }

    @Override // H2.m
    public void onMethodCall(l call, n nVar) {
        int i2 = MainActivity.f4947f;
        kotlin.jvm.internal.i.e(call, "call");
        if (!kotlin.jvm.internal.i.a(call.f1146a, "present")) {
            ((G2.i) nVar).a();
            return;
        }
        String str = (String) call.a("uri");
        if (str == null || k.Z(str)) {
            ((G2.i) nVar).b("invalid_uri", "uri required", null);
        } else {
            MainActivity mainActivity = (MainActivity) this.f448b;
            mainActivity.runOnUiThread(new J0.a(mainActivity, str, (G2.i) nVar, 0));
        }
    }

    @Override // G0.r
    public void onPurchaseHistoryResponse(C0060j c0060j, List list) {
        List list2;
        M2.r j2 = AbstractC1341c.j(c0060j);
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) it.next();
                Long valueOf = Long.valueOf(purchaseHistoryRecord.f4946c.optLong("purchaseTime"));
                String b6 = purchaseHistoryRecord.b();
                ArrayList a6 = purchaseHistoryRecord.a();
                String optString = purchaseHistoryRecord.f4946c.optString("developerPayload");
                Long valueOf2 = Long.valueOf(r5.optInt("quantity", 1));
                B b7 = new B();
                b7.f1806a = valueOf2;
                b7.f1807b = valueOf;
                b7.f1808c = optString;
                String str = purchaseHistoryRecord.f4944a;
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"originalJson\" is null.");
                }
                b7.f1809d = str;
                if (b6 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
                }
                b7.f1810e = b6;
                String str2 = purchaseHistoryRecord.f4945b;
                if (str2 == null) {
                    throw new IllegalStateException("Nonnull field \"signature\" is null.");
                }
                b7.f1811f = str2;
                b7.f1812g = a6;
                arrayList.add(b7);
            }
            list2 = arrayList;
        }
        C c2 = new C();
        c2.f1813a = j2;
        if (list2 == null) {
            throw new IllegalStateException("Nonnull field \"purchases\" is null.");
        }
        c2.f1814b = list2;
        ((C0102f) this.f448b).a(c2);
    }

    @Override // G0.InterfaceC0068s
    public void onQueryPurchasesResponse(C0060j c0060j, List list) {
        M2.r j2 = AbstractC1341c.j(c0060j);
        List l2 = AbstractC1341c.l(list);
        E e3 = new E();
        e3.f1820a = j2;
        if (l2 == null) {
            throw new IllegalStateException("Nonnull field \"purchases\" is null.");
        }
        e3.f1821b = l2;
        ((C0101e) this.f448b).a(e3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public void onWaitFinished() {
        P5.a((P5) this.f448b);
    }
}
