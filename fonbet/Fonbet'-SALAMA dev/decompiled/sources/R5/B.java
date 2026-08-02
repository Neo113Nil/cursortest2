package R5;

import a.AbstractC0603a;
import f6.C1112e;
import f6.C1113f;
import f6.C1116i;
import kotlin.jvm.functions.Function1;
import w1.V0;

/* loaded from: classes2.dex */
public final /* synthetic */ class B implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V0 f6068b;

    public /* synthetic */ B(V0 v02, int i7) {
        this.f6067a = i7;
        this.f6068b = v02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C1113f c1113f = (C1113f) obj;
        switch (this.f6067a) {
            case 0:
                Throwable a2 = C1113f.a(c1113f.f13003a);
                V0 v02 = this.f6068b;
                if (a2 != null) {
                    v02.f(AbstractC0603a.w0(a2));
                } else {
                    Object obj2 = c1113f.f13003a;
                    if (obj2 instanceof C1112e) {
                        obj2 = null;
                    }
                    v02.f(Y4.D.D((Boolean) obj2));
                }
                break;
            default:
                Throwable a4 = C1113f.a(c1113f.f13003a);
                V0 v03 = this.f6068b;
                if (a4 != null) {
                    v03.f(AbstractC0603a.w0(a4));
                } else {
                    Object obj3 = c1113f.f13003a;
                    if (obj3 instanceof C1112e) {
                        obj3 = null;
                    }
                    v03.f(Y4.D.D((String) obj3));
                }
                break;
        }
        return C1116i.f13008a;
    }
}
