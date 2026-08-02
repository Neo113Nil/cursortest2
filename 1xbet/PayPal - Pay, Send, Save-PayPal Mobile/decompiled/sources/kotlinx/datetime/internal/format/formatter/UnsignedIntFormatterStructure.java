package kotlinx.datetime.internal.format.formatter;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00028\u00002\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lkotlinx/datetime/internal/format/formatter/UnsignedIntFormatterStructure;", "T", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlin/Function1;", "", "number", "zeroPadding", "<init>", "(Lkotlin/jvm/functions/Function1;I)V", "obj", "Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "builder", "", "minusNotRequired", "", "format", "(Ljava/lang/Object;Ljava/lang/Appendable;Z)V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UnsignedIntFormatterStructure<T> implements kotlinx.datetime.internal.format.formatter.FormatterStructure<T> {
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<T, java.lang.Integer> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public UnsignedIntFormatterStructure(kotlin.jvm.functions.Function1<? super T, java.lang.Integer> function1, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoSizes = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
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
        java.lang.String valueOf = java.lang.String.valueOf(this.getHighSpeedVideoSizes.invoke(obj).intValue());
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        int length = valueOf.length();
        for (int i2 = 0; i2 < i - length; i2++) {
            builder.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        }
        builder.append(valueOf);
    }
}
