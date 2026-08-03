package io.appmetrica.analytics.flutter.utils;

/* loaded from: classes.dex */
public class ECommerceConverter {
    private static final java.lang.String ADD_CART_ITEM_EVENT = "add_cart_item_event";
    private static final java.lang.String BEGIN_CHECKOUT_EVENT = "begin_checkout_event";
    private static final java.lang.String PURCHASE_EVENT = "purchase_event";
    private static final java.lang.String REMOVE_CART_ITEM_EVENT = "remove_cart_item_event";
    private static final java.lang.String SHOW_PRODUCT_CARD_EVENT = "show_product_card_event";
    private static final java.lang.String SHOW_PRODUCT_DETAILS_EVENT = "show_product_details_event";
    private static final java.lang.String SHOW_SCREEN_EVENT = "show_screen_event";

    public static io.appmetrica.analytics.ecommerce.ECommerceEvent toNative(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceEventPigeon eCommerceEventPigeon) {
        java.lang.String eventType = eCommerceEventPigeon.getEventType();
        eventType.getClass();
        switch (eventType) {
            case "begin_checkout_event":
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon order = eCommerceEventPigeon.getOrder();
                if (order != null) {
                    return io.appmetrica.analytics.ecommerce.ECommerceEvent.beginCheckoutEvent(toNative(order));
                }
                return null;
            case "remove_cart_item_event":
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon cartItem = eCommerceEventPigeon.getCartItem();
                if (cartItem != null) {
                    return io.appmetrica.analytics.ecommerce.ECommerceEvent.removeCartItemEvent(toNative(cartItem));
                }
                return null;
            case "show_product_card_event":
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon product = eCommerceEventPigeon.getProduct();
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon screen = eCommerceEventPigeon.getScreen();
                if (product == null || screen == null) {
                    return null;
                }
                return io.appmetrica.analytics.ecommerce.ECommerceEvent.showProductCardEvent(toNative(product), toNative(screen));
            case "show_product_details_event":
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon product2 = eCommerceEventPigeon.getProduct();
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon referrer = eCommerceEventPigeon.getReferrer();
                io.appmetrica.analytics.ecommerce.ECommerceReferrer eCommerceReferrer = referrer != null ? toNative(referrer) : null;
                if (product2 != null) {
                    return io.appmetrica.analytics.ecommerce.ECommerceEvent.showProductDetailsEvent(toNative(product2), eCommerceReferrer);
                }
                return null;
            case "add_cart_item_event":
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon cartItem2 = eCommerceEventPigeon.getCartItem();
                if (cartItem2 != null) {
                    return io.appmetrica.analytics.ecommerce.ECommerceEvent.addCartItemEvent(toNative(cartItem2));
                }
                return null;
            case "show_screen_event":
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon screen2 = eCommerceEventPigeon.getScreen();
                if (screen2 != null) {
                    return io.appmetrica.analytics.ecommerce.ECommerceEvent.showScreenEvent(toNative(screen2));
                }
                return null;
            case "purchase_event":
                io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon order2 = eCommerceEventPigeon.getOrder();
                if (order2 != null) {
                    return io.appmetrica.analytics.ecommerce.ECommerceEvent.purchaseEvent(toNative(order2));
                }
                return null;
            default:
                return null;
        }
    }

    private static io.appmetrica.analytics.ecommerce.ECommerceScreen toNative(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon eCommerceScreenPigeon) {
        io.appmetrica.analytics.ecommerce.ECommerceScreen eCommerceScreen = new io.appmetrica.analytics.ecommerce.ECommerceScreen();
        eCommerceScreen.setName(eCommerceScreenPigeon.getName());
        eCommerceScreen.setSearchQuery(eCommerceScreenPigeon.getSearchQuery());
        eCommerceScreen.setCategoriesPath(eCommerceScreenPigeon.getCategoriesPath());
        eCommerceScreen.setPayload(eCommerceScreenPigeon.getPayload());
        return eCommerceScreen;
    }

    private static io.appmetrica.analytics.ecommerce.ECommerceProduct toNative(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceProductPigeon eCommerceProductPigeon) {
        io.appmetrica.analytics.ecommerce.ECommerceProduct eCommerceProduct = new io.appmetrica.analytics.ecommerce.ECommerceProduct(eCommerceProductPigeon.getSku());
        eCommerceProduct.setName(eCommerceProductPigeon.getName());
        eCommerceProduct.setCategoriesPath(eCommerceProductPigeon.getCategoriesPath());
        eCommerceProduct.setPayload(eCommerceProductPigeon.getPayload());
        io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon actualPrice = eCommerceProductPigeon.getActualPrice();
        eCommerceProduct.setActualPrice(actualPrice != null ? toNative(actualPrice) : null);
        io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon originalPrice = eCommerceProductPigeon.getOriginalPrice();
        eCommerceProduct.setOriginalPrice(originalPrice != null ? toNative(originalPrice) : null);
        eCommerceProduct.setPromocodes(eCommerceProductPigeon.getPromocodes());
        return eCommerceProduct;
    }

    private static io.appmetrica.analytics.ecommerce.ECommerceAmount toNative(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon eCommerceAmountPigeon) {
        return new io.appmetrica.analytics.ecommerce.ECommerceAmount(new java.math.BigDecimal(eCommerceAmountPigeon.getAmount()), eCommerceAmountPigeon.getCurrency());
    }

    private static io.appmetrica.analytics.ecommerce.ECommercePrice toNative(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommercePricePigeon eCommercePricePigeon) {
        io.appmetrica.analytics.ecommerce.ECommercePrice eCommercePrice = new io.appmetrica.analytics.ecommerce.ECommercePrice(toNative(eCommercePricePigeon.getFiat()));
        java.util.List<io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon> internalComponents = eCommercePricePigeon.getInternalComponents();
        if (internalComponents != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceAmountPigeon> it = internalComponents.iterator();
            while (it.hasNext()) {
                arrayList.add(toNative(it.next()));
            }
            eCommercePrice.setInternalComponents(arrayList);
        }
        return eCommercePrice;
    }

    private static io.appmetrica.analytics.ecommerce.ECommerceReferrer toNative(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon eCommerceReferrerPigeon) {
        io.appmetrica.analytics.ecommerce.ECommerceReferrer eCommerceReferrer = new io.appmetrica.analytics.ecommerce.ECommerceReferrer();
        eCommerceReferrer.setType(eCommerceReferrerPigeon.getType());
        eCommerceReferrer.setIdentifier(eCommerceReferrerPigeon.getIdentifier());
        io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceScreenPigeon screen = eCommerceReferrerPigeon.getScreen();
        eCommerceReferrer.setScreen(screen != null ? toNative(screen) : null);
        return eCommerceReferrer;
    }

    private static io.appmetrica.analytics.ecommerce.ECommerceCartItem toNative(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon eCommerceCartItemPigeon) {
        io.appmetrica.analytics.ecommerce.ECommerceCartItem eCommerceCartItem = new io.appmetrica.analytics.ecommerce.ECommerceCartItem(toNative(eCommerceCartItemPigeon.getProduct()), toNative(eCommerceCartItemPigeon.getRevenue()), new java.math.BigDecimal(eCommerceCartItemPigeon.getQuantity()));
        io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceReferrerPigeon referrer = eCommerceCartItemPigeon.getReferrer();
        eCommerceCartItem.setReferrer(referrer != null ? toNative(referrer) : null);
        return eCommerceCartItem;
    }

    private static io.appmetrica.analytics.ecommerce.ECommerceOrder toNative(io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceOrderPigeon eCommerceOrderPigeon) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<io.appmetrica.analytics.flutter.pigeon.Pigeon.ECommerceCartItemPigeon> it = eCommerceOrderPigeon.getItems().iterator();
        while (it.hasNext()) {
            arrayList.add(toNative(it.next()));
        }
        io.appmetrica.analytics.ecommerce.ECommerceOrder eCommerceOrder = new io.appmetrica.analytics.ecommerce.ECommerceOrder(eCommerceOrderPigeon.getIdentifier(), arrayList);
        eCommerceOrder.setPayload(eCommerceOrderPigeon.getPayload());
        return eCommerceOrder;
    }
}
