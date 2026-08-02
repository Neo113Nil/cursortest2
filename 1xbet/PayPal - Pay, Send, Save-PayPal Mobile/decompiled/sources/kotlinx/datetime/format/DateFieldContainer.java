package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b`\u0018\u00002\u00020\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0004\"\u0004\b\f\u0010\u0006À\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/DateFieldContainer;", "Lkotlinx/datetime/format/YearMonthFieldContainer;", "", "getDay", "()Ljava/lang/Integer;", "setDay", "(Ljava/lang/Integer;)V", "day", "getDayOfWeek", "setDayOfWeek", "dayOfWeek", "getDayOfYear", "setDayOfYear", "dayOfYear"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DateFieldContainer extends kotlinx.datetime.format.YearMonthFieldContainer {
    java.lang.Integer getDay();

    java.lang.Integer getDayOfWeek();

    java.lang.Integer getDayOfYear();

    void setDay(java.lang.Integer num);

    void setDayOfWeek(java.lang.Integer num);

    void setDayOfYear(java.lang.Integer num);
}
