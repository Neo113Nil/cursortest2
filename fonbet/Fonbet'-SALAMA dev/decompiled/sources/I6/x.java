package I6;

import D6.B0;
import i6.InterfaceC1290g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class x extends t6.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final x f3762b = new x(2, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final x f3763c = new x(2, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final x f3764d = new x(2, 2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3765a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i7, int i8) {
        super(i7);
        this.f3765a = i8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3765a) {
            case 0:
                InterfaceC1290g interfaceC1290g = (InterfaceC1290g) obj2;
                if (!(interfaceC1290g instanceof B0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? interfaceC1290g : Integer.valueOf(intValue + 1);
            case 1:
                B0 b02 = (B0) obj;
                InterfaceC1290g interfaceC1290g2 = (InterfaceC1290g) obj2;
                if (b02 != null) {
                    return b02;
                }
                if (interfaceC1290g2 instanceof B0) {
                    return (B0) interfaceC1290g2;
                }
                return null;
            default:
                return (z) obj;
        }
    }
}
