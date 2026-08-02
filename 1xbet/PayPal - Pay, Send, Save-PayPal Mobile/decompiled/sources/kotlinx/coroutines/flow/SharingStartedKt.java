package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/SharingStarted$Companion;", "Lkotlin/time/Duration;", "stopTimeout", "replayExpiration", "Lkotlinx/coroutines/flow/SharingStarted;", "WhileSubscribed-5qebJ5I", "(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJ)Lkotlinx/coroutines/flow/SharingStarted;", "WhileSubscribed"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SharingStartedKt {
    /* renamed from: WhileSubscribed-5qebJ5I$default, reason: not valid java name */
    public static /* synthetic */ kotlinx.coroutines.flow.SharingStarted m24106WhileSubscribed5qebJ5I$default(kotlinx.coroutines.flow.SharingStarted.Companion companion, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = kotlin.time.Duration.INSTANCE.m24011getZEROUwyO8pc();
        }
        if ((i & 2) != 0) {
            j2 = kotlin.time.Duration.INSTANCE.m24008getINFINITEUwyO8pc();
        }
        return m24105WhileSubscribed5qebJ5I(companion, j, j2);
    }

    /* renamed from: WhileSubscribed-5qebJ5I, reason: not valid java name */
    public static final kotlinx.coroutines.flow.SharingStarted m24105WhileSubscribed5qebJ5I(kotlinx.coroutines.flow.SharingStarted.Companion companion, long j, long j2) {
        return new kotlinx.coroutines.flow.StartedWhileSubscribed(kotlin.time.Duration.m23953getInWholeMillisecondsimpl(j), kotlin.time.Duration.m23953getInWholeMillisecondsimpl(j2));
    }
}
