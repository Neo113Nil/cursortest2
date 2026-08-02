package androidx.view.result;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a`\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0017\u0010\u000b\u001a\u0013\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000e\u001aX\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0017\u0010\u000b\u001a\u0013\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\r\u0010\u000f"}, d2 = {com.visa.cbp.getEncExpo.warmup, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT, "Landroidx/activity/result/ActivityResultCaller;", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "input", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Lkotlin/Function1;", "Lkotlin/jvm/JvmSuppressWildcards;", "", com.sun.jna.Callback.METHOD_NAME, "Landroidx/activity/result/ActivityResultLauncher;", "registerForActivityResult", "(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/activity/result/ActivityResultRegistry;Lkotlin/jvm/functions/Function1;)Landroidx/activity/result/ActivityResultLauncher;", "(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Landroidx/activity/result/ActivityResultLauncher;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ActivityResultCallerKt {
    public static final <I, O> androidx.view.result.ActivityResultLauncher<kotlin.Unit> registerForActivityResult(androidx.view.result.ActivityResultCaller activityResultCaller, androidx.view.result.contract.ActivityResultContract<I, O> activityResultContract, I i, androidx.view.result.ActivityResultRegistry activityResultRegistry, final kotlin.jvm.functions.Function1<O, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultCaller, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultContract, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultRegistry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new androidx.view.result.ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(activityResultContract, activityResultRegistry, new androidx.view.result.ActivityResultCallback() { // from class: androidx.activity.result.ActivityResultCallerKt$$ExternalSyntheticLambda0
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                kotlin.jvm.functions.Function1.this.invoke(obj);
            }
        }), activityResultContract, i);
    }

    public static final <I, O> androidx.view.result.ActivityResultLauncher<kotlin.Unit> registerForActivityResult(androidx.view.result.ActivityResultCaller activityResultCaller, androidx.view.result.contract.ActivityResultContract<I, O> activityResultContract, I i, final kotlin.jvm.functions.Function1<O, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultCaller, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResultContract, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new androidx.view.result.ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(activityResultContract, new androidx.view.result.ActivityResultCallback() { // from class: androidx.activity.result.ActivityResultCallerKt$$ExternalSyntheticLambda1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                kotlin.jvm.functions.Function1.this.invoke(obj);
            }
        }), activityResultContract, i);
    }
}
