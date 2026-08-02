package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/PrivacyDisclosureOpener;", "", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;)V", "Landroid/content/Context;", "context", "", "open", "(Landroid/content/Context;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/userstore/UserStore;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PrivacyDisclosureOpener {

    @java.lang.Deprecated
    public static final java.lang.String COUNTRY_PLACEHOLDER = "{country}";

    @java.lang.Deprecated
    public static final java.lang.String DEFAULT_COUNTRY = "us";

    @java.lang.Deprecated
    public static final java.lang.String PRIVACY_URL_TEMPLATE = "https://www.paypal.com/{country}/legalhub/paypal/privacy-full";
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoSizes;
    private static final com.paypal.oslo.feature.searchandintelligence.ui.PrivacyDisclosureOpener.Companion Companion = new com.paypal.oslo.feature.searchandintelligence.ui.PrivacyDisclosureOpener.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public PrivacyDisclosureOpener(com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighSpeedVideoSizes = userStore;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/PrivacyDisclosureOpener$Companion;", "", "<init>", "()V", "", "COUNTRY_PLACEHOLDER", "Ljava/lang/String;", "PRIVACY_URL_TEMPLATE", "DEFAULT_COUNTRY"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r3 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void open(android.content.Context context) {
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.core.userstore.model.User user;
        java.lang.String accountCountryCode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.paypal.oslo.core.userstore.model.UserState value = this.getHighSpeedVideoSizes.getUserState().getValue();
        com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded ? (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value : null;
        if (profileLoaded == null || (user = profileLoaded.getUser()) == null || (accountCountryCode = user.getAccountCountryCode()) == null) {
            str = null;
        } else {
            java.util.Locale locale = java.util.Locale.ROOT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            str = accountCountryCode.toLowerCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        }
        if (str != null) {
            java.lang.String str3 = str;
            str2 = kotlin.text.StringsKt.isBlank(str3) ? null : str3;
        }
        str2 = "us";
        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(PRIVACY_URL_TEMPLATE, COUNTRY_PLACEHOLDER, str2, false, 4, (java.lang.Object) null);
        try {
            context.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(replace$default)));
        } catch (android.content.ActivityNotFoundException e) {
            com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.searchandintelligence.LoggerKt.log, "Failed to open privacy disclosure URL", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", replace$default)), null, e, 4, null);
        }
    }
}
