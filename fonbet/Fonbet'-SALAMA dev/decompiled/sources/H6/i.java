package H6;

import i6.InterfaceC1290g;
import i6.InterfaceC1291h;
import i6.InterfaceC1292i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class i implements InterfaceC1292i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f3441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1292i f3442b;

    public i(InterfaceC1292i interfaceC1292i, Throwable th) {
        this.f3441a = th;
        this.f3442b = interfaceC1292i;
    }

    @Override // i6.InterfaceC1292i
    public final Object fold(Object obj, Function2 function2) {
        return this.f3442b.fold(obj, function2);
    }

    @Override // i6.InterfaceC1292i
    public final InterfaceC1290g get(InterfaceC1291h interfaceC1291h) {
        return this.f3442b.get(interfaceC1291h);
    }

    @Override // i6.InterfaceC1292i
    public final InterfaceC1292i minusKey(InterfaceC1291h interfaceC1291h) {
        return this.f3442b.minusKey(interfaceC1291h);
    }

    @Override // i6.InterfaceC1292i
    public final InterfaceC1292i plus(InterfaceC1292i interfaceC1292i) {
        return this.f3442b.plus(interfaceC1292i);
    }
}
