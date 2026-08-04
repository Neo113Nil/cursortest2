package I6;

import D6.B0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends t6.i implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f3762b = new x(2, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f3763c = new x(2, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f3764d = new x(2, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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
                p065i6.g gVar = (p065i6.g) obj2;
                if (!(gVar instanceof B0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? gVar : Integer.valueOf(iIntValue + 1);
            case 1:
                B0 b7 = (B0) obj;
                p065i6.g gVar2 = (p065i6.g) obj2;
                if (b7 != null) {
                    return b7;
                }
                if (gVar2 instanceof B0) {
                    return (B0) gVar2;
                }
                return null;
            default:
                return (z) obj;
        }
    }
}
