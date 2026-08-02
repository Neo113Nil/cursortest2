package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068\u0011@RX\u0091\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lkotlinx/serialization/internal/DoubleArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "", "bufferWithData", "<init>", "([D)V", "", "requiredCapacity", "", "ensureCapacity$kotlinx_serialization_core", "(I)V", "", "c", "append$kotlinx_serialization_core", "(D)V", "build$kotlinx_serialization_core", "()[D", "Camera2StreamConfigurationMap", "[D", "p0", com.daon.sdk.face.license.License.FEATURE_POSITION, com.visa.cbp.getEncExpo.warmup, "getPosition$kotlinx_serialization_core", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DoubleArrayBuilder extends kotlinx.serialization.internal.PrimitiveArrayBuilder<double[]> {
    private double[] Camera2StreamConfigurationMap;
    private int position;

    public DoubleArrayBuilder(double[] dArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dArr, "");
        this.Camera2StreamConfigurationMap = dArr;
        this.position = dArr.length;
        ensureCapacity$kotlinx_serialization_core(10);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* renamed from: getPosition$kotlinx_serialization_core, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final void ensureCapacity$kotlinx_serialization_core(int requiredCapacity) {
        double[] dArr = this.Camera2StreamConfigurationMap;
        if (dArr.length < requiredCapacity) {
            double[] copyOf = java.util.Arrays.copyOf(dArr, kotlin.ranges.RangesKt.coerceAtLeast(requiredCapacity, dArr.length * 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.Camera2StreamConfigurationMap = copyOf;
        }
    }

    public final void append$kotlinx_serialization_core(double c) {
        kotlinx.serialization.internal.PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        double[] dArr = this.Camera2StreamConfigurationMap;
        int position = getPosition();
        this.position = position + 1;
        dArr[position] = c;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final double[] build$kotlinx_serialization_core() {
        double[] copyOf = java.util.Arrays.copyOf(this.Camera2StreamConfigurationMap, getPosition());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        return copyOf;
    }
}
