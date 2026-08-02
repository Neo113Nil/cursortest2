package Ze;

import We.A;
import We.C4859a;
import We.C4868j;
import We.G;
import We.InterfaceC4861c;
import We.L;
import We.O;
import We.r;
import We.u;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class b implements InterfaceC4861c {
    private static InetAddress b(Proxy proxy, A a11, u uVar) throws IOException {
        Proxy.Type type = proxy.type();
        if (type != null && a.f35900a[type.ordinal()] == 1) {
            return (InetAddress) C7714v.K(uVar.a(a11.h()));
        }
        SocketAddress address = proxy.address();
        if (address == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
        }
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        Intrinsics.checkNotNullExpressionValue(address2, "(address() as InetSocketAddress).address");
        return address2;
    }

    @Override // We.InterfaceC4861c
    public final G a(O o11, @NotNull L response) throws IOException {
        Proxy proxy;
        u uVar;
        PasswordAuthentication requestPasswordAuthentication;
        C4859a a11;
        Intrinsics.checkNotNullParameter(response, "response");
        List<C4868j> k11 = response.k();
        G L11 = response.L();
        A j11 = L11.j();
        boolean z11 = response.m() == 407;
        if (o11 == null || (proxy = o11.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C4868j c4868j : k11) {
            if ("Basic".equalsIgnoreCase(c4868j.c())) {
                if (o11 == null || (a11 = o11.a()) == null || (uVar = a11.c()) == null) {
                    uVar = u.f33807a;
                }
                if (z11) {
                    SocketAddress address = proxy.address();
                    if (address == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, j11, uVar), inetSocketAddress.getPort(), j11.u(), c4868j.b(), c4868j.c(), j11.x(), Authenticator.RequestorType.PROXY);
                } else {
                    String h11 = j11.h();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(h11, b(proxy, j11, uVar), j11.n(), j11.u(), c4868j.b(), c4868j.c(), j11.x(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    String str = z11 ? "Proxy-Authorization" : "Authorization";
                    String userName = requestPasswordAuthentication.getUserName();
                    Intrinsics.checkNotNullExpressionValue(userName, "auth.userName");
                    char[] password = requestPasswordAuthentication.getPassword();
                    Intrinsics.checkNotNullExpressionValue(password, "auth.password");
                    String a12 = r.a(userName, new String(password), c4868j.a());
                    G.a aVar = new G.a(L11);
                    aVar.d(str, a12);
                    return aVar.b();
                }
            }
        }
        return null;
    }
}
