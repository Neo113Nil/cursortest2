package K0;

import l1.C7807Z;
import l1.K0;
import org.jetbrains.annotations.NotNull;
import r1.C9156d;
import r1.C9157e;
import r1.m;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static C9156d f14849a;

    @NotNull
    public static final C9156d a() {
        long j11;
        C9156d c9156d = f14849a;
        if (c9156d != null) {
            return c9156d;
        }
        C9156d.a aVar = new C9156d.a("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i11 = m.f82827b;
        j11 = C7807Z.f72248b;
        K0 k02 = new K0(j11);
        C9157e c9157e = new C9157e();
        c9157e.f(8.59f, 16.59f);
        c9157e.d(13.17f, 12.0f);
        c9157e.d(8.59f, 7.41f);
        c9157e.d(10.0f, 6.0f);
        c9157e.e(6.0f, 6.0f);
        c9157e.e(-6.0f, 6.0f);
        c9157e.e(-1.41f, -1.41f);
        c9157e.a();
        aVar.b(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, "", c9157e.b(), k02, null);
        C9156d e11 = aVar.e();
        f14849a = e11;
        return e11;
    }
}
