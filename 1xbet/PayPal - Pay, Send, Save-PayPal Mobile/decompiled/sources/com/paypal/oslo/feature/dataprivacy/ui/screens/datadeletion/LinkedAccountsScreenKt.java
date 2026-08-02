package com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u008b\u0001\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f28\b\u0002\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012H\u0001¢\u0006\u0002\u0010\u0017\u001aa\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0006\u001a\u00020\u000728\b\u0002\u0010\u001c\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00010\u0012H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010!¨\u0006\""}, d2 = {"LinkedAccountsScreen", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "linkedAccountNames", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LinkedAccountsScreenContent", "onBackClick", "Lkotlin/Function0;", "onContinueClick", "onNotNowClick", "linkedAccounts", "", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/LinkedAccount;", "onLinkClick", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "url", "title", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "LinkedServiceItem", "serviceName", "descriptionRichText", "Lcom/paypal/pds/core/RichText;", "onDescriptionLinkClick", "text", "tag", "(Ljava/lang/String;Lcom/paypal/pds/core/RichText;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "LinkedAccountsScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "data-privacy_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LinkedAccountsScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkedAccountsScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1911081632);
        int i3 = (i & 6) == 0 ? (startRestartGroup.changed(appNavigator) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1911081632, i3, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreen (LinkedAccountsScreen.kt:63)");
                }
                java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(split$default, 10));
                java.util.Iterator it = split$default.iterator();
                while (it.hasNext()) {
                    arrayList.add(kotlin.text.StringsKt.trim((java.lang.String) it.next()).toString());
                }
                java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : arrayList) {
                    if (!kotlin.text.StringsKt.isBlank((java.lang.String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.String str2 : arrayList2) {
                    java.util.Iterator<E> it2 = com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount.getEntries().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (kotlin.text.StringsKt.equals(((com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount) obj).name(), str2, true)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount linkedAccount = (com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount) obj;
                    if (linkedAccount != null) {
                        arrayList3.add(linkedAccount);
                    }
                }
                java.util.ArrayList arrayList4 = arrayList3;
                int i5 = i3 & 14;
                boolean z = i5 == 4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt.m14154$r8$lambda$zPjjAGQSaNqFzwHIClQmHO0npo(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                boolean z2 = i5 == 4;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt.$r8$lambda$UkZpFVJAGEgJwhsSaOCObKUy1kY(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
                boolean z3 = i5 == 4;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt.$r8$lambda$YRmtMr48pHLHYtbz5B0ymmkoijM(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
                boolean z4 = i5 == 4;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (z4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt.$r8$lambda$Bo25PghMwSx8x7eMSnH_VDEYmFA(com.paypal.oslo.core.navigation.AppNavigator.this, (java.lang.String) obj3, (java.lang.String) obj4);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                LinkedAccountsScreenContent(function0, function02, function03, modifier3, arrayList4, (kotlin.jvm.functions.Function2) rememberedValue4, startRestartGroup, (i3 << 3) & 7168, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt.$r8$lambda$YQ_fV5AYVZXNi0cRWxTSReDCbZU(com.paypal.oslo.core.navigation.AppNavigator.this, str, modifier4, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x042b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkedAccountsScreenContent(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.ui.Modifier modifier, java.util.List<? extends com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount> list, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.util.List<? extends com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount> list2;
        int i5;
        int i6;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function22;
        final androidx.compose.ui.Modifier modifier3;
        final java.util.List<? extends com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount> list3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function23;
        java.util.List<? extends com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount> list4;
        final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function24;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function25;
        java.util.List<? extends com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount> list5;
        float f;
        boolean z;
        int i7;
        boolean z2;
        int i8;
        boolean z3;
        boolean changed;
        java.lang.Object rememberedValue;
        final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function26;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function27;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1932168050);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                list2 = list;
                i3 |= startRestartGroup.changedInstance(list2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
                    i6 = i3;
                    if (startRestartGroup.shouldExecute((74899 & i6) == 74898, i6 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        function22 = function2;
                        modifier3 = modifier2;
                        list3 = list2;
                    } else {
                        androidx.compose.ui.Modifier modifier4 = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            list2 = kotlin.collections.CollectionsKt.emptyList();
                        }
                        if (i5 != 0) {
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda16
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt.m14153$r8$lambda$z6wi4wjSEP92q7ndUi5IAUctgs((java.lang.String) obj, (java.lang.String) obj2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            function23 = (kotlin.jvm.functions.Function2) rememberedValue2;
                        } else {
                            function23 = function2;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1932168050, i6, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenContent (LinkedAccountsScreen.kt:106)");
                        }
                        boolean isEmpty = list2.isEmpty();
                        java.util.List<? extends com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount> list6 = list2;
                        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function28 = function23;
                        androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
                        androidx.compose.ui.Modifier modifier5 = modifier4;
                        com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_security_privacy_title, startRestartGroup, 0), null, null, com.paypal.oslo.core.commonui.components.TopBarTitleAlignment.Center, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(545813496, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt.$r8$lambda$xjyI2bKtEhV0_i2Hfq3JYArH7nc(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), null, startRestartGroup, 199680, 86);
                        androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor2);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_services_impact_heading, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing32(), 7, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingLarge.INSTANCE, startRestartGroup, 384, 6, 1016);
                        if (isEmpty) {
                            list4 = list6;
                        } else {
                            list4 = list6;
                            if (!list4.contains(com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount.XOOM)) {
                                startRestartGroup.startReplaceGroup(1064560740);
                                startRestartGroup.endReplaceGroup();
                                z = true;
                                list5 = list4;
                                f = 0.0f;
                                function25 = function28;
                                if (!isEmpty || list5.contains(com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount.HONEY)) {
                                    startRestartGroup.startReplaceGroup(1064680307);
                                    if (z) {
                                        startRestartGroup.startReplaceGroup(1064702658);
                                        i7 = 0;
                                        com.paypal.pds.components.DividerKt.Divider(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null), startRestartGroup, 0, 0);
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        i7 = 0;
                                        startRestartGroup.startReplaceGroup(1064796836);
                                        startRestartGroup.endReplaceGroup();
                                    }
                                    Camera2StreamConfigurationMap(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_services_honey_name, startRestartGroup, i7), com.paypal.pds.core.RichTextKt.toRichText$default(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_services_honey_description, startRestartGroup, i7), null, false, null, 7, null), null, null, startRestartGroup, 0, 12);
                                    startRestartGroup.endReplaceGroup();
                                    z2 = false;
                                } else {
                                    startRestartGroup.startReplaceGroup(1065188676);
                                    startRestartGroup.endReplaceGroup();
                                    z2 = z;
                                }
                                if (!isEmpty || list5.contains(com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount.ZETTLE)) {
                                    startRestartGroup.startReplaceGroup(1065331803);
                                    if (z2) {
                                        startRestartGroup.startReplaceGroup(1065332578);
                                        i8 = 0;
                                        com.paypal.pds.components.DividerKt.Divider(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 1, null), startRestartGroup, 0, 0);
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        i8 = 0;
                                        startRestartGroup.startReplaceGroup(1065426756);
                                        startRestartGroup.endReplaceGroup();
                                    }
                                    final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_services_zettle_name, startRestartGroup, i8);
                                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_services_zettle_uk_link, startRestartGroup, i8);
                                    java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_services_zettle_us_link, startRestartGroup, i8);
                                    java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_services_zettle_description, new java.lang.Object[]{stringResource2, stringResource3}, startRestartGroup, i8);
                                    kotlin.Pair pair = kotlin.TuplesKt.to(stringResource2, com.paypal.oslo.feature.dataprivacy.shared.constants.DataPrivacyConstants.ZETTLE_UK_PRIVACY_URL);
                                    kotlin.Pair pair2 = kotlin.TuplesKt.to(stringResource3, com.paypal.oslo.feature.dataprivacy.shared.constants.DataPrivacyConstants.ZETTLE_US_PRIVACY_URL);
                                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                                    pairArr[i8] = pair;
                                    pairArr[1] = pair2;
                                    com.paypal.pds.core.RichText richText = com.paypal.pds.core.RichTextKt.toRichText(stringResource4, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) pairArr));
                                    z3 = (i6 & 458752) != 131072;
                                    changed = startRestartGroup.changed(stringResource);
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if ((!z3 && !changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        function26 = function25;
                                        rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda19
                                            @Override // kotlin.jvm.functions.Function2
                                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                                return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt.m14149$r8$lambda$SorKdNqUsZjX5QNJ4Vx1yHk1c(kotlin.jvm.functions.Function2.this, stringResource, (java.lang.String) obj, (java.lang.String) obj2);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    } else {
                                        function26 = function25;
                                    }
                                    function27 = function26;
                                    Camera2StreamConfigurationMap(stringResource, richText, null, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, 0, 4);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(1066509028);
                                    startRestartGroup.endReplaceGroup();
                                    function27 = function25;
                                }
                                startRestartGroup.endNode();
                                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor3);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                java.util.List<? extends com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount> list7 = list5;
                                composer2 = startRestartGroup;
                                com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_continue_button, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, ((i6 >> 3) & 14) | 1769856, 408);
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
                                com.paypal.pds.components.ButtonKt.Button(function03, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_services_not_now_button, composer2, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer2, ((i6 >> 6) & 14) | 1769856, 408);
                                composer2.endNode();
                                composer2.endNode();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                function22 = function27;
                                list3 = list7;
                                modifier3 = modifier5;
                            }
                        }
                        startRestartGroup.startReplaceGroup(1063580520);
                        startRestartGroup.startReplaceGroup(1063681828);
                        startRestartGroup.endReplaceGroup();
                        final java.lang.String stringResource5 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_services_xoom_name, startRestartGroup, 0);
                        com.paypal.pds.core.RichText richText2 = com.paypal.pds.core.RichTextKt.toRichText(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_services_xoom_description, new java.lang.Object[]{androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_services_xoom_link, startRestartGroup, 0)}, startRestartGroup, 0), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_services_xoom_link, startRestartGroup, 0), com.paypal.oslo.feature.dataprivacy.shared.constants.DataPrivacyConstants.XOOM_CONTACT_URL)));
                        boolean z4 = (i6 & 458752) == 131072;
                        boolean changed2 = startRestartGroup.changed(stringResource5);
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if ((z4 || changed2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            function24 = function28;
                            rememberedValue3 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda18
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt.$r8$lambda$fOzcFLHrvH67cGP8tOYuFtSnfAM(kotlin.jvm.functions.Function2.this, stringResource5, (java.lang.String) obj, (java.lang.String) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        } else {
                            function24 = function28;
                        }
                        function25 = function24;
                        list5 = list4;
                        f = 0.0f;
                        Camera2StreamConfigurationMap(stringResource5, richText2, null, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, 0, 4);
                        startRestartGroup.endReplaceGroup();
                        z = false;
                        if (!isEmpty) {
                        }
                        startRestartGroup.startReplaceGroup(1064680307);
                        if (z) {
                        }
                        Camera2StreamConfigurationMap(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_services_honey_name, startRestartGroup, i7), com.paypal.pds.core.RichTextKt.toRichText$default(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_services_honey_description, startRestartGroup, i7), null, false, null, 7, null), null, null, startRestartGroup, 0, 12);
                        startRestartGroup.endReplaceGroup();
                        z2 = false;
                        if (!isEmpty) {
                        }
                        startRestartGroup.startReplaceGroup(1065331803);
                        if (z2) {
                        }
                        final java.lang.String stringResource6 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_services_zettle_name, startRestartGroup, i8);
                        java.lang.String stringResource22 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_services_zettle_uk_link, startRestartGroup, i8);
                        java.lang.String stringResource32 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_services_zettle_us_link, startRestartGroup, i8);
                        java.lang.String stringResource42 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_services_zettle_description, new java.lang.Object[]{stringResource22, stringResource32}, startRestartGroup, i8);
                        kotlin.Pair pair3 = kotlin.TuplesKt.to(stringResource22, com.paypal.oslo.feature.dataprivacy.shared.constants.DataPrivacyConstants.ZETTLE_UK_PRIVACY_URL);
                        kotlin.Pair pair22 = kotlin.TuplesKt.to(stringResource32, com.paypal.oslo.feature.dataprivacy.shared.constants.DataPrivacyConstants.ZETTLE_US_PRIVACY_URL);
                        kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                        pairArr2[i8] = pair3;
                        pairArr2[1] = pair22;
                        com.paypal.pds.core.RichText richText3 = com.paypal.pds.core.RichTextKt.toRichText(stringResource42, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) pairArr2));
                        if ((i6 & 458752) != 131072) {
                        }
                        changed = startRestartGroup.changed(stringResource6);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!(z3 | changed)) {
                        }
                        function26 = function25;
                        rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda19
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt.m14149$r8$lambda$SorKdNqUsZjX5QNJ4Vx1yHk1c(kotlin.jvm.functions.Function2.this, stringResource6, (java.lang.String) obj, (java.lang.String) obj2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        function27 = function26;
                        Camera2StreamConfigurationMap(stringResource6, richText3, null, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, 0, 4);
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.endNode();
                        androidx.compose.ui.Modifier m1706padding3ABfNKs2 = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy32 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode32 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier32 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs2);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor32 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl32 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl32, columnMeasurePolicy32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl32, currentCompositionLocalMap32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl32, java.lang.Integer.valueOf(hashCode32), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl32, materializeModifier32, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance32 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        java.util.List<? extends com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount> list72 = list5;
                        composer2 = startRestartGroup;
                        com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_continue_button, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, ((i6 >> 3) & 14) | 1769856, 408);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
                        com.paypal.pds.components.ButtonKt.Button(function03, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_services_not_now_button, composer2, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer2, ((i6 >> 6) & 14) | 1769856, 408);
                        composer2.endNode();
                        composer2.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        function22 = function27;
                        list3 = list72;
                        modifier3 = modifier5;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt.m14150$r8$lambda$i2oLlpa9yYkRMbIdrtb6O553OI(kotlin.jvm.functions.Function0.this, function02, function03, modifier3, list3, function22, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i6 = i3;
                if (startRestartGroup.shouldExecute((74899 & i6) == 74898, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            list2 = list;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i3;
            if (startRestartGroup.shouldExecute((74899 & i6) == 74898, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        list2 = list;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i3;
        if (startRestartGroup.shouldExecute((74899 & i6) == 74898, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Camera2StreamConfigurationMap(final java.lang.String str, final com.paypal.pds.core.RichText richText, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function22;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function23;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1838810135);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(richText) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function22 = function2;
                i3 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt.$r8$lambda$SOeXqfim6jPbLLvpWibl8NjXSRA((java.lang.String) obj, (java.lang.String) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function23 = (kotlin.jvm.functions.Function2) rememberedValue;
                    } else {
                        function23 = function22;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1838810135, i3, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedServiceItem (LinkedAccountsScreen.kt:239)");
                    }
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                    androidx.compose.ui.Modifier modifier5 = modifier4;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, (i3 & 14) | 384, 6, 1016);
                    com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, function23, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, null, startRestartGroup, ((i3 >> 3) & 14) | 384, ((i3 >> 9) & 14) | 48, 5114);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function22 = function23;
                    modifier3 = modifier5;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function24 = function22;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt.$r8$lambda$bC5U7DyibpVuoptVTG5aj8UmWTg(str, richText, modifier3, function24, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function22 = function2;
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function22 = function2;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$39rCMAeZSLNUvylEtlYezHlFWlM(java.lang.String str, java.lang.String str2, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.dataprivacy.api.navigation.DataPrivacyWebViewDestination(str, str2));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Bo25PghMwSx8x7eMSnH_VDEYmFA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt.$r8$lambda$39rCMAeZSLNUvylEtlYezHlFWlM(str, str2, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$GcySfx1-rSgJD8V9prnjpk5vadk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14148$r8$lambda$GcySfx1rSgJD8V9prnjpk5vadk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1406838962);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1406838962, updateChangedFlags, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenPreview (LinkedAccountsScreen.kt:260)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda2
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            LinkedAccountsScreenContent(function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, null, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount[]{com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount.XOOM, com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount.HONEY, com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount.ZETTLE}), null, startRestartGroup, 25014, 40);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt.m14148$r8$lambda$GcySfx1rSgJD8V9prnjpk5vadk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SOeXqfim6jPbLLvpWibl8NjXSRA(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SorKdNqUsZ-jX5-QNJ4Vx1yHk1c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14149$r8$lambda$SorKdNqUsZjX5QNJ4Vx1yHk1c(kotlin.jvm.functions.Function2 function2, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        function2.invoke(str3, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TUpYbTvAoufaKryCZidlSA6MqhM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(com.paypal.oslo.feature.dataprivacy.api.navigation.EmailConfirmationDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UkZpFVJAGEgJwhsSaOCObKUy1kY(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt.$r8$lambda$TUpYbTvAoufaKryCZidlSA6MqhM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YQ_fV5AYVZXNi0cRWxTSReDCbZU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LinkedAccountsScreen(appNavigator, str, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YRmtMr48pHLHYtbz5B0ymmkoijM(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt.m14151$r8$lambda$kHzAeIBRTp9a50clv_Arlh8Xo((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bC5U7DyibpVuoptVTG5aj8UmWTg(java.lang.String str, com.paypal.pds.core.RichText richText, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Camera2StreamConfigurationMap(str, richText, modifier, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fOzcFLHrvH67cGP8tOYuFtSnfAM(kotlin.jvm.functions.Function2 function2, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        function2.invoke(str3, str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$i2oLlpa9yY-kRMbIdrtb6O553OI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14150$r8$lambda$i2oLlpa9yYkRMbIdrtb6O553OI(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, androidx.compose.ui.Modifier modifier, java.util.List list, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LinkedAccountsScreenContent(function0, function02, function03, modifier, list, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kHzAeI-BR-Tp9a50clv_Arlh8Xo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14151$r8$lambda$kHzAeIBRTp9a50clv_Arlh8Xo(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oI5OHvEgmfYYKizFA_dQ1qlb-8U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14152$r8$lambda$oI5OHvEgmfYYKizFA_dQ1qlb8U(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xjyI2bKtEhV0_i2Hfq3JYArH7nc(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(545813496, i, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenContent.<anonymous>.<anonymous> (LinkedAccountsScreen.kt:119)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton(function0, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$z6wi4wjSEP92q7ndUi5I-AUctgs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14153$r8$lambda$z6wi4wjSEP92q7ndUi5IAUctgs(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zPjjAGQSaNqFzwHIC-lQmHO0npo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14154$r8$lambda$zPjjAGQSaNqFzwHIClQmHO0npo(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.LinkedAccountsScreenKt.m14152$r8$lambda$oI5OHvEgmfYYKizFA_dQ1qlb8U((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
