package I0;

import B0.C2454a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: I0.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3220z {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f11665a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f11666b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f11667c;

    /* renamed from: I0.z$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final V1.g f11668a;

        /* renamed from: b, reason: collision with root package name */
        private final int f11669b;

        /* renamed from: c, reason: collision with root package name */
        private final long f11670c;

        public a(@NotNull V1.g gVar, int i11, long j11) {
            this.f11668a = gVar;
            this.f11669b = i11;
            this.f11670c = j11;
        }

        public static a a(a aVar, V1.g gVar, int i11) {
            long j11 = aVar.f11670c;
            aVar.getClass();
            return new a(gVar, i11, j11);
        }

        @NotNull
        public final V1.g b() {
            return this.f11668a;
        }

        public final int c() {
            return this.f11669b;
        }

        public final long d() {
            return this.f11670c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f11668a == aVar.f11668a && this.f11669b == aVar.f11669b && this.f11670c == aVar.f11670c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f11670c) + C2454a.a(this.f11669b, this.f11668a.hashCode() * 31, 31);
        }

        @NotNull
        public final String toString() {
            return "AnchorInfo(direction=" + this.f11668a + ", offset=" + this.f11669b + ", selectableId=" + this.f11670c + ')';
        }
    }

    public C3220z(@NotNull a aVar, @NotNull a aVar2, boolean z11) {
        this.f11665a = aVar;
        this.f11666b = aVar2;
        this.f11667c = z11;
    }

    public static C3220z a(C3220z c3220z, a aVar, a aVar2, boolean z11, int i11) {
        if ((i11 & 1) != 0) {
            aVar = c3220z.f11665a;
        }
        if ((i11 & 2) != 0) {
            aVar2 = c3220z.f11666b;
        }
        if ((i11 & 4) != 0) {
            z11 = c3220z.f11667c;
        }
        c3220z.getClass();
        return new C3220z(aVar, aVar2, z11);
    }

    @NotNull
    public final a b() {
        return this.f11666b;
    }

    public final boolean c() {
        return this.f11667c;
    }

    @NotNull
    public final a d() {
        return this.f11665a;
    }

    @NotNull
    public final C3220z e(C3220z c3220z) {
        if (c3220z == null) {
            return this;
        }
        a aVar = c3220z.f11666b;
        boolean z11 = c3220z.f11667c;
        boolean z12 = this.f11667c;
        if (!z12 && !z11) {
            return a(this, null, aVar, false, 5);
        }
        if (z11) {
            aVar = c3220z.f11665a;
        }
        return new C3220z(aVar, z12 ? this.f11666b : this.f11665a, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3220z)) {
            return false;
        }
        C3220z c3220z = (C3220z) obj;
        return Intrinsics.d(this.f11665a, c3220z.f11665a) && Intrinsics.d(this.f11666b, c3220z.f11666b) && this.f11667c == c3220z.f11667c;
    }

    public final long f() {
        return K1.S.a(this.f11665a.c(), this.f11666b.c());
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11667c) + ((this.f11666b.hashCode() + (this.f11665a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Selection(start=");
        sb2.append(this.f11665a);
        sb2.append(", end=");
        sb2.append(this.f11666b);
        sb2.append(", handlesCrossed=");
        return B4.V.d(sb2, this.f11667c, ')');
    }
}
