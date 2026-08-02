package com.paypal.oslo.feature.taptopay.ui.shared.component;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0015"}, d2 = {"TapToPayActionButtons", "", "primaryButtonText", "", "secondaryButtonText", "onPrimaryClick", "Lkotlin/Function0;", "onSecondaryClick", "modifier", "Landroidx/compose/ui/Modifier;", "secondaryButtonStyle", "Lcom/paypal/pds/components/ButtonStyle;", "primaryButtonTestTag", "secondaryButtonTestTag", "primaryButtonItem", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "secondaryButtonItem", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/ButtonStyle;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;Landroidx/compose/runtime/Composer;II)V", "TapToPayActionButtonsPreview", "(Landroidx/compose/runtime/Composer;I)V", "TapToPayActionButtonsDarkPreview", "taptopay_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TapToPayActionButtonsKt {
    /* JADX WARN: Removed duplicated region for block: B:108:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TapToPayActionButtons(final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.ButtonStyle buttonStyle, java.lang.String str3, java.lang.String str4, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final com.paypal.pds.components.ButtonStyle buttonStyle2;
        final java.lang.String str5;
        final java.lang.String str6;
        final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item3;
        final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2067699267);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                i3 |= startRestartGroup.changed(buttonStyle) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changed(str3) ? 1048576 : 524288;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(str4) ? 8388608 : 4194304;
                }
                i7 = i2 & 256;
                int i10 = 100663296;
                if (i7 == 0) {
                    if ((i & 100663296) == 0) {
                        i10 = (i & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) == 0 ? startRestartGroup.changed(item) : startRestartGroup.changedInstance(item) ? 67108864 : 33554432;
                    }
                    i8 = i2 & 512;
                    int i11 = 805306368;
                    if (i8 == 0) {
                        if ((i & 805306368) == 0) {
                            i11 = (i & 1073741824) == 0 ? startRestartGroup.changed(item2) : startRestartGroup.changedInstance(item2) ? 536870912 : 268435456;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            buttonStyle2 = buttonStyle;
                            str5 = str3;
                            str6 = str4;
                            item3 = item;
                            item4 = item2;
                        } else {
                            androidx.compose.ui.Modifier modifier3 = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            com.paypal.pds.components.ButtonStyle buttonStyle3 = i4 != 0 ? com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE : buttonStyle;
                            java.lang.String str7 = i5 != 0 ? null : str3;
                            java.lang.String str8 = i6 != 0 ? null : str4;
                            com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item5 = i7 != 0 ? null : item;
                            com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item6 = i8 != 0 ? null : item2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-2067699267, i3, -1, "com.paypal.oslo.feature.taptopay.ui.shared.component.TapToPayActionButtons (TapToPayActionButtons.kt:58)");
                            }
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
                            com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item7 = item6;
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            java.lang.String str9 = str8;
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
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                            if (item5 != null) {
                                companion = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(companion, item5);
                            }
                            androidx.compose.ui.Modifier then = fillMaxWidth$default.then(companion);
                            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                            if (str7 != null) {
                                companion2 = androidx.compose.ui.platform.TestTagKt.testTag(companion2, str7);
                            }
                            int i12 = i3;
                            com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item8 = item5;
                            androidx.compose.ui.Modifier modifier4 = modifier3;
                            java.lang.String str10 = str7;
                            com.paypal.pds.components.ButtonKt.Button(function0, str, then.then(companion2), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, ((i3 >> 6) & 14) | 1769472 | ((i3 << 3) & 112), 408);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                            androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                            androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                            if (item7 != null) {
                                companion3 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(companion3, item7);
                            }
                            androidx.compose.ui.Modifier then2 = fillMaxWidth$default2.then(companion3);
                            androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.INSTANCE;
                            if (str9 != null) {
                                companion4 = androidx.compose.ui.platform.TestTagKt.testTag(companion4, str9);
                            }
                            composer2 = startRestartGroup;
                            com.paypal.pds.components.ButtonKt.Button(function02, str2, then2.then(companion4), null, null, buttonStyle3, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, ((i12 >> 9) & 14) | 1572864 | (i12 & 112) | (i12 & 458752), 408);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer2, 0);
                            composer2.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            buttonStyle2 = buttonStyle3;
                            str6 = str9;
                            modifier2 = modifier4;
                            str5 = str10;
                            item3 = item8;
                            item4 = item7;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.component.TapToPayActionButtonsKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.taptopay.ui.shared.component.TapToPayActionButtonsKt.m20259$r8$lambda$lNVnDV_VglstW2zERWueeJzt3E(str, str2, function0, function02, modifier2, buttonStyle2, str5, str6, item3, item4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= i11;
                    if (!startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i3 |= i10;
                i8 = i2 & 512;
                int i112 = 805306368;
                if (i8 == 0) {
                }
                i3 |= i112;
                if (!startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            i7 = i2 & 256;
            int i102 = 100663296;
            if (i7 == 0) {
            }
            i3 |= i102;
            i8 = i2 & 512;
            int i1122 = 805306368;
            if (i8 == 0) {
            }
            i3 |= i1122;
            if (!startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        i7 = i2 & 256;
        int i1022 = 100663296;
        if (i7 == 0) {
        }
        i3 |= i1022;
        i8 = i2 & 512;
        int i11222 = 805306368;
        if (i8 == 0) {
        }
        i3 |= i11222;
        if (!startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NAf5R14_Vm5aeUI3bsfvRLeM7e4(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1533277343);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1533277343, updateChangedFlags, -1, "com.paypal.oslo.feature.taptopay.ui.shared.component.TapToPayActionButtonsDarkPreview (TapToPayActionButtons.kt:111)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.component.TapToPayActionButtonsKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.component.TapToPayActionButtonsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            composer2 = startRestartGroup;
            TapToPayActionButtons("Call Now", "Try another way", function0, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, null, null, null, null, startRestartGroup, 3510, 1008);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.component.TapToPayActionButtonsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.shared.component.TapToPayActionButtonsKt.$r8$lambda$NAf5R14_Vm5aeUI3bsfvRLeM7e4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lNVnDV_VglstW2zE-RWueeJzt3E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20259$r8$lambda$lNVnDV_VglstW2zERWueeJzt3E(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.ButtonStyle buttonStyle, java.lang.String str3, java.lang.String str4, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TapToPayActionButtons(str, str2, function0, function02, modifier, buttonStyle, str3, str4, item, item2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rmUjB6CPF07ZUbdX7VayTQ6OonI(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1928956535);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1928956535, updateChangedFlags, -1, "com.paypal.oslo.feature.taptopay.ui.shared.component.TapToPayActionButtonsPreview (TapToPayActionButtons.kt:98)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.component.TapToPayActionButtonsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.component.TapToPayActionButtonsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            composer2 = startRestartGroup;
            TapToPayActionButtons("Call Now", "Try another way", function0, (kotlin.jvm.functions.Function0) rememberedValue2, null, null, null, null, null, null, startRestartGroup, 3510, 1008);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taptopay.ui.shared.component.TapToPayActionButtonsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taptopay.ui.shared.component.TapToPayActionButtonsKt.$r8$lambda$rmUjB6CPF07ZUbdX7VayTQ6OonI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
