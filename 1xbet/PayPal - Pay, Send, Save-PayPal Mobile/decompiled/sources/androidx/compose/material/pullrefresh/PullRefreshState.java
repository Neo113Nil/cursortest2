package androidx.compose.material.pullrefresh;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B5\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010!\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0013\u001a\u00020\u00128AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0014\u0010\n\u001a\u00020\b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010 R\u001b\u0010(\u001a\u00020\b8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b'\u0010 R+\u0010'\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00128C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010*\u001a\u0004\b(\u0010#\"\u0004\b(\u0010\u0015R+\u0010,\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b8C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010+\u001a\u0004\b\u001e\u0010 \"\u0004\b\u001e\u0010\u0017R+\u0010.\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b8C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010+\u001a\u0004\b\u001b\u0010 \"\u0004\b,\u0010\u0017R+\u0010\u0019\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b8C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010+\u001a\u0004\b.\u0010 \"\u0004\b'\u0010\u0017R+\u0010-\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b8C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010+\u001a\u0004\b,\u0010 \"\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020/8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u00100"}, d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshState;", "", "Lkotlinx/coroutines/CoroutineScope;", "animationScope", "Landroidx/compose/runtime/State;", "Lkotlin/Function0;", "", "onRefreshState", "", "refreshingOffset", "threshold", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/State;FF)V", "pullDelta", "onPull$material", "(F)F", "velocity", "onRelease$material", "", "refreshing", "setRefreshing$material", "(Z)V", "setThreshold$material", "(F)V", "setRefreshingOffset$material", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizesFor", "Landroidx/compose/runtime/State;", "Camera2StreamConfigurationMap", "getProgress", "()F", "progress", "getRefreshing$material", "()Z", "getPosition$material", com.daon.sdk.face.license.License.FEATURE_POSITION, "getThreshold$material", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "p0", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/MutableFloatState;", "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "getInputFormats", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/foundation/MutatorMutex;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PullRefreshState {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.State<kotlin.jvm.functions.Function0<kotlin.Unit>> Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.State getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.pullrefresh.PullRefreshState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Float.valueOf(androidx.compose.material.pullrefresh.PullRefreshState.$r8$lambda$AyHQOblDy54LLx3HOvK1LOCmyrw(androidx.compose.material.pullrefresh.PullRefreshState.this));
        }
    });

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getHighSpeedVideoFpsRanges = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState getHighSpeedVideoSizes = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState getInputFormats = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.foundation.MutatorMutex getHighSpeedVideoSizesFor = new androidx.compose.foundation.MutatorMutex();

    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshState(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> state, float f, float f2) {
        this.getHighSpeedVideoFpsRangesFor = coroutineScope;
        this.Camera2StreamConfigurationMap = state;
        this.getInputSizeshNQ4ISI = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        this.getOutputMinFrameDuration = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
    }

    public final float getProgress() {
        return getHighSpeedVideoFpsRanges() / getThreshold$material();
    }

    public final boolean getRefreshing$material() {
        return getHighResolutionOutputSizeshNQ4ISI();
    }

    public final float getPosition$material() {
        return Camera2StreamConfigurationMap();
    }

    public final float getThreshold$material() {
        return getInputFormats();
    }

    private final float getHighSpeedVideoFpsRanges() {
        return ((java.lang.Number) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).floatValue();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return ((java.lang.Boolean) this.getHighSpeedVideoFpsRanges.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float Camera2StreamConfigurationMap() {
        return this.getHighSpeedVideoSizes.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(float f) {
        this.getHighSpeedVideoSizes.setFloatValue(f);
    }

    private final float getHighSpeedVideoFpsRangesFor() {
        return this.getInputFormats.getFloatValue();
    }

    private final void getHighSpeedVideoSizes(float f) {
        this.getInputFormats.setFloatValue(f);
    }

    private final void getHighSpeedVideoFpsRanges(float f) {
        this.getInputSizeshNQ4ISI.setFloatValue(f);
    }

    private final float getInputFormats() {
        return this.getInputSizeshNQ4ISI.getFloatValue();
    }

    private final void getHighSpeedVideoFpsRangesFor(float f) {
        this.getOutputMinFrameDuration.setFloatValue(f);
    }

    private final float getHighSpeedVideoSizes() {
        return this.getOutputMinFrameDuration.getFloatValue();
    }

    public final float onPull$material(float pullDelta) {
        float threshold$material;
        if (getHighResolutionOutputSizeshNQ4ISI()) {
            return 0.0f;
        }
        float coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(getHighSpeedVideoFpsRangesFor() + pullDelta, 0.0f);
        float highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoSizes(coerceAtLeast);
        if (getHighSpeedVideoFpsRanges() <= getThreshold$material()) {
            threshold$material = getHighSpeedVideoFpsRanges();
        } else {
            float abs = java.lang.Math.abs(getProgress()) - 1.0f;
            float f = abs >= 0.0f ? abs : 0.0f;
            if (f > 2.0f) {
                f = 2.0f;
            }
            threshold$material = getThreshold$material() + (getThreshold$material() * (f - (((float) java.lang.Math.pow(f, 2.0d)) / 4.0f)));
        }
        Camera2StreamConfigurationMap(threshold$material);
        return coerceAtLeast - highSpeedVideoFpsRangesFor;
    }

    public final float onRelease$material(float velocity) {
        if (getRefreshing$material()) {
            return 0.0f;
        }
        if (getHighSpeedVideoFpsRanges() > getThreshold$material()) {
            this.Camera2StreamConfigurationMap.getValue().invoke();
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRangesFor, null, null, new androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1(this, 0.0f, null), 3, null);
        if (getHighSpeedVideoFpsRangesFor() == 0.0f || velocity < 0.0f) {
            velocity = 0.0f;
        }
        getHighSpeedVideoSizes(0.0f);
        return velocity;
    }

    public final void setRefreshing$material(boolean refreshing) {
        if (getHighResolutionOutputSizeshNQ4ISI() != refreshing) {
            getHighResolutionOutputSizeshNQ4ISI(refreshing);
            getHighSpeedVideoSizes(0.0f);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRangesFor, null, null, new androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1(this, refreshing ? getHighSpeedVideoSizes() : 0.0f, null), 3, null);
        }
    }

    public final void setThreshold$material(float threshold) {
        getHighSpeedVideoFpsRanges(threshold);
    }

    public final void setRefreshingOffset$material(float refreshingOffset) {
        if (getHighSpeedVideoSizes() == refreshingOffset) {
            return;
        }
        getHighSpeedVideoFpsRangesFor(refreshingOffset);
        if (getRefreshing$material()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRangesFor, null, null, new androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1(this, refreshingOffset, null), 3, null);
        }
    }

    public static /* synthetic */ float $r8$lambda$AyHQOblDy54LLx3HOvK1LOCmyrw(androidx.compose.material.pullrefresh.PullRefreshState pullRefreshState) {
        return pullRefreshState.getHighSpeedVideoFpsRangesFor() * 0.5f;
    }
}
