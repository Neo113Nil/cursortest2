package Q2;

import De.C2862e;
import Ve.Zm;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class b {
    public static e a(Zm serializer, S2.b bVar, C2862e scope) {
        Intrinsics.checkNotNullParameter("secure_token_prefs.pb", "fileName");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        a produceMigrations = a.f22933b;
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new e(new f(serializer), bVar, produceMigrations, scope);
    }
}
