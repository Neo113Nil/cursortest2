package Qh0;

import gh0.InterfaceC6738d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f23463a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final jh0.c f23464b;

    public i(@NotNull ArrayList results, @NotNull jh0.c updateTrigger) {
        Intrinsics.checkNotNullParameter(results, "results");
        Intrinsics.checkNotNullParameter(updateTrigger, "updateTrigger");
        this.f23463a = results;
        this.f23464b = updateTrigger;
    }

    @NotNull
    public final List<InterfaceC6738d.a> a() {
        return this.f23463a;
    }

    @NotNull
    public final jh0.c b() {
        return this.f23464b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f23463a.equals(iVar.f23463a) && this.f23464b == iVar.f23464b;
    }

    public final int hashCode() {
        return this.f23464b.hashCode() + (this.f23463a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "PushTokensCompositeUpdateResult(results=" + this.f23463a + ", updateTrigger=" + this.f23464b + ")";
    }
}
