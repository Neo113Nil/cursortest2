package Dd;

import Gd.C3085o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fe.InterfaceC6543w;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9838d;
import td.InterfaceC9839e;
import td.p0;

/* loaded from: classes.dex */
public final class b {
    private static /* synthetic */ void a(int i11) {
        String str = i11 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i11 != 18 ? 3 : 2];
        switch (i11) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i11 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i11) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 == 18) {
            throw new IllegalStateException(format);
        }
    }

    public static p0 b(@NotNull Sd.f fVar, @NotNull InterfaceC9839e interfaceC9839e) {
        if (fVar == null) {
            a(19);
            throw null;
        }
        if (interfaceC9839e == null) {
            a(20);
            throw null;
        }
        Collection<InterfaceC9838d> l11 = interfaceC9839e.l();
        if (l11.size() != 1) {
            return null;
        }
        for (p0 p0Var : l11.iterator().next().f()) {
            if (p0Var.getName().equals(fVar)) {
                return p0Var;
            }
        }
        return null;
    }

    @NotNull
    private static LinkedHashSet c(@NotNull Sd.f fVar, @NotNull Collection collection, @NotNull Collection collection2, @NotNull C3085o c3085o, @NotNull InterfaceC6543w interfaceC6543w, @NotNull Vd.n nVar, boolean z11) {
        if (fVar == null) {
            a(12);
            throw null;
        }
        if (collection == null) {
            a(13);
            throw null;
        }
        if (collection2 == null) {
            a(14);
            throw null;
        }
        if (c3085o == null) {
            a(15);
            throw null;
        }
        if (interfaceC6543w == null) {
            a(16);
            throw null;
        }
        if (nVar == null) {
            a(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        nVar.j(fVar, collection, collection2, c3085o, new C2856a(interfaceC6543w, linkedHashSet, z11));
        return linkedHashSet;
    }

    @NotNull
    public static LinkedHashSet d(@NotNull C3085o c3085o, @NotNull Sd.f fVar, @NotNull Vd.n nVar, @NotNull InterfaceC6543w interfaceC6543w, @NotNull AbstractCollection abstractCollection, @NotNull Collection collection) {
        if (fVar == null) {
            a(0);
            throw null;
        }
        if (collection == null) {
            a(2);
            throw null;
        }
        if (c3085o == null) {
            a(3);
            throw null;
        }
        if (interfaceC6543w == null) {
            a(4);
            throw null;
        }
        if (nVar != null) {
            return c(fVar, abstractCollection, collection, c3085o, interfaceC6543w, nVar, false);
        }
        a(5);
        throw null;
    }

    @NotNull
    public static LinkedHashSet e(@NotNull C3085o c3085o, @NotNull Sd.f fVar, @NotNull Vd.n nVar, @NotNull InterfaceC6543w interfaceC6543w, @NotNull AbstractCollection abstractCollection, @NotNull Collection collection) {
        if (fVar == null) {
            a(6);
            throw null;
        }
        if (collection == null) {
            a(7);
            throw null;
        }
        if (c3085o == null) {
            a(9);
            throw null;
        }
        if (interfaceC6543w == null) {
            a(10);
            throw null;
        }
        if (nVar != null) {
            return c(fVar, collection, abstractCollection, c3085o, interfaceC6543w, nVar, true);
        }
        a(11);
        throw null;
    }
}
