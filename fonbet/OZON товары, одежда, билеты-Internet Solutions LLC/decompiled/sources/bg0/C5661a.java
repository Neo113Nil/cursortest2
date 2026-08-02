package bg0;

import We.E;
import We.G;
import We.InterfaceC4865g;
import bg0.i;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: bg0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5661a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final h f55989a;

    public C5661a(@NotNull h mockServer) {
        Intrinsics.checkNotNullParameter(mockServer, "mockServer");
        this.f55989a = mockServer;
    }

    @NotNull
    public final i a(@NotNull E client) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(client, "client");
        h hVar = this.f55989a;
        hVar.b();
        try {
            G request = hVar.e("/test");
            Intrinsics.checkNotNullParameter(client, "<this>");
            Intrinsics.checkNotNullParameter(request, "request");
            InterfaceC4865g a11 = client.a(request);
            a11.timeout().g(1L, TimeUnit.NANOSECONDS);
            a11.execute();
            return new i.a("Timeout error");
        } catch (Exception unused) {
            return i.b.f56014a;
        }
    }
}
