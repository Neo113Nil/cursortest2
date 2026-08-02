package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lkotlinx/datetime/format/ReducedYearDirective;", "Lkotlinx/datetime/internal/format/ReducedIntFieldDirective;", "Lkotlinx/datetime/format/YearMonthFieldContainer;", "", "p0", "", "p1", "<init>", "(IZ)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Z", "", "getBuilderRepresentation", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ReducedYearDirective extends kotlinx.datetime.internal.format.ReducedIntFieldDirective<kotlinx.datetime.format.YearMonthFieldContainer> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    public /* synthetic */ ReducedYearDirective(int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReducedYearDirective(int i, boolean z) {
        super(kotlinx.datetime.format.YearMonthFields.Camera2StreamConfigurationMap(), 2, i);
        kotlinx.datetime.format.YearMonthFields yearMonthFields = kotlinx.datetime.format.YearMonthFields.INSTANCE;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public final java.lang.String getBuilderRepresentation() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("yearTwoDigits(");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(')');
        java.lang.String obj = sb.toString();
        if (!this.getHighResolutionOutputSizeshNQ4ISI) {
            return obj;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append(" /** TODO: the original format had an `y` directive, so the behavior is different on years earlier than 1 AD. See the [kotlinx.datetime.format.byUnicodePattern] documentation for details. */");
        return sb2.toString();
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof kotlinx.datetime.format.ReducedYearDirective)) {
            return false;
        }
        kotlinx.datetime.format.ReducedYearDirective reducedYearDirective = (kotlinx.datetime.format.ReducedYearDirective) p0;
        return this.getHighSpeedVideoFpsRangesFor == reducedYearDirective.getHighSpeedVideoFpsRangesFor && this.getHighResolutionOutputSizeshNQ4ISI == reducedYearDirective.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRangesFor) * 31) + java.lang.Boolean.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
