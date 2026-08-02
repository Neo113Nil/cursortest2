package com.paypal.oslo.feature.cryptocurrency.ui.common.util;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/util/TagStyle;", "tagStyles", "Lcom/paypal/pds/core/RichText;", "toCryptoRichText", "(Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/pds/core/RichText;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoRichTextUtilsKt {
    public static /* synthetic */ com.paypal.pds.core.RichText toCryptoRichText$default(java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoTagStyles.INSTANCE.getDEFAULT();
        }
        return toCryptoRichText(str, map);
    }

    public static final com.paypal.pds.core.RichText toCryptoRichText(final java.lang.String str, final java.util.Map<java.lang.String, com.paypal.oslo.feature.cryptocurrency.ui.common.util.TagStyle> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.text.Regex regex = new kotlin.text.Regex("<a\\s+href=['\"]([^'\"]+)['\"]>([^<]+)</a>");
        kotlin.text.Regex regex2 = new kotlin.text.Regex("\\{(\\w+)\\}(.*?)\\{/\\1\\}");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        java.lang.String str2 = str;
        for (kotlin.text.MatchResult matchResult : kotlin.text.Regex.findAll$default(regex, str2, 0, 2, null)) {
            createListBuilder.add(new com.paypal.oslo.feature.cryptocurrency.ui.common.util.RichTextElement(matchResult.getRange(), com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType.getHighResolutionOutputSizeshNQ4ISI, matchResult.getGroupValues().get(2), matchResult.getGroupValues().get(1), null, 16, null));
        }
        for (kotlin.text.MatchResult matchResult2 : kotlin.text.Regex.findAll$default(regex2, str2, 0, 2, null)) {
            createListBuilder.add(new com.paypal.oslo.feature.cryptocurrency.ui.common.util.RichTextElement(matchResult2.getRange(), com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType.Camera2StreamConfigurationMap, matchResult2.getGroupValues().get(2), null, matchResult2.getGroupValues().get(1), 8, null));
        }
        final java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(kotlin.collections.CollectionsKt.build(createListBuilder), new java.util.Comparator() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoRichTextUtilsKt$toCryptoRichText$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.paypal.oslo.feature.cryptocurrency.ui.common.util.RichTextElement) t).getHighSpeedVideoFpsRanges.getFirst()), java.lang.Integer.valueOf(((com.paypal.oslo.feature.cryptocurrency.ui.common.util.RichTextElement) t2).getHighSpeedVideoFpsRanges.getFirst()));
            }
        });
        return com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoRichTextUtilsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoRichTextUtilsKt.$r8$lambda$at_hj1qpC1AmqkvmTqok53972Ys(sortedWith, str, map, (com.paypal.pds.core.Builder) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$at_hj1qpC1AmqkvmTqok53972Ys(java.util.List list, java.lang.String str, java.util.Map map, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        java.util.Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            com.paypal.oslo.feature.cryptocurrency.ui.common.util.RichTextElement richTextElement = (com.paypal.oslo.feature.cryptocurrency.ui.common.util.RichTextElement) it.next();
            if (richTextElement.getHighSpeedVideoFpsRanges.getFirst() >= i) {
                if (i < richTextElement.getHighSpeedVideoFpsRanges.getFirst()) {
                    java.lang.String substring = str.substring(i, richTextElement.getHighSpeedVideoFpsRanges.getFirst());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                    com.paypal.pds.core.Builder.append$default(builder, substring, null, false, 6, null);
                }
                int i2 = com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoRichTextUtilsKt.WhenMappings.$EnumSwitchMapping$0[richTextElement.getHighResolutionOutputSizeshNQ4ISI.ordinal()];
                if (i2 == 1) {
                    java.lang.String str2 = richTextElement.getHighSpeedVideoFpsRangesFor;
                    java.lang.String str3 = richTextElement.getHighSpeedVideoSizes;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str3);
                    builder.appendLink(str2, str3);
                } else {
                    if (i2 != 2) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.cryptocurrency.ui.common.util.TagStyle tagStyle = (com.paypal.oslo.feature.cryptocurrency.ui.common.util.TagStyle) map.get(richTextElement.Camera2StreamConfigurationMap);
                    if (tagStyle != null) {
                        builder.append(richTextElement.getHighSpeedVideoFpsRangesFor, tagStyle.getColor(), tagStyle.isBold());
                    } else {
                        com.paypal.pds.core.Builder.append$default(builder, richTextElement.getHighSpeedVideoFpsRangesFor, null, false, 6, null);
                    }
                }
                i = richTextElement.getHighSpeedVideoFpsRanges.getLast() + 1;
            }
        }
        if (i < str.length()) {
            java.lang.String substring2 = str.substring(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            com.paypal.pds.core.Builder.append$default(builder, substring2, null, false, 6, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType.values().length];
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType.getHighResolutionOutputSizeshNQ4ISI.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.common.util.ElementType.Camera2StreamConfigurationMap.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
