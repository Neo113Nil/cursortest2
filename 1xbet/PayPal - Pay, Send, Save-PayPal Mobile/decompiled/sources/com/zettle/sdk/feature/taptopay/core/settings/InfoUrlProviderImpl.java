package com.zettle.sdk.feature.taptopay.core.settings;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\b\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\rR\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/settings/InfoUrlProviderImpl;", "Lcom/zettle/sdk/feature/taptopay/core/settings/InfoUrlProvider;", "Landroid/content/Context;", "p0", "Lcom/zettle/sdk/core/user/UserModule;", "p1", "<init>", "(Landroid/content/Context;Lcom/zettle/sdk/core/user/UserModule;)V", "getHighSpeedVideoSizes", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor", "", "getGeneralTermsUrlRes", "()I", "getPaymentsTermsUrlRes", "getHighResolutionOutputSizeshNQ4ISI", "getPrivacyTermsUrlRes", "Camera2StreamConfigurationMap", "", "getReadMoreUrl", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getReadMoreUrlRes", "getInputSizeshNQ4ISI", "Lcom/zettle/sdk/core/user/UserModule;", "getInputFormats"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class InfoUrlProviderImpl implements com.zettle.sdk.feature.taptopay.core.settings.InfoUrlProvider {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.core.user.UserModule getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    public InfoUrlProviderImpl(android.content.Context context, com.zettle.sdk.core.user.UserModule userModule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userModule, "");
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getInputFormats = userModule;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.settings.InfoUrlProvider
    public final java.lang.String getReadMoreUrl() {
        java.lang.String string = this.getHighSpeedVideoFpsRangesFor.getString(getReadMoreUrlRes(), this.getInputFormats.getCountryId());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.settings.InfoUrlProvider
    public final int getGeneralTermsUrlRes() {
        com.zettle.sdk.core.user.CountryCode countryId = this.getInputFormats.getCountryId();
        switch (countryId == null ? -1 : com.zettle.sdk.feature.taptopay.core.settings.InfoUrlProviderImpl.WhenMappings.$EnumSwitchMapping$0[countryId.ordinal()]) {
            case 1:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_general_terms_us;
            case 2:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_general_terms_se;
            case 3:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_general_terms_nl;
            case 4:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_general_terms_gb;
            case 5:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_general_terms_no;
            case 6:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_general_terms_it;
            case 7:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_general_terms_es;
            case 8:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_general_terms_fr;
            case 9:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_general_terms_de;
            case 10:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_general_terms_dk;
            case 11:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_general_terms_fi;
            default:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_general_terms_gb;
        }
    }

    @Override // com.zettle.sdk.feature.taptopay.core.settings.InfoUrlProvider
    public final int getPaymentsTermsUrlRes() {
        com.zettle.sdk.core.user.CountryCode countryId = this.getInputFormats.getCountryId();
        switch (countryId == null ? -1 : com.zettle.sdk.feature.taptopay.core.settings.InfoUrlProviderImpl.WhenMappings.$EnumSwitchMapping$0[countryId.ordinal()]) {
            case 1:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_payment_terms_us;
            case 2:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_payment_terms_se;
            case 3:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_payment_terms_nl;
            case 4:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_payment_terms_gb;
            case 5:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_payment_terms_no;
            case 6:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_payment_terms_it;
            case 7:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_payment_terms_es;
            case 8:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_payment_terms_fr;
            case 9:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_payment_terms_de;
            case 10:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_payment_terms_dk;
            case 11:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_payment_terms_fi;
            default:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_payment_terms_gb;
        }
    }

    @Override // com.zettle.sdk.feature.taptopay.core.settings.InfoUrlProvider
    public final int getPrivacyTermsUrlRes() {
        com.zettle.sdk.core.user.CountryCode countryId = this.getInputFormats.getCountryId();
        switch (countryId == null ? -1 : com.zettle.sdk.feature.taptopay.core.settings.InfoUrlProviderImpl.WhenMappings.$EnumSwitchMapping$0[countryId.ordinal()]) {
            case 1:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_privacy_terms_us;
            case 2:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_privacy_terms_se;
            case 3:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_privacy_terms_nl;
            case 4:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_privacy_terms_gb;
            case 5:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_privacy_terms_no;
            case 6:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_privacy_terms_it;
            case 7:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_privacy_terms_es;
            case 8:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_privacy_terms_fr;
            case 9:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_privacy_terms_de;
            case 10:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_privacy_terms_dk;
            case 11:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_privacy_terms_fi;
            default:
                return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_privacy_terms_gb;
        }
    }

    @Override // com.zettle.sdk.feature.taptopay.core.settings.InfoUrlProvider
    public final int getReadMoreUrlRes() {
        com.zettle.sdk.core.user.CountryCode countryId = this.getInputFormats.getCountryId();
        if (countryId != null && com.zettle.sdk.feature.taptopay.core.settings.InfoUrlProviderImpl.WhenMappings.$EnumSwitchMapping$0[countryId.ordinal()] == 1) {
            return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_read_more_us;
        }
        return com.zettle.sdk.feature.taptopay.core.R.string.tap_to_pay_url_read_more;
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.zettle.sdk.core.user.CountryCode.values().length];
            try {
                iArr[com.zettle.sdk.core.user.CountryCode.US.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.zettle.sdk.core.user.CountryCode.SE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.zettle.sdk.core.user.CountryCode.NL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.zettle.sdk.core.user.CountryCode.GB.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.zettle.sdk.core.user.CountryCode.NO.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.zettle.sdk.core.user.CountryCode.IT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.zettle.sdk.core.user.CountryCode.ES.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.zettle.sdk.core.user.CountryCode.FR.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.zettle.sdk.core.user.CountryCode.DE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.zettle.sdk.core.user.CountryCode.DK.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.zettle.sdk.core.user.CountryCode.FI.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
