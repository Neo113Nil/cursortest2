package n1;

import W5.D;
import androidx.work.impl.WorkDatabase;
import e1.AbstractC0997d;
import java.util.UUID;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1446a extends D {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1.l f15295c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UUID f15296d;

    public C1446a(e1.l lVar, UUID uuid) {
        this.f15295c = lVar;
        this.f15296d = uuid;
    }

    @Override // W5.D
    public final void d() {
        e1.l lVar = this.f15295c;
        WorkDatabase workDatabase = lVar.f12546f;
        workDatabase.c();
        try {
            D.a(lVar, this.f15296d.toString());
            workDatabase.h();
            workDatabase.f();
            AbstractC0997d.a(lVar.f12545e, lVar.f12546f, lVar.f12548y);
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
