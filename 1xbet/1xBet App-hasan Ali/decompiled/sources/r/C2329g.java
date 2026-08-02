package r;

import b4.EnumC0510a;
import c4.AbstractC0547h;

/* renamed from: r.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2329g extends AbstractC0547h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public C2330h f18997l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f18998m;

    /* renamed from: n, reason: collision with root package name */
    public int f18999n;

    /* renamed from: o, reason: collision with root package name */
    public int f19000o;

    /* renamed from: p, reason: collision with root package name */
    public int f19001p;

    /* renamed from: q, reason: collision with root package name */
    public int f19002q;

    /* renamed from: r, reason: collision with root package name */
    public long f19003r;

    /* renamed from: s, reason: collision with root package name */
    public int f19004s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f19005t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2330h f19006u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2329g(C2330h c2330h, a4.c cVar) {
        super(cVar);
        this.f19006u = c2330h;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2329g c2329g = new C2329g(this.f19006u, cVar);
        c2329g.f19005t = obj;
        return c2329g;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2329g) create((n4.h) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004e -> B:14:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0050 -> B:6:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006b -> B:5:0x0096). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n4.h hVar;
        C2330h c2330h;
        long[] jArr;
        int length;
        int i;
        long j5;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i5 = this.f19004s;
        if (i5 == 0) {
            G4.l.N(obj);
            hVar = (n4.h) this.f19005t;
            c2330h = this.f19006u;
            jArr = c2330h.f19008l.f18928a;
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
        int i6 = this.f19002q;
        int i7 = this.f19001p;
        long j6 = this.f19003r;
        i = this.f19000o;
        int i8 = this.f18999n;
        long[] jArr2 = this.f18998m;
        C2330h c2330h2 = this.f18997l;
        n4.h hVar2 = (n4.h) this.f19005t;
        G4.l.N(obj);
        j6 >>= 8;
        i6++;
        if (i6 < i7) {
            if (i7 == 8) {
                length = i8;
                jArr = jArr2;
                c2330h = c2330h2;
                hVar = hVar2;
                if (i != length) {
                    i++;
                    j5 = jArr[i];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        c2330h2 = c2330h;
                        i7 = 8 - ((~(i - length)) >>> 31);
                        hVar2 = hVar;
                        i6 = 0;
                        jArr2 = jArr;
                        i8 = length;
                        j6 = j5;
                        if (i6 < i7) {
                            if ((255 & j6) < 128) {
                                int i9 = (i << 3) + i6;
                                C2321G c2321g = c2330h2.f19008l;
                                U.a aVar = new U.a(1, c2321g.f18929b[i9], c2321g.f18930c[i9]);
                                this.f19005t = hVar2;
                                this.f18997l = c2330h2;
                                this.f18998m = jArr2;
                                this.f18999n = i8;
                                this.f19000o = i;
                                this.f19003r = j6;
                                this.f19001p = i7;
                                this.f19002q = i6;
                                this.f19004s = 1;
                                hVar2.c(aVar, this);
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
