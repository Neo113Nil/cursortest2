package com.google.zxing.oned;

/* loaded from: classes9.dex */
final class EANManufacturerOrgSupport {
    private final java.util.List<int[]> ranges = new java.util.ArrayList();
    private final java.util.List<java.lang.String> countryIdentifiers = new java.util.ArrayList();

    EANManufacturerOrgSupport() {
    }

    final java.lang.String lookupCountryIdentifier(java.lang.String str) {
        int[] iArr;
        int i;
        initIfNeeded();
        int parseInt = java.lang.Integer.parseInt(str.substring(0, 3));
        int size = this.ranges.size();
        for (int i2 = 0; i2 < size && parseInt >= (i = (iArr = this.ranges.get(i2))[0]); i2++) {
            if (iArr.length != 1) {
                i = iArr[1];
            }
            if (parseInt <= i) {
                return this.countryIdentifiers.get(i2);
            }
        }
        return null;
    }

    private void add(int[] iArr, java.lang.String str) {
        this.ranges.add(iArr);
        this.countryIdentifiers.add(str);
    }

    private void initIfNeeded() {
        synchronized (this) {
            if (this.ranges.isEmpty()) {
                add(new int[]{0, 19}, "US/CA");
                add(new int[]{30, 39}, "US");
                add(new int[]{60, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, "US/CA");
                add(new int[]{300, 379}, "FR");
                add(new int[]{380}, "BG");
                add(new int[]{383}, "SI");
                add(new int[]{385}, "HR");
                add(new int[]{387}, "BA");
                add(new int[]{400, 440}, "DE");
                add(new int[]{450, 459}, "JP");
                add(new int[]{460, 469}, "RU");
                add(new int[]{471}, "TW");
                add(new int[]{474}, "EE");
                add(new int[]{475}, "LV");
                add(new int[]{476}, "AZ");
                add(new int[]{477}, "LT");
                add(new int[]{478}, "UZ");
                add(new int[]{479}, "LK");
                add(new int[]{androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND}, "PH");
                add(new int[]{481}, "BY");
                add(new int[]{482}, "UA");
                add(new int[]{484}, "MD");
                add(new int[]{485}, "AM");
                add(new int[]{486}, "GE");
                add(new int[]{487}, "KZ");
                add(new int[]{489}, "HK");
                add(new int[]{490, 499}, "JP");
                add(new int[]{500, 509}, "GB");
                add(new int[]{my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_ATTEST_COTS_FAIL}, "GR");
                add(new int[]{528}, com.google.zxing.client.result.ExpandedProductParsedResult.POUND);
                add(new int[]{529}, "CY");
                add(new int[]{531}, "MK");
                add(new int[]{535}, "MT");
                add(new int[]{539}, "IE");
                add(new int[]{540, 549}, "BE/LU");
                add(new int[]{560}, "PT");
                add(new int[]{569}, "IS");
                add(new int[]{570, 579}, "DK");
                add(new int[]{590}, "PL");
                add(new int[]{594}, "RO");
                add(new int[]{599}, "HU");
                add(new int[]{600, 601}, "ZA");
                add(new int[]{603}, "GH");
                add(new int[]{androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_DRAW_PATH}, "BH");
                add(new int[]{androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_POLAR_RELATIVETO}, "MU");
                add(new int[]{androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE}, "MA");
                add(new int[]{613}, "DZ");
                add(new int[]{616}, "KE");
                add(new int[]{618}, "CI");
                add(new int[]{619}, "TN");
                add(new int[]{com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VAS_NOT_FOUND}, "SY");
                add(new int[]{com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VAS_PROFILE_NOT_FOUND}, "EG");
                add(new int[]{624}, "LY");
                add(new int[]{625}, "JO");
                add(new int[]{626}, "IR");
                add(new int[]{627}, "KW");
                add(new int[]{628}, "SA");
                add(new int[]{629}, "AE");
                add(new int[]{640, 649}, "FI");
                add(new int[]{690, 695}, "CN");
                add(new int[]{700, 709}, org.apache.commons.imaging.formats.pnm.PnmImageParser.PARAM_VALUE_PNM_RAWBITS_NO);
                add(new int[]{729}, "IL");
                add(new int[]{730, 739}, "SE");
                add(new int[]{740}, "GT");
                add(new int[]{741}, "SV");
                add(new int[]{742}, "HN");
                add(new int[]{743}, "NI");
                add(new int[]{744}, "CR");
                add(new int[]{745}, "PA");
                add(new int[]{746}, "DO");
                add(new int[]{com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameStart}, "MX");
                add(new int[]{754, 755}, "CA");
                add(new int[]{759}, "VE");
                add(new int[]{760, my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_DIFF_USER_ID}, "CH");
                add(new int[]{my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_DIFF_SCRP_ID}, "CO");
                add(new int[]{773}, "UY");
                add(new int[]{775}, "PE");
                add(new int[]{777}, "BO");
                add(new int[]{779}, "AR");
                add(new int[]{780}, "CL");
                add(new int[]{784}, "PY");
                add(new int[]{785}, "PE");
                add(new int[]{786}, "EC");
                add(new int[]{789, 790}, com.paypal.oslo.feature.settings.closeaccount.ui.provider.CloseAccountPersonalUserContentProvider.COUNTRY_BR);
                add(new int[]{com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP, 839}, "IT");
                add(new int[]{androidx.window.core.layout.WindowSizeClass.WIDTH_DP_EXPANDED_LOWER_BOUND, 849}, "ES");
                add(new int[]{850}, "CU");
                add(new int[]{858}, "SK");
                add(new int[]{859}, "CZ");
                add(new int[]{860}, "YU");
                add(new int[]{865}, "MN");
                add(new int[]{867}, "KP");
                add(new int[]{868, 869}, "TR");
                add(new int[]{870, 879}, "NL");
                add(new int[]{880}, "KR");
                add(new int[]{885}, "TH");
                add(new int[]{888}, "SG");
                add(new int[]{890}, "IN");
                add(new int[]{893}, "VN");
                add(new int[]{896}, "PK");
                add(new int[]{899}, "ID");
                add(new int[]{900, 919}, "AT");
                add(new int[]{930, 939}, "AU");
                add(new int[]{940, 949}, "AZ");
                add(new int[]{955}, "MY");
                add(new int[]{958}, "MO");
            }
        }
    }
}
