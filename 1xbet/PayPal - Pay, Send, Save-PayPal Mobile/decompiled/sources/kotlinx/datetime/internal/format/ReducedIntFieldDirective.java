package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B+\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014"}, d2 = {"Lkotlinx/datetime/internal/format/ReducedIntFieldDirective;", "Target", "Lkotlinx/datetime/internal/format/FieldFormatDirective;", "Lkotlinx/datetime/internal/format/FieldSpec;", "", "field", "digits", "base", "<init>", "(Lkotlinx/datetime/internal/format/FieldSpec;II)V", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "()Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "parser", "()Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Lkotlinx/datetime/internal/format/FieldSpec;", "getField", "()Lkotlinx/datetime/internal/format/FieldSpec;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ReducedIntFieldDirective<Target> implements kotlinx.datetime.internal.format.FieldFormatDirective<Target> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;
    private final kotlinx.datetime.internal.format.FieldSpec<Target, java.lang.Integer> field;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public ReducedIntFieldDirective(kotlinx.datetime.internal.format.FieldSpec<? super Target, java.lang.Integer> fieldSpec, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldSpec, "");
        this.field = fieldSpec;
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = i2;
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public final kotlinx.datetime.internal.format.FieldSpec<Target, java.lang.Integer> getField() {
        return this.field;
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public kotlinx.datetime.internal.format.formatter.FormatterStructure<Target> formatter() {
        return new kotlinx.datetime.internal.format.formatter.ReducedIntFormatterStructure(new kotlinx.datetime.internal.format.ReducedIntFieldDirective$formatter$1(this.field.getAccessor()), this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public kotlinx.datetime.internal.format.parser.ParserStructure<Target> parser() {
        return kotlinx.datetime.internal.format.parser.ParserOperationKt.ReducedIntParser(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.field.getAccessor(), this.field.getName());
    }
}
