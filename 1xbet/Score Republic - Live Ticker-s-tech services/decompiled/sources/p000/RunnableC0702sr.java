package p000;

import android.app.Activity;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.google.firebase.inappmessaging.model.MessageType;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: sr */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0702sr implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7193j;

    /* JADX INFO: renamed from: k */
    public Object f7194k;

    /* JADX INFO: renamed from: l */
    public Object f7195l;

    /* JADX INFO: renamed from: m */
    public Object f7196m;

    public RunnableC0702sr(v42 v42Var, AtomicReference atomicReference, z72 z72Var) {
        this.f7193j = 14;
        this.f7195l = atomicReference;
        this.f7194k = z72Var;
        Objects.requireNonNull(v42Var);
        this.f7196m = v42Var;
    }

    /* JADX INFO: renamed from: a */
    private final void m4579a() {
        int i;
        v92 v92VarM2008e;
        C0914yh c0914yh = (C0914yh) this.f7194k;
        Intent intent = c0914yh.f9303j;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        if (TextUtils.isEmpty(stringExtra)) {
            v92VarM2008e = hn0.m2316j(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = c0914yh.f9303j;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = c0914yh.f9303j;
            Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
            if (numValueOf != null) {
                bundle.putInt("google.product_id", numValueOf.intValue());
            }
            Context context = (Context) this.f7195l;
            bundle.putBoolean("supports_message_handled", true);
            g92 g92VarM2004d = g92.m2004d(context);
            synchronized (g92VarM2004d) {
                i = g92VarM2004d.f2671j;
                g92VarM2004d.f2671j = i + 1;
            }
            v92VarM2008e = g92VarM2004d.m2008e(new a82(i, 2, bundle, 0));
        }
        v92VarM2008e.m5125a(iw1.f3684k, new jg0(24, (CountDownLatch) this.f7196m));
    }

    /* JADX INFO: renamed from: b */
    private final void m4580b() {
        eu1 eu1Var;
        fu1 fu1Var = (fu1) this.f7195l;
        z72 z72Var = (z72) this.f7194k;
        b12 b12Var = (b12) this.f7196m;
        b12Var.getClass();
        x62 x62Var = b12Var.f681b;
        if ("_cmp".equals(fu1Var.f2501j) && (eu1Var = fu1Var.f2502k) != null) {
            Bundle bundle = eu1Var.f2185j;
            if (bundle.size() != 0) {
                String string = bundle.getString("_cis");
                if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                    x62Var.mo1563b().f4606u.m5313b(fu1Var.toString(), "Event has been filtered ");
                    fu1Var = new fu1("_cmpx", eu1Var, fu1Var.f2503l, fu1Var.f2504m, fu1Var.f2505n);
                }
            }
        }
        String str = fu1Var.f2501j;
        sz1 sz1Var = x62Var.f8821j;
        a72 a72Var = x62Var.f8827p;
        x62.m5533U(sz1Var);
        String str2 = z72Var.f9655j;
        su1 su1Var = TextUtils.isEmpty(str2) ? null : (su1) sz1Var.f7241t.m4362b(str2);
        if (su1Var == null) {
            x62Var.mo1563b().f4608w.m5313b(z72Var.f9655j, "EES not loaded for");
            x62Var.m5550W();
            x62Var.m5567j(fu1Var, z72Var);
            return;
        }
        try {
            oq0 oq0Var = su1Var.f7215c;
            x62.m5533U(a72Var);
            HashMap mapM61o0 = a72.m61o0(fu1Var.f2502k.m1507e(), true);
            String strM5656r = AbstractC0875xf.m5656r(str, zg1.f9767m, zg1.f9762h);
            if (strM5656r == null) {
                strM5656r = str;
            }
            if (su1Var.m4595a(new pm1(strM5656r, fu1Var.f2504m, mapM61o0))) {
                if (((pm1) oq0Var.f5841l).equals((pm1) oq0Var.f5840k)) {
                    x62Var.m5550W();
                    x62Var.m5567j(fu1Var, z72Var);
                } else {
                    x62Var.mo1563b().f4608w.m5313b(str, "EES edited event");
                    x62.m5533U(a72Var);
                    fu1 fu1VarM40E = a72.m40E((pm1) oq0Var.f5841l);
                    x62Var.m5550W();
                    x62Var.m5567j(fu1VarM40E, z72Var);
                }
                if (((ArrayList) oq0Var.f5842m).isEmpty()) {
                    return;
                }
                ArrayList arrayList = (ArrayList) oq0Var.f5842m;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    pm1 pm1Var = (pm1) obj;
                    x62Var.mo1563b().f4608w.m5313b(pm1Var.f6212a, "EES logging created event");
                    x62.m5533U(a72Var);
                    fu1 fu1VarM40E2 = a72.m40E(pm1Var);
                    x62Var.m5550W();
                    x62Var.m5567j(fu1VarM40E2, z72Var);
                }
                return;
            }
        } catch (pv1 unused) {
            x62Var.mo1563b().f4600o.m5314c(z72Var.f9656k, str, "EES error. appId, eventName");
        }
        x62Var.mo1563b().f4608w.m5313b(str, "EES was not applied to event");
        x62Var.m5550W();
        x62Var.m5567j(fu1Var, z72Var);
    }

    /* JADX INFO: renamed from: c */
    private final void m4581c() {
        x62 x62Var = ((b12) this.f7196m).f681b;
        x62Var.m5550W();
        b72 b72Var = (b72) this.f7195l;
        Object objM600b = b72Var.m600b();
        z72 z72Var = (z72) this.f7194k;
        if (objM600b == null) {
            x62Var.m5552Y(b72Var.f749k, z72Var);
        } else {
            x62Var.m5551X(b72Var, z72Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x012d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0133  */
    /* JADX WARN: Code duplicated, block: B:44:0x0144  */
    /* JADX WARN: Code duplicated, block: B:46:0x014a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0150  */
    /* JADX WARN: Code duplicated, block: B:51:0x0172  */
    /* JADX WARN: Code duplicated, block: B:54:0x01c6 A[Catch: SQLiteException -> 0x01d1, TRY_LEAVE, TryCatch #8 {SQLiteException -> 0x01d1, blocks: (B:52:0x01a7, B:54:0x01c6), top: B:83:0x01a7 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:63:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:65:0x0202  */
    /* JADX WARN: Code duplicated, block: B:66:0x020b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0255  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    private final void m4582d() throws Throwable {
        int i;
        long j;
        int i2;
        Cursor cursorQuery;
        z62 z62Var;
        String str;
        int i3;
        x62 x62Var;
        w62 w62Var;
        x62 x62Var2;
        qt1 qt1Var;
        Long lValueOf;
        ContentValues contentValues;
        ky1 ky1Var;
        b12 b12Var = (b12) this.f7195l;
        z72 z72Var = (z72) this.f7194k;
        vp1 vp1Var = (vp1) this.f7196m;
        x62 x62Var3 = b12Var.f681b;
        x62Var3.m5550W();
        String str2 = z72Var.f9655j;
        p80.m3863h(str2);
        HashMap map = x62Var3.f8815N;
        x62Var3.mo1564c().mo11z();
        x62Var3.m5574m0();
        qt1 qt1Var2 = x62Var3.f8823l;
        x62.m5533U(qt1Var2);
        long j2 = vp1Var.f8247j;
        long j3 = vp1Var.f8249l;
        qt1Var2.mo11z();
        qt1Var2.m2988B();
        Cursor cursor = null;
        z62VarM4179d0 = null;
        z62 z62VarM4179d0 = null;
        try {
            cursorQuery = qt1Var2.m4191r0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j2)}, null, null, null, "1");
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(1);
                        p80.m3863h(string);
                        j = j3;
                        try {
                            try {
                                try {
                                    x62Var3 = x62Var3;
                                    i2 = 1;
                                    cursorQuery = cursorQuery;
                                    i = 4;
                                    j = j;
                                    try {
                                        z62VarM4179d0 = qt1Var2.m4179d0(string, j2, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                                        cursorQuery.close();
                                    } catch (SQLiteException e) {
                                        e = e;
                                        cursorQuery = cursorQuery;
                                        try {
                                            ky1 ky1Var2 = ((f02) qt1Var2.f7192j).f2247o;
                                            f02.m1560m(ky1Var2);
                                            ky1Var2.f4600o.m5314c(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            cursor = cursorQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor = cursorQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    i2 = 1;
                                    i = 4;
                                    cursorQuery = cursorQuery;
                                    ky1 ky1Var3 = ((f02) qt1Var2.f7192j).f2247o;
                                    f02.m1560m(ky1Var3);
                                    ky1Var3.f4600o.m5314c(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    z62Var = z62VarM4179d0;
                                    if (z62Var == null) {
                                        x62Var3.mo1563b().f4603r.m5314c(str2, Long.valueOf(j2), "[sgtm] Queued batch doesn't exist. appId, rowId");
                                        return;
                                    }
                                    str = z62Var.f9616c;
                                    i3 = vp1Var.f8248k;
                                    if (i3 == i2) {
                                        x62Var = x62Var3;
                                        if (i3 == 3) {
                                            w62Var = (w62) map.get(str);
                                            if (w62Var == null) {
                                                w62Var = new w62(x62Var);
                                                map.put(str, w62Var);
                                            } else {
                                                w62Var.f8446b += i2;
                                                w62Var.f8447c = w62Var.m5290a();
                                            }
                                            x62Var.mo1567f().getClass();
                                            x62Var.mo1563b().f4608w.m5315d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str2, str, Long.valueOf((w62Var.f8447c - System.currentTimeMillis()) / 1000));
                                        }
                                        qt1 qt1Var3 = x62Var.f8823l;
                                        x62.m5533U(qt1Var3);
                                        Long lValueOf2 = Long.valueOf(vp1Var.f8247j);
                                        qt1Var3.m4162M(lValueOf2);
                                        x62Var.mo1563b().f4608w.m5314c(str2, lValueOf2, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                                        return;
                                    }
                                    if (map.containsKey(str)) {
                                        map.remove(str);
                                    }
                                    x62Var2 = x62Var3;
                                    qt1 qt1Var4 = x62Var2.f8823l;
                                    x62.m5533U(qt1Var4);
                                    Long lValueOf3 = Long.valueOf(j2);
                                    qt1Var4.m4154H(lValueOf3);
                                    x62Var2.mo1563b().f4608w.m5314c(str2, lValueOf3, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                                    if (j > 0) {
                                        qt1Var = x62Var2.f8823l;
                                        x62.m5533U(qt1Var);
                                        f02 f02Var = (f02) qt1Var.f7192j;
                                        qt1Var.mo11z();
                                        qt1Var.m2988B();
                                        lValueOf = Long.valueOf(j);
                                        contentValues = new ContentValues();
                                        contentValues.put("upload_type", Integer.valueOf(i2));
                                        wa0 wa0Var = f02Var.f2252t;
                                        ky1Var = f02Var.f2247o;
                                        wa0Var.getClass();
                                        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                                        try {
                                            if (qt1Var.m4191r0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str2, String.valueOf(i)}) != 1) {
                                                f02.m1560m(ky1Var);
                                                ky1Var.f4603r.m5314c(str2, lValueOf, "Google Signal pending batch not updated. appId, rowId");
                                            }
                                            x62Var2.mo1563b().f4608w.m5314c(str2, Long.valueOf(j), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                                            x62Var2.m5586t(str2);
                                        } catch (SQLiteException e3) {
                                            f02.m1560m(ky1Var);
                                            ky1Var.f4600o.m5315d("Failed to update google Signal pending batch. appid, rowId", str2, Long.valueOf(j), e3);
                                            throw e3;
                                        }
                                    }
                                }
                            } catch (SQLiteException e4) {
                                e = e4;
                                i2 = 1;
                            }
                        } catch (SQLiteException e5) {
                            e = e5;
                            x62Var3 = x62Var3;
                            i = 4;
                            i2 = 1;
                            cursorQuery = cursorQuery;
                            j = j;
                        }
                    } else {
                        x62Var3 = x62Var3;
                        i = 4;
                        j = j3;
                        i2 = 1;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    x62Var3 = x62Var3;
                    i = 4;
                    j = j3;
                    i2 = 1;
                    cursorQuery = cursorQuery;
                }
            } catch (Throwable th3) {
                th = th3;
                cursorQuery = cursorQuery;
            }
        } catch (SQLiteException e7) {
            e = e7;
            x62Var3 = x62Var3;
            i = 4;
            j = j3;
            i2 = 1;
            cursorQuery = null;
        } catch (Throwable th4) {
            th = th4;
        }
        z62Var = z62VarM4179d0;
        if (z62Var == null) {
            x62Var3.mo1563b().f4603r.m5314c(str2, Long.valueOf(j2), "[sgtm] Queued batch doesn't exist. appId, rowId");
            return;
        }
        str = z62Var.f9616c;
        i3 = vp1Var.f8248k;
        if (i3 == i2) {
            x62Var = x62Var3;
            if (i3 == 3) {
                w62Var = (w62) map.get(str);
                if (w62Var == null) {
                    w62Var = new w62(x62Var);
                    map.put(str, w62Var);
                } else {
                    w62Var.f8446b += i2;
                    w62Var.f8447c = w62Var.m5290a();
                }
                x62Var.mo1567f().getClass();
                x62Var.mo1563b().f4608w.m5315d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str2, str, Long.valueOf((w62Var.f8447c - System.currentTimeMillis()) / 1000));
            }
            qt1 qt1Var5 = x62Var.f8823l;
            x62.m5533U(qt1Var5);
            Long lValueOf4 = Long.valueOf(vp1Var.f8247j);
            qt1Var5.m4162M(lValueOf4);
            x62Var.mo1563b().f4608w.m5314c(str2, lValueOf4, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
            return;
        }
        if (map.containsKey(str)) {
            map.remove(str);
        }
        x62Var2 = x62Var3;
        qt1 qt1Var6 = x62Var2.f8823l;
        x62.m5533U(qt1Var6);
        Long lValueOf5 = Long.valueOf(j2);
        qt1Var6.m4154H(lValueOf5);
        x62Var2.mo1563b().f4608w.m5314c(str2, lValueOf5, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
        if (j > 0) {
            qt1Var = x62Var2.f8823l;
            x62.m5533U(qt1Var);
            f02 f02Var2 = (f02) qt1Var.f7192j;
            qt1Var.mo11z();
            qt1Var.m2988B();
            lValueOf = Long.valueOf(j);
            contentValues = new ContentValues();
            contentValues.put("upload_type", Integer.valueOf(i2));
            wa0 wa0Var2 = f02Var2.f2252t;
            ky1Var = f02Var2.f2247o;
            wa0Var2.getClass();
            contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
            if (qt1Var.m4191r0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str2, String.valueOf(i)}) != 1) {
                f02.m1560m(ky1Var);
                ky1Var.f4603r.m5314c(str2, lValueOf, "Google Signal pending batch not updated. appId, rowId");
            }
            x62Var2.mo1563b().f4608w.m5314c(str2, Long.valueOf(j), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
            x62Var2.m5586t(str2);
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m4583e() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = (AtomicReference) this.f7195l;
        synchronized (atomicReference2) {
            try {
                try {
                    v42 v42Var = (v42) this.f7196m;
                    f02 f02Var = (f02) v42Var.f7192j;
                    fz1 fz1Var = f02Var.f2246n;
                    f02.m1558k(fz1Var);
                    if (fz1Var.m1911H().m3157i(k12.f4250l)) {
                        nx1 nx1Var = v42Var.f8065m;
                        if (nx1Var != null) {
                            atomicReference2.set(nx1Var.mo571l((z72) this.f7194k));
                            String str = (String) atomicReference2.get();
                            if (str != null) {
                                v22 v22Var = ((f02) v42Var.f7192j).f2254v;
                                f02.m1559l(v22Var);
                                v22Var.f8014p.set(str);
                                fz1 fz1Var2 = f02Var.f2246n;
                                f02.m1558k(fz1Var2);
                                fz1Var2.f2553p.m5182m(str);
                            }
                            v42Var.m5066N();
                            atomicReference = (AtomicReference) this.f7195l;
                            atomicReference.notify();
                            return;
                        }
                        ky1 ky1Var = f02Var.f2247o;
                        f02.m1560m(ky1Var);
                        ky1Var.f4600o.m5312a("Failed to get app instance id");
                    } else {
                        ky1 ky1Var2 = f02Var.f2247o;
                        f02.m1560m(ky1Var2);
                        ky1Var2.f4605t.m5312a("Analytics storage consent denied; will not get app instance id");
                        v22 v22Var2 = ((f02) v42Var.f7192j).f2254v;
                        f02.m1559l(v22Var2);
                        v22Var2.f8014p.set(null);
                        fz1 fz1Var3 = f02Var.f2246n;
                        f02.m1558k(fz1Var3);
                        fz1Var3.f2553p.m5182m(null);
                        atomicReference2.set(null);
                    }
                    atomicReference2.notify();
                } catch (RemoteException e) {
                    ky1 ky1Var3 = ((f02) ((v42) this.f7196m).f7192j).f2247o;
                    f02.m1560m(ky1Var3);
                    ky1Var3.f4600o.m5313b(e, "Failed to get app instance id");
                    atomicReference = (AtomicReference) this.f7195l;
                }
            } catch (Throwable th) {
                ((AtomicReference) this.f7195l).notify();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m4584f() {
        f72 f72Var;
        gv1 gv1Var = (gv1) this.f7194k;
        v42 v42Var = (v42) this.f7196m;
        String strMo571l = null;
        try {
            try {
                f02 f02Var = (f02) v42Var.f7192j;
                fz1 fz1Var = f02Var.f2246n;
                ky1 ky1Var = f02Var.f2247o;
                f02.m1558k(fz1Var);
                if (fz1Var.m1911H().m3157i(k12.f4250l)) {
                    nx1 nx1Var = v42Var.f8065m;
                    if (nx1Var != null) {
                        strMo571l = nx1Var.mo571l((z72) this.f7195l);
                        if (strMo571l != null) {
                            v22 v22Var = f02Var.f2254v;
                            f02.m1559l(v22Var);
                            v22Var.f8014p.set(strMo571l);
                            f02.m1558k(fz1Var);
                            fz1Var.f2553p.m5182m(strMo571l);
                        }
                        v42Var.m5066N();
                        f72Var = ((f02) v42Var.f7192j).f2250r;
                        f02.m1558k(f72Var);
                        f72Var.m1733o0(strMo571l, gv1Var);
                    }
                    f02.m1560m(ky1Var);
                    ky1Var.f4600o.m5312a("Failed to get app instance id");
                } else {
                    f02.m1560m(ky1Var);
                    ky1Var.f4605t.m5312a("Analytics storage consent denied; will not get app instance id");
                    v22 v22Var2 = f02Var.f2254v;
                    f02.m1559l(v22Var2);
                    v22Var2.f8014p.set(null);
                    f02.m1558k(fz1Var);
                    fz1Var.f2553p.m5182m(null);
                }
                f72Var = f02Var.f2250r;
            } catch (RemoteException e) {
                ky1 ky1Var2 = ((f02) v42Var.f7192j).f2247o;
                f02.m1560m(ky1Var2);
                ky1Var2.f4600o.m5313b(e, "Failed to get app instance id");
            }
            f02.m1558k(f72Var);
            f72Var.m1733o0(strMo571l, gv1Var);
        } catch (Throwable th) {
            f72 f72Var2 = ((f02) v42Var.f7192j).f2250r;
            f02.m1558k(f72Var2);
            f72Var2.m1733o0(null, gv1Var);
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m4585g() {
        v42 v42Var = (v42) this.f7195l;
        z72 z72Var = (z72) this.f7194k;
        vp1 vp1Var = (vp1) this.f7196m;
        f02 f02Var = (f02) v42Var.f7192j;
        nx1 nx1Var = v42Var.f8065m;
        if (nx1Var == null) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5312a("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            nx1Var.mo581x(z72Var, vp1Var);
            v42Var.m5066N();
        } catch (RemoteException e) {
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4600o.m5314c(Long.valueOf(vp1Var.f8247j), e, "[sgtm] Failed to update batch upload status, rowId, exception");
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m4586h() {
        c32 c32Var = (c32) this.f7195l;
        ky1 ky1Var = (ky1) this.f7194k;
        JobParameters jobParameters = (JobParameters) this.f7196m;
        ky1Var.f4608w.m5312a("AppMeasurementJobService processed last upload request.");
        ((b52) ((Service) c32Var.f1083k)).mo595c(jobParameters);
    }

    /* JADX INFO: renamed from: i */
    private final /* synthetic */ void m4587i() {
        C0902y5 c0902y5 = (C0902y5) this.f7195l;
        g71 g71Var = (g71) this.f7194k;
        l92 l92Var = (l92) this.f7196m;
        try {
            Object objM2991b = k70.m2991b(g71Var);
            g71 g71Var2 = (g71) c0902y5.f9159f;
            g71Var2.m2177l(objM2991b);
            l92Var.m2179n(g71Var2);
        } catch (Throwable unused) {
            l92Var.m2179n(g71Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.ArrayList] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        cc0 cc0VarMo1147a;
        View.OnClickListener z00Var;
        ot0 ot0Var;
        nt0 nt0Var;
        Socket socketM3768f;
        nc0 nc0Var;
        double d;
        int i;
        SSLSession session = null;
        Object objCall = null;
        ?? r5 = 0;
        int i2 = 0;
        switch (this.f7193j) {
            case 0:
                ((fl0) this.f7196m).f2437j.mo273o((d71) this.f7195l, (np0) this.f7194k);
                return;
            case 1:
                ((C0850wr) this.f7196m).f8645e.mo1120i((ja1) this.f7195l, (np0) this.f7194k);
                return;
            case 2:
                d10 d10Var = (d10) this.f7196m;
                Activity activity = (Activity) this.f7195l;
                AbstractC0057bc abstractC0057bc = (AbstractC0057bc) this.f7194k;
                if (d10Var.f1516s == null) {
                    return;
                }
                y00 y00Var = new y00(d10Var, activity);
                HashMap map = new HashMap();
                zc0 zc0Var = d10Var.f1516s;
                ?? arrayList = new ArrayList();
                int i3 = c10.f1065a[zc0Var.f9732a.ordinal()];
                if (i3 == 1) {
                    arrayList.add(((C0132db) zc0Var).f1607f);
                } else if (i3 == 2) {
                    arrayList.add(((dq0) zc0Var).f1796f);
                } else if (i3 == 3) {
                    arrayList.add(((gc0) zc0Var).f2693d);
                } else if (i3 != 4) {
                    arrayList.add(new C0047b2(null, null));
                } else {
                    C0247gf c0247gf = (C0247gf) zc0Var;
                    arrayList.add(c0247gf.f2716f);
                    arrayList.add(c0247gf.f2717g);
                }
                int size = arrayList.size();
                while (r5 < size) {
                    Object obj = arrayList.get(r5);
                    int i4 = r5 + 1;
                    C0047b2 c0047b2 = (C0047b2) obj;
                    if (c0047b2 == null || TextUtils.isEmpty(c0047b2.f684a)) {
                        m80.m3347n("No action url found for action. Treating as dismiss.");
                        z00Var = y00Var;
                    } else {
                        z00Var = new z00(d10Var, c0047b2, activity);
                    }
                    map.put(c0047b2, z00Var);
                    r5 = i4;
                }
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListenerMo633e = abstractC0057bc.mo633e(map, y00Var);
                if (onGlobalLayoutListenerMo633e != null) {
                    abstractC0057bc.mo631c().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListenerMo633e);
                }
                zc0 zc0Var2 = d10Var.f1516s;
                if (zc0Var2.f9732a == MessageType.CARD) {
                    C0247gf c0247gf2 = (C0247gf) zc0Var2;
                    cc0VarMo1147a = c0247gf2.f2718h;
                    cc0 cc0Var = c0247gf2.f2719i;
                    if (d10Var.f1514q.getResources().getConfiguration().orientation != 1 ? !(cc0Var == null || TextUtils.isEmpty(cc0Var.f1215a)) : !(cc0VarMo1147a != null && !TextUtils.isEmpty(cc0VarMo1147a.f1215a))) {
                        cc0VarMo1147a = cc0Var;
                    }
                } else {
                    cc0VarMo1147a = zc0Var2.mo1147a();
                }
                b10 b10Var = new b10(d10Var, abstractC0057bc, activity, onGlobalLayoutListenerMo633e);
                if (cc0VarMo1147a == null || TextUtils.isEmpty(cc0VarMo1147a.f1215a)) {
                    b10Var.m554g();
                    return;
                }
                C0784uz c0784uz = d10Var.f1509l;
                String str = cc0VarMo1147a.f1215a;
                c0784uz.getClass();
                m80.m3343j("Starting Downloading Image : " + str);
                eh0 eh0Var = new eh0();
                fh0 fh0Var = new fh0("image/*");
                HashMap map2 = new HashMap(eh0Var.f2093a.size());
                for (Map.Entry entry : eh0Var.f2093a.entrySet()) {
                    map2.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
                }
                eh0Var.f2093a = map2;
                List arrayList2 = (List) eh0Var.f2093a.get("Accept");
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    eh0Var.f2093a.put("Accept", arrayList2);
                }
                arrayList2.add(fh0Var);
                z80 z80Var = new z80(str, new gh0(eh0Var.f2093a));
                n11 n11Var = c0784uz.f7970a;
                n11Var.getClass();
                i11 i11VarM2521v = new i11(n11Var.f5240j, n11Var, Drawable.class, n11Var.f5241k).m2521v(z80Var);
                i11VarM2521v.getClass();
                i11 i11Var = (i11) i11VarM2521v.m4294k(C0742tu.f7590f).m4294k(k80.f4299a);
                qd0 qd0Var = new qd0(c0784uz, i11Var);
                i11Var.m2516q(new r80(d10Var.f1516s, d10Var.f1517t));
                qd0Var.f6472l = activity.getClass().getSimpleName();
                qd0Var.m4074h();
                i11Var.m4291h();
                m80.m3343j("Downloading Image Placeholder : 2131165307");
                ImageView imageViewMo631c = abstractC0057bc.mo631c();
                m80.m3343j("Downloading Image Callback : " + b10Var);
                b10Var.f670m = imageViewMo631c;
                i11Var.m2520u(b10Var);
                qd0Var.f6471k = b10Var;
                qd0Var.m4074h();
                return;
            case 3:
                EnumC0474ml enumC0474ml = (EnumC0474ml) this.f7194k;
                kj0 kj0Var = (kj0) this.f7195l;
                cl0 cl0Var = (cl0) this.f7196m;
                jl0 jl0Var = cl0Var.f1286i;
                if (cl0Var != jl0Var.f4023x) {
                    return;
                }
                jl0Var.f4024y = kj0Var;
                jl0Var.f3976E.m6029g(kj0Var);
                if (enumC0474ml != EnumC0474ml.f5075n) {
                    cl0Var.f1286i.f3985N.mo5320h(2, "Entering {0} state with picker: {1}", enumC0474ml, kj0Var);
                    cl0Var.f1286i.f4017r.m3881d(enumC0474ml);
                    return;
                }
                return;
            case 4:
                try {
                    ((CountDownLatch) this.f7195l).await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                g01 g01Var = new g01(new mt0());
                try {
                    try {
                        ot0 ot0Var2 = (ot0) this.f7196m;
                        rb0 rb0Var = ot0Var2.f5883N;
                        if (rb0Var == null) {
                            socketM3768f = ot0Var2.f5870A.createSocket(ot0Var2.f5885a.getAddress(), ((ot0) this.f7196m).f5885a.getPort());
                        } else {
                            SocketAddress socketAddress = rb0Var.f6795j;
                            if (!(socketAddress instanceof InetSocketAddress)) {
                                throw new ka1(ja1.f3882l.m2840h("Unsupported SocketAddress implementation " + ((ot0) this.f7196m).f5883N.f6795j.getClass()));
                            }
                            socketM3768f = ot0.m3768f(ot0Var2, rb0Var.f6796k, (InetSocketAddress) socketAddress, rb0Var.f6797l, rb0Var.f6798m);
                        }
                        ot0 ot0Var3 = (ot0) this.f7196m;
                        SSLSocketFactory sSLSocketFactory = ot0Var3.f5871B;
                        Socket socket = socketM3768f;
                        if (sSLSocketFactory != null) {
                            String host = ot0Var3.f5886b;
                            URI uriM906a = ca0.m906a(host);
                            if (uriM906a.getHost() != null) {
                                host = uriM906a.getHost();
                            }
                            SSLSocket sSLSocketM4954a = ut0.m4954a(sSLSocketFactory, socketM3768f, host, ((ot0) this.f7196m).m3776j(), ((ot0) this.f7196m).f5874E);
                            session = sSLSocketM4954a.getSession();
                            socket = sSLSocketM4954a;
                        }
                        socket.setTcpNoDelay(true);
                        int i5 = wt0.f8666a;
                        z81 z81Var = new z81(socket);
                        InputStream inputStream = socket.getInputStream();
                        inputStream.getClass();
                        g01 g01Var2 = new g01(new C0609q8(z81Var, new C0609q8(inputStream, z81Var)));
                        try {
                            C0535o8 c0535o8 = (C0535o8) this.f7194k;
                            z81 z81Var2 = new z81(socket);
                            OutputStream outputStream = socket.getOutputStream();
                            outputStream.getClass();
                            c0535o8.m3639a(new C0572p8(z81Var2, new C0572p8(outputStream, z81Var2)), socket);
                            ot0 ot0Var4 = (ot0) this.f7196m;
                            C0831w8 c0831w8 = ot0Var4.f5905u;
                            c0831w8.getClass();
                            C0312i6 c0312i6 = new C0312i6(11, c0831w8);
                            c0312i6.m2553y(zg1.f9759e, socket.getRemoteSocketAddress());
                            c0312i6.m2553y(zg1.f9760f, socket.getLocalSocketAddress());
                            c0312i6.m2553y(zg1.f9761g, session);
                            c0312i6.m2553y(AbstractC0875xf.f8941c, session == null ? e61.f1970j : e61.f1971k);
                            ot0Var4.f5905u = c0312i6.m2540i();
                            ot0 ot0Var5 = (ot0) this.f7196m;
                            ot0Var5.f5891g.getClass();
                            ot0Var5.f5904t = new nt0(ot0Var5, new mb0(g01Var2));
                            synchronized (((ot0) this.f7196m).f5895k) {
                                if (session != null) {
                                    try {
                                        new u90(session);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                break;
                            }
                            return;
                        } catch (ka1 e) {
                            e = e;
                            g01Var = g01Var2;
                            ((ot0) this.f7196m).m3783r(0, EnumC0227fx.f2516m, e.f4331j);
                            ot0Var = (ot0) this.f7196m;
                            ot0Var.f5891g.getClass();
                            nt0Var = new nt0(ot0Var, new mb0(g01Var));
                            ot0Var.f5904t = nt0Var;
                            return;
                        } catch (Exception e2) {
                            e = e2;
                            g01Var = g01Var2;
                            ((ot0) this.f7196m).m3780n(e);
                            ot0Var = (ot0) this.f7196m;
                            ot0Var.f5891g.getClass();
                            nt0Var = new nt0(ot0Var, new mb0(g01Var));
                            ot0Var.f5904t = nt0Var;
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            g01Var = g01Var2;
                            ot0 ot0Var6 = (ot0) this.f7196m;
                            ot0Var6.f5891g.getClass();
                            ot0Var6.f5904t = new nt0(ot0Var6, new mb0(g01Var));
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (ka1 e3) {
                    e = e3;
                } catch (Exception e4) {
                    e = e4;
                }
                break;
            case 5:
                hv0 hv0Var = (hv0) this.f7196m;
                hv0Var.f3346l = Long.valueOf(hv0Var.f3343i.m3517H());
                for (yu0 yu0Var : ((hv0) this.f7196m).f3340f.f9963p.values()) {
                    f50 f50Var = yu0Var.f9469c;
                    ((AtomicLong) f50Var.f2313k).set(0L);
                    ((AtomicLong) f50Var.f2314l).set(0L);
                    f50 f50Var2 = yu0Var.f9468b;
                    yu0Var.f9468b = yu0Var.f9469c;
                    yu0Var.f9469c = f50Var2;
                }
                cv0 cv0Var = (cv0) this.f7195l;
                AbstractC0875xf abstractC0875xf = (AbstractC0875xf) this.f7194k;
                mc0 mc0VarM4056l = qc0.m4056l();
                if (cv0Var.f1466e != null) {
                    mc0VarM4056l.m3004a(new av0(cv0Var, abstractC0875xf, 1));
                }
                if (cv0Var.f1467f != null) {
                    mc0VarM4056l.m3004a(new av0(cv0Var, abstractC0875xf, 0));
                }
                nc0 nc0VarListIterator = mc0VarM4056l.m3374d().listIterator(0);
                while (nc0VarListIterator.hasNext()) {
                    av0 av0Var = (av0) nc0VarListIterator.next();
                    hv0 hv0Var2 = (hv0) this.f7196m;
                    zu0 zu0Var = hv0Var2.f3340f;
                    long jLongValue = hv0Var2.f3346l.longValue();
                    switch (av0Var.f641a) {
                        case 0:
                            nc0Var = nc0VarListIterator;
                            cv0 cv0Var2 = av0Var.f642b;
                            ArrayList arrayListM2340h = hv0.m2340h(zu0Var, cv0Var2.f1467f.f1004d.intValue());
                            int size2 = arrayListM2340h.size();
                            bv0 bv0Var = cv0Var2.f1467f;
                            if (size2 >= bv0Var.f1003c.intValue() && arrayListM2340h.size() != 0) {
                                int size3 = arrayListM2340h.size();
                                int i6 = 0;
                                while (i6 < size3) {
                                    Object obj2 = arrayListM2340h.get(i6);
                                    i6++;
                                    yu0 yu0Var2 = (yu0) obj2;
                                    if (zu0Var.m6041q() >= cv0Var2.f1465d.intValue()) {
                                    }
                                    if (yu0Var2.m5836c() >= bv0Var.f1004d.intValue()) {
                                        ArrayList arrayList3 = arrayListM2340h;
                                        int i7 = size3;
                                        if (((AtomicLong) yu0Var2.f9469c.f2314l).get() / yu0Var2.m5836c() > ((double) bv0Var.f1001a.intValue()) / 100.0d) {
                                            av0Var.f643c.mo5320h(1, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}", yu0Var2, Double.valueOf(((AtomicLong) yu0Var2.f9469c.f2314l).get() / yu0Var2.m5836c()));
                                            if (new Random().nextInt(100) < bv0Var.f1002b.intValue()) {
                                                yu0Var2.m5835b(jLongValue);
                                            }
                                        }
                                        arrayListM2340h = arrayList3;
                                        size3 = i7;
                                    }
                                    break;
                                }
                            }
                            break;
                        default:
                            cv0 cv0Var3 = av0Var.f642b;
                            ArrayList arrayListM2340h2 = hv0.m2340h(zu0Var, cv0Var3.f1466e.f1004d.intValue());
                            int size4 = arrayListM2340h2.size();
                            bv0 bv0Var2 = cv0Var3.f1466e;
                            if (size4 < bv0Var2.f1003c.intValue() || arrayListM2340h2.size() == 0) {
                                nc0Var = nc0VarListIterator;
                            }
                            ArrayList arrayList4 = new ArrayList();
                            int size5 = arrayListM2340h2.size();
                            int i8 = i2;
                            while (i8 < size5) {
                                Object obj3 = arrayListM2340h2.get(i8);
                                i8++;
                                yu0 yu0Var3 = (yu0) obj3;
                                arrayList4.add(Double.valueOf(((AtomicLong) yu0Var3.f9469c.f2313k).get() / yu0Var3.m5836c()));
                                arrayListM2340h2 = arrayListM2340h2;
                            }
                            ArrayList arrayList5 = arrayListM2340h2;
                            int size6 = arrayList4.size();
                            double d2 = 0.0d;
                            double dDoubleValue = 0.0d;
                            int i9 = 0;
                            while (i9 < size6) {
                                Object obj4 = arrayList4.get(i9);
                                i9++;
                                dDoubleValue = ((Double) obj4).doubleValue() + dDoubleValue;
                            }
                            double size7 = dDoubleValue / ((double) arrayList4.size());
                            int size8 = arrayList4.size();
                            int i10 = 0;
                            while (i10 < size8) {
                                Object obj5 = arrayList4.get(i10);
                                i10++;
                                double dDoubleValue2 = ((Double) obj5).doubleValue() - size7;
                                d2 = (dDoubleValue2 * dDoubleValue2) + d2;
                            }
                            double dSqrt = Math.sqrt(d2 / ((double) arrayList4.size()));
                            double dIntValue = size7 - (((double) (bv0Var2.f1001a.intValue() / 1000.0f)) * dSqrt);
                            int size9 = arrayList5.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size9) {
                                    nc0Var = nc0VarListIterator;
                                }
                                nc0Var = nc0VarListIterator;
                                ArrayList arrayList6 = arrayList5;
                                Object obj6 = arrayList6.get(i11);
                                i11++;
                                yu0 yu0Var4 = (yu0) obj6;
                                double d3 = dSqrt;
                                if (zu0Var.m6041q() >= cv0Var3.f1465d.intValue()) {
                                }
                                cv0 cv0Var4 = cv0Var3;
                                if (((AtomicLong) yu0Var4.f9469c.f2313k).get() / yu0Var4.m5836c() < dIntValue) {
                                    d = dIntValue;
                                    i = size9;
                                    av0Var.f643c.mo5320h(1, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", yu0Var4, Double.valueOf(((AtomicLong) yu0Var4.f9469c.f2313k).get() / yu0Var4.m5836c()), Double.valueOf(size7), Double.valueOf(d3), Double.valueOf(d));
                                    if (new Random().nextInt(100) < bv0Var2.f1002b.intValue()) {
                                        yu0Var4.m5835b(jLongValue);
                                    }
                                } else {
                                    d = dIntValue;
                                    i = size9;
                                }
                                cv0Var3 = cv0Var4;
                                nc0VarListIterator = nc0Var;
                                arrayList5 = arrayList6;
                                dIntValue = d;
                                dSqrt = d3;
                                size9 = i;
                                break;
                                break;
                            }
                            break;
                            break;
                    }
                    nc0VarListIterator = nc0Var;
                    i2 = 0;
                }
                hv0 hv0Var3 = (hv0) this.f7196m;
                zu0 zu0Var2 = hv0Var3.f3340f;
                Long l = hv0Var3.f3346l;
                for (yu0 yu0Var5 : zu0Var2.f9963p.values()) {
                    if (!yu0Var5.m5837d()) {
                        int i12 = yu0Var5.f9471e;
                        yu0Var5.f9471e = i12 == 0 ? 0 : i12 - 1;
                    }
                    if (yu0Var5.m5837d()) {
                        if (l.longValue() > Math.min(yu0Var5.f9467a.f1463b.longValue() * ((long) yu0Var5.f9471e), Math.max(yu0Var5.f9467a.f1463b.longValue(), yu0Var5.f9467a.f1464c.longValue())) + yu0Var5.f9470d.longValue()) {
                            yu0Var5.m5838e();
                        }
                    }
                }
                return;
            case 6:
                try {
                    objCall = ((i40) this.f7195l).call();
                    break;
                } catch (Exception unused2) {
                }
                ((Handler) this.f7196m).post(new RunnableC0529o2((j40) this.f7194k, objCall, 27, r5));
                return;
            case 7:
                ((gc1) this.f7196m).execute((fc1) this.f7195l);
                return;
            case 8:
                m4579a();
                return;
            case 9:
                x62 x62Var = ((b12) this.f7196m).f681b;
                x62Var.m5550W();
                hr1 hr1Var = (hr1) this.f7195l;
                Object objM600b = hr1Var.f3301l.m600b();
                z72 z72Var = (z72) this.f7194k;
                if (objM600b == null) {
                    x62Var.m5555b0(hr1Var, z72Var);
                    return;
                } else {
                    x62Var.m5554a0(hr1Var, z72Var);
                    return;
                }
            case 10:
                m4580b();
                return;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                b12 b12Var = (b12) this.f7196m;
                b12Var.f681b.m5550W();
                b12Var.f681b.m5563h((String) this.f7194k, (fu1) this.f7195l);
                return;
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                m4581c();
                return;
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                m4582d();
                return;
            case 14:
                m4583e();
                return;
            case 15:
                m4584f();
                return;
            case 16:
                m4585g();
                return;
            case 17:
                m4586h();
                return;
            case 18:
                m4587i();
                return;
            default:
                if (((k01) this.f7195l).f4243j != null) {
                    dd0.m1158c();
                    return;
                }
                ha2 ha2Var = (ha2) this.f7194k;
                RunnableC0452m runnableC0452m = (RunnableC0452m) this.f7196m;
                ga2 ga2VarM4511c = s92.m4511c();
                ha2 ha2VarM4510b = s92.m4510b(ga2VarM4511c, ha2Var);
                try {
                    runnableC0452m.run();
                    s92.m4510b(ga2VarM4511c, ha2VarM4510b);
                    return;
                } catch (Throwable th4) {
                    try {
                        r92.m4282a(th4);
                        throw th4;
                    } catch (Throwable th5) {
                        s92.m4510b(ga2VarM4511c, ha2VarM4510b);
                        throw th5;
                    }
                }
        }
    }

    public String toString() {
        switch (this.f7193j) {
            case 7:
                return ((Runnable) this.f7194k).toString() + "(scheduled in SynchronizationContext)";
            case 19:
                RunnableC0452m runnableC0452m = (RunnableC0452m) this.f7196m;
                StringBuilder sb = new StringBuilder(runnableC0452m.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(runnableC0452m);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ RunnableC0702sr(Object obj, Object obj2, Object obj3, int i) {
        this.f7193j = i;
        this.f7196m = obj;
        this.f7195l = obj2;
        this.f7194k = obj3;
    }

    public /* synthetic */ RunnableC0702sr(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.f7193j = i;
        this.f7195l = obj;
        this.f7194k = obj2;
        this.f7196m = obj3;
    }

    public /* synthetic */ RunnableC0702sr() {
        this.f7193j = 6;
    }
}
