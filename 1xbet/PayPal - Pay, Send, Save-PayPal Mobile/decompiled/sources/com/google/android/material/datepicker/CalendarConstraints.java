package com.google.android.material.datepicker;

/* loaded from: classes8.dex */
public final class CalendarConstraints implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.CalendarConstraints> CREATOR = new android.os.Parcelable.Creator<com.google.android.material.datepicker.CalendarConstraints>() { // from class: com.google.android.material.datepicker.CalendarConstraints.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.material.datepicker.CalendarConstraints createFromParcel(android.os.Parcel parcel) {
            return new com.google.android.material.datepicker.CalendarConstraints((com.google.android.material.datepicker.Month) parcel.readParcelable(com.google.android.material.datepicker.Month.class.getClassLoader()), (com.google.android.material.datepicker.Month) parcel.readParcelable(com.google.android.material.datepicker.Month.class.getClassLoader()), (com.google.android.material.datepicker.CalendarConstraints.DateValidator) parcel.readParcelable(com.google.android.material.datepicker.CalendarConstraints.DateValidator.class.getClassLoader()), (com.google.android.material.datepicker.Month) parcel.readParcelable(com.google.android.material.datepicker.Month.class.getClassLoader()), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.material.datepicker.CalendarConstraints[] newArray(int i) {
            return new com.google.android.material.datepicker.CalendarConstraints[i];
        }
    };
    private final com.google.android.material.datepicker.Month end;
    private final int firstDayOfWeek;
    private final int monthSpan;
    private com.google.android.material.datepicker.Month openAt;
    private final com.google.android.material.datepicker.Month start;
    private final com.google.android.material.datepicker.CalendarConstraints.DateValidator validator;
    private final int yearSpan;

    public interface DateValidator extends android.os.Parcelable {
        boolean isValid(long j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private CalendarConstraints(com.google.android.material.datepicker.Month month, com.google.android.material.datepicker.Month month2, com.google.android.material.datepicker.CalendarConstraints.DateValidator dateValidator, com.google.android.material.datepicker.Month month3, int i) {
        java.util.Objects.requireNonNull(month, "start cannot be null");
        java.util.Objects.requireNonNull(month2, "end cannot be null");
        java.util.Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.start = month;
        this.end = month2;
        this.openAt = month3;
        this.firstDayOfWeek = i;
        this.validator = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new java.lang.IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new java.lang.IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > com.google.android.material.datepicker.UtcDates.getUtcCalendar().getMaximum(7)) {
            throw new java.lang.IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.monthSpan = month.monthsUntil(month2) + 1;
        this.yearSpan = (month2.year - month.year) + 1;
    }

    final boolean isWithinBounds(long j) {
        if (this.start.getDay(1) > j) {
            return false;
        }
        com.google.android.material.datepicker.Month month = this.end;
        return j <= month.getDay(month.daysInMonth);
    }

    public final com.google.android.material.datepicker.CalendarConstraints.DateValidator getDateValidator() {
        return this.validator;
    }

    final com.google.android.material.datepicker.Month getStart() {
        return this.start;
    }

    final com.google.android.material.datepicker.Month getEnd() {
        return this.end;
    }

    final com.google.android.material.datepicker.Month getOpenAt() {
        return this.openAt;
    }

    final void setOpenAt(com.google.android.material.datepicker.Month month) {
        this.openAt = month;
    }

    final int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    final int getMonthSpan() {
        return this.monthSpan;
    }

    final int getYearSpan() {
        return this.yearSpan;
    }

    public final long getStartMs() {
        return this.start.timeInMillis;
    }

    public final long getEndMs() {
        return this.end.timeInMillis;
    }

    public final java.lang.Long getOpenAtMs() {
        com.google.android.material.datepicker.Month month = this.openAt;
        if (month == null) {
            return null;
        }
        return java.lang.Long.valueOf(month.timeInMillis);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.material.datepicker.CalendarConstraints)) {
            return false;
        }
        com.google.android.material.datepicker.CalendarConstraints calendarConstraints = (com.google.android.material.datepicker.CalendarConstraints) obj;
        return this.start.equals(calendarConstraints.start) && this.end.equals(calendarConstraints.end) && androidx.core.util.ObjectsCompat.equals(this.openAt, calendarConstraints.openAt) && this.firstDayOfWeek == calendarConstraints.firstDayOfWeek && this.validator.equals(calendarConstraints.validator);
    }

    public final int hashCode() {
        com.google.android.material.datepicker.Month month = this.start;
        com.google.android.material.datepicker.Month month2 = this.end;
        com.google.android.material.datepicker.Month month3 = this.openAt;
        int i = this.firstDayOfWeek;
        return java.util.Arrays.hashCode(new java.lang.Object[]{month, month2, month3, java.lang.Integer.valueOf(i), this.validator});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.start, 0);
        parcel.writeParcelable(this.end, 0);
        parcel.writeParcelable(this.openAt, 0);
        parcel.writeParcelable(this.validator, 0);
        parcel.writeInt(this.firstDayOfWeek);
    }

    final com.google.android.material.datepicker.Month clamp(com.google.android.material.datepicker.Month month) {
        if (month.compareTo(this.start) < 0) {
            return this.start;
        }
        return month.compareTo(this.end) > 0 ? this.end : month;
    }

    public static final class Builder {
        private static final java.lang.String DEEP_COPY_VALIDATOR_KEY = "DEEP_COPY_VALIDATOR_KEY";
        private long end;
        private int firstDayOfWeek;
        private java.lang.Long openAt;
        private long start;
        private com.google.android.material.datepicker.CalendarConstraints.DateValidator validator;
        static final long DEFAULT_START = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(com.google.android.material.datepicker.Month.create(1900, 0).timeInMillis);
        static final long DEFAULT_END = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(com.google.android.material.datepicker.Month.create(2100, 11).timeInMillis);

        public Builder() {
            this.start = DEFAULT_START;
            this.end = DEFAULT_END;
            this.validator = com.google.android.material.datepicker.DateValidatorPointForward.from(Long.MIN_VALUE);
        }

        Builder(com.google.android.material.datepicker.CalendarConstraints calendarConstraints) {
            this.start = DEFAULT_START;
            this.end = DEFAULT_END;
            this.validator = com.google.android.material.datepicker.DateValidatorPointForward.from(Long.MIN_VALUE);
            this.start = calendarConstraints.start.timeInMillis;
            this.end = calendarConstraints.end.timeInMillis;
            this.openAt = java.lang.Long.valueOf(calendarConstraints.openAt.timeInMillis);
            this.firstDayOfWeek = calendarConstraints.firstDayOfWeek;
            this.validator = calendarConstraints.validator;
        }

        public final com.google.android.material.datepicker.CalendarConstraints.Builder setStart(long j) {
            this.start = j;
            return this;
        }

        public final com.google.android.material.datepicker.CalendarConstraints.Builder setEnd(long j) {
            this.end = j;
            return this;
        }

        public final com.google.android.material.datepicker.CalendarConstraints.Builder setOpenAt(long j) {
            this.openAt = java.lang.Long.valueOf(j);
            return this;
        }

        public final com.google.android.material.datepicker.CalendarConstraints.Builder setFirstDayOfWeek(int i) {
            this.firstDayOfWeek = i;
            return this;
        }

        public final com.google.android.material.datepicker.CalendarConstraints.Builder setValidator(com.google.android.material.datepicker.CalendarConstraints.DateValidator dateValidator) {
            java.util.Objects.requireNonNull(dateValidator, "validator cannot be null");
            this.validator = dateValidator;
            return this;
        }

        public final com.google.android.material.datepicker.CalendarConstraints build() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(DEEP_COPY_VALIDATOR_KEY, this.validator);
            com.google.android.material.datepicker.Month create = com.google.android.material.datepicker.Month.create(this.start);
            com.google.android.material.datepicker.Month create2 = com.google.android.material.datepicker.Month.create(this.end);
            com.google.android.material.datepicker.CalendarConstraints.DateValidator dateValidator = (com.google.android.material.datepicker.CalendarConstraints.DateValidator) bundle.getParcelable(DEEP_COPY_VALIDATOR_KEY);
            java.lang.Long l = this.openAt;
            return new com.google.android.material.datepicker.CalendarConstraints(create, create2, dateValidator, l == null ? null : com.google.android.material.datepicker.Month.create(l.longValue()), this.firstDayOfWeek);
        }
    }
}
