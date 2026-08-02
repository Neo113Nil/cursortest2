package i6;

import a.AbstractC0603a;
import kotlin.jvm.functions.Function2;

/* renamed from: i6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1284a implements InterfaceC1290g {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1291h f14063a;

    public AbstractC1284a(InterfaceC1291h interfaceC1291h) {
        this.f14063a = interfaceC1291h;
    }

    @Override // i6.InterfaceC1292i
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // i6.InterfaceC1292i
    public InterfaceC1290g get(InterfaceC1291h interfaceC1291h) {
        return AbstractC0603a.W(this, interfaceC1291h);
    }

    @Override // i6.InterfaceC1290g
    public final InterfaceC1291h getKey() {
        return this.f14063a;
    }

    @Override // i6.InterfaceC1292i
    public InterfaceC1292i minusKey(InterfaceC1291h interfaceC1291h) {
        return AbstractC0603a.e0(this, interfaceC1291h);
    }

    @Override // i6.InterfaceC1292i
    public final InterfaceC1292i plus(InterfaceC1292i interfaceC1292i) {
        return AbstractC0603a.m0(this, interfaceC1292i);
    }
}
