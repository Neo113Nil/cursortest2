package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lkotlinx/datetime/internal/format/BasicFormatStructure;", "T", "Lkotlinx/datetime/internal/format/NonConcatenatedFormatStructure;", "Lkotlinx/datetime/internal/format/FieldFormatDirective;", "directive", "<init>", "(Lkotlinx/datetime/internal/format/FieldFormatDirective;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "parser", "()Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "()Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlinx/datetime/internal/format/FieldFormatDirective;", "getDirective", "()Lkotlinx/datetime/internal/format/FieldFormatDirective;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BasicFormatStructure<T> implements kotlinx.datetime.internal.format.NonConcatenatedFormatStructure<T> {
    private final kotlinx.datetime.internal.format.FieldFormatDirective<T> directive;

    /* JADX WARN: Multi-variable type inference failed */
    public BasicFormatStructure(kotlinx.datetime.internal.format.FieldFormatDirective<? super T> fieldFormatDirective) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldFormatDirective, "");
        this.directive = fieldFormatDirective;
    }

    public final kotlinx.datetime.internal.format.FieldFormatDirective<T> getDirective() {
        return this.directive;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BasicFormatStructure(");
        sb.append(this.directive);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof kotlinx.datetime.internal.format.BasicFormatStructure) && kotlin.jvm.internal.Intrinsics.areEqual(this.directive, ((kotlinx.datetime.internal.format.BasicFormatStructure) other).directive);
    }

    public final int hashCode() {
        return this.directive.hashCode();
    }

    @Override // kotlinx.datetime.internal.format.FormatStructure
    public final kotlinx.datetime.internal.format.parser.ParserStructure<T> parser() {
        return this.directive.parser();
    }

    @Override // kotlinx.datetime.internal.format.FormatStructure
    public final kotlinx.datetime.internal.format.formatter.FormatterStructure<T> formatter() {
        return this.directive.formatter();
    }
}
