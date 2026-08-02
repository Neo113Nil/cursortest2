package com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui;

@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u001a\u0010\u0004\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u00052 \u0010\t\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\n2\u001a\u0010\u000b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001aM\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0018\u001a\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0003¢\u0006\u0002\u0010\u001c\u001a\u0016\u0010\u001d\u001a\u00020\u000f*\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\bH\u0000¨\u0006\u001f"}, d2 = {"I18nNameForm", "", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "Lcom/paypal/oslo/core/i18n/domain/model/NameLayout;", "fieldValues", "", "Lkotlin/reflect/KClass;", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "", "onFieldChange", "Lkotlin/Function2;", "fieldErrors", "readOnly", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/core/i18n/domain/model/NameLayout;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Ljava/util/Map;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "I18nNameField", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "Lcom/paypal/oslo/core/i18n/domain/model/NameLayout$NameComponent;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "onValueChange", "Lkotlin/Function1;", "error", "(Lcom/paypal/oslo/core/i18n/domain/model/NameLayout$NameComponent;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "rememberNameFieldAlerts", "", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "testTagIfNotNull", "tag", "one-onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class I18nNameFormKt {
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void I18nNameForm(final com.paypal.oslo.core.i18n.domain.model.NameLayout nameLayout, final java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, java.lang.String> map, final kotlin.jvm.functions.Function2<? super kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, ? super java.lang.String, kotlin.Unit> function2, final java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, java.lang.String> map2, final boolean z, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, java.lang.String> map3 = map;
        final kotlin.jvm.functions.Function2<? super kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, ? super java.lang.String, kotlin.Unit> function22 = function2;
        java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.core.i18n.domain.model.Field>, java.lang.String> map4 = map2;
        java.lang.String str = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameLayout, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function22, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map4, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1810160197);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(nameLayout) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(map3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(map4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            i3 = i4;
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1810160197, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.I18nNameForm (I18nNameForm.kt:52)");
                }
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
                java.util.List<com.paypal.oslo.core.i18n.domain.model.NameLayout.NameRow> nameRow = nameLayout.getNameRow();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(nameRow, 10));
                java.util.Iterator<T> it = nameRow.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.paypal.oslo.core.i18n.domain.model.NameLayout.NameRow) it.next()).getNameComponent());
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : arrayList) {
                    if (!((java.util.List) obj).isEmpty()) {
                        arrayList2.add(obj);
                    }
                }
                java.util.ArrayList arrayList3 = arrayList2;
                startRestartGroup.startReplaceGroup(-1902320872);
                int i6 = 0;
                for (java.lang.Object obj2 : arrayList3) {
                    if (i6 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    java.util.List list = (java.util.List) obj2;
                    startRestartGroup.startReplaceGroup(-1902319116);
                    int i7 = 0;
                    for (java.lang.Object obj3 : list) {
                        if (i7 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        com.paypal.oslo.core.i18n.domain.model.NameLayout.NameComponent nameComponent = (com.paypal.oslo.core.i18n.domain.model.NameLayout.NameComponent) obj3;
                        final kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(nameComponent.getNameField().getClass());
                        java.lang.String str2 = map3.get(orCreateKotlinClass);
                        if (str2 == null) {
                            str2 = str;
                        }
                        java.lang.String str3 = str;
                        boolean z2 = (i3 & 896) == 256;
                        boolean changedInstance = startRestartGroup.changedInstance(orCreateKotlinClass);
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if ((z2 | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.I18nNameFormKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj4) {
                                    return com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.I18nNameFormKt.$r8$lambda$Bkh67pudeQAFVdfdJWyugrhTlH8(kotlin.jvm.functions.Function2.this, orCreateKotlinClass, (java.lang.String) obj4);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.ui.Modifier modifier4 = modifier3;
                        int i8 = i7;
                        int i9 = i3;
                        int i10 = i6;
                        getHighSpeedVideoSizes(nameComponent, str2, (kotlin.jvm.functions.Function1) rememberedValue, map4.get(orCreateKotlinClass), z, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, (57344 & i3) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
                        if (i8 < list.size() - 1) {
                            startRestartGroup.startReplaceGroup(2033483222);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(2033564907);
                            startRestartGroup.endReplaceGroup();
                        }
                        i7 = i8 + 1;
                        function22 = function2;
                        map4 = map2;
                        modifier3 = modifier4;
                        i6 = i10;
                        i3 = i9;
                        str = str3;
                        map3 = map;
                    }
                    java.lang.String str4 = str;
                    androidx.compose.ui.Modifier modifier5 = modifier3;
                    int i11 = i3;
                    int i12 = i6;
                    startRestartGroup.endReplaceGroup();
                    if (i12 < kotlin.collections.CollectionsKt.getLastIndex(arrayList3)) {
                        startRestartGroup.startReplaceGroup(46906121);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(46980118);
                        startRestartGroup.endReplaceGroup();
                    }
                    i6 = i12 + 1;
                    map3 = map;
                    function22 = function2;
                    map4 = map2;
                    modifier3 = modifier5;
                    i3 = i11;
                    str = str4;
                }
                androidx.compose.ui.Modifier modifier6 = modifier3;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier6;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier7 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.I18nNameFormKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.I18nNameFormKt.m17045$r8$lambda$mFzz56zwDQYPUDmI0GQwky8fIQ(com.paypal.oslo.core.i18n.domain.model.NameLayout.this, map, function2, map2, z, modifier7, i, i2, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i3 = i4;
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.core.i18n.domain.model.NameLayout.NameComponent nameComponent, final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final java.lang.String str2, final boolean z, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-926121813);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(nameComponent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(z) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                if (i4 != 0) {
                    modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-926121813, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.I18nNameField (I18nNameForm.kt:92)");
                }
                java.util.List<com.paypal.pds.components.textinput.ValidationAlert> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(str2, startRestartGroup, (i3 >> 9) & 14);
                java.lang.String testTagForNameField = com.paypal.oslo.feature.oneonboarding.api.testtags.PreOnboardingTestTags.PersonalInfo.INSTANCE.testTagForNameField(nameComponent.getNameField());
                androidx.compose.ui.Modifier modifier3 = modifier2;
                com.paypal.pds.components.TextInputKt.TextInput(str, function1, testTagIfNotNull(modifier2, testTagForNameField), nameComponent.getLabel(), (java.lang.String) null, (java.lang.String) null, false, z, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, true, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) Camera2StreamConfigurationMap, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, ((i3 >> 3) & 126) | ((i3 << 9) & 29360128), 48, 112496);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.I18nNameFormKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.I18nNameFormKt.$r8$lambda$BSOTw0pljSzMx5yKgANf3VqhOiY(com.paypal.oslo.core.i18n.domain.model.NameLayout.NameComponent.this, str, function1, str2, z, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final java.util.List<com.paypal.pds.components.textinput.ValidationAlert> Camera2StreamConfigurationMap(final java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(-552951848);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-552951848, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.rememberNameFieldAlerts (I18nNameForm.kt:112)");
        }
        if (str == null) {
            java.util.List<com.paypal.pds.components.textinput.ValidationAlert> emptyList = kotlin.collections.CollectionsKt.emptyList();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return emptyList;
        }
        com.paypal.pds.components.textinput.ValidationAlert.Companion companion = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(str)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.I18nNameFormKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.I18nNameFormKt.$r8$lambda$y67THxFyLnAmmxIKavouM1i0TSM(str, (java.lang.String) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        java.util.List<com.paypal.pds.components.textinput.ValidationAlert> listOf = kotlin.collections.CollectionsKt.listOf(companion.invoke((kotlin.jvm.functions.Function1) rememberedValue));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return listOf;
    }

    public static final androidx.compose.ui.Modifier testTagIfNotNull(androidx.compose.ui.Modifier modifier, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        return str != null ? androidx.compose.ui.platform.TestTagKt.testTag(modifier, str) : modifier;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BSOTw0pljSzMx5yKgANf3VqhOiY(com.paypal.oslo.core.i18n.domain.model.NameLayout.NameComponent nameComponent, java.lang.String str, kotlin.jvm.functions.Function1 function1, java.lang.String str2, boolean z, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(nameComponent, str, function1, str2, z, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Bkh67pudeQAFVdfdJWyugrhTlH8(kotlin.jvm.functions.Function2 function2, kotlin.reflect.KClass kClass, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function2.invoke(kClass, str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$m-Fzz56zwDQYPUDmI0GQwky8fIQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17045$r8$lambda$mFzz56zwDQYPUDmI0GQwky8fIQ(com.paypal.oslo.core.i18n.domain.model.NameLayout nameLayout, java.util.Map map, kotlin.jvm.functions.Function2 function2, java.util.Map map2, boolean z, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        I18nNameForm(nameLayout, map, function2, map2, z, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$y67THxFyLnAmmxIKavouM1i0TSM(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
    }
}
