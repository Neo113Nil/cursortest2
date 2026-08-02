package D6;

import a.AbstractC0603a;
import i6.InterfaceC1290g;
import i6.InterfaceC1291h;
import i6.InterfaceC1292i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class H0 implements InterfaceC1290g, InterfaceC1291h {

    /* renamed from: a, reason: collision with root package name */
    public static final H0 f1793a = new H0();

    @Override // i6.InterfaceC1292i
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // i6.InterfaceC1292i
    public final InterfaceC1290g get(InterfaceC1291h interfaceC1291h) {
        return AbstractC0603a.W(this, interfaceC1291h);
    }

    @Override // i6.InterfaceC1292i
    public final InterfaceC1292i minusKey(InterfaceC1291h interfaceC1291h) {
        return AbstractC0603a.e0(this, interfaceC1291h);
    }

    @Override // i6.InterfaceC1292i
    public final InterfaceC1292i plus(InterfaceC1292i interfaceC1292i) {
        return AbstractC0603a.m0(this, interfaceC1292i);
    }

    @Override // i6.InterfaceC1290g
    public final InterfaceC1291h getKey() {
        return this;
    }
}
