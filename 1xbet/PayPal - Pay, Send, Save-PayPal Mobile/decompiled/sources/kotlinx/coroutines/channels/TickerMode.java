package kotlinx.coroutines.channels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lkotlinx/coroutines/channels/TickerMode;", "", "<init>", "(Ljava/lang/String;I)V", "FIXED_PERIOD", "FIXED_DELAY"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TickerMode {
    public static final kotlinx.coroutines.channels.TickerMode FIXED_DELAY;
    public static final kotlinx.coroutines.channels.TickerMode FIXED_PERIOD;
    private static final /* synthetic */ kotlinx.coroutines.channels.TickerMode[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private TickerMode(java.lang.String str, int i) {
    }

    static {
        kotlinx.coroutines.channels.TickerMode tickerMode = new kotlinx.coroutines.channels.TickerMode("FIXED_PERIOD", 0);
        FIXED_PERIOD = tickerMode;
        kotlinx.coroutines.channels.TickerMode tickerMode2 = new kotlinx.coroutines.channels.TickerMode("FIXED_DELAY", 1);
        FIXED_DELAY = tickerMode2;
        kotlinx.coroutines.channels.TickerMode[] tickerModeArr = {tickerMode, tickerMode2};
        getHighResolutionOutputSizeshNQ4ISI = tickerModeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(tickerModeArr);
    }

    public static kotlinx.coroutines.channels.TickerMode valueOf(java.lang.String str) {
        return (kotlinx.coroutines.channels.TickerMode) java.lang.Enum.valueOf(kotlinx.coroutines.channels.TickerMode.class, str);
    }

    public static kotlinx.coroutines.channels.TickerMode[] values() {
        return (kotlinx.coroutines.channels.TickerMode[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.enums.EnumEntries<kotlinx.coroutines.channels.TickerMode> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
