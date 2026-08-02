package coil3.compose;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class SingletonImageLoadersKt$sam$coil3_SingletonImageLoader_Factory$0 implements coil3.SingletonImageLoader.Factory, kotlin.jvm.internal.FunctionAdapter {
    private final /* synthetic */ kotlin.jvm.functions.Function1 getHighSpeedVideoFpsRanges;

    @Override // coil3.SingletonImageLoader.Factory
    public final /* synthetic */ coil3.ImageLoader newImageLoader(android.content.Context context) {
        return (coil3.ImageLoader) this.getHighSpeedVideoFpsRanges.invoke(context);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final kotlin.Function<?> getFunctionDelegate() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof coil3.SingletonImageLoader.Factory) && (obj instanceof kotlin.jvm.internal.FunctionAdapter)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(getFunctionDelegate(), ((kotlin.jvm.internal.FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    SingletonImageLoadersKt$sam$coil3_SingletonImageLoader_Factory$0(kotlin.jvm.functions.Function1 function1) {
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
