package Jc;

import Fc.d;
import P4.f;
import hg.InterfaceC6949b;

/* renamed from: Jc.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC3389a<T> {
    public abstract int a();

    protected final boolean b(InterfaceC6949b<?>[] interfaceC6949bArr) {
        int a11 = a();
        if (interfaceC6949bArr.length == a11) {
            return true;
        }
        StringBuilder f7 = f.f(a11, "parallelism = ", ", subscribers = ");
        f7.append(interfaceC6949bArr.length);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(f7.toString());
        for (InterfaceC6949b<?> interfaceC6949b : interfaceC6949bArr) {
            d.d(illegalArgumentException, interfaceC6949b);
        }
        return false;
    }
}
