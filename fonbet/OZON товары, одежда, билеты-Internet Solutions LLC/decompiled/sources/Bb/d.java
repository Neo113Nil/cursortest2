package Bb;

import Sc.r;
import Sc.s;
import We.InterfaceC4865g;
import We.InterfaceC4866h;
import We.L;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* loaded from: classes9.dex */
final class d implements InterfaceC4866h, Function1<Throwable, Unit> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4865g f3361a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10737n f3362b;

    public d(@NotNull InterfaceC4865g call, @NotNull C10737n continuation) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.f3361a = call;
        this.f3362b = continuation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        try {
            this.f3361a.cancel();
        } catch (Throwable unused) {
        }
        return Unit.f71690a;
    }

    @Override // We.InterfaceC4866h
    public final void onFailure(@NotNull InterfaceC4865g call, @NotNull IOException e11) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e11, "e");
        if (call.isCanceled()) {
            return;
        }
        r.Companion companion = r.INSTANCE;
        this.f3362b.resumeWith(s.a(e11));
    }

    @Override // We.InterfaceC4866h
    public final void onResponse(@NotNull InterfaceC4865g call, @NotNull L response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        r.Companion companion = r.INSTANCE;
        this.f3362b.resumeWith(response);
    }
}
