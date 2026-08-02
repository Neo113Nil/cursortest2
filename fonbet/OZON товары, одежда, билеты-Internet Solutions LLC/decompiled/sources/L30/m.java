package L30;

import android.content.Context;
import ru.ozon.android.messenger.framework.data.local.database.draft.s;
import ru.ozon.android.messenger.framework.data.repository.T;
import ru.ozon.android.messenger.framework.di.z;
import xe.I;

/* loaded from: classes3.dex */
public final class m implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16526a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f16527b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f16528c;

    public m(Pc.a aVar, Pc.a aVar2) {
        this.f16527b = aVar;
        this.f16528c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f16526a) {
            case 0:
                return new l((Context) this.f16527b.get(), (R30.a) this.f16528c.get());
            default:
                return new T((s) this.f16527b.get(), new ru.ozon.android.messenger.framework.data.local.mapper.a(), (I) ((z) this.f16528c).get());
        }
    }

    public m(Pc.a aVar, ru.ozon.android.messenger.framework.data.local.mapper.b bVar, z zVar) {
        this.f16527b = aVar;
        this.f16528c = zVar;
    }
}
