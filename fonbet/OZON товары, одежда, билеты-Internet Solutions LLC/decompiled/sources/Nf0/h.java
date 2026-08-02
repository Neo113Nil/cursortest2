package Nf0;

import B90.C2618u;
import Kk.C3532b;
import We.E;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f19530a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<b> f19531b;

    public interface a {

        /* renamed from: Nf0.h$a$a, reason: collision with other inner class name */
        public static final class C0387a implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0387a f19532a = new C0387a();

            @Override // Nf0.h.a
            @NotNull
            public final String getStatus() {
                return "готово к тесту";
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f19533a = new b();

            @Override // Nf0.h.a
            @NotNull
            public final String getStatus() {
                return "тест выполняется";
            }
        }

        @NotNull
        String getStatus();
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final E f19534a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f19535b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f19536c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f19537d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f19538e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final List<String> f19539f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private final List<String> f19540g;

        public b(@NotNull E client, @NotNull String clientLocation, boolean z11, boolean z12, boolean z13, @NotNull List<String> errorMessages, @NotNull List<String> warningMessages) {
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(clientLocation, "clientLocation");
            Intrinsics.checkNotNullParameter(errorMessages, "errorMessages");
            Intrinsics.checkNotNullParameter(warningMessages, "warningMessages");
            this.f19534a = client;
            this.f19535b = clientLocation;
            this.f19536c = z11;
            this.f19537d = z12;
            this.f19538e = z13;
            this.f19539f = errorMessages;
            this.f19540g = warningMessages;
        }

        public static b a(b bVar, boolean z11, List errorMessages, List warningMessages) {
            E client = bVar.f19534a;
            String clientLocation = bVar.f19535b;
            boolean z12 = bVar.f19536c;
            boolean z13 = bVar.f19537d;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(clientLocation, "clientLocation");
            Intrinsics.checkNotNullParameter(errorMessages, "errorMessages");
            Intrinsics.checkNotNullParameter(warningMessages, "warningMessages");
            return new b(client, clientLocation, z12, z13, z11, errorMessages, warningMessages);
        }

        @NotNull
        public final E b() {
            return this.f19534a;
        }

        @NotNull
        public final String c() {
            return this.f19535b;
        }

        @NotNull
        public final List<String> d() {
            return this.f19539f;
        }

        @NotNull
        public final List<String> e() {
            return this.f19540g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.f19534a, bVar.f19534a) && Intrinsics.d(this.f19535b, bVar.f19535b) && this.f19536c == bVar.f19536c && this.f19537d == bVar.f19537d && this.f19538e == bVar.f19538e && Intrinsics.d(this.f19539f, bVar.f19539f) && Intrinsics.d(this.f19540g, bVar.f19540g);
        }

        public final boolean f() {
            return this.f19536c;
        }

        public final boolean g() {
            return this.f19537d;
        }

        public final boolean h() {
            return this.f19538e;
        }

        public final int hashCode() {
            return this.f19540g.hashCode() + G.g.b(C3532b.a(C3532b.a(C3532b.a(G.g.a(this.f19534a.hashCode() * 31, 31, this.f19535b), 31, this.f19536c), 31, this.f19537d), 31, this.f19538e), 31, this.f19539f);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NetworkClientUiItem(client=");
            sb2.append(this.f19534a);
            sb2.append(", clientLocation=");
            sb2.append(this.f19535b);
            sb2.append(", isCronetEnabled=");
            sb2.append(this.f19536c);
            sb2.append(", isGostTlsEnabled=");
            sb2.append(this.f19537d);
            sb2.append(", isSuccess=");
            sb2.append(this.f19538e);
            sb2.append(", errorMessages=");
            sb2.append(this.f19539f);
            sb2.append(", warningMessages=");
            return C2618u.h(sb2, this.f19540g, ")");
        }
    }

    public h() {
        this(3, (ArrayList) null);
    }

    public static h a(h hVar) {
        a.b testState = a.b.f19533a;
        List<b> ozonNetworkClients = hVar.f19531b;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(testState, "testState");
        Intrinsics.checkNotNullParameter(ozonNetworkClients, "ozonNetworkClients");
        return new h(testState, ozonNetworkClients);
    }

    @NotNull
    public final List<b> b() {
        return this.f19531b;
    }

    @NotNull
    public final a c() {
        return this.f19530a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f19530a, hVar.f19530a) && Intrinsics.d(this.f19531b, hVar.f19531b);
    }

    public final int hashCode() {
        return this.f19531b.hashCode() + (this.f19530a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "NetworkClientTestsUiState(testState=" + this.f19530a + ", ozonNetworkClients=" + this.f19531b + ")";
    }

    public h(@NotNull a testState, @NotNull List<b> ozonNetworkClients) {
        Intrinsics.checkNotNullParameter(testState, "testState");
        Intrinsics.checkNotNullParameter(ozonNetworkClients, "ozonNetworkClients");
        this.f19530a = testState;
        this.f19531b = ozonNetworkClients;
    }

    public h(int i11, ArrayList arrayList) {
        this(a.C0387a.f19532a, (List<b>) ((i11 & 2) != 0 ? K.f71697a : arrayList));
    }
}
