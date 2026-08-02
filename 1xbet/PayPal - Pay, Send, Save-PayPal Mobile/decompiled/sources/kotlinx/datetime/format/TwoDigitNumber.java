package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J0\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlinx/datetime/format/TwoDigitNumber;", "", "Lkotlin/reflect/KMutableProperty0;", "", "p0", "<init>", "(Lkotlin/reflect/KMutableProperty0;)V", "Lkotlin/reflect/KProperty;", "p1", "p2", "", "getHighSpeedVideoFpsRanges", "(Lkotlin/reflect/KProperty;Ljava/lang/Integer;)V", "getHighSpeedVideoSizes", "Lkotlin/reflect/KMutableProperty0;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TwoDigitNumber {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final kotlin.reflect.KMutableProperty0<java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI;

    public TwoDigitNumber(kotlin.reflect.KMutableProperty0<java.lang.Integer> kMutableProperty0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kMutableProperty0, "");
        this.getHighResolutionOutputSizeshNQ4ISI = kMutableProperty0;
    }

    public final void getHighSpeedVideoFpsRanges(kotlin.reflect.KProperty<?> kProperty, java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "");
        if (num == null || new kotlin.ranges.IntRange(0, 99).contains(num.intValue())) {
            this.getHighResolutionOutputSizeshNQ4ISI.set(num);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kProperty.getName());
        sb.append(" must be a two-digit number, got '");
        sb.append(num);
        sb.append('\'');
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }
}
