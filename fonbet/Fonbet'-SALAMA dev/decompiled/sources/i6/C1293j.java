package i6;

import java.io.Serializable;
import kotlin.jvm.functions.Function2;

/* renamed from: i6.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1293j implements InterfaceC1292i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final C1293j f14068a = new C1293j();

    @Override // i6.InterfaceC1292i
    public final InterfaceC1290g get(InterfaceC1291h interfaceC1291h) {
        t6.h.e(interfaceC1291h, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // i6.InterfaceC1292i
    public final InterfaceC1292i minusKey(InterfaceC1291h interfaceC1291h) {
        t6.h.e(interfaceC1291h, "key");
        return this;
    }

    @Override // i6.InterfaceC1292i
    public final InterfaceC1292i plus(InterfaceC1292i interfaceC1292i) {
        t6.h.e(interfaceC1292i, "context");
        return interfaceC1292i;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // i6.InterfaceC1292i
    public final Object fold(Object obj, Function2 function2) {
        return obj;
    }
}
