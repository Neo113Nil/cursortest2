package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0003J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0003J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0014R\u001e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001e"}, d2 = {"Lkotlinx/serialization/json/internal/JsonPath;", "", "<init>", "()V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "sd", "", "pushDescriptor", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "updateDescriptorIndex", "(I)V", "key", "updateCurrentMapKey", "(Ljava/lang/Object;)V", "resetCurrentMapKey", "popDescriptor", "", "getPath", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "toString", "", "Camera2StreamConfigurationMap", "[Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "", "[I", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Tombstone"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonPath {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.Object[] getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object[8];

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int[] getHighSpeedVideoFpsRangesFor;

    public JsonPath() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.getHighSpeedVideoFpsRangesFor = iArr;
        this.getHighSpeedVideoFpsRanges = -1;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/json/internal/JsonPath$Tombstone;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Tombstone {
        public static final kotlinx.serialization.json.internal.JsonPath.Tombstone INSTANCE = new kotlinx.serialization.json.internal.JsonPath.Tombstone();

        private Tombstone() {
        }
    }

    public final void pushDescriptor(kotlinx.serialization.descriptors.SerialDescriptor sd) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sd, "");
        int i = this.getHighSpeedVideoFpsRanges + 1;
        this.getHighSpeedVideoFpsRanges = i;
        if (i == this.getHighResolutionOutputSizeshNQ4ISI.length) {
            getHighSpeedVideoSizes();
        }
        this.getHighResolutionOutputSizeshNQ4ISI[i] = sd;
    }

    public final void updateDescriptorIndex(int index) {
        this.getHighSpeedVideoFpsRangesFor[this.getHighSpeedVideoFpsRanges] = index;
    }

    public final void updateCurrentMapKey(java.lang.Object key) {
        int[] iArr = this.getHighSpeedVideoFpsRangesFor;
        int i = this.getHighSpeedVideoFpsRanges;
        if (iArr[i] != -2) {
            int i2 = i + 1;
            this.getHighSpeedVideoFpsRanges = i2;
            if (i2 == this.getHighResolutionOutputSizeshNQ4ISI.length) {
                getHighSpeedVideoSizes();
            }
        }
        java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i3 = this.getHighSpeedVideoFpsRanges;
        objArr[i3] = key;
        this.getHighSpeedVideoFpsRangesFor[i3] = -2;
    }

    public final void resetCurrentMapKey() {
        int[] iArr = this.getHighSpeedVideoFpsRangesFor;
        int i = this.getHighSpeedVideoFpsRanges;
        if (iArr[i] == -2) {
            this.getHighResolutionOutputSizeshNQ4ISI[i] = kotlinx.serialization.json.internal.JsonPath.Tombstone.INSTANCE;
        }
    }

    public final void popDescriptor() {
        int i = this.getHighSpeedVideoFpsRanges;
        int[] iArr = this.getHighSpeedVideoFpsRangesFor;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            this.getHighSpeedVideoFpsRanges = i - 1;
        }
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (i2 != -1) {
            this.getHighSpeedVideoFpsRanges = i2 - 1;
        }
    }

    public final java.lang.String getPath() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        int i = this.getHighSpeedVideoFpsRanges;
        for (int i2 = 0; i2 < i + 1; i2++) {
            java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI[i2];
            if (obj instanceof kotlinx.serialization.descriptors.SerialDescriptor) {
                kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = (kotlinx.serialization.descriptors.SerialDescriptor) obj;
                if (kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptor.getKind(), kotlinx.serialization.descriptors.StructureKind.LIST.INSTANCE)) {
                    if (this.getHighSpeedVideoFpsRangesFor[i2] != -1) {
                        sb.append("[");
                        sb.append(this.getHighSpeedVideoFpsRangesFor[i2]);
                        sb.append("]");
                    }
                } else {
                    int i3 = this.getHighSpeedVideoFpsRangesFor[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.getElementName(i3));
                    }
                }
            } else if (obj != kotlinx.serialization.json.internal.JsonPath.Tombstone.INSTANCE) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    private final void getHighSpeedVideoSizes() {
        int i = this.getHighSpeedVideoFpsRanges * 2;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.getHighResolutionOutputSizeshNQ4ISI, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        this.getHighResolutionOutputSizeshNQ4ISI = copyOf;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        kotlin.collections.ArraysKt.copyInto$default(this.getHighSpeedVideoFpsRangesFor, iArr, 0, 0, 0, 14, (java.lang.Object) null);
        this.getHighSpeedVideoFpsRangesFor = iArr;
    }

    public final java.lang.String toString() {
        return getPath();
    }
}
