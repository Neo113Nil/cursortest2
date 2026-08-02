package kotlinx.coroutines.flow;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/flow/SharingStarted;", "", "Lkotlinx/coroutines/flow/StateFlow;", "", "subscriptionCount", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharingCommand;", "command", "(Lkotlinx/coroutines/flow/StateFlow;)Lkotlinx/coroutines/flow/Flow;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SharingStarted {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.coroutines.flow.SharingStarted.Companion INSTANCE = kotlinx.coroutines.flow.SharingStarted.Companion.getHighResolutionOutputSizeshNQ4ISI;

    kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.SharingCommand> command(kotlinx.coroutines.flow.StateFlow<java.lang.Integer> subscriptionCount);

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r"}, d2 = {"Lkotlinx/coroutines/flow/SharingStarted$Companion;", "", "<init>", "()V", "", "stopTimeoutMillis", "replayExpirationMillis", "Lkotlinx/coroutines/flow/SharingStarted;", "WhileSubscribed", "(JJ)Lkotlinx/coroutines/flow/SharingStarted;", "Eagerly", "Lkotlinx/coroutines/flow/SharingStarted;", "getEagerly", "()Lkotlinx/coroutines/flow/SharingStarted;", "Lazily", "getLazily"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        static final /* synthetic */ kotlinx.coroutines.flow.SharingStarted.Companion getHighResolutionOutputSizeshNQ4ISI = new kotlinx.coroutines.flow.SharingStarted.Companion();
        private static final kotlinx.coroutines.flow.SharingStarted Eagerly = new kotlinx.coroutines.flow.StartedEagerly();
        private static final kotlinx.coroutines.flow.SharingStarted Lazily = new kotlinx.coroutines.flow.StartedLazily();

        private Companion() {
        }

        public final kotlinx.coroutines.flow.SharingStarted getEagerly() {
            return Eagerly;
        }

        public final kotlinx.coroutines.flow.SharingStarted getLazily() {
            return Lazily;
        }

        public static /* synthetic */ kotlinx.coroutines.flow.SharingStarted WhileSubscribed$default(kotlinx.coroutines.flow.SharingStarted.Companion companion, long j, long j2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = 0;
            }
            if ((i & 2) != 0) {
                j2 = Long.MAX_VALUE;
            }
            return companion.WhileSubscribed(j, j2);
        }

        public final kotlinx.coroutines.flow.SharingStarted WhileSubscribed(long stopTimeoutMillis, long replayExpirationMillis) {
            return new kotlinx.coroutines.flow.StartedWhileSubscribed(stopTimeoutMillis, replayExpirationMillis);
        }
    }
}
