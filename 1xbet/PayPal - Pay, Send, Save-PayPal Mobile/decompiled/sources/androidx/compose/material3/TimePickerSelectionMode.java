package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\f\u0088\u0001\r\u0092\u0001\u00020\n"}, d2 = {"Landroidx/compose/material3/TimePickerSelectionMode;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class TimePickerSelectionMode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.TimePickerSelectionMode.Companion INSTANCE = new androidx.compose.material3.TimePickerSelectionMode.Companion(null);
    private static final int Hour = 0;
    private static final int Minute = 1;
    private final int value;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4054equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/material3/TimePickerSelectionMode$Companion;", "", "<init>", "()V", "Landroidx/compose/material3/TimePickerSelectionMode;", "Hour", com.visa.cbp.getEncExpo.warmup, "getHour-yecRtBI", "()I", "Minute", "getMinute-yecRtBI"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getHour-yecRtBI, reason: not valid java name */
        public final int m4058getHouryecRtBI() {
            return androidx.compose.material3.TimePickerSelectionMode.Hour;
        }

        /* renamed from: getMinute-yecRtBI, reason: not valid java name */
        public final int m4059getMinuteyecRtBI() {
            return androidx.compose.material3.TimePickerSelectionMode.Minute;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ TimePickerSelectionMode(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m4056toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m4056toStringimpl(int i) {
        return m4054equalsimpl0(i, Hour) ? "Hour" : m4054equalsimpl0(i, Minute) ? "Minute" : "";
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4057unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m4055hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object other) {
        return m4053equalsimpl(this.value, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4055hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4053equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.material3.TimePickerSelectionMode) && i == ((androidx.compose.material3.TimePickerSelectionMode) obj).m4057unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.material3.TimePickerSelectionMode m4052boximpl(int i) {
        return new androidx.compose.material3.TimePickerSelectionMode(i);
    }
}
