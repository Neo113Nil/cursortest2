package Vd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9835a;

/* loaded from: classes10.dex */
public final class w {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <H> Collection<H> a(@NotNull Collection<? extends H> collection, @NotNull Function1<? super H, ? extends InterfaceC9835a> descriptorByHandle) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        te.i iVar = new te.i();
        while (!linkedList.isEmpty()) {
            Object K11 = C7714v.K(linkedList);
            te.i iVar2 = new te.i();
            ArrayList i11 = n.i(K11, linkedList, descriptorByHandle, new v(iVar2));
            Intrinsics.checkNotNullExpressionValue(i11, "extractMembersOverridableInBothWays(...)");
            if (i11.size() == 1 && iVar2.isEmpty()) {
                Object A02 = C7714v.A0(i11);
                Intrinsics.checkNotNullExpressionValue(A02, "single(...)");
                iVar.add(A02);
            } else {
                A00.a aVar = (Object) n.u(i11, descriptorByHandle);
                InterfaceC9835a invoke = descriptorByHandle.invoke(aVar);
                Iterator it = i11.iterator();
                while (it.hasNext()) {
                    A0.h hVar = (Object) it.next();
                    Intrinsics.f(hVar);
                    if (!n.m(invoke, descriptorByHandle.invoke(hVar))) {
                        iVar2.add(hVar);
                    }
                }
                if (!iVar2.isEmpty()) {
                    iVar.addAll(iVar2);
                }
                iVar.add(aVar);
            }
        }
        return iVar;
    }
}
