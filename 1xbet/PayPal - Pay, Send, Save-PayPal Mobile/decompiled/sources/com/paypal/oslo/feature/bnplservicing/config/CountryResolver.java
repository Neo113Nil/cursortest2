package com.paypal.oslo.feature.bnplservicing.config;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/config/CountryResolver;", "", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;)V", "Lcom/paypal/oslo/feature/bnplservicing/config/Country;", "getCountry", "()Lcom/paypal/oslo/feature/bnplservicing/config/Country;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CountryResolver {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CountryResolver(com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighSpeedVideoFpsRanges = userStore;
    }

    public final com.paypal.oslo.feature.bnplservicing.config.Country getCountry() {
        com.paypal.oslo.core.userstore.model.UserState value = this.getHighSpeedVideoFpsRanges.getUserState().getValue();
        return value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? com.paypal.oslo.feature.bnplservicing.config.Country.INSTANCE.fromCode(((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value).getUser().getAccountCountryCode()) : com.paypal.oslo.feature.bnplservicing.config.Country.UNKNOWN;
    }
}
