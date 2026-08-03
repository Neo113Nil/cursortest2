package io.ktor.http;

/* compiled from: CookieUtils.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR$\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\r¨\u0006!"}, d2 = {"Lio/ktor/http/CookieDateBuilder;", "", "<init>", "()V", "Lio/ktor/util/date/GMTDate;", "build", "()Lio/ktor/util/date/GMTDate;", "", "seconds", "Ljava/lang/Integer;", "getSeconds", "()Ljava/lang/Integer;", "setSeconds", "(Ljava/lang/Integer;)V", "minutes", "getMinutes", "setMinutes", "hours", "getHours", "setHours", "dayOfMonth", "getDayOfMonth", "setDayOfMonth", "Lio/ktor/util/date/Month;", "month", "Lio/ktor/util/date/Month;", "getMonth", "()Lio/ktor/util/date/Month;", "setMonth", "(Lio/ktor/util/date/Month;)V", "year", "getYear", "setYear", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CookieDateBuilder {
    private java.lang.Integer dayOfMonth;
    private java.lang.Integer hours;
    private java.lang.Integer minutes;
    private io.ktor.util.date.Month month;
    private java.lang.Integer seconds;
    private java.lang.Integer year;

    public final java.lang.Integer getSeconds() {
        return this.seconds;
    }

    public final void setSeconds(java.lang.Integer num) {
        this.seconds = num;
    }

    public final java.lang.Integer getMinutes() {
        return this.minutes;
    }

    public final void setMinutes(java.lang.Integer num) {
        this.minutes = num;
    }

    public final java.lang.Integer getHours() {
        return this.hours;
    }

    public final void setHours(java.lang.Integer num) {
        this.hours = num;
    }

    public final java.lang.Integer getDayOfMonth() {
        return this.dayOfMonth;
    }

    public final void setDayOfMonth(java.lang.Integer num) {
        this.dayOfMonth = num;
    }

    public final io.ktor.util.date.Month getMonth() {
        return this.month;
    }

    public final void setMonth(io.ktor.util.date.Month month) {
        this.month = month;
    }

    public final java.lang.Integer getYear() {
        return this.year;
    }

    public final void setYear(java.lang.Integer num) {
        this.year = num;
    }

    public final io.ktor.util.date.GMTDate build() {
        java.lang.Integer num = this.seconds;
        kotlin.jvm.internal.Intrinsics.checkNotNull(num);
        int intValue = num.intValue();
        java.lang.Integer num2 = this.minutes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(num2);
        int intValue2 = num2.intValue();
        java.lang.Integer num3 = this.hours;
        kotlin.jvm.internal.Intrinsics.checkNotNull(num3);
        int intValue3 = num3.intValue();
        java.lang.Integer num4 = this.dayOfMonth;
        kotlin.jvm.internal.Intrinsics.checkNotNull(num4);
        int intValue4 = num4.intValue();
        io.ktor.util.date.Month month = this.month;
        kotlin.jvm.internal.Intrinsics.checkNotNull(month);
        java.lang.Integer num5 = this.year;
        kotlin.jvm.internal.Intrinsics.checkNotNull(num5);
        return io.ktor.util.date.DateJvmKt.GMTDate(intValue, intValue2, intValue3, intValue4, month, num5.intValue());
    }
}
