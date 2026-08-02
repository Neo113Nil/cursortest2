package Zd;

import java.util.Collection;
import kotlin.collections.K;
import td.InterfaceC9836b;
import te.b;

/* loaded from: classes10.dex */
final class c implements b.c {
    @Override // te.b.c
    public final Iterable a(Object obj) {
        Collection<? extends InterfaceC9836b> o11;
        InterfaceC9836b interfaceC9836b = (InterfaceC9836b) obj;
        return (interfaceC9836b == null || (o11 = interfaceC9836b.o()) == null) ? K.f71697a : o11;
    }
}
