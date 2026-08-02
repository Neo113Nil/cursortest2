package Gh0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f10271a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d f10272b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f10273c;

    public e(@NotNull String id2, @NotNull d status, Integer num) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f10271a = id2;
        this.f10272b = status;
        this.f10273c = num;
    }

    @NotNull
    public final String a() {
        return this.f10271a;
    }

    public final Integer b() {
        return this.f10273c;
    }

    @NotNull
    public final d c() {
        return this.f10272b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f10271a, eVar.f10271a) && this.f10272b == eVar.f10272b && Intrinsics.d(this.f10273c, eVar.f10273c);
    }

    public final int hashCode() {
        int hashCode = (this.f10272b.hashCode() + (this.f10271a.hashCode() * 31)) * 31;
        Integer num = this.f10273c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PushStatusUpdateEntity(id=");
        sb2.append(this.f10271a);
        sb2.append(", status=");
        sb2.append(this.f10272b);
        sb2.append(", sendingAttemptNumber=");
        return Ep.a.c(sb2, this.f10273c, ")");
    }
}
