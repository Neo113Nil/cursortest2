package kotlin.coroutines.intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lkotlin/coroutines/intrinsics/CoroutineSingletons;", "", "<init>", "(Ljava/lang/String;I)V", "COROUTINE_SUSPENDED", "UNDECIDED", "RESUMED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CoroutineSingletons {
    public static final kotlin.coroutines.intrinsics.CoroutineSingletons COROUTINE_SUSPENDED;
    public static final kotlin.coroutines.intrinsics.CoroutineSingletons RESUMED;
    public static final kotlin.coroutines.intrinsics.CoroutineSingletons UNDECIDED;
    private static final /* synthetic */ kotlin.coroutines.intrinsics.CoroutineSingletons[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private CoroutineSingletons(java.lang.String str, int i) {
    }

    static {
        kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons = new kotlin.coroutines.intrinsics.CoroutineSingletons("COROUTINE_SUSPENDED", 0);
        COROUTINE_SUSPENDED = coroutineSingletons;
        kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons2 = new kotlin.coroutines.intrinsics.CoroutineSingletons("UNDECIDED", 1);
        UNDECIDED = coroutineSingletons2;
        kotlin.coroutines.intrinsics.CoroutineSingletons coroutineSingletons3 = new kotlin.coroutines.intrinsics.CoroutineSingletons("RESUMED", 2);
        RESUMED = coroutineSingletons3;
        kotlin.coroutines.intrinsics.CoroutineSingletons[] coroutineSingletonsArr = {coroutineSingletons, coroutineSingletons2, coroutineSingletons3};
        getHighSpeedVideoFpsRangesFor = coroutineSingletonsArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(coroutineSingletonsArr);
    }

    public static kotlin.coroutines.intrinsics.CoroutineSingletons[] values() {
        return (kotlin.coroutines.intrinsics.CoroutineSingletons[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static kotlin.coroutines.intrinsics.CoroutineSingletons valueOf(java.lang.String str) {
        return (kotlin.coroutines.intrinsics.CoroutineSingletons) java.lang.Enum.valueOf(kotlin.coroutines.intrinsics.CoroutineSingletons.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.coroutines.intrinsics.CoroutineSingletons> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
