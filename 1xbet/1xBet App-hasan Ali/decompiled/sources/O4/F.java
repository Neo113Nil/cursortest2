package O4;

import java.lang.reflect.Method;
import o0.C2202f;

/* loaded from: classes.dex */
public final class F extends Z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4125d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f4126e;
    public final int f;

    public /* synthetic */ F(Method method, int i, int i5) {
        this.f4125d = i5;
        this.f4126e = method;
        this.f = i;
    }

    @Override // O4.Z
    public final void a(O o5, Object obj) {
        switch (this.f4125d) {
            case 0:
                y4.m mVar = (y4.m) obj;
                if (mVar == null) {
                    throw Z.o(this.f4126e, this.f, "Headers parameter must not be null.", new Object[0]);
                }
                C2202f c2202f = o5.f;
                c2202f.getClass();
                int size = mVar.size();
                for (int i = 0; i < size; i++) {
                    c2202f.b(mVar.e(i), mVar.g(i));
                }
                return;
            default:
                if (obj == null) {
                    throw Z.o(this.f4126e, this.f, "@Url parameter is null.", new Object[0]);
                }
                o5.f4149c = obj.toString();
                return;
        }
    }
}
