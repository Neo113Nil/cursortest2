package A2;

import g2.InterfaceC0319c;
import i2.InterfaceC0344c;

/* loaded from: classes.dex */
public final class s implements InterfaceC0319c, InterfaceC0344c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0319c f118a;

    /* renamed from: b, reason: collision with root package name */
    public final g2.h f119b;

    public s(InterfaceC0319c interfaceC0319c, g2.h hVar) {
        this.f118a = interfaceC0319c;
        this.f119b = hVar;
    }

    @Override // i2.InterfaceC0344c
    public final InterfaceC0344c c() {
        InterfaceC0319c interfaceC0319c = this.f118a;
        if (interfaceC0319c instanceof InterfaceC0344c) {
            return (InterfaceC0344c) interfaceC0319c;
        }
        return null;
    }

    @Override // g2.InterfaceC0319c
    public final void e(Object obj) {
        this.f118a.e(obj);
    }

    @Override // g2.InterfaceC0319c
    public final g2.h getContext() {
        return this.f119b;
    }
}
