package com.paypal.oslo.feature.bnplacquisition.config;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a%\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0001\"\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/config/Country;", "", "countries", "", "isAvailableFor", "(Lcom/paypal/oslo/feature/bnplacquisition/config/Country;[Lcom/paypal/oslo/feature/bnplacquisition/config/Country;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CountryKt {
    public static final boolean isAvailableFor(com.paypal.oslo.feature.bnplacquisition.config.Country country, com.paypal.oslo.feature.bnplacquisition.config.Country... countryArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(country, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryArr, "");
        return kotlin.collections.ArraysKt.contains(countryArr, country);
    }
}
