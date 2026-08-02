package org.betup.model.remote.api.rest.shop;

import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ShopRequestParams.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0007J\b\u0010\r\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lorg/betup/model/remote/api/rest/shop/ShopRequestParams;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "EXTRA_SHOP_TYPE", "", "SHOP_TYPE_NEW", "SHOP_TYPE_OLD", "bundle", "Landroid/os/Bundle;", "shopType", "shopTypeFrom", DynamicLink.Builder.KEY_DYNAMIC_LINK_PARAMETERS, "defaultShopType", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShopRequestParams {
    public static final int $stable = 0;
    public static final String EXTRA_SHOP_TYPE = "shop_type";
    public static final ShopRequestParams INSTANCE = new ShopRequestParams();
    public static final String SHOP_TYPE_NEW = "NEW";
    public static final String SHOP_TYPE_OLD = "OLD";

    private ShopRequestParams() {
    }

    @JvmStatic
    public static final Bundle bundle(String shopType) {
        Intrinsics.checkNotNullParameter(shopType, "shopType");
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_SHOP_TYPE, shopType);
        return bundle;
    }

    @JvmStatic
    public static final String shopTypeFrom(Bundle parameters) {
        String string;
        return (parameters == null || (string = parameters.getString(EXTRA_SHOP_TYPE)) == null) ? defaultShopType() : string;
    }

    @JvmStatic
    public static final String defaultShopType() {
        return SHOP_TYPE_NEW;
    }
}
