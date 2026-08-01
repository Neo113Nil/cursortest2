package com.mbridge.msdk.tracker.network.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.mbridge.msdk.tracker.network.b0;
import com.mbridge.msdk.tracker.network.p;
import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.t;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: BasicNetwork.java */
/* loaded from: classes6.dex */
public class b implements com.mbridge.msdk.tracker.network.m {

    /* renamed from: a, reason: collision with root package name */
    private final a f10012a;
    protected final c b;

    public b(a aVar) {
        this(aVar, new c(4096));
    }

    private static p b(t<?> tVar) {
        if (tVar == null) {
            return null;
        }
        try {
            if (!tVar.a() || TextUtils.isEmpty(tVar.t())) {
                return null;
            }
            p pVar = new p(tVar.p(), tVar.g() == 0 ? "GET" : "POST");
            pVar.d("queue");
            pVar.e(tVar.d("local_id"));
            pVar.a(tVar.d("ad_type"));
            pVar.i(tVar.r());
            tVar.a(pVar);
            return pVar;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.mbridge.msdk.tracker.network.m
    public q a(t<?> tVar) throws b0 {
        IOException iOException;
        g gVar;
        byte[] bArr;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        p b = b(tVar);
        while (true) {
            Collections.emptyList();
            try {
                g a2 = this.f10012a.a(tVar, f.a(tVar.d()));
                try {
                    int d = a2.d();
                    a(b, d);
                    List<com.mbridge.msdk.tracker.network.g> c = a2.c();
                    if (d == 304) {
                        return k.a(tVar, SystemClock.elapsedRealtime() - elapsedRealtime, c);
                    }
                    InputStream a3 = a2.a();
                    byte[] a4 = a3 != null ? k.a(a3, a2.b(), this.b, b) : new byte[0];
                    try {
                        k.a(SystemClock.elapsedRealtime() - elapsedRealtime, tVar, a4, d);
                        if (d < 200 || d > 299) {
                            throw new IOException();
                        }
                        a(b, 1, null);
                        return new q(d, a4, false, SystemClock.elapsedRealtime() - elapsedRealtime, c);
                    } catch (IOException e) {
                        e = e;
                        gVar = a2;
                        bArr = a4;
                        iOException = e;
                        a(b, TextUtils.equals(iOException.getMessage(), "timeout") ? 3 : 2, iOException);
                        k.a(tVar, k.a(tVar, iOException, elapsedRealtime, gVar, bArr));
                    }
                } catch (IOException e2) {
                    e = e2;
                    bArr = null;
                    gVar = a2;
                }
            } catch (IOException e3) {
                iOException = e3;
                gVar = null;
                bArr = null;
            }
            a(b, TextUtils.equals(iOException.getMessage(), "timeout") ? 3 : 2, iOException);
            k.a(tVar, k.a(tVar, iOException, elapsedRealtime, gVar, bArr));
        }
    }

    public b(a aVar, c cVar) {
        this.f10012a = aVar;
        this.b = cVar;
    }

    private static void a(p pVar, int i, Exception exc) {
        if (pVar != null) {
            try {
                pVar.a(exc);
                pVar.a(i);
            } catch (Exception unused) {
            }
        }
    }

    private static void a(p pVar, int i) {
        if (pVar != null) {
            try {
                pVar.b(i);
            } catch (Exception unused) {
            }
        }
    }
}
