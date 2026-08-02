package Bi0;

import ei0.InterfaceC6369b;

/* loaded from: classes3.dex */
public final class h implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3882a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.e f3883b;

    public /* synthetic */ h(Jb.e eVar, int i11) {
        this.f3882a = i11;
        this.f3883b = eVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f3882a) {
            case 0:
                return new g((InterfaceC6369b) ((Jb.f) this.f3883b).get());
            default:
                return new K40.b((e50.f) ((Ia0.b) this.f3883b).get());
        }
    }
}
