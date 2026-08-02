package org.betup.ui.dialogs.offer;

import android.net.Uri;
import com.ironsource.X3;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.model.remote.entity.analytics.OfferHtmlTemplateData;
import org.betup.model.remote.entity.analytics.OfferModel;
import org.betup.ui.dialogs.offer.content.DefaultOfferSubtitleAnalyzer;
import org.betup.ui.dialogs.offer.content.OfferSubtitleAnalyzer;
import org.betup.ui.dialogs.offer.content.OfferSubtitleContentType;
import org.betup.ui.dialogs.offer.webview.OfferWebLoadSpec;
import org.betup.ui.dialogs.offer.webview.OfferWebPriceInjection;
import org.betup.utils.FormatHelper;

/* compiled from: OfferWebPresentation.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a4\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u001a*\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"QUERY_PARAM_OLD_PRICE", "", "QUERY_PARAM_NEW_PRICE", "QUERY_PARAM_BETCOINS", "resolveOfferWebPresentationMode", "Lorg/betup/ui/dialogs/offer/OfferWebPresentationMode;", "offer", "Lorg/betup/model/remote/entity/analytics/OfferModel;", "analyzer", "Lorg/betup/ui/dialogs/offer/content/OfferSubtitleAnalyzer;", "buildOfferWebLoadSpec", "Lorg/betup/ui/dialogs/offer/webview/OfferWebLoadSpec;", X3.a.t, "formattedOldPrice", "formattedNewPrice", "prefetchedDocumentHtml", "buildOfferRemoteUrlWithQueryParams", "baseUrl", "formattedBetcoins", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OfferWebPresentationKt {
    private static final String QUERY_PARAM_BETCOINS = "betcoins";
    private static final String QUERY_PARAM_NEW_PRICE = "newPrice";
    private static final String QUERY_PARAM_OLD_PRICE = "oldPrice";

    /* compiled from: OfferWebPresentation.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OfferWebPresentationMode.values().length];
            try {
                iArr[OfferWebPresentationMode.RemoteUrl.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfferWebPresentationMode.InlineHtml.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OfferWebPresentationMode.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ OfferWebPresentationMode resolveOfferWebPresentationMode$default(OfferModel offerModel, OfferSubtitleAnalyzer offerSubtitleAnalyzer, int i, Object obj) {
        if ((i & 2) != 0) {
            offerSubtitleAnalyzer = new DefaultOfferSubtitleAnalyzer();
        }
        return resolveOfferWebPresentationMode(offerModel, offerSubtitleAnalyzer);
    }

    public static final OfferWebPresentationMode resolveOfferWebPresentationMode(OfferModel offer, OfferSubtitleAnalyzer analyzer) {
        String url;
        Intrinsics.checkNotNullParameter(offer, "offer");
        Intrinsics.checkNotNullParameter(analyzer, "analyzer");
        OfferHtmlTemplateData htmlTemplateData = offer.getHtmlTemplateData();
        String obj = (htmlTemplateData == null || (url = htmlTemplateData.getUrl()) == null) ? null : StringsKt.trim((CharSequence) url).toString();
        if (obj == null) {
            obj = "";
        }
        if (obj.length() > 0) {
            return OfferWebPresentationMode.RemoteUrl;
        }
        if (analyzer.analyze(offer.getSubtitle()) == OfferSubtitleContentType.HTML) {
            return OfferWebPresentationMode.InlineHtml;
        }
        return OfferWebPresentationMode.None;
    }

    public static /* synthetic */ OfferWebLoadSpec buildOfferWebLoadSpec$default(OfferModel offerModel, OfferWebPresentationMode offerWebPresentationMode, String str, String str2, String str3, int i, Object obj) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        return buildOfferWebLoadSpec(offerModel, offerWebPresentationMode, str, str2, str3);
    }

    public static final OfferWebLoadSpec buildOfferWebLoadSpec(OfferModel offer, OfferWebPresentationMode mode, String str, String formattedNewPrice, String str2) {
        Intrinsics.checkNotNullParameter(offer, "offer");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(formattedNewPrice, "formattedNewPrice");
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("buildOfferWebLoadSpec called with None");
            }
            OfferHtmlInjector offerHtmlInjector = OfferHtmlInjector.INSTANCE;
            String subtitle = offer.getSubtitle();
            String iconUrl = offer.getIconUrl();
            String shopBetcoinsFormated = FormatHelper.getShopBetcoinsFormated(offer.getBetcoins());
            Intrinsics.checkNotNullExpressionValue(shopBetcoinsFormated, "getShopBetcoinsFormated(...)");
            return new OfferWebLoadSpec.InlineHtml(OfferHtmlInjector.inject$default(offerHtmlInjector, subtitle, iconUrl, str, formattedNewPrice, shopBetcoinsFormated, false, 32, null));
        }
        OfferHtmlTemplateData htmlTemplateData = offer.getHtmlTemplateData();
        if (htmlTemplateData == null) {
            throw new IllegalArgumentException("RemoteUrl mode requires htmlTemplateData".toString());
        }
        String obj = StringsKt.trim((CharSequence) htmlTemplateData.getUrl()).toString();
        String shopBetcoinsFormated2 = FormatHelper.getShopBetcoinsFormated(offer.getBetcoins());
        Intrinsics.checkNotNullExpressionValue(shopBetcoinsFormated2, "getShopBetcoinsFormated(...)");
        String buildOfferRemoteUrlWithQueryParams = buildOfferRemoteUrlWithQueryParams(obj, str, formattedNewPrice, shopBetcoinsFormated2);
        OfferWebPriceInjection offerWebPriceInjection = (StringsKt.isBlank(formattedNewPrice) || (htmlTemplateData.getOldPriceKeys().isEmpty() && htmlTemplateData.getNewPriceKeys().isEmpty())) ? null : new OfferWebPriceInjection(htmlTemplateData.getOldPriceKeys(), htmlTemplateData.getNewPriceKeys(), str, formattedNewPrice);
        if (str2 == null || StringsKt.isBlank(str2)) {
            str2 = null;
        }
        return new OfferWebLoadSpec.RemoteUrl(buildOfferRemoteUrlWithQueryParams, offerWebPriceInjection, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final String buildOfferRemoteUrlWithQueryParams(String str, String str2, String str3, String str4) {
        String str5;
        if (StringsKt.isBlank(str)) {
            return str;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Uri parse = Uri.parse(str);
            Set of = SetsKt.setOf((Object[]) new String[]{QUERY_PARAM_OLD_PRICE, QUERY_PARAM_NEW_PRICE, QUERY_PARAM_BETCOINS});
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            for (String str6 : parse.getQueryParameterNames()) {
                if (!of.contains(str6)) {
                    Iterator<String> it = parse.getQueryParameters(str6).iterator();
                    while (it.hasNext()) {
                        clearQuery.appendQueryParameter(str6, it.next());
                    }
                }
            }
            String str7 = str2;
            if (str7 != null && !StringsKt.isBlank(str7)) {
                clearQuery.appendQueryParameter(QUERY_PARAM_OLD_PRICE, str2);
            }
            if (!StringsKt.isBlank(str3)) {
                clearQuery.appendQueryParameter(QUERY_PARAM_NEW_PRICE, str3);
            }
            if (!StringsKt.isBlank(str4)) {
                clearQuery.appendQueryParameter(QUERY_PARAM_BETCOINS, str4);
            }
            str5 = Result.m10853constructorimpl(clearQuery.build().toString());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            str5 = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m10856exceptionOrNullimpl(str5) == null) {
            str = str5;
        }
        return str;
    }
}
