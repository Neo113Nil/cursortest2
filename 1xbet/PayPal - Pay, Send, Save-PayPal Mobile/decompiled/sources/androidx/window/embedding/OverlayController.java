package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Landroidx/window/embedding/OverlayController;", "", "Landroidx/window/embedding/EmbeddingBackend;", "backend", "<init>", "(Landroidx/window/embedding/EmbeddingBackend;)V", "Landroid/os/Bundle;", "options", "Landroidx/window/embedding/OverlayCreateParams;", "overlayCreateParams", "setOverlayCreateParams$window_release", "(Landroid/os/Bundle;Landroidx/window/embedding/OverlayCreateParams;)Landroid/os/Bundle;", "Lkotlin/Function1;", "Landroidx/window/embedding/OverlayAttributesCalculatorParams;", "Landroidx/window/embedding/OverlayAttributes;", "calculator", "", "setOverlayAttributesCalculator", "(Lkotlin/jvm/functions/Function1;)V", "clearOverlayAttributesCalculator", "()V", "", "overlayTag", "overlayAttributes", "updateOverlayAttributes", "(Ljava/lang/String;Landroidx/window/embedding/OverlayAttributes;)V", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/window/embedding/OverlayInfo;", "overlayInfo", "(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoSizes", "Landroidx/window/embedding/EmbeddingBackend;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OverlayController {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.embedding.OverlayController.Companion INSTANCE = new androidx.window.embedding.OverlayController.Companion(null);
    public static final int OVERLAY_FEATURE_VERSION = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.window.embedding.EmbeddingBackend getHighSpeedVideoFpsRangesFor;

    public OverlayController(androidx.window.embedding.EmbeddingBackend embeddingBackend) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingBackend, "");
        this.getHighSpeedVideoFpsRangesFor = embeddingBackend;
    }

    public final android.os.Bundle setOverlayCreateParams$window_release(android.os.Bundle options, androidx.window.embedding.OverlayCreateParams overlayCreateParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overlayCreateParams, "");
        return this.getHighSpeedVideoFpsRangesFor.setOverlayCreateParams(options, overlayCreateParams);
    }

    public final void setOverlayAttributesCalculator(kotlin.jvm.functions.Function1<? super androidx.window.embedding.OverlayAttributesCalculatorParams, androidx.window.embedding.OverlayAttributes> calculator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calculator, "");
        this.getHighSpeedVideoFpsRangesFor.setOverlayAttributesCalculator(calculator);
    }

    public final void clearOverlayAttributesCalculator() {
        this.getHighSpeedVideoFpsRangesFor.clearOverlayAttributesCalculator();
    }

    public final void updateOverlayAttributes(java.lang.String overlayTag, androidx.window.embedding.OverlayAttributes overlayAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overlayTag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overlayAttributes, "");
        this.getHighSpeedVideoFpsRangesFor.updateOverlayAttributes(overlayTag, overlayAttributes);
    }

    public final kotlinx.coroutines.flow.Flow<androidx.window.embedding.OverlayInfo> overlayInfo(java.lang.String overlayTag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overlayTag, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new androidx.window.embedding.OverlayController$overlayInfo$1(this, overlayTag, null));
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/window/embedding/OverlayController$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/window/embedding/OverlayController;", "getInstance", "(Landroid/content/Context;)Landroidx/window/embedding/OverlayController;", "", "OVERLAY_FEATURE_VERSION", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.window.embedding.OverlayController getInstance(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new androidx.window.embedding.OverlayController(androidx.window.embedding.EmbeddingBackend.INSTANCE.getInstance(context));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.window.embedding.OverlayController getInstance(android.content.Context context) {
        return INSTANCE.getInstance(context);
    }
}
