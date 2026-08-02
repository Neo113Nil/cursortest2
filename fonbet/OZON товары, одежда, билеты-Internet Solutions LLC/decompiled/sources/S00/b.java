package S00;

import P00.l;
import P4.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l f25614a;

    /* renamed from: b, reason: collision with root package name */
    private final long f25615b;

    /* renamed from: c, reason: collision with root package name */
    private final long f25616c;

    public b(@NotNull l step, long j11, long j12) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f25614a = step;
        this.f25615b = j11;
        this.f25616c = j12;
    }

    @NotNull
    public final l a() {
        return this.f25614a;
    }

    public final long b() {
        return this.f25616c;
    }

    public final long c() {
        return this.f25615b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f25614a == bVar.f25614a && this.f25615b == bVar.f25615b && this.f25616c == bVar.f25616c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25616c) + Pk0.c.a(this.f25614a.hashCode() * 31, 31, this.f25615b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessingTime(step=");
        sb2.append(this.f25614a);
        sb2.append(", stepStartTime=");
        sb2.append(this.f25615b);
        sb2.append(", stepFinishTime=");
        return f.a(this.f25616c, ")", sb2);
    }
}
