package Ve;

import Lm0.a;
import We.C;
import We.G;
import We.K;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Bh implements Am0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ We.E f28706a;

    public Bh(We.E e11) {
        this.f28706a = e11;
    }

    @Override // Am0.a
    public final int a(String url, String requestBody) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        G.a aVar = new G.a();
        aVar.k(url);
        K.Companion companion = We.K.INSTANCE;
        We.C.f33536g.getClass();
        We.C a11 = C.a.a("application/json");
        companion.getClass();
        aVar.g(K.Companion.b(requestBody, a11));
        int i11 = -1;
        try {
            We.L execute = this.f28706a.a(aVar.b()).execute();
            try {
                i11 = execute.m();
                Unit unit = Unit.f71690a;
                execute.close();
                return i11;
            } finally {
            }
        } catch (Exception e11) {
            a.b bVar = Lm0.a.f17149a;
            bVar.b("METRIC_EXCEPTION");
            bVar.e(e11);
            return i11;
        }
    }
}
