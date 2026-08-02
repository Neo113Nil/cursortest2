package com.paypal.oslo.feature.subscriptions.shared.ui;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"", "text", "Lcom/paypal/pds/core/RichText;", "htmlToRichText", "(Ljava/lang/String;)Lcom/paypal/pds/core/RichText;", "Lkotlin/text/Regex;", "getHighSpeedVideoFpsRanges", "Lkotlin/text/Regex;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class HtmlRichTextParserKt {
    private static final kotlin.text.Regex getHighSpeedVideoFpsRanges = new kotlin.text.Regex("<a href=\"([^\"]*)\"?>(.+?)</a>");

    public static final com.paypal.pds.core.RichText htmlToRichText(final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.shared.ui.HtmlRichTextParserKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.subscriptions.shared.ui.HtmlRichTextParserKt.$r8$lambda$jld3QWzkBr9VcxYLiXI86pjGqHs(str, (com.paypal.pds.core.Builder) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jld3QWzkBr9VcxYLiXI86pjGqHs(java.lang.String str, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        int i = 0;
        for (kotlin.text.MatchResult matchResult : kotlin.text.Regex.findAll$default(getHighSpeedVideoFpsRanges, str, 0, 2, null)) {
            if (i < matchResult.getRange().getFirst()) {
                java.lang.String substring = str.substring(i, matchResult.getRange().getFirst());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                com.paypal.pds.core.Builder.append$default(builder, substring, null, false, 6, null);
            }
            kotlin.text.MatchResult.Destructured destructured = matchResult.getDestructured();
            builder.appendLink(destructured.getMatch().getGroupValues().get(2), destructured.getMatch().getGroupValues().get(1));
            i = matchResult.getRange().getLast() + 1;
        }
        if (i < str.length()) {
            java.lang.String substring2 = str.substring(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            com.paypal.pds.core.Builder.append$default(builder, substring2, null, false, 6, null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
