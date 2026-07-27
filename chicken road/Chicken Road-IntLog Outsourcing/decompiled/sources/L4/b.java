package L4;

import f4.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.j implements InterfaceC1441l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f1525f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f1526g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i2) {
        super(1);
        this.f1524e = i2;
        this.f1525f = dVar;
        this.f1526g = cVar;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(Object obj) {
        switch (this.f1524e) {
            case 0:
                this.f1526g.getClass();
                this.f1525f.e(null);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1529g;
                this.f1526g.getClass();
                d dVar = this.f1525f;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                break;
        }
        return v.f5689a;
    }
}
