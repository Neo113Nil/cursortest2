package Af0;

import Sc.C4001c;
import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q20.c;
import qf0.EnumC9053a;
import ru.ozon.android.ozonLogger.core.h;
import sj.f;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Function0<c> f1196a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f1197b = k.b(C0038a.f1198b);

    /* renamed from: Af0.a$a, reason: collision with other inner class name */
    static final class C0038a extends AbstractC7737t implements Function0<h> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0038a f1198b = new C0038a(0);

        @Override // kotlin.jvm.functions.Function0
        public final h invoke() {
            return Xf0.a.a(new sj.a("Network", "domain_reachability", Boolean.TRUE));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Function0<? extends c> function0) {
        this.f1196a = function0;
    }

    public static final h a(a aVar) {
        return (h) aVar.f1197b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d() {
        Function0<c> function0 = this.f1196a;
        return (function0 != null ? function0.invoke() : null) == c.QA_BUILDS_OR_AUTOTEST;
    }

    public final void c(@NotNull Throwable throwable) {
        h hVar;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!d() || (hVar = (h) this.f1197b.getValue()) == null) {
            return;
        }
        String message = throwable.getMessage();
        if (message == null) {
            message = "";
        }
        h.a.a(hVar, message, f.b(new Pair("stack_trace", C4001c.b(throwable))), null, 4);
    }

    public final void e(@NotNull String domain, @NotNull EnumC9053a status) {
        h hVar;
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(status, "status");
        if (!d() || (hVar = (h) this.f1197b.getValue()) == null) {
            return;
        }
        hVar.b("OZON_NETWORK_PING_STATUS " + ((Object) Rf0.a.a(domain, status)), null, null);
    }
}
