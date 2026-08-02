package M0;

import l1.C7807Z;
import l1.K0;
import org.jetbrains.annotations.NotNull;
import r1.C9156d;
import r1.C9157e;
import r1.m;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static C9156d f17207a;

    @NotNull
    public static final C9156d a() {
        long j11;
        C9156d c9156d = f17207a;
        if (c9156d != null) {
            return c9156d;
        }
        C9156d.a aVar = new C9156d.a("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i11 = m.f82827b;
        j11 = C7807Z.f72248b;
        K0 k02 = new K0(j11);
        C9157e c9157e = new C9157e();
        c9157e.f(19.0f, 6.41f);
        c9157e.d(17.59f, 5.0f);
        c9157e.d(12.0f, 10.59f);
        c9157e.d(6.41f, 5.0f);
        c9157e.d(5.0f, 6.41f);
        c9157e.d(10.59f, 12.0f);
        c9157e.d(5.0f, 17.59f);
        c9157e.d(6.41f, 19.0f);
        c9157e.d(12.0f, 13.41f);
        c9157e.d(17.59f, 19.0f);
        c9157e.d(19.0f, 17.59f);
        c9157e.d(13.41f, 12.0f);
        c9157e.a();
        aVar.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, "", c9157e.b(), k02, null);
        C9156d e11 = aVar.e();
        f17207a = e11;
        return e11;
    }
}
