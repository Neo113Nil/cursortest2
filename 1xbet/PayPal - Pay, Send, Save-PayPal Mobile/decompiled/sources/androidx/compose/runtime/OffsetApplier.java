package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\rJ:\u0010 \u001a\u00020\t2\u001f\u0010\u001e\u001a\u001b\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\t0\u001b¢\u0006\u0002\b\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010\rR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010+\u001a\u00028\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*"}, d2 = {"Landroidx/compose/runtime/OffsetApplier;", "N", "Landroidx/compose/runtime/Applier;", "applier", "", "offset", "<init>", "(Landroidx/compose/runtime/Applier;I)V", "node", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN, "(Ljava/lang/Object;)V", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_UP, "()V", "index", "instance", "insertTopDown", "(ILjava/lang/Object;)V", "insertBottomUp", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "remove", "(II)V", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "move", "(III)V", "clear", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "block", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConstants.APPLY_PROMO_CARD_STATUS, "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V", "reuse", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/Applier;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "getCurrent", "()Ljava/lang/Object;", "current"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OffsetApplier<N> implements androidx.compose.runtime.Applier<N> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.Applier<N> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    public OffsetApplier(androidx.compose.runtime.Applier<N> applier, int i) {
        this.getHighSpeedVideoFpsRangesFor = applier;
        this.getHighSpeedVideoSizes = i;
    }

    @Override // androidx.compose.runtime.Applier
    public final N getCurrent() {
        return this.getHighSpeedVideoFpsRangesFor.getCurrent();
    }

    @Override // androidx.compose.runtime.Applier
    public final void down(N node) {
        this.getHighResolutionOutputSizeshNQ4ISI++;
        this.getHighSpeedVideoFpsRangesFor.down(node);
    }

    @Override // androidx.compose.runtime.Applier
    public final void up() {
        if (this.getHighResolutionOutputSizeshNQ4ISI <= 0) {
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("OffsetApplier up called with no corresponding down");
        }
        this.getHighResolutionOutputSizeshNQ4ISI--;
        this.getHighSpeedVideoFpsRangesFor.up();
    }

    @Override // androidx.compose.runtime.Applier
    public final void insertTopDown(int index, N instance) {
        this.getHighSpeedVideoFpsRangesFor.insertTopDown(index + (this.getHighResolutionOutputSizeshNQ4ISI == 0 ? this.getHighSpeedVideoSizes : 0), instance);
    }

    @Override // androidx.compose.runtime.Applier
    public final void insertBottomUp(int index, N instance) {
        this.getHighSpeedVideoFpsRangesFor.insertBottomUp(index + (this.getHighResolutionOutputSizeshNQ4ISI == 0 ? this.getHighSpeedVideoSizes : 0), instance);
    }

    @Override // androidx.compose.runtime.Applier
    public final void remove(int index, int count) {
        this.getHighSpeedVideoFpsRangesFor.remove(index + (this.getHighResolutionOutputSizeshNQ4ISI == 0 ? this.getHighSpeedVideoSizes : 0), count);
    }

    @Override // androidx.compose.runtime.Applier
    public final void move(int from, int to, int count) {
        int i = this.getHighResolutionOutputSizeshNQ4ISI == 0 ? this.getHighSpeedVideoSizes : 0;
        this.getHighSpeedVideoFpsRangesFor.move(from + i, to + i, count);
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError("Clear is not valid on OffsetApplier");
    }

    @Override // androidx.compose.runtime.Applier
    public final void apply(kotlin.jvm.functions.Function2<? super N, java.lang.Object, kotlin.Unit> block, java.lang.Object value) {
        this.getHighSpeedVideoFpsRangesFor.apply(block, value);
    }

    @Override // androidx.compose.runtime.Applier
    public final void reuse() {
        this.getHighSpeedVideoFpsRangesFor.reuse();
    }
}
