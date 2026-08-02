package Ty;

import kotlin.jvm.functions.Function1;
import qc.o;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.initializers.cache.ComposerCacheInvalidatorInitializer;
import ru.ozon.app.android.pdp.ui.configurators.ugc.rateItems.ReviewSuccessConfigurator;

/* renamed from: Ty.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C4052c implements o, qc.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27226b;

    public /* synthetic */ C4052c(Object obj, int i11) {
        this.f27225a = i11;
        this.f27226b = obj;
    }

    @Override // qc.g
    public void accept(Object obj) {
        switch (this.f27225a) {
            case 1:
                ((Function1) this.f27226b).invoke(obj);
                break;
            case 2:
                ((Function1) this.f27226b).invoke(obj);
                break;
            default:
                ((ReviewSuccessConfigurator) this.f27226b).needToRefresh = true;
                break;
        }
    }

    @Override // qc.o
    public Object apply(Object obj) {
        ClearCacheReason cartState$lambda$3;
        cartState$lambda$3 = ComposerCacheInvalidatorInitializer.getCartState$lambda$3((Function1) this.f27226b, obj);
        return cartState$lambda$3;
    }
}
