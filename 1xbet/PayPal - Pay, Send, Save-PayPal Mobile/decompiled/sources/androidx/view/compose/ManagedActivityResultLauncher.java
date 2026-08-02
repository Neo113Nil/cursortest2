package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B1\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00028\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/activity/compose/ManagedActivityResultLauncher;", com.visa.cbp.getEncExpo.warmup, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT, "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/compose/ActivityResultLauncherHolder;", com.datadog.android.profiling.DdProfilingContentProvider.TELEMETRY_APP_START_INFO_LAUNCHER, "Landroidx/compose/runtime/State;", "Landroidx/activity/result/contract/ActivityResultContract;", "currentContract", "<init>", "(Landroidx/activity/compose/ActivityResultLauncherHolder;Landroidx/compose/runtime/State;)V", "", "unregister", "()V", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "launch", "(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/activity/compose/ActivityResultLauncherHolder;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/State;", "Camera2StreamConfigurationMap", "getContract", "()Landroidx/activity/result/contract/ActivityResultContract;", "contract"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ManagedActivityResultLauncher<I, O> extends androidx.view.result.ActivityResultLauncher<I> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.view.compose.ActivityResultLauncherHolder<I> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.State<androidx.view.result.contract.ActivityResultContract<I, O>> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public ManagedActivityResultLauncher(androidx.view.compose.ActivityResultLauncherHolder<I> activityResultLauncherHolder, androidx.compose.runtime.State<? extends androidx.view.result.contract.ActivityResultContract<I, O>> state) {
        this.getHighSpeedVideoFpsRangesFor = activityResultLauncherHolder;
        this.Camera2StreamConfigurationMap = state;
    }

    @Override // androidx.view.result.ActivityResultLauncher
    @kotlin.Deprecated(message = "Registration is automatically handled by rememberLauncherForActivityResult")
    public final void unregister() {
        throw new java.lang.UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }

    @Override // androidx.view.result.ActivityResultLauncher
    public final void launch(I input, androidx.core.app.ActivityOptionsCompat options) {
        this.getHighSpeedVideoFpsRangesFor.launch(input, options);
    }

    @Override // androidx.view.result.ActivityResultLauncher
    public final androidx.view.result.contract.ActivityResultContract<I, O> getContract() {
        return this.Camera2StreamConfigurationMap.getValue();
    }
}
