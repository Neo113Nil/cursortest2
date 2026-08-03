package kotlinx.coroutines.channels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BufferOverflow.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/channels/BufferOverflow;", "", "<init>", "(Ljava/lang/String;I)V", "SUSPEND", "DROP_OLDEST", "DROP_LATEST", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BufferOverflow {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlinx.coroutines.channels.BufferOverflow[] $VALUES;
    public static final kotlinx.coroutines.channels.BufferOverflow SUSPEND = new kotlinx.coroutines.channels.BufferOverflow("SUSPEND", 0);
    public static final kotlinx.coroutines.channels.BufferOverflow DROP_OLDEST = new kotlinx.coroutines.channels.BufferOverflow("DROP_OLDEST", 1);
    public static final kotlinx.coroutines.channels.BufferOverflow DROP_LATEST = new kotlinx.coroutines.channels.BufferOverflow("DROP_LATEST", 2);

    private static final /* synthetic */ kotlinx.coroutines.channels.BufferOverflow[] $values() {
        return new kotlinx.coroutines.channels.BufferOverflow[]{SUSPEND, DROP_OLDEST, DROP_LATEST};
    }

    public static kotlin.enums.EnumEntries<kotlinx.coroutines.channels.BufferOverflow> getEntries() {
        return $ENTRIES;
    }

    private BufferOverflow(java.lang.String str, int i) {
    }

    static {
        kotlinx.coroutines.channels.BufferOverflow[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static kotlinx.coroutines.channels.BufferOverflow valueOf(java.lang.String str) {
        return (kotlinx.coroutines.channels.BufferOverflow) java.lang.Enum.valueOf(kotlinx.coroutines.channels.BufferOverflow.class, str);
    }

    public static kotlinx.coroutines.channels.BufferOverflow[] values() {
        return (kotlinx.coroutines.channels.BufferOverflow[]) $VALUES.clone();
    }
}
