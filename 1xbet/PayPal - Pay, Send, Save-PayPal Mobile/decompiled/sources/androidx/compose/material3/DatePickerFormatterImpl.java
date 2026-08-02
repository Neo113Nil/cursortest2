package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\b2\n\u0010\u0004\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\b2\n\u0010\u0004\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001c"}, d2 = {"Landroidx/compose/material3/DatePickerFormatterImpl;", "Landroidx/compose/material3/DatePickerFormatter;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "Ljava/util/Locale;", "Landroidx/compose/material3/getHighSpeedVideoSizes;", "formatMonthYear", "(Ljava/lang/Long;Ljava/util/Locale;)Ljava/lang/String;", "", "formatDate", "(Ljava/lang/Long;Ljava/util/Locale;Z)Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DatePickerFormatterImpl implements androidx.compose.material3.DatePickerFormatter {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();
    private final java.lang.String getHighSpeedVideoSizes;

    public DatePickerFormatterImpl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoSizes = str2;
        this.getHighSpeedVideoFpsRanges = str3;
    }

    @Override // androidx.compose.material3.DatePickerFormatter
    public final java.lang.String formatMonthYear(java.lang.Long p0, java.util.Locale p1) {
        if (p0 == null) {
            return null;
        }
        return androidx.compose.material3.internal.CalendarModel_androidKt.formatWithSkeleton(p0.longValue(), this.getHighResolutionOutputSizeshNQ4ISI, p1, this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.compose.material3.DatePickerFormatter
    public final java.lang.String formatDate(java.lang.Long p0, java.util.Locale p1, boolean p2) {
        java.lang.String str;
        if (p0 == null) {
            return null;
        }
        long longValue = p0.longValue();
        if (p2) {
            str = this.getHighSpeedVideoFpsRanges;
        } else {
            str = this.getHighSpeedVideoSizes;
        }
        return androidx.compose.material3.internal.CalendarModel_androidKt.formatWithSkeleton(longValue, str, p1, this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object p0) {
        if (!(p0 instanceof androidx.compose.material3.DatePickerFormatterImpl)) {
            return false;
        }
        androidx.compose.material3.DatePickerFormatterImpl datePickerFormatterImpl = (androidx.compose.material3.DatePickerFormatterImpl) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, datePickerFormatterImpl.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, datePickerFormatterImpl.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, datePickerFormatterImpl.getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        return (((this.getHighResolutionOutputSizeshNQ4ISI.hashCode() * 31) + this.getHighSpeedVideoSizes.hashCode()) * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
    }
}
