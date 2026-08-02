package Ed;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import je.N;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import qe.v;
import td.AbstractC9853s;
import td.EnumC9812C;
import td.InterfaceC9834Z;
import td.InterfaceC9835a;
import td.InterfaceC9836b;
import td.InterfaceC9845k;
import td.InterfaceC9857w;
import td.c0;
import td.d0;
import td.p0;
import ud.InterfaceC10030h;
import wd.AbstractC10539z;
import wd.U;
import wd.V;

/* loaded from: classes.dex */
public final class e extends V implements InterfaceC2966a {

    /* renamed from: G, reason: collision with root package name */
    public static final InterfaceC9835a.InterfaceC2188a<p0> f7838G = new a();

    /* renamed from: H, reason: collision with root package name */
    public static final InterfaceC9835a.InterfaceC2188a<Boolean> f7839H = new b();

    /* renamed from: E, reason: collision with root package name */
    private c f7840E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f7841F;

    /* loaded from: classes10.dex */
    static class a implements InterfaceC9835a.InterfaceC2188a<p0> {
        a() {
        }
    }

    /* loaded from: classes10.dex */
    static class b implements InterfaceC9835a.InterfaceC2188a<Boolean> {
        b() {
        }
    }

    /* loaded from: classes10.dex */
    private enum c {
        NON_STABLE_DECLARED("NON_STABLE_DECLARED", 0),
        STABLE_DECLARED("STABLE_DECLARED", 1),
        NON_STABLE_SYNTHESIZED("NON_STABLE_SYNTHESIZED", 2),
        STABLE_SYNTHESIZED("STABLE_SYNTHESIZED", 3);

        public final boolean isStable;
        public final boolean isSynthesized;

        c(String str, int i11) {
            this.isStable = r1;
            this.isSynthesized = r2;
        }

        @NotNull
        public static c a(boolean z11, boolean z12) {
            c cVar = z11 ? z12 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z12 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (cVar != null) {
                return cVar;
            }
            throw new IllegalStateException("@NotNull method kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus.get must not return null");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected e(@NotNull InterfaceC9845k interfaceC9845k, c0 c0Var, @NotNull InterfaceC10030h interfaceC10030h, @NotNull Sd.f fVar, @NotNull InterfaceC9836b.a aVar, @NotNull d0 d0Var, boolean z11) {
        super(interfaceC9845k, c0Var, interfaceC10030h, fVar, aVar, d0Var);
        if (interfaceC9845k == null) {
            N(0);
            throw null;
        }
        if (interfaceC10030h == null) {
            N(1);
            throw null;
        }
        if (fVar == null) {
            N(2);
            throw null;
        }
        if (aVar == null) {
            N(3);
            throw null;
        }
        if (d0Var == null) {
            N(4);
            throw null;
        }
        this.f7840E = null;
        this.f7841F = z11;
    }

    private static /* synthetic */ void N(int i11) {
        String str = (i11 == 13 || i11 == 18 || i11 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 13 || i11 == 18 || i11 == 21) ? 2 : 3];
        switch (i11) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i11 == 13) {
            objArr[1] = "initialize";
        } else if (i11 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i11 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i11) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 13 && i11 != 18 && i11 != 21) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @NotNull
    public static e f1(@NotNull InterfaceC9845k interfaceC9845k, @NotNull Fd.g gVar, @NotNull Sd.f fVar, @NotNull Id.a aVar, boolean z11) {
        if (interfaceC9845k == null) {
            N(5);
            throw null;
        }
        if (fVar == null) {
            N(7);
            throw null;
        }
        if (aVar != null) {
            return new e(interfaceC9845k, null, gVar, fVar, InterfaceC9836b.a.DECLARATION, aVar, z11);
        }
        N(8);
        throw null;
    }

    @Override // Ed.InterfaceC2966a
    @NotNull
    public final InterfaceC2966a G(N n11, @NotNull ArrayList arrayList, @NotNull N n12, Pair pair) {
        ArrayList a11 = h.a(arrayList, f(), this);
        U h11 = n11 == null ? null : Vd.h.h(this, n11, InterfaceC10030h.a.b());
        AbstractC10539z.a aVar = (AbstractC10539z.a) U();
        aVar.i(a11);
        aVar.e(n12);
        aVar.A(h11);
        aVar.z();
        aVar.d();
        e eVar = (e) aVar.build();
        if (pair != null) {
            eVar.N0((InterfaceC9835a.InterfaceC2188a) pair.e(), pair.f());
        }
        if (eVar != null) {
            return eVar;
        }
        N(21);
        throw null;
    }

    @Override // wd.V, wd.AbstractC10539z
    @NotNull
    protected final AbstractC10539z G0(Sd.f fVar, @NotNull InterfaceC9836b.a aVar, @NotNull InterfaceC9845k interfaceC9845k, InterfaceC9857w interfaceC9857w, @NotNull d0 d0Var, @NotNull InterfaceC10030h interfaceC10030h) {
        if (interfaceC9845k == null) {
            N(14);
            throw null;
        }
        if (aVar == null) {
            N(15);
            throw null;
        }
        if (interfaceC10030h == null) {
            N(16);
            throw null;
        }
        c0 c0Var = (c0) interfaceC9857w;
        if (fVar == null) {
            fVar = getName();
        }
        e eVar = new e(interfaceC9845k, c0Var, interfaceC10030h, fVar, aVar, d0Var, this.f7841F);
        c cVar = this.f7840E;
        eVar.g1(cVar.isStable, cVar.isSynthesized);
        return eVar;
    }

    @Override // wd.AbstractC10539z
    public final boolean K0() {
        throw null;
    }

    @Override // wd.V
    @NotNull
    public final V e1(U u11, InterfaceC9834Z interfaceC9834Z, @NotNull List list, @NotNull List list2, @NotNull List list3, N n11, EnumC9812C enumC9812C, @NotNull AbstractC9853s abstractC9853s, Map map) {
        if (list == null) {
            N(9);
            throw null;
        }
        if (list2 == null) {
            N(10);
            throw null;
        }
        if (list3 == null) {
            N(11);
            throw null;
        }
        if (abstractC9853s == null) {
            N(12);
            throw null;
        }
        super.e1(u11, interfaceC9834Z, list, list2, list3, n11, enumC9812C, abstractC9853s, map);
        V0(v.f81976a.a(this).a());
        return this;
    }

    public final void g1(boolean z11, boolean z12) {
        this.f7840E = c.a(z11, z12);
    }

    @Override // wd.AbstractC10539z, td.InterfaceC9835a
    public final boolean m0() {
        return this.f7840E.isSynthesized;
    }
}
