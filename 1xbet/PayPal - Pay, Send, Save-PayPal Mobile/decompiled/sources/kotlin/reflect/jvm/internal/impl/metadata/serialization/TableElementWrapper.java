package kotlin.reflect.jvm.internal.impl.metadata.serialization;

/* loaded from: classes17.dex */
final class TableElementWrapper<Element extends kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder<?, Element>> {
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final Element getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;

    public TableElementWrapper(Element element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        this.getHighSpeedVideoFpsRanges = element;
        byte[] byteArray = element.build().toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "");
        this.getHighResolutionOutputSizeshNQ4ISI = byteArray;
        this.getHighSpeedVideoFpsRangesFor = java.util.Arrays.hashCode(byteArray);
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof kotlin.reflect.jvm.internal.impl.metadata.serialization.TableElementWrapper) && java.util.Arrays.equals(this.getHighResolutionOutputSizeshNQ4ISI, ((kotlin.reflect.jvm.internal.impl.metadata.serialization.TableElementWrapper) obj).getHighResolutionOutputSizeshNQ4ISI);
    }
}
