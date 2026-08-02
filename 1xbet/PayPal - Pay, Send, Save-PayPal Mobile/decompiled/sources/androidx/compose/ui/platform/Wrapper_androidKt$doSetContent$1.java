package androidx.compose.ui.platform;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class Wrapper_androidKt$doSetContent$1 implements androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.FrameEndScheduler, kotlin.jvm.internal.FunctionAdapter {
    final /* synthetic */ androidx.compose.runtime.CompositionContext Camera2StreamConfigurationMap;

    @Override // androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.FrameEndScheduler
    public final androidx.compose.runtime.CancellationHandle scheduleFrameEndCallback(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        return this.Camera2StreamConfigurationMap.scheduleFrameEndCallback(function0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
        return new kotlin.jvm.internal.FunctionReferenceImpl(1, this.Camera2StreamConfigurationMap, androidx.compose.runtime.CompositionContext.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner.FrameEndScheduler) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    Wrapper_androidKt$doSetContent$1(androidx.compose.runtime.CompositionContext compositionContext) {
        this.Camera2StreamConfigurationMap = compositionContext;
    }
}
