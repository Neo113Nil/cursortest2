package P0;

import Sc.C;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;

/* renamed from: P0.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3720b {

    /* renamed from: a, reason: collision with root package name */
    private final long f20973a;

    /* renamed from: b, reason: collision with root package name */
    private final long f20974b;

    /* renamed from: c, reason: collision with root package name */
    private final long f20975c;

    /* renamed from: d, reason: collision with root package name */
    private final long f20976d;

    public C3720b(long j11, long j12, long j13, long j14) {
        this.f20973a = j11;
        this.f20974b = j12;
        this.f20975c = j13;
        this.f20976d = j14;
    }

    public final long a(boolean z11) {
        return z11 ? this.f20973a : this.f20975c;
    }

    public final long b(boolean z11) {
        return z11 ? this.f20974b : this.f20976d;
    }

    @NotNull
    public final C3720b c(long j11, long j12, long j13, long j14) {
        if (j11 == 16) {
            j11 = this.f20973a;
        }
        return new C3720b(j11, j12 != 16 ? j12 : this.f20974b, j13 != 16 ? j13 : this.f20975c, j14 != 16 ? j14 : this.f20976d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3720b)) {
            return false;
        }
        C3720b c3720b = (C3720b) obj;
        return C7807Z.p(this.f20973a, c3720b.f20973a) && C7807Z.p(this.f20974b, c3720b.f20974b) && C7807Z.p(this.f20975c, c3720b.f20975c) && C7807Z.p(this.f20976d, c3720b.f20976d);
    }

    public final int hashCode() {
        int i11 = C7807Z.f72260n;
        C.Companion companion = Sc.C.INSTANCE;
        return Long.hashCode(this.f20976d) + Pk0.c.a(Pk0.c.a(Long.hashCode(this.f20973a) * 31, 31, this.f20974b), 31, this.f20975c);
    }
}
