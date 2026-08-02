package F6;

import D6.C0130m;
import b0.O;
import b0.W;
import b0.Z;
import f6.C1115h;
import f6.C1116i;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class n extends t6.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2830b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, int i7) {
        super(1);
        this.f2829a = i7;
        this.f2830b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2829a) {
            case 0:
                C1116i c1116i = C1116i.f13008a;
                ((C0130m) this.f2830b).resumeWith(c1116i);
                break;
            case 1:
                ((M6.h) this.f2830b).d();
                break;
            default:
                Throwable th = (Throwable) obj;
                O o7 = (O) this.f2830b;
                if (th != null) {
                    o7.f9971h.s(new Z(th));
                }
                if (o7.j.f13005b != C1115h.f13007a) {
                    ((W) o7.j.getValue()).close();
                }
                break;
        }
        return C1116i.f13008a;
    }
}
