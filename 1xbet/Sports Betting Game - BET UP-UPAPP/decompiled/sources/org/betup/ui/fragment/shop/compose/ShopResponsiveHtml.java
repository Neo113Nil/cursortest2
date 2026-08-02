package org.betup.ui.fragment.shop.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ShopResponsiveHtml.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lorg/betup/ui/fragment/shop/compose/ShopResponsiveHtml;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "MARKER", "", "responsiveHead", "inject", "html", "stripLegacyFitScript", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopResponsiveHtml {
    public static final int $stable = 0;
    public static final String MARKER = "shop-responsive-fit";
    public static final ShopResponsiveHtml INSTANCE = new ShopResponsiveHtml();
    private static final String responsiveHead = "<style id=\"shop-responsive-fit\">\n  html {\n    font-size: clamp(9px, min(3.15vw, 5.35vh), 16px);\n    -webkit-text-size-adjust: 100%;\n  }\n  html.shop-video-reward-card {\n    font-size: clamp(10px, 7.1vh, 28px);\n  }\n  html.shop-first-purchase-card {\n    font-size: clamp(10px, 5.75vh, 26px);\n  }\n  html.shop-daily-deals-card {\n    font-size: clamp(10px, 6.2vh, 27px);\n  }\n  html.shop-section-header-timer {\n    font-size: clamp(10px, 4.8vh, 13px);\n  }\n  html.shop-bundle-card,\n  html.shop-coin-pack-card {\n    font-size: clamp(9px, 4.05vh, 24px);\n  }\n  html, body {\n    width: 100%;\n    height: 100%;\n    overflow: visible;\n  }\n  body {\n    margin: 0;\n  }\n  .shop-root {\n    width: 100%;\n    height: 100%;\n    display: flex;\n    min-height: 0;\n    overflow: visible;\n    padding: 0;\n    box-sizing: border-box;\n  }\n  .card-frame {\n    position: relative;\n    flex: 1 1 auto;\n    width: 100%;\n    height: 100%;\n    min-height: 0;\n    overflow: visible;\n  }\n  .card, .shop-root {\n    min-height: 0 !important;\n    max-height: 100%;\n  }\n  .headline, .title, .eyebrow, .subtitle, .coins, .bullet, .cta, .discount, .old-price {\n    overflow-wrap: anywhere;\n    word-break: break-word;\n  }\n  .coin-icon {\n    display: inline-block;\n    vertical-align: middle;\n    object-fit: contain;\n    flex-shrink: 0;\n    pointer-events: none;\n  }\n  .coin-icon-sm { width: 1.18em; height: 1.18em; }\n  .coin-icon-xs { width: 0.92em; height: 0.92em; }\n  .coin-icon-inline { width: 1.08em; height: 1.08em; margin-left: 0.22em; }\n  .coin-line .coin-icon-inline { vertical-align: -0.12em; }\n</style>";

    private ShopResponsiveHtml() {
    }

    public final String inject(String html) {
        Intrinsics.checkNotNullParameter(html, "html");
        String stripLegacyFitScript = stripLegacyFitScript(html);
        String str = stripLegacyFitScript;
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) MARKER, false, 2, (Object) null)) {
            return stripLegacyFitScript;
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "</head>", false, 2, (Object) null)) {
            return StringsKt.replace$default(stripLegacyFitScript, "</head>", responsiveHead + "\n</head>", false, 4, (Object) null);
        }
        return responsiveHead + stripLegacyFitScript;
    }

    private final String stripLegacyFitScript(String html) {
        return new Regex("<script id=\"shop-responsive-fit-script\">[\\s\\S]*?</script>\\s*").replace(html, "");
    }
}
