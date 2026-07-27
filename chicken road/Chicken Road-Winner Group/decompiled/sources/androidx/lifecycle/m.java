package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import m.C1108a;
import n.C1135a;
import n.C1136b;
import n.C1137c;
import n.C1138d;

/* loaded from: classes.dex */
public final class m extends g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2311a;

    /* renamed from: b, reason: collision with root package name */
    public C1135a f2312b;

    /* renamed from: c, reason: collision with root package name */
    public f f2313c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f2314d;

    /* renamed from: e, reason: collision with root package name */
    public int f2315e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2316g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f2317h;

    /* renamed from: i, reason: collision with root package name */
    public final z2.p f2318i;

    public m(k kVar) {
        new AtomicReference();
        this.f2311a = true;
        this.f2312b = new C1135a();
        f fVar = f.f2304b;
        this.f2313c = fVar;
        this.f2317h = new ArrayList();
        this.f2314d = new WeakReference(kVar);
        this.f2318i = new z2.p(fVar);
    }

    @Override // androidx.lifecycle.g
    public final void a(j jVar) {
        Object obj;
        k kVar;
        ArrayList arrayList = this.f2317h;
        d("addObserver");
        f fVar = this.f2313c;
        f fVar2 = f.f2303a;
        if (fVar != fVar2) {
            fVar2 = f.f2304b;
        }
        l lVar = new l();
        int i3 = n.f2319a;
        lVar.f2310b = jVar;
        lVar.f2309a = fVar2;
        C1135a c1135a = this.f2312b;
        C1137c b3 = c1135a.b(jVar);
        if (b3 != null) {
            obj = b3.f10118b;
        } else {
            HashMap hashMap = c1135a.f10113e;
            C1137c c1137c = new C1137c(jVar, lVar);
            c1135a.f10127d++;
            C1137c c1137c2 = c1135a.f10125b;
            if (c1137c2 == null) {
                c1135a.f10124a = c1137c;
                c1135a.f10125b = c1137c;
            } else {
                c1137c2.f10119c = c1137c;
                c1137c.f10120d = c1137c2;
                c1135a.f10125b = c1137c;
            }
            hashMap.put(jVar, c1137c);
            obj = null;
        }
        if (((l) obj) == null && (kVar = (k) this.f2314d.get()) != null) {
            boolean z3 = this.f2315e != 0 || this.f;
            f c3 = c(jVar);
            this.f2315e++;
            while (lVar.f2309a.compareTo(c3) < 0 && this.f2312b.f10113e.containsKey(jVar)) {
                arrayList.add(lVar.f2309a);
                c cVar = e.Companion;
                f state = lVar.f2309a;
                cVar.getClass();
                kotlin.jvm.internal.j.e(state, "state");
                int ordinal = state.ordinal();
                e eVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : e.ON_RESUME : e.ON_START : e.ON_CREATE;
                if (eVar == null) {
                    throw new IllegalStateException("no event up from " + lVar.f2309a);
                }
                lVar.a(kVar, eVar);
                arrayList.remove(arrayList.size() - 1);
                c3 = c(jVar);
            }
            if (!z3) {
                g();
            }
            this.f2315e--;
        }
    }

    @Override // androidx.lifecycle.g
    public final void b(j observer) {
        kotlin.jvm.internal.j.e(observer, "observer");
        d("removeObserver");
        this.f2312b.c(observer);
    }

    public final f c(j jVar) {
        HashMap hashMap = this.f2312b.f10113e;
        C1137c c1137c = hashMap.containsKey(jVar) ? ((C1137c) hashMap.get(jVar)).f10120d : null;
        f fVar = c1137c != null ? ((l) c1137c.f10118b).f2309a : null;
        ArrayList arrayList = this.f2317h;
        f fVar2 = arrayList.isEmpty() ? null : (f) arrayList.get(arrayList.size() - 1);
        f state1 = this.f2313c;
        kotlin.jvm.internal.j.e(state1, "state1");
        if (fVar == null || fVar.compareTo(state1) >= 0) {
            fVar = state1;
        }
        return (fVar2 == null || fVar2.compareTo(fVar) >= 0) ? fVar : fVar2;
    }

    public final void d(String str) {
        C1108a c1108a;
        if (this.f2311a) {
            if (C1108a.f9933i != null) {
                c1108a = C1108a.f9933i;
            } else {
                synchronized (C1108a.class) {
                    try {
                        if (C1108a.f9933i == null) {
                            C1108a.f9933i = new C1108a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c1108a = C1108a.f9933i;
            }
            ((C1108a) c1108a.f9934h).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(B0.c.k("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(e event) {
        kotlin.jvm.internal.j.e(event, "event");
        d("handleLifecycleEvent");
        f(event.a());
    }

    public final void f(f fVar) {
        f fVar2 = this.f2313c;
        if (fVar2 == fVar) {
            return;
        }
        f fVar3 = f.f2304b;
        f fVar4 = f.f2303a;
        if (fVar2 == fVar3 && fVar == fVar4) {
            throw new IllegalStateException(("no event down from " + this.f2313c + " in component " + this.f2314d.get()).toString());
        }
        this.f2313c = fVar;
        if (this.f || this.f2315e != 0) {
            this.f2316g = true;
            return;
        }
        this.f = true;
        g();
        this.f = false;
        if (this.f2313c == fVar4) {
            this.f2312b = new C1135a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r12.f2316g = false;
        r0 = r12.f2313c;
        r1 = r12.f2318i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        r0 = A2.l.f108a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        r1.b(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        k kVar = (k) this.f2314d.get();
        if (kVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C1135a c1135a = this.f2312b;
            if (c1135a.f10127d != 0) {
                C1137c c1137c = c1135a.f10124a;
                kotlin.jvm.internal.j.b(c1137c);
                f fVar = ((l) c1137c.f10118b).f2309a;
                C1137c c1137c2 = this.f2312b.f10125b;
                kotlin.jvm.internal.j.b(c1137c2);
                f fVar2 = ((l) c1137c2.f10118b).f2309a;
                if (fVar == fVar2 && this.f2313c == fVar2) {
                    break;
                }
                this.f2316g = false;
                f fVar3 = this.f2313c;
                C1137c c1137c3 = this.f2312b.f10124a;
                kotlin.jvm.internal.j.b(c1137c3);
                if (fVar3.compareTo(((l) c1137c3.f10118b).f2309a) < 0) {
                    C1135a c1135a2 = this.f2312b;
                    C1136b c1136b = new C1136b(c1135a2.f10125b, c1135a2.f10124a, 1);
                    c1135a2.f10126c.put(c1136b, Boolean.FALSE);
                    while (c1136b.hasNext() && !this.f2316g) {
                        Map.Entry entry = (Map.Entry) c1136b.next();
                        kotlin.jvm.internal.j.d(entry, "next()");
                        j jVar = (j) entry.getKey();
                        l lVar = (l) entry.getValue();
                        while (lVar.f2309a.compareTo(this.f2313c) > 0 && !this.f2316g && this.f2312b.f10113e.containsKey(jVar)) {
                            c cVar = e.Companion;
                            f state = lVar.f2309a;
                            cVar.getClass();
                            kotlin.jvm.internal.j.e(state, "state");
                            int ordinal = state.ordinal();
                            e eVar = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : e.ON_PAUSE : e.ON_STOP : e.ON_DESTROY;
                            if (eVar == null) {
                                throw new IllegalStateException("no event down from " + lVar.f2309a);
                            }
                            this.f2317h.add(eVar.a());
                            lVar.a(kVar, eVar);
                            ArrayList arrayList = this.f2317h;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C1137c c1137c4 = this.f2312b.f10125b;
                if (!this.f2316g && c1137c4 != null && this.f2313c.compareTo(((l) c1137c4.f10118b).f2309a) > 0) {
                    C1135a c1135a3 = this.f2312b;
                    c1135a3.getClass();
                    C1138d c1138d = new C1138d(c1135a3);
                    c1135a3.f10126c.put(c1138d, Boolean.FALSE);
                    while (c1138d.hasNext() && !this.f2316g) {
                        Map.Entry entry2 = (Map.Entry) c1138d.next();
                        j jVar2 = (j) entry2.getKey();
                        l lVar2 = (l) entry2.getValue();
                        while (lVar2.f2309a.compareTo(this.f2313c) < 0 && !this.f2316g && this.f2312b.f10113e.containsKey(jVar2)) {
                            this.f2317h.add(lVar2.f2309a);
                            c cVar2 = e.Companion;
                            f state2 = lVar2.f2309a;
                            cVar2.getClass();
                            kotlin.jvm.internal.j.e(state2, "state");
                            int ordinal2 = state2.ordinal();
                            e eVar2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : e.ON_RESUME : e.ON_START : e.ON_CREATE;
                            if (eVar2 == null) {
                                throw new IllegalStateException("no event up from " + lVar2.f2309a);
                            }
                            lVar2.a(kVar, eVar2);
                            ArrayList arrayList2 = this.f2317h;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
