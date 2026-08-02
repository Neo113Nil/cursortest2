package com.paypal.oslo.feature.moneymovement.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/paypal/pds/core/RichText;", "parseRichTextWithLinkTags", "(Ljava/lang/String;)Lcom/paypal/pds/core/RichText;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StringExtensionsKt {
    public static final com.paypal.pds.core.RichText parseRichTextWithLinkTags(final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.moneymovement.ui.utils.StringExtensionsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.moneymovement.ui.utils.StringExtensionsKt.$r8$lambda$JuID1HgSBGBcBdUPDrlfG7K65Pg(str, (com.paypal.pds.core.Builder) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JuID1HgSBGBcBdUPDrlfG7K65Pg(java.lang.String str, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        int i = 0;
        for (kotlin.text.MatchResult matchResult : kotlin.text.Regex.findAll$default(new kotlin.text.Regex("\\{link-(\\w+)\\}(.*?)\\{/link-\\1\\}"), str, 0, 2, null)) {
            if (i < matchResult.getRange().getFirst()) {
                java.lang.String substring = str.substring(i, matchResult.getRange().getFirst());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                com.paypal.pds.core.Builder.append$default(builder, substring, null, false, 6, null);
            }
            builder.appendLink(matchResult.getGroupValues().get(2), matchResult.getGroupValues().get(1));
            i = 1 + matchResult.getRange().getLast();
        }
        if (i < str.length()) {
            java.lang.String substring2 = str.substring(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            com.paypal.pds.core.Builder.append$default(builder, substring2, null, false, 6, null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
