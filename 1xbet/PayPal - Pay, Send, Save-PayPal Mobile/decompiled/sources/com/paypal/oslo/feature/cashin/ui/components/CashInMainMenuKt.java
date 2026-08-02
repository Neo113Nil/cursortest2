package com.paypal.oslo.feature.cashin.ui.components;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"CashInMainMenu", "", "modifier", "Landroidx/compose/ui/Modifier;", "selectedTab", "", "onTabSelect", "Lkotlin/Function1;", "(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "CashInMainMenuPreview", "(Landroidx/compose/runtime/Composer;I)V", "cash-in_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CashInMainMenuKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CashInMainMenu(androidx.compose.ui.Modifier modifier, int i, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        androidx.compose.ui.Modifier modifier2;
        int i4;
        int i5;
        int i6;
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function12;
        int i7;
        androidx.compose.ui.Modifier.Companion companion;
        int i8;
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1705313946);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 = i;
            i4 |= startRestartGroup.changed(i5) ? 32 : 16;
            i6 = i3 & 4;
            if (i6 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                function12 = function1;
                i4 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                i7 = i4;
                if (!startRestartGroup.shouldExecute((i7 & 147) != 146, i7 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    i8 = i5;
                    function13 = function12;
                } else {
                    companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    i8 = i10 != 0 ? 0 : i5;
                    if (i6 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInMainMenuKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    kotlin.Unit unit;
                                    ((java.lang.Integer) obj).intValue();
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function13 = (kotlin.jvm.functions.Function1) rememberedValue;
                    } else {
                        function13 = function12;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1705313946, i7, -1, "com.paypal.oslo.feature.cashin.ui.components.CashInMainMenu (CashInMainMenu.kt:30)");
                    }
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null), "cash_in_main_menu");
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    com.paypal.oslo.feature.cashin.ui.components.CashInLocationTabsKt.CashInLocationTabs(i8, function13, androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "cash_in_main_menu_tabs"), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, (i7 >> 3) & 126, 0);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier3 = companion;
                    final int i11 = i8;
                    final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function14 = function13;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInMainMenuKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.cashin.ui.components.CashInMainMenuKt.$r8$lambda$EjDxakceIqjPtmZ7a0rUNCMmXac(androidx.compose.ui.Modifier.this, i11, function14, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
            i7 = i4;
            if (!startRestartGroup.shouldExecute((i7 & 147) != 146, i7 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i;
        i6 = i3 & 4;
        if (i6 == 0) {
        }
        function12 = function1;
        i7 = i4;
        if (!startRestartGroup.shouldExecute((i7 & 147) != 146, i7 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EjDxakceIqjPtmZ7a0rUNCMmXac(androidx.compose.ui.Modifier modifier, int i, kotlin.jvm.functions.Function1 function1, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        CashInMainMenu(modifier, i, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XauluRw9gqc3JTGPUE66NI3gb0k(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2145324441);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2145324441, updateChangedFlags, -1, "com.paypal.oslo.feature.cashin.ui.components.CashInMainMenuPreview (CashInMainMenu.kt:51)");
            }
            CashInMainMenu(null, 0, null, startRestartGroup, 0, 7);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.CashInMainMenuKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cashin.ui.components.CashInMainMenuKt.$r8$lambda$XauluRw9gqc3JTGPUE66NI3gb0k(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
