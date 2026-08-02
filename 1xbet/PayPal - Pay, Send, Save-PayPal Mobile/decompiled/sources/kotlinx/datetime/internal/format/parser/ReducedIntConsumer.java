package kotlinx.datetime.internal.format.parser;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014"}, d2 = {"Lkotlinx/datetime/internal/format/parser/ReducedIntConsumer;", "Receiver", "Lkotlinx/datetime/internal/format/parser/NumberConsumer;", "", "length", "Lkotlinx/datetime/internal/format/parser/AssignableField;", "setter", "", "name", "base", "<init>", "(ILkotlinx/datetime/internal/format/parser/AssignableField;Ljava/lang/String;I)V", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "", "input", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "consume", "(Ljava/lang/Object;Ljava/lang/CharSequence;II)Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", com.visa.cbp.getEncExpo.warmup, "getLength", "()Ljava/lang/Integer;", "Camera2StreamConfigurationMap", "Lkotlinx/datetime/internal/format/parser/AssignableField;", "getHighSpeedVideoFpsRangesFor", "getBase", "()I", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ReducedIntConsumer<Receiver> extends kotlinx.datetime.internal.format.parser.NumberConsumer<Receiver> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.datetime.internal.format.parser.AssignableField<Receiver, java.lang.Integer> getHighSpeedVideoFpsRangesFor;
    private final int base;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int length;

    @Override // kotlinx.datetime.internal.format.parser.NumberConsumer
    public final java.lang.Integer getLength() {
        return java.lang.Integer.valueOf(this.length);
    }

    public final int getBase() {
        return this.base;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReducedIntConsumer(int i, kotlinx.datetime.internal.format.parser.AssignableField<? super Receiver, java.lang.Integer> assignableField, java.lang.String str, int i2) {
        super(java.lang.Integer.valueOf(i), str, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assignableField, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.length = i;
        this.getHighSpeedVideoFpsRangesFor = assignableField;
        this.base = i2;
        int i3 = kotlinx.datetime.internal.MathKt.getPOWERS_OF_TEN()[getLength().intValue()];
        this.getHighResolutionOutputSizeshNQ4ISI = i3;
        int i4 = i2 % i3;
        this.getHighSpeedVideoSizes = i4;
        this.getHighSpeedVideoFpsRanges = i2 - i4;
        int intValue = getLength().intValue();
        if (intValue <= 0 || intValue >= 10) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid length for field ");
            sb.append(getWhatThisExpects());
            sb.append(": ");
            sb.append(getLength().intValue());
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
    }

    @Override // kotlinx.datetime.internal.format.parser.NumberConsumer
    public final kotlinx.datetime.internal.format.parser.NumberConsumptionError consume(Receiver storage, java.lang.CharSequence input, int start, int end) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        int access$parseAsciiInt = kotlinx.datetime.internal.format.parser.NumberConsumerKt.access$parseAsciiInt(input, start, end);
        kotlinx.datetime.internal.format.parser.AssignableField<Receiver, java.lang.Integer> assignableField = this.getHighSpeedVideoFpsRangesFor;
        if (access$parseAsciiInt >= this.getHighSpeedVideoSizes) {
            i = this.getHighSpeedVideoFpsRanges;
        } else {
            i = this.getHighSpeedVideoFpsRanges + this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return kotlinx.datetime.internal.format.parser.NumberConsumerKt.access$setWithoutReassigning(assignableField, storage, java.lang.Integer.valueOf(i + access$parseAsciiInt));
    }
}
