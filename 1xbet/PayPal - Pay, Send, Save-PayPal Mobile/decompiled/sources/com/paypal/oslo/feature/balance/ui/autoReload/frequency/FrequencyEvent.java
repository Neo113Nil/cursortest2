package com.paypal.oslo.feature.balance.ui.autoReload.frequency;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent;", "", "OnSelectWeeklyDay", "OnSelectBiweeklyDay", "OnSelectMonthlyDay", "OnSaveButtonClick", "OnMonthInputClick", "OnMonthInputDismiss", "OnChangeFrequencyType", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent$OnChangeFrequencyType;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent$OnMonthInputClick;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent$OnMonthInputDismiss;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent$OnSaveButtonClick;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent$OnSelectBiweeklyDay;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent$OnSelectMonthlyDay;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent$OnSelectWeeklyDay;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FrequencyEvent {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent$OnSelectWeeklyDay;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent;", "Ljava/time/DayOfWeek;", "dayOfWeek", "<init>", "(Ljava/time/DayOfWeek;)V", "component1", "()Ljava/time/DayOfWeek;", "copy", "(Ljava/time/DayOfWeek;)Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent$OnSelectWeeklyDay;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/time/DayOfWeek;", "getDayOfWeek"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSelectWeeklyDay implements com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent {
        public static final int $stable = 0;
        private final java.time.DayOfWeek dayOfWeek;

        public OnSelectWeeklyDay(java.time.DayOfWeek dayOfWeek) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
            this.dayOfWeek = dayOfWeek;
        }

        public final java.time.DayOfWeek getDayOfWeek() {
            return this.dayOfWeek;
        }

        public final java.lang.String toString() {
            java.time.DayOfWeek dayOfWeek = this.dayOfWeek;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSelectWeeklyDay(dayOfWeek=");
            sb.append(dayOfWeek);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.dayOfWeek.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectWeeklyDay) && this.dayOfWeek == ((com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectWeeklyDay) other).dayOfWeek;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectWeeklyDay copy(java.time.DayOfWeek dayOfWeek) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectWeeklyDay(dayOfWeek);
        }

        /* renamed from: component1, reason: from getter */
        public final java.time.DayOfWeek getDayOfWeek() {
            return this.dayOfWeek;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectWeeklyDay copy$default(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectWeeklyDay onSelectWeeklyDay, java.time.DayOfWeek dayOfWeek, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                dayOfWeek = onSelectWeeklyDay.dayOfWeek;
            }
            return onSelectWeeklyDay.copy(dayOfWeek);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent$OnSelectBiweeklyDay;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent;", "Ljava/time/DayOfWeek;", "dayOfWeek", "<init>", "(Ljava/time/DayOfWeek;)V", "component1", "()Ljava/time/DayOfWeek;", "copy", "(Ljava/time/DayOfWeek;)Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent$OnSelectBiweeklyDay;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/time/DayOfWeek;", "getDayOfWeek"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSelectBiweeklyDay implements com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent {
        public static final int $stable = 0;
        private final java.time.DayOfWeek dayOfWeek;

        public OnSelectBiweeklyDay(java.time.DayOfWeek dayOfWeek) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
            this.dayOfWeek = dayOfWeek;
        }

        public final java.time.DayOfWeek getDayOfWeek() {
            return this.dayOfWeek;
        }

        public final java.lang.String toString() {
            java.time.DayOfWeek dayOfWeek = this.dayOfWeek;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSelectBiweeklyDay(dayOfWeek=");
            sb.append(dayOfWeek);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.dayOfWeek.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectBiweeklyDay) && this.dayOfWeek == ((com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectBiweeklyDay) other).dayOfWeek;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectBiweeklyDay copy(java.time.DayOfWeek dayOfWeek) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectBiweeklyDay(dayOfWeek);
        }

        /* renamed from: component1, reason: from getter */
        public final java.time.DayOfWeek getDayOfWeek() {
            return this.dayOfWeek;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectBiweeklyDay copy$default(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectBiweeklyDay onSelectBiweeklyDay, java.time.DayOfWeek dayOfWeek, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                dayOfWeek = onSelectBiweeklyDay.dayOfWeek;
            }
            return onSelectBiweeklyDay.copy(dayOfWeek);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent$OnSelectMonthlyDay;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent;", "Ljava/time/LocalDate;", "startDate", "<init>", "(Ljava/time/LocalDate;)V", "component1", "()Ljava/time/LocalDate;", "copy", "(Ljava/time/LocalDate;)Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent$OnSelectMonthlyDay;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/time/LocalDate;", "getStartDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSelectMonthlyDay implements com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent {
        public static final int $stable = 8;
        private final java.time.LocalDate startDate;

        public OnSelectMonthlyDay(java.time.LocalDate localDate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
            this.startDate = localDate;
        }

        public final java.time.LocalDate getStartDate() {
            return this.startDate;
        }

        public final java.lang.String toString() {
            java.time.LocalDate localDate = this.startDate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSelectMonthlyDay(startDate=");
            sb.append(localDate);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.startDate.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectMonthlyDay) && kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, ((com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectMonthlyDay) other).startDate);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectMonthlyDay copy(java.time.LocalDate startDate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDate, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectMonthlyDay(startDate);
        }

        /* renamed from: component1, reason: from getter */
        public final java.time.LocalDate getStartDate() {
            return this.startDate;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectMonthlyDay copy$default(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSelectMonthlyDay onSelectMonthlyDay, java.time.LocalDate localDate, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                localDate = onSelectMonthlyDay.startDate;
            }
            return onSelectMonthlyDay.copy(localDate);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent$OnSaveButtonClick;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSaveButtonClick implements com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSaveButtonClick INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSaveButtonClick();

        public final int hashCode() {
            return 2007930251;
        }

        private OnSaveButtonClick() {
        }

        public final java.lang.String toString() {
            return "OnSaveButtonClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnSaveButtonClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent$OnMonthInputClick;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMonthInputClick implements com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnMonthInputClick INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnMonthInputClick();

        public final int hashCode() {
            return 30530640;
        }

        private OnMonthInputClick() {
        }

        public final java.lang.String toString() {
            return "OnMonthInputClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnMonthInputClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent$OnMonthInputDismiss;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnMonthInputDismiss implements com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnMonthInputDismiss INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnMonthInputDismiss();

        public final int hashCode() {
            return 86325074;
        }

        private OnMonthInputDismiss() {
        }

        public final java.lang.String toString() {
            return "OnMonthInputDismiss";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnMonthInputDismiss)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent$OnChangeFrequencyType;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyTypeUi;", "frequency", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyTypeUi;)V", "component1", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyTypeUi;", "copy", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyTypeUi;)Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyEvent$OnChangeFrequencyType;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/frequency/FrequencyTypeUi;", "getFrequency"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnChangeFrequencyType implements com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi frequency;

        public OnChangeFrequencyType(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi frequencyTypeUi) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencyTypeUi, "");
            this.frequency = frequencyTypeUi;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi getFrequency() {
            return this.frequency;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi frequencyTypeUi = this.frequency;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnChangeFrequencyType(frequency=");
            sb.append(frequencyTypeUi);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.frequency.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnChangeFrequencyType) && this.frequency == ((com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnChangeFrequencyType) other).frequency;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnChangeFrequencyType copy(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi frequency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequency, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnChangeFrequencyType(frequency);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi getFrequency() {
            return this.frequency;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnChangeFrequencyType copy$default(com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyEvent.OnChangeFrequencyType onChangeFrequencyType, com.paypal.oslo.feature.balance.ui.autoReload.frequency.FrequencyTypeUi frequencyTypeUi, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                frequencyTypeUi = onChangeFrequencyType.frequency;
            }
            return onChangeFrequencyType.copy(frequencyTypeUi);
        }
    }
}
