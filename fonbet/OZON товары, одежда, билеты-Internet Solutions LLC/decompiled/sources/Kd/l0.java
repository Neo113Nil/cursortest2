package Kd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class l0 {
    @NotNull
    public static final C3511h a(@NotNull C3511h c3511h, @NotNull ArrayList superQualifiers, boolean z11, boolean z12, boolean z13) {
        EnumC3514k enumC3514k;
        EnumC3514k enumC3514k2;
        boolean z14;
        Intrinsics.checkNotNullParameter(c3511h, "<this>");
        Intrinsics.checkNotNullParameter(superQualifiers, "superQualifiers");
        ArrayList arrayList = new ArrayList();
        Iterator it = superQualifiers.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C3511h c3511h2 = (C3511h) it.next();
            enumC3514k = c3511h2.f() ? null : c3511h2.e();
            if (enumC3514k != null) {
                arrayList.add(enumC3514k);
            }
        }
        Set Y02 = C7714v.Y0(arrayList);
        EnumC3514k e11 = c3511h.f() ? null : c3511h.e();
        EnumC3514k enumC3514k3 = EnumC3514k.FORCE_FLEXIBILITY;
        if (e11 != enumC3514k3) {
            enumC3514k3 = (EnumC3514k) b(Y02, EnumC3514k.NOT_NULL, EnumC3514k.NULLABLE, e11, z11);
        }
        if (enumC3514k3 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = superQualifiers.iterator();
            while (it2.hasNext()) {
                EnumC3514k e12 = ((C3511h) it2.next()).e();
                if (e12 != null) {
                    arrayList2.add(e12);
                }
            }
            Set Y03 = C7714v.Y0(arrayList2);
            EnumC3514k e13 = c3511h.e();
            enumC3514k2 = EnumC3514k.FORCE_FLEXIBILITY;
            if (e13 != enumC3514k2) {
                enumC3514k2 = (EnumC3514k) b(Y03, EnumC3514k.NOT_NULL, EnumC3514k.NULLABLE, e13, z11);
            }
        } else {
            enumC3514k2 = enumC3514k3;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = superQualifiers.iterator();
        while (it3.hasNext()) {
            EnumC3512i d11 = ((C3511h) it3.next()).d();
            if (d11 != null) {
                arrayList3.add(d11);
            }
        }
        EnumC3512i enumC3512i = (EnumC3512i) b(C7714v.Y0(arrayList3), EnumC3512i.MUTABLE, EnumC3512i.READ_ONLY, c3511h.d(), z11);
        if (enumC3514k2 != null && !z13 && (!z12 || enumC3514k2 != EnumC3514k.NULLABLE)) {
            enumC3514k = enumC3514k2;
        }
        boolean z15 = false;
        if (enumC3514k == EnumC3514k.NOT_NULL) {
            if (!c3511h.c()) {
                if (!superQualifiers.isEmpty()) {
                    Iterator it4 = superQualifiers.iterator();
                    while (it4.hasNext()) {
                        if (((C3511h) it4.next()).c()) {
                        }
                    }
                }
            }
            z14 = true;
            if (enumC3514k != null && enumC3514k3 != enumC3514k2) {
                z15 = true;
            }
            return new C3511h(enumC3514k, enumC3512i, z14, z15);
        }
        z14 = false;
        if (enumC3514k != null) {
            z15 = true;
        }
        return new C3511h(enumC3514k, enumC3512i, z14, z15);
    }

    private static final Object b(Set set, Enum r22, Enum r32, Enum r42, boolean z11) {
        Set Y02;
        if (!z11) {
            if (r42 != null && (Y02 = C7714v.Y0(kotlin.collections.e0.g(set, r42))) != null) {
                set = Y02;
            }
            return C7714v.C0(set);
        }
        Enum r12 = set.contains(r22) ? r22 : set.contains(r32) ? r32 : null;
        if (Intrinsics.d(r12, r22) && Intrinsics.d(r42, r32)) {
            return null;
        }
        return r42 == null ? r12 : r42;
    }
}
