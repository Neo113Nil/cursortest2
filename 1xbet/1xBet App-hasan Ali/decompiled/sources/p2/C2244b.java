package p2;

import androidx.work.impl.WorkDatabase;
import g2.AbstractC1980d;
import java.util.ArrayList;

/* renamed from: p2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2244b extends AbstractRunnableC2245c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f18690l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g2.l f18691m;

    public /* synthetic */ C2244b(g2.l lVar, int i) {
        this.f18690l = i;
        this.f18691m = lVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // p2.AbstractRunnableC2245c
    public final void b() {
        switch (this.f18690l) {
            case 0:
                g2.l lVar = this.f18691m;
                WorkDatabase workDatabase = lVar.f17130m;
                workDatabase.c();
                try {
                    ArrayList g5 = workDatabase.n().g();
                    int size = g5.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = g5.get(i);
                        i++;
                        AbstractRunnableC2245c.a(lVar, (String) obj);
                    }
                    workDatabase.h();
                    workDatabase.f();
                    AbstractC1980d.a(lVar.f17129l, lVar.f17130m, lVar.f17132o);
                    return;
                } catch (Throwable th) {
                    workDatabase.f();
                    throw th;
                }
            default:
                g2.l lVar2 = this.f18691m;
                WorkDatabase workDatabase2 = lVar2.f17130m;
                workDatabase2.c();
                try {
                    ArrayList f = workDatabase2.n().f();
                    int size2 = f.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj2 = f.get(i5);
                        i5++;
                        AbstractRunnableC2245c.a(lVar2, (String) obj2);
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
