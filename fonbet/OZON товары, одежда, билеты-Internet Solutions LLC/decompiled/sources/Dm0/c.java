package Dm0;

import Dm0.b;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class c extends HashSet<b.InterfaceC0147b> implements b.InterfaceC0147b {
    public static c a(b.InterfaceC0147b... interfaceC0147bArr) {
        c cVar = new c(interfaceC0147bArr.length);
        for (b.InterfaceC0147b interfaceC0147b : interfaceC0147bArr) {
            if (interfaceC0147b instanceof c) {
                cVar.addAll((c) interfaceC0147b);
            } else {
                cVar.add(interfaceC0147b);
            }
        }
        return cVar;
    }

    @Override // Dm0.b.InterfaceC0147b
    public final boolean z1(char c11) {
        Iterator<b.InterfaceC0147b> it = iterator();
        while (it.hasNext()) {
            if (it.next().z1(c11)) {
                return true;
            }
        }
        return false;
    }
}
