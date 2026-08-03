package io.ktor.util.date;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Date.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/util/date/WeekDay;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WeekDay {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ io.ktor.util.date.WeekDay[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.util.date.WeekDay.Companion INSTANCE;
    private final java.lang.String value;
    public static final io.ktor.util.date.WeekDay MONDAY = new io.ktor.util.date.WeekDay("MONDAY", 0, "Mon");
    public static final io.ktor.util.date.WeekDay TUESDAY = new io.ktor.util.date.WeekDay("TUESDAY", 1, "Tue");
    public static final io.ktor.util.date.WeekDay WEDNESDAY = new io.ktor.util.date.WeekDay("WEDNESDAY", 2, "Wed");
    public static final io.ktor.util.date.WeekDay THURSDAY = new io.ktor.util.date.WeekDay("THURSDAY", 3, "Thu");
    public static final io.ktor.util.date.WeekDay FRIDAY = new io.ktor.util.date.WeekDay("FRIDAY", 4, "Fri");
    public static final io.ktor.util.date.WeekDay SATURDAY = new io.ktor.util.date.WeekDay("SATURDAY", 5, "Sat");
    public static final io.ktor.util.date.WeekDay SUNDAY = new io.ktor.util.date.WeekDay("SUNDAY", 6, "Sun");

    private static final /* synthetic */ io.ktor.util.date.WeekDay[] $values() {
        return new io.ktor.util.date.WeekDay[]{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
    }

    public static kotlin.enums.EnumEntries<io.ktor.util.date.WeekDay> getEntries() {
        return $ENTRIES;
    }

    private WeekDay(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        io.ktor.util.date.WeekDay[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        INSTANCE = new io.ktor.util.date.WeekDay.Companion(null);
    }

    /* compiled from: Date.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/util/date/WeekDay$Companion;", "", "<init>", "()V", "", com.unity3d.ads.metadata.MediationMetaData.KEY_ORDINAL, "Lio/ktor/util/date/WeekDay;", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "(I)Lio/ktor/util/date/WeekDay;", "", "value", "(Ljava/lang/String;)Lio/ktor/util/date/WeekDay;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final io.ktor.util.date.WeekDay from(int ordinal) {
            return (io.ktor.util.date.WeekDay) io.ktor.util.date.WeekDay.getEntries().get(ordinal);
        }

        public final io.ktor.util.date.WeekDay from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            java.util.Iterator<E> it = io.ktor.util.date.WeekDay.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((io.ktor.util.date.WeekDay) obj).getValue(), value)) {
                    break;
                }
            }
            io.ktor.util.date.WeekDay weekDay = (io.ktor.util.date.WeekDay) obj;
            if (weekDay != null) {
                return weekDay;
            }
            throw new java.lang.IllegalStateException(("Invalid day of week: " + value).toString());
        }
    }

    public static io.ktor.util.date.WeekDay valueOf(java.lang.String str) {
        return (io.ktor.util.date.WeekDay) java.lang.Enum.valueOf(io.ktor.util.date.WeekDay.class, str);
    }

    public static io.ktor.util.date.WeekDay[] values() {
        return (io.ktor.util.date.WeekDay[]) $VALUES.clone();
    }
}
