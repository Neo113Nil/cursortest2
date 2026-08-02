package com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "instrument", "Lkotlin/Function0;", "", "onClick", "ManageSecondaryCardHolderListItem", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ManageSecondaryCardHolderListItemKt {
    public static final void ManageSecondaryCardHolderListItem(final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1530602761);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(debitInstrument) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1530602761, i3, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderListItem (ManageSecondaryCardHolderListItem.kt:33)");
            }
            final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState displayState = debitInstrument.getStatus().getDisplayState();
            java.lang.Integer statusTextResId = com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.getStatusTextResId(displayState);
            final java.lang.String initials = com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.toInitials(debitInstrument.getCardHolder().getFullName());
            java.lang.String fullName = debitInstrument.getCardHolder().getFullName();
            if (statusTextResId == null) {
                startRestartGroup.startReplaceGroup(-1480374865);
                startRestartGroup.endReplaceGroup();
                rememberComposableLambda = null;
            } else {
                startRestartGroup.startReplaceGroup(-1480374864);
                final int intValue = statusTextResId.intValue();
                rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(134279397, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderListItemKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderListItemKt.$r8$lambda$TjzXj_Qm8kmg1EJWpWO9_xjY7AQ(intValue, displayState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54);
                startRestartGroup.endReplaceGroup();
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(fullName, null, null, null, null, false, false, com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ComposableSingletons$ManageSecondaryCardHolderListItemKt.INSTANCE.m14430getLambda$1393890701$debit_card_prodRelease(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-230309516, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderListItemKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderListItemKt.m14432$r8$lambda$yIENzhzlQs9Ejw2IVwsk0xM(initials, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), rememberComposableLambda, null, null, false, function0, null, null, null, null, false, composer2, 113246208, (i3 << 6) & 7168, 515198);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderListItemKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderListItemKt.m14431$r8$lambda$KDGnkNgiYWf0hlRe6lqkS1Hkoo(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument.this, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$KDGnkNgi-YWf0hlRe6lqkS1Hkoo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14431$r8$lambda$KDGnkNgiYWf0hlRe6lqkS1Hkoo(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument debitInstrument, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        ManageSecondaryCardHolderListItem(debitInstrument, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TjzXj_Qm8kmg1EJWpWO9_xjY7AQ(int i, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState debitInstrumentDisplayState, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(134279397, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderListItem.<anonymous>.<anonymous> (ManageSecondaryCardHolderListItem.kt:48)");
            }
            com.paypal.pds.components.BadgeKt.Badge(androidx.compose.ui.res.StringResources_androidKt.stringResource(i, composer, 0), null, com.paypal.oslo.feature.debitcard.servicing.util.DebitInstrumentExtensionsKt.getBadgeStyle(debitInstrumentDisplayState), null, com.paypal.pds.components.BadgeSize.Small.INSTANCE, null, null, composer, 24576, 106);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$yIE-NzhzlQs-9Ej-w2IVwsk0x-M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14432$r8$lambda$yIENzhzlQs9Ejw2IVwsk0xM(java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-230309516, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.managesecondarycard.ManageSecondaryCardHolderListItem.<anonymous> (ManageSecondaryCardHolderListItem.kt:41)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Initials(str), null, com.paypal.pds.components.AvatarSize.Medium.INSTANCE, null, null, null, composer, com.paypal.pds.components.AvatarSize.Medium.$stable << 6, 58);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
