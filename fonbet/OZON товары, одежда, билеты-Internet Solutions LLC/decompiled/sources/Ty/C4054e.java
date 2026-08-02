package Ty;

import kotlin.jvm.functions.Function1;
import qc.o;
import qc.q;
import ru.ozon.app.android.composer.network.cache.ClearCacheReason;
import ru.ozon.app.android.initializers.cache.ComposerCacheInvalidatorInitializer;
import ru.ozon.app.android.marketing.coupon.data.CouponStorage;

/* renamed from: Ty.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C4054e implements o, q, qc.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f27228a;

    public /* synthetic */ C4054e(Function1 function1) {
        this.f27228a = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        this.f27228a.invoke(obj);
    }

    @Override // qc.o
    public Object apply(Object obj) {
        ClearCacheReason adultState$lambda$2;
        adultState$lambda$2 = ComposerCacheInvalidatorInitializer.getAdultState$lambda$2(this.f27228a, obj);
        return adultState$lambda$2;
    }

    @Override // qc.q
    public boolean test(Object obj) {
        boolean observeAuth$lambda$1;
        observeAuth$lambda$1 = CouponStorage.observeAuth$lambda$1(this.f27228a, obj);
        return observeAuth$lambda$1;
    }
}
