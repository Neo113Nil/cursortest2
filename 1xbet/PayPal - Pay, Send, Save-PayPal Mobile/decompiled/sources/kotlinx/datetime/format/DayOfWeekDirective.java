package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlinx/datetime/format/DayOfWeekDirective;", "Lkotlinx/datetime/internal/format/NamedUnsignedIntFieldFormatDirective;", "Lkotlinx/datetime/format/DateFieldContainer;", "Lkotlinx/datetime/format/DayOfWeekNames;", "p0", "<init>", "(Lkotlinx/datetime/format/DayOfWeekNames;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Camera2StreamConfigurationMap", "Lkotlinx/datetime/format/DayOfWeekNames;", "getHighResolutionOutputSizeshNQ4ISI", "", "getBuilderRepresentation", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class DayOfWeekDirective extends kotlinx.datetime.internal.format.NamedUnsignedIntFieldFormatDirective<kotlinx.datetime.format.DateFieldContainer> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.datetime.format.DayOfWeekNames getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DayOfWeekDirective(kotlinx.datetime.format.DayOfWeekNames dayOfWeekNames) {
        super(kotlinx.datetime.format.DateFields.getHighSpeedVideoSizes(), dayOfWeekNames.getNames(), "dayOfWeekName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeekNames, "");
        kotlinx.datetime.format.DateFields dateFields = kotlinx.datetime.format.DateFields.INSTANCE;
        this.getHighResolutionOutputSizeshNQ4ISI = dayOfWeekNames;
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public final java.lang.String getBuilderRepresentation() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("dayOfWeek(");
        sb.append(kotlinx.datetime.format.LocalDateFormatKt.access$toKotlinCode(this.getHighResolutionOutputSizeshNQ4ISI));
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object p0) {
        return (p0 instanceof kotlinx.datetime.format.DayOfWeekDirective) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI.getNames(), ((kotlinx.datetime.format.DayOfWeekDirective) p0).getHighResolutionOutputSizeshNQ4ISI.getNames());
    }

    public final int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getNames().hashCode();
    }
}
