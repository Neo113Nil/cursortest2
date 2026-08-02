package r;

import b4.EnumC0510a;
import c4.AbstractC0547h;

/* loaded from: classes.dex */
public final class I extends AbstractC0547h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public V.c f18938l;

    /* renamed from: m, reason: collision with root package name */
    public J f18939m;

    /* renamed from: n, reason: collision with root package name */
    public long[] f18940n;

    /* renamed from: o, reason: collision with root package name */
    public int f18941o;

    /* renamed from: p, reason: collision with root package name */
    public int f18942p;

    /* renamed from: q, reason: collision with root package name */
    public int f18943q;

    /* renamed from: r, reason: collision with root package name */
    public int f18944r;

    /* renamed from: s, reason: collision with root package name */
    public long f18945s;

    /* renamed from: t, reason: collision with root package name */
    public int f18946t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f18947u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ J f18948v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ V.c f18949w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j5, V.c cVar, a4.c cVar2) {
        super(cVar2);
        this.f18948v = j5;
        this.f18949w = cVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        I i = new I(this.f18948v, this.f18949w, cVar);
        i.f18947u = obj;
        return i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((n4.h) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0069  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0052 -> B:14:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0054 -> B:6:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0070 -> B:5:0x0095). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n4.h hVar;
        J j5;
        long[] jArr;
        int length;
        V.c cVar;
        int i;
        long j6;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i5 = this.f18946t;
        if (i5 == 0) {
            G4.l.N(obj);
            hVar = (n4.h) this.f18947u;
            j5 = this.f18948v;
            jArr = j5.f18951l.f18933a;
            length = jArr.length - 2;
            if (length >= 0) {
                cVar = this.f18949w;
                i = 0;
                j6 = jArr[i];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i != length) {
                }
            }
            return W3.o.f6046a;
        }
        if (i5 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i6 = this.f18944r;
        int i7 = this.f18943q;
        long j7 = this.f18945s;
        int i8 = this.f18942p;
        int i9 = this.f18941o;
        long[] jArr2 = this.f18940n;
        J j8 = this.f18939m;
        V.c cVar2 = this.f18938l;
        n4.h hVar2 = (n4.h) this.f18947u;
        G4.l.N(obj);
        j7 >>= 8;
        i6++;
        if (i6 < i7) {
            if (i7 == 8) {
                length = i9;
                jArr = jArr2;
                j5 = j8;
                hVar = hVar2;
                i = i8;
                cVar = cVar2;
                if (i != length) {
                    i++;
                    j6 = jArr[i];
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        hVar2 = hVar;
                        i6 = 0;
                        j8 = j5;
                        jArr2 = jArr;
                        i7 = 8 - ((~(i - length)) >>> 31);
                        cVar2 = cVar;
                        i8 = i;
                        i9 = length;
                        j7 = j6;
                        if (i6 < i7) {
                            if ((255 & j7) < 128) {
                                int i10 = (i8 << 3) + i6;
                                cVar2.f5923m = i10;
                                Object obj2 = j8.f18951l.f18934b[i10];
                                this.f18947u = hVar2;
                                this.f18938l = cVar2;
                                this.f18939m = j8;
                                this.f18940n = jArr2;
                                this.f18941o = i9;
                                this.f18942p = i8;
                                this.f18945s = j7;
                                this.f18943q = i7;
                                this.f18944r = i6;
                                this.f18946t = 1;
                                hVar2.c(obj2, this);
                                return enumC0510a;
                            }
                            j7 >>= 8;
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
