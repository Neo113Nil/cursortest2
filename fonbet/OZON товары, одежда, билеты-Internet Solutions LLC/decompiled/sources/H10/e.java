package H10;

import Jb.f;

/* loaded from: classes7.dex */
public final class e implements Jb.e<d> {

    /* renamed from: a, reason: collision with root package name */
    private final f f10510a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<M10.a> f10511b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<ru.ozon.composer.ui.widget.f> f10512c;

    /* renamed from: d, reason: collision with root package name */
    private final f f10513d;

    public e(f fVar, Pc.a aVar, Pc.a aVar2, f fVar2) {
        this.f10510a = fVar;
        this.f10511b = aVar;
        this.f10512c = aVar2;
        this.f10513d = fVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new d((E10.c) this.f10510a.get(), this.f10511b.get(), this.f10512c.get(), (X10.f) this.f10513d.get());
    }
}
