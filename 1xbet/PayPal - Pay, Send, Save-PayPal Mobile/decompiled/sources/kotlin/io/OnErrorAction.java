package kotlin.io;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lkotlin/io/OnErrorAction;", "", "<init>", "(Ljava/lang/String;I)V", "SKIP", "TERMINATE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnErrorAction {
    public static final kotlin.io.OnErrorAction SKIP;
    public static final kotlin.io.OnErrorAction TERMINATE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.io.OnErrorAction[] getHighSpeedVideoSizes;

    private OnErrorAction(java.lang.String str, int i) {
    }

    static {
        kotlin.io.OnErrorAction onErrorAction = new kotlin.io.OnErrorAction("SKIP", 0);
        SKIP = onErrorAction;
        kotlin.io.OnErrorAction onErrorAction2 = new kotlin.io.OnErrorAction("TERMINATE", 1);
        TERMINATE = onErrorAction2;
        kotlin.io.OnErrorAction[] onErrorActionArr = {onErrorAction, onErrorAction2};
        getHighSpeedVideoSizes = onErrorActionArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(onErrorActionArr);
    }

    public static kotlin.io.OnErrorAction[] values() {
        return (kotlin.io.OnErrorAction[]) getHighSpeedVideoSizes.clone();
    }

    public static kotlin.io.OnErrorAction valueOf(java.lang.String str) {
        return (kotlin.io.OnErrorAction) java.lang.Enum.valueOf(kotlin.io.OnErrorAction.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.io.OnErrorAction> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
