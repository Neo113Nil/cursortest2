package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000e\b\u0007\u0018\u00002\u00020\u0001B{\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0019\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u001aR\u001c\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\"\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u008e\u0002"}, d2 = {"Lcom/ingo/sdk/android/ux/viewprovider/EnterAmountFragmentViewProvider;", "Lcom/ingo/sdk/android/core/ux/composable/IngoComposable;", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "Landroidx/compose/runtime/MutableState;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "failureAction", "Lkotlin/Function0;", "", "retryAction", "progressShowing", "", "nextClicked", "Lkotlin/Function1;", "", "navigationIconClicked", "noOcrAmountFromApi", "<init>", "(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Z)V", "getFailure", "()Landroidx/compose/runtime/MutableState;", "getFailureAction", "getRetryAction", "getProgressShowing", "getNextClicked", "()Lkotlin/jvm/functions/Function1;", "View", "(Landroidx/compose/runtime/Composer;I)V", "androidSdkUx_release", "inputString", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class EnterAmountFragmentViewProvider extends com.ingo.sdk.android.core.ux.composable.IngoComposable {
    public static final int $stable = com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable;
    private final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> Camera2StreamConfigurationMap;
    private final androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> getHighSpeedVideoFpsRangesFor;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getOutputFormats;
    private final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> getOutputMinFrameDuration;

    @Override // com.ingo.sdk.android.core.ux.composable.IngoComposable
    public final androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> getFailure() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.ingo.sdk.android.core.ux.composable.IngoComposable
    public final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> getFailureAction() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.ingo.sdk.android.core.ux.composable.IngoComposable
    public final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> getRetryAction() {
        return this.getOutputMinFrameDuration;
    }

    public final androidx.compose.runtime.MutableState<java.lang.Boolean> getProgressShowing() {
        return this.getOutputFormats;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> getNextClicked() {
        return this.Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EnterAmountFragmentViewProvider(androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> mutableState, androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> mutableState2, androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> mutableState3, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState4, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, boolean z) {
        super(null, null, null, 7, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
        this.getHighSpeedVideoFpsRangesFor = mutableState2;
        this.getOutputMinFrameDuration = mutableState3;
        this.getOutputFormats = mutableState4;
        this.Camera2StreamConfigurationMap = function1;
        this.getHighSpeedVideoSizes = function0;
        this.getHighSpeedVideoFpsRanges = z;
    }

    public final void View(androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1086653443);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController = (androidx.compose.ui.platform.SoftwareKeyboardController) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController());
            androidx.compose.ui.focus.FocusManager focusManager = (androidx.compose.ui.focus.FocusManager) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager());
            startRestartGroup.startReplaceGroup(1849434622);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.ui.focus.FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.focus.FocusRequester focusRequester = (androidx.compose.ui.focus.FocusRequester) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            androidx.compose.ui.Modifier imePadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.ui.Modifier.INSTANCE);
            long Color = androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme(startRestartGroup, (i2 & 14) | com.ingo.sdk.android.core.ux.composable.IngoComposable.$stable).getBackgroundColor()));
            composer2 = startRestartGroup;
            androidx.compose.material3.ScaffoldKt.m3648ScaffoldTvnljyQ(imePadding, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1164924615, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider$View$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    kotlin.jvm.functions.Function0 function0;
                    boolean z;
                    androidx.compose.runtime.Composer composer4 = composer3;
                    if ((num.intValue() & 11) != 2 || !composer4.getSkipping()) {
                        if (!com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider.this.getProgressShowing().getValue().booleanValue()) {
                            function0 = com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider.this.getHighSpeedVideoSizes;
                            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.enter_check_amount_fragment_title, composer4, 0);
                            z = com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider.this.getHighSpeedVideoFpsRanges;
                            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10649TopAppBarHzv_svQ(stringResource, function0, z ? com.ingo.sdk.android.ux.R.drawable.ic_baseline_close_24 : com.ingo.sdk.android.ux.R.drawable.ic_baseline_arrow_back_24, null, 0L, false, null, false, false, 0, composer4, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 984);
                        }
                    } else {
                        composer4.skipToGroupEnd();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, startRestartGroup, 54), null, null, null, 0, Color, 0L, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(948426770, true, new com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider$View$2(this, focusRequester, (androidx.compose.runtime.MutableState) rememberedValue2, focusManager, softwareKeyboardController), startRestartGroup, 54), composer2, 805306416, 444);
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider.m10742$r8$lambda$O5Qvf7zDRXSNLjYF8qSSr09ncw(com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$O5Qvf7zDRXSNLjYF8-qSSr09ncw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10742$r8$lambda$O5Qvf7zDRXSNLjYF8qSSr09ncw(com.ingo.sdk.android.ux.viewprovider.EnterAmountFragmentViewProvider enterAmountFragmentViewProvider, int i, androidx.compose.runtime.Composer composer, int i2) {
        enterAmountFragmentViewProvider.View(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ java.lang.String access$View$lambda$2(androidx.compose.runtime.MutableState mutableState) {
        return (java.lang.String) mutableState.getValue();
    }
}
