package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class FundsTimingFragmentViewProvider$View$2 implements kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.constants.FundsTiming> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:131:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0a9a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x088d  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme;
        com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme2;
        com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme3;
        com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse confirmAmountResponse;
        com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse confirmAmountResponse2;
        com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse confirmAmountResponse3;
        com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse confirmAmountResponse4;
        java.lang.String str;
        com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse confirmAmountResponse5;
        java.lang.String formattedFeeTitle;
        com.ingo.sdk.kotlin.common.constants.FundsTiming value;
        java.lang.String str2;
        com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse confirmAmountResponse6;
        java.lang.String formattedFeeAmount;
        int currentCompositeKeyHash;
        androidx.compose.runtime.Composer m5299constructorimpl;
        com.ingo.sdk.kotlin.common.constants.FundsTiming value2;
        java.util.List<java.lang.String> emptyList;
        com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse confirmAmountResponse7;
        com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse confirmAmountResponse8;
        com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse confirmAmountResponse9;
        com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse confirmAmountResponse10;
        androidx.compose.foundation.layout.PaddingValues paddingValues2 = paddingValues;
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues2, "");
        if ((intValue & 14) == 0) {
            intValue |= composer2.changed(paddingValues2) ? 4 : 2;
        }
        if ((intValue & 91) != 18 || !composer2.getSkipping()) {
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.INSTANCE, paddingValues2), 0.0f, 1, null);
            java.lang.String str3 = this.getHighSpeedVideoSizes;
            final androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.constants.FundsTiming> mutableState = this.getHighSpeedVideoFpsRanges;
            final com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider fundsTimingFragmentViewProvider = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String str4 = this.Camera2StreamConfigurationMap;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
            int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                m5299constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
            int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, verticalScroll$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                m5299constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                m5299constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash2);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            java.lang.String formattedTextString = new com.ingo.sdk.kotlin.ux.textmachine.AmountInputTextMachine(str3).getFormattedTextString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (int i = 0; i < formattedTextString.length(); i++) {
                char charAt = formattedTextString.charAt(i);
                if (charAt != '$') {
                    sb.append(charAt);
                }
            }
            java.lang.String obj = sb.toString();
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(center, centerVertically, composer2, 54);
            int currentCompositeKeyHash4 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl4.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl4.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash4))) {
                m5299constructorimpl4.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash4));
                m5299constructorimpl4.apply(java.lang.Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash3);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            composer2.startReplaceGroup(1192338294);
            androidx.compose.ui.text.AnnotatedString.Builder builder = new androidx.compose.ui.text.AnnotatedString.Builder(0, 1, null);
            composer2.startReplaceGroup(1192338827);
            currentTheme = fundsTimingFragmentViewProvider.currentTheme(composer2, 8);
            int pushStyle = builder.pushStyle(new androidx.compose.ui.text.SpanStyle(androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme.getPrimaryColor())), androidx.compose.ui.unit.TextUnitKt.getSp(40), (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, androidx.compose.ui.text.style.BaselineShift.m8309boximpl(androidx.compose.ui.text.style.BaselineShift.m8310constructorimpl(0.65f)), (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65276, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            try {
                builder.append(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_currency_symbol_localized, composer2, 0));
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                builder.pop(pushStyle);
                composer2.endReplaceGroup();
                java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\.");
                composer2.startReplaceGroup(1192358893);
                currentTheme2 = fundsTimingFragmentViewProvider.currentTheme(composer2, 8);
                pushStyle = builder.pushStyle(new androidx.compose.ui.text.SpanStyle(androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme2.getPrimaryColor())), androidx.compose.ui.unit.TextUnitKt.getSp(55), (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65532, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                try {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(compile);
                    builder.append((java.lang.String) kotlin.collections.CollectionsKt.first(kotlin.text.StringsKt.split$default(obj, compile, 0, 2, null)));
                    builder.append(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_sdk_decimal_delimiter, composer2, 0));
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    builder.pop(pushStyle);
                    composer2.endReplaceGroup();
                    currentTheme3 = fundsTimingFragmentViewProvider.currentTheme(composer2, 8);
                    pushStyle = builder.pushStyle(new androidx.compose.ui.text.SpanStyle(androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme3.getPrimaryColor())), androidx.compose.ui.unit.TextUnitKt.getSp(40), (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, androidx.compose.ui.text.style.BaselineShift.m8309boximpl(androidx.compose.ui.text.style.BaselineShift.m8310constructorimpl(0.65f)), (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65276, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                    try {
                        builder.append((java.lang.String) kotlin.text.StringsKt.split$default(obj, compile, 0, 2, null).get(1));
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        builder.pop(pushStyle);
                        androidx.compose.ui.text.AnnotatedString annotatedString = builder.toAnnotatedString();
                        composer2.endReplaceGroup();
                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10645PrimaryTextDpqVIHw(androidx.compose.ui.Modifier.INSTANCE, annotatedString, kotlin.collections.MapsKt.emptyMap(), null, 0, null, composer2, 390, 56);
                        composer2.endNode();
                        androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f));
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer2, 6);
                        int currentCompositeKeyHash5 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1707paddingVpY3zN4);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor4);
                        } else {
                            composer2.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl5 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m5299constructorimpl5.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl5.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash5))) {
                            m5299constructorimpl5.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash5));
                            m5299constructorimpl5.apply(java.lang.Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash4);
                        }
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(null, str4, null, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk(), null, 0, 0L, 0, composer2, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE);
                        composer2.endNode();
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer2, 6);
                        androidx.compose.ui.Modifier m1709paddingqDBjuR0 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f));
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy3 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceAround(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer2, 6);
                        int currentCompositeKeyHash6 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1709paddingqDBjuR0);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor5);
                        } else {
                            composer2.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl6 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, rowMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, currentCompositionLocalMap5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m5299constructorimpl6.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl6.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash6))) {
                            m5299constructorimpl6.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash6));
                            m5299constructorimpl6.apply(java.lang.Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash5);
                        }
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, materializeModifier5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance3 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance3, androidx.compose.ui.Modifier.INSTANCE, 0.5f, false, 2, null);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                        int currentCompositeKeyHash7 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier6 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, weight$default);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor6 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor6);
                        } else {
                            composer2.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl7 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, currentCompositionLocalMap6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash6 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m5299constructorimpl7.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl7.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash7))) {
                            m5299constructorimpl7.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash7));
                            m5299constructorimpl7.apply(java.lang.Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash6);
                        }
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, materializeModifier6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        int i2 = !kotlin.jvm.internal.Intrinsics.areEqual(mutableState.getValue(), com.ingo.sdk.kotlin.common.constants.InMinutesFundsTiming.INSTANCE) ? com.ingo.sdk.android.ux.R.drawable.ic_minutes_rocket_icon_unselected : com.ingo.sdk.android.ux.R.drawable.ic_minutes_rocket_icon_selected;
                        confirmAmountResponse = fundsTimingFragmentViewProvider.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.String fundsTimingTitle = confirmAmountResponse.getInMinutesFees().getFundsTimingTitle();
                        confirmAmountResponse2 = fundsTimingFragmentViewProvider.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.String fundsTimingDescription = confirmAmountResponse2.getInMinutesFees().getFundsTimingDescription();
                        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(mutableState.getValue(), com.ingo.sdk.kotlin.common.constants.InMinutesFundsTiming.INSTANCE);
                        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider$View$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider$View$2.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState.this, fundsTimingFragmentViewProvider);
                            }
                        };
                        java.lang.Object obj2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.IngoSdkConfiguration.class));
                        if (obj2 != null) {
                            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.FundsTimingView(i2, fundsTimingTitle, fundsTimingDescription, areEqual, function0, null, ((com.ingo.sdk.kotlin.common.IngoSdkConfiguration) obj2).getIconTintEnabled(), composer2, 0, 32);
                            composer2.endNode();
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), composer2, 6);
                            androidx.compose.ui.Modifier weight$default2 = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance3, androidx.compose.ui.Modifier.INSTANCE, 0.5f, false, 2, null);
                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                            int currentCompositeKeyHash8 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier7 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, weight$default2);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor7 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor7);
                            } else {
                                composer2.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl8 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, currentCompositionLocalMap7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash7 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m5299constructorimpl8.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl8.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash8))) {
                                m5299constructorimpl8.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash8));
                                m5299constructorimpl8.apply(java.lang.Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash7);
                            }
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, materializeModifier7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            int i3 = !kotlin.jvm.internal.Intrinsics.areEqual(mutableState.getValue(), com.ingo.sdk.kotlin.common.constants.InDaysFundsTiming.INSTANCE) ? com.ingo.sdk.android.ux.R.drawable.ic_days_balloon_icon_unselected : com.ingo.sdk.android.ux.R.drawable.ic_days_balloon_icon_selected;
                            confirmAmountResponse3 = fundsTimingFragmentViewProvider.getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.String fundsTimingTitle2 = confirmAmountResponse3.getInDaysFees().getFundsTimingTitle();
                            confirmAmountResponse4 = fundsTimingFragmentViewProvider.getHighResolutionOutputSizeshNQ4ISI;
                            java.lang.String fundsTimingDescription2 = confirmAmountResponse4.getInDaysFees().getFundsTimingDescription();
                            boolean areEqual2 = kotlin.jvm.internal.Intrinsics.areEqual(mutableState.getValue(), com.ingo.sdk.kotlin.common.constants.InDaysFundsTiming.INSTANCE);
                            kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider$View$2$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider$View$2.getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState.this, fundsTimingFragmentViewProvider);
                                }
                            };
                            java.lang.Object obj3 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.IngoSdkConfiguration.class));
                            if (obj3 != null) {
                                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.FundsTimingView(i3, fundsTimingTitle2, fundsTimingDescription2, areEqual2, function02, null, ((com.ingo.sdk.kotlin.common.IngoSdkConfiguration) obj3).getIconTintEnabled(), composer2, 0, 32);
                                composer2.endNode();
                                composer2.endNode();
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer2, 6);
                                androidx.compose.ui.Modifier m1709paddingqDBjuR02 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(32.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(32.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f));
                                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy4 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer2, 6);
                                int currentCompositeKeyHash9 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                                androidx.compose.ui.Modifier materializeModifier8 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1709paddingqDBjuR02);
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor8 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor8);
                                } else {
                                    composer2.useNode();
                                }
                                androidx.compose.runtime.Composer m5299constructorimpl9 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl9, rowMeasurePolicy4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl9, currentCompositionLocalMap8, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash8 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m5299constructorimpl9.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl9.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash9))) {
                                    m5299constructorimpl9.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash9));
                                    m5299constructorimpl9.apply(java.lang.Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash8);
                                }
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl9, materializeModifier8, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance4 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                com.ingo.sdk.kotlin.common.constants.FundsTiming value3 = mutableState.getValue();
                                if (kotlin.jvm.internal.Intrinsics.areEqual(value3, com.ingo.sdk.kotlin.common.constants.InMinutesFundsTiming.INSTANCE)) {
                                    confirmAmountResponse10 = fundsTimingFragmentViewProvider.getHighResolutionOutputSizeshNQ4ISI;
                                    formattedFeeTitle = confirmAmountResponse10.getInMinutesFees().getFormattedFeeTitle();
                                } else if (kotlin.jvm.internal.Intrinsics.areEqual(value3, com.ingo.sdk.kotlin.common.constants.InDaysFundsTiming.INSTANCE)) {
                                    confirmAmountResponse5 = fundsTimingFragmentViewProvider.getHighResolutionOutputSizeshNQ4ISI;
                                    formattedFeeTitle = confirmAmountResponse5.getInDaysFees().getFormattedFeeTitle();
                                } else {
                                    str = "";
                                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance4, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), str, null, 0, null, 0, 0L, 0, composer2, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1725defaultMinSizeVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), 0.0f, 2, null), composer2, 6);
                                    value = mutableState.getValue();
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(value, com.ingo.sdk.kotlin.common.constants.InMinutesFundsTiming.INSTANCE)) {
                                        confirmAmountResponse9 = fundsTimingFragmentViewProvider.getHighResolutionOutputSizeshNQ4ISI;
                                        formattedFeeAmount = confirmAmountResponse9.getInMinutesFees().getFormattedFeeAmount();
                                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(value, com.ingo.sdk.kotlin.common.constants.InDaysFundsTiming.INSTANCE)) {
                                        confirmAmountResponse6 = fundsTimingFragmentViewProvider.getHighResolutionOutputSizeshNQ4ISI;
                                        formattedFeeAmount = confirmAmountResponse6.getInDaysFees().getFormattedFeeAmount();
                                    } else {
                                        str2 = "";
                                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(null, str2, null, 0, null, 0, 0L, 0, composer2, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                                        composer2.endNode();
                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer2, 6);
                                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                                        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                                        androidx.compose.ui.Modifier materializeModifier9 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, companion);
                                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor9 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (composer2.getInserting()) {
                                            composer2.createNode(constructor9);
                                        } else {
                                            composer2.useNode();
                                        }
                                        m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap9, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash9 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                            m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                            m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash9);
                                        }
                                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier9, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                        value2 = mutableState.getValue();
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(value2, com.ingo.sdk.kotlin.common.constants.InMinutesFundsTiming.INSTANCE)) {
                                            confirmAmountResponse8 = fundsTimingFragmentViewProvider.getHighResolutionOutputSizeshNQ4ISI;
                                            emptyList = confirmAmountResponse8.getInMinutesFees().getFundsTimingDisclaimers();
                                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(value2, com.ingo.sdk.kotlin.common.constants.InDaysFundsTiming.INSTANCE)) {
                                            confirmAmountResponse7 = fundsTimingFragmentViewProvider.getHighResolutionOutputSizeshNQ4ISI;
                                            emptyList = confirmAmountResponse7.getInDaysFees().getFundsTimingDisclaimers();
                                        } else {
                                            emptyList = kotlin.collections.CollectionsKt.emptyList();
                                        }
                                        composer2.startReplaceGroup(-584655488);
                                        for (java.lang.String str5 : emptyList) {
                                            androidx.compose.ui.Modifier m1709paddingqDBjuR03 = androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(32.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(32.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f));
                                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy5 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer2, 0);
                                            int currentCompositeKeyHash10 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
                                            androidx.compose.ui.Modifier materializeModifier10 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1709paddingqDBjuR03);
                                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor10 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor10);
                                            } else {
                                                composer2.useNode();
                                            }
                                            androidx.compose.runtime.Composer m5299constructorimpl10 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl10, rowMeasurePolicy5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl10, currentCompositionLocalMap10, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash10 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (m5299constructorimpl10.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl10.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash10))) {
                                                m5299constructorimpl10.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash10));
                                                m5299constructorimpl10.apply(java.lang.Integer.valueOf(currentCompositeKeyHash10), setCompositeKeyHash10);
                                            }
                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl10, materializeModifier10, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance5 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(null, str5, com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography().getBodySmall(), 0, null, 0, 0L, 0, composer2, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE);
                                            composer2.endNode();
                                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), composer2, 6);
                                        }
                                        composer2.endReplaceGroup();
                                        composer2.endNode();
                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
                                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.MajorButton(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_next, composer2, 0), new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider$View$2$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider$View$2.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.MutableState.this, fundsTimingFragmentViewProvider);
                                            }
                                        }, mutableState.getValue() != null, false, false, 0, composer2, 0, 56);
                                        composer2.endNode();
                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer2, 6);
                                        com.ingo.sdk.android.ux.viewprovider.IngoSdkComposablesKt.LegalDisclaimer(composer2, 0);
                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer2, 6);
                                        composer2.endNode();
                                    }
                                    str2 = formattedFeeAmount;
                                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(null, str2, null, 0, null, 0, 0L, 0, composer2, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                                    composer2.endNode();
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer2, 6);
                                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy32 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                                    currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap92 = composer2.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.Modifier materializeModifier92 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, companion2);
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor92 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                    }
                                    m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap92, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash92 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!m5299constructorimpl.getInserting()) {
                                    }
                                    m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                    m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash92);
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier92, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance22 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                    value2 = mutableState.getValue();
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(value2, com.ingo.sdk.kotlin.common.constants.InMinutesFundsTiming.INSTANCE)) {
                                    }
                                    composer2.startReplaceGroup(-584655488);
                                    while (r19.hasNext()) {
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
                                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.MajorButton(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_next, composer2, 0), new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider$View$2$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider$View$2.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.MutableState.this, fundsTimingFragmentViewProvider);
                                        }
                                    }, mutableState.getValue() != null, false, false, 0, composer2, 0, 56);
                                    composer2.endNode();
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer2, 6);
                                    com.ingo.sdk.android.ux.viewprovider.IngoSdkComposablesKt.LegalDisclaimer(composer2, 0);
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer2, 6);
                                    composer2.endNode();
                                }
                                str = formattedFeeTitle;
                                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance4, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), str, null, 0, null, 0, 0L, 0, composer2, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1725defaultMinSizeVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), 0.0f, 2, null), composer2, 6);
                                value = mutableState.getValue();
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(value, com.ingo.sdk.kotlin.common.constants.InMinutesFundsTiming.INSTANCE)) {
                                }
                                str2 = formattedFeeAmount;
                                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(null, str2, null, 0, null, 0, 0L, 0, composer2, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                                composer2.endNode();
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer2, 6);
                                androidx.compose.ui.Modifier.Companion companion22 = androidx.compose.ui.Modifier.INSTANCE;
                                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy322 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                                currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap922 = composer2.getCurrentCompositionLocalMap();
                                androidx.compose.ui.Modifier materializeModifier922 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, companion22);
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor922 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                }
                                m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy322, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap922, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash922 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m5299constructorimpl.getInserting()) {
                                }
                                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash922);
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier922, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance222 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                value2 = mutableState.getValue();
                                if (kotlin.jvm.internal.Intrinsics.areEqual(value2, com.ingo.sdk.kotlin.common.constants.InMinutesFundsTiming.INSTANCE)) {
                                }
                                composer2.startReplaceGroup(-584655488);
                                while (r19.hasNext()) {
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
                                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.MajorButton(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_next, composer2, 0), new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider$View$2$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider$View$2.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.MutableState.this, fundsTimingFragmentViewProvider);
                                    }
                                }, mutableState.getValue() != null, false, false, 0, composer2, 0, 56);
                                composer2.endNode();
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer2, 6);
                                com.ingo.sdk.android.ux.viewprovider.IngoSdkComposablesKt.LegalDisclaimer(composer2, 0);
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer2, 6);
                                composer2.endNode();
                            } else {
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.IngoSdkConfiguration");
                            }
                        } else {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.IngoSdkConfiguration");
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState mutableState, com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider fundsTimingFragmentViewProvider) {
        kotlin.jvm.functions.Function1 function1;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(mutableState.getValue(), com.ingo.sdk.kotlin.common.constants.InDaysFundsTiming.INSTANCE)) {
            mutableState.setValue(com.ingo.sdk.kotlin.common.constants.InDaysFundsTiming.INSTANCE);
        } else {
            mutableState.setValue(null);
        }
        function1 = fundsTimingFragmentViewProvider.getHighSpeedVideoSizes;
        function1.invoke(mutableState.getValue());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.MutableState mutableState, com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider fundsTimingFragmentViewProvider) {
        kotlin.jvm.functions.Function1 function1;
        com.ingo.sdk.kotlin.common.constants.FundsTiming fundsTiming = (com.ingo.sdk.kotlin.common.constants.FundsTiming) mutableState.getValue();
        if (fundsTiming != null) {
            function1 = fundsTimingFragmentViewProvider.Camera2StreamConfigurationMap;
            function1.invoke(fundsTiming);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState mutableState, com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider fundsTimingFragmentViewProvider) {
        kotlin.jvm.functions.Function1 function1;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(mutableState.getValue(), com.ingo.sdk.kotlin.common.constants.InMinutesFundsTiming.INSTANCE)) {
            mutableState.setValue(com.ingo.sdk.kotlin.common.constants.InMinutesFundsTiming.INSTANCE);
        } else {
            mutableState.setValue(null);
        }
        function1 = fundsTimingFragmentViewProvider.getHighSpeedVideoSizes;
        function1.invoke(mutableState.getValue());
        return kotlin.Unit.INSTANCE;
    }

    FundsTimingFragmentViewProvider$View$2(java.lang.String str, androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.constants.FundsTiming> mutableState, com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider fundsTimingFragmentViewProvider, java.lang.String str2) {
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = mutableState;
        this.getHighResolutionOutputSizeshNQ4ISI = fundsTimingFragmentViewProvider;
        this.Camera2StreamConfigurationMap = str2;
    }
}
