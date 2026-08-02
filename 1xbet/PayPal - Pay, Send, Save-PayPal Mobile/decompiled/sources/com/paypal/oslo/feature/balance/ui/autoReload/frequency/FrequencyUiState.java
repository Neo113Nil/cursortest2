package com.paypal.oslo.feature.balance.ui.autoReload.frequency;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jt\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00102\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b)\u0010\u001fJ\u0010\u0010*\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b*\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\u001bR\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b3\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b4\u0010\u001bR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b7\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b8\u0010\u001bR\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyUiState;", "", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyTypeUi;", "selectedFrequencyTypeUi", "Ljava/time/LocalDate;", "startDate", "Ljava/time/DayOfWeek;", "weeklyDayOfWeek", "", "formattedWeeklyDayOfWeek", "biWeeklyDayOfWeek", "formattedBiWeeklyDayOfWeek", "", "monthlyDayOfMonth", "formattedMonthDay", "formattedMonthDayOrdinal", "", "shouldShowCalendarDialog", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyTypeUi;Ljava/time/LocalDate;Ljava/time/DayOfWeek;Ljava/lang/String;Ljava/time/DayOfWeek;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V", "component1", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyTypeUi;", "component2", "()Ljava/time/LocalDate;", "component3", "()Ljava/time/DayOfWeek;", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "()I", "component8", "component9", "component10", "()Z", "copy", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyTypeUi;Ljava/time/LocalDate;Ljava/time/DayOfWeek;Ljava/lang/String;Ljava/time/DayOfWeek;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyTypeUi;", "getSelectedFrequencyTypeUi", "Ljava/time/LocalDate;", "getStartDate", "Ljava/time/DayOfWeek;", "getWeeklyDayOfWeek", "Ljava/lang/String;", "getFormattedWeeklyDayOfWeek", "getBiWeeklyDayOfWeek", "getFormattedBiWeeklyDayOfWeek", com.visa.cbp.getEncExpo.warmup, "getMonthlyDayOfMonth", "getFormattedMonthDay", "getFormattedMonthDayOrdinal", "Z", "getShouldShowCalendarDialog"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FrequencyUiState {
    public static final int $stable = 8;
    private final java.time.DayOfWeek biWeeklyDayOfWeek;
    private final java.lang.String formattedBiWeeklyDayOfWeek;
    private final java.lang.String formattedMonthDay;
    private final java.lang.String formattedMonthDayOrdinal;
    private final java.lang.String formattedWeeklyDayOfWeek;
    private final int monthlyDayOfMonth;
    private final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi selectedFrequencyTypeUi;
    private final boolean shouldShowCalendarDialog;
    private final java.time.LocalDate startDate;
    private final java.time.DayOfWeek weeklyDayOfWeek;

    public FrequencyUiState(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi frequencyTypeUi, java.time.LocalDate localDate, java.time.DayOfWeek dayOfWeek, java.lang.String str, java.time.DayOfWeek dayOfWeek2, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencyTypeUi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.selectedFrequencyTypeUi = frequencyTypeUi;
        this.startDate = localDate;
        this.weeklyDayOfWeek = dayOfWeek;
        this.formattedWeeklyDayOfWeek = str;
        this.biWeeklyDayOfWeek = dayOfWeek2;
        this.formattedBiWeeklyDayOfWeek = str2;
        this.monthlyDayOfMonth = i;
        this.formattedMonthDay = str3;
        this.formattedMonthDayOrdinal = str4;
        this.shouldShowCalendarDialog = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FrequencyUiState(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi frequencyTypeUi, java.time.LocalDate localDate, java.time.DayOfWeek dayOfWeek, java.lang.String str, java.time.DayOfWeek dayOfWeek2, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, localDate, r5, r6, r7, r8, r9, (i2 & 128) != 0 ? "" : str3, (i2 & 256) != 0 ? "" : str4, (i2 & 512) != 0 ? false : z);
        java.time.DayOfWeek dayOfWeek3;
        java.time.DayOfWeek dayOfWeek4;
        int i3;
        int i4;
        java.time.DayOfWeek dayOfWeek5;
        java.time.DayOfWeek dayOfWeek6;
        com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi frequencyTypeUi2 = (i2 & 1) != 0 ? com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi.WEEKLY : frequencyTypeUi;
        if ((i2 & 4) != 0) {
            dayOfWeek6 = com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiStateKt.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dayOfWeek6, "");
            dayOfWeek3 = dayOfWeek6;
        } else {
            dayOfWeek3 = dayOfWeek;
        }
        java.lang.String str5 = (i2 & 8) != 0 ? "" : str;
        if ((i2 & 16) != 0) {
            dayOfWeek5 = com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiStateKt.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dayOfWeek5, "");
            dayOfWeek4 = dayOfWeek5;
        } else {
            dayOfWeek4 = dayOfWeek2;
        }
        java.lang.String str6 = (i2 & 32) != 0 ? "" : str2;
        if ((i2 & 64) != 0) {
            i4 = com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiStateKt.getHighSpeedVideoFpsRanges;
            i3 = i4;
        } else {
            i3 = i;
        }
    }

    public final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi getSelectedFrequencyTypeUi() {
        return this.selectedFrequencyTypeUi;
    }

    public final java.time.LocalDate getStartDate() {
        return this.startDate;
    }

    public final java.time.DayOfWeek getWeeklyDayOfWeek() {
        return this.weeklyDayOfWeek;
    }

    public final java.lang.String getFormattedWeeklyDayOfWeek() {
        return this.formattedWeeklyDayOfWeek;
    }

    public final java.time.DayOfWeek getBiWeeklyDayOfWeek() {
        return this.biWeeklyDayOfWeek;
    }

    public final java.lang.String getFormattedBiWeeklyDayOfWeek() {
        return this.formattedBiWeeklyDayOfWeek;
    }

    public final int getMonthlyDayOfMonth() {
        return this.monthlyDayOfMonth;
    }

    public final java.lang.String getFormattedMonthDay() {
        return this.formattedMonthDay;
    }

    public final java.lang.String getFormattedMonthDayOrdinal() {
        return this.formattedMonthDayOrdinal;
    }

    public final boolean getShouldShowCalendarDialog() {
        return this.shouldShowCalendarDialog;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi frequencyTypeUi = this.selectedFrequencyTypeUi;
        java.time.LocalDate localDate = this.startDate;
        java.time.DayOfWeek dayOfWeek = this.weeklyDayOfWeek;
        java.lang.String str = this.formattedWeeklyDayOfWeek;
        java.time.DayOfWeek dayOfWeek2 = this.biWeeklyDayOfWeek;
        java.lang.String str2 = this.formattedBiWeeklyDayOfWeek;
        int i = this.monthlyDayOfMonth;
        java.lang.String str3 = this.formattedMonthDay;
        java.lang.String str4 = this.formattedMonthDayOrdinal;
        boolean z = this.shouldShowCalendarDialog;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FrequencyUiState(selectedFrequencyTypeUi=");
        sb.append(frequencyTypeUi);
        sb.append(", startDate=");
        sb.append(localDate);
        sb.append(", weeklyDayOfWeek=");
        sb.append(dayOfWeek);
        sb.append(", formattedWeeklyDayOfWeek=");
        sb.append(str);
        sb.append(", biWeeklyDayOfWeek=");
        sb.append(dayOfWeek2);
        sb.append(", formattedBiWeeklyDayOfWeek=");
        sb.append(str2);
        sb.append(", monthlyDayOfMonth=");
        sb.append(i);
        sb.append(", formattedMonthDay=");
        sb.append(str3);
        sb.append(", formattedMonthDayOrdinal=");
        sb.append(str4);
        sb.append(", shouldShowCalendarDialog=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((this.selectedFrequencyTypeUi.hashCode() * 31) + this.startDate.hashCode()) * 31) + this.weeklyDayOfWeek.hashCode()) * 31) + this.formattedWeeklyDayOfWeek.hashCode()) * 31) + this.biWeeklyDayOfWeek.hashCode()) * 31) + this.formattedBiWeeklyDayOfWeek.hashCode()) * 31) + java.lang.Integer.hashCode(this.monthlyDayOfMonth)) * 31) + this.formattedMonthDay.hashCode()) * 31) + this.formattedMonthDayOrdinal.hashCode()) * 31) + java.lang.Boolean.hashCode(this.shouldShowCalendarDialog);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState)) {
            return false;
        }
        com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState frequencyUiState = (com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState) other;
        return this.selectedFrequencyTypeUi == frequencyUiState.selectedFrequencyTypeUi && kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, frequencyUiState.startDate) && this.weeklyDayOfWeek == frequencyUiState.weeklyDayOfWeek && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedWeeklyDayOfWeek, frequencyUiState.formattedWeeklyDayOfWeek) && this.biWeeklyDayOfWeek == frequencyUiState.biWeeklyDayOfWeek && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedBiWeeklyDayOfWeek, frequencyUiState.formattedBiWeeklyDayOfWeek) && this.monthlyDayOfMonth == frequencyUiState.monthlyDayOfMonth && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedMonthDay, frequencyUiState.formattedMonthDay) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedMonthDayOrdinal, frequencyUiState.formattedMonthDayOrdinal) && this.shouldShowCalendarDialog == frequencyUiState.shouldShowCalendarDialog;
    }

    public final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState copy(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi selectedFrequencyTypeUi, java.time.LocalDate startDate, java.time.DayOfWeek weeklyDayOfWeek, java.lang.String formattedWeeklyDayOfWeek, java.time.DayOfWeek biWeeklyDayOfWeek, java.lang.String formattedBiWeeklyDayOfWeek, int monthlyDayOfMonth, java.lang.String formattedMonthDay, java.lang.String formattedMonthDayOrdinal, boolean shouldShowCalendarDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedFrequencyTypeUi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weeklyDayOfWeek, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedWeeklyDayOfWeek, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biWeeklyDayOfWeek, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedBiWeeklyDayOfWeek, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedMonthDay, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedMonthDayOrdinal, "");
        return new com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyUiState(selectedFrequencyTypeUi, startDate, weeklyDayOfWeek, formattedWeeklyDayOfWeek, biWeeklyDayOfWeek, formattedBiWeeklyDayOfWeek, monthlyDayOfMonth, formattedMonthDay, formattedMonthDayOrdinal, shouldShowCalendarDialog);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getFormattedMonthDayOrdinal() {
        return this.formattedMonthDayOrdinal;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getFormattedMonthDay() {
        return this.formattedMonthDay;
    }

    /* renamed from: component7, reason: from getter */
    public final int getMonthlyDayOfMonth() {
        return this.monthlyDayOfMonth;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getFormattedBiWeeklyDayOfWeek() {
        return this.formattedBiWeeklyDayOfWeek;
    }

    /* renamed from: component5, reason: from getter */
    public final java.time.DayOfWeek getBiWeeklyDayOfWeek() {
        return this.biWeeklyDayOfWeek;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFormattedWeeklyDayOfWeek() {
        return this.formattedWeeklyDayOfWeek;
    }

    /* renamed from: component3, reason: from getter */
    public final java.time.DayOfWeek getWeeklyDayOfWeek() {
        return this.weeklyDayOfWeek;
    }

    /* renamed from: component2, reason: from getter */
    public final java.time.LocalDate getStartDate() {
        return this.startDate;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShouldShowCalendarDialog() {
        return this.shouldShowCalendarDialog;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi getSelectedFrequencyTypeUi() {
        return this.selectedFrequencyTypeUi;
    }
}
