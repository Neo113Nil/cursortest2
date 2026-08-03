package kotlin.io;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Utils.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/OnErrorAction;", "", "<init>", "(Ljava/lang/String;I)V", "SKIP", "TERMINATE", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnErrorAction {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlin.io.OnErrorAction[] $VALUES;
    public static final kotlin.io.OnErrorAction SKIP = new kotlin.io.OnErrorAction("SKIP", 0);
    public static final kotlin.io.OnErrorAction TERMINATE = new kotlin.io.OnErrorAction("TERMINATE", 1);

    private static final /* synthetic */ kotlin.io.OnErrorAction[] $values() {
        return new kotlin.io.OnErrorAction[]{SKIP, TERMINATE};
    }

    public static kotlin.enums.EnumEntries<kotlin.io.OnErrorAction> getEntries() {
        return $ENTRIES;
    }

    private OnErrorAction(java.lang.String str, int i) {
    }

    static {
        kotlin.io.OnErrorAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static kotlin.io.OnErrorAction valueOf(java.lang.String str) {
        return (kotlin.io.OnErrorAction) java.lang.Enum.valueOf(kotlin.io.OnErrorAction.class, str);
    }

    public static kotlin.io.OnErrorAction[] values() {
        return (kotlin.io.OnErrorAction[]) $VALUES.clone();
    }
}
