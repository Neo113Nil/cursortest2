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
import p098n4.C0928a;
import p098n4.C0940m;
import p098n4.J;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3046a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3050e;

    public b(j jVar, C0042s c0042s) {
        this.f3047b = jVar;
        this.f3048c = c0042s;
    }

    public HashMap a(Object obj, Exception exc) {
        HashMap map = new HashMap();
        Y3.i iVar = ((com.google.firebase.storage.f) this.f3048c).f12012a;
        iVar.b();
        map.put("appName", iVar.f7664b);
        if (obj != null) {
            map.put(SentryStackTrace.JsonKeys.SNAPSHOT, K5.c.d(obj));
        }
        if (exc != null) {
            HashMap map2 = K5.b.f4087c;
            HashMap map3 = new HashMap();
            K5.i iVarI = Q0.a.I(exc);
            map3.put("code", iVarI.f4111a);
            map3.put("message", iVarI.getMessage());
            map.put("error", map3);
        }
        return map;
    }

    @Override // A5.i
    public final void b() {
        Object obj = this.f3047b;
        switch (this.f3046a) {
            case 0:
                C0042s c0042s = (C0042s) this.f3048c;
                HashMap map = d.f3055e;
                ((A5.j) c0042s.f550b).a(null);
                a aVar = (a) this.f3049d;
                j jVar = (j) obj;
                C0940m c0940m = (C0940m) jVar.f1723b;
                if (aVar != null) {
                    jVar.k(new J(c0940m, aVar, jVar.i()));
                    this.f3049d = null;
                }
                a aVar2 = (a) this.f3050e;
                if (aVar2 != null) {
                    jVar.k(new C0928a(c0940m, aVar2, jVar.i()));
                    this.f3050e = null;
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
                HashMap map2 = K5.b.f4087c;
                String str = (String) this.f3050e;
                A5.j jVar2 = (A5.j) map2.get(str);
                if (jVar2 != null) {
                    jVar2.a(null);
                    map2.remove(str);
                }
                HashMap map3 = K5.b.f4088d;
                if (map3.get(str) != null) {
                    map3.remove(str);
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
                boolean zEquals = "value".equals(str);
                j jVar = (j) this.f3047b;
                C0940m c0940m = (C0940m) jVar.f1723b;
                if (!zEquals) {
                    a aVar = new a(hVar, str);
                    this.f3050e = aVar;
                    jVar.d(new C0928a(c0940m, aVar, jVar.i()));
                } else {
                    a aVar2 = new a(hVar, "value");
                    this.f3049d = aVar2;
                    jVar.d(new J(c0940m, aVar2, jVar.i()));
                }
                break;
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
                        G5.b bVar = this.f4134a;
                        c cVar = (c) bVar.f3047b;
                        if (cVar.f4101k.booleanValue()) {
                            return;
                        }
                        HashMap mapA = bVar.a(rVar, null);
                        mapA.put("taskState", 2);
                        hVar.c(mapA);
                        cVar.b();
                    }
                });
                sVar.f12063e.b(null, null, new OnCanceledListener() { // from class: K5.s
                    @Override // com.google.android.gms.tasks.OnCanceledListener
                    public final void onCanceled() {
                        G5.b bVar = this.f4136a;
                        A5.h hVar2 = hVar;
                        if (((c) bVar.f3047b).f4101k.booleanValue()) {
                            return;
                        }
                        HashMap mapA = bVar.a(null, null);
                        mapA.put("taskState", 4);
                        HashMap map = new HashMap();
                        map.put("code", "canceled");
                        map.put("message", "User cancelled the operation.");
                        mapA.put("error", map);
                        hVar2.c(mapA);
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
