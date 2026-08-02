package Hj0;

import ki0.InterfaceC7684a;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.tracker.db.TrackerDataBase;

/* renamed from: Hj0.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3152i implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11176a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f11177b;

    public C3152i(Pc.a aVar) {
        this.f11177b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f11176a) {
            case 0:
                TrackerDataBase dataBase = (TrackerDataBase) this.f11177b.get();
                Intrinsics.checkNotNullParameter(dataBase, "dataBase");
                InterfaceC7684a b11 = dataBase.b();
                Jb.j.d(b11);
                return b11;
            default:
                pf0.i ozonNetworkConfig = (pf0.i) this.f11177b.get();
                Intrinsics.checkNotNullParameter(ozonNetworkConfig, "ozonNetworkConfig");
                pf0.l b12 = aZ.e.b();
                return Boolean.valueOf((b12 != null ? b12.H(ozonNetworkConfig) : null) != null);
        }
    }

    public C3152i(fZ.b bVar, Pc.a aVar) {
        this.f11177b = aVar;
    }
}
