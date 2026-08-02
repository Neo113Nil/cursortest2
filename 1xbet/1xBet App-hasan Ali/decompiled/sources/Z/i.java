package Z;

import b4.EnumC0510a;
import c4.AbstractC0547h;

/* loaded from: classes.dex */
public final class i extends AbstractC0547h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public long[] f6192l;

    /* renamed from: m, reason: collision with root package name */
    public int f6193m;

    /* renamed from: n, reason: collision with root package name */
    public int f6194n;

    /* renamed from: o, reason: collision with root package name */
    public int f6195o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f6196p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ j f6197q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, a4.c cVar) {
        super(cVar);
        this.f6197q = jVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        i iVar = new i(this.f6197q, cVar);
        iVar.f6196p = obj;
        return iVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((n4.h) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00c4 -> B:7:0x00c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0087 -> B:20:0x009c). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j5;
        n4.h hVar;
        long[] jArr;
        int length;
        int i;
        n4.h hVar2;
        int i5;
        n4.h hVar3;
        int i6;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i7 = this.f6195o;
        j jVar = this.f6197q;
        long j6 = jVar.f6199k;
        long j7 = jVar.f6201m;
        long j8 = jVar.f6200l;
        if (i7 == 0) {
            j5 = 1;
            G4.l.N(obj);
            hVar = (n4.h) this.f6196p;
            jArr = jVar.f6202n;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j8 != 0) {
                hVar2 = hVar;
                i5 = 0;
                if (i5 >= 64) {
                }
            }
            if (j6 != 0) {
            }
            return W3.o.f6046a;
        }
        if (i7 == 1) {
            length = this.f6194n;
            int i8 = this.f6193m;
            j5 = 1;
            jArr = this.f6192l;
            hVar = (n4.h) this.f6196p;
            G4.l.N(obj);
            i = i8 + 1;
        } else {
            if (i7 != 2) {
                if (i7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = this.f6193m;
                hVar3 = (n4.h) this.f6196p;
                G4.l.N(obj);
                j5 = 1;
                i6 = i9 + 1;
                if (i6 < 64) {
                    if (((j5 << i6) & j6) != 0) {
                        Long l5 = new Long(j7 + i6 + 64);
                        this.f6196p = hVar3;
                        this.f6192l = null;
                        this.f6193m = i6;
                        this.f6195o = 3;
                        hVar3.c(l5, this);
                        return enumC0510a;
                    }
                    i9 = i6;
                    i6 = i9 + 1;
                    if (i6 < 64) {
                    }
                }
                return W3.o.f6046a;
            }
            i5 = this.f6193m;
            hVar2 = (n4.h) this.f6196p;
            G4.l.N(obj);
            j5 = 1;
            i5++;
            if (i5 >= 64) {
                hVar = hVar2;
                if (j6 != 0) {
                    hVar3 = hVar;
                    i6 = 0;
                    if (i6 < 64) {
                    }
                }
                return W3.o.f6046a;
            }
            if ((j8 & (j5 << i5)) != 0) {
                Long l6 = new Long(j7 + i5);
                this.f6196p = hVar2;
                this.f6192l = null;
                this.f6193m = i5;
                this.f6195o = 2;
                hVar2.c(l6, this);
                return enumC0510a;
            }
            i5++;
            if (i5 >= 64) {
            }
        }
        if (i < length) {
            Long l7 = new Long(jArr[i]);
            this.f6196p = hVar;
            this.f6192l = jArr;
            this.f6193m = i;
            this.f6194n = length;
            this.f6195o = 1;
            hVar.c(l7, this);
            return enumC0510a;
        }
        if (j8 != 0) {
        }
        if (j6 != 0) {
        }
        return W3.o.f6046a;
    }
}
