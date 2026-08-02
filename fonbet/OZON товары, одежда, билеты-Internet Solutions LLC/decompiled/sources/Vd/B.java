package Vd;

import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C9852r;
import td.InterfaceC9836b;

/* loaded from: classes10.dex */
public final class B {
    @NotNull
    public static final InterfaceC9836b a(@NotNull LinkedList descriptors) {
        Integer d11;
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        descriptors.isEmpty();
        Iterator it = descriptors.iterator();
        InterfaceC9836b interfaceC9836b = null;
        while (it.hasNext()) {
            InterfaceC9836b interfaceC9836b2 = (InterfaceC9836b) it.next();
            if (interfaceC9836b == null || ((d11 = C9852r.d(interfaceC9836b.getVisibility(), interfaceC9836b2.getVisibility())) != null && d11.intValue() < 0)) {
                interfaceC9836b = interfaceC9836b2;
            }
        }
        Intrinsics.f(interfaceC9836b);
        return interfaceC9836b;
    }
}
