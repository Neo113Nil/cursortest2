package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B7\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R$\u0010\b\u001a\u0004\u0018\u00010\u00058\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&"}, d2 = {"Lkotlinx/datetime/format/IncompleteUtcOffset;", "Lkotlinx/datetime/format/UtcOffsetFieldContainer;", "Lkotlinx/datetime/internal/format/parser/Copyable;", "", "offsetIsNegative", "", "offsetHours", "offsetMinutesOfHour", "offsetSecondsOfMinute", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lkotlinx/datetime/UtcOffset;", "toUtcOffset", "()Lkotlinx/datetime/UtcOffset;", "offset", "", "populateFrom", "(Lkotlinx/datetime/UtcOffset;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "copy", "()Lkotlinx/datetime/format/IncompleteUtcOffset;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getOffsetIsNegative", "()Ljava/lang/Boolean;", "setOffsetIsNegative", "(Ljava/lang/Boolean;)V", "Ljava/lang/Integer;", "getOffsetHours", "()Ljava/lang/Integer;", "setOffsetHours", "(Ljava/lang/Integer;)V", "getOffsetMinutesOfHour", "setOffsetMinutesOfHour", "getOffsetSecondsOfMinute", "setOffsetSecondsOfMinute"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IncompleteUtcOffset implements kotlinx.datetime.format.UtcOffsetFieldContainer, kotlinx.datetime.internal.format.parser.Copyable<kotlinx.datetime.format.IncompleteUtcOffset> {
    private java.lang.Integer offsetHours;
    private java.lang.Boolean offsetIsNegative;
    private java.lang.Integer offsetMinutesOfHour;
    private java.lang.Integer offsetSecondsOfMinute;

    public IncompleteUtcOffset(java.lang.Boolean bool, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        this.offsetIsNegative = bool;
        this.offsetHours = num;
        this.offsetMinutesOfHour = num2;
        this.offsetSecondsOfMinute = num3;
    }

    public /* synthetic */ IncompleteUtcOffset(java.lang.Boolean bool, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public final java.lang.Boolean getOffsetIsNegative() {
        return this.offsetIsNegative;
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public final void setOffsetIsNegative(java.lang.Boolean bool) {
        this.offsetIsNegative = bool;
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public final java.lang.Integer getOffsetHours() {
        return this.offsetHours;
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public final void setOffsetHours(java.lang.Integer num) {
        this.offsetHours = num;
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public final java.lang.Integer getOffsetMinutesOfHour() {
        return this.offsetMinutesOfHour;
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public final void setOffsetMinutesOfHour(java.lang.Integer num) {
        this.offsetMinutesOfHour = num;
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public final java.lang.Integer getOffsetSecondsOfMinute() {
        return this.offsetSecondsOfMinute;
    }

    @Override // kotlinx.datetime.format.UtcOffsetFieldContainer
    public final void setOffsetSecondsOfMinute(java.lang.Integer num) {
        this.offsetSecondsOfMinute = num;
    }

    public final kotlinx.datetime.UtcOffset toUtcOffset() {
        int i = kotlin.jvm.internal.Intrinsics.areEqual(getOffsetIsNegative(), java.lang.Boolean.TRUE) ? -1 : 1;
        java.lang.Integer offsetHours = getOffsetHours();
        java.lang.Integer valueOf = offsetHours != null ? java.lang.Integer.valueOf(offsetHours.intValue() * i) : null;
        java.lang.Integer offsetMinutesOfHour = getOffsetMinutesOfHour();
        java.lang.Integer valueOf2 = offsetMinutesOfHour != null ? java.lang.Integer.valueOf(offsetMinutesOfHour.intValue() * i) : null;
        java.lang.Integer offsetSecondsOfMinute = getOffsetSecondsOfMinute();
        return kotlinx.datetime.UtcOffsetJvmKt.UtcOffset(valueOf, valueOf2, offsetSecondsOfMinute != null ? java.lang.Integer.valueOf(offsetSecondsOfMinute.intValue() * i) : null);
    }

    public final void populateFrom(kotlinx.datetime.UtcOffset offset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offset, "");
        setOffsetIsNegative(java.lang.Boolean.valueOf(offset.getTotalSeconds() < 0));
        int abs = java.lang.Math.abs(offset.getTotalSeconds());
        setOffsetHours(java.lang.Integer.valueOf(abs / 3600));
        setOffsetMinutesOfHour(java.lang.Integer.valueOf((abs / 60) % 60));
        setOffsetSecondsOfMinute(java.lang.Integer.valueOf(abs % 60));
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof kotlinx.datetime.format.IncompleteUtcOffset)) {
            return false;
        }
        kotlinx.datetime.format.IncompleteUtcOffset incompleteUtcOffset = (kotlinx.datetime.format.IncompleteUtcOffset) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(getOffsetIsNegative(), incompleteUtcOffset.getOffsetIsNegative()) && kotlin.jvm.internal.Intrinsics.areEqual(getOffsetHours(), incompleteUtcOffset.getOffsetHours()) && kotlin.jvm.internal.Intrinsics.areEqual(getOffsetMinutesOfHour(), incompleteUtcOffset.getOffsetMinutesOfHour()) && kotlin.jvm.internal.Intrinsics.areEqual(getOffsetSecondsOfMinute(), incompleteUtcOffset.getOffsetSecondsOfMinute());
    }

    public final int hashCode() {
        java.lang.Boolean offsetIsNegative = getOffsetIsNegative();
        int hashCode = offsetIsNegative != null ? offsetIsNegative.hashCode() : 0;
        java.lang.Integer offsetHours = getOffsetHours();
        int hashCode2 = offsetHours != null ? offsetHours.hashCode() : 0;
        java.lang.Integer offsetMinutesOfHour = getOffsetMinutesOfHour();
        int hashCode3 = offsetMinutesOfHour != null ? offsetMinutesOfHour.hashCode() : 0;
        java.lang.Integer offsetSecondsOfMinute = getOffsetSecondsOfMinute();
        return hashCode + hashCode2 + hashCode3 + (offsetSecondsOfMinute != null ? offsetSecondsOfMinute.hashCode() : 0);
    }

    @Override // kotlinx.datetime.internal.format.parser.Copyable
    public final kotlinx.datetime.format.IncompleteUtcOffset copy() {
        return new kotlinx.datetime.format.IncompleteUtcOffset(getOffsetIsNegative(), getOffsetHours(), getOffsetMinutesOfHour(), getOffsetSecondsOfMinute());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Boolean offsetIsNegative = getOffsetIsNegative();
        sb.append(offsetIsNegative != null ? offsetIsNegative.booleanValue() ? "-" : "+" : " ");
        java.lang.Object offsetHours = getOffsetHours();
        if (offsetHours == null) {
            offsetHours = "??";
        }
        sb.append(offsetHours);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        java.lang.Object offsetMinutesOfHour = getOffsetMinutesOfHour();
        if (offsetMinutesOfHour == null) {
            offsetMinutesOfHour = "??";
        }
        sb.append(offsetMinutesOfHour);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        java.lang.Integer offsetSecondsOfMinute = getOffsetSecondsOfMinute();
        sb.append(offsetSecondsOfMinute != null ? offsetSecondsOfMinute : "??");
        return sb.toString();
    }

    public IncompleteUtcOffset() {
        this(null, null, null, null, 15, null);
    }
}
