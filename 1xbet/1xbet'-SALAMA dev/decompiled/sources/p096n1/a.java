package p096n1;

import W5.D;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import p031e1.d;
import p031e1.l;

/* JADX INFO: loaded from: classes.dex */
public final class a extends D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f15301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UUID f15302d;

    public a(l lVar, UUID uuid) {
        this.f15301c = lVar;
        this.f15302d = uuid;
    }

    @Override // W5.D
    public final void d() {
        l lVar = this.f15301c;
        WorkDatabase workDatabase = lVar.f12552f;
        workDatabase.c();
        try {
            D.a(lVar, this.f15302d.toString());
            workDatabase.h();
            workDatabase.f();
            d.a(lVar.f12551e, lVar.f12552f, lVar.f12554y);
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
