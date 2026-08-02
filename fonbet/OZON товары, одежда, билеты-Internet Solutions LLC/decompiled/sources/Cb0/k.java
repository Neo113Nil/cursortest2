package Cb0;

import dc0.C6154S;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zb0.c;
import zb0.f;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<c.b> f4651a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<f.a> f4652b;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@NotNull List<? extends c.b> authCookieEventListeners, @NotNull List<? extends f.a> cookieListeners) {
        Intrinsics.checkNotNullParameter(authCookieEventListeners, "authCookieEventListeners");
        Intrinsics.checkNotNullParameter(cookieListeners, "cookieListeners");
        this.f4651a = authCookieEventListeners;
        this.f4652b = cookieListeners;
    }

    public final void a(@NotNull zb0.c event, C6154S c6154s) {
        f.b bVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator<T> it = this.f4651a.iterator();
        while (it.hasNext()) {
            ((c.b) it.next()).a(event);
        }
        if (event instanceof c.AbstractC2326c) {
            bVar = f.b.Login;
        } else if (event instanceof c.a) {
            bVar = f.b.Logout;
        } else {
            if (!(event instanceof c.d)) {
                boolean z11 = event instanceof c.e;
                return;
            }
            bVar = f.b.SwitchUser;
        }
        zb0.f fVar = new zb0.f(new j(bVar, c6154s));
        Iterator<T> it2 = this.f4652b.iterator();
        while (it2.hasNext()) {
            ((f.a) it2.next()).a(fVar);
        }
    }
}
