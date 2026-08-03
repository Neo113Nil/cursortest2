package kotlinx.coroutines.channels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TickerChannels.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/TickerMode;", "", "<init>", "(Ljava/lang/String;I)V", "FIXED_PERIOD", "FIXED_DELAY", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TickerMode {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlinx.coroutines.channels.TickerMode[] $VALUES;
    public static final kotlinx.coroutines.channels.TickerMode FIXED_PERIOD = new kotlinx.coroutines.channels.TickerMode("FIXED_PERIOD", 0);
    public static final kotlinx.coroutines.channels.TickerMode FIXED_DELAY = new kotlinx.coroutines.channels.TickerMode("FIXED_DELAY", 1);

    private static final /* synthetic */ kotlinx.coroutines.channels.TickerMode[] $values() {
        return new kotlinx.coroutines.channels.TickerMode[]{FIXED_PERIOD, FIXED_DELAY};
    }

    public static kotlin.enums.EnumEntries<kotlinx.coroutines.channels.TickerMode> getEntries() {
        return $ENTRIES;
    }

    private TickerMode(java.lang.String str, int i) {
    }

    static {
        kotlinx.coroutines.channels.TickerMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static kotlinx.coroutines.channels.TickerMode valueOf(java.lang.String str) {
        return (kotlinx.coroutines.channels.TickerMode) java.lang.Enum.valueOf(kotlinx.coroutines.channels.TickerMode.class, str);
    }

    public static kotlinx.coroutines.channels.TickerMode[] values() {
        return (kotlinx.coroutines.channels.TickerMode[]) $VALUES.clone();
    }
}
