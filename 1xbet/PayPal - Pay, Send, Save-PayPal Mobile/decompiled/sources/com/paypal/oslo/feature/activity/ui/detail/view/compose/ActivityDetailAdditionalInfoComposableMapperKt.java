package com.paypal.oslo.feature.activity.ui.detail.view.compose;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a!\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"TransactionDetailAdditionalInfosCompose", "", "activityDetailAdditionalInfoViewModel", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailAdditionalInfoModel;", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailAdditionalInfoModel;Landroidx/compose/runtime/Composer;I)V", "ActivityTransactionDetailAdditionalInfoCompose", "additionalInfoItem", "Lcom/paypal/oslo/feature/activity/domain/detail/models/AdditionalInfoItemModel;", "viewModel", "Lcom/paypal/oslo/feature/activity/ui/detail/model/ActivityTransactionDetailViewModel;", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/AdditionalInfoItemModel;Lcom/paypal/oslo/feature/activity/ui/detail/model/ActivityTransactionDetailViewModel;Landroidx/compose/runtime/Composer;II)V", "activity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDetailAdditionalInfoComposableMapperKt {
    public static final void TransactionDetailAdditionalInfosCompose(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailAdditionalInfoModel activityDetailAdditionalInfoModel, androidx.compose.runtime.Composer composer, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailAdditionalInfoModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1781444996);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changedInstance(activityDetailAdditionalInfoModel) ? 4 : 2) | i : i;
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1781444996, i2, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.TransactionDetailAdditionalInfosCompose (ActivityDetailAdditionalInfoComposableMapper.kt:69)");
            }
            for (final com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel additionalInfoItemModel : activityDetailAdditionalInfoModel.getAdditionalInfoItems()) {
                com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailComposeKt.WrapWithCard(false, false, false, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(878622010, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAdditionalInfoComposableMapperKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAdditionalInfoComposableMapperKt.m11819$r8$lambda$RgaLkbzqelGCxJaXyPBsM8kORE(com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, 12582912, 127);
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAdditionalInfoComposableMapperKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAdditionalInfoComposableMapperKt.m11821$r8$lambda$bevmLWjlfB9Ch7j3L6YJvFnYxk(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailAdditionalInfoModel.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if ((r21 & 2) != 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActivityTransactionDetailAdditionalInfoCompose(final com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel additionalInfoItemModel, com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel2;
        final com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel3;
        com.paypal.pds.components.BannerTrailingElement bannerTrailingElement;
        kotlin.jvm.functions.Function0 function0;
        java.lang.String webPath;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalInfoItemModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1886114119);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(additionalInfoItemModel) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                activityTransactionDetailViewModel2 = activityTransactionDetailViewModel;
                if (startRestartGroup.changedInstance(activityTransactionDetailViewModel2)) {
                    i3 = 32;
                    i4 |= i3;
                }
            } else {
                activityTransactionDetailViewModel2 = activityTransactionDetailViewModel;
            }
            i3 = 16;
            i4 |= i3;
        } else {
            activityTransactionDetailViewModel2 = activityTransactionDetailViewModel;
        }
        if (startRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    activityTransactionDetailViewModel2 = (com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel) startRestartGroup.consume(com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailComposeKt.getLocalActivityTransactionDetailViewModel());
                    i4 &= -113;
                }
                final com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel4 = activityTransactionDetailViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1886114119, i4, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailAdditionalInfoCompose (ActivityDetailAdditionalInfoComposableMapper.kt:86)");
                }
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.wrapContentWidth$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), null, false, 3, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 48);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                final com.paypal.oslo.feature.activity.domain.detail.models.ActivityInsightAction action = additionalInfoItemModel.getAction();
                boolean z = (additionalInfoItemModel.getLinkTextResId() == null || (webPath = additionalInfoItemModel.getWebPath()) == null || webPath.length() == 0) ? false : true;
                java.lang.String resolveString = com.paypal.oslo.feature.activity.ui.detail.model.extensions.StringResourceExtensionsKt.resolveString(additionalInfoItemModel.getLinkTextResId(), new java.lang.Object[0], startRestartGroup, 0);
                java.util.List<java.lang.String> subMessages = additionalInfoItemModel.getSubMessages();
                boolean z2 = subMessages == null || subMessages.isEmpty();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(additionalInfoItemModel.getDescriptionText());
                java.util.List<java.lang.String> subMessages2 = additionalInfoItemModel.getSubMessages();
                if (subMessages2 != null) {
                    for (java.lang.String str : subMessages2) {
                        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                        sb.append(str);
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                if (z) {
                    if (!z2) {
                        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                    }
                    sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
                    sb.append(resolveString);
                }
                java.lang.String obj = sb.toString();
                boolean z3 = (action == null || kotlin.jvm.internal.Intrinsics.areEqual(activityTransactionDetailViewModel4 != null ? activityTransactionDetailViewModel4.getSourcePage$activity_prodRelease() : null, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySourceConstants.KEY_SOURCE_DETAILS)) ? false : true;
                if (z) {
                    startRestartGroup.startReplaceGroup(-321106231);
                    java.lang.String webPath2 = additionalInfoItemModel.getWebPath();
                    java.util.List listOf = kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(resolveString, webPath2 != null ? webPath2 : ""));
                    com.paypal.pds.components.BannerStyle.Info info = com.paypal.pds.components.BannerStyle.Info.INSTANCE;
                    com.paypal.pds.core.Icon.NoIcon additionalInfoLeadingIcon = additionalInfoItemModel.getAdditionalInfoLeadingIcon();
                    if (additionalInfoLeadingIcon == null) {
                        additionalInfoLeadingIcon = com.paypal.pds.core.Icon.NoIcon.INSTANCE;
                    }
                    com.paypal.pds.components.BannerStyle invoke = info.invoke(additionalInfoLeadingIcon);
                    com.paypal.pds.core.RichText richText = com.paypal.pds.core.RichTextKt.toRichText(obj, listOf);
                    boolean changedInstance = startRestartGroup.changedInstance(activityTransactionDetailViewModel4);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAdditionalInfoComposableMapperKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAdditionalInfoComposableMapperKt.m11818$r8$lambda$JHsqJmoVSq78GP_UMXYJFww(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel.this, (java.lang.String) obj2, (java.lang.String) obj3);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.pds.components.BannerKt.Banner((androidx.compose.ui.Modifier) null, invoke, (com.paypal.pds.core.RichText) null, richText, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit>) rememberedValue, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 0, 85);
                    startRestartGroup.endReplaceGroup();
                    activityTransactionDetailViewModel3 = activityTransactionDetailViewModel4;
                } else {
                    activityTransactionDetailViewModel3 = activityTransactionDetailViewModel4;
                    startRestartGroup.startReplaceGroup(-320399400);
                    com.paypal.pds.components.BannerStyle.Info info2 = com.paypal.pds.components.BannerStyle.Info.INSTANCE;
                    com.paypal.pds.core.Icon.NoIcon additionalInfoLeadingIcon2 = additionalInfoItemModel.getAdditionalInfoLeadingIcon();
                    if (additionalInfoLeadingIcon2 == null) {
                        additionalInfoLeadingIcon2 = com.paypal.pds.core.Icon.NoIcon.INSTANCE;
                    }
                    com.paypal.pds.components.BannerStyle invoke2 = info2.invoke(additionalInfoLeadingIcon2);
                    if (z3) {
                        bannerTrailingElement = com.paypal.pds.components.BannerTrailingElement.Chevron;
                    } else {
                        bannerTrailingElement = com.paypal.pds.components.BannerTrailingElement.None;
                    }
                    com.paypal.pds.components.BannerTrailingElement bannerTrailingElement2 = bannerTrailingElement;
                    if (z3) {
                        startRestartGroup.startReplaceGroup(-319960130);
                        boolean changed = startRestartGroup.changed(action);
                        boolean changedInstance2 = startRestartGroup.changedInstance(activityTransactionDetailViewModel3);
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if ((changed | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAdditionalInfoComposableMapperKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAdditionalInfoComposableMapperKt.m11822$r8$lambda$gBb5dcU3F433doJSCibaxJPPsM(com.paypal.oslo.feature.activity.domain.detail.models.ActivityInsightAction.this, activityTransactionDetailViewModel3);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceGroup();
                        function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
                    } else {
                        startRestartGroup.startReplaceGroup(-319428821);
                        startRestartGroup.endReplaceGroup();
                        function0 = null;
                    }
                    com.paypal.pds.components.BannerKt.Banner((androidx.compose.ui.Modifier) null, invoke2, (java.lang.String) null, obj, bannerTrailingElement2, (kotlin.jvm.functions.Function0<kotlin.Unit>) function0, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 0, 69);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            activityTransactionDetailViewModel3 = activityTransactionDetailViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAdditionalInfoComposableMapperKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailAdditionalInfoComposableMapperKt.m11820$r8$lambda$VJo80SJiaS4gYRudZ19_9k56a4(com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel.this, activityTransactionDetailViewModel3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$JH-sqJmoVSq78GP_UM-XYJ-Fw-w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11818$r8$lambda$JHsqJmoVSq78GP_UMXYJFww(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (activityTransactionDetailViewModel != null) {
            activityTransactionDetailViewModel.navigateToNavKey$activity_prodRelease(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityCommonWebViewScreenDestinationKey(new com.paypal.oslo.feature.activity.api.models.ActivityWebViewDto((java.lang.String) null, str2, false, 5, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$R-gaLkbzqelGCxJaXyPBsM8kORE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11819$r8$lambda$RgaLkbzqelGCxJaXyPBsM8kORE(com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel additionalInfoItemModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(878622010, i, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.TransactionDetailAdditionalInfosCompose.<anonymous>.<anonymous> (ActivityDetailAdditionalInfoComposableMapper.kt:73)");
            }
            ActivityTransactionDetailAdditionalInfoCompose(additionalInfoItemModel, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VJo80SJiaS4g-YRudZ19_9k56a4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11820$r8$lambda$VJo80SJiaS4gYRudZ19_9k56a4(com.paypal.oslo.feature.activity.domain.detail.models.AdditionalInfoItemModel additionalInfoItemModel, com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ActivityTransactionDetailAdditionalInfoCompose(additionalInfoItemModel, activityTransactionDetailViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bevmLWjlfB9Ch7j3-L6YJvFnYxk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11821$r8$lambda$bevmLWjlfB9Ch7j3L6YJvFnYxk(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailAdditionalInfoModel activityDetailAdditionalInfoModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        TransactionDetailAdditionalInfosCompose(activityDetailAdditionalInfoModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$g-Bb5dcU3F433doJSCibaxJPPsM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11822$r8$lambda$gBb5dcU3F433doJSCibaxJPPsM(com.paypal.oslo.feature.activity.domain.detail.models.ActivityInsightAction activityInsightAction, com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel) {
        com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey payPalActivityTransactionDetailScreenDestinationKey = new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey((java.lang.String) null, activityInsightAction.getLinkedActivityId(), activityInsightAction.getLinkedActivityId(), (java.lang.String) null, activityInsightAction.getLinkedActivityType(), (java.lang.String) null, (java.lang.String) null, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySourceConstants.KEY_SOURCE_DETAILS, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 3945, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        if (activityTransactionDetailViewModel != null) {
            activityTransactionDetailViewModel.navigateToNavKey$activity_prodRelease(payPalActivityTransactionDetailScreenDestinationKey);
        }
        return kotlin.Unit.INSTANCE;
    }
}
