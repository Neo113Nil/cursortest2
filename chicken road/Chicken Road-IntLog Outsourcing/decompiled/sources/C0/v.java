package C0;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.UUID;

/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f370a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f371b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f372c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f374e;

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f370a = i2;
        this.f374e = obj;
        this.f371b = obj2;
        this.f372c = obj3;
        this.f373d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        B0.q g6;
        switch (this.f370a) {
            case 0:
                D0.k kVar = (D0.k) this.f373d;
                UUID uuid = (UUID) this.f371b;
                String uuid2 = uuid.toString();
                s0.s d6 = s0.s.d();
                String str = w.f375c;
                StringBuilder sb = new StringBuilder("Updating progress for ");
                sb.append(uuid);
                sb.append(" (");
                s0.g gVar = (s0.g) this.f372c;
                sb.append(gVar);
                sb.append(")");
                d6.a(str, sb.toString());
                w wVar = (w) this.f374e;
                WorkDatabase workDatabase = wVar.f376a;
                WorkDatabase workDatabase2 = wVar.f376a;
                workDatabase.c();
                try {
                    g6 = workDatabase2.t().g(uuid2);
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                if (g6 == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (g6.f174b == 2) {
                    B0.m mVar = new B0.m(uuid2, gVar);
                    B0.n s2 = workDatabase2.s();
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) s2.f167a;
                    workDatabase_Impl.b();
                    workDatabase_Impl.c();
                    try {
                        ((B0.b) s2.f168b).q(mVar);
                        workDatabase_Impl.o();
                        workDatabase_Impl.k();
                    } catch (Throwable th) {
                        workDatabase_Impl.k();
                        throw th;
                    }
                } else {
                    s0.s.d().g(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
                }
                kVar.k(null);
                workDatabase2.o();
                return;
            default:
                k.e eVar = (k.e) this.f371b;
                if (eVar != null) {
                    V0.j jVar = (V0.j) this.f374e;
                    ((k.f) jVar.f3212b).z = true;
                    eVar.f10553b.c(false);
                    ((k.f) jVar.f3212b).z = false;
                }
                k.j jVar2 = (k.j) this.f372c;
                if (jVar2.isEnabled() && jVar2.hasSubMenu()) {
                    ((k.i) this.f373d).p(jVar2, null, 4);
                    return;
                }
                return;
        }
    }
}
