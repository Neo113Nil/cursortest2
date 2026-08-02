package org.betup.ui.dialogs.offer;

import io.bidmachine.unified.UnifiedMediationParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferHtmlInjector.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lorg/betup/ui/dialogs/offer/OfferHtmlInjector;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "FALLBACK_IMAGE_URL", "", "PLACEHOLDER_ICON_URL", "PLACEHOLDER_OLD_PRICE", "PLACEHOLDER_NEW_PRICE", "PLACEHOLDER_BETCOINS", "inject", "html", UnifiedMediationParams.KEY_ICON_URL, "formattedOldPrice", "formattedNewPrice", "formattedBetcoins", "stableImageUrl", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OfferHtmlInjector {
    public static final int $stable = 0;
    private static final String FALLBACK_IMAGE_URL = "https://qbetapp.info/uploads_api/ads-generated/52342010-45fe-41b3-8edf-5f7a823118fc.png";
    public static final OfferHtmlInjector INSTANCE = new OfferHtmlInjector();
    private static final String PLACEHOLDER_BETCOINS = "{{betcoins}}";
    private static final String PLACEHOLDER_ICON_URL = "{{iconUrl}}";
    private static final String PLACEHOLDER_NEW_PRICE = "{{newPrice}}";
    private static final String PLACEHOLDER_OLD_PRICE = "{{oldPrice}}";

    private OfferHtmlInjector() {
    }

    public static /* synthetic */ String inject$default(OfferHtmlInjector offerHtmlInjector, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            z = false;
        }
        return offerHtmlInjector.inject(str, str2, str3, str4, str5, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String inject(String html, String iconUrl, String formattedOldPrice, String formattedNewPrice, String formattedBetcoins, boolean stableImageUrl) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(formattedNewPrice, "formattedNewPrice");
        Intrinsics.checkNotNullParameter(formattedBetcoins, "formattedBetcoins");
        String str3 = iconUrl;
        if (str3 == null || StringsKt.isBlank(str3)) {
            str = FALLBACK_IMAGE_URL;
        } else if (!stableImageUrl) {
            str = OfferImageUrlKt.buildOfferImageDisplayUrl(iconUrl);
        } else {
            str2 = iconUrl;
            return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(html, PLACEHOLDER_ICON_URL, str2, false, 4, (Object) null), PLACEHOLDER_OLD_PRICE, formattedOldPrice != null ? "" : formattedOldPrice, false, 4, (Object) null), PLACEHOLDER_NEW_PRICE, formattedNewPrice, false, 4, (Object) null), PLACEHOLDER_BETCOINS, formattedBetcoins, false, 4, (Object) null);
        }
        str2 = str;
        return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(html, PLACEHOLDER_ICON_URL, str2, false, 4, (Object) null), PLACEHOLDER_OLD_PRICE, formattedOldPrice != null ? "" : formattedOldPrice, false, 4, (Object) null), PLACEHOLDER_NEW_PRICE, formattedNewPrice, false, 4, (Object) null), PLACEHOLDER_BETCOINS, formattedBetcoins, false, 4, (Object) null);
    }
}
