package A5;

import Sc.r;
import We.InterfaceC4865g;
import We.InterfaceC4866h;
import We.L;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* loaded from: classes8.dex */
final class l implements InterfaceC4866h, Function1<Throwable, Unit> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4865g f433a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10737n f434b;

    public l(@NotNull InterfaceC4865g interfaceC4865g, @NotNull C10737n c10737n) {
        this.f433a = interfaceC4865g;
        this.f434b = c10737n;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        try {
            this.f433a.cancel();
        } catch (Throwable unused) {
        }
        return Unit.f71690a;
    }

    @Override // We.InterfaceC4866h
    public final void onFailure(@NotNull InterfaceC4865g interfaceC4865g, @NotNull IOException iOException) {
        if (interfaceC4865g.isCanceled()) {
            return;
        }
        r.Companion companion = Sc.r.INSTANCE;
        this.f434b.resumeWith(Sc.s.a(iOException));
    }

    @Override // We.InterfaceC4866h
    public final void onResponse(@NotNull InterfaceC4865g interfaceC4865g, @NotNull L l11) {
        r.Companion companion = Sc.r.INSTANCE;
        this.f434b.resumeWith(l11);
    }
}
