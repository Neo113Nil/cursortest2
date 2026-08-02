package kotlinx.datetime.internal.format.formatter;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B-\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00028\u00002\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018"}, d2 = {"Lkotlinx/datetime/internal/format/formatter/SignedIntFormatterStructure;", "T", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlin/Function1;", "", "number", "zeroPadding", "outputPlusOnExceededWidth", "<init>", "(Lkotlin/jvm/functions/Function1;ILjava/lang/Integer;)V", "obj", "Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "builder", "", "minusNotRequired", "", "format", "(Ljava/lang/Object;Ljava/lang/Appendable;Z)V", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "Ljava/lang/Integer;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SignedIntFormatterStructure<T> implements kotlinx.datetime.internal.format.formatter.FormatterStructure<T> {
    private final int Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Integer getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<T, java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public SignedIntFormatterStructure(kotlin.jvm.functions.Function1<? super T, java.lang.Integer> function1, int i, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRanges = num;
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The minimum number of digits (");
            sb.append(i);
            sb.append(") is negative");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (i <= 9) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The minimum number of digits (");
        sb2.append(i);
        sb2.append(") exceeds the length of an Int");
        throw new java.lang.IllegalArgumentException(sb2.toString().toString());
    }

    @Override // kotlinx.datetime.internal.format.formatter.FormatterStructure
    public final void format(T obj, java.lang.Appendable builder, boolean minusNotRequired) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int intValue = this.getHighResolutionOutputSizeshNQ4ISI.invoke(obj).intValue();
        if (minusNotRequired && intValue < 0) {
            intValue = -intValue;
        }
        if (this.getHighSpeedVideoFpsRanges != null && intValue >= kotlinx.datetime.internal.MathKt.getPOWERS_OF_TEN()[this.getHighSpeedVideoFpsRanges.intValue()]) {
            sb.append('+');
        }
        if (java.lang.Math.abs(intValue) >= kotlinx.datetime.internal.MathKt.getPOWERS_OF_TEN()[this.Camera2StreamConfigurationMap - 1]) {
            sb.append(intValue);
        } else if (intValue >= 0) {
            sb.append(intValue + kotlinx.datetime.internal.MathKt.getPOWERS_OF_TEN()[this.Camera2StreamConfigurationMap]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(0), "");
        } else {
            sb.append(intValue - kotlinx.datetime.internal.MathKt.getPOWERS_OF_TEN()[this.Camera2StreamConfigurationMap]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(1), "");
        }
        builder.append(sb);
    }
}
