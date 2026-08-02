package kotlinx.serialization.internal;

@kotlinx.serialization.internal.CoreFriendModuleApi
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lkotlinx/serialization/internal/ElementMarker;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlin/Function2;", "", "", "readIfAbsent", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function2;)V", "index", "", "mark", "(I)V", "nextUnmarkedIndex", "()I", "Camera2StreamConfigurationMap", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRanges", "", "getHighSpeedVideoFpsRangesFor", "J", "", "getHighResolutionOutputSizeshNQ4ISI", "[J", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ElementMarker {
    private static final kotlinx.serialization.internal.ElementMarker.Companion Companion = new kotlinx.serialization.internal.ElementMarker.Companion(null);
    private static final long[] getHighSpeedVideoFpsRanges = new long[0];

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.serialization.descriptors.SerialDescriptor getHighSpeedVideoSizes;
    private final long[] getHighResolutionOutputSizeshNQ4ISI;
    private long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<kotlinx.serialization.descriptors.SerialDescriptor, java.lang.Integer, java.lang.Boolean> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public ElementMarker(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlin.jvm.functions.Function2<? super kotlinx.serialization.descriptors.SerialDescriptor, ? super java.lang.Integer, java.lang.Boolean> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.getHighSpeedVideoSizes = serialDescriptor;
        this.getHighSpeedVideoFpsRanges = function2;
        int elementsCount = serialDescriptor.getElementsCount();
        if (elementsCount <= 64) {
            this.getHighSpeedVideoFpsRangesFor = elementsCount != 64 ? (-1) << elementsCount : 0L;
            this.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges;
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = 0L;
        long[] jArr = new long[(elementsCount - 1) >>> 6];
        if ((elementsCount & 63) != 0) {
            jArr[kotlin.collections.ArraysKt.getLastIndex(jArr)] = (-1) << elementsCount;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = jArr;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/serialization/internal/ElementMarker$Companion;", "", "<init>", "()V", "", "getHighSpeedVideoFpsRanges", "[J", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void mark(int index) {
        if (index < 64) {
            this.getHighSpeedVideoFpsRangesFor = (1 << index) | this.getHighSpeedVideoFpsRangesFor;
        } else {
            int i = (index >>> 6) - 1;
            long[] jArr = this.getHighResolutionOutputSizeshNQ4ISI;
            jArr[i] = (1 << (index & 63)) | jArr[i];
        }
    }

    public final int nextUnmarkedIndex() {
        int numberOfTrailingZeros;
        int elementsCount = this.getHighSpeedVideoSizes.getElementsCount();
        do {
            long j = this.getHighSpeedVideoFpsRangesFor;
            if (j == -1) {
                if (elementsCount > 64) {
                    int length = this.getHighResolutionOutputSizeshNQ4ISI.length;
                    int i = 0;
                    while (i < length) {
                        int i2 = i + 1;
                        long j2 = this.getHighResolutionOutputSizeshNQ4ISI[i];
                        while (j2 != -1) {
                            int numberOfTrailingZeros2 = java.lang.Long.numberOfTrailingZeros(~j2);
                            j2 |= 1 << numberOfTrailingZeros2;
                            int i3 = numberOfTrailingZeros2 + (i2 * 64);
                            if (this.getHighSpeedVideoFpsRanges.invoke(this.getHighSpeedVideoSizes, java.lang.Integer.valueOf(i3)).booleanValue()) {
                                this.getHighResolutionOutputSizeshNQ4ISI[i] = j2;
                                return i3;
                            }
                        }
                        this.getHighResolutionOutputSizeshNQ4ISI[i] = j2;
                        i = i2;
                    }
                }
                return -1;
            }
            numberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(~j);
            this.getHighSpeedVideoFpsRangesFor |= 1 << numberOfTrailingZeros;
        } while (!this.getHighSpeedVideoFpsRanges.invoke(this.getHighSpeedVideoSizes, java.lang.Integer.valueOf(numberOfTrailingZeros)).booleanValue());
        return numberOfTrailingZeros;
    }
}
