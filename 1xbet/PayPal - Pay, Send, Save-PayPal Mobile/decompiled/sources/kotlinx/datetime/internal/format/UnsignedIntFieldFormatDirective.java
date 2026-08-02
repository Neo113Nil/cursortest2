package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014"}, d2 = {"Lkotlinx/datetime/internal/format/UnsignedIntFieldFormatDirective;", "Target", "Lkotlinx/datetime/internal/format/FieldFormatDirective;", "Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "field", "", "minDigits", "spacePadding", "<init>", "(Lkotlinx/datetime/internal/format/UnsignedFieldSpec;ILjava/lang/Integer;)V", "Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "formatter", "()Lkotlinx/datetime/internal/format/formatter/FormatterStructure;", "Lkotlinx/datetime/internal/format/parser/ParserStructure;", "parser", "()Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "getField", "()Lkotlinx/datetime/internal/format/UnsignedFieldSpec;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Ljava/lang/Integer;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class UnsignedIntFieldFormatDirective<Target> implements kotlinx.datetime.internal.format.FieldFormatDirective<Target> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;
    private final kotlinx.datetime.internal.format.UnsignedFieldSpec<Target> field;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.Integer getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public UnsignedIntFieldFormatDirective(kotlinx.datetime.internal.format.UnsignedFieldSpec<? super Target> unsignedFieldSpec, int i, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsignedFieldSpec, "");
        this.field = unsignedFieldSpec;
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRangesFor = num;
        int maxDigits = unsignedFieldSpec.getMaxDigits();
        this.getHighResolutionOutputSizeshNQ4ISI = maxDigits;
        if (i < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The minimum number of digits (");
            sb.append(i);
            sb.append(") is negative");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (maxDigits < i) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The maximum number of digits (");
            sb2.append(maxDigits);
            sb2.append(") is less than the minimum number of digits (");
            sb2.append(i);
            sb2.append(')');
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        if (num == null || num.intValue() > i) {
            return;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("The space padding (");
        sb3.append(num);
        sb3.append(") should be more than the minimum number of digits (");
        sb3.append(i);
        sb3.append(')');
        throw new java.lang.IllegalArgumentException(sb3.toString().toString());
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public /* bridge */ /* synthetic */ kotlinx.datetime.internal.format.FieldSpec getField() {
        return this.field;
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public final kotlinx.datetime.internal.format.UnsignedFieldSpec<Target> getField() {
        return this.field;
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public kotlinx.datetime.internal.format.formatter.FormatterStructure<Target> formatter() {
        kotlinx.datetime.internal.format.formatter.UnsignedIntFormatterStructure unsignedIntFormatterStructure = new kotlinx.datetime.internal.format.formatter.UnsignedIntFormatterStructure(new kotlinx.datetime.internal.format.UnsignedIntFieldFormatDirective$formatter$formatter$1(this.field.getAccessor()), this.getHighSpeedVideoSizes);
        java.lang.Integer num = this.getHighSpeedVideoFpsRangesFor;
        return num != null ? new kotlinx.datetime.internal.format.formatter.SpacePaddedFormatter(unsignedIntFormatterStructure, num.intValue()) : unsignedIntFormatterStructure;
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public kotlinx.datetime.internal.format.parser.ParserStructure<Target> parser() {
        return kotlinx.datetime.internal.format.parser.ParserOperationKt.spaceAndZeroPaddedUnsignedInt$default(java.lang.Integer.valueOf(this.getHighSpeedVideoSizes), java.lang.Integer.valueOf(this.getHighResolutionOutputSizeshNQ4ISI), this.getHighSpeedVideoFpsRangesFor, this.field.getAccessor(), this.field.getName(), false, 32, null);
    }
}
