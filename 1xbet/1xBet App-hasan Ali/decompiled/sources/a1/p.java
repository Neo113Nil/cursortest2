package a1;

import P.C0315s;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: m, reason: collision with root package name */
    public static final p f6418m = new p(2, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final p f6419n = new p(2, 1);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6420l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, int i5) {
        super(i);
        this.f6420l = i5;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6420l) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                int intValue = ((Number) obj2).intValue();
                if (!c0315s.P(intValue & 1, (intValue & 3) != 2)) {
                    c0315s.S();
                }
                break;
            default:
                C0315s c0315s2 = (C0315s) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (!c0315s2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    c0315s2.S();
                }
                break;
        }
        return W3.o.f6046a;
    }
}
