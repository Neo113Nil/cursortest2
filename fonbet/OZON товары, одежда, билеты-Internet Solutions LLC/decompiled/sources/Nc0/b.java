package Nc0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import android.content.Intent;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ze.C11115c;

/* loaded from: classes3.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C11115c f18980a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<Intent> f18981b;

    public b() {
        C11115c a11 = ze.k.a(-2, 6, null);
        this.f18980a = a11;
        this.f18981b = C2399j.H(a11);
    }

    @Override // Nc0.a
    public final Object a(@NotNull Intent intent, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object n11 = this.f18980a.n(intent, dVar);
        return n11 == Wc.a.COROUTINE_SUSPENDED ? n11 : Unit.f71690a;
    }

    @Override // Nc0.a
    @NotNull
    public final InterfaceC2395h<Intent> e() {
        return this.f18981b;
    }
}
