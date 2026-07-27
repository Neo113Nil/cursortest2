package B2;

import g2.InterfaceC0322f;
import w2.g0;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.k implements o2.p {
    public static final x f = new x(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final x f186g = new x(2, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final x f187h = new x(2, 2);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f188e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i3, int i4) {
        super(i3);
        this.f188e = i4;
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f188e) {
            case 0:
                InterfaceC0322f interfaceC0322f = (InterfaceC0322f) obj2;
                if (!(interfaceC0322f instanceof g0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? interfaceC0322f : Integer.valueOf(intValue + 1);
            case 1:
                g0 g0Var = (g0) obj;
                InterfaceC0322f interfaceC0322f2 = (InterfaceC0322f) obj2;
                if (g0Var != null) {
                    return g0Var;
                }
                if (interfaceC0322f2 instanceof g0) {
                    return (g0) interfaceC0322f2;
                }
                return null;
            default:
                return (z) obj;
        }
    }
}
