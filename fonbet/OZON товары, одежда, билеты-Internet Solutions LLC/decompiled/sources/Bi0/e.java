package Bi0;

import ei0.InterfaceC6369b;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import za0.InterfaceC11014a;

/* loaded from: classes3.dex */
public final class e implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3878a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f3879b;

    public /* synthetic */ e(Jb.f fVar, int i11) {
        this.f3878a = i11;
        this.f3879b = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f3878a) {
            case 0:
                return new d((InterfaceC6369b) this.f3879b.get());
            case 1:
                return new P90.b((ExternalFintechSettings) this.f3879b.get());
            default:
                return new Sa0.a((InterfaceC11014a) this.f3879b.get());
        }
    }
}
