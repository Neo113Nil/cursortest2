package K0;

import l1.C7807Z;
import l1.K0;
import org.jetbrains.annotations.NotNull;
import r1.C9156d;
import r1.C9157e;
import r1.m;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static C9156d f14848a;

    @NotNull
    public static final C9156d a() {
        long j11;
        C9156d c9156d = f14848a;
        if (c9156d != null) {
            return c9156d;
        }
        C9156d.a aVar = new C9156d.a("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i11 = m.f82827b;
        j11 = C7807Z.f72248b;
        K0 k02 = new K0(j11);
        C9157e c9157e = new C9157e();
        c9157e.f(20.0f, 11.0f);
        c9157e.c(7.83f);
        c9157e.e(5.59f, -5.59f);
        c9157e.d(12.0f, 4.0f);
        c9157e.e(-8.0f, 8.0f);
        c9157e.e(8.0f, 8.0f);
        c9157e.e(1.41f, -1.41f);
        c9157e.d(7.83f, 13.0f);
        c9157e.c(20.0f);
        c9157e.g();
        c9157e.a();
        aVar.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, "", c9157e.b(), k02, null);
        C9156d e11 = aVar.e();
        f14848a = e11;
        return e11;
    }
}
