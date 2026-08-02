package androidx.camera.viewfinder.core.impl;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u001cB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/camera/viewfinder/core/impl/RefCounted;", "", "T", "", "debugRefCounts", "Lkotlin/Function1;", "", "onRelease", "<init>", "(ZLkotlin/jvm/functions/Function1;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "initialize", "(Ljava/lang/Object;)V", "acquire", "()Ljava/lang/Object;", "release", "()V", "getHighSpeedVideoSizes", "Z", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlin/Pair;", "", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/atomicfu/AtomicRef;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefCounted<T> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicRef<kotlin.Pair<T, java.lang.Integer>> getHighSpeedVideoFpsRanges;
    private final kotlin.jvm.functions.Function1<T, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.viewfinder.core.impl.RefCounted.Companion INSTANCE = new androidx.camera.viewfinder.core.impl.RefCounted.Companion(null);
    private static final kotlin.Pair<kotlin.Unit, java.lang.Integer> Camera2StreamConfigurationMap = new kotlin.Pair<>(kotlin.Unit.INSTANCE, -1);
    private static final kotlin.Pair<kotlin.Unit, java.lang.Integer> getHighSpeedVideoFpsRanges = new kotlin.Pair<>(kotlin.Unit.INSTANCE, 0);

    /* JADX WARN: Multi-variable type inference failed */
    public RefCounted(boolean z, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoFpsRanges = kotlinx.atomicfu.AtomicFU.atomic(androidx.camera.viewfinder.core.impl.RefCounted.Companion.access$uninitialized(INSTANCE));
    }

    public /* synthetic */ RefCounted(boolean z, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, function1);
    }

    public final void initialize(T newValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newValue, "");
        if (!this.getHighSpeedVideoFpsRanges.compareAndSet(androidx.camera.viewfinder.core.impl.RefCounted.Companion.access$uninitialized(INSTANCE), new kotlin.Pair<>(newValue, 1))) {
            throw new java.lang.IllegalStateException("Ref-count managed object has already been initialized.".toString());
        }
        if (this.Camera2StreamConfigurationMap) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.lang.String.format("%x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(hashCode())}, 1)), "");
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(newValue.getClass()).getSimpleName();
            java.util.Objects.toString(newValue);
        }
    }

    public final T acquire() {
        kotlin.Pair<T, java.lang.Integer> value;
        T component1;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges.getValue(), androidx.camera.viewfinder.core.impl.RefCounted.Companion.access$uninitialized(INSTANCE))) {
            throw new java.lang.IllegalStateException("Ref-count managed object has not yet been initialized. Unable to acquire.".toString());
        }
        kotlinx.atomicfu.AtomicRef<kotlin.Pair<T, java.lang.Integer>> atomicRef = this.getHighSpeedVideoFpsRanges;
        do {
            value = atomicRef.getValue();
            if (kotlin.jvm.internal.Intrinsics.areEqual(value, androidx.camera.viewfinder.core.impl.RefCounted.Companion.access$released(INSTANCE))) {
                if (!this.Camera2StreamConfigurationMap) {
                    return null;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.lang.String.format("%x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(hashCode())}, 1)), "");
                return null;
            }
            component1 = value.component1();
        } while (!this.getHighSpeedVideoFpsRanges.compareAndSet(value, new kotlin.Pair<>(component1, java.lang.Integer.valueOf(value.component2().intValue() + 1))));
        if (this.Camera2StreamConfigurationMap) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.lang.String.format("%x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(hashCode())}, 1)), "");
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(component1.getClass()).getSimpleName();
            java.util.Objects.toString(component1);
        }
        return component1;
    }

    public final void release() {
        kotlin.Pair<T, java.lang.Integer> value;
        androidx.camera.viewfinder.core.impl.RefCounted.Companion companion;
        T component1;
        kotlin.Pair<T, java.lang.Integer> access$released;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges.getValue(), androidx.camera.viewfinder.core.impl.RefCounted.Companion.access$uninitialized(INSTANCE))) {
            throw new java.lang.IllegalStateException("Ref-count managed object has not yet been initialized. Unable to release.".toString());
        }
        kotlinx.atomicfu.AtomicRef<kotlin.Pair<T, java.lang.Integer>> atomicRef = this.getHighSpeedVideoFpsRanges;
        do {
            value = atomicRef.getValue();
            companion = INSTANCE;
            if (kotlin.jvm.internal.Intrinsics.areEqual(value, androidx.camera.viewfinder.core.impl.RefCounted.Companion.access$released(companion))) {
                throw new java.lang.IllegalStateException("Release called more times than initialize + acquire.".toString());
            }
            component1 = value.component1();
            int intValue = value.component2().intValue();
            access$released = intValue == 1 ? androidx.camera.viewfinder.core.impl.RefCounted.Companion.access$released(companion) : new kotlin.Pair<>(component1, java.lang.Integer.valueOf(intValue - 1));
        } while (!this.getHighSpeedVideoFpsRanges.compareAndSet(value, access$released));
        if (kotlin.jvm.internal.Intrinsics.areEqual(access$released, androidx.camera.viewfinder.core.impl.RefCounted.Companion.access$released(companion))) {
            if (this.Camera2StreamConfigurationMap) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.lang.String.format("%x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(hashCode())}, 1)), "");
                kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(component1.getClass()).getSimpleName();
                java.util.Objects.toString(component1);
            }
            this.getHighSpeedVideoFpsRangesFor.invoke(component1);
            return;
        }
        if (this.Camera2StreamConfigurationMap) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.lang.String.format("%x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(hashCode())}, 1)), "");
            kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(component1.getClass()).getSimpleName();
            java.util.Objects.toString(component1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b"}, d2 = {"Landroidx/camera/viewfinder/core/impl/RefCounted$Companion;", "", "<init>", "()V", "Lkotlin/Pair;", "", "", "Camera2StreamConfigurationMap", "Lkotlin/Pair;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ kotlin.Pair access$released(androidx.camera.viewfinder.core.impl.RefCounted.Companion companion) {
            kotlin.Pair pair = androidx.camera.viewfinder.core.impl.RefCounted.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(pair, "");
            return pair;
        }

        public static final /* synthetic */ kotlin.Pair access$uninitialized(androidx.camera.viewfinder.core.impl.RefCounted.Companion companion) {
            kotlin.Pair pair = androidx.camera.viewfinder.core.impl.RefCounted.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Intrinsics.checkNotNull(pair, "");
            return pair;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
