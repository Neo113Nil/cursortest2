package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u001af\u0010\u000e\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007j\u0002`\r0\u00060\u0005*\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a@\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00002'\u0010\u0014\u001a#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007j\u0002`\r0\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"Q\u0010\u0019\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t0\u0006\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007j\u0002`\r0\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018*\u0018\b\u0000\u0010\u001a\"\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0012\u0004\u0012\u00020\b0\u0007*:\b\u0000\u0010\u001b\"\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u00072\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\f0\u0007"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineContent", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "Landroidx/compose/foundation/text/PlaceholderRange;", "Lkotlin/Function1;", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/foundation/text/InlineContentRange;", "resolveInlineContent", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/Map;)Lkotlin/Pair;", "", "hasInlineContent", "(Landroidx/compose/ui/text/AnnotatedString;)Z", "text", "inlineContents", "InlineChildren", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Pair;", "getHighResolutionOutputSizeshNQ4ISI", "PlaceholderRange", "InlineContentRange"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnnotatedStringResolveInlineContentKt {
    private static final kotlin.Pair<java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.jvm.functions.Function3<java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>>>> getHighSpeedVideoFpsRangesFor = new kotlin.Pair<>(kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList());

    public static final kotlin.Pair<java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.jvm.functions.Function3<java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>>>> resolveInlineContent(androidx.compose.ui.text.AnnotatedString annotatedString, java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> map) {
        if (map == null || map.isEmpty()) {
            return getHighSpeedVideoFpsRangesFor;
        }
        java.util.List<androidx.compose.ui.text.AnnotatedString.Range<java.lang.String>> stringAnnotations = annotatedString.getStringAnnotations(androidx.compose.foundation.text.InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.getText().length());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = stringAnnotations.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.text.AnnotatedString.Range<java.lang.String> range = stringAnnotations.get(i);
            androidx.compose.foundation.text.InlineTextContent inlineTextContent = map.get(range.getItem());
            if (inlineTextContent != null) {
                arrayList.add(new androidx.compose.ui.text.AnnotatedString.Range(inlineTextContent.getPlaceholder(), range.getStart(), range.getEnd()));
                arrayList2.add(new androidx.compose.ui.text.AnnotatedString.Range(inlineTextContent.getChildren(), range.getStart(), range.getEnd()));
            }
        }
        return new kotlin.Pair<>(arrayList, arrayList2);
    }

    public static final boolean hasInlineContent(androidx.compose.ui.text.AnnotatedString annotatedString) {
        return annotatedString.hasStringAnnotations(androidx.compose.foundation.text.InlineTextContentKt.INLINE_CONTENT_TAG, 0, annotatedString.getText().length());
    }

    public static final void InlineChildren(final androidx.compose.ui.text.AnnotatedString annotatedString, final java.util.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.jvm.functions.Function3<java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>>> list, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1794596951);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changed(annotatedString) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1794596951, i2, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:67)");
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                androidx.compose.ui.text.AnnotatedString.Range<kotlin.jvm.functions.Function3<java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>> range = list.get(i3);
                kotlin.jvm.functions.Function3<java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> component1 = range.component1();
                int start = range.getStart();
                int end = range.getEnd();
                androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1 rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1.getHighResolutionOutputSizeshNQ4ISI;
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.layout.MeasurePolicy measurePolicy = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue;
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                component1.invoke(annotatedString.subSequence(start, end).getText(), startRestartGroup, 0);
                startRestartGroup.endNode();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    ((java.lang.Integer) obj2).intValue();
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.AnnotatedString.this, list, i, (androidx.compose.runtime.Composer) obj);
                    return highSpeedVideoFpsRangesFor;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.AnnotatedString annotatedString, java.util.List list, int i, androidx.compose.runtime.Composer composer) {
        InlineChildren(annotatedString, list, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
