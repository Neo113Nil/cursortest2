package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lkotlinx/datetime/format/AmPmMarkerDirective;", "Lkotlinx/datetime/internal/format/NamedEnumIntFieldFormatDirective;", "Lkotlinx/datetime/format/TimeFieldContainer;", "Lkotlinx/datetime/format/AmPmMarker;", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "getBuilderRepresentation", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class AmPmMarkerDirective extends kotlinx.datetime.internal.format.NamedEnumIntFieldFormatDirective<kotlinx.datetime.format.TimeFieldContainer, kotlinx.datetime.format.AmPmMarker> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;
    private final java.lang.String getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmPmMarkerDirective(java.lang.String str, java.lang.String str2) {
        super(kotlinx.datetime.format.TimeFields.getHighSpeedVideoSizes(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(kotlinx.datetime.format.AmPmMarker.AM, str), kotlin.TuplesKt.to(kotlinx.datetime.format.AmPmMarker.PM, str2)), "AM/PM marker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlinx.datetime.format.TimeFields timeFields = kotlinx.datetime.format.TimeFields.INSTANCE;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = str2;
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public final java.lang.String getBuilderRepresentation() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("amPmMarker(");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof kotlinx.datetime.format.AmPmMarkerDirective)) {
            return false;
        }
        kotlinx.datetime.format.AmPmMarkerDirective amPmMarkerDirective = (kotlinx.datetime.format.AmPmMarkerDirective) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, amPmMarkerDirective.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, amPmMarkerDirective.getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoSizes.hashCode() * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
    }
}
