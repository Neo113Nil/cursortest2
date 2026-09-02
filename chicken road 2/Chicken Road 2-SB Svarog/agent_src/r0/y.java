package r0;

import F.AbstractC0010k;

/* loaded from: classes.dex */
public final class y extends g0.i implements f0.p {

    /* renamed from: d, reason: collision with root package name */
    public static final y f1200d;

    /* renamed from: e, reason: collision with root package name */
    public static final y f1201e;

    /* renamed from: f, reason: collision with root package name */
    public static final y f1202f;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1203c;

    static {
        int i2 = 2;
        f1200d = new y(i2, 0);
        f1201e = new y(i2, 1);
        f1202f = new y(i2, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i2, int i3) {
        super(i2);
        this.f1203c = i3;
    }

    @Override // f0.p
    public final Object g(Object obj, Object obj2) {
        switch (this.f1203c) {
            case 0:
                return obj;
            case 1:
                AbstractC0010k.e(obj);
                return null;
            default:
                return (A) obj;
        }
    }
}
