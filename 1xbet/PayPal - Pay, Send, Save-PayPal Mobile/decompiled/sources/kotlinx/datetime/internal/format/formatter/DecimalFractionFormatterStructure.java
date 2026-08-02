package kotlinx.datetime.internal.format.formatter;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00028\u00002\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001c"}, d2 = {"Lkotlinx/datetime/internal/format/formatter/DecimalFractionFormatterStructure;", "T", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlin/Function1;", "Lkotlinx/datetime/internal/DecimalFraction;", "number", "", "minDigits", "maxDigits", "", "zerosToAdd", "<init>", "(Lkotlin/jvm/functions/Function1;IILjava/util/List;)V", "obj", "Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "builder", "", "minusNotRequired", "", "format", "(Ljava/lang/Object;Ljava/lang/Appendable;Z)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DecimalFractionFormatterStructure<T> implements kotlinx.datetime.internal.format.formatter.FormatterStructure<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<java.lang.Integer> getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<T, kotlinx.datetime.internal.DecimalFraction> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public DecimalFractionFormatterStructure(kotlin.jvm.functions.Function1<? super T, kotlinx.datetime.internal.DecimalFraction> function1, int i, int i2, java.util.List<java.lang.Integer> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.Camera2StreamConfigurationMap = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.getHighSpeedVideoSizes = list;
        if (i <= 0 || i >= 10) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The minimum number of digits (");
            sb.append(i);
            sb.append(") is not in range 1..9");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (i > i2 || i2 >= 10) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The maximum number of digits (");
            sb2.append(i2);
            sb2.append(") is not in range ");
            sb2.append(i);
            sb2.append("..9");
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
    }

    @Override // kotlinx.datetime.internal.format.formatter.FormatterStructure
    public final void format(T obj, java.lang.Appendable builder, boolean minusNotRequired) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        int fractionalPartWithNDigits = this.Camera2StreamConfigurationMap.invoke(obj).fractionalPartWithNDigits(this.getHighSpeedVideoFpsRangesFor);
        int i = 0;
        while (this.getHighSpeedVideoFpsRangesFor > this.getHighResolutionOutputSizeshNQ4ISI + i) {
            int i2 = i + 1;
            if (fractionalPartWithNDigits % kotlinx.datetime.internal.MathKt.getPOWERS_OF_TEN()[i2] != 0) {
                break;
            } else {
                i = i2;
            }
        }
        int intValue = this.getHighSpeedVideoSizes.get((this.getHighSpeedVideoFpsRangesFor - i) - 1).intValue();
        if (i >= intValue) {
            i -= intValue;
        }
        java.lang.String substring = java.lang.String.valueOf((fractionalPartWithNDigits / kotlinx.datetime.internal.MathKt.getPOWERS_OF_TEN()[i]) + kotlinx.datetime.internal.MathKt.getPOWERS_OF_TEN()[this.getHighSpeedVideoFpsRangesFor - i]).substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        builder.append(substring);
    }
}
