package androidx.compose.foundation.text.contextmenu.provider;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0088\u0001\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032V\u0010\u0005\u001aR\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u00102\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010\u0012\u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032V\u0010\u0005\u001aR\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u00102\u0011\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010\u0015\u001ae\u0010\u0016\u001a\u00020\u00172V\u0010\u0005\u001aR\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002"}, d2 = {"ProvideBasicTextContextMenu", "", "providableCompositionLocal", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuProvider;", "contextMenu", "Lkotlin/Function3;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuSession;", "Lkotlin/ParameterName;", "name", "session", "Landroidx/compose/foundation/text/contextmenu/provider/TextContextMenuDataProvider;", "dataProvider", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "anchorLayoutCoordinates", "Landroidx/compose/runtime/Composable;", "content", "(Landroidx/compose/runtime/ProvidableCompositionLocal;Lkotlin/jvm/functions/Function5;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/ProvidableCompositionLocal;Lkotlin/jvm/functions/Function5;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "basicTextContextMenuProvider", "Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider;", "(Lkotlin/jvm/functions/Function5;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/contextmenu/provider/BasicTextContextMenuProvider;", "foundation", "layoutCoordinates"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BasicTextContextMenuProviderKt {
    public static final void ProvideBasicTextContextMenu(final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider> providableCompositionLocal, final kotlin.jvm.functions.Function5<? super androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession, ? super androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider, ? super kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2072681886);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(providableCompositionLocal) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function5) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2072681886, i2, -1, "androidx.compose.foundation.text.contextmenu.provider.ProvideBasicTextContextMenu (BasicTextContextMenuProvider.kt:64)");
            }
            int i3 = i2 << 3;
            ProvideBasicTextContextMenu(androidx.compose.ui.Modifier.INSTANCE, providableCompositionLocal, function5, function2, startRestartGroup, (i3 & 112) | 6 | (i3 & 896) | (i3 & 7168));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt.m2165$r8$lambda$r1ILuPOJ4e5aQPgnhzqAD7QJkY(androidx.compose.runtime.ProvidableCompositionLocal.this, function5, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ProvideBasicTextContextMenu(final androidx.compose.ui.Modifier modifier, final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider> providableCompositionLocal, final kotlin.jvm.functions.Function5<? super androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession, ? super androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider, ? super kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-714464401);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(providableCompositionLocal) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function5) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-714464401, i2, -1, "androidx.compose.foundation.text.contextmenu.provider.ProvideBasicTextContextMenu (BasicTextContextMenuProvider.kt:80)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(null, androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy());
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            final androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider basicTextContextMenuProvider = basicTextContextMenuProvider(function5, startRestartGroup, (i2 >> 6) & 14);
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(basicTextContextMenuProvider), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(274270255, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt.$r8$lambda$ibTg5HdnF7LawhWXEf4H4qE_o_o(androidx.compose.ui.Modifier.this, mutableState, function2, basicTextContextMenuProvider, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt.$r8$lambda$KB_npU12UCwbMv51dn6ZAvshnaQ(androidx.compose.ui.Modifier.this, providableCompositionLocal, function5, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider basicTextContextMenuProvider(kotlin.jvm.functions.Function5<? super androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession, ? super androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider, ? super kotlin.jvm.functions.Function0<? extends androidx.compose.ui.layout.LayoutCoordinates>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(100861460, i, -1, "androidx.compose.foundation.text.contextmenu.provider.basicTextContextMenuProvider (BasicTextContextMenuProvider.kt:106)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(function5)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider(function5);
            composer.updateRememberedValue(rememberedValue);
        }
        final androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider basicTextContextMenuProvider = (androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider) rememberedValue;
        boolean changed = composer.changed(basicTextContextMenuProvider);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt.$r8$lambda$TZ316ngMicl8KVssbj6fOLG2m0Q(androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.this, (androidx.compose.runtime.DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.DisposableEffect(basicTextContextMenuProvider, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return basicTextContextMenuProvider;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KB_npU12UCwbMv51dn6ZAvshnaQ(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.ProvidableCompositionLocal providableCompositionLocal, kotlin.jvm.functions.Function5 function5, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        ProvideBasicTextContextMenu(modifier, providableCompositionLocal, function5, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OeYe2yNcm7irNVRRVCtNFXERuh4(androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        mutableState.setValue(layoutCoordinates);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$TZ316ngMicl8KVssbj6fOLG2m0Q(final androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider basicTextContextMenuProvider, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt$basicTextContextMenuProvider$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.this.cancel();
            }
        };
    }

    /* renamed from: $r8$lambda$TsQiCOlE9SPto-h6JDg5iAJxOAw, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.layout.LayoutCoordinates m2164$r8$lambda$TsQiCOlE9SPtoh6JDg5iAJxOAw(androidx.compose.runtime.MutableState mutableState) {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = (androidx.compose.ui.layout.LayoutCoordinates) mutableState.getValue();
        if (layoutCoordinates != null) {
            return layoutCoordinates;
        }
        androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
        throw new kotlin.KotlinNothingValueException();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ibTg5HdnF7LawhWXEf4H4qE_o_o(androidx.compose.ui.Modifier modifier, final androidx.compose.runtime.MutableState mutableState, kotlin.jvm.functions.Function2 function2, androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider basicTextContextMenuProvider, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(274270255, i, -1, "androidx.compose.foundation.text.contextmenu.provider.ProvideBasicTextContextMenu.<anonymous> (BasicTextContextMenuProvider.kt:87)");
            }
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt.$r8$lambda$OeYe2yNcm7irNVRRVCtNFXERuh4(androidx.compose.runtime.MutableState.this, (androidx.compose.ui.layout.LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier onGloballyPositioned = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, (kotlin.jvm.functions.Function1) rememberedValue);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), true);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, onGloballyPositioned);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            function2.invoke(composer, 0);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt.m2164$r8$lambda$TsQiCOlE9SPtoh6JDg5iAJxOAw(androidx.compose.runtime.MutableState.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            basicTextContextMenuProvider.ContextMenu((kotlin.jvm.functions.Function0) rememberedValue2, composer, 6);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$r1ILuPOJ-4e5aQPgnhzqAD7QJkY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2165$r8$lambda$r1ILuPOJ4e5aQPgnhzqAD7QJkY(androidx.compose.runtime.ProvidableCompositionLocal providableCompositionLocal, kotlin.jvm.functions.Function5 function5, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        ProvideBasicTextContextMenu(providableCompositionLocal, function5, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
