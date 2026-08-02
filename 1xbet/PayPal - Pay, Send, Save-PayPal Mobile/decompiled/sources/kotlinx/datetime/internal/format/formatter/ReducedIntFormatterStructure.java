package kotlinx.datetime.internal.format.formatter;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B+\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00028\u00002\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016"}, d2 = {"Lkotlinx/datetime/internal/format/formatter/ReducedIntFormatterStructure;", "T", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlin/Function1;", "", "number", "digits", "base", "<init>", "(Lkotlin/jvm/functions/Function1;II)V", "obj", "Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "builder", "", "minusNotRequired", "", "format", "(Ljava/lang/Object;Ljava/lang/Appendable;Z)V", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ReducedIntFormatterStructure<T> implements kotlinx.datetime.internal.format.formatter.FormatterStructure<T> {
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;
    private final kotlin.jvm.functions.Function1<T, java.lang.Integer> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public ReducedIntFormatterStructure(kotlin.jvm.functions.Function1<? super T, java.lang.Integer> function1, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = function1;
        this.Camera2StreamConfigurationMap = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
    }

    @Override // kotlinx.datetime.internal.format.formatter.FormatterStructure
    public final void format(T obj, java.lang.Appendable builder, boolean minusNotRequired) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        int intValue = this.getHighSpeedVideoSizes.invoke(obj).intValue();
        int i = kotlinx.datetime.internal.MathKt.getPOWERS_OF_TEN()[this.Camera2StreamConfigurationMap];
        int i2 = intValue - this.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 >= 0 && i2 < i) {
            java.lang.String valueOf = java.lang.String.valueOf(intValue % kotlinx.datetime.internal.MathKt.getPOWERS_OF_TEN()[this.Camera2StreamConfigurationMap]);
            kotlin.text.StringsKt.append(builder, kotlin.text.StringsKt.repeat("0", java.lang.Math.max(0, this.Camera2StreamConfigurationMap - valueOf.length())), valueOf);
        } else {
            if (intValue >= 0) {
                builder.append("+");
            }
            builder.append(java.lang.String.valueOf(intValue));
        }
    }
}
