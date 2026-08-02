package Ed;

import Gd.C3085o;
import java.util.ArrayList;
import je.N;
import kotlin.Pair;
import kotlin.collections.K;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9835a;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9845k;
import td.InterfaceC9857w;
import td.d0;
import ud.InterfaceC10030h;
import wd.AbstractC10539z;
import wd.C10528n;

/* loaded from: classes10.dex */
public final class b extends C10528n implements InterfaceC2966a {

    /* renamed from: F, reason: collision with root package name */
    private Boolean f7833F;

    /* renamed from: G, reason: collision with root package name */
    private Boolean f7834G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected b(@NotNull InterfaceC9839e interfaceC9839e, b bVar, @NotNull InterfaceC10030h interfaceC10030h, boolean z11, @NotNull InterfaceC9836b.a aVar, @NotNull d0 d0Var) {
        super(interfaceC9839e, bVar, interfaceC10030h, z11, aVar, d0Var);
        if (interfaceC9839e == null) {
            N(0);
            throw null;
        }
        if (interfaceC10030h == null) {
            N(1);
            throw null;
        }
        if (aVar == null) {
            N(2);
            throw null;
        }
        if (d0Var == null) {
            N(3);
            throw null;
        }
        this.f7833F = null;
        this.f7834G = null;
    }

    private static /* synthetic */ void N(int i11) {
        String str = (i11 == 11 || i11 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 11 || i11 == 18) ? 2 : 3];
        switch (i11) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i11 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i11 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 11 && i11 != 18) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @NotNull
    public static b f1(@NotNull C3085o c3085o, @NotNull InterfaceC10030h interfaceC10030h, boolean z11, @NotNull Id.a aVar) {
        if (c3085o == null) {
            N(4);
            throw null;
        }
        if (aVar != null) {
            return new b(c3085o, null, interfaceC10030h, z11, InterfaceC9836b.a.DECLARATION, aVar);
        }
        N(6);
        throw null;
    }

    @Override // Ed.InterfaceC2966a
    @NotNull
    public final InterfaceC2966a G(N n11, @NotNull ArrayList arrayList, @NotNull N n12, Pair pair) {
        b g12 = g1(d(), null, getKind(), getAnnotations(), e());
        g12.L0(n11 == null ? null : Vd.h.h(g12, n11, InterfaceC10030h.a.b()), c0(), K.f71697a, getTypeParameters(), h.a(arrayList, f(), g12), n12, h(), getVisibility());
        if (pair != null) {
            g12.N0((InterfaceC9835a.InterfaceC2188a) pair.e(), pair.f());
        }
        return g12;
    }

    @Override // wd.C10528n, wd.AbstractC10539z
    @NotNull
    protected final /* bridge */ /* synthetic */ AbstractC10539z G0(Sd.f fVar, @NotNull InterfaceC9836b.a aVar, @NotNull InterfaceC9845k interfaceC9845k, InterfaceC9857w interfaceC9857w, @NotNull d0 d0Var, @NotNull InterfaceC10030h interfaceC10030h) {
        return g1(interfaceC9845k, interfaceC9857w, aVar, interfaceC10030h, d0Var);
    }

    @Override // wd.AbstractC10539z
    public final boolean K0() {
        throw null;
    }

    @Override // wd.AbstractC10539z
    public final void R0(boolean z11) {
        this.f7833F = Boolean.valueOf(z11);
    }

    @Override // wd.AbstractC10539z
    public final void S0(boolean z11) {
        this.f7834G = Boolean.valueOf(z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // wd.C10528n
    @NotNull
    /* renamed from: b1 */
    public final /* bridge */ /* synthetic */ C10528n G0(Sd.f fVar, @NotNull InterfaceC9836b.a aVar, @NotNull InterfaceC9845k interfaceC9845k, InterfaceC9857w interfaceC9857w, @NotNull d0 d0Var, @NotNull InterfaceC10030h interfaceC10030h) {
        return g1(interfaceC9845k, interfaceC9857w, aVar, interfaceC10030h, d0Var);
    }

    @NotNull
    protected final b g1(@NotNull InterfaceC9845k interfaceC9845k, InterfaceC9857w interfaceC9857w, @NotNull InterfaceC9836b.a aVar, @NotNull InterfaceC10030h interfaceC10030h, @NotNull d0 d0Var) {
        if (interfaceC9845k == null) {
            N(7);
            throw null;
        }
        if (aVar == null) {
            N(8);
            throw null;
        }
        if (interfaceC10030h == null) {
            N(9);
            throw null;
        }
        if (d0Var == null) {
            N(10);
            throw null;
        }
        if (aVar != InterfaceC9836b.a.DECLARATION && aVar != InterfaceC9836b.a.SYNTHESIZED) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC9845k + "\nkind: " + aVar);
        }
        b bVar = new b((InterfaceC9839e) interfaceC9845k, (b) interfaceC9857w, interfaceC10030h, this.f104314E, aVar, d0Var);
        Boolean bool = this.f7833F;
        bool.getClass();
        bVar.f7833F = bool;
        Boolean bool2 = this.f7834G;
        bool2.getClass();
        bVar.f7834G = bool2;
        return bVar;
    }

    @Override // wd.AbstractC10539z, td.InterfaceC9835a
    public final boolean m0() {
        return this.f7834G.booleanValue();
    }
}
