package a5;

import java.io.IOException;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements InterfaceC1430a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3982a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3983b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3984c;

    public /* synthetic */ r(Object obj, int i2, Object obj2) {
        this.f3982a = i2;
        this.f3983b = obj;
        this.f3984c = obj2;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        long a6;
        int i2;
        B[] bArr;
        switch (this.f3982a) {
            case 0:
                t tVar = (t) this.f3983b;
                B b6 = (B) this.f3984c;
                try {
                    tVar.f3988a.b(b6);
                } catch (IOException e3) {
                    d5.e eVar = d5.e.f5492a;
                    d5.e.f5492a.j("Http2Connection.Listener failure for " + tVar.f3990c, 4, e3);
                    try {
                        b6.c(EnumC0200b.f3918d, e3);
                    } catch (IOException unused) {
                    }
                }
                return f4.v.f5689a;
            case 1:
                s sVar = (s) this.f3983b;
                F f3 = (F) this.f3984c;
                sVar.getClass();
                kotlin.jvm.internal.s sVar2 = new kotlin.jvm.internal.s();
                t tVar2 = sVar.f3986b;
                synchronized (tVar2.f4011x) {
                    synchronized (tVar2) {
                        try {
                            F f6 = tVar2.f4006s;
                            F f7 = new F();
                            f7.b(f6);
                            f7.b(f3);
                            sVar2.f10741a = f7;
                            a6 = f7.a() - f6.a();
                            if (a6 != 0 && !tVar2.f3989b.isEmpty()) {
                                bArr = (B[]) tVar2.f3989b.values().toArray(new B[0]);
                                F f8 = (F) sVar2.f10741a;
                                kotlin.jvm.internal.i.e(f8, "<set-?>");
                                tVar2.f4006s = f8;
                                W4.c.c(tVar2.f3997j, tVar2.f3990c + " onSettings", new r(tVar2, 2, sVar2));
                            }
                            bArr = null;
                            F f82 = (F) sVar2.f10741a;
                            kotlin.jvm.internal.i.e(f82, "<set-?>");
                            tVar2.f4006s = f82;
                            W4.c.c(tVar2.f3997j, tVar2.f3990c + " onSettings", new r(tVar2, 2, sVar2));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        tVar2.f4011x.a((F) sVar2.f10741a);
                    } catch (IOException e6) {
                        EnumC0200b enumC0200b = EnumC0200b.f3918d;
                        tVar2.a(enumC0200b, enumC0200b, e6);
                    }
                }
                if (bArr != null) {
                    for (B b7 : bArr) {
                        synchronized (b7) {
                            b7.f3894e += a6;
                            if (a6 > 0) {
                                b7.notifyAll();
                            }
                        }
                    }
                }
                return f4.v.f5689a;
            default:
                t tVar3 = (t) this.f3983b;
                tVar3.f3988a.a(tVar3, (F) ((kotlin.jvm.internal.s) this.f3984c).f10741a);
                return f4.v.f5689a;
        }
    }
}
