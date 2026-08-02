package org.betup.ui.fragment.shop.compose;

import android.content.Context;
import android.util.Log;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nl.dionsegijn.konfetti.core.Spread;
import org.betup.model.remote.entity.shop.ShopDisplaySection;
import org.betup.model.remote.entity.shop.ShopPresentationMode;
import org.betup.ui.dialogs.offer.webview.OfferWebLoadSpec;

/* compiled from: ShopHtmlLoadSpec.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a*\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n\u001a*\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n\u001a\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u000e\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"TAG", "", "buildShopHtmlLoadSpec", "Lorg/betup/ui/dialogs/offer/webview/OfferWebLoadSpec;", "context", "Landroid/content/Context;", "item", "Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "buyLabel", "labels", "Lorg/betup/ui/fragment/shop/compose/ShopHtmlLabels;", "resolveShopInlineHtml", "shopHtmlAspectRatio", "", "shopHtmlAspectRatioLabel", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopHtmlLoadSpecKt {
    private static final String TAG = "ShopHtmlLoadSpec";

    /* compiled from: ShopHtmlLoadSpec.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShopPresentationMode.values().length];
            try {
                iArr[ShopPresentationMode.HTML_REMOTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShopPresentationMode.HTML_INLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShopPresentationMode.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ OfferWebLoadSpec buildShopHtmlLoadSpec$default(Context context, ShopItemDataModel shopItemDataModel, String str, ShopHtmlLabels shopHtmlLabels, int i, Object obj) {
        if ((i & 8) != 0) {
            shopHtmlLabels = new ShopHtmlLabels(null, null, null, false, 15, null);
        }
        return buildShopHtmlLoadSpec(context, shopItemDataModel, str, shopHtmlLabels);
    }

    public static final OfferWebLoadSpec buildShopHtmlLoadSpec(Context context, ShopItemDataModel item, String buyLabel, ShopHtmlLabels labels) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(buyLabel, "buyLabel");
        Intrinsics.checkNotNullParameter(labels, "labels");
        int i = WhenMappings.$EnumSwitchMapping$0[item.getPresentationMode().ordinal()];
        OfferWebLoadSpec offerWebLoadSpec = null;
        if (i == 1) {
            String htmlTemplateUrl = item.getHtmlTemplateUrl();
            String obj = htmlTemplateUrl != null ? StringsKt.trim((CharSequence) htmlTemplateUrl).toString() : null;
            if (obj == null) {
                obj = "";
            }
            String str = obj;
            if (str.length() == 0) {
                Log.w(TAG, "HTML_REMOTE item " + item.getId() + " missing html_template_url");
            } else {
                offerWebLoadSpec = new OfferWebLoadSpec.RemoteUrl(str, null, null, 6, null);
            }
            return offerWebLoadSpec;
        }
        if (i != 2) {
            if (i == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        String resolveShopInlineHtml = resolveShopInlineHtml(context, item, buyLabel, labels);
        String str2 = resolveShopInlineHtml;
        if (str2 == null || StringsKt.isBlank(str2)) {
            Log.w(TAG, "HTML_INLINE item " + item.getId() + " missing html_content");
        } else {
            offerWebLoadSpec = new OfferWebLoadSpec.InlineHtml(resolveShopInlineHtml);
        }
        return offerWebLoadSpec;
    }

    public static /* synthetic */ String resolveShopInlineHtml$default(Context context, ShopItemDataModel shopItemDataModel, String str, ShopHtmlLabels shopHtmlLabels, int i, Object obj) {
        if ((i & 8) != 0) {
            shopHtmlLabels = new ShopHtmlLabels(null, null, null, false, 15, null);
        }
        return resolveShopInlineHtml(context, shopItemDataModel, str, shopHtmlLabels);
    }

    public static final String resolveShopInlineHtml(Context context, ShopItemDataModel item, String buyLabel, ShopHtmlLabels labels) {
        String htmlContent;
        String obj;
        Object m10853constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(buyLabel, "buyLabel");
        Intrinsics.checkNotNullParameter(labels, "labels");
        if (item.getPresentationMode() != ShopPresentationMode.HTML_INLINE || (htmlContent = item.getHtmlContent()) == null || (obj = StringsKt.trim((CharSequence) htmlContent).toString()) == null) {
            return null;
        }
        String str = obj.length() > 0 ? obj : null;
        if (str == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ShopHtmlInjector.INSTANCE.inject(context, str, item, buyLabel, labels));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m10856exceptionOrNullimpl = Result.m10856exceptionOrNullimpl(m10853constructorimpl);
        if (m10856exceptionOrNullimpl != null) {
            Log.e(TAG, "Failed to resolve HTML for item " + item.getId(), m10856exceptionOrNullimpl);
        }
        if (Result.m10859isFailureimpl(m10853constructorimpl)) {
            m10853constructorimpl = null;
        }
        String str2 = (String) m10853constructorimpl;
        if (str2 == null || StringsKt.isBlank(str2)) {
            return null;
        }
        return str2;
    }

    public static final float shopHtmlAspectRatio(ShopItemDataModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getId() == -1 || item.getDisplaySection() == ShopDisplaySection.FREE_REWARDS) {
            return 2.4324324f;
        }
        if (item.getDisplaySection() == ShopDisplaySection.FIRST_PURCHASE) {
            return 2.034091f;
        }
        if (item.getDisplaySection() == ShopDisplaySection.DAILY_DEALS) {
            return 1.8367347f;
        }
        return (item.getDisplaySection() == ShopDisplaySection.COIN_PACKS || item.getDisplaySection() == ShopDisplaySection.BUNDLES) ? 0.6923077f : 1.9148936f;
    }

    public static final String shopHtmlAspectRatioLabel(ShopItemDataModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return "360 / " + ((int) (Spread.ROUND / shopHtmlAspectRatio(item)));
    }
}
