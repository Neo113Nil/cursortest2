package com.knotapi.knot.utilities;

/* loaded from: classes9.dex */
public class SsoLoginHelper {

    /* renamed from: com.knotapi.knot.utilities.SsoLoginHelper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$knotapi$knot$utilities$SsoLoginHelper$SSOProvider;

        static {
            int[] iArr = new int[com.knotapi.knot.utilities.SsoLoginHelper.SSOProvider.values().length];
            $SwitchMap$com$knotapi$knot$utilities$SsoLoginHelper$SSOProvider = iArr;
            try {
                iArr[com.knotapi.knot.utilities.SsoLoginHelper.SSOProvider.GOOGLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$knotapi$knot$utilities$SsoLoginHelper$SSOProvider[com.knotapi.knot.utilities.SsoLoginHelper.SSOProvider.FACEBOOK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$knotapi$knot$utilities$SsoLoginHelper$SSOProvider[com.knotapi.knot.utilities.SsoLoginHelper.SSOProvider.AMAZON.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$knotapi$knot$utilities$SsoLoginHelper$SSOProvider[com.knotapi.knot.utilities.SsoLoginHelper.SSOProvider.X.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$knotapi$knot$utilities$SsoLoginHelper$SSOProvider[com.knotapi.knot.utilities.SsoLoginHelper.SSOProvider.APPLE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$knotapi$knot$utilities$SsoLoginHelper$SSOProvider[com.knotapi.knot.utilities.SsoLoginHelper.SSOProvider.SPOTIFY.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$knotapi$knot$utilities$SsoLoginHelper$SSOProvider[com.knotapi.knot.utilities.SsoLoginHelper.SSOProvider.NORMAL.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    public enum SSOProvider {
        GOOGLE,
        FACEBOOK,
        AMAZON,
        X,
        APPLE,
        SPOTIFY,
        NORMAL
    }

    private static com.knotapi.knot.utilities.SsoLoginHelper.SSOProvider determineSSOProvider(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return com.knotapi.knot.utilities.SsoLoginHelper.SSOProvider.NORMAL;
        }
        java.lang.String lowerCase = str.toLowerCase();
        return (lowerCase.equals("google.com") || lowerCase.endsWith(".google.com")) ? com.knotapi.knot.utilities.SsoLoginHelper.SSOProvider.GOOGLE : (lowerCase.equals("facebook.com") || lowerCase.endsWith(".facebook.com")) ? com.knotapi.knot.utilities.SsoLoginHelper.SSOProvider.FACEBOOK : (lowerCase.equals("amazon.com") || lowerCase.endsWith(".amazon.com")) ? com.knotapi.knot.utilities.SsoLoginHelper.SSOProvider.AMAZON : (lowerCase.equals("x.com") || lowerCase.endsWith(".x.com")) ? com.knotapi.knot.utilities.SsoLoginHelper.SSOProvider.X : (lowerCase.equals("apple.com") || lowerCase.endsWith(".apple.com")) ? com.knotapi.knot.utilities.SsoLoginHelper.SSOProvider.APPLE : (lowerCase.equals("spotify.com") || lowerCase.endsWith(".spotify.com")) ? com.knotapi.knot.utilities.SsoLoginHelper.SSOProvider.SPOTIFY : com.knotapi.knot.utilities.SsoLoginHelper.SSOProvider.NORMAL;
    }

    public static void processSSO(java.lang.String str, com.knotapi.knot.models.Bot bot, com.knotapi.knot.webview.KnotView knotView, com.knotapi.knot.utilities.SsoCookieHelper ssoCookieHelper, com.knotapi.knot.webview.PopupChromeClient popupChromeClient, boolean z) {
        java.lang.String host;
        if (str != null) {
            try {
                if (str.isEmpty() || (host = android.net.Uri.parse(str).getHost()) == null || host.isEmpty()) {
                    return;
                }
                com.knotapi.knot.utilities.SsoLoginHelper.SSOProvider determineSSOProvider = determineSSOProvider(host);
                java.lang.String userAgent = com.knotapi.knot.utilities.PreferenceManager.getUserAgent(knotView.getContext(), "google_opera_linux", java.lang.Boolean.FALSE);
                int i = com.knotapi.knot.utilities.SsoLoginHelper.AnonymousClass1.$SwitchMap$com$knotapi$knot$utilities$SsoLoginHelper$SSOProvider[determineSSOProvider.ordinal()];
                java.lang.String str2 = com.knotapi.knot.utilities.Constants.operaUserAgent;
                switch (i) {
                    case 1:
                        if (!z) {
                            com.knotapi.knot.webview.KnotViewClient knotViewClient = knotView.viewClient;
                            if (bot.hasGoogleUserAgent()) {
                                userAgent = bot.getGoogleUserAgent();
                            }
                            knotViewClient.configureLogin(com.knotapi.knot.utilities.Constants.GOOGLE_LOGIN, userAgent);
                        }
                        if (z) {
                            if (bot.hasGooglePopUpUserAgent()) {
                                str2 = bot.getGooglePopUpUserAgent();
                            }
                            popupChromeClient.setUserAgentAndVisibility(str2, com.adjust.sdk.Constants.REFERRER_API_GOOGLE);
                            break;
                        }
                        break;
                    case 2:
                        if (!z) {
                            knotView.viewClient.configureLogin(com.knotapi.knot.utilities.Constants.FACEBOOK_LOGIN, bot.getAndroidFbSSO().isEmpty() ? bot.getAndroidSSOGlobal() : bot.getAndroidFbSSO());
                            knotView.removeFBWarning();
                        }
                        if (z) {
                            popupChromeClient.setUserAgentAndVisibility(bot.getAndroidFbSSO().isEmpty() ? bot.getAndroidSSOGlobal() : bot.getAndroidFbSSO(), "facebook");
                            break;
                        }
                        break;
                    case 3:
                        if (!z) {
                            com.knotapi.knot.webview.KnotViewClient knotViewClient2 = knotView.viewClient;
                            if (bot.hasAmazonUserAgent()) {
                                userAgent = bot.getAmazonUserAgent();
                            }
                            knotViewClient2.configureLogin(com.knotapi.knot.utilities.Constants.AMAZON_LOGIN, userAgent);
                        }
                        if (z) {
                            if (bot.hasAmazonPopUpUserAgent()) {
                                str2 = bot.getAmazonPopUpUserAgent();
                            }
                            popupChromeClient.setUserAgentAndVisibility(str2, "");
                            break;
                        }
                        break;
                    case 4:
                        if (!z) {
                            com.knotapi.knot.webview.KnotViewClient knotViewClient3 = knotView.viewClient;
                            if (bot.hasXUserAgent()) {
                                userAgent = bot.getXUserAgent();
                            }
                            knotViewClient3.configureLogin(com.knotapi.knot.utilities.Constants.X_LOGIN, userAgent);
                        }
                        if (z) {
                            if (bot.hasXPopUpUserAgent()) {
                                str2 = bot.getXPopUpUserAgent();
                            }
                            popupChromeClient.setUserAgentAndVisibility(str2, "");
                            break;
                        }
                        break;
                    case 5:
                        if (!z) {
                            knotView.loginType = com.knotapi.knot.utilities.Constants.APPLE_LOGIN;
                            knotView.adjustAppleHeight();
                        }
                        if (z) {
                            popupChromeClient.updateWebViewPopUpVisibility("apple");
                            break;
                        }
                        break;
                    case 6:
                        if (z) {
                            popupChromeClient.setUserAgentAndVisibility(com.knotapi.knot.utilities.Constants.operaUserAgent, "spotify");
                            break;
                        }
                        break;
                    default:
                        if (!z) {
                            knotView.viewClient.configureLogin(com.knotapi.knot.utilities.Constants.NORMAL_LOGIN, bot.getUserAgent(knotView));
                        }
                        if (z && bot != null && bot.getAllowChromeClientWindow()) {
                            popupChromeClient.setUserAgentAndVisibility(bot.getUserAgent(knotView), "");
                            break;
                        }
                        break;
                }
                if (z && bot != null && bot.getMerchantId() == 239 && host.contains("www.headspace.com")) {
                    popupChromeClient.setLoaderVisibility(0);
                    popupChromeClient.webViewPopUp.setVisibility(8);
                }
                if (host.contains(com.adjust.sdk.Constants.REFERRER_API_GOOGLE) || host.contains("facebook")) {
                    ssoCookieHelper.ssoSessionActive = true;
                } else {
                    ssoCookieHelper.ssoSessionInActive(str, knotView);
                }
            } catch (java.lang.Exception e) {
                com.knotapi.knot.services.ErrorReporter.report(e, "SsoLoginHelper.processSSO");
            }
        }
    }
}
