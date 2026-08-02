package Kd;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ud.InterfaceC10025c;
import ud.InterfaceC10030h;

/* renamed from: Kd.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C3509f implements InterfaceC10030h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Sd.c f15889a;

    public C3509f(@NotNull Sd.c fqNameToMatch) {
        Intrinsics.checkNotNullParameter(fqNameToMatch, "fqNameToMatch");
        this.f15889a = fqNameToMatch;
    }

    @Override // ud.InterfaceC10030h
    public final boolean K0(@NotNull Sd.c cVar) {
        return InterfaceC10030h.b.b(this, cVar);
    }

    @Override // ud.InterfaceC10030h
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<InterfaceC10025c> iterator() {
        kotlin.collections.K.f71697a.getClass();
        return kotlin.collections.J.f71696a;
    }

    @Override // ud.InterfaceC10030h
    public final InterfaceC10025c j(Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (Intrinsics.d(fqName, this.f15889a)) {
            return C3508e.f15888a;
        }
        return null;
    }
}
