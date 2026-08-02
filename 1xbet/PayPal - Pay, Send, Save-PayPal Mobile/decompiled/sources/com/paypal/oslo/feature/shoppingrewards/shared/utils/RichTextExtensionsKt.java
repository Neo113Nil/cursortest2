package com.paypal.oslo.feature.shoppingrewards.shared.utils;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\t\u001a\u00020\u0001*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lcom/paypal/pds/core/RichText;", "parseRichTextWithLinkTags", "(Ljava/lang/String;)Lcom/paypal/pds/core/RichText;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/utils/ExtractedLinks;", "extractLinksFromTags", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shared/utils/ExtractedLinks;", "", "urls", "parseRichTextWithIndexedMultiLinks", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/pds/core/RichText;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RichTextExtensionsKt {
    public static final com.paypal.pds.core.RichText parseRichTextWithLinkTags(final java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shared.utils.RichTextExtensionsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.shoppingrewards.shared.utils.RichTextExtensionsKt.$r8$lambda$XYvUXF6LuOT0cF7fKaHFwqz0X2s(str, (com.paypal.pds.core.Builder) obj);
            }
        });
    }

    public static final com.paypal.oslo.feature.shoppingrewards.shared.utils.ExtractedLinks extractLinksFromTags(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.text.Regex regex = new kotlin.text.Regex("\\{link-(\\w+)\\}(.*?)\\{/link-\\1\\}");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = 0;
        for (kotlin.text.MatchResult matchResult : kotlin.text.Regex.findAll$default(regex, str, 0, 2, null)) {
            if (i < matchResult.getRange().getFirst()) {
                java.lang.String substring = str.substring(i, matchResult.getRange().getFirst());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                sb.append(substring);
            }
            java.lang.String str2 = matchResult.getGroupValues().get(2);
            java.lang.String str3 = matchResult.getGroupValues().get(1);
            sb.append(str2);
            arrayList.add(kotlin.TuplesKt.to(str2, str3));
            i = matchResult.getRange().getLast() + 1;
        }
        if (i < str.length()) {
            java.lang.String substring2 = str.substring(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            sb.append(substring2);
        }
        return new com.paypal.oslo.feature.shoppingrewards.shared.utils.ExtractedLinks(sb.toString(), arrayList);
    }

    public static final com.paypal.pds.core.RichText parseRichTextWithIndexedMultiLinks(final java.lang.String str, final java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shared.utils.RichTextExtensionsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.shoppingrewards.shared.utils.RichTextExtensionsKt.$r8$lambda$NpijhT2F9EP9fUs_PoDzFB1HQss(str, list, (com.paypal.pds.core.Builder) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NpijhT2F9EP9fUs_PoDzFB1HQss(java.lang.String str, java.util.List list, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        int i = 0;
        int i2 = 0;
        for (kotlin.text.MatchResult matchResult : kotlin.text.Regex.findAll$default(new kotlin.text.Regex("__(.+?)__"), str, 0, 2, null)) {
            if (i < matchResult.getRange().getFirst()) {
                java.lang.String substring = str.substring(i, matchResult.getRange().getFirst());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                com.paypal.pds.core.Builder.append$default(builder, substring, null, false, 6, null);
            }
            java.lang.String str2 = matchResult.getGroupValues().get(1);
            if (i2 < list.size()) {
                builder.appendLink(str2, (java.lang.String) list.get(i2));
                i2++;
            } else {
                com.paypal.pds.core.Builder.append$default(builder, str2, null, false, 6, null);
            }
            i = 1 + matchResult.getRange().getLast();
        }
        if (i < str.length()) {
            java.lang.String substring2 = str.substring(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            com.paypal.pds.core.Builder.append$default(builder, substring2, null, false, 6, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XYvUXF6LuOT0cF7fKaHFwqz0X2s(java.lang.String str, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        int i = 0;
        for (kotlin.text.MatchResult matchResult : kotlin.text.Regex.findAll$default(new kotlin.text.Regex("\\{link-(\\w+)\\}(.*?)\\{/link-\\1\\}"), str, 0, 2, null)) {
            if (i < matchResult.getRange().getFirst()) {
                java.lang.String substring = str.substring(i, matchResult.getRange().getFirst());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                com.paypal.pds.core.Builder.append$default(builder, substring, null, false, 6, null);
            }
            builder.appendLink(matchResult.getGroupValues().get(2), matchResult.getGroupValues().get(1));
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
