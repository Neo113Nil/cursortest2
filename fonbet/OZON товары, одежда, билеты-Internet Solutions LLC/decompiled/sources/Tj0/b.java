package Tj0;

import Jb.e;
import ru.ozon.android.hardwareinfo.powermanager.PowerManagerRepository;
import xe.M;

/* loaded from: classes7.dex */
public final class b implements e<a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<PowerManagerRepository> f27198a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<M> f27199b;

    public b(Pc.a<PowerManagerRepository> aVar, Pc.a<M> aVar2) {
        this.f27198a = aVar;
        this.f27199b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new a(this.f27198a.get(), this.f27199b.get());
    }
}
