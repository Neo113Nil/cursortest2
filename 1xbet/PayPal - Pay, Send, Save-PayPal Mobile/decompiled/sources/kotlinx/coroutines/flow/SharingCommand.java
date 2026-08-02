package kotlinx.coroutines.flow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lkotlinx/coroutines/flow/SharingCommand;", "", "<init>", "(Ljava/lang/String;I)V", "START", "STOP", "STOP_AND_RESET_REPLAY_CACHE"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SharingCommand {
    private static final /* synthetic */ kotlinx.coroutines.flow.SharingCommand[] Camera2StreamConfigurationMap;
    public static final kotlinx.coroutines.flow.SharingCommand START;
    public static final kotlinx.coroutines.flow.SharingCommand STOP;
    public static final kotlinx.coroutines.flow.SharingCommand STOP_AND_RESET_REPLAY_CACHE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private SharingCommand(java.lang.String str, int i) {
    }

    static {
        kotlinx.coroutines.flow.SharingCommand sharingCommand = new kotlinx.coroutines.flow.SharingCommand("START", 0);
        START = sharingCommand;
        kotlinx.coroutines.flow.SharingCommand sharingCommand2 = new kotlinx.coroutines.flow.SharingCommand("STOP", 1);
        STOP = sharingCommand2;
        kotlinx.coroutines.flow.SharingCommand sharingCommand3 = new kotlinx.coroutines.flow.SharingCommand("STOP_AND_RESET_REPLAY_CACHE", 2);
        STOP_AND_RESET_REPLAY_CACHE = sharingCommand3;
        kotlinx.coroutines.flow.SharingCommand[] sharingCommandArr = {sharingCommand, sharingCommand2, sharingCommand3};
        Camera2StreamConfigurationMap = sharingCommandArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(sharingCommandArr);
    }

    public static kotlinx.coroutines.flow.SharingCommand valueOf(java.lang.String str) {
        return (kotlinx.coroutines.flow.SharingCommand) java.lang.Enum.valueOf(kotlinx.coroutines.flow.SharingCommand.class, str);
    }

    public static kotlinx.coroutines.flow.SharingCommand[] values() {
        return (kotlinx.coroutines.flow.SharingCommand[]) Camera2StreamConfigurationMap.clone();
    }

    public static kotlin.enums.EnumEntries<kotlinx.coroutines.flow.SharingCommand> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
