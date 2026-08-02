package Rb0;

import Gb0.d;
import Kb0.K;
import Od0.a;
import Sb0.b;
import Sb0.c;
import Sb0.e;
import Sc.InterfaceC4008j;
import android.net.Uri;
import java.util.Iterator;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q20.InterfaceC8978a;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<e> f24968a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<b> f24969b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<c> f24970c;

    public a(@NotNull InterfaceC4008j<e> ozonIdLinkHandlerReset, @NotNull InterfaceC4008j<b> ozonIdLinkHandlerLogin, @NotNull InterfaceC4008j<c> ozonIdLinkHandlerLogout) {
        Intrinsics.checkNotNullParameter(ozonIdLinkHandlerReset, "ozonIdLinkHandlerReset");
        Intrinsics.checkNotNullParameter(ozonIdLinkHandlerLogin, "ozonIdLinkHandlerLogin");
        Intrinsics.checkNotNullParameter(ozonIdLinkHandlerLogout, "ozonIdLinkHandlerLogout");
        this.f24968a = ozonIdLinkHandlerReset;
        this.f24969b = ozonIdLinkHandlerLogin;
        this.f24970c = ozonIdLinkHandlerLogout;
    }

    @NotNull
    public final Od0.a a(@NotNull Uri link, @NotNull String path, @NotNull Ld0.c store) {
        Object obj;
        Intrinsics.checkNotNullParameter(link, "uri");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(store, "store");
        Gb0.b.c(Gb0.a.RESET);
        Iterator it = C7714v.b0("reset", Gb0.b.b(d.LOGIN), Gb0.b.b(d.FORCE_LOGIN), Gb0.b.a(Gb0.c.LOGOUT), Gb0.b.a(Gb0.c.FORCE_LOGOUT)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (path.equalsIgnoreCase((String) obj)) {
                break;
            }
        }
        boolean z11 = obj != null;
        q20.c c11 = ((InterfaceC8978a) store.e(InterfaceC8978a.class)).c();
        if (z11 && c11 != q20.c.QA_BUILDS_OR_AUTOTEST) {
            return new a.b("Не может быть обработано на текущем DevToolsLevel", null);
        }
        Gb0.b.c(Gb0.a.RESET);
        if (path.equalsIgnoreCase("reset")) {
            return this.f24968a.getValue().c();
        }
        boolean equalsIgnoreCase = path.equalsIgnoreCase(Gb0.b.b(d.LOGIN));
        InterfaceC4008j<b> interfaceC4008j = this.f24969b;
        if (equalsIgnoreCase) {
            return interfaceC4008j.getValue().d();
        }
        if (path.equalsIgnoreCase(Gb0.b.b(d.FORCE_LOGIN))) {
            return interfaceC4008j.getValue().c(link);
        }
        boolean equalsIgnoreCase2 = path.equalsIgnoreCase(Gb0.b.a(Gb0.c.LOGOUT));
        InterfaceC4008j<c> interfaceC4008j2 = this.f24970c;
        if (equalsIgnoreCase2) {
            return interfaceC4008j2.getValue().a();
        }
        if (!path.equalsIgnoreCase(Gb0.b.a(Gb0.c.FORCE_LOGOUT))) {
            return new a.b("Не поддерживаемый OzonID диплинк", null);
        }
        interfaceC4008j2.getValue().getClass();
        Intrinsics.checkNotNullParameter(link, "link");
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        k11.J().c().getValue().c(link.getBooleanQueryParameter("resetCookie", true));
        return new a.C0408a();
    }
}
