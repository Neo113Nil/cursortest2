package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lkotlinx/datetime/format/UtcOffsetWholeHoursDirective;", "Lkotlinx/datetime/internal/format/UnsignedIntFieldFormatDirective;", "Lkotlinx/datetime/format/UtcOffsetFieldContainer;", "Lkotlinx/datetime/format/Padding;", "padding", "<init>", "(Lkotlinx/datetime/format/Padding;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Camera2StreamConfigurationMap", "Lkotlinx/datetime/format/Padding;", "getHighSpeedVideoFpsRangesFor", "", "getBuilderRepresentation", "()Ljava/lang/String;", "builderRepresentation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UtcOffsetWholeHoursDirective extends kotlinx.datetime.internal.format.UnsignedIntFieldFormatDirective<kotlinx.datetime.format.UtcOffsetFieldContainer> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.datetime.format.Padding getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtcOffsetWholeHoursDirective(kotlinx.datetime.format.Padding padding) {
        super(kotlinx.datetime.format.OffsetFields.getHighSpeedVideoSizes(), padding == kotlinx.datetime.format.Padding.ZERO ? 2 : 1, padding == kotlinx.datetime.format.Padding.SPACE ? 2 : null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
        kotlinx.datetime.format.OffsetFields offsetFields = kotlinx.datetime.format.OffsetFields.INSTANCE;
        this.getHighSpeedVideoFpsRangesFor = padding;
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public final java.lang.String getBuilderRepresentation() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("offsetHours(");
        sb.append(kotlinx.datetime.format.DateTimeFormatKt.toKotlinCode(this.getHighSpeedVideoFpsRangesFor));
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        return (other instanceof kotlinx.datetime.format.UtcOffsetWholeHoursDirective) && this.getHighSpeedVideoFpsRangesFor == ((kotlinx.datetime.format.UtcOffsetWholeHoursDirective) other).getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }
}
