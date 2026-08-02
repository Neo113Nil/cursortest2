package R;

import G4.l;
import W3.o;
import b4.EnumC0510a;
import c4.AbstractC0547h;
import r.C2322H;

/* loaded from: classes.dex */
public final class g extends AbstractC0547h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public Object[] f5109l;

    /* renamed from: m, reason: collision with root package name */
    public long[] f5110m;

    /* renamed from: n, reason: collision with root package name */
    public int f5111n;

    /* renamed from: o, reason: collision with root package name */
    public int f5112o;

    /* renamed from: p, reason: collision with root package name */
    public int f5113p;

    /* renamed from: q, reason: collision with root package name */
    public int f5114q;

    /* renamed from: r, reason: collision with root package name */
    public long f5115r;

    /* renamed from: s, reason: collision with root package name */
    public int f5116s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f5117t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h f5118u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, a4.c cVar) {
        super(cVar);
        this.f5118u = hVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        g gVar = new g(this.f5118u, cVar);
        gVar.f5117t = obj;
        return gVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((n4.h) obj, (a4.c) obj2)).invokeSuspend(o.f6046a);
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
        int i5 = this.f5116s;
        if (i5 == 0) {
            l.N(obj);
            hVar = (n4.h) this.f5117t;
            C2322H c2322h = this.f5118u.f5119k;
            objArr = c2322h.f18934b;
            jArr = c2322h.f18933a;
            length = jArr.length - 2;
            if (length >= 0) {
                i = 0;
                j5 = jArr[i];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return o.f6046a;
        }
        if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i6 = this.f5114q;
        int i7 = this.f5113p;
        long j6 = this.f5115r;
        i = this.f5112o;
        int i8 = this.f5111n;
        long[] jArr2 = this.f5110m;
        Object[] objArr2 = this.f5109l;
        n4.h hVar2 = (n4.h) this.f5117t;
        l.N(obj);
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
                                this.f5117t = hVar2;
                                this.f5109l = objArr2;
                                this.f5110m = jArr2;
                                this.f5111n = i8;
                                this.f5112o = i;
                                this.f5115r = j6;
                                this.f5113p = i7;
                                this.f5114q = i6;
                                this.f5116s = 1;
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
            return o.f6046a;
        }
    }
}
