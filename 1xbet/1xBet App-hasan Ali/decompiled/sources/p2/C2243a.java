package p2;

import androidx.work.impl.WorkDatabase;
import g2.AbstractC1980d;
import java.util.UUID;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2243a extends AbstractRunnableC2245c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g2.l f18688l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ UUID f18689m;

    public C2243a(g2.l lVar, UUID uuid) {
        this.f18688l = lVar;
        this.f18689m = uuid;
    }

    @Override // p2.AbstractRunnableC2245c
    public final void b() {
        g2.l lVar = this.f18688l;
        WorkDatabase workDatabase = lVar.f17130m;
        workDatabase.c();
        try {
            AbstractRunnableC2245c.a(lVar, this.f18689m.toString());
            workDatabase.h();
            workDatabase.f();
            AbstractC1980d.a(lVar.f17129l, lVar.f17130m, lVar.f17132o);
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
