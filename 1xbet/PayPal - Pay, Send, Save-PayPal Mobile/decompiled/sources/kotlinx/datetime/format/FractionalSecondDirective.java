package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lkotlinx/datetime/format/FractionalSecondDirective;", "Lkotlinx/datetime/internal/format/DecimalFractionFieldFormatDirective;", "Lkotlinx/datetime/format/TimeFieldContainer;", "", "minDigits", "maxDigits", "", "zerosToAdd", "<init>", "(IILjava/util/List;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "", "getBuilderRepresentation", "()Ljava/lang/String;", "builderRepresentation", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FractionalSecondDirective extends kotlinx.datetime.internal.format.DecimalFractionFieldFormatDirective<kotlinx.datetime.format.TimeFieldContainer> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.datetime.format.FractionalSecondDirective.Companion INSTANCE = new kotlinx.datetime.format.FractionalSecondDirective.Companion(null);
    private static final java.util.List<java.lang.Integer> NO_EXTRA_ZEROS = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final java.util.List<java.lang.Integer> GROUP_BY_THREE = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{2, 1, 0, 2, 1, 0, 2, 1, 0});

    public /* synthetic */ FractionalSecondDirective(int i, int i2, java.util.List list, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? NO_EXTRA_ZEROS : list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FractionalSecondDirective(int i, int i2, java.util.List<java.lang.Integer> list) {
        super(kotlinx.datetime.format.TimeFields.getHighResolutionOutputSizeshNQ4ISI(), i, i2, list);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlinx.datetime.format.TimeFields timeFields = kotlinx.datetime.format.TimeFields.INSTANCE;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoSizes = i2;
    }

    @Override // kotlinx.datetime.internal.format.FieldFormatDirective
    public final java.lang.String getBuilderRepresentation() {
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 1 && this.getHighSpeedVideoSizes == 9) {
            return "secondFraction()";
        }
        if (i == 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("secondFraction(maxLength = ");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(')');
            return sb.toString();
        }
        int i2 = this.getHighSpeedVideoSizes;
        if (i2 == 1) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("secondFraction(minLength = ");
            sb2.append(this.getHighSpeedVideoFpsRanges);
            sb2.append(')');
            return sb2.toString();
        }
        if (i2 == i) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("secondFraction(");
            sb3.append(this.getHighSpeedVideoFpsRanges);
            sb3.append(')');
            return sb3.toString();
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("secondFraction(");
        sb4.append(this.getHighSpeedVideoFpsRanges);
        sb4.append(", ");
        sb4.append(this.getHighSpeedVideoSizes);
        sb4.append(')');
        return sb4.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof kotlinx.datetime.format.FractionalSecondDirective)) {
            return false;
        }
        kotlinx.datetime.format.FractionalSecondDirective fractionalSecondDirective = (kotlinx.datetime.format.FractionalSecondDirective) other;
        return this.getHighSpeedVideoFpsRanges == fractionalSecondDirective.getHighSpeedVideoFpsRanges && this.getHighSpeedVideoSizes == fractionalSecondDirective.getHighSpeedVideoSizes;
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoFpsRanges * 31) + this.getHighSpeedVideoSizes;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t"}, d2 = {"Lkotlinx/datetime/format/FractionalSecondDirective$Companion;", "", "<init>", "()V", "", "", "NO_EXTRA_ZEROS", "Ljava/util/List;", "getNO_EXTRA_ZEROS", "()Ljava/util/List;", "GROUP_BY_THREE", "getGROUP_BY_THREE"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.List<java.lang.Integer> getNO_EXTRA_ZEROS() {
            return kotlinx.datetime.format.FractionalSecondDirective.NO_EXTRA_ZEROS;
        }

        public final java.util.List<java.lang.Integer> getGROUP_BY_THREE() {
            return kotlinx.datetime.format.FractionalSecondDirective.GROUP_BY_THREE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
