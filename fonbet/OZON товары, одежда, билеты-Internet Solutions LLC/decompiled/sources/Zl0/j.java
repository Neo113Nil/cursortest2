package Zl0;

import ru.ozon.app.android.update.rustore.RuStoreInAppUpdateRepository;
import yl0.InterfaceC10919d;
import yl0.InterfaceC10920e;

/* loaded from: classes4.dex */
public final /* synthetic */ class j implements InterfaceC10920e, InterfaceC10919d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f36065a;

    public /* synthetic */ j(Object obj) {
        this.f36065a = obj;
    }

    @Override // yl0.InterfaceC10919d
    public void onFailure(Throwable th2) {
        RuStoreInAppUpdateRepository.completeUpdate$lambda$2((RuStoreInAppUpdateRepository) this.f36065a, th2);
    }

    @Override // yl0.InterfaceC10920e
    public void onSuccess(Object obj) {
        ((i) this.f36065a).f36048e.info("Re-subscription result is Success!");
    }
}
