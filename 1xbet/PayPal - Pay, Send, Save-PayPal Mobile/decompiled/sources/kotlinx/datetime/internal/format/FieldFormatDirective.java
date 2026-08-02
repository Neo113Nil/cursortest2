package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\f\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fÀ\u0006\u0003"}, d2 = {"Lkotlinx/datetime/internal/format/FieldFormatDirective;", "Target", "", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "()Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "parser", "()Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Lkotlinx/datetime/internal/format/FieldSpec;", "getField", "()Lkotlinx/datetime/internal/format/FieldSpec;", "field", "", "getBuilderRepresentation", "()Ljava/lang/String;", "builderRepresentation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface FieldFormatDirective<Target> {
    kotlinx.datetime.internal.format.formatter.FormatterStructure<Target> formatter();

    java.lang.String getBuilderRepresentation();

    kotlinx.datetime.internal.format.FieldSpec<Target, ?> getField();

    kotlinx.datetime.internal.format.parser.ParserStructure<Target> parser();
}
