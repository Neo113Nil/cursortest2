package com.paypal.oslo.feature.p2p.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0000\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00060\u0006j\u0002`\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "html", "Lkotlin/Pair;", "", "parseHtmlLinks", "(Ljava/lang/String;)Lkotlin/Pair;", "Lcom/paypal/pds/core/RichText;", "Lcom/paypal/pds/utils/RichText;", "parseHtmlToRichText", "(Ljava/lang/String;)Lcom/paypal/pds/core/RichText;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HtmlUtilsKt {
    public static final kotlin.Pair<java.lang.String, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>> parseHtmlLinks(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.Regex regex = new kotlin.text.Regex("<a\\s+href=['\"]([^'\"]+)['\"]>([^<]+)</a>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String str2 = str;
        for (kotlin.text.MatchResult matchResult : kotlin.text.Regex.findAll$default(regex, str2, 0, 2, null)) {
            arrayList.add(kotlin.TuplesKt.to(matchResult.getGroupValues().get(2), matchResult.getGroupValues().get(1)));
        }
        return kotlin.TuplesKt.to(regex.replace(str2, "$2"), arrayList);
    }

    public static final com.paypal.pds.core.RichText parseHtmlToRichText(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.Pair<java.lang.String, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>> parseHtmlLinks = parseHtmlLinks(str);
        return com.paypal.pds.utils.BackwardCompatibleRichTextKt.toRichText(parseHtmlLinks.component1(), parseHtmlLinks.component2());
    }
}
