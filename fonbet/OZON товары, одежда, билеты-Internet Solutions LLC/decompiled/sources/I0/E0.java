package I0;

import B0.EnumC2468e1;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import q0.C8957l;
import q0.C8960o;

/* loaded from: classes8.dex */
public final class E0 {

    static final class a extends AbstractC7737t implements Function1<C8957l, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C8960o f11304b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3215w0 f11305c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3215w0 c3215w0, C8960o c8960o) {
            super(1);
            this.f11304b = c8960o;
            this.f11305c = c3215w0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C8957l c8957l) {
            C8957l c8957l2 = c8957l;
            EnumC2468e1 enumC2468e1 = EnumC2468e1.Copy;
            C3215w0 c3215w0 = this.f11305c;
            boolean B11 = c3215w0.B();
            B0.K k11 = new B0.K(enumC2468e1);
            C8960o c8960o = this.f11304b;
            C8957l.c(c8957l2, k11, B11, new C0(c3215w0, c8960o));
            Unit unit = Unit.f71690a;
            C8957l.c(c8957l2, new B0.K(EnumC2468e1.SelectAll), !c3215w0.z(), new D0(c3215w0, c8960o));
            C7714v.b0(unit, unit);
            return unit;
        }
    }

    @NotNull
    public static final Function1<C8957l, Unit> a(@NotNull C3215w0 c3215w0, @NotNull C8960o c8960o) {
        return new a(c3215w0, c8960o);
    }
}
