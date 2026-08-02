package com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aY\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u0005\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u008e\u0002"}, d2 = {"TestTagTaxInputVisibilityToggle", "", "TestTagTaxInputModeToggleLink", "TaxInputInlineInputWidget", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "onValueChange", "Lkotlin/Function1;", "taxIdNumberType", "Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdNumberType;", "onTaxInputTypeChange", "modifier", "Landroidx/compose/ui/Modifier;", "showModeToggle", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdNumberType;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "TaxInputInlineInputWidgetItinPreview", "(Landroidx/compose/runtime/Composer;I)V", "mosaic_prodRelease", "isHidden"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TaxInputInlineInputWidgetKt {
    public static final java.lang.String TestTagTaxInputModeToggleLink = "TaxInput_ModeToggleLink";
    public static final java.lang.String TestTagTaxInputVisibilityToggle = "TaxInput_VisibilityToggle";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TaxInputInlineInputWidget(final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType, kotlin.Unit> function12, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final boolean z2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxIdNumberType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1089111431);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(taxIdNumberType.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                i3 |= startRestartGroup.changed(z) ? 131072 : 65536;
                if (!startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier2 = modifier;
                    z2 = z;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                    boolean z3 = i4 != 0 ? true : z;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1089111431, i3, -1, "com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidget (TaxInputInlineInputWidget.kt:72)");
                    }
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                    int i6 = (i3 >> 6) & 14;
                    java.lang.String label = com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxIdNumberTypeExtensionsKt.label(taxIdNumberType, startRestartGroup, i6);
                    final int maxLength = com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxIdNumberTypeExtensionsKt.maxLength(taxIdNumberType);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    androidx.compose.foundation.text.KeyboardOptions keyboardOptions = new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8268getNumberPjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    com.paypal.pds.components.textinput.VisualTransformation visualTransformation = ((java.lang.Boolean) mutableState.getValue()).booleanValue() ? com.paypal.pds.components.textinput.VisualTransformation.Password.INSTANCE : com.paypal.pds.components.textinput.VisualTransformation.None.INSTANCE;
                    int i7 = i3 & 112;
                    boolean z4 = i7 == 32;
                    boolean changed = startRestartGroup.changed(maxLength);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((changed | z4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidgetKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidgetKt.m15803$r8$lambda$Cg_CAT5IYRzDgpxuY924W6UlV0(kotlin.jvm.functions.Function1.this, maxLength, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    int i8 = i3;
                    boolean z5 = true;
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    com.paypal.pds.components.TextInputKt.TextInput(str, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue2, fillMaxWidth$default, label, (java.lang.String) null, (java.lang.String) null, false, false, keyboardOptions, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, visualTransformation, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1520373330, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidgetKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidgetKt.$r8$lambda$TEp5qBxZ6eTWJgn1dO8wv3I4PqM(androidx.compose.runtime.MutableState.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, (i8 & 14) | 100663680, (com.paypal.pds.components.textinput.VisualTransformation.$stable << 6) | 1572864, 61168);
                    if (z3) {
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(1524881433);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagTaxInputModeToggleLink);
                        java.lang.String str2 = com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxIdNumberTypeExtensionsKt.toggleLinkText(taxIdNumberType, composer2, i6);
                        boolean z6 = i7 == 32;
                        boolean z7 = (i8 & 7168) == 2048;
                        if ((i8 & 896) != 256) {
                            z5 = false;
                        }
                        java.lang.Object rememberedValue3 = composer2.rememberedValue();
                        if ((z7 | z6 | z5) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidgetKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidgetKt.$r8$lambda$MRLpn2Z54M_OQ7IGzfMZQJlsxJE(kotlin.jvm.functions.Function1.this, function12, taxIdNumberType);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue3);
                        }
                        com.paypal.pds.components.LinkKt.Link(str2, testTag, (kotlin.jvm.functions.Function0) rememberedValue3, null, composer2, 48, 8);
                        composer2.endReplaceGroup();
                    } else {
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(1525256223);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    z2 = z3;
                    modifier2 = modifier4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidgetKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidgetKt.$r8$lambda$0ebk9GWk1iT7VkdYOgedFltMXR8(str, function1, taxIdNumberType, function12, modifier2, z2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            if (!startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0ebk9GWk1iT7VkdYOgedFltMXR8(java.lang.String str, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.Modifier modifier, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TaxInputInlineInputWidget(str, function1, taxIdNumberType, function12, modifier, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$C-g_CAT5IYRzDgpxuY924W6UlV0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15803$r8$lambda$Cg_CAT5IYRzDgpxuY924W6UlV0(kotlin.jvm.functions.Function1 function1, int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str2.charAt(i2);
            if (java.lang.Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        function1.invoke(kotlin.text.StringsKt.take(sb.toString(), i));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MRLpn2Z54M_OQ7IGzfMZQJlsxJE(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType) {
        function1.invoke("");
        function12.invoke(com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxIdNumberTypeExtensionsKt.toggled(taxIdNumberType));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$QJdt4UVScU9Vb96CCcOzy-G51C4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15804$r8$lambda$QJdt4UVScU9Vb96CCcOzyG51C4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-49008808);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-49008808, updateChangedFlags, -1, "com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidgetItinPreview (TaxInputInlineInputWidget.kt:116)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("123456789", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType.ITIN, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
            java.lang.String str = (java.lang.String) mutableState.getValue();
            com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType = (com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType) mutableState2.getValue();
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidgetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidgetKt.$r8$lambda$lCF3Pwoh1p2BqM49I90ZX3_wXnE(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidgetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidgetKt.m15805$r8$lambda$qgfn3PCEUsSQHv3joBJ2i6lY(androidx.compose.runtime.MutableState.this, (com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            TaxInputInlineInputWidget(str, function1, taxIdNumberType, (kotlin.jvm.functions.Function1) rememberedValue4, null, false, startRestartGroup, 3120, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidgetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidgetKt.m15804$r8$lambda$QJdt4UVScU9Vb96CCcOzyG51C4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$TEp5qBxZ6eTWJgn1dO8wv3I4PqM(final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1520373330, i, -1, "com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidget.<anonymous>.<anonymous> (TaxInputInlineInputWidget.kt:89)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagTaxInputVisibilityToggle);
            com.paypal.pds.core.Icon icon = ((java.lang.Boolean) mutableState.getValue()).booleanValue() ? com.paypal.pds.core.Icon.Eye.INSTANCE : com.paypal.pds.core.Icon.EyeSlash.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidgetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidgetKt.$r8$lambda$ZrfNFvzgzIERR_Wdxg5afJkFgH0(androidx.compose.runtime.MutableState.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.IconButtonKt.IconButton(icon, (kotlin.jvm.functions.Function0) rememberedValue, testTag, tertiary, large, null, null, false, false, composer, 28080, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$ZrfNFvzgzIERR_Wdxg5afJkFgH0(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) mutableState.getValue()).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lCF3Pwoh1p2BqM49I90ZX3_wXnE(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qgfn3PCE-UsSQHv3jo-BJ2-i6lY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15805$r8$lambda$qgfn3PCEUsSQHv3joBJ2i6lY(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxIdNumberType, "");
        mutableState.setValue(taxIdNumberType);
        return kotlin.Unit.INSTANCE;
    }
}
