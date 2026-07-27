package G0;

import A0.p;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import l.s0;
import x0.C1249b;
import y0.C1251a;
import z0.t;
import z0.u;
import z0.w;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f419a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.g f420b;

    /* renamed from: c, reason: collision with root package name */
    public final H0.d f421c;

    /* renamed from: d, reason: collision with root package name */
    public final d f422d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f423e;
    public final I0.c f;

    /* renamed from: g, reason: collision with root package name */
    public final P0.j f424g;

    /* renamed from: h, reason: collision with root package name */
    public final P0.j f425h;

    /* renamed from: i, reason: collision with root package name */
    public final H0.c f426i;

    public l(Context context, B0.g gVar, H0.d dVar, d dVar2, Executor executor, I0.c cVar, P0.j jVar, P0.j jVar2, H0.c cVar2) {
        this.f419a = context;
        this.f420b = gVar;
        this.f421c = dVar;
        this.f422d = dVar2;
        this.f423e = executor;
        this.f = cVar;
        this.f424g = jVar;
        this.f425h = jVar2;
        this.f426i = cVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03de A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final A0.k kVar, int i3) {
        B0.h hVar;
        B0.a aVar;
        String str;
        int i4;
        y0.b b3;
        String str2;
        Integer num;
        Iterator it;
        s0 s0Var;
        int i5;
        int i6;
        final l lVar = this;
        final A0.k kVar2 = kVar;
        int i7 = 3;
        final int i8 = 0;
        final int i9 = 1;
        B0.h a3 = lVar.f420b.a(kVar2.f69a);
        long j3 = 0;
        while (true) {
            I0.b bVar = new I0.b(lVar) { // from class: G0.h

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l f407b;

                {
                    this.f407b = lVar;
                }

                @Override // I0.b
                public final Object execute() {
                    Boolean bool;
                    switch (i8) {
                        case 0:
                            A0.k kVar3 = kVar2;
                            H0.i iVar = (H0.i) this.f407b.f421c;
                            SQLiteDatabase a4 = iVar.a();
                            a4.beginTransaction();
                            try {
                                Long b4 = H0.i.b(a4, kVar3);
                                if (b4 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = iVar.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b4.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a4.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a4.endTransaction();
                            }
                        default:
                            H0.i iVar2 = (H0.i) this.f407b.f421c;
                            iVar2.getClass();
                            return (Iterable) iVar2.c(new j(iVar2, 2, kVar2));
                    }
                }
            };
            H0.i iVar = (H0.i) lVar.f;
            if (!((Boolean) iVar.f(bVar)).booleanValue()) {
                iVar.f(new k(j3, lVar, kVar2));
                return;
            }
            final Iterable iterable = (Iterable) iVar.f(new I0.b(lVar) { // from class: G0.h

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l f407b;

                {
                    this.f407b = lVar;
                }

                @Override // I0.b
                public final Object execute() {
                    Boolean bool;
                    switch (i9) {
                        case 0:
                            A0.k kVar3 = kVar2;
                            H0.i iVar2 = (H0.i) this.f407b.f421c;
                            SQLiteDatabase a4 = iVar2.a();
                            a4.beginTransaction();
                            try {
                                Long b4 = H0.i.b(a4, kVar3);
                                if (b4 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = iVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b4.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a4.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a4.endTransaction();
                            }
                        default:
                            H0.i iVar22 = (H0.i) this.f407b.f421c;
                            iVar22.getClass();
                            return (Iterable) iVar22.c(new j(iVar22, 2, kVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            byte[] bArr = kVar2.f70b;
            if (a3 == null) {
                X0.a.p("Uploader", "Unknown backend for %s, deleting event batch for it...", kVar2);
                aVar = new B0.a(i7, -1L);
                hVar = a3;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((H0.b) it2.next()).f492c);
                }
                if ((bArr != null ? i9 : i8) != 0) {
                    H0.c cVar = lVar.f426i;
                    Objects.requireNonNull(cVar);
                    D0.b bVar2 = (D0.b) iVar.f(new F1.b(i9, cVar));
                    A0.h hVar2 = new A0.h();
                    hVar2.f58g = new HashMap();
                    hVar2.f57e = Long.valueOf(lVar.f424g.c());
                    hVar2.f = Long.valueOf(lVar.f425h.c());
                    hVar2.f54b = "GDT_CLIENT_METRICS";
                    C1249b c1249b = new C1249b("proto");
                    bVar2.getClass();
                    A0.j jVar = p.f81a;
                    jVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        jVar.x(bVar2, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    hVar2.f56d = new A0.n(c1249b, byteArrayOutputStream.toByteArray());
                    arrayList.add(((y0.c) a3).a(hVar2.c()));
                }
                y0.c cVar2 = (y0.c) a3;
                HashMap hashMap = new HashMap();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    A0.i iVar2 = (A0.i) it3.next();
                    String str3 = iVar2.f59a;
                    if (hashMap.containsKey(str3)) {
                        ((List) hashMap.get(str3)).add(iVar2);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(iVar2);
                        hashMap.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = hashMap.entrySet().iterator();
                while (it4.hasNext()) {
                    Map.Entry entry = (Map.Entry) it4.next();
                    A0.i iVar3 = (A0.i) ((List) entry.getValue()).get(0);
                    w wVar = w.f10698a;
                    long c3 = cVar2.f.c();
                    long c4 = cVar2.f10581e.c();
                    z0.j jVar2 = new z0.j(new z0.h(Integer.valueOf(iVar3.b("sdk-version")), iVar3.a(CommonUrlParts.MODEL), iVar3.a("hardware"), iVar3.a("device"), iVar3.a("product"), iVar3.a("os-uild"), iVar3.a(CommonUrlParts.MANUFACTURER), iVar3.a("fingerprint"), iVar3.a(CommonUrlParts.LOCALE), iVar3.a("country"), iVar3.a("mcc_mnc"), iVar3.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it5 = ((List) entry.getValue()).iterator();
                    while (it5.hasNext()) {
                        A0.i iVar4 = (A0.i) it5.next();
                        A0.n nVar = iVar4.f61c;
                        Iterator it6 = it4;
                        C1249b c1249b2 = nVar.f78a;
                        B0.h hVar3 = a3;
                        boolean equals = c1249b2.equals(new C1249b("proto"));
                        byte[] bArr2 = nVar.f79b;
                        if (equals) {
                            s0Var = new s0();
                            s0Var.f9881d = bArr2;
                            it = it5;
                        } else {
                            it = it5;
                            if (c1249b2.equals(new C1249b("json"))) {
                                String str4 = new String(bArr2, Charset.forName(CharEncoding.UTF_8));
                                s0 s0Var2 = new s0();
                                s0Var2.f9882e = str4;
                                s0Var = s0Var2;
                            } else {
                                String t3 = X0.a.t("CctTransportBackend");
                                if (Log.isLoggable(t3, 5)) {
                                    Log.w(t3, "Received event of unsupported encoding " + c1249b2 + ". Skipping...");
                                }
                                it5 = it;
                                it4 = it6;
                                a3 = hVar3;
                            }
                        }
                        s0Var.f9878a = Long.valueOf(iVar4.f62d);
                        s0Var.f9880c = Long.valueOf(iVar4.f63e);
                        String str5 = (String) iVar4.f.get("tz-offset");
                        s0Var.f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        s0Var.f9883g = new z0.n((u) u.f10696a.get(iVar4.b("net-type")), (t) t.f10694a.get(iVar4.b("mobile-subtype")));
                        Integer num2 = iVar4.f60b;
                        if (num2 != null) {
                            s0Var.f9879b = num2;
                        }
                        String str6 = ((Long) s0Var.f9878a) == null ? " eventTimeMs" : "";
                        if (((Long) s0Var.f9880c) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) s0Var.f) == null) {
                            str6 = B0.c.o(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new z0.k(((Long) s0Var.f9878a).longValue(), (Integer) s0Var.f9879b, ((Long) s0Var.f9880c).longValue(), (byte[]) s0Var.f9881d, (String) s0Var.f9882e, ((Long) s0Var.f).longValue(), (z0.n) s0Var.f9883g));
                        it5 = it;
                        it4 = it6;
                        a3 = hVar3;
                    }
                    arrayList3.add(new z0.l(c3, c4, jVar2, num, str2, arrayList4));
                    it4 = it4;
                    a3 = a3;
                }
                hVar = a3;
                z0.i iVar5 = new z0.i(arrayList3);
                URL url = cVar2.f10580d;
                if (bArr != null) {
                    try {
                        C1251a a4 = C1251a.a(bArr);
                        str = a4.f10573b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = a4.f10572a;
                        if (str7 != null) {
                            url = y0.c.b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new B0.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    A0.j jVar3 = new A0.j(url, iVar5, str);
                    F1.b bVar3 = new F1.b(27, cVar2);
                    int i10 = 5;
                    do {
                        b3 = bVar3.b(jVar3);
                        URL url2 = b3.f10575b;
                        if (url2 != null) {
                            X0.a.p("CctTransportBackend", "Following redirect to: %s", url2);
                            jVar3 = new A0.j(url2, (z0.i) jVar3.f68d, (String) jVar3.f66b);
                        } else {
                            jVar3 = null;
                        }
                        if (jVar3 == null) {
                            break;
                        } else {
                            i10--;
                        }
                    } while (i10 >= 1);
                    int i11 = b3.f10574a;
                    if (i11 == 200) {
                        aVar = new B0.a(1, b3.f10576c);
                    } else if (i11 >= 500 || i11 == 404) {
                        aVar = new B0.a(2, -1L);
                    } else if (i11 == 400) {
                        try {
                            aVar = new B0.a(4, -1L);
                        } catch (IOException e3) {
                            e = e3;
                            X0.a.r("CctTransportBackend", "Could not make request to the backend", e);
                            i4 = 2;
                            aVar = new B0.a(2, -1L);
                            i5 = aVar.f130a;
                            if (i5 != i4) {
                            }
                        }
                    } else {
                        aVar = new B0.a(3, -1L);
                    }
                } catch (IOException e4) {
                    e = e4;
                }
            }
            i4 = 2;
            i5 = aVar.f130a;
            if (i5 != i4) {
                final long j4 = j3;
                iVar.f(new I0.b() { // from class: G0.i
                    @Override // I0.b
                    public final Object execute() {
                        l lVar2 = l.this;
                        H0.i iVar6 = (H0.i) lVar2.f421c;
                        iVar6.getClass();
                        Iterable iterable2 = iterable;
                        if (iterable2.iterator().hasNext()) {
                            String str8 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + H0.i.g(iterable2);
                            SQLiteDatabase a5 = iVar6.a();
                            a5.beginTransaction();
                            try {
                                a5.compileStatement(str8).execute();
                                Cursor rawQuery = a5.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                                try {
                                    Cursor cursor = rawQuery;
                                    while (cursor.moveToNext()) {
                                        iVar6.e(cursor.getInt(0), D0.d.MAX_RETRIES_REACHED, cursor.getString(1));
                                    }
                                    rawQuery.close();
                                    a5.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                                    a5.setTransactionSuccessful();
                                } catch (Throwable th) {
                                    rawQuery.close();
                                    throw th;
                                }
                            } finally {
                                a5.endTransaction();
                            }
                        }
                        iVar6.c(new H0.e(lVar2.f424g.c() + j4, kVar));
                        return null;
                    }
                });
                this.f422d.a(kVar, i3 + 1, true);
                return;
            }
            lVar = this;
            kVar2 = kVar;
            iVar.f(new j(lVar, 0, iterable));
            if (i5 == 1) {
                j3 = Math.max(j3, aVar.f131b);
                if (bArr != null) {
                    i6 = 3;
                    iVar.f(new F1.b(i6, lVar));
                } else {
                    i6 = 3;
                }
            } else {
                i6 = 3;
                if (i5 == 4) {
                    HashMap hashMap2 = new HashMap();
                    Iterator it7 = iterable.iterator();
                    while (it7.hasNext()) {
                        String str8 = ((H0.b) it7.next()).f492c.f59a;
                        if (hashMap2.containsKey(str8)) {
                            hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                        } else {
                            hashMap2.put(str8, 1);
                        }
                    }
                    i9 = 1;
                    iVar.f(new j(lVar, i9, hashMap2));
                    i7 = i6;
                    i8 = 0;
                    a3 = hVar;
                }
            }
            i9 = 1;
            i7 = i6;
            i8 = 0;
            a3 = hVar;
        }
    }
}
