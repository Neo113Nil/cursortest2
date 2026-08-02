package androidx.compose.foundation.gestures;

import D1.AbstractC2794c0;
import Kk.C3532b;
import fd.InterfaceC6511n;
import k1.C7459e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import r0.InterfaceC9137q;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "LD1/c0;", "Landroidx/compose/foundation/gestures/H;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DraggableElement extends AbstractC2794c0<H> {

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final Function1<x1.x, Boolean> f38985i = a.f38994b;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9137q f38986a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final EnumC9142v f38987b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f38988c;

    /* renamed from: d, reason: collision with root package name */
    private final t0.q f38989d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f38990e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<xe.M, C7459e, kotlin.coroutines.d<? super Unit>, Object> f38991f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<xe.M, Float, kotlin.coroutines.d<? super Unit>, Object> f38992g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f38993h;

    static final class a extends AbstractC7737t implements Function1<x1.x, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f38994b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Boolean invoke(x1.x xVar) {
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableElement(@NotNull InterfaceC9137q interfaceC9137q, @NotNull EnumC9142v enumC9142v, boolean z11, t0.q qVar, boolean z12, @NotNull InterfaceC6511n<? super xe.M, ? super C7459e, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n, @NotNull InterfaceC6511n<? super xe.M, ? super Float, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> interfaceC6511n2, boolean z13) {
        this.f38986a = interfaceC9137q;
        this.f38987b = enumC9142v;
        this.f38988c = z11;
        this.f38989d = qVar;
        this.f38990e = z12;
        this.f38991f = interfaceC6511n;
        this.f38992g = interfaceC6511n2;
        this.f38993h = z13;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final H getF41119a() {
        return new H(this.f38986a, f38985i, this.f38987b, this.f38988c, this.f38989d, this.f38990e, this.f38991f, this.f38992g, this.f38993h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return Intrinsics.d(this.f38986a, draggableElement.f38986a) && this.f38987b == draggableElement.f38987b && this.f38988c == draggableElement.f38988c && Intrinsics.d(this.f38989d, draggableElement.f38989d) && this.f38990e == draggableElement.f38990e && Intrinsics.d(this.f38991f, draggableElement.f38991f) && Intrinsics.d(this.f38992g, draggableElement.f38992g) && this.f38993h == draggableElement.f38993h;
    }

    public final int hashCode() {
        int a11 = C3532b.a((this.f38987b.hashCode() + (this.f38986a.hashCode() * 31)) * 31, 31, this.f38988c);
        t0.q qVar = this.f38989d;
        return Boolean.hashCode(this.f38993h) + ((this.f38992g.hashCode() + ((this.f38991f.hashCode() + C3532b.a((a11 + (qVar != null ? qVar.hashCode() : 0)) * 31, 31, this.f38990e)) * 31)) * 31);
    }

    @Override // D1.AbstractC2794c0
    public final void update(H h11) {
        h11.j2(this.f38986a, f38985i, this.f38987b, this.f38988c, this.f38989d, this.f38990e, this.f38991f, this.f38992g, this.f38993h);
    }
}
