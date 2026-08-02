package kotlinx.datetime.internal.format.formatter;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B6\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00028\u00002\n\u0010\u000e\u001a\u00060\fj\u0002`\r2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R%\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lkotlinx/datetime/internal/format/formatter/SignedFormatter;", "T", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "allSubFormatsNegative", "alwaysOutputSign", "<init>", "(Lkotlinx/datetime/internal/format/formatter/FormatterStructure;Lkotlin/jvm/functions/Function1;Z)V", "obj", "Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "builder", "minusNotRequired", "", "format", "(Ljava/lang/Object;Ljava/lang/Appendable;Z)V", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "Z", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SignedFormatter<T> implements kotlinx.datetime.internal.format.formatter.FormatterStructure<T> {
    private final kotlin.jvm.functions.Function1<T, java.lang.Boolean> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.datetime.internal.format.formatter.FormatterStructure<T> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public SignedFormatter(kotlinx.datetime.internal.format.formatter.FormatterStructure<? super T> formatterStructure, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatterStructure, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.getHighSpeedVideoFpsRangesFor = formatterStructure;
        this.Camera2StreamConfigurationMap = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @Override // kotlinx.datetime.internal.format.formatter.FormatterStructure
    public final void format(T obj, java.lang.Appendable builder, boolean minusNotRequired) {
        java.lang.Character ch;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        if (!minusNotRequired && this.Camera2StreamConfigurationMap.invoke(obj).booleanValue()) {
            ch = '-';
        } else {
            ch = this.getHighResolutionOutputSizeshNQ4ISI ? '+' : null;
        }
        if (ch != null) {
            builder.append(ch.charValue());
        }
        this.getHighSpeedVideoFpsRangesFor.format(obj, builder, minusNotRequired || (ch != null && ch.charValue() == '-'));
    }
}
