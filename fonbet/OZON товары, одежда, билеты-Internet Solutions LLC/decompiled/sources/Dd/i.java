package Dd;

import Jd.InterfaceC3391a;
import ie.C7056e;
import ie.InterfaceC7061j;
import java.util.Map;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import qd.s;

/* loaded from: classes10.dex */
public final class i extends d {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f6580h = {N.h(new E(N.b(i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f6581g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InterfaceC3391a interfaceC3391a, @NotNull Fd.k c11) {
        super(c11, interfaceC3391a, s.a.f81913m);
        Intrinsics.checkNotNullParameter(c11, "c");
        this.f6581g = ((C7056e) c11.e()).a(h.f6579a);
    }

    @Override // Dd.d, ud.InterfaceC10025c
    @NotNull
    public final Map<Sd.f, Xd.g<?>> b() {
        return (Map) ie.n.a(this.f6581g, f6580h[0]);
    }
}
