package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\t\u0012\u0014\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\t¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\t8\u0015X\u0094\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001d\u0010\u001eR(\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\t8\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001eR(\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\t8\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b \u0010\u001e"}, d2 = {"Lcom/ingo/sdk/android/ux/viewprovider/WebViewProvider;", "Lcom/ingo/sdk/android/core/ux/composable/IngoComposable;", "", "title", "Landroidx/lifecycle/MutableLiveData;", "htmlContent", "Lkotlin/Function0;", "", "navigationClicked", "Landroidx/compose/runtime/MutableState;", "", "showProgress", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "failureAction", "retryAction", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/MutableLiveData;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", "View", "(Landroidx/compose/runtime/Composer;I)V", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/lifecycle/MutableLiveData;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/MutableState;", "Camera2StreamConfigurationMap", "getFailure", "()Landroidx/compose/runtime/MutableState;", "getFailureAction", "getRetryAction"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class WebViewProvider extends com.ingo.sdk.android.core.ux.composable.IngoComposable {
    public static final int $stable = 8;
    private final androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> failure;
    private final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> failureAction;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.view.MutableLiveData<java.lang.String> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> Camera2StreamConfigurationMap;
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
    public WebViewProvider(java.lang.String str, androidx.view.MutableLiveData<java.lang.String> mutableLiveData, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> mutableState2, androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> mutableState3, androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> mutableState4) {
        super(null, null, null, 7, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableLiveData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState4, "");
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRanges = mutableLiveData;
        this.getHighSpeedVideoSizes = function0;
        this.Camera2StreamConfigurationMap = mutableState;
        this.failure = mutableState2;
        this.failureAction = mutableState3;
        this.retryAction = mutableState4;
    }

    public final void View(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1289760475);
        androidx.compose.material3.ScaffoldKt.m3648ScaffoldTvnljyQ(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.ui.Modifier.INSTANCE), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-93941345, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.WebViewProvider$View$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                kotlin.jvm.functions.Function0 function0;
                java.lang.String str;
                androidx.compose.runtime.Composer composer3 = composer2;
                if ((num.intValue() & 11) != 2 || !composer3.getSkipping()) {
                    function0 = com.ingo.sdk.android.ux.viewprovider.WebViewProvider.this.getHighSpeedVideoSizes;
                    str = com.ingo.sdk.android.ux.viewprovider.WebViewProvider.this.getHighResolutionOutputSizeshNQ4ISI;
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10649TopAppBarHzv_svQ(str, function0, 0, null, 0L, false, null, false, false, 0, composer3, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 988);
                } else {
                    composer3.skipToGroupEnd();
                }
                return kotlin.Unit.INSTANCE;
            }
        }, startRestartGroup, 54), null, null, null, 0, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme(startRestartGroup, 8).getBackgroundColor())), 0L, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1807810838, true, new com.ingo.sdk.android.ux.viewprovider.WebViewProvider$View$2(this), startRestartGroup, 54), startRestartGroup, 805306416, 444);
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.ux.viewprovider.WebViewProvider$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.ingo.sdk.android.ux.viewprovider.WebViewProvider.m10761$r8$lambda$L0z68GXZ8UNv9MNg0yzTE1xFTg(com.ingo.sdk.android.ux.viewprovider.WebViewProvider.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$L0z68GXZ8UNv9MNg0y-zTE1xFTg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10761$r8$lambda$L0z68GXZ8UNv9MNg0yzTE1xFTg(com.ingo.sdk.android.ux.viewprovider.WebViewProvider webViewProvider, int i, androidx.compose.runtime.Composer composer, int i2) {
        webViewProvider.View(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
