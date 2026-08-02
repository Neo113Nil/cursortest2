package bg0;

import B0.A0;
import Nf0.k;
import We.E;
import We.L;
import We.z;
import androidx.recyclerview.widget.m;
import bg0.i;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: bg0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5662b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final h f55990a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<String> f55991b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<String> f55992c;

    public C5662b(@NotNull h networkMockServer) {
        Intrinsics.checkNotNullParameter(networkMockServer, "networkMockServer");
        this.f55990a = networkMockServer;
        this.f55991b = C7714v.b0("user-agent", "x-o3-app-name", "x-o3-app-version", "ozon-network-client");
        this.f55992c = C7714v.b0("x-o3-sample-trace", "x-o3-sdk-versions", "accept", "content-type");
    }

    @NotNull
    public final i a(@NotNull E client, @NotNull k.a configuration) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        h hVar = this.f55990a;
        hVar.c(m.e.DEFAULT_DRAG_ANIMATION_DURATION);
        L a11 = j.a(client, hVar.e("/test"));
        hVar.h();
        z e11 = a11.L().e();
        for (String str : this.f55991b) {
            if (e11.c(str) == null) {
                return new i.a(A0.b("required header ", str, " is missing"));
            }
        }
        for (String str2 : this.f55992c) {
            if (e11.c(str2) == null) {
                return new i.c(A0.b("nonRequired header ", str2, " is missing "));
            }
        }
        return (configuration.t() && e11.c("cronet-enabled") == null) ? new i.a("required header cronet-enabled is missing") : i.b.f56014a;
    }
}
