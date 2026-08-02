package kotlinx.datetime.internal.format.parser;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002BA\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lkotlinx/datetime/internal/format/parser/UnsignedIntConsumer;", "Receiver", "Lkotlinx/datetime/internal/format/parser/NumberConsumer;", "", "minLength", "maxLength", "Lkotlinx/datetime/internal/format/parser/AssignableField;", "setter", "", "name", "", "multiplyByMinus1", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/datetime/internal/format/parser/AssignableField;Ljava/lang/String;Z)V", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "", "input", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "consume", "(Ljava/lang/Object;Ljava/lang/CharSequence;II)Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Integer;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/datetime/internal/format/parser/AssignableField;", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UnsignedIntConsumer<Receiver> extends kotlinx.datetime.internal.format.parser.NumberConsumer<Receiver> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.datetime.internal.format.parser.AssignableField<Receiver, java.lang.Integer> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.Integer getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.Integer getHighSpeedVideoFpsRanges;

    public /* synthetic */ UnsignedIntConsumer(java.lang.Integer num, java.lang.Integer num2, kotlinx.datetime.internal.format.parser.AssignableField assignableField, java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, assignableField, str, (i & 16) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnsignedIntConsumer(java.lang.Integer num, java.lang.Integer num2, kotlinx.datetime.internal.format.parser.AssignableField<? super Receiver, java.lang.Integer> assignableField, java.lang.String str, boolean z) {
        super(kotlin.jvm.internal.Intrinsics.areEqual(num, num2) ? num : null, str, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assignableField, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRanges = num;
        this.getHighResolutionOutputSizeshNQ4ISI = num2;
        this.Camera2StreamConfigurationMap = assignableField;
        this.getHighSpeedVideoSizes = z;
        if (getLength() == null || new kotlin.ranges.IntRange(1, 9).contains(getLength().intValue())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid length for field ");
        sb.append(getWhatThisExpects());
        sb.append(": ");
        sb.append(getLength());
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    @Override // kotlinx.datetime.internal.format.parser.NumberConsumer
    public final kotlinx.datetime.internal.format.parser.NumberConsumptionError consume(Receiver storage, java.lang.CharSequence input, int start, int end) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.Integer num = this.getHighResolutionOutputSizeshNQ4ISI;
        if (num != null && end - start > num.intValue()) {
            return new kotlinx.datetime.internal.format.parser.NumberConsumptionError.TooManyDigits(this.getHighResolutionOutputSizeshNQ4ISI.intValue());
        }
        java.lang.Integer num2 = this.getHighSpeedVideoFpsRanges;
        if (num2 != null && end - start < num2.intValue()) {
            return new kotlinx.datetime.internal.format.parser.NumberConsumptionError.TooFewDigits(this.getHighSpeedVideoFpsRanges.intValue());
        }
        java.lang.Integer access$parseAsciiIntOrNull = kotlinx.datetime.internal.format.parser.NumberConsumerKt.access$parseAsciiIntOrNull(input, start, end);
        if (access$parseAsciiIntOrNull == null) {
            return kotlinx.datetime.internal.format.parser.NumberConsumptionError.ExpectedInt.INSTANCE;
        }
        kotlinx.datetime.internal.format.parser.AssignableField<Receiver, java.lang.Integer> assignableField = this.Camera2StreamConfigurationMap;
        boolean z = this.getHighSpeedVideoSizes;
        int intValue = access$parseAsciiIntOrNull.intValue();
        if (z) {
            intValue = -intValue;
        }
        return kotlinx.datetime.internal.format.parser.NumberConsumerKt.access$setWithoutReassigning(assignableField, storage, java.lang.Integer.valueOf(intValue));
    }
}
