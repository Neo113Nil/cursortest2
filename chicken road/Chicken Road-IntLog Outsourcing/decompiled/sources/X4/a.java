package X4;

import T4.C;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final r f3523a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3524b;

    /* renamed from: c, reason: collision with root package name */
    public final Y4.i f3525c;

    public a(r call, f fVar, Y4.i iVar) {
        kotlin.jvm.internal.i.e(call, "call");
        this.f3523a = call;
        this.f3524b = fVar;
        this.f3525c = iVar;
    }

    public final void a(s connection) {
        kotlin.jvm.internal.i.e(connection, "connection");
        r rVar = this.f3523a;
        rVar.getClass();
        TimeZone timeZone = U4.e.f3179a;
        if (rVar.f3596h != null) {
            throw new IllegalStateException("Check failed.");
        }
        rVar.f3596h = connection;
        connection.f3622s.add(new p(rVar, rVar.f3594f));
    }

    public final void b(e connectPlan) {
        kotlin.jvm.internal.i.e(connectPlan, "connectPlan");
        this.f3523a.f3604p.add(connectPlan);
    }

    public final void c(C route) {
        kotlin.jvm.internal.i.e(route, "route");
        this.f3523a.getClass();
        InetSocketAddress inetSocketAddress = route.f2807c;
        kotlin.jvm.internal.i.e(inetSocketAddress, "inetSocketAddress");
    }

    public final s d() {
        return this.f3523a.f3596h;
    }

    public final void e(C route, IOException iOException) {
        kotlin.jvm.internal.i.e(route, "route");
        this.f3523a.getClass();
        InetSocketAddress inetSocketAddress = route.f2807c;
        kotlin.jvm.internal.i.e(inetSocketAddress, "inetSocketAddress");
    }

    public final void f(C route) {
        kotlin.jvm.internal.i.e(route, "route");
        this.f3523a.getClass();
        InetSocketAddress inetSocketAddress = route.f2807c;
        kotlin.jvm.internal.i.e(inetSocketAddress, "inetSocketAddress");
    }

    public final void g(s connection) {
        kotlin.jvm.internal.i.e(connection, "connection");
        this.f3523a.getClass();
    }

    public final void h(s connection) {
        kotlin.jvm.internal.i.e(connection, "connection");
        connection.f3614k.getClass();
        r call = this.f3523a;
        kotlin.jvm.internal.i.e(call, "call");
    }

    public final void i(s sVar) {
    }

    public final boolean j() {
        return !kotlin.jvm.internal.i.a((String) this.f3525c.f3716e.f1784d, "GET");
    }

    public final boolean k() {
        return this.f3523a.f3602n;
    }

    public final void l(s sVar) {
    }

    public final Socket m() {
        return this.f3523a.i();
    }

    public final void n(e connectPlan) {
        kotlin.jvm.internal.i.e(connectPlan, "connectPlan");
        this.f3523a.f3604p.remove(connectPlan);
    }
}
