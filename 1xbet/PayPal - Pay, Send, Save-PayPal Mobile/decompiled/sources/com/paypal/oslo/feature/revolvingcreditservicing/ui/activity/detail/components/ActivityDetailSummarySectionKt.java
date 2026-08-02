package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"ActivityDetailSummarySection", "", "name", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "logoUrl", "", "amount", "date", "status", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel$StatusUiModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/uimodel/ActivityDetailUiModel$StatusUiModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActivityDetailSummarySectionKt {
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActivityDetailSummarySection(final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, final java.lang.String str, final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3, final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.StatusUiModel statusUiModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1903636090);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(uiString) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(uiString2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(uiString3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(statusUiModel) ? 16384 : 8192;
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
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1903636090, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.ActivityDetailSummarySection (ActivityDetailSummarySection.kt:40)");
                }
                com.paypal.pds.components.HeaderKt.Header(uiString.asString(startRestartGroup, i3 & 14), modifier3, uiString3.asString(startRestartGroup, (i3 >> 9) & 14), uiString2.asString(startRestartGroup, (i3 >> 6) & 14), com.paypal.pds.components.HeaderContentAlignment.Center, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-853630713, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.ActivityDetailSummarySectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.ActivityDetailSummarySectionKt.m18284$r8$lambda$svqchvCe2I3s9ckQjamOB2cpOE(str, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2105962854, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.ActivityDetailSummarySectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.ActivityDetailSummarySectionKt.$r8$lambda$ho1wcnMsIOAke4bWFa86LSfwSXQ(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.StatusUiModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i3 >> 12) & 112) | 1794048, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.ActivityDetailSummarySectionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.ActivityDetailSummarySectionKt.$r8$lambda$PVG5W7tWw7zYl9vxJIRnxK6hTxc(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.this, str, uiString2, uiString3, statusUiModel, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$033rmaUE_XdHYQuA8G6eXphjGFs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-636274841);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-636274841, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.Preview (ActivityDetailSummarySection.kt:69)");
            }
            ActivityDetailSummarySection(new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("PayPal Cashback Mastercard"), null, new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("-$12.33"), new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.PlainString("Aug 5, 4:12 PM"), null, androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 24624, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.ActivityDetailSummarySectionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.ActivityDetailSummarySectionKt.$r8$lambda$033rmaUE_XdHYQuA8G6eXphjGFs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PVG5W7tWw7zYl9vxJIRnxK6hTxc(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString2, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString uiString3, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.StatusUiModel statusUiModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ActivityDetailSummarySection(uiString, str, uiString2, uiString3, statusUiModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ho1wcnMsIOAke4bWFa86LSfwSXQ(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.uimodel.ActivityDetailUiModel.StatusUiModel statusUiModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2105962854, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.ActivityDetailSummarySection.<anonymous> (ActivityDetailSummarySection.kt:55)");
            }
            if (statusUiModel == null) {
                composer.startReplaceGroup(-2142848119);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2142848118);
                com.paypal.pds.components.BadgeKt.Badge(statusUiModel.getLabel().asString(composer, 0), null, com.paypal.pds.components.BadgeStyle.Info.INSTANCE, com.paypal.pds.components.BadgeEmphasis.Default, null, null, null, composer, 3456, 114);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$svqchvCe2I3s9ckQjam-OB2cpOE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18284$r8$lambda$svqchvCe2I3s9ckQjamOB2cpOE(java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-853630713, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.ActivityDetailSummarySection.<anonymous> (ActivityDetailSummarySection.kt:48)");
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityMerchantImageKt.ActivityMerchantImage(str, androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize64()), com.paypal.pds.components.AvatarSize.XLarge.INSTANCE, composer, com.paypal.pds.components.AvatarSize.XLarge.$stable << 6, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
