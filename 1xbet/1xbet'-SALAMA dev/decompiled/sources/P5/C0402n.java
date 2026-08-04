package P5;

/* JADX INFO: renamed from: P5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0402n implements G6.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G6.h f5669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p030e0.e f5670c;

    public /* synthetic */ C0402n(G6.h hVar, p030e0.e eVar, int i7) {
        this.f5668a = i7;
        this.f5669b = hVar;
        this.f5670c = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // G6.h
    public final Object c(Object obj, p065i6.d dVar) {
        C0401m c0401m;
        s sVar;
        x xVar;
        z zVar;
        switch (this.f5668a) {
            case 0:
                if (dVar instanceof C0401m) {
                    c0401m = (C0401m) dVar;
                    int i7 = c0401m.f5666b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        c0401m.f5666b = i7 - Integer.MIN_VALUE;
                    } else {
                        c0401m = new C0401m(this, dVar);
                    }
                } else {
                    c0401m = new C0401m(this, dVar);
                }
                Object obj2 = c0401m.f5665a;
                j6.a aVar = j6.a.f14648a;
                int i8 = c0401m.f5666b;
                if (i8 == 0) {
                    p003a.a.p0(obj2);
                    Object objC = ((p030e0.b) obj).c(this.f5670c);
                    c0401m.f5666b = 1;
                    if (this.f5669b.c(objC, c0401m) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p003a.a.p0(obj2);
                }
                return p044f6.i.f13014a;
            case 1:
                if (dVar instanceof s) {
                    sVar = (s) dVar;
                    int i9 = sVar.f5688b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        sVar.f5688b = i9 - Integer.MIN_VALUE;
                    } else {
                        sVar = new s(this, dVar);
                    }
                } else {
                    sVar = new s(this, dVar);
                }
                Object obj3 = sVar.f5687a;
                j6.a aVar2 = j6.a.f14648a;
                int i10 = sVar.f5688b;
                if (i10 == 0) {
                    p003a.a.p0(obj3);
                    Object objC2 = ((p030e0.b) obj).c(this.f5670c);
                    sVar.f5688b = 1;
                    if (this.f5669b.c(objC2, sVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p003a.a.p0(obj3);
                }
                return p044f6.i.f13014a;
            case 2:
                if (dVar instanceof x) {
                    xVar = (x) dVar;
                    int i11 = xVar.f5710b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        xVar.f5710b = i11 - Integer.MIN_VALUE;
                    } else {
                        xVar = new x(this, dVar);
                    }
                } else {
                    xVar = new x(this, dVar);
                }
                Object obj4 = xVar.f5709a;
                j6.a aVar3 = j6.a.f14648a;
                int i12 = xVar.f5710b;
                if (i12 == 0) {
                    p003a.a.p0(obj4);
                    Object objC3 = ((p030e0.b) obj).c(this.f5670c);
                    xVar.f5710b = 1;
                    if (this.f5669b.c(objC3, xVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p003a.a.p0(obj4);
                }
                return p044f6.i.f13014a;
            default:
                if (dVar instanceof z) {
                    zVar = (z) dVar;
                    int i13 = zVar.f5718b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        zVar.f5718b = i13 - Integer.MIN_VALUE;
                    } else {
                        zVar = new z(this, dVar);
                    }
                } else {
                    zVar = new z(this, dVar);
                }
                Object obj5 = zVar.f5717a;
                j6.a aVar4 = j6.a.f14648a;
                int i14 = zVar.f5718b;
                if (i14 == 0) {
                    p003a.a.p0(obj5);
                    Object objC4 = ((p030e0.b) obj).c(this.f5670c);
                    zVar.f5718b = 1;
                    if (this.f5669b.c(objC4, zVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p003a.a.p0(obj5);
                }
                return p044f6.i.f13014a;
        }
    }
}
