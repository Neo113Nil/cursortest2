package r;

import b4.EnumC0510a;
import c4.AbstractC0547h;

/* loaded from: classes.dex */
public final class U extends AbstractC0547h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public Object[] f18968l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f18969m;

    /* renamed from: n, reason: collision with root package name */
    public int f18970n;

    /* renamed from: o, reason: collision with root package name */
    public int f18971o;

    /* renamed from: p, reason: collision with root package name */
    public int f18972p;

    /* renamed from: q, reason: collision with root package name */
    public int f18973q;

    /* renamed from: r, reason: collision with root package name */
    public long f18974r;

    /* renamed from: s, reason: collision with root package name */
    public int f18975s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f18976t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ V f18977u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(V v4, a4.c cVar) {
        super(cVar);
        this.f18977u = v4;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        U u5 = new U(this.f18977u, cVar);
        u5.f18976t = obj;
        return u5;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((n4.h) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0051 -> B:14:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0053 -> B:6:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006d -> B:5:0x008a). Please report as a decompilation issue!!! */
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
        int i5 = this.f18975s;
        if (i5 == 0) {
            G4.l.N(obj);
            hVar = (n4.h) this.f18976t;
            C2321G c2321g = (C2321G) this.f18977u.f18979l;
            objArr = c2321g.f18930c;
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
        int i6 = this.f18973q;
        int i7 = this.f18972p;
        long j6 = this.f18974r;
        i = this.f18971o;
        int i8 = this.f18970n;
        long[] jArr2 = this.f18969m;
        Object[] objArr2 = this.f18968l;
        n4.h hVar2 = (n4.h) this.f18976t;
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
                                this.f18976t = hVar2;
                                this.f18968l = objArr2;
                                this.f18969m = jArr2;
                                this.f18970n = i8;
                                this.f18971o = i;
                                this.f18974r = j6;
                                this.f18972p = i7;
                                this.f18973q = i6;
                                this.f18975s = 1;
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
