package B6;

import D6.o0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1207b;

    public /* synthetic */ e(Object obj, int i7) {
        this.f1206a = i7;
        this.f1207b = obj;
    }

    @Override // B6.b
    public final Iterator iterator() {
        switch (this.f1206a) {
            case 0:
                o0 o0Var = (o0) this.f1207b;
                c cVar = new c();
                cVar.f1205c = P6.b.i(cVar, cVar, o0Var);
                return cVar;
            case 1:
                return (Iterator) this.f1207b;
            case 2:
                return new C6.d((String) this.f1207b);
            default:
                return new p115p6.d(this);
        }
    }
}
