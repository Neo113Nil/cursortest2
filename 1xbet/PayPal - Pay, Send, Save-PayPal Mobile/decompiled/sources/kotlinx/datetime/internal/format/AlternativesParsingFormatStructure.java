package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR&\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lkotlinx/datetime/internal/format/AlternativesParsingFormatStructure;", "T", "Lkotlinx/datetime/internal/format/NonConcatenatedFormatStructure;", "Lkotlinx/datetime/internal/format/FormatStructure;", "mainFormat", "", "formats", "<init>", "(Lkotlinx/datetime/internal/format/FormatStructure;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "parser", "()Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "()Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlinx/datetime/internal/format/FormatStructure;", "getMainFormat", "()Lkotlinx/datetime/internal/format/FormatStructure;", "Ljava/util/List;", "getFormats", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AlternativesParsingFormatStructure<T> implements kotlinx.datetime.internal.format.NonConcatenatedFormatStructure<T> {
    private final java.util.List<kotlinx.datetime.internal.format.FormatStructure<T>> formats;
    private final kotlinx.datetime.internal.format.FormatStructure<T> mainFormat;

    /* JADX WARN: Multi-variable type inference failed */
    public AlternativesParsingFormatStructure(kotlinx.datetime.internal.format.FormatStructure<? super T> formatStructure, java.util.List<? extends kotlinx.datetime.internal.format.FormatStructure<? super T>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatStructure, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.mainFormat = formatStructure;
        this.formats = list;
    }

    public final kotlinx.datetime.internal.format.FormatStructure<T> getMainFormat() {
        return this.mainFormat;
    }

    public final java.util.List<kotlinx.datetime.internal.format.FormatStructure<T>> getFormats() {
        return this.formats;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AlternativesParsing(");
        sb.append(this.formats);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof kotlinx.datetime.internal.format.AlternativesParsingFormatStructure)) {
            return false;
        }
        kotlinx.datetime.internal.format.AlternativesParsingFormatStructure alternativesParsingFormatStructure = (kotlinx.datetime.internal.format.AlternativesParsingFormatStructure) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.mainFormat, alternativesParsingFormatStructure.mainFormat) && kotlin.jvm.internal.Intrinsics.areEqual(this.formats, alternativesParsingFormatStructure.formats);
    }

    public final int hashCode() {
        return (this.mainFormat.hashCode() * 31) + this.formats.hashCode();
    }

    @Override // kotlinx.datetime.internal.format.FormatStructure
    public final kotlinx.datetime.internal.format.parser.ParserStructure<T> parser() {
        java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        createListBuilder.add(this.mainFormat.parser());
        java.util.Iterator<kotlinx.datetime.internal.format.FormatStructure<T>> it = this.formats.iterator();
        while (it.hasNext()) {
            createListBuilder.add(it.next().parser());
        }
        return new kotlinx.datetime.internal.format.parser.ParserStructure<>(emptyList, kotlin.collections.CollectionsKt.build(createListBuilder));
    }

    @Override // kotlinx.datetime.internal.format.FormatStructure
    public final kotlinx.datetime.internal.format.formatter.FormatterStructure<T> formatter() {
        return this.mainFormat.formatter();
    }
}
