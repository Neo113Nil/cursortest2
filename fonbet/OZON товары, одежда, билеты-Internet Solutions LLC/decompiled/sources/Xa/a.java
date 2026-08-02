package Xa;

import Ja.i;
import V.e;
import Xa.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f34230a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f34231b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34232c;

    public a(boolean z11, boolean z12, boolean z13) {
        this.f34230a = z11;
        this.f34231b = z12;
        this.f34232c = z13;
    }

    @Override // Xa.b
    @NotNull
    public final b.a a(@NotNull String location, @NotNull i httpRequest) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(httpRequest, "httpRequest");
        if (!this.f34232c) {
            return b.a.C0611b.f34234a;
        }
        if (!this.f34230a) {
            throw new Ha.a(e.a("All redirects disabled. Trying to redirect from origin '", httpRequest.k(), "' to '", location, "'"));
        }
        boolean l11 = httpRequest.l();
        boolean z11 = this.f34231b;
        if (l11 && h.e0(location, "https://", false) && !z11) {
            throw new Ha.a(e.a("SSL redirects disabled. Trying to redirect from origin '", httpRequest.k(), "' to '", location, "'"));
        }
        if (httpRequest.m() && h.e0(location, "http://", false) && !z11) {
            throw new Ha.a(e.a("SSL redirects disabled. Trying to redirect from origin '", httpRequest.k(), "' to '", location, "'"));
        }
        return b.a.C0610a.f34233a;
    }
}
