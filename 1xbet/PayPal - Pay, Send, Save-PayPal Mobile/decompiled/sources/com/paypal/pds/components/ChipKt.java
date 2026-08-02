package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000C\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0000*\u0001\u001f\u001aÇ\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000e0\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0014\u001aS\u0010\u0015\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u0013\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c¨\u0006\u001d²\u0006\u0010\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004X\u008a\u008e\u0002"}, d2 = {"Chip", "", "T", "items", "", "isSelected", "Lkotlin/Function1;", "", "label", "", "isRemovable", "onClick", "onRemove", "key", "", "modifier", "Landroidx/compose/ui/Modifier;", "leadingIcon", "Lcom/paypal/pds/core/Icon;", "enabled", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "SingleChip", com.paypal.pds.components.ListKt.SelectedCheckmarkTestTag, "showCloseButton", "onSelect", "Lkotlin/Function0;", "(Ljava/lang/String;ZZLcom/paypal/pds/core/Icon;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "ChipPreview", "(Landroidx/compose/runtime/Composer;I)V", "pds_release", "chips", "com/paypal/pds/components/ChipKt$ChipPreview$ChipData"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChipKt {
    @kotlin.Deprecated(message = "Chip is deprecated. Use Chips instead. Note: Chips has a different API and is not a drop-in replacement. Manual migration is required.", replaceWith = @kotlin.ReplaceWith(expression = "Chips", imports = {"com.paypal.pds.components"}))
    public static final <T> void Chip(final java.util.List<? extends T> list, final kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1, final kotlin.jvm.functions.Function1<? super T, java.lang.String> function12, final kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function13, final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function14, final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function15, final kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function16, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super T, ? extends com.paypal.pds.core.Icon> function17, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final kotlin.jvm.functions.Function1<? super T, ? extends com.paypal.pds.core.Icon> function18;
        final boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function14, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function15, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function16, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-206250805);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function13) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function14) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function15) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function16) ? 1048576 : 524288;
        }
        int i4 = i2 & 128;
        if (i4 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 8388608 : 4194304;
        }
        int i5 = i2 & 256;
        if (i5 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changedInstance(function17) ? 67108864 : 33554432;
        }
        int i6 = i2 & 512;
        if (i6 != 0) {
            i3 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(z) ? 536870912 : 268435456;
        }
        if (!startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
            function18 = function17;
            z2 = z;
        } else {
            androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
            kotlin.jvm.functions.Function1<? super T, ? extends com.paypal.pds.core.Icon> function19 = i5 != 0 ? null : function17;
            boolean z3 = i6 != 0 ? true : z;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-206250805, i3, -1, "com.paypal.pds.components.Chip (Chip.kt:92)");
            }
            androidx.compose.ui.Modifier pdsComponent = com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(modifier3);
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12());
            boolean changedInstance = startRestartGroup.changedInstance(list);
            boolean z4 = (3670016 & i3) == 1048576;
            boolean z5 = (i3 & 896) == 256;
            boolean z6 = (i3 & 112) == 32;
            boolean z7 = (i3 & 7168) == 2048;
            boolean z8 = (234881024 & i3) == 67108864;
            boolean z9 = (57344 & i3) == 16384;
            boolean z10 = (458752 & i3) == 131072;
            boolean z11 = (i3 & 1879048192) == 536870912;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (((changedInstance | z4 | z5 | z6 | z7 | z8 | z9 | z10) || z11) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                final kotlin.jvm.functions.Function1<? super T, ? extends com.paypal.pds.core.Icon> function110 = function19;
                composer2 = startRestartGroup;
                final boolean z12 = z3;
                kotlin.jvm.functions.Function1 function111 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ChipKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.ChipKt.$r8$lambda$DNPCivutia3YF1z3MWcJ3IBx8eg(list, function16, function12, function1, function13, function110, function14, function15, z12, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                composer2.updateRememberedValue(function111);
                rememberedValue = function111;
            } else {
                composer2 = startRestartGroup;
            }
            androidx.compose.foundation.lazy.LazyDslKt.LazyRow(pdsComponent, null, null, false, m1602spacedBy0680j_4, centerVertically, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, composer2, 221184, 462);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            function18 = function19;
            z2 = z3;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ChipKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ChipKt.$r8$lambda$2W4bBKco81wDNoPVSFLVynViAU4(list, function1, function12, function13, function14, function15, function16, modifier2, function18, z2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighResolutionOutputSizeshNQ4ISI(final java.lang.String str, final boolean z, final boolean z2, final com.paypal.pds.core.Icon icon, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final boolean z3, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1049023523);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(icon) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1049023523, i3, -1, "com.paypal.pds.components.SingleChip (Chip.kt:121)");
            }
            int i4 = (i3 >> 6) & 57344;
            composer2 = startRestartGroup;
            com.paypal.pds.components.ButtonKt.Button(function0, com.paypal.pds.core.ModifierExtensionsKt.m22102selectableXVZzFYc(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.components.ChipButtonSize.INSTANCE.getShape()), z, null, null, z3, androidx.compose.ui.semantics.Role.m7792boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c()), function0, startRestartGroup, (3670016 & (i3 << 6)) | (i3 & 112) | i4, 6), z ? com.paypal.pds.components.SelectedChipStyle.INSTANCE : com.paypal.pds.components.Outline.INSTANCE, com.paypal.pds.components.ChipButtonSize.INSTANCE, z3, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1651820061, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ChipKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ChipKt.$r8$lambda$Qdhfm9ix5URwpn4EuOmry8eCtKs(com.paypal.pds.core.Icon.this, str, z2, z3, function02, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), composer2, ((i3 >> 12) & 14) | 12782592 | i4, 64);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ChipKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ChipKt.$r8$lambda$Q2Ty0DgJm6bV0KZLLYcjMqQnkw4(str, z, z2, icon, function0, function02, z3, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-MYARpU-PZ36uSxpESiJZFWx0Oc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21671$r8$lambda$MYARpUPZ36uSxpESiJZFWx0Oc(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-348417805);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-348417805, updateChangedFlags, -1, "com.paypal.pds.components.ChipPreview (Chip.kt:208)");
            }
            final java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.pds.components.ChipKt$ChipPreview$ChipData[]{new com.paypal.pds.components.ChipKt$ChipPreview$ChipData("1", "Chip 1", com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, false, false, 24, null), new com.paypal.pds.components.ChipKt$ChipPreview$ChipData(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "Chip 2", com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, false, false, 24, null), new com.paypal.pds.components.ChipKt$ChipPreview$ChipData(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "Chip 3", com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, false, false, 24, null), new com.paypal.pds.components.ChipKt$ChipPreview$ChipData("4", "Chip 4", com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, false, false, 24, null)});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(listOf, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(kotlin.collections.SetsKt.emptySet(), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
            final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing48(), 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
            java.util.List list = (java.util.List) mutableState.getValue();
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ChipKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(com.paypal.pds.components.ChipKt.m21673$r8$lambda$GP2rtVND1p8bUrGL63aE8_efmQ(androidx.compose.runtime.MutableState.this, (com.paypal.pds.components.ChipKt$ChipPreview$ChipData) obj));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ChipKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.ChipKt.$r8$lambda$asC5BBLoFXQYi0B41WJNNhR8eXs((com.paypal.pds.components.ChipKt$ChipPreview$ChipData) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ChipKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(com.paypal.pds.components.ChipKt.$r8$lambda$X5CtLyZlfjYPURRE_mdnN5oqbFc((com.paypal.pds.components.ChipKt$ChipPreview$ChipData) obj));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue5;
            boolean changedInstance = startRestartGroup.changedInstance(context);
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ChipKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.ChipKt.m21672$r8$lambda$44SMiZDIJdoJDxksS9jNGe5vc(androidx.compose.runtime.MutableState.this, context, (com.paypal.pds.components.ChipKt$ChipPreview$ChipData) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) rememberedValue6;
            boolean changedInstance2 = startRestartGroup.changedInstance(context);
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ChipKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.ChipKt.$r8$lambda$J2BR9SU4jGGQ7iL77ZXx5k1Jh74(androidx.compose.runtime.MutableState.this, context, mutableState, (com.paypal.pds.components.ChipKt$ChipPreview$ChipData) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            kotlin.jvm.functions.Function1 function15 = (kotlin.jvm.functions.Function1) rememberedValue7;
            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ChipKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.ChipKt.m21674$r8$lambda$eyi1OckJEjt97XinmOT4fi1x8Y((com.paypal.pds.components.ChipKt$ChipPreview$ChipData) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            kotlin.jvm.functions.Function1 function16 = (kotlin.jvm.functions.Function1) rememberedValue8;
            java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ChipKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.ChipKt.$r8$lambda$_CNLzorxJYb7JcdHcRFWACZNx5A((com.paypal.pds.components.ChipKt$ChipPreview$ChipData) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            kotlin.jvm.functions.Function1 function17 = (kotlin.jvm.functions.Function1) rememberedValue9;
            composer2 = startRestartGroup;
            Chip(list, function1, function12, function13, function14, function15, function16, null, function17, false, startRestartGroup, 102239664, 640);
            boolean changed = composer2.changed(listOf);
            java.lang.Object rememberedValue10 = composer2.rememberedValue();
            if (changed || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ChipKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.pds.components.ChipKt.$r8$lambda$QsiIqw4WIMDkHmMBuZqtCHvjlb8(listOf, mutableState2, mutableState);
                    }
                };
                composer2.updateRememberedValue(rememberedValue10);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue10, "Reset chips", null, null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer2, 1769520, 412);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ChipKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ChipKt.m21671$r8$lambda$MYARpUPZ36uSxpESiJZFWx0Oc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2W4bBKco81wDNoPVSFLVynViAU4(java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function1 function15, kotlin.jvm.functions.Function1 function16, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function17, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Chip(list, function1, function12, function13, function14, function15, function16, modifier, function17, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$44SMiZDIJdoJDxksS9j-NGe-5vc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21672$r8$lambda$44SMiZDIJdoJDxksS9jNGe5vc(androidx.compose.runtime.MutableState mutableState, android.content.Context context, com.paypal.pds.components.ChipKt$ChipPreview$ChipData chipKt$ChipPreview$ChipData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chipKt$ChipPreview$ChipData, "");
        java.lang.String id = chipKt$ChipPreview$ChipData.getId();
        mutableState.setValue(((java.util.Set) mutableState.getValue()).contains(id) ? kotlin.collections.SetsKt.minus((java.util.Set<? extends java.lang.String>) mutableState.getValue(), id) : kotlin.collections.SetsKt.plus((java.util.Set<? extends java.lang.String>) mutableState.getValue(), id));
        java.lang.String title = chipKt$ChipPreview$ChipData.getTitle();
        boolean contains = ((java.util.Set) mutableState.getValue()).contains(id);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(title);
        sb.append(" selected: ");
        sb.append(contains);
        android.widget.Toast.makeText(context, sb.toString(), 0).show();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DNPCivutia3YF1z3MWcJ3IBx8eg(final java.util.List list, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function1 function12, final kotlin.jvm.functions.Function1 function13, final kotlin.jvm.functions.Function1 function14, final kotlin.jvm.functions.Function1 function15, final kotlin.jvm.functions.Function1 function16, final kotlin.jvm.functions.Function1 function17, final boolean z, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        final com.paypal.pds.components.ChipKt$Chip$lambda$0$0$$inlined$items$default$1 chipKt$Chip$lambda$0$0$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ChipKt$Chip$lambda$0$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(T t) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                return invoke((com.paypal.pds.components.ChipKt$Chip$lambda$0$0$$inlined$items$default$1) obj);
            }
        };
        lazyListScope.items(list.size(), function1 != null ? new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.pds.components.ChipKt$Chip$lambda$0$0$$inlined$items$default$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        } : null, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.pds.components.ChipKt$Chip$lambda$0$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(802480018, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.pds.components.ChipKt$Chip$lambda$0$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final java.lang.Object obj = list.get(i);
                composer.startReplaceGroup(1153596847);
                java.lang.String str = (java.lang.String) function12.invoke(obj);
                boolean booleanValue = ((java.lang.Boolean) function13.invoke(obj)).booleanValue();
                boolean booleanValue2 = ((java.lang.Boolean) function14.invoke(obj)).booleanValue();
                kotlin.jvm.functions.Function1 function18 = function15;
                com.paypal.pds.core.Icon icon = function18 != null ? (com.paypal.pds.core.Icon) function18.invoke(obj) : null;
                boolean changed = composer.changed(function16);
                boolean changedInstance = composer.changedInstance(obj);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final kotlin.jvm.functions.Function1 function19 = function16;
                    rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.pds.components.ChipKt$Chip$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                            function19.invoke(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                boolean changed2 = composer.changed(function17);
                boolean changedInstance2 = composer.changedInstance(obj);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if ((changed2 | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final kotlin.jvm.functions.Function1 function110 = function17;
                    rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.pds.components.ChipKt$Chip$1$1$1$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                            function110.invoke(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.ChipKt.getHighResolutionOutputSizeshNQ4ISI(str, booleanValue, booleanValue2, icon, function0, (kotlin.jvm.functions.Function0) rememberedValue2, z, composer, 0);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GP2rtVND1p8-bUrGL63aE8_efmQ, reason: not valid java name */
    public static /* synthetic */ boolean m21673$r8$lambda$GP2rtVND1p8bUrGL63aE8_efmQ(androidx.compose.runtime.MutableState mutableState, com.paypal.pds.components.ChipKt$ChipPreview$ChipData chipKt$ChipPreview$ChipData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chipKt$ChipPreview$ChipData, "");
        return ((java.util.Set) mutableState.getValue()).contains(chipKt$ChipPreview$ChipData.getId());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$J2BR9SU4jGGQ7iL77ZXx5k1Jh74(androidx.compose.runtime.MutableState mutableState, android.content.Context context, androidx.compose.runtime.MutableState mutableState2, com.paypal.pds.components.ChipKt$ChipPreview$ChipData chipKt$ChipPreview$ChipData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chipKt$ChipPreview$ChipData, "");
        java.util.List list = (java.util.List) mutableState2.getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.pds.components.ChipKt$ChipPreview$ChipData) obj).getId(), chipKt$ChipPreview$ChipData.getId())) {
                arrayList.add(obj);
            }
        }
        mutableState2.setValue(arrayList);
        mutableState.setValue(kotlin.collections.SetsKt.minus((java.util.Set<? extends java.lang.String>) mutableState.getValue(), chipKt$ChipPreview$ChipData.getId()));
        java.lang.String title = chipKt$ChipPreview$ChipData.getTitle();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(title);
        sb.append(" removed");
        android.widget.Toast.makeText(context, sb.toString(), 0).show();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q2Ty0DgJm6bV0KZLLYcjMqQnkw4(java.lang.String str, boolean z, boolean z2, com.paypal.pds.core.Icon icon, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, boolean z3, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(str, z, z2, icon, function0, function02, z3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Qdhfm9ix5URwpn4EuOmry8eCtKs(com.paypal.pds.core.Icon icon, java.lang.String str, boolean z, boolean z2, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1651820061, i, -1, "com.paypal.pds.components.SingleChip.<anonymous> (Chip.kt:138)");
            }
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1708paddingVpY3zN4$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            if (icon == null) {
                composer.startReplaceGroup(1213428316);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1213428317);
                com.paypal.pds.components.IconKt.Icon(icon, null, null, com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, composer, 27696, 4);
                composer.endReplaceGroup();
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 2, null), com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, null, null, androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8504getVisiblegIe3tQ8()), false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, composer, 197040, 6, 984);
            if (z) {
                composer.startReplaceGroup(1214003491);
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.XCircleFill.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.pds.R.string.core_pds_ui_sys_remove_chip, composer, 0), com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.ui.Modifier.INSTANCE, null, null, z2, null, null, function0, composer, 6, 27), com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, composer, 27654, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1214422921);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QsiIqw4WIMDkHmMBuZqtCHvjlb8(java.util.List list, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2) {
        mutableState2.setValue(list);
        mutableState.setValue(kotlin.collections.SetsKt.emptySet());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean $r8$lambda$X5CtLyZlfjYPURRE_mdnN5oqbFc(com.paypal.pds.components.ChipKt$ChipPreview$ChipData chipKt$ChipPreview$ChipData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chipKt$ChipPreview$ChipData, "");
        return chipKt$ChipPreview$ChipData.getCanClose();
    }

    public static /* synthetic */ com.paypal.pds.core.Icon $r8$lambda$_CNLzorxJYb7JcdHcRFWACZNx5A(com.paypal.pds.components.ChipKt$ChipPreview$ChipData chipKt$ChipPreview$ChipData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chipKt$ChipPreview$ChipData, "");
        return chipKt$ChipPreview$ChipData.getIcon();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$asC5BBLoFXQYi0B41WJNNhR8eXs(com.paypal.pds.components.ChipKt$ChipPreview$ChipData chipKt$ChipPreview$ChipData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chipKt$ChipPreview$ChipData, "");
        return chipKt$ChipPreview$ChipData.getTitle();
    }

    /* renamed from: $r8$lambda$eyi1OckJEjt97X-inmOT4fi1x8Y, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m21674$r8$lambda$eyi1OckJEjt97XinmOT4fi1x8Y(com.paypal.pds.components.ChipKt$ChipPreview$ChipData chipKt$ChipPreview$ChipData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chipKt$ChipPreview$ChipData, "");
        return chipKt$ChipPreview$ChipData.getId();
    }
}
