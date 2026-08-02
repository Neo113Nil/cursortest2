package org.betup.ui.fragment.shop.compose;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: ShopPriceFormatting.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a\u001a\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a\u0018\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"SHOP_FALLBACK_PRICE", "", "formatShopDisplayPrice", "playPrice", "visualPrice", "shopPurchaseButtonPrice", "price", "isVideoReward", "", "formatShopUnitPriceLabel", "coins", "", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopPriceFormattingKt {
    public static final String SHOP_FALLBACK_PRICE = "$0.00";

    public static final String formatShopDisplayPrice(String str, String str2) {
        String obj = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (obj.length() > 0) {
            return obj;
        }
        String obj2 = str2 != null ? StringsKt.trim((CharSequence) str2).toString() : null;
        String str3 = obj2 != null ? obj2 : "";
        String str4 = str3;
        if (str4.length() > 0) {
            return Character.isDigit(StringsKt.first(str4)) ? "$" + str3 : str3;
        }
        return SHOP_FALLBACK_PRICE;
    }

    public static /* synthetic */ String shopPurchaseButtonPrice$default(String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return shopPurchaseButtonPrice(str, z);
    }

    public static final String shopPurchaseButtonPrice(String price, boolean z) {
        Intrinsics.checkNotNullParameter(price, "price");
        if (z) {
            return price;
        }
        String str = price;
        if (str.length() == 0) {
            str = SHOP_FALLBACK_PRICE;
        }
        return str;
    }

    public static final String formatShopUnitPriceLabel(String price, long j) {
        Double doubleOrNull;
        Intrinsics.checkNotNullParameter(price, "price");
        String str = price;
        if (str.length() == 0 || j <= 0 || (doubleOrNull = StringsKt.toDoubleOrNull(new Regex("[^0-9.]").replace(str, ""))) == null) {
            return null;
        }
        double doubleValue = doubleOrNull.doubleValue() / (j / 1000.0d);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "$%.3f/1000", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
