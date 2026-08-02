package n1;

import W5.D;
import androidx.work.impl.WorkDatabase;
import e1.AbstractC0997d;
import java.util.Iterator;

/* renamed from: n1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1447b extends D {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15297c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e1.l f15298d;

    public /* synthetic */ C1447b(e1.l lVar, int i7) {
        this.f15297c = i7;
        this.f15298d = lVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // W5.D
    public final void d() {
        switch (this.f15297c) {
            case 0:
                e1.l lVar = this.f15298d;
                WorkDatabase workDatabase = lVar.f12546f;
                workDatabase.c();
                try {
                    Iterator it = workDatabase.n().j().iterator();
                    while (it.hasNext()) {
                        D.a(lVar, (String) it.next());
                    }
                    workDatabase.h();
                    workDatabase.f();
                    AbstractC0997d.a(lVar.f12545e, lVar.f12546f, lVar.f12548y);
                    return;
                } catch (Throwable th) {
                    workDatabase.f();
                    throw th;
                }
            default:
                e1.l lVar2 = this.f15298d;
                WorkDatabase workDatabase2 = lVar2.f12546f;
                workDatabase2.c();
                try {
                    Iterator it2 = workDatabase2.n().i().iterator();
                    while (it2.hasNext()) {
                        D.a(lVar2, (String) it2.next());
                    }
                    workDatabase2.h();
                    workDatabase2.f();
                    return;
                } catch (Throwable th2) {
                    workDatabase2.f();
                    throw th2;
                }
        }
    }
}
