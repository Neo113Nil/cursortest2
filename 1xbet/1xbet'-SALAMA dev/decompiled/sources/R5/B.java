package R5;

import kotlin.jvm.functions.Function1;
import p155w1.V0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class B implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ V0 f6068b;

    public /* synthetic */ B(V0 v6, int i7) {
        this.f6067a = i7;
        this.f6068b = v6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p044f6.f fVar = (p044f6.f) obj;
        switch (this.f6067a) {
            case 0:
                Throwable thA = p044f6.f.a(fVar.f13009a);
                V0 v6 = this.f6068b;
                if (thA != null) {
                    v6.f(p003a.a.w0(thA));
                } else {
                    Object obj2 = fVar.f13009a;
                    if (obj2 instanceof p044f6.e) {
                        obj2 = null;
                    }
                    v6.f(Y4.D.D((Boolean) obj2));
                }
                break;
            default:
                Throwable thA2 = p044f6.f.a(fVar.f13009a);
                V0 v7 = this.f6068b;
                if (thA2 != null) {
                    v7.f(p003a.a.w0(thA2));
                } else {
                    Object obj3 = fVar.f13009a;
                    if (obj3 instanceof p044f6.e) {
                        obj3 = null;
                    }
                    v7.f(Y4.D.D((String) obj3));
                }
                break;
        }
        return p044f6.i.f13014a;
    }
}
