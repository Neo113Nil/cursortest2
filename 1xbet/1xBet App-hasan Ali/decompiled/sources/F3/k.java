package F3;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class k extends y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f1546b;

    public /* synthetic */ k(y yVar, int i) {
        this.f1545a = i;
        this.f1546b = yVar;
    }

    @Override // F3.y
    public final Object a(N3.a aVar) {
        switch (this.f1545a) {
            case 0:
                return new AtomicLong(((Number) this.f1546b.a(aVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.n()) {
                    arrayList.add(Long.valueOf(((Number) this.f1546b.a(aVar)).longValue()));
                }
                aVar.i();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            default:
                if (aVar.K() != 9) {
                    return this.f1546b.a(aVar);
                }
                aVar.G();
                return null;
        }
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        switch (this.f1545a) {
            case 0:
                this.f1546b.b(bVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.d();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    this.f1546b.b(bVar, Long.valueOf(atomicLongArray.get(i)));
                }
                bVar.i();
                break;
            default:
                if (obj == null) {
                    bVar.n();
                    break;
                } else {
                    this.f1546b.b(bVar, obj);
                    break;
                }
        }
    }
}
