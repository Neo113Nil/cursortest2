package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlinx/datetime/format/TimeZoneIdDirective;", "Lkotlinx/datetime/internal/format/FieldFormatDirective;", "Lkotlinx/datetime/format/DateTimeComponentsContents;", "<init>", "()V", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "()Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "parser", "()Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Lkotlinx/datetime/internal/format/FieldSpec;", "", "getField", "()Lkotlinx/datetime/internal/format/FieldSpec;", "field", "getBuilderRepresentation", "()Ljava/lang/String;", "builderRepresentation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TimeZoneIdDirective implements kotlinx.datetime.internal.format.FieldFormatDirective<kotlinx.datetime.format.DateTimeComponentsContents> {
    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public final kotlinx.datetime.internal.format.FieldSpec<kotlinx.datetime.format.DateTimeComponentsContents, ?> getField() {
        return kotlinx.datetime.format.DateTimeComponentsKt.getTimeZoneField();
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public final java.lang.String getBuilderRepresentation() {
        return "timeZoneId()";
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public final kotlinx.datetime.internal.format.formatter.FormatterStructure<kotlinx.datetime.format.DateTimeComponentsContents> formatter() {
        return new kotlinx.datetime.internal.format.formatter.StringFormatterStructure(new kotlinx.datetime.format.TimeZoneIdDirective$formatter$1(getField().getAccessor()));
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public final kotlinx.datetime.internal.format.parser.ParserStructure<kotlinx.datetime.format.DateTimeComponentsContents> parser() {
        return new kotlinx.datetime.internal.format.parser.ParserStructure<>(kotlin.collections.CollectionsKt.listOf(new kotlinx.datetime.internal.format.parser.TimeZoneParserOperation(kotlinx.datetime.format.DateTimeComponentsKt.getTimeZoneField().getAccessor())), kotlin.collections.CollectionsKt.emptyList());
    }
}
