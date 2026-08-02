package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0015X\u0094\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00028\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R(\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00028\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001c"}, d2 = {"Lcom/ingo/sdk/android/ux/viewprovider/FundsTimingFragmentViewProvider;", "Lcom/ingo/sdk/android/core/ux/composable/IngoComposable;", "Landroidx/compose/runtime/MutableState;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "Lkotlin/Function0;", "", "failureAction", "retryAction", "Lcom/ingo/sdk/kotlin/common/features/confirm_amount/model/ConfirmAmountResponse;", "confirmAmountResponse", "Lkotlin/Function1;", "Lcom/ingo/sdk/kotlin/common/constants/FundsTiming;", "nextClicked", "navigationClicked", "onFundsTimingChanged", "<init>", "(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/ingo/sdk/kotlin/common/features/confirm_amount/model/ConfirmAmountResponse;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "View", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/MutableState;", "getFailure", "()Landroidx/compose/runtime/MutableState;", "getFailureAction", "getRetryAction", "Camera2StreamConfigurationMap", "Lcom/ingo/sdk/kotlin/common/features/confirm_amount/model/ConfirmAmountResponse;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FundsTimingFragmentViewProvider extends com.ingo.sdk.android.core.ux.composable.IngoComposable {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> failure;
    private final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> failureAction;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.ingo.sdk.kotlin.common.constants.FundsTiming, kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<com.ingo.sdk.kotlin.common.constants.FundsTiming, kotlin.Unit> getHighSpeedVideoSizes;
    private final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> retryAction;

    @Override // com.ingo.sdk.android.core.ux.composable.IngoComposable
    public final androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> getFailure() {
        return this.failure;
    }

    @Override // com.ingo.sdk.android.core.ux.composable.IngoComposable
    public final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> getFailureAction() {
        return this.failureAction;
    }

    @Override // com.ingo.sdk.android.core.ux.composable.IngoComposable
    public final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> getRetryAction() {
        return this.retryAction;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FundsTimingFragmentViewProvider(androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> mutableState, androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> mutableState2, androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> mutableState3, com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse confirmAmountResponse, kotlin.jvm.functions.Function1<? super com.ingo.sdk.kotlin.common.constants.FundsTiming, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super com.ingo.sdk.kotlin.common.constants.FundsTiming, kotlin.Unit> function12) {
        super(null, null, null, 7, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmAmountResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        this.failure = mutableState;
        this.failureAction = mutableState2;
        this.retryAction = mutableState3;
        this.getHighResolutionOutputSizeshNQ4ISI = confirmAmountResponse;
        this.Camera2StreamConfigurationMap = function1;
        this.getHighSpeedVideoFpsRangesFor = function0;
        this.getHighSpeedVideoSizes = function12;
    }

    public final void View(androidx.compose.runtime.Composer composer, final int i) {
        java.lang.String stringResource;
        java.lang.String valueOf;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1566510541);
        startRestartGroup.startReplaceGroup(1849434622);
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        if (mutableState.getValue() == null) {
            startRestartGroup.startReplaceGroup(1199288727);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_check_amount_subtitle, startRestartGroup, 0);
            startRestartGroup.endReplaceGroup();
        } else {
            startRestartGroup.startReplaceGroup(1199382905);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_amount_to_be_added, startRestartGroup, 0);
            startRestartGroup.endReplaceGroup();
        }
        com.ingo.sdk.kotlin.common.constants.FundsTiming fundsTiming = (com.ingo.sdk.kotlin.common.constants.FundsTiming) mutableState.getValue();
        if (kotlin.jvm.internal.Intrinsics.areEqual(fundsTiming, com.ingo.sdk.kotlin.common.constants.InMinutesFundsTiming.INSTANCE)) {
            valueOf = java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI.getInMinutesFees().getTotalAmountMinusFeesInCents());
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(fundsTiming, com.ingo.sdk.kotlin.common.constants.InDaysFundsTiming.INSTANCE)) {
            valueOf = java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI.getInDaysFees().getTotalAmountMinusFeesInCents());
        } else {
            valueOf = java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI.getCheckAmountInCents());
        }
        androidx.compose.material3.ScaffoldKt.m3648ScaffoldTvnljyQ(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.ui.Modifier.INSTANCE), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1488239369, true, new com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider$View$1(this), startRestartGroup, 54), null, null, null, 0, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme(startRestartGroup, 8).getBackgroundColor())), 0L, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1704737214, true, new com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider$View$2(valueOf, mutableState, this, stringResource), startRestartGroup, 54), startRestartGroup, 805306416, 444);
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider.m10744$r8$lambda$jTLEkEDQ7DHtBNezwI3OmJ2vA(com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$jTLEkEDQ7DHtBNezwI3O--mJ2vA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10744$r8$lambda$jTLEkEDQ7DHtBNezwI3OmJ2vA(com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider fundsTimingFragmentViewProvider, int i, androidx.compose.runtime.Composer composer, int i2) {
        fundsTimingFragmentViewProvider.View(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
