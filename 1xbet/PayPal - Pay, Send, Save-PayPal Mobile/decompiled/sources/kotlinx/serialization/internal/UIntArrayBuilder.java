package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0011@RX\u0090\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lkotlinx/serialization/internal/UIntArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Lkotlin/UIntArray;", "bufferWithData", "<init>", "([ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "requiredCapacity", "", "ensureCapacity$kotlinx_serialization_core", "(I)V", "Lkotlin/UInt;", "c", "append-WZ4Q5Ns$kotlinx_serialization_core", "append", "build--hP7Qyg$kotlinx_serialization_core", "()[I", "build", "getHighResolutionOutputSizeshNQ4ISI", "[I", "getHighSpeedVideoSizes", "p0", com.daon.sdk.face.license.License.FEATURE_POSITION, com.visa.cbp.getEncExpo.warmup, "getPosition$kotlinx_serialization_core", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
/* loaded from: classes5.dex */
public final class UIntArrayBuilder extends kotlinx.serialization.internal.PrimitiveArrayBuilder<kotlin.UIntArray> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int[] getHighSpeedVideoSizes;
    private int position;

    private UIntArrayBuilder(int[] iArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        this.getHighSpeedVideoSizes = iArr;
        this.position = kotlin.UIntArray.m23484getSizeimpl(iArr);
        ensureCapacity$kotlinx_serialization_core(10);
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final /* synthetic */ kotlin.UIntArray build$kotlinx_serialization_core() {
        return kotlin.UIntArray.m23476boximpl(m24232buildhP7Qyg$kotlinx_serialization_core());
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    /* renamed from: getPosition$kotlinx_serialization_core, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @Override // kotlinx.serialization.internal.PrimitiveArrayBuilder
    public final void ensureCapacity$kotlinx_serialization_core(int requiredCapacity) {
        if (kotlin.UIntArray.m23484getSizeimpl(this.getHighSpeedVideoSizes) < requiredCapacity) {
            int[] iArr = this.getHighSpeedVideoSizes;
            int[] copyOf = java.util.Arrays.copyOf(iArr, kotlin.ranges.RangesKt.coerceAtLeast(requiredCapacity, kotlin.UIntArray.m23484getSizeimpl(iArr) * 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.getHighSpeedVideoSizes = kotlin.UIntArray.m23478constructorimpl(copyOf);
        }
    }

    /* renamed from: append-WZ4Q5Ns$kotlinx_serialization_core, reason: not valid java name */
    public final void m24231appendWZ4Q5Ns$kotlinx_serialization_core(int c) {
        kotlinx.serialization.internal.PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, null);
        int[] iArr = this.getHighSpeedVideoSizes;
        int position = getPosition();
        this.position = position + 1;
        kotlin.UIntArray.m23488setVXSXFK8(iArr, position, c);
    }

    /* renamed from: build--hP7Qyg$kotlinx_serialization_core, reason: not valid java name */
    public final int[] m24232buildhP7Qyg$kotlinx_serialization_core() {
        int[] copyOf = java.util.Arrays.copyOf(this.getHighSpeedVideoSizes, getPosition());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        return kotlin.UIntArray.m23478constructorimpl(copyOf);
    }

    public /* synthetic */ UIntArrayBuilder(int[] iArr, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr);
    }
}
