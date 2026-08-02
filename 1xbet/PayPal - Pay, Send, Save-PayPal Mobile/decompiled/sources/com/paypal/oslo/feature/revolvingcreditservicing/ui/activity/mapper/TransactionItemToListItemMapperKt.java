package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel$TransactionItemUiModel;", "", "title", "Lkotlin/Function1;", "", "onCancelTransactionClick", "Lcom/paypal/pds/components/ListItem;", "toListItem", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/uimodel/ActivityUiModel$TransactionItemUiModel;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/paypal/pds/components/ListItem;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransactionItemToListItemMapperKt {
    public static final com.paypal.pds.components.ListItem toListItem(final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel transactionItemUiModel, java.lang.String str, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.internal.ComposableLambda composableLambda;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionItemUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-115365891, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.toListItem (TransactionItemToListItemMapper.kt:28)");
        }
        java.lang.String asString = transactionItemUiModel.getDescription().asString(composer, 0);
        float spacing2 = com.paypal.pds.core.ConstantsKt.getSpacing2();
        float spacing22 = com.paypal.pds.core.ConstantsKt.getSpacing2();
        java.lang.Boolean isCancellable = transactionItemUiModel.isCancellable();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(isCancellable, java.lang.Boolean.TRUE)) {
            isCancellable = null;
        }
        if (isCancellable != null) {
            composer.startReplaceGroup(-890675561);
            androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(470889598, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.TransactionItemToListItemMapperKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.TransactionItemToListItemMapperKt.$r8$lambda$UckpD6d8xBttoADZmOdsKvBGfX4(kotlin.jvm.functions.Function1.this, transactionItemUiModel, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54);
            composer.endReplaceGroup();
            composableLambda = rememberComposableLambda;
        } else {
            composer.startReplaceGroup(-890675562);
            composer.endReplaceGroup();
            composableLambda = null;
        }
        com.paypal.pds.components.ListItem listItem = new com.paypal.pds.components.ListItem(str, asString, null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-124410144, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.TransactionItemToListItemMapperKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.TransactionItemToListItemMapperKt.$r8$lambda$_8M9F1OA6XWEzTd1uBummFrUcu4(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2084714337, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.TransactionItemToListItemMapperKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.TransactionItemToListItemMapperKt.$r8$lambda$OllegDg9tnfqnsG5DhTifsI4T04(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }, composer, 54), composableLambda, null, null, androidx.compose.ui.unit.Dp.m8599boximpl(spacing2), androidx.compose.ui.unit.Dp.m8599boximpl(spacing22), 1548, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return listItem;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8vIhdJTnqtnXBn9GC37OZPCqp7I(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel transactionItemUiModel) {
        function1.invoke(transactionItemUiModel);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OllegDg9tnfqnsG5DhTifsI4T04(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel transactionItemUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2084714337, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.toListItem.<anonymous> (TransactionItemToListItemMapper.kt:36)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityMerchantImageKt.ActivityMerchantImage(transactionItemUiModel.getImageUrl(), null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UckpD6d8xBttoADZmOdsKvBGfX4(final kotlin.jvm.functions.Function1 function1, final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel transactionItemUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(470889598, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.toListItem.<anonymous>.<anonymous> (TransactionItemToListItemMapper.kt:49)");
            }
            boolean changed = composer.changed(function1);
            boolean changedInstance = composer.changedInstance(transactionItemUiModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.TransactionItemToListItemMapperKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.TransactionItemToListItemMapperKt.$r8$lambda$8vIhdJTnqtnXBn9GC37OZPCqp7I(kotlin.jvm.functions.Function1.this, transactionItemUiModel);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_cancel, composer, 0), null, null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, null, false, false, composer, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 476);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_8M9F1OA6XWEzTd1uBummFrUcu4(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.uimodel.ActivityUiModel.TransactionItemUiModel transactionItemUiModel, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String asString;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-124410144, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.toListItem.<anonymous> (TransactionItemToListItemMapper.kt:41)");
            }
            java.lang.String asString2 = transactionItemUiModel.getAmount().asString(composer, 0);
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor amountColor = transactionItemUiModel.getAmountColor();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString percentage = transactionItemUiModel.getPercentage();
            if (percentage == null) {
                composer.startReplaceGroup(254354423);
                composer.endReplaceGroup();
                asString = null;
            } else {
                composer.startReplaceGroup(700941642);
                asString = percentage.asString(composer, 0);
                composer.endReplaceGroup();
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountDetailsKt.ActivityTransactionAmountDetails(asString2, amountColor, asString, null, composer, 0, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
