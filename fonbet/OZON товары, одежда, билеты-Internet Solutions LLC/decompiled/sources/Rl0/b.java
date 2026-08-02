package Rl0;

import dm0.InterfaceC6216a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Kl0.a f25164a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC6216a f25165b;

    public b(@NotNull Kl0.a authIPCClient, @NotNull InterfaceC6216a pushIPCClient) {
        Intrinsics.checkNotNullParameter(authIPCClient, "authIPCClient");
        Intrinsics.checkNotNullParameter(pushIPCClient, "pushIPCClient");
        this.f25164a = authIPCClient;
        this.f25165b = pushIPCClient;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f25164a, bVar.f25164a) && Intrinsics.d(this.f25165b, bVar.f25165b);
    }

    public final int hashCode() {
        return this.f25165b.hashCode() + (this.f25164a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "SubscribeIPCClientsDto(authIPCClient=" + this.f25164a + ", pushIPCClient=" + this.f25165b + ')';
    }
}
