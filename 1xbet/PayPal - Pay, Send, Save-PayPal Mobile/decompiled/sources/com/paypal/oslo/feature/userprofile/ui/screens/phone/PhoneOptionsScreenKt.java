package com.paypal.oslo.feature.userprofile.ui.screens.phone;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"PhoneOptionsScreen", "", "phoneId", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "userStore", "Lcom/paypal/oslo/core/userstore/UserStore;", "(Ljava/lang/String;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/core/userstore/UserStore;Landroidx/compose/runtime/Composer;I)V", "user-profile_prodRelease", "userState", "Lcom/paypal/oslo/core/userstore/model/UserState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PhoneOptionsScreenKt {
    public static final void PhoneOptionsScreen(final java.lang.String str, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.core.userstore.UserStore userStore, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-380900885);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(userStore) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-380900885, i2, -1, "com.paypal.oslo.feature.userprofile.ui.screens.phone.PhoneOptionsScreen (PhoneOptionsScreen.kt:48)");
            }
            com.paypal.oslo.core.userstore.model.UserState userState = (com.paypal.oslo.core.userstore.model.UserState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(userStore.getUserState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
            if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
                startRestartGroup.startReplaceGroup(-114385692);
                java.util.List<com.paypal.oslo.core.userstore.model.ProfilePhone> profilePhones = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState).getUser().getProfilePhones();
                if (profilePhones == null) {
                    profilePhones = kotlin.collections.CollectionsKt.emptyList();
                }
                java.util.Iterator<T> it = profilePhones.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.core.userstore.model.ProfilePhone) obj).getId(), str)) {
                            break;
                        }
                    }
                }
                com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone = (com.paypal.oslo.core.userstore.model.ProfilePhone) obj;
                if (profilePhone == null) {
                    startRestartGroup.startReplaceGroup(-114253385);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                } else {
                    startRestartGroup.startReplaceGroup(-114253384);
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
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
                    androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                    com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListItemKt.ProfileStatusBadge(profilePhone.getPrimary(), profilePhone.getConfirmed(), (profilePhone.getType() == com.paypal.oslo.core.userstore.model.PhoneType.WORK || profilePhone.getType() == com.paypal.oslo.core.userstore.model.PhoneType.HOME) ? false : true, com.paypal.pds.components.BadgeSize.Medium.INSTANCE, startRestartGroup, 3072, 0);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(profilePhone.getMaskedPhoneNumber(), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelLarge.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                    startRestartGroup.endNode();
                    composer2 = startRestartGroup;
                    com.paypal.oslo.feature.userprofile.ui.components.common.CommonOptionsBottomSheetKt.CommonOptionsContent(com.paypal.oslo.feature.userprofile.ui.utils.PhoneUtilsKt.preparePhoneOptions((android.content.Context) composer2.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()), profilePhone, appNavigator, profilePhones), null, composer2, 0, 2);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
            } else {
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(-113210761);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.PhoneOptionsScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.phone.PhoneOptionsScreenKt.$r8$lambda$ih3Rlp_s9mTe9aDI9NwUYBSnUGE(str, appNavigator, userStore, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ih3Rlp_s9mTe9aDI9NwUYBSnUGE(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.userstore.UserStore userStore, int i, androidx.compose.runtime.Composer composer, int i2) {
        PhoneOptionsScreen(str, appNavigator, userStore, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
