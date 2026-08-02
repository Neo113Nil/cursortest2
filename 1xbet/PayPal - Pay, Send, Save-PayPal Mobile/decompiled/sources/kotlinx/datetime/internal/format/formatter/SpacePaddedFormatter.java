package kotlinx.datetime.internal.format.formatter;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lkotlinx/datetime/internal/format/formatter/SpacePaddedFormatter;", "T", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "", "padding", "<init>", "(Lkotlinx/datetime/internal/format/formatter/FormatterStructure;I)V", "obj", "Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "builder", "", "minusNotRequired", "", "format", "(Ljava/lang/Object;Ljava/lang/Appendable;Z)V", "getHighSpeedVideoFpsRanges", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SpacePaddedFormatter<T> implements kotlinx.datetime.internal.format.formatter.FormatterStructure<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.datetime.internal.format.formatter.FormatterStructure<T> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public SpacePaddedFormatter(kotlinx.datetime.internal.format.formatter.FormatterStructure<? super T> formatterStructure, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatterStructure, "");
        this.Camera2StreamConfigurationMap = formatterStructure;
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @Override // kotlinx.datetime.internal.format.formatter.FormatterStructure
    public final void format(T obj, java.lang.Appendable builder, boolean minusNotRequired) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        this.Camera2StreamConfigurationMap.format(obj, sb, minusNotRequired);
        java.lang.String obj2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        int i = this.getHighSpeedVideoFpsRangesFor;
        int length = obj2.length();
        for (int i2 = 0; i2 < i - length; i2++) {
            builder.append(' ');
        }
        builder.append(obj2);
    }
}
