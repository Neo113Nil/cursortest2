package C0;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f323c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0.o f324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f325e;

    public /* synthetic */ b(t0.o oVar, Object obj, int i2) {
        this.f323c = i2;
        this.f324d = oVar;
        this.f325e = obj;
    }

    @Override // C0.c
    public final void b() {
        WorkDatabase workDatabase;
        switch (this.f323c) {
            case 0:
                t0.o oVar = this.f324d;
                workDatabase = oVar.f11884c;
                workDatabase.c();
                try {
                    c.a(oVar, ((UUID) this.f325e).toString());
                    workDatabase.o();
                    workDatabase.k();
                    t0.i.a(oVar.f11883b, oVar.f11884c, oVar.f11886e);
                    return;
                } finally {
                    workDatabase.k();
                }
            default:
                t0.o oVar2 = this.f324d;
                workDatabase = oVar2.f11884c;
                workDatabase.c();
                try {
                    Iterator it = workDatabase.t().f((String) this.f325e).iterator();
                    while (it.hasNext()) {
                        c.a(oVar2, (String) it.next());
                    }
                    workDatabase.o();
                    return;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }
}
