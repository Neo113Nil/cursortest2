package We;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4859a f33671a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Proxy f33672b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InetSocketAddress f33673c;

    public O(@NotNull C4859a address, @NotNull Proxy proxy, @NotNull InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f33671a = address;
        this.f33672b = proxy;
        this.f33673c = socketAddress;
    }

    @NotNull
    public final C4859a a() {
        return this.f33671a;
    }

    @NotNull
    public final Proxy b() {
        return this.f33672b;
    }

    public final boolean c() {
        return this.f33671a.k() != null && this.f33672b.type() == Proxy.Type.HTTP;
    }

    @NotNull
    public final InetSocketAddress d() {
        return this.f33673c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof O)) {
            return false;
        }
        O o11 = (O) obj;
        return Intrinsics.d(o11.f33671a, this.f33671a) && Intrinsics.d(o11.f33672b, this.f33672b) && Intrinsics.d(o11.f33673c, this.f33673c);
    }

    public final int hashCode() {
        return this.f33673c.hashCode() + ((this.f33672b.hashCode() + ((this.f33671a.hashCode() + 527) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "Route{" + this.f33673c + '}';
    }
}
