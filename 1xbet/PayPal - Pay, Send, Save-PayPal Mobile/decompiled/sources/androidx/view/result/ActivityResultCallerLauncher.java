package androidx.view.result;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00028\u00008\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR'\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u00068CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0017R&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017"}, d2 = {"Landroidx/activity/result/ActivityResultCallerLauncher;", com.visa.cbp.getEncExpo.warmup, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT, "Landroidx/activity/result/ActivityResultLauncher;", "", com.datadog.android.profiling.DdProfilingContentProvider.TELEMETRY_APP_START_INFO_LAUNCHER, "Landroidx/activity/result/contract/ActivityResultContract;", "callerContract", "callerInput", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;)V", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "launch", "(Lkotlin/Unit;Landroidx/core/app/ActivityOptionsCompat;)V", "unregister", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/activity/result/ActivityResultLauncher;", "getHighSpeedVideoSizes", "Landroidx/activity/result/contract/ActivityResultContract;", "getCallerContract", "()Landroidx/activity/result/contract/ActivityResultContract;", "Ljava/lang/Object;", "getCallerInput", "()Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRangesFor", "contract", "getContract"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActivityResultCallerLauncher<I, O> extends androidx.view.result.ActivityResultLauncher<kotlin.Unit> {
    private final androidx.view.result.contract.ActivityResultContract<I, O> callerContract;
    private final I callerInput;
    private final androidx.view.result.contract.ActivityResultContract<kotlin.Unit, O> contract;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.view.result.ActivityResultLauncher<I> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;

    public ActivityResultCallerLauncher(androidx.view.result.ActivityResultLauncher<I> activityResultLauncher, androidx.view.result.contract.ActivityResultContract<I, O> activityResultContract, I i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultContract, "");
        this.getHighSpeedVideoSizes = activityResultLauncher;
        this.callerContract = activityResultContract;
        this.callerInput = i;
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.activity.result.ActivityResultCallerLauncher$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.view.result.ActivityResultCallerLauncher.m23$r8$lambda$Ch0gowsUD3RY0ZHQNvP1kLq24A(androidx.view.result.ActivityResultCallerLauncher.this);
            }
        });
        this.contract = getHighSpeedVideoFpsRanges();
    }

    public final androidx.view.result.contract.ActivityResultContract<I, O> getCallerContract() {
        return this.callerContract;
    }

    public final I getCallerInput() {
        return this.callerInput;
    }

    private final androidx.view.result.contract.ActivityResultContract<kotlin.Unit, O> getHighSpeedVideoFpsRanges() {
        return (androidx.view.result.contract.ActivityResultContract) this.getHighSpeedVideoFpsRangesFor.getValue();
    }

    @Override // androidx.view.result.ActivityResultLauncher
    public final void launch(kotlin.Unit input, androidx.core.app.ActivityOptionsCompat options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        this.getHighSpeedVideoSizes.launch(this.callerInput, options);
    }

    @Override // androidx.view.result.ActivityResultLauncher
    public final void unregister() {
        this.getHighSpeedVideoSizes.unregister();
    }

    @Override // androidx.view.result.ActivityResultLauncher
    public final androidx.view.result.contract.ActivityResultContract<kotlin.Unit, ?> getContract() {
        return this.contract;
    }

    /* renamed from: $r8$lambda$Ch0g-owsUD3RY0ZHQNvP1kLq24A, reason: not valid java name */
    public static /* synthetic */ androidx.view.result.ActivityResultCallerLauncher$resultContract$2$1 m23$r8$lambda$Ch0gowsUD3RY0ZHQNvP1kLq24A(final androidx.view.result.ActivityResultCallerLauncher activityResultCallerLauncher) {
        return new androidx.view.result.contract.ActivityResultContract<kotlin.Unit, O>(activityResultCallerLauncher) { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1
            final /* synthetic */ androidx.view.result.ActivityResultCallerLauncher<I, O> getHighSpeedVideoFpsRanges;

            {
                this.getHighSpeedVideoFpsRanges = activityResultCallerLauncher;
            }

            @Override // androidx.view.result.contract.ActivityResultContract
            public final android.content.Intent createIntent(android.content.Context context, kotlin.Unit input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                return this.getHighSpeedVideoFpsRanges.getCallerContract().createIntent(context, this.getHighSpeedVideoFpsRanges.getCallerInput());
            }

            @Override // androidx.view.result.contract.ActivityResultContract
            public final O parseResult(int resultCode, android.content.Intent intent) {
                return (O) this.getHighSpeedVideoFpsRanges.getCallerContract().parseResult(resultCode, intent);
            }
        };
    }
}
