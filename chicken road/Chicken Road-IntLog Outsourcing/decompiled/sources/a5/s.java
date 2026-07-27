package a5;

import java.io.IOException;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class s implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final x f3985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f3986b;

    public s(t tVar, x xVar) {
        this.f3986b = tVar;
        this.f3985a = xVar;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        EnumC0200b enumC0200b;
        t tVar = this.f3986b;
        x xVar = this.f3985a;
        EnumC0200b enumC0200b2 = EnumC0200b.f3919e;
        IOException e3 = null;
        try {
            try {
                xVar.b(this);
                while (xVar.a(false, this)) {
                }
                enumC0200b = EnumC0200b.f3917c;
                try {
                    enumC0200b2 = EnumC0200b.f3922h;
                    tVar.a(enumC0200b, enumC0200b2, null);
                } catch (IOException e6) {
                    e3 = e6;
                    enumC0200b2 = EnumC0200b.f3918d;
                    tVar.a(enumC0200b2, enumC0200b2, e3);
                    U4.c.b(xVar);
                    return f4.v.f5689a;
                }
            } catch (Throwable th) {
                th = th;
                tVar.a(enumC0200b, enumC0200b2, e3);
                U4.c.b(xVar);
                throw th;
            }
        } catch (IOException e7) {
            e3 = e7;
            enumC0200b = enumC0200b2;
        } catch (Throwable th2) {
            th = th2;
            enumC0200b = enumC0200b2;
            tVar.a(enumC0200b, enumC0200b2, e3);
            U4.c.b(xVar);
            throw th;
        }
        U4.c.b(xVar);
        return f4.v.f5689a;
    }
}
