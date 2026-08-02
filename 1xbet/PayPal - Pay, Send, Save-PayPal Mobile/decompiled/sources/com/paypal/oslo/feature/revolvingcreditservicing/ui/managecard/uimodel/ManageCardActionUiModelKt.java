package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0018\u0010\u000b\u001a\u00020\b*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardActionUiModel;", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/viewmodel/ManageCardEvent;", "", "onEvent", "Lcom/paypal/pds/components/ListItem;", "toListItem", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardActionUiModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/paypal/pds/components/ListItem;", "", "getStableKey", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/ManageCardActionUiModel;)Ljava/lang/String;", "stableKey"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ManageCardActionUiModelKt {
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.pds.components.ListItem toListItem(final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel manageCardActionUiModel, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String str;
        androidx.compose.runtime.internal.ComposableLambda composableLambda;
        androidx.compose.runtime.internal.ComposableLambda composableLambda2;
        final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContextualAlertUiModel contextualAlertUiModel;
        androidx.compose.runtime.internal.ComposableLambda composableLambda3;
        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda;
        java.lang.String asString;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardActionUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1086883322, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.toListItem (ManageCardActionUiModel.kt:381)");
        }
        java.lang.String asString2 = manageCardActionUiModel.getTitleRes().asString(composer, 0);
        if (manageCardActionUiModel.getContextualAlertUiModel() == null) {
            composer.startReplaceGroup(-417175330);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString descriptionRes = manageCardActionUiModel.getDescriptionRes();
            if (descriptionRes == null) {
                composer.startReplaceGroup(-417175331);
                composer.endReplaceGroup();
                asString = null;
            } else {
                composer.startReplaceGroup(817826724);
                asString = descriptionRes.asString(composer, 0);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
            str = asString;
        } else {
            composer.startReplaceGroup(-417159645);
            composer.endReplaceGroup();
            str = null;
        }
        if (manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.LockCard) {
            composer.startReplaceGroup(-416822922);
            if (((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.LockCard) manageCardActionUiModel).getContextualAlert() == null) {
                composer.startReplaceGroup(-416779739);
                composableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1103166333, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt.$r8$lambda$S5yB9PNF7zTbCSw9bBztBh7T_dk(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.this, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer, 54);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-416277508);
                composer.endReplaceGroup();
                composableLambda2 = null;
            }
            composer.endReplaceGroup();
        } else if (manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet) {
            composer.startReplaceGroup(-416126600);
            if (((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet) manageCardActionUiModel).getCardType() == com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet.CardType.NOT_ENROLLED) {
                composer.startReplaceGroup(-416038250);
                composableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1043600058, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt.$r8$lambda$1zkGk1siffTqabGWsy2sccsZXP8(kotlin.jvm.functions.Function1.this, manageCardActionUiModel, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer, 54);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-414998820);
                composer.endReplaceGroup();
                composableLambda2 = null;
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-414920701);
            composer.endReplaceGroup();
            composableLambda = null;
            composer.startReplaceGroup(817902237);
            contextualAlertUiModel = manageCardActionUiModel.getContextualAlertUiModel();
            if (contextualAlertUiModel == null) {
                composer.startReplaceGroup(-494448841);
                rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2075117697, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt.$r8$lambda$LiueLnvrAqkqSf1bSVsUCfE2MJM(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContextualAlertUiModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer, 54);
                composer.endReplaceGroup();
            } else if ((manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.StatementDelivery) && ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.StatementDelivery) manageCardActionUiModel).getHasPaperStatements()) {
                composer.startReplaceGroup(-494109980);
                rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2028765750, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt.$r8$lambda$ShvOmuANllUs7qEGuP9wHWeL8Hk(kotlin.jvm.functions.Function1.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer, 54);
                composer.endReplaceGroup();
            } else if ((manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet) && ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet) manageCardActionUiModel).getCardType() == com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet.CardType.PENDING) {
                composer.startReplaceGroup(-493476495);
                rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1517753591, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt.$r8$lambda$tE91dO5EAfYsqi5EfCLIjq406Is(kotlin.jvm.functions.Function1.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer, 54);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-492997949);
                composer.endReplaceGroup();
                composableLambda3 = null;
                composer.endReplaceGroup();
                com.paypal.pds.components.ListItem listItem = new com.paypal.pds.components.ListItem(asString2, str, null, null, false, false, composableLambda, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1188713194, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt.$r8$lambda$h2nX32wYjoVmOaDl5VMcEZUu5Z8(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer, 54), composableLambda3, null, null, null, null, 7740, null);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                return listItem;
            }
            composableLambda3 = rememberComposableLambda;
            composer.endReplaceGroup();
            com.paypal.pds.components.ListItem listItem2 = new com.paypal.pds.components.ListItem(asString2, str, null, null, false, false, composableLambda, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1188713194, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt.$r8$lambda$h2nX32wYjoVmOaDl5VMcEZUu5Z8(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composableLambda3, null, null, null, null, 7740, null);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            return listItem2;
        }
        composableLambda = composableLambda2;
        composer.startReplaceGroup(817902237);
        contextualAlertUiModel = manageCardActionUiModel.getContextualAlertUiModel();
        if (contextualAlertUiModel == null) {
        }
        composableLambda3 = rememberComposableLambda;
        composer.endReplaceGroup();
        com.paypal.pds.components.ListItem listItem22 = new com.paypal.pds.components.ListItem(asString2, str, null, null, false, false, composableLambda, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1188713194, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt.$r8$lambda$h2nX32wYjoVmOaDl5VMcEZUu5Z8(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composableLambda3, null, null, null, null, 7740, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        return listItem22;
    }

    public static final java.lang.String getStableKey(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel manageCardActionUiModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageCardActionUiModel, "");
        if (manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.LockCard) {
            return "LockCard:".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.LockCard) manageCardActionUiModel).isLocked()));
        }
        if (manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.SetAsPreferred) {
            return "SetAsPreferred:".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.SetAsPreferred) manageCardActionUiModel).isPreferred()));
        }
        if (manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.ManageCreditLimit) {
            return "ManageCreditLimit";
        }
        if (manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.Help) {
            return "Help";
        }
        if (manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet) {
            return "PushToWallet:".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PushToWallet) manageCardActionUiModel).getCardType()));
        }
        if (manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.Autopay) {
            return "Autopay:".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.Autopay) manageCardActionUiModel).isEnabled()));
        }
        if (manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.AddAuthorizedUsers) {
            return "AddAuthorizedUsers";
        }
        if (manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PaymentSecurity) {
            return "PaymentSecurity:".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.PaymentSecurity) manageCardActionUiModel).getStatus()));
        }
        if (manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.Notifications) {
            return "Notifications";
        }
        if (manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.StatementDelivery) {
            return "StatementDelivery:".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.StatementDelivery) manageCardActionUiModel).getHasPaperStatements()));
        }
        if (manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.UpdateIncome) {
            return "UpdateIncome";
        }
        if (manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.Benefits) {
            return "Benefits";
        }
        if (manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.ReportLostOrStolen) {
            return "ReportLostOrStolen";
        }
        if (manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.ShareFeedback) {
            return "ShareFeedback";
        }
        if (manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.ContactUs) {
            return "ContactUs";
        }
        if (manageCardActionUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.ManagePin) {
            return "ManagePin";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* renamed from: $r8$lambda$1F7cbgJ2W0d-WZ796e8SKjrOujs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18514$r8$lambda$1F7cbgJ2W0dWZ796e8SKjrOujs(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnPushToWalletFinishSetupClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1zkGk1siffTqabGWsy2sccsZXP8(final kotlin.jvm.functions.Function1 function1, final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel manageCardActionUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1043600058, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.toListItem.<anonymous> (ManageCardActionUiModel.kt:417)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12())), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer, 48, 2);
            boolean changed = composer.changed(function1);
            boolean changedInstance = composer.changedInstance(manageCardActionUiModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt.m18515$r8$lambda$VarPZPdMpIWOgoKqPWq2quF2ig(kotlin.jvm.functions.Function1.this, manageCardActionUiModel);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(background, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0, 31), com.paypal.pds.core.ConstantsKt.getSpacing12(), com.paypal.pds.core.ConstantsKt.getSpacing8());
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1707paddingVpY3zN4);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_card_push_to_wallet_android_title, composer, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1018);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4aYwbbzveerITWAIBsuQST2RASw(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.OnStatementDeliveryViewDetailsLinkClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DwDgwYsEiV4NfeXNsqwVIZPoJb4(kotlin.jvm.functions.Function1 function1, boolean z) {
        function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.LockCardToggled(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardLockState.INSTANCE.fromBoolean(z)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LiueLnvrAqkqSf1bSVsUCfE2MJM(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ContextualAlertUiModel contextualAlertUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2075117697, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.toListItem.<anonymous>.<anonymous> (ManageCardActionUiModel.kt:446)");
            }
            com.paypal.pds.components.ContextualAlertKt.ContextualAlert(androidx.compose.ui.res.StringResources_androidKt.stringResource(contextualAlertUiModel.getText(), composer, 0), null, contextualAlertUiModel.getStyle(), composer, com.paypal.pds.components.ContextualAlertStyle.$stable << 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$S5yB9PNF7zTbCSw9bBztBh7T_dk(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel manageCardActionUiModel, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1103166333, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.toListItem.<anonymous> (ManageCardActionUiModel.kt:397)");
            }
            boolean isLocked = ((com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel.LockCard) manageCardActionUiModel).isLocked();
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt.$r8$lambda$DwDgwYsEiV4NfeXNsqwVIZPoJb4(kotlin.jvm.functions.Function1.this, ((java.lang.Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.SwitchKt.Switch(isLocked, (kotlin.jvm.functions.Function1) rememberedValue, null, false, composer, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ShvOmuANllUs7qEGuP9wHWeL8Hk(final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2028765750, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.toListItem.<anonymous>.<anonymous> (ManageCardActionUiModel.kt:455)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_card_statement_delivery_view_details, composer, 0);
            com.paypal.pds.components.LinkSize.Small small = com.paypal.pds.components.LinkSize.Small.INSTANCE;
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt.$r8$lambda$4aYwbbzveerITWAIBsuQST2RASw(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.LinkKt.Link(stringResource, null, (kotlin.jvm.functions.Function0) rememberedValue, small, composer, com.paypal.pds.components.LinkSize.Small.$stable << 9, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VarPZPd-MpIWOgoKqPWq2quF2ig, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18515$r8$lambda$VarPZPdMpIWOgoKqPWq2quF2ig(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel manageCardActionUiModel) {
        function1.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.viewmodel.ManageCardEvent.ActionItemClicked(manageCardActionUiModel));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h2nX32wYjoVmOaDl5VMcEZUu5Z8(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModel manageCardActionUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1188713194, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.toListItem.<anonymous> (ManageCardActionUiModel.kt:386)");
            }
            com.paypal.pds.components.IconKt.Icon(manageCardActionUiModel.getLeadingIcon(), null, null, com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer, 27696, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tE91dO5EAfYsqi5EfCLIjq406Is(final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1517753591, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.toListItem.<anonymous>.<anonymous> (ManageCardActionUiModel.kt:468)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_card_push_to_wallet_finish_setup, composer, 0);
            com.paypal.pds.components.LinkSize.Small small = com.paypal.pds.components.LinkSize.Small.INSTANCE;
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.ManageCardActionUiModelKt.m18514$r8$lambda$1F7cbgJ2W0dWZ796e8SKjrOujs(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.LinkKt.Link(stringResource, null, (kotlin.jvm.functions.Function0) rememberedValue, small, composer, com.paypal.pds.components.LinkSize.Small.$stable << 9, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
