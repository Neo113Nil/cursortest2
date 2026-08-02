package Sa0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import za0.InterfaceC11014a;

/* loaded from: classes3.dex */
public final class a implements Ra0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC11014a f26077a;

    public a(@NotNull InterfaceC11014a hostConfigBaseApi) {
        Intrinsics.checkNotNullParameter(hostConfigBaseApi, "hostConfigBaseApi");
        this.f26077a = hostConfigBaseApi;
    }

    @Override // Ra0.a
    @NotNull
    public final Qa0.a getInfo() {
        InterfaceC11014a interfaceC11014a = this.f26077a;
        return new Qa0.a(interfaceC11014a.m().toString(), interfaceC11014a.a());
    }
}
