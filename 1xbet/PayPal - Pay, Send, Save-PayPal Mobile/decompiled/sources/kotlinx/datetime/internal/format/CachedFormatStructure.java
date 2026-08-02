package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlinx/datetime/internal/format/CachedFormatStructure;", "T", "Lkotlinx/datetime/internal/format/ConcatenatedFormatStructure;", "", "Lkotlinx/datetime/internal/format/NonConcatenatedFormatStructure;", "formats", "<init>", "(Ljava/util/List;)V", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "()Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "parser", "()Lkotlinx/datetime/internal/format/parser/ParserStructure;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CachedFormatStructure<T> extends kotlinx.datetime.internal.format.ConcatenatedFormatStructure<T> {
    private final kotlinx.datetime.internal.format.formatter.FormatterStructure<T> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.datetime.internal.format.parser.ParserStructure<T> getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedFormatStructure(java.util.List<? extends kotlinx.datetime.internal.format.NonConcatenatedFormatStructure<? super T>> list) {
        super(list);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighResolutionOutputSizeshNQ4ISI = super.formatter();
        this.getHighSpeedVideoFpsRanges = super.parser();
    }

    @Override // kotlinx.datetime.internal.format.ConcatenatedFormatStructure, kotlinx.datetime.internal.format.FormatStructure
    public final kotlinx.datetime.internal.format.formatter.FormatterStructure<T> formatter() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlinx.datetime.internal.format.ConcatenatedFormatStructure, kotlinx.datetime.internal.format.FormatStructure
    public final kotlinx.datetime.internal.format.parser.ParserStructure<T> parser() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
