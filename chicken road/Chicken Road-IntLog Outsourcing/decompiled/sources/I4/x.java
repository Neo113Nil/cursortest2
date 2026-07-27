package I4;

import D4.o0;
import k4.InterfaceC1221g;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.j implements InterfaceC1445p {

    /* renamed from: f, reason: collision with root package name */
    public static final x f1326f = new x(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final x f1327g = new x(2, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final x f1328h = new x(2, 2);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1329e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i2, int i3) {
        super(i2);
        this.f1329e = i3;
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1329e) {
            case 0:
                InterfaceC1221g interfaceC1221g = (InterfaceC1221g) obj2;
                if (!(interfaceC1221g instanceof o0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? interfaceC1221g : Integer.valueOf(intValue + 1);
            case 1:
                o0 o0Var = (o0) obj;
                InterfaceC1221g interfaceC1221g2 = (InterfaceC1221g) obj2;
                if (o0Var != null) {
                    return o0Var;
                }
                if (interfaceC1221g2 instanceof o0) {
                    return (o0) interfaceC1221g2;
                }
                return null;
            default:
                return (z) obj;
        }
    }
}
