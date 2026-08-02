package F0;

import B0.EnumC2468e1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import q0.C8957l;
import q0.C8960o;

/* loaded from: classes8.dex */
public final class N {

    static final class a extends AbstractC7737t implements Function1<C8957l, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C8960o f8209b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2990k f8210c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2990k c2990k, C8960o c8960o) {
            super(1);
            this.f8209b = c8960o;
            this.f8210c = c2990k;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(C8957l c8957l) {
            C8957l c8957l2 = c8957l;
            EnumC2468e1 enumC2468e1 = EnumC2468e1.Cut;
            C2990k c2990k = this.f8210c;
            boolean x11 = c2990k.x();
            B0.K k11 = new B0.K(enumC2468e1);
            C8960o c8960o = this.f8209b;
            C8957l.c(c8957l2, k11, x11, new J(c2990k, c8960o));
            EnumC2468e1 enumC2468e12 = EnumC2468e1.Copy;
            C8957l.c(c8957l2, new B0.K(enumC2468e12), c2990k.w(), new K(c2990k, c8960o));
            EnumC2468e1 enumC2468e13 = EnumC2468e1.Paste;
            C8957l.c(c8957l2, new B0.K(enumC2468e13), c2990k.y(), new L(c2990k, c8960o));
            EnumC2468e1 enumC2468e14 = EnumC2468e1.SelectAll;
            C8957l.c(c8957l2, new B0.K(enumC2468e14), c2990k.z(), new M(c2990k, c8960o));
            return Unit.f71690a;
        }
    }

    @NotNull
    public static final Function1<C8957l, Unit> a(@NotNull C2990k c2990k, @NotNull C8960o c8960o) {
        return new a(c2990k, c8960o);
    }
}
