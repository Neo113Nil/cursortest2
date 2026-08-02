package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lkotlinx/datetime/format/YearDirective;", "Lkotlinx/datetime/internal/format/SignedIntFieldFormatDirective;", "Lkotlinx/datetime/format/YearMonthFieldContainer;", "Lkotlinx/datetime/format/Padding;", "p0", "", "p1", "<init>", "(Lkotlinx/datetime/format/Padding;Z)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/datetime/format/Padding;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Z", "", "getBuilderRepresentation", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class YearDirective extends kotlinx.datetime.internal.format.SignedIntFieldFormatDirective<kotlinx.datetime.format.YearMonthFieldContainer> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.datetime.format.Padding getHighSpeedVideoSizes;

    public /* synthetic */ YearDirective(kotlinx.datetime.format.Padding padding, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(padding, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YearDirective(kotlinx.datetime.format.Padding padding, boolean z) {
        super(kotlinx.datetime.format.YearMonthFields.Camera2StreamConfigurationMap(), java.lang.Integer.valueOf(padding != kotlinx.datetime.format.Padding.ZERO ? 1 : 4), null, padding == kotlinx.datetime.format.Padding.SPACE ? 4 : null, 4);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
        kotlinx.datetime.format.YearMonthFields yearMonthFields = kotlinx.datetime.format.YearMonthFields.INSTANCE;
        this.getHighSpeedVideoSizes = padding;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public final java.lang.String getBuilderRepresentation() {
        java.lang.String obj;
        if (kotlinx.datetime.format.YearDirective.WhenMappings.$EnumSwitchMapping$0[this.getHighSpeedVideoSizes.ordinal()] == 1) {
            obj = "year()";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("year(");
            sb.append(kotlinx.datetime.format.DateTimeFormatKt.toKotlinCode(this.getHighSpeedVideoSizes));
            sb.append(')');
            obj = sb.toString();
        }
        if (!this.getHighSpeedVideoFpsRangesFor) {
            return obj;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append(" /** TODO: the original format had an `y` directive, so the behavior is different on years earlier than 1 AD. See the [kotlinx.datetime.format.byUnicodePattern] documentation for details. */");
        return sb2.toString();
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof kotlinx.datetime.format.YearDirective)) {
            return false;
        }
        kotlinx.datetime.format.YearDirective yearDirective = (kotlinx.datetime.format.YearDirective) p0;
        return this.getHighSpeedVideoSizes == yearDirective.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRangesFor == yearDirective.getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoSizes.hashCode() * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRangesFor);
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlinx.datetime.format.Padding.values().length];
            try {
                iArr[kotlinx.datetime.format.Padding.ZERO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
