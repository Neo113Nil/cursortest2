package Ej;

import We.C;
import We.E;
import We.G;
import We.K;
import We.L;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.LogEntry;

/* loaded from: classes6.dex */
public final class h<E extends LogEntry> implements e<E> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final E f8009a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final G f8010b;

    public h(@NotNull ru.ozon.android.ozonLogger.core.e<? super E> config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f8009a = new E(new E.a());
        G.a aVar = new G.a();
        aVar.k("https://xapi.ozon.ru/api/logs-shredder/log");
        aVar.a("Cache-Control", "no-cache");
        aVar.a("Accept", "application/json");
        aVar.a("Content-Type", "application/json");
        aVar.a("Content-Encoding", "gzip");
        aVar.a("Authorization", "Bearer " + config.d());
        this.f8010b = aVar.b();
    }

    public final void b(@NotNull List<? extends E> entries) throws IOException {
        Intrinsics.checkNotNullParameter(entries, "entries");
        K.Companion companion = K.INSTANCE;
        String V11 = C7714v.V(entries, "\n", null, null, new f(), 30);
        C.f33536g.getClass();
        C a11 = C.a.a("application/json; charset=utf-8");
        companion.getClass();
        g gVar = new g(K.Companion.b(V11, a11));
        G g10 = this.f8010b;
        g10.getClass();
        G.a aVar = new G.a(g10);
        aVar.g(gVar);
        L execute = this.f8009a.a(aVar.b()).execute();
        try {
            if (execute.v()) {
                Unit unit = Unit.f71690a;
                execute.close();
            } else {
                throw new IOException("Request is not successful, code = " + execute.m() + "!");
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                Vd0.b.a(execute, th2);
                throw th3;
            }
        }
    }
}
