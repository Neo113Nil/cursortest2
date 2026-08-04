package F6;

import D6.C0130m;
import kotlin.jvm.functions.Function1;
import p010b0.O;
import p010b0.W;
import p010b0.Z;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends t6.i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
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
                p044f6.i iVar = p044f6.i.f13014a;
                ((C0130m) this.f2830b).resumeWith(iVar);
                return iVar;
            case 1:
                ((M6.h) this.f2830b).d();
                return p044f6.i.f13014a;
            default:
                Throwable th = (Throwable) obj;
                O o7 = (O) this.f2830b;
                if (th != null) {
                    o7.f9971h.s(new Z(th));
                }
                if (o7.j.f13011b != p044f6.h.f13013a) {
                    ((W) o7.j.getValue()).close();
                }
                return p044f6.i.f13014a;
        }
    }
}
