package Rl0;

import Ml0.i;
import dm0.InterfaceC6216a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Kl0.a f25162a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC6216a f25163b;

    public a(@NotNull Kl0.a authIPCClient, @NotNull InterfaceC6216a pushIPCClient, i iVar) {
        Intrinsics.checkNotNullParameter(authIPCClient, "authIPCClient");
        Intrinsics.checkNotNullParameter(pushIPCClient, "pushIPCClient");
        this.f25162a = authIPCClient;
        this.f25163b = pushIPCClient;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f25162a, aVar.f25162a) && Intrinsics.d(this.f25163b, aVar.f25163b) && Intrinsics.d(null, null);
    }

    public final int hashCode() {
        return ((this.f25163b.hashCode() + (this.f25162a.hashCode() * 31)) * 31) + 0;
    }

    @NotNull
    public final String toString() {
        return "IPCClientsDto(authIPCClient=" + this.f25162a + ", pushIPCClient=" + this.f25163b + ", testPushIPCClient=" + ((Object) null) + ')';
    }
}
