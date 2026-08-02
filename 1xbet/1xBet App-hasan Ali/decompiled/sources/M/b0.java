package M;

import P.AbstractC0329z;
import P.C0315s;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3295l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b0.p f3296m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f3297n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f3298o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f3299p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f3300q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(b0.p pVar, long j5, float f, long j6, int i, int i5) {
        super(2);
        this.f3296m = pVar;
        this.f3297n = j5;
        this.f3300q = f;
        this.f3298o = j6;
        this.f3299p = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3295l) {
            case 0:
                ((Number) obj2).intValue();
                int B5 = AbstractC0329z.B(3511);
                long j5 = this.f3297n;
                float f = this.f3300q;
                b0.p pVar = this.f3296m;
                long j6 = this.f3298o;
                e0.a(f, this.f3299p, B5, j5, j6, (C0315s) obj, pVar);
                break;
            default:
                ((Number) obj2).intValue();
                int B6 = AbstractC0329z.B(433);
                long j7 = this.f3297n;
                long j8 = this.f3298o;
                b0.p pVar2 = this.f3296m;
                int i = this.f3299p;
                e0.b(this.f3300q, i, B6, j7, j8, (C0315s) obj, pVar2);
                break;
        }
        return W3.o.f6046a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(b0.p pVar, long j5, long j6, int i, float f, int i5) {
        super(2);
        this.f3296m = pVar;
        this.f3297n = j5;
        this.f3298o = j6;
        this.f3299p = i;
        this.f3300q = f;
    }
}
