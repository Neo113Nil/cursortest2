package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class EnterAmountFragmentViewProvider$View$2 implements kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.ui.focus.FocusManager Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.platform.SoftwareKeyboardController getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.ui.focus.FocusRequester getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme;
        com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme2;
        com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme3;
        androidx.compose.foundation.layout.PaddingValues paddingValues2 = paddingValues;
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues2, "");
        if ((intValue & 14) == 0) {
            intValue |= composer2.changed(paddingValues2) ? 4 : 2;
        }
        if ((intValue & 91) != 18 || !composer2.getSkipping()) {
            androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), paddingValues2);
            final com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider enterAmountFragmentViewProvider = this.getHighSpeedVideoFpsRangesFor;
            final androidx.compose.ui.focus.FocusRequester focusRequester = this.getHighSpeedVideoSizes;
            final androidx.compose.runtime.MutableState<java.lang.String> mutableState = this.getHighSpeedVideoFpsRanges;
            final androidx.compose.ui.focus.FocusManager focusManager = this.Camera2StreamConfigurationMap;
            final androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, padding);
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
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier fillMaxHeight$default = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
            int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxHeight$default);
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
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                m5299constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), 1.0f, false, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer2, 48);
            int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, weight$default);
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
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                m5299constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                m5299constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash4 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, companion);
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
            androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl4.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl4.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash4))) {
                m5299constructorimpl4.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash4));
                m5299constructorimpl4.apply(java.lang.Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(androidx.compose.foundation.text.selection.TextSelectionColorsKt.getLocalTextSelectionColors().provides(new androidx.compose.foundation.text.selection.TextSelectionColors(androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), null)), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(321413082, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider$View$2$1$1$1$1$1

                @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider$View$2$1$1$1$1$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
                    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> Camera2StreamConfigurationMap;
                    final /* synthetic */ androidx.compose.ui.platform.SoftwareKeyboardController getHighResolutionOutputSizeshNQ4ISI;
                    final /* synthetic */ androidx.compose.ui.focus.FocusManager getHighSpeedVideoFpsRanges;
                    final /* synthetic */ androidx.compose.ui.focus.FocusRequester getHighSpeedVideoSizes;

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                        androidx.compose.runtime.Composer composer2 = composer;
                        if ((num.intValue() & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            java.lang.String access$View$lambda$2 = com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider.access$View$lambda$2(this.Camera2StreamConfigurationMap);
                            androidx.compose.ui.Modifier focusRequester = androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.draw.AlphaKt.alpha(androidx.compose.ui.Modifier.INSTANCE, 0.0f), 0.0f, 1, null), this.getHighSpeedVideoSizes);
                            androidx.compose.material3.TextFieldColors m3961colors0hiis_0 = androidx.compose.material3.TextFieldDefaults.INSTANCE.m3961colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, androidx.compose.ui.graphics.Color.INSTANCE.m6031getTransparent0d7_KjU(), 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer2, 100663296, 0, 0, 0, 3072, 2147483391, my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL);
                            androidx.compose.foundation.text.KeyboardOptions m2058copyINvB4aQ$default = androidx.compose.foundation.text.KeyboardOptions.m2058copyINvB4aQ$default(androidx.compose.foundation.text.KeyboardOptions.INSTANCE.getDefault(), 0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8268getNumberPjHm6EE(), androidx.compose.ui.text.input.ImeAction.INSTANCE.m8214getDoneeUduSuo(), (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, 115, (java.lang.Object) null);
                            final androidx.compose.ui.focus.FocusManager focusManager = this.getHighSpeedVideoFpsRanges;
                            final androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController = this.getHighResolutionOutputSizeshNQ4ISI;
                            androidx.compose.foundation.text.KeyboardActions keyboardActions = new androidx.compose.foundation.text.KeyboardActions(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00dd: CONSTRUCTOR (r17v0 'keyboardActions' androidx.compose.foundation.text.KeyboardActions) = 
                                  (wrap:kotlin.jvm.functions.Function1:0x00d3: CONSTRUCTOR 
                                  (r1v13 'focusManager' androidx.compose.ui.focus.FocusManager A[DONT_INLINE])
                                  (r3v2 'softwareKeyboardController' androidx.compose.ui.platform.SoftwareKeyboardController A[DONT_INLINE])
                                 A[MD:(androidx.compose.ui.focus.FocusManager, androidx.compose.ui.platform.SoftwareKeyboardController):void (m), WRAPPED] call: com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider$View$2$1$1$1$1$1$1$$ExternalSyntheticLambda0.<init>(androidx.compose.ui.focus.FocusManager, androidx.compose.ui.platform.SoftwareKeyboardController):void type: CONSTRUCTOR)
                                  (null kotlin.jvm.functions.Function1)
                                  (null kotlin.jvm.functions.Function1)
                                  (null kotlin.jvm.functions.Function1)
                                  (null kotlin.jvm.functions.Function1)
                                  (null kotlin.jvm.functions.Function1)
                                  (62 int)
                                  (null kotlin.jvm.internal.DefaultConstructorMarker)
                                 A[DECLARE_VAR, MD:(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:4144) call: androidx.compose.foundation.text.KeyboardActions.<init>(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR in method: com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider$View$2$1$1$1$1$1.1.invoke(androidx.compose.runtime.Composer, java.lang.Integer):kotlin.Unit, file: classes9.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider$View$2$1$1$1$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:782)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 21 more
                                */
                            /*
                                Method dump skipped, instructions count: 345
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider$View$2$1$1$1$1$1.AnonymousClass1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }

                        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.ui.focus.FocusManager focusManager, androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, androidx.compose.foundation.text.KeyboardActionScope keyboardActionScope) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardActionScope, "");
                            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Trying to close keyboard", null, 2, null);
                            androidx.compose.ui.focus.FocusManager.clearFocus$default(focusManager, false, 1, null);
                            if (softwareKeyboardController != null) {
                                softwareKeyboardController.hide();
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "raw input ".concat(java.lang.String.valueOf(str)), null, 2, null);
                            if (str.length() > 0 && str.charAt(0) == '0') {
                                str = str.substring(1);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                            }
                            if (str.length() < 8) {
                                java.lang.String str2 = str;
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                int length = str2.length();
                                for (int i = 0; i < length; i++) {
                                    char charAt = str2.charAt(i);
                                    if (java.lang.Character.isDigit(charAt)) {
                                        sb.append(charAt);
                                    }
                                }
                                mutableState.setValue(sb.toString());
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.runtime.MutableState mutableState) {
                            if (kotlin.text.StringsKt.isBlank(com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider.access$View$lambda$2(mutableState))) {
                                androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        AnonymousClass1(androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.runtime.MutableState<java.lang.String> mutableState, androidx.compose.ui.focus.FocusManager focusManager, androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController) {
                            this.getHighSpeedVideoSizes = focusRequester;
                            this.Camera2StreamConfigurationMap = mutableState;
                            this.getHighSpeedVideoFpsRanges = focusManager;
                            this.getHighResolutionOutputSizeshNQ4ISI = softwareKeyboardController;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num2) {
                        androidx.compose.runtime.Composer composer4 = composer3;
                        if ((num2.intValue() & 11) == 2 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                        } else {
                            androidx.compose.foundation.text.selection.SelectionContainerKt.DisableSelection(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-851222999, true, new com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider$View$2$1$1$1$1$1.AnonymousClass1(androidx.compose.ui.focus.FocusRequester.this, mutableState, focusManager, softwareKeyboardController), composer4, 54), composer4, 6);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }, composer2, 54), composer2, androidx.compose.runtime.ProvidedValue.$stable | 48);
                java.lang.String formattedTextString = new com.ingo.sdk.kotlin.ux.textmachine.AmountInputTextMachine(com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider.access$View$lambda$2(mutableState)).getFormattedTextString();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                for (int i = 0; i < formattedTextString.length(); i++) {
                    char charAt = formattedTextString.charAt(i);
                    if (charAt != '$') {
                        sb.append(charAt);
                    }
                }
                java.lang.String obj = sb.toString();
                androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center2 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(center2, centerVertically, composer2, 54);
                int currentCompositeKeyHash5 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
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
                androidx.compose.runtime.Composer m5299constructorimpl5 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, currentCompositionLocalMap5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5299constructorimpl5.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl5.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash5))) {
                    m5299constructorimpl5.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash5));
                    m5299constructorimpl5.apply(java.lang.Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, materializeModifier5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                composer2.startReplaceGroup(261993501);
                androidx.compose.ui.text.AnnotatedString.Builder builder = new androidx.compose.ui.text.AnnotatedString.Builder(0, 1, null);
                composer2.startReplaceGroup(261994127);
                currentTheme = enterAmountFragmentViewProvider.currentTheme(composer2, com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable);
                int pushStyle = builder.pushStyle(new androidx.compose.ui.text.SpanStyle(androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme.getPrimaryColor())), androidx.compose.ui.unit.TextUnitKt.getSp(40), (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, androidx.compose.ui.text.style.BaselineShift.m8309boximpl(androidx.compose.ui.text.style.BaselineShift.m8310constructorimpl(0.65f)), (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65276, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                try {
                    builder.append(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_currency_symbol_localized, composer2, 0));
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    builder.pop(pushStyle);
                    composer2.endReplaceGroup();
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\.");
                    composer2.startReplaceGroup(262016748);
                    currentTheme2 = enterAmountFragmentViewProvider.currentTheme(composer2, com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable);
                    pushStyle = builder.pushStyle(new androidx.compose.ui.text.SpanStyle(androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme2.getPrimaryColor())), androidx.compose.ui.unit.TextUnitKt.getSp(55), (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, (androidx.compose.ui.text.style.BaselineShift) null, (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65532, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                    try {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(compile);
                        builder.append((java.lang.String) kotlin.collections.CollectionsKt.first(kotlin.text.StringsKt.split$default(obj, compile, 0, 2, null)));
                        builder.append(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_sdk_decimal_delimiter, composer2, 0));
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        builder.pop(pushStyle);
                        composer2.endReplaceGroup();
                        currentTheme3 = enterAmountFragmentViewProvider.currentTheme(composer2, com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable);
                        pushStyle = builder.pushStyle(new androidx.compose.ui.text.SpanStyle(androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme3.getPrimaryColor())), androidx.compose.ui.unit.TextUnitKt.getSp(40), (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontSynthesis) null, (androidx.compose.ui.text.font.FontFamily) null, (java.lang.String) null, 0L, androidx.compose.ui.text.style.BaselineShift.m8309boximpl(androidx.compose.ui.text.style.BaselineShift.m8310constructorimpl(0.65f)), (androidx.compose.ui.text.style.TextGeometricTransform) null, (androidx.compose.ui.text.intl.LocaleList) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.graphics.Shadow) null, (androidx.compose.ui.text.PlatformSpanStyle) null, (androidx.compose.ui.graphics.drawscope.DrawStyle) null, 65276, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                        try {
                            builder.append((java.lang.String) kotlin.text.StringsKt.split$default(obj, compile, 0, 2, null).get(1));
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                            builder.pop(pushStyle);
                            androidx.compose.ui.text.AnnotatedString annotatedString = builder.toAnnotatedString();
                            composer2.endReplaceGroup();
                            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10645PrimaryTextDpqVIHw(androidx.compose.ui.Modifier.INSTANCE, annotatedString, kotlin.collections.MapsKt.emptyMap(), null, 0, null, composer2, 390, 56);
                            composer2.endNode();
                            composer2.endNode();
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer2, 6);
                            androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer2, 6);
                            int currentCompositeKeyHash6 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier6 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default2);
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
                            androidx.compose.runtime.Composer m5299constructorimpl6 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, currentCompositionLocalMap6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash6 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m5299constructorimpl6.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl6.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash6))) {
                                m5299constructorimpl6.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash6));
                                m5299constructorimpl6.apply(java.lang.Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                            }
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, materializeModifier6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_enter_total_check_amount, composer2, 0), com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography().getTitleLarge(), androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk(), null, 0, 0L, 0, composer2, 0, 241);
                            composer2.endNode();
                            composer2.endNode();
                            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.MajorButton(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_next, composer2, 0), new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider$View$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider$View$2.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.platform.SoftwareKeyboardController.this, enterAmountFragmentViewProvider, mutableState);
                                }
                            }, !enterAmountFragmentViewProvider.getProgressShowing().getValue().booleanValue(), false, false, 0, composer2, 0, 56);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer2, 6);
                            com.ingo.sdk.android.ux.viewprovider.IngoSdkComposablesKt.LegalDisclaimer(composer2, 0);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer2, 6);
                            composer2.endNode();
                            composer2.startReplaceGroup(1849434622);
                            java.lang.Object rememberedValue = composer2.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                composer2.updateRememberedValue(rememberedValue);
                            }
                            composer2.endReplaceGroup();
                            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(enterAmountFragmentViewProvider.getProgressShowing().getValue().booleanValue(), (androidx.compose.ui.Modifier) null, (androidx.compose.animation.EnterTransition) null, (androidx.compose.animation.ExitTransition) null, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2128630924, true, new com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider$View$2$1$2(enterAmountFragmentViewProvider, (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue), composer2, 54), composer2, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                            composer2.startReplaceGroup(-1066443749);
                            if (enterAmountFragmentViewProvider.getFailure().getValue() != null) {
                                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "FAILURE NOT NULL ".concat(java.lang.String.valueOf(enterAmountFragmentViewProvider.getFailure().getValue())), null, 2, null);
                                com.ingo.sdk.kotlin.common.core.exception.Failure value = enterAmountFragmentViewProvider.getFailure().getValue();
                                java.lang.String camera2StreamConfigurationMap = value != null ? value.getCamera2StreamConfigurationMap() : null;
                                composer2.startReplaceGroup(-1066439071);
                                java.lang.String stringResource = camera2StreamConfigurationMap == null ? androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_unknown_failure_title, composer2, 0) : camera2StreamConfigurationMap;
                                composer2.endReplaceGroup();
                                com.ingo.sdk.kotlin.common.core.exception.Failure value2 = enterAmountFragmentViewProvider.getFailure().getValue();
                                java.lang.String getHighSpeedVideoFpsRangesFor = value2 != null ? value2.getGetHighSpeedVideoFpsRangesFor() : null;
                                composer2.startReplaceGroup(-1066434136);
                                java.lang.String stringResource2 = getHighSpeedVideoFpsRangesFor == null ? androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_unknown_failure_description, composer2, 0) : getHighSpeedVideoFpsRangesFor;
                                composer2.endReplaceGroup();
                                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.IngoAlertDialog(null, stringResource, stringResource2, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_dismiss, composer2, 0), new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider$View$2$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider$View$2.getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider.this, softwareKeyboardController);
                                    }
                                }, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_retry, composer2, 0), enterAmountFragmentViewProvider.getRetryAction().getValue(), composer2, 0, 1);
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
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

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider enterAmountFragmentViewProvider, androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController) {
            kotlin.jvm.functions.Function0<kotlin.Unit> value = enterAmountFragmentViewProvider.getFailureAction().getValue();
            if (value != null) {
                value.invoke();
            } else {
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Dismiss Action Clicked But Empty", null, 2, null);
            }
            if (softwareKeyboardController != null) {
                softwareKeyboardController.show();
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider enterAmountFragmentViewProvider, androidx.compose.runtime.MutableState mutableState) {
            if (!kotlin.text.StringsKt.isBlank(com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider.access$View$lambda$2(mutableState))) {
                if (softwareKeyboardController != null) {
                    softwareKeyboardController.hide();
                }
                enterAmountFragmentViewProvider.getNextClicked().invoke(java.lang.Long.valueOf(java.lang.Long.parseLong(com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider.access$View$lambda$2(mutableState))));
            }
            return kotlin.Unit.INSTANCE;
        }

        EnterAmountFragmentViewProvider$View$2(com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider enterAmountFragmentViewProvider, androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.runtime.MutableState<java.lang.String> mutableState, androidx.compose.ui.focus.FocusManager focusManager, androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController) {
            this.getHighSpeedVideoFpsRangesFor = enterAmountFragmentViewProvider;
            this.getHighSpeedVideoSizes = focusRequester;
            this.getHighSpeedVideoFpsRanges = mutableState;
            this.Camera2StreamConfigurationMap = focusManager;
            this.getHighResolutionOutputSizeshNQ4ISI = softwareKeyboardController;
        }
    }
