package com.paypal.oslo.feature.oneonboarding.ui.common;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001aC\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u0011\"\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0013\u001a#\u0010\u0014\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\rH\u0001¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"RichTextLabel", "", "richText", "Lcom/paypal/pds/core/RichText;", "typography", "Lcom/paypal/pds/core/Typography;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/pds/core/RichText;Lcom/paypal/pds/core/Typography;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "rememberRichTextWithLinks", "textResId", "", "links", "", "Lkotlin/Pair;", "", "formatArgs", "", "", "(ILjava/util/List;[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Lcom/paypal/pds/core/RichText;", "rememberRichTextWithExplicitPlaceholders", "placeholders", "Lcom/paypal/oslo/feature/oneonboarding/ui/common/PlaceholderLink;", "(ILjava/util/List;Landroidx/compose/runtime/Composer;I)Lcom/paypal/pds/core/RichText;", "one-onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichTextLabelKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RichTextLabel(final com.paypal.pds.core.RichText richText, final com.paypal.pds.core.Typography typography, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(richText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typography, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(644276214);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(richText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(typography) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(644276214, i4, -1, "com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabel (RichTextLabel.kt:37)");
                }
                final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(context);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt.$r8$lambda$eeZxf6v5nnHsPNOohIBfvMN6VbE(context, (java.lang.String) obj, (java.lang.String) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText, modifier4, contentBase, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue, typography, null, composer2, ((i4 >> 3) & 112) | (i4 & 14) | 384, i4 & 112, 5112);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt.$r8$lambda$S2I_uNT9L2_Lcv9oofV59L_wccA(com.paypal.pds.core.RichText.this, typography, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final com.paypal.pds.core.RichText rememberRichTextWithLinks(int i, java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list, java.lang.Object[] objArr, androidx.compose.runtime.Composer composer, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1823054346, i2, -1, "com.paypal.oslo.feature.oneonboarding.ui.common.rememberRichTextWithLinks (RichTextLabel.kt:64)");
        }
        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(i, java.util.Arrays.copyOf(objArr, objArr.length), composer, i2 & 14);
        boolean changed = composer.changed(stringResource);
        boolean changed2 = composer.changed(list);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = com.paypal.pds.core.RichTextKt.toRichText(stringResource, list);
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.pds.core.RichText richText = (com.paypal.pds.core.RichText) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return richText;
    }

    public static final com.paypal.pds.core.RichText rememberRichTextWithExplicitPlaceholders(int i, java.util.List<com.paypal.oslo.feature.oneonboarding.ui.common.PlaceholderLink> list, androidx.compose.runtime.Composer composer, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-544815438, i2, -1, "com.paypal.oslo.feature.oneonboarding.ui.common.rememberRichTextWithExplicitPlaceholders (RichTextLabel.kt:95)");
        }
        java.util.List<com.paypal.oslo.feature.oneonboarding.ui.common.PlaceholderLink> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.paypal.oslo.feature.oneonboarding.ui.common.PlaceholderLink) it.next()).getMarker());
        }
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(i, java.util.Arrays.copyOf(strArr, strArr.length), composer, i2 & 14);
        boolean changed = composer.changed(stringResource);
        boolean changed2 = composer.changed(list);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed2 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.oneonboarding.ui.common.PlaceholderLink placeholderLink : list2) {
                int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) stringResource, placeholderLink.getMarker(), 0, false, 6, (java.lang.Object) null);
                com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement richTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement = indexOf$default == -1 ? null : new com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement(indexOf$default, placeholderLink.getMarker().length() + indexOf$default, placeholderLink.getDisplayText(), placeholderLink.getUrl());
                if (richTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement != null) {
                    arrayList2.add(richTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement);
                }
            }
            final java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(arrayList2, new java.util.Comparator() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt$rememberRichTextWithExplicitPlaceholders$lambda$1$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement) t).getStartIndex()), java.lang.Integer.valueOf(((com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement) t2).getStartIndex()));
                }
            });
            rememberedValue = com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt.m17158$r8$lambda$7iX91Tkd0tWobt2LH7wzjzowXA(sortedWith, stringResource, (com.paypal.pds.core.Builder) obj);
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.pds.core.RichText richText = (com.paypal.pds.core.RichText) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return richText;
    }

    /* renamed from: $r8$lambda$7iX91Tkd0tWobt2LH7wzjzow-XA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17158$r8$lambda$7iX91Tkd0tWobt2LH7wzjzowXA(java.util.List list, java.lang.String str, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        java.util.Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement richTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement = (com.paypal.oslo.feature.oneonboarding.ui.common.RichTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement) it.next();
            if (i < richTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement.getStartIndex()) {
                java.lang.String substring = str.substring(i, richTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement.getStartIndex());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                com.paypal.pds.core.Builder.append$default(builder, substring, null, false, 6, null);
            }
            builder.appendLink(richTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement.getText(), richTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement.getUrl());
            i = richTextLabelKt$rememberRichTextWithExplicitPlaceholders$1$Replacement.getEndIndex();
        }
        if (i < str.length()) {
            java.lang.String substring2 = str.substring(i);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            com.paypal.pds.core.Builder.append$default(builder, substring2, null, false, 6, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$S2I_uNT9L2_Lcv9oofV59L_wccA(com.paypal.pds.core.RichText richText, com.paypal.pds.core.Typography typography, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RichTextLabel(richText, typography, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eeZxf6v5nnHsPNOohIBfvMN6VbE(android.content.Context context, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        com.paypal.oslo.feature.oneonboarding.ui.util.UrlUtilsKt.launchUrlInBrowser(str2, context);
        return kotlin.Unit.INSTANCE;
    }
}
