package K80;

import a70.C4959b;
import ru.ozon.fintech.features.offline.network.OfflineNetwork;

/* loaded from: classes3.dex */
public final class i implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15382a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f15383b;

    public /* synthetic */ i(Pc.a aVar, int i11) {
        this.f15382a = i11;
        this.f15383b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f15382a) {
            case 0:
                return new g((a) ((Jb.f) this.f15383b).get());
            default:
                return new C4959b((OfflineNetwork) this.f15383b.get());
        }
    }
}
