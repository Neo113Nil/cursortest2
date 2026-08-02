package bg0;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import We.E;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x0<List<c>> f55993a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final M0<List<c>> f55994b;

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private final E f55995a;

        /* renamed from: b, reason: collision with root package name */
        private final String f55996b;

        /* renamed from: c, reason: collision with root package name */
        private final C0840a f55997c;

        /* renamed from: bg0.d$a$a, reason: collision with other inner class name */
        public static final class C0840a extends M1.b {

            /* renamed from: a, reason: collision with root package name */
            private final boolean f55998a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f55999b;

            C0840a(pf0.i iVar) {
                this.f55998a = iVar.getIsCronetEnabled();
                this.f55999b = iVar.getIsGostTlsEnabled();
            }

            public final boolean t() {
                return this.f55998a;
            }

            public final boolean u() {
                return this.f55999b;
            }
        }

        a(E e11, pf0.i iVar) {
            this.f55995a = e11;
            this.f55996b = iVar.getConsumer().toString();
            this.f55997c = new C0840a(iVar);
        }

        @Override // bg0.c
        public final E a() {
            return this.f55995a;
        }

        @Override // bg0.c
        public final C0840a b() {
            return this.f55997c;
        }

        @Override // bg0.c
        public final String c() {
            return this.f55996b;
        }
    }

    public d() {
        x0<List<c>> a11 = O0.a(new ArrayList());
        this.f55993a = a11;
        this.f55994b = C2399j.b(a11);
    }

    @NotNull
    public final M0<List<c>> a() {
        return this.f55994b;
    }

    public final void b(@NotNull E client, @NotNull pf0.i ozonNetworkConfig) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(ozonNetworkConfig, "ozonNetworkConfig");
        this.f55993a.getValue().add(new a(client, ozonNetworkConfig));
    }
}
