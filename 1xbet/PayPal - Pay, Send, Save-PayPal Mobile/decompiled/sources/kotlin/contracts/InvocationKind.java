package kotlin.contracts;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lkotlin/contracts/InvocationKind;", "", "<init>", "(Ljava/lang/String;I)V", "AT_MOST_ONCE", "AT_LEAST_ONCE", "EXACTLY_ONCE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class InvocationKind {
    public static final kotlin.contracts.InvocationKind AT_LEAST_ONCE;
    public static final kotlin.contracts.InvocationKind AT_MOST_ONCE;
    public static final kotlin.contracts.InvocationKind EXACTLY_ONCE;
    public static final kotlin.contracts.InvocationKind UNKNOWN;
    private static final /* synthetic */ kotlin.contracts.InvocationKind[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private InvocationKind(java.lang.String str, int i) {
    }

    static {
        kotlin.contracts.InvocationKind invocationKind = new kotlin.contracts.InvocationKind("AT_MOST_ONCE", 0);
        AT_MOST_ONCE = invocationKind;
        kotlin.contracts.InvocationKind invocationKind2 = new kotlin.contracts.InvocationKind("AT_LEAST_ONCE", 1);
        AT_LEAST_ONCE = invocationKind2;
        kotlin.contracts.InvocationKind invocationKind3 = new kotlin.contracts.InvocationKind("EXACTLY_ONCE", 2);
        EXACTLY_ONCE = invocationKind3;
        kotlin.contracts.InvocationKind invocationKind4 = new kotlin.contracts.InvocationKind("UNKNOWN", 3);
        UNKNOWN = invocationKind4;
        kotlin.contracts.InvocationKind[] invocationKindArr = {invocationKind, invocationKind2, invocationKind3, invocationKind4};
        getHighSpeedVideoFpsRangesFor = invocationKindArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(invocationKindArr);
    }

    public static kotlin.contracts.InvocationKind[] values() {
        return (kotlin.contracts.InvocationKind[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static kotlin.contracts.InvocationKind valueOf(java.lang.String str) {
        return (kotlin.contracts.InvocationKind) java.lang.Enum.valueOf(kotlin.contracts.InvocationKind.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.contracts.InvocationKind> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
