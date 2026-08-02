package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.StrictMode;
import java.io.ByteArrayInputStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class V9 implements O2.a, InterfaceC0641Md, InterfaceC0648Nd, InterfaceC1695va, InterfaceC1740wa, W2.b, Y2.b, InterfaceC0846cc, I, Jw {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11870k;

    public /* synthetic */ V9(int i) {
        this.f11870k = i;
    }

    public static final InterfaceC0677Re f(final G.v vVar, final U2.a aVar, final Context context, final C1586t c1586t, final Q4 q42, final C1773x6 c1773x6, final T7 t7, final BinderC0857cn binderC0857cn, final Lq lq, final Nq nq, final Xq xq, final Mt mt, final String str, final boolean z3, final boolean z5) {
        F7.a(context);
        try {
            InterfaceC1805xu interfaceC1805xu = new InterfaceC1805xu() { // from class: com.google.android.gms.internal.ads.Ve
                @Override // com.google.android.gms.internal.ads.InterfaceC1805xu
                /* renamed from: a */
                public final Object mo12a() {
                    C1586t c1586t2 = c1586t;
                    String str2 = str;
                    boolean z6 = z3;
                    C1773x6 c1773x62 = c1773x6;
                    boolean z7 = z5;
                    Q4 q43 = q42;
                    Lq lq2 = lq;
                    T7 t72 = t7;
                    Mt mt2 = mt;
                    Nq nq2 = nq;
                    Context context2 = context;
                    U2.a aVar2 = aVar;
                    G.v vVar2 = vVar;
                    Xq xq2 = xq;
                    BinderC0857cn binderC0857cn2 = binderC0857cn;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = ViewTreeObserverOnGlobalLayoutListenerC0805bf.f12848l0;
                        C1206kf c1206kf = new C1206kf(context2);
                        c1206kf.setBaseContext(context2);
                        C0733Ze c0733Ze = new C0733Ze(new ViewTreeObserverOnGlobalLayoutListenerC0805bf(c1206kf, c1586t2, str2, z6, q43, t72, aVar2, mt2, vVar2, c1773x62, lq2, nq2, xq2));
                        P2.o.f4767B.f4773e.getClass();
                        c0733Ze.setWebViewClient(new C1028gf(c0733Ze, c1773x62, z7, new C0566Cb(c0733Ze, c0733Ze.c0(), new C1864z7(c0733Ze.getContext())), binderC0857cn2));
                        c0733Ze.setWebChromeClient(new C0670Qe(c0733Ze));
                        return c0733Ze;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object mo12a = interfaceC1805xu.mo12a();
                StrictMode.setThreadPolicy(threadPolicy);
                return (InterfaceC0677Re) mo12a;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (Throwable th2) {
            throw new C0719Xe("Webview initialization failed.", th2);
        }
    }

    public static final void g(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.getString(i));
            }
            Collections.unmodifiableList(arrayList);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0641Md
    /* renamed from: a */
    public void mo16a() {
        int i = this.f11870k;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1695va
    public Object d(JSONObject jSONObject) {
        switch (this.f11870k) {
            case 5:
                return new ByteArrayInputStream(jSONObject.toString().getBytes(AbstractC1830ya.f16433a));
            default:
                return jSONObject;
        }
    }

    @Override // com.google.android.gms.internal.ads.I
    public F[] e(Uri uri, Map map) {
        switch (this.f11870k) {
            case 22:
                AtomicInteger atomicInteger = C0614Ie.f9545E;
                return new F[]{new C1633u1(), new C0738a1()};
            default:
                AtomicInteger atomicInteger2 = C0614Ie.f9545E;
                return new F[]{new C1633u1(), new C0738a1(), new C1498r1(O1.f, 32, C1761wv.f16184o)};
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0648Nd, com.google.android.gms.internal.ads.Ei
    /* renamed from: k */
    public void mo13k(Object obj) {
        switch (this.f11870k) {
            case 3:
                T2.G.m("Ending javascript session.");
                C1605ta c1605ta = (C1605ta) ((InterfaceC1560sa) obj);
                HashSet hashSet = c1605ta.f15685l;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
                    T2.G.m("Unregistering eventhandler: ".concat(String.valueOf(((InterfaceC1821y9) simpleEntry.getValue()).toString())));
                    c1605ta.f15684k.i((String) simpleEntry.getKey(), (InterfaceC1821y9) simpleEntry.getValue());
                }
                hashSet.clear();
                break;
            default:
                AbstractC0613Id.f.execute(new RunnableC1156ja((C1068ha) obj, 2));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1740wa
    public /* bridge */ /* synthetic */ JSONObject o(Object obj) {
        return (JSONObject) obj;
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public /* synthetic */ void mo14o(Object obj) {
        ((AbstractC0762ah) obj).t();
    }

    private final void h() {
    }

    private final void i() {
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0846cc
    public void b(String str, Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0846cc
    public void c(Throwable th, String str, float f) {
    }
}
