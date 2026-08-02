package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\t\nÀ\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/FormatStructure;", "T", "", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "parser", "()Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "()Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlinx/datetime/internal/format/ConcatenatedFormatStructure;", "Lkotlinx/datetime/internal/format/NonConcatenatedFormatStructure;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FormatStructure<T> {
    kotlinx.datetime.internal.format.formatter.FormatterStructure<T> formatter();

    kotlinx.datetime.internal.format.parser.ParserStructure<T> parser();
}
