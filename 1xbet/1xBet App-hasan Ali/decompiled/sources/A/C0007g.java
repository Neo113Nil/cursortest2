package A;

import P.C0315s;
import android.view.ViewStructure;

/* renamed from: A.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007g extends kotlin.jvm.internal.m implements i4.g {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f49l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f50m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0007g(int i, Object obj) {
        super(4);
        this.f49l = i;
        this.f50m = obj;
    }

    @Override // i4.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f49l) {
            case 0:
                C0003c c0003c = (C0003c) obj;
                ((Number) obj2).intValue();
                C0315s c0315s = (C0315s) obj3;
                int intValue = ((Number) obj4).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c0315s.f(c0003c) ? 4 : 2;
                }
                if ((intValue & 131) == 130 && c0315s.B()) {
                    c0315s.S();
                } else {
                    ((X.d) this.f50m).b(c0003c, c0315s, Integer.valueOf(intValue & 14));
                }
                break;
            default:
                int intValue2 = ((Number) obj).intValue();
                int intValue3 = ((Number) obj2).intValue();
                ((ViewStructure) this.f50m).setDimens(intValue2, intValue3, 0, 0, ((Number) obj3).intValue() - intValue2, ((Number) obj4).intValue() - intValue3);
                break;
        }
        return W3.o.f6046a;
    }
}
