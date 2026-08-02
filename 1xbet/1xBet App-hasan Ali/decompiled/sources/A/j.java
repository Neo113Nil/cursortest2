package A;

import P.AbstractC0329z;
import P.C0315s;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f54l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f55m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f56n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f57o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i, k kVar, Object obj) {
        super(2);
        this.f55m = kVar;
        this.f56n = i;
        this.f57o = obj;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f54l) {
            case 0:
                ((Number) obj2).intValue();
                int B5 = AbstractC0329z.B(1);
                Object obj3 = this.f57o;
                this.f55m.a(this.f56n, obj3, (C0315s) obj, B5);
                break;
            default:
                C0315s c0315s = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
                    c0315s.S();
                } else {
                    this.f55m.a(this.f56n, this.f57o, c0315s, 0);
                }
                break;
        }
        return W3.o.f6046a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, int i, Object obj, int i5) {
        super(2);
        this.f55m = kVar;
        this.f56n = i;
        this.f57o = obj;
    }
}
