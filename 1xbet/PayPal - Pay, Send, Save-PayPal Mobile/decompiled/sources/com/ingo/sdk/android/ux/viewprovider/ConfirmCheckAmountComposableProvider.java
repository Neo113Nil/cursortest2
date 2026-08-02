package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0002\u0012\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00028\u0015X\u0094\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u001c\u0010\u001dR(\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00028\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u001e\u0010\u001dR(\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00028\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u001f\u0010\u001d"}, d2 = {"Lcom/ingo/sdk/android/ux/viewprovider/ConfirmCheckAmountComposableProvider;", "Lcom/ingo/sdk/android/core/ux/composable/IngoComposable;", "Landroidx/compose/runtime/MutableState;", "", "progressShowing", "", "checkAmountPennies", "Lkotlin/Function0;", "", "confirmClicked", "otherAmountClicked", "exitClicked", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "failureAction", "retryAction", "<init>", "(Landroidx/compose/runtime/MutableState;JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", "View", "(Landroidx/compose/runtime/Composer;I)V", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function0;", "getFailure", "()Landroidx/compose/runtime/MutableState;", "getFailureAction", "getRetryAction"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConfirmCheckAmountComposableProvider extends com.ingo.sdk.android.core.ux.composable.IngoComposable {
    public static final int $stable = com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> failure;
    private final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> failureAction;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighSpeedVideoSizes;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    private final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> retryAction;

    public /* synthetic */ ConfirmCheckAmountComposableProvider(androidx.compose.runtime.MutableState mutableState, long j, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.MutableState mutableState3, androidx.compose.runtime.MutableState mutableState4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableState, (i & 2) != 0 ? 0L : j, function0, function02, function03, mutableState2, mutableState3, mutableState4);
    }

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
    public ConfirmCheckAmountComposableProvider(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, long j, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> mutableState2, androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> mutableState3, androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> mutableState4) {
        super(null, null, null, 7, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState4, "");
        this.getHighSpeedVideoFpsRangesFor = mutableState;
        this.getHighSpeedVideoSizes = j;
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = function02;
        this.Camera2StreamConfigurationMap = function03;
        this.failure = mutableState2;
        this.failureAction = mutableState3;
        this.retryAction = mutableState4;
    }

    public final void View(androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1496095657);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            androidx.compose.material3.ScaffoldKt.m3648ScaffoldTvnljyQ(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.ui.Modifier.INSTANCE), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1621618149, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.ConfirmCheckAmountComposableProvider$View$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    androidx.compose.runtime.MutableState mutableState;
                    kotlin.jvm.functions.Function0 function0;
                    androidx.compose.runtime.Composer composer3 = composer2;
                    if ((num.intValue() & 11) != 2 || !composer3.getSkipping()) {
                        mutableState = com.ingo.sdk.android.ux.viewprovider.ConfirmCheckAmountComposableProvider.this.getHighSpeedVideoFpsRangesFor;
                        if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                            function0 = com.ingo.sdk.android.ux.viewprovider.ConfirmCheckAmountComposableProvider.this.Camera2StreamConfigurationMap;
                            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10649TopAppBarHzv_svQ(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_confirm_check_amount_title, composer3, 0), function0, com.ingo.sdk.android.ux.R.drawable.ic_baseline_close_24, null, 0L, false, null, false, false, 0, composer3, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 984);
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, startRestartGroup, 54), null, null, null, 0, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme(startRestartGroup, (i2 & 14) | com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable).getBackgroundColor())), 0L, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1904456102, true, new com.ingo.sdk.android.ux.viewprovider.ConfirmCheckAmountComposableProvider$View$2(this, new com.ingo.sdk.kotlin.ux.textmachine.AmountInputTextMachine(java.lang.String.valueOf(this.getHighSpeedVideoSizes)).getFormattedTextString()), startRestartGroup, 54), startRestartGroup, 805306416, 444);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.ux.viewprovider.ConfirmCheckAmountComposableProvider$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.ingo.sdk.android.ux.viewprovider.ConfirmCheckAmountComposableProvider.$r8$lambda$K3_1joScT4i7o1ZF9evysA4o8SU(com.ingo.sdk.android.ux.viewprovider.ConfirmCheckAmountComposableProvider.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$K3_1joScT4i7o1ZF9evysA4o8SU(com.ingo.sdk.android.ux.viewprovider.ConfirmCheckAmountComposableProvider confirmCheckAmountComposableProvider, int i, androidx.compose.runtime.Composer composer, int i2) {
        confirmCheckAmountComposableProvider.View(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
