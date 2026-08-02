package P5;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;

/* renamed from: P5.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0402n implements G6.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G6.h f5669b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0.e f5670c;

    public /* synthetic */ C0402n(G6.h hVar, e0.e eVar, int i7) {
        this.f5668a = i7;
        this.f5669b = hVar;
        this.f5670c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010c  */
    @Override // G6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, InterfaceC1287d interfaceC1287d) {
        C0401m c0401m;
        int i7;
        s sVar;
        int i8;
        x xVar;
        int i9;
        z zVar;
        int i10;
        switch (this.f5668a) {
            case 0:
                if (interfaceC1287d instanceof C0401m) {
                    c0401m = (C0401m) interfaceC1287d;
                    int i11 = c0401m.f5666b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0401m.f5666b = i11 - Integer.MIN_VALUE;
                        Object obj2 = c0401m.f5665a;
                        j6.a aVar = j6.a.f14642a;
                        i7 = c0401m.f5666b;
                        if (i7 != 0) {
                            AbstractC0603a.p0(obj2);
                            Object c3 = ((e0.b) obj).c(this.f5670c);
                            c0401m.f5666b = 1;
                            if (this.f5669b.c(c3, c0401m) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0603a.p0(obj2);
                        }
                        return C1116i.f13008a;
                    }
                }
                c0401m = new C0401m(this, interfaceC1287d);
                Object obj22 = c0401m.f5665a;
                j6.a aVar2 = j6.a.f14642a;
                i7 = c0401m.f5666b;
                if (i7 != 0) {
                }
                return C1116i.f13008a;
            case 1:
                if (interfaceC1287d instanceof s) {
                    sVar = (s) interfaceC1287d;
                    int i12 = sVar.f5688b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        sVar.f5688b = i12 - Integer.MIN_VALUE;
                        Object obj3 = sVar.f5687a;
                        j6.a aVar3 = j6.a.f14642a;
                        i8 = sVar.f5688b;
                        if (i8 != 0) {
                            AbstractC0603a.p0(obj3);
                            Object c4 = ((e0.b) obj).c(this.f5670c);
                            sVar.f5688b = 1;
                            if (this.f5669b.c(c4, sVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0603a.p0(obj3);
                        }
                        return C1116i.f13008a;
                    }
                }
                sVar = new s(this, interfaceC1287d);
                Object obj32 = sVar.f5687a;
                j6.a aVar32 = j6.a.f14642a;
                i8 = sVar.f5688b;
                if (i8 != 0) {
                }
                return C1116i.f13008a;
            case 2:
                if (interfaceC1287d instanceof x) {
                    xVar = (x) interfaceC1287d;
                    int i13 = xVar.f5710b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        xVar.f5710b = i13 - Integer.MIN_VALUE;
                        Object obj4 = xVar.f5709a;
                        j6.a aVar4 = j6.a.f14642a;
                        i9 = xVar.f5710b;
                        if (i9 != 0) {
                            AbstractC0603a.p0(obj4);
                            Object c7 = ((e0.b) obj).c(this.f5670c);
                            xVar.f5710b = 1;
                            if (this.f5669b.c(c7, xVar) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0603a.p0(obj4);
                        }
                        return C1116i.f13008a;
                    }
                }
                xVar = new x(this, interfaceC1287d);
                Object obj42 = xVar.f5709a;
                j6.a aVar42 = j6.a.f14642a;
                i9 = xVar.f5710b;
                if (i9 != 0) {
                }
                return C1116i.f13008a;
            default:
                if (interfaceC1287d instanceof z) {
                    zVar = (z) interfaceC1287d;
                    int i14 = zVar.f5718b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        zVar.f5718b = i14 - Integer.MIN_VALUE;
                        Object obj5 = zVar.f5717a;
                        j6.a aVar5 = j6.a.f14642a;
                        i10 = zVar.f5718b;
                        if (i10 != 0) {
                            AbstractC0603a.p0(obj5);
                            Object c8 = ((e0.b) obj).c(this.f5670c);
                            zVar.f5718b = 1;
                            if (this.f5669b.c(c8, zVar) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0603a.p0(obj5);
                        }
                        return C1116i.f13008a;
                    }
                }
                zVar = new z(this, interfaceC1287d);
                Object obj52 = zVar.f5717a;
                j6.a aVar52 = j6.a.f14642a;
                i10 = zVar.f5718b;
                if (i10 != 0) {
                }
                return C1116i.f13008a;
        }
    }
}
