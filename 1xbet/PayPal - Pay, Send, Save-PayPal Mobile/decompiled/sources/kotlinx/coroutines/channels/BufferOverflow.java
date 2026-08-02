package kotlinx.coroutines.channels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lkotlinx/coroutines/channels/BufferOverflow;", "", "<init>", "(Ljava/lang/String;I)V", "SUSPEND", "DROP_OLDEST", "DROP_LATEST"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BufferOverflow {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final kotlinx.coroutines.channels.BufferOverflow DROP_LATEST;
    public static final kotlinx.coroutines.channels.BufferOverflow DROP_OLDEST;
    public static final kotlinx.coroutines.channels.BufferOverflow SUSPEND;
    private static final /* synthetic */ kotlinx.coroutines.channels.BufferOverflow[] getHighResolutionOutputSizeshNQ4ISI;

    private BufferOverflow(java.lang.String str, int i) {
    }

    static {
        kotlinx.coroutines.channels.BufferOverflow bufferOverflow = new kotlinx.coroutines.channels.BufferOverflow("SUSPEND", 0);
        SUSPEND = bufferOverflow;
        kotlinx.coroutines.channels.BufferOverflow bufferOverflow2 = new kotlinx.coroutines.channels.BufferOverflow("DROP_OLDEST", 1);
        DROP_OLDEST = bufferOverflow2;
        kotlinx.coroutines.channels.BufferOverflow bufferOverflow3 = new kotlinx.coroutines.channels.BufferOverflow("DROP_LATEST", 2);
        DROP_LATEST = bufferOverflow3;
        kotlinx.coroutines.channels.BufferOverflow[] bufferOverflowArr = {bufferOverflow, bufferOverflow2, bufferOverflow3};
        getHighResolutionOutputSizeshNQ4ISI = bufferOverflowArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(bufferOverflowArr);
    }

    public static kotlinx.coroutines.channels.BufferOverflow valueOf(java.lang.String str) {
        return (kotlinx.coroutines.channels.BufferOverflow) java.lang.Enum.valueOf(kotlinx.coroutines.channels.BufferOverflow.class, str);
    }

    public static kotlinx.coroutines.channels.BufferOverflow[] values() {
        return (kotlinx.coroutines.channels.BufferOverflow[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static kotlin.enums.EnumEntries<kotlinx.coroutines.channels.BufferOverflow> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
