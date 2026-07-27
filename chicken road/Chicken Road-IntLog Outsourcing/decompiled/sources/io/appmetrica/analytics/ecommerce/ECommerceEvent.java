package io.appmetrica.analytics.ecommerce;

import io.appmetrica.analytics.impl.C0650fl;
import io.appmetrica.analytics.impl.C0702hl;
import io.appmetrica.analytics.impl.C0753jl;
import io.appmetrica.analytics.impl.C0891p3;
import io.appmetrica.analytics.impl.C1031ue;
import io.appmetrica.analytics.impl.Pf;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ECommerceEvent implements Pf {
    public static ECommerceEvent addCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C0891p3(4, eCommerceCartItem);
    }

    public static ECommerceEvent beginCheckoutEvent(ECommerceOrder eCommerceOrder) {
        return new C1031ue(6, eCommerceOrder);
    }

    public static ECommerceEvent purchaseEvent(ECommerceOrder eCommerceOrder) {
        return new C1031ue(7, eCommerceOrder);
    }

    public static ECommerceEvent removeCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return new C0891p3(5, eCommerceCartItem);
    }

    public static ECommerceEvent showProductCardEvent(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        return new C0650fl(eCommerceProduct, eCommerceScreen);
    }

    public static ECommerceEvent showProductDetailsEvent(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        return new C0702hl(eCommerceProduct, eCommerceReferrer);
    }

    public static ECommerceEvent showScreenEvent(ECommerceScreen eCommerceScreen) {
        return new C0753jl(eCommerceScreen);
    }

    public String getPublicDescription() {
        return "E-commerce base event";
    }

    @Override // io.appmetrica.analytics.impl.Pf
    public abstract /* synthetic */ List toProto();
}
