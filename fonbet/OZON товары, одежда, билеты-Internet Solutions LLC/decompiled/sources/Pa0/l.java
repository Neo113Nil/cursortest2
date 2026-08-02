package Pa0;

import android.content.Context;
import ru.ozon.android.messenger.framework.data.repository.S;

/* loaded from: classes3.dex */
public final class l implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22139a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f22140b;

    public /* synthetic */ l(Pc.a aVar, int i11) {
        this.f22139a = i11;
        this.f22140b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f22139a) {
            case 0:
                return new k(Jb.d.a(this.f22140b));
            case 1:
                return new ru.ozon.android.messenger.blocks.input.viewmodel.e((S) this.f22140b.get());
            default:
                return new s90.g((Context) this.f22140b.get());
        }
    }
}
