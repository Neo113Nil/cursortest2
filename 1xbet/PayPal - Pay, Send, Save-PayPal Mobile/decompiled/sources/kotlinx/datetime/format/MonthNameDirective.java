package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlinx/datetime/format/MonthNameDirective;", "Lkotlinx/datetime/internal/format/NamedUnsignedIntFieldFormatDirective;", "Lkotlinx/datetime/format/YearMonthFieldContainer;", "Lkotlinx/datetime/format/MonthNames;", "p0", "<init>", "(Lkotlinx/datetime/format/MonthNames;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/datetime/format/MonthNames;", "Camera2StreamConfigurationMap", "", "getBuilderRepresentation", "()Ljava/lang/String;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class MonthNameDirective extends kotlinx.datetime.internal.format.NamedUnsignedIntFieldFormatDirective<kotlinx.datetime.format.YearMonthFieldContainer> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.datetime.format.MonthNames Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonthNameDirective(kotlinx.datetime.format.MonthNames monthNames) {
        super(kotlinx.datetime.format.YearMonthFields.getHighSpeedVideoSizes(), monthNames.getNames(), "monthName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(monthNames, "");
        kotlinx.datetime.format.YearMonthFields yearMonthFields = kotlinx.datetime.format.YearMonthFields.INSTANCE;
        this.Camera2StreamConfigurationMap = monthNames;
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public final java.lang.String getBuilderRepresentation() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("monthName(");
        sb.append(kotlinx.datetime.format.YearMonthFormatKt.access$toKotlinCode(this.Camera2StreamConfigurationMap));
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object p0) {
        return (p0 instanceof kotlinx.datetime.format.MonthNameDirective) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap.getNames(), ((kotlinx.datetime.format.MonthNameDirective) p0).Camera2StreamConfigurationMap.getNames());
    }

    public final int hashCode() {
        return this.Camera2StreamConfigurationMap.getNames().hashCode();
    }
}
