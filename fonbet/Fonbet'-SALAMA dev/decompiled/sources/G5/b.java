package G5;

import A1.C0042s;
import A5.h;
import A5.i;
import D3.j;
import K5.p;
import K5.q;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.s;
import io.sentry.protocol.SentryStackTrace;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import n4.C1467a;
import n4.C1479m;
import n4.J;

/* loaded from: classes2.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3046a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3047b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3048c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3049d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3050e;

    public b(j jVar, C0042s c0042s) {
        this.f3047b = jVar;
        this.f3048c = c0042s;
    }

    public HashMap a(Object obj, Exception exc) {
        HashMap hashMap = new HashMap();
        Y3.i iVar = ((com.google.firebase.storage.f) this.f3048c).f12012a;
        iVar.b();
        hashMap.put("appName", iVar.f7664b);
        if (obj != null) {
            hashMap.put(SentryStackTrace.JsonKeys.SNAPSHOT, K5.c.d(obj));
        }
        if (exc != null) {
            HashMap hashMap2 = K5.b.f4087c;
            HashMap hashMap3 = new HashMap();
            K5.i I7 = Q0.a.I(exc);
            hashMap3.put("code", I7.f4111a);
            hashMap3.put("message", I7.getMessage());
            hashMap.put("error", hashMap3);
        }
        return hashMap;
    }

    @Override // A5.i
    public final void b() {
        Object obj = this.f3047b;
        switch (this.f3046a) {
            case 0:
                C0042s c0042s = (C0042s) this.f3048c;
                HashMap hashMap = d.f3055e;
                ((A5.j) c0042s.f550b).a(null);
                a aVar = (a) this.f3049d;
                j jVar = (j) obj;
                C1479m c1479m = (C1479m) jVar.f1723b;
                if (aVar != null) {
                    jVar.k(new J(c1479m, aVar, jVar.i()));
                    this.f3049d = null;
                }
                a aVar2 = (a) this.f3050e;
                if (aVar2 != null) {
                    jVar.k(new C1467a(c1479m, aVar2, jVar.i()));
                    this.f3050e = null;
                    break;
                }
                break;
            default:
                s sVar = (s) this.f3049d;
                if (!sVar.isCanceled()) {
                    sVar.p(new int[]{256, 32}, true);
                }
                K5.c cVar = (K5.c) obj;
                if (!cVar.f4101k.booleanValue()) {
                    cVar.b();
                }
                HashMap hashMap2 = K5.b.f4087c;
                String str = (String) this.f3050e;
                A5.j jVar2 = (A5.j) hashMap2.get(str);
                if (jVar2 != null) {
                    jVar2.a(null);
                    hashMap2.remove(str);
                }
                HashMap hashMap3 = K5.b.f4088d;
                if (hashMap3.get(str) != null) {
                    hashMap3.remove(str);
                    break;
                }
                break;
        }
    }

    @Override // A5.i
    public final void c(Object obj, final h hVar) {
        switch (this.f3046a) {
            case 0:
                Object obj2 = ((Map) obj).get("eventType");
                Objects.requireNonNull(obj2);
                String str = (String) obj2;
                boolean equals = "value".equals(str);
                j jVar = (j) this.f3047b;
                C1479m c1479m = (C1479m) jVar.f1723b;
                if (!equals) {
                    a aVar = new a(hVar, str);
                    this.f3050e = aVar;
                    jVar.d(new C1467a(c1479m, aVar, jVar.i()));
                    break;
                } else {
                    a aVar2 = new a(hVar, "value");
                    this.f3049d = aVar2;
                    jVar.d(new J(c1479m, aVar2, jVar.i()));
                    break;
                }
            default:
                p pVar = new p(this, hVar);
                s sVar = (s) this.f3049d;
                sVar.getClass();
                sVar.f12064f.b(null, null, pVar);
                sVar.f12065g.b(null, null, new q(this, hVar));
                sVar.f12060b.b(null, null, new OnSuccessListener() { // from class: K5.r
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj3) {
                        com.google.firebase.storage.r rVar = (com.google.firebase.storage.r) obj3;
                        G5.b bVar = G5.b.this;
                        c cVar = (c) bVar.f3047b;
                        if (cVar.f4101k.booleanValue()) {
                            return;
                        }
                        HashMap a2 = bVar.a(rVar, null);
                        a2.put("taskState", 2);
                        hVar.c(a2);
                        cVar.b();
                    }
                });
                sVar.f12063e.b(null, null, new OnCanceledListener() { // from class: K5.s
                    @Override // com.google.android.gms.tasks.OnCanceledListener
                    public final void onCanceled() {
                        G5.b bVar = G5.b.this;
                        A5.h hVar2 = hVar;
                        if (((c) bVar.f3047b).f4101k.booleanValue()) {
                            return;
                        }
                        HashMap a2 = bVar.a(null, null);
                        a2.put("taskState", 4);
                        HashMap hashMap = new HashMap();
                        hashMap.put("code", "canceled");
                        hashMap.put("message", "User cancelled the operation.");
                        a2.put("error", hashMap);
                        hVar2.c(a2);
                        c cVar = (c) bVar.f3047b;
                        synchronized (cVar.f4100i) {
                            cVar.f4100i.notifyAll();
                        }
                        ((c) bVar.f3047b).b();
                    }
                });
                sVar.f12061c.b(null, null, new I5.b(this, hVar, 1));
                break;
        }
    }

    public b(K5.c cVar, com.google.firebase.storage.f fVar, s sVar, String str) {
        this.f3047b = cVar;
        this.f3048c = fVar;
        this.f3049d = sVar;
        this.f3050e = str;
    }
}
