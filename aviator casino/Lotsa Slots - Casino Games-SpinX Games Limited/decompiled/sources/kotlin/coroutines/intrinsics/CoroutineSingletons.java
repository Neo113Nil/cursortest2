package kotlin.coroutines.intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Intrinsics.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/intrinsics/CoroutineSingletons;", "", "<init>", "(Ljava/lang/String;I)V", "COROUTINE_SUSPENDED", "UNDECIDED", "RESUMED", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CoroutineSingletons {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlin.coroutines.intrinsics.CoroutineSingletons[] $VALUES;
    public static final kotlin.coroutines.intrinsics.CoroutineSingletons COROUTINE_SUSPENDED = new kotlin.coroutines.intrinsics.CoroutineSingletons("COROUTINE_SUSPENDED", 0);
    public static final kotlin.coroutines.intrinsics.CoroutineSingletons UNDECIDED = new kotlin.coroutines.intrinsics.CoroutineSingletons("UNDECIDED", 1);
    public static final kotlin.coroutines.intrinsics.CoroutineSingletons RESUMED = new kotlin.coroutines.intrinsics.CoroutineSingletons("RESUMED", 2);

    private static final /* synthetic */ kotlin.coroutines.intrinsics.CoroutineSingletons[] $values() {
        return new kotlin.coroutines.intrinsics.CoroutineSingletons[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    public static kotlin.enums.EnumEntries<kotlin.coroutines.intrinsics.CoroutineSingletons> getEntries() {
        return $ENTRIES;
    }

    private CoroutineSingletons(java.lang.String str, int i) {
    }

    static {
        kotlin.coroutines.intrinsics.CoroutineSingletons[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static kotlin.coroutines.intrinsics.CoroutineSingletons valueOf(java.lang.String str) {
        return (kotlin.coroutines.intrinsics.CoroutineSingletons) java.lang.Enum.valueOf(kotlin.coroutines.intrinsics.CoroutineSingletons.class, str);
    }

    public static kotlin.coroutines.intrinsics.CoroutineSingletons[] values() {
        return (kotlin.coroutines.intrinsics.CoroutineSingletons[]) $VALUES.clone();
    }
}
