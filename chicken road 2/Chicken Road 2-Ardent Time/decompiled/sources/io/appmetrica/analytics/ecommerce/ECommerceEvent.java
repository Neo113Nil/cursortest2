package io.appmetrica.analytics.ecommerce;

/* loaded from: classes.dex */
public abstract class ECommerceEvent implements io.appmetrica.analytics.impl.Kf {
    public static io.appmetrica.analytics.ecommerce.ECommerceEvent addCartItemEvent(io.appmetrica.analytics.ecommerce.ECommerceCartItem eCommerceCartItem) {
        return new io.appmetrica.analytics.impl.C0398h3(4, eCommerceCartItem);
    }

    public static io.appmetrica.analytics.ecommerce.ECommerceEvent beginCheckoutEvent(io.appmetrica.analytics.ecommerce.ECommerceOrder eCommerceOrder) {
        return new io.appmetrica.analytics.impl.C0564ne(6, eCommerceOrder);
    }

    public static io.appmetrica.analytics.ecommerce.ECommerceEvent purchaseEvent(io.appmetrica.analytics.ecommerce.ECommerceOrder eCommerceOrder) {
        return new io.appmetrica.analytics.impl.C0564ne(7, eCommerceOrder);
    }

    public static io.appmetrica.analytics.ecommerce.ECommerceEvent removeCartItemEvent(io.appmetrica.analytics.ecommerce.ECommerceCartItem eCommerceCartItem) {
        return new io.appmetrica.analytics.impl.C0398h3(5, eCommerceCartItem);
    }

    public static io.appmetrica.analytics.ecommerce.ECommerceEvent showProductCardEvent(io.appmetrica.analytics.ecommerce.ECommerceProduct eCommerceProduct, io.appmetrica.analytics.ecommerce.ECommerceScreen eCommerceScreen) {
        return new io.appmetrica.analytics.impl.C0261bl(eCommerceProduct, eCommerceScreen);
    }

    public static io.appmetrica.analytics.ecommerce.ECommerceEvent showProductDetailsEvent(io.appmetrica.analytics.ecommerce.ECommerceProduct eCommerceProduct, io.appmetrica.analytics.ecommerce.ECommerceReferrer eCommerceReferrer) {
        return new io.appmetrica.analytics.impl.C0313dl(eCommerceProduct, eCommerceReferrer);
    }

    public static io.appmetrica.analytics.ecommerce.ECommerceEvent showScreenEvent(io.appmetrica.analytics.ecommerce.ECommerceScreen eCommerceScreen) {
        return new io.appmetrica.analytics.impl.C0364fl(eCommerceScreen);
    }

    public java.lang.String getPublicDescription() {
        return "E-commerce base event";
    }

    @Override // io.appmetrica.analytics.impl.Kf
    public abstract /* synthetic */ java.util.List toProto();
}
