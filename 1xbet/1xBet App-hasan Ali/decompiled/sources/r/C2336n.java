package r;

import b4.EnumC0510a;
import c4.AbstractC0547h;

/* renamed from: r.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2336n extends AbstractC0547h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public Object[] f19018l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f19019m;

    /* renamed from: n, reason: collision with root package name */
    public int f19020n;

    /* renamed from: o, reason: collision with root package name */
    public int f19021o;

    /* renamed from: p, reason: collision with root package name */
    public int f19022p;

    /* renamed from: q, reason: collision with root package name */
    public int f19023q;

    /* renamed from: r, reason: collision with root package name */
    public long f19024r;

    /* renamed from: s, reason: collision with root package name */
    public int f19025s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f19026t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2330h f19027u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2336n(C2330h c2330h, a4.c cVar) {
        super(cVar);
        this.f19027u = c2330h;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2336n c2336n = new C2336n(this.f19027u, cVar);
        c2336n.f19026t = obj;
        return c2336n;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2336n) create((n4.h) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:14:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:6:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006b -> B:5:0x0088). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n4.h hVar;
        Object[] objArr;
        long[] jArr;
        int length;
        int i;
        long j5;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i5 = this.f19025s;
        if (i5 == 0) {
            G4.l.N(obj);
            hVar = (n4.h) this.f19026t;
            C2321G c2321g = this.f19027u.f19008l;
            objArr = c2321g.f18929b;
            jArr = c2321g.f18928a;
            length = jArr.length - 2;
            if (length >= 0) {
                i = 0;
                j5 = jArr[i];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return W3.o.f6046a;
        }
        if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i6 = this.f19023q;
        int i7 = this.f19022p;
        long j6 = this.f19024r;
        i = this.f19021o;
        int i8 = this.f19020n;
        long[] jArr2 = this.f19019m;
        Object[] objArr2 = this.f19018l;
        n4.h hVar2 = (n4.h) this.f19026t;
        G4.l.N(obj);
        j6 >>= 8;
        i6++;
        if (i6 < i7) {
            if (i7 == 8) {
                length = i8;
                jArr = jArr2;
                objArr = objArr2;
                hVar = hVar2;
                if (i != length) {
                    i++;
                    j5 = jArr[i];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        hVar2 = hVar;
                        i6 = 0;
                        jArr2 = jArr;
                        i8 = length;
                        i7 = 8 - ((~(i - length)) >>> 31);
                        objArr2 = objArr;
                        j6 = j5;
                        if (i6 < i7) {
                            if ((255 & j6) < 128) {
                                Object obj2 = objArr2[(i << 3) + i6];
                                this.f19026t = hVar2;
                                this.f19018l = objArr2;
                                this.f19019m = jArr2;
                                this.f19020n = i8;
                                this.f19021o = i;
                                this.f19024r = j6;
                                this.f19022p = i7;
                                this.f19023q = i6;
                                this.f19025s = 1;
                                hVar2.c(obj2, this);
                                return enumC0510a;
                            }
                            j6 >>= 8;
                            i6++;
                            if (i6 < i7) {
                            }
                        }
                    }
                    if (i != length) {
                    }
                }
            }
            return W3.o.f6046a;
        }
    }
}
