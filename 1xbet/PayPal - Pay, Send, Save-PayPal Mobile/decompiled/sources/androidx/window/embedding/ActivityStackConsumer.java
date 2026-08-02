package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/window/embedding/ActivityStackConsumer;", "Landroidx/window/reflection/Consumer2;", "", "Landroidx/window/extensions/embedding/ActivityStack;", com.sun.jna.Callback.METHOD_NAME, "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "adapter", "Landroidx/window/embedding/EmbeddingAdapter;", "<init>", "(Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;Landroidx/window/embedding/EmbeddingAdapter;)V", "accept", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActivityStackConsumer implements androidx.window.reflection.Consumer2<java.util.List<? extends androidx.window.extensions.embedding.ActivityStack>> {
    private final androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.window.embedding.EmbeddingAdapter getHighSpeedVideoFpsRanges;

    public ActivityStackConsumer(androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface, androidx.window.embedding.EmbeddingAdapter embeddingAdapter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingCallbackInterface, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingAdapter, "");
        this.getHighResolutionOutputSizeshNQ4ISI = embeddingCallbackInterface;
        this.getHighSpeedVideoFpsRanges = embeddingAdapter;
    }

    @Override // androidx.window.reflection.Consumer2
    public final void accept(java.util.List<? extends androidx.window.extensions.embedding.ActivityStack> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.getHighResolutionOutputSizeshNQ4ISI.onActivityStackChanged(this.getHighSpeedVideoFpsRanges.translate$window_release(value));
    }
}
