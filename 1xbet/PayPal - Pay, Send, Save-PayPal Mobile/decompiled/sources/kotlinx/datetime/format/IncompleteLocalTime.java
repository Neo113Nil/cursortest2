package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002BO\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010 \u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010\b\u001a\u0004\u0018\u00010\u00038\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u0010 \u001a\u0004\b,\u0010\"\"\u0004\b-\u0010$R$\u0010\t\u001a\u0004\u0018\u00010\u00038\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u0010 \u001a\u0004\b.\u0010\"\"\u0004\b/\u0010$R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010 \u001a\u0004\b0\u0010\"\"\u0004\b1\u0010$"}, d2 = {"Lkotlinx/datetime/format/IncompleteLocalTime;", "Lkotlinx/datetime/format/TimeFieldContainer;", "Lkotlinx/datetime/internal/format/parser/Copyable;", "", "hour", "hourOfAmPm", "Lkotlinx/datetime/format/AmPmMarker;", "amPm", "minute", "second", "nanosecond", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/datetime/format/AmPmMarker;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lkotlinx/datetime/LocalTime;", "toLocalTime", "()Lkotlinx/datetime/LocalTime;", "localTime", "", "populateFrom", "(Lkotlinx/datetime/LocalTime;)V", "copy", "()Lkotlinx/datetime/format/IncompleteLocalTime;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getHour", "()Ljava/lang/Integer;", "setHour", "(Ljava/lang/Integer;)V", "getHourOfAmPm", "setHourOfAmPm", "Lkotlinx/datetime/format/AmPmMarker;", "getAmPm", "()Lkotlinx/datetime/format/AmPmMarker;", "setAmPm", "(Lkotlinx/datetime/format/AmPmMarker;)V", "getMinute", "setMinute", "getSecond", "setSecond", "getNanosecond", "setNanosecond"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IncompleteLocalTime implements kotlinx.datetime.format.TimeFieldContainer, kotlinx.datetime.internal.format.parser.Copyable<kotlinx.datetime.format.IncompleteLocalTime> {
    private kotlinx.datetime.format.AmPmMarker amPm;
    private java.lang.Integer hour;
    private java.lang.Integer hourOfAmPm;
    private java.lang.Integer minute;
    private java.lang.Integer nanosecond;
    private java.lang.Integer second;

    public IncompleteLocalTime(java.lang.Integer num, java.lang.Integer num2, kotlinx.datetime.format.AmPmMarker amPmMarker, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5) {
        this.hour = num;
        this.hourOfAmPm = num2;
        this.amPm = amPmMarker;
        this.minute = num3;
        this.second = num4;
        this.nanosecond = num5;
    }

    public /* synthetic */ IncompleteLocalTime(java.lang.Integer num, java.lang.Integer num2, kotlinx.datetime.format.AmPmMarker amPmMarker, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : amPmMarker, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : num5);
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public final java.lang.Integer getHour() {
        return this.hour;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public final void setHour(java.lang.Integer num) {
        this.hour = num;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public final java.lang.Integer getHourOfAmPm() {
        return this.hourOfAmPm;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public final void setHourOfAmPm(java.lang.Integer num) {
        this.hourOfAmPm = num;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public final kotlinx.datetime.format.AmPmMarker getAmPm() {
        return this.amPm;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public final void setAmPm(kotlinx.datetime.format.AmPmMarker amPmMarker) {
        this.amPm = amPmMarker;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public final java.lang.Integer getMinute() {
        return this.minute;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public final void setMinute(java.lang.Integer num) {
        this.minute = num;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public final java.lang.Integer getSecond() {
        return this.second;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public final void setSecond(java.lang.Integer num) {
        this.second = num;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public final java.lang.Integer getNanosecond() {
        return this.nanosecond;
    }

    @Override // kotlinx.datetime.format.TimeFieldContainer
    public final void setNanosecond(java.lang.Integer num) {
        this.nanosecond = num;
    }

    public final kotlinx.datetime.LocalTime toLocalTime() {
        int intValue;
        int intValue2;
        java.lang.Integer hour = getHour();
        if (hour != null) {
            intValue = hour.intValue();
            java.lang.Integer hourOfAmPm = getHourOfAmPm();
            if (hourOfAmPm != null && ((intValue + 11) % 12) + 1 != (intValue2 = hourOfAmPm.intValue())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Inconsistent hour and hour-of-am-pm: hour is ");
                sb.append(intValue);
                sb.append(", but hour-of-am-pm is ");
                sb.append(intValue2);
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            kotlinx.datetime.format.AmPmMarker amPm = getAmPm();
            if (amPm != null) {
                if ((amPm == kotlinx.datetime.format.AmPmMarker.PM) != (intValue >= 12)) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Inconsistent hour and the AM/PM marker: hour is ");
                    sb2.append(intValue);
                    sb2.append(", but the AM/PM marker is ");
                    sb2.append(amPm);
                    throw new java.lang.IllegalArgumentException(sb2.toString().toString());
                }
            }
        } else {
            java.lang.Integer hourOfAmPm2 = getHourOfAmPm();
            java.lang.Integer num = null;
            if (hourOfAmPm2 != null) {
                int intValue3 = hourOfAmPm2.intValue();
                kotlinx.datetime.format.AmPmMarker amPm2 = getAmPm();
                if (amPm2 != null) {
                    if (intValue3 == 12) {
                        intValue3 = 0;
                    }
                    num = java.lang.Integer.valueOf(intValue3 + (amPm2 != kotlinx.datetime.format.AmPmMarker.PM ? 0 : 12));
                }
            }
            if (num != null) {
                intValue = num.intValue();
            } else {
                throw new kotlinx.datetime.DateTimeFormatException("Incomplete time: missing hour");
            }
        }
        int intValue4 = ((java.lang.Number) kotlinx.datetime.format.YearMonthFormatKt.requireParsedField(getMinute(), "minute")).intValue();
        java.lang.Integer second = getSecond();
        int intValue5 = second != null ? second.intValue() : 0;
        java.lang.Integer nanosecond = getNanosecond();
        return new kotlinx.datetime.LocalTime(intValue, intValue4, intValue5, nanosecond != null ? nanosecond.intValue() : 0);
    }

    public final void populateFrom(kotlinx.datetime.LocalTime localTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localTime, "");
        setHour(java.lang.Integer.valueOf(localTime.getHour()));
        setHourOfAmPm(java.lang.Integer.valueOf(((localTime.getHour() + 11) % 12) + 1));
        setAmPm(localTime.getHour() >= 12 ? kotlinx.datetime.format.AmPmMarker.PM : kotlinx.datetime.format.AmPmMarker.AM);
        setMinute(java.lang.Integer.valueOf(localTime.getMinute()));
        setSecond(java.lang.Integer.valueOf(localTime.getSecond()));
        setNanosecond(java.lang.Integer.valueOf(localTime.getNanosecond()));
    }

    @Override // kotlinx.datetime.internal.format.parser.Copyable
    public final kotlinx.datetime.format.IncompleteLocalTime copy() {
        return new kotlinx.datetime.format.IncompleteLocalTime(getHour(), getHourOfAmPm(), getAmPm(), getMinute(), getSecond(), getNanosecond());
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof kotlinx.datetime.format.IncompleteLocalTime)) {
            return false;
        }
        kotlinx.datetime.format.IncompleteLocalTime incompleteLocalTime = (kotlinx.datetime.format.IncompleteLocalTime) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(getHour(), incompleteLocalTime.getHour()) && kotlin.jvm.internal.Intrinsics.areEqual(getHourOfAmPm(), incompleteLocalTime.getHourOfAmPm()) && getAmPm() == incompleteLocalTime.getAmPm() && kotlin.jvm.internal.Intrinsics.areEqual(getMinute(), incompleteLocalTime.getMinute()) && kotlin.jvm.internal.Intrinsics.areEqual(getSecond(), incompleteLocalTime.getSecond()) && kotlin.jvm.internal.Intrinsics.areEqual(getNanosecond(), incompleteLocalTime.getNanosecond());
    }

    public final int hashCode() {
        java.lang.Integer hour = getHour();
        int intValue = hour != null ? hour.intValue() : 0;
        java.lang.Integer hourOfAmPm = getHourOfAmPm();
        int intValue2 = hourOfAmPm != null ? hourOfAmPm.intValue() : 0;
        kotlinx.datetime.format.AmPmMarker amPm = getAmPm();
        int hashCode = amPm != null ? amPm.hashCode() : 0;
        java.lang.Integer minute = getMinute();
        int intValue3 = minute != null ? minute.intValue() : 0;
        java.lang.Integer second = getSecond();
        int intValue4 = second != null ? second.intValue() : 0;
        java.lang.Integer nanosecond = getNanosecond();
        return (intValue * 31) + (intValue2 * 31) + (hashCode * 31) + (intValue3 * 31) + (intValue4 * 31) + (nanosecond != null ? nanosecond.intValue() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r1 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object hour = getHour();
        if (hour == null) {
            hour = "??";
        }
        sb.append(hour);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        java.lang.Object minute = getMinute();
        if (minute == null) {
            minute = "??";
        }
        sb.append(minute);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        java.lang.Integer second = getSecond();
        sb.append(second != null ? second : "??");
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        java.lang.Integer nanosecond = getNanosecond();
        if (nanosecond != null) {
            java.lang.String valueOf = java.lang.String.valueOf(nanosecond.intValue());
            str = kotlin.text.StringsKt.padStart(valueOf, 9 - valueOf.length(), com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        }
        str = "???";
        sb.append(str);
        return sb.toString();
    }

    public IncompleteLocalTime() {
        this(null, null, null, null, null, null, 63, null);
    }
}
