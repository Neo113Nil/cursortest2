package kotlinx.datetime.internal.format.formatter;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00028\u00002\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlinx/datetime/internal/format/formatter/ConcatenatedFormatter;", "T", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "", "formatters", "<init>", "(Ljava/util/List;)V", "obj", "Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "builder", "", "minusNotRequired", "", "format", "(Ljava/lang/Object;Ljava/lang/Appendable;Z)V", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConcatenatedFormatter<T> implements kotlinx.datetime.internal.format.formatter.FormatterStructure<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.List<kotlinx.datetime.internal.format.formatter.FormatterStructure<T>> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public ConcatenatedFormatter(java.util.List<? extends kotlinx.datetime.internal.format.formatter.FormatterStructure<? super T>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoSizes = list;
    }

    @Override // kotlinx.datetime.internal.format.formatter.FormatterStructure
    public final void format(T obj, java.lang.Appendable builder, boolean minusNotRequired) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        java.util.Iterator<kotlinx.datetime.internal.format.formatter.FormatterStructure<T>> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            it.next().format(obj, builder, minusNotRequired);
        }
    }
}
