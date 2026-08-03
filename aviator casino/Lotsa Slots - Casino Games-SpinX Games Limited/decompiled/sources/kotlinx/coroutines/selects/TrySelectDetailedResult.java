package kotlinx.coroutines.selects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Select.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESSFUL", "REREGISTER", "CANCELLED", "ALREADY_SELECTED", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrySelectDetailedResult {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlinx.coroutines.selects.TrySelectDetailedResult[] $VALUES;
    public static final kotlinx.coroutines.selects.TrySelectDetailedResult SUCCESSFUL = new kotlinx.coroutines.selects.TrySelectDetailedResult("SUCCESSFUL", 0);
    public static final kotlinx.coroutines.selects.TrySelectDetailedResult REREGISTER = new kotlinx.coroutines.selects.TrySelectDetailedResult("REREGISTER", 1);
    public static final kotlinx.coroutines.selects.TrySelectDetailedResult CANCELLED = new kotlinx.coroutines.selects.TrySelectDetailedResult("CANCELLED", 2);
    public static final kotlinx.coroutines.selects.TrySelectDetailedResult ALREADY_SELECTED = new kotlinx.coroutines.selects.TrySelectDetailedResult("ALREADY_SELECTED", 3);

    private static final /* synthetic */ kotlinx.coroutines.selects.TrySelectDetailedResult[] $values() {
        return new kotlinx.coroutines.selects.TrySelectDetailedResult[]{SUCCESSFUL, REREGISTER, CANCELLED, ALREADY_SELECTED};
    }

    public static kotlin.enums.EnumEntries<kotlinx.coroutines.selects.TrySelectDetailedResult> getEntries() {
        return $ENTRIES;
    }

    private TrySelectDetailedResult(java.lang.String str, int i) {
    }

    static {
        kotlinx.coroutines.selects.TrySelectDetailedResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static kotlinx.coroutines.selects.TrySelectDetailedResult valueOf(java.lang.String str) {
        return (kotlinx.coroutines.selects.TrySelectDetailedResult) java.lang.Enum.valueOf(kotlinx.coroutines.selects.TrySelectDetailedResult.class, str);
    }

    public static kotlinx.coroutines.selects.TrySelectDetailedResult[] values() {
        return (kotlinx.coroutines.selects.TrySelectDetailedResult[]) $VALUES.clone();
    }
}
