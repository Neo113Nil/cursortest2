package Hj0;

import J4.s;
import android.content.Context;
import gi.C6740b;
import ii0.C7082a;
import ii0.C7083b;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import qj.C9067a;
import ru.ozon.tracker.db.TrackerDataBase;

/* renamed from: Hj0.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3154k implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11180a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f11181b;

    public /* synthetic */ C3154k(Pc.a aVar, int i11) {
        this.f11180a = i11;
        this.f11181b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Pc.a aVar = this.f11181b;
        switch (this.f11180a) {
            case 0:
                Context context = (Context) ((Jb.f) aVar).get();
                Intrinsics.checkNotNullParameter(context, "context");
                s.a a11 = J4.r.a(TrackerDataBase.class, "Database.db.tracker.ozon.ru", context);
                a11.b(C7083b.q());
                a11.b(C7083b.a());
                a11.b(C7083b.b());
                a11.b(C7083b.c());
                a11.b(C7083b.d());
                a11.b(C7083b.e());
                a11.b(C7083b.f());
                a11.b(C7083b.g());
                a11.b(C7083b.h());
                a11.b(C7083b.i());
                a11.b(C7083b.j());
                a11.b(C7083b.k());
                a11.b(C7083b.l());
                a11.b(C7083b.m());
                a11.b(C7083b.n());
                a11.b(C7083b.o());
                a11.b(C7083b.p());
                a11.g();
                a11.a(new C7082a());
                a11.e();
                return (TrackerDataBase) a11.d();
            case 1:
                return new Sj0.a(Jb.d.a(aVar));
            case 2:
                Context context2 = (Context) ((C3144a) aVar).get();
                Intrinsics.checkNotNullParameter(context2, "context");
                return new C9067a(context2);
            default:
                Map factories = (Map) ((Jb.h) aVar).get();
                Intrinsics.checkNotNullParameter(factories, "factories");
                return new C6740b(factories);
        }
    }

    public C3154k(fZ.b bVar, C3144a c3144a) {
        this.f11180a = 2;
        this.f11181b = c3144a;
    }
}
