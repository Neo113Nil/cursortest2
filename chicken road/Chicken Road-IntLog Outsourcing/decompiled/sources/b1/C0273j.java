package b1;

import M2.C0097a;
import U0.l;
import U0.n;
import U0.t;
import U0.u;
import U0.w;
import V0.m;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import b2.AbstractC0279e;
import c1.C0309b;
import e1.InterfaceC0410a;
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
import l.q0;
import n2.AbstractC1341c;

/* renamed from: b1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4787a;

    /* renamed from: b, reason: collision with root package name */
    public final W0.f f4788b;

    /* renamed from: c, reason: collision with root package name */
    public final c1.d f4789c;

    /* renamed from: d, reason: collision with root package name */
    public final C0267d f4790d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f4791e;

    /* renamed from: f, reason: collision with root package name */
    public final d1.c f4792f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0410a f4793g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0410a f4794h;

    /* renamed from: i, reason: collision with root package name */
    public final c1.c f4795i;

    public C0273j(Context context, W0.f fVar, c1.d dVar, C0267d c0267d, Executor executor, d1.c cVar, InterfaceC0410a interfaceC0410a, InterfaceC0410a interfaceC0410a2, c1.c cVar2) {
        this.f4787a = context;
        this.f4788b = fVar;
        this.f4789c = dVar;
        this.f4790d = c0267d;
        this.f4791e = executor;
        this.f4792f = cVar;
        this.f4793g = interfaceC0410a;
        this.f4794h = interfaceC0410a2;
        this.f4795i = cVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03de A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(V0.i iVar, int i2) {
        W0.g gVar;
        W0.a aVar;
        String str;
        W0.a aVar2;
        int i3;
        T0.c e3;
        String str2;
        Integer num;
        String str3;
        q0 q0Var;
        int i6;
        int i7;
        final V0.i iVar2 = iVar;
        int i8 = 2;
        final int i9 = 1;
        final int i10 = 0;
        W0.g a6 = this.f4788b.a(iVar2.f3208a);
        long j2 = 0;
        while (true) {
            d1.b bVar = new d1.b(this) { // from class: b1.h

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0273j f4782b;

                {
                    this.f4782b = this;
                }

                @Override // d1.b
                public final Object execute() {
                    Boolean bool;
                    switch (i10) {
                        case 0:
                            V0.i iVar3 = iVar2;
                            c1.i iVar4 = (c1.i) this.f4782b.f4789c;
                            SQLiteDatabase a7 = iVar4.a();
                            a7.beginTransaction();
                            try {
                                Long b6 = c1.i.b(a7, iVar3);
                                if (b6 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = iVar4.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b6.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a7.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a7.endTransaction();
                            }
                        default:
                            c1.i iVar5 = (c1.i) this.f4782b.f4789c;
                            iVar5.getClass();
                            return (Iterable) iVar5.c(new C0097a(iVar5, 7, iVar2));
                    }
                }
            };
            c1.i iVar3 = (c1.i) this.f4792f;
            if (!((Boolean) iVar3.p(bVar)).booleanValue()) {
                iVar3.p(new C0272i(j2, this, iVar2));
                return;
            }
            Iterable iterable = (Iterable) iVar3.p(new d1.b(this) { // from class: b1.h

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0273j f4782b;

                {
                    this.f4782b = this;
                }

                @Override // d1.b
                public final Object execute() {
                    Boolean bool;
                    switch (i9) {
                        case 0:
                            V0.i iVar32 = iVar2;
                            c1.i iVar4 = (c1.i) this.f4782b.f4789c;
                            SQLiteDatabase a7 = iVar4.a();
                            a7.beginTransaction();
                            try {
                                Long b6 = c1.i.b(a7, iVar32);
                                if (b6 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = iVar4.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b6.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a7.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a7.endTransaction();
                            }
                        default:
                            c1.i iVar5 = (c1.i) this.f4782b.f4789c;
                            iVar5.getClass();
                            return (Iterable) iVar5.c(new C0097a(iVar5, 7, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            byte[] bArr = iVar2.f3209b;
            if (a6 == null) {
                AbstractC1341c.f("Uploader", "Unknown backend for %s, deleting event batch for it...", iVar2);
                aVar2 = new W0.a(3, -1L);
                i3 = i8;
                gVar = a6;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C0309b) it.next()).f4901c);
                }
                String str4 = "proto";
                if ((bArr != null ? 1 : i10) != 0) {
                    c1.c cVar = this.f4795i;
                    Objects.requireNonNull(cVar);
                    Y0.a aVar3 = (Y0.a) iVar3.p(new D3.g(13, cVar));
                    M0.e eVar = new M0.e(i8);
                    eVar.f1788h = new HashMap();
                    eVar.f1786f = Long.valueOf(this.f4793g.e());
                    eVar.f1787g = Long.valueOf(this.f4794h.e());
                    eVar.f1783c = "GDT_CLIENT_METRICS";
                    S0.c cVar2 = new S0.c("proto");
                    aVar3.getClass();
                    B4.i iVar4 = m.f3216a;
                    iVar4.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        iVar4.B(byteArrayOutputStream, aVar3);
                    } catch (IOException unused) {
                    }
                    eVar.f1785e = new V0.k(cVar2, byteArrayOutputStream.toByteArray());
                    arrayList.add(((T0.d) a6).a(eVar.c()));
                }
                T0.d dVar = (T0.d) a6;
                HashMap hashMap = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    V0.h hVar = (V0.h) it2.next();
                    String str5 = hVar.f3202a;
                    if (hashMap.containsKey(str5)) {
                        ((List) hashMap.get(str5)).add(hVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(hVar);
                        hashMap.put(str5, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = hashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    V0.h hVar2 = (V0.h) ((List) entry.getValue()).get(0);
                    w wVar = w.f3150a;
                    long e6 = dVar.f2780f.e();
                    long e7 = dVar.f2779e.e();
                    U0.j jVar = new U0.j(new U0.h(Integer.valueOf(hVar2.b("sdk-version")), hVar2.a(CommonUrlParts.MODEL), hVar2.a("hardware"), hVar2.a("device"), hVar2.a("product"), hVar2.a("os-uild"), hVar2.a(CommonUrlParts.MANUFACTURER), hVar2.a("fingerprint"), hVar2.a(CommonUrlParts.LOCALE), hVar2.a("country"), hVar2.a("mcc_mnc"), hVar2.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = ((List) entry.getValue()).iterator();
                    while (it4.hasNext()) {
                        Iterator it5 = it3;
                        V0.h hVar3 = (V0.h) it4.next();
                        Iterator it6 = it4;
                        V0.k kVar = hVar3.f3204c;
                        W0.g gVar2 = a6;
                        S0.c cVar3 = kVar.f3213a;
                        boolean equals = cVar3.equals(new S0.c(str4));
                        byte[] bArr2 = kVar.f3214b;
                        if (equals) {
                            q0Var = new q0();
                            q0Var.f10944d = bArr2;
                            str3 = str4;
                        } else {
                            str3 = str4;
                            if (cVar3.equals(new S0.c("json"))) {
                                String str6 = new String(bArr2, Charset.forName("UTF-8"));
                                q0 q0Var2 = new q0();
                                q0Var2.f10945e = str6;
                                q0Var = q0Var2;
                            } else {
                                String s2 = AbstractC1341c.s("CctTransportBackend");
                                if (Log.isLoggable(s2, 5)) {
                                    Log.w(s2, "Received event of unsupported encoding " + cVar3 + ". Skipping...");
                                }
                                it4 = it6;
                                it3 = it5;
                                a6 = gVar2;
                                str4 = str3;
                            }
                        }
                        q0Var.f10941a = Long.valueOf(hVar3.f3205d);
                        q0Var.f10943c = Long.valueOf(hVar3.f3206e);
                        String str7 = (String) hVar3.f3207f.get("tz-offset");
                        q0Var.f10946f = Long.valueOf(str7 == null ? 0L : Long.valueOf(str7).longValue());
                        q0Var.f10947g = new n((u) u.f3148a.get(hVar3.b("net-type")), (t) t.f3146a.get(hVar3.b("mobile-subtype")));
                        Integer num2 = hVar3.f3203b;
                        if (num2 != null) {
                            q0Var.f10942b = num2;
                        }
                        String str8 = ((Long) q0Var.f10941a) == null ? " eventTimeMs" : "";
                        if (((Long) q0Var.f10943c) == null) {
                            str8 = str8.concat(" eventUptimeMs");
                        }
                        if (((Long) q0Var.f10946f) == null) {
                            str8 = AbstractC0279e.e(str8, " timezoneOffsetSeconds");
                        }
                        if (!str8.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str8));
                        }
                        arrayList4.add(new U0.k(((Long) q0Var.f10941a).longValue(), (Integer) q0Var.f10942b, ((Long) q0Var.f10943c).longValue(), (byte[]) q0Var.f10944d, (String) q0Var.f10945e, ((Long) q0Var.f10946f).longValue(), (n) q0Var.f10947g));
                        it4 = it6;
                        it3 = it5;
                        a6 = gVar2;
                        str4 = str3;
                    }
                    arrayList3.add(new l(e6, e7, jVar, num, str2, arrayList4));
                    it3 = it3;
                    a6 = a6;
                    str4 = str4;
                }
                gVar = a6;
                U0.i iVar5 = new U0.i(arrayList3);
                URL url = dVar.f2778d;
                if (bArr != null) {
                    try {
                        T0.a a7 = T0.a.a(bArr);
                        str = a7.f2768b;
                        if (str == null) {
                            str = null;
                        }
                        String str9 = a7.f2767a;
                        if (str9 != null) {
                            url = T0.d.b(str9);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new W0.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    T0.b bVar2 = new T0.b(url, iVar5, str);
                    D3.g gVar3 = new D3.g(12, dVar);
                    int i11 = 5;
                    do {
                        e3 = gVar3.e(bVar2);
                        URL url2 = e3.f2773b;
                        if (url2 != null) {
                            AbstractC1341c.f("CctTransportBackend", "Following redirect to: %s", url2);
                            bVar2 = new T0.b(url2, bVar2.f2770b, bVar2.f2771c);
                        } else {
                            bVar2 = null;
                        }
                        if (bVar2 == null) {
                            break;
                        } else {
                            i11--;
                        }
                    } while (i11 >= 1);
                    int i12 = e3.f2772a;
                    if (i12 == 200) {
                        aVar2 = new W0.a(1, e3.f2774c);
                        i3 = 2;
                    } else {
                        if (i12 >= 500 || i12 == 404) {
                            aVar = new W0.a(2, -1L);
                        } else if (i12 == 400) {
                            try {
                                aVar = new W0.a(4, -1L);
                            } catch (IOException e8) {
                                e = e8;
                                AbstractC1341c.h("CctTransportBackend", "Could not make request to the backend", e);
                                i3 = 2;
                                aVar2 = new W0.a(2, -1L);
                                i6 = aVar2.f3378a;
                                if (i6 != i3) {
                                }
                            }
                        } else {
                            aVar = new W0.a(3, -1L);
                        }
                        aVar2 = aVar;
                        i3 = 2;
                    }
                } catch (IOException e9) {
                    e = e9;
                }
            }
            i6 = aVar2.f3378a;
            if (i6 != i3) {
                iVar3.p(new O1.b(this, iterable, iVar, j2));
                this.f4790d.a(iVar, i2 + 1, true);
                return;
            }
            iVar3.p(new C0097a(this, 5, iterable));
            if (i6 == 1) {
                j2 = Math.max(j2, aVar2.f3379b);
                if (bArr != null) {
                    iVar3.p(new D3.g(15, this));
                }
            } else if (i6 == 4) {
                HashMap hashMap2 = new HashMap();
                Iterator it7 = iterable.iterator();
                while (it7.hasNext()) {
                    String str10 = ((C0309b) it7.next()).f4901c.f3202a;
                    if (hashMap2.containsKey(str10)) {
                        hashMap2.put(str10, Integer.valueOf(((Integer) hashMap2.get(str10)).intValue() + 1));
                    } else {
                        hashMap2.put(str10, 1);
                    }
                }
                i7 = 1;
                iVar3.p(new C0097a(this, 6, hashMap2));
                i8 = i3;
                iVar2 = iVar;
                i9 = i7;
                a6 = gVar;
                i10 = 0;
            }
            i7 = 1;
            i8 = i3;
            iVar2 = iVar;
            i9 = i7;
            a6 = gVar;
            i10 = 0;
        }
    }
}
