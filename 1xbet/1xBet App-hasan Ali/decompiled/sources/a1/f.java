package a1;

import P.AbstractC0329z;
import P.C0315s;
import r3.AbstractC2349a;
import x0.f0;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6395l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b0.p f6396m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i4.e f6397n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6398o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(b0.p pVar, i4.e eVar, int i, int i5) {
        super(2);
        this.f6395l = i5;
        this.f6396m = pVar;
        this.f6397n = eVar;
        this.f6398o = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6395l;
        C0315s c0315s = (C0315s) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC2349a.h(this.f6396m, this.f6397n, c0315s, AbstractC0329z.B(this.f6398o | 1));
                break;
            default:
                f0.a(this.f6396m, this.f6397n, c0315s, AbstractC0329z.B(this.f6398o | 1));
                break;
        }
        return W3.o.f6046a;
    }
}
