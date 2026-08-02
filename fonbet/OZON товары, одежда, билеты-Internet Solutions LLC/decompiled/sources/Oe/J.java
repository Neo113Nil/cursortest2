package Oe;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Me.f[] f20252a = new Me.f[0];

    @NotNull
    public static final Set<String> a(@NotNull Me.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof InterfaceC3690i) {
            return ((InterfaceC3690i) fVar).a();
        }
        HashSet hashSet = new HashSet(fVar.d());
        int d11 = fVar.d();
        for (int i11 = 0; i11 < d11; i11++) {
            hashSet.add(fVar.e(i11));
        }
        return hashSet;
    }

    @NotNull
    public static final Me.f[] b(List<? extends Me.f> list) {
        Me.f[] fVarArr;
        List<? extends Me.f> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (Me.f[]) list.toArray(new Me.f[0])) == null) ? f20252a : fVarArr;
    }
}
