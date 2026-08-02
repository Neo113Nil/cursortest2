package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"ActivityDetailCancelFloatingButton", "", "visible", "", "onCancelClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActivityDetailCancelFloatingButtonKt {
    public static final void ActivityDetailCancelFloatingButton(final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(966975339);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(966975339, i3, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.ActivityDetailCancelFloatingButton (ActivityDetailCancelFloatingButton.kt:31)");
            }
            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(z, modifier, (androidx.compose.animation.EnterTransition) null, (androidx.compose.animation.ExitTransition) null, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1672467565, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.ActivityDetailCancelFloatingButtonKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.ActivityDetailCancelFloatingButtonKt.$r8$lambda$A3bvSEkeJQ4UO9y7mYVDmHNeK_0(kotlin.jvm.functions.Function0.this, (androidx.compose.animation.AnimatedVisibilityScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | ((i3 >> 3) & 112), 28);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.ActivityDetailCancelFloatingButtonKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.ActivityDetailCancelFloatingButtonKt.$r8$lambda$tK_rM86RXGt6aZqO56qwE7tsQlk(z, function0, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$A3bvSEkeJQ4UO9y7mYVDmHNeK_0(kotlin.jvm.functions.Function0 function0, androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1672467565, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.ActivityDetailCancelFloatingButton.<anonymous> (ActivityDetailCancelFloatingButton.kt:36)");
        }
        com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_common_cancel, composer, 0), null, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer, 1769472, 412);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kGumCvBFF1xd7mWDw-FQIJzqQt0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18280$r8$lambda$kGumCvBFF1xd7mWDwFQIJzqQt0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-689623116);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-689623116, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.Preview (ActivityDetailCancelFloatingButton.kt:48)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.ActivityDetailCancelFloatingButtonKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ActivityDetailCancelFloatingButton(true, (kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.ui.Modifier.INSTANCE, startRestartGroup, 438, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.ActivityDetailCancelFloatingButtonKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.components.ActivityDetailCancelFloatingButtonKt.m18280$r8$lambda$kGumCvBFF1xd7mWDwFQIJzqQt0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tK_rM86RXGt6aZqO56qwE7tsQlk(boolean z, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ActivityDetailCancelFloatingButton(z, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
