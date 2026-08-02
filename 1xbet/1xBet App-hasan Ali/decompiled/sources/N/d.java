package N;

import K0.O;
import P.AbstractC0329z;
import P.C0315s;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3672l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f3673m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ O f3674n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i4.e f3675o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f3676p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(long j5, O o5, i4.e eVar, int i, int i5) {
        super(2);
        this.f3672l = i5;
        this.f3673m = j5;
        this.f3674n = o5;
        this.f3675o = eVar;
        this.f3676p = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3672l) {
            case 0:
                ((Number) obj2).intValue();
                int B5 = AbstractC0329z.B(this.f3676p | 1);
                O o5 = this.f3674n;
                i4.e eVar = this.f3675o;
                a.a(this.f3673m, o5, eVar, (C0315s) obj, B5);
                break;
            default:
                ((Number) obj2).intValue();
                int B6 = AbstractC0329z.B(this.f3676p | 1);
                O o6 = this.f3674n;
                i4.e eVar2 = this.f3675o;
                n.b(this.f3673m, o6, eVar2, (C0315s) obj, B6);
                break;
        }
        return W3.o.f6046a;
    }
}
