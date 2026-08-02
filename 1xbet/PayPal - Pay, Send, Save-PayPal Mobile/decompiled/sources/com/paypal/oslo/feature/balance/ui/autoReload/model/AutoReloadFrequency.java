package com.paypal.oslo.feature.balance.ui.autoReload.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "", "Weekly", "Biweekly", "Monthly", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency$Biweekly;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency$Monthly;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency$Weekly;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AutoReloadFrequency {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency$Weekly;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "Ljava/time/DayOfWeek;", "dayOfWeek", "<init>", "(Ljava/time/DayOfWeek;)V", "component1", "()Ljava/time/DayOfWeek;", "copy", "(Ljava/time/DayOfWeek;)Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency$Weekly;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/time/DayOfWeek;", "getDayOfWeek"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class Weekly implements com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency {
        public static final int $stable = 0;
        private final java.time.DayOfWeek dayOfWeek;

        public Weekly(java.time.DayOfWeek dayOfWeek) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
            this.dayOfWeek = dayOfWeek;
        }

        public final java.time.DayOfWeek getDayOfWeek() {
            return this.dayOfWeek;
        }

        public final java.lang.String toString() {
            java.time.DayOfWeek dayOfWeek = this.dayOfWeek;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Weekly(dayOfWeek=");
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
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly) && this.dayOfWeek == ((com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly) other).dayOfWeek;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly copy(java.time.DayOfWeek dayOfWeek) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly(dayOfWeek);
        }

        /* renamed from: component1, reason: from getter */
        public final java.time.DayOfWeek getDayOfWeek() {
            return this.dayOfWeek;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly copy$default(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Weekly weekly, java.time.DayOfWeek dayOfWeek, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                dayOfWeek = weekly.dayOfWeek;
            }
            return weekly.copy(dayOfWeek);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency$Biweekly;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "Ljava/time/DayOfWeek;", "dayOfWeek", "<init>", "(Ljava/time/DayOfWeek;)V", "component1", "()Ljava/time/DayOfWeek;", "copy", "(Ljava/time/DayOfWeek;)Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency$Biweekly;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/time/DayOfWeek;", "getDayOfWeek"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class Biweekly implements com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency {
        public static final int $stable = 0;
        private final java.time.DayOfWeek dayOfWeek;

        public Biweekly(java.time.DayOfWeek dayOfWeek) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
            this.dayOfWeek = dayOfWeek;
        }

        public final java.time.DayOfWeek getDayOfWeek() {
            return this.dayOfWeek;
        }

        public final java.lang.String toString() {
            java.time.DayOfWeek dayOfWeek = this.dayOfWeek;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Biweekly(dayOfWeek=");
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
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Biweekly) && this.dayOfWeek == ((com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Biweekly) other).dayOfWeek;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Biweekly copy(java.time.DayOfWeek dayOfWeek) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Biweekly(dayOfWeek);
        }

        /* renamed from: component1, reason: from getter */
        public final java.time.DayOfWeek getDayOfWeek() {
            return this.dayOfWeek;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Biweekly copy$default(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Biweekly biweekly, java.time.DayOfWeek dayOfWeek, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                dayOfWeek = biweekly.dayOfWeek;
            }
            return biweekly.copy(dayOfWeek);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency$Monthly;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency;", "Ljava/time/LocalDate;", "startDate", "<init>", "(Ljava/time/LocalDate;)V", "component1", "()Ljava/time/LocalDate;", "copy", "(Ljava/time/LocalDate;)Lcom/paypal/oslo/feature/balance/ui/autoReload/model/AutoReloadFrequency$Monthly;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/time/LocalDate;", "getStartDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* data */ class Monthly implements com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency {
        public static final int $stable = 8;
        private final java.time.LocalDate startDate;

        public Monthly(java.time.LocalDate localDate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
            this.startDate = localDate;
        }

        public final java.time.LocalDate getStartDate() {
            return this.startDate;
        }

        public final java.lang.String toString() {
            java.time.LocalDate localDate = this.startDate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Monthly(startDate=");
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
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly) && kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, ((com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly) other).startDate);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly copy(java.time.LocalDate startDate) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startDate, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly(startDate);
        }

        /* renamed from: component1, reason: from getter */
        public final java.time.LocalDate getStartDate() {
            return this.startDate;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly copy$default(com.paypal.oslo.feature.balance.ui.autoReload.model.AutoReloadFrequency.Monthly monthly, java.time.LocalDate localDate, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                localDate = monthly.startDate;
            }
            return monthly.copy(localDate);
        }
    }
}
