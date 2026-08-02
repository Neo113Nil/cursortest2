package com.adobe.marketing.mobile.aepcomposeui.components;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"AepColumn", "", "columnStyle", "Lcom/adobe/marketing/mobile/aepcomposeui/style/AepColumnStyle;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lcom/adobe/marketing/mobile/aepcomposeui/style/AepColumnStyle;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "messaging_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AepColumnKt {
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r1 != 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AepColumn(final com.adobe.marketing.mobile.aepcomposeui.style.AepColumnStyle aepColumnStyle, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1259556636);
        int i3 = i2 & 1;
        int i4 = i3 != 0 ? i | 2 : i;
        if ((i2 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if (i3 != 1 || (i4 & 91) != 18 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
            } else {
                if (i3 != 0) {
                    aepColumnStyle = new com.adobe.marketing.mobile.aepcomposeui.style.AepColumnStyle(null, null, null, 7, null);
                    i4 &= -15;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1259556636, i4, -1, "com.adobe.marketing.mobile.aepcomposeui.components.AepColumn (AepColumn.kt:28)");
                }
                androidx.compose.ui.Modifier.Companion modifier = aepColumnStyle.getModifier();
                if (modifier == null) {
                    modifier = androidx.compose.ui.Modifier.INSTANCE;
                }
                androidx.compose.foundation.layout.Arrangement.Vertical verticalArrangement = aepColumnStyle.getVerticalArrangement();
                if (verticalArrangement == null) {
                    verticalArrangement = androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop();
                }
                androidx.compose.ui.Alignment.Horizontal horizontalAlignment = aepColumnStyle.getHorizontalAlignment();
                if (horizontalAlignment == null) {
                    horizontalAlignment = androidx.compose.ui.Alignment.INSTANCE.getStart();
                }
                startRestartGroup.startReplaceableGroup(-483455358);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(verticalArrangement, horizontalAlignment, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                    m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                function3.invoke(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, startRestartGroup, java.lang.Integer.valueOf(((((i4 << 6) & 7168) >> 6) & 112) | 6));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.adobe.marketing.mobile.aepcomposeui.components.AepColumnKt$AepColumn$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                com.adobe.marketing.mobile.aepcomposeui.components.AepColumnKt.AepColumn(com.adobe.marketing.mobile.aepcomposeui.style.AepColumnStyle.this, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }
        });
    }
}
