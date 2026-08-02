package We;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
final class t implements u {
    @Override // We.u
    @NotNull
    public final List<InetAddress> a(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            Intrinsics.checkNotNullExpressionValue(allByName, "InetAddress.getAllByName(hostname)");
            return C7705l.f0(allByName);
        } catch (NullPointerException e11) {
            UnknownHostException unknownHostException = new UnknownHostException(Nk.a.b("Broken system behaviour for dns lookup of ", hostname));
            unknownHostException.initCause(e11);
            throw unknownHostException;
        }
    }
}
