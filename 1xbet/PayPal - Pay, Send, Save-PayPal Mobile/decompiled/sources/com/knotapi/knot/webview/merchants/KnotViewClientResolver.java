package com.knotapi.knot.webview.merchants;

/* loaded from: classes9.dex */
public class KnotViewClientResolver {
    public static com.knotapi.knot.webview.KnotViewClient getKnotViewClient(com.knotapi.knot.webview.KnotView knotView) {
        int merchantId = knotView.getBot().getMerchantId();
        if (merchantId == 3) {
            return new com.knotapi.knot.webview.merchants.GithubClient(knotView);
        }
        if (merchantId == 4) {
            return new com.knotapi.knot.webview.merchants.MaxClient(knotView);
        }
        if (merchantId == 2261) {
            return new com.knotapi.knot.webview.merchants.EVCSClient(knotView);
        }
        if (merchantId == 2262) {
            return new com.knotapi.knot.webview.merchants.CalmClient(knotView);
        }
        switch (merchantId) {
            case 15:
                return new com.knotapi.knot.webview.merchants.NotionClient(knotView);
            case 17:
                return new com.knotapi.knot.webview.merchants.LinkedInClient(knotView);
            case 35:
                return new com.knotapi.knot.webview.merchants.SiriusXMClient(knotView);
            case 47:
                return new com.knotapi.knot.webview.merchants.LowesClient(knotView);
            case 65:
                return new com.knotapi.knot.webview.merchants.StateFarmClient(knotView);
            case 75:
                return new com.knotapi.knot.webview.merchants.DeltaAirLineClient(knotView);
            case 80:
                return new com.knotapi.knot.webview.merchants.ExpediaClient(knotView);
            case 91:
                return new com.knotapi.knot.webview.merchants.RokuClient(knotView);
            case 102:
                return new com.knotapi.knot.webview.merchants.CashAppClient(knotView);
            case 115:
                return new com.knotapi.knot.webview.merchants.QuickBookClient(knotView);
            case 118:
                return new com.knotapi.knot.webview.merchants.ShopifyClient(knotView);
            case 121:
                return new com.knotapi.knot.webview.merchants.FigmaClient(knotView);
            case 127:
                return new com.knotapi.knot.webview.merchants.SteamClient(knotView);
            case 140:
                return new com.knotapi.knot.webview.merchants.ClassPassClient(knotView);
            case 150:
                return new com.knotapi.knot.webview.merchants.CheggClient(knotView);
            case 153:
                return new com.knotapi.knot.webview.merchants.VisibleClient(knotView);
            case 239:
                return new com.knotapi.knot.webview.merchants.HeadSpaceClient(knotView);
            case com.knotapi.knot.utilities.Constants.ID_KROGER /* 370 */:
                return new com.knotapi.knot.webview.merchants.KrogerClient(knotView);
            case com.knotapi.knot.utilities.Constants.ID_RENT_A_CENTER /* 686 */:
                return new com.knotapi.knot.webview.merchants.RentACenterClient(knotView);
            case com.knotapi.knot.utilities.Constants.ID_SQUARE_SPACE /* 843 */:
                return new com.knotapi.knot.webview.merchants.SquareSpaceClient(knotView);
            case com.knotapi.knot.utilities.Constants.ID_SIMPLE_MOBILE /* 2129 */:
                return new com.knotapi.knot.webview.merchants.SimpleMobileClient(knotView);
            case com.knotapi.knot.utilities.Constants.ID_STARZ /* 2131 */:
                return new com.knotapi.knot.webview.merchants.StarzClient(knotView);
            case com.knotapi.knot.utilities.Constants.ID_GRAMMARLY /* 2136 */:
                return new com.knotapi.knot.webview.merchants.GrammarlyClient(knotView);
            case com.knotapi.knot.utilities.Constants.ID_GOOGLE_MASS_SWITCHER /* 2286 */:
                return new com.knotapi.knot.webview.merchants.GoogleMassSwitcherClient(knotView);
            default:
                return new com.knotapi.knot.webview.KnotViewClient(knotView);
        }
    }
}
