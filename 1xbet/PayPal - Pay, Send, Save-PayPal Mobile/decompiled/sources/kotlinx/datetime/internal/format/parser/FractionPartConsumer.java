package kotlinx.datetime.internal.format.parser;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lkotlinx/datetime/internal/format/parser/FractionPartConsumer;", "Receiver", "Lkotlinx/datetime/internal/format/parser/NumberConsumer;", "", "minLength", "maxLength", "Lkotlinx/datetime/internal/format/parser/AssignableField;", "Lkotlinx/datetime/internal/DecimalFraction;", "setter", "", "name", "<init>", "(IILkotlinx/datetime/internal/format/parser/AssignableField;Ljava/lang/String;)V", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "", "input", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "consume", "(Ljava/lang/Object;Ljava/lang/CharSequence;II)Lkotlinx/datetime/internal/format/parser/NumberConsumptionError;", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lkotlinx/datetime/internal/format/parser/AssignableField;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FractionPartConsumer<Receiver> extends kotlinx.datetime.internal.format.parser.NumberConsumer<Receiver> {
    private final kotlinx.datetime.internal.format.parser.AssignableField<Receiver, kotlinx.datetime.internal.DecimalFraction> Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FractionPartConsumer(int i, int i2, kotlinx.datetime.internal.format.parser.AssignableField<? super Receiver, kotlinx.datetime.internal.DecimalFraction> assignableField, java.lang.String str) {
        super(i == i2 ? java.lang.Integer.valueOf(i) : null, str, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assignableField, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRanges = i2;
        this.Camera2StreamConfigurationMap = assignableField;
        if (i <= 0 || i >= 10) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid minimum length ");
            sb.append(i);
            sb.append(" for field ");
            sb.append(getWhatThisExpects());
            sb.append(": expected 1..9");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (i > i2 || i2 >= 10) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid maximum length ");
            sb2.append(i2);
            sb2.append(" for field ");
            sb2.append(getWhatThisExpects());
            sb2.append(": expected ");
            sb2.append(i);
            sb2.append("..9");
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
    }

    @Override // kotlinx.datetime.internal.format.parser.NumberConsumer
    public final kotlinx.datetime.internal.format.parser.NumberConsumptionError consume(Receiver storage, java.lang.CharSequence input, int start, int end) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        int i = end - start;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i < i2) {
            return new kotlinx.datetime.internal.format.parser.NumberConsumptionError.TooFewDigits(i2);
        }
        int i3 = this.getHighSpeedVideoFpsRanges;
        return i > i3 ? new kotlinx.datetime.internal.format.parser.NumberConsumptionError.TooManyDigits(i3) : kotlinx.datetime.internal.format.parser.NumberConsumerKt.access$setWithoutReassigning(this.Camera2StreamConfigurationMap, storage, new kotlinx.datetime.internal.DecimalFraction(kotlinx.datetime.internal.format.parser.NumberConsumerKt.access$parseAsciiInt(input, start, end), i));
    }
}
