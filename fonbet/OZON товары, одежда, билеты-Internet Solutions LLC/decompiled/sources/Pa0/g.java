package Pa0;

import android.content.Context;
import s90.C9635d;

/* loaded from: classes3.dex */
public final class g implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22130a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f22131b;

    public /* synthetic */ g(Pc.a aVar, int i11) {
        this.f22130a = i11;
        this.f22131b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f22130a) {
            case 0:
                return new f(Jb.d.a(this.f22131b));
            case 1:
                return new ru.ozon.android.messenger.framework.domain.usecases.ai.a((ru.ozon.android.messenger.framework.domain.repository.b) this.f22131b.get());
            default:
                return new C9635d((Context) this.f22131b.get());
        }
    }
}
