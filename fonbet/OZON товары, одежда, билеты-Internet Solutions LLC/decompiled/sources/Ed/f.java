package Ed;

import Cd.F;
import Kd.k0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ie.InterfaceC7062k;
import java.util.ArrayList;
import je.H0;
import je.N;
import ke.InterfaceC7670b;
import ke.u;
import kotlin.Pair;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.m;
import qd.w;
import td.AbstractC9853s;
import td.EnumC9812C;
import td.InterfaceC9831W;
import td.InterfaceC9835a;
import td.InterfaceC9836b;
import td.InterfaceC9845k;
import td.d0;
import ud.C10024b;
import ud.InterfaceC10023a;
import ud.InterfaceC10030h;
import wd.AbstractC10532s;
import wd.P;
import wd.Q;
import wd.S;
import wd.T;

/* loaded from: classes10.dex */
public class f extends Q implements InterfaceC2966a {

    /* renamed from: B, reason: collision with root package name */
    private final boolean f7842B;

    /* renamed from: C, reason: collision with root package name */
    private final Pair<InterfaceC9835a.InterfaceC2188a<?>, ?> f7843C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected f(@NotNull InterfaceC9845k interfaceC9845k, @NotNull InterfaceC10030h interfaceC10030h, @NotNull EnumC9812C enumC9812C, @NotNull AbstractC9853s abstractC9853s, boolean z11, @NotNull Sd.f fVar, @NotNull d0 d0Var, InterfaceC9831W interfaceC9831W, @NotNull InterfaceC9836b.a aVar, boolean z12, Pair<InterfaceC9835a.InterfaceC2188a<?>, ?> pair) {
        super(interfaceC9845k, interfaceC9831W, interfaceC10030h, enumC9812C, abstractC9853s, z11, fVar, aVar, d0Var, false, false, false, false, false);
        if (interfaceC9845k == null) {
            N(0);
            throw null;
        }
        if (interfaceC10030h == null) {
            N(1);
            throw null;
        }
        if (enumC9812C == null) {
            N(2);
            throw null;
        }
        if (abstractC9853s == null) {
            N(3);
            throw null;
        }
        if (fVar == null) {
            N(4);
            throw null;
        }
        if (d0Var == null) {
            N(5);
            throw null;
        }
        if (aVar == null) {
            N(6);
            throw null;
        }
        this.f7842B = z12;
        this.f7843C = pair;
    }

    private static /* synthetic */ void N(int i11) {
        String str = i11 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i11 != 21 ? 3 : 2];
        switch (i11) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i11 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i11) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 == 21) {
            throw new IllegalStateException(format);
        }
    }

    @NotNull
    public static f R0(@NotNull InterfaceC9845k interfaceC9845k, @NotNull Fd.g gVar, @NotNull EnumC9812C enumC9812C, @NotNull AbstractC9853s abstractC9853s, boolean z11, @NotNull Sd.f fVar, @NotNull Id.a aVar, boolean z12) {
        if (interfaceC9845k == null) {
            N(7);
            throw null;
        }
        if (enumC9812C == null) {
            N(9);
            throw null;
        }
        if (fVar == null) {
            N(11);
            throw null;
        }
        if (aVar != null) {
            return new f(interfaceC9845k, gVar, enumC9812C, abstractC9853s, z11, fVar, aVar, null, InterfaceC9836b.a.DECLARATION, z12, null);
        }
        N(12);
        throw null;
    }

    @Override // Ed.InterfaceC2966a
    @NotNull
    public final InterfaceC2966a G(N n11, @NotNull ArrayList arrayList, @NotNull N n12, Pair pair) {
        N n13;
        S s11;
        T t2;
        InterfaceC9831W n02 = n0() == this ? null : n0();
        f fVar = new f(d(), getAnnotations(), h(), getVisibility(), B(), getName(), e(), n02, getKind(), this.f7842B, pair);
        S K02 = K0();
        if (K02 != null) {
            S s12 = new S(fVar, K02.getAnnotations(), K02.h(), K02.getVisibility(), K02.G0(), K02.isExternal(), K02.isInline(), getKind(), n02 == null ? null : n02.getGetter(), K02.e());
            s12.I0(K02.v0());
            n13 = n12;
            s12.L0(n13);
            s11 = s12;
        } else {
            n13 = n12;
            s11 = null;
        }
        InterfaceC10023a setter = getSetter();
        if (setter != null) {
            P p11 = (P) setter;
            t2 = new T(fVar, ((C10024b) setter).getAnnotations(), p11.h(), p11.getVisibility(), p11.G0(), p11.isExternal(), p11.isInline(), getKind(), n02 == null ? null : n02.getSetter(), ((AbstractC10532s) setter).e());
            t2.I0(t2.v0());
            t2.M0(((T) setter).f().get(0));
        } else {
            t2 = null;
        }
        fVar.L0(s11, t2, O(), C());
        fVar.O0(M0());
        Function0<InterfaceC7062k<Xd.g<?>>> function0 = this.f104291h;
        if (function0 != null) {
            fVar.C0(this.f104290g, function0);
        }
        fVar.S(o());
        fVar.P0(n13, getTypeParameters(), c0(), n11 != null ? Vd.h.h(this, n11, InterfaceC10030h.a.b()) : null, K.f71697a);
        return fVar;
    }

    @Override // wd.Q
    @NotNull
    protected final Q I0(@NotNull InterfaceC9845k interfaceC9845k, @NotNull EnumC9812C enumC9812C, @NotNull AbstractC9853s abstractC9853s, InterfaceC9831W interfaceC9831W, @NotNull InterfaceC9836b.a aVar, @NotNull Sd.f fVar) {
        d0 d0Var = d0.f99392a;
        if (interfaceC9845k == null) {
            N(13);
            throw null;
        }
        if (enumC9812C == null) {
            N(14);
            throw null;
        }
        if (abstractC9853s == null) {
            N(15);
            throw null;
        }
        if (aVar == null) {
            N(16);
            throw null;
        }
        if (fVar != null) {
            return new f(interfaceC9845k, getAnnotations(), enumC9812C, abstractC9853s, B(), fVar, d0Var, interfaceC9831W, aVar, this.f7842B, this.f7843C);
        }
        N(17);
        throw null;
    }

    @Override // wd.Q, td.q0
    public final boolean J() {
        N type = getType();
        if (!this.f7842B) {
            return false;
        }
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (((!m.g0(type) && !w.c(type)) || H0.g(type)) && !m.i0(type)) {
            return false;
        }
        int i11 = k0.f15917c;
        Intrinsics.checkNotNullParameter(type, "<this>");
        Intrinsics.checkNotNullParameter(u.f71512a, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Sd.c ENHANCED_NULLABILITY_ANNOTATION = F.f4705p;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return !InterfaceC7670b.a.t(type, ENHANCED_NULLABILITY_ANNOTATION) || m.i0(type);
    }

    @Override // wd.Q
    public final void N0(@NotNull N n11) {
    }

    @Override // wd.Q, td.InterfaceC9835a
    public final <V> V P(InterfaceC9835a.InterfaceC2188a<V> interfaceC2188a) {
        throw null;
    }

    @Override // wd.d0, td.InterfaceC9835a
    public final boolean m0() {
        return false;
    }
}
