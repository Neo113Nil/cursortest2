package p096n1;

import W5.D;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import p031e1.d;
import p031e1.l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f15304d;

    public /* synthetic */ b(l lVar, int i7) {
        this.f15303c = i7;
        this.f15304d = lVar;
    }

    @Override // W5.D
    public final void d() {
        switch (this.f15303c) {
            case 0:
                l lVar = this.f15304d;
                WorkDatabase workDatabase = lVar.f12552f;
                workDatabase.c();
                try {
                    Iterator it = workDatabase.n().j().iterator();
                    while (it.hasNext()) {
                        D.a(lVar, (String) it.next());
                    }
                    workDatabase.h();
                    workDatabase.f();
                    d.a(lVar.f12551e, lVar.f12552f, lVar.f12554y);
                    return;
                } catch (Throwable th) {
                    workDatabase.f();
                    throw th;
                }
            default:
                l lVar2 = this.f15304d;
                WorkDatabase workDatabase2 = lVar2.f12552f;
                workDatabase2.c();
                try {
                    Iterator it2 = workDatabase2.n().i().iterator();
                    while (it2.hasNext()) {
                        D.a(lVar2, (String) it2.next());
                    }
                    workDatabase2.h();
                    return;
                } finally {
                    workDatabase2.f();
                }
        }
    }
}
