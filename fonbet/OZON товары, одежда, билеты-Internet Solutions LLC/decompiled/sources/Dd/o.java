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
public final class o extends d {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f6588h = {N.h(new E(N.b(o.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f6589g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@NotNull InterfaceC3391a annotation, @NotNull Fd.k c11) {
        super(c11, annotation, s.a.f81920t);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c11, "c");
        this.f6589g = ((C7056e) c11.e()).a(new n(this));
    }

    @Override // Dd.d, ud.InterfaceC10025c
    @NotNull
    public final Map<Sd.f, Xd.g<Object>> b() {
        return (Map) ie.n.a(this.f6589g, f6588h[0]);
    }
}
