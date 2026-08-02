package k6;

import i6.C1293j;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;

/* renamed from: k6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1360g extends AbstractC1354a {
    public AbstractC1360g(InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        if (interfaceC1287d != null && interfaceC1287d.getContext() != C1293j.f14068a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // i6.InterfaceC1287d
    public final InterfaceC1292i getContext() {
        return C1293j.f14068a;
    }
}
