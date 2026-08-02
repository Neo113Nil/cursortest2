package com.paypal.oslo.feature.activity.domain.base.utils.datetime;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange;", "", "<init>", "()V", "", "getCalendarIdentifier", "()I", "calendarIdentifier", "getRange", "range", "NDays", "Month", "Year", "PastMonth", "Past3Month", "ThisMonth", "CustomDateRange", "Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$CustomDateRange;", "Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$Month;", "Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$NDays;", "Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$Past3Month;", "Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$PastMonth;", "Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$ThisMonth;", "Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$Year;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class DateTimeRange {
    public static final int $stable = 0;

    public abstract int getCalendarIdentifier();

    public abstract int getRange();

    private DateTimeRange() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$NDays;", "Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange;", "", "range", "calendarIdentifier", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$NDays;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getRange", "getCalendarIdentifier"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NDays extends com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange {
        public static final int $stable = 0;
        private final int calendarIdentifier;
        private final int range;

        public NDays(int i, int i2) {
            super(null);
            this.range = i;
            this.calendarIdentifier = i2;
        }

        public /* synthetic */ NDays(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? 5 : i2);
        }

        @Override // com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange
        public final int getRange() {
            return this.range;
        }

        @Override // com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange
        public final int getCalendarIdentifier() {
            return this.calendarIdentifier;
        }

        public final java.lang.String toString() {
            int i = this.range;
            int i2 = this.calendarIdentifier;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NDays(range=");
            sb.append(i);
            sb.append(", calendarIdentifier=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.range) * 31) + java.lang.Integer.hashCode(this.calendarIdentifier);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.NDays)) {
                return false;
            }
            com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.NDays nDays = (com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.NDays) other;
            return this.range == nDays.range && this.calendarIdentifier == nDays.calendarIdentifier;
        }

        public final com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.NDays copy(int range, int calendarIdentifier) {
            return new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.NDays(range, calendarIdentifier);
        }

        /* renamed from: component2, reason: from getter */
        public final int getCalendarIdentifier() {
            return this.calendarIdentifier;
        }

        /* renamed from: component1, reason: from getter */
        public final int getRange() {
            return this.range;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.NDays copy$default(com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.NDays nDays, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = nDays.range;
            }
            if ((i3 & 2) != 0) {
                i2 = nDays.calendarIdentifier;
            }
            return nDays.copy(i, i2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$Month;", "Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange;", "", "range", "calendarIdentifier", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$Month;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getRange", "getCalendarIdentifier"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Month extends com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange {
        public static final int $stable = 0;
        private final int calendarIdentifier;
        private final int range;

        public Month(int i, int i2) {
            super(null);
            this.range = i;
            this.calendarIdentifier = i2;
        }

        public /* synthetic */ Month(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? 2 : i2);
        }

        @Override // com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange
        public final int getRange() {
            return this.range;
        }

        @Override // com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange
        public final int getCalendarIdentifier() {
            return this.calendarIdentifier;
        }

        public final java.lang.String toString() {
            int i = this.range;
            int i2 = this.calendarIdentifier;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Month(range=");
            sb.append(i);
            sb.append(", calendarIdentifier=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.range) * 31) + java.lang.Integer.hashCode(this.calendarIdentifier);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Month)) {
                return false;
            }
            com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Month month = (com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Month) other;
            return this.range == month.range && this.calendarIdentifier == month.calendarIdentifier;
        }

        public final com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Month copy(int range, int calendarIdentifier) {
            return new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Month(range, calendarIdentifier);
        }

        /* renamed from: component2, reason: from getter */
        public final int getCalendarIdentifier() {
            return this.calendarIdentifier;
        }

        /* renamed from: component1, reason: from getter */
        public final int getRange() {
            return this.range;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Month copy$default(com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Month month, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = month.range;
            }
            if ((i3 & 2) != 0) {
                i2 = month.calendarIdentifier;
            }
            return month.copy(i, i2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$Year;", "Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange;", "", "range", "calendarIdentifier", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$Year;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getRange", "getCalendarIdentifier"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Year extends com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange {
        public static final int $stable = 0;
        private final int calendarIdentifier;
        private final int range;

        public Year(int i, int i2) {
            super(null);
            this.range = i;
            this.calendarIdentifier = i2;
        }

        public /* synthetic */ Year(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i3 & 2) != 0 ? 1 : i2);
        }

        @Override // com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange
        public final int getRange() {
            return this.range;
        }

        @Override // com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange
        public final int getCalendarIdentifier() {
            return this.calendarIdentifier;
        }

        public final java.lang.String toString() {
            int i = this.range;
            int i2 = this.calendarIdentifier;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Year(range=");
            sb.append(i);
            sb.append(", calendarIdentifier=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.range) * 31) + java.lang.Integer.hashCode(this.calendarIdentifier);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Year)) {
                return false;
            }
            com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Year year = (com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Year) other;
            return this.range == year.range && this.calendarIdentifier == year.calendarIdentifier;
        }

        public final com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Year copy(int range, int calendarIdentifier) {
            return new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Year(range, calendarIdentifier);
        }

        /* renamed from: component2, reason: from getter */
        public final int getCalendarIdentifier() {
            return this.calendarIdentifier;
        }

        /* renamed from: component1, reason: from getter */
        public final int getRange() {
            return this.range;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Year copy$default(com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Year year, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = year.range;
            }
            if ((i3 & 2) != 0) {
                i2 = year.calendarIdentifier;
            }
            return year.copy(i, i2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$PastMonth;", "Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange;", "", "range", "calendarIdentifier", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$PastMonth;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getRange", "getCalendarIdentifier"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PastMonth extends com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange {
        public static final int $stable = 0;
        private final int calendarIdentifier;
        private final int range;

        public PastMonth(int i, int i2) {
            super(null);
            this.range = i;
            this.calendarIdentifier = i2;
        }

        public /* synthetic */ PastMonth(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? 2 : i2);
        }

        @Override // com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange
        public final int getRange() {
            return this.range;
        }

        @Override // com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange
        public final int getCalendarIdentifier() {
            return this.calendarIdentifier;
        }

        public final java.lang.String toString() {
            int i = this.range;
            int i2 = this.calendarIdentifier;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PastMonth(range=");
            sb.append(i);
            sb.append(", calendarIdentifier=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.range) * 31) + java.lang.Integer.hashCode(this.calendarIdentifier);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.PastMonth)) {
                return false;
            }
            com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.PastMonth pastMonth = (com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.PastMonth) other;
            return this.range == pastMonth.range && this.calendarIdentifier == pastMonth.calendarIdentifier;
        }

        public final com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.PastMonth copy(int range, int calendarIdentifier) {
            return new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.PastMonth(range, calendarIdentifier);
        }

        /* renamed from: component2, reason: from getter */
        public final int getCalendarIdentifier() {
            return this.calendarIdentifier;
        }

        /* renamed from: component1, reason: from getter */
        public final int getRange() {
            return this.range;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.PastMonth copy$default(com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.PastMonth pastMonth, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = pastMonth.range;
            }
            if ((i3 & 2) != 0) {
                i2 = pastMonth.calendarIdentifier;
            }
            return pastMonth.copy(i, i2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public PastMonth() {
            this(r2, r2, 3, null);
            int i = 0;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$Past3Month;", "Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange;", "", "range", "calendarIdentifier", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$Past3Month;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getRange", "getCalendarIdentifier"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Past3Month extends com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange {
        public static final int $stable = 0;
        private final int calendarIdentifier;
        private final int range;

        public Past3Month(int i, int i2) {
            super(null);
            this.range = i;
            this.calendarIdentifier = i2;
        }

        public /* synthetic */ Past3Month(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? -3 : i, (i3 & 2) != 0 ? 2 : i2);
        }

        @Override // com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange
        public final int getRange() {
            return this.range;
        }

        @Override // com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange
        public final int getCalendarIdentifier() {
            return this.calendarIdentifier;
        }

        public final java.lang.String toString() {
            int i = this.range;
            int i2 = this.calendarIdentifier;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Past3Month(range=");
            sb.append(i);
            sb.append(", calendarIdentifier=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.range) * 31) + java.lang.Integer.hashCode(this.calendarIdentifier);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Past3Month)) {
                return false;
            }
            com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Past3Month past3Month = (com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Past3Month) other;
            return this.range == past3Month.range && this.calendarIdentifier == past3Month.calendarIdentifier;
        }

        public final com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Past3Month copy(int range, int calendarIdentifier) {
            return new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Past3Month(range, calendarIdentifier);
        }

        /* renamed from: component2, reason: from getter */
        public final int getCalendarIdentifier() {
            return this.calendarIdentifier;
        }

        /* renamed from: component1, reason: from getter */
        public final int getRange() {
            return this.range;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Past3Month copy$default(com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.Past3Month past3Month, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = past3Month.range;
            }
            if ((i3 & 2) != 0) {
                i2 = past3Month.calendarIdentifier;
            }
            return past3Month.copy(i, i2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Past3Month() {
            this(r2, r2, 3, null);
            int i = 0;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$ThisMonth;", "Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange;", "", "range", "calendarIdentifier", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$ThisMonth;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getRange", "getCalendarIdentifier"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ThisMonth extends com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange {
        public static final int $stable = 0;
        private final int calendarIdentifier;
        private final int range;

        public ThisMonth(int i, int i2) {
            super(null);
            this.range = i;
            this.calendarIdentifier = i2;
        }

        public /* synthetic */ ThisMonth(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? 2 : i2);
        }

        @Override // com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange
        public final int getRange() {
            return this.range;
        }

        @Override // com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange
        public final int getCalendarIdentifier() {
            return this.calendarIdentifier;
        }

        public final java.lang.String toString() {
            int i = this.range;
            int i2 = this.calendarIdentifier;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ThisMonth(range=");
            sb.append(i);
            sb.append(", calendarIdentifier=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.range) * 31) + java.lang.Integer.hashCode(this.calendarIdentifier);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.ThisMonth)) {
                return false;
            }
            com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.ThisMonth thisMonth = (com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.ThisMonth) other;
            return this.range == thisMonth.range && this.calendarIdentifier == thisMonth.calendarIdentifier;
        }

        public final com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.ThisMonth copy(int range, int calendarIdentifier) {
            return new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.ThisMonth(range, calendarIdentifier);
        }

        /* renamed from: component2, reason: from getter */
        public final int getCalendarIdentifier() {
            return this.calendarIdentifier;
        }

        /* renamed from: component1, reason: from getter */
        public final int getRange() {
            return this.range;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.ThisMonth copy$default(com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.ThisMonth thisMonth, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = thisMonth.range;
            }
            if ((i3 & 2) != 0) {
                i2 = thisMonth.calendarIdentifier;
            }
            return thisMonth.copy(i, i2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ThisMonth() {
            this(r2, r2, 3, null);
            int i = 0;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ<\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$CustomDateRange;", "Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange;", "", "startDate", "endDate", "", "range", "calendarIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;II)Lcom/paypal/oslo/feature/activity/domain/base/utils/datetime/DateTimeRange$CustomDateRange;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getStartDate", "getEndDate", com.visa.cbp.getEncExpo.warmup, "getRange", "getCalendarIdentifier"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CustomDateRange extends com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange {
        public static final int $stable = 0;
        private final int calendarIdentifier;
        private final java.lang.String endDate;
        private final int range;
        private final java.lang.String startDate;

        public CustomDateRange(java.lang.String str, java.lang.String str2, int i, int i2) {
            super(null);
            this.startDate = str;
            this.endDate = str2;
            this.range = i;
            this.calendarIdentifier = i2;
        }

        public /* synthetic */ CustomDateRange(java.lang.String str, java.lang.String str2, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 5 : i2);
        }

        public final java.lang.String getStartDate() {
            return this.startDate;
        }

        public final java.lang.String getEndDate() {
            return this.endDate;
        }

        @Override // com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange
        public final int getRange() {
            return this.range;
        }

        @Override // com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange
        public final int getCalendarIdentifier() {
            return this.calendarIdentifier;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.startDate;
            java.lang.String str2 = this.endDate;
            int i = this.range;
            int i2 = this.calendarIdentifier;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomDateRange(startDate=");
            sb.append(str);
            sb.append(", endDate=");
            sb.append(str2);
            sb.append(", range=");
            sb.append(i);
            sb.append(", calendarIdentifier=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.startDate;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.endDate;
            return (((((hashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.range)) * 31) + java.lang.Integer.hashCode(this.calendarIdentifier);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.CustomDateRange)) {
                return false;
            }
            com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.CustomDateRange customDateRange = (com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.CustomDateRange) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, customDateRange.startDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.endDate, customDateRange.endDate) && this.range == customDateRange.range && this.calendarIdentifier == customDateRange.calendarIdentifier;
        }

        public final com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.CustomDateRange copy(java.lang.String startDate, java.lang.String endDate, int range, int calendarIdentifier) {
            return new com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.CustomDateRange(startDate, endDate, range, calendarIdentifier);
        }

        /* renamed from: component4, reason: from getter */
        public final int getCalendarIdentifier() {
            return this.calendarIdentifier;
        }

        /* renamed from: component3, reason: from getter */
        public final int getRange() {
            return this.range;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getEndDate() {
            return this.endDate;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getStartDate() {
            return this.startDate;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.CustomDateRange copy$default(com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeRange.CustomDateRange customDateRange, java.lang.String str, java.lang.String str2, int i, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = customDateRange.startDate;
            }
            if ((i3 & 2) != 0) {
                str2 = customDateRange.endDate;
            }
            if ((i3 & 4) != 0) {
                i = customDateRange.range;
            }
            if ((i3 & 8) != 0) {
                i2 = customDateRange.calendarIdentifier;
            }
            return customDateRange.copy(str, str2, i, i2);
        }

        public CustomDateRange() {
            this(null, null, 0, 0, 15, null);
        }
    }

    public /* synthetic */ DateTimeRange(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
