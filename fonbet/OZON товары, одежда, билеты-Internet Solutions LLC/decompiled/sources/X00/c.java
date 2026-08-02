package X00;

import L00.c;
import L00.g;
import L00.h;
import L00.j;
import We.C;
import We.E;
import We.G;
import We.InterfaceC4865g;
import We.J;
import We.K;
import We.L;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c implements L00.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final E f33949a;

    public c(@NotNull E client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f33949a = client;
    }

    @Override // L00.b
    @NotNull
    public final j execute(@NotNull L00.c call) {
        Intrinsics.checkNotNullParameter(call, "call");
        g c11 = call.c();
        Intrinsics.checkNotNullParameter(c11, "<this>");
        G.a aVar = new G.a();
        aVar.k(c11.j());
        String e11 = c11.e();
        h c12 = c11.c();
        J j11 = null;
        C c13 = null;
        if (c12 != null) {
            Intrinsics.checkNotNullParameter(c12, "<this>");
            K.Companion companion = K.INSTANCE;
            byte[] b11 = c12.b();
            String c14 = c12.c();
            if (c14 != null) {
                C.f33536g.getClass();
                c13 = C.a.b(c14);
            }
            int a11 = c12.a();
            companion.getClass();
            j11 = K.Companion.c(b11, c13, 0, a11);
        }
        aVar.f(j11, e11);
        for (Map.Entry<String, String> entry : c11.d().entrySet()) {
            aVar.d(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Class<?>, Object> entry2 : c11.i().entrySet()) {
            Class<?> key = entry2.getKey();
            Object value = entry2.getValue();
            Intrinsics.g(key, "null cannot be cast to non-null type java.lang.Class<in kotlin.Any>");
            aVar.i(key, value);
        }
        final InterfaceC4865g a12 = this.f33949a.a(aVar.b());
        call.d(new c.a() { // from class: X00.b
            @Override // L00.c.a
            public final void cancel() {
                InterfaceC4865g.this.cancel();
            }
        });
        L execute = a12.execute();
        try {
            j a13 = Z00.a.a(execute, c11);
            execute.close();
            return a13;
        } finally {
        }
    }
}
