package D6;

import i6.InterfaceC1290g;
import i6.InterfaceC1292i;
import kotlin.jvm.functions.Function2;

/* renamed from: D6.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0140x extends t6.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0140x f1886b = new C0140x(2, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0140x f1887c = new C0140x(2, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1888a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0140x(int i7, int i8) {
        super(i7);
        this.f1888a = i8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1888a) {
            case 0:
                return ((InterfaceC1292i) obj).plus((InterfaceC1290g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((InterfaceC1292i) obj).plus((InterfaceC1290g) obj2);
        }
    }
}
