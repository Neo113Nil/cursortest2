package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002BC\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016"}, d2 = {"Lkotlinx/datetime/internal/format/SignedIntFieldFormatDirective;", "Target", "Lkotlinx/datetime/internal/format/FieldFormatDirective;", "Lkotlinx/datetime/internal/format/FieldSpec;", "", "field", "minDigits", "maxDigits", "spacePadding", "outputPlusOnExceededWidth", "<init>", "(Lkotlinx/datetime/internal/format/FieldSpec;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "()Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "parser", "()Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Lkotlinx/datetime/internal/format/FieldSpec;", "getField", "()Lkotlinx/datetime/internal/format/FieldSpec;", "getHighSpeedVideoSizes", "Ljava/lang/Integer;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class SignedIntFieldFormatDirective<Target> implements kotlinx.datetime.internal.format.FieldFormatDirective<Target> {
    private final kotlinx.datetime.internal.format.FieldSpec<Target, java.lang.Integer> field;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Integer Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.Integer getHighSpeedVideoSizes;
    private final java.lang.Integer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.Integer getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public SignedIntFieldFormatDirective(kotlinx.datetime.internal.format.FieldSpec<? super Target, java.lang.Integer> fieldSpec, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldSpec, "");
        this.field = fieldSpec;
        this.getHighResolutionOutputSizeshNQ4ISI = num;
        this.Camera2StreamConfigurationMap = num2;
        this.getHighSpeedVideoSizes = num3;
        this.getHighSpeedVideoFpsRangesFor = num4;
        if (num != null && num.intValue() < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The minimum number of digits (");
            sb.append(num);
            sb.append(") is negative");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (num2 == null || num == null || num2.intValue() >= num.intValue()) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The maximum number of digits (");
        sb2.append(num2);
        sb2.append(") is less than the minimum number of digits (");
        sb2.append(num);
        sb2.append(')');
        throw new java.lang.IllegalArgumentException(sb2.toString().toString());
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public final kotlinx.datetime.internal.format.FieldSpec<Target, java.lang.Integer> getField() {
        return this.field;
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public kotlinx.datetime.internal.format.formatter.FormatterStructure<Target> formatter() {
        kotlinx.datetime.internal.format.SignedIntFieldFormatDirective$formatter$formatter$1 signedIntFieldFormatDirective$formatter$formatter$1 = new kotlinx.datetime.internal.format.SignedIntFieldFormatDirective$formatter$formatter$1(this.field.getAccessor());
        java.lang.Integer num = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlinx.datetime.internal.format.formatter.SignedIntFormatterStructure signedIntFormatterStructure = new kotlinx.datetime.internal.format.formatter.SignedIntFormatterStructure(signedIntFieldFormatDirective$formatter$formatter$1, num != null ? num.intValue() : 0, this.getHighSpeedVideoFpsRangesFor);
        java.lang.Integer num2 = this.getHighSpeedVideoSizes;
        return num2 != null ? new kotlinx.datetime.internal.format.formatter.SpacePaddedFormatter(signedIntFormatterStructure, num2.intValue()) : signedIntFormatterStructure;
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public kotlinx.datetime.internal.format.parser.ParserStructure<Target> parser() {
        return kotlinx.datetime.internal.format.parser.ParserOperationKt.SignedIntParser(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.field.getAccessor(), this.field.getName(), this.getHighSpeedVideoFpsRangesFor);
    }
}
