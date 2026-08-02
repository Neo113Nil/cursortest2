package Mw;

import M4.c;
import android.os.Bundle;
import ru.ozon.android.messenger.framework.composer.utils.b;
import ru.ozon.app.android.fresh.navigation.FreshViewModelImpl;
import ru.ozon.app.android.utils.SoftInputChangeDelegate;

/* renamed from: Mw.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C3641a implements c.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18174b;

    public /* synthetic */ C3641a(Object obj, int i11) {
        this.f18173a = i11;
        this.f18174b = obj;
    }

    @Override // M4.c.b
    public final Bundle saveState() {
        Bundle init$lambda$1;
        Bundle register$lambda$1;
        switch (this.f18173a) {
            case 0:
                init$lambda$1 = FreshViewModelImpl.init$lambda$1((FreshViewModelImpl) this.f18174b);
                return init$lambda$1;
            case 1:
                return b.a((b) this.f18174b);
            default:
                register$lambda$1 = SoftInputChangeDelegate.register$lambda$1((SoftInputChangeDelegate) this.f18174b);
                return register$lambda$1;
        }
    }
}
