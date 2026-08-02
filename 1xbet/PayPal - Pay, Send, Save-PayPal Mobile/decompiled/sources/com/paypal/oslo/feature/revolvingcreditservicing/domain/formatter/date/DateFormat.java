package com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat;", "", "<init>", "()V", "DateMonthDayLong", "DateMonthDayShort", "DateAndTimeMonthDayShort", "DateMonthLong", "DateNumeric", "DateLong", "DateYear", "Day", "DayWithOrdinal", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat$DateAndTimeMonthDayShort;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat$DateLong;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat$DateMonthDayLong;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat$DateMonthDayShort;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat$DateMonthLong;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat$DateNumeric;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat$DateYear;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat$Day;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat$DayWithOrdinal;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class DateFormat {
    public static final int $stable = 0;

    private DateFormat() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat$DateMonthDayLong;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DateMonthDayLong extends com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayLong INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayLong();

        public final int hashCode() {
            return -109655699;
        }

        private DateMonthDayLong() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DateMonthDayLong";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayLong)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat$DateMonthDayShort;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DateMonthDayShort extends com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayShort INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayShort();

        public final int hashCode() {
            return 901898155;
        }

        private DateMonthDayShort() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DateMonthDayShort";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthDayShort)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat$DateAndTimeMonthDayShort;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DateAndTimeMonthDayShort extends com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateAndTimeMonthDayShort INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateAndTimeMonthDayShort();

        public final int hashCode() {
            return -1629140783;
        }

        private DateAndTimeMonthDayShort() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DateAndTimeMonthDayShort";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateAndTimeMonthDayShort)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat$DateMonthLong;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DateMonthLong extends com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthLong INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthLong();

        public final int hashCode() {
            return -766303897;
        }

        private DateMonthLong() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DateMonthLong";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateMonthLong)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat$DateNumeric;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DateNumeric extends com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateNumeric INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateNumeric();

        public final int hashCode() {
            return -2133936616;
        }

        private DateNumeric() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DateNumeric";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateNumeric)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat$DateLong;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DateLong extends com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateLong INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateLong();

        public final int hashCode() {
            return -702677167;
        }

        private DateLong() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DateLong";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateLong)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat$DateYear;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DateYear extends com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateYear INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateYear();

        public final int hashCode() {
            return -702299886;
        }

        private DateYear() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DateYear";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DateYear)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat$Day;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Day extends com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.Day INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.Day();

        public final int hashCode() {
            return -1105887435;
        }

        private Day() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Day";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.Day)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat$DayWithOrdinal;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/date/DateFormat;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DayWithOrdinal extends com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DayWithOrdinal INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DayWithOrdinal();

        public final int hashCode() {
            return 356015190;
        }

        private DayWithOrdinal() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DayWithOrdinal";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormat.DayWithOrdinal)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ DateFormat(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
