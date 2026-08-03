package com.google.ads.mediation.inmobi;

/* loaded from: classes3.dex */
public class InMobiAdapterUtils {
    public static final java.lang.String COPPA = "coppa";
    public static final java.lang.String KEY_ACCOUNT_ID = "accountid";
    public static final java.lang.String KEY_PLACEMENT_ID = "placementid";
    public static final java.lang.String PROTOCOL_RTB = "c_google";
    public static final java.lang.String PROTOCOL_WATERFALL = "c_admob";
    public static final java.lang.String THIRD_PARTY_KEY = "tp";
    public static final java.lang.String THIRD_PARTY_VERSION = "tp-ver";

    public static long getPlacementId(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString(KEY_PLACEMENT_ID);
        if (android.text.TextUtils.isEmpty(string)) {
            android.util.Log.e(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "Missing or invalid Placement ID.");
            return 0L;
        }
        try {
            return java.lang.Long.parseLong(string);
        } catch (java.lang.NumberFormatException e) {
            android.util.Log.e(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "Invalid Placement ID.", e);
            return 0L;
        }
    }

    public static void configureGlobalTargeting(android.os.Bundle bundle) {
        com.inmobi.sdk.InMobiSdk.AgeGroup ageGroup;
        com.inmobi.sdk.InMobiSdk.Education education;
        if (bundle == null) {
            android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "Bundle extras are null");
            bundle = new android.os.Bundle();
        }
        java.lang.String str = "";
        java.lang.String str2 = str;
        java.lang.String str3 = str2;
        for (java.lang.String str4 : bundle.keySet()) {
            java.lang.String string = bundle.getString(str4);
            if (str4.equals(com.google.ads.mediation.inmobi.InMobiNetworkKeys.AREA_CODE)) {
                if (!"".equals(string)) {
                    com.inmobi.sdk.InMobiSdk.setAreaCode(string);
                }
            } else if (str4.equals(com.google.ads.mediation.inmobi.InMobiNetworkKeys.AGE)) {
                try {
                    if (!"".equals(string)) {
                        com.inmobi.sdk.InMobiSdk.setAge(java.lang.Integer.parseInt(string));
                    }
                } catch (java.lang.NumberFormatException e) {
                    android.util.Log.d(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, "Please Set age properly", e);
                }
            } else if (str4.equals(com.google.ads.mediation.inmobi.InMobiNetworkKeys.POSTAL_CODE)) {
                if (!"".equals(string)) {
                    com.inmobi.sdk.InMobiSdk.setPostalCode(string);
                }
            } else if (str4.equals(com.google.ads.mediation.inmobi.InMobiNetworkKeys.LANGUAGE)) {
                if (!"".equals(string)) {
                    com.inmobi.sdk.InMobiSdk.setLanguage(string);
                }
            } else if (str4.equals(com.google.ads.mediation.inmobi.InMobiNetworkKeys.CITY)) {
                str = string;
            } else if (str4.equals(com.google.ads.mediation.inmobi.InMobiNetworkKeys.STATE)) {
                str2 = string;
            } else if (str4.equals(com.google.ads.mediation.inmobi.InMobiNetworkKeys.COUNTRY)) {
                str3 = string;
            } else if (str4.equals(com.google.ads.mediation.inmobi.InMobiNetworkKeys.AGE_GROUP)) {
                if (string != null && (ageGroup = getAgeGroup(string)) != null) {
                    com.inmobi.sdk.InMobiSdk.setAgeGroup(ageGroup);
                }
            } else if (str4.equals(com.google.ads.mediation.inmobi.InMobiNetworkKeys.EDUCATION)) {
                if (string != null && (education = getEducation(string)) != null) {
                    com.inmobi.sdk.InMobiSdk.setEducation(education);
                }
            } else if (str4.equals(com.google.ads.mediation.inmobi.InMobiNetworkKeys.LOGLEVEL)) {
                if (string != null) {
                    com.inmobi.sdk.InMobiSdk.setLogLevel(getLogLevel(string));
                } else {
                    com.inmobi.sdk.InMobiSdk.setLogLevel(com.inmobi.sdk.InMobiSdk.LogLevel.NONE);
                }
            } else if (str4.equals(com.google.ads.mediation.inmobi.InMobiNetworkKeys.INTERESTS)) {
                com.inmobi.sdk.InMobiSdk.setInterests(string);
            }
        }
        if (java.util.Objects.equals(str, "") || java.util.Objects.equals(str2, "") || java.util.Objects.equals(str3, "")) {
            return;
        }
        com.inmobi.sdk.InMobiSdk.setLocationWithCityStateCountry(str, str2, str3);
    }

    static void setIsAgeRestricted(com.google.ads.mediation.inmobi.InMobiSdkWrapper inMobiSdkWrapper) {
        com.google.android.gms.ads.RequestConfiguration requestConfiguration = com.google.android.gms.ads.MobileAds.getRequestConfiguration();
        if (requestConfiguration.getTagForChildDirectedTreatment() == 1 || requestConfiguration.getTagForUnderAgeOfConsent() == 1) {
            inMobiSdkWrapper.setIsAgeRestricted(true);
        } else if (requestConfiguration.getTagForChildDirectedTreatment() == 0 || requestConfiguration.getTagForUnderAgeOfConsent() == 0) {
            inMobiSdkWrapper.setIsAgeRestricted(false);
        }
    }

    public static void setIsAgeRestricted() {
        setIsAgeRestricted(new com.google.ads.mediation.inmobi.InMobiSdkWrapper());
    }

    static com.inmobi.sdk.InMobiSdk.AgeGroup getAgeGroup(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "BETWEEN_55_AND_65":
                return com.inmobi.sdk.InMobiSdk.AgeGroup.BETWEEN_55_AND_65;
            case "ABOVE_65":
                return com.inmobi.sdk.InMobiSdk.AgeGroup.ABOVE_65;
            case "BELOW_18":
                return com.inmobi.sdk.InMobiSdk.AgeGroup.BELOW_18;
            case "BETWEEN_25_AND_29":
                return com.inmobi.sdk.InMobiSdk.AgeGroup.BETWEEN_25_AND_29;
            case "BETWEEN_45_AND_54":
                return com.inmobi.sdk.InMobiSdk.AgeGroup.BETWEEN_45_AND_54;
            case "BETWEEN_30_AND_34":
                return com.inmobi.sdk.InMobiSdk.AgeGroup.BETWEEN_30_AND_34;
            case "BETWEEN_35_AND_44":
                return com.inmobi.sdk.InMobiSdk.AgeGroup.BETWEEN_35_AND_44;
            case "BETWEEN_18_AND_24":
                return com.inmobi.sdk.InMobiSdk.AgeGroup.BETWEEN_18_AND_24;
            default:
                return null;
        }
    }

    static com.inmobi.sdk.InMobiSdk.Education getEducation(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "EDUCATION_COLLEGEORGRADUATE":
                return com.inmobi.sdk.InMobiSdk.Education.COLLEGE_OR_GRADUATE;
            case "EDUCATION_POSTGRADUATEORABOVE":
                return com.inmobi.sdk.InMobiSdk.Education.POST_GRADUATE_OR_ABOVE;
            case "EDUCATION_HIGHSCHOOLORLESS":
                return com.inmobi.sdk.InMobiSdk.Education.HIGH_SCHOOL_OR_LESS;
            default:
                return null;
        }
    }

    static com.inmobi.sdk.InMobiSdk.LogLevel getLogLevel(java.lang.String str) {
        if (str.equals(com.google.ads.mediation.inmobi.InMobiNetworkValues.LOGLEVEL_DEBUG)) {
            return com.inmobi.sdk.InMobiSdk.LogLevel.DEBUG;
        }
        if (str.equals(com.google.ads.mediation.inmobi.InMobiNetworkValues.LOGLEVEL_ERROR)) {
            return com.inmobi.sdk.InMobiSdk.LogLevel.ERROR;
        }
        return com.inmobi.sdk.InMobiSdk.LogLevel.NONE;
    }

    /* renamed from: com.google.ads.mediation.inmobi.InMobiAdapterUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode;

        static {
            int[] iArr = new int[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.values().length];
            $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode = iArr;
            try {
                iArr[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NO_ERROR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NO_FILL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REQUEST_INVALID.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REQUEST_PENDING.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.SERVER_ERROR.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.AD_ACTIVE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.GET_SIGNALS_CALLED_WHILE_LOADING.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[com.inmobi.ads.InMobiAdRequestStatus.StatusCode.LOW_MEMORY.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
        }
    }

    public static int getMediationErrorCode(com.inmobi.ads.InMobiAdRequestStatus inMobiAdRequestStatus) {
        switch (com.google.ads.mediation.inmobi.InMobiAdapterUtils.AnonymousClass1.$SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[inMobiAdRequestStatus.getStatusCode().ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            default:
                return 99;
        }
    }

    public static com.google.android.gms.ads.AdSize findClosestBannerSize(android.content.Context context, com.google.android.gms.ads.AdSize adSize, com.google.ads.mediation.inmobi.MediationUtilsWrapper mediationUtilsWrapper) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new com.google.android.gms.ads.AdSize(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50));
        arrayList.add(new com.google.android.gms.ads.AdSize(androidx.compose.animation.core.AnimationConstants.DefaultDurationMillis, androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION));
        arrayList.add(new com.google.android.gms.ads.AdSize(728, 90));
        return mediationUtilsWrapper.findClosestSize(context, adSize, arrayList);
    }

    public static com.google.android.gms.ads.AdError validateInMobiAdLoadParams(java.lang.String str, long j) {
        if (!android.text.TextUtils.isEmpty(str) && j > 0) {
            return null;
        }
        com.google.android.gms.ads.AdError createAdapterError = com.google.ads.mediation.inmobi.InMobiConstants.createAdapterError(100, "Missing or invalid Account ID or Placement ID for this ad source instance in the AdMob or Ad Manager UI.");
        android.util.Log.e(com.google.ads.mediation.inmobi.InMobiMediationAdapter.TAG, createAdapterError.toString());
        return createAdapterError;
    }

    private InMobiAdapterUtils() {
    }
}
