package Gh0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f10269a;

    /* renamed from: b, reason: collision with root package name */
    private final a f10270b;

    public c(@NotNull b pushEntity, a aVar) {
        Intrinsics.checkNotNullParameter(pushEntity, "pushEntity");
        this.f10269a = pushEntity;
        this.f10270b = aVar;
    }

    @NotNull
    public final b a() {
        return this.f10269a;
    }

    public final a b() {
        return this.f10270b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f10269a, cVar.f10269a) && Intrinsics.d(this.f10270b, cVar.f10270b);
    }

    public final int hashCode() {
        int hashCode = this.f10269a.hashCode() * 31;
        a aVar = this.f10270b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @NotNull
    public final String toString() {
        return "PushEntityWithStats(pushEntity=" + this.f10269a + ", statsEntity=" + this.f10270b + ")";
    }
}
