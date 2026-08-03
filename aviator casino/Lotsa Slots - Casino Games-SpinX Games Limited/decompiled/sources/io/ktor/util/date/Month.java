package io.ktor.util.date;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Date.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lio/ktor/util/date/Month;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Month {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ io.ktor.util.date.Month[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.util.date.Month.Companion INSTANCE;
    private final java.lang.String value;
    public static final io.ktor.util.date.Month JANUARY = new io.ktor.util.date.Month("JANUARY", 0, "Jan");
    public static final io.ktor.util.date.Month FEBRUARY = new io.ktor.util.date.Month("FEBRUARY", 1, "Feb");
    public static final io.ktor.util.date.Month MARCH = new io.ktor.util.date.Month("MARCH", 2, "Mar");
    public static final io.ktor.util.date.Month APRIL = new io.ktor.util.date.Month("APRIL", 3, "Apr");
    public static final io.ktor.util.date.Month MAY = new io.ktor.util.date.Month("MAY", 4, "May");
    public static final io.ktor.util.date.Month JUNE = new io.ktor.util.date.Month("JUNE", 5, "Jun");
    public static final io.ktor.util.date.Month JULY = new io.ktor.util.date.Month("JULY", 6, "Jul");
    public static final io.ktor.util.date.Month AUGUST = new io.ktor.util.date.Month("AUGUST", 7, "Aug");
    public static final io.ktor.util.date.Month SEPTEMBER = new io.ktor.util.date.Month("SEPTEMBER", 8, "Sep");
    public static final io.ktor.util.date.Month OCTOBER = new io.ktor.util.date.Month("OCTOBER", 9, "Oct");
    public static final io.ktor.util.date.Month NOVEMBER = new io.ktor.util.date.Month("NOVEMBER", 10, "Nov");
    public static final io.ktor.util.date.Month DECEMBER = new io.ktor.util.date.Month("DECEMBER", 11, "Dec");

    private static final /* synthetic */ io.ktor.util.date.Month[] $values() {
        return new io.ktor.util.date.Month[]{JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
    }

    public static kotlin.enums.EnumEntries<io.ktor.util.date.Month> getEntries() {
        return $ENTRIES;
    }

    private Month(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        io.ktor.util.date.Month[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        INSTANCE = new io.ktor.util.date.Month.Companion(null);
    }

    /* compiled from: Date.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/util/date/Month$Companion;", "", "<init>", "()V", "", com.unity3d.ads.metadata.MediationMetaData.KEY_ORDINAL, "Lio/ktor/util/date/Month;", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "(I)Lio/ktor/util/date/Month;", "", "value", "(Ljava/lang/String;)Lio/ktor/util/date/Month;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final io.ktor.util.date.Month from(int ordinal) {
            return (io.ktor.util.date.Month) io.ktor.util.date.Month.getEntries().get(ordinal);
        }

        public final io.ktor.util.date.Month from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            java.util.Iterator<E> it = io.ktor.util.date.Month.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((io.ktor.util.date.Month) obj).getValue(), value)) {
                    break;
                }
            }
            io.ktor.util.date.Month month = (io.ktor.util.date.Month) obj;
            if (month != null) {
                return month;
            }
            throw new java.lang.IllegalStateException(("Invalid month: " + value).toString());
        }
    }

    public static io.ktor.util.date.Month valueOf(java.lang.String str) {
        return (io.ktor.util.date.Month) java.lang.Enum.valueOf(io.ktor.util.date.Month.class, str);
    }

    public static io.ktor.util.date.Month[] values() {
        return (io.ktor.util.date.Month[]) $VALUES.clone();
    }
}
