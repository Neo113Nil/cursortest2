package com.ingo.sdk.android.core.ux.composable;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001BI\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0015X\u0094\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00028\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R(\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00028\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010"}, d2 = {"Lcom/ingo/sdk/android/core/ux/composable/IngoComposable;", "", "Landroidx/compose/runtime/MutableState;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "Lkotlin/Function0;", "", "failureAction", "retryAction", "<init>", "(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", "Lcom/ingo/sdk/kotlin/ux/IngoSdkColorTheme;", "currentTheme", "(Landroidx/compose/runtime/Composer;I)Lcom/ingo/sdk/kotlin/ux/IngoSdkColorTheme;", "Landroidx/compose/runtime/MutableState;", "getFailure", "()Landroidx/compose/runtime/MutableState;", "getFailureAction", "getRetryAction"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class IngoComposable {
    public static final int $stable = 0;
    private final androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> failure;
    private final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> failureAction;
    private final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> retryAction;

    public IngoComposable(androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> mutableState, androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> mutableState2, androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> mutableState3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState3, "");
        this.failure = mutableState;
        this.failureAction = mutableState2;
        this.retryAction = mutableState3;
    }

    public /* synthetic */ IngoComposable(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.MutableState mutableState3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null) : mutableState, (i & 2) != 0 ? androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null) : mutableState2, (i & 4) != 0 ? androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null) : mutableState3);
    }

    protected androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> getFailure() {
        return this.failure;
    }

    protected androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> getFailureAction() {
        return this.failureAction;
    }

    protected androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> getRetryAction() {
        return this.retryAction;
    }

    public final com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(680298201);
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoSdkTheme.class));
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoSdkTheme");
        }
        com.ingo.sdk.kotlin.ux.IngoSdkTheme ingoSdkTheme = (com.ingo.sdk.kotlin.ux.IngoSdkTheme) obj;
        java.lang.Object obj2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.appcompat.app.AppCompatDelegate.class));
        if (obj2 != null) {
            com.ingo.sdk.kotlin.ux.IngoSdkColorTheme systemTheme = com.ingo.sdk.android.core.ux.theme.ThemeKt.systemTheme(ingoSdkTheme, (androidx.appcompat.app.AppCompatDelegate) obj2, composer, 72);
            composer.endReplaceGroup();
            return systemTheme;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate");
    }

    public IngoComposable() {
        this(null, null, null, 7, null);
    }
}
