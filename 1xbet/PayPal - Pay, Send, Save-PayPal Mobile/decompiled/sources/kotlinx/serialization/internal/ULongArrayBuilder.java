package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00068\u0011@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lkotlinx/serialization/internal/ULongArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Lkotlin/ULongArray;", "bufferWithData", "<init>", "([JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "requiredCapacity", "", "ensureCapacity$kotlinx_serialization_core", "(I)V", "Lkotlin/ULong;", "c", "append-VKZWuLQ$kotlinx_serialization_core", "(J)V", "append", "build-Y2RjT0g$kotlinx_serialization_core", "()[J", "build", "getHighSpeedVideoSizes", "[J", "Camera2StreamConfigurationMap", "p0", com.daon.sdk.face.license.License.FEATURE_POSITION, com.visa.cbp.getEncExpo.warmup, "getPosition$kotlinx_serialization_core", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
/* loaded from: classes5.dex */
public final class ULongArrayBuilder extends kotlinx.serialization.internal.PrimitiveArrayBuilder<kotlin.ULongArray> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private long[] Camera2StreamConfigurationMap;
    private int position;

    private ULongArrayBuilder(long[] jArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jArr, "");
        this.Camera2StreamConfigurationMap = jArr;
        this.position = kotlin.ULongArray.m23508getSizeimpl(jArr);
        ensureCapacity$kotlinx_serialization_core(10);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final /* synthetic */ kotlin.ULongArray build$kotlinx_serialization_core() {
        return kotlin.ULongArray.m23500boximpl(m24240buildY2RjT0g$kotlinx_serialization_core());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* renamed from: getPosition$kotlinx_serialization_core, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final void ensureCapacity$kotlinx_serialization_core(int requiredCapacity) {
        if (kotlin.ULongArray.m23508getSizeimpl(this.Camera2StreamConfigurationMap) < requiredCapacity) {
            long[] jArr = this.Camera2StreamConfigurationMap;
            long[] copyOf = java.util.Arrays.copyOf(jArr, kotlin.ranges.RangesKt.coerceAtLeast(requiredCapacity, kotlin.ULongArray.m23508getSizeimpl(jArr) * 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.Camera2StreamConfigurationMap = kotlin.ULongArray.m23502constructorimpl(copyOf);
        }
    }

    /* renamed from: append-VKZWuLQ$kotlinx_serialization_core, reason: not valid java name */
    public final void m24239appendVKZWuLQ$kotlinx_serialization_core(long c) {
        kotlinx.serialization.internal.PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        long[] jArr = this.Camera2StreamConfigurationMap;
        int position = getPosition();
        this.position = position + 1;
        kotlin.ULongArray.m23512setk8EXiF4(jArr, position, c);
    }

    /* renamed from: build-Y2RjT0g$kotlinx_serialization_core, reason: not valid java name */
    public final long[] m24240buildY2RjT0g$kotlinx_serialization_core() {
        long[] copyOf = java.util.Arrays.copyOf(this.Camera2StreamConfigurationMap, getPosition());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        return kotlin.ULongArray.m23502constructorimpl(copyOf);
    }

    public /* synthetic */ ULongArrayBuilder(long[] jArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(jArr);
    }
}
