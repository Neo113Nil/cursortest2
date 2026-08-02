package M6;

import f6.C1116i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class b extends t6.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f4608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f4609c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i7) {
        super(1);
        this.f4607a = i7;
        this.f4608b = dVar;
        this.f4609c = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f4607a) {
            case 0:
                this.f4609c.getClass();
                this.f4608b.b(null);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f4612g;
                this.f4609c.getClass();
                d dVar = this.f4608b;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.b(null);
                break;
        }
        return C1116i.f13008a;
    }
}
