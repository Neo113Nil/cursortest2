package V2;

import De.C2862e;
import Pl0.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xe.C10720e0;
import xe.N;
import xe.X0;

/* loaded from: classes.dex */
public final class b {
    public static e a(String name, S2.b bVar, h.d dVar, C2862e scope, int i11) {
        if ((i11 & 2) != 0) {
            bVar = null;
        }
        Function1 produceMigrations = dVar;
        if ((i11 & 4) != 0) {
            produceMigrations = a.f27942b;
        }
        if ((i11 & 8) != 0) {
            C10720e0 c10720e0 = C10720e0.f105451a;
            scope = N.a(He.b.f10879b.plus(X0.b()));
        }
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new e(name, bVar, produceMigrations, scope);
    }
}
