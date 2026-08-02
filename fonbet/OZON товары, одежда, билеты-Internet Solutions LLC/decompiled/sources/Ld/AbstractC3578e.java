package Ld;

import Ld.AbstractC3579f;
import Xd.C4887d;
import fe.EnumC6525d;
import fe.InterfaceC6526e;
import fe.N;
import ie.C7056e;
import ie.InterfaceC7059h;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Ld.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3578e<A, C> extends AbstractC3579f<A, C3582i<? extends A, ? extends C>> implements InterfaceC6526e<A, C> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC7059h<y, C3582i<A, C>> f16765b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3578e(@NotNull C7056e storageManager, @NotNull yd.g kotlinClassFinder) {
        super(kotlinClassFinder);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        this.f16765b = storageManager.d(new C3574a(this));
    }

    private final C w(N n11, Nd.m mVar, EnumC6525d enumC6525d, je.N n12, Function2<? super C3582i<? extends A, ? extends C>, ? super B, ? extends C> function2) {
        Rd.e eVar;
        C constant;
        y n13 = AbstractC3579f.n(n11, AbstractC3579f.b.a(n11, true, true, Pd.b.f22215B.d(mVar.U()), Rd.h.e(mVar), r(), q()));
        if (n13 == null) {
            return null;
        }
        Rd.e d11 = n13.a().d();
        eVar = q.f16804e;
        B p11 = AbstractC3579f.p(mVar, n11.b(), n11.d(), enumC6525d, d11.d(eVar));
        if (p11 == null || (constant = function2.invoke(this.f16765b.invoke(n13), p11)) == null) {
            return null;
        }
        if (qd.w.c(n12)) {
            constant = (C) ((Xd.g) constant);
            Intrinsics.checkNotNullParameter(constant, "constant");
            if (constant instanceof C4887d) {
                return (C) new Xd.A(((C4887d) constant).b().byteValue());
            }
            if (constant instanceof Xd.w) {
                return (C) new Xd.D(((Xd.w) constant).b().shortValue());
            }
            if (constant instanceof Xd.n) {
                return (C) new Xd.B(((Xd.n) constant).b().intValue());
            }
            if (constant instanceof Xd.u) {
                return (C) new Xd.C(((Xd.u) constant).b().longValue());
            }
        }
        return (C) constant;
    }

    @Override // fe.InterfaceC6526e
    public final C c(@NotNull N container, @NotNull Nd.m proto, @NotNull je.N expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return w(container, proto, EnumC6525d.PROPERTY, expectedType, C3576c.f16757a);
    }

    @Override // fe.InterfaceC6526e
    public final C d(@NotNull N container, @NotNull Nd.m proto, @NotNull je.N expectedType) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(expectedType, "expectedType");
        return w(container, proto, EnumC6525d.PROPERTY_GETTER, expectedType, C3575b.f16756a);
    }

    @Override // Ld.AbstractC3579f
    public final C3582i o(y binaryClass) {
        Intrinsics.checkNotNullParameter(binaryClass, "binaryClass");
        return this.f16765b.invoke(binaryClass);
    }
}
