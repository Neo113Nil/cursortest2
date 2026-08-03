package androidx.compose.foundation.text;

/* compiled from: AnnotatedStringResolveInlineContent.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2'\u0010\u000e\u001a#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t0\u0003j\u0002`\n0\u0002H\u0001¢\u0006\u0002\u0010\u000f\u001a\f\u0010\u0010\u001a\u00020\u0011*\u00020\rH\u0000\u001a_\u0010\u0012\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00050\u0002\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t0\u0003j\u0002`\n0\u00020\u0001*\u00020\r2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0000\"K\u0010\u0000\u001a?\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00050\u0002\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t0\u0003j\u0002`\n0\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*:\b\u0000\u0010\u0016\"\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t0\u00032\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t0\u0003*\u0018\b\u0000\u0010\u0017\"\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0018"}, d2 = {"EmptyInlineContent", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "Landroidx/compose/foundation/text/PlaceholderRange;", "Lkotlin/Function1;", "", "", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/foundation/text/InlineContentRange;", "InlineChildren", "text", "Landroidx/compose/ui/text/AnnotatedString;", "inlineContents", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "hasInlineContent", "", "resolveInlineContent", "inlineContent", "", "Landroidx/compose/foundation/text/InlineTextContent;", "InlineContentRange", "PlaceholderRange", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnnotatedStringResolveInlineContentKt {
    private static final kotlin.Pair<java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.jvm.functions.Function3<java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>>>> EmptyInlineContent = new kotlin.Pair<>(kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList());

    public static final kotlin.Pair<java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.jvm.functions.Function3<java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>>>> resolveInlineContent(androidx.compose.ui.text.AnnotatedString annotatedString, java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> map) {
        if (map == null || map.isEmpty()) {
            return EmptyInlineContent;
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
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(InlineChildren)P(1)*75@2735L356:AnnotatedStringResolveInlineContent.kt#423gt5");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1794596951, i, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:73)");
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.text.AnnotatedString.Range<kotlin.jvm.functions.Function3<java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>> range = list.get(i2);
            kotlin.jvm.functions.Function3<java.lang.String, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> component1 = range.component1();
            int start = range.getStart();
            int end = range.getEnd();
            androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2 annotatedStringResolveInlineContentKt$InlineChildren$1$2 = new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list2, int i3) {
                    return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list2, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list2, int i3) {
                    return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list2, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list2, int i3) {
                    return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list2, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list2, int i3) {
                    return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list2, i3);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list2, long j) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(list2.size());
                    int size2 = list2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        arrayList.add(list2.get(i3).mo3402measureBRTryo0(j));
                    }
                    final java.util.ArrayList arrayList2 = arrayList;
                    return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j), androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                            java.util.List<androidx.compose.ui.layout.Placeable> list3 = arrayList2;
                            int size3 = list3.size();
                            for (int i4 = 0; i4 < size3; i4++) {
                                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, list3.get(i4), 0, 0, 0.0f, 4, null);
                            }
                        }
                    }, 4, null);
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, annotatedStringResolveInlineContentKt$InlineChildren$1$2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1488000014, "C76@2767L42:AnnotatedStringResolveInlineContent.kt#423gt5");
            component1.invoke(annotatedString.subSequence(start, end).getText(), startRestartGroup, 0);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i3) {
                    androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt.InlineChildren(androidx.compose.ui.text.AnnotatedString.this, list, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
