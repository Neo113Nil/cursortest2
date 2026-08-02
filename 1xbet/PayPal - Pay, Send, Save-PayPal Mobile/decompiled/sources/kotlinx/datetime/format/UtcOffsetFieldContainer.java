package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b`\u0018\u00002\u00020\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001e\u0010\r\u001a\u0004\u0018\u00010\b8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\b8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\b8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fÀ\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/UtcOffsetFieldContainer;", "", "", "getOffsetIsNegative", "()Ljava/lang/Boolean;", "setOffsetIsNegative", "(Ljava/lang/Boolean;)V", "offsetIsNegative", "", "getOffsetHours", "()Ljava/lang/Integer;", "setOffsetHours", "(Ljava/lang/Integer;)V", "offsetHours", "getOffsetMinutesOfHour", "setOffsetMinutesOfHour", "offsetMinutesOfHour", "getOffsetSecondsOfMinute", "setOffsetSecondsOfMinute", "offsetSecondsOfMinute"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface UtcOffsetFieldContainer {
    java.lang.Integer getOffsetHours();

    java.lang.Boolean getOffsetIsNegative();

    java.lang.Integer getOffsetMinutesOfHour();

    java.lang.Integer getOffsetSecondsOfMinute();

    void setOffsetHours(java.lang.Integer num);

    void setOffsetIsNegative(java.lang.Boolean bool);

    void setOffsetMinutesOfHour(java.lang.Integer num);

    void setOffsetSecondsOfMinute(java.lang.Integer num);
}
