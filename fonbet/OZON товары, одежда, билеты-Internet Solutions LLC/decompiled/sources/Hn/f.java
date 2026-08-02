package Hn;

import io.sentry.C7222x2;
import io.sentry.InterfaceC7126b0;
import io.sentry.R2;
import java.util.concurrent.Callable;
import ru.ozon.app.android.cart.common.data.CartAddItemResponse;
import ru.ozon.app.android.cart.common.domain.CartChangeAction;
import ru.ozon.app.android.cart.domain.network.CartSyncService;

/* loaded from: classes11.dex */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11223b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11224c;

    public /* synthetic */ f(int i11, Object obj, Object obj2) {
        this.f11222a = i11;
        this.f11223b = obj;
        this.f11224c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        CartAddItemResponse sendActionWithResult$lambda$1;
        switch (this.f11222a) {
            case 0:
                sendActionWithResult$lambda$1 = CartSyncService.sendActionWithResult$lambda$1((CartChangeAction) this.f11223b, (CartSyncService) this.f11224c);
                return sendActionWithResult$lambda$1;
            default:
                return C7222x2.e((InterfaceC7126b0) this.f11223b, (R2) this.f11224c);
        }
    }
}
